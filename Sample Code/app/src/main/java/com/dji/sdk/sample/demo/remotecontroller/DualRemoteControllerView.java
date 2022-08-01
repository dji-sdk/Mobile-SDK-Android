package com.dji.sdk.sample.demo.remotecontroller;

import android.app.Service;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.PresentableView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.common.error.DJIError;
import dji.common.remotecontroller.RCMode;
import dji.keysdk.DJIKey;
import dji.keysdk.FlightControllerKey;
import dji.keysdk.KeyManager;
import dji.keysdk.RemoteControllerKey;
import dji.keysdk.callback.ActionCallback;
import dji.keysdk.callback.KeyListener;
import dji.midware.data.model.P3.DataGetPushMultiRcAuthOwnerStatus;
import dji.midware.data.model.P3.DataMultiRcControlAuthoritySurpass;
import dji.sdk.remotecontroller.RemoteController;

public class DualRemoteControllerView extends RelativeLayout implements PresentableView {
    TextView dualRemoteControllerStatus = null;
    Button channelAPairing = null;
    Button channelBPairing = null;
    Button takeGimbalControl = null;
    Button takeAircraftControl = null;

    RemoteController remoteController = null;

    public DualRemoteControllerView(Context context) {
        super(context);
        initUI(context);
        initModule();
        initListener();
    }

    void initUI(Context context) {
        setClickable(true);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.view_dual_remote_controller, this, true);
        dualRemoteControllerStatus = findViewById(R.id.dual_remote_controller_status);
        channelAPairing = findViewById(R.id.channel_A_pairing);
        channelBPairing = findViewById(R.id.channel_B_pairing);
        takeGimbalControl = findViewById(R.id.take_gimbal_control);
        takeAircraftControl = findViewById(R.id.take_aircraft_control);
    }

    void initModule() {
        if (ModuleVerificationUtil.isRemoteControllerAvailable()) {
            remoteController = DJISampleApplication.getAircraftInstance().getRemoteController();
        }
    }

    void initListener() {
        channelAPairing.setOnClickListener(view -> {
            if (remoteController != null) {
                remoteController.startModePairing(RCMode.CHANNEL_A, djiError -> {
                    if (djiError == null) {
                        ToastUtils.setResultToToast("startModePairing with channel A successfully.");
                        if (dualRemoteControllerStatus != null) {
                            dualRemoteControllerStatus.setText("The current remote controller is using Channel A.");
                        }
                    } else {
                        ToastUtils.setResultToToast("startModePairing with channel A failed, description: " + djiError.getDescription());
                    }
                });
            }
        });
        channelBPairing.setOnClickListener(view -> {
            if (remoteController != null) {
                remoteController.startModePairing(RCMode.CHANNEL_B, djiError -> {
                    if (djiError == null) {
                        ToastUtils.setResultToToast("startModePairing with channel B successfully.");
                        if (dualRemoteControllerStatus != null) {
                            dualRemoteControllerStatus.setText("The current remote controller is using Channel B.");
                        }
                    } else {
                        ToastUtils.setResultToToast("startModePairing with channel B failed, description: " + djiError.getDescription());
                    }
                });
            }
        });
        takeGimbalControl.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (remoteController != null) {
                    ArrayList<DataMultiRcControlAuthoritySurpass.RCAuthority> authorityArrayList = new ArrayList<>();
                    authorityArrayList.add(DataMultiRcControlAuthoritySurpass.RCAuthority.Gimbal1ControlAuth);
                    authorityArrayList.add(DataMultiRcControlAuthoritySurpass.RCAuthority.Gimbal2ControlAuth);
                    authorityArrayList.add(DataMultiRcControlAuthoritySurpass.RCAuthority.Gimbal3ControlAuth);
                    remoteController.setRCAuthSurpass(authorityArrayList, djiError -> {
                        if (djiError == null) {
                            ToastUtils.setResultToToast("This RC has taken all gimbals control");
                        } else {
                            ToastUtils.setResultToToast("Take gimbal control failed, description: " + djiError.getDescription());
                        }
                    });
                }
            }
        });
        takeAircraftControl.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (remoteController != null) {
                    ArrayList<DataMultiRcControlAuthoritySurpass.RCAuthority> authorityArrayList = new ArrayList<>();
                    authorityArrayList.add(DataMultiRcControlAuthoritySurpass.RCAuthority.FlightControlAuth);
                    remoteController.setRCAuthSurpass(authorityArrayList, djiError -> {
                        if (djiError == null) {
                            ToastUtils.setResultToToast("This RC has taken the aircraft control");
                        } else {
                            ToastUtils.setResultToToast("Take aircraft control failed, description: " + djiError.getDescription());
                        }
                    });
                }
            }
        });
        DJIKey multiRCControlAuthoritySurpass = RemoteControllerKey.create(RemoteControllerKey.MULTI_RC_GIMBALS_CONTROL_AUTH_OWNER);
        KeyManager.getInstance().addListener(multiRCControlAuthoritySurpass, new KeyListener() {
            @Override
            public void onValueChange(@Nullable Object oldValue, @Nullable Object newValue) {
                if (newValue != null) {
                    DataGetPushMultiRcAuthOwnerStatus.RCModeChannel[] rcModeChannel = (DataGetPushMultiRcAuthOwnerStatus.RCModeChannel[]) newValue;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Current RC's control: \n");
                    for (int i = 0; i < rcModeChannel.length; i++) {
                        sb.append(rcModeChannel[i].name());
                        sb.append("\n");
                    }
                    ToastUtils.setResultToToast(sb.toString());
                }
            }
        });
        DJIKey multiRCFlightControlAuthOwner = FlightControllerKey.createFlightAssistantKey(FlightControllerKey.MULTI_RC_FLIGHT_CONTROL_AUTH_OWNER);
        KeyManager.getInstance().addListener(multiRCFlightControlAuthOwner, new KeyListener() {
            @Override
            public void onValueChange(@Nullable Object oldValue, @Nullable Object newValue) {
                if (newValue != null) {
                    DataGetPushMultiRcAuthOwnerStatus.RCModeChannel controlAuth = (DataGetPushMultiRcAuthOwnerStatus.RCModeChannel) newValue;
                    ToastUtils.setResultToToast("RC flight control auth belongs to " + controlAuth.name());
                }
            }
        });
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public int getDescription() {
        return R.string.component_listview_dual_remote_controller;
    }

    @NonNull
    @NotNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }
}
