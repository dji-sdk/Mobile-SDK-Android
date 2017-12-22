package com.dji.sdk.sample.demo.missionmanager;

import android.app.Service;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.PresentableView;
import dji.common.flightcontroller.FlightMode;
import dji.sdk.flightcontroller.FlightController;

/**
 * Class for basic manager view in mission manager
 */
public abstract class MissionBaseView extends RelativeLayout implements View.OnClickListener, PresentableView {

    protected FlightController flightController;

    protected Button simulatorBtn;
    protected Button maxAltitudeBtn;
    protected Button maxRadiusBtn;

    protected Button loadBtn;
    protected Button uploadBtn;
    protected Button startBtn;
    protected Button stopBtn;
    protected Button pauseBtn;
    protected Button resumeBtn;
    protected Button downloadBtn;

    protected TextView missionPushInfoTV;
    protected TextView FCPushInfoTV;
    protected ProgressBar progressBar;

    protected double homeLatitude = 181;
    protected double homeLongitude = 181;
    protected FlightMode flightState = null;

    public MissionBaseView(Context context) {
        super(context);
        initUI(context);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    private void showLongitudeLatitude() {
        ToastUtils.setResultToText(FCPushInfoTV,
                                   "Home point latitude: "
                                       + homeLatitude
                                       + "\n"
                                       + "Home point longitude: "
                                       + homeLongitude
                                       + "\n"
                                       + "Flight state: "
                                       + (flightState == null ? "" : flightState.name()));
    }

    private void initUI(Context context) {
        setClickable(true);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);

        layoutInflater.inflate(R.layout.view_mission, this, true);

        missionPushInfoTV = (TextView) findViewById(R.id.tv_mission_info);
        FCPushInfoTV = (TextView) findViewById(R.id.tv_fc_info);
        loadBtn = (Button) findViewById(R.id.btn_load);
        uploadBtn = (Button) findViewById(R.id.btn_upload);
        startBtn = (Button) findViewById(R.id.btn_start);
        stopBtn = (Button) findViewById(R.id.btn_stop);
        pauseBtn = (Button) findViewById(R.id.btn_pause);
        resumeBtn = (Button) findViewById(R.id.btn_resume);
        downloadBtn = (Button) findViewById(R.id.btn_download);
        progressBar = (ProgressBar) findViewById(R.id.pb_mission);
        simulatorBtn = (Button) findViewById(R.id.btn_simulator);
        maxAltitudeBtn = (Button) findViewById(R.id.btn_set_maximum_altitude);
        maxRadiusBtn = (Button) findViewById(R.id.btn_set_maximum_radius);

        loadBtn.setOnClickListener(this);
        uploadBtn.setOnClickListener(this);
        startBtn.setOnClickListener(this);
        stopBtn.setOnClickListener(this);
        pauseBtn.setOnClickListener(this);
        resumeBtn.setOnClickListener(this);
        downloadBtn.setOnClickListener(this);
        simulatorBtn.setOnClickListener(this);
        maxRadiusBtn.setOnClickListener(this);
        maxAltitudeBtn.setOnClickListener(this);
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }
}
