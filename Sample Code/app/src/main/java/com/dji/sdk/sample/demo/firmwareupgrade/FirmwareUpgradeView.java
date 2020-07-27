package com.dji.sdk.sample.demo.firmwareupgrade;

import android.app.Service;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.PresentableView;

import dji.sdk.sdkmanager.DJISDKManager;
import dji.sdk.upgrade.UpgradeManager;
import dji.sdk.upgrade.component.UpgradeComponent;
import dji.sdk.upgrade.component.UpgradeFirmwareListener;
import dji.sdk.upgrade.component.model.FirmwareInformation;
import dji.sdk.upgrade.component.model.FirmwareUpgradeProgress;
import dji.sdk.upgrade.component.model.UpgradeComponentType;
import dji.sdk.upgrade.component.model.UpgradeFirmwareState;

/**
 * Class for live stream demo.
 *
 * @author Jiasi
 * @date 2019/10/18
 * <p>
 * Copyright (c) 2019, DJI All Rights Reserved.
 */
public class FirmwareUpgradeView extends LinearLayout implements View.OnClickListener, PresentableView {

    protected Button startConsistentUpgradeBtn;
    protected Button stopConsistentUpgradeBtn;
    protected Button getUpgradeStateBtn;
    protected Button getCurrentFirmwareInfoBtn;

    protected TextView mAcUpgradeStateTV;
    protected TextView mAcUpgradeProgressTV;
    protected TextView mAcConsistentStateTV;
    protected TextView mAcFirmwareInfoTV;
    protected TextView mRcUpgradeStateTV;
    protected TextView mRcUpgradeProgressTV;
    protected TextView mRcConsistentStateTV;
    protected TextView mRcFirmwareInfoTV;

    protected AlertDialog dlg;

    private UpgradeComponent remoteControllerComponent;
    private UpgradeComponent aircraftUpgradeComponent;
    private UpgradeManager upgradeManager;

    protected Handler handler = new Handler(Looper.getMainLooper());

    public FirmwareUpgradeView(Context context) {
        super(context);
        initUI(context);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        initUpgradeData();
        bindData();
    }

    @Override
    protected void onDetachedFromWindow() {
        unBindData();
        super.onDetachedFromWindow();
    }

    private void initUI(Context context) {
        setClickable(true);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.view_firmware_upgrade, this, true);

        startConsistentUpgradeBtn = (Button) findViewById(R.id.btn_start_consistent_upgrade);
        stopConsistentUpgradeBtn = (Button) findViewById(R.id.btn_stop_consistent_upgrade);
        getUpgradeStateBtn = (Button) findViewById(R.id.btn_get_upgrade_state);
        getCurrentFirmwareInfoBtn = (Button) findViewById(R.id.btn_get_current_firmware_info);

        mAcUpgradeStateTV = (TextView) findViewById(R.id.tv_ac_upgrade_state);
        mAcUpgradeProgressTV = (TextView) findViewById(R.id.tv_ac_upgrade_progress);
        mAcConsistentStateTV = (TextView) findViewById(R.id.tv_ac_consistent_state);
        mAcFirmwareInfoTV = (TextView) findViewById(R.id.tv_ac_firmware_info);
        mRcUpgradeStateTV = (TextView) findViewById(R.id.tv_rc_upgrade_state);
        mRcUpgradeProgressTV = (TextView) findViewById(R.id.tv_rc_upgrade_progress);
        mRcConsistentStateTV = (TextView) findViewById(R.id.tv_rc_consistent_state);
        mRcFirmwareInfoTV = (TextView) findViewById(R.id.tv_rc_firmware_info);

