package com.dji.sdk.sample.airlink;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.common.BaseSetGetView;
import com.dji.sdk.sample.common.DJISampleApplication;
import com.dji.sdk.sample.common.Utils;
import com.dji.sdk.sample.utils.DJIModuleVerificationUtil;

import java.util.ArrayList;

import dji.sdk.base.DJIBaseComponent;
import dji.sdk.base.DJIError;

/**
 * Class for setting and getting SSID in WiFi airlink.
 */
public class SetGetWiFiAirlinkSSIDView extends BaseSetGetView {

    private static final String SSID_NAME1 = "Happy";
    private static final String SSID_NAME2 = "Super";

    private ArrayList<String> mSSIDName;

    public SetGetWiFiAirlinkSSIDView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!DJIModuleVerificationUtil.isWiFiAirlinkAvailable())
            Utils.setResultToToast(getContext(), "Not Support");
    }

    @Override
    protected void setMethod() {
        if (DJIModuleVerificationUtil.isWiFiAirlinkAvailable()) {
            DJISampleApplication.getProductInstance().getAirLink().getWiFiLink().setWiFiSSID(
                    mSSIDName.get(mSpinnerSet.getSelectedItemPosition()),
                    new DJIBaseComponent.DJICompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {
                            Utils.showDialogBasedOnError(getContext(), djiError);
                        }
                    }
            );
        }
    }

    @Override
    protected void getMethod() {
        if (DJIModuleVerificationUtil.isWiFiAirlinkAvailable()) {
            DJISampleApplication.getProductInstance().getAirLink().getWiFiLink().getWiFiSSID(
                    new DJIBaseComponent.DJICompletionCallbackWith<String>() {
                        @Override
                        public void onSuccess(String s) {
                            mGetTextString = s;

                            mHandler.sendEmptyMessage(SET_GET_TEXTVIEW_WITH_RESULT);
                        }

                        @Override
                        public void onFailure(DJIError djiError) {

                        }
                    }
            );
        }
    }

    @Override
    protected int getInfo() {
        return R.string.set_get_wifi_airlink_ssid_description;
    }

    @Override
    protected ArrayAdapter getArrayAdapter() {
        if (null == mSSIDName)
            mSSIDName = new ArrayList<String>();
        mSSIDName.add(SSID_NAME1);
        mSSIDName.add(SSID_NAME2);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.getContext(),
                R.layout.simple_list_item, mSSIDName);
        return arrayAdapter;
    }
}
