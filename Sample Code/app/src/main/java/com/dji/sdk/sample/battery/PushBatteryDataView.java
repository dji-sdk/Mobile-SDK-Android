package com.dji.sdk.sample.battery;

import android.content.Context;
import android.util.AttributeSet;

import com.dji.sdk.sample.common.BasePushDataView;
import com.dji.sdk.sample.common.DJISampleApplication;

import dji.common.battery.DJIBatteryState;
import dji.sdk.battery.DJIBattery;


/**
 * Class for getting the battery information.
 */
public class PushBatteryDataView extends BasePushDataView {
    public PushBatteryDataView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected String getOSDTextResourceString() {
        return "Test";
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        try {
            DJISampleApplication.getProductInstance().getBatteries().get(0).setBatteryStateUpdateCallback(
                    new DJIBattery.DJIBatteryStateUpdateCallback() {
                        @Override
                        public void onResult(DJIBatteryState djiBatteryState) {
                            mStringBuffer.delete(0, mStringBuffer.length());

                            mStringBuffer.append("BatteryEnergyRemainingPercent: ").
                                    append(djiBatteryState.getBatteryEnergyRemainingPercent()).
                                    append("%\n");
                            mStringBuffer.append("CurrentVoltage: ").
                                    append(djiBatteryState.getCurrentVoltage()).append("mV\n");
                            mStringBuffer.append("CurrentCurrent: ").
                                    append(djiBatteryState.getCurrentCurrent()).append("mA\n");

                            mHandler.sendEmptyMessage(CHANGE_TEXT_VIEW);
                        }
                    }
            );
        } catch (Exception exception) {

        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();

        try {
            DJISampleApplication.getProductInstance().getBattery()
                    .setBatteryStateUpdateCallback(null);
        } catch (Exception exception) {

        }
    }
}
