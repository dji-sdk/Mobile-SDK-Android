package com.dji.sdk.sample.demo.bluetooth;

import android.app.Service;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.DialogUtils;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import dji.common.error.DJIError;
import dji.common.util.CommonCallbacks;
import dji.sdk.sdkmanager.BluetoothDevice;
import dji.sdk.sdkmanager.BluetoothProductConnector;
import java.util.ArrayList;
import java.util.List;

public class BluetoothView extends LinearLayout implements View.OnClickListener {

    private Spinner mSpinnerSelection;
    private TextView mTextDevicesInformation;
    private List<String> strDevicesList = new ArrayList<String>();
    private ArrayAdapter<String> adapter;
    private BluetoothProductConnector connector = null;
    private ArrayList<BluetoothDevice> devicesList = null;
    private BluetoothProductConnector.BluetoothDevicesListCallback bluetoothProductCallback =
        new BluetoothProductConnector.BluetoothDevicesListCallback() {

            @Override
            public void onUpdate(List<BluetoothDevice> list) {
                if (devicesList == null) {
                    devicesList = (ArrayList<BluetoothDevice>) list;
                    updateTextTV((ArrayList<BluetoothDevice>)list);
                    updateList(devicesList);
                } else if (!compareDevice(devicesList, (ArrayList<BluetoothDevice>)list)) {
                    devicesList = (ArrayList<BluetoothDevice>)list;
                    updateTextTV((ArrayList<BluetoothDevice>)list);
                    updateList(devicesList);
                }
            }
        };


    public BluetoothView(Context context) {
        super(context);
        initUI(context);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (connector != null) {
            connector.setBluetoothDevicesListCallback(null);
        }

    }


    private void initUI(Context context) {
        setOrientation(VERTICAL);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);

        layoutInflater.inflate(R.layout.content_bluetooth, this, true);
        Button mBtnSearchBluetooth = (Button) findViewById(R.id.btn_SearchBluetooth);
        mSpinnerSelection = (Spinner) findViewById(R.id.spin_Connect);
        Button mBtnDisconnect = (Button) findViewById(R.id.btn_Disconnect);
        Button mBtnConnect = (Button) findViewById(R.id.btn_Connect);
        mTextDevicesInformation = (TextView) findViewById(R.id.text_DevicesInformation);
        mBtnSearchBluetooth.setOnClickListener(this);
        mBtnDisconnect.setOnClickListener(this);
        mBtnConnect.setOnClickListener(this);

        connector = DJISampleApplication.getBluetoothProductConnector();
        if (connector == null) {
            DialogUtils.showDialog(getContext(), "connect is null");
            return;
        } else {
            connector.setBluetoothDevicesListCallback(this.bluetoothProductCallback);
        }
        adapter = new ArrayAdapter<String>(getContext(), R.layout.simple_list_item, strDevicesList);
        mSpinnerSelection.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_SearchBluetooth:
                connector.searchBluetoothProducts(new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError error) {
                        if (error != null) {
                            ToastUtils.setResultToToast(error.getDescription());
                        } else {
                            ToastUtils.setResultToToast("Searching...");
                        }
                    }
                });
                break;
            case R.id.btn_Connect:
                final int chosen = mSpinnerSelection.getSelectedItemPosition();
                final Runnable runSetDevice = new Runnable() {
                    @Override
                    public void run() {
                        if (chosen != -1 && chosen != 0) {
                            if (devicesList != null) {
                                connector.connect(devicesList.get(chosen - 1),
                                                  new CommonCallbacks.CompletionCallback() {

                                                      @Override
                                                      public void onResult(DJIError error) {
                                                          if (error == null) {
                                                              ToastUtils.setResultToToast("Connected");
                                                          } else {
                                                              ToastUtils.setResultToToast(error.getDescription());
                                                          }
                                                      }
                                                  });
                            } else {
                                ToastUtils.setResultToToast("device list has expired");
                            }
                        }
                    }
                };
                if (devicesList != null) {
                    if (devicesList.size() != 0) {
                        runSetDevice.run();
                    } else {
                        ToastUtils.setResultToToast("devices list is empty.");
                    }
                } else {
                    ToastUtils.setResultToToast("devices list is null");
                }
                break;
            case R.id.btn_Disconnect:
                connector.disconnect(new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError error) {
                        if (error == null) {
                            ToastUtils.setResultToToast("Disconnected");
                        } else {
                            ToastUtils.setResultToToast(error.getDescription());
                        }
                    }
                });
                break;
            default:
                break;
        }
    }

    private static void addLineToSB(StringBuilder sb, String name, Object value) {
        sb.append(name + ": ").
              append(value == null ? "" : value + "").
              append("\n");
    }

    private void updateTextTV(ArrayList<BluetoothDevice> devices) {
        if (devices == null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        addLineToSB(sb, "Devices", null);
        for (int i = 0; i < devices.size(); i++) {
            addLineToSB(sb, "Device Name", devices.get(i).getName());
            addLineToSB(sb, "Address", devices.get(i).getAddress());
            addLineToSB(sb, "Status", devices.get(i).getStatus());
            addLineToSB(sb, "RSSI", devices.get(i).getRssi());
        }
        sb.append("\n");
        ToastUtils.setResultToText(mTextDevicesInformation, sb.toString());
    }

    private void updateList(ArrayList<BluetoothDevice> devices) {
        if (devices == null) {
            return;
        }
        if (strDevicesList != null) {
            strDevicesList.clear();
            strDevicesList.add("Select Devices");

            for (int i = 0; i < devices.size(); i++) {
                strDevicesList.add(devices.get(i).getName());
            }
        }

        post(new Runnable() {
            @Override
            public void run() {
                adapter.notifyDataSetChanged();
                mSpinnerSelection.setSelection(0);
            }
        });
    }

    private boolean compareDevice(ArrayList<BluetoothDevice> ar1, ArrayList<BluetoothDevice> ar2) {
        if (ar1.size() != ar2.size()) {
            return false;
        }
        for (int i = 0; i < ar1.size(); i++) {
            if (!ar1.get(i).equals(ar2.get(i))) {
                return false;
            }
        }
        return true;
    }
}
