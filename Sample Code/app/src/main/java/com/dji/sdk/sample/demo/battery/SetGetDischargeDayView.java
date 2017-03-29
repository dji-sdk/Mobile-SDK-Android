package com.dji.sdk.sample.demo.battery;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.widget.ArrayAdapter;
import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.DialogUtils;
import com.dji.sdk.sample.internal.view.BaseSetGetView;
import dji.common.error.DJIError;
import dji.common.util.CommonCallbacks;
import java.util.ArrayList;

/**
 * Class for setting and getting dischage day in battery.
 */
public class SetGetDischargeDayView extends BaseSetGetView {

    private static final int SHOW_GET_RESULT = 0;
    private Handler mHandler = new Handler(new Handler.Callback() {

        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case SHOW_GET_RESULT:
                    mTextViewGet.setText((String) msg.obj);
                    break;

                default:
                    break;
            }
            return false;
        }
    });

    public SetGetDischargeDayView(Context context) {
        super(context);
    }

    @Override
    protected void setMethod() {
        try {
            DJISampleApplication.getProductInstance()
                                .getBattery()
                                .setSelfDischargeInDays((short) (mSpinnerSet.getSelectedItemPosition() + 1),
                                                        new CommonCallbacks.CompletionCallback() {
                                                            @Override
                                                            public void onResult(DJIError djiError) {
                                                                DialogUtils.showDialogBasedOnError(getContext(), djiError);
                                                            }
                                                        });
        } catch (Exception ignored) {

        }
    }

    @Override
    protected void getMethod() {
        try {
            DJISampleApplication.getProductInstance()
                                .getBattery()
                                .getSelfDischargeInDays(new CommonCallbacks.CompletionCallbackWith<Integer>() {
                                    @Override
                                    public void onSuccess(Integer aShort) {
                                        mHandler.sendMessage(mHandler.obtainMessage(SHOW_GET_RESULT,
                                                                                    aShort.toString()));
                                    }

                                    @Override
                                    public void onFailure(DJIError djiError) {

                                    }
                                });
        } catch (Exception ignored) {

        }
    }

    @Override
    protected ArrayAdapter getArrayAdapter() {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            array.add(i);
        }
        return new ArrayAdapter(this.getContext(), R.layout.simple_list_item, array);
    }

    @Override
    public int getDescription() {
        return R.string.battery_listview_set_get_discharge_day;
    }
}
