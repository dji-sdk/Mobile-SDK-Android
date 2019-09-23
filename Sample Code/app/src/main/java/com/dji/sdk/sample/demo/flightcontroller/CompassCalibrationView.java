package com.dji.sdk.sample.demo.flightcontroller;

import android.content.Context;

import androidx.annotation.NonNull;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import com.dji.sdk.sample.internal.view.BaseThreeBtnView;

import dji.common.error.DJIError;
import dji.common.flightcontroller.FlightControllerState;
import dji.common.util.CommonCallbacks;
import dji.sdk.flightcontroller.Compass;
import dji.sdk.flightcontroller.FlightController;
import dji.sdk.products.Aircraft;

/**
 * Class of compass calibration.
 */
public class CompassCalibrationView extends BaseThreeBtnView {

    private Compass compass;

    public CompassCalibrationView(Context context) {
        super(context);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        if (ModuleVerificationUtil.isFlightControllerAvailable()) {
            FlightController flightController =
                ((Aircraft) DJISampleApplication.getProductInstance()).getFlightController();

            flightController.setStateCallback(new FlightControllerState.Callback() {
                @Override
                public void onUpdate(@NonNull FlightControllerState djiFlightControllerCurrentState) {
                    if (null != compass) {
                        String description =
                            "CalibrationStatus: " + compass.getCalibrationState() + "\n"
                            + "Heading: " + compass.getHeading() + "\n"
                            + "isCalibrating: " + compass.isCalibrating() + "\n";

                        changeDescription(description);
                    }
                }
            });
            if (ModuleVerificationUtil.isCompassAvailable()) {
                compass = flightController.getCompass();
            }
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if(ModuleVerificationUtil.isFlightControllerAvailable()) {
            ((Aircraft) DJISampleApplication.getProductInstance()).getFlightController().setStateCallback(null);
        }
    }

    @Override
    protected int getDescriptionResourceId() {
        return R.string.compass_calibration_description;
    }

    @Override
    protected void handleRightBtnClick() {
        if (ModuleVerificationUtil.isCompassAvailable()) {
            compass = ((Aircraft) DJISampleApplication.getProductInstance()).getFlightController().getCompass();

            compass.stopCalibration(new CommonCallbacks.CompletionCallback() {
                @Override
                public void onResult(DJIError djiError) {

                }
            });
        }
    }

    @Override
    protected void handleMiddleBtnClick() {

    }

    @Override
    protected int getMiddleBtnTextResourceId() {
        return DISABLE;
    }

    @Override
    protected int getRightBtnTextResourceId() {
        return R.string.compass_calibration_stop_calibration;
    }

    @Override
    protected int getLeftBtnTextResourceId() {
        return R.string.compass_calibration_start_calibration;
    }

    @Override
    protected void handleLeftBtnClick() {
        if (ModuleVerificationUtil.isCompassAvailable()) {
            compass = ((Aircraft) DJISampleApplication.getProductInstance()).getFlightController().getCompass();

            compass.startCalibration(new CommonCallbacks.CompletionCallback() {
                @Override
                public void onResult(DJIError djiError) {

                }
            });
        }
    }

    @Override
    public int getDescription() {
        return R.string.flight_controller_listview_compass_calibration;
    }
}
