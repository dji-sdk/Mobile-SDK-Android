package com.dji.sdk.sample.demo.firmwareupgrade;

import android.app.Service;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.utils.Helper;
import com.dji.sdk.sample.internal.utils.PopupUtils;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.PresentableView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import dji.common.product.Model;
import dji.sdk.base.BaseProduct;
import dji.sdk.sdkmanager.DJISDKManager;
import dji.sdk.upgrade.UpgradeComponentChangeListener;
import dji.sdk.upgrade.UpgradeManager;
import dji.sdk.upgrade.component.UpgradeComponent;
import dji.sdk.upgrade.component.UpgradeFirmwareListener;
import dji.sdk.upgrade.component.model.FirmwareInformation;
import dji.sdk.upgrade.component.model.FirmwareUpgradeProgress;
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
    private TextView mComponentListTV;

    private UpgradeComponent remoteControllerComponent;
    private UpgradeComponent aircraftUpgradeComponent;
    private UpgradeManager upgradeManager;

    protected Handler handler = new Handler(Looper.getMainLooper());

    private static final int MSG_REFRESH_CONSISTENT_UPGRADE_INFO = 0x01;
    private static final int TIME_AFTER_LAST_CONSISTENT_PUSH = 5000; //5s

    public FirmwareUpgradeView(Context context) {
        super(context);
        initUI(context);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        initUpgradeData();
        initHandle();
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
        mComponentListTV = (TextView) findViewById(R.id.tv_component_list);

        startConsistentUpgradeBtn.setOnClickListener(this);
        stopConsistentUpgradeBtn.setOnClickListener(this);
        getUpgradeStateBtn.setOnClickListener(this);
        getCurrentFirmwareInfoBtn.setOnClickListener(this);
    }

    private void initHandle() {
        handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                switch (msg.what) {
                    case MSG_REFRESH_CONSISTENT_UPGRADE_INFO:
                        UpgradeComponent component = (UpgradeComponent) msg.obj;
                        showUpgradeConsistentUpdated(mAcConsistentStateTV, component);
                        closeInfoShow(mAcConsistentStateTV, "isCancelUpgrade");
                        break;
                }
            }
        };
    }

    private void initUpgradeData() {
        showUpgradeFirmwareState(mAcUpgradeStateTV);
        showUpgradeFirmwareInfo(mAcFirmwareInfoTV);
        updateComponent();
        if (upgradeManager == null) {
            upgradeManager = DJISDKManager.getInstance().getUpgradeManager();
        }
        upgradeManager.addUpgradeComponentChangeListener(upgradeComponentChangeListener);
    }

    private void unBindData() {
        if (upgradeManager == null) {
            upgradeManager = DJISDKManager.getInstance().getUpgradeManager();
        }
        upgradeManager.removeUpgradeComponentChangeListener(upgradeComponentChangeListener);
        List<UpgradeComponent> components = getDynamicUpgradeComponents();
        if (components != null) {
            for (UpgradeComponent component : components) {
                component.removeUpgradeFirmwareListener(UpgradeFirmwareListener);
            }
        }
    }

    private UpgradeComponentChangeListener upgradeComponentChangeListener = (type, component, isConnected) -> {
        updateComponent();
        updateDynamicState(component, isConnected);
    };

    private UpgradeFirmwareListener UpgradeFirmwareListener = new UpgradeFirmwareListener() {

        @Override
        public void onUpgradeFirmwareStateUpdated(@NonNull UpgradeComponent component,
                                                  @NonNull UpgradeFirmwareState state) {
            showUpgradeFirmwareState(mAcUpgradeStateTV);
        }

        @Override
        public void onFirmwareUpgradeProgressUpdated(UpgradeComponent component, FirmwareUpgradeProgress progress) {
            showFirmwareUpgradeProgress(mAcUpgradeProgressTV, component, progress);
        }

        @Override
        public void onConsistencyUpgradeRequestReceived(UpgradeComponent component) {
            if (handler != null) {
                if (handler.hasMessages(MSG_REFRESH_CONSISTENT_UPGRADE_INFO)) {
                    handler.removeMessages(MSG_REFRESH_CONSISTENT_UPGRADE_INFO);
                }
                Message info = new Message();
                info.what = MSG_REFRESH_CONSISTENT_UPGRADE_INFO;
                info.obj = component;
                handler.sendMessageDelayed(info, TIME_AFTER_LAST_CONSISTENT_PUSH);
            }

            showUpgradeConsistentUpdated(mAcConsistentStateTV, component);
        }

        @Override
        public void onLatestFirmwareInformationUpdated(UpgradeComponent component, FirmwareInformation firmwareInformation) {
            showUpgradeFirmwareInfo(mAcFirmwareInfoTV);
        }
    };

    private void updateDynamicState(UpgradeComponent component, boolean isConnected) {
        StringBuilder builder = new StringBuilder();
        builder.append("Component Connecting State:" + "\n")
                .append("Component type:"
                        + component.getComponentType()
                        + "  Component index:"
                        + component.getIndex()
                        + "\n")
                .append("isConnected:" + isConnected + "\n");
        ToastUtils.setResultToText(mComponentListTV, builder.toString());
    }

    private void showFirmwareUpgradeProgress(final TextView tv,
                                             UpgradeComponent component,
                                             FirmwareUpgradeProgress progress) {
        StringBuilder builder = new StringBuilder();
        builder.append("Upgrade Progress:" + "\n")
                .append("Component type:"
                        + component.getComponentType()
                        + "  Component index:"
                        + component.getIndex()
                        + "\n")
                .append("Process State:" + progress.getState() + "\n")
                .append("Current Progress" + progress.getProgress() + "\n");
        ToastUtils.setResultToText(tv, builder.toString());
    }

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
        final List<UpgradeComponent> components = getDynamicUpgradeComponents();
        if (components == null || components.size() < 1) {
            ToastUtils.showToast("failed: No components connected!");
            return;
        }
        String[] componentName = new String[components.size()];
        for (int i = 0; i < components.size(); i++) {
            UpgradeComponent tempComponent = components.get(i);
            componentName[i] = tempComponent.getComponentType() + "[" + tempComponent.getIndex() + "]";
        }
        final Runnable runSetComponentType = () -> {
            startFirmwareConsistencyUpgradeWithCompletion(components.get(PopupUtils.INSTANCE.getIndex()[0]));
            PopupUtils.INSTANCE.resetIndex();
        };
        PopupUtils.INSTANCE.initPopupNumberPicker(Helper.makeList(componentName), runSetComponentType, this);
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
        final List<UpgradeComponent> components = getDynamicUpgradeComponents();
        if (components == null || components.size() < 1) {
            ToastUtils.showToast("failed: No components connected!");
            return;
        }
        String[] componentName = new String[components.size()];
        for (int i = 0; i < components.size(); i++) {
            UpgradeComponent tempComponent = components.get(i);
            componentName[i] = tempComponent.getComponentType() + "[" + tempComponent.getIndex() + "]";
        }
        final Runnable runSetComponentType = () -> {
            stopFirmwareConsistencyUpgradeWithCompletion(components.get(PopupUtils.INSTANCE.getIndex()[0]));
            PopupUtils.INSTANCE.resetIndex();
        };
        PopupUtils.INSTANCE.initPopupNumberPicker(Helper.makeList(componentName), runSetComponentType, this);
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
        final List<UpgradeComponent> components = getDynamicUpgradeComponents();
        if (components == null || components.size() < 1) {
            ToastUtils.showToast("failed: No components connected!");
            return;
        }
        String[] componentName = new String[components.size()];
        for (int i = 0; i < components.size(); i++) {
            UpgradeComponent tempComponent = components.get(i);
            componentName[i] = tempComponent.getComponentType() + "[" + tempComponent.getIndex() + "]";
        }
        final Runnable runSetComponentType = () -> {
            UpgradeComponent selectedComponent = components.get(PopupUtils.INSTANCE.getIndex()[0]);
            getCurrentUpgradeFirmwareState(selectedComponent);
            PopupUtils.INSTANCE.resetIndex();
        };
        PopupUtils.INSTANCE.initPopupNumberPicker(Helper.makeList(componentName), runSetComponentType, this);
    }

    private void getUpgradeFirmwareInformation() {
        final List<UpgradeComponent> components = getDynamicUpgradeComponents();
        if (components == null || components.size() < 1) {
            ToastUtils.showToast("failed: No components connected!");
            return;
        }
        String[] componentName = new String[components.size()];
        for (int i = 0; i < components.size(); i++) {
            UpgradeComponent tempComponent = components.get(i);
            componentName[i] = tempComponent.getComponentType() + "[" + tempComponent.getIndex() + "]";
        }
        final Runnable runSetComponentType = () -> {
            UpgradeComponent selectedComponent = components.get(PopupUtils.INSTANCE.getIndex()[0]);
            getUpgradeFirmwareInformation(selectedComponent);
            PopupUtils.INSTANCE.resetIndex();
        };
        PopupUtils.INSTANCE.initPopupNumberPicker(Helper.makeList(componentName), runSetComponentType, this);
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
            ToastUtils.showToast("failed: Wrong parameters!");
            return;
        }
        FirmwareInformation info = upgradeComponent.getLatestFirmwareInformation();
        if (info == null) {
            ToastUtils.showToast(
                    "Can not get the upgrade firmware info now, please check the internet or invoke the checkFirmwareUpgradeState");
            return;
        }
        ToastUtils.showToast(
                "Upgrade Firmware info:" + "\n"
                        + "Firmware Version:" + info.getVersion() + "\n"
                        + "file size:" + info.getFileSize() + "\n"
                        + "release time:" + info.getReleaseDate() + "\n"
                        + "release note:" + info.getReleaseNote() + "\n");
    }

    private void showUpgradeFirmwareState(final TextView tv) {
        StringBuilder builder = new StringBuilder();
        builder.append("Upgrade State:" + "\n");
        List<UpgradeComponent> components = getDynamicUpgradeComponents();
        if (components != null) {
            for (UpgradeComponent component : components) {
                builder.append("Component type:"
                        + component.getComponentType()
                        + "  Component index:"
                        + component.getIndex()
                        + "\n");
                builder.append("Component state:" + component.getUpgradeState() + "\n");
                builder.append("\n");
            }
        }

        ToastUtils.setResultToText(tv, builder.toString());
    }

    private void showFirmwareUpgradeProgress(final TextView tv, FirmwareUpgradeProgress progress, String component) {
        StringBuilder builder = new StringBuilder();
        builder.append(component)
                .append("Process State:" + progress.getState() + "\n")
                .append("Current Progress" + progress.getProgress() + "\n");
        ToastUtils.setResultToText(tv, builder.toString());
    }

    private void showUpgradeConsistentUpdated(final TextView tv, UpgradeComponent component) {
        StringBuilder builder = new StringBuilder();
        builder.append("Consistent State:" + "\n")
                .append("Component type:"
                        + component.getComponentType()
                        + "  Component index:"
                        + component.getIndex()
                        + "\n")
                .append("canCancelUpgrade:" + component.canCancelConsistencyUpgrade() + "\n");
        ToastUtils.setResultToText(tv, builder.toString());
    }

    private void showUpgradeFirmwareInfo(TextView tv) {
        StringBuilder builder = new StringBuilder();
        builder.append("Upgrade Firmware info:" + "\n");
        List<UpgradeComponent> components = getDynamicUpgradeComponents();
        if (components != null) {
            for (UpgradeComponent component : components) {
                FirmwareInformation info = component.getLatestFirmwareInformation();
                builder.append("Component type:"
                        + component.getComponentType()
                        + "  Component index:"
                        + component.getIndex()
                        + "\n");
                if (info != null) {
                    builder.append("firmware version:" + info.getVersion() + "\n")
                            .append("file size:" + info.getFileSize() + "\n")
                            .append("release time:" + info.getReleaseDate() + "\n")
                            .append("release note:" + info.getReleaseNote() + "\n");
                } else {
                    builder.append("firmware info:" + "null" + "\n");
                }

                builder.append("\n");
            }
        }
        ToastUtils.setResultToText(tv, builder.toString());
    }

    private boolean isSupportDynamicComponents() {
        BaseProduct baseProduct = DJISDKManager.getInstance().getProduct();
        if (baseProduct != null) {
            Model model = baseProduct.getModel();
            return model == Model.MATRICE_300_RTK;
        }
        return false;
    }

    private void updateComponent() {
        List<UpgradeComponent> components = getDynamicUpgradeComponents();
        if (components != null) {
            for (UpgradeComponent component : components) {
                component.addUpgradeFirmwareListener(UpgradeFirmwareListener);
            }
        }
    }

    private List<UpgradeComponent> getDynamicUpgradeComponents() {
        List<UpgradeComponent> components;
        if (!isSupportDynamicComponents()) {
            UpgradeComponent rcComponent = getRemoteControllerComponent();
            UpgradeComponent acComponent = getAircraftUpgradeComponent();
            components = new ArrayList<>();
            if (rcComponent != null) {
                components.add(rcComponent);
            }
            if (acComponent != null) {
                components.add(acComponent);
            }
            return components;
        }
        if (upgradeManager == null) {
            upgradeManager = DJISDKManager.getInstance().getUpgradeManager();
        }

        if (upgradeManager != null) {
            return upgradeManager.getDetectedComponentsToUpgrade();
        }

        return null;
    }

    private void closeInfoShow(final TextView tv, String title) {
        StringBuilder builder = new StringBuilder();
        builder.append(title + "\n");
        ToastUtils.setResultToText(tv, builder.toString());
    }

    @Override
    public int getDescription() {
        return R.string.component_listview_firmware_upgrade;
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }
}
