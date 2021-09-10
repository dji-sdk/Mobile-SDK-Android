package com.dji.sdk.sample.demo.camera;

import android.app.AlertDialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.Helper;
import com.dji.sdk.sample.internal.utils.PopupUtils;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.utils.VideoFeedView;
import com.dji.sdk.sample.internal.view.PresentableView;

import dji.sdk.sdkmanager.LiveVideoBitRateMode;
import dji.sdk.sdkmanager.LiveVideoResolution;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import androidx.annotation.NonNull;
import dji.sdk.base.BaseProduct;
import dji.sdk.camera.VideoFeeder;
import dji.sdk.sdkmanager.DJISDKManager;
import dji.sdk.sdkmanager.LiveStreamManager;

import static com.dji.sdk.sample.internal.utils.ToastUtils.showToast;

/**
 * Class for live stream demo.
 *
 * @author Hoker
 * @date 2019/1/28
 * <p>
 * Copyright (c) 2019, DJI All Rights Reserved.
 */
public class LiveStreamView extends LinearLayout implements PresentableView, View.OnClickListener {

    private String liveShowUrl = "please input your live show url here";

    private VideoFeedView primaryVideoFeedView;
    private VideoFeedView fpvVideoFeedView;
    private EditText showUrlInputEdit;

    private Button startLiveShowBtn;
    private Button enableVideoEncodingBtn;
    private Button disableVideoEncodingBtn;
    private Button stopLiveShowBtn;
    private Button soundOnBtn;
    private Button soundOffBtn;
    private Button isLiveShowOnBtn;
    private Button showInfoBtn;
    private Button showLiveStartTimeBtn;
    private Button showCurrentVideoSourceBtn;
    private Button changeVideoSourceBtn;
    private Button startAutoBitBtn;
    private boolean firstTimetoStartAutoBitRate = true;
    private int lastBitRate = 2048;

    private LiveStreamManager.OnLiveChangeListener listener;
    private LiveStreamManager.LiveStreamVideoSource currentVideoSource = LiveStreamManager.LiveStreamVideoSource.Primary;
    private static final String URL_KEY = "sp_stream_url";

