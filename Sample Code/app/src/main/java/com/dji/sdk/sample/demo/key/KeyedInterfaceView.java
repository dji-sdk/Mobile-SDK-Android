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
    private BatteryKey batteryKey = BatteryKey.create(BatteryKey.CHARGE_REMAINING_IN_PERCENT);
    private Button getBatteryBtn;
    private TextView batteryTV;
    //endregion

    //region Camera
    private SettingsDefinitions.CameraMode cameraMode;
    // Example of creating a CameraKey
    private CameraKey cameraKey = CameraKey.create(CameraKey.MODE);
    private Button cameraBtn;
    private TextView cameraTV;
    // Example of handling a listener
    private KeyListener cameraModeListener = new KeyListener() {
        @Override
        public void onValueChange(@Nullable Object o, @Nullable Object o1) {
            if (o1 instanceof SettingsDefinitions.CameraMode) {
                setText(cameraTV, getResources().getString(R.string.camera_value, o1));
            }
        }
    };
    //endregion

    //region Gimbal
    // Example of creating a GimbalKey
    private GimbalKey startCalibrationKey = GimbalKey.create(GimbalKey.START_CALIBRATION);
    private GimbalKey calibrationProgress = GimbalKey.create(GimbalKey.CALIBRATION_PROGRESS);
    private Button calibrateBtn;
    private TextView calibrationTV;
    // Example of handling a listener
    private KeyListener calibrationListener = new KeyListener() {
        @Override
        public void onValueChange(@Nullable Object o, @Nullable Object o1) {
            if (o1 instanceof Integer) {
                setText(calibrationTV, getResources().getString(R.string.calibration_value, o1));
            }
        }
    };
    //endregion

    //region Storage
    private SettingsDefinitions.StorageLocation storageLocation;
    // Example of changing the storage location for supported products
    private CameraKey storageLocationKey = CameraKey.create(CameraKey.CAMERA_STORAGE_LOCATION);
    private CameraKey isInternalStorageSupportedKey = CameraKey.create(CameraKey.IS_INTERNAL_STORAGE_SUPPORTED);
    private Button storageLocationBtn;
    private TextView storageLocationTV;
    private KeyListener isInternalStorageSupportedListener = new KeyListener() {
        @Override
        public void onValueChange(@Nullable Object o, @Nullable Object o1) {
            if (o1 instanceof Boolean) {
                updateStorageLocationVisibility((boolean) o1);
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
        KeyManager.getInstance().addListener(isInternalStorageSupportedKey, isInternalStorageSupportedListener);
    }

    private void tearDownKeys() {
        KeyManager.getInstance().removeListener(cameraModeListener);
        KeyManager.getInstance().removeListener(calibrationListener);
        KeyManager.getInstance().removeListener(isInternalStorageSupportedListener);
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
                            ToastUtils.setResultToToast("Success!");
                            setText(batteryTV, getResources().getString(R.string.battery_value, o.toString()));
                        }
                    }

                    @Override
                    public void onFailure(@NonNull DJIError djiError) {
                        ToastUtils.setResultToToast("Failed!" + djiError);
                        setText(batteryTV, "N/A %");
                    }
                });
            }
        });
        cameraBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cameraMode == null) {
                    // Example of getting a value using Synchronous interface
                    cameraMode = (SettingsDefinitions.CameraMode) KeyManager.getInstance().getValue(cameraKey);
                    setText(cameraTV, getResources().getString(R.string.camera_value, cameraMode));
                } else {
                    if (cameraMode == SettingsDefinitions.CameraMode.SHOOT_PHOTO) {
                        cameraMode = SettingsDefinitions.CameraMode.RECORD_VIDEO;
                    } else {
                        cameraMode = SettingsDefinitions.CameraMode.SHOOT_PHOTO;
                    }
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
        storageLocationBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (storageLocation == SettingsDefinitions.StorageLocation.INTERNAL_STORAGE) {
                    storageLocation = SettingsDefinitions.StorageLocation.SDCARD;
                } else {
                    storageLocation = SettingsDefinitions.StorageLocation.INTERNAL_STORAGE;
                }
                // Example of setting a value
                KeyManager.getInstance().setValue(storageLocationKey, storageLocation, new SetCallback() {
                    @Override
                    public void onSuccess() {
                        ToastUtils.setResultToToast("Success!");
                        updateStorageLocation();
                    }

                    @Override
                    public void onFailure(@NonNull DJIError djiError) {
                        ToastUtils.setResultToToast("Failed!" + djiError);
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
        storageLocationBtn = (Button) findViewById(R.id.tv_storage_location_title);
        storageLocationTV = (TextView) findViewById(R.id.tv_storage_location_value);

        // Example of getting a value using Async interface
        KeyManager.getInstance().getValue(isInternalStorageSupportedKey, new GetCallback() {

            @Override
            public void onSuccess(@NonNull Object o) {
                if (o instanceof Boolean) {
                    updateStorageLocationVisibility((boolean) o);
                }
            }

            @Override
            public void onFailure(@NonNull DJIError djiError) {
                ToastUtils.setResultToToast("Failed!" + djiError);
            }
        });
        // Example of getting a value using Synchronous interface
        storageLocation = (SettingsDefinitions.StorageLocation) KeyManager.getInstance().getValue(storageLocationKey);
        updateStorageLocation();
    }

    private void setText(final TextView tv, final String text) {
        tv.post(new Runnable() {
            @Override
            public void run() {

                tv.setText(text);
            }
        });
    }

    private void updateStorageLocation() {
        if (storageLocation == SettingsDefinitions.StorageLocation.INTERNAL_STORAGE) {
            setText(storageLocationTV, getResources().getString(R.string.storage_location_value_internal));
        } else {
            setText(storageLocationTV, getResources().getString(R.string.storage_location_value_sd));
        }
    }

    private void updateStorageLocationVisibility(final boolean isInternalStorageSupported) {
        storageLocationBtn.post(new Runnable() {
            @Override
            public void run() {
                storageLocationBtn.setVisibility(isInternalStorageSupported ? VISIBLE : GONE);
                storageLocationTV.setVisibility(isInternalStorageSupported ? VISIBLE : GONE);
            }
        });
    }

    @Override
    public int getDescription() {
        return R.string.component_listview_keyed_interface;
    }

    //endregion
}

