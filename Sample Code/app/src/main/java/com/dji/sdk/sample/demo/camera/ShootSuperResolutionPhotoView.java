package com.dji.sdk.sample.demo.camera;

import android.app.Service;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.BaseThreeBtnView;
import com.dji.sdk.sample.internal.view.SuperResolutionGroupMedia;
import com.dji.sdk.sample.internal.view.SuperResolutionImageView;

import java.util.List;

import dji.common.camera.SettingsDefinitions;
import dji.common.camera.SuperResolutionInfo;
import dji.sdk.camera.Camera;
import dji.sdk.media.MediaFile;
import dji.sdk.media.MediaManager;

/**
 * 超清矩阵拍照以及展示拼接后的照片示例
 * 该示例是通过fetchSuperResJSON 拉取矩阵形状SuperResInfoBean到mediaFile后拼接，也可以下载完图片后通过downloadOneSuperResJSON
 * 下载本地后自行解析后拼接
 */
public class ShootSuperResolutionPhotoView extends BaseThreeBtnView implements SuperResolutionInfo.Callback {

    private Camera camera;
    private MediaManager mediaManager;
    SuperResolutionImageView mSuperResolutionImageView;
    private ImageView mTransitionImageView;
    RelativeLayout mRootView;
    SuperResolutionGroupMedia mSuperResolutionGroupMedia;

    private static final int MAX_SCALE = 10;
    private static final int TAP_ZOOM_SCALE = 2;

