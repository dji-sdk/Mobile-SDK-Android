package com.dji.sdk.sample.demo.camera;

import android.content.Context;
import android.os.Environment;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.BaseThreeBtnView;

import java.io.File;

import dji.common.camera.SettingsDefinitions;
import dji.common.error.DJIError;
import dji.common.util.CommonCallbacks;
import dji.sdk.camera.Camera;
import dji.sdk.camera.PlaybackManager;

/**
 * Created by dji on 16/1/6.
 */
public class PlaybackDownloadView extends BaseThreeBtnView {

    private PlaybackManager playbackManager;

    public PlaybackDownloadView(Context context) {
        super(context);
    }

    /**
     * Before the playback commands are sent to the aircraft, the camera work mode should be set
     * to playback mode.
     */
    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ModuleVerificationUtil.isCameraModuleAvailable()) {
            Camera camera = DJISampleApplication.getAircraftInstance().getCamera();

            camera.setMode(SettingsDefinitions.CameraMode.PLAYBACK, new CommonCallbacks.CompletionCallback() {
                @Override
                public void onResult(DJIError djiError) {

                }
            });
            if (ModuleVerificationUtil.isPlaybackAvailable()) {
                playbackManager = camera.getPlaybackManager();

                playbackManager.setPlaybackStateCallback(new PlaybackManager.PlaybackState.CallBack() {
                    @Override
                    public void onUpdate(PlaybackManager.PlaybackState djiCameraPlaybackState) {
                        if (djiCameraPlaybackState.getPlaybackMode()
                                .equals(SettingsDefinitions.PlaybackMode.SINGLE_PHOTO_PREVIEW)) {
                            playbackManager.enterMultiplePreviewMode();
                        }

                        if (djiCameraPlaybackState.getPlaybackMode()
                                .equals(SettingsDefinitions.PlaybackMode.MULTIPLE_MEDIA_FILE_PREVIEW)) {
                            playbackManager.enterMultipleEditMode();
                        }
                    }
                });
            } else {
                ToastUtils.setResultToToast("Not support");
            }
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        if (ModuleVerificationUtil.isCameraModuleAvailable()) {
            DJISampleApplication.getProductInstance()
                    .getCamera()
                    .setMode(SettingsDefinitions.CameraMode.SHOOT_PHOTO,
                            new CommonCallbacks.CompletionCallback() {
                                @Override
                                public void onResult(DJIError djiError) {

                                }
                            });

            if (ModuleVerificationUtil.isPlaybackAvailable()) {
                DJISampleApplication.getProductInstance().
                        getCamera().getPlaybackManager().setPlaybackStateCallback(null);
            }
        }
        super.onDetachedFromWindow();
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
    protected int getDescriptionResourceId() {
        if (!ModuleVerificationUtil.isPlaybackAvailable()) {
            return R.string.not_support_playback;
        } else {
            return R.string.support_playback;
        }
    }

    @Override
    protected void handleMiddleBtnClick() {
        if (ModuleVerificationUtil.isPlaybackAvailable()) {
            playbackManager = DJISampleApplication.getProductInstance().getCamera().getPlaybackManager();

            playbackManager.toggleFileSelectionAtIndex(0);
        }
    }

    @Override
    protected void handleLeftBtnClick() {
        if (ModuleVerificationUtil.isPlaybackAvailable()) {
            playbackManager = DJISampleApplication.getProductInstance().getCamera().getPlaybackManager();

            playbackManager.toggleFileSelectionAtIndex(1);
        }
    }

    @Override
    protected void handleRightBtnClick() {
        // Download Button
        if (ModuleVerificationUtil.isPlaybackAvailable()) {
            playbackManager = DJISampleApplication.getProductInstance().getCamera().getPlaybackManager();

            File destDir = new File(Environment.getExternalStorageDirectory().
                    getPath() + "/Dji_Sdk_Test/");
            playbackManager.downloadSelectedFiles(destDir, new PlaybackManager.FileDownloadCallback() {

                @Override
                public void onStart() {
                    changeDescription("Start");
                }

                @Override
                public void onEnd() {

                }

                @Override
                public void onError(Exception e) {
                    changeDescription(e.toString());
                }

                @Override
                public void onProgressUpdate(int progress) {
                    changeDescription("Progress: " + progress);
                }
            });
        }
    }

    @Override
    public int getDescription() {
        return R.string.camera_listview_playback_download;
    }
}