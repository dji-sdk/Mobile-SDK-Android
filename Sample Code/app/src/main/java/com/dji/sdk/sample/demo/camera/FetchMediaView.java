package com.dji.sdk.sample.demo.camera;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.DownloadHandler;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.BaseThreeBtnView;
import dji.common.camera.SettingsDefinitions;
import dji.common.error.DJIError;
import dji.common.util.CommonCallbacks;
import dji.sdk.camera.MediaFile;
import dji.sdk.camera.MediaManager;
import java.io.File;
import java.util.List;

/**
 * Class for fetching the media.
 */
public class FetchMediaView extends BaseThreeBtnView {

    private MediaFile media;
    private MediaManager mediaManager;

    public FetchMediaView(Context context) {
        super(context);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ModuleVerificationUtil.isCameraModuleAvailable()) {
            if (ModuleVerificationUtil.isMediaManagerAvailable()) {
                DJISampleApplication.getProductInstance()
                                    .getCamera()
                                    .setMode(SettingsDefinitions.CameraMode.MEDIA_DOWNLOAD,
                                             new CommonCallbacks.CompletionCallback() {
                                                 @Override
                                                 public void onResult(DJIError djiError) {
                                                     if (null == djiError) fetchMediaList();
                                                 }
                                             });
                if (mediaManager == null) {
                    mediaManager = DJISampleApplication.getProductInstance().getCamera().getMediaManager();
                }
            } else {
                changeDescription(R.string.not_support_mediadownload);
            }
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (ModuleVerificationUtil.isCameraModuleAvailable()) {
            DJISampleApplication.getProductInstance()
                                .getCamera()
                                .setMode(SettingsDefinitions.CameraMode.SHOOT_PHOTO, null);
        }
    }

    @Override
    protected int getMiddleBtnTextResourceId() {
        return R.string.fetch_media_view_fetch_thumbnail;
    }

    @Override
    protected int getLeftBtnTextResourceId() {
        return R.string.fetch_media_view_fetch_preview;
    }

    @Override
    protected int getRightBtnTextResourceId() {
        return R.string.fetch_media_view_fetch_media;
    }

    @Override
    protected int getDescriptionResourceId() {
        if (!ModuleVerificationUtil.isMediaManagerAvailable()) {
            return R.string.not_support_mediadownload;
        } else {
            return R.string.support_mediadownload;
        }
    }

    @Override
    protected void handleMiddleBtnClick() {
        // Fetch Thumbnail Button
        if (ModuleVerificationUtil.isMediaManagerAvailable() && media != null && mediaManager != null) {
            mediaManager.fetchThumbnail(media, new DownloadHandler<Bitmap>());
        }
    }

    @Override
    protected void handleLeftBtnClick() {
        // Fetch Preview Button
        if (ModuleVerificationUtil.isMediaManagerAvailable() && media != null && mediaManager != null) {
            mediaManager.fetchPreviewImage(media, new DownloadHandler<Bitmap>());
        }
    }

    @Override
    protected void handleRightBtnClick() {
        // Fetch Media Data Button
        if (ModuleVerificationUtil.isCameraModuleAvailable() && media != null && mediaManager != null) {
            File destDir = new File(Environment.getExternalStorageDirectory().
                getPath() + "/Dji_Sdk_Test/");
            mediaManager.fetchMediaData(media, destDir, "testName", new DownloadHandler<String>());
        }
    }

    // Initialize the view with getting a media file.
    private void fetchMediaList() {
        if (ModuleVerificationUtil.isMediaManagerAvailable()) {
            DJISampleApplication.getProductInstance()
                                .getCamera()
                                .getMediaManager()
                                .fetchMediaList(new MediaManager.DownloadListener<List<MediaFile>>() {
                                    String str;

                                    @Override
                                    public void onStart() {
                                        changeDescription("Start fetch media list");
                                    }

                                    @Override
                                    public void onRateUpdate(long total, long current, long persize) {
                                        changeDescription("in progress");
                                    }

                                    @Override
                                    public void onProgress(long l, long l1) {

                                    }

                                    @Override
                                    public void onSuccess(List<MediaFile> djiMedias) {
                                        if (null != djiMedias) {
                                            if (!djiMedias.isEmpty()) {
                                                media = djiMedias.get(0);
                                                str = "Total Media files:"
                                                    + djiMedias.size()
                                                    + "\n"
                                                    + "Media 1: "
                                                    + djiMedias.get(0).getFileName();
                                                changeDescription(str);
                                            } else {
                                                str = "No Media in SD Card";
                                                changeDescription(str);
                                            }
                                        }
                                    }

                                    @Override
                                    public void onFailure(DJIError djiError) {
                                        changeDescription(djiError.getDescription());
                                    }
                                });
        }
    }

    @Override
    public int getDescription() {
        return R.string.camera_listview_download_media;
    }
}
