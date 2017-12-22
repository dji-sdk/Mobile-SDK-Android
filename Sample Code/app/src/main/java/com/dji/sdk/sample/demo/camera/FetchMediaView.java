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

import java.io.File;
import java.util.List;

import dji.common.camera.SettingsDefinitions;
import dji.common.error.DJIError;
import dji.common.util.CommonCallbacks;
import dji.sdk.camera.FetchMediaTask;
import dji.sdk.camera.FetchMediaTaskContent;
import dji.sdk.camera.FetchMediaTaskScheduler;
import dji.sdk.camera.FetchMediaTaskScheduler.FetchMediaTaskSchedulerState;
import dji.sdk.camera.MediaFile;
import dji.sdk.camera.MediaManager;

/**
 * Class for fetching the media.
 */
public class FetchMediaView extends BaseThreeBtnView {

    private MediaFile media;
    private MediaManager mediaManager;
    private FetchMediaTaskScheduler taskScheduler;
    private FetchMediaTask.Callback fetchMediaFileTaskCallback;

    public FetchMediaView(Context context) {
        super(context);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setUpListener();
        if (ModuleVerificationUtil.isCameraModuleAvailable()) {
            if (ModuleVerificationUtil.isMediaManagerAvailable()) {
                if (mediaManager == null) {
                    mediaManager = DJISampleApplication.getProductInstance().getCamera().getMediaManager();
                }

                if (taskScheduler == null) {
                    taskScheduler = mediaManager.getScheduler();
                    if (taskScheduler != null && taskScheduler.getState() == FetchMediaTaskSchedulerState.SUSPENDED) {
                        taskScheduler.resume(new CommonCallbacks.CompletionCallback() {
                            @Override
                            public void onResult(DJIError djiError) {

                                if (djiError != null) {
                                    ToastUtils.setResultToToast("taskScheduler resume failed: " + djiError.getDescription());
                                }

                            }
                        });
                    }
                }

                DJISampleApplication.getProductInstance()
                        .getCamera()
                        .setMode(SettingsDefinitions.CameraMode.MEDIA_DOWNLOAD,
                                new CommonCallbacks.CompletionCallback() {
                                    @Override
                                    public void onResult(DJIError djiError) {
                                        if (null == djiError) {
                                            fetchMediaList();
                                        }
                                    }
                                });
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
        if (taskScheduler != null) {
            taskScheduler.suspend(null);
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
        if (ModuleVerificationUtil.isMediaManagerAvailable()
                && media != null
                && mediaManager != null
                && taskScheduler != null) {

            taskScheduler.moveTaskToEnd(new FetchMediaTask(media,
                    FetchMediaTaskContent.THUMBNAIL,
                    fetchMediaFileTaskCallback));
        }
    }

    @Override
    protected void handleLeftBtnClick() {
        // Fetch Preview Button
        if (ModuleVerificationUtil.isMediaManagerAvailable()
                && media != null
                && mediaManager != null
                && taskScheduler != null) {
            taskScheduler.moveTaskToEnd(new FetchMediaTask(media,
                    FetchMediaTaskContent.PREVIEW,
                    fetchMediaFileTaskCallback));
        }
    }

    @Override
    protected void handleRightBtnClick() {
        // Fetch Media Data Button
        if (ModuleVerificationUtil.isCameraModuleAvailable()
                && media != null
                && mediaManager != null) {
            File destDir = new File(Environment.getExternalStorageDirectory().
                    getPath() + "/Dji_Sdk_Test/");
            media.fetchFileData(destDir, "testName", new DownloadHandler<String>());
        }
    }

    private void setUpListener() {
        // Example of Listener
        fetchMediaFileTaskCallback = new FetchMediaTask.Callback() {
            @Override
            public void onUpdate(MediaFile mediaFile, FetchMediaTaskContent fetchMediaTaskContent, DJIError djiError) {

                if (djiError == null) {
                    Bitmap bitmap = null;
                    if (FetchMediaTaskContent.PREVIEW == fetchMediaTaskContent) {
                        bitmap = mediaFile.getPreview();
                    }
                    if (FetchMediaTaskContent.THUMBNAIL == fetchMediaTaskContent) {
                        bitmap = mediaFile.getThumbnail();
                    }
                } else {
                    ToastUtils.setResultToToast("fetch media failed: " + djiError.getDescription());
                }
            }
        };
    }

    // Initialize the view with getting a media file.
    private void fetchMediaList() {
        if (ModuleVerificationUtil.isMediaManagerAvailable()) {
            if (mediaManager != null) {
                mediaManager.refreshFileList(new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError djiError) {
                        String str;
                        if (null == djiError) {
                            List<MediaFile> djiMedias = mediaManager.getFileListSnapshot();

                            if (null != djiMedias) {
                                if (!djiMedias.isEmpty()) {
                                    media = djiMedias.get(0);
                                    str = "Total Media files:" + djiMedias.size() + "\n" + "Media 1: " +
                                            djiMedias.get(0).getFileName();
                                    changeDescription(str);
                                } else {
                                    str = "No Media in SD Card";
                                    changeDescription(str);
                                }
                            }
                        } else {
                            changeDescription(djiError.getDescription());
                        }
                    }
                });
            }
        }
    }

    @Override
    public int getDescription() {
        return R.string.camera_listview_download_media;
    }
}
