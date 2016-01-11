package com.dji.sdk.sample.camera;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.common.BaseThreeBtnView;
import com.dji.sdk.sample.common.DJISampleApplication;

import dji.sdk.Camera.DJICameraSettingsDef;
import dji.sdk.base.DJIBaseComponent;
import dji.sdk.base.DJIError;

/**
 * Class for shooting single photo.
 */
public class ShootSinglePhotoView extends BaseThreeBtnView {
    private DJICameraSettingsDef.CameraMode mCameraMode;

    private static final int ENABLE_BTN2 = 0;
    private static final int DISABLE_BTN2 = 1;

    private Handler mHandler = new Handler(new Handler.Callback() {

        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case ENABLE_BTN2 :
                    mBtn2.setEnabled(true);
                    break;

                case DISABLE_BTN2:
                    mBtn2.setEnabled(false);
                    break;

                default:
                    break;
            }
            return false;
        }
    });

    public ShootSinglePhotoView(Context context, AttributeSet attrs) {
        super(context, attrs);

        mBtn1.setVisibility(View.GONE);
        mBtn3.setVisibility(View.GONE);
    }

    /**
     * Every commands relative to the shooting photos are only allowed executed in shootphoto work
     * mode.
     */
    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.v("Attached To Window", "onAttachedToWindow");

        if (isModuleAvailable()) {
//            DJISampleApplication.getProductInstance().getCamera().getCameraMode(
//                new DJIBaseComponent.DJICompletionCallbackWith<DJICameraSettingsDef.CameraMode>() {
//                    @Override
//                    public void onSuccess(DJICameraSettingsDef.CameraMode cameraMode) {
//                        mCameraMode = cameraMode;
//                    }
//
//                    @Override
//                    public void onFailure(DJIError djiError) {
//
//                    }
//                }
//            );

            DJISampleApplication.getProductInstance().getCamera().setCameraMode(
                    DJICameraSettingsDef.CameraMode.ShootPhoto,
                    new DJIBaseComponent.DJICompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {

                        }
                    }
            );
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.v("Attached To Window", "onDetachedFromWindow");

        if (isModuleAvailable()) {
//            DJISampleApplication.getProductInstance().getCamera().setCameraMode(mCameraMode,
//                    new DJIBaseComponent.DJICompletionCallback() {
//                        @Override
//                        public void onResult(DJIError djiError) {
//
//                        }
//                    });
        }
    }

    private boolean isModuleAvailable() {
        return (null != DJISampleApplication.getProductInstance())
                && (null != DJISampleApplication.getProductInstance().getCamera());
    }

    @Override
    protected int getBtn2TextResourceId() {
        return R.string.shoot_single_photo;
    }

    @Override
    protected int getInfoResourceId() {
        return R.string.shoot_single_photo_descritpion;
    }

    @Override
    protected void getBtn2Method() {
        //Shoot Photo Button
        if (isModuleAvailable()) {
            DJISampleApplication.getProductInstance().getCamera().startShootPhoto(
                    DJICameraSettingsDef.CameraShootPhotoMode.Single,
                    new DJIBaseComponent.DJICompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {
                            mHandler.sendEmptyMessage(ENABLE_BTN2);
                        }
                    }
            );
            mHandler.sendEmptyMessage(DISABLE_BTN2);
        }
    }

    @Override
    protected void getBtn1Method() {}

    @Override
    protected void getBtn3Method() {}

    @Override
    protected int getBtn3TextResourceId() {return R.string.shoot_single_photo;}

    @Override
    protected int getBtn1TextResourceId() {return R.string.shoot_single_photo;}
}
