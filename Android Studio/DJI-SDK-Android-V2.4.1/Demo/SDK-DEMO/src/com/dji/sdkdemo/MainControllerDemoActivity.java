
package com.dji.sdkdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import com.dji.sdkdemo.CameraProtocolDemoActivity.pickerValueChangeListener;
import com.dji.sdkdemo.widget.PopupNumberPicker;

import dji.sdk.api.DJIDrone;
import dji.sdk.api.Camera.DJICameraDecodeTypeDef.DecoderType;
import dji.sdk.api.DJIDroneTypeDef.DJIDroneType;
import dji.sdk.api.DJIError;
import dji.sdk.api.MainController.DJIFlyLimitParameter;
import dji.sdk.api.MainController.DJIMainControllerSystemState;
import dji.sdk.api.MainController.DJIMainControllerTypeDef.DJIMcErrorType;
import dji.sdk.api.MainController.DJIMainControllerTypeDef.DJIMcFunctionType;
import dji.sdk.interfaces.DJIExecuteBooleanResultCallback;
import dji.sdk.interfaces.DJIExecuteFloatResultCallback;
import dji.sdk.interfaces.DJIExecuteResultCallback;
import dji.sdk.interfaces.DJIExecuteStringResultCallback;
import dji.sdk.interfaces.DJIMainControllerExternalDeviceRecvDataCallBack;
import dji.sdk.interfaces.DJIMainControllerFlyLimitParameterCallBack;
import dji.sdk.interfaces.DJIMcuErrorCallBack;
import dji.sdk.interfaces.DJIMcuUpdateStateCallBack;
import dji.sdk.interfaces.DJIReceivedVideoDataCallBack;
import dji.sdk.widget.DjiGLSurfaceView;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;


public class MainControllerDemoActivity extends DemoBaseActivity {
    private static final String TAG = "MainControllerDemoActivity";
    
    private TextView mConnectStateTextView;
    private TextView mMainControllerStateTextView;
    private Button mMainControllerErrorBtn;
    
    private ScrollView mMCOnBoardRecvScrollView;
    private TextView mRecvTextView;
    private Button mSendOnBoardBtn;
    private EditText mSendOnBoardEdit;
    
    private Button mSetAltitudeBtn;
    private Button mGetAltitudeBtn;
    private Button mGetAircraftSn;
    private Button mGetFirmwareVersion;
    private Button mStartCompassCalibrationBtn;
    private Button mStopCompassCalibrationBtn;
    
    private DjiGLSurfaceView mDjiGLSurfaceView;
    private DJIReceivedVideoDataCallBack mReceivedVideoDataCallBack  = null;    
    private DJIMcuUpdateStateCallBack mMcuUpdateStateCallBack = null;
    private DJIMcuErrorCallBack mMcuErrorCallBack = null;
    private DJIMainControllerExternalDeviceRecvDataCallBack mExtDevReceiveDataCallBack = null;
    
    private Timer mTimer;
    private String McStateString = "";    
    private String McErrorString = "";
    private String McRecvOnBoard = "";
    
    private Context m_context;
    private PopupNumberPicker mPopupNumberPicker = null;
    
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
        
