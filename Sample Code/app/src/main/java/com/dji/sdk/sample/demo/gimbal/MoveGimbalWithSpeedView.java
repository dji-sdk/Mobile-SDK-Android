package com.dji.sdk.sample.demo.gimbal;

import android.content.Context;
import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.view.BaseThreeBtnView;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import dji.common.error.DJIError;
import dji.common.gimbal.Rotation;
import dji.common.gimbal.RotationMode;
import dji.common.util.CommonCallbacks;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Class for moving gimbal with speed.
 */
public class MoveGimbalWithSpeedView extends BaseThreeBtnView {
    private Timer timer;
    private GimbalRotateTimerTask gimbalRotationTimerTask;

    public MoveGimbalWithSpeedView(Context context) {
        super(context);
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
    protected int getDescriptionResourceId() {
        return R.string.move_gimbal_in_speed_description;
    }

    @Override
    protected void handleMiddleBtnClick() {
        if (timer == null) {
            timer = new Timer();
            gimbalRotationTimerTask = new GimbalRotateTimerTask(10);
            timer.schedule(gimbalRotationTimerTask, 0, 100);
        }
    }

    @Override
    protected void handleLeftBtnClick() {
        if (timer != null) {
            if(gimbalRotationTimerTask != null) {
                gimbalRotationTimerTask.cancel();
            }
            timer.cancel();
            timer.purge();
            gimbalRotationTimerTask = null;
            timer = null;
        }

        if (ModuleVerificationUtil.isGimbalModuleAvailable()) {
            DJISampleApplication.getProductInstance().getGimbal().
                rotate(null, new CommonCallbacks.CompletionCallback() {

                    @Override
                    public void onResult(DJIError error) {

                    }
                });
        }
    }
    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (timer != null) {
            if(gimbalRotationTimerTask != null) {
                gimbalRotationTimerTask.cancel();
            }
            timer.cancel();
            timer.purge();
            gimbalRotationTimerTask = null;
            timer = null;
        }
    }

    @Override
    protected void handleRightBtnClick() {
        if (timer == null) {
            timer = new Timer();
            gimbalRotationTimerTask = new GimbalRotateTimerTask(-10);
            timer.schedule(gimbalRotationTimerTask, 0, 100);
        }
    }

    @Override
    public int getDescription() {
        return R.string.gimbal_listview_rotate_gimbal;
    }

    private static class GimbalRotateTimerTask extends TimerTask {
        float pitchValue;

        GimbalRotateTimerTask(float pitchValue) {
            super();
            this.pitchValue = pitchValue;
        }

        @Override
        public void run() {
            if (ModuleVerificationUtil.isGimbalModuleAvailable()) {
                DJISampleApplication.getProductInstance().getGimbal().
                    rotate(new Rotation.Builder().pitch(pitchValue)
                                                 .mode(RotationMode.SPEED)
                                                 .yaw(Rotation.NO_ROTATION)
                                                 .roll(Rotation.NO_ROTATION)
                                                 .time(0)
                                                 .build(), new CommonCallbacks.CompletionCallback() {

                        @Override
                        public void onResult(DJIError error) {

                        }
                    });
            }
        }
    }
}
