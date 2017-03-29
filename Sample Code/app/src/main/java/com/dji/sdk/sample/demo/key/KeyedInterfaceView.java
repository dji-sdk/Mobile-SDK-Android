package com.dji.sdk.sample.demo.key;

import android.app.Service;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.PresentableView;
import dji.common.camera.SettingsDefinitions;
import dji.common.error.DJIError;
import dji.keysdk.BatteryKey;
import dji.keysdk.CameraKey;
import dji.keysdk.GimbalKey;
import dji.keysdk.KeyManager;
import dji.keysdk.callback.ActionCallback;
import dji.keysdk.callback.GetCallback;
import dji.keysdk.callback.KeyListener;
import dji.keysdk.callback.SetCallback;

/**
 * Class for basic manager view in mission manager
 */
public class KeyedInterfaceView extends LinearLayout implements PresentableView {

    //region Battery
    // Example of creating a BatteryKey
    BatteryKey batteryKey = BatteryKey.create(BatteryKey.CHARGE_REMAINING_IN_PERCENT);
    private Button getBatteryBtn;
    private TextView batteryTV;
    //endregion

    //region Camera
    private SettingsDefinitions.CameraMode cameraMode;
    // Example of creating a CameraKey
    CameraKey cameraKey = CameraKey.create(CameraKey.MODE);
    private Button cameraBtn;
    private TextView cameraTV;
    // Example of handling a listener
    KeyListener cameraModeListener = new KeyListener() {
        @Override
        public void onValueChange(@Nullable Object o, @Nullable Object o1) {
            if (o1 instanceof SettingsDefinitions.CameraMode) {
                setText(cameraTV, "Current Mode: " + o1);
            }
        }
    };
    //endregion

    //region Gimbal
    // Example of creating a GimbalKey
    GimbalKey startCalibrationKey = GimbalKey.create(GimbalKey.START_CALIBRATION);
    GimbalKey calibrationProgress = GimbalKey.create(GimbalKey.CALIBRATION_PROGRESS);
    private Button calibrateBtn;
    private TextView calibrationTV;
    // Example of handling a listener
    KeyListener calibrationListener = new KeyListener() {
        @Override
        public void onValueChange(@Nullable Object o, @Nullable Object o1) {
            if (o1 instanceof Integer) {
                setText(calibrationTV, "Progress : " + o1 + "%");
            }
        }
    };
    //endregion

    public KeyedInterfaceView(Context context) {
        super(context);
        initUI(context);
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        useDJIKeyedInterface();
        setUpKeys();
    }

    @Override
    protected void onDetachedFromWindow() {
        tearDownKeys();
        super.onDetachedFromWindow();
    }

    //region Listeners Related
    private void setUpKeys() {
        KeyManager.getInstance().addListener(cameraKey, cameraModeListener);
        KeyManager.getInstance().addListener(calibrationProgress, calibrationListener);
    }

    private void tearDownKeys() {
        KeyManager.getInstance().removeListener(cameraModeListener);
        KeyManager.getInstance().removeListener(calibrationListener);
    }
    //endregion

    private void useDJIKeyedInterface() {
        getBatteryBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // Example of getting a value using Async interface
                KeyManager.getInstance().getValue(batteryKey, new GetCallback() {
                                                      @Override
                                                      public void onSuccess(final @NonNull Object o) {
                                                          if (o instanceof Integer) {
                                                              setText(batteryTV, o.toString() + " %");
                                                          }
                                                      }

                                                      @Override
                                                      public void onFailure(@NonNull DJIError djiError) {
                                                          setText(batteryTV, "N/A %");
                                                      }
                                                  }

                );
            }
        });
        cameraBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cameraMode == null) {
                    // Example of getting a value using Synchronous interface
                    cameraMode = (SettingsDefinitions.CameraMode) KeyManager.getInstance().getValue(cameraKey);
                    setText(cameraTV, "Current Mode: " + cameraMode);
                } else {
                    if (cameraMode == SettingsDefinitions.CameraMode.SHOOT_PHOTO) {
                        cameraMode = SettingsDefinitions.CameraMode.RECORD_VIDEO;
                        // Example of setting a value
                        KeyManager.getInstance().setValue(cameraKey, cameraMode, new SetCallback() {
                            @Override
                            public void onSuccess() {
                                ToastUtils.setResultToToast("Success!");
                            }

                            @Override
                            public void onFailure(@NonNull DJIError djiError) {
                                ToastUtils.setResultToToast("Failed!" + djiError);
                            }
                        });
                    } else {
                        cameraMode = SettingsDefinitions.CameraMode.SHOOT_PHOTO;
                        // Example of setting a value
                        KeyManager.getInstance().setValue(cameraKey, cameraMode, new SetCallback() {
                            @Override
                            public void onSuccess() {
                                ToastUtils.setResultToToast("Success!");
                            }

                            @Override
                            public void onFailure(@NonNull DJIError djiError) {
                                ToastUtils.setResultToToast("Failed!" + djiError);
                            }
                        });
                    }
                }
            }
        });
        calibrateBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // Example of performing an action
                KeyManager.getInstance().performAction(startCalibrationKey, new ActionCallback() {
                    @Override
                    public void onSuccess() {
                        ToastUtils.setResultToToast("Started successfully!");
                    }

                    @Override
                    public void onFailure(@NonNull DJIError djiError) {
                        ToastUtils.setResultToToast("Failed to start!" + djiError);
                    }
                });
            }
        });
    }

    //region Helper Method
    private void initUI(Context context) {
        setOrientation(VERTICAL);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);

        layoutInflater.inflate(R.layout.view_keyed_interface, this, true);

        batteryTV = (TextView) findViewById(R.id.tv_batter_level_value);
        getBatteryBtn = (Button) findViewById(R.id.tv_batter_level_title);
        cameraBtn = (Button) findViewById(R.id.tv_camera_title);
        cameraTV = (TextView) findViewById(R.id.tv_camera_value);
        calibrateBtn = (Button) findViewById(R.id.tv_calibrate_title);
        calibrationTV = (TextView) findViewById(R.id.tv_calibrate_value);
    }

    private void setText(final TextView tv, final String text) {
        tv.post(new Runnable() {
            @Override
            public void run() {

                tv.setText(text);
            }
        });
    }

    @Override
    public int getDescription() {
        return R.string.component_listview_keyed_interface;
    }

    //endregion
}

