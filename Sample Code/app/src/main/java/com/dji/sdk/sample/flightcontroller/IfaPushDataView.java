package com.dji.sdk.sample.flightcontroller;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.common.BaseThreeBtnView;
import com.dji.sdk.sample.common.DJISampleApplication;
import com.dji.sdk.sample.utils.DJIModuleVerificationUtil;

import java.util.List;

import dji.sdk.FlightController.DJIFlightController;
import dji.sdk.FlightController.DJIIntelligentFlightAssistant;
import dji.sdk.Products.DJIAircraft;


/**
 * Class that retrieves the push data for Intelligent Flight Assistant
 */
public class IfaPushDataView extends BaseThreeBtnView {

    private static final int SET_CHANGE_STATUS = 0;

    private DJIFlightController flightController;
    private DJIIntelligentFlightAssistant intelligentFlightAssistant;

    private StringBuffer mStringBuffer;
    private Handler mHandler = new Handler(new Handler.Callback() {

        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case SET_CHANGE_STATUS:
                    mTexInfo.setText(mStringBuffer.toString());
                    break;

                default:
                    break;
            }
            return false;
        }
    });

    public IfaPushDataView(Context context, AttributeSet attrs) {
        super(context, attrs);

        mBtn1.setVisibility(View.INVISIBLE);
        mBtn2.setVisibility(View.INVISIBLE);
        mBtn3.setVisibility(View.INVISIBLE);

        mStringBuffer = new StringBuffer();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        if (DJIModuleVerificationUtil.isFlightControllerAvailable()) {

            flightController = ((DJIAircraft) DJISampleApplication.getProductInstance())
                    .getFlightController();

            intelligentFlightAssistant = flightController.getIntelligentFlightAssistant();

            if (intelligentFlightAssistant != null) {

                intelligentFlightAssistant.setVisionDetectionStateUpdatedCallback(
                    new DJIIntelligentFlightAssistant.VisionDetectionStateUpdatedCallback() {
                        @Override
                        public void onStateUpdated(DJIIntelligentFlightAssistant.DJIVisionDetectionState djiVisionDetectionState) {
                            if (null != djiVisionDetectionState) {
                                mStringBuffer.delete(0, mStringBuffer.length());

                                List<DJIIntelligentFlightAssistant.DJIVisionDetectionSector> visionDetectionSectorList =
                                    djiVisionDetectionState.getDetectionSectors();

                                for (DJIIntelligentFlightAssistant.DJIVisionDetectionSector visionDetectionSector
                                        : visionDetectionSectorList) {

                                    visionDetectionSector.getObstacleDistanceInMeters();
                                    visionDetectionSector.getWarningLevel();

                                    mStringBuffer.append("Obstacle distance: ")
                                            .append(visionDetectionSector.getObstacleDistanceInMeters()).append("\n");
                                    mStringBuffer.append("Distance warning: ")
                                            .append(visionDetectionSector.getWarningLevel()).append("\n");
                                }

                                mStringBuffer.append("WarningLevel: ").append(djiVisionDetectionState.getWarningLevel().toString()).append("\n");
                                mStringBuffer.append("Braking state: ").append(djiVisionDetectionState.isBraking()).append("\n");
                                mStringBuffer.append("Sensor state: ").append(djiVisionDetectionState.isSensorWorking()).append("\n");

                                mHandler.sendEmptyMessage(SET_CHANGE_STATUS);
                            }
                        }
                    });
            }

        } else {
            Log.i("$$$$$$$$$$$$$$$$$$$", "onAttachedToWindow FC NOT Available");
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    protected int getInfoResourceId() {
        return R.string.intelligent_flight_assistant_description;
    }

    @Override
    protected void getBtn3Method() {

    }

    @Override
    protected void getBtn1Method() {

    }

    @Override
    protected int getBtn1TextResourceId() {
        return R.string.compass_calibration_start_calibration;
    }

    @Override
    protected int getBtn3TextResourceId() {
        return R.string.compass_calibration_stop_calibration;
    }

    @Override
    protected int getBtn2TextResourceId() {
        return R.string.compass_calibration_start_calibration;
    }

    @Override
    protected void getBtn2Method() {
    }

}
