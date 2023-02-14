package com.dji.sdk.sample.demo.missionoperator;

import android.content.Context;
import android.util.Log;
import android.view.View;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.demo.missionmanager.MissionBaseView;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.ToastUtils;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.common.error.DJIError;
import dji.common.flightcontroller.FlightControllerState;
import dji.common.flightcontroller.VisionDetectionState;
import dji.common.flightcontroller.simulator.InitializationData;
import dji.common.gimbal.CapabilityKey;
import dji.common.mission.waypoint.Waypoint;
import dji.common.mission.waypoint.WaypointAction;
import dji.common.mission.waypoint.WaypointActionType;
import dji.common.mission.waypoint.WaypointMission;
import dji.common.mission.waypoint.WaypointMissionDownloadEvent;
import dji.common.mission.waypoint.WaypointMissionExecutionEvent;
import dji.common.mission.waypoint.WaypointMissionFinishedAction;
import dji.common.mission.waypoint.WaypointMissionFlightPathMode;
import dji.common.mission.waypoint.WaypointMissionGotoWaypointMode;
import dji.common.mission.waypoint.WaypointMissionHeadingMode;
import dji.common.mission.waypoint.WaypointMissionState;
import dji.common.mission.waypoint.WaypointMissionUploadEvent;
import dji.common.mission.waypoint.WaypointTurnMode;
import dji.common.model.LocationCoordinate2D;
import dji.common.util.CommonCallbacks;
import dji.common.util.DJIParamMinMaxCapability;
import dji.keysdk.FlightControllerKey;
import dji.keysdk.KeyManager;
import dji.sdk.base.BaseProduct;
import dji.sdk.flightcontroller.FlightAssistant;
import dji.sdk.flightcontroller.FlightController;
import dji.sdk.gimbal.Gimbal;
import dji.sdk.mission.MissionControl;
import dji.sdk.mission.waypoint.WaypointMissionOperator;
import dji.sdk.mission.waypoint.WaypointMissionOperatorListener;
import dji.sdk.products.Aircraft;

import static dji.keysdk.FlightControllerKey.HOME_LOCATION_LATITUDE;
import static dji.keysdk.FlightControllerKey.HOME_LOCATION_LONGITUDE;

public class WaypointMissionOperatorView extends MissionBaseView {

    private static final double ONE_METER_OFFSET = 0.00000899322;
    private static final double HORIZONTAL_DISTANCE = 30;
    private static final double VERTICAL_DISTANCE = 30;

    private WaypointMissionOperator waypointMissionOperator = null;
    private WaypointMissionOperatorListener waypointMissionOperatorListener = null;
    private WaypointMission mission = null;
    private float calculateTotalTime = 0.0f;


    public WaypointMissionOperatorView(Context context) {
        super(context);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        waypointMissionOperator = MissionControl.getInstance().getWaypointMissionOperator();
        ToastUtils.setResultToText(missionPushInfoTV, "Waypoint mission state: " + waypointMissionOperator.getCurrentState());
        setupListener();
    }

