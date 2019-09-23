package com.dji.sdk.sample.demo.accessory;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.text.InputType;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.audiohandler.AudioDecoder;
import com.dji.sdk.sample.internal.audiohandler.MediaRecorderHandler;
import com.dji.sdk.sample.internal.audiohandler.MediaRecorderOptions;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.controller.MainActivity;
import com.dji.sdk.sample.internal.utils.GeneralUtils;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.PresentableView;

import java.util.ArrayList;
import java.util.List;

import dji.common.accessory.SettingsDefinitions;
import dji.common.accessory.SettingsDefinitions.SpeakerDataTransmissionState;
import dji.common.accessory.SpeakerState;
import dji.common.error.DJIError;
import dji.common.util.CommonCallbacks;
import dji.sdk.accessory.speaker.AudioFileInfo;
import dji.sdk.accessory.speaker.Speaker;
import dji.sdk.accessory.speaker.TransmissionListener;
import dji.sdk.media.AudioMediaFile;
import dji.sdk.media.MediaManager;
import dji.sdk.media.MediaManager.FileListState;

public class AudioFileListManagerView extends LinearLayout implements View.OnClickListener, PresentableView {

    protected Button uploadLocalFileBtn;
    protected Button cancelTransmittingBtn;
    protected Button refreshPlaylistBtn;
    protected Button startRecordBtn;
    protected Button stopRecordBtn;
    protected Button stopPlayBtn;
    protected TextView transmittingStateTV;
    protected TextView speakerStateTV;
    protected TextView recordingStateTV;
    private RecyclerView listView;
    private Bitmap defaultThumb;
    private ProgressDialog mDialog;
    private List<AudioMediaFile> audioMediaFiles = new ArrayList<AudioMediaFile>();
    private FileListAdapter mListAdapter;

    private Speaker speaker;
    private SpeakerState speakerState;
    private String savePath;
    private MediaRecorderHandler mediaRecorderHandler;
    private AudioDecoder audioDecoder;
    private String transmitMessage="";

    private static final int MSG_SHOW_PROGRESS_DIALOG = 1;
    private static final int MSG_FETCH_FILE_LIST = MSG_SHOW_PROGRESS_DIALOG + 1;
    private static final int MSG_HIDE_PROGRESS_DIALOG = MSG_FETCH_FILE_LIST + 1;
    private static final int MSG_REFRESH_FILE_LIST = MSG_HIDE_PROGRESS_DIALOG + 1;
    private static final int MSG_DELETE_AND_REFRESH = MSG_REFRESH_FILE_LIST + 1;
    private static final int MSG_PLAY_AUDIO = MSG_DELETE_AND_REFRESH + 1;
    private static final int MSG_UPDATE_RECORDING_STATE = MSG_PLAY_AUDIO + 1;
    private static final int MSG_DELAY_MILLIS = 200;
    private static final int RECORDING_TIME_DISPLAY_INTERVAL = 1000;
    private static final int MAX_PACE_DATA_SIZE = 36 * 1024;

    public AudioFileListManagerView(Context context) {
        super(context);
        initUI(context);
        savePath = Environment.getExternalStorageDirectory().getPath() + "/DJI/" + context.getPackageName() + "/voice";
        mediaRecorderHandler = new MediaRecorderHandler(savePath, new MediaRecorderOptions.Builder().build());
        audioDecoder = new AudioDecoder();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        DJISampleApplication.getEventBus().post(new MainActivity.RequestStartFullScreenEvent());
        createProgressDialog();
        initSpeakerCallback();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();

        audioDecoder.release();
        if (mDialog != null && mDialog.isShowing()) {
            mDialog.dismiss();
        }

        if (handler !=null) {
            handler.removeCallbacksAndMessages(null);
        }

        destroySpeakerCallback();
        removePlaylistStateListener();
        if (audioMediaFiles != null) {
            audioMediaFiles.clear();
        }
        DJISampleApplication.getEventBus().post(new MainActivity.RequestEndFullScreenEvent());
    }

    private void initUI(Context context) {
        setOrientation(HORIZONTAL);
        setClickable(true);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.view_audio_file_list, this, true);
        transmittingStateTV = (TextView) findViewById(R.id.tv_transmitting_state);
        speakerStateTV = (TextView) findViewById(R.id.tv_speaker_state);
        recordingStateTV = (TextView) findViewById(R.id.tv_recording_state);
        uploadLocalFileBtn = (Button) findViewById(R.id.btn_upload_local_file);
        cancelTransmittingBtn = (Button) findViewById(R.id.btn_cancel_transmitting);
        refreshPlaylistBtn = (Button) findViewById(R.id.btn_fetch_playlist);
        startRecordBtn = (Button) findViewById(R.id.btn_start_record);
        stopRecordBtn = (Button) findViewById(R.id.btn_stop_record);
        stopPlayBtn = (Button) findViewById(R.id.btn_stop_playing);

