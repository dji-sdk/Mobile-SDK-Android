package com.dji.sdk.sample.demo.payload;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.utils.Helper;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import dji.common.camera.SettingsDefinitions;
import dji.common.error.DJIError;
import dji.common.useraccount.UserAccountState;
import dji.common.util.CommonCallbacks;
import dji.keysdk.CameraKey;
import dji.keysdk.DJIKey;
import dji.keysdk.KeyManager;
import dji.keysdk.PayloadKey;
import dji.keysdk.callback.KeyListener;
import dji.midware.data.manager.P3.DJIPayloadUsbDataManager;
import dji.sdk.useraccount.UserAccountManager;

/**
 * Created by Michael on 17/11/6.
 */

public class PayloadActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView pushTextView;
    private TextView payloadNameView;
    private TextView pushTextViewFromUsb;
    private DJIKey getDataKey;
    private DJIKey payloadNameKey;
    private String payloadName = "";

    private KeyListener getDataListener = new KeyListener() {
        @Override
        public void onValueChange(@Nullable Object oldValue, @Nullable final Object newValue) {
            if (pushTextView != null) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (newValue instanceof byte[]) {
                            String str = Helper.getString((byte[]) newValue);
                            pushTextView.setText(str + "\n");
                            pushTextView.invalidate();
                        }
                    }
                });
            }
        }
    };
    private KeyListener getNameListener = new KeyListener() {
        @Override
        public void onValueChange(@Nullable Object oldValue, @Nullable final Object newValue) {
            if (pushTextView != null) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (newValue instanceof String) {
                            payloadName = newValue.toString();
                            payloadNameView.setText("Payload Name:"
                                                        + (TextUtils.isEmpty(payloadName)?"N/A":payloadName));
                            payloadNameView.invalidate();
                        }
                    }
                });
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_payload_testing);
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        pushTextView = (TextView) findViewById(R.id.push_info_text);
        payloadNameView = (TextView) findViewById(R.id.payload_name);
        pushTextViewFromUsb = (TextView) findViewById(R.id.push_info_text_usb);
        pushTextView.setMovementMethod(new ScrollingMovementMethod());
        initListener();
    }


    private void initListener() {
        findViewById(R.id.sent_data).setOnClickListener(this);
        findViewById(R.id.login_sdk).setOnClickListener(this);
        getDataKey = PayloadKey.create(PayloadKey.GET_DATA_FROM_PAYLOAD);
        payloadNameKey = PayloadKey.create(PayloadKey.PAYLOAD_PRODUCT_NAME);
        if (KeyManager.getInstance() != null) {
            KeyManager.getInstance().addListener(getDataKey, getDataListener);
            KeyManager.getInstance().addListener(payloadNameKey, getNameListener);
            KeyManager.getInstance().setValue(CameraKey.create(CameraKey.MODE),
                                              SettingsDefinitions.CameraMode.SHOOT_PHOTO, null);
        }
        Object name = KeyManager.getInstance().getValue(payloadNameKey);
        if (name != null) {
            payloadName = name.toString();
            payloadNameView.setText("Payload Name:" + (TextUtils.isEmpty(payloadName)?"N/A":payloadName));
            payloadNameView.invalidate();
        }
        DJIPayloadUsbDataManager.getInstance().setDataListener(new DJIPayloadUsbDataManager.PayloadUsbDataListener() {
            @Override
            public void onDataInput(byte[] data, int len) {
                String str = Helper.getStringUTF8(data, 0, len);
                updateUsbPushData(str);
            }
            @Override
            public void isBlocking() {
                ToastUtils.showToast("blocking when getting data from usb channel!");
            }
        });
    }



    private void updateUsbPushData(final String str) {
        if (pushTextViewFromUsb != null) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    pushTextViewFromUsb.setText(str + "\n");
                    pushTextViewFromUsb.invalidate();
                }
            });
        }
    }
    private void unInitListener() {
        KeyManager.getInstance().removeListener(getDataListener);
        KeyManager.getInstance().removeListener(getNameListener);
    }

    @Override
    protected void onDestroy() {
        DJIPayloadUsbDataManager.getInstance().setDataListener(null);
        unInitListener();
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
                UserAccountManager.getInstance()
                                  .logIntoDJIUserAccount(this, new CommonCallbacks.CompletionCallbackWith<UserAccountState>() {
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
