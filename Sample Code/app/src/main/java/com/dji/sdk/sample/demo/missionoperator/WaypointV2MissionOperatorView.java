package com.dji.sdk.sample.demo.missionoperator;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;

import androidx.annotation.NonNull;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.demo.missionmanager.MissionBaseView;
import com.dji.sdk.sample.demo.missionoperator.util.ActionUtils;
import com.dji.sdk.sample.demo.missionoperator.util.WaypointV2Factory;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import com.dji.sdk.sample.internal.utils.ToastUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import dji.common.error.DJIError;
import dji.common.error.DJIWaypointV2Error;
import dji.common.flightcontroller.FlightControllerState;
import dji.common.flightcontroller.simulator.InitializationData;
import dji.common.gimbal.Rotation;
import dji.common.gimbal.RotationMode;
import dji.common.mission.waypointv2.Action.ActionDownloadEvent;
import dji.common.mission.waypointv2.Action.ActionExecutionEvent;
import dji.common.mission.waypointv2.Action.ActionState;
import dji.common.mission.waypointv2.Action.ActionTypes;
import dji.common.mission.waypointv2.Action.ActionUploadEvent;
import dji.common.mission.waypointv2.Action.CameraFocusRegionType;
import dji.common.mission.waypointv2.Action.WaypointActuator;
import dji.common.mission.waypointv2.Action.WaypointAircraftControlParam;
import dji.common.mission.waypointv2.Action.WaypointAircraftControlStartStopFlyParam;
import dji.common.mission.waypointv2.Action.WaypointCameraActuatorParam;
import dji.common.mission.waypointv2.Action.WaypointCameraCustomNameParam;
import dji.common.mission.waypointv2.Action.WaypointCameraFocusParam;
import dji.common.mission.waypointv2.Action.WaypointCameraFocusPointTargetParam;
import dji.common.mission.waypointv2.Action.WaypointCameraStartIntervalShootParam;
import dji.common.mission.waypointv2.Action.WaypointCameraStopIntervalShootParam;
import dji.common.mission.waypointv2.Action.WaypointCameraZoomParam;
import dji.common.mission.waypointv2.Action.WaypointGimbalActuatorParam;
import dji.common.mission.waypointv2.Action.WaypointIntervalTriggerParam;
import dji.common.mission.waypointv2.Action.WaypointLidarActuatorParam;
import dji.common.mission.waypointv2.Action.WaypointPointCloudRecordActuatorParam;
import dji.common.mission.waypointv2.Action.WaypointReachPointTriggerParam;
import dji.common.mission.waypointv2.Action.WaypointTrajectoryTriggerParam;
import dji.common.mission.waypointv2.Action.WaypointTrigger;
import dji.common.mission.waypointv2.Action.WaypointV2Action;
import dji.common.mission.waypointv2.Action.WaypointV2AssociateTriggerParam;
import dji.common.mission.waypointv2.WaypointV2;
import dji.common.mission.waypointv2.WaypointV2Mission;
import dji.common.mission.waypointv2.WaypointV2MissionDownloadEvent;
import dji.common.mission.waypointv2.WaypointV2MissionExecutionEvent;
import dji.common.mission.waypointv2.WaypointV2MissionState;
import dji.common.mission.waypointv2.WaypointV2MissionTypes;
import dji.common.mission.waypointv2.WaypointV2MissionUploadEvent;
import dji.common.model.LocationCoordinate2D;
import dji.common.util.CommonCallbacks;
import dji.keysdk.FlightControllerKey;
import dji.keysdk.KeyManager;
import dji.sdk.flightcontroller.FlightController;
import dji.sdk.mission.MissionControl;
import dji.sdk.mission.waypoint.WaypointV2ActionListener;
import dji.sdk.mission.waypoint.WaypointV2MissionOperator;
import dji.sdk.mission.waypoint.WaypointV2MissionOperatorListener;

import static dji.keysdk.FlightControllerKey.HOME_LOCATION_LATITUDE;
import static dji.keysdk.FlightControllerKey.HOME_LOCATION_LONGITUDE;

/**
 * Class for waypointV2 mission.
 */
public class WaypointV2MissionOperatorView extends MissionBaseView {

    // Constant and general varables
    private static final double BASE_LATITUDE = 22;
    private static final double BASE_LONGITUDE = 113;
    private static final int REFRESH_FREQ = 10;
    private static final int SATELLITE_COUNT = 10;
    private static final int MAX_HEIGHT = 500;
    private static final int MAX_RADIUS = 500;
    private static final double ONE_METER_OFFSET = 0.00000899322;
    private static final double HORIZONTAL_DISTANCE = 30;
    private static final double VERTICAL_DISTANCE = 30;
    private static final String TAG = WaypointV2MissionOperatorView.class.getSimpleName();
    private FlightController flightController = null;

    // Global variables for waypointV2Mission
    private WaypointV2MissionOperator waypointV2MissionOperator = null;
    public static WaypointV2Mission.Builder waypointV2MissionBuilder = null;

    private WaypointV2MissionOperatorListener waypointV2MissionOperatorListener;
    private boolean canUploadMission = false;
    private boolean canStartMission = false;

   // Global variables for waypointV2Action
    private WaypointV2ActionListener waypointV2ActionListener = null;

