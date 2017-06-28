package com.dji.sdk.sample.demo.flightcontroller;

import android.app.Service;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.DialogUtils;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import com.dji.sdk.sample.internal.utils.OnScreenJoystick;
import com.dji.sdk.sample.internal.utils.OnScreenJoystickListener;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.PresentableView;
import dji.common.error.DJIError;
import dji.common.flightcontroller.simulator.InitializationData;
import dji.common.flightcontroller.simulator.SimulatorState;
import dji.common.flightcontroller.virtualstick.FlightControlData;
import dji.common.flightcontroller.virtualstick.FlightCoordinateSystem;
import dji.common.flightcontroller.virtualstick.RollPitchControlMode;
import dji.common.flightcontroller.virtualstick.VerticalControlMode;
import dji.common.flightcontroller.virtualstick.YawControlMode;
import dji.common.model.LocationCoordinate2D;
import dji.common.util.CommonCallbacks;
import java.util.Timer;
import java.util.TimerTask;

//TODO: Refactor needed
/**
 * Class for virtual stick.
 */
public class VirtualStickView extends RelativeLayout implements View.OnClickListener, PresentableView {

    private boolean yawControlModeFlag = true;
    private boolean rollPitchControlModeFlag = true;
    private boolean verticalControlModeFlag = true;
    private boolean horizontalCoordinateFlag = true;

    private Button btnEnableVirtualStick;
    private Button btnDisableVirtualStick;
    private Button btnHorizontalCoordinate;
    private Button btnSetYawControlMode;
    private Button btnSetVerticalControlMode;
    private Button btnSetRollPitchControlMode;
    private ToggleButton btnSimulator;
    private Button btnTakeOff;

    private TextView textView;

    private OnScreenJoystick screenJoystickRight;
    private OnScreenJoystick screenJoystickLeft;

    private Timer sendVirtualStickDataTimer;
    private SendVirtualStickDataTask sendVirtualStickDataTask;

    private float pitch;
    private float roll;
    private float yaw;
    private float throttle;

    public VirtualStickView(Context context) {
        super(context);
        initUI(context);
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }

    @Override
    protected void onDetachedFromWindow() {
        if (null != sendVirtualStickDataTimer) {
            sendVirtualStickDataTask.cancel();
            sendVirtualStickDataTask = null;
            sendVirtualStickDataTimer.cancel();
            sendVirtualStickDataTimer.purge();
            sendVirtualStickDataTimer = null;
        }
        super.onDetachedFromWindow();
    }

