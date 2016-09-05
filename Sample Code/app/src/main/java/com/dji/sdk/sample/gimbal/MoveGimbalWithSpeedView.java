package com.dji.sdk.sample.gimbal;

import android.content.Context;
import android.util.AttributeSet;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.common.BaseThreeBtnView;
import com.dji.sdk.sample.common.DJISampleApplication;
import com.dji.sdk.sample.utils.DJIModuleVerificationUtil;

import java.util.Timer;
import java.util.TimerTask;

import dji.common.error.DJIError;
import dji.common.gimbal.DJIGimbalRotateDirection;
import dji.common.gimbal.DJIGimbalSpeedRotation;
import dji.common.util.DJICommonCallbacks;
import dji.sdk.base.DJIBaseComponent;

/**
 * Class for moving gimbal with speed.
 */
public class MoveGimbalWithSpeedView extends BaseThreeBtnView {
    private Timer mTimer;
    private GimbalRotateTimerTask mGimbalRotationTimerTask;

    private DJIGimbalSpeedRotation mPitchSpeedRotation;

    public MoveGimbalWithSpeedView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected int getMiddleBtnTextResourceId() {
        return R.string.move_gimbal_in_speed_up;
    }

    @Override
    protected int getLeftBtnTextResourceId() {
        return R.string.move_gimbal_in_speed_stop;
    }

    @Override
    protected int getRightBtnTextResourceId() {
        return R.string.move_gimbal_in_speed_down;
    }

    @Override
    protected int getInfoResourceId() {
        return R.string.move_gimbal_in_speed_description;
    }

    @Override
    protected void getMiddleBtnMethod() {
        if (mTimer == null) {
            mTimer = new Timer();
            mPitchSpeedRotation = new DJIGimbalSpeedRotation(10,
                    DJIGimbalRotateDirection.Clockwise);
            mGimbalRotationTimerTask = new GimbalRotateTimerTask(mPitchSpeedRotation,null,null);
            mTimer.schedule(mGimbalRotationTimerTask, 0, 100);
        }
    }

    @Override
    protected void getLeftBtnMethod() {
        if (mTimer != null) {
            mGimbalRotationTimerTask.cancel();
            mTimer.cancel();
            mTimer.purge();
            mGimbalRotationTimerTask = null;
            mTimer = null;
        }

        if (DJIModuleVerificationUtil.isGimbalModuleAvailable()) {
            DJISampleApplication.getProductInstance().getGimbal().
                    rotateGimbalBySpeed(null, null, null,
                            new DJICommonCallbacks.DJICompletionCallback() {

                                @Override
                                public void onResult(DJIError error) {

                                }
                            });
        }
    }

    @Override
    protected void getRightBtnMethod() {
        if (mTimer == null) {
            mTimer = new Timer();
            mPitchSpeedRotation = new DJIGimbalSpeedRotation(10,
                    DJIGimbalRotateDirection.CounterClockwise);
            mGimbalRotationTimerTask = new GimbalRotateTimerTask(mPitchSpeedRotation,null,null);
            mTimer.schedule(mGimbalRotationTimerTask, 0, 100);
        }
    }

    class GimbalRotateTimerTask extends TimerTask {
        DJIGimbalSpeedRotation mPitch;
        DJIGimbalSpeedRotation mRoll;
        DJIGimbalSpeedRotation mYaw;

        GimbalRotateTimerTask(DJIGimbalSpeedRotation pitch, DJIGimbalSpeedRotation roll, DJIGimbalSpeedRotation yaw) {
            super();
            this.mPitch = pitch;
            this.mRoll = roll;
            this.mYaw = yaw;
        }
        @Override
        public void run() {
            if (DJIModuleVerificationUtil.isGimbalModuleAvailable()) {
                DJISampleApplication.getProductInstance().getGimbal().
                        rotateGimbalBySpeed(mPitch, mRoll, mYaw,
                                new DJICommonCallbacks.DJICompletionCallback() {

                    @Override
                    public void onResult(DJIError error) {

                    }
                });
            }
        }

    }
}
