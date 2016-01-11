package com.dji.sdk.sample.gimbal;

import android.content.Context;
import android.util.AttributeSet;

import com.dji.sdk.sample.common.BasePushDataView;
import com.dji.sdk.sample.common.DJISampleApplication;
import com.dji.sdk.sample.utils.DJIModuleVerificationUtil;

import dji.sdk.Gimbal.DJIGimbal;

/**
 * Class for getting gimbal information.
 */
public class PushGimbalDataView extends BasePushDataView {
    public PushGimbalDataView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected String getOSDTextResourceString() {
        return "Gimbal test";
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        if (DJIModuleVerificationUtil.isGimbalModuleValid()) {
            DJISampleApplication.getProductInstance().getGimbal().setGimbalStateUpdateCallback(
                    new DJIGimbal.GimbalStateUpdateCallback() {
                        @Override
                        public void onGimbalStateUpdate(DJIGimbal djiGimbal,
                                                        DJIGimbal.DJIGimbalState djiGimbalState) {
                            mStringBuffer.delete(0, mStringBuffer.length());

                            mStringBuffer.append("PitchInDegrees: ").
                                append(djiGimbalState.getAttitudeInDegrees().pitch).append("\n");
                            mStringBuffer.append("RollInDegrees: ").
                                append(djiGimbalState.getAttitudeInDegrees().roll).append("\n");
                            mStringBuffer.append("YawInDegrees: ").
                                append(djiGimbalState.getAttitudeInDegrees().yaw).append("\n");

                            mHandler.sendEmptyMessage(CHANGE_TEXT_VIEW);
                        }
                    }
            );
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();

        if (DJIModuleVerificationUtil.isGimbalModuleValid()) {
            DJISampleApplication.getProductInstance().getGimbal().setGimbalStateUpdateCallback(null);
        }
    }
}
