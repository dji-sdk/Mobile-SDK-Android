package com.dji.sdk.sample.gimbal;

import android.app.Service;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.dji.sdk.sample.R;

import dji.common.error.DJIError;
import dji.common.gimbal.DJIGimbalAngleRotation;
import dji.common.gimbal.DJIGimbalCapabilityKey;
import dji.common.gimbal.DJIGimbalRotateAngleMode;
import dji.common.gimbal.DJIGimbalRotateDirection;
import dji.common.gimbal.DJIGimbalWorkMode;
import dji.common.util.DJICommonCallbacks;
import dji.common.util.DJIParamCapability;
import dji.sdk.base.DJIBaseProduct;
import dji.sdk.gimbal.DJIGimbal;
import dji.sdk.sdkmanager.DJISDKManager;
import dji.common.util.DJIParamMinMaxCapability;

public class GimbalCapabilityView extends LinearLayout implements View.OnClickListener {

    protected static final String TAG = "GimbalCapabilityView";

    private static DJIBaseProduct mProduct = null;

    private Button mPitchMinBtn;
    private Button mPitchMaxBtn;
    private Button mYawMinBtn;
    private Button mYawMaxBtn;
    private Button mRollMinBtn;
    private Button mRollMaxBtn;
    private Button mResetBtn;

    private DJIGimbalAngleRotation mPitchRotation;
    private DJIGimbalAngleRotation mYawRotation;
    private DJIGimbalAngleRotation mRollRotation;

    protected Context mContext;

    public GimbalCapabilityView(Context context, AttributeSet attrs) {

        super(context, attrs);

        initUI();
        setupButtonsState();
        setupRotationStructs();
        enablePitchExtensionIfPossible();

        getGimbalInstance().setGimbalWorkMode(DJIGimbalWorkMode.YawFollowMode, new DJICommonCallbacks.DJICompletionCallback() {
            @Override
            public void onResult(DJIError error) {
                if (error == null) {
                    Log.d("Gimbal", "Set Gimbal Work Mode success");
                } else {
                    Log.d("Gimbal", "Set Gimbal Work Mode failed" + error);
                }
            }
        });

    }

    public synchronized DJIBaseProduct getProductInstance() {
        while (null == mProduct) {
            if (DJISDKManager.getInstance() != null) {
                mProduct = DJISDKManager.getInstance().getDJIProduct();
            }
        }
        return mProduct;
    }

    private DJIGimbal getGimbalInstance() {
        return getProductInstance().getGimbal();
    }

    /*
     * Check if The Gimbal Capability is supported
     */
    private boolean isFeatureSupported(DJIGimbalCapabilityKey key) {

        DJIGimbal gimbal = getGimbalInstance();
        if (gimbal == null){
            return false;
        }

       DJIParamCapability capability = gimbal.gimbalCapability().get(key);
       if(capability != null){
           return capability.isSuppported();
       }
       return false;
    }

    private void setupButtonsState() {
        mPitchMinBtn.setEnabled(isFeatureSupported(DJIGimbalCapabilityKey.AdjustPitch));
        mPitchMaxBtn.setEnabled(isFeatureSupported(DJIGimbalCapabilityKey.AdjustPitch));
        mYawMinBtn.setEnabled(isFeatureSupported(DJIGimbalCapabilityKey.AdjustYaw));
        mYawMaxBtn.setEnabled(isFeatureSupported(DJIGimbalCapabilityKey.AdjustYaw));
        mRollMinBtn.setEnabled(isFeatureSupported(DJIGimbalCapabilityKey.AdjustRoll));
        mRollMaxBtn.setEnabled(isFeatureSupported(DJIGimbalCapabilityKey.AdjustRoll));
    }

