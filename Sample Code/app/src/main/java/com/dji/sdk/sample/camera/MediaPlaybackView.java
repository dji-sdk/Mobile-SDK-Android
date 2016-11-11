package com.dji.sdk.sample.camera;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.app.Service;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.common.DJISampleApplication;
import com.dji.sdk.sample.common.MainActivity;

import java.util.ArrayList;
import dji.common.camera.DJICameraSettingsDef;
import dji.common.error.DJIError;
import dji.common.util.DJICommonCallbacks;
import dji.sdk.base.DJIBaseProduct;
import dji.sdk.camera.DJIMedia;
import dji.sdk.camera.DJIMediaManager;

public class MediaPlaybackView extends RelativeLayout implements DJIMediaManager.MediaUpdatedVideoPlaybackStateCallback {
    private static final String TAG = MediaPlaybackView.class.getName();

    final Context context = getContext();
    Activity activity = (Activity)context;

    private DJIBaseProduct mProduct;
    private DJIMediaManager mMediaManager;
    private ArrayList<DJIMedia> mDJIMediaList = new ArrayList<DJIMedia>();
    private ArrayList<Bitmap> mThumbnails = new ArrayList<Bitmap>();

    protected int fileIndex;
    private boolean mIsDialogAllowable = false;

    private FileListAdapter mListAdapter;
    private ProgressDialog mDialog;
    private ProgressDialog mDownloadDialog;
    private DJICameraSettingsDef.CameraMode mode;

    public TextView tv_playbackInfo;
    public Button btnResume;
    public Button btnPause;
    public Button btnStop;
    public Button btnSkip;
    public Button btnStatus;

    private final int SHOWTOAST = 1;
    private final int SHOW_PROGRESS_DIALOG = 2;
    private final int HIDE_PROGRESS_DIALOG = 3;
    private final int SHOW_DOWNLOAD_PROGRESS_DIALOG = 4;
    private final int HIDE_DOWNLOAD_PROGRESS_DIALOG = 5;
    private final int FETCH_FILE_LIST = 6;
    private final int NEED_REFRESH_FILE_LIST = 7;
    private final int GET_THUMBNAILS = 8;

