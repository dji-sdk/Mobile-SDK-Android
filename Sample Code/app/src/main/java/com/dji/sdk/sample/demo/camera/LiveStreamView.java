package com.dji.sdk.sample.demo.camera;

import android.app.Service;
import android.content.Context;
import android.support.annotation.NonNull;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.PresentableView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import dji.sdk.base.BaseProduct;
import dji.sdk.sdkmanager.DJISDKManager;
import dji.sdk.sdkmanager.LiveStreamManager;

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
    private LiveStreamManager.OnLiveChangeListener listener;

    public LiveStreamView(Context context) {
        super(context);
        initUI(context);
        initListener();
    }

    private void initUI(Context context) {
        setClickable(true);
        setOrientation(VERTICAL);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.view_live_stream, this, true);

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

        startLiveShowBtn.setOnClickListener(this);
        enableVideoEncodingBtn.setOnClickListener(this);
        disableVideoEncodingBtn.setOnClickListener(this);
        stopLiveShowBtn.setOnClickListener(this);
        soundOnBtn.setOnClickListener(this);
        soundOffBtn.setOnClickListener(this);
        isLiveShowOnBtn.setOnClickListener(this);
        showInfoBtn.setOnClickListener(this);
        showLiveStartTimeBtn.setOnClickListener(this);
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
                ToastUtils.setResultToToast("startLive:" + result +
                        "\n isVideoStreamSpeedConfigurable:" + DJISDKManager.getInstance().getLiveStreamManager().isVideoStreamSpeedConfigurable() +
                        "\n isLiveAudioEnabled:" + DJISDKManager.getInstance().getLiveStreamManager().isLiveAudioEnabled());
            }
        }.start();
    }

    void enableReEncoder() {
        if (!isLiveStreamManagerOn()) {
            return;
        }
        DJISDKManager.getInstance().getLiveStreamManager().setVideoEncodingEnabled(true);
        ToastUtils.setResultToToast("Force Re-Encoder Enabled!");
    }

    void disableReEncoder() {
        if (!isLiveStreamManagerOn()) {
            return;
        }
        DJISDKManager.getInstance().getLiveStreamManager().setVideoEncodingEnabled(false);
        ToastUtils.setResultToToast("Disable Force Re-Encoder!");
    }

    void stopLiveShow() {
        if (!isLiveStreamManagerOn()) {
            return;
        }
        DJISDKManager.getInstance().getLiveStreamManager().stopStream();
        ToastUtils.setResultToToast("Stop Live Show");
    }

    void soundOn() {
        if (!isLiveStreamManagerOn()) {
            return;
        }
        DJISDKManager.getInstance().getLiveStreamManager().setAudioMuted(false);
        ToastUtils.setResultToToast("Sound On");
    }

    void soundOff() {
        if (!isLiveStreamManagerOn()) {
            return;
        }
        DJISDKManager.getInstance().getLiveStreamManager().setAudioMuted(true);
        ToastUtils.setResultToToast("Sound Off");
    }

    void isLiveShowOn() {
        if (!isLiveStreamManagerOn()) {
            return;
        }
        ToastUtils.setResultToToast("Is Live Show On:" + DJISDKManager.getInstance().getLiveStreamManager().isStreaming());
    }

    void showInfo() {
        if (!isLiveStreamManagerOn()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Video BitRate:").append(DJISDKManager.getInstance().getLiveStreamManager().getLiveVideoBitRate()).append(" kpbs\n");
        sb.append("Audio BitRate:").append(DJISDKManager.getInstance().getLiveStreamManager().getLiveAudioBitRate()).append(" kpbs\n");
        sb.append("Video FPS:").append(DJISDKManager.getInstance().getLiveStreamManager().getLiveVideoFps()).append("\n");
        sb.append("Video Cache size:").append(DJISDKManager.getInstance().getLiveStreamManager().getLiveVideoCacheSize()).append(" frame");
        ToastUtils.setResultToToast(sb.toString());
    }

    void showLiveStartTime() {
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

    private boolean isLiveStreamManagerOn() {
        if (DJISDKManager.getInstance().getLiveStreamManager() == null) {
            ToastUtils.setResultToToast("no live stream manager!");
            return false;
        }
        return true;
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
            default:
                break;
        }
    }
}
