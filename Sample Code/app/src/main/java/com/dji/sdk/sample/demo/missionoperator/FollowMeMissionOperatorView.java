package com.dji.sdk.sample.demo.missionoperator;

import android.content.Context;
import android.view.View;

import com.dji.sdk.sample.R;
import android.util.Log;
import com.dji.sdk.sample.demo.missionmanager.MissionBaseView;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.ToastUtils;

import org.jetbrains.annotations.NotNull;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.common.error.DJIError;
import dji.common.flightcontroller.FlightControllerState;
import dji.common.flightcontroller.simulator.InitializationData;
import dji.common.mission.followme.FollowMeHeading;
import dji.common.mission.followme.FollowMeMission;
import dji.common.mission.followme.FollowMeMissionEvent;
import dji.common.model.LocationCoordinate2D;
import dji.common.util.CommonCallbacks;
import dji.sdk.base.BaseProduct;
import dji.sdk.flightcontroller.FlightController;
import dji.sdk.mission.MissionControl;
import dji.sdk.mission.followme.FollowMeMissionOperator;
import dji.sdk.mission.followme.FollowMeMissionOperatorListener;
import dji.sdk.products.Aircraft;

public class FollowMeMissionOperatorView extends MissionBaseView {

    private static final double BASE_LATITUDE = 22;
    private static final double BASE_LONGITUDE = 113;
    private double latitude = 0;
    private double longitude = 0;
    private static final int REFRESH_FREQ = 10;
    private static final int SATELLITE_COUNT = 10;
    private static final double ONE_METER_OFFSET = 0.00000899322;

    private FollowMeMissionOperator followMeMissionOperator = null;
    private FlightController flightController = null;
    private FollowMeMission mission = null;
    private FollowMeMissionOperatorListener listener;

    public FollowMeMissionOperatorView(Context context) {
        super(context);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        followMeMissionOperator = MissionControl.getInstance().getFollowMeMissionOperator();
        ToastUtils.setResultToText(missionPushInfoTV, "FollowMe mission state: " + followMeMissionOperator.getCurrentState());
        setUpListener();
    }

    private void setUpListener() {
        // Example of Listener
        listener = new FollowMeMissionOperatorListener() {

            @Override
            public void onExecutionUpdate(@NonNull @NotNull FollowMeMissionEvent followMeMissionEvent) {
                // Example of Execution Listener
                Log.d("TAG",
                        (followMeMissionEvent.getPreviousState() == null
                                ? ""
                                : followMeMissionEvent.getPreviousState().getName())
                                + ", "
                                + followMeMissionEvent.getCurrentState().getName()
                                + ", "
                                + followMeMissionEvent.getDistanceToTarget()
                                + ", "
                                + followMeMissionEvent.getError().getDescription());
                ToastUtils.setResultToText(missionPushInfoTV, "FollowMe mission state: " + followMeMissionOperator.getCurrentState());
            }

            @Override
            public void onExecutionStart() {
                ToastUtils.setResultToToast("Mission started");
                ToastUtils.setResultToText(missionPushInfoTV, "FollowMe mission state: " + followMeMissionOperator.getCurrentState());
            }

            @Override
            public void onExecutionFinish(@Nullable @org.jetbrains.annotations.Nullable DJIError djiError) {
                ToastUtils.setResultToToast("Mission finished");
                ToastUtils.setResultToText(missionPushInfoTV, "FollowMe mission state: " + followMeMissionOperator.getCurrentState());
            }
        };
    }

    @Override
    protected void onDetachedFromWindow() {
        if (followMeMissionOperator != null && listener != null) {
            followMeMissionOperator.removeListener(listener);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.btn_start:
                followMeMissionOperator.startMission(new FollowMeMission(FollowMeHeading.TOWARD_FOLLOW_POSITION,
                        latitude + 5 * ONE_METER_OFFSET, longitude + 5 * ONE_METER_OFFSET, 30f
                        ), new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError djiError) {
                        ToastUtils.setResultToToast(djiError != null ? djiError.getDescription(): "start success");
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                int cnt = 0;
                                while(cnt < 100) {
                                    latitude = latitude + 5 * ONE_METER_OFFSET;
                                    longitude = longitude + 5 * ONE_METER_OFFSET;
                                    LocationCoordinate2D newLocation = new LocationCoordinate2D(latitude, longitude);
                                    followMeMissionOperator.updateFollowingTarget(newLocation, djiError1 -> {
                                        try {
                                            Thread.sleep(1500);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                    });
                                    cnt++;
                                }
                            }
                        }).start();
                    }
                });
                break;
            case R.id.btn_stop:
                followMeMissionOperator.stopMission(djiError -> ToastUtils.setResultToToast(djiError != null ? "" : djiError.getDescription()));
                break;
            default:
                break;
        }
    }

    @Override
    public int getDescription() {
        return R.string.component_listview_follow_me_mission_operator;
    }
}