    public ShootSuperResolutionPhotoView(Context context) {
        super(context);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ModuleVerificationUtil.isCameraModuleAvailable()) {
            initCameraParams();
        }
    }

    /**
     * 初始化矩阵相关接口参数
     * 如下inputArea 是2*2的矩形框也可自行设置
     */
    private void initCameraParams() {
        camera = DJISampleApplication.getAircraftInstance().getCamera();
        if (camera.isFlatCameraModeSupported()) {
            //
            RectF inputArea = new RectF(0.35f, 0.25f, 0.65f, 0.55f);
            camera.setFlatMode(SettingsDefinitions.FlatCameraMode.PHOTO_SUPER_RESOLUTION, djiError -> {
                if (djiError == null) {
                    camera.setSuperResolutionCaptureArea(inputArea, error -> {
                        if (error == null) {
                            ToastUtils.setResultToToast("Set Super Res Area Success!");
                        } else {
                            ToastUtils.setResultToToast("Set Super Res Area failed: " + error.getDescription());
                        }
                    });
                } else {
                    ToastUtils.setResultToToast("setFlatMode to PHOTO_SUPER_RESOLUTION failed " + djiError.getDescription());
                }
            });

            camera.setSuperResolutionInfoCallback(this);
        }
    }

    private boolean isModuleAvailable() {
        return (null != DJISampleApplication.getProductInstance()) && (null != DJISampleApplication.getProductInstance()
                .getCamera());
    }

    @Override
    protected int getLeftBtnTextResourceId() {
        return DISABLE;
    }

    @Override
    protected int getDescriptionResourceId() {
        return getDescription();
    }

    @Override
    protected void handleLeftBtnClick() {

    }

    @Override
    protected void handleMiddleBtnClick() {

        if (isModuleAvailable()) {
            post(() -> {
                middleBtn.setEnabled(false);
            });

            DJISampleApplication.getProductInstance()
                    .getCamera()
                    .startShootPhoto(djiError -> {
                        if (null == djiError) {
                            ToastUtils.setResultToToast(getContext().getString(R.string.success));
                        } else {
                            ToastUtils.setResultToToast(djiError.getDescription());
                        }
                    });
        }
    }

    @Override
    protected void handleRightBtnClick() {
    }

    @Override
    protected int getRightBtnTextResourceId() {
        return DISABLE;
    }

    @Override
    protected int getMiddleBtnTextResourceId() {
        return R.string.camera_listview_shoot_super_resolutiob_photo;
    }

    @Override
    public int getDescription() {
        return R.string.camera_listview_shoot_super_resolutiob_photo;
    }

    @Override
    public void onUpdate(SuperResolutionInfo superResolutionInfo) {
        if (superResolutionInfo.getStatus() == SettingsDefinitions.SuperResolutionStatus.FINISH) {
            changeDescription(R.string.camera_listview_shoot_super_resolutiob_photo);
            post(() -> {
                middleBtn.setVisibility(GONE);

            });
            camera.enterPlayback(djiError -> {
                if (djiError != null) {
                    return;
                }
                getFileList();
            });

        } else {
            changeDescription("progress:" + superResolutionInfo.getProgress());
        }

    }

    /**
     * 获取最新拍的超清矩阵照片
     */
    private void getFileList() {
        mediaManager = DJISampleApplication.getProductInstance().getCamera().getMediaManager();
        if (mediaManager != null) {
            mediaManager.refreshFileListOfStorageLocation(SettingsDefinitions.StorageLocation.SDCARD, djiError -> {
                if (djiError == null) {
                    List<MediaFile> medias = mediaManager.getSDCardFileListSnapshot();
                    for (MediaFile mediaFile : medias) {
                        if (mediaFile.getMediaType() == MediaFile.MediaType.PHOTO_FOLDER) {
                            initGroupMedia(mediaFile);
                            break;
                        }
                    }
                }
            });
        }

    }

    private void addHyperAnalyticView() {
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        View rootview = layoutInflater.inflate(R.layout.hyperanalytic_layout, this, false);
        addView(rootview);
        mSuperResolutionImageView = findViewById(R.id.video_previewer);
        mTransitionImageView = findViewById(R.id.transition_iv);
        mRootView = findViewById(R.id.content_rootview);
        initImageView();
    }

    private void initImageView() {
        mSuperResolutionImageView.setMedia(mSuperResolutionGroupMedia);
        mSuperResolutionImageView.setMinimumScaleType(SubsamplingScaleImageView.SCALE_TYPE_CENTER_INSIDE);
        mSuperResolutionImageView.setMaxScale(MAX_SCALE);
        mSuperResolutionImageView.setDoubleTapZoomScale(TAP_ZOOM_SCALE);
        mSuperResolutionImageView.setOnClickListener(it -> {
            if (mTransitionImageView.getVisibility() == VISIBLE) {
                mTransitionImageView.setVisibility(GONE);
            }

        });

        mSuperResolutionImageView.setOnClickCaptureItemAreaListener(captureItemArea -> {
            if (mTransitionImageView.getVisibility() == VISIBLE) {
                mTransitionImageView.setVisibility(GONE);
                return;
            }
            enterPreview(captureItemArea);
        });

        mSuperResolutionImageView.setOnPreviewImageLoadListener(new SuperResolutionImageView.OnPreviewImageLoadListener() {
            @Override
            public void onSuccess() {
                mSuperResolutionImageView.setVisibility(View.VISIBLE);
            }
            @Override
            public void onFailure(String error) {
                mSuperResolutionImageView.setVisibility(View.VISIBLE);

            }
        });


    }


    /**
     * 展示矩阵中的具体 zoom图片
     * @param captureItemArea
     */
    private void enterPreview(SuperResolutionImageView.CaptureItemArea captureItemArea) {

        List<MediaFile> mediaList = mSuperResolutionGroupMedia.getZoomMediaList();
        if (captureItemArea.index >= mediaList.size()) {
            ToastUtils.setResultToToast("photo not exit");
            return;
        }
        final MediaFile zoomMedia = mediaList.get(captureItemArea.index);
        if (zoomMedia == null) {
            return;
        }

        mTransitionImageView.setImageBitmap(zoomMedia.getThumbnail());
        final RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) mTransitionImageView.getLayoutParams();
        mTransitionImageView.post(() -> {
            mTransitionImageView.setVisibility(View.VISIBLE);
            Rect fullscreenRect = getFullScreenPreviewRect();
            layoutParams.leftMargin = fullscreenRect.left;
            layoutParams.topMargin = fullscreenRect.top;
            layoutParams.width = fullscreenRect.width();
            layoutParams.height = fullscreenRect.height();
            mTransitionImageView.setLayoutParams(layoutParams);
        });

    }

    private Rect getFullScreenPreviewRect() {
        float ratio = 4.0f / 3.0f;
        float ratioScreen = mRootView.getWidth() * 1.0f / mRootView.getHeight();
        if (ratioScreen >= ratio) {
            // 高铺满屏幕
            final int sw = (int) (mRootView.getHeight() * ratio);
            final int sh = mRootView.getHeight();
            return new Rect((mRootView.getWidth() - sw) / 2, 0, mRootView.getWidth() - (mRootView.getWidth() - sw) / 2, sh);
        } else {
            // 宽铺满屏幕
            final int sw = mRootView.getWidth();
            final int sh = (int) (sw / ratio);
            return new Rect(0, (mRootView.getHeight() - sh) / 2, sw, mRootView.getHeight() - (mRootView.getHeight() - sh) / 2);
        }
    }

    private void initGroupMedia(MediaFile mediaFile) {
        mSuperResolutionGroupMedia = new SuperResolutionGroupMedia(mediaFile);
        // 拉取sub 列表，并填充mSuperResolutionGroupMedia里面的wide zoom等文件信息
        mSuperResolutionGroupMedia.fetchSubMediaList(() -> {
            // 获取json 表，包含矩阵形状
            mediaFile.fetchSuperResJSON(error -> {
                post(() -> {
                    addHyperAnalyticView();
                });

            });
        });

    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        camera.exitPlayback(null);
        camera.setSuperResolutionInfoCallback(null);
    }

    public interface FetchListener {
        void onSuccess();
    }


}