    public WaypointV2MissionOperatorView(Context context) {
        super(context);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (DJISampleApplication.getAircraftInstance() != null) {
            if (ModuleVerificationUtil.isFlightControllerAvailable()) {
                flightController = DJISampleApplication.getAircraftInstance().getFlightController();
                flightController.setStateCallback(new FlightControllerState.Callback() {
                    @Override
                    public void onUpdate(@NonNull FlightControllerState flightControllerState) {
                        homeLatitude = flightControllerState.getHomeLocation().getLatitude();
                        homeLongitude = flightControllerState.getHomeLocation().getLongitude();
                        flightState = flightControllerState.getFlightMode();
                        updateWaypointMissionState();

                        // Land to ground if the aircrat can
                        if (flightControllerState.isLandingConfirmationNeeded()) {
                            flightController.confirmLanding(new CommonCallbacks.CompletionCallback() {
                                @Override
                                public void onResult(DJIError djiError) {
                                    ToastUtils.setResultToToast(djiError == null ? "Confirm Landing" : djiError.getDescription());
                                }
                            });
                        }
                    }
                });
                waypointV2MissionOperator = MissionControl.getInstance().getWaypointMissionV2Operator();
                setUpListener();
            } else {
                ToastUtils.setResultToToast("The FlightController is unavailable");
            }
        } else {
            ToastUtils.setResultToToast("The Aircraft is disconnected");
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        tearDownListener();
        if (flightController != null) {
            flightController.getSimulator().stop(null);
            flightController.setStateCallback(null);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_simulator:
                flightController.getSimulator().start(InitializationData.createInstance(new LocationCoordinate2D(BASE_LATITUDE, BASE_LONGITUDE), REFRESH_FREQ, SATELLITE_COUNT), new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError djiError) {
                        if (djiError != null) {
                            ToastUtils.setResultToToast(djiError.getDescription());
                        } else {
                            ToastUtils.setResultToToast("success");
                        }
                    }
                });
                break;
            case R.id.btn_set_maximum_altitude:
                flightController.setMaxFlightHeight(MAX_HEIGHT, new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError djiError) {
                        ToastUtils.setResultToToast(djiError == null ? "The maximum height is set to 500m!" : djiError.getDescription());
                    }
                });
                break;
            case R.id.btn_set_maximum_radius:
                flightController.setMaxFlightRadius(MAX_RADIUS, new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError djiError) {
                        ToastUtils.setResultToToast(djiError == null ? "The maximum radius is set to 500m!" : djiError.getDescription());
                    }
                });
                break;
            case R.id.btn_load:
                if (waypointV2MissionOperator.getCurrentState().equals(WaypointV2MissionState.READY_TO_UPLOAD) || waypointV2MissionOperator.getCurrentState().equals(WaypointV2MissionState.READY_TO_EXECUTE)) {
                    waypointV2MissionOperator.loadMission(createWaypointMission(), new CommonCallbacks.CompletionCallback<DJIWaypointV2Error>() {
                        @Override
                        public void onResult(DJIWaypointV2Error djiWaypointV2Error) {
                            if (djiWaypointV2Error == null) {
                                canUploadMission = true;
                                ToastUtils.setResultToToast("Mission is loaded successfully");
                            } else {
                                ToastUtils.setResultToToast(djiWaypointV2Error.getDescription());
                            }
                        }
                    });
                } else {
                    ToastUtils.setResultToToast("The mission can be loaded only when the operator state is READY_TO_UPLOAD or READY_TO_EXECUTE");
                }
                break;
            case R.id.btn_upload:
                if (canUploadMission) {
                    waypointV2MissionOperator.uploadMission(new CommonCallbacks.CompletionCallback<DJIWaypointV2Error>() {
                        @Override
                        public void onResult(DJIWaypointV2Error djiWaypointV2Error) {
                            if (djiWaypointV2Error != null) {
                                ToastUtils.setResultToToast(djiWaypointV2Error.getDescription());
                            }
                        }
                    });
                } else {
                    ToastUtils.setResultToToast("Wait for mission to be loaded");
                }
                break;
            case R.id.btn_start:
                if(canStartMission) {
                    waypointV2MissionOperator.startMission(new CommonCallbacks.CompletionCallback<DJIWaypointV2Error>() {
                        @Override
                        public void onResult(DJIWaypointV2Error djiWaypointV2Error) {
                            if(djiWaypointV2Error == null) {
                                ToastUtils.setResultToToast(djiWaypointV2Error == null ? "Mission is started successfully" : djiWaypointV2Error.getDescription());
                            }
                        }
                    });
                } else {
                    ToastUtils.setResultToToast("Wait for mission to be uploaded");
                }
                break;
            case R.id.btn_stop:
                if(waypointV2MissionOperator.getCurrentState().equals(WaypointV2MissionState.EXECUTING)
                        || waypointV2MissionOperator.getCurrentState().equals(WaypointV2MissionState.INTERRUPTED)) {
                    waypointV2MissionOperator.stopMission(new CommonCallbacks.CompletionCallback<DJIWaypointV2Error>() {
                        @Override
                        public void onResult(DJIWaypointV2Error djiWaypointV2Error) {
                            ToastUtils.setResultToToast(djiWaypointV2Error == null ? "The mission has been stopped" : djiWaypointV2Error.getDescription());
                        }
                    });
                }
                break;
            case R.id.btn_pause:
                if(waypointV2MissionOperator.getCurrentState().equals(WaypointV2MissionState.EXECUTING)) {
                    waypointV2MissionOperator.interruptMission(new CommonCallbacks.CompletionCallback<DJIWaypointV2Error>() {
                        @Override
                        public void onResult(DJIWaypointV2Error djiWaypointV2Error) {
                            ToastUtils.setResultToToast(djiWaypointV2Error == null ? "The mission has been interrupted" : djiWaypointV2Error.getDescription());
                        }
                    });
                }
                break;
            case R.id.btn_resume:
                if(waypointV2MissionOperator.getCurrentState().equals(WaypointV2MissionState.INTERRUPTED)) {
                    waypointV2MissionOperator.recoverMission(new CommonCallbacks.CompletionCallback<DJIWaypointV2Error>() {
                        @Override
                        public void onResult(DJIWaypointV2Error djiWaypointV2Error) {
                            ToastUtils.setResultToToast(djiWaypointV2Error == null ? "The mission has been recovered" : djiWaypointV2Error.getDescription());
                        }
                    });
                }
                break;
            case R.id.btn_download:
                break;
            default:
                break;
        }
    }

    private WaypointV2Mission createWaypointMission() {
        List<WaypointV2> waypointV2List = new ArrayList<>();

        // Basic parameters' setup
        double baseLatitude = 22;
        double baseLongitude = 113;
        Object latitudeValue = KeyManager.getInstance().getValue((FlightControllerKey.create(HOME_LOCATION_LATITUDE)));
        Object longitudeValue = KeyManager.getInstance().getValue((FlightControllerKey.create(HOME_LOCATION_LONGITUDE)));

        if (latitudeValue != null && latitudeValue instanceof Double) {
            baseLatitude = (double) latitudeValue;
        }
        if (longitudeValue != null && longitudeValue instanceof Double) {
            baseLongitude = (double) longitudeValue;
        }

        final float baseAltitude = 15.0f;

        // Waypoint 0: (0,30)
        WaypointV2 waypoint0 = new WaypointV2.Builder()
                .setCoordinate(new LocationCoordinate2D(baseLatitude, baseLongitude + VERTICAL_DISTANCE * ONE_METER_OFFSET))
                .setAltitude(baseAltitude)
                .setFlightPathMode(WaypointV2MissionTypes.WaypointV2FlightPathMode.GOTO_POINT_STRAIGHT_LINE_AND_STOP)
                .setHeadingMode(WaypointV2MissionTypes.WaypointV2HeadingMode.AUTO)
                .build();
        waypointV2List.add(waypoint0);

        // Waypoint 1: (30,30)
        WaypointV2 waypoint1 = new WaypointV2.Builder()
                .setCoordinate(new LocationCoordinate2D(baseLatitude + HORIZONTAL_DISTANCE * ONE_METER_OFFSET, baseLongitude + VERTICAL_DISTANCE * ONE_METER_OFFSET))
                .setAltitude(baseAltitude)
                .setFlightPathMode(WaypointV2MissionTypes.WaypointV2FlightPathMode.GOTO_POINT_STRAIGHT_LINE_AND_STOP)
                .setHeadingMode(WaypointV2MissionTypes.WaypointV2HeadingMode.AUTO)
                .build();
        waypointV2List.add(waypoint1);

        // Waypoint 2: (30,0)
        WaypointV2 waypoint2 = new WaypointV2.Builder()
                .setCoordinate(new LocationCoordinate2D(baseLatitude + HORIZONTAL_DISTANCE * ONE_METER_OFFSET, baseLongitude))
                .setAltitude(baseAltitude)
                .setFlightPathMode(WaypointV2MissionTypes.WaypointV2FlightPathMode.GOTO_POINT_STRAIGHT_LINE_AND_STOP)
                .setHeadingMode(WaypointV2MissionTypes.WaypointV2HeadingMode.AUTO)
                .build();
        waypointV2List.add(waypoint2);

        // Waypoint 3: (60,0)
        WaypointV2 waypoint3 = new WaypointV2.Builder()
                .setCoordinate(new LocationCoordinate2D(baseLatitude + HORIZONTAL_DISTANCE * ONE_METER_OFFSET * 2, baseLongitude))
                .setAltitude(baseAltitude)
                .setFlightPathMode(WaypointV2MissionTypes.WaypointV2FlightPathMode.GOTO_POINT_STRAIGHT_LINE_AND_STOP)
                .setHeadingMode(WaypointV2MissionTypes.WaypointV2HeadingMode.AUTO)
                .build();
        waypointV2List.add(waypoint3);

        // Waypoint 4: (60,30)
        WaypointV2 waypoint4 = new WaypointV2.Builder()
                .setCoordinate(new LocationCoordinate2D(baseLatitude + HORIZONTAL_DISTANCE * ONE_METER_OFFSET * 2, baseLongitude + VERTICAL_DISTANCE * ONE_METER_OFFSET))
                .setAltitude(baseAltitude)
                .setFlightPathMode(WaypointV2MissionTypes.WaypointV2FlightPathMode.GOTO_POINT_STRAIGHT_LINE_AND_STOP)
                .setHeadingMode(WaypointV2MissionTypes.WaypointV2HeadingMode.AUTO)
                .build();
        waypointV2List.add(waypoint4);

        // Waypoint 5: (90,30)
        WaypointV2 waypoint5 = new WaypointV2.Builder()
                .setCoordinate(new LocationCoordinate2D(baseLatitude + HORIZONTAL_DISTANCE * ONE_METER_OFFSET * 3, baseLongitude + VERTICAL_DISTANCE * ONE_METER_OFFSET))
                .setAltitude(baseAltitude)
                .setFlightPathMode(WaypointV2MissionTypes.WaypointV2FlightPathMode.GOTO_POINT_STRAIGHT_LINE_AND_STOP)
                .setHeadingMode(WaypointV2MissionTypes.WaypointV2HeadingMode.AUTO)
                .build();
        waypointV2List.add(waypoint5);

        // Waypoint 6: (90,0)
        WaypointV2 waypoint6 = new WaypointV2.Builder()
                .setCoordinate(new LocationCoordinate2D(baseLatitude + HORIZONTAL_DISTANCE * ONE_METER_OFFSET * 3, baseLongitude))
                .setAltitude(baseAltitude)
                .setFlightPathMode(WaypointV2MissionTypes.WaypointV2FlightPathMode.GOTO_POINT_STRAIGHT_LINE_AND_STOP)
                .setHeadingMode(WaypointV2MissionTypes.WaypointV2HeadingMode.AUTO)
                .build();
        waypointV2List.add(waypoint6);

        // Waypoint 7: (120,30)
        WaypointV2 waypoint7 = new WaypointV2.Builder()
                .setCoordinate(new LocationCoordinate2D(baseLatitude + HORIZONTAL_DISTANCE * ONE_METER_OFFSET * 4, baseLongitude + VERTICAL_DISTANCE * ONE_METER_OFFSET))
                .setAltitude(baseAltitude)
                .setFlightPathMode(WaypointV2MissionTypes.WaypointV2FlightPathMode.GOTO_POINT_STRAIGHT_LINE_AND_STOP)
                .setHeadingMode(WaypointV2MissionTypes.WaypointV2HeadingMode.AUTO)
                .build();
        waypointV2List.add(waypoint7);

        // Waypoint 8: (120,0)
        WaypointV2 waypoint8 = new WaypointV2.Builder()
                .setCoordinate(new LocationCoordinate2D(baseLatitude + HORIZONTAL_DISTANCE * ONE_METER_OFFSET * 4, baseLongitude))
                .setAltitude(baseAltitude)
                .setFlightPathMode(WaypointV2MissionTypes.WaypointV2FlightPathMode.GOTO_POINT_STRAIGHT_LINE_AND_STOP)
                .setHeadingMode(WaypointV2MissionTypes.WaypointV2HeadingMode.AUTO)
                .build();
        waypointV2List.add(waypoint8);

        // Waypoint 9: (150,30)
        WaypointV2 waypoint9 = new WaypointV2.Builder()
                .setCoordinate(new LocationCoordinate2D(baseLatitude + HORIZONTAL_DISTANCE * ONE_METER_OFFSET * 5, baseLongitude + VERTICAL_DISTANCE * ONE_METER_OFFSET))
                .setAltitude(baseAltitude)
                .setFlightPathMode(WaypointV2MissionTypes.WaypointV2FlightPathMode.GOTO_POINT_STRAIGHT_LINE_AND_STOP)
                .setHeadingMode(WaypointV2MissionTypes.WaypointV2HeadingMode.AUTO)
                .build();
        waypointV2List.add(waypoint9);

        // Waypoint 10: (150,0)
        WaypointV2 waypoint10 = new WaypointV2.Builder()
                .setCoordinate(new LocationCoordinate2D(baseLatitude + HORIZONTAL_DISTANCE * ONE_METER_OFFSET * 5, baseLongitude))
                .setAltitude(baseAltitude)
                .setFlightPathMode(WaypointV2MissionTypes.WaypointV2FlightPathMode.GOTO_POINT_STRAIGHT_LINE_AND_STOP)
                .setHeadingMode(WaypointV2MissionTypes.WaypointV2HeadingMode.AUTO)
                .build();
        waypointV2List.add(waypoint10);


        waypointV2MissionBuilder = new WaypointV2Mission.Builder();
        waypointV2MissionBuilder.setMissionID(new Random().nextInt(65535))
                .setMaxFlightSpeed(15f)
                .setAutoFlightSpeed(5f)
                .setFinishedAction(WaypointV2MissionTypes.MissionFinishedAction.GO_HOME)
                .setGotoFirstWaypointMode(WaypointV2MissionTypes.MissionGotoWaypointMode.SAFELY)
                .setExitMissionOnRCSignalLostEnabled(true)
                .setRepeatTimes(1)
                .addwaypoints(waypointV2List);

        return waypointV2MissionBuilder.build();
    }

    private void uploadWaypointAction(List<WaypointV2Action> waypointV2ActionList) {
        int actionId = 0;
        int startIndex = 1;
        //Autofocus function at the first waypoint for Zenmuse P1
        waypointV2ActionList.addAll(WaypointV2Factory.addActiveFocusAction(0,actionId,0f));

        actionId=8;

        // Create a folder with "testFolder" at the end of folder name
        WaypointTrigger waypointAction1Trigger = new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.REACH_POINT)
                .setReachPointParam(new WaypointReachPointTriggerParam.Builder()
                        .setStartIndex(startIndex++)
                        .setAutoTerminateCount(0)
                        .build())
                .build();

        WaypointActuator waypointAction1Actuator = new WaypointActuator.Builder()
                .setActuatorType(ActionTypes.ActionActuatorType.CAMERA)
                .setCameraActuatorParam(new WaypointCameraActuatorParam.Builder()
                        .setCameraOperationType(ActionTypes.CameraOperationType.CUSTOM_NAME)
                        .setCustomNameParam(new WaypointCameraCustomNameParam.Builder()
                                .type(ActionTypes.CameraCustomNameType.DIR)
                                .customName("testFolder")
                                .build())
                        .build())
                .build();

        WaypointV2Action waypointAction1 = new WaypointV2Action.Builder()
                .setActionID(++actionId)
                .setTrigger(waypointAction1Trigger)
                .setActuator(waypointAction1Actuator)
                .build();
        waypointV2ActionList.add(waypointAction1);

        // Stop the aircraft
        WaypointTrigger waypointAction2Trigger = new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.ASSOCIATE)
                .setAssociateParam(new WaypointV2AssociateTriggerParam.Builder()
                        .setAssociateActionID(8)
                        .setAssociateType(ActionTypes.AssociatedTimingType.AFTER_FINISHED)
                        .setWaitingTime(0)
                        .build())
                .build();

        WaypointActuator waypointAction2Actuator = new WaypointActuator.Builder()
                .setActuatorType(ActionTypes.ActionActuatorType.AIRCRAFT_CONTROL)
                .setAircraftControlActuatorParam(new WaypointAircraftControlParam.Builder()
                        .setAircraftControlType(ActionTypes.AircraftControlType.START_STOP_FLY)
                        .setFlyControlParam(new WaypointAircraftControlStartStopFlyParam.Builder()
                                .setStartFly(false)
                                .build())
                        .build())
                .build();

        WaypointV2Action waypointAction2 = new WaypointV2Action.Builder()
                .setActionID(++actionId)
                .setTrigger(waypointAction2Trigger)
                .setActuator(waypointAction2Actuator)
                .build();
        waypointV2ActionList.add(waypointAction2);

        // Rotate the gimbal to -60 degrees in yaw
        WaypointTrigger waypointAction3Trigger = new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.ASSOCIATE)
                .setAssociateParam(new WaypointV2AssociateTriggerParam.Builder()
                        .setAssociateActionID(9)
                        .setAssociateType(ActionTypes.AssociatedTimingType.AFTER_FINISHED)
                        .setWaitingTime(0)
                        .build())
                .build();

        WaypointActuator waypointAction3Actuator = new WaypointActuator.Builder()
                .setActuatorType(ActionTypes.ActionActuatorType.GIMBAL)
                .setGimbalActuatorParam(new WaypointGimbalActuatorParam.Builder()
                        .operationType(ActionTypes.GimbalOperationType.ROTATE_GIMBAL)
                        .rotation(new Rotation.Builder()
                                .mode(RotationMode.ABSOLUTE_ANGLE)
                                .pitch(0)
                                .roll(0)
                                .yaw(-60.0f)
                                .time(2)
                                .build())
                        .build())
                .build();

        WaypointV2Action waypointAction3 = new WaypointV2Action.Builder()
                .setActionID(++actionId)
                .setTrigger(waypointAction3Trigger)
                .setActuator(waypointAction3Actuator)
                .build();
        waypointV2ActionList.add(waypointAction3);

        // Zoom with the largest scale in H20T
        WaypointTrigger waypointAction4Trigger = new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.ASSOCIATE)
                .setAssociateParam(new WaypointV2AssociateTriggerParam.Builder()
                        .setAssociateActionID(10)
                        .setAssociateType(ActionTypes.AssociatedTimingType.AFTER_FINISHED)
                        .setWaitingTime(0)
                        .build())
                .build();

        WaypointActuator waypointAction4Actuator = new WaypointActuator.Builder()
                .setActuatorType(ActionTypes.ActionActuatorType.CAMERA)
                .setCameraActuatorParam(new WaypointCameraActuatorParam.Builder()
                        .setCameraOperationType(ActionTypes.CameraOperationType.ZOOM)
                        .setZoomParam(new WaypointCameraZoomParam.Builder().setFocalLength(55620).build())
                        .build())
                .build();

        WaypointV2Action waypointAction4 = new WaypointV2Action.Builder()
                .setActionID(++actionId)
                .setTrigger(waypointAction4Trigger)
                .setActuator(waypointAction4Actuator)
                .build();
        waypointV2ActionList.add(waypointAction4);

        // Focus the camera on the middle of the screen
        WaypointTrigger waypointAction5Trigger = new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.ASSOCIATE)
                .setAssociateParam(new WaypointV2AssociateTriggerParam.Builder()
                        .setAssociateActionID(10)
                        .setAssociateType(ActionTypes.AssociatedTimingType.AFTER_FINISHED)
                        .setWaitingTime(0)
                        .build())
                .build();

        WaypointActuator waypointAction5Actuator = new WaypointActuator.Builder()
                .setActuatorType(ActionTypes.ActionActuatorType.CAMERA)
                .setCameraActuatorParam(new WaypointCameraActuatorParam.Builder()
                        .setCameraOperationType(ActionTypes.CameraOperationType.FOCUS)
                        .setFocusParam(new WaypointCameraFocusParam.Builder()
                                .setCameraFocusRegionType(CameraFocusRegionType.POINT)
                                .waypointCameraFocusPointTargetParam(new WaypointCameraFocusPointTargetParam.Builder()
                                        .focusPoint(new PointF(0.5f, 0.5f))
                                        .build())
                                .build())
                        .build())
                .build();

        WaypointV2Action waypointAction5 = new WaypointV2Action.Builder()
                .setActionID(++actionId)
                .setTrigger(waypointAction5Trigger)
                .setActuator(waypointAction5Actuator)
                .build();
        waypointV2ActionList.add(waypointAction5);

        // Capture a photo
        WaypointTrigger waypointAction6Trigger = new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.ASSOCIATE)
                .setAssociateParam(new WaypointV2AssociateTriggerParam.Builder()
                        .setAssociateActionID(12)
                        .setAssociateType(ActionTypes.AssociatedTimingType.AFTER_FINISHED)
                        .setWaitingTime(0)
                        .build())
                .build();

        WaypointActuator waypointAction6Actuator = new WaypointActuator.Builder()
                .setActuatorType(ActionTypes.ActionActuatorType.CAMERA)
                .setCameraActuatorParam(new WaypointCameraActuatorParam.Builder()
                        .setCameraOperationType(ActionTypes.CameraOperationType.SHOOT_SINGLE_PHOTO)
                        .build())
                .build();

        WaypointV2Action waypointAction6 = new WaypointV2Action.Builder()
                .setActionID(++actionId)
                .setTrigger(waypointAction6Trigger)
                .setActuator(waypointAction6Actuator)
                .build();
        waypointV2ActionList.add(waypointAction6);

        // Reset the gimbal to original position
        WaypointTrigger waypointAction7Trigger = new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.ASSOCIATE)
                .setAssociateParam(new WaypointV2AssociateTriggerParam.Builder()
                        .setAssociateActionID(13)
                        .setAssociateType(ActionTypes.AssociatedTimingType.AFTER_FINISHED)
                        .setWaitingTime(0)
                        .build())
                .build();

        WaypointActuator waypointAction7Actuator = new WaypointActuator.Builder()
                .setActuatorType(ActionTypes.ActionActuatorType.GIMBAL)
                .setGimbalActuatorParam(new WaypointGimbalActuatorParam.Builder()
                        .operationType(ActionTypes.GimbalOperationType.ROTATE_GIMBAL)
                        .rotation(new Rotation.Builder()
                                .mode(RotationMode.ABSOLUTE_ANGLE)
                                .pitch(0)
                                .roll(0)
                                .yaw(0)
                                .time(2)
                                .build())
                        .build())
                .build();

        WaypointV2Action waypointAction7 = new WaypointV2Action.Builder()
                .setActionID(++actionId)
                .setTrigger(waypointAction7Trigger)
                .setActuator(waypointAction7Actuator)
                .build();
        waypointV2ActionList.add(waypointAction7);

        // Continue flying the aircraft
        WaypointTrigger waypointAction8Trigger = new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.ASSOCIATE)
                .setAssociateParam(new WaypointV2AssociateTriggerParam.Builder()
                        .setAssociateActionID(14)
                        .setAssociateType(ActionTypes.AssociatedTimingType.AFTER_FINISHED)
                        .setWaitingTime(0)
                        .build())
                .build();

        WaypointActuator waypointAction8Actuator = new WaypointActuator.Builder()
                .setActuatorType(ActionTypes.ActionActuatorType.AIRCRAFT_CONTROL)
                .setAircraftControlActuatorParam(new WaypointAircraftControlParam.Builder()
                        .setAircraftControlType(ActionTypes.AircraftControlType.START_STOP_FLY)
                        .setFlyControlParam(new WaypointAircraftControlStartStopFlyParam.Builder()
                                .setStartFly(true)
                                .build())
                        .build())
                .build();

        WaypointV2Action waypointAction8 = new WaypointV2Action.Builder()
                .setActionID(++actionId)
                .setTrigger(waypointAction8Trigger)
                .setActuator(waypointAction8Actuator)
                .build();
        waypointV2ActionList.add(waypointAction8);

        // Start video recording
        WaypointTrigger waypointAction9Trigger = new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.REACH_POINT)
                .setReachPointParam(new WaypointReachPointTriggerParam.Builder()
                        .setStartIndex(1)
                        .setAutoTerminateCount(1)
                        .build())
                .build();

        WaypointActuator waypointAction9Actuator = new WaypointActuator.Builder()
                .setActuatorType(ActionTypes.ActionActuatorType.CAMERA)
                .setCameraActuatorParam(new WaypointCameraActuatorParam.Builder()
                        .setCameraOperationType(ActionTypes.CameraOperationType.START_RECORD_VIDEO)
                        .build())
                .build();

        WaypointV2Action waypointAction9 = new WaypointV2Action.Builder()
                .setActionID(++actionId)
                .setTrigger(waypointAction9Trigger)
                .setActuator(waypointAction9Actuator)
                .build();
        waypointV2ActionList.add(waypointAction9);

        // Trajectory rotating the gimbal to -90 degrees in pitch
        WaypointTrigger waypointAction10Trigger = new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.TRAJECTORY)
                .setTrajectoryParam(new WaypointTrajectoryTriggerParam.Builder()
                        .setStartIndex(1)
                        .setEndIndex(2)
                        .build())
                .build();

        WaypointActuator waypointAction10Actuator = new WaypointActuator.Builder()
                .setActuatorType(ActionTypes.ActionActuatorType.GIMBAL)
                .setGimbalActuatorParam(new WaypointGimbalActuatorParam.Builder()
                        .operationType(ActionTypes.GimbalOperationType.AIRCRAFT_CONTROL_GIMBAL)
                        .rotation(new Rotation.Builder()
                                .mode(RotationMode.ABSOLUTE_ANGLE)
                                .pitch(-90.0f)
                                .roll(0)
                                .yaw(0)
                                .time(5)
                                .build())
                        .build())
                .build();

        WaypointV2Action waypointAction10 = new WaypointV2Action.Builder()
                .setActionID(++actionId)
                .setTrigger(waypointAction10Trigger)
                .setActuator(waypointAction10Actuator)
                .build();
        waypointV2ActionList.add(waypointAction10);

        // Trajectory rotating the gimbal back to its original position
        WaypointTrigger waypointAction11Trigger = new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.TRAJECTORY)
                .setTrajectoryParam(new WaypointTrajectoryTriggerParam.Builder()
                        .setStartIndex(2)
                        .setEndIndex(3)
                        .build())
                .build();

        WaypointActuator waypointAction11Actuator = new WaypointActuator.Builder()
                .setActuatorType(ActionTypes.ActionActuatorType.GIMBAL)
                .setGimbalActuatorParam(new WaypointGimbalActuatorParam.Builder()
                        .operationType(ActionTypes.GimbalOperationType.AIRCRAFT_CONTROL_GIMBAL)
                        .rotation(new Rotation.Builder()
                                .mode(RotationMode.ABSOLUTE_ANGLE)
                                .pitch(0)
                                .roll(0)
                                .yaw(0)
                                .time(5)
                                .build())
                        .build())
                .build();

        WaypointV2Action waypointAction11 = new WaypointV2Action.Builder()
                .setActionID(++actionId)
                .setTrigger(waypointAction11Trigger)
                .setActuator(waypointAction11Actuator)
                .build();
        waypointV2ActionList.add(waypointAction11);

        // Stop video recording
        WaypointTrigger waypointAction12Trigger = new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.REACH_POINT)
                .setReachPointParam(new WaypointReachPointTriggerParam.Builder()
                        .setStartIndex(3)
                        .setAutoTerminateCount(3)
                        .build())
                .build();

        WaypointActuator waypointAction12Actuator = new WaypointActuator.Builder()
                .setActuatorType(ActionTypes.ActionActuatorType.CAMERA)
                .setCameraActuatorParam(new WaypointCameraActuatorParam.Builder()
                        .setCameraOperationType(ActionTypes.CameraOperationType.STOP_RECORD_VIDEO)
                        .build())
                .build();

        WaypointV2Action waypointAction12 = new WaypointV2Action.Builder()
                .setActionID(++actionId)
                .setTrigger(waypointAction12Trigger)
                .setActuator(waypointAction12Actuator)
                .build();
        waypointV2ActionList.add(waypointAction12);

        // Periodically set a file name with 'testFile' at the end of file name
        WaypointTrigger waypointAction13Trigger = new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.SIMPLE_INTERVAL)
                .setIntervalTriggerParam(new WaypointIntervalTriggerParam.Builder()
                        .setType(ActionTypes.ActionIntervalType.TIME)
                        .setStartIndex(4)
                        .setInterval(2)
                        .build())
                .build();

        WaypointActuator waypointAction13Actuator = new WaypointActuator.Builder()
                .setActuatorType(ActionTypes.ActionActuatorType.CAMERA)
                .setCameraActuatorParam(new WaypointCameraActuatorParam.Builder()
                        .setCameraOperationType(ActionTypes.CameraOperationType.CUSTOM_NAME)
                        .setCustomNameParam(new WaypointCameraCustomNameParam.Builder()
                                .type(ActionTypes.CameraCustomNameType.FILE)
                                .customName("testFile")
                                .build())
                        .build())
                .build();

        WaypointV2Action waypointAction13 = new WaypointV2Action.Builder()
                .setActionID(++actionId)
                .setTrigger(waypointAction13Trigger)
                .setActuator(waypointAction13Actuator)
                .build();
        waypointV2ActionList.add(waypointAction13);

        // Periodically capture photos
        WaypointTrigger waypointAction14Trigger = new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.ASSOCIATE)
                .setAssociateParam(new WaypointV2AssociateTriggerParam.Builder()
                        .setAssociateActionID(13)
                        .setAssociateType(ActionTypes.AssociatedTimingType.AFTER_FINISHED)
                        // Because set file name and shoot photo is the same module, it is better to set a waiting time.
                        .setWaitingTime(0.5f)
                        .build())
                .build();

        WaypointActuator waypointAction14Actuator = new WaypointActuator.Builder()
                .setActuatorType(ActionTypes.ActionActuatorType.CAMERA)
                .setCameraActuatorParam(new WaypointCameraActuatorParam.Builder()
                        .setCameraOperationType(ActionTypes.CameraOperationType.SHOOT_SINGLE_PHOTO)
                        .build())
                .build();

        WaypointV2Action waypointAction14 = new WaypointV2Action.Builder()
                .setActionID(++actionId)
                .setTrigger(waypointAction14Trigger)
                .setActuator(waypointAction14Actuator)
                .build();
        waypointV2ActionList.add(waypointAction14);

        //Start Path Shooting for Zenmuse P1
        WaypointTrigger startPathShootingTriger = new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.REACH_POINT)
                .setReachPointParam(new WaypointReachPointTriggerParam.Builder()
                        .setStartIndex(startIndex++)
                        .setAutoTerminateCount(0)
                        .build())
                .build();
        WaypointActuator startPathShootingActuator = ActionUtils.getStartPathShootingActuator(0,0, ActionTypes.GimbalPathCycleMode.UNLIMITED);
        WaypointV2Action startPathShootingAction = new WaypointV2Action.Builder()
                .setActionID(++actionId)
                .setActuator(startPathShootingActuator)
                .setTrigger(startPathShootingTriger)
                .build();
        waypointV2ActionList.add(startPathShootingAction);

        //Stop Path Shooting for Zenmuse P1
        WaypointTrigger stopPathShootingTriger = new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.REACH_POINT)
                .setReachPointParam(new WaypointReachPointTriggerParam.Builder()
                        .setStartIndex(startIndex++)
                        .setAutoTerminateCount(0)
                        .build())
                .build();
        WaypointActuator stopPathShootingActuator = ActionUtils.getStopPathShootingActuator(0, ActionTypes.GimbalPathCycleMode.UNLIMITED);
        WaypointV2Action stopPathShootingAction = new WaypointV2Action.Builder()
                .setActionID(++actionId)
                .setActuator(stopPathShootingActuator)
                .setTrigger(stopPathShootingTriger)
                .build();
        waypointV2ActionList.add(stopPathShootingAction);

        //Start Interval Shoot
        WaypointCameraStartIntervalShootParam cameraStartIntervalShootParam = WaypointCameraStartIntervalShootParam.Builder.aWaypointCameraStartIntervalShootParam()
                .shootCount(20)
                .shootIntervalTime(1.2)
                .build();
        WaypointCameraActuatorParam cameraStartIntervalShot = new WaypointCameraActuatorParam.Builder()
                .setCameraOperationType(ActionTypes.CameraOperationType.START_INTERVAL_SHOOT)
                .setStartIntervalShootParam(cameraStartIntervalShootParam)
                .setRetryTime(1)
                .build();
        WaypointTrigger cameraStartIntervalShootTrigger = new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.REACH_POINT)
                .setReachPointParam(new WaypointReachPointTriggerParam.Builder()
                        .setStartIndex(startIndex++)
                        .setAutoTerminateCount(2)
                        .build())
                .build();
        WaypointActuator cameraStartIntervalShootActuator = new WaypointActuator.Builder()
                .setActuatorType(ActionTypes.ActionActuatorType.CAMERA)
                .setCameraActuatorParam(cameraStartIntervalShot)
                .build();
        WaypointV2Action cameraStartIntervalShotAction = new WaypointV2Action.Builder()
                .setActionID(++actionId)
                .setTrigger(cameraStartIntervalShootTrigger)
                .setActuator(cameraStartIntervalShootActuator)
                .build();
        waypointV2ActionList.add(cameraStartIntervalShotAction);


        //Stop Interval Shoot
        WaypointCameraStopIntervalShootParam cameraStopIntervalShootParam = new WaypointCameraStopIntervalShootParam();
        WaypointCameraActuatorParam cameraStopIntervalShoot = new WaypointCameraActuatorParam.Builder()
                .setCameraOperationType(ActionTypes.CameraOperationType.STOP_INTERVAL_SHOOT)
                .setStopIntervalShootParam(cameraStopIntervalShootParam)
                .setRetryTime(1)
                .build();
        WaypointTrigger cameraStopIntervalShootTrigger = new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.REACH_POINT)
                .setReachPointParam(new WaypointReachPointTriggerParam.Builder()
                        .setStartIndex(startIndex++)
                        .setAutoTerminateCount(0)
                        .build())
                .build();
        WaypointActuator cameraStopIntervalShootActuator = new WaypointActuator.Builder()
                .setActuatorType(ActionTypes.ActionActuatorType.CAMERA)
                .setCameraActuatorParam(cameraStopIntervalShoot)
                .build();
        WaypointV2Action cameraStopIntervalShootAction = new WaypointV2Action.Builder()
                .setActionID(++actionId)
                .setTrigger(cameraStopIntervalShootTrigger)
                .setActuator(cameraStopIntervalShootActuator)
                .build();
        waypointV2ActionList.add(cameraStopIntervalShootAction);


        //Point cloud recording for Zenmuse L1
        WaypointPointCloudRecordActuatorParam waypointStartPointCloudRecordActuatorParam = new WaypointPointCloudRecordActuatorParam.Builder()
                .type(ActionTypes.PointCloudRecordType.START_RECORD_POINT_CLOUD)
                .build();
        WaypointLidarActuatorParam waypointStartLidarActuatorParam = new WaypointLidarActuatorParam.Builder()
                .lidarOperationType(ActionTypes.LidarOperationType.RECORD_POINT_CLOUD)
                .pointCloudRecordParam(waypointStartPointCloudRecordActuatorParam)
                .build();
        WaypointTrigger waypointStartPointCloudRecordTrigger = new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.REACH_POINT)
                .setReachPointParam(new WaypointReachPointTriggerParam.Builder()
                        .setStartIndex(startIndex++)
                        .setAutoTerminateCount(0)
                        .build())
                .build();
        WaypointActuator waypointStartPointCloudRecordActuator = new WaypointActuator.Builder()
                .setActuatorType(ActionTypes.ActionActuatorType.LIDAR)
                .setLidarActuatorParam(waypointStartLidarActuatorParam)
                .build();
        WaypointV2Action waypointStartPointCloudRecordAction = new WaypointV2Action.Builder()
                .setActionID(++actionId)
                .setTrigger(waypointStartPointCloudRecordTrigger)
                .setActuator(waypointStartPointCloudRecordActuator)
                .build();
        waypointV2ActionList.add(waypointStartPointCloudRecordAction);


        WaypointPointCloudRecordActuatorParam waypointStopPointCloudRecordActuatorParam = new WaypointPointCloudRecordActuatorParam.Builder()
                .type(ActionTypes.PointCloudRecordType.STOP_RECORD_POINT_CLOUD)
                .build();
        WaypointLidarActuatorParam waypointStopLidarActuatorParam = new WaypointLidarActuatorParam.Builder()
                .lidarOperationType(ActionTypes.LidarOperationType.RECORD_POINT_CLOUD)
                .pointCloudRecordParam(waypointStopPointCloudRecordActuatorParam)
                .build();
        WaypointTrigger waypointStopPointCloudRecordTrigger = new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.REACH_POINT)
                .setReachPointParam(new WaypointReachPointTriggerParam.Builder()
                        .setStartIndex(startIndex++)
                        .setAutoTerminateCount(0)
                        .build())
                .build();
        WaypointActuator waypointStopPointCloudRecordActuator = new WaypointActuator.Builder()
                .setActuatorType(ActionTypes.ActionActuatorType.LIDAR)
                .setLidarActuatorParam(waypointStopLidarActuatorParam)
                .build();
        WaypointV2Action waypointStopPointCloudRecordAction = new WaypointV2Action.Builder()
                .setActionID(++actionId)
                .setTrigger(waypointStopPointCloudRecordTrigger)
                .setActuator(waypointStopPointCloudRecordActuator)
                .build();
        waypointV2ActionList.add(waypointStopPointCloudRecordAction);

        waypointV2MissionOperator.uploadWaypointActions(waypointV2ActionList, new CommonCallbacks.CompletionCallback<DJIWaypointV2Error>() {
            @Override
            public void onResult(DJIWaypointV2Error djiWaypointV2Error) {
                if (djiWaypointV2Error != null) {
                    ToastUtils.setResultToToast(djiWaypointV2Error.getDescription());
                }
            }
        });
    }

    private void setUpListener() {
        waypointV2MissionOperatorListener = new WaypointV2MissionOperatorListener() {
            @Override
            public void onDownloadUpdate(WaypointV2MissionDownloadEvent waypointV2MissionDownloadEvent) {
            }

            @Override
            public void onUploadUpdate(WaypointV2MissionUploadEvent waypointV2MissionUploadEvent) {
                if (waypointV2MissionUploadEvent.getError() != null) {
                    ToastUtils.setResultToToast(waypointV2MissionUploadEvent.getError().getDescription());
                }

                if (waypointV2MissionUploadEvent.getPreviousState() == WaypointV2MissionState.UPLOADING
                        && waypointV2MissionUploadEvent.getCurrentState() == WaypointV2MissionState.READY_TO_EXECUTE) {
                    ToastUtils.setResultToToast("Mission is uploaded successfully");
                }
            }

            @Override
            public void onExecutionUpdate(WaypointV2MissionExecutionEvent waypointV2MissionExecutionEvent) {
            }

            @Override
            public void onExecutionStart() {
            }

            @Override
            public void onExecutionFinish(DJIWaypointV2Error djiWaypointV2Error) {
            }

            @Override
            public void onExecutionStopped() {
            }
        };

        waypointV2ActionListener = new WaypointV2ActionListener() {
            @Override
            public void onDownloadUpdate(ActionDownloadEvent actionDownloadEvent) {
            }

            @Override
            public void onUploadUpdate(ActionUploadEvent actionUploadEvent) {
                if (actionUploadEvent.getCurrentState().equals(ActionState.READY_TO_UPLOAD)) {
                    List<WaypointV2Action> waypointV2ActionList = new ArrayList<>();
                    uploadWaypointAction(waypointV2ActionList);
                }
                if (actionUploadEvent.getPreviousState() == ActionState.UPLOADING
                        && actionUploadEvent.getCurrentState() == ActionState.READY_TO_EXECUTE) {
                    ToastUtils.setResultToToast("Actions are uploaded successfully");
                    canStartMission = true;
                }
            }

            @Override
            public void onExecutionUpdate(ActionExecutionEvent actionExecutionEvent) {
            }

            @Override
            public void onExecutionStart(int i) {

            }

            @Override
            public void onExecutionFinish(int i, DJIWaypointV2Error djiWaypointV2Error) {

            }
        };

        waypointV2MissionOperator.addWaypointEventListener(waypointV2MissionOperatorListener);
        waypointV2MissionOperator.addActionListener(waypointV2ActionListener);
    }

    private void tearDownListener() {
        waypointV2MissionOperator.removeWaypointListener(waypointV2MissionOperatorListener);
        waypointV2MissionOperator.removeActionListener(waypointV2ActionListener);
    }

    private void updateWaypointMissionState(){
        if (waypointV2MissionOperator != null && waypointV2MissionOperator.getCurrentState() != null) {
            ToastUtils.setResultToText(FCPushInfoTV,
                    "home point latitude: "
                            + homeLatitude
                            + "\nhome point longitude: "
                            + homeLongitude
                            + "\nFlight state: "
                            + flightState.name()
                            + "\nCurrent Waypointmission state : "
                            + waypointV2MissionOperator.getCurrentState().name());
        } else {
            ToastUtils.setResultToText(FCPushInfoTV,
                    "home point latitude: "
                            + homeLatitude
                            + "\nhome point longitude: "
                            + homeLongitude
                            + "\nFlight state: "
                            + flightState.name());
        }
    }

    @Override
    public int getDescription() {
        return R.string.component_listview_waypointv2;
    }
}
