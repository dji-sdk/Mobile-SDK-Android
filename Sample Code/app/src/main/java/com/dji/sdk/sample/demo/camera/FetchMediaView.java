package com.dji.sdk.sample.demo.camera;

import android.app.Service;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.demo.camera.adapter.MediaFileRecyclerAdapter;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.DownloadHandler;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.BaseThreeBtnView;

import dji.sdk.media.FetchMediaTask;
import dji.sdk.media.FetchMediaTaskContent;
import dji.sdk.media.FetchMediaTaskScheduler;
import dji.sdk.media.MediaFile;
import dji.sdk.media.MediaManager;
import java.io.File;

import dji.common.camera.SettingsDefinitions;
import dji.common.error.DJIError;
import dji.common.util.CommonCallbacks;
import dji.sdk.media.order.MediaFilter;
import dji.sdk.media.order.MediaOrderType;
import dji.sdk.media.order.MediaRequest;
import dji.sdk.media.order.MediaSizeOrder;
import dji.sdk.media.order.MediaTimeOrder;


import java.util.List;

/**
 * Class for fetching the media.
 *
 * 更多功能请参考:https://github.com/DJI-Mobile-SDK-Tutorials/Android-MediaManagerDemo
 */
public class FetchMediaView extends BaseThreeBtnView {

    private MediaFile media;
    private MediaManager mediaManager;
    private FetchMediaTaskScheduler taskScheduler;
    private FetchMediaTask.Callback fetchMediaFileTaskCallback;

    private SwipeRefreshLayout mSwipeRefreshLayout;
    private RecyclerView mRecycler;
    private MediaFileRecyclerAdapter mAdapter;
    private LinearLayoutManager mLinearLayoutManager;
    private int mLastVisibleItem;

    private static  int mFileBeginIndex = 1;
    private static final int FILE_PAGE_COUNT = 100;
    private Handler mHandler = new Handler(Looper.getMainLooper());


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
                    if (taskScheduler != null && taskScheduler.getState() == FetchMediaTaskScheduler.FetchMediaTaskSchedulerState.SUSPENDED) {
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
                if (DJISampleApplication.getProductInstance()
                        .getCamera().isFlatCameraModeSupported()) {
                    DJISampleApplication.getProductInstance()
                            .getCamera().enterPlayback(djiError->{
                                if (djiError != null) {
                                    ToastUtils.setResultToToast("enter Playback failed " + djiError.getDescription());
                                } else {
                                    boolean isSupport = mediaManager.isPlaybackPageSupported();
                                    Log.v("testPack" , " isSupport " + isSupport );
                                    if (isSupport) {
                                        post(()->{ addMedaiRequstFootView();});

                                    }
                                }
                    });
                } else {
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
        if (taskScheduler != null) {
            taskScheduler.suspend(null);
        }
        if (DJISampleApplication.getProductInstance()
                .getCamera().isFlatCameraModeSupported()) {
            DJISampleApplication.getProductInstance()
                    .getCamera().exitPlayback(null);
        }
        mFileBeginIndex = 1;
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
                mediaManager.refreshFileListOfStorageLocation(SettingsDefinitions.StorageLocation.SDCARD, new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError djiError) {
                        String str;
                        if (null == djiError) {
                            List<MediaFile> djiMedias = mediaManager.getSDCardFileListSnapshot();

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


    private void addMedaiRequstFootView() {

        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        View footview = layoutInflater.inflate(R.layout.media_recycler_layout, this, false);
        addView(footview);

        mSwipeRefreshLayout = (SwipeRefreshLayout)footview.findViewById(R.id.swiperefreshlayout);
        mRecycler = (RecyclerView)footview.findViewById(R.id.recycler);
//        mSwipeRefreshLayout.setProgressBackgroundColorSchemeResource(android.R.color.white);
//        mSwipeRefreshLayout.setColorSchemeResources(android.R.color.holo_blue_light);

        mLinearLayoutManager = new LinearLayoutManager(getContext());
        mLinearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        mRecycler.setLayoutManager(mLinearLayoutManager);

        mRecycler.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        mRecycler.setAdapter(mAdapter = new MediaFileRecyclerAdapter(getContext()));
        mSwipeRefreshLayout.setOnRefreshListener(()->{ mSwipeRefreshLayout.setRefreshing(false);});


        getFileWithMediaRequest();

        mRecycler.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == RecyclerView.SCROLL_STATE_IDLE && mLastVisibleItem + 1 == mAdapter.getItemCount()) {
                    getFileWithMediaRequest();
                }
            }
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                mLastVisibleItem = mLinearLayoutManager.findLastVisibleItemPosition();
            }
        });
    }


    private void getFileWithMediaRequest() {
        mAdapter.changeLoadStatus(MediaFileRecyclerAdapter.LOADING);
        MediaRequest.Builder builder = MediaRequest.Builder.aMediaRequest();
        builder.beginIndex(mFileBeginIndex);
        builder.count(FILE_PAGE_COUNT);
        builder.filter(MediaFilter.NONE);
        builder.location(SettingsDefinitions.StorageLocation.INTERNAL_STORAGE);
        builder.orderType(MediaOrderType.TIME);
        builder.timeOrder(MediaTimeOrder.NEW);

        mHandler.post(() -> {

            mediaManager.refreshFileListOfStorageLocation(SettingsDefinitions.StorageLocation.INTERNAL_STORAGE, new CommonCallbacks.CompletionCallback() {
                @Override
                public void onResult(DJIError djiError) {
                    if(djiError == null)
                    {
                        List<MediaFile> mediaFiles = mediaManager.getInternalStorageFileListSnapshot();
                        int count = mediaFiles != null ? mediaFiles.size():0;
                        if (count != 0 ) {
                            mFileBeginIndex  = mediaFiles.get(count - 1).getIndex();
                            post(()->{
                                mAdapter.addMoreItem(mediaFiles);
                                mAdapter.changeLoadStatus(MediaFileRecyclerAdapter.PULL_UP_LOADMORE);
                            });
                        } else {
                            post(()->{mAdapter.changeLoadStatus(MediaFileRecyclerAdapter.LOAD_FINISH);});

                        }
                    }
                    else
                    {
                        post(()->{ mAdapter.changeLoadStatus(MediaFileRecyclerAdapter.LOADING);});
                    }
                }
            });

//            mediaManager.fetchFileList(builder.build(), new CommonCallbacks.CompletionCallbackWith<List<MediaFile>>() {
//                @Override
//                public void onSuccess(List<MediaFile> mediaFiles) {
//                    int count = mediaFiles != null ? mediaFiles.size():0;
//                    if (count != 0 ) {
//                        mFileBeginIndex  = mediaFiles.get(count - 1).getIndex();
//                        post(()->{
//                            mAdapter.addMoreItem(mediaFiles);
//                            mAdapter.changeLoadStatus(MediaFileRecyclerAdapter.PULL_UP_LOADMORE);
//                        });
//                    } else {
//                        post(()->{mAdapter.changeLoadStatus(MediaFileRecyclerAdapter.LOAD_FINISH);});
//
//                    }
//
//                }
//
//                @Override
//                public void onFailure(DJIError error) {
//                    post(()->{ mAdapter.changeLoadStatus(MediaFileRecyclerAdapter.LOADING);});
//
//                }
//            });
        });


    }
}
