package com.dji.sdk.sample.gimbal;

import android.content.Context;
import android.util.AttributeSet;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.common.BaseThreeBtnView;
import com.dji.sdk.sample.common.DJISampleApplication;
import com.dji.sdk.sample.utils.DJIModuleVerificationUtil;

import java.util.Timer;
import java.util.TimerTask;

import dji.sdk.Gimbal.DJIGimbal;
import dji.sdk.base.DJIBaseComponent;
import dji.sdk.base.DJIError;

/**
 * Class for moving gimbal with speed.
 */
public class MoveGimbalWithSpeedView extends BaseThreeBtnView {
    private Timer mTimer;
    private GimbalRotateTimerTask mGimbalRotationTimerTask;

    private DJIGimbal.DJIGimbalSpeedRotation mPitchSpeedRotation;

    public MoveGimbalWithSpeedView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected int getBtn1TextResourceId() {
        return R.string.move_gimbal_in_speed_up;
    }

    @Override
    protected int getBtn2TextResourceId() {
        return R.string.move_gimbal_in_speed_stop;
    }

    @Override
    protected int getBtn3TextResourceId() {
        return R.string.move_gimbal_in_speed_down;
    }

    @Override
    protected int getInfoResourceId() {
        return R.string.move_gimbal_in_speed_description;
    }

    @Override
    protected void getBtn1Method() {
        if (mTimer == null) {
            mTimer = new Timer();
            mPitchSpeedRotation = new DJIGimbal.DJIGimbalSpeedRotation(10,
                    DJIGimbal.DJIGimbalRotateDirection.Clockwise);
            mGimbalRotationTimerTask = new GimbalRotateTimerTask(mPitchSpeedRotation,null,null);
            mTimer.schedule(mGimbalRotationTimerTask, 0, 100);
        }
    }

    @Override
    protected void getBtn2Method() {
        if (mTimer != null) {
            mGimbalRotationTimerTask.cancel();
            mTimer.cancel();
            mTimer.purge();
            mGimbalRotationTimerTask = null;
            mTimer = null;
        }

        if (DJIModuleVerificationUtil.isGimbalModuleValid()) {
            DJISampleApplication.getProductInstance().getGimbal().
                    rotateGimbalBySpeed(null, null, null,
                            new DJIBaseComponent.DJICompletionCallback() {

                                @Override
                                public void onResult(DJIError error) {

                                }
                            });
        }
    }

    @Override
    protected void getBtn3Method() {
        if (mTimer == null) {
            mTimer = new Timer();
            mPitchSpeedRotation = new DJIGimbal.DJIGimbalSpeedRotation(10,
                    DJIGimbal.DJIGimbalRotateDirection.CounterClockwise);
            mGimbalRotationTimerTask = new GimbalRotateTimerTask(mPitchSpeedRotation,null,null);
            mTimer.schedule(mGimbalRotationTimerTask, 0, 100);
        }
    }

    class GimbalRotateTimerTask extends TimerTask {
        DJIGimbal.DJIGimbalSpeedRotation mPitch;
        DJIGimbal.DJIGimbalSpeedRotation mRoll;
        DJIGimbal.DJIGimbalSpeedRotation mYaw;

        GimbalRotateTimerTask(DJIGimbal.DJIGimbalSpeedRotation pitch, DJIGimbal.DJIGimbalSpeedRotation roll, DJIGimbal.DJIGimbalSpeedRotation yaw) {
            super();
            this.mPitch = pitch;
            this.mRoll = roll;
            this.mYaw = yaw;
        }
        @Override
        public void run() {
            if (DJIModuleVerificationUtil.isGimbalModuleValid()) {
                DJISampleApplication.getProductInstance().getGimbal().
                        rotateGimbalBySpeed(mPitch, mRoll, mYaw,
                                new DJIBaseComponent.DJICompletionCallback() {

                    @Override
                    public void onResult(DJIError error) {

                    }
                });
            }
        }

    }
}
