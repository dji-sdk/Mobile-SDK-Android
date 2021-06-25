package com.dji.sdk.sample.demo.payload;

import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.GeneralUtils;
import com.dji.sdk.sample.internal.utils.ViewHelper;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import com.dji.sdk.sample.internal.utils.ToastUtils;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import dji.common.error.DJIError;
import dji.common.util.CommonCallbacks;
import dji.sdk.payload.Payload;

/**
 * Created by Michael on 17/11/6.
 */

public class PayloadSendGetDataActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "PayloadSendGetData";
    private TextView receivedDataView;
    private TextView payloadNameView;
    private TextView sendTotal;
    private TextView receiveTotal;

    private int sendSizeTotal = 0;
    private int receiveSizeTotal = 0;

    private EditText sendDataEditView;
    private EditText periodView;
    private CheckBox repeatCheckbox;
    private Payload payload = null;
    private String payloadName = "";
    private ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(1);
    private ScheduledFuture<?> scheduledFuture;

    private void updateTXView (final int size) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                sendSizeTotal = size + sendSizeTotal;
                sendTotal.setText(String.valueOf(sendSizeTotal));
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_payload_test_data);
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        payloadNameView = (TextView) findViewById(R.id.payload_name);
        receivedDataView = (TextView) findViewById(R.id.push_info_text);
        sendTotal = (TextView) findViewById(R.id.send_total_size);
        sendTotal.setText("0");
        receiveTotal = (TextView) findViewById(R.id.receive_total_size);
        receiveTotal.setText("0");
        receivedDataView.setMovementMethod(new ScrollingMovementMethod());
        sendDataEditView = (EditText) findViewById(R.id.sending_data);
        periodView = (EditText) findViewById(R.id.period_value);
        repeatCheckbox = (CheckBox) findViewById(R.id.repeat_send_checkbox);
        repeatCheckbox.setOnClickListener(this);
        initListener();
    }


    private void initListener() {
        View sendButton = findViewById(R.id.send_data_button);
        sendButton.setOnClickListener(this);
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
                    if (receivedDataView != null) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Log.e(TAG, "receiving data size:" + bytes.length);
                                String str = ViewHelper.getString(bytes);
                                receiveSizeTotal = bytes.length + receiveSizeTotal;
                                receiveTotal.setText(String.valueOf(receiveSizeTotal));
                                receivedDataView.setText(str);
                                receivedDataView.invalidate();
                            }
                        });
                    }
                }
            });
        }
    }

    @Override
    protected void onDestroy() {
        if (ModuleVerificationUtil.isPayloadAvailable() && null != payload) {
                payload.setCommandDataCallback(null);
                payload.setStreamDataCallback(null);
        }
        if (scheduledFuture != null && !scheduledFuture.isCancelled() && !scheduledFuture.isDone()) {
            scheduledFuture.cancel(true);
        }
        executorService.shutdownNow();
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.send_data_button:
                if (repeatCheckbox.isChecked()) {
                    if (GeneralUtils.isFastDoubleClick()) {
                        ToastUtils.showToast("Don't press too frequently!");
                        return;
                    }
                    if (scheduledFuture != null && !scheduledFuture.isDone()) {
                        ToastUtils.showToast("Already in sending status!");
                        return;
                    }
                    if (!TextUtils.isDigitsOnly(periodView.getText().toString())) {
                        ToastUtils.showToast("Please set the correct frequency");
                        return;
                    }
                    int frequency = Integer.valueOf(periodView.getText().toString());
                    scheduledFuture = executorService.scheduleAtFixedRate(repeatRunnable, 100, 1000/frequency, TimeUnit.MILLISECONDS);
                    ToastUtils.setResultToToast("set send data repeatably");
                } else {
                    sendDataToPayload();
                }
                break;
            case R.id.repeat_send_checkbox:
                if (scheduledFuture != null && !scheduledFuture.isCancelled() && !scheduledFuture.isDone()) {
                    scheduledFuture.cancel(true);
                    ToastUtils.setResultToToast("stop sending data repeatably");
                }
                break;
            default:
        }
    }

    private void sendDataToPayload() {
        String sendingDataStr = sendDataEditView.getText().toString();
        Log.e(TAG, "sending:" + sendingDataStr);
        final byte[] data = ViewHelper.getBytes(sendingDataStr);
        if(ModuleVerificationUtil.isPayloadAvailable() && null != payload) {
            payload.sendDataToPayload(data, new CommonCallbacks.CompletionCallback() {
                @Override
                public void onResult(DJIError djiError) {
                    ToastUtils.setResultToToast(djiError == null ? "Send data successfully" : djiError.getDescription());
                }
            });
        }
    }

    private Runnable repeatRunnable = new Runnable() {
        @Override
        public void run() {
            sendDataToPayload();
        }
    };
}
