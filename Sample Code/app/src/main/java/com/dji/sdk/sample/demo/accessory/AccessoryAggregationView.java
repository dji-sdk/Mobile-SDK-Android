package com.dji.sdk.sample.demo.accessory;

import android.app.Service;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.SeekBarValueChangeListener;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.controller.MainActivity;
import com.dji.sdk.sample.internal.audiohandler.AudioRecorderHandler;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.PopupSeekBar;
import com.dji.sdk.sample.internal.view.PresentableView;
import com.squareup.otto.Subscribe;
import dji.common.accessory.AccessoryAggregationState;
import dji.common.accessory.SettingsDefinitions;
import dji.common.accessory.SettingsDefinitions.PlayMode;
import dji.common.accessory.SpeakerState;
import dji.common.accessory.SpotlightState;
import dji.common.error.DJIError;
import dji.common.util.CommonCallbacks;
import dji.keysdk.AccessoryAggregationKey;
import dji.keysdk.DJIKey;
import dji.keysdk.KeyManager;
import dji.sdk.accessory.AccessoryAggregation;
import dji.sdk.accessory.beacon.Beacon;
import dji.sdk.accessory.speaker.AudioFileInfo;
import dji.sdk.accessory.speaker.Speaker;
import dji.sdk.accessory.speaker.TransmissionListener;
import dji.sdk.accessory.spotlight.Spotlight;
import dji.sdk.products.Aircraft;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AccessoryAggregationView extends LinearLayout implements View.OnClickListener, PresentableView {

    protected Button beaconEnabledBtn;
    protected Button spotLightEnabledBtn;
    protected Button setSpotLightBrightnessBtn;
    protected Button setSpeakerVolumeBtn;
    protected Button setPlayModeBtn;
    protected Button stopPlayingBtn;
    protected Button startRecordBtn;
    protected Button stopRecordBtn;

    protected TextView accessoryAggregationStateTV;
    protected TextView spotlightStateTV;
    protected TextView transmittingStateTV;
    protected TextView speakerStateTV;
    private PopupSeekBar popupSeekBar;

    private DJIKey beaconEnabledKey;
    private DJIKey spotlightEnabledKey;
    private DJIKey playModeKey;
    private Speaker speaker;
    private AccessoryAggregation accessoryAggregation;
    private Spotlight spotlight;
    private SpeakerState speakerState;
    private AudioRecorderHandler audioRecoderHandler;
    private CopyOnWriteArrayList<Integer> playingIndexs = new CopyOnWriteArrayList<>();
    private CopyOnWriteArrayList<Integer> fileToDelele = new CopyOnWriteArrayList<>();

    private static final int MSG_ADD_VOICE = 1;
    private static final int MSG_TAKE_VOICE = MSG_ADD_VOICE + 1;
    private static final int TAKE_VOICE_INTERVAL = 100;

    public AccessoryAggregationView(Context context) {
        super(context);
        initUI(context);
        initDJIKey();
    }


    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        updateUI();
        audioRecoderHandler = new AudioRecorderHandler(getContext());
        initAccessoryAggregationCallback();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();

        if (handler !=null) {
            handler.removeCallbacksAndMessages(null);
        }

        if (audioRecoderHandler != null) {
            audioRecoderHandler.release();
            audioRecoderHandler = null;
        }

        destroySpeakerCallback();
        destroySpotlightCallback();
        destroyAccessoryAggregationCallback();
    }

    @Subscribe
    public void onConnectivityChange(MainActivity.ConnectivityChangeEvent event) {
        if (!DJISampleApplication.isAircraftConnected()) {
            destroyAccessoryAggregationCallback();
            return;
        }
        Aircraft aircraft = (Aircraft) DJISampleApplication.getProductInstance();
        if (aircraft == null || aircraft.getAccessoryAggregation() == null) {
            destroyAccessoryAggregationCallback();
            return;
        }
        if (this.accessoryAggregation == null) {
            initAccessoryAggregationCallback();
        }
    }

    private void initUI(Context context) {
        setClickable(true);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.view_accessory_aggregation, this, true);

        accessoryAggregationStateTV = (TextView) findViewById(R.id.tv_accessory_aggregation_state);
        spotlightStateTV = (TextView) findViewById(R.id.tv_spot_light_state);
        transmittingStateTV = (TextView) findViewById(R.id.tv_transmitting_state);
        speakerStateTV = (TextView) findViewById(R.id.tv_speaker_state);
        beaconEnabledBtn = (Button) findViewById(R.id.btn_beacon_enabled);
        spotLightEnabledBtn = (Button) findViewById(R.id.btn_spotlight_enabled);
        setSpotLightBrightnessBtn = (Button) findViewById(R.id.btn_set_spotlight_brightness);
        setSpeakerVolumeBtn = (Button) findViewById(R.id.btn_set_speaker_volume);
        setPlayModeBtn = (Button) findViewById(R.id.btn_set_speaker_play_mode);
        stopPlayingBtn = (Button) findViewById(R.id.btn_stop_playing);
        startRecordBtn = (Button) findViewById(R.id.btn_start_record);
        stopRecordBtn = (Button) findViewById(R.id.btn_stop_record);


        beaconEnabledBtn.setOnClickListener(this);
        spotLightEnabledBtn.setOnClickListener(this);
        setSpotLightBrightnessBtn.setOnClickListener(this);
        setSpeakerVolumeBtn.setOnClickListener(this);
        setPlayModeBtn.setOnClickListener(this);
        stopPlayingBtn.setOnClickListener(this);
        startRecordBtn.setOnClickListener(this);
        stopRecordBtn.setOnClickListener(this);
    }

    private void initDJIKey() {
        beaconEnabledKey = AccessoryAggregationKey.createBeaconKey(AccessoryAggregationKey.BEACON_ENABLED);
        spotlightEnabledKey = AccessoryAggregationKey.createSpotlightKey(AccessoryAggregationKey.SPOTLIGHT_ENABLED);
        playModeKey = AccessoryAggregationKey.createSpeakerKey(AccessoryAggregationKey.PLAY_MODE);
    }

    private void updateUI() {
        if (ModuleVerificationUtil.getBeacon() != null) {
            Boolean isBeaconEnabled = (Boolean) KeyManager.getInstance().getValue(beaconEnabledKey);
            if (isBeaconEnabled !=null && isBeaconEnabled) {
                beaconEnabledBtn.setText(R.string.disable_beacon);
            } else {
                beaconEnabledBtn.setText(R.string.enable_beacon);
            }
        }

        if (ModuleVerificationUtil.getSpotlight() != null) {
            Boolean isSpotlightEnabled = (Boolean) KeyManager.getInstance().getValue(spotlightEnabledKey);
            if (isSpotlightEnabled !=null && isSpotlightEnabled) {
                spotLightEnabledBtn.setText(R.string.disable_spotlight);
            } else {
                spotLightEnabledBtn.setText(R.string.enable_spotlight);
            }
        }

        if (ModuleVerificationUtil.getSpeaker() != null) {
            PlayMode playMode = (PlayMode) KeyManager.getInstance().getValue(playModeKey);
            if (playMode != null && playMode == PlayMode.REPEAT_SINGLE) {
                setPlayModeBtn.setText(R.string.play_mode_single);
            } else {
                setPlayModeBtn.setText(R.string.play_mode_repeat);
            }
        }

    }

    private void initAccessoryAggregationCallback() {
        this.accessoryAggregation = ModuleVerificationUtil.getAccessoryAggregation();
        if (this.accessoryAggregation != null) {
            updateSubcomponents();
            accessoryAggregation.setStateCallback(new AccessoryAggregationState.Callback() {
                @Override
                public void onUpdate(AccessoryAggregationState state) {
                    updateSubcomponents();
                }
            });
        }
    }

    private void destroyAccessoryAggregationCallback() {
        if (accessoryAggregation != null) {
            accessoryAggregation.setStateCallback(null);
            accessoryAggregation = null;
            showAccessoryAggregationState(null);
        }
    }

    private void updateSubcomponents() {
        if (this.accessoryAggregation != null) {
            AccessoryAggregationState aggregationState = accessoryAggregation.getAccessoryAggregationState();
            showAccessoryAggregationState(aggregationState);
            if (aggregationState.isSpeakerConnected()) {
                initSpeakerCallback();
            } else {
                destroySpeakerCallback();
            }

            if (aggregationState.isSpotlightConnected()) {
                initSpotlightStateCallback();
            } else {
                destroySpotlightCallback();
            }
        } else {
            showAccessoryAggregationState(null);
        }

    }

    private void showAccessoryAggregationState(AccessoryAggregationState aggregationState) {
        final StringBuilder sb = new StringBuilder();
        String stateText;
        if (aggregationState != null) {
            stateText = sb.append("Spotlight Connected:")
                          .append(aggregationState.isSpotlightConnected())
                          .append('\n')
                          .append("Speaker Connected:")
                          .append(aggregationState.isSpeakerConnected())
                          .append('\n')
                          .append("Beacon Connected:")
                          .append(aggregationState.isBeaconConnected())
                          .toString();
        } else {
            stateText = "Disconnected!";
        }
        ToastUtils.setResultToText(accessoryAggregationStateTV, stateText);
    }

    private void initSpeakerCallback() {
        this.speaker = ModuleVerificationUtil.getSpeaker();
        if (speaker != null) {
            speaker.setStateCallback(new SpeakerState.Callback() {
                @Override
                public void onUpdate(SpeakerState state) {
                    speakerState = state;
                    showSpeakerState();
                }
            });
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

    private void destroySpeakerCallback() {
        if (speaker != null) {
            handler.removeMessages(MSG_TAKE_VOICE);
            speaker.setStateCallback(null);
            speaker = null;
        }
    }

    private void initSpotlightStateCallback() {
        this.spotlight = ModuleVerificationUtil.getSpotlight();
        if (this.spotlight != null) {
            this.spotlight.setStateCallback(new SpotlightState.Callback() {
                @Override
                public void onUpdate(SpotlightState state) {
                    showSpotlightState(state);
                }
            });
        }
    }

    private void destroySpotlightCallback() {
        if (spotlight != null) {
            spotlight.setStateCallback(null);
            spotlight = null;
            showSpotlightState(null);
        }
    }

    private void showSpotlightState(SpotlightState spotlightState) {
        final StringBuilder sb = new StringBuilder();
        String stateText;
        if (spotlightState != null) {
            stateText = sb.append("Spotlight temperature:")
                          .append(spotlightState.getTemperature())
                          .append('\n')
                          .append("Spotlight Brightness:")
                          .append(spotlightState.getBrightness())
                          .toString();
        } else {
            stateText = "Disconnected!";
        }
        ToastUtils.setResultToText(spotlightStateTV, stateText);
    }

    private void showTransmittingState(String message) {
        SettingsDefinitions.SpeakerDataTransmissionState speakerDataTransmissionState =
            SettingsDefinitions.SpeakerDataTransmissionState.UNKNOWN;
        if (speaker != null) {
            speakerDataTransmissionState = speaker.getDataTransmissionState();
        }

        final StringBuilder sb = new StringBuilder();
        String stateText;
        stateText = sb.append(message)
                      .append('\n')
                      .append("Transmission State:")
                      .append(speakerDataTransmissionState.name())
                      .toString();
        ToastUtils.setResultToText(transmittingStateTV, stateText);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_beacon_enabled:
                enableBeacon();
                break;
            case R.id.btn_spotlight_enabled:
                enableSpotlight();
                break;
            case R.id.btn_set_spotlight_brightness:
                setSpotlightBrightness();
                break;
            case R.id.btn_set_speaker_volume:
                setSpeakerVolume();
                break;
            case R.id.btn_set_speaker_play_mode:
                setPlayMode();
                break;
            case R.id.btn_stop_playing:
                stopPlaying();
                break;
            case R.id.btn_start_record:
                startRecord();
                break;
            case R.id.btn_stop_record:
                stopRecord();
                break;
            default:
                break;
        }
    }

    private void enableBeacon() {
        final Beacon beacon = ModuleVerificationUtil.getBeacon();
        if (beacon != null) {
            Boolean isBeaconEnabled = (Boolean) KeyManager.getInstance().getValue(beaconEnabledKey);
            if (isBeaconEnabled != null && isBeaconEnabled) {
                beacon.setEnabled(false, getCommonCompletionCallback(true));
            } else {
                beacon.setEnabled(true, getCommonCompletionCallback(true));
            }
        } else {
            ToastUtils.setResultToToast("Beacon disconnected!");
        }
    }

    private void enableSpotlight() {
        if (spotlight != null) {
            Boolean isSpotlightEnabled = (Boolean) KeyManager.getInstance().getValue(spotlightEnabledKey);
            if (isSpotlightEnabled != null && isSpotlightEnabled) {
                spotlight.setEnabled(false, getCommonCompletionCallback(true));
            } else {
                spotlight.setEnabled(true, getCommonCompletionCallback(true));
            }
        } else {
            ToastUtils.setResultToToast("Spotlight disconnected!");
        }
    }

    private void setSpotlightBrightness() {
        if (spotlight != null) {
            SeekBarValueChangeListener listener = new SeekBarValueChangeListener() {
                @Override
                public void onValueChange(int val1, int val2) {
                    spotlight.setBrightness(val1, getCommonCompletionCallback(false));
                    popupSeekBar.dismiss();
                }
            };
            SpotlightState state = spotlight.getState();
            initSeekBar("Spotlight Brightness", listener);
            popupSeekBar.showAtLocation(this, Gravity.CENTER, 0, 0);
            if (state != null) {
                popupSeekBar.setProgress(state.getBrightness());
            }
        } else {
            ToastUtils.setResultToToast("Spotlight disconnected!");
        }
    }

    private void setSpeakerVolume() {
        if (speaker != null) {
            SeekBarValueChangeListener listener = new SeekBarValueChangeListener() {
                @Override
                public void onValueChange(int val1, int val2) {
                    speaker.setVolume(val1, getCommonCompletionCallback(false));
                    popupSeekBar.dismiss();
                }
            };
            initSeekBar("Speaker Voulume", listener);
            popupSeekBar.showAtLocation(this, Gravity.CENTER, 0, 0);
            if (speakerState != null) {
                popupSeekBar.setProgress(speakerState.getVolume());
            }
        } else {
            ToastUtils.setResultToToast("Speaker disconnected!");
        }
    }

    private void setPlayMode() {
        if (speaker != null) {
            PlayMode playMode = (PlayMode) KeyManager.getInstance().getValue(playModeKey);
            if (playMode != null && playMode == PlayMode.REPEAT_SINGLE) {
                speaker.setPlayMode(PlayMode.SINGLE_ONCE, getCommonCompletionCallback(true));
            } else {
                speaker.setPlayMode(PlayMode.REPEAT_SINGLE, getCommonCompletionCallback(true));
            }
        } else {
            ToastUtils.setResultToToast("Speaker disconnected!");
        }
    }

    private void stopPlaying() {
        if (speaker != null) {
            speaker.stop(getCommonCompletionCallback(false));
        } else {
            ToastUtils.setResultToToast("Speaker disconnected!");
        }
    }

    private void startRecord() {
        if (speaker != null) {
            long time = Calendar.getInstance().getTimeInMillis();
            AudioFileInfo uploadInfo = new AudioFileInfo("" + time,
                                                         SettingsDefinitions.AudioStorageLocation.TEMPORARY);

            speaker.startTransmission(uploadInfo, new TransmissionListener() {
                @Override
                public void onStart() {
                    showTransmittingState("Transmit started");
                    if (!handler.hasMessages(MSG_TAKE_VOICE)) {
                        handler.sendEmptyMessageDelayed(MSG_TAKE_VOICE, TAKE_VOICE_INTERVAL);
                    }
                    startRecordUsingMic(speaker);
                }

                @Override
                public void onProgress(int dataSize) {
                    showTransmittingState("Transmitting:"+"Size:"+dataSize);
                }

                @Override
                public void onFinish(int index) {
                    showTransmittingState("Transmit finished!"+index);
                    handler.sendMessage(handler.obtainMessage(MSG_ADD_VOICE, index, 0));
                }

                @Override
                public void onFailure(DJIError error) {
                    showTransmittingState("Transmit failure:"+error.getDescription());
                }
            });

        } else {
            ToastUtils.setResultToToast("Speaker disconnected!");
        }
    }

    private void stopRecord() {
        if (speaker != null) {
            if (audioRecoderHandler != null) {
                audioRecoderHandler.stopRecord();
            }
        } else {
            ToastUtils.setResultToToast("Speaker disconnected!");
        }
    }

    private void startRecordUsingMic(final Speaker speaker) {
        if (audioRecoderHandler != null) {
            audioRecoderHandler.startRecord(new AudioRecorderHandler.AudioRecordingCallback() {
                @Override
                public void onRecording(byte[] data) {
                    if (speaker != null) {
                        speaker.paceData(data);
                    }
                }

                @Override
                public void onStopRecord(String savedPath) {
                    if (speaker != null) {
                        speaker.markEOF();
                    }
                    audioRecoderHandler.deleteLastRecordFile();
                }
            });
        }
    }

    private void handleAddVoice(int index) {
        playingIndexs.add(index);
    }

    private void handleTakeVoice() {
        if (speakerState == null) {
            for (Integer index : fileToDelele) {
                deleteFile(index);
            }
            fileToDelele.clear();
        } else if (speakerState != null
            && speakerState.getPlayingState() != SettingsDefinitions.SpeakerPlayingState.PLAYING) {
            if (playingIndexs.size() > 0) {
                int index = playingIndexs.get(0);
                playVoice(index);
                playingIndexs.remove(0);
            }
            for (Integer index : fileToDelele) {
                deleteFile(index);
            }
            fileToDelele.clear();
        } else {
            if (!fileToDelele.contains(speakerState.getPlayingIndex())) {
                fileToDelele.add(speakerState.getPlayingIndex());
            }
        }
        handler.sendEmptyMessageDelayed(MSG_TAKE_VOICE, TAKE_VOICE_INTERVAL);
    }

    private Handler handler = new Handler(new Handler.Callback() {

        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case MSG_ADD_VOICE:
                    handleAddVoice(msg.arg1);
                    break;
                case MSG_TAKE_VOICE:
                    handleTakeVoice();
                    break;
            }
            return false;
        }
    });

    private void playVoice(final int index) {
        if (speaker != null) {
            speaker.play(index, getCommonCompletionCallback(false));
        } else {
            ToastUtils.setResultToToast("Speaker disconnected!");
        }
    }

    private void deleteFile(final int index) {
        if (speaker != null) {
            ArrayList<Integer> indexes = new ArrayList<>();
            indexes.add(index);
            speaker.delete(indexes, new CommonCallbacks.CompletionCallbackWithTwoParam<List<Integer>, DJIError>() {
                @Override
                public void onSuccess(List<Integer> integers, DJIError error) {
                    ToastUtils.setResultToToast("The file delete success!+Current index" + index);
                }

                @Override
                public void onFailure(DJIError error) {
                    ToastUtils.setResultToToast("The file delete failed!" + error.getDescription());
                }
            });
        } else {
            ToastUtils.setResultToToast("Speaker disconnected!");
        }
    }

    private void initSeekBar(String tag, SeekBarValueChangeListener listener) {
        popupSeekBar = new PopupSeekBar(getContext(), 0, 100, tag, listener, 300, 150, 0);
    }

    private CommonCallbacks.CompletionCallback getCommonCompletionCallback(final boolean shouldUpdateUI) {
        return new CommonCallbacks.CompletionCallback() {
            @Override
            public void onResult(DJIError djiError) {
                if (shouldUpdateUI) {
                    post(new Runnable() {
                        @Override
                        public void run() {
                            updateUI();
                        }
                    });
                }
                ToastUtils.setResultToToast(djiError == null ? "Succeed!" : "failed!" + djiError.getDescription());
            }
        };
    }


    @Override
    public int getDescription() {
        return R.string.component_listview_accessory_aggregation;
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }

}
