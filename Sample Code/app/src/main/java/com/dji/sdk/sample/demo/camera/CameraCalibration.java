package com.dji.sdk.sample.demo.camera;


import android.app.Service;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.PresentableView;

import dji.common.camera.DJICameraCalibrateResult;
import dji.common.camera.DJICameraCalibrateState;
import dji.common.error.DJIError;
import dji.common.util.CommonCallbacks;
import dji.sdk.camera.Camera;

public class CameraCalibration extends RelativeLayout implements View.OnClickListener, PresentableView {
    private Button startCalibrationBtn;
    private Button stopCalibrationBtn;
    private Button calibrationInfinityBtn;
    private TextView calibrationState;
    private TextView calibrationResult;
    private Camera camera;
    public CameraCalibration(Context context){
        super(context);
        initUI(context);
    }

    private void initUI(Context context) {
        setClickable(true);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);

        layoutInflater.inflate(R.layout.view_camera_calibration, this);

        startCalibrationBtn = (Button) findViewById(R.id.btn_start_calibration);
        stopCalibrationBtn = (Button) findViewById(R.id.btn_stop_calibration);
        calibrationInfinityBtn = (Button) findViewById(R.id.btn_calibration_infinity_focus);
        calibrationState = findViewById(R.id.tv_camera_calibration_state);
        calibrationResult = findViewById(R.id.tv_camera_calibration_result);

        startCalibrationBtn.setOnClickListener(this);
        stopCalibrationBtn.setOnClickListener(this);
        calibrationInfinityBtn.setOnClickListener(this);
    }

    private void initCallBack(){
        camera.setCalibrationCallback(new Camera.CalibrationCallback() {
            @Override
            public void OnStateUpdate(DJICameraCalibrateState state) {
                ToastUtils.setResultToToast("Calibration State Change to: "+state);
            }

            @Override
            public void OnResultUpdate(DJICameraCalibrateResult result) {
                ToastUtils.setResultToToast("Calibration Result Change to: "+result);
            }
        });
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        camera = DJISampleApplication.getAircraftInstance().getCamera();
        initCallBack();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_start_calibration:
                camera.startCalibration(new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError djiError) {
                        ToastUtils.setResultToToast(djiError == null ? "Start Success!" : djiError.getDescription());
                    }
                });
                break;
            case R.id.btn_stop_calibration:
                camera.stopCalibration(new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError djiError) {
                        ToastUtils.setResultToToast(djiError == null ? "Stop Success!" : djiError.getDescription());
                    }
                });
                break;
            case R.id.btn_calibration_infinity_focus:
                camera.calibratedInfinityFocus(new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError djiError) {
                        ToastUtils.setResultToToast(djiError == null ? "Success!" : djiError.getDescription());
                    }
                });
                break;
            default:
                break;
        }
    }

    @Override
    public int getDescription() {
        return 0;
    }

    @NonNull
    @Override
    public String getHint() {
        return null;
    }
}
