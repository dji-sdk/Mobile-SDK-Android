package com.dji.sdk.sample.demo.camera;

import android.app.Service;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.SeekBarValueChangeListener;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.controller.MainActivity;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.utils.VideoFeedView;
import com.dji.sdk.sample.internal.view.PopupSeekBar;
import com.dji.sdk.sample.internal.view.PresentableView;

import java.util.Random;

import dji.common.airlink.PhysicalSource;
import dji.common.camera.SettingsDefinitions;
import dji.common.error.DJIError;
import dji.common.product.Model;
import dji.keysdk.CameraKey;
import dji.keysdk.KeyManager;
import dji.keysdk.callback.ActionCallback;
import dji.keysdk.callback.GetCallback;
import dji.keysdk.callback.SetCallback;
import dji.sdk.base.BaseProduct;
import dji.sdk.camera.Camera;
import dji.sdk.camera.VideoFeeder;
import dji.sdk.sdkmanager.DJISDKManager;

/**
 * This View will demo some of the functionality of XT2 Camera
 * <p>
 * The XT2 Camera can be currently used only with M600, M210 & M200.
 * In case of M210 dual gimbal the XT2 Camera can be connected only on the Port(left side) gimbal
 * <p>
 * The XT2 camera is a combination of two cameras
 * a. Visual Camera
 * b. IR (Thermal) Camera
 * <p>
 * The component index of the visual camera will always be 0
 * The component index of the thermal camera will always be 2
 */

public class XT2CameraView extends LinearLayout implements View.OnClickListener, PresentableView {

    private final int VISUAL_CAMERA_INDEX = 0;
    private final int THERMAL_CAMERA_INDEX = 2;
    private PopupSeekBar popupSeekBar;
    private TextView primaryVideoFeedTitle;
    private VideoFeedView primaryVideoFeed;
    private VideoFeeder.PhysicalSourceListener sourceListener;


