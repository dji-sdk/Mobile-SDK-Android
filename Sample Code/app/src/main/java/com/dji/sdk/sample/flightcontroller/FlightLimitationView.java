package com.dji.sdk.sample.flightcontroller;

import android.content.Context;
import android.util.AttributeSet;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.common.BaseThreeBtnView;
import com.dji.sdk.sample.common.DJISampleApplication;
import com.dji.sdk.sample.common.Utils;
import com.dji.sdk.sample.utils.DJIModuleVerificationUtil;

import dji.sdk.base.DJIBaseComponent;
import dji.sdk.base.DJIError;

/**
 * Class for flight limitation.
 */
public class FlightLimitationView extends BaseThreeBtnView {
    private boolean mRadiusLimitaionToggleFlag = true;

    public FlightLimitationView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected int getMiddleBtnTextResourceId() {
        return R.string.flight_limitation_set_height_limitation;
    }

    @Override
    protected int getLeftBtnTextResourceId() {
        return R.string.flight_limitation_toggle_enable_radius_limitation;
    }

    @Override
    protected int getRightBtnTextResourceId() {
        return R.string.flight_limitation_set_radius_limitation;
    }

    @Override
    protected int getInfoResourceId() {
        return R.string.flight_limitation_description;
    }

    @Override
    protected void getMiddleBtnMethod() {
        if (DJIModuleVerificationUtil.isFlightLimitationAvailable()) {
            DJISampleApplication.getAircraftInstance().getFlightController().
                getFlightLimitation().setMaxFlightHeight(50,
                    new DJIBaseComponent.DJICompletionCallback() {
                @Override
                public void onResult(DJIError djiError) {
                    Utils.setResultToToast(
                            getContext(),
                            "Result: " + (djiError == null ?
                                    "Success" : djiError.getDescription()));
                }
            });
        }
    }

    @Override
    protected void getLeftBtnMethod() {
        if (DJIModuleVerificationUtil.isFlightLimitationAvailable()) {
            DJISampleApplication.getAircraftInstance().getFlightController()
                .getFlightLimitation().
                    setMaxFlightRadiusLimitationEnabled(mRadiusLimitaionToggleFlag,
                         new DJIBaseComponent.DJICompletionCallback() {
                            @Override
                            public void onResult(DJIError djiError) {
                                Utils.showDialogBasedOnError(getContext(), djiError);
                                mRadiusLimitaionToggleFlag = mRadiusLimitaionToggleFlag ^ true;
                            }
                    });

        }
    }

    @Override
    protected void getRightBtnMethod() {
        if (DJIModuleVerificationUtil.isFlightLimitationAvailable()) {
            DJISampleApplication.getAircraftInstance().getFlightController().
                    getFlightLimitation().setMaxFlightRadius(40,
                        new DJIBaseComponent.DJICompletionCallback() {
                @Override
                public void onResult(DJIError djiError) {
                    Utils.setResultToToast(
                            getContext(),
                            "Result: " + (djiError == null ?
                                    "Success" : djiError.getDescription()));
                }
            });
        }
    }
}
