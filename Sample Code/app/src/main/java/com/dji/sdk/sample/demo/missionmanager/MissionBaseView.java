package com.dji.sdk.sample.demo.missionmanager;

import android.app.Service;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.PresentableView;

import org.jetbrains.annotations.NotNull;

import dji.common.error.DJIError;
import dji.common.flightcontroller.FlightControllerState;
import dji.common.flightcontroller.FlightMode;
import dji.common.flightcontroller.ObstacleDetectionSector;
import dji.common.flightcontroller.VisionDetectionState;
import dji.common.flightcontroller.flightassistant.PerceptionInformation;
import dji.common.util.CommonCallbacks;
import dji.sdk.flightcontroller.FlightAssistant;
import dji.sdk.flightcontroller.FlightController;
import dji.sdk.products.Aircraft;

/**
 * Class for basic manager view in mission manager
 */
public abstract class MissionBaseView extends RelativeLayout implements View.OnClickListener, PresentableView {

    protected FlightController flightController = null;
    protected FlightAssistant flightAssistant = null;

    protected TextView FCPushInfoTV;
    protected TextView missionPushInfoTV;
    protected TextView obstaclePushInfoTV;
    protected Button loadBtn;
    protected Button uploadBtn;
    protected Button startBtn;
    protected Button stopBtn;
    protected Button pauseBtn;
    protected Button resumeBtn;

    public MissionBaseView(Context context) {
        super(context);
        initUI(context);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    private void initUI(Context context) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.view_mission, this, true);

        FCPushInfoTV = (TextView) findViewById(R.id.tv_fc_info);
        missionPushInfoTV = (TextView) findViewById(R.id.tv_mission_info);
        obstaclePushInfoTV = (TextView) findViewById(R.id.tv_obstacle_info);
        loadBtn = (Button) findViewById(R.id.btn_load);
        uploadBtn = (Button) findViewById(R.id.btn_upload);
        startBtn = (Button) findViewById(R.id.btn_start);
        stopBtn = (Button) findViewById(R.id.btn_stop);
        pauseBtn = (Button) findViewById(R.id.btn_pause);
        resumeBtn = (Button) findViewById(R.id.btn_resume);

        loadBtn.setOnClickListener(this);
        uploadBtn.setOnClickListener(this);
        startBtn.setOnClickListener(this);
        stopBtn.setOnClickListener(this);
        pauseBtn.setOnClickListener(this);
        resumeBtn.setOnClickListener(this);

        setupListener();
    }

    private void setupListener() {
        if (ModuleVerificationUtil.isFlightControllerAvailable()) {
        flightController = DJISampleApplication.getAircraftInstance().getFlightController();
            flightController.setStateCallback(new FlightControllerState.Callback() {
                @Override
                public void onUpdate(@NotNull FlightControllerState state) {
                    if (state.isLandingConfirmationNeeded()) {
                        flightController.confirmLanding(new CommonCallbacks.CompletionCallback() {
                            @Override
                            public void onResult(DJIError djiError) { }
                        });
                    }

                    if (ModuleVerificationUtil.isMatrice300RTK() && state.isActiveBrakeEngaged()) {
                        ToastUtils.setResultToToast("M300 Mission paused by obstacles.");
                    }

                    String result = "Flight mode state: " + state.getFlightMode() + "\n" +
                            "Aircraft latitude: " + state.getAircraftLocation().getLatitude() + "\n" +
                            "Aircraft longitude: " + state.getAircraftLocation().getLongitude() + "\n" +
                            "Aircraft altitude: " + state.getAircraftLocation().getAltitude() + "\n";
                    ToastUtils.setResultToText(FCPushInfoTV, result);
                }
            });

            flightAssistant = flightController.getFlightAssistant();
            if (flightAssistant != null) {
                if (ModuleVerificationUtil.isMatrice300RTK()) {
                    flightAssistant.setVisualPerceptionInformationCallback(new CommonCallbacks.CompletionCallbackWith<PerceptionInformation>() {
                        @Override
                        public void onSuccess(PerceptionInformation perceptionInformation) {
                            //Check M300's obstacle data
                        }

                        @Override
                        public void onFailure(DJIError djiError) {

                        }
                    });

                } else {
                    flightAssistant.setVisionDetectionStateUpdatedCallback(new VisionDetectionState.Callback() {
                        @Override
                        public void onUpdate(@NotNull VisionDetectionState state) {
                            ObstacleDetectionSector[] sectors = state.getDetectionSectors();
                            if (sectors != null) {
                                StringBuilder result = new StringBuilder();
                                for (int i = 0; i < sectors.length; i++) {
                                    result.append("Sector ").append(i).append(" warning level: ").append(sectors[i].getWarningLevel()).append("\n");
                                }
                                ToastUtils.setResultToText(obstaclePushInfoTV, result.toString());
                            }
                        }
                    });
                }
            }
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        flightController.setStateCallback(null);
        flightAssistant.setVisualPerceptionInformationCallback(null);
        flightAssistant.setVisionDetectionStateUpdatedCallback(null);
        super.onDetachedFromWindow();
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }
}
