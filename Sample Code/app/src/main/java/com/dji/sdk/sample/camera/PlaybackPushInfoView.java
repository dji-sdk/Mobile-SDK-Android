package com.dji.sdk.sample.camera;

import android.content.Context;
import android.util.AttributeSet;

import com.dji.sdk.sample.common.BasePushDataView;
import com.dji.sdk.sample.common.DJISampleApplication;
import com.dji.sdk.sample.common.Utils;
import com.dji.sdk.sample.utils.DJIModuleVerificationUtil;

import dji.sdk.Camera.DJICameraSettingsDef;
import dji.sdk.Camera.DJIPlaybackManager;
import dji.sdk.base.DJIBaseComponent;
import dji.sdk.base.DJIError;

/**
 * Class for getting
 */
public class PlaybackPushInfoView extends BasePushDataView {
    public PlaybackPushInfoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected String getOSDTextResourceString() {
        return "Playback State Information";
    }

    /**
     * Before the playback commands are sent to the aircraft, the camera work mode should be set
     * to playback mode.
     */
    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        setPlaybackStateCallback();
        if (DJIModuleVerificationUtil.isCameraModuleAvailable()) {
            DJISampleApplication.getProductInstance().getCamera().setCameraMode(
                    DJICameraSettingsDef.CameraMode.Playback,
                    new DJIBaseComponent.DJICompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {

                        }
                    }
            );
        }
        if (!DJIModuleVerificationUtil.isPlaybackAvailable()) {
            mStringBuffer.delete(0, mStringBuffer.length());
            mStringBuffer.append("This product does not support Playback function");
            mHandler.sendEmptyMessage(CHANGE_TEXT_VIEW);
            Utils.setResultToToast(getContext(), "Not support");
        }

    }

    // Set back to the default work mode.
    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();

        if (DJIModuleVerificationUtil.isPlaybackAvailable()) {
            DJISampleApplication.getProductInstance().getCamera()
                    .getPlayback().setDJICameraPlayBackStateCallBack(null);

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

    private void setPlaybackStateCallback() {
        if (DJIModuleVerificationUtil.isPlaybackAvailable()) {
            DJISampleApplication.getProductInstance().getCamera()
                    .getPlayback().setDJICameraPlayBackStateCallBack(
                    new DJIPlaybackManager.DJICameraPlayBackStateCallBack() {
                        @Override
                        public void onResult(DJIPlaybackManager.DJICameraPlaybackState djiCameraPlaybackState) {
                            mStringBuffer.delete(0, mStringBuffer.length());

                            mStringBuffer.append("CurrentSelectedFileIndex: ")
                                    .append(djiCameraPlaybackState.currentSelectedFileIndex).append("\n");
                            mStringBuffer.append("MediaFileType: ").append(djiCameraPlaybackState.mediaFileType)
                                    .append("\n");
                            mStringBuffer.append("NumberOfMediaFiles").
                                    append(djiCameraPlaybackState.numberOfMediaFiles).append("\n");
                            mStringBuffer.append("PlaybackMode: ").append(djiCameraPlaybackState.playbackMode)
                                    .append("\n");
                            mStringBuffer.append("NumbersOfSelected: ").append(djiCameraPlaybackState.numberOfSelected)
                                    .append("\n");

                            mHandler.sendEmptyMessage(CHANGE_TEXT_VIEW);
                        }
                    });
        }
    }
}