    public XT2CameraView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        setOrientation(HORIZONTAL);
        setClickable(true);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.xt2_camera_view, this, true);
        initUI();
        setUpListeners();

    }

    private void initUI() {
        findViewById(R.id.btn_camera_display_visual).setOnClickListener(this);
        findViewById(R.id.btn_camera_display_thermal).setOnClickListener(this);
        findViewById(R.id.btn_camera_display_msx).setOnClickListener(this);
        findViewById(R.id.btn_camera_display_msx_level).setOnClickListener(this);
        findViewById(R.id.btn_camera_display_pip).setOnClickListener(this);
        findViewById(R.id.btn_camera_display_pip_position).setOnClickListener(this);
        findViewById(R.id.btn_shoot_photo).setOnClickListener(this);
        findViewById(R.id.btn_get_storage_location).setOnClickListener(this);
        findViewById(R.id.btn_get_remaining_photo_count).setOnClickListener(this);
        primaryVideoFeedTitle = (TextView) findViewById(R.id.video_feed_title);
        primaryVideoFeed = (VideoFeedView) findViewById(R.id.primary_video_feed);
        popupSeekBar = new PopupSeekBar(getContext(), 0, 100, "MSX Level", new SeekBarValueChangeListener() {
            @Override
            public void onValueChange(int val1, int val2) {
                setCameraMSXLevel(val1);
                popupSeekBar.dismiss();
            }
        }, 300, 150, 0);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_camera_display_visual:
                setCameraDisplayMode(SettingsDefinitions.DisplayMode.VISUAL_ONLY);
                break;
            case R.id.btn_camera_display_thermal:
                setCameraDisplayMode(SettingsDefinitions.DisplayMode.THERMAL_ONLY);
                break;
            case R.id.btn_camera_display_msx:
                setCameraDisplayMode(SettingsDefinitions.DisplayMode.MSX);
                break;
            case R.id.btn_camera_display_msx_level:
                if (isValidProduct() && isXT2CameraConnected()) {
                    popupSeekBar.showAtLocation(this, Gravity.CENTER, 0, 0);
                }
                break;
            case R.id.btn_camera_display_pip:
                setCameraDisplayMode(SettingsDefinitions.DisplayMode.PIP);
                break;
            case R.id.btn_camera_display_pip_position:
                if (isValidProduct() && isXT2CameraConnected()) {
                    SettingsDefinitions.PIPPosition[] pipPositions = SettingsDefinitions.PIPPosition.values();
                    int min = 0;
                    int max = pipPositions.length - 1;
                    Random randomNum = new Random();
                    setCameraPIPPosition(pipPositions[min + randomNum.nextInt(max)]);
                }
                break;
            case R.id.btn_shoot_photo:
                setSinglePhotoMode();
                break;
            case R.id.btn_get_storage_location:
                isSDCardInserted();
                break;
            case R.id.btn_get_remaining_photo_count:
                getPhotoCount();
                break;
        }
    }


    private void setUpListeners() {
        sourceListener = new VideoFeeder.PhysicalSourceListener() {
            @Override
            public void onChange(VideoFeeder.VideoFeed videoFeed, PhysicalSource newPhysicalSource) {
                if (videoFeed == VideoFeeder.getInstance().getPrimaryVideoFeed()) {
                    String newText = "Primary Source: " + newPhysicalSource.toString();
                    ToastUtils.setResultToText(primaryVideoFeedTitle, newText);
                }


            }
        };
        primaryVideoFeed.registerLiveVideo(VideoFeeder.getInstance().getPrimaryVideoFeed(), true);
        String newText = "Primary Source: " + VideoFeeder.getInstance().getPrimaryVideoFeed().getVideoSource().name();
        ToastUtils.setResultToText(primaryVideoFeedTitle, newText);

        VideoFeeder.getInstance().addPhysicalSourceListener(sourceListener);
    }

    @Override
    public int getDescription() {
        return R.string.component_xt2_camera_view;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        DJISampleApplication.getEventBus().post(new MainActivity.RequestStartFullScreenEvent());
    }

    @Override
    protected void onDetachedFromWindow() {
        DJISampleApplication.getEventBus().post(new MainActivity.RequestEndFullScreenEvent());
        super.onDetachedFromWindow();
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }

    private void isSDCardInserted() {

        KeyManager.getInstance().getValue(CameraKey.create(CameraKey.SDCARD_IS_INSERTED, VISUAL_CAMERA_INDEX), new GetCallback() {
            @Override
            public void onSuccess(@NonNull Object value) {
                ToastUtils.setResultToToast("" + (boolean) value);

            }

            @Override
            public void onFailure(@NonNull DJIError error) {
                ToastUtils.setResultToToast("Failed. " + error.toString());
            }
        });

    }

    private void getPhotoCount() {

        KeyManager.getInstance().getValue(CameraKey.create(CameraKey.SDCARD_AVAILABLE_CAPTURE_COUNT), new GetCallback() {
            @Override
            public void onSuccess(@NonNull Object value) {
                ToastUtils.setResultToToast("Remaining photos:" + (long) value);
            }

            @Override
            public void onFailure(@NonNull DJIError error) {
                ToastUtils.setResultToToast("Failed. " + error.toString());
            }
        });
    }

    /**
     * Set Single Photo Mode as a sample
     */
    private void setSinglePhotoMode() {
        KeyManager.getInstance().setValue(CameraKey.create(CameraKey.SHOOT_PHOTO_MODE, THERMAL_CAMERA_INDEX),
                SettingsDefinitions.ShootPhotoMode.SINGLE, new SetCallback() {
                    @Override
                    public void onSuccess() {
                        shootPhoto();
                    }

                    @Override
                    public void onFailure(@NonNull DJIError djiError) {

                    }
                });
    }


    private void shootPhoto() {

        KeyManager.getInstance().performAction(CameraKey.create(CameraKey.START_SHOOT_PHOTO, THERMAL_CAMERA_INDEX), new ActionCallback() {
            @Override
            public void onSuccess() {
                ToastUtils.setResultToToast("Success");
            }

            @Override
            public void onFailure(@NonNull DJIError error) {
                ToastUtils.setResultToToast("Failed. " + error.toString());
            }
        });
    }

    private void setCameraMSXLevel(int val1) {
        KeyManager.getInstance().setValue(CameraKey.create(CameraKey.MSX_LEVEL, THERMAL_CAMERA_INDEX), val1, new SetCallback() {
            @Override
            public void onSuccess() {
                ToastUtils.setResultToToast("Success");
            }

            @Override
            public void onFailure(@NonNull DJIError error) {
                ToastUtils.setResultToToast("Failed. " + error.toString());
            }
        });
    }

    private void setCameraPIPPosition(SettingsDefinitions.PIPPosition cameraPIPPosition) {
        ToastUtils.setResultToToast("Setting PIP position to " + cameraPIPPosition.toString());
        KeyManager.getInstance().setValue(CameraKey.create(CameraKey.PIP_POSITION, THERMAL_CAMERA_INDEX), cameraPIPPosition, new SetCallback() {
            @Override
            public void onSuccess() {
                ToastUtils.setResultToToast("Success");

            }

            @Override
            public void onFailure(@NonNull DJIError error) {
                ToastUtils.setResultToToast("Failed. " + error.toString());
            }
        });
    }

    private void setCameraDisplayMode(SettingsDefinitions.DisplayMode displayMode) {
        if (isValidProduct() && isXT2CameraConnected()) {
            KeyManager.getInstance().setValue(CameraKey.create(CameraKey.DISPLAY_MODE, THERMAL_CAMERA_INDEX), displayMode, new SetCallback() {
                @Override
                public void onSuccess() {
                    ToastUtils.setResultToToast("Success");
                }

                @Override
                public void onFailure(@NonNull DJIError error) {
                    ToastUtils.setResultToToast("Failed. " + error.toString());
                }
            });
        }
    }


    private boolean isXT2CameraConnected() {
        BaseProduct product = DJISDKManager.getInstance().getProduct();
        if (product.getCameraWithComponentIndex(VISUAL_CAMERA_INDEX) != null
                && product.getCameraWithComponentIndex(VISUAL_CAMERA_INDEX).getDisplayName() == Camera.DisplayNameXT2_VL) {
            return true;
        }
        ToastUtils.setResultToToast("XT2 not connected or is connected to the right gimbal.");
        return false;
    }

    private boolean isValidProduct() {
        if (DJISDKManager.getInstance() != null
                && DJISDKManager.getInstance().getProduct() != null
                && (DJISDKManager.getInstance().getProduct().getModel() == Model.MATRICE_210
                || DJISDKManager.getInstance().getProduct().getModel() == Model.MATRICE_200
                || DJISDKManager.getInstance().getProduct().getModel() == Model.MATRICE_600))
            return true;
        ToastUtils.setResultToToast("XT2 can be used with M600, M200 and M210 only.");
        return false;
    }
}
