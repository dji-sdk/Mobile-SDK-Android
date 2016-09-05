package com.dji.sdk.sample.camera;

import android.app.Service;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.common.DJISampleApplication;
import com.dji.sdk.sample.common.Utils;
import com.dji.sdk.sample.utils.DJIModuleVerificationUtil;

import dji.common.camera.DJICameraSettingsDef;
import dji.common.error.DJIError;
import dji.common.util.DJICommonCallbacks;
import dji.sdk.base.DJIBaseComponent;
import dji.sdk.camera.DJICamera;
import dji.sdk.camera.DJIPlaybackManager;

/**
 * Class for downloading media files in playback mode.
 */
public class PlaybackCommandsView extends RelativeLayout implements View.OnClickListener {

    private Button mBtnPrevious;
    private Button mBtnNext;
    private Button mBtnMultiple;
    private Button mBtnSingle;

    private DJICamera mCamera;

    private boolean isSinglePreview = true;

    public PlaybackCommandsView(Context context, AttributeSet attrs) {
        super(context, attrs);

        initUI(context, attrs);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        if (DJIModuleVerificationUtil.isPlaybackAvailable()) {

            mCamera = DJISampleApplication.getAircraftInstance().getCamera();

            mCamera.setCameraMode(
                    DJICameraSettingsDef.CameraMode.Playback,
                    new DJICommonCallbacks.DJICompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {

                        }
                    }
            );

            DJISampleApplication.getProductInstance().
                    getCamera().getPlayback().setDJICameraPlayBackStateCallBack(
                    new DJIPlaybackManager.DJICameraPlayBackStateCallBack() {
                        @Override
                        public void onResult(DJIPlaybackManager.DJICameraPlaybackState
                                                     djiCameraPlaybackState) {
                            if (djiCameraPlaybackState.playbackMode.equals(DJICameraSettingsDef.
                                    CameraPlaybackMode.MultipleMediaFilesDisplay) ||
                                djiCameraPlaybackState.playbackMode.equals(DJICameraSettingsDef.
                                        CameraPlaybackMode.MediaFilesDownload) ||
                                djiCameraPlaybackState.playbackMode.equals(DJICameraSettingsDef.
                                        CameraPlaybackMode.MultipleMediaFilesDelete)) {
                                isSinglePreview = false;
                            } else {
                                isSinglePreview = true;
                            }
                        }
                    }
            );

            DJISampleApplication.getProductInstance().getCamera().setCameraMode(
                    DJICameraSettingsDef.CameraMode.Playback,
                    new DJICommonCallbacks.DJICompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {

                        }
                    }
            );
        } else {
            Utils.setResultToToast(getContext(), "Not support");
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();

        if (DJIModuleVerificationUtil.isCameraModuleAvailable()) {
            DJISampleApplication.getProductInstance().getCamera().setCameraMode(
                    DJICameraSettingsDef.CameraMode.ShootPhoto,
                    new DJICommonCallbacks.DJICompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {

                        }
                    }
            );

            if (DJIModuleVerificationUtil.isPlaybackAvailable()) {
                DJISampleApplication.getProductInstance().
                        getCamera().getPlayback().setDJICameraPlayBackStateCallBack(null);
            }
        }
    }

    private void initUI(Context context, AttributeSet attrs) {
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Service.LAYOUT_INFLATER_SERVICE);

        View content = layoutInflater.inflate(R.layout.view_playback_commands, null, false);
        addView(content, new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));

        mBtnPrevious = (Button) findViewById(R.id.btn_previous);
        mBtnNext = (Button) findViewById(R.id.btn_next);
        mBtnMultiple = (Button) findViewById(R.id.btn_multiple);
        mBtnSingle = (Button) findViewById(R.id.btn_single);

        mBtnMultiple.setOnClickListener(this);
        mBtnNext.setOnClickListener(this);
        mBtnPrevious.setOnClickListener(this);
        mBtnSingle.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (!DJIModuleVerificationUtil.isPlaybackAvailable())
            return;
        switch (v.getId()) {
            case R.id.btn_previous :
                if (isSinglePreview)
                    DJISampleApplication.getProductInstance().getCamera().
                            getPlayback().singlePreviewPreviousPage();
                else
                    DJISampleApplication.getProductInstance().getCamera().
                            getPlayback().multiplePreviewPreviousPage();
                break;

            case R.id.btn_next :
                if (isSinglePreview)
                    DJISampleApplication.getProductInstance().getCamera().
                            getPlayback().singlePreviewNextPage();
                else
                    DJISampleApplication.getProductInstance().getCamera().
                            getPlayback().multiplePreviewNextPage();
                break;

            case R.id.btn_multiple :
                if (isSinglePreview)
                    DJISampleApplication.getProductInstance().getCamera().
                            getPlayback().enterMultiplePreviewMode();
                break;

            case R.id.btn_single :
                if (!isSinglePreview)
                    DJISampleApplication.getProductInstance().
                            getCamera().getPlayback().enterSinglePreviewModeWithIndex(0);
                break;

            default :
                break;
        }
    }
}
