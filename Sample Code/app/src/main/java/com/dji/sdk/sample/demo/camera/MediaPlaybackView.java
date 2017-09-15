package com.dji.sdk.sample.demo.camera;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.controller.MainActivity;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.PresentableView;
import dji.common.camera.SettingsDefinitions;
import dji.common.error.DJIError;
import dji.common.util.CommonCallbacks;
import dji.sdk.base.BaseProduct;
import dji.sdk.camera.MediaFile;
import dji.sdk.camera.MediaManager;
import java.util.ArrayList;
import java.util.List;

public class MediaPlaybackView extends LinearLayout
    implements MediaManager.VideoPlaybackStateListener, PresentableView {
    private static final String TAG = MediaPlaybackView.class.getName();

    private MediaManager mediaManager;
    private List<MediaFile> DJIMediaList = new ArrayList<>();

    private boolean isDialogAllowable = false;

    private FileListAdapter listAdapter;
    private ProgressDialog dialog;

    public TextView tv_playbackInfo;
    public Button btnResume;
    public Button btnPause;
    public Button btnStop;
    public Button btnSkip;
    public Button btnStatus;

    private final int SHOW_TOAST = 1;
    private final int SHOW_PROGRESS_DIALOG = 2;
    private final int HIDE_PROGRESS_DIALOG = 3;
    private final int FETCH_FILE_LIST = 6;
    private final int NEED_REFRESH_FILE_LIST = 7;
    private final int GET_THUMBNAILS = 8;

    private Handler handler = new Handler(new Handler.Callback() {

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
                default:
                    break;
            }
            return false;
        }
    });

    private void createProgressDialog() {

        dialog = new ProgressDialog(getContext());
        dialog.setMessage(getContext().getString(R.string.Message_Waiting));
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);

        ProgressDialog downloadDialog = new ProgressDialog(getContext());
        downloadDialog.setTitle(R.string.sync_file_title);
        downloadDialog.setIcon(android.R.drawable.ic_dialog_info);
        downloadDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        downloadDialog.setCanceledOnTouchOutside(false);
        downloadDialog.setCancelable(false);
    }

    private void showProgressDialog() {
        if (dialog != null && isDialogAllowable) {
            dialog.show();
        }
    }

    private void hideProgressDialog() {
        if (null != dialog && dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    private void getFileList() {
        DJIMediaList.clear();
        mediaManager = DJISampleApplication.getProductInstance().getCamera().getMediaManager();
        if (mediaManager != null) {

            mediaManager.refreshFileList(new CommonCallbacks.CompletionCallback() {
                @Override
                public void onResult(DJIError djiError) {
                    if (djiError == null) {

                        List<MediaFile> medias = mediaManager.getFileListSnapshot();
                        Log.d(TAG, "fetchMediaList onSuccess");
                        handler.sendMessage(handler.obtainMessage(HIDE_PROGRESS_DIALOG, null));
                        if (DJIMediaList != null) {
                            DJIMediaList.clear();
                        }
                        for (MediaFile media : medias) {
                            DJIMediaList.add(media);
                        }
                        handler.sendMessage(handler.obtainMessage(NEED_REFRESH_FILE_LIST, null));
                        handler.removeMessages(GET_THUMBNAILS);
                    } else {
                        handler.sendMessage(handler.obtainMessage(HIDE_PROGRESS_DIALOG, null));
                        handler.sendMessage(handler.obtainMessage(SHOW_TOAST, djiError.getDescription()));
                    }
                }
            });
        }
    }

    private void initUI(Context context) {

        setOrientation(HORIZONTAL);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);

        layoutInflater.inflate(R.layout.media_playback, this, true);

        ListView listView = (ListView) findViewById(R.id.filelistView);
        listAdapter = new FileListAdapter();
        listView.setAdapter(listAdapter);

        createProgressDialog();

        tv_playbackInfo = (TextView) findViewById(R.id.tv_mediaPushInfo);
        btnResume = (Button) findViewById(R.id.btnResume);
        btnPause = (Button) findViewById(R.id.btnPause);
        btnStop = (Button) findViewById(R.id.btnStop);
        btnSkip = (Button) findViewById(R.id.btnSeek);
        btnStatus = (Button) findViewById(R.id.btnStatus);

        btnResume.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaManager.resume(new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError error) {
                        if (null != error) {
                            handler.sendMessage(handler.obtainMessage(SHOW_TOAST, error.getDescription()));
                        } else {
                            Log.e(TAG, "Resume Video Success");
                        }
                    }
                });
            }
        });

        btnPause.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaManager.pause(new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError error) {
                        if (null != error) {
                            handler.sendMessage(handler.obtainMessage(SHOW_TOAST, error.getDescription()));
                        } else {
                            Log.e(TAG, "Pause Video Success");
                        }
                    }
                });
            }
        });

        btnStop.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaManager.stop(new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError error) {
                        if (null != error) {
                            handler.sendMessage(handler.obtainMessage(SHOW_TOAST, error.getDescription()));
                        } else {
                            Log.e(TAG, "Stop Video Success");
                        }
                    }
                });
            }
        });

        btnStatus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
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
            }
        });

        btnSkip.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                // Inflate view and use in alertDialog
                LayoutInflater li = LayoutInflater.from(getContext());
                View promptsView = li.inflate(R.layout.prompt_input_number, null);
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
                alertDialogBuilder.setView(promptsView);

                final EditText userInput = (EditText) promptsView.findViewById(R.id.editTextDialogUserInput);

                // set dialog message
                alertDialogBuilder.setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        String ms = userInput.getText().toString();
                        mediaManager.moveToPosition(Integer.parseInt(ms), new CommonCallbacks.CompletionCallback() {
                            @Override
                            public void onResult(DJIError error) {
                                if (null != error) {
                                    handler.sendMessage(handler.obtainMessage(SHOW_TOAST, error.getDescription()));
                                }
                            }
                        });
                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                // show it
                alertDialog.show();
            }
        });
    }

    private boolean initDJIMedia() {
        BaseProduct product;
        try {
            product = DJISampleApplication.getProductInstance();
        } catch (Exception exception) {
            product = null;
        }
        if (product == null) {
            DJIMediaList.clear();
            listAdapter.notifyDataSetChanged();
            ToastUtils.setResultToToast(getContext().getResources().getString(R.string.playback_disconnected));
            return false;
        } else {
            if (null != DJISampleApplication.getProductInstance().getCamera()
                && DJISampleApplication.getProductInstance().getCamera().isMediaDownloadModeSupported()) {
                mediaManager = DJISampleApplication.getProductInstance().getCamera().getMediaManager();

                if (null != mediaManager) {
                    if (mediaManager.isVideoPlaybackSupported()) {
                        mediaManager.addMediaUpdatedVideoPlaybackStateListener(this);
                    }
                }

                SettingsDefinitions.CameraMode mode = SettingsDefinitions.CameraMode.MEDIA_DOWNLOAD;

                Log.e(TAG, "Media Test set Camera Mode " + mode);
                DJISampleApplication.getProductInstance()
                                    .getCamera()
                                    .setMode(mode, new CommonCallbacks.CompletionCallback() {
                                        @Override
                                        public void onResult(DJIError error) {

                                            if (error == null) {
                                                Log.e(TAG, "Media Test set Camera Mode success");
                                                handler.sendMessage(handler.obtainMessage(SHOW_PROGRESS_DIALOG, null));
                                                handler.sendMessageDelayed(handler.obtainMessage(FETCH_FILE_LIST, null),
                                                                           2000);
                                            } else {
                                                Log.e(TAG, "Media Test set Camera Mode failure");
                                                handler.sendMessage(handler.obtainMessage(SHOW_TOAST,
                                                                                          error.getDescription()));
                                            }
                                        }
                                    });
            } else if (null != DJISampleApplication.getProductInstance().getCamera()
                && !DJISampleApplication.getProductInstance().getCamera().isMediaDownloadModeSupported()) {
                ToastUtils.setResultToToast("Do not support Media list function");
                return false;
            } else {
                ToastUtils.setResultToToast(getContext().getString(R.string.playback_disconnected));
                return false;
            }
        }
        return true;
    }

    public MediaPlaybackView(Context context) {
        super(context);
        initUI(context);
        initDJIMedia();
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
    }

    @Override
    protected void onDetachedFromWindow() {
        DJISampleApplication.getEventBus().post(new MainActivity.RequestEndFullScreenEvent());
        try {
            DJISampleApplication.getProductInstance()
                                .getCamera()
                                .setMode(SettingsDefinitions.CameraMode.SHOOT_PHOTO, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (DJIMediaList != null) {
            DJIMediaList.clear();
        }

        super.onDetachedFromWindow();
    }

    @Override
    public void onUpdate(MediaManager.VideoPlaybackState videoPlaybackState) {
        //post(new Runnable() {
        //    @Override
        //    public void run() {
        //        ToastUtils.setResultToToast(" VideoPlaybackState on Result");
        //    }
        //});
        updateTextView(videoPlaybackState);
    }

    @Override
    public int getDescription() {
        return R.string.camera_listview_media_playback;
    }

    private class FileListAdapter extends BaseAdapter {

        class ItemHolder {
            TextView file_name;
            Button btnPlayVideo;
        }

        public FileListAdapter() {
            super();
        }

        @SuppressLint("InflateParams")
        @Override
        public View getView(final int index, View convertView, ViewGroup parent) {

            final ItemHolder mItemHolder;

            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.media_info_item, null);

                mItemHolder = new ItemHolder();
                mItemHolder.file_name = (TextView) convertView.findViewById(R.id.filename);
                mItemHolder.btnPlayVideo = (Button) convertView.findViewById(R.id.btn_PlayVideo);
                convertView.setTag(mItemHolder);
            } else {
                mItemHolder = (ItemHolder) convertView.getTag();
            }

            if (DJIMediaList.size() != 0) {
                final MediaFile media = DJIMediaList.get(index);

                if (media.getMediaType() != MediaFile.MediaType.MOV
                    && media.getMediaType() != MediaFile.MediaType.MP4) {
                    mItemHolder.btnPlayVideo.setVisibility(View.GONE);
                } else {
                    mItemHolder.btnPlayVideo.setVisibility(View.VISIBLE);
                }

                mItemHolder.file_name.setText(DJIMediaList.get(index).getFileName());

                mItemHolder.btnPlayVideo.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mediaManager.playVideoMediaFile(DJIMediaList.get(index),
                                                        new CommonCallbacks.CompletionCallback() {
                                                            @Override
                                                            public void onResult(DJIError error) {
                                                                if (null != error) {
                                                                    handler.sendMessage(handler.obtainMessage(SHOW_TOAST,
                                                                                                              error.getDescription()));
                                                                } else {
                                                                    Log.e(TAG, "Play Video");
                                                                }
                                                            }
                                                        });
                    }
                });
            } else {
                mItemHolder.file_name.setText("");
            }
            return convertView;
        }

        @Override
        public int getCount() {
            if (null != DJIMediaList) {
                return DJIMediaList.size();
            }
            return 0;
        }

        @Override
        public Object getItem(int index) {
            if (DJIMediaList.size() > index) {
                return DJIMediaList.get(index);
            }
            return null;
        }

        @Override
        public long getItemId(int id) {
            return id;
        }
    }

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

    private static void addLineToSB(StringBuilder sb, String name, Object value) {
        sb.append(name + ": ").
              append(value == null ? "" : value + "").
              append("\n");
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

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }
}
