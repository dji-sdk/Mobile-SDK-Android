package com.dji.sdk.sample.demo.payload;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.ViewHelper;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import com.dji.sdk.sample.internal.utils.ToastUtils;

import dji.common.error.DJIError;
import dji.common.useraccount.UserAccountState;
import dji.common.util.CommonCallbacks;
import dji.sdk.payload.Payload;
import dji.sdk.useraccount.UserAccountManager;

public class PayloadActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView pushUARTTextView;
    private TextView payloadNameView;
    private TextView pushUDPTextView;
    private Payload payload = null;
    private String payloadName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_payload_testing);
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        payloadNameView = (TextView) findViewById(R.id.payload_name);
        pushUARTTextView = (TextView) findViewById(R.id.push_info_text_UART);
        pushUDPTextView = (TextView) findViewById(R.id.push_info_text_UDP);
        pushUARTTextView.setMovementMethod(new ScrollingMovementMethod());
        initListener();
    }

    private void initListener() {
        findViewById(R.id.sent_data).setOnClickListener(this);
        findViewById(R.id.login_sdk).setOnClickListener(this);
        if (ModuleVerificationUtil.isPayloadAvailable()) {
            payload = DJISampleApplication.getAircraftInstance().getPayload();

            /**
             *  Gets the product name defined by the manufacturer of the payload device.
             */
            payloadName = payload.getPayloadProductName();
            payloadNameView.setText("Payload Name:" + (TextUtils.isEmpty(payloadName) ? "N/A" : payloadName));
            payloadNameView.invalidate();

            /**
             *  Set the command data callback, the command data typically sent by payload in UART/CAN channel, the max bandwidth of this channel is 3KBytes/s on M200.
             */
            payload.setCommandDataCallback(new Payload.CommandDataCallback() {
                @Override
                public void onGetCommandData(byte[] bytes) {
                    String str = ViewHelper.getStringUTF8(bytes, 0, bytes.length);
                    updateUARTPushData(str);
                }
            });

            /**
             *  Set the UDP data callback, this callback is for receiving the Non-Video data in UDP channel, the max bandwidth of this channel is 8Mbps in M200, 4Mbps in M210
             */
            payload.setStreamDataCallback(new Payload.StreamDataCallback() {
                @Override
                public void onGetStreamData(byte[] bytes, int i) {
                    String str = ViewHelper.getStringUTF8(bytes, 0, i);
                    updateUDPPushData(str);
                }
            });
        }
    }

    private void updateUARTPushData(final String str) {
        if (pushUARTTextView != null) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    pushUARTTextView.setText(str + "\n");
                    pushUARTTextView.invalidate();
                }
            });
        }
    }

    private void updateUDPPushData(final String str) {
        if (pushUDPTextView != null) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    pushUDPTextView.setText(str + "\n");
                    pushUDPTextView.invalidate();
                }
            });
        }
    }

    @Override
    protected void onDestroy() {
        if (ModuleVerificationUtil.isPayloadAvailable()) {
            if (null != payload) {
                payload.setCommandDataCallback(null);
                payload.setStreamDataCallback(null);
            }
        }
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sent_data:
                Intent intent = new Intent(this, PayloadSendGetDataActivity.class);
                this.startActivity(intent);
                finish();
                break;
            case R.id.login_sdk:
                UserAccountManager.getInstance().logIntoDJIUserAccount(this, new CommonCallbacks.CompletionCallbackWith<UserAccountState>() {
                      @Override
                      public void onSuccess(final UserAccountState userAccountState) {
                          ToastUtils.showToast("login success! status=" + userAccountState.name());
                      }

                      @Override
                      public void onFailure(DJIError error) {
                          ToastUtils.showToast(error.getDescription());
                      }
                });
                break;
            default:
        }
    }
}
