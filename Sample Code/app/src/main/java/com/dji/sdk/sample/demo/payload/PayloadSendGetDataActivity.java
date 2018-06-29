package com.dji.sdk.sample.demo.payload;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.utils.GeneralUtils;
import com.dji.sdk.sample.internal.utils.Helper;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import dji.common.error.DJIError;
import dji.keysdk.DJIKey;
import dji.keysdk.KeyManager;
import dji.keysdk.PayloadKey;
import dji.keysdk.callback.ActionCallback;
import dji.keysdk.callback.KeyListener;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by Michael on 17/11/6.
 */

public class PayloadSendGetDataActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "PayloadSendGetData";
    private TextView receivedDataView;
    private TextView payloadNameView;
    private TextView sendTotal;
    private TextView receiveTotal;

    private int sendSizeTotal;
    private int receiveSizeTotal;

    private EditText sendDataEditView;
    private EditText periodView;
    private CheckBox repeatCheckbox;
    private DJIKey getDataKey;
    private DJIKey sendDataKey;
    private DJIKey payloadNameKey;
    private String payloadName = "";
    private ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(1);
    private ScheduledFuture<?> scheduledFuture;

    private KeyListener getDataListener = new KeyListener() {
        @Override
        public void onValueChange(@Nullable Object oldValue, @Nullable final Object newValue) {
            if (receivedDataView != null) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (newValue instanceof byte[]) {
                            //String str = BytesUtil.byte2hex((byte[]) newValue);
                            byte[] data = (byte[]) newValue;
                            Log.e(TAG, "receiving data size:" + data.length);
                            String str = Helper.getString(data);
                            receiveSizeTotal = data.length + receiveSizeTotal;
                            receiveTotal.setText(String.valueOf(receiveSizeTotal));
                            receivedDataView.setText(str);
                            receivedDataView.invalidate();
                        }
                    }
                });
            }
        }
    };

    private void updateTXView (final int size) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                sendSizeTotal = size + sendSizeTotal;
                sendTotal.setText(String.valueOf(sendSizeTotal));
            }
        });
    }
    private KeyListener getNameListener = new KeyListener() {
        @Override
        public void onValueChange(@Nullable Object oldValue, @Nullable final Object newValue) {
            if (payloadName != null) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (newValue instanceof String) {
                            payloadName = newValue.toString();
                            payloadNameView.setText("Payload Name:" + (TextUtils.isEmpty(payloadName) ? "N/A" : payloadName) + "\n");
                            payloadNameView.invalidate();
                        }
                    }
                });
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_payload_test_data);
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
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
        getDataKey = PayloadKey.create(PayloadKey.GET_DATA_FROM_PAYLOAD);
        sendDataKey = PayloadKey.create(PayloadKey.SEND_DATA_TO_PAYLOAD);
        payloadNameKey = PayloadKey.create(PayloadKey.PAYLOAD_PRODUCT_NAME);
        if (KeyManager.getInstance() != null) {
            KeyManager.getInstance().addListener(getDataKey, getDataListener);
            KeyManager.getInstance().addListener(payloadNameKey, getNameListener);
        }
        Object name = KeyManager.getInstance().getValue(payloadNameKey);
        if (name != null) {
            payloadName = name.toString();
            payloadNameView.setText("Payload Name:" + (TextUtils.isEmpty(payloadName) ? "N/A" : payloadName) + "\n");
            payloadNameView.invalidate();
        }
    }

    private void unInitListener() {
        KeyManager.getInstance().removeListener(getDataListener);
        KeyManager.getInstance().removeListener(getNameListener);
    }

    @Override
    protected void onDestroy() {
        unInitListener();
        if (scheduledFuture != null && !scheduledFuture.isCancelled() && !scheduledFuture.isDone()) {
            scheduledFuture.cancel(true);
        }
        executorService.shutdownNow();
        super.onDestroy();
    }

    private Runnable repeatRunnable = new Runnable() {
        @Override
        public void run() {
            sendData();
        }
    };

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.send_data_button:
                if (repeatCheckbox.isChecked()) {
                    if (GeneralUtils.isFastDoubleClick()) {
                        ToastUtils.showToast("don't press too frequently!");
                        return;
                    }
                    if (scheduledFuture != null && !scheduledFuture.isDone()) {
                        ToastUtils.showToast("already in sending status!");
                        return;
                    }
                    if (!TextUtils.isDigitsOnly(periodView.getText().toString())) {
                        ToastUtils.showToast("pls set right frequency");
                        return;
                    }
                    int frequency = Integer.valueOf(periodView.getText().toString());
                    scheduledFuture = executorService.scheduleAtFixedRate(repeatRunnable, 100, 1000/frequency, TimeUnit.MILLISECONDS);
                    //ToastUtils.showToast("start send date frequently");
                } else {
                    //ToastUtils.showToast("start send date normally");
                    sendData();
                }
                break;
            case R.id.repeat_send_checkbox:
                if (scheduledFuture != null && !scheduledFuture.isCancelled() && !scheduledFuture.isDone()) {
                    scheduledFuture.cancel(true);
                    ToastUtils.showToast("stop repeat sending");
                }
                break;
            default:
        }
    }


    private void sendData() {
        String sendingDataStr = sendDataEditView.getText().toString();
        Log.e(TAG, "sending:" + sendingDataStr);
        final byte[] data = Helper.getBytes(sendingDataStr);
        KeyManager.getInstance().performAction(sendDataKey, new ActionCallback() {
            @Override
            public void onSuccess() {
                //ToastUtils.showToast("send data success! " + Helper.byte2hex(data));
                updateTXView(data.length);
            }
            @Override
            public void onFailure(@NonNull DJIError error) {
                //ToastUtils.showToast("send data failed");
            }
        }, data);
    }
}
