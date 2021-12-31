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
    private static final int MAX_HEIGHT = 500;
    private static final int MAX_RADIUS = 500;
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
        BaseProduct product = DJISampleApplication.getProductInstance();

        if (product == null || !product.isConnected()) {
            ToastUtils.setResultToToast("Disconnect");
            return;
        } else {
            if (product instanceof Aircraft) {
                flightController = ((Aircraft) product).getFlightController();
            }
            if (flightController != null) {
                flightController.setStateCallback(new FlightControllerState.Callback() {
                    @Override
                    public void onUpdate(@NonNull FlightControllerState flightControllerState) {
                        homeLatitude = flightControllerState.getHomeLocation().getLatitude();
                        latitude = flightControllerState.getHomeLocation().getLatitude();
                        homeLongitude = flightControllerState.getHomeLocation().getLongitude();
                        longitude = flightControllerState.getHomeLocation().getLongitude();
                        flightState = flightControllerState.getFlightMode();

                        if (flightControllerState.isLandingConfirmationNeeded()) {
                            flightController.confirmLanding(new CommonCallbacks.CompletionCallback() {
                                @Override
                                public void onResult(DJIError djiError) {
                                    ToastUtils.setResultToToast(djiError == null ? "confirmLanding OK" : djiError.getDescription());
                                }
                            });
                        }

                        updateFollowMeMissionState();
                    }
                });
            }
        }
        followMeMissionOperator = MissionControl.getInstance().getFollowMeMissionOperator();
        setUpListener();
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
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.btn_simulator:
                startSimulator();
                break;
            case R.id.btn_set_maximum_altitude:
                if (null != getFlightController()) {
                    flightController.setMaxFlightHeight(MAX_HEIGHT, new CommonCallbacks.CompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {
                            ToastUtils.setResultToToast(djiError == null ? "The maximum height is set to 500m!" : djiError.getDescription());
                        }
                    });
                }
                break;
            case R.id.btn_set_maximum_radius:
                if (null != getFlightController()) {
                    flightController.setMaxFlightRadius(MAX_RADIUS, new CommonCallbacks.CompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {
                            ToastUtils.setResultToToast(djiError == null ? "The maximum radius is set to 500m!" : djiError.getDescription());
                        }
                    });
                }
                break;
            case R.id.btn_load:
            case R.id.btn_upload:
            case R.id.btn_pause:
            case R.id.btn_resume:
            case R.id.btn_download:
                ToastUtils.setResultToToast("No use of this button, only start and stop buttons are valid.");
                break;
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

    private FlightController getFlightController() {
        if (null == flightController) {
            if (null != DJISampleApplication.getAircraftInstance()) {
                return DJISampleApplication.getAircraftInstance().getFlightController();
            }
            ToastUtils.setResultToToast("Product is disconnected!");
        }
        return flightController;
    }

    private void startSimulator() {
        if (null != getFlightController()) {
            flightController.getSimulator().start(InitializationData.createInstance(new LocationCoordinate2D(BASE_LATITUDE, BASE_LONGITUDE),REFRESH_FREQ, SATELLITE_COUNT),
                    djiError -> ToastUtils.setResultToToast(djiError != null ?  djiError.getDescription():"Simulator started"));
        }
    }

    private void updateFollowMeMissionState(){
        if (followMeMissionOperator != null && followMeMissionOperator.getCurrentState() != null) {
            ToastUtils.setResultToText(FCPushInfoTV,
                    "home point latitude: "
                            + homeLatitude
                            + "\nhome point longitude: "
                            + homeLongitude
                            + "\nFlight state: "
                            + flightState.name()
                            + "\nCurrent Waypointmission state : "
                            + followMeMissionOperator.getCurrentState().getName()
                            + "\nGet Following Target: ("
                            + followMeMissionOperator.getFollowingTarget().getLatitude()
                            + ", "
                            + followMeMissionOperator.getFollowingTarget().getLongitude()
                            + ")");
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
                updateFollowMeMissionState();
            }

            @Override
            public void onExecutionStart() {
                ToastUtils.setResultToToast("Mission started");
                updateFollowMeMissionState();
            }

            @Override
            public void onExecutionFinish(@Nullable @org.jetbrains.annotations.Nullable DJIError djiError) {
                ToastUtils.setResultToToast("Mission finished");
                updateFollowMeMissionState();
            }
        };
    }

    private void tearDownListener() {
        if (followMeMissionOperator != null && listener != null) {
            // Example of removing listeners
            followMeMissionOperator.removeListener(listener);
        }
    }

    @Override
    public int getDescription() {
        return R.string.component_listview_follow_me_mission_operator;
    }
}
