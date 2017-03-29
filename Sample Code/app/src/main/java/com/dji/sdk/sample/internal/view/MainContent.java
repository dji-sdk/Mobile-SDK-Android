package com.dji.sdk.sample.internal.view;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dji.sdk.sample.R;
import com.dji.sdk.sample.demo.bluetooth.BluetoothView;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.model.ViewWrapper;
import com.dji.sdk.sample.internal.utils.DialogUtils;
import com.dji.sdk.sample.internal.utils.GeneralUtils;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.squareup.otto.Subscribe;
import dji.sdk.base.BaseProduct;
import dji.sdk.products.Aircraft;
import dji.sdk.sdkmanager.BluetoothProductConnector;
import dji.sdk.sdkmanager.DJISDKManager;

/**
 * Created by dji on 15/12/18.
 */
public class MainContent extends RelativeLayout {

    public static final String TAG = MainContent.class.getName();

    public MainContent(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private TextView mTextConnectionStatus;
    private TextView mTextProduct;
    private TextView mTextModelAvailable;
    private Button mBtnOpen;
    private Button mBtnBluetooth;
    private Button mBtnBridgeMode;

    private static BluetoothProductConnector connector = null;

    private Handler mHandler;
    private Handler mHandlerUI;
    private HandlerThread mHandlerThread = new HandlerThread("Bluetooth");
    private String bridgeAppIp = "10.128.129.76";
    private boolean isBridgeModeEnabled = false;

    private BaseProduct mProduct;

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        DJISampleApplication.getEventBus().register(this);
        initUI();
    }

    private void initUI() {
        Log.v(TAG, "initUI");

        mTextConnectionStatus = (TextView) findViewById(R.id.text_connection_status);
        mTextModelAvailable = (TextView) findViewById(R.id.text_model_available);
        mTextProduct = (TextView) findViewById(R.id.text_product_info);
        mBtnOpen = (Button) findViewById(R.id.btn_open);
        mBtnBridgeMode = (Button) findViewById(R.id.btn_bridge);
        mBtnBluetooth = (Button) findViewById(R.id.btn_bluetooth);
        mBtnBluetooth.setEnabled(false);

        mBtnOpen.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (GeneralUtils.isFastDoubleClick()) return;
                DJISampleApplication.getEventBus()
                                    .post(new ViewWrapper(new DemoListView(getContext()),
                                                          R.string.activity_component_list));
            }
        });
        mBtnBluetooth.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (GeneralUtils.isFastDoubleClick()) return;
                DJISampleApplication.getEventBus()
                                    .post((new ViewWrapper(new BluetoothView(getContext()),
                                                           R.string.component_listview_bluetooth)));
            }
        });
        mBtnBridgeMode.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isBridgeModeEnabled) {
                    DJISDKManager.getInstance().enableBridgeModeWithBridgeAppIP("");
                    isBridgeModeEnabled = false;
                    ToastUtils.setResultToToast("BridgeMode OFF!");
                } else {
                    DJISDKManager.getInstance().enableBridgeModeWithBridgeAppIP(bridgeAppIp);
                    isBridgeModeEnabled = true;
                    ToastUtils.setResultToToast("BridgeMode ON!\nIP: " + bridgeAppIp);
                }
            }
        });
    }

    @Override
    protected void onAttachedToWindow() {
        Log.d(TAG, "Comes into the onAttachedToWindow");
        refreshSDKRelativeUI();

        mHandlerThread.start();
        final long currentTime = System.currentTimeMillis();
        mHandler = new Handler(mHandlerThread.getLooper()) {
            @Override
            public void handleMessage(Message msg) {
                switch (msg.what) {
                    case 0:
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
                            sendEmptyMessageDelayed(0, 1000);
                        }
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                }
            }
        };
        mHandler.sendEmptyMessage(0);

        mHandlerUI = new Handler(Looper.getMainLooper());
        super.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        mHandler.removeCallbacksAndMessages(null);
        mHandlerUI.removeCallbacksAndMessages(null);
        mHandlerThread.quitSafely();
        mHandlerUI = null;
        mHandler = null;
        super.onDetachedFromWindow();
    }

    private void updateVersion() {
        String version = null;
        if (mProduct != null) {
            version = mProduct.getFirmwarePackageVersion();
        }

        if (version == null) {
            mTextModelAvailable.setText("N/A"); //Firmware version:
        } else {
            mTextModelAvailable.setText(version); //"Firmware version: " +
        }
    }

    @Subscribe
    public void onConnectivityChange(DJISampleApplication.ConnectivityChangeEvent event) {
        post(new Runnable() {
            @Override
            public void run() {
                refreshSDKRelativeUI();
            }
        });
    }

    private void refreshSDKRelativeUI() {
        mProduct = DJISampleApplication.getProductInstance();
        Log.d(TAG, "mProduct: " + (mProduct == null ? "null" : "unnull"));
        if (null != mProduct && mProduct.isConnected()) {
            mBtnOpen.setEnabled(true);

            String str = mProduct instanceof Aircraft ? "DJIAircraft" : "DJIHandHeld";
            mTextConnectionStatus.setText("Status: " + str + " connected");
            updateVersion();

            if (null != mProduct.getModel()) {
                mTextProduct.setText("" + mProduct.getModel().getDisplayName());
            } else {
                mTextProduct.setText(R.string.product_information);
            }
        } else {
            mBtnOpen.setEnabled(false);

            mTextProduct.setText(R.string.product_information);
            mTextConnectionStatus.setText(R.string.connection_loose);
        }
    }
}