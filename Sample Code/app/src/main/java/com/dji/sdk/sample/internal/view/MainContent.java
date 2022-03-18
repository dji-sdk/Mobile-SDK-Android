package com.dji.sdk.sample.internal.view;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.demo.bluetooth.BluetoothView;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.controller.MainActivity;
import com.dji.sdk.sample.internal.model.ViewWrapper;
import com.dji.sdk.sample.internal.utils.DialogUtils;
import com.dji.sdk.sample.internal.utils.GeneralUtils;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.squareup.otto.Subscribe;

import dji.sdk.sdkmanager.LDMModule;
import dji.sdk.sdkmanager.LDMModuleType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import dji.common.error.DJIError;
import dji.common.error.DJISDKError;
import dji.common.realname.AppActivationState;
import dji.common.useraccount.UserAccountState;
import dji.common.util.CommonCallbacks;
import dji.keysdk.DJIKey;
import dji.keysdk.KeyManager;
import dji.keysdk.ProductKey;
import dji.keysdk.callback.KeyListener;
import dji.log.DJILog;
import dji.log.GlobalConfig;
import dji.sdk.base.BaseComponent;
import dji.sdk.base.BaseProduct;
import dji.sdk.products.Aircraft;
import dji.sdk.realname.AppActivationManager;
import dji.sdk.sdkmanager.BluetoothProductConnector;
import dji.sdk.sdkmanager.DJISDKInitEvent;
import dji.sdk.sdkmanager.DJISDKManager;
import dji.sdk.useraccount.UserAccountManager;

/**
 * Created by dji on 15/12/18.
 */
public class MainContent extends RelativeLayout {

    public static final String TAG = MainContent.class.getName();
    private static final String[] REQUIRED_PERMISSION_LIST = new String[] {
            Manifest.permission.VIBRATE, // Gimbal rotation
            Manifest.permission.INTERNET, // API requests
            Manifest.permission.ACCESS_WIFI_STATE, // WIFI connected products
            Manifest.permission.ACCESS_COARSE_LOCATION, // Maps
            Manifest.permission.ACCESS_NETWORK_STATE, // WIFI connected products
            Manifest.permission.ACCESS_FINE_LOCATION, // Maps
            Manifest.permission.CHANGE_WIFI_STATE, // Changing between WIFI and USB connection
            Manifest.permission.WRITE_EXTERNAL_STORAGE, // Log files
            Manifest.permission.BLUETOOTH, // Bluetooth connected products
            Manifest.permission.BLUETOOTH_ADMIN, // Bluetooth connected products
            Manifest.permission.READ_EXTERNAL_STORAGE, // Log files
            Manifest.permission.READ_PHONE_STATE, // Device UUID accessed upon registration
            Manifest.permission.RECORD_AUDIO // Speaker accessory
    };
    private static final int REQUEST_PERMISSION_CODE = 12345;
    private AtomicBoolean isRegistrationInProgress = new AtomicBoolean(false);
    private int lastProcess = -1;
    private Handler mHander = new Handler();
    private BaseComponent.ComponentListener mDJIComponentListener = new BaseComponent.ComponentListener() {

        @Override
        public void onConnectivityChange(boolean isConnected) {
            Log.d(TAG, "onComponentConnectivityChanged: " + isConnected);
            notifyStatusChange();
        }
    };
    private ProgressBar progressBar;
    private static BluetoothProductConnector connector = null;
    private TextView mTextConnectionStatus;
    private TextView mTextProduct;
    private TextView mTextModelAvailable;
    private Button mBtnRegisterApp;
    private Button getmBtnRegisterAppForLDM;
    private Button mBtnOpen;
    private Button mBtnBluetooth;
    private ViewWrapper componentList =
            new ViewWrapper(new DemoListView(getContext()), R.string.activity_component_list);
    private ViewWrapper bluetoothView;
    private EditText mBridgeModeEditText;
    private CheckBox mCheckboxFirmware;
    private Handler mHandler;
    private Handler mHandlerUI;
    private HandlerThread mHandlerThread = new HandlerThread("Bluetooth");

