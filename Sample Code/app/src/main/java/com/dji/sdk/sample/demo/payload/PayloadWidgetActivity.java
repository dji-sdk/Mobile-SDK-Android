package com.dji.sdk.sample.demo.payload;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import com.dji.sdk.sample.internal.utils.ToastUtils;

import java.util.List;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import dji.common.error.DJIError;
import dji.common.payload.PayloadWidget;
import dji.common.util.CommonCallbacks;
import dji.sdk.payload.Payload;

public class PayloadWidgetActivity extends AppCompatActivity {
    private TextView widgetDescriptionView = null;
    private RadioGroup widgetType = null;
    private RadioButton buttonRadio = null;
    private RadioButton switchRadio = null;
    private RadioButton rangeRadio = null;
    private RadioButton listRadio = null;
    private RadioButton inputRadio = null;
    private EditText widgetIndex = null;
    private EditText widgetValue = null;
    private Button configureWidgetValue = null;

    private Payload payload = null;
    private PayloadWidget.PayloadWidgetType checkedPadyloadWidgetType = PayloadWidget.PayloadWidgetType.UNKNOWN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_payload_widget);
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        widgetDescriptionView = (TextView) findViewById(R.id.widgetDescription);
        widgetDescriptionView.setMovementMethod(new ScrollingMovementMethod());
        widgetType = (RadioGroup) findViewById(R.id.widgetType);
        buttonRadio = (RadioButton) findViewById(R.id.buttonRadio);
        switchRadio = (RadioButton) findViewById(R.id.switchRadio);
        rangeRadio = (RadioButton) findViewById(R.id.rangeRadio);
        listRadio = (RadioButton) findViewById(R.id.listRadio);
        inputRadio = (RadioButton) findViewById(R.id.inputRadio);
        widgetIndex = (EditText) findViewById(R.id.widgetIndex);
        widgetValue = (EditText) findViewById(R.id.widgetValue);
        configureWidgetValue = (Button) findViewById(R.id.configureWidgetValue);
        if (ModuleVerificationUtil.isPayloadAvailable()) {
            payload = DJISampleApplication.getAircraftInstance().getPayload();
            printWidget();
        }
        initListener();
    }

    private void initListener() {
        widgetType.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId) {
                    case R.id.buttonRadio:
                        checkedPadyloadWidgetType = PayloadWidget.PayloadWidgetType.BUTTON;
                        break;
                    case R.id.switchRadio:
                        checkedPadyloadWidgetType = PayloadWidget.PayloadWidgetType.SWITCH;
                        break;
                    case R.id.rangeRadio:
                        checkedPadyloadWidgetType = PayloadWidget.PayloadWidgetType.RANGE;
                        break;
                    case R.id.listRadio:
                        checkedPadyloadWidgetType = PayloadWidget.PayloadWidgetType.LIST;
                        break;
                    case R.id.inputRadio:
                        checkedPadyloadWidgetType = PayloadWidget.PayloadWidgetType.INPUT;
                        break;
                    default:
                        break;
                }
            }
        });
        configureWidgetValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.configureWidgetValue) {
                    int index = Integer.parseInt(widgetIndex.getText().toString());
                    int value = Integer.parseInt(widgetValue.getText().toString());
                    if (ModuleVerificationUtil.isPayloadAvailable() && payload != null) {
                        payload.configureWidgetValue(index, checkedPadyloadWidgetType, value, new CommonCallbacks.CompletionCallback() {
                            @Override
                            public void onResult(DJIError djiError) {
                                if( djiError == null) {
                                    ToastUtils.setResultToToast("set widget: " + index + " to value: " + value);
                                } else {
                                    ToastUtils.setResultToToast(djiError.getDescription());
                                }
                            }
                        });
                    }
                }
            }
        });
        if (ModuleVerificationUtil.isPayloadAvailable() && payload != null) {
            PayloadWidget[] mainInterfaceWidgets = payload.getMainInterfaceWidgets();
            for(int i = 0; i < mainInterfaceWidgets.length; i++) {
                payload.addWidgetValueChangedCallback(mainInterfaceWidgets[i].getWidgetIndex(), mainInterfaceWidgets[i].getWidgetType(), new Payload.WidgetValueChangedCallback() {
                    @Override
                    public void onWidgetValueChanged(PayloadWidget.PayloadWidgetType payloadWidgetType, int index, int newValue) {
                        ToastUtils.setResultToToast("Widget " + index + " is " + payloadWidgetType + " and set to " + newValue);
                        printWidget();
                    }
                });
            }
            PayloadWidget[] configureWidgets = payload.getConfigInterfaceWidgets();
            for(int i = 0; i < configureWidgets.length; i++) {
                payload.addWidgetValueChangedCallback(configureWidgets[i].getWidgetIndex(), configureWidgets[i].getWidgetType(), new Payload.WidgetValueChangedCallback() {
                    @Override
                    public void onWidgetValueChanged(PayloadWidget.PayloadWidgetType payloadWidgetType, int index, int newValue) {
                        ToastUtils.setResultToToast("Configure Widget " + index + " is " + payloadWidgetType + " and set to " + newValue);
                        printWidget();
                    }
                });
            }
        }
    }

    void printWidget() {
        StringBuilder stringBuilder = new StringBuilder();
        PayloadWidget[] mainInterfaceWidgets = payload.getMainInterfaceWidgets();
        for (int i = 0; i < mainInterfaceWidgets.length; i++) {
            stringBuilder.append("MainInterfaceWidgets: [" + i + "], ");
            stringBuilder.append("getWidgetType: " + mainInterfaceWidgets[i].getWidgetType().name() + ", ");
            stringBuilder.append("getWidgetIndex: " + mainInterfaceWidgets[i].getWidgetIndex() + ", ");
            stringBuilder.append("getWidgetValue: " + mainInterfaceWidgets[i].getWidgetValue() + ", ");
            stringBuilder.append("getWidgetName: " + mainInterfaceWidgets[i].getName() + ", ");
            stringBuilder.append("getWidgetHitMessage: " + mainInterfaceWidgets[i].getHintMsg() + ", ");
            stringBuilder.append("getSubItems: [");
            List<String> items = mainInterfaceWidgets[i].getSubItems();
            if (items != null) {
                for (int j = 0; j < items.size(); j++) {
                    if (j < items.size() - 1) {
                        stringBuilder.append(items.get(j) + ", ");
                    } else {
                        stringBuilder.append(items.get(j) + "]\n");
                    }
                }
            } else {
                stringBuilder.append(" ]\n");
            }
        }
        PayloadWidget[] configureInterfaceWidgets = payload.getConfigInterfaceWidgets();
        for (int i = 0; i < configureInterfaceWidgets.length; i++) {
            stringBuilder.append("ConfigureInterfaceWidget: [" + i + "], ");
            stringBuilder.append("getWidgetType: " + configureInterfaceWidgets[i].getWidgetType().name() + ", ");
            stringBuilder.append("getWidgetIndex: " + configureInterfaceWidgets[i].getWidgetIndex() + ", ");
            stringBuilder.append("getWidgetValue: " + configureInterfaceWidgets[i].getWidgetValue() + ", ");
            stringBuilder.append("getWidgetName: " + configureInterfaceWidgets[i].getName() + ", ");
            stringBuilder.append("getWidgetHitMessage: " + configureInterfaceWidgets[i].getHintMsg() + ", ");
            stringBuilder.append("getSubItems: [");
            List<String> items = configureInterfaceWidgets[i].getSubItems();
            if (items != null) {
                for (int j = 0; j < items.size(); j++) {
                    if (j < items.size() - 1) {
                        stringBuilder.append(items.get(j) + ", ");
                    } else {
                        stringBuilder.append(items.get(j) + "]\n");
                    }
                }
            } else {
                stringBuilder.append(" ]\n");
            }
        }
        if (widgetDescriptionView != null) {
            widgetDescriptionView.setText(stringBuilder);
            widgetDescriptionView.invalidate();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
