package com.dji.sdk.sample.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
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
import com.dji.sdk.sample.utils.DJIDialog;

import dji.sdk.base.DJIBaseProduct;
import dji.sdk.products.DJIAircraft;
import dji.sdk.sdkmanager.DJIBluetoothProductConnector;
import dji.thirdparty.eventbus.EventBus;

/**
 * Created by dji on 15/12/18.
 */
public class MainContent extends RelativeLayout implements DJIBaseProduct.DJIVersionCallback {

    public static final String TAG = MainContent.class.getName();

    public MainContent(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private TextView mTextConnectionStatus;
    private TextView mTextProduct;
    private TextView mTextModelAvailable;
    private Button mBtnOpen;
    private Button mBtnBluetooth;
    private static boolean connected = false;

    private static DJIBluetoothProductConnector connector = null;

    private Handler mHandler;
    private Handler mHandlerUI;
    private HandlerThread mHandlerThread = new HandlerThread("Bluetooth");


    private DJIBaseProduct mProduct;

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        initUI();
    }

    private void initUI() {
        Log.v(TAG, "initUI");

        mTextConnectionStatus = (TextView) findViewById(R.id.text_connection_status);
        mTextModelAvailable = (TextView) findViewById(R.id.text_model_available);
        mTextProduct = (TextView) findViewById(R.id.text_product_info);
        mBtnOpen = (Button) findViewById(R.id.btn_open);
        mBtnBluetooth = (Button) findViewById(R.id.btn_bluetooth);
        mBtnBluetooth.setEnabled(false);
        mHandlerThread.start();
        final long currentTime = System.currentTimeMillis();
        mHandler = new Handler(mHandlerThread.getLooper()){
            @Override
            public void handleMessage(Message msg){
                switch(msg.what){
                    case 0:
                        //connected = DJISampleApplication.getBluetoothConnectStatus();
                    connector = DJISampleApplication.getBluetoothProductConnector();

                    if(connector != null){
                        mBtnBluetooth.post(new Runnable() {
                            @Override
                            public void run() {
                                mBtnBluetooth.setEnabled(true);
                            }
                        });
                        return;
                    }else if((System.currentTimeMillis()-currentTime)>=5000){
                        DJIDialog.showDialog(getContext(),"Fetch Connector failed, reboot if you want to connect the Bluetooth");
                        return;
                    }else if(connector == null){
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


        mBtnOpen.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Utils.isFastDoubleClick()) return;
                EventBus.getDefault().post(new SetViewWrapper(R.layout.content_component_list, R.string.activity_component_list, getContext()));
            }
        });
        mBtnBluetooth.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Utils.isFastDoubleClick()) return;
                EventBus.getDefault().post(new SetViewWrapper(R.layout.content_bluetooth, R.string.component_listview_bluetooth,getContext()));

            }
        });
    }

    @Override
    protected void onAttachedToWindow() {
        Log.d(TAG, "Comes into the onAttachedToWindow");
        refreshSDKRelativeUI();
        IntentFilter filter = new IntentFilter();
        filter.addAction(DJISampleApplication.FLAG_CONNECTION_CHANGE);
        getContext().registerReceiver(mReceiver, filter);
        super.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        getContext().unregisterReceiver(mReceiver);
        super.onDetachedFromWindow();
    }

    private void updateVersion() {
        String version = null;
        if(mProduct != null) {
            version = mProduct.getFirmwarePackageVersion();
        }

        if(version == null) {
            mTextModelAvailable.setText("N/A"); //Firmware version: 
        } else {
            mTextModelAvailable.setText(version); //"Firmware version: " +
        }
    }

    @Override
    public void onProductVersionChange(String oldVersion, String newVersion) {
        updateVersion();
    }

    protected BroadcastReceiver mReceiver = new BroadcastReceiver() {

        @Override
        public void onReceive(Context context, Intent intent) {
            Log.d(TAG, "Comes into the BroadcastReceiver");
            refreshSDKRelativeUI();
        }

    };

    private void refreshSDKRelativeUI() {
        mProduct = DJISampleApplication.getProductInstance();
        Log.d(TAG, "mProduct: " + (mProduct == null? "null" : "unnull") );
        if (null != mProduct && mProduct.isConnected()) {
            mBtnOpen.setEnabled(true);

            String str = mProduct instanceof DJIAircraft ? "DJIAircraft" : "DJIHandHeld";
            mTextConnectionStatus.setText("Status: " + str + " connected");
            mProduct.setDJIVersionCallback(this);
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