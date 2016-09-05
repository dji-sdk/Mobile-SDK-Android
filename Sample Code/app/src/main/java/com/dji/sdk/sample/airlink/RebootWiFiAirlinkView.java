package com.dji.sdk.sample.airlink;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.common.BaseThreeBtnView;
import com.dji.sdk.sample.common.DJISampleApplication;
import com.dji.sdk.sample.common.Utils;
import com.dji.sdk.sample.utils.DJIDialog;
import com.dji.sdk.sample.utils.DJIModuleVerificationUtil;

import dji.common.error.DJIError;
import dji.common.util.DJICommonCallbacks;

/**
 * Class for rebooting the WiFi airlink. If the users set the WiFi airlink with SSID, password and frequency
 * , reboot the WiFi airlink so that it will take effect.
 */
public class RebootWiFiAirlinkView extends BaseThreeBtnView {
    public RebootWiFiAirlinkView(Context context, AttributeSet attrs) {
        super(context, attrs);
        middleBtn.setVisibility(View.INVISIBLE);
        rightBtn.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        if (!DJIModuleVerificationUtil.isWiFiAirlinkAvailable()) {
            Utils.setResultToToast(getContext(), "Not Support");
        }
    }

    @Override
    protected int getLeftBtnTextResourceId() {
        return R.string.reboot_wifi_airlink_reboot_wifi;
    }


    @Override
    protected int getInfoResourceId() {
        return R.string.reboot_wifi_airlink_description;
    }

    @Override
    protected void getLeftBtnMethod() {
        // Reboot Button
        DJIDialog.showConfirmationDialog(getContext(), R.string.reboot_wifi_airlink_hint, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (DJIModuleVerificationUtil.isWiFiAirlinkAvailable()) {
                    DJISampleApplication.getProductInstance().getAirLink().getWiFiLink().rebootWiFi(
                            new DJICommonCallbacks.DJICompletionCallback() {
                                @Override
                                public void onResult(DJIError djiError) {
                                    if (djiError == null) {
                                        DJIDialog.showDialog(getContext(),
                                                getResources().getString(R.string.success));
                                    } else {
                                        DJIDialog.showDialog(getContext(),
                                                djiError.getDescription());
                                    }
                                }
                            }
                    );
                }
            }
        });
    }

    @Override
    protected void getRightBtnMethod() {}

    @Override
    protected void getMiddleBtnMethod() {}

    @Override
    protected int getRightBtnTextResourceId() {return R.string.reboot_wifi_airlink_reboot_wifi;}

    @Override
    protected int getMiddleBtnTextResourceId() {return R.string.reboot_wifi_airlink_reboot_wifi;}
}
