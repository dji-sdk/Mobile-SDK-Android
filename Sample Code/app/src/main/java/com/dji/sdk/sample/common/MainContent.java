package com.dji.sdk.sample.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.dji.sdk.sample.R;

import dji.sdk.Products.DJIAircraft;
import dji.sdk.base.DJIBaseProduct;
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


        mBtnOpen.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Utils.isFastDoubleClick()) return;
                EventBus.getDefault().post(new SetViewWrapper(R.layout.content_component_list, R.string.activity_component_list, getContext()));
            }
        });
    }

    @Override
    protected void onAttachedToWindow() {
        Log.v(TAG, "onAttachedToWindow");

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
            refreshSDKRelativeUI();
        }

    };

    private void refreshSDKRelativeUI() {
        mProduct = DJISampleApplication.getProductInstance();

        if (null != mProduct && mProduct.isConnected()) {
            Log.v(TAG, "refreshSDK: True");
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
            Log.v(TAG, "refreshSDK: False");
            mBtnOpen.setEnabled(false);

            mTextProduct.setText(R.string.product_information);
            mTextConnectionStatus.setText(R.string.connection_loose);
        }
    }
}