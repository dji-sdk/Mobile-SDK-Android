package com.dji.sdk.sample.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;

import com.dji.sdk.sample.common.BasePushDataView;
import com.dji.sdk.sample.common.DJISampleApplication;

import dji.sdk.Camera.DJICamera;

/**
 * Class for getting the camera information
 */
public class PushCameraDataView extends BasePushDataView {
    public PushCameraDataView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected String getOSDTextResourceString() {
        return "Test";
    }


    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        try {
            DJISampleApplication.getProductInstance().getCamera().setDJICameraUpdatedSystemStateCallback(new DJICamera.CameraUpdatedSystemStateCallback() {
                @Override
                public void onResult(DJICamera.CameraSystemState cameraSystemState) {
                    if (null != cameraSystemState) {
                        mStringBuffer.delete(0, mStringBuffer.length());

                        mStringBuffer.append("CameraMode: ").append(cameraSystemState.getCameraMode()).append("\n");
                        mStringBuffer.append("isRecord: ").append(cameraSystemState.isRecording()).append("\n");
                        mStringBuffer.append("isStoringPhoto: ").append(cameraSystemState.isStoringPhoto()).append("\n");
                        mStringBuffer.append("isCameraOverHeated: ").append(cameraSystemState.isCameraOverHeated()).append("\n\n");

                        mHandler.sendEmptyMessage(CHANGE_TEXT_VIEW);
                    }
                }
            });
        } catch (Exception exception) {
            //do something
        }

        //Get Thermal Camera Temperature
        try {
            if(DJISampleApplication.getProductInstance().getCamera().isThermalImagingCamera()) {
                if (DJISampleApplication.getProductInstance().getCamera().getDisplayName()
                        == DJICamera.DJICameraDisplayNameXT) {
                    //display thermal temperature
                    DJISampleApplication.getProductInstance().getCamera()
                        .setDJIThermalCameraTemperatureDataCallback(
                                new DJICamera.ThermalCameraUpdateTemperatureDataCallback() {
                                    @Override
                                    public void onResult(float temperature) {

                                        mStringBuffer.append("Temperature: ")
                                                .append(temperature).append("\n");
                                        mHandler.sendEmptyMessage(CHANGE_TEXT_VIEW);
                                    }

                                });
                }

            }

        } catch (Exception e) {
            //do something
        }


    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();

        try {
            DJISampleApplication.getProductInstance().getCamera().setDJICameraUpdatedSystemStateCallback(null);
        } catch (Exception exception) {

        }
    }

}
