package com.dji.sdk.sample.demo.camera;

import android.app.Service;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.PresentableView;

import dji.common.camera.SettingsDefinitions;
import dji.common.error.DJIError;
import dji.common.util.CommonCallbacks;
import dji.sdk.camera.Camera;
import dji.sdk.camera.PlaybackManager;

/**
 * Class for downloading media files in playback mode.
 */
public class PlaybackCommandsView extends RelativeLayout implements View.OnClickListener, PresentableView {

    private Button btnPrevious;
    private Button btnNext;
    private Button btnMultiple;
    private Button btnSingle;

    private Camera camera;

    private boolean isSinglePreview = true;

    public PlaybackCommandsView(Context context) {
        super(context);
        initUI(context);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ModuleVerificationUtil.isPlaybackAvailable()) {

            camera = DJISampleApplication.getAircraftInstance().getCamera();

            camera.setMode(SettingsDefinitions.CameraMode.PLAYBACK, new CommonCallbacks.CompletionCallback() {
                @Override
                public void onResult(DJIError djiError) {

                }
            });

            DJISampleApplication.getProductInstance().
                    getCamera().getPlaybackManager().setPlaybackStateCallback(new PlaybackManager.PlaybackState.CallBack() {
                @Override
                public void onUpdate(PlaybackManager.PlaybackState playbackState) {
                    if (playbackState.getPlaybackMode().equals(SettingsDefinitions.
                            PlaybackMode.MULTIPLE_MEDIA_FILE_PREVIEW) ||
                            playbackState.getPlaybackMode().equals(SettingsDefinitions.
                                    PlaybackMode.MEDIA_FILE_DOWNLOAD) ||
                            playbackState.getPlaybackMode().equals(SettingsDefinitions.
                                    PlaybackMode.MULTIPLE_FILES_EDIT)) {
                        isSinglePreview = false;
                    } else {
                        isSinglePreview = true;
                    }
                }
            });

            DJISampleApplication.getProductInstance()
                    .getCamera()
                    .setMode(SettingsDefinitions.CameraMode.PLAYBACK,
                            new CommonCallbacks.CompletionCallback() {
                                @Override
                                public void onResult(DJIError djiError) {

                                }
                            });
        } else {
            ToastUtils.setResultToToast("Not support");
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

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }

    private void initUI(Context context) {
        setClickable(true);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);

        layoutInflater.inflate(R.layout.view_playback_commands, this, true);

        btnPrevious = (Button) findViewById(R.id.btn_previous);
        btnNext = (Button) findViewById(R.id.btn_next);
        btnMultiple = (Button) findViewById(R.id.btn_multiple);
        btnSingle = (Button) findViewById(R.id.btn_single);

        btnMultiple.setOnClickListener(this);
        btnNext.setOnClickListener(this);
        btnPrevious.setOnClickListener(this);
        btnSingle.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (!ModuleVerificationUtil.isPlaybackAvailable()) {
            return;
        }
        switch (v.getId()) {
            case R.id.btn_previous:
                if (isSinglePreview) {
                    DJISampleApplication.getProductInstance().getCamera().
                            getPlaybackManager().proceedToPreviousSinglePreviewPage();
                } else {
                    DJISampleApplication.getProductInstance().getCamera().
                            getPlaybackManager().enterMultiplePreviewMode();
                }
                break;

            case R.id.btn_next:
                if (isSinglePreview) {
                    DJISampleApplication.getProductInstance().getCamera().
                            getPlaybackManager().proceedToNextSinglePreviewPage();
                } else {
                    DJISampleApplication.getProductInstance().getCamera().
                            getPlaybackManager().proceedToNextMultiplePreviewPage();
                }
                break;

            case R.id.btn_multiple:
                if (isSinglePreview) {
                    DJISampleApplication.getProductInstance().getCamera().
                            getPlaybackManager().enterMultiplePreviewMode();
                }
                break;

            case R.id.btn_single:
                if (!isSinglePreview) {
                    DJISampleApplication.getProductInstance().
                            getCamera().getPlaybackManager().enterSinglePreviewModeWithIndex(0);
                }
                break;

            default:
                break;
        }
    }

    @Override
    public int getDescription() {
        return R.string.camera_listview_playback_command;
    }
}
