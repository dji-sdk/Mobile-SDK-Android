package com.dji.sdk.sample.demo.remotecontroller;

import android.content.Context;

import androidx.annotation.NonNull;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import com.dji.sdk.sample.internal.view.BasePushDataView;

import dji.common.remotecontroller.HardwareState;
import dji.sdk.products.Aircraft;
import dji.sdk.remotecontroller.RemoteController;

/**
 * Class for getting remote controller information.
 */
public class PushRemoteControllerDataView extends BasePushDataView {

    private RemoteController remoteController;

    public PushRemoteControllerDataView(Context context) {
        super(context);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        if (ModuleVerificationUtil.isRemoteControllerAvailable()) {
            remoteController = ((Aircraft) DJISampleApplication.getProductInstance()).getRemoteController();

            remoteController.setHardwareStateCallback(new HardwareState.HardwareStateCallback() {
                @Override
                public void onUpdate(@NonNull HardwareState rcHardwareState) {
                    stringBuffer.delete(0, stringBuffer.length());

                    stringBuffer.append("FlightModeSwitch: ").
                        append(rcHardwareState.getFlightModeSwitch().name()).append("\n");
                    stringBuffer.append("OnClickGoHomeBtn: ").
                        append(rcHardwareState.getGoHomeButton().isClicked()).append("\n");
                    stringBuffer.append("RightHorizontalChanged: ")
                                .append(rcHardwareState.getRightStick().getHorizontalPosition())
                                .append("\n");

                    showStringBufferResult();
                }
            });
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (ModuleVerificationUtil.isRemoteControllerAvailable()) {
            remoteController = ((Aircraft) DJISampleApplication.getProductInstance()).getRemoteController();

            remoteController.setHardwareStateCallback(null);
        }
    }

    @Override
    public int getDescription() {
        return R.string.remote_controller_listview_push_info;
    }
}