    private void setupListener() {
        if (waypointMissionOperator != null) {
            waypointMissionOperatorListener = new WaypointMissionOperatorListener() {
                @Override
                public void onDownloadUpdate(@NonNull WaypointMissionDownloadEvent waypointMissionDownloadEvent) {

                }

                @Override
                public void onUploadUpdate(@NonNull WaypointMissionUploadEvent waypointMissionUploadEvent) {
                    if (waypointMissionOperator != null) {
                        ToastUtils.setResultToText(missionPushInfoTV, "Waypoint mission state: " + waypointMissionOperator.getCurrentState());
                    }
                }

                @Override
                public void onExecutionUpdate(@NonNull WaypointMissionExecutionEvent waypointMissionExecutionEvent) {
                    if (waypointMissionOperator != null) {
                        ToastUtils.setResultToText(missionPushInfoTV, "Waypoint mission state: " + waypointMissionOperator.getCurrentState());
                    }
                }

                @Override
                public void onExecutionStart() {
                    if (waypointMissionOperator != null) {
                        ToastUtils.setResultToText(missionPushInfoTV, "Waypoint mission state: " + waypointMissionOperator.getCurrentState());
                    }
                }

                @Override
                public void onExecutionFinish(@Nullable DJIError djiError) {
                    if (djiError == null) {
                        ToastUtils.setResultToToast("Mission has finished");
                    } else {
                        ToastUtils.setResultToToast("Mission has aborted. Reason: " + djiError.getDescription());
                    }
                    if (waypointMissionOperator != null) {
                        ToastUtils.setResultToText(missionPushInfoTV, "Waypoint mission state: " + waypointMissionOperator.getCurrentState());
                    }
                }
            };
            waypointMissionOperator.addListener(waypointMissionOperatorListener);
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        if (waypointMissionOperator != null && waypointMissionOperatorListener != null) {
            waypointMissionOperator.removeListener(waypointMissionOperatorListener);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.btn_load:
                mission = createRectangleWaypointMission();
                DJIError djiError = waypointMissionOperator.loadMission(mission);
                if (djiError == null) {
                    ToastUtils.setResultToToast("Mission is loaded successfully, estimated execution time is " + calculateTotalTime + " seconds.");
                } else {
                    ToastUtils.setResultToToast(djiError.getDescription());
                }
                break;
            case R.id.btn_upload:
                if (WaypointMissionState.READY_TO_RETRY_UPLOAD.equals(waypointMissionOperator.getCurrentState()) || WaypointMissionState.READY_TO_UPLOAD.equals(waypointMissionOperator.getCurrentState())) {
                    waypointMissionOperator.uploadMission(new CommonCallbacks.CompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {
                            ToastUtils.setResultToToast(djiError != null ? djiError.getDescription() : "upload success");
                        }
                    });
                } else {
                    ToastUtils.setResultToToast("Wait for mission to be loaded");
                }
                break;
            case R.id.btn_start:
                if (null != mission) {
                    waypointMissionOperator.startMission(new CommonCallbacks.CompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {
                            ToastUtils.setResultToToast(djiError != null ? djiError.getDescription(): "start success");
                        }
                    });
                } else {
                    ToastUtils.setResultToToast("Wait for mission to be uploaded");
                }
                break;
            case R.id.btn_stop:
                waypointMissionOperator.stopMission(new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError djiError) {
                        ToastUtils.setResultToToast(djiError != null ? "" : djiError.getDescription());
                    }
                });
                break;
            case R.id.btn_pause:
                waypointMissionOperator.pauseMission(new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError djiError) {
                        ToastUtils.setResultToToast(djiError == null ? "The mission has been paused" : djiError.getDescription());
                    }
                });
                break;
            case R.id.btn_resume:
                waypointMissionOperator.resumeMission(new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError djiError) {
                        ToastUtils.setResultToToast(djiError == null ? "The mission has been resumed" : djiError.getDescription());
                    }
                });
                break;
            default:
                break;
        }
    }

    /**
     * Pre-define a square, co-ordination (0,0),(0,30),(30,30),(30,0). So the drone heading needs to turn 45 degrees every turn.
     */
    private WaypointMission createRectangleWaypointMission() {
        WaypointMission.Builder builder = new WaypointMission.Builder();
        double baseLatitude = 0;
        double baseLongitude = 0;
        final float baseAltitude = 30.0f;

        Object latitudeValue = KeyManager.getInstance().getValue((FlightControllerKey.create(HOME_LOCATION_LATITUDE)));
        Object longitudeValue = KeyManager.getInstance().getValue((FlightControllerKey.create(HOME_LOCATION_LONGITUDE)));

        if (latitudeValue != null && latitudeValue instanceof Double) {
            baseLatitude = (double) latitudeValue;
        }
        if (longitudeValue != null && longitudeValue instanceof Double) {
            baseLongitude = (double) longitudeValue;
        }

        builder.autoFlightSpeed(5f);
        builder.maxFlightSpeed(10f);
        builder.setExitMissionOnRCSignalLostEnabled(false);
        builder.finishedAction(WaypointMissionFinishedAction.GO_HOME);
        builder.flightPathMode(WaypointMissionFlightPathMode.NORMAL);
        builder.gotoFirstWaypointMode(WaypointMissionGotoWaypointMode.SAFELY);
        builder.setPointOfInterest(new LocationCoordinate2D(baseLatitude + 15, baseLongitude + 15));
        builder.headingMode(WaypointMissionHeadingMode.TOWARD_POINT_OF_INTEREST);
        builder.setGimbalPitchRotationEnabled(true);
        builder.repeatTimes(1);

        // Waypoint 0: (0,0)
        Waypoint waypoint0 = new Waypoint(baseLatitude, baseLongitude, baseAltitude);
        waypoint0.turnMode = WaypointTurnMode.CLOCKWISE;
        waypoint0.addAction(new WaypointAction(WaypointActionType.ROTATE_AIRCRAFT, calculateTurnAngle()));
        waypoint0.addAction(new WaypointAction(WaypointActionType.START_TAKE_PHOTO, 0));
        waypoint0.addAction(new WaypointAction(WaypointActionType.GIMBAL_PITCH, 0));
        builder.addWaypoint(waypoint0);

        // Waypoint 1: (0,30)
        Waypoint waypoint1 = new Waypoint(baseLatitude, baseLongitude + HORIZONTAL_DISTANCE * ONE_METER_OFFSET, baseAltitude);
        waypoint1.turnMode = WaypointTurnMode.COUNTER_CLOCKWISE;
        waypoint1.addAction(new WaypointAction(WaypointActionType.ROTATE_AIRCRAFT, -calculateTurnAngle()));
        waypoint1.addAction(new WaypointAction(WaypointActionType.START_TAKE_PHOTO, 0));
        waypoint1.addAction(new WaypointAction(WaypointActionType.GIMBAL_PITCH, -45));
        builder.addWaypoint(waypoint1);

        // Waypoint 2: (30,30)
        Waypoint waypoint2 = new Waypoint(baseLatitude + VERTICAL_DISTANCE * ONE_METER_OFFSET, baseLongitude + HORIZONTAL_DISTANCE * ONE_METER_OFFSET, baseAltitude);
        waypoint2.turnMode = WaypointTurnMode.COUNTER_CLOCKWISE;
        waypoint2.addAction(new WaypointAction(WaypointActionType.ROTATE_AIRCRAFT, -180 + calculateTurnAngle()));
        waypoint2.addAction(new WaypointAction(WaypointActionType.START_TAKE_PHOTO, 0));
        waypoint2.addAction(new WaypointAction(WaypointActionType.GIMBAL_PITCH, -90));
        builder.addWaypoint(waypoint2);

        // Waypoint 3: (30,0)
        Waypoint waypoint3 = new Waypoint(baseLatitude + VERTICAL_DISTANCE * ONE_METER_OFFSET, baseLongitude, baseAltitude);
        waypoint3.turnMode = WaypointTurnMode.COUNTER_CLOCKWISE;
        waypoint3.addAction(new WaypointAction(WaypointActionType.ROTATE_AIRCRAFT, 180 - calculateTurnAngle()));
        waypoint3.addAction(new WaypointAction(WaypointActionType.START_TAKE_PHOTO, 0));
        waypoint3.addAction(new WaypointAction(WaypointActionType.GIMBAL_PITCH, 0));
        builder.addWaypoint(waypoint3);

        calculateTotalTime = builder.calculateTotalTime();
        return builder.build();
    }

    private int calculateTurnAngle() {
        return Math.round((float)Math.toDegrees(Math.atan(VERTICAL_DISTANCE/ HORIZONTAL_DISTANCE)));
    }

    @Override
    public int getDescription() {
        return R.string.component_listview_waypoint_mission_operator;
    }
}
