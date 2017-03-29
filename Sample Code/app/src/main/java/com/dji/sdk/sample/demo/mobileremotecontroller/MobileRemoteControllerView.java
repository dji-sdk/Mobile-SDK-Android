package com.dji.sdk.sample.demo.mobileremotecontroller;

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
import dji.common.model.LocationCoordinate2D;
import dji.common.util.CommonCallbacks.CompletionCallback;
import dji.sdk.mobilerc.MobileRemoteController;
import dji.sdk.products.Aircraft;

/**
 * Class for mobile remote controller.
 */
public class MobileRemoteControllerView extends RelativeLayout implements View.OnClickListener, PresentableView {

    private ToggleButton btnSimulator;
    private Button btnTakeOff;
    private Button autoLand;
    private Button forceLand;

    private TextView textView;

    private OnScreenJoystick screenJoystickRight;
    private OnScreenJoystick screenJoystickLeft;
    private MobileRemoteController mobileRemoteController;

    public MobileRemoteControllerView(Context context) {
        super(context);
        initUI(context);
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }

    private void initUI(Context context) {
        setClickable(true);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);

        layoutInflater.inflate(R.layout.view_mobile_rc, this, true);

        btnTakeOff = (Button) findViewById(R.id.btn_take_off);
        autoLand = (Button) findViewById(R.id.btn_auto_land);
        autoLand.setOnClickListener(this);
        forceLand = (Button) findViewById(R.id.btn_force_land);
        forceLand.setOnClickListener(this);
        btnSimulator = (ToggleButton) findViewById(R.id.btn_start_simulator);

        textView = (TextView) findViewById(R.id.textview_simulator);

        screenJoystickRight = (OnScreenJoystick) findViewById(R.id.directionJoystickRight);
        screenJoystickLeft = (OnScreenJoystick) findViewById(R.id.directionJoystickLeft);

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
                                                                                 10), new CompletionCallback() {
                                            @Override
                                            public void onResult(DJIError djiError) {

                                            }
                                        });
                } else {

                    textView.setVisibility(INVISIBLE);

                    DJISampleApplication.getAircraftInstance()
                                        .getFlightController()
                                        .getSimulator()
                                        .stop(new CompletionCallback() {
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
                                    public void onUpdate(final SimulatorState djiSimulatorStateData) {
                                        new Handler(Looper.getMainLooper()).post(new Runnable() {

                                            @Override
                                            public void run() {
                                                textView.setText("Yaw : "
                                                                     + djiSimulatorStateData.getYaw()
                                                                     + ","
                                                                     + "X : "
                                                                     + djiSimulatorStateData.getPositionX()
                                                                     + "\n"
                                                                     + "Y : "
                                                                     + djiSimulatorStateData.getPositionY()
                                                                     + ","
                                                                     + "Z : "
                                                                     + djiSimulatorStateData.getPositionZ());
                                            }
                                        });
                                    }
                                });
        } else {
            ToastUtils.setResultToToast("Disconnected!");
        }
        try {
            mobileRemoteController =
                ((Aircraft) DJISampleApplication.getAircraftInstance()).getMobileRemoteController();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        if (mobileRemoteController != null) {
            textView.setText(textView.getText() + "\n" + "Mobile Connected");
        } else {
            textView.setText(textView.getText() + "\n" + "Mobile Disconnected");
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
                //float PitchJoyControlMaxSpeed = DJIFlightControllerDataType.DJIVirtualStickVerticalControlMaxVelocity;
                //float RollJoyControlMaxSpeed = DJIFlightControllerDataType.DJIVirtualStickYawControlMaxAngularVelocity;
                //
                //yaw = (float) (RollJoyControlMaxSpeed * pX);
                //throttle = (float) (PitchJoyControlMaxSpeed * pY);

                if (mobileRemoteController != null) {
                    mobileRemoteController.setLeftStickHorizontal(pX);
                    mobileRemoteController.setLeftStickVertical(pY);
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
                //float PitchJoyControlMaxSpeed = DJIFlightControllerDataType.DJIVirtualStickRollPitchControlMaxVelocity;
                //float RollJoyControlMaxSpeed = DJIFlightControllerDataType.DJIVirtualStickRollPitchControlMaxVelocity;
                //
                //pitch = (float) (PitchJoyControlMaxSpeed * pY);
                //roll = (float) (RollJoyControlMaxSpeed * pX);
                if (mobileRemoteController != null) {
                    mobileRemoteController.setRightStickHorizontal(pX);
                    mobileRemoteController.setRightStickVertical(pY);
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
            case R.id.btn_take_off:

                DJISampleApplication.getAircraftInstance().getFlightController().startTakeoff(new CompletionCallback() {
                    @Override
                    public void onResult(DJIError djiError) {
                        DialogUtils.showDialogBasedOnError(getContext(), djiError);
                    }
                });
                break;
            case R.id.btn_force_land:
                DJISampleApplication.getAircraftInstance()
                                    .getFlightController()
                                    .confirmLanding(new CompletionCallback() {
                                        @Override
                                        public void onResult(DJIError djiError) {
                                            DialogUtils.showDialogBasedOnError(getContext(), djiError);
                                        }
                                    });
                break;
            case R.id.btn_auto_land:
                DJISampleApplication.getAircraftInstance().getFlightController().startLanding(new CompletionCallback() {
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
        return R.string.component_listview_mobile_remote_controller;
    }
}
