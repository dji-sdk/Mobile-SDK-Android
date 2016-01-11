package com.dji.sdk.sample.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.common.BaseThreeBtnView;
import com.dji.sdk.sample.common.DJISampleApplication;
import com.dji.sdk.sample.common.Utils;
import com.dji.sdk.sample.utils.DJIModuleVerificationUtil;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import dji.sdk.Camera.DJICameraSettingsDef;
import dji.sdk.base.DJIBaseComponent;
import dji.sdk.base.DJIError;

/**
 * Created by dji on 16/1/6.
 */
public class RecordVideoView extends BaseThreeBtnView {

    Timer timer = new Timer();
    private final Context context;
    private long timeCounter = 0;
    String time = "";
    public RecordVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        mBtn2.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        if (DJIModuleVerificationUtil.isCameraModuleValid()) {
            DJISampleApplication.getProductInstance().getCamera().setCameraMode(
                    DJICameraSettingsDef.CameraMode.RecordVideo,
                    new DJIBaseComponent.DJICompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {

                        }
                    }
            );
        }
    }

    protected void onDetachedToWindow() {
        super.onDetachedFromWindow();

        if (DJIModuleVerificationUtil.isCameraModuleValid()) {
            DJISampleApplication.getProductInstance().getCamera().setCameraMode(
                    DJICameraSettingsDef.CameraMode.ShootPhoto,
                    new DJIBaseComponent.DJICompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {

                        }
                    }
            );
        }
    }

    @Override
    protected int getBtn1TextResourceId() {
        return R.string.record_video_start_record;
    }

    @Override
    protected int getBtn3TextResourceId() {
        return R.string.record_video_stop_record;
    }

    @Override
    protected int getInfoResourceId() {
        return R.string.record_video_initial_time;
    }

    @Override
    protected void getBtn1Method() {
        Utils.setResultToText(context, mTexInfo, "00:00:00");
        if (DJIModuleVerificationUtil.isCameraModuleValid()) {
            DJISampleApplication.getProductInstance().getCamera().startRecordVideo(
                    new DJIBaseComponent.DJICompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {
                            //success so, start recording
                            if (null == djiError) {
                                timer = new Timer();
                                timer.schedule(new TimerTask() {
                                    @Override
                                    public void run() {
                                        timeCounter = timeCounter + 1;
                                        time = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(timeCounter),
                                                TimeUnit.MILLISECONDS.toMinutes(timeCounter),
                                                TimeUnit.MILLISECONDS.toSeconds(timeCounter));
                                        Utils.setResultToText(context, mTexInfo, time);
                                    }
                                }, 0, 1);
                            }

                        }
                    }
            );
        }
    }

    @Override
    protected void getBtn3Method() {
        if (DJIModuleVerificationUtil.isCameraModuleValid()) {
            DJISampleApplication.getProductInstance().getCamera().stopRecordVideo(
                    new DJIBaseComponent.DJICompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {
                            timer.cancel();
                            timeCounter = 0;
                        }
                    }
            );
        }
    }

    @Override
    protected int getBtn2TextResourceId() {
        return R.string.record_video_stop_record;
    }

    @Override
    protected void getBtn2Method() {

    }
}