    private void setupRotationStructs() {

        mPitchRotation.enable = isFeatureSupported(DJIGimbalCapabilityKey.AdjustPitch);
        mYawRotation.enable = isFeatureSupported(DJIGimbalCapabilityKey.AdjustYaw);
        mRollRotation.enable = isFeatureSupported(DJIGimbalCapabilityKey.AdjustRoll);

    }

    private void enablePitchExtensionIfPossible() {

        DJIGimbal gimbal = getGimbalInstance();
        if (gimbal == null){
            return;
        }
        boolean ifPossible = isFeatureSupported(DJIGimbalCapabilityKey.PitchRangeExtension);
        if (ifPossible)
        {
           gimbal.setPitchRangeExtensionEnabled(true,
                   new DJICommonCallbacks.DJICompletionCallback() {
                       @Override
                       public void onResult(DJIError djiError) {
                           if (djiError == null) {
                               Log.d("PitchRangeExtension", "set PitchRangeExtension successfully");
                           }else{
                               Log.d("PitchRangeExtension", "set PitchRangeExtension failed");
                           }
                       }
                   }

           );
        }

    }

    private void sendRotateGimbalCommand() {

        DJIGimbal gimbal = getGimbalInstance();
        if (gimbal == null){
            return;
        }

        gimbal.rotateGimbalByAngle(DJIGimbalRotateAngleMode.AbsoluteAngle, mPitchRotation, mRollRotation, mYawRotation,
                new DJICommonCallbacks.DJICompletionCallback() {
                    @Override
                    public void onResult(DJIError djiError) {
                        if (djiError == null) {
                            Log.d("RotateGimbal", "RotateGimbal successfully");
                        }else{
                            Log.d("PitchRangeExtension", "RotateGimbal failed");
                        }
                    }
                }
        );
    }

    private Object getCorrespondingKeyWithButton(Button button){
        if (button == mPitchMaxBtn || button == mPitchMinBtn){
            return DJIGimbalCapabilityKey.AdjustPitch;
        }else if (button == mYawMaxBtn || button == mYawMinBtn){
            return DJIGimbalCapabilityKey.AdjustYaw;
        }else if (button == mRollMaxBtn || button == mRollMinBtn){
            return DJIGimbalCapabilityKey.AdjustRoll;
        }
        return null;
    }

    private void initUI() {

        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Service.LAYOUT_INFLATER_SERVICE);