    private void initUI(Context context) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);

        layoutInflater.inflate(R.layout.view_virtual_stick, this, true);

        btnEnableVirtualStick = (Button) findViewById(R.id.btn_enable_virtual_stick);
        btnDisableVirtualStick = (Button) findViewById(R.id.btn_disable_virtual_stick);
        btnHorizontalCoordinate = (Button) findViewById(R.id.btn_horizontal_coordinate);
        btnSetYawControlMode = (Button) findViewById(R.id.btn_yaw_control_mode);
        btnSetVerticalControlMode = (Button) findViewById(R.id.btn_vertical_control_mode);
        btnSetRollPitchControlMode = (Button) findViewById(R.id.btn_roll_pitch_control_mode);
        btnTakeOff = (Button) findViewById(R.id.btn_take_off);

        btnSimulator = (ToggleButton) findViewById(R.id.btn_start_simulator);

        textView = (TextView) findViewById(R.id.textview_simulator);

        screenJoystickRight = (OnScreenJoystick) findViewById(R.id.directionJoystickRight);
        screenJoystickLeft = (OnScreenJoystick) findViewById(R.id.directionJoystickLeft);

        btnEnableVirtualStick.setOnClickListener(this);
        btnDisableVirtualStick.setOnClickListener(this);
        btnHorizontalCoordinate.setOnClickListener(this);
        btnSetYawControlMode.setOnClickListener(this);
        btnSetVerticalControlMode.setOnClickListener(this);
        btnSetRollPitchControlMode.setOnClickListener(this);
        btnTakeOff.setOnClickListener(this);

        btnSimulator.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    textView.setVisibility(VISIBLE);

                    DJISampleApplication.getAircraftInstance()
                                        .getFlightController()
                                        .getSimulator()
                                        .start(InitializationData.createInstance(new LocationCoordinate2D(23, 113),
                                                                                 10,
                                                                                 10),
                                               new CommonCallbacks.CompletionCallback() {
                                                   @Override
                                                   public void onResult(DJIError djiError) {

                                                   }
                                               });
                } else {

                    textView.setVisibility(INVISIBLE);

                    DJISampleApplication.getAircraftInstance()
                                        .getFlightController()
                                        .getSimulator()
                                        .stop(new CommonCallbacks.CompletionCallback() {
                                            @Override
                                            public void onResult(DJIError djiError) {

                                            }
                                        });
                }
            }
        });

        if (DJISampleApplication.getAircraftInstance() != null
            && DJISampleApplication.getAircraftInstance().getFlightController() != null
            && DJISampleApplication.getAircraftInstance().getFlightController().getSimulator() != null) {
            DJISampleApplication.getAircraftInstance()
                                .getFlightController()
                                .getSimulator()
                                .setStateCallback(new SimulatorState.Callback() {
                                    @Override
                                    public void onUpdate(@NonNull final SimulatorState simulatorState) {
                                        new Handler(Looper.getMainLooper()).post(new Runnable() {

                                            @Override
                                            public void run() {
                                                textView.setText("Yaw : "
                                                                     + simulatorState.getYaw()
                                                                     + ","
                                                                     + "X : "
                                                                     + simulatorState.getPositionX()
                                                                     + "\n"
                                                                     + "Y : "
                                                                     + simulatorState.getPositionY()
                                                                     + ","
                                                                     + "Z : "
                                                                     + simulatorState.getPositionZ());
                                            }
                                        });
                                    }
                                });
        } else {
            ToastUtils.setResultToToast("Disconnected!");
        }
        screenJoystickLeft.setJoystickListener(new OnScreenJoystickListener() {

            @Override
            public void onTouch(OnScreenJoystick joystick, float pX, float pY) {
                if (Math.abs(pX) < 0.02) {
                    pX = 0;
                }

                if (Math.abs(pY) < 0.02) {
                    pY = 0;
                }
                float pitchJoyControlMaxSpeed = 10;
                float rollJoyControlMaxSpeed = 10;

                if (horizontalCoordinateFlag) {
                    if (rollPitchControlModeFlag) {
                        pitch = (float) (pitchJoyControlMaxSpeed * pX);

                        roll = (float) (rollJoyControlMaxSpeed * pY);
                    } else {
                        pitch = -(float) (pitchJoyControlMaxSpeed * pY);

                        roll = (float) (rollJoyControlMaxSpeed * pX);
                    }
                }

                if (null == sendVirtualStickDataTimer) {
                    sendVirtualStickDataTask = new SendVirtualStickDataTask();
                    sendVirtualStickDataTimer = new Timer();
                    sendVirtualStickDataTimer.schedule(sendVirtualStickDataTask, 100, 200);
                }
            }
        });

        screenJoystickRight.setJoystickListener(new OnScreenJoystickListener() {

            @Override
            public void onTouch(OnScreenJoystick joystick, float pX, float pY) {
                if (Math.abs(pX) < 0.02) {
                    pX = 0;
                }

                if (Math.abs(pY) < 0.02) {
                    pY = 0;
                }
                float verticalJoyControlMaxSpeed = 2;
                float yawJoyControlMaxSpeed = 3;

                yaw = yawJoyControlMaxSpeed * pX;
                throttle = verticalJoyControlMaxSpeed * pY;

                if (null == sendVirtualStickDataTimer) {
                    sendVirtualStickDataTask = new SendVirtualStickDataTask();
                    sendVirtualStickDataTimer = new Timer();
                    sendVirtualStickDataTimer.schedule(sendVirtualStickDataTask, 0, 200);
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        if (!ModuleVerificationUtil.isFlightControllerAvailable()) {
            return;
        }
        switch (v.getId()) {
            case R.id.btn_enable_virtual_stick:
                DJISampleApplication.getAircraftInstance().
                    getFlightController().setVirtualStickModeEnabled(true, new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError djiError) {
                        DialogUtils.showDialogBasedOnError(getContext(), djiError);
                    }
                });
                break;

            case R.id.btn_disable_virtual_stick:
                DJISampleApplication.getAircraftInstance().
                    getFlightController().setVirtualStickModeEnabled(false, new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError djiError) {
                        DialogUtils.showDialogBasedOnError(getContext(), djiError);
                    }
                });
                break;

            case R.id.btn_roll_pitch_control_mode:
                if (rollPitchControlModeFlag) {
                    DJISampleApplication.getAircraftInstance().getFlightController().
                        setRollPitchControlMode(RollPitchControlMode.ANGLE);
                    rollPitchControlModeFlag = false;
                } else {
                    DJISampleApplication.getAircraftInstance().getFlightController().
                        setRollPitchControlMode(RollPitchControlMode.VELOCITY);
                    rollPitchControlModeFlag = true;
                }
                try {
                    ToastUtils.setResultToToast(DJISampleApplication.
                                                                        getAircraftInstance().getFlightController().
                                                                        getRollPitchControlMode().name());
                } catch (Exception ex) {
                }
                break;

            case R.id.btn_yaw_control_mode:
                if (yawControlModeFlag) {
                    DJISampleApplication.getAircraftInstance().getFlightController().
                        setYawControlMode(YawControlMode.ANGLE);
                    yawControlModeFlag = false;
                } else {
                    DJISampleApplication.getAircraftInstance().getFlightController().
                        setYawControlMode(YawControlMode.ANGULAR_VELOCITY);
                    yawControlModeFlag = true;
                }
                try {
                    ToastUtils.setResultToToast(DJISampleApplication.
                                                                        getAircraftInstance().getFlightController().
                                                                        getYawControlMode().name());
                } catch (Exception ex) {
                }
                break;

            case R.id.btn_vertical_control_mode:
                if (verticalControlModeFlag) {
                    DJISampleApplication.getAircraftInstance().getFlightController().
                        setVerticalControlMode(VerticalControlMode.POSITION);
                    verticalControlModeFlag = false;
                } else {
                    DJISampleApplication.getAircraftInstance().getFlightController().
                        setVerticalControlMode(VerticalControlMode.VELOCITY);
                    verticalControlModeFlag = true;
                }
                try {
                    ToastUtils.setResultToToast(DJISampleApplication.
                                                                        getAircraftInstance().getFlightController().
                                                                        getVerticalControlMode().name());
                } catch (Exception ex) {
                }
                break;

            case R.id.btn_horizontal_coordinate:
                if (horizontalCoordinateFlag) {
                    DJISampleApplication.getAircraftInstance()
                                        .getFlightController()
                                        .setRollPitchCoordinateSystem(FlightCoordinateSystem.GROUND);
                    horizontalCoordinateFlag = false;
                } else {
                    DJISampleApplication.getAircraftInstance().getFlightController().
                        setRollPitchCoordinateSystem(FlightCoordinateSystem.BODY);
                    horizontalCoordinateFlag = true;
                }
                try {
                    ToastUtils.setResultToToast(DJISampleApplication.
                                                                        getAircraftInstance().getFlightController().
                                                                        getRollPitchCoordinateSystem().name());
                } catch (Exception ex) {
                }
                break;

            case R.id.btn_take_off:

                DJISampleApplication.getAircraftInstance()
                                    .getFlightController()
                                    .startTakeoff(new CommonCallbacks.CompletionCallback() {
                                        @Override
                                        public void onResult(DJIError djiError) {
                                            DialogUtils.showDialogBasedOnError(getContext(), djiError);
                                        }
                                    });

                break;

            default:
                break;
        }
    }

    @Override
    public int getDescription() {
        return R.string.flight_controller_listview_virtual_stick;
    }

    private class SendVirtualStickDataTask extends TimerTask {

        @Override
        public void run() {
            if (ModuleVerificationUtil.isFlightControllerAvailable()) {
                DJISampleApplication.getAircraftInstance()
                                    .getFlightController()
                                    .sendVirtualStickFlightControlData(new FlightControlData(pitch,
                                                                                             roll,
                                                                                             yaw,
                                                                                             throttle),
                                                                       new CommonCallbacks.CompletionCallback() {
                                                                           @Override
                                                                           public void onResult(DJIError djiError) {

                                                                           }
                                                                       });
            }
        }
    }
}