        uploadLocalFileBtn.setOnClickListener(this);
        cancelTransmittingBtn.setOnClickListener(this);
        refreshPlaylistBtn.setOnClickListener(this);
        startRecordBtn.setOnClickListener(this);
        stopRecordBtn.setOnClickListener(this);
        stopPlayBtn.setOnClickListener(this);
        initAudioFileListView();
    }

    private void initAudioFileListView() {
        listView = (RecyclerView) findViewById(R.id.filelistView);
        LinearLayoutManager
            layoutManager = new LinearLayoutManager(getContext(), OrientationHelper.VERTICAL, false);
        listView.setLayoutManager(layoutManager);
        mListAdapter = new FileListAdapter();
        listView.setAdapter(mListAdapter);
        defaultThumb = BitmapFactory.decodeResource(getResources(), R.drawable.audio);
    }

    private void initSpeakerCallback() {
        this.speaker = ModuleVerificationUtil.getSpeaker();
        if (speaker != null) {
            initPlaylistStateListener();
            speaker.setStateCallback(new SpeakerState.Callback() {
                @Override
                public void onUpdate(SpeakerState state) {
                    speakerState = state;
                    showSpeakerState();
                }
            });
        }
    }

    private void destroySpeakerCallback() {
        if (speaker != null) {
            speaker.setStateCallback(null);
            speaker = null;
        }
    }

    private void showSpeakerState() {
        final StringBuilder sb = new StringBuilder();
        String stateText;
        if (speakerState != null) {
            stateText = sb.append("Playing State:")
                          .append(speakerState.getPlayingState())
                          .append('\n')
                          .append("Playing Mode:")
                          .append(speakerState.getPlayingMode())
                          .append('\n')
                          .append("Speaker Volume:")
                          .append(speakerState.getVolume())
                          .append('\n')
                          .append("Playing index:")
                          .append(speakerState.getPlayingIndex())
                          .append('\n')
                          .append("Storage Type:")
                          .append(speakerState.getStorageLocation())
                          .append('\n')
                          .toString();
        } else {
            stateText = "Disconnected!";
        }
        ToastUtils.setResultToText(speakerStateTV, stateText);
    }

    private void showTransmittingState(String message) {
        SpeakerDataTransmissionState speakerDataTransmissionState = SpeakerDataTransmissionState.UNKNOWN;
        FileListState fileListState = FileListState.UNKNOWN;
        if (speaker != null) {
            speakerDataTransmissionState = speaker.getDataTransmissionState();
            fileListState = speaker.getFileListState();
        }

        final StringBuilder sb = new StringBuilder();
        String stateText;
        stateText = sb.append(message)
                      .append('\n')
                      .append("Transmission State:")
                      .append(speakerDataTransmissionState.name())
                      .append('\n')
                      .append("File List State:")
                      .append(fileListState.name())
                      .toString();
        ToastUtils.setResultToText(transmittingStateTV, stateText);
    }

    private void showRecordingState(int seconds) {
        if (seconds >= 0) {
            int nextSeconds = seconds + 1;
            handler.sendMessageDelayed(handler.obtainMessage(MSG_UPDATE_RECORDING_STATE, nextSeconds, 0),
                                       RECORDING_TIME_DISPLAY_INTERVAL);
        } else {
            if (handler.hasMessages(MSG_UPDATE_RECORDING_STATE)) {
                handler.removeMessages(MSG_UPDATE_RECORDING_STATE);
            }
        }
        final StringBuilder sb = new StringBuilder();
        String stateText;
        sb.append("isRecording:");
        if (seconds >= 0) {
            sb.append("true").append('\n').append("Recording time:").append(seconds+"s");
        } else {
            sb.append("false");
        }
        stateText = sb.toString();
        ToastUtils.setResultToText(recordingStateTV, stateText);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_stop_playing:
                stopPlaying();
                break;
            case R.id.btn_start_record:
                startRecord();
                break;
            case R.id.btn_stop_record:
                stopRecord();
                break;
            case R.id.btn_upload_local_file:
                startTransmitFile();
                break;
            case R.id.btn_cancel_transmitting:
                cancelTransmitting();
                break;
            case R.id.btn_fetch_playlist:
                fetchFileList();
                break;
            default:
                break;
        }
    }

    private void startRecord() {
        if (mediaRecorderHandler != null && !mediaRecorderHandler.isRecording()) {
            mediaRecorderHandler.startRecord();
            handler.sendMessage(handler.obtainMessage(MSG_UPDATE_RECORDING_STATE, 0, 0));
            ToastUtils.setResultToToast("Success!");
        } else {
            ToastUtils.setResultToToast("Failed!");
        }
    }

    private void stopRecord() {
        if (mediaRecorderHandler != null && mediaRecorderHandler.isRecording()) {
            mediaRecorderHandler.stopAndRelease();
            handler.sendMessage(handler.obtainMessage(MSG_UPDATE_RECORDING_STATE, -1, 0));
            ToastUtils.setResultToToast("Success!");
        } else {
            ToastUtils.setResultToToast("Failed!");
        }
    }

    private void startTransmitFile() {
        if (speaker != null) {
            if (TextUtils.isEmpty(mediaRecorderHandler.getFileName())) {
                ToastUtils.setResultToToast("No file to transmit!");
                return;
            }
            if (mediaRecorderHandler != null && mediaRecorderHandler.isRecording()) {
                ToastUtils.setResultToToast("The media is recording!");
                return;
            }
            AudioFileInfo info = new AudioFileInfo(mediaRecorderHandler.getFileName(),
                                                   SettingsDefinitions.AudioStorageLocation.PERSISTENT);
            speaker.startTransmission(info, transmissionListener);
        } else {
            ToastUtils.setResultToToast("Speaker disconnected!");
        }
    }

    private TransmissionListener transmissionListener = new TransmissionListener() {
        @Override
        public void onStart() {
            transmitMessage = "Transmit started";
            showTransmittingState(transmitMessage);
            if (audioDecoder != null) {
                audioDecoder.initMediaDecoder(mediaRecorderHandler.getCurrentFilePath(), decodeProgressListener);
                audioDecoder.startDecoding();
            }
        }

        @Override
        public void onProgress(int dataSize) {
            transmitMessage = "Transmitting:" + "Size:" + dataSize;
            showTransmittingState(transmitMessage);
        }

        @Override
        public void onFinish(int index) {
            transmitMessage = "Transmit finished!" + index;
            showTransmittingState(transmitMessage);
            if (audioDecoder != null) {
                audioDecoder.release();
            }
        }

        @Override
        public void onFailure(DJIError error) {
            transmitMessage = "Transmit failure:" + error.getDescription();
            showTransmittingState(transmitMessage);
            if (audioDecoder != null) {
                audioDecoder.release();
            }
        }
    };

    private AudioDecoder.DecodeProgressListener decodeProgressListener = new AudioDecoder.DecodeProgressListener() {
        @Override
        public void onStarted() {

        }

        @Override
        public void onProgress(byte[] data) {
            paceDataToDJISDK(data);
        }

        @Override
        public void onCompleted() {
            if (speaker != null) {
                speaker.markEOF();
            }
        }
    };

    private void paceDataToDJISDK(byte[] data) {
        int dataLength = data.length;
        int interval = dataLength / MAX_PACE_DATA_SIZE;
        int offesetInLoop = 0;
        for (int i = 0; i <= interval; i++) {
            int realLength;
            if (offesetInLoop + MAX_PACE_DATA_SIZE >= dataLength) {
                realLength = dataLength - offesetInLoop;
            } else {
                realLength = MAX_PACE_DATA_SIZE;
            }
            byte[] devidedDataByte = new byte[realLength];
            System.arraycopy(data, offesetInLoop, devidedDataByte, 0, realLength);
            offesetInLoop += realLength;
            if (speaker != null) {
                speaker.paceData(devidedDataByte);
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void cancelTransmitting() {
        if (speaker != null) {
            speaker.cancelTransmission();
            ToastUtils.setResultToToast("Successed!");
        } else {
            ToastUtils.setResultToToast("Speaker disconnected!");
        }
    }

    private void stopPlaying() {
        if (speaker != null) {
            speaker.stop(GeneralUtils.getCommonCompletionCallback());
        } else {
            ToastUtils.setResultToToast("Speaker disconnected!");
        }
    }

    private void fetchFileList() {
        handler.sendMessage(handler.obtainMessage(MSG_SHOW_PROGRESS_DIALOG, null));
        handler.sendMessageDelayed(handler.obtainMessage(MSG_FETCH_FILE_LIST, null), MSG_DELAY_MILLIS);
    }

    private Handler handler = new Handler(new Handler.Callback() {

        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case MSG_UPDATE_RECORDING_STATE:
                    showRecordingState(msg.arg1);
                    break;
                case MSG_SHOW_PROGRESS_DIALOG:
                    showProgressDialog();
                    break;
                case MSG_FETCH_FILE_LIST:
                    getFilelist();
                    break;
                case MSG_HIDE_PROGRESS_DIALOG:
                    hideProgressDialog();
                    break;
                case MSG_REFRESH_FILE_LIST:
                    mListAdapter.notifyDataSetChanged();
                    break;
                case MSG_DELETE_AND_REFRESH:
                    int index = msg.arg1;
                    if (index < audioMediaFiles.size()) {
                        AudioMediaFile file = audioMediaFiles.remove(msg.arg1);
                    }
                    mListAdapter.notifyDataSetChanged();
                    break;
                case MSG_PLAY_AUDIO:
                    playAudioInList(msg.arg1);
                    break;
            }
            return false;
        }
    });

    private void createProgressDialog() {

        mDialog = new ProgressDialog(getContext());
        mDialog.setMessage(getContext().getString(R.string.Message_Waiting));
        mDialog.setCanceledOnTouchOutside(false);
        mDialog.setCancelable(false);
    }

    private void showProgressDialog() {
        if (mDialog != null) {
            mDialog.show();
        }
    }

    private void hideProgressDialog() {
        if (null != mDialog && mDialog.isShowing()) {
            mDialog.dismiss();
        }
    }

    private MediaManager.FileListStateListener fileListStateListener = new MediaManager.FileListStateListener() {

        @Override
        public void onFileListStateChange(FileListState playlistState) {
            showTransmittingState(transmitMessage);
        }
    };

    private void initPlaylistStateListener() {
        if (speaker != null) {
            showTransmittingState(transmitMessage);
            speaker.addFileListStateListener(fileListStateListener);
            handler.sendMessage(handler.obtainMessage(MSG_SHOW_PROGRESS_DIALOG, null));
            handler.sendMessageDelayed(handler.obtainMessage(MSG_FETCH_FILE_LIST, null), MSG_DELAY_MILLIS);
        } else {
            audioMediaFiles.clear();
            mListAdapter.notifyDataSetChanged();
            ToastUtils.setResultToToast("The Speaker is disconnected!");
        }
    }

    private void getFilelist() {
        if (speaker != null) {
            speaker.refreshFileList(new CommonCallbacks.CompletionCallback() {
                @Override
                public void onResult(DJIError error) {
                    if (null == error) {
                        audioMediaFiles = speaker.getFileListSnapshot();
                        refreshFileList();
                        ToastUtils.setResultToToast("found " + audioMediaFiles.size() + " files");
                    } else {
                        ToastUtils.setResultToToast("Get file list failed:"+error.getDescription());
                    }
                    handler.sendMessage(handler.obtainMessage(MSG_HIDE_PROGRESS_DIALOG, null));
                }
            });
        }
    }

    private void refreshFileList() {
        if (handler.hasMessages(MSG_REFRESH_FILE_LIST)) {
            handler.removeMessages(MSG_REFRESH_FILE_LIST);
        }
        handler.sendMessageDelayed(handler.obtainMessage(MSG_REFRESH_FILE_LIST), MSG_DELAY_MILLIS);
    }

    private void removePlaylistStateListener() {
        if (speaker != null) {
            speaker.removeFileListStateListener(fileListStateListener);
        }
    }

    private class FileListAdapter extends RecyclerView.Adapter<ItemHolder> {
        @Override
        public int getItemCount() {
            if (audioMediaFiles != null) {
                return audioMediaFiles.size();
            }
            return 0;
        }

        @Override
        public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.audio_file_list_item, parent, false);
            return new ItemHolder(view);
        }

        @Override
        public void onBindViewHolder(ItemHolder mItemHolder, final int index) {
            final AudioMediaFile mediaFile = audioMediaFiles.get(index);
            if (mediaFile != null) {
                mItemHolder.thumbnailImgIV.setImageBitmap(defaultThumb);
                mItemHolder.fileNameTV.setText(mediaFile.getFileName());
                mItemHolder.fileDurationTV.setText("duration in Seconds:"+mediaFile.getDurationInSeconds()+"s");
                mItemHolder.fileStorageLocationTV.setText("StorageLocation:"+mediaFile.getAudioStorageLocation());
                mItemHolder.fileIndexTV.setText("File Index:"+mediaFile.getIndex());

                mItemHolder.deleteBtn.setTag(index);
                mItemHolder.deleteBtn.setOnClickListener(onClickListener);
                mItemHolder.playAudioBtn.setTag(index);
                mItemHolder.playAudioBtn.setOnClickListener(onClickListener);
                mItemHolder.renameBtn.setTag(index);
                mItemHolder.renameBtn.setOnClickListener(onClickListener);
            }
        }
    }

    private class ItemHolder extends RecyclerView.ViewHolder {
        ImageView thumbnailImgIV;
        TextView fileNameTV;
        TextView fileDurationTV;
        TextView fileStorageLocationTV;
        TextView fileIndexTV;
        Button renameBtn;
        Button deleteBtn;
        Button playAudioBtn;

        public ItemHolder(View convertView) {
            super(convertView);
            this.thumbnailImgIV = (ImageView) convertView.findViewById(R.id.iv_file_thumbnail);
            this.fileNameTV = (TextView) convertView.findViewById(R.id.tv_file_name);
            this.fileDurationTV = (TextView) convertView.findViewById(R.id.tv_file_duration);
            this.fileStorageLocationTV = (TextView) convertView.findViewById(R.id.tv_file_storage_location);
            this.fileIndexTV = (TextView) convertView.findViewById(R.id.tv_file_index);
            this.renameBtn = (Button) convertView.findViewById(R.id.btn_rename);
            this.deleteBtn = (Button) convertView.findViewById(R.id.btn_delete);
            this.playAudioBtn = (Button) convertView.findViewById(R.id.btn_PlayAudio);
        }
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            int index = (int) v.getTag();
            switch (v.getId()) {
                case R.id.btn_delete:
                    deleteOneFileByIndex(index);
                    break;
                case R.id.btn_PlayAudio:
                    handler.sendMessage(handler.obtainMessage(MSG_PLAY_AUDIO, index, 0));
                    break;
                case R.id.btn_rename:
                    reNameMediaFile(audioMediaFiles.get(index).getIndex());
                    break;
            }
        }
    };

    private void deleteOneFileByIndex(final int index) {
        if (speaker != null && audioMediaFiles.size() > index) {
            ArrayList<Integer> indexes = new ArrayList<>();
            indexes.add(audioMediaFiles.get(index).getIndex());
            speaker.delete(indexes, new CommonCallbacks.CompletionCallbackWithTwoParam<List<Integer>, DJIError>() {
                @Override
                public void onSuccess(List<Integer> integers, DJIError error) {
                    ToastUtils.setResultToToast("The file delete success!+Current index" + audioMediaFiles.get(index)
                                                                                                          .getIndex());
                    handler.sendMessage(handler.obtainMessage(MSG_DELETE_AND_REFRESH, index, 0));
                }

                @Override
                public void onFailure(DJIError error) {
                    ToastUtils.setResultToToast("The file delete failed!" + error.getDescription());
                }
            });
        }
    }

    private void playAudioInList(final int index) {
        if (speaker != null && index < audioMediaFiles.size()) {
            playVoice(audioMediaFiles.get(index).getIndex());
        }
    }

    private void playVoice(final int index) {
        if (speaker != null) {
            speaker.play(index, GeneralUtils.getCommonCompletionCallback());
        } else {
            ToastUtils.setResultToToast("Speaker disconnected!");
        }
    }

    private void reNameMediaFile(final int index) {
        if (speaker != null) {
            final EditText et = getTextInputEditTextInstance();
            new AlertDialog.Builder(getContext()).setTitle("Set File Name")
                                                 .setView(et)
                                                 .setPositiveButton("OK",
                                                                    new DialogInterface.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(DialogInterface dialog,
                                                                                            int id) {
                                                                            reNameFileInSDK(index,
                                                                                            et.getText()
                                                                                              .toString());
                                                                        }
                                                                    })
                                                 .setNegativeButton("Cancel",
                                                                    new DialogInterface.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(DialogInterface dialog,
                                                                                            int id) {

                                                                        }
                                                                    })
                                                 .show();
        } else {
            ToastUtils.setResultToToast("Speaker is disconnected!");
        }
    }

    private void reNameFileInSDK(final int index, String filename) {
        speaker.rename(index, filename, new CommonCallbacks.CompletionCallback() {
            @Override
            public void onResult(DJIError error) {
                if (error != null) {
                    ToastUtils.setResultToToast("Rename Failed!" + error.getDescription());
                } else {
                    ToastUtils.setResultToToast("Rename Success!" + "current index:" + index);
                    audioMediaFiles = speaker.getFileListSnapshot();
                    refreshFileList();
                }
            }
        });
    }
    private EditText getTextInputEditTextInstance() {
        EditText et = new EditText(getContext());
        et.setInputType(InputType.TYPE_CLASS_TEXT);
        return et;
    }



    @Override
    public int getDescription() {
        return R.string.component_listview_audio_file_list_manager;
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }
}