    public LiveStreamView(Context context) {
        super(context);
        liveShowUrl = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE).getString(URL_KEY, liveShowUrl);
        initUI(context);
        initListener();
    }

    private void initUI(Context context) {
        setClickable(true);
        setOrientation(VERTICAL);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.view_live_stream, this, true);

        primaryVideoFeedView = (VideoFeedView) findViewById(R.id.video_view_primary_video_feed);
        primaryVideoFeedView.registerLiveVideo(VideoFeeder.getInstance().getPrimaryVideoFeed(), true);

        fpvVideoFeedView = (VideoFeedView) findViewById(R.id.video_view_fpv_video_feed);
        fpvVideoFeedView.registerLiveVideo(VideoFeeder.getInstance().getSecondaryVideoFeed(), false);
        if (Helper.isMultiStreamPlatform()){
            fpvVideoFeedView.setVisibility(VISIBLE);
        }

        showUrlInputEdit = (EditText) findViewById(R.id.edit_live_show_url_input);
        showUrlInputEdit.setText(liveShowUrl);

        startLiveShowBtn = (Button) findViewById(R.id.btn_start_live_show);
        enableVideoEncodingBtn = (Button) findViewById(R.id.btn_enable_video_encode);
        disableVideoEncodingBtn = (Button) findViewById(R.id.btn_disable_video_encode);
        stopLiveShowBtn = (Button) findViewById(R.id.btn_stop_live_show);
        soundOnBtn = (Button) findViewById(R.id.btn_sound_on);
        soundOffBtn = (Button) findViewById(R.id.btn_sound_off);
        isLiveShowOnBtn = (Button) findViewById(R.id.btn_is_live_show_on);
        showInfoBtn = (Button) findViewById(R.id.btn_show_info);
        showLiveStartTimeBtn = (Button) findViewById(R.id.btn_show_live_start_time);
        showCurrentVideoSourceBtn = (Button) findViewById(R.id.btn_show_current_video_source);
        changeVideoSourceBtn = (Button) findViewById(R.id.btn_change_video_source);
        Button setResolutionBtn = (Button) findViewById(R.id.btn_set_resolution);
        Button setBitRateBtn = (Button) findViewById(R.id.btn_set_bit_rate);
        startAutoBitBtn = (Button) findViewById(R.id.btn_auto_bitrate);
        setResolutionBtn.setOnClickListener(this);
        setBitRateBtn.setOnClickListener(this);
        startAutoBitBtn.setOnClickListener(this);

        startLiveShowBtn.setOnClickListener(this);
        enableVideoEncodingBtn.setOnClickListener(this);
        disableVideoEncodingBtn.setOnClickListener(this);
        stopLiveShowBtn.setOnClickListener(this);
        soundOnBtn.setOnClickListener(this);
        soundOffBtn.setOnClickListener(this);
        isLiveShowOnBtn.setOnClickListener(this);
        showInfoBtn.setOnClickListener(this);
        showLiveStartTimeBtn.setOnClickListener(this);
        showCurrentVideoSourceBtn.setOnClickListener(this);
        changeVideoSourceBtn.setOnClickListener(this);
    }

    private void initListener() {
        showUrlInputEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                liveShowUrl = s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        listener = new LiveStreamManager.OnLiveChangeListener() {
            @Override
            public void onStatusChanged(int i) {
                ToastUtils.setResultToToast("status changed : " + i);
            }
        };
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        BaseProduct product = DJISampleApplication.getProductInstance();
        if (product == null || !product.isConnected()) {
            ToastUtils.setResultToToast("Disconnect");
            return;
        }
        if (isLiveStreamManagerOn()){
            DJISDKManager.getInstance().getLiveStreamManager().registerListener(listener);
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (isLiveStreamManagerOn()){
            DJISDKManager.getInstance().getLiveStreamManager().unregisterListener(listener);
        }
    }

    @Override
    public int getDescription() {
        return R.string.component_listview_live_stream;
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }

    void startLiveShow() {
        ToastUtils.setResultToToast("Start Live Show");
        if (!isLiveStreamManagerOn()) {
            return;
        }
        if (DJISDKManager.getInstance().getLiveStreamManager().isStreaming()) {
            ToastUtils.setResultToToast("already started!");
            return;
        }
        new Thread() {
            @Override
            public void run() {
                DJISDKManager.getInstance().getLiveStreamManager().setLiveUrl(liveShowUrl);
                int result = DJISDKManager.getInstance().getLiveStreamManager().startStream();
                DJISDKManager.getInstance().getLiveStreamManager().setStartTime();
                LiveStreamView.this.getContext().getSharedPreferences(LiveStreamView.this.getContext().getPackageName(),
                                                                      Context.MODE_PRIVATE).edit().putString(URL_KEY,liveShowUrl).commit();

                ToastUtils.setResultToToast("startLive:" + result +
                        "\n isVideoStreamSpeedConfigurable:" + DJISDKManager.getInstance().getLiveStreamManager().isVideoStreamSpeedConfigurable() +
                        "\n isLiveAudioEnabled:" + DJISDKManager.getInstance().getLiveStreamManager().isLiveAudioEnabled());
            }
        }.start();
    }

    private void enableReEncoder() {
        if (!isLiveStreamManagerOn()) {
            return;
        }
        DJISDKManager.getInstance().getLiveStreamManager().setVideoEncodingEnabled(true);
        ToastUtils.setResultToToast("Force Re-Encoder Enabled!");
    }

    private void disableReEncoder() {
        if (!isLiveStreamManagerOn()) {
            return;
        }
        DJISDKManager.getInstance().getLiveStreamManager().setVideoEncodingEnabled(false);
        ToastUtils.setResultToToast("Disable Force Re-Encoder!");
    }

    private void stopLiveShow() {
        if (!isLiveStreamManagerOn()) {
            return;
        }
        DJISDKManager.getInstance().getLiveStreamManager().stopStream();
        ToastUtils.setResultToToast("Stop Live Show");
    }

    private void soundOn() {
        if (!isLiveStreamManagerOn()) {
            return;
        }
        DJISDKManager.getInstance().getLiveStreamManager().setAudioMuted(false);
        ToastUtils.setResultToToast("Sound On");
    }

    private void soundOff() {
        if (!isLiveStreamManagerOn()) {
            return;
        }
        DJISDKManager.getInstance().getLiveStreamManager().setAudioMuted(true);
        ToastUtils.setResultToToast("Sound Off");
    }

    private void isLiveShowOn() {
        if (!isLiveStreamManagerOn()) {
            return;
        }
        ToastUtils.setResultToToast("Is Live Show On:" + DJISDKManager.getInstance().getLiveStreamManager().isStreaming());
    }

    private void showInfo() {
        if (!isLiveStreamManagerOn()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Video BitRate:").append(DJISDKManager.getInstance().getLiveStreamManager().getLiveVideoBitRate()).append(" kpbs\n");
        sb.append("Audio BitRate:").append(DJISDKManager.getInstance().getLiveStreamManager().getLiveAudioBitRate()).append(" kpbs\n");
        sb.append("Video FPS:").append(DJISDKManager.getInstance().getLiveStreamManager().getLiveVideoFps()).append("\n");
        sb.append("Video Cache size:").append(DJISDKManager.getInstance().getLiveStreamManager().getLiveVideoCacheSize()).append(" frame");
        sb.append("Video Resolution:").append(DJISDKManager.getInstance().getLiveStreamManager().getLiveVideoResolution());

        ToastUtils.setResultToToast(sb.toString());
    }

    private void showLiveStartTime() {
        if (!isLiveStreamManagerOn()) {
            return;
        }
        if (!DJISDKManager.getInstance().getLiveStreamManager().isStreaming()){
            ToastUtils.setResultToToast("Please Start Live First");
            return;
        }
        long startTime = DJISDKManager.getInstance().getLiveStreamManager().getStartTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",Locale.getDefault());
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(startTime))));
        ToastUtils.setResultToToast("Live Start Time: " + sd);
    }

    private void changeVideoSource() {
        if (!isLiveStreamManagerOn()) {
            return;
        }
        if (!isSupportSecondaryVideo()) {
            return;
        }
        if (DJISDKManager.getInstance().getLiveStreamManager().isStreaming()) {
            ToastUtils.setResultToToast("Before change live source, you should stop live stream!");
            return;
        }
        currentVideoSource = (currentVideoSource == LiveStreamManager.LiveStreamVideoSource.Primary) ?
                LiveStreamManager.LiveStreamVideoSource.Secoundary :
                LiveStreamManager.LiveStreamVideoSource.Primary;
        DJISDKManager.getInstance().getLiveStreamManager().setVideoSource(currentVideoSource);

        ToastUtils.setResultToToast("Change Success ! Video Source : " + currentVideoSource.name());
    }

    private void showCurrentVideoSource(){
        ToastUtils.setResultToToast("Video Source : " + currentVideoSource.name());
    }

    private boolean isLiveStreamManagerOn() {
        if (DJISDKManager.getInstance().getLiveStreamManager() == null) {
            ToastUtils.setResultToToast("No live stream manager!");
            return false;
        }
        return true;
    }

    private boolean isSupportSecondaryVideo(){
        if (!Helper.isMultiStreamPlatform()) {
            ToastUtils.setResultToToast("No secondary video!");
            return false;
        }
        return true;
    }

    private void startOrStopAutoBitRate() {
        if (firstTimetoStartAutoBitRate) {
            DJISDKManager.getInstance().getLiveStreamManager().setLiveVideoBitRateMode(LiveVideoBitRateMode.AUTO);
            showToast("Start Auto Video Bit Rate Success!!!");
            startAutoBitBtn.setText("StopAutoBitRate");
            firstTimetoStartAutoBitRate = false;
            return;
        }
        if (!startAutoBitBtn.getText().toString().contains("Start")) {
            DJISDKManager.getInstance().getLiveStreamManager().setLiveVideoBitRateMode(LiveVideoBitRateMode.MANUAL);
            DJISDKManager.getInstance().getLiveStreamManager().setLiveVideoBitRate(lastBitRate);
            showToast("Stop Auto Video Bit Rate Success!!!");
            startAutoBitBtn.setText("StartAutoBitRate");
        } else {
            DJISDKManager.getInstance().getLiveStreamManager().setLiveVideoBitRateMode(LiveVideoBitRateMode.AUTO);
            showToast("Start Auto Video Bit Rate Success!!!");
            startAutoBitBtn.setText("StopAutoBitRate");
        }
    }

    private void setBitRate() {
        final EditText inputServer = new EditText(this.getContext());
        inputServer.setText("2048");
        inputServer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputServer.setHint(null);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this.getContext());
        builder.setTitle("Set Live Video Bit Rate in Kpbs").setView(inputServer)
               .setNegativeButton("CANCEL", null);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                try {
                    String input = inputServer.getText().toString();
                    int bitRate = Integer.parseInt(input);
                    lastBitRate = bitRate;
                    DJISDKManager.getInstance().getLiveStreamManager().setLiveVideoBitRate(bitRate);
                    showToast("Set Video Bit Rate Success!!!");
                } catch (Exception e) {
                    showToast("data error!" + e.getMessage());
                }
            }
        });
        builder.show();
    }

    private void setResolution() {
        LiveVideoResolution[] resolutions = {
            LiveVideoResolution.VIDEO_RESOLUTION_1920_1080,
            LiveVideoResolution.VIDEO_RESOLUTION_1440_1080,
            LiveVideoResolution.VIDEO_RESOLUTION_1280_960,
            LiveVideoResolution.VIDEO_RESOLUTION_1280_720,
            LiveVideoResolution.VIDEO_RESOLUTION_960_720,
            LiveVideoResolution.VIDEO_RESOLUTION_960_540,
            LiveVideoResolution.VIDEO_RESOLUTION_720_540,
            LiveVideoResolution.VIDEO_RESOLUTION_480_360
        };
        PopupUtils.INSTANCE.initPopupNumberPicker(Helper.makeList(resolutions), new Runnable() {
            @Override
            public void run() {
                DJISDKManager.getInstance().getLiveStreamManager().setLiveVideoResolution(resolutions[PopupUtils.INSTANCE.getIndex()[0]]);
                showToast("Set Video Resolution Success!!!");
                PopupUtils.INSTANCE.resetIndex();
            }
        },this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_start_live_show:
                startLiveShow();
                break;
            case R.id.btn_enable_video_encode:
                enableReEncoder();
                break;
            case R.id.btn_disable_video_encode:
                disableReEncoder();
                break;
            case R.id.btn_stop_live_show:
                stopLiveShow();
                break;
            case R.id.btn_sound_on:
                soundOn();
                break;
            case R.id.btn_sound_off:
                soundOff();
                break;
            case R.id.btn_is_live_show_on:
                isLiveShowOn();
                break;
            case R.id.btn_show_info:
                showInfo();
                break;
            case R.id.btn_show_live_start_time:
                showLiveStartTime();
                break;
            case R.id.btn_show_current_video_source:
                showCurrentVideoSource();
                break;
            case R.id.btn_change_video_source:
                changeVideoSource();
                break;
            case R.id.btn_auto_bitrate:
                startOrStopAutoBitRate();
                break;
            case R.id.btn_set_bit_rate:
                setBitRate();
                break;
            case R.id.btn_set_resolution:
                setResolution();
                break;
            default:
                break;
        }
    }
}
