package com.dji.sdk.sample.flightcontroller;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.common.BaseThreeBtnView;
import com.dji.sdk.sample.common.DJISampleApplication;
import com.dji.sdk.sample.utils.DJIModuleVerificationUtil;

import dji.common.error.DJIError;
import dji.common.flightcontroller.DJIFlightControllerCurrentState;
import dji.common.flightcontroller.DJIFlightControllerDataType;
import dji.common.util.DJICommonCallbacks;
import dji.sdk.base.DJIBaseComponent;
import dji.sdk.flightcontroller.DJICompass;
import dji.sdk.flightcontroller.DJIFlightController;
import dji.sdk.flightcontroller.DJIFlightControllerDelegate;
import dji.sdk.products.DJIAircraft;

/**
 * Class of compass calibration.
 */
public class CompassCalibrationView extends BaseThreeBtnView {

    private static final int SET_CHANGE_STATUS = 0;

    private DJIFlightController mFlightController;
    private DJICompass mCompass;

    private StringBuffer mStringBuffer;
    private Handler mHandler = new Handler(new Handler.Callback() {

        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case SET_CHANGE_STATUS:
                    mTexInfo.setText(mStringBuffer.toString());
                    break;

                default:
                    break;
            }
            return false;
        }
    });

    public CompassCalibrationView(Context context, AttributeSet attrs) {
        super(context, attrs);
        leftBtn.setVisibility(View.INVISIBLE);

        mStringBuffer = new StringBuffer();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        if (DJIModuleVerificationUtil.isFlightControllerAvailable()) {
            mFlightController = ((DJIAircraft) DJISampleApplication.getProductInstance())
                    .getFlightController();

            mFlightController.setUpdateSystemStateCallback(
                    new DJIFlightControllerDelegate.FlightControllerUpdateSystemStateCallback() {
                        @Override
                        public void onResult(DJIFlightControllerCurrentState
                                                     djiFlightControllerCurrentState) {
                            if (null != mCompass) {
                                mStringBuffer.delete(0, mStringBuffer.length());

                                mStringBuffer.append("CalibrationStatus: ")
                                        .append(mCompass.getCalibrationStatus()).append("\n");
                                mStringBuffer.append("Heading: ")
                                        .append(mCompass.getHeading()).append("\n");
                                mStringBuffer.append("isCalibrating: ")
                                        .append(mCompass.isCalibrating()).append("\n");

                                mHandler.sendEmptyMessage(SET_CHANGE_STATUS);
                            }
                        }
                    });
            if (DJIModuleVerificationUtil.isCompassAvailable()) {
                mCompass = mFlightController.getCompass();
            }
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    protected int getInfoResourceId() {
        return R.string.compass_calibration_description;
    }

    @Override
    protected void getRightBtnMethod() {
        if (DJIModuleVerificationUtil.isCompassAvailable()) {
            mCompass = ((DJIAircraft) DJISampleApplication.getProductInstance())
                    .getFlightController().getCompass();

            mCompass.stopCompassCalibration(new DJICommonCallbacks.DJICompletionCallback() {
                @Override
                public void onResult(DJIError djiError) {

                }
            });
        }
    }

    @Override
    protected void getMiddleBtnMethod() {
        if (DJIModuleVerificationUtil.isCompassAvailable()) {
            mCompass = ((DJIAircraft) DJISampleApplication.getProductInstance())
                    .getFlightController().getCompass();

            mCompass.startCompassCalibration(new DJICommonCallbacks.DJICompletionCallback() {
                @Override
                public void onResult(DJIError djiError) {

                }
            });
        }
    }

    @Override
    protected int getMiddleBtnTextResourceId() {
        return R.string.compass_calibration_start_calibration;
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
    protected void getLeftBtnMethod() {
    }
}