    private Handler handler = new Handler(new Handler.Callback() {

        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case SHOWTOAST:
                    setResultToToast((String) msg.obj);
                    break;
                case SHOW_PROGRESS_DIALOG:
                    ShowProgressDialog();
                    break;
                case HIDE_PROGRESS_DIALOG:
                    HideProgressDialog();
                    break;
                case SHOW_DOWNLOAD_PROGRESS_DIALOG:
                    ShowDownloadProgressDialog();
                    break;
                case HIDE_DOWNLOAD_PROGRESS_DIALOG:
                    HideDownloadProgressDialog();
                    break;
                case FETCH_FILE_LIST:
                    getFileList();
                    break;
                case NEED_REFRESH_FILE_LIST:
                    mListAdapter.notifyDataSetChanged();

                    break;
                default:
                    break;
            }
            return false;
        }
    });

    private void setResultToToast(final String result) {
        activity.runOnUiThread(new Runnable() {
            public void run() {
                Toast.makeText(context, result, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void CreateProgressDialog() {

        mDialog = new ProgressDialog(context);
        mDialog.setMessage(context.getResources().getString(R.string.Message_Waiting));
        mDialog.setCanceledOnTouchOutside(false);
        mDialog.setCancelable(false);

        mDownloadDialog = new ProgressDialog(context);
        mDownloadDialog.setTitle(R.string.sync_file_title);
        mDownloadDialog.setIcon(android.R.drawable.ic_dialog_info);
        mDownloadDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        mDownloadDialog.setCanceledOnTouchOutside(false);
        mDownloadDialog.setCancelable(false);
    }

    private void ShowProgressDialog() {
        if (mDialog != null && mIsDialogAllowable) {
            mDialog.show();
        }
    }

    private void HideProgressDialog() {
        if (null != mDialog && mDialog.isShowing()) {
            mDialog.dismiss();
        }
    }

    private void ShowDownloadProgressDialog() {
        if (mDownloadDialog != null) {
            mDownloadDialog.incrementProgressBy(-mDownloadDialog.getProgress());
            mDownloadDialog.show();
        }
    }

    private void HideDownloadProgressDialog() {
        if (null != mDownloadDialog && mDownloadDialog.isShowing()) {
            mDownloadDialog.dismiss();
        }
    }

    private void getFileList() {
        mThumbnails.clear();
        mDJIMediaList.clear();
        mMediaManager = DJISampleApplication.getProductInstance().getCamera().getMediaManager();
        if (mMediaManager != null) {

            mMediaManager.fetchMediaList(new DJIMediaManager.CameraDownloadListener<ArrayList<DJIMedia>>() {

                @Override
                public void onFailure(DJIError error) {
                    // TODO Auto-generated method stub
                    handler.sendMessage(handler.obtainMessage(HIDE_PROGRESS_DIALOG, null));
                    handler.sendMessage(handler.obtainMessage(SHOWTOAST, error.getDescription()));
                }

                @Override
                public void onProgress(long arg0, long arg1) {
                    Log.d(TAG, "Comes into the success of the getFileList");
                    // TODO Auto-generated method stub

                }

                @Override
                public void onRateUpdate(long arg0, long arg1, long arg2) {
                    Log.d(TAG, "Comes into the success of the getFileList");
                    // TODO Auto-generated method stub

                }

                @Override
                public void onStart() {
                    Log.d(TAG, "Comes into the success of the getFileList");
                    // TODO Auto-generated method stub
                    //				handler.sendMessage(handler.obtainMessage(SHOWTOAST, "Start"));
                }

                @Override
                public void onSuccess(ArrayList<DJIMedia> medias) {
                    Log.d(TAG, "Comes into the success of the getFileList");
                    handler.sendMessage(handler.obtainMessage(HIDE_PROGRESS_DIALOG, null));
                    // TODO Auto-generated method stub
                    if (mDJIMediaList != null) {
                        mDJIMediaList.clear();
                    }
                    for (DJIMedia media : medias) {
                        mDJIMediaList.add(media);
                    }
                    handler.sendMessage(handler.obtainMessage(NEED_REFRESH_FILE_LIST, null));
                    handler.removeMessages(GET_THUMBNAILS);
                }
            });
        }
    }

    void initUI() {

        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Service.LAYOUT_INFLATER_SERVICE);

        View content = layoutInflater.inflate(R.layout.media_playback, null, false);
        addView(content, new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));

        ListView listView = (ListView) findViewById(R.id.filelistView);
        mListAdapter = new FileListAdapter();
        listView.setAdapter(mListAdapter);

        CreateProgressDialog();

        tv_playbackInfo = (TextView) findViewById(R.id.tv_mediaPushInfo);
        btnResume = (Button) findViewById(R.id.btnResume);
        btnPause = (Button) findViewById(R.id.btnPause);
        btnStop = (Button) findViewById(R.id.btnStop);
        btnSkip = (Button) findViewById(R.id.btnSeek);
        btnStatus = (Button) findViewById(R.id.btnStatus);

        btnResume.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                mMediaManager.resume(new DJICommonCallbacks.DJICompletionCallback() {
                    @Override
                    public void onResult(DJIError error) {
                        if (null != error) {
                            handler.sendMessage(handler.obtainMessage(SHOWTOAST, error.getDescription()));
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
                mMediaManager.pause(new DJICommonCallbacks.DJICompletionCallback() {
                    @Override
                    public void onResult(DJIError error) {
                        if (null != error) {
                            handler.sendMessage(handler.obtainMessage(SHOWTOAST, error.getDescription()));
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
                mMediaManager.stop(new DJICommonCallbacks.DJICompletionCallback() {
                    @Override
                    public void onResult(DJIError error) {
                        if (null != error) {
                            handler.sendMessage(handler.obtainMessage(SHOWTOAST, error.getDescription()));
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
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (tv_playbackInfo.isShown()){
                            tv_playbackInfo.setVisibility(View.INVISIBLE);
                        }else
                        {
                            tv_playbackInfo.setVisibility(View.VISIBLE);
                        }
                    }
                });
            }
        });

        btnSkip.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                // get prompts.xml view
                LayoutInflater li = LayoutInflater.from(context);
                View promptsView = li.inflate(R.layout.prompt_input_number, null);

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

                // set prompts.xml to alertdialog builder
                alertDialogBuilder.setView(promptsView);

                final EditText userInput = (EditText) promptsView.findViewById(R.id.editTextDialogUserInput);

                // set dialog message
                alertDialogBuilder.setCancelable(false)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                String ms = userInput.getText().toString();
                                mMediaManager.moveToPosition(Integer.parseInt(ms),
                                        new DJICommonCallbacks.DJICompletionCallback() {
                                            @Override
                                            public void onResult(DJIError error) {
                                                if (null != error) {
                                                    handler.sendMessage(handler.obtainMessage(
                                                            SHOWTOAST,
                                                            error.getDescription()));
                                                }
                                            }
                                        });
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
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
        try {
            mProduct = DJISampleApplication.getProductInstance();
            Log.e(TAG, "mAircraft get");
        } catch (Exception exception) {
            Log.e(TAG, "mAircraft null");
            mProduct = null;
        }
        if (mProduct == null) {
            mDJIMediaList.clear();
            mListAdapter.notifyDataSetChanged();
            setResultToToast(context.getString(R.string.playback_disconnected));
            return false;
        } else {
            if (null != DJISampleApplication.getProductInstance().getCamera() && DJISampleApplication.getProductInstance()
                    .getCamera()
                    .isMediaDownloadModeSupported()) {
                mMediaManager = DJISampleApplication.getProductInstance().getCamera().getMediaManager();

                if (null != mMediaManager) {
                    if (mMediaManager.isVideoPlaybackSupported()) {
                        mMediaManager.addMediaUpdatedVideoPlaybackStateCallback(this);
                    }
                }

                mode = DJICameraSettingsDef.CameraMode.MediaDownload;

                Log.e(TAG, "Media Test set Camera Mode " + mode);
                DJISampleApplication.getProductInstance().getCamera().setCameraMode(mode, new DJICommonCallbacks.DJICompletionCallback() {
                    @Override
                    public void onResult(DJIError error) {

                        // TODO Auto-generated method stub
                        if (error == null) {
                            Log.e(TAG, "Media Test set Camera Mode success");
                            handler.sendMessage(handler.obtainMessage(SHOW_PROGRESS_DIALOG, null));
                            handler.sendMessageDelayed(handler.obtainMessage(FETCH_FILE_LIST, null), 2000);
                        } else {
                            Log.e(TAG, "Media Test set Camera Mode failure");
                            handler.sendMessage(handler.obtainMessage(SHOWTOAST, error.getDescription()));
                        }
                    }
                });
            } else if (null != DJISampleApplication.getProductInstance().getCamera()
                    && !DJISampleApplication.getProductInstance().getCamera().isMediaDownloadModeSupported()) {
                setResultToToast("Do not support Media list function");
                return false;
            } else {
                setResultToToast(context.getString(R.string.playback_disconnected));
                return false;
            }
        }
        return true;
    }

    public MediaPlaybackView(Context context, AttributeSet attrs){
        super(context, attrs);

    }

    @Override
    protected void onFinishInflate(){
        super.onFinishInflate();
    }

    @Override
    protected void onAttachedToWindow(){
        Log.d(TAG, "onAttachedToWindow");
        super.onAttachedToWindow();
        ((MainActivity)getContext()).getSupportActionBar().hide();
        ((MainActivity)getContext()).setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        mIsDialogAllowable = true;
        initUI();
        initDJIMedia();
    }

    @Override
    protected void onDetachedFromWindow() {
        ((MainActivity)getContext()).setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ((MainActivity)getContext()).getSupportActionBar().show();
        try {
            DJISampleApplication.getProductInstance()
                    .getCamera()
                    .setCameraMode(DJICameraSettingsDef.CameraMode.ShootPhoto, new DJICommonCallbacks.DJICompletionCallback() {
                        @Override
                        public void onResult(DJIError mError) {

                        }
                    });
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (mDJIMediaList != null) {
            mDJIMediaList.clear();
        }

        super.onDetachedFromWindow();
    }

    @Override
    public void onResult(DJIMediaManager.VideoPlaybackState videoPlaybackState) {
        updateTextView(videoPlaybackState);
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

            fileIndex = index;
            final ItemHolder mItemHolder;

            if (convertView == null) {
                convertView = LayoutInflater.from(context).inflate(R.layout.media_info_item, null);

                mItemHolder = new ItemHolder();
                mItemHolder.file_name = (TextView) convertView.findViewById(R.id.filename);
                mItemHolder.btnPlayVideo = (Button) convertView.findViewById(R.id.btn_PlayVideo);
                convertView.setTag(mItemHolder);
            } else {
                mItemHolder = (ItemHolder) convertView.getTag();
            }

            if (mDJIMediaList.size() != 0) {
                final DJIMedia media = mDJIMediaList.get(index);

                if (media.getMediaType() != DJIMedia.MediaType.M4V &&
                        media.getMediaType() != DJIMedia.MediaType.MOV &&
                        media.getMediaType() != DJIMedia.MediaType.MP4) {
                    mItemHolder.btnPlayVideo.setVisibility(View.GONE);
                } else {
                    mItemHolder.btnPlayVideo.setVisibility(View.VISIBLE);
                }

                mItemHolder.file_name.setText(mDJIMediaList.get(index).getFileName());

                mItemHolder.btnPlayVideo.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mMediaManager.playVideo(mDJIMediaList.get(index), new DJICommonCallbacks.DJICompletionCallback() {
                            @Override
                            public void onResult(DJIError error) {
                                if (null != error) {
                                    handler.sendMessage(handler.obtainMessage(SHOWTOAST, error.getDescription()));
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
            if (null != mDJIMediaList) {
                return mDJIMediaList.size();
            }
            return 0;
        }

        @Override
        public Object getItem(int index) {
            if (mDJIMediaList.size() > index) {
                return mDJIMediaList.get(index);
            }
            return null;
        }

        @Override
        public long getItemId(int id) {
            return id;
        }
    }

    private void updateTextView(DJIMediaManager.VideoPlaybackState currentVideoPlaybackState) {
        final StringBuffer pushInfo = new StringBuffer();

        addLineToSB(pushInfo, "Video Playback State", null);
        if (currentVideoPlaybackState != null) {
            if (currentVideoPlaybackState.getPlayingMedia() != null) {
                addLineToSB(pushInfo, "media index", currentVideoPlaybackState.getPlayingMedia().getId());
                addLineToSB(pushInfo, "media size", currentVideoPlaybackState.getPlayingMedia().fileSize);
                addLineToSB(pushInfo, "media duration", currentVideoPlaybackState.getPlayingMedia().durationSeconds);
                addLineToSB(pushInfo,
                        "media created date",
                        currentVideoPlaybackState.getPlayingMedia().getCreatedDate());
                addLineToSB(pushInfo,
                        "media orientation",
                        currentVideoPlaybackState.getPlayingMedia().getVideoOrientation());
            } else {
                addLineToSB(pushInfo, "media index", "None");
            }
            addLineToSB(pushInfo, "media current position", currentVideoPlaybackState.getPlayingPosition());
            addLineToSB(pushInfo, "media current status", currentVideoPlaybackState.getPlaybackStatus());
            setResultToText(pushInfo.toString());
            pushInfo.append("\n");

        }else
        {
            setResultToText("playbackState is null");
        }

    }

    private void addLineToSB(StringBuffer sb, String name, Object value) {
        if (sb == null) return;
        sb.
                append((name == null || "".equals(name)) ? "" : name + ": ").
                append(value == null ? "" : value + "").
                append("\n");
    }

    private void setResultToText(String s) {
        final String str = s;
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (tv_playbackInfo == null) {
                    Toast.makeText(context, "textview = null", Toast.LENGTH_SHORT).show();
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