    private BaseProduct mProduct;
    private DJIKey firmwareKey;
    private KeyListener firmwareVersionUpdater;
    private boolean hasStartedFirmVersionListener = false;
    private AtomicBoolean hasAppActivationListenerStarted = new AtomicBoolean(false);
    private static final int MSG_UPDATE_BLUETOOTH_CONNECTOR = 0;
    private static final int MSG_INFORM_ACTIVATION = 1;
    private static final int ACTIVATION_DALAY_TIME = 3000;
    private AppActivationState.AppActivationStateListener appActivationStateListener;
    private boolean isregisterForLDM = false;
    private Context mContext;
    public MainContent(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (isInEditMode()) {
            return;
        }
        DJISampleApplication.getEventBus().register(this);
        initUI();
    }

    private void initUI() {
        Log.v(TAG, "initUI");

        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        mTextConnectionStatus = (TextView) findViewById(R.id.text_connection_status);
        mTextModelAvailable = (TextView) findViewById(R.id.text_model_available);
        mTextProduct = (TextView) findViewById(R.id.text_product_info);
        mBtnRegisterApp = (Button) findViewById(R.id.btn_registerApp);
        getmBtnRegisterAppForLDM = (Button) findViewById(R.id.btn_registerAppForLDM);
        mBtnOpen = (Button) findViewById(R.id.btn_open);
        mBridgeModeEditText = (EditText) findViewById(R.id.edittext_bridge_ip);
        mBtnBluetooth = (Button) findViewById(R.id.btn_bluetooth);
        mCheckboxFirmware = (CheckBox) findViewById(R.id.checkbox_firmware);

        //mBtnBluetooth.setEnabled(false);


        mBtnRegisterApp.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                isregisterForLDM = false;
                checkAndRequestPermissions();
            }
        });
        getmBtnRegisterAppForLDM.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                isregisterForLDM = true;
                checkAndRequestPermissions();
            }
        });
        mBtnOpen.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (GeneralUtils.isFastDoubleClick()) {
                    return;
                }
                DJISampleApplication.getEventBus().post(componentList);
            }
        });
        mBtnBluetooth.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (GeneralUtils.isFastDoubleClick()) {
                    return;
                }
                if (DJISampleApplication.getBluetoothProductConnector() == null) {
                    ToastUtils.setResultToToast("pls wait the sdk initiation finished");
                    return;
                }
                bluetoothView =
                    new ViewWrapper(new BluetoothView(getContext()), R.string.component_listview_bluetooth);
                DJISampleApplication.getEventBus().post(bluetoothView);
            }
        });
        mBridgeModeEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH
                        || actionId == EditorInfo.IME_ACTION_DONE
                        || event != null
                        && event.getAction() == KeyEvent.ACTION_DOWN
                        && event.getKeyCode() == KeyEvent.KEYCODE_ENTER) {
                    if (event != null && event.isShiftPressed()) {
                        return false;
                    } else {
                        // the user is done typing.
                        handleBridgeIPTextChange();
                    }
                }
                return false; // pass on to other listeners.
            }
        });
        mBridgeModeEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s != null && s.toString().contains("\n")) {
                    // the user is done typing.
                    // remove new line characcter
                    final String currentText = mBridgeModeEditText.getText().toString();
                    mBridgeModeEditText.setText(currentText.substring(0, currentText.indexOf('\n')));
                    handleBridgeIPTextChange();
                }
            }
        });
        ((TextView) findViewById(R.id.text_version)).setText(getResources().getString(R.string.sdk_version,
                DJISDKManager.getInstance().getRegistrationSDKVersion()
                        + " Debug:"
                        + GlobalConfig.DEBUG));
    }

    private void handleBridgeIPTextChange() {
        // the user is done typing.
        final String bridgeIP = mBridgeModeEditText.getText().toString();
        DJISDKManager.getInstance().enableBridgeModeWithBridgeAppIP(bridgeIP);
        if (!TextUtils.isEmpty(bridgeIP)) {
            ToastUtils.setResultToToast("BridgeMode ON!\nIP: " + bridgeIP);
        }
    }

    @Override
    protected void onAttachedToWindow() {
        Log.d(TAG, "Comes into the onAttachedToWindow");
        if (!isInEditMode()) {
            refreshSDKRelativeUI();
            mHandlerThread.start();
            final long currentTime = System.currentTimeMillis();
            mHandler = new Handler(mHandlerThread.getLooper()) {
                @Override
                public void handleMessage(Message msg) {
                    switch (msg.what) {
                        case MSG_UPDATE_BLUETOOTH_CONNECTOR:
                            //connected = DJISampleApplication.getBluetoothConnectStatus();
                            connector = DJISampleApplication.getBluetoothProductConnector();

                            if (connector != null) {
                                mBtnBluetooth.post(new Runnable() {
                                    @Override
                                    public void run() {
                                        mBtnBluetooth.setEnabled(true);
                                    }
                                });
                                return;
                            } else if ((System.currentTimeMillis() - currentTime) >= 5000) {
                                DialogUtils.showDialog(getContext(),
                                                       "Fetch Connector failed, reboot if you want to connect the Bluetooth");
                                return;
                            } else if (connector == null) {
                                sendDelayMsg(0, MSG_UPDATE_BLUETOOTH_CONNECTOR);
                            }
                            break;
                        case MSG_INFORM_ACTIVATION:
                            loginToActivationIfNeeded();
                            break;
                    }
                }
            };
            mHandlerUI = new Handler(Looper.getMainLooper());
        }
        super.onAttachedToWindow();
    }

    private void sendDelayMsg(int msg, long delayMillis) {
        if (mHandler == null){
            return;
        }

        if (!mHandler.hasMessages(msg)) {
            mHandler.sendEmptyMessageDelayed(msg, delayMillis);
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        if (!isInEditMode()) {
            removeFirmwareVersionListener();
            removeAppActivationListenerIfNeeded();
            mHandler.removeCallbacksAndMessages(null);
            mHandlerUI.removeCallbacksAndMessages(null);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
                mHandlerThread.quitSafely();
            } else {
                mHandlerThread.quit();
            }
            mHandlerUI = null;
            mHandler = null;
        }
        super.onDetachedFromWindow();
    }

    private void updateVersion() {
        String version = null;
        if (mProduct != null) {
            version = mProduct.getFirmwarePackageVersion();
        }

        if (TextUtils.isEmpty(version)) {
            mTextModelAvailable.setText("Firmware version:N/A"); //Firmware version:
        } else {
            mTextModelAvailable.setText("Firmware version:"+version); //"Firmware version: " +
            removeFirmwareVersionListener();
        }
    }

    @Subscribe
    public void onConnectivityChange(MainActivity.ConnectivityChangeEvent event) {
        if (mHandlerUI != null) {
            mHandlerUI.post(new Runnable() {
                @Override
                public void run() {
                    refreshSDKRelativeUI();
                }
            });
        }
    }

    private void refreshSDKRelativeUI() {
        mProduct = DJISampleApplication.getProductInstance();
        Log.d(TAG, "mProduct: " + (mProduct == null ? "null" : "unnull"));
        if (null != mProduct ) {
            if (mProduct.isConnected()) {
                mBtnOpen.setEnabled(true);
                String str = mProduct instanceof Aircraft ? "DJIAircraft" : "DJIHandHeld";
                mTextConnectionStatus.setText("Status: " + str + " connected");
                tryUpdateFirmwareVersionWithListener();
                if (mProduct instanceof Aircraft) {
                    addAppActivationListenerIfNeeded();
                }

                if (null != mProduct.getModel()) {
                    mTextProduct.setText("" + mProduct.getModel().getDisplayName());
                } else {
                    mTextProduct.setText(R.string.product_information);
                }
            } else if (mProduct instanceof Aircraft){
                Aircraft aircraft = (Aircraft) mProduct;
                if (aircraft.getRemoteController() != null && aircraft.getRemoteController().isConnected()) {
                    mTextConnectionStatus.setText(R.string.connection_only_rc);
                    mTextProduct.setText(R.string.product_information);
                    mBtnOpen.setEnabled(false);
                    mTextModelAvailable.setText("Firmware version:N/A");
                }
            }
        } else {
            mBtnOpen.setEnabled(false);
            mTextProduct.setText(R.string.product_information);
            mTextConnectionStatus.setText(R.string.connection_loose);
            mTextModelAvailable.setText("Firmware version:N/A");
        }
    }

    private void tryUpdateFirmwareVersionWithListener() {
        if (!hasStartedFirmVersionListener) {
            firmwareVersionUpdater = new KeyListener() {
                @Override
                public void onValueChange(final Object o, final Object o1) {
                    mHandlerUI.post(new Runnable() {
                        @Override
                        public void run() {
                            updateVersion();
                        }
                    });
                }
            };
            firmwareKey = ProductKey.create(ProductKey.FIRMWARE_PACKAGE_VERSION);
            if (KeyManager.getInstance() != null) {
                KeyManager.getInstance().addListener(firmwareKey, firmwareVersionUpdater );
            }
            hasStartedFirmVersionListener = true;
        }
        updateVersion();
    }

    private void removeFirmwareVersionListener() {
        if (hasStartedFirmVersionListener) {
            if (KeyManager.getInstance() != null) {
                KeyManager.getInstance().removeListener(firmwareVersionUpdater);
            }
        }
        hasStartedFirmVersionListener = false;
    }

    private void addAppActivationListenerIfNeeded() {
        if (AppActivationManager.getInstance().getAppActivationState() != AppActivationState.ACTIVATED) {
            sendDelayMsg(MSG_INFORM_ACTIVATION, ACTIVATION_DALAY_TIME);
            if (hasAppActivationListenerStarted.compareAndSet(false, true)) {
                appActivationStateListener = new AppActivationState.AppActivationStateListener() {

                    @Override
                    public void onUpdate(AppActivationState appActivationState) {
                        if (mHandler != null && mHandler.hasMessages(MSG_INFORM_ACTIVATION)) {
                            mHandler.removeMessages(MSG_INFORM_ACTIVATION);
                        }
                        if (appActivationState != AppActivationState.ACTIVATED) {
                            sendDelayMsg(MSG_INFORM_ACTIVATION, ACTIVATION_DALAY_TIME);
                        }
                    }
                };
                AppActivationManager.getInstance().addAppActivationStateListener(appActivationStateListener);
            }
        }
    }

    private void removeAppActivationListenerIfNeeded() {
        if (hasAppActivationListenerStarted.compareAndSet(true, false)) {
            AppActivationManager.getInstance().removeAppActivationStateListener(appActivationStateListener);
        }
    }

    private void loginToActivationIfNeeded() {
        if (AppActivationManager.getInstance().getAppActivationState() == AppActivationState.LOGIN_REQUIRED) {
            UserAccountManager.getInstance()
                              .logIntoDJIUserAccount(getContext(),
                                                     new CommonCallbacks.CompletionCallbackWith<UserAccountState>() {
                                                         @Override
                                                         public void onSuccess(UserAccountState userAccountState) {
                                                             ToastUtils.setResultToToast("Login Successed!");
                                                         }

                                                         @Override
                                                         public void onFailure(DJIError djiError) {
                                                             ToastUtils.setResultToToast("Login Failed!");
                                                         }
                                                     });
        }
    }

    //region Registration n' Permissions Helpers

    /**
     * Checks if there is any missing permissions, and
     * requests runtime permission if needed.
     */
    private void checkAndRequestPermissions() {
        // Check for permissions
        List<String> missingPermission = new ArrayList<>();
        for (String eachPermission : REQUIRED_PERMISSION_LIST) {
            if (ContextCompat.checkSelfPermission(mContext, eachPermission) != PackageManager.PERMISSION_GRANTED) {
                missingPermission.add(eachPermission);
            }
        }
        // Request for missing permissions
        if (missingPermission.isEmpty()) {
            startSDKRegistration();
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            ActivityCompat.requestPermissions((Activity) mContext,
                    missingPermission.toArray(new String[missingPermission.size()]),
                    REQUEST_PERMISSION_CODE);
        }

    }

    private void startSDKRegistration() {
        if (isRegistrationInProgress.compareAndSet(false, true)) {
            AsyncTask.execute(new Runnable() {
                @Override
                public void run() {
                    ToastUtils.setResultToToast(mContext.getString(R.string.sdk_registration_doing_message));
                    //if we hope the Firmware Upgrade module could access the network under LDM mode, we need call the setModuleNetworkServiceEnabled()
                    //method before the registerAppForLDM() method
                    if (mCheckboxFirmware.isChecked()) {
                        DJISDKManager.getInstance().getLDMManager().setModuleNetworkServiceEnabled(new LDMModule.Builder().moduleType(
                            LDMModuleType.FIRMWARE_UPGRADE).enabled(true).build());
                    } else {
                        DJISDKManager.getInstance().getLDMManager().setModuleNetworkServiceEnabled(new LDMModule.Builder().moduleType(
                            LDMModuleType.FIRMWARE_UPGRADE).enabled(false).build());
                    }
                    if(isregisterForLDM) {
                        DJISDKManager.getInstance().registerAppForLDM(mContext.getApplicationContext(), new DJISDKManager.SDKManagerCallback() {
                            @Override
                            public void onRegister(DJIError djiError) {
                                if (djiError == DJISDKError.REGISTRATION_SUCCESS) {
                                    DJILog.e("App registration for LDM", DJISDKError.REGISTRATION_SUCCESS.getDescription());
                                    DJISDKManager.getInstance().startConnectionToProduct();
                                    ToastUtils.setResultToToast(mContext.getString(R.string.sdk_registration_success_message));
                                    showDBVersion();
                                } else {
                                    ToastUtils.setResultToToast(mContext.getString(R.string.sdk_registration_message) + djiError.getDescription());
                                }
                                Log.v(TAG, djiError.getDescription());
                                hideProcess();
                            }
                            @Override
                            public void onProductDisconnect() {
                                Log.d(TAG, "onProductDisconnect");
                                notifyStatusChange();
                            }
                            @Override
                            public void onProductConnect(BaseProduct baseProduct) {
                                Log.d(TAG, String.format("onProductConnect newProduct:%s", baseProduct));
                                notifyStatusChange();
                            }

                            @Override
                            public void onProductChanged(BaseProduct baseProduct) {
                                notifyStatusChange();
                            }

                            @Override
                            public void onComponentChange(BaseProduct.ComponentKey componentKey,
                                                          BaseComponent oldComponent,
                                                          BaseComponent newComponent) {
                                if (newComponent != null) {
                                    newComponent.setComponentListener(mDJIComponentListener);
                                }
                                Log.d(TAG,
                                        String.format("onComponentChange key:%s, oldComponent:%s, newComponent:%s",
                                                componentKey,
                                                oldComponent,
                                                newComponent));

                                notifyStatusChange();
                            }

                            @Override
                            public void onInitProcess(DJISDKInitEvent djisdkInitEvent, int i) {

                            }

                            @Override
                            public void onDatabaseDownloadProgress(long current, long total) {
                                int process = (int) (100 * current / total);
                                if (process == lastProcess) {
                                    return;
                                }
                                lastProcess = process;
                                showProgress(process);
                                if (process % 25 == 0){
                                    ToastUtils.setResultToToast("DB load process : " + process);
                                }else if (process == 0){
                                    ToastUtils.setResultToToast("DB load begin");
                                }
                            }
                        });

                    } else {
                        DJISDKManager.getInstance().registerApp(mContext.getApplicationContext(), new DJISDKManager.SDKManagerCallback() {
                            @Override
                            public void onRegister(DJIError djiError) {
                                if (djiError == DJISDKError.REGISTRATION_SUCCESS) {
                                    DJILog.e("App registration", DJISDKError.REGISTRATION_SUCCESS.getDescription());
                                    DJISDKManager.getInstance().startConnectionToProduct();
                                    ToastUtils.setResultToToast(mContext.getString(R.string.sdk_registration_success_message));
                                    showDBVersion();
                                } else {
                                    ToastUtils.setResultToToast(mContext.getString(R.string.sdk_registration_message) + djiError.getDescription());
                                }
                                Log.v(TAG, djiError.getDescription());
                                hideProcess();
                            }
                            @Override
                            public void onProductDisconnect() {
                                Log.d(TAG, "onProductDisconnect");
                                notifyStatusChange();
                            }
                            @Override
                            public void onProductConnect(BaseProduct baseProduct) {
                                Log.d(TAG, String.format("onProductConnect newProduct:%s", baseProduct));
                                notifyStatusChange();
                            }

                            @Override
                            public void onProductChanged(BaseProduct baseProduct) {
                                notifyStatusChange();
                            }

                            @Override
                            public void onComponentChange(BaseProduct.ComponentKey componentKey,
                                                          BaseComponent oldComponent,
                                                          BaseComponent newComponent) {
                                if (newComponent != null) {
                                    newComponent.setComponentListener(mDJIComponentListener);
                                }
                                Log.d(TAG,
                                        String.format("onComponentChange key:%s, oldComponent:%s, newComponent:%s",
                                                componentKey,
                                                oldComponent,
                                                newComponent));

                                notifyStatusChange();
                            }

                            @Override
                            public void onInitProcess(DJISDKInitEvent djisdkInitEvent, int i) {

                            }

                            @Override
                            public void onDatabaseDownloadProgress(long current, long total) {
                                int process = (int) (100 * current / total);
                                if (process == lastProcess) {
                                    return;
                                }
                                lastProcess = process;
                                showProgress(process);
                                if (process % 25 == 0){
                                    ToastUtils.setResultToToast("DB load process : " + process);
                                }else if (process == 0){
                                    ToastUtils.setResultToToast("DB load begin");
                                }
                            }
                        });

                    }
                }
            });
        }
    }

    private void showProgress(final int process){
        mHander.post(new Runnable() {
            @Override
            public void run() {
                progressBar.setVisibility(View.VISIBLE);
                progressBar.setProgress(process);
            }
        });
    }

    private void showDBVersion(){
        mHander.postDelayed(new Runnable() {
            @Override
            public void run() {
                DJISDKManager.getInstance().getFlyZoneManager().getPreciseDatabaseVersion(new CommonCallbacks.CompletionCallbackWith<String>() {
                    @Override
                    public void onSuccess(String s) {
                        ToastUtils.setResultToToast("db load success ! version : " + s);
                    }

                    @Override
                    public void onFailure(DJIError djiError) {
                        ToastUtils.setResultToToast("db load success ! get version error : " + djiError.getDescription());

                    }
                });
            }
        },5000);
    }

    private void hideProcess(){
        mHander.post(new Runnable() {
            @Override
            public void run() {
                progressBar.setVisibility(View.GONE);
            }
        });
    }

    private void notifyStatusChange() {
        DJISampleApplication.getEventBus().post(new MainActivity.ConnectivityChangeEvent());
    }
    //endregion
}