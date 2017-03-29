package com.dji.sdk.sample.demo.gimbal;

import android.app.Service;
import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.view.PresentableView;
import dji.common.error.DJIError;
import dji.common.gimbal.CapabilityKey;
import dji.common.gimbal.GimbalMode;
import dji.common.gimbal.Rotation;
import dji.common.gimbal.RotationMode;
import dji.common.util.CommonCallbacks;
import dji.common.util.DJIParamCapability;
import dji.common.util.DJIParamMinMaxCapability;
import dji.sdk.base.BaseProduct;
import dji.sdk.gimbal.Gimbal;
import dji.sdk.sdkmanager.DJISDKManager;

public class GimbalCapabilityView extends LinearLayout implements View.OnClickListener, PresentableView {

    private Gimbal gimbal = null;
    private Button pitchMinBtn;
    private Button pitchMaxBtn;
    private Button yawMinBtn;
    private Button yawMaxBtn;
    private Button rollMinBtn;
    private Button rollMaxBtn;

    public GimbalCapabilityView(Context context) {
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
        setupButtonsState();
        enablePitchExtensionIfPossible();
        if (getGimbalInstance() != null) {
            getGimbalInstance().setMode(GimbalMode.YAW_FOLLOW, new CommonCallbacks.CompletionCallback() {
                @Override
                public void onResult(DJIError error) {
                    if (error == null) {
                        Log.d("Gimbal", "Set Gimbal Work Mode success");
                    } else {
                        Log.d("Gimbal", "Set Gimbal Work Mode failed" + error);
                    }
                }
            });
        } else {
            post(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(getContext(), "Product disconnected", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    private void setupButtonsState() {
        pitchMinBtn.setEnabled(isFeatureSupported(CapabilityKey.ADJUST_PITCH));
        pitchMaxBtn.setEnabled(isFeatureSupported(CapabilityKey.ADJUST_PITCH));
        yawMinBtn.setEnabled(isFeatureSupported(CapabilityKey.ADJUST_YAW));
        yawMaxBtn.setEnabled(isFeatureSupported(CapabilityKey.ADJUST_YAW));
        rollMinBtn.setEnabled(isFeatureSupported(CapabilityKey.ADJUST_ROLL));
        rollMaxBtn.setEnabled(isFeatureSupported(CapabilityKey.ADJUST_ROLL));
    }

    private Gimbal getGimbalInstance() {
        if (gimbal == null) {
            if (DJISDKManager.getInstance() != null) {
                BaseProduct product = DJISDKManager.getInstance().getProduct();
                if (product != null) {
                    gimbal = product.getGimbal();
                }
            }
        }
        return gimbal;
    }

    /*
     * Check if The Gimbal Capability is supported
     */
    private boolean isFeatureSupported(CapabilityKey key) {

        Gimbal gimbal = getGimbalInstance();
        if (gimbal == null) {
            return false;
        }

        DJIParamCapability capability = gimbal.getCapabilities().get(key);
        if (capability != null) {
            return capability.isSupported();
        }
        return false;
    }

    private void enablePitchExtensionIfPossible() {

        Gimbal gimbal = getGimbalInstance();
        if (gimbal == null) {
            return;
        }
        boolean ifPossible = isFeatureSupported(CapabilityKey.PITCH_RANGE_EXTENSION);
        if (ifPossible) {
            gimbal.setPitchRangeExtensionEnabled(true, new CommonCallbacks.CompletionCallback() {
                                                     @Override
                                                     public void onResult(DJIError djiError) {
                                                         if (djiError == null) {
                                                             Log.d("PitchRangeExtension", "set PitchRangeExtension successfully");
                                                         } else {
                                                             Log.d("PitchRangeExtension", "set PitchRangeExtension failed");
                                                         }
                                                     }
                                                 }

            );
        }
    }

    private void sendRotateGimbalCommand(Rotation rotation) {

        Gimbal gimbal = getGimbalInstance();
        if (gimbal == null) {
            return;
        }

        gimbal.rotate(rotation, new CommonCallbacks.CompletionCallback() {
            @Override
            public void onResult(DJIError djiError) {
                if (djiError == null) {
                    Log.d("RotateGimbal", "RotateGimbal successfully");
                } else {
                    Log.d("PitchRangeExtension", "RotateGimbal failed");
                }
            }
        });
    }

    private Object getCorrespondingKeyWithButton(Button button) {
        if (button == pitchMaxBtn || button == pitchMinBtn) {
            return CapabilityKey.ADJUST_PITCH;
        } else if (button == yawMaxBtn || button == yawMinBtn) {
            return CapabilityKey.ADJUST_YAW;
        } else if (button == rollMaxBtn || button == rollMinBtn) {
            return CapabilityKey.ADJUST_ROLL;
        }
        return null;
    }

    private void initUI(Context context) {
        setClickable(true);
        setOrientation(VERTICAL);

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);

        layoutInflater.inflate(R.layout.view_gimbal_capability, this, true);

        pitchMinBtn = (Button) findViewById(R.id.btn_pitchMin);
        pitchMaxBtn = (Button) findViewById(R.id.btn_pitchMax);
        yawMinBtn = (Button) findViewById(R.id.btn_yawMin);
        yawMaxBtn = (Button) findViewById(R.id.btn_yawMax);
        rollMinBtn = (Button) findViewById(R.id.btn_rollMin);
        rollMaxBtn = (Button) findViewById(R.id.btn_rollMax);
        Button resetBtn = (Button) findViewById(R.id.btn_reset);

        pitchMinBtn.setOnClickListener(this);
        pitchMaxBtn.setOnClickListener(this);
        yawMinBtn.setOnClickListener(this);
        yawMaxBtn.setOnClickListener(this);
        rollMinBtn.setOnClickListener(this);
        rollMaxBtn.setOnClickListener(this);
        resetBtn.setOnClickListener(this);
    }

    private void rotateGimbalToMin(Button button) {

        Gimbal gimbal = getGimbalInstance();
        if (gimbal == null) {
            return;
        }

        Object key = getCorrespondingKeyWithButton(button);
        Number minValue = ((DJIParamMinMaxCapability) (gimbal.getCapabilities().get(key))).getMin();

        Rotation.Builder builder = new Rotation.Builder().mode(RotationMode.ABSOLUTE_ANGLE).time(2);

        if (key == CapabilityKey.ADJUST_PITCH) {
            builder.pitch(minValue.floatValue());
        } else if (key == CapabilityKey.ADJUST_YAW) {
            builder.yaw(minValue.floatValue());
        } else if (key == CapabilityKey.ADJUST_ROLL) {
            builder.roll(minValue.floatValue());
        }

        sendRotateGimbalCommand(builder.build());
    }

    private void rotateGimbalToMax(Button button) {

        Gimbal gimbal = getGimbalInstance();
        if (gimbal == null) {
            return;
        }

        Object key = getCorrespondingKeyWithButton(button);
        Number maxValue = ((DJIParamMinMaxCapability) (gimbal.getCapabilities().get(key))).getMax();

        Rotation.Builder builder = new Rotation.Builder().mode(RotationMode.ABSOLUTE_ANGLE).time(2);

        if (key == CapabilityKey.ADJUST_PITCH) {
            builder.pitch(maxValue.floatValue());
        } else if (key == CapabilityKey.ADJUST_YAW) {
            builder.yaw(maxValue.floatValue());
        } else if (key == CapabilityKey.ADJUST_ROLL) {
            builder.roll(maxValue.floatValue());
        }

        sendRotateGimbalCommand(builder.build());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_pitchMin: {
                rotateGimbalToMin((Button) v);
                break;
            }
            case R.id.btn_pitchMax: {
                rotateGimbalToMax((Button) v);
                break;
            }
            case R.id.btn_yawMin: {
                rotateGimbalToMin((Button) v);
                break;
            }
            case R.id.btn_yawMax: {
                rotateGimbalToMax((Button) v);
                break;
            }
            case R.id.btn_rollMin: {
                rotateGimbalToMin((Button) v);
                break;
            }
            case R.id.btn_rollMax: {
                rotateGimbalToMax((Button) v);
                break;
            }
            case R.id.btn_reset: {
                getGimbalInstance().reset(null);
                break;
            }
            default:
                break;
        }
    }

    @Override
    public int getDescription() {
        return R.string.gimbal_listview_gimbal_capability;
    }
}
