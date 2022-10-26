package com.dji.sdk.sample.demo.camera;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.ArraySet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.controller.MainActivity;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.utils.VideoFeedView;
import com.dji.sdk.sample.internal.view.BaseCameraView;
import com.dji.sdk.sample.internal.view.PresentableView;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dji.common.camera.SettingsDefinitions;
import dji.common.camera.StorageState;
import dji.common.error.DJICameraError;
import dji.common.error.DJIError;
import dji.common.util.CommonCallbacks;
import dji.log.DJILog;
import dji.sdk.base.BaseProduct;
import dji.sdk.camera.Camera;
import dji.sdk.camera.VideoFeeder;
import dji.sdk.media.DownloadListener;
import dji.sdk.media.FetchMediaTask;
import dji.sdk.media.FetchMediaTaskContent;
import dji.sdk.media.FetchMediaTaskScheduler;
import dji.sdk.media.MediaFile;
import dji.sdk.media.MediaManager;
import dji.sdk.products.Aircraft;
import dji.sdk.sdkmanager.DJISDKManager;


/**
 * Class for fetching the media.
 *
 * 更多功能请参考:https://github.com/DJI-Mobile-SDK-Tutorials/Android-MediaManagerDemo
 */
public class MediaPlaybackView extends LinearLayout implements PresentableView,View.OnClickListener {
    private static final String TAG = MediaPlaybackView.class.getName();
    private final int SHOW_TOAST = 1;
    private final int SHOW_PROGRESS_DIALOG = 2;
    private final int HIDE_PROGRESS_DIALOG = 3;
    private final int SHOW_DOWNLOAD_PROGRESS_DIALOG = 4;
    private final int HIDE_DOWNLOAD_PROGRESS_DIALOG = 5;
    private final int FETCH_FILE_LIST = 6;
    private final int NEED_REFRESH_FILE_LIST = 7;
    public TextView tv_playbackInfo;
    public Button btnResume;
    public Button btnPause;
    public Button btnStop;
    public Button btnDelete;
    public Button btnStatus;
    public Button btnDownload;
    private MediaManager mediaManager;
    private FetchMediaTaskScheduler scheduler;
    private List<MediaFile> DJIMediaList = new ArrayList<>();
    private boolean isDialogAllowable = false;
    private FileListAdapter listAdapter;
    private ProgressDialog dialog;
    private ProgressDialog mDownloadDialog;
    private Aircraft aircraft;
    private VideoFeedView mBaseCameraView;
    private ImageView mDisplayImageView;
    private TextView mSelectedNumber;
    private Set selected = new HashSet();
    private File path = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM)+"/sample_media");
    private SettingsDefinitions.StorageLocation storageLocation = SettingsDefinitions.StorageLocation.INTERNAL_STORAGE;
    private Handler handler = new Handler(Looper.getMainLooper(),new Handler.Callback() {

        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case SHOW_TOAST:
                    ToastUtils.setResultToToast((String) msg.obj);
                    break;
                case SHOW_PROGRESS_DIALOG:
                    showProgressDialog();
                    break;
                case HIDE_PROGRESS_DIALOG:
                    hideProgressDialog();
                    break;
                case FETCH_FILE_LIST:
                    getFileList();
                    break;
                case NEED_REFRESH_FILE_LIST:
                    listAdapter.notifyDataSetChanged();
                    break;
                case SHOW_DOWNLOAD_PROGRESS_DIALOG:
                    showDownloadProgressDialog();
                    break;
                case HIDE_DOWNLOAD_PROGRESS_DIALOG:
                    hideDownloadProgressDialog();
                    break;
                default:
                    break;
            }
            return false;
        }
    });

    public MediaPlaybackView(Context context) {
        super(context);
        initUI(context);
        DJISampleApplication.getAircraftInstance().getCamera().getStorageLocation(new CommonCallbacks.CompletionCallbackWith<SettingsDefinitions.StorageLocation>() {
            @Override
            public void onSuccess(SettingsDefinitions.StorageLocation value) {
                storageLocation = value;
            }
            @Override
            public void onFailure(DJIError djiError) {
                handler.handleMessage(handler.obtainMessage(SHOW_TOAST,"Failed to get storage location:"+djiError.getDescription()));
            }
        });
    }

    private static void addLineToSB(StringBuilder sb, String name, Object value) {
        sb.append(name + ": ").
                append(value == null ? "" : value + "").
                append("\n");
    }

    private void createProgressDialog() {

        dialog = new ProgressDialog(getContext());
        dialog.setMessage(getContext().getString(R.string.Message_Waiting));
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);


        mDownloadDialog = new ProgressDialog(getContext());
        mDownloadDialog.setTitle("Downloading file");
        mDownloadDialog.setIcon(android.R.drawable.ic_dialog_info);
        mDownloadDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        mDownloadDialog.setCanceledOnTouchOutside(false);
        mDownloadDialog.setCancelable(true);
        mDownloadDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (mediaManager != null) {
                    mediaManager.exitMediaDownloading();
                }
                else
                {
                    mediaManager = DJISampleApplication.getAircraftInstance().getCamera().getMediaManager();
                }
            }
        });
        mDownloadDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialog) {
                if (mediaManager != null) {
                    mediaManager.exitMediaDownloading();
                }
                else
                {
                    mediaManager = DJISampleApplication.getAircraftInstance().getCamera().getMediaManager();
                }
            }
        });
    }

    private void showProgressDialog() {
        if (dialog != null && isDialogAllowable) {
            dialog.show();
        }
    }

    private void showDownloadProgressDialog()
    {
        if(mDownloadDialog != null && !mDownloadDialog.isShowing())
        {
            mDownloadDialog.show();
        }
    }

    private void hideDownloadProgressDialog()
    {
        if(mDownloadDialog != null && mDownloadDialog.isShowing())
        {
            mDownloadDialog.dismiss();
        }
    }

    private void hideProgressDialog() {
        if (null != dialog && dialog.isShowing()) {
            dialog.dismiss();
        }
    }


    private void getFileList() {

        mediaManager = DJISampleApplication.getProductInstance().getCamera().getMediaManager();
        scheduler = mediaManager.getScheduler();

        if (mediaManager != null) {
            mediaManager.refreshFileListOfStorageLocation(storageLocation, new CommonCallbacks.CompletionCallback() {
                @Override
                public void onResult(DJIError djiError) {
                    if (djiError == null) {

                        List<MediaFile> medias;
                        if(storageLocation == SettingsDefinitions.StorageLocation.SDCARD)
                        {
                            medias = mediaManager.getSDCardFileListSnapshot();
                        }
                        else
                        {
                            medias = mediaManager.getInternalStorageFileListSnapshot();
                        }
                        if (DJIMediaList != null) {
                            DJIMediaList.clear();
                        }
                        for (MediaFile media : medias) {
                            DJIMediaList.add(media);
                        }

                        if (DJIMediaList != null) {
                            Collections.sort(DJIMediaList, (lhs, rhs) -> {
                                if (lhs.getTimeCreated() < rhs.getTimeCreated()) {
                                    return 1;
                                } else if (lhs.getTimeCreated() > rhs.getTimeCreated()) {
                                    return -1;
                                }
                                return 0;
                            });
                        }

                        scheduler.resume(new CommonCallbacks.CompletionCallback() {
                            @Override
                            public void onResult(DJIError djiError) {
                                if(djiError == null)
                                {
                                    getThumbanils();
                                }
                            }
                        });

                        handler.sendMessage(handler.obtainMessage(NEED_REFRESH_FILE_LIST, null));

                    } else {
                        handler.sendMessage(handler.obtainMessage(SHOW_TOAST, "Refresh error:"+djiError.getDescription()));
                    }
                }
            });
        }
        else
        {
            handler.sendMessage(handler.obtainMessage(SHOW_TOAST, "mediaManager is null."));
        }
        handler.sendMessage(handler.obtainMessage(HIDE_PROGRESS_DIALOG, null));
    }

    private void initDJIMedia() {
        if(ModuleVerificationUtil.isProductModuleAvailable())
        {
            aircraft = (Aircraft) DJISDKManager.getInstance().getProduct();
            if(ModuleVerificationUtil.isCameraModuleAvailable() && aircraft.getCamera().isMediaDownloadModeSupported())
            {
                Camera camera = aircraft.getCamera();
                mediaManager = camera.getMediaManager();
                scheduler = mediaManager.getScheduler();

                mBaseCameraView.registerLiveVideo(VideoFeeder.getInstance().getPrimaryVideoFeed(),true);

                mediaManager.addMediaUpdatedVideoPlaybackStateListener(new MediaManager.VideoPlaybackStateListener() {
                    @Override
                    public void onUpdate(MediaManager.VideoPlaybackState videoPlaybackState) {
                        updateTextView(videoPlaybackState);
                    }
                });

                if(camera.isFlatCameraModeSupported())
                {
                    camera.enterPlayback(new CommonCallbacks.CompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {
                            if(djiError != null)
                            {
                                handler.handleMessage(handler.obtainMessage(SHOW_TOAST,"Failed to set download mode:"+djiError.getDescription()));
                            }
                            else
                            {
                                handler.sendMessage(handler.obtainMessage(SHOW_PROGRESS_DIALOG, null));
                                new Thread(new Runnable() {
                                    @Override
                                    public void run() {
                                        getFileList();
                                    }
                                }).start();
                            }
                        }
                    });
                }
                else
                {
                    camera.setMode(SettingsDefinitions.CameraMode.MEDIA_DOWNLOAD, new CommonCallbacks.CompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {
                            if(djiError != null)
                            {
                                handler.handleMessage(handler.obtainMessage(SHOW_TOAST,"Failed to set download mode:"+djiError.getDescription()));
                            }
                            else
                            {
                                handler.sendMessage(handler.obtainMessage(SHOW_PROGRESS_DIALOG, null));
                                new Thread(new Runnable() {
                                    @Override
                                    public void run() {
                                        getFileList();
                                    }
                                }).start();
                            }
                        }
                    });
                }
            }
        }
    }

    private void initUI(Context context) {

        setOrientation(HORIZONTAL);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);

        layoutInflater.inflate(R.layout.media_playback, this, true);

        RecyclerView listView = (RecyclerView) findViewById(R.id.filelistView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(context, RecyclerView.VERTICAL,false);
        listAdapter = new FileListAdapter();
        listView.setAdapter(listAdapter);
        listView.setLayoutManager(layoutManager);

        createProgressDialog();

        mSelectedNumber = (TextView)findViewById(R.id.selectedNumber);
        tv_playbackInfo = (TextView) findViewById(R.id.tv_mediaPushInfo);
        mDisplayImageView = (ImageView)findViewById(R.id.display_image_view);
        mBaseCameraView = (VideoFeedView) findViewById(R.id.camera_live_view);
        btnResume = (Button) findViewById(R.id.btnResume);
        btnPause = (Button) findViewById(R.id.btnPause);
        btnStop = (Button) findViewById(R.id.btnStop);
        btnDelete = (Button) findViewById(R.id.btnDelete);
        btnStatus = (Button) findViewById(R.id.btnStatus);
        btnDownload = (Button) findViewById(R.id.btnDownload);

        sendSelectedToText();

        mDisplayImageView.setVisibility(View.GONE);
        mBaseCameraView.setVisibility(View.VISIBLE);

        btnDelete.setOnClickListener(this);
        btnPause.setOnClickListener(this);
        btnStop.setOnClickListener(this);
        btnDownload.setOnClickListener(this);
        btnResume.setOnClickListener(this);
        btnStatus.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnResume:
                mediaManager.resume(new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError error) {
                        if (null != error) {
                            handler.sendMessage(handler.obtainMessage(SHOW_TOAST, "Resume error:"+error.getDescription()));
                        } else {
                            Log.e(TAG, "Resume Video Success");
                        }
                    }
                });
                break;
            case R.id.btnPause:
                mediaManager.pause(new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError error) {
                        if (null != error) {
                            handler.sendMessage(handler.obtainMessage(SHOW_TOAST, "Pause error:"+error.getDescription()));
                        } else {
                            Log.e(TAG, "Pause Video Success");
                        }
                    }
                });
                break;
            case R.id.btnStop:
                mediaManager.stop(new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError error) {
                        if (null != error) {
                            handler.sendMessage(handler.obtainMessage(SHOW_TOAST, "Stop error:"+error.getDescription()));
                        } else {
                            Log.e(TAG, "Stop Video Success");
                        }
                    }
                });
                break;
            case R.id.btnStatus:
                MediaPlaybackView.this.post(new Runnable() {
                    @Override
                    public void run() {
                        if (tv_playbackInfo.isShown()) {
                            tv_playbackInfo.setVisibility(View.INVISIBLE);
                        } else {
                            tv_playbackInfo.setVisibility(View.VISIBLE);
                        }
                    }
                });
                break;
            case R.id.btnDelete:
                if (selected != null &&!selected.isEmpty()) {

                    Iterator iterator = selected.iterator();
                    List<MediaFile> mediaFiles = new ArrayList<>();
                    while (iterator.hasNext())
                    {
                        Integer index = (Integer) iterator.next();
                        mediaFiles.add(DJIMediaList.get(index));
                        iterator.remove();
                    }

                    deleteFiles(mediaFiles);
                }
                else
                {
                    handler.sendMessage(handler.obtainMessage(SHOW_TOAST,"There's no selected files."));
                }
                break;
            case R.id.btnDownload:
                if(selected != null &&!selected.isEmpty())
                {
                    Iterator iterator = selected.iterator();
                    if(iterator.hasNext())
                    {
                        int index = (Integer) iterator.next();
                        downloadFiles(iterator,index);

                    }
                }
                else
                {
                    handler.sendMessage(handler.obtainMessage(SHOW_TOAST,"There's no selected files."));
                }
                break;
            default:
                break;
        }
    }

    private FetchMediaTask.Callback taskCallback = new FetchMediaTask.Callback() {
        @Override
        public void onUpdate(MediaFile file, FetchMediaTaskContent option, DJIError error) {
            if (null == error) {

                //fetch perview
                if (option == FetchMediaTaskContent.PREVIEW) {
                    if (file.getPreview() == null) {
                        file.fetchPreview(null);
                    }
                    if(file.getPreview() != null)
                    {
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                final Bitmap previewBitmap = file.getPreview();
                                mDisplayImageView.setImageBitmap(previewBitmap);
                            }
                        });
                    }
                    else {
                        handler.sendMessage(handler.obtainMessage(SHOW_TOAST,"bitmap is null"));
                    }
                }

                //fetch thumbnail
                if (option == FetchMediaTaskContent.THUMBNAIL) {
                    if(file.getThumbnail() == null)
                        file.fetchThumbnail(null);
                }

                handler.sendMessage(handler.obtainMessage(NEED_REFRESH_FILE_LIST, null));
            } else {
                DJILog.e(TAG, "Fetch Media Task Failed" + error.getDescription());
            }
        }
    };

    private RecyclerView.OnScrollListener scrollListener =  new RecyclerView.OnScrollListener() {
        @Override
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);
            if(newState == RecyclerView.SCREEN_STATE_ON)
            {
                scheduler.suspend(null);
            }
            else
            {
                scheduler.resume(null);
            }
        }
    };

    private void sendSelectedToText()
    {
        mSelectedNumber.setText("selected:"+String.valueOf(selected.size()));
    }

    private void getThumbanils()
    {
        if(DJIMediaList!=null)
        {
            for (MediaFile item:DJIMediaList) {
                FetchMediaTask task = new FetchMediaTask(item, FetchMediaTaskContent.THUMBNAIL, taskCallback);
                scheduler.moveTaskToNext(task);
            }
        }
        else
        {
            handler.sendMessage(handler.obtainMessage(SHOW_TOAST,"GET THUMBANIL FAIL"));
        }
    }

    private void downloadFiles(Iterator iterator,int index)
    {
        if((DJIMediaList.get(index).getMediaType() == MediaFile.MediaType.SHALLOW_FOCUS) && (DJIMediaList.get(index).getMediaType() == MediaFile.MediaType.PANORAMA))
        {
            handler.sendMessage(handler.obtainMessage(SHOW_TOAST,"MediaFile.MediaType.SHALLOW_FOCUS or MediaFile.MediaType.PANORAMA"));
        }
        else
        {
            if(!path.exists())
            {
                path.mkdirs();
            }

            DJIMediaList.get(index).fetchFileData(path, null, new DownloadListener<String>() {
                @Override
                public void onStart() {
                    handler.sendMessage(handler.obtainMessage(SHOW_DOWNLOAD_PROGRESS_DIALOG,null));
                }

                @Override
                public void onRateUpdate(long total, long current, long l2) {
                    int tmpProgress = (int) (1.0 * current / total * 100);
                    mDownloadDialog.setProgress(tmpProgress);
                }

                @Override
                public void onRealtimeDataUpdate(byte[] bytes, long l, boolean b) {

                }

                @Override
                public void onProgress(long l, long l1) {

                }

                @Override
                public void onSuccess(String s) {
                    if(iterator.hasNext())
                    {
                        int view = (int)iterator.next();
                        downloadFiles(iterator,view);
                    }
                    else
                    {
                        handler.sendMessage(handler.obtainMessage(HIDE_DOWNLOAD_PROGRESS_DIALOG,null));
                    }
                }

                @Override
                public void onFailure(DJIError djiError) {
                    handler.sendMessage(handler.obtainMessage(HIDE_DOWNLOAD_PROGRESS_DIALOG,null));
                    handler.sendMessage(handler.obtainMessage(SHOW_TOAST,djiError.getDescription()));
                }
            });
        }
    }

    private void deleteFiles(List<MediaFile> mediaFiles){
        if(mediaFiles.size() > 0)
        {
            handler.sendMessage(handler.obtainMessage(SHOW_PROGRESS_DIALOG,null));
            mediaManager.deleteFiles(mediaFiles, new CommonCallbacks.CompletionCallbackWithTwoParam<List<MediaFile>, DJICameraError>() {
                @Override
                public void onSuccess(List<MediaFile> mf, DJICameraError djiCameraError) {
                    DJILog.e(TAG, "Delete file success");
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            DJIMediaList.removeAll(mediaFiles);
                            handler.sendMessage(handler.obtainMessage(NEED_REFRESH_FILE_LIST, null));
                            handler.sendMessage(handler.obtainMessage(HIDE_PROGRESS_DIALOG,null));
                            sendSelectedToText();
                        }
                    });
                }

                @Override
                public void onFailure(DJIError djiError) {
                    handler.sendMessage(handler.obtainMessage(HIDE_PROGRESS_DIALOG,null));
                    handler.sendMessage(handler.obtainMessage(SHOW_TOAST,"deleteFiles error:"+djiError.getDescription()));
                }
            });
        }
        else
        {
            handler.sendMessage(handler.obtainMessage(SHOW_TOAST,"There are no selected files. "));
        }
    }



    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        DJISampleApplication.getEventBus().post(new MainActivity.RequestStartFullScreenEvent());
        isDialogAllowable = true;
        initDJIMedia();
    }

    @Override
    protected void onDetachedFromWindow() {
        DJISampleApplication.getEventBus().post(new MainActivity.RequestEndFullScreenEvent());

        if(ModuleVerificationUtil.isProductModuleAvailable())
        {
            aircraft = (Aircraft) DJISDKManager.getInstance().getProduct();
            if(ModuleVerificationUtil.isCameraModuleAvailable() && aircraft.getCamera().isMediaDownloadModeSupported())
            {
                Camera camera = aircraft.getCamera();
                if(camera.isFlatCameraModeSupported())
                {
                    camera.exitPlayback(new CommonCallbacks.CompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {
                            if(djiError != null)
                            {
                                handler.handleMessage(handler.obtainMessage(SHOW_TOAST,"Failed to set download mode:"+djiError.getDescription()));
                            }
                        }
                    });
                }
                else
                {
                    camera.setMode(SettingsDefinitions.CameraMode.SHOOT_PHOTO, new CommonCallbacks.CompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {
                            if(djiError != null)
                            {
                                handler.handleMessage(handler.obtainMessage(SHOW_TOAST,"Failed to set download mode:"+djiError.getDescription()));
                            }
                        }
                    });
                }

            }
        }

        if (DJIMediaList != null) {
            DJIMediaList.clear();
        }
        if(selected != null &&!selected.isEmpty())
        {
            selected.clear();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public int getDescription() {
        return R.string.camera_listview_media_playback;
    }

    // play video status
    private void updateTextView(MediaManager.VideoPlaybackState currentVideoPlaybackState) {
        final StringBuilder pushInfo = new StringBuilder();

        addLineToSB(pushInfo, "Video Playback State", null);
        if (currentVideoPlaybackState != null) {
            if (currentVideoPlaybackState.getPlayingMediaFile() != null) {
                addLineToSB(pushInfo, "media index", currentVideoPlaybackState.getPlayingMediaFile().getIndex());
                addLineToSB(pushInfo, "media size", currentVideoPlaybackState.getPlayingMediaFile().getFileSize());
                addLineToSB(pushInfo,
                        "media duration",
                        currentVideoPlaybackState.getPlayingMediaFile().getDurationInSeconds());
                addLineToSB(pushInfo,
                        "media created date",
                        currentVideoPlaybackState.getPlayingMediaFile().getDateCreated());
                addLineToSB(pushInfo,
                        "media orientation",
                        currentVideoPlaybackState.getPlayingMediaFile().getVideoOrientation());
            } else {
                addLineToSB(pushInfo, "media index", "None");
            }
            addLineToSB(pushInfo, "media current position", currentVideoPlaybackState.getPlayingPosition());
            addLineToSB(pushInfo, "media current status", currentVideoPlaybackState.getPlaybackStatus());
            pushInfo.append("\n");
            setResultToText(pushInfo.toString());
        } else {
            setResultToText("playbackState is null");
        }
    }

    private void setResultToText(String s) {
        final String str = s;
        post(new Runnable() {
            @Override
            public void run() {
                if (tv_playbackInfo == null) {
                    Log.e(TAG, "tv_playbackInfo = null");
                } else {
                    tv_playbackInfo.setText(str);
                }
            }
        });
    }


    private static class ItemHolder extends RecyclerView.ViewHolder {
        ImageView thumbnail_img;
        TextView file_name;
        TextView file_type;
        TextView file_size;
        TextView file_time;
        Button btnPlayVideo;

        public ItemHolder(View itemView) {
            super(itemView);
            this.thumbnail_img = (ImageView) itemView.findViewById(R.id.filethumbnail);
            this.file_name = (TextView) itemView.findViewById(R.id.filename);
            this.file_type = (TextView) itemView.findViewById(R.id.filetype);
            this.file_size = (TextView) itemView.findViewById(R.id.fileSize);
            this.file_time = (TextView) itemView.findViewById(R.id.filetime);
            this.btnPlayVideo = (Button) itemView.findViewById(R.id.btn_PlayVideo);
        }
    }

    private class FileListAdapter extends RecyclerView.Adapter<ItemHolder> {
        @Override
        public int getItemCount() {
            if (DJIMediaList != null) {
                return DJIMediaList.size();
            }
            return 0;
        }

        @Override
        public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.media_info_item, parent, false);
            return new ItemHolder(view);
        }

        @Override
        public void onBindViewHolder(ItemHolder mItemHolder, int index) {

            final MediaFile mediaFile = DJIMediaList.get(index);
            if (mediaFile != null) {
                if (mediaFile.getMediaType() != MediaFile.MediaType.MOV && mediaFile.getMediaType() != MediaFile.MediaType.MP4) {
                    mItemHolder.file_time.setVisibility(View.GONE);
                    mItemHolder.btnPlayVideo.setVisibility(View.GONE);
                } else {
                    mItemHolder.btnPlayVideo.setVisibility(View.VISIBLE);
                    mItemHolder.file_time.setVisibility(View.VISIBLE);
                    mItemHolder.file_time.setText(mediaFile.getDurationInSeconds() + " s");
                }
                mItemHolder.btnPlayVideo.setTag(index);
                mItemHolder.file_name.setText(mediaFile.getFileName());
                mItemHolder.file_type.setText(mediaFile.getMediaType().name());
                mItemHolder.file_size.setText(mediaFile.getFileSize() + " Bytes");
                mItemHolder.thumbnail_img.setImageBitmap(mediaFile.getThumbnail());
                mItemHolder.thumbnail_img.setOnClickListener(ImgOnClickListener);
                mItemHolder.thumbnail_img.setTag(mediaFile);
                mItemHolder.itemView.setTag(index);

                if(selected.contains((Integer)index))
                {
                    mItemHolder.itemView.setSelected(true);
                }
                else
                {
                    mItemHolder.itemView.setSelected(false);
                }

                mItemHolder.itemView.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(!selected.contains((Integer)v.getTag())) {

                            v.setSelected(true);
                            selected.add((Integer)v.getTag());
                            Log.i(TAG, "onClick: key:"+(Integer)v.getTag()+" values:"+mItemHolder.getAdapterPosition());

                        } else {
                            v.setSelected(false);
                            selected.remove((Integer)v.getTag());
                        }
                        sendSelectedToText();
                    }
                });
                mItemHolder.btnPlayVideo.setOnClickListener(btnPlaynClickListener);
            }
        }


    }
    private View.OnClickListener btnPlaynClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {

            mDisplayImageView.setVisibility(View.GONE);
            mBaseCameraView.setVisibility(View.VISIBLE);

            int i = (Integer) (v.getTag());
            mediaManager.playVideoMediaFile(DJIMediaList.get(i), new CommonCallbacks.CompletionCallback() {
                @Override
                public void onResult(DJIError djiError) {
                    if (null != djiError) {
                        handler.sendMessage(handler.obtainMessage(SHOW_TOAST,
                                "Play error:"+djiError.getDescription()));
                    } else {
                        Log.e(TAG, "Play Video");
                    }
                }
            });
        }
    };


    private View.OnClickListener ImgOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            MediaFile selectedMedia = (MediaFile) v.getTag();
            if (selectedMedia != null && DJIMediaList != null) {

                mDisplayImageView.setVisibility(View.VISIBLE);
                mBaseCameraView.setVisibility(View.GONE);

                addMediaTask(selectedMedia);
            }
        }
    };


    private void addMediaTask(final MediaFile mediaFile) {
        mediaManager = DJISampleApplication.getProductInstance().getCamera().getMediaManager();
        scheduler = mediaManager.getScheduler();
        final FetchMediaTask task =
                new FetchMediaTask(mediaFile, FetchMediaTaskContent.PREVIEW, taskCallback);
        scheduler.moveTaskToNext(task);
    }
}

