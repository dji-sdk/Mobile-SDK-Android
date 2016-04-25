package com.dji.sdk.sample.camera;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.common.BaseThreeBtnView;
import com.dji.sdk.sample.common.DJISampleApplication;
import com.dji.sdk.sample.common.Utils;
import com.dji.sdk.sample.utils.DJIModuleVerificationUtil;

import java.io.File;

import dji.sdk.Camera.DJICamera;
import dji.sdk.Camera.DJICameraSettingsDef;
import dji.sdk.Camera.DJIPlaybackManager;
import dji.sdk.base.DJIBaseComponent;
import dji.sdk.base.DJIError;

/**
 * Created by dji on 16/1/6.
 */
public class PlaybackDownloadView extends BaseThreeBtnView {

    private DJICamera mCamera;
    private DJIPlaybackManager mPlaybackManager;
    public Handler messageHandler;

    public PlaybackDownloadView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Looper looper=Looper.myLooper();
        messageHandler = new MessageHandler(looper);
    }

    /**
     * Before the playback commands are sent to the aircraft, the camera work mode should be set
     * to playback mode.
     */
    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        if (DJIModuleVerificationUtil.isCameraModuleAvailable()) {
            mCamera = DJISampleApplication.getAircraftInstance().getCamera();

            mCamera.setCameraMode(
                    DJICameraSettingsDef.CameraMode.Playback,
                    new DJIBaseComponent.DJICompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {

                        }
                    }
            );
            if (DJIModuleVerificationUtil.isPlaybackAvailable()) {
                mPlaybackManager = mCamera.getPlayback();

                mPlaybackManager.setDJICameraPlayBackStateCallBack(
                        new DJIPlaybackManager.DJICameraPlayBackStateCallBack() {
                    @Override
                    public void onResult(DJIPlaybackManager.DJICameraPlaybackState
                                                 djiCameraPlaybackState) {
                        if (djiCameraPlaybackState.playbackMode.equals(
                                DJICameraSettingsDef.CameraPlaybackMode.SinglePhotoPlayback))
                            mPlaybackManager.enterMultiplePreviewMode();

                        if (djiCameraPlaybackState.playbackMode.equals(
                                DJICameraSettingsDef.CameraPlaybackMode.MultipleMediaFilesDisplay))
                            mPlaybackManager.enterMultipleEditMode();
                    }
                });
            } else {
                Utils.setResultToToast(getContext(), "Not support");
            }
        }
    }

    @Override
    protected int getMiddleBtnTextResourceId() {
        return R.string.playback_download_select_0;
    }

    @Override
    protected int getLeftBtnTextResourceId() {
        return R.string.playback_download_select_1;
    }

    @Override
    protected int getRightBtnTextResourceId() {
        return R.string.playback_download_download;
    }

    @Override
    protected int getInfoResourceId() {
        if(!DJIModuleVerificationUtil.isPlaybackAvailable()){
            return R.string.not_support_playback;
        }else {
            return R.string.support_playback;
        }

    }

    @Override
    protected void getMiddleBtnMethod() {
        if (DJIModuleVerificationUtil.isPlaybackAvailable()) {
            mPlaybackManager = DJISampleApplication.getProductInstance().getCamera().getPlayback();

            mPlaybackManager.toggleFileSelectionAtIndex(0);
        }
    }

    @Override
    protected void getLeftBtnMethod() {
        if (DJIModuleVerificationUtil.isPlaybackAvailable()) {
            mPlaybackManager = DJISampleApplication.getProductInstance().getCamera().getPlayback();

            mPlaybackManager.toggleFileSelectionAtIndex(1);
        }
    }

    @Override
    protected void getRightBtnMethod() {
        // Download Button
        if (DJIModuleVerificationUtil.isPlaybackAvailable()) {
            mPlaybackManager = DJISampleApplication.getProductInstance().getCamera().getPlayback();

            File destDir = new File(Environment.getExternalStorageDirectory().
                    getPath() + "/Dji_Sdk_Test/");
            mPlaybackManager.downloadSelectedFiles(destDir,
                    new DJIPlaybackManager.CameraFileDownloadCallback() {

                        @Override
                        public void onStart() {
                            Message message = Message.obtain();
                            message.obj = "Start";
                            messageHandler.sendMessage(message);
                        }

                        @Override
                        public void onEnd() {

                        }

                        @Override
                        public void onError(Exception e) {

                            Message message = Message.obtain();
                            message.obj = e.toString();
                            messageHandler.sendMessage(message);

                        }

                        @Override
                        public void onProgressUpdate(int i) {

                            Message message = Message.obtain();
                            message.obj = "Progress: "+i;
                            messageHandler.sendMessage(message);

                        }
                    });
        }
    }

    class MessageHandler extends Handler {
        public MessageHandler(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message msg) {
            mTexInfo.setText((String)msg.obj);
        }
    }


}