        MainControllerDemoActivity.this.runOnUiThread(new Runnable(){

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
    
    private final int SHOWTOAST = 1;
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
        Toast.makeText(MainControllerDemoActivity.this, result, Toast.LENGTH_SHORT).show();
    }
    
    private String getErrorDescriptionByErrorCode(DJIMcErrorType errCode){
        String result = "";
        
        if(errCode == DJIMcErrorType.Mc_No_Error ){
            result = getString(R.string.MCU_NO_ERROR);
        }
        else if(errCode == DJIMcErrorType.Mc_Config_Error ){
            result = getString(R.string.MCU_CONFIG_ERROR);
        }
        else if(errCode == DJIMcErrorType.Mc_SerialNum_Error ){
            result = getString(R.string.MCU_SERIALNUM_ERROR);
        }
        else if(errCode == DJIMcErrorType.Mc_Imu_Error ){
            result = getString(R.string.MCU_IMU_ERROR);
        }
        else if(errCode == DJIMcErrorType.Mc_X1_Error ){
            result = getString(R.string.MCU_X1_ERROR);
        }       
        else if(errCode == DJIMcErrorType.Mc_X2_Error ){
            result = getString(R.string.MCU_X2_ERROR);
        }  
        else if(errCode == DJIMcErrorType.Mc_Pmu_Error ){
            result = getString(R.string.MCU_PMU_ERROR);
        }  
        else if(errCode == DJIMcErrorType.Mc_Transmitter_Error ){
            result = getString(R.string.MCU_TRANSMITTER_ERROR);
        }
        else if(errCode == DJIMcErrorType.Mc_Sensor_Error ){
            result = getString(R.string.MCU_SENSOR_ERROR);
        }        
        else if(errCode == DJIMcErrorType.Mc_Compass_Error ){
            result = getString(R.string.MCU_COMPASS_ERROR);
        }  
        else if(errCode == DJIMcErrorType.Mc_Imu_Calibration_Error ){
            result = getString(R.string.MCU_IMU_CALIBRATION_ERROR);
        }         
        else if(errCode == DJIMcErrorType.Mc_Compass_Calibration_Error ){
            result = getString(R.string.MCU_COMPASS_CALIBRATION_ERROR);
        }   
        else if(errCode == DJIMcErrorType.Mc_Transmitter_Calibration_Error ){
            result = getString(R.string.MCU_TRANSMITTER_CALIBRATION_ERROR);
        }           
        else if(errCode == DJIMcErrorType.Mc_Invalid_Battery_Error ){
            result = getString(R.string.MCU_INVALID_BATTERY_ERROR);
        }    
        else if(errCode == DJIMcErrorType.Mc_Invalid_Battery_Communication_Error ){
            result = getString(R.string.MCU_INVALID_BATTERY_COMMUNICATION_ERROR);
        }    
        else if(errCode == DJIMcErrorType.Mc_Unknown_Error ){
            result = getString(R.string.MCU_UNKOWN_ERROR);
        }          
        return result;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_controller_demo);
        
        DJIDrone.getDjiCamera().setDecodeType(DecoderType.Software);
        
        m_context = this.getApplicationContext();

        mDjiGLSurfaceView = (DjiGLSurfaceView)findViewById(R.id.DjiSurfaceView_MC);
        mMainControllerStateTextView = (TextView)findViewById(R.id.MainControllerStateTV);
        mMainControllerErrorBtn = (Button)findViewById(R.id.MainControllerErrorButton);        
        mConnectStateTextView = (TextView)findViewById(R.id.ConnectStateMCTextView);
        
        mMCOnBoardRecvScrollView = (ScrollView)findViewById(R.id.MCOnBoardRecvScrollView);
        mRecvTextView = (TextView)findViewById(R.id.MCOnBoardRecv);
        mSendOnBoardBtn = (Button)findViewById(R.id.MCOnBoardSendBtn);
        mSendOnBoardEdit = (EditText)findViewById(R.id.MCOnBoardSendEdit);
        
        mSetAltitudeBtn = (Button)findViewById(R.id.set_altitude_btn);
        mSetAltitudeBtn.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                
                DJIDrone.getDjiMainController().setGohomeAltitude(50, new DJIExecuteBooleanResultCallback() {
                    
                    @Override
                    public void onResult(boolean result)
                    {
                        // TODO Auto-generated method stub
                        if (result) {
                            handler.sendMessage(handler.obtainMessage(SHOWTOAST, "Set Successfully"));
                        } else {
                            handler.sendMessage(handler.obtainMessage(SHOWTOAST, "Set Fail"));
                        }
                    }
                });
            }
        });
        
        mGetAltitudeBtn = (Button)findViewById(R.id.get_altitude_btn);
        mGetAltitudeBtn.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                DJIDrone.getDjiMainController().getGohomeAltitude(new DJIExecuteFloatResultCallback() {
                    
                    @Override
                    public void onResult(float result)
                    {
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result + ""));
                    }
                });
            }
        });
        
        mGetAircraftSn = (Button)findViewById(R.id.get_aircraft_sn_btn);
        mGetAircraftSn.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                DJIDrone.getDjiMainController().getAircraftSn(new DJIExecuteStringResultCallback(){

                    @Override
                    public void onResult(String result)
                    {
                        // TODO Auto-generated method stub
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST,  "SN = "+result));
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
                DJIDrone.getDjiMainController().getFirmwareVersion(new DJIExecuteStringResultCallback(){

                    @Override
                    public void onResult(String result)
                    {
                        // TODO Auto-generated method stub
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST,  "Firmware version = "+result));
                    }
                    
                });
            }
        });
        
        mSendOnBoardBtn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                if ("" != mSendOnBoardEdit.getText().toString()){
                    DJIDrone.getDjiMainController().sendDataToExternalDevice(mSendOnBoardEdit.getText().toString().getBytes(),new DJIExecuteResultCallback(){

                        @Override
                        public void onResult(DJIError result)
                        {
                            // TODO Auto-generated method stub
                            
                        }
                        
                    });
                }
            }
            
        });
        
        mMainControllerErrorBtn.setEnabled(false);
        mMainControllerErrorBtn.setClickable(false);
        
        mDjiGLSurfaceView.start();
        
        mReceivedVideoDataCallBack = new DJIReceivedVideoDataCallBack(){

            @Override
            public void onResult(byte[] videoBuffer, int size)
            {
                // TODO Auto-generated method stub
                mDjiGLSurfaceView.setDataToDecoder(videoBuffer, size);
            }
        };
        
        mStartCompassCalibrationBtn = (Button)findViewById(R.id.start_compass_calibration);
        mStartCompassCalibrationBtn.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v)
            {
                if(DJIDrone.getDroneType() == DJIDroneType.DJIDrone_Vision){
                    DJIDrone.getDjiMainController().setStartCompassCalibration(new DJIExecuteBooleanResultCallback(){

                        @Override
                        public void onResult(boolean result)
                        {
                            // TODO Auto-generated method stub
                            if(result){
                                handler.sendMessage(handler.obtainMessage(SHOWTOAST, "Start Calibration ,successful"));
                            }
                            else{
                                handler.sendMessage(handler.obtainMessage(SHOWTOAST, "Start Calibration ,fail"));
                            }
                        }
                        
                    });
                }
                else{
                    DJIDrone.getDjiMainController().startCompassCalibration(new DJIExecuteResultCallback() {

                        @Override
                        public void onResult(DJIError result)
                        {
                            // TODO Auto-generated method stub
                            handler.sendMessage(handler.obtainMessage(SHOWTOAST, "Start Calibration ,result ="+result.errorDescription));
                        }
                        
                    });   
                }
            }
        });
        
        mStopCompassCalibrationBtn = (Button)findViewById(R.id.stop_compass_calibration);
        mStopCompassCalibrationBtn.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v)
            {
                DJIDrone.getDjiMainController().stopCompassCalibration(new DJIExecuteResultCallback() {

                    @Override
                    public void onResult(DJIError result)
                    {
                        // TODO Auto-generated method stub
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, "Start Calibration ,result ="+result.errorDescription));
                    }
                });               
            }
        });
        
        DJIDrone.getDjiCamera().setReceivedVideoDataCallBack(mReceivedVideoDataCallBack);
        
        
        mMcuUpdateStateCallBack = new DJIMcuUpdateStateCallBack(){

            @Override
            public void onResult(DJIMainControllerSystemState state) {
                // TODO Auto-generated method stub
                
                StringBuffer sb = new StringBuffer();   
                sb.append(getString(R.string.main_controller_state)).append("\n");
                sb.append("MCU Version=").append(DJIDrone.getDjiMC().getMcuVersion()).append("\n");
                sb.append("satelliteCount=").append(state.satelliteCount).append("\n");
                sb.append("homeLocationLatitude=").append(state.homeLocationLatitude).append("\n");
                sb.append("homeLocationLongitude=").append(state.homeLocationLongitude).append("\n");
                sb.append("droneLocationLatitude=").append(state.droneLocationLatitude).append("\n");
                sb.append("droneLocationLongitude=").append(state.droneLocationLongitude).append("\n");
                sb.append("velocityX=").append(state.velocityX).append("\n");
                sb.append("velocityY=").append(state.velocityY).append("\n");
                sb.append("velocityZ=").append(state.velocityZ).append("\n");
                sb.append("speed=").append(state.speed).append("\n");      
                sb.append("altitude=").append(state.altitude).append("\n");
                sb.append("pitch=").append(state.pitch).append("\n");
                sb.append("roll=").append(state.roll).append("\n");
                sb.append("yaw=").append(state.yaw).append("\n");
                sb.append("remainPower=").append(state.remainPower).append("\n");
                sb.append("remainFlyTime=").append(state.remainFlyTime).append("\n");
                sb.append("powerLevel=").append(state.powerLevel).append("\n");
                sb.append("isFlying=").append(state.isFlying).append("\n");
                sb.append("noFlyStatus=").append(state.noFlyStatus).append("\n");
                sb.append("noFlyZoneCenterLatitude=").append(state.noFlyZoneCenterLatitude).append("\n");
                sb.append("noFlyZoneCenterLongitude=").append(state.noFlyZoneCenterLongitude).append("\n");
                sb.append("noFlyZoneRadius=").append(state.noFlyZoneRadius);
                
                if (DJIDrone.getDroneType() != DJIDroneType.DJIDrone_Vision) {
                    sb.append("\n").append("remoteControllerState=").append(state.remoteControllerState).append("\n");
                    sb.append("flightControlState=").append(state.fightControlState.name()).append("\n");
                    sb.append("IOCType=").append(state.IOCType).append("\n");
                    sb.append("lastFlightControlCommend=").append(state.lastFilghtControlCommend.toString()).append("\n");
                    sb.append("IOCState=").append(state.IOCState).append("\n");
                    sb.append("isUltrasonicWaveWork=").append(state.isUltrasonicWaveWork).append("\n");
                    sb.append("goHomeState=").append(state.goHomeStatus.toString()).append("\n");
                    sb.append("imuPreheated=").append(state.imuPreheated).append("\n");
                    sb.append("isCompassErrorStatus=").append(state.isCompassErrorStatus).append("\n");
                    sb.append("compassCalibrationStatus=").append(state.CompassCalibrationStatus.name()).append("\n");
                    sb.append("isCompassCalibrationOpen=").append(state.isCompassCalibrationOpen).append("\n");
                    sb.append("isNavigationModeEnabled=").append(state.isNavigationModeEnabled).append("\n");
                }

                McStateString = sb.toString();
  
                MainControllerDemoActivity.this.runOnUiThread(new Runnable(){

                    @Override
                    public void run() 
                    {   
                        mMainControllerStateTextView.setText(McStateString);
                    }
                });
            }
            
        };
        
        mExtDevReceiveDataCallBack = new DJIMainControllerExternalDeviceRecvDataCallBack() {

            @Override
            public void onResult(byte[] data)
            {
                // TODO Auto-generated method stub
                StringBuffer sb = new StringBuffer();
                sb.append(getString(R.string.external_device_recv_data)).append("\n");
                sb.append(new String(data)).append("\n");
                
                McRecvOnBoard = sb.toString();
                
                MainControllerDemoActivity.this.runOnUiThread(new Runnable(){

                    @Override
                    public void run() 
                    {   
                        mRecvTextView.setText(McRecvOnBoard);
                    }
                });
            }
            
        };
        
        DJIDrone.getDjiMC().setExternalDeviceRecvDataCallBack(mExtDevReceiveDataCallBack);
        
        mMcuErrorCallBack = new DJIMcuErrorCallBack(){

            @Override
            public void onError(DJIMcErrorType error) {
                // TODO Auto-generated method stub
                StringBuffer sb = new StringBuffer();   
                sb.append(getString(R.string.main_controller_error)).append("\n");
                sb.append(getErrorDescriptionByErrorCode(error));

                McErrorString = sb.toString();
  
                MainControllerDemoActivity.this.runOnUiThread(new Runnable(){

                    @Override
                    public void run() 
                    {   
                        mMainControllerErrorBtn.setText(McErrorString);
                    }
                });
            }
            
        };
        
        DJIDrone.getDjiMC().setMcuUpdateStateCallBack(mMcuUpdateStateCallBack);
        DJIDrone.getDjiMC().setMcuErrorCallBack(mMcuErrorCallBack);
        
        if(DJIDrone.getDroneType() != DJIDroneType.DJIDrone_M100){
            mMCOnBoardRecvScrollView.setVisibility(View.GONE);
            mSendOnBoardBtn.setVisibility(View.GONE);
            mSendOnBoardEdit.setVisibility(View.GONE);
        } 
        
        if(DJIDrone.getDroneType() == DJIDroneType.DJIDrone_Vision){
            mGetAircraftSn.setVisibility(View.GONE);
            mGetFirmwareVersion.setVisibility(View.GONE);
            mStopCompassCalibrationBtn.setVisibility(View.GONE);
        }
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        mDjiGLSurfaceView.resume();
        
        mTimer = new Timer();
        Task task = new Task();
        mTimer.schedule(task, 0, 500);        
        
        DJIDrone.getDjiMC().startUpdateTimer(1000);
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
        
        DJIDrone.getDjiMC().stopUpdateTimer();
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

}
