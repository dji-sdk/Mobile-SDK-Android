package com.dji.sdk.sample.demo.camera;

import android.content.Context;
import android.util.Log;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.BaseThreeBtnView;

import dji.common.camera.SettingsDefinitions;
import dji.common.error.DJIError;
import dji.common.util.CommonCallbacks;

/**
 * Class for shooting single photo.
 */
public class ShootSinglePhotoView extends BaseThreeBtnView {

    private Context context;

    public ShootSinglePhotoView(Context context) {
        super(context);
        this.context = context;
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
            if (ModuleVerificationUtil.isMavicAir2()){
                DJISampleApplication.getProductInstance()
                        .getCamera()
                        .setFlatMode(SettingsDefinitions.FlatCameraMode.PHOTO_SINGLE, djiError -> ToastUtils.setResultToToast("SetCameraMode to shootPhoto"));
                return;
            }
            DJISampleApplication.getProductInstance()
                    .getCamera()
                    .setMode(SettingsDefinitions.CameraMode.SHOOT_PHOTO, djiError -> ToastUtils.setResultToToast("SetCameraMode to shootPhoto"));
        }
    }

    private boolean isModuleAvailable() {
        return (null != DJISampleApplication.getProductInstance()) && (null != DJISampleApplication.getProductInstance()
                .getCamera());
    }

    @Override
    protected int getLeftBtnTextResourceId() {
        return DISABLE;
    }

    @Override
    protected int getDescriptionResourceId() {
        return getDescription();
    }

    @Override
    protected void handleLeftBtnClick() {

    }

    @Override
    protected void handleMiddleBtnClick() {
        //Shoot Photo Button
        if (isModuleAvailable()) {
            post(new Runnable() {
                @Override
                public void run() {
                    middleBtn.setEnabled(false);
                }
            });

            DJISampleApplication.getProductInstance()
                    .getCamera()
                    .startShootPhoto(new CommonCallbacks.CompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {
                            if (null == djiError) {
                                ToastUtils.setResultToToast(getContext().getString(R.string.success));
                            } else {
                                ToastUtils.setResultToToast(djiError.getDescription());
                            }
                            post(new Runnable() {
                                @Override
                                public void run() {
                                    middleBtn.setEnabled(true);
                                }
                            });
                        }
                    });
        }
    }

    @Override
    protected void handleRightBtnClick() {
    }

    @Override
    protected int getRightBtnTextResourceId() {
        return DISABLE;
    }

    @Override
    protected int getMiddleBtnTextResourceId() {
        return R.string.shoot_single_photo;
    }

    @Override
    public int getDescription() {
        return R.string.camera_listview_shoot_single_photo;
    }
}
