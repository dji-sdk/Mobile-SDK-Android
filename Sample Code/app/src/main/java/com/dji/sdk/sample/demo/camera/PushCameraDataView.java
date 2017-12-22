package com.dji.sdk.sample.demo.camera;

import android.content.Context;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import com.dji.sdk.sample.internal.view.BasePushDataView;

import dji.common.camera.SystemState;
import dji.sdk.camera.Camera;

/**
 * Class for getting the camera information
 */
public class PushCameraDataView extends BasePushDataView {

    public PushCameraDataView(Context context) {
        super(context);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        if (ModuleVerificationUtil.isCameraModuleAvailable()) {
            try {
                DJISampleApplication.getProductInstance().getCamera().setSystemStateCallback(new SystemState.Callback() {
                    @Override
                    public void onUpdate(SystemState cameraSystemState) {
                        if (null != cameraSystemState) {
                            stringBuffer.delete(0, stringBuffer.length());

                            stringBuffer.append("CameraMode: ").append(cameraSystemState.getMode()).append("\n");
                            stringBuffer.append("isRecord: ").append(cameraSystemState.isRecording()).append("\n");
                            stringBuffer.append("isStoringPhoto: ").append(cameraSystemState.isStoringPhoto()).append("\n");
                            stringBuffer.append("isCameraOverHeated: ")
                                    .append(cameraSystemState.isOverheating())
                                    .append("\n\n");

                            showStringBufferResult();
                        }
                    }
                });
            } catch (Exception exception) {
                //do something
            }

            //Get Thermal Camera Temperature
            try {
                if (DJISampleApplication.getProductInstance().getCamera().isThermalCamera()) {
                    if (DJISampleApplication.getProductInstance().getCamera().getDisplayName() == Camera.DisplayNameXT) {
                        //display thermal temperature
                        DJISampleApplication.getProductInstance()
                                .getCamera()
                                .setThermalTemperatureCallback(new Camera.TemperatureDataCallback() {
                                    @Override
                                    public void onUpdate(float temperature) {

                                        stringBuffer.append("Temperature: ").append(temperature).append("\n");
                                        showStringBufferResult();
                                    }
                                });
                    }
                }
            } catch (Exception e) {
                //do something
            }
        }
    }


    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();

        try {
            if (ModuleVerificationUtil.isCameraModuleAvailable()) {
                DJISampleApplication.getProductInstance().getCamera().setSystemStateCallback(null);
                if (DJISampleApplication.getProductInstance().getCamera().isThermalCamera()) {
                    DJISampleApplication.getProductInstance()
                            .getCamera()
                            .setThermalTemperatureCallback(null);
                }
            }
        } catch (Exception exception) {

        }
    }

    @Override
    public int getDescription() {
        return R.string.camera_listview_push_info;
    }
}