        startConsistentUpgradeBtn.setOnClickListener(this);
        stopConsistentUpgradeBtn.setOnClickListener(this);
        getUpgradeStateBtn.setOnClickListener(this);
        getCurrentFirmwareInfoBtn.setOnClickListener(this);
    }

    private void initUpgradeData() {
        remoteControllerComponent = getRemoteControllerComponent();
        aircraftUpgradeComponent = getAircraftUpgradeComponent();
        if (remoteControllerComponent != null) {
            showUpgradeFirmwareState(mRcUpgradeStateTV, "RC: " + remoteControllerComponent.getUpgradeState());
        }
        if (aircraftUpgradeComponent != null) {
            showUpgradeFirmwareState(mAcUpgradeStateTV, "AC: " + aircraftUpgradeComponent.getUpgradeState());
        }
    }

    private void bindData() {
        if (remoteControllerComponent != null) {
            remoteControllerComponent.addUpgradeFirmwareListener(remoteControllerUpgradeListener);
        }
        if (aircraftUpgradeComponent != null) {
            aircraftUpgradeComponent.addUpgradeFirmwareListener(aircraftUpgradeListener);
        }
    }

    private void unBindData() {
        if (remoteControllerComponent != null) {
            remoteControllerComponent.removeUpgradeFirmwareListener(remoteControllerUpgradeListener);
        }
        if (aircraftUpgradeComponent != null) {
            aircraftUpgradeComponent.removeUpgradeFirmwareListener(aircraftUpgradeListener);
        }
    }

    private UpgradeFirmwareListener remoteControllerUpgradeListener = new UpgradeFirmwareListener() {

        @Override
        public void onUpgradeFirmwareStateUpdated(@NonNull UpgradeComponent upgradeComponent, @NonNull dji.sdk.upgrade.component.model.UpgradeFirmwareState upgradeFirmwareState) {
            showUpgradeFirmwareState(mRcUpgradeStateTV, "RC: " + upgradeFirmwareState);
        }

        @Override
        public void onFirmwareUpgradeProgressUpdated(@NonNull UpgradeComponent upgradeComponent, @NonNull FirmwareUpgradeProgress progress) {
            showFirmwareUpgradeProgress(mRcUpgradeProgressTV, progress, "Remote Controller:\n");
        }

        @Override
        public void onConsistencyUpgradeRequestReceived(@NonNull UpgradeComponent upgradeComponent) {
            boolean canCancelConsistencyUpgrade = false;
            if (upgradeComponent != null) {
                canCancelConsistencyUpgrade = upgradeComponent.canCancelConsistencyUpgrade();
            }
            showUpgradeConsistentUpdated(mRcConsistentStateTV, canCancelConsistencyUpgrade, "Remote Controller:\n");
        }

        @Override
        public void onLatestFirmwareInformationUpdated(@NonNull UpgradeComponent upgradeComponent, FirmwareInformation firmwareInformation) {
            showUpgradeFirmwareInfo(upgradeComponent, firmwareInformation);
        }

    };

    private UpgradeFirmwareListener aircraftUpgradeListener = new UpgradeFirmwareListener() {

        @Override
        public void onUpgradeFirmwareStateUpdated(@NonNull UpgradeComponent upgradeComponent, @NonNull dji.sdk.upgrade.component.model.UpgradeFirmwareState state) {
            showUpgradeFirmwareState(mAcUpgradeStateTV, "AC: " + state);
        }

        @Override
        public void onFirmwareUpgradeProgressUpdated(@NonNull UpgradeComponent upgradeComponent, @NonNull FirmwareUpgradeProgress progress) {
            showFirmwareUpgradeProgress(mAcUpgradeProgressTV, progress, "Aircraft:\n");
        }

        @Override
        public void onConsistencyUpgradeRequestReceived(@NonNull UpgradeComponent upgradeComponent) {
            boolean canCancelConsistencyUpgrade = false;
            if (upgradeComponent != null) {
                canCancelConsistencyUpgrade = upgradeComponent.canCancelConsistencyUpgrade();
            }
            showUpgradeConsistentUpdated(mAcConsistentStateTV, canCancelConsistencyUpgrade, "Aircraft:\n");
        }

        @Override
        public void onLatestFirmwareInformationUpdated(@NonNull UpgradeComponent upgradeComponent, FirmwareInformation firmwareInformation) {
            showUpgradeFirmwareInfo(upgradeComponent, firmwareInformation);
        }
    };

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_start_consistent_upgrade:
                startFirmwareConsistencyUpgradeWithCompletion();
                break;
            case R.id.btn_stop_consistent_upgrade:
                stopFirmwareConsistencyUpgradeWithCompletion();
                break;
            case R.id.btn_get_upgrade_state:
                getCurrentUpgradeFirmwareState();
                break;
            case R.id.btn_get_current_firmware_info:
                getUpgradeFirmwareInformation();
                break;
            default:
                break;
        }
    }

    private void startFirmwareConsistencyUpgradeWithCompletion() {
        final UpgradeComponentType[] componentTypes = UpgradeComponentType.values();
        dlg = new AlertDialog.Builder(getContext())
                .setTitle("Choose a component")
                .setSingleChoiceItems(new String[]{"Remote Controller", "Aircraft"}, 0, (dialog, which) -> {
                    UpgradeComponent selectedComponent = null;
                    if (componentTypes[which] == UpgradeComponentType.REMOTE_CONTROLLER) {
                        selectedComponent = remoteControllerComponent;
                    }
                    if (componentTypes[which] == UpgradeComponentType.AIRCRAFT) {
                        selectedComponent = aircraftUpgradeComponent;
                    }
                    startFirmwareConsistencyUpgradeWithCompletion(selectedComponent);
                    dialog.dismiss();
                }).create();
        dlg.show();
    }

    private void startFirmwareConsistencyUpgradeWithCompletion(UpgradeComponent upgradeComponent) {
        if (upgradeComponent == null) {
            ToastUtils.setResultToToast("Failed! Wrong parameters!");
            return;
        }
        upgradeComponent.startFirmwareConsistencyUpgrade(error -> ToastUtils.setResultToToast(
                error == null ? "Success!" : ("Failed! The error is: " + error.getDescription())));
    }

    private void stopFirmwareConsistencyUpgradeWithCompletion() {
        final UpgradeComponentType[] componentTypes = UpgradeComponentType.values();
        dlg = new AlertDialog.Builder(getContext())
                .setTitle("Choose a component")
                .setSingleChoiceItems(new String[]{"Remote Controller", "Aircraft"}, 0, (dialog, which) -> {
                    UpgradeComponent selectedComponent = null;
                    if (componentTypes[which] == UpgradeComponentType.REMOTE_CONTROLLER) {
                        selectedComponent = remoteControllerComponent;
                    }
                    if (componentTypes[which] == UpgradeComponentType.AIRCRAFT) {
                        selectedComponent = aircraftUpgradeComponent;
                    }
                    stopFirmwareConsistencyUpgradeWithCompletion(selectedComponent);
                    dialog.dismiss();
                }).create();
        dlg.show();
    }

    private void stopFirmwareConsistencyUpgradeWithCompletion(UpgradeComponent upgradeComponent) {
        if (upgradeComponent == null) {
            ToastUtils.setResultToToast("failed: Wrong parameters!");
            return;
        }
        upgradeComponent.stopFirmwareConsistencyUpgrade(error -> ToastUtils.setResultToToast(
                error == null ? "Success!" : ("Failed! The error is:" + error.getDescription())));
    }

    private void getCurrentUpgradeFirmwareState() {
        final UpgradeComponentType[] componentTypes = UpgradeComponentType.values();
        dlg = new AlertDialog.Builder(getContext())
                .setTitle("Choose a component")
                .setSingleChoiceItems(new String[]{"Remote Controller", "Aircraft"}, 0, (dialog, which) -> {
                    UpgradeComponent selectedComponent = null;
                    if (componentTypes[which] == UpgradeComponentType.REMOTE_CONTROLLER) {
                        selectedComponent = remoteControllerComponent;
                    }
                    if (componentTypes[which] == UpgradeComponentType.AIRCRAFT) {
                        selectedComponent = aircraftUpgradeComponent;
                    }
                    getCurrentUpgradeFirmwareState(selectedComponent);
                    dialog.dismiss();
                }).create();
        dlg.show();
    }

    private void getUpgradeFirmwareInformation() {
        final UpgradeComponentType[] componentTypes = UpgradeComponentType.values();
        dlg = new AlertDialog.Builder(getContext())
                .setTitle("Choose a component")
                .setSingleChoiceItems(new String[]{"Remote Controller", "Aircraft"}, 0, (dialog, which) -> {
                    UpgradeComponent selectedComponent = null;
                    if (componentTypes[which] == UpgradeComponentType.REMOTE_CONTROLLER) {
                        selectedComponent = remoteControllerComponent;
                    }
                    if (componentTypes[which] == UpgradeComponentType.AIRCRAFT) {
                        selectedComponent = aircraftUpgradeComponent;
                    }
                    getUpgradeFirmwareInformation(selectedComponent);
                    dialog.dismiss();
                }).create();
        dlg.show();
    }

    private UpgradeComponent getRemoteControllerComponent() {
        if (remoteControllerComponent != null) {
            return remoteControllerComponent;
        }

        if (upgradeManager == null) {
            upgradeManager = DJISDKManager.getInstance().getUpgradeManager();
        }

        if (upgradeManager != null) {
            return upgradeManager.getRemoteControllerUpgradeComponent();
        }

        return null;
    }

    private UpgradeComponent getAircraftUpgradeComponent() {
        if (aircraftUpgradeComponent != null) {
            return aircraftUpgradeComponent;
        }

        if (upgradeManager == null) {
            upgradeManager = DJISDKManager.getInstance().getUpgradeManager();
        }

        if (upgradeManager != null) {
            return upgradeManager.getAircraftUpgradeComponent();
        }

        return null;
    }

    private void getCurrentUpgradeFirmwareState(UpgradeComponent upgradeComponent) {
        if (upgradeComponent == null) {
            ToastUtils.setResultToToast("failed: Wrong parameters!");
            return;
        }
        UpgradeFirmwareState state = upgradeComponent.getUpgradeState();
        ToastUtils.setResultToToast("Current firmwareupgrade firmware state:" + state);
    }

    private void getUpgradeFirmwareInformation(final UpgradeComponent upgradeComponent) {
        if (upgradeComponent == null) {
            ToastUtils.setResultToToast("failed: Wrong parameters!");
            return;
        }
        FirmwareInformation info = upgradeComponent.getLatestFirmwareInformation();
        if (info == null) {
            ToastUtils.setResultToToast("Can not get the firmwareupgrade firmware info now, please check the internet or invoke the checkFirmwareUpgradeState");
            return;
        }
        ToastUtils.setResultToToast("Upgrade Firmware info:" + "\n"
                + "Firmware Version:" + info.getVersion() + "\n"
                + "file size:" + info.getFileSize() + "\n"
                + "release time:" + info.getReleaseDate() + "\n"
                + "release note:" + info.getReleaseNote() + "\n");
        showUpgradeFirmwareInfo(upgradeComponent, info);
    }

    private void showUpgradeFirmwareState(final TextView tv, String state) {
        ToastUtils.setResultToText(tv, state);
    }

    private void showFirmwareUpgradeProgress(final TextView tv, FirmwareUpgradeProgress progress, String component) {
        StringBuilder builder = new StringBuilder();
        builder.append(component)
                .append("Process State:" + progress.getState() + "\n")
                .append("Current Progress" + progress.getProgress() + "\n");
        ToastUtils.setResultToText(tv, builder.toString());
    }

    private void showUpgradeConsistentUpdated(final TextView tv, boolean isForceUpgrade, String component) {
        StringBuilder builder = new StringBuilder();
        builder.append(component).append("canCancelUpgrade:" + isForceUpgrade + "\n");
        ToastUtils.setResultToText(tv, builder.toString());
    }

    private void showUpgradeFirmwareInfo(UpgradeComponent component, FirmwareInformation info) {
        String title = "Remote Controller:\n";
        TextView tv = mRcFirmwareInfoTV;
        if (component == remoteControllerComponent) {
            tv = mRcFirmwareInfoTV;
            title = "Remote Controller:\n";
        }
        if (component == aircraftUpgradeComponent) {
            tv = mAcFirmwareInfoTV;
            title = "Aircraft:\n";
        }
        StringBuilder builder = new StringBuilder();
        builder.append(title)
                .append("Firmware Version:" + info.getVersion() + "\n")
                .append("file size:" + info.getFileSize() + "\n")
                .append("release time:" + info.getReleaseDate() + "\n")
                .append("release note:" + info.getReleaseNote() + "\n");
        ToastUtils.setResultToText(tv, builder.toString());
    }

    @Override
    public int getDescription() { return R.string.component_listview_firmware_upgrade; }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }
}
