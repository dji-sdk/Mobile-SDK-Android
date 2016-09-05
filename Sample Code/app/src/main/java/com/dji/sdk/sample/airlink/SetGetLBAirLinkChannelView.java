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

import dji.common.airlink.LBAirLinkChannelSelectionMode;
import dji.common.error.DJIError;
import dji.common.util.DJICommonCallbacks;
import dji.sdk.airlink.DJILBAirLink;
import dji.sdk.base.DJIBaseComponent;

/**
 * Class for setting and getting channel in Lightbridge.
 */
public class SetGetLBAirLinkChannelView extends BaseSetGetView {
    public SetGetLBAirLinkChannelView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        if (DJIModuleVerificationUtil.isLBAirlinkAvailable()) {
            DJISampleApplication.getProductInstance().getAirLink().
                    getLBAirLink().setChannelSelectionMode(
                    LBAirLinkChannelSelectionMode.Manual,
                    new DJICommonCallbacks.DJICompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {

                        }
                    }
            );
        } else {
            Utils.setResultToToast(getContext(), "Did not support.");
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (DJIModuleVerificationUtil.isLBAirlinkAvailable()) {
            DJISampleApplication.getProductInstance().getAirLink().
                    getLBAirLink().setChannelSelectionMode(
                    LBAirLinkChannelSelectionMode.Auto,
                    new DJICommonCallbacks.DJICompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {
                            Utils.showDialogBasedOnError(getContext(), djiError);
                        }
                    }
            );
        }
    }

    @Override
    protected void setMethod() {
        if (DJIModuleVerificationUtil.isLBAirlinkAvailable()) {
            DJISampleApplication.getProductInstance().getAirLink().getLBAirLink().setChannel(
                    mSpinnerSet.getSelectedItemPosition(),
                    new DJICommonCallbacks.DJICompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {

                        }
                    }
            );
        }
    }

    @Override
    protected void getMethod() {
        if (DJIModuleVerificationUtil.isLBAirlinkAvailable()) {
            DJISampleApplication.getProductInstance().getAirLink().getLBAirLink().getChannel(
                    new DJICommonCallbacks.DJICompletionCallbackWith<Integer>() {
                        @Override
                        public void onSuccess(Integer integer) {
                            mGetTextString = integer.toString();

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
        return R.string.set_get_lb_airlink_channel_description;
    }

    @Override
    protected ArrayAdapter getArrayAdapter() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < 7; i++) {
            array.add(new Integer(i));
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.getContext(), R.layout.simple_list_item, array);
        return arrayAdapter;
    }
}
