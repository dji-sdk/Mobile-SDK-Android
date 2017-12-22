package com.dji.sdk.sample.demo.flightcontroller;

import android.content.Context;
import android.support.annotation.NonNull;
import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.BaseThreeBtnView;
import dji.common.error.DJIError;
import dji.common.flightcontroller.FlightControllerState;
import dji.common.flightcontroller.FlightOrientationMode;
import dji.common.util.CommonCallbacks;
import dji.sdk.flightcontroller.FlightController;

/**
 * Class for Orientation mode.
 */
public class OrientationModeView extends BaseThreeBtnView {

    private FlightController flightController;

    private String orientationMode;

    public OrientationModeView(Context context) {
        super(context);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        if (ModuleVerificationUtil.isFlightControllerAvailable()) {
            flightController = DJISampleApplication.getAircraftInstance().getFlightController();

            flightController.setStateCallback(new FlightControllerState.Callback() {
                @Override
                public void onUpdate(@NonNull FlightControllerState flightControllerState) {
                    orientationMode = flightControllerState.getOrientationMode().name();
                    changeDescription("Current Orientation Mode is" + "\n" +
                                          orientationMode);
                }
            });
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();

        if(ModuleVerificationUtil.isFlightControllerAvailable()) {
            flightController = DJISampleApplication.getAircraftInstance().getFlightController();
            flightController.setStateCallback(null);
        }
    }

    @Override
    protected int getMiddleBtnTextResourceId() {
        return R.string.orientation_mode_home_lock;
    }

    @Override
    protected int getLeftBtnTextResourceId() {
        return R.string.orientation_mode_course_lock;
    }

    @Override
    protected int getRightBtnTextResourceId() {
        return R.string.orientation_mode_aircraft_heading;
    }

    @Override
    protected int getDescriptionResourceId() {
        return R.string.orientation_mode_description;
    }

    @Override
    protected void handleMiddleBtnClick() {
        if (ModuleVerificationUtil.isFlightControllerAvailable()) {
            flightController = DJISampleApplication.getAircraftInstance().getFlightController();

            flightController.setFlightOrientationMode(FlightOrientationMode.HOME_LOCK,
                                                      new CommonCallbacks.CompletionCallback() {
                                                          @Override
                                                          public void onResult(DJIError djiError) {
                                                              ToastUtils.setResultToToast("Result: " + (djiError == null
                                                                                                   ? "Success"
                                                                                                   : djiError.getDescription()));
                                                          }
                                                      });
        }
    }

    @Override
    protected void handleLeftBtnClick() {
        if (ModuleVerificationUtil.isFlightControllerAvailable()) {
            flightController = DJISampleApplication.getAircraftInstance().getFlightController();

            flightController.setFlightOrientationMode(FlightOrientationMode.COURSE_LOCK,
                                                      new CommonCallbacks.CompletionCallback() {
                                                          @Override
                                                          public void onResult(DJIError djiError) {
                                                              ToastUtils.setResultToToast("Result: " + (djiError == null
                                                                                                   ? "Success"
                                                                                                   : djiError.getDescription()));
                                                          }
                                                      });
        }
    }

    @Override
    protected void handleRightBtnClick() {
        if (ModuleVerificationUtil.isFlightControllerAvailable()) {
            flightController = DJISampleApplication.getAircraftInstance().getFlightController();

            flightController.setFlightOrientationMode(FlightOrientationMode.AIRCRAFT_HEADING,
                                                      new CommonCallbacks.CompletionCallback() {
                                                          @Override
                                                          public void onResult(DJIError djiError) {
                                                              ToastUtils.setResultToToast("Result: " + (djiError == null
                                                                                                   ? "Success"
                                                                                                   : djiError.getDescription()));
                                                          }
                                                      });
        }
    }

    @Override
    public int getDescription() {
        return R.string.flight_controller_listview_orientation_mode;
    }
}
