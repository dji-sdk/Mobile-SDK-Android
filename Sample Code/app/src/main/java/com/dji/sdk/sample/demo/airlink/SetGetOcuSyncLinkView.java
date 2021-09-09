package com.dji.sdk.sample.demo.airlink;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.CallbackHandlers;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.BaseSetGetView;

import java.util.ArrayList;

import dji.common.airlink.ChannelSelectionMode;
import dji.common.error.DJIError;
import dji.common.util.CommonCallbacks;

public class SetGetOcuSyncLinkView extends BaseSetGetView {

    public SetGetOcuSyncLinkView(Context context) {
    super(context);
}
    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ModuleVerificationUtil.isOcuSyncLinkAvailable()) {
            DJISampleApplication.getProductInstance()
                    .getAirLink()
                    .getOcuSyncLink()
                    .setChannelSelectionMode(ChannelSelectionMode.MANUAL, new CallbackHandlers.CallbackToastHandler());
        } else {
            ToastUtils.setResultToToast("Did not support.");
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (ModuleVerificationUtil.isOcuSyncLinkAvailable()) {
            DJISampleApplication.getProductInstance()
                    .getAirLink()
                    .getOcuSyncLink()
                    .setChannelSelectionMode(ChannelSelectionMode.AUTO, new CallbackHandlers.CallbackToastHandler());
        }
    }

    @Override
    protected void setMethod() {
        if (ModuleVerificationUtil.isOcuSyncLinkAvailable()) {
            DJISampleApplication.getProductInstance()
                    .getAirLink()
                    .getOcuSyncLink()
                    .setChannelNumber(mSpinnerSet.getSelectedItemPosition(),
                            new CallbackHandlers.CallbackToastHandler());
        }
    }

    @Override
    protected void getMethod() {
        if (ModuleVerificationUtil.isOcuSyncLinkAvailable()) {
            DJISampleApplication.getProductInstance()
                    .getAirLink()
                    .getOcuSyncLink()
                    .getChannelNumber(new CommonCallbacks.CompletionCallbackWith<Integer>() {
                        @Override
                        public void onSuccess(Integer integer) {
                            mGetTextString = integer.toString();
                            mHandler.sendEmptyMessage(SET_GET_TEXTVIEW_WITH_RESULT);
                        }

                        @Override
                        public void onFailure(DJIError djiError) {

                        }
                    });
        }
    }

    @Override
    protected ArrayAdapter getArrayAdapter() {
        ArrayList<Integer> array = new ArrayList<>();
        if (ModuleVerificationUtil.isOcuSyncLinkAvailable()) {
            DJISampleApplication.getAircraftInstance()
                    .getAirLink()
                    .getOcuSyncLink()
                    .getChannelNumberValidRange(new CommonCallbacks.CompletionCallbackWith<Integer[]>() {
                @Override
                public void onSuccess(Integer[] integers) {
                    if (integers.length != 0) {
                        for(int i = 0; i < integers.length; i++) {
                            array.add(integers[i]);
                        }
                    }
                }

                @Override
                public void onFailure(DJIError djiError) {

                }
            });
        }
        return new ArrayAdapter(this.getContext(), R.layout.simple_list_item, array);
    }

    @Override
    public int getDescription() {
        return R.string.set_get_ocusync_airlink_channel_description;
    }
}
