package com.dji.sdk.sample.bluetooth;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import dji.common.error.DJIError;
import dji.common.util.DJICommonCallbacks;
import dji.sdk.sdkmanager.DJISDKManager;
import dji.sdk.sdkmanager.DJIBluetoothDevice;
import dji.sdk.sdkmanager.DJIBluetoothProductConnector;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.common.DJISampleApplication;
import com.dji.sdk.sample.common.Utils;
import com.dji.sdk.sample.utils.DJIDialog;

import java.util.ArrayList;

/**
 * Created by wenqian.qiao on 2016/8/23.
 */
public class BluetoothView extends LinearLayout implements View.OnClickListener, AdapterView.OnItemSelectedListener{

    public static final String TAG = BluetoothView.class.getName();

    public BluetoothView(Context context, AttributeSet attrs){
        super(context, attrs);

    }
    private Button mBtnSearchBluetooth;
    private Button mBtnDisconnect;
    private Button mBtnConnect;
    private Spinner mSpinnerSelection;
    private TextView mTextDevices;
    private TextView mTextDevicesInformation;
    private ArrayList<String> strDevicesList = new ArrayList<String>();
    private ArrayAdapter<String> adapter;
    private static DJIBluetoothProductConnector connector = null;
    private ArrayList<DJIBluetoothDevice> devicesList = null;
    private DJIBluetoothProductConnector.BluetoothProductConnectorListener bluetoothProductConnectorListener = new DJIBluetoothProductConnector.BluetoothProductConnectorListener(){

        @Override
        public void onBluetoothDevicesListChanged(ArrayList<DJIBluetoothDevice> devices) {

            if(devicesList == null){
                devicesList = devices;
                updateTextTV(devices);
                updateList(devicesList);
            }
            else if(!compareDevice(devicesList, devices)){
                devicesList = devices;
                updateTextTV(devices);
                updateList(devicesList);
            }

        }
    };

    @Override
    protected void onFinishInflate(){
        super.onFinishInflate();
        initUI();
    }

    private void initUI(){
        mBtnSearchBluetooth = (Button) findViewById(R.id.btn_SearchBluetooth);
        mSpinnerSelection = (Spinner) findViewById(R.id.spin_Connect);
        mBtnDisconnect = (Button) findViewById(R.id.btn_Disconnect);
        mBtnConnect = (Button) findViewById(R.id.btn_Connect);
        mTextDevices = (TextView) findViewById(R.id.text_Devices);
        mTextDevicesInformation = (TextView) findViewById(R.id.text_DevicesInformation);
        mBtnSearchBluetooth.setOnClickListener(this);
        mBtnDisconnect.setOnClickListener(this);
        mBtnConnect.setOnClickListener(this);

        connector = DJISampleApplication.getBluetoothProductConnector();
        if(connector == null){
            DJIDialog.showDialog(getContext(), "connect is null");
            return;
        }else{
            connector.setBluetoothProductConnectorListener(this.bluetoothProductConnectorListener);
        }
        adapter= new ArrayAdapter<String>(getContext(), R.layout.simple_list_item, strDevicesList);
        mSpinnerSelection.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        mSpinnerSelection.setOnItemSelectedListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_SearchBluetooth:
                connector.searchBluetoothProducts(new DJICommonCallbacks.DJICompletionCallback() {
                    @Override
                    public void onResult(DJIError error) {
                        if(error != null){
                            Utils.setResultToToast(getContext(), error.getDescription());
                        }else{
                            Utils.setResultToToast(getContext(), "Searching...");
                        }
                    }
                });
                break;
            case R.id.btn_Connect:
                //Log.d("Alex", "Selected Position: " + mSpinnerSelection.getSelectedItemPosition());
                final int chosen = mSpinnerSelection.getSelectedItemPosition();
                final Runnable runSetDevice = new Runnable() {
                    @Override
                    public void run() {
                        if(chosen != -1 && chosen != 0){
                            if(devicesList != null) {
                                connector.connect(devicesList.get(chosen-1), new DJICommonCallbacks.DJICompletionCallback() {

                                    @Override
                                    public void onResult(DJIError error) {
                                        if (error == null) {
                                            Utils.setResultToToast(getContext(), "Connected");
                                        } else {
                                            Utils.setResultToToast(getContext(), error.getDescription());
                                        }
                                    }
                                });
                            }else{
                                Utils.setResultToToast(getContext(), "device list has expired");
                            }
                        }
                    }
                };
                if(devicesList != null){
                    if(devicesList.size() != 0){
                        runSetDevice.run();
                    }else{
                        Utils.setResultToToast(getContext(), "devices list is empty.");
                    }
                }else{
                    Utils.setResultToToast(getContext(), "devices list is null");
                }
                break;
            case R.id.btn_Disconnect:
                connector.disconnect(new DJICommonCallbacks.DJICompletionCallback(){
                    @Override
                    public void onResult(DJIError error){
                        if(error == null){
                            Utils.setResultToToast(getContext(), "Disconnected");
                        }else{
                            Utils.setResultToToast(getContext(), error.getDescription());
                        }
                    }
                });
                Log.d("Alex", "Comes into the search");
                break;
            default:
                break;
        }
    }


    private void addLineToSB(StringBuffer sb, String name, Object value){
        if(sb == null) return;
        sb.
                append((name == null || "".equals(name))? "" : name + ": ").
                append(value==null? "" : value + "").
                append("\n");
    }

    private void updateTextTV(ArrayList<DJIBluetoothDevice> devices){
        if(devices == null){
            return;
        }
        final StringBuffer sb = new StringBuffer();
        addLineToSB(sb, "Devices", null);
        for(int i =0; i<devices.size(); i++){
            addLineToSB(sb, "Device Name", devices.get(i).getName());
            addLineToSB(sb, "Address", devices.get(i).getAddress());
            addLineToSB(sb, "Status", devices.get(i).getStatus());
            addLineToSB(sb, "RSSI", devices.get(i).getRssi());
        }
        addLineToSB(sb, "", null);
        Utils.setResultToText(getContext(), mTextDevicesInformation, sb.toString());
    }

    private void updateList(ArrayList<DJIBluetoothDevice> devices){
        if(devices == null){
            return;
        }
        if(strDevicesList != null){
            strDevicesList.clear();
        }
        strDevicesList.add("Select Devices");

        for(int i = 0; i<devices.size(); i++){
            strDevicesList.add(devices.get(i).getName());
        }
        post(new Runnable() {
            @Override
            public void run() {
                adapter.notifyDataSetChanged();
                mSpinnerSelection.setSelection(0);
            }
        });
    }
    private boolean compareDevice(ArrayList<DJIBluetoothDevice> ar1, ArrayList<DJIBluetoothDevice> ar2){
        if(ar1.size()!=ar2.size()){
            return false;
        }
        for(int i = 0; i < ar1.size(); i++){
            if(ar1.get(i).getAddress() != ar2.get(i).getAddress()){
                return false;
            }
            if(ar1.get(i).getStatus() != ar2.get(i).getStatus()){
                return false;
            }
        }
        return true;


    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //Log.d("Alex", "position: " + position + " id: " + id);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Log.d("Alex", "nothing clicked");
    }
}