        View content = layoutInflater.inflate(R.layout.view_gimbal_capability, null, false);
        addView(content, new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));

        mPitchMinBtn = (Button)findViewById(R.id.btn_pitchMin);
        mPitchMaxBtn = (Button)findViewById(R.id.btn_pitchMax);
        mYawMinBtn = (Button)findViewById(R.id.btn_yawMin);
        mYawMaxBtn = (Button)findViewById(R.id.btn_yawMax);
        mRollMinBtn = (Button)findViewById(R.id.btn_rollMin);
        mRollMaxBtn = (Button)findViewById(R.id.btn_rollMax);
        mResetBtn = (Button)findViewById(R.id.btn_reset);

        mPitchMinBtn.setOnClickListener(this);
        mPitchMaxBtn.setOnClickListener(this);
        mYawMinBtn.setOnClickListener(this);
        mYawMaxBtn.setOnClickListener(this);
        mRollMinBtn.setOnClickListener(this);
        mRollMaxBtn.setOnClickListener(this);
        mResetBtn.setOnClickListener(this);

        mPitchRotation = new DJIGimbalAngleRotation(false, 0, DJIGimbalRotateDirection.Clockwise);
        mYawRotation = new DJIGimbalAngleRotation(false, 0, DJIGimbalRotateDirection.Clockwise);
        mRollRotation = new DJIGimbalAngleRotation(false, 0, DJIGimbalRotateDirection.Clockwise);

    }

    private void rotateGimbalRoll(boolean rollEnable, float angle, DJIGimbalRotateDirection direction) {

        DJIGimbalAngleRotation pitch = new DJIGimbalAngleRotation(rollEnable, angle,
                DJIGimbalRotateDirection.Clockwise);
        DJIGimbalAngleRotation roll = new DJIGimbalAngleRotation(false, 0,
                DJIGimbalRotateDirection.Clockwise);
        DJIGimbalAngleRotation yaw = new DJIGimbalAngleRotation(false, 0, DJIGimbalRotateDirection.Clockwise);
        getGimbalInstance().rotateGimbalByAngle(DJIGimbalRotateAngleMode.AbsoluteAngle, pitch, roll, yaw, new DJICommonCallbacks.DJICompletionCallback() {
            @Override
            public void onResult(DJIError error) {
                if (error == null) {
                    Log.d("RotateAngle", "Rotate Gimbal Roll Success");
                } else {
                    Log.d("RotateAngle", "Rotate Gimbal Roll fail" + error);
                }
            }
        });
    }

    private void rotateGimbalToMin (Button button) {

        DJIGimbal gimbal = getGimbalInstance();
        if (gimbal == null){
            return;
        }

        gimbal.setCompletionTimeForControlAngleAction(1);

        Object key = getCorrespondingKeyWithButton(button);
        Number minValue = ((DJIParamMinMaxCapability)(gimbal.gimbalCapability().get(key))).getMin();

        if (key == DJIGimbalCapabilityKey.AdjustPitch){
            mPitchRotation.direction = DJIGimbalRotateDirection.Clockwise;
            mPitchRotation.angle = minValue.floatValue();
        }else if(key == DJIGimbalCapabilityKey.AdjustYaw){
            mYawRotation.direction = DJIGimbalRotateDirection.Clockwise;
            mYawRotation.angle = minValue.floatValue();
        }else if(key == DJIGimbalCapabilityKey.AdjustRoll){
            mRollRotation.direction = DJIGimbalRotateDirection.Clockwise;
            mRollRotation.angle = minValue.floatValue();
        }

        sendRotateGimbalCommand();
    }

    private void rotateGimbalToMax(Button button) {

        DJIGimbal gimbal = getGimbalInstance();
        if (gimbal == null){
            return;
        }

        gimbal.setCompletionTimeForControlAngleAction(1);

        Object key = getCorrespondingKeyWithButton(button);
        Number maxValue = ((DJIParamMinMaxCapability)(gimbal.gimbalCapability().get(key))).getMax();

        if (key == DJIGimbalCapabilityKey.AdjustPitch){
            mPitchRotation.direction = DJIGimbalRotateDirection.Clockwise;
            mPitchRotation.angle = maxValue.floatValue();
        }else if(key == DJIGimbalCapabilityKey.AdjustYaw){
            mYawRotation.direction = DJIGimbalRotateDirection.Clockwise;
            mYawRotation.angle = maxValue.floatValue();
        }else if(key == DJIGimbalCapabilityKey.AdjustRoll){
            mRollRotation.direction = DJIGimbalRotateDirection.Clockwise;
            mRollRotation.angle = maxValue.floatValue();
        }

        sendRotateGimbalCommand();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_pitchMin:{
                rotateGimbalToMin((Button)v);
                break;
            }
            case R.id.btn_pitchMax:{
                rotateGimbalToMax((Button) v);
                break;
            }
            case R.id.btn_yawMin:{
                rotateGimbalToMin((Button) v);
                break;
            }
            case R.id.btn_yawMax:{
                rotateGimbalToMax((Button) v);
                break;
            }
            case R.id.btn_rollMin:{
                rotateGimbalToMin((Button) v);
                break;
            }
            case R.id.btn_rollMax:{
                rotateGimbalToMax((Button) v);
                break;
            }
            case R.id.btn_reset:{
                mPitchRotation.angle = 0;
                mYawRotation.angle = 0;
                mRollRotation.angle = 0;
                sendRotateGimbalCommand();
                break;
            }
            default:
                break;
        }
    }

}
