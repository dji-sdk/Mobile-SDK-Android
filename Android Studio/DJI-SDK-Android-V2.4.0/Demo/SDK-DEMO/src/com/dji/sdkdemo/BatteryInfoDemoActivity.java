
package com.dji.sdkdemo;

import java.util.Timer;
import java.util.TimerTask;

import com.dji.sdkdemo.MainControllerDemoActivity.Task;

import dji.sdk.api.DJIDrone;
import dji.sdk.api.Camera.DJICameraDecodeTypeDef.DecoderType;
import dji.sdk.api.DJIDroneTypeDef.DJIDroneType;
import dji.sdk.api.DJIError;
import dji.sdk.api.Battery.DJIBatteryErrorType;
import dji.sdk.api.Battery.DJIBatteryProperty;
import dji.sdk.interfaces.DJIBatteryGetErrorTypeCallback;
import dji.sdk.interfaces.DJIBatteryGetHistoryStatusCallBack;
import dji.sdk.interfaces.DJIBatteryGetPartVoltageCallBack;
import dji.sdk.interfaces.DJIBatteryUpdateInfoCallBack;
import dji.sdk.interfaces.DJIExecuteIntResultCallback;
import dji.sdk.interfaces.DJIExecuteStringResultCallback;
import dji.sdk.interfaces.DJIReceivedVideoDataCallBack;
import dji.sdk.interfaces.DJISmartBatteryExecuteResultCallback;
import dji.sdk.widget.DjiGLSurfaceView;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class BatteryInfoDemoActivity extends DemoBaseActivity {
    private static final String TAG = "BatteryInfoDemoActivity";
    
    private TextView mConnectStateTextView;
    private TextView mBatteryInfoTextView;  
    private TextView mBatteryHistoryTextView;
    private EditText mDischargeDaysEdit;
    private Button mDischargeDaysBtn;
    private Button mGetFirmwareVersion;
    private DjiGLSurfaceView mDjiGLSurfaceView;
    
    private ScrollView scrollView;
    private RelativeLayout relativeView;
    
    private double timeForAll = -1;
    private double timeForLand = -1;
    private double timeForGoHome= -1;
    private double goHomeBatteryLevel = -1;
    private double landBatteryLevel = -1;
    private double batteryConnectionStatus = -1;
    private int batteryErrorType = -1;
    private double batterySelfDischargeDay = -1;
    private int[] batteryHistory;
    private int[] partVoltage;
    
    private boolean firstCurrentLevelWarning;
    private boolean secondCurrentLevelWarning;
    private boolean firstOverHeatLevelWarning;
    private boolean secondOverHeatLevelWarning;
    private boolean firstLowTemperatureLevelWarning;
    private boolean secondLowTemperatureLevelWarning;
    private boolean shortCircuit;
    private int cellLowVoltage;
    private int cellInvalid;
    
    private DJIReceivedVideoDataCallBack mReceivedVideoDataCallBack  = null;    
    private DJIBatteryUpdateInfoCallBack mBattryUpdateInfoCallBack = null;
    
    private Timer mTimer;
    private String BatteryInfoString = "";    
    private String BatteryHistoryString = "";
    
    private static final int SHOWTOAST = 1;
    
    class Task extends TimerTask {
        //int times = 1;

        @Override
        public void run() 
        {
            //Log.d(TAG ,"==========>Task Run In!");
            checkConnectState(); 
        }

    };
    
    private void checkConnectState(){
        
        BatteryInfoDemoActivity.this.runOnUiThread(new Runnable(){

            @Override
            public void run() 
            {   
                if(DJIDrone.getDjiCamera() != null){
                    boolean bConnectState = DJIDrone.getDjiCamera().getCameraConnectIsOk();
                    if(bConnectState){
                        mConnectStateTextView.setText(R.string.camera_connection_ok);
                    }
                    else{
                        mConnectStateTextView.setText(R.string.camera_connection_break);
                    }
                }
            }
        });
        
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery_info_demo);

        DJIDrone.getDjiCamera().setDecodeType(DecoderType.Software);
        
        mDjiGLSurfaceView = (DjiGLSurfaceView)findViewById(R.id.DjiSurfaceView_battery_info);
        mBatteryInfoTextView = (TextView)findViewById(R.id.BatteryInfoTV);
        mConnectStateTextView = (TextView)findViewById(R.id.ConnectStateBatteryInfoTextView);
        mBatteryHistoryTextView = (TextView)findViewById(R.id.BatteryHistoryInfoTV);
        mDischargeDaysEdit = (EditText)findViewById(R.id.SetDischargeDaysEdit);
        mDischargeDaysBtn = (Button)findViewById(R.id.SetDischargeDaysBtn);
        
        mDischargeDaysBtn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v)
            {
                String days;
                // TODO Auto-generated method stub
                if( mDischargeDaysEdit.length() == 0) {
                    days = "0";
                } else {
                    days = mDischargeDaysEdit.getText().toString();
                }
                
                int dischargeDays = Integer.parseInt(days);
                DJIDrone.getDjiBattery().setBatterySelfDischargeDay(dischargeDays, new DJISmartBatteryExecuteResultCallback(){

                    @Override
                    public void onResult(double result, DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.v("Inspire", mErr.errorCode + "");
                        String ResultsString = "return code =" + mErr.errorCode;
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });
            }
            
        });
        
        mGetFirmwareVersion = (Button)findViewById(R.id.get_version_btn);
        mGetFirmwareVersion.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                DJIDrone.getDjiBattery().getFirmwareVersion(new DJIExecuteStringResultCallback(){

                    @Override
                    public void onResult(String result)
                    {
                        // TODO Auto-generated method stub
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST,  "Firmware version = "+result));
                    }
                    
                });
            }
        });
        
        mDjiGLSurfaceView.start();
        
        mReceivedVideoDataCallBack = new DJIReceivedVideoDataCallBack(){

            @Override
            public void onResult(byte[] videoBuffer, int size)
            {
                // TODO Auto-generated method stub
                mDjiGLSurfaceView.setDataToDecoder(videoBuffer, size);
            }
        };
        
        DJIDrone.getDjiCamera().setReceivedVideoDataCallBack(mReceivedVideoDataCallBack);
        
        mBattryUpdateInfoCallBack = new DJIBatteryUpdateInfoCallBack(){

            @Override
            public void onResult(DJIBatteryProperty state) {
                // TODO Auto-generated method stub
                updateSmartBatteryInfo();
                StringBuffer sb = new StringBuffer();
                sb.append(getString(R.string.battery_info)).append("\n");
                sb.append("designedVolume=").append(state.designedVolume).append("\n");
                sb.append("fullChargeVolume=").append(state.fullChargeVolume).append("\n");        
                sb.append("currentElectricity=").append(state.currentElectricity).append("\n");
                sb.append("currentVoltage=").append(state.currentVoltage).append("\n");        
                sb.append("currentCurrent=").append(state.currentCurrent).append("\n");
                sb.append("remainLifePercent=").append(state.remainLifePercent).append("\n");
                sb.append("remainPowerPercent=").append(state.remainPowerPercent).append("\n");
                sb.append("batteryTemperature=").append(state.batteryTemperature).append("\n");
                sb.append("dischargeCount=").append(state.dischargeCount).append("\n");
                sb.append("timeForAll=").append(timeForAll).append("\n");
                sb.append("timeForLand=").append(timeForLand).append("\n");
                sb.append("timeForGoHome=").append(timeForGoHome).append("\n");
                sb.append("goHomeBatteryLevel=").append(goHomeBatteryLevel).append("\n");
                sb.append("landBatteryLevel=").append(landBatteryLevel).append("\n");
                sb.append("ConnectionStatus=").append(batteryConnectionStatus).append("\n");
                sb.append("SelfDischargeDay=").append((int)batterySelfDischargeDay).append("\n");
                sb.append("ErrorType=").append("\n");
                sb.append("firstCurrentLevelWarning = ").append(firstCurrentLevelWarning).append("\n");
                sb.append("secondCurrentLevelWarning = ").append(secondCurrentLevelWarning).append("\n");
                sb.append("firstOverHeatLevelWarning = ").append(firstOverHeatLevelWarning).append("\n");
                sb.append("secondOverHeatLevelWarning = ").append(secondOverHeatLevelWarning).append("\n");
                sb.append("firstLowTemperatureLevelWarning = ").append(firstLowTemperatureLevelWarning).append("\n");
                sb.append("secondLowTemperatureLevelWarning = ").append(secondLowTemperatureLevelWarning).append("\n");
                sb.append("shortCircuit = ").append(shortCircuit).append("\n");
                sb.append("cellLowVoltage = ").append(cellLowVoltage).append("\n");
                sb.append("cellInvalid = ").append(cellInvalid).append("\n");
                BatteryInfoString = sb.toString();
                
                StringBuffer history = new StringBuffer();
                
                history.append(getString(R.string.battery_part_voltages)).append("\n");
                if (null != partVoltage) {
                    for (int i = 0; i < partVoltage.length; i++) {
                        history.append((i + 1) + " part Valtage = " + partVoltage[i]).append("\n");
                    }
                }
                
                history.append(getString(R.string.battery_history)).append("\n");
                
                if (null != batteryHistory) {
                    for (int i = 0; i < batteryHistory.length; i++) {
                        history.append(i + " status : " + batteryHistory[i] + "").append("\n");
                    }
                }
                    
                BatteryHistoryString = history.toString();
                
                BatteryInfoDemoActivity.this.runOnUiThread(new Runnable(){

                    @Override
                    public void run() 
                    {   
                        mBatteryInfoTextView.setText(BatteryInfoString);
                        mBatteryHistoryTextView.setText(BatteryHistoryString);
                    }
                });
            }
            
        };        
        
        DJIDrone.getDjiBattery().setBatteryUpdateInfoCallBack(mBattryUpdateInfoCallBack);
        
        if (DJIDroneType.DJIDrone_Vision == DJIDrone.getDroneType()) {
            scrollView = (ScrollView)findViewById(R.id.BatteryHistoryView);
            scrollView.setVisibility(View.GONE);
            relativeView = (RelativeLayout)findViewById(R.id.SetDischargeView);
            relativeView.setVisibility(View.GONE);
            mGetFirmwareVersion.setVisibility(View.GONE);
        }
    }

    @Override
    protected void onResume() {
        mDjiGLSurfaceView.resume();
        
        mTimer = new Timer();
        Task task = new Task();
        mTimer.schedule(task, 0, 500);    
        
        DJIDrone.getDjiBattery().startUpdateTimer(2000);
        // TODO Auto-generated method stub
        super.onResume();
    }
    
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        
        mDjiGLSurfaceView.pause();
        
        if(mTimer!=null) {            
            mTimer.cancel();
            mTimer.purge();
            mTimer = null;
        }
        
        DJIDrone.getDjiBattery().stopUpdateTimer();
        super.onPause();
    }
    
    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
    }
    
    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        
        
        if(DJIDrone.getDjiCamera() != null)
        DJIDrone.getDjiCamera().setReceivedVideoDataCallBack(null);
        mDjiGLSurfaceView.destroy();
        super.onDestroy();
    }
    
    /** 
     * @Description : RETURN BTN RESPONSE FUNCTION
     * @author      : andy.zhao
     * @param view 
     * @return      : void
     */
    public void onReturn(View view){
        Log.d(TAG ,"onReturn");  
        this.finish();
    }
    
    private Handler handler = new Handler(new Handler.Callback() {
        
        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case SHOWTOAST:
                    setResultToToast((String)msg.obj); 
                    break;

                default:
                    break;
            }
            return false;
        }
    });
    
    private void setResultToToast(String result){
        Toast.makeText(BatteryInfoDemoActivity.this, result, Toast.LENGTH_SHORT).show();
    }
    
    private void updateSmartBatteryInfo() {
        DJIDrone.getDjiBattery().getSmartBatteryGohomeBatteryLevel(new DJISmartBatteryExecuteResultCallback() {

            @Override
            public void onResult(double result, DJIError mErr)
            {
                // TODO Auto-generated method stub
                if (DJIError.RESULT_OK == mErr.errorCode) {
                    goHomeBatteryLevel = result;
                }
            }
            
        });
        
        DJIDrone.getDjiBattery().getSmartBatteryLandBatteryLevel(new DJISmartBatteryExecuteResultCallback() {

            @Override
            public void onResult(double result, DJIError mErr)
            {
                // TODO Auto-generated method stub
                if (DJIError.RESULT_OK == mErr.errorCode) {
                    landBatteryLevel = result;
                }
            }
            
        });
        
        DJIDrone.getDjiBattery().getSmartBatteryNeedTimeForGoHome(new DJISmartBatteryExecuteResultCallback() {

            @Override
            public void onResult(double result, DJIError mErr)
            {
                // TODO Auto-generated method stub
                if (DJIError.RESULT_OK == mErr.errorCode) {
                    timeForGoHome = result;
                }
            }
            
        });
        
        DJIDrone.getDjiBattery().getSmartBatteryNeedTimeForLand(new DJISmartBatteryExecuteResultCallback() {

            @Override
            public void onResult(double result, DJIError mErr)
            {
                // TODO Auto-generated method stub
                if (DJIError.RESULT_OK == mErr.errorCode) {
                    timeForLand = result;
                }
            }
            
        });
        
        DJIDrone.getDjiBattery().getSmartBatteryRestTimeForAll(new DJISmartBatteryExecuteResultCallback() {

            @Override
            public void onResult(double result, DJIError mErr)
            {
                // TODO Auto-generated method stub
                if (DJIError.RESULT_OK == mErr.errorCode) {
                    timeForAll = result;
                }
            }
            
        });
        
        DJIDrone.getDjiBattery().getBatteryConnectionStatus(new DJISmartBatteryExecuteResultCallback(){

            @Override
            public void onResult(double result, DJIError mErr)
            {
                // TODO Auto-generated method stub
                if (DJIError.RESULT_OK == mErr.errorCode) {
                    batteryConnectionStatus = result;
                }
            }
            
        });
        
        DJIDrone.getDjiBattery().getBatteryErrorType(new DJIBatteryGetErrorTypeCallback() {
            
            @Override
            public void onResult(DJIBatteryErrorType mErrorType)
            {
                // TODO Auto-generated method stub
                
            }
        });
        
        DJIDrone.getDjiBattery().getBatterySelfDischargeDay(new DJISmartBatteryExecuteResultCallback(){

            @Override
            public void onResult(double result, DJIError mErr)
            {
                // TODO Auto-generated method stub
                if (DJIError.RESULT_OK == mErr.errorCode) {
                    batterySelfDischargeDay = result;
                }
            }
            
        });
        
        DJIDrone.getDjiBattery().getBatteryHistoryStatus(new DJIBatteryGetHistoryStatusCallBack() {

            @Override
            public void onResult(int[] batteryHistoryStatus)
            {
                // TODO Auto-generated method stub
                if (null != batteryHistoryStatus){
                    batteryHistory = new int[batteryHistoryStatus.length];
                    System.arraycopy(batteryHistoryStatus, 0, batteryHistory, 0, batteryHistoryStatus.length);batteryHistory = batteryHistoryStatus;
                }
            }
            
        });
        
        DJIDrone.getDjiBattery().getPartVoltages(new DJIBatteryGetPartVoltageCallBack() {

            @Override
            public void onResult(int[] partVoltageValues)
            {
                // TODO Auto-generated method stub
                if (null != partVoltageValues) {
                    partVoltage = partVoltageValues;
                }
            }
            
        });
    }
}
