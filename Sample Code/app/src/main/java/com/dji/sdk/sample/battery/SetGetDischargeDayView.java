package com.dji.sdk.sample.battery;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.common.BaseSetGetView;
import com.dji.sdk.sample.common.DJISampleApplication;

import java.util.ArrayList;

import dji.sdk.base.DJIBaseComponent;
import dji.sdk.base.DJIError;

/**
 * Class for setting and getting dischage day in battery.
 */
public class SetGetDischargeDayView extends BaseSetGetView {

    private static final int SHOW_GET_RESULT = 0;
    private Handler mHandler = new Handler(new Handler.Callback() {

        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case SHOW_GET_RESULT :
                    mTextViewGet.setText((String)msg.obj);
                    break;

                default :
                    break;
            }
            return false;
        }
    });

    public SetGetDischargeDayView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void setMethod() {
        try {
            DJISampleApplication.getProductInstance().getBattery().setSelfDischargeDay(
                    (short) mSpinnerSet.getSelectedItemPosition(),
                    null
            );
        } catch (Exception exception) {

        }
    }

    @Override
    protected void getMethod() {
        try {
            DJISampleApplication.getProductInstance().getBattery().getSelfDischargeDay(
                    new DJIBaseComponent.DJICompletionCallbackWith<Short>() {
                        @Override
                        public void onSuccess(Short aShort) {
                            mHandler.sendMessage(mHandler.obtainMessage(SHOW_GET_RESULT, aShort.toString()));
                        }

                        @Override
                        public void onFailure(DJIError djiError) {

                        }
                    }
            );
        } catch (Exception exception) {

        }
    }

    @Override
    protected int getInfo() {
        return R.string.app_name;
    }

    @Override
    protected ArrayAdapter getArrayAdapter() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            array.add(new Integer(i));
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.getContext(), R.layout.simple_list_item, array);
        return arrayAdapter;
    }
}
