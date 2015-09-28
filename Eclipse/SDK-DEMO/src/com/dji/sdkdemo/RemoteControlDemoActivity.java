package com.dji.sdkdemo;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import com.dji.sdkdemo.CameraProtocolDemoActivity.pickerValueChangeListener;
import com.dji.sdkdemo.widget.PopupNumberPicker;

import dji.sdk.api.DJIDrone;
import dji.sdk.api.DJIError;
import dji.sdk.api.Camera.DJICameraDecodeTypeDef.DecoderType;
import dji.sdk.api.RemoteController.DJIRemoteControllerAttitude;
import dji.sdk.api.RemoteController.DJIRemoteControllerChannelParams;
import dji.sdk.api.RemoteController.DJIRemoteControllerCustomerPreference;
import dji.sdk.api.RemoteController.DJIRemoteControllerMasterInfo;
import dji.sdk.api.RemoteController.DJIRemoteControllerPermission;
import dji.sdk.api.RemoteController.DJIRemoteControllerSlaveControlMode;
import dji.sdk.api.RemoteController.DJIRemoteControllerSlaveInfo;
import dji.sdk.api.RemoteController.DJIRemoteControllerTypeDef.DJIRemoteControllerCalibrationStatus;
import dji.sdk.api.RemoteController.DJIRemoteControllerTypeDef.DJIRemoteControllerControlMode;
import dji.sdk.api.RemoteController.DJIRemoteControllerTypeDef.DJIRemoteControllerType;
import dji.sdk.interfaces.DJIExecuteBooleanResultCallback;
import dji.sdk.interfaces.DJIExecuteIntResultCallback;
import dji.sdk.interfaces.DJIExecuteResultCallback;
import dji.sdk.interfaces.DJIExecuteStringResultCallback;
import dji.sdk.interfaces.DJIReceivedVideoDataCallBack;
import dji.sdk.interfaces.DJIRemoteControllerCalibrationStatusCallBack;
import dji.sdk.interfaces.DJIRemoteControllerCustomerButtonFunctionCallBack;
import dji.sdk.interfaces.DJIRemoteControllerGetChannelParamsCallBack;
import dji.sdk.interfaces.DJIRemoteControllerGimbalSpeedCallBack;
import dji.sdk.interfaces.DJIRemoteControllerMasterInfoCallBack;
import dji.sdk.interfaces.DJIRemoteControllerMasterModeCallBack;
import dji.sdk.interfaces.DJIRemoteControllerModeCallBack;
import dji.sdk.interfaces.DJIRemoteControllerPermissionCallBack;
import dji.sdk.interfaces.DJIRemoteControllerSearchMastersCallBack;
import dji.sdk.interfaces.DJIRemoteControllerSlaveInfoListCallBack;
import dji.sdk.interfaces.DJIRemoteControllerSlaveModeCallBack;
import dji.sdk.interfaces.DJIRemoteControllerUpdateAttitudeCallBack;
import dji.sdk.widget.DjiGLSurfaceView;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RemoteControlDemoActivity extends DemoBaseActivity implements OnClickListener{
    private static final String TAG = "RemoteControllerDemoActivity";
    private static final int SHOWTOAST = 1;
    
    private TextView mConnectStateTextView;
    private TextView mRemoteControllerInfoTextView;
    private TextView showTV;
    
    private EditText mIDEditText;
    private EditText mPwdEditText;
    private EditText mNameEditText;
    
    private Button mGetChannelParamsBtn;
    private Button mSetChannelParamsBtn;
    private Button mSetCalibrationBtn;
    private Button mGetHardwareParamsBtn;
    private Button mSetMasterModeBtn;
    private Button mGetMasterModeBtn;
    private Button mSetMasterNameBtn;
    private Button mGetMasterNameBtn;
    private Button mSetPasswordBtn;
    private Button mGetPasswordBtn;
    private Button mSetControlMasterBtn;
    private Button mGetControlMasterBtn;
    private Button mSetSearchModeBtn;
    private Button mSetToggleBtn;
    private Button mGetToggleBtn;
    private Button mStartSearchMaster;
    private Button mStopSearchMaster;
    private Button mGetSlaveListBtn;
    private Button mSetSlavePermissionBtn;
    private Button mGetSlavePermissionBtn;
    private Button mSetControlModeBtn;
    private Button mGetControlModeBtn;
    private Button mGetGimbalPermission;
    private Button mSetSlaveModeBtn;
    private Button mGetSlaveModeBtn;
    private Button mSetGimbalSpeedBtn;
    private Button mGetGimbalSpeedBtn;
    private Button mSetCustomFunctionBtn;
    private Button mGetCustomFunctionBtn;
    private Button mSetFrequencyBtn;
    private Button mStopFrequencyBtn;
    private Button mSetWheelSensitivityBtn;
    private Button mGetWheelSensitivityBtn;
    private Button mRemoteControllerAttitudeBtn;
    private Button mGetFirmwareVersion;
    
    private DjiGLSurfaceView mDjiGLSurfaceView;
    
    private DJIReceivedVideoDataCallBack mReceivedVideoDataCallBack;
    private DJIRemoteControllerUpdateAttitudeCallBack mRemoteControllerUpdateAttitudeCallBack;
    
    private DJIRemoteControllerAttitude attitude;
    
    private StringBuffer stringBuffer;
    private StringBuffer str;
    
    private Context m_context;
    
    private Timer mTimer;
    private Timer updateTimer;
    
    private PopupNumberPicker mPopupNumberPicker = null;  
    
    private View attitudeShowView;
    
    private AlertDialog.Builder builder;
    
    private Handler updateHandler;
        
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
        
        RemoteControlDemoActivity.this.runOnUiThread(new Runnable(){

            @Override
            public void run() 
            {   
                if(DJIDrone.getDjiCamera() != null){
                    boolean bConnectState = DJIDrone.getDjiCamera().getCameraConnectIsOk();
                    if(bConnectState){
                        mConnectStateTextView.setText(R.string.camera_connection_ok);
                        mRemoteControllerInfoTextView.setText(stringBuffer.toString());
                    }
                    else{
                        mConnectStateTextView.setText(R.string.camera_connection_break);
                        mRemoteControllerInfoTextView.setText(stringBuffer.toString());
                    }
                }
            }
        });
        
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remote_control_protocol_demo);
        
        DJIDrone.getDjiCamera().setDecodeType(DecoderType.Software);
        
        mGetChannelParamsBtn = (Button) findViewById(R.id.GetChannelParamsBtn);
        mSetChannelParamsBtn = (Button) findViewById(R.id.SetChannelParamsBtn);
        mSetCalibrationBtn = (Button) findViewById(R.id.SetCalibrationBtn);
        mGetHardwareParamsBtn = (Button) findViewById(R.id.GetHardwareParamsBtn);
        mSetMasterModeBtn = (Button) findViewById(R.id.SetMasterModeBtn);
        mGetMasterModeBtn = (Button) findViewById(R.id.GetMasterModeBtn);
        mSetMasterNameBtn = (Button) findViewById(R.id.SetMasterNameBtn);
        mGetMasterNameBtn = (Button) findViewById(R.id.GetMasterNameBtn);
        mSetPasswordBtn = (Button) findViewById(R.id.SetPasswordBtn);
        mGetPasswordBtn = (Button) findViewById(R.id.GetPasswordBtn);
        mSetControlMasterBtn = (Button) findViewById(R.id.SetControlMasterBtn);
        mGetControlMasterBtn = (Button) findViewById(R.id.GetControlMasterBtn);
        mSetSearchModeBtn = (Button) findViewById(R.id.SetSearchModeBtn);
        mSetToggleBtn = (Button) findViewById(R.id.SetToggleBtn);
        mGetToggleBtn = (Button) findViewById(R.id.GetToggleBtn);
        mStartSearchMaster = (Button) findViewById(R.id.StartSearchMaster);
        mStopSearchMaster = (Button) findViewById(R.id.StopSearchMaster);
        mGetSlaveListBtn = (Button) findViewById(R.id.GetSlaveListBtn);
        mSetSlavePermissionBtn = (Button) findViewById(R.id.SetSlavePermissionBtn);
        mGetSlavePermissionBtn = (Button) findViewById(R.id.GetSlavePermissionBtn);
        mSetControlModeBtn = (Button) findViewById(R.id.SetControlModeBtn);
        mGetControlModeBtn = (Button) findViewById(R.id.GetControlModeBtn);
        mGetGimbalPermission = (Button) findViewById(R.id.GetGimbalPermission);
        mSetSlaveModeBtn = (Button) findViewById(R.id.SetSlaveModeBtn);
        mGetSlaveModeBtn = (Button) findViewById(R.id.GetSlaveModeBtn);
        mSetGimbalSpeedBtn = (Button) findViewById(R.id.SetGimbalSpeedBtn);
        mGetGimbalSpeedBtn = (Button) findViewById(R.id.GetGimbalSpeedBtn);
        mSetCustomFunctionBtn = (Button) findViewById(R.id.SetCustomFunctionBtn);
        mGetCustomFunctionBtn = (Button) findViewById(R.id.GetCustomFunctionBtn);
        mSetFrequencyBtn = (Button) findViewById(R.id.SetFrequencyBtn);
        mStopFrequencyBtn = (Button) findViewById(R.id.StopFrequencyBtn);
        mSetWheelSensitivityBtn = (Button) findViewById(R.id.SetWheelSensitivityBtn);
        mGetWheelSensitivityBtn = (Button) findViewById(R.id.GetWheelSensitivityBtn);
        mRemoteControllerAttitudeBtn = (Button) findViewById(R.id.RemoteControlAttitudeBtn);
        mGetFirmwareVersion = (Button) findViewById(R.id.get_version_btn);
        
        
        mDjiGLSurfaceView = (DjiGLSurfaceView) findViewById(R.id.DjiSurfaceView);
        
        mRemoteControllerInfoTextView = (TextView) findViewById(R.id.RemoteControlInfo);
        mConnectStateTextView = (TextView) findViewById(R.id.ConnectStateRemoteControlTextView);
        
        mIDEditText = (EditText) findViewById(R.id.IdInputEditView);
        mPwdEditText = (EditText) findViewById(R.id.PwdInputEditView);
        mNameEditText = (EditText) findViewById(R.id.NameInputEditView);
        
        mGetChannelParamsBtn.setOnClickListener(this);
        mSetChannelParamsBtn.setOnClickListener(this);
        mSetCalibrationBtn.setOnClickListener(this);
        mGetHardwareParamsBtn.setOnClickListener(this);
        mSetMasterModeBtn.setOnClickListener(this);
        mGetMasterModeBtn.setOnClickListener(this);
        mSetMasterNameBtn.setOnClickListener(this);
        mGetMasterNameBtn.setOnClickListener(this);
        mSetPasswordBtn.setOnClickListener(this);
        mGetPasswordBtn.setOnClickListener(this);
        mSetControlMasterBtn.setOnClickListener(this);
        mGetControlMasterBtn.setOnClickListener(this);
        mSetSearchModeBtn.setOnClickListener(this);
        mSetToggleBtn.setOnClickListener(this);
        mGetToggleBtn.setOnClickListener(this);
        mStartSearchMaster.setOnClickListener(this);
        mStopSearchMaster.setOnClickListener(this);
        mGetSlaveListBtn.setOnClickListener(this);
        mSetSlavePermissionBtn.setOnClickListener(this);
        mGetSlavePermissionBtn.setOnClickListener(this);
        mSetControlModeBtn.setOnClickListener(this);
        mGetControlModeBtn.setOnClickListener(this);
        mGetGimbalPermission.setOnClickListener(this);
        mSetSlaveModeBtn.setOnClickListener(this);
        mGetSlaveModeBtn.setOnClickListener(this);
        mSetGimbalSpeedBtn.setOnClickListener(this);
        mGetGimbalSpeedBtn.setOnClickListener(this);
        mSetCustomFunctionBtn.setOnClickListener(this);
        mGetCustomFunctionBtn.setOnClickListener(this);
        mSetFrequencyBtn.setOnClickListener(this);
        mStopFrequencyBtn.setOnClickListener(this);
        mSetWheelSensitivityBtn.setOnClickListener(this);
        mGetWheelSensitivityBtn.setOnClickListener(this);
        mRemoteControllerAttitudeBtn.setOnClickListener(this);
        mGetFirmwareVersion.setOnClickListener(this);
        
        mDjiGLSurfaceView.start();
        
        mReceivedVideoDataCallBack = new DJIReceivedVideoDataCallBack(){

            @Override
            public void onResult(byte[] videoBuffer, int size)
            {
                // TODO Auto-generated method stub
                mDjiGLSurfaceView.setDataToDecoder(videoBuffer, size);
            }

        };
        
        stringBuffer = new StringBuffer();
        str = new StringBuffer();
        
        DJIDrone.getDjiCamera().setReceivedVideoDataCallBack(mReceivedVideoDataCallBack);
        
        mRemoteControllerUpdateAttitudeCallBack = new DJIRemoteControllerUpdateAttitudeCallBack() {
            
            @Override
            public void onResult(DJIRemoteControllerAttitude status) {
                attitude = status;
                Log.v("Inspire", "Update");
                if (str.length() != 0)
                    str.delete(0, str.length() - 1);
                str.append("Alieron: ").append(attitude.aileron).append("\n");
                str.append("Throttle: ").append(attitude.throttle).append("\n");
                str.append("Elevator: ").append(attitude.elevator).append("\n");
                str.append("GYRO: ").append(attitude.GYRO).append("\n");
                str.append("Rudder: ").append(attitude.rudder).append("\n");
                str.append("Custom1: ").append(attitude.custom1).append("\n");
                str.append("Custom2: ").append(attitude.custom2).append("\n");
                str.append("Latitude: ").append(attitude.latitude).append("\n");
                str.append("Longitude: ").append(attitude.longitude).append("\n");
                str.append("RecordStatus: ").append(attitude.recordStatus).append("\n");
                str.append("ShutterStatus: ").append(attitude.shutterStatus).append("\n");
                str.append("PlaybackStatus: ").append(attitude.playbackStatus).append("\n");
                str.append("CoronaChange: ").append(attitude.coronaChange).append("\n");
                str.append("CoronaDirection: ").append(attitude.coronaDirection).append("\n");
                str.append("CoronaOffset: ").append(attitude.coronaOffset).append("\n");
                str.append("CoronaPush: ").append(attitude.pushCorona).append("\n");
                str.append("Foot Stool: ").append(attitude.footStool).append("\n");
                str.append("Mode: ").append(attitude.mode).append("\n");
                str.append("Go Home: ").append(attitude.goHome).append("\n");
                str.append("RemainPower: ").append(attitude.remainPower).append("\n");
                str.append("RemainPowerPercent: ").append(attitude.remainPowerPercent).append("\n");
                str.append("SatelliteCount: ").append(attitude.satelliteCount).append("\n");
                str.append("SpeedX: ").append(attitude.speedX).append("\n");
                str.append("SpeedY: ").append(attitude.speedY).append("\n");
            }
        };
        
        DJIDrone.getDjiRemoteController().setRemoteControllerUpdateAttitudeCallBack(mRemoteControllerUpdateAttitudeCallBack);
        
        m_context = this.getApplicationContext();
        
        attitude = new DJIRemoteControllerAttitude();
    }
    
    @Override
    protected void onResume() {
        
        mDjiGLSurfaceView.resume();
        
        mTimer = new Timer();
        Task task = new Task();
        mTimer.schedule(task,0, 500);
        
        DJIDrone.getDjiRemoteController().startUpdateTimer(1000);
        super.onResume();
    }
    
    @Override
    protected void onPause() {
        
        mDjiGLSurfaceView.pause();
        
        if(mTimer!=null) {            
            mTimer.cancel();
            mTimer.purge();
            mTimer = null;
        }
        
        DJIDrone.getDjiRemoteController().stopUpdateTimer();
        super.onPause();
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    
    @Override
    protected void onStop() {
        
        
        if(DJIDrone.getDjiRemoteController() != null)
        DJIDrone.getDjiRemoteController().setRemoteControllerUpdateAttitudeCallBack(null);
        mDjiGLSurfaceView.destroy();
        super.onStop();
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
        Toast.makeText(RemoteControlDemoActivity.this, result, Toast.LENGTH_SHORT).show();
    }

    /** 
     * @param v 
     * @see android.view.View.OnClickListener#onClick(android.view.View) 
     */ 	
    @Override
    public void onClick(View v)
    {
        // TODO Auto-generated method stub
        ArrayList<String> strlist;
        switch (v.getId()) {
            case R.id.GetChannelParamsBtn : {
                Log.v("Inspire", "onClick");
                DJIDrone.getDjiRemoteController().getChannelParams(new DJIRemoteControllerGetChannelParamsCallBack() {

                    @Override
                    public void onResutl(
                            ArrayList<DJIRemoteControllerChannelParams> result)
                    {
                        // TODO Auto-generated method stub
                        if (stringBuffer.length() != 0)
                            stringBuffer.delete(0, stringBuffer.length() - 1);
                        int cnt = result.size();
                        for (int i = 0; i < cnt; i++) {
                            stringBuffer.append(i + "ChannelName: " + result.get(i).name).append("\n");
                            stringBuffer.append(i + "ChannelValue: " + result.get(i).value).append("\n");
                            if (result.get(i).direction) {
                                stringBuffer.append(i + "ChannelDir: " + "forward\n\n");
                            } else {
                                stringBuffer.append(i + "ChannelDir: " + "backward\n\n");
                            }
                        }
                        String ResultsString = "Printed"+cnt;
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });
                break;
            }
            
            case R.id.SetChannelParamsBtn : {
                ArrayList<DJIRemoteControllerChannelParams> channelParams = new ArrayList<DJIRemoteControllerChannelParams>();
                for (int i = 0; i < 8; i++) {
                    DJIRemoteControllerChannelParams param = new DJIRemoteControllerChannelParams();
                    param.name = i + 100;
                    param.value = 1023;
                    param.direction = i % 2 == 0 ? true : false;
                    channelParams.add(param);
                }
                DJIDrone.getDjiRemoteController().setChannelParams(channelParams, new DJIExecuteResultCallback() {

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        String ResultsString = "return code =" + mErr.errorCode;
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });
                break;
            }
            
            case R.id.SetCalibrationBtn : {
                strlist = new ArrayList<String>();
                strlist.add(this.getString(R.string.calibration_normal));
                strlist.add(this.getString(R.string.calibration_record_middle_value));
                strlist.add(this.getString(R.string.calibration_record_extremum));
                strlist.add(this.getString(R.string.calibration_exit));
                mPopupNumberPicker = new PopupNumberPicker(m_context,
                        strlist,
                        new pickerValueChangeListener(){

                            @Override
                            public void onValueChange(int pos1, int pos2) {
                                //Log.d(TAG,"pos1 = "+ pos1 +", pos2 = "+pos2);
                                mPopupNumberPicker.dismiss();
                                mPopupNumberPicker = null;
                                
                                DJIDrone.getDjiRemoteController().SetCalibration(DJIRemoteControllerCalibrationStatus.find(pos1), 
                                        new DJIRemoteControllerCalibrationStatusCallBack() {

                                            @Override
                                            public void onReslt(
                                                    DJIRemoteControllerCalibrationStatus result)
                                            {
                                                // TODO Auto-generated method stub
                                                String ResultsString = "return code =" + result.toString();
                                                handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                                            }
                                    
                                });
                            }
                            }, 250,
                            200, 0);
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                break;
            }
            
            case R.id.GetHardwareParamsBtn : {
                DJIDrone.getDjiRemoteController().getHardwareParams(new DJIRemoteControllerGetChannelParamsCallBack(){

                    @Override
                    public void onResutl(
                            ArrayList<DJIRemoteControllerChannelParams> result)
                    {
                        // TODO Auto-generated method stub
                        if (stringBuffer.length() != 0)
                            stringBuffer.delete(0, stringBuffer.length() - 1);
                        int cnt = result.size();
                        if (cnt == 0)
                            stringBuffer.append("None Channel Exist");
                        for (int i = 0; i < cnt; i++) {
                            stringBuffer.append(i + "ChannelValue: " + result.get(i).value).append("\n");
                        }
                    }
                    
                });
                break;
            }
            
            case R.id.SetMasterModeBtn : {
                strlist = new ArrayList<String>();
                strlist.add(this.getString(R.string.master_mode_master));
                strlist.add(this.getString(R.string.master_mode_slave));
                strlist.add(this.getString(R.string.master_mode_listener));
                mPopupNumberPicker = new PopupNumberPicker(m_context,
                        strlist,
                        new pickerValueChangeListener(){

                            @Override
                            public void onValueChange(int pos1, int pos2) {
                                //Log.d(TAG,"pos1 = "+ pos1 +", pos2 = "+pos2);
                                mPopupNumberPicker.dismiss();
                                mPopupNumberPicker = null;
                                
                                DJIDrone.getDjiRemoteController().setRCWorkMode(DJIRemoteControllerType.find(pos1), new DJIExecuteResultCallback(){

                                    @Override
                                    public void onResult(DJIError mErr)
                                    {
                                        // TODO Auto-generated method stub
                                        String ResultsString = "return code =" + mErr.errorCode;
                                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                                    }
                                    
                                });
                            }
                            }, 250,
                            200, 0);
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                break;
            }
            
            case R.id.GetMasterModeBtn : {
                DJIDrone.getDjiRemoteController().getRCWorkMode(new DJIRemoteControllerMasterModeCallBack() {

                    @Override
                    public void onResult(boolean connectStatus,
                            DJIRemoteControllerType type)
                    {
                        // TODO Auto-generated method stub
                        String ResultsString = "return code =" + type.toString();
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });
                break;
            }
            
            case R.id.SetMasterNameBtn : {
                if (!TextUtils.isEmpty(mNameEditText.getText())) {
                    DJIDrone.getDjiRemoteController().setRCName(mNameEditText.getText().toString(), new DJIExecuteResultCallback() {
    
                        @Override
                        public void onResult(DJIError mErr)
                        {
                            // TODO Auto-generated method stub
                            String ResultsString = "return code =" + mErr.errorCode;
                            handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                        }
                        
                    });
                break;
                } else {
                    String ResultsString = "Information is required.";
                    handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                }
                break;
            }
            
            case R.id.GetMasterNameBtn : {
                DJIDrone.getDjiRemoteController().getRCName(new DJIExecuteStringResultCallback() {

                    @Override
                    public void onResult(String result)
                    {
                        // TODO Auto-generated method stub
                        String ResultsString = "return code =" + result;
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });
                break;
            }
            
            case R.id.SetPasswordBtn : {
                if (mPwdEditText.getText().length() == 4 ) {
                    DJIDrone.getDjiRemoteController().setRCPassword(mPwdEditText.getText().toString(), new DJIExecuteResultCallback() {
    
                        @Override
                        public void onResult(DJIError mErr)
                        {
                            // TODO Auto-generated method stub
                            String ResultsString = "return code =" + mErr.errorCode;
                            handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                        }
                        
                    });
                } else {
                    String ResultsString = "A password of 4 digits is required.";
                    handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                }
                break;
            }
            
            case R.id.GetPasswordBtn : {
                DJIDrone.getDjiRemoteController().getRCPassword(new DJIExecuteStringResultCallback() {

                    @Override
                    public void onResult(String result)
                    {
                        // TODO Auto-generated method stub
                        //show the password as 4 digits

                        String ResultsString = "return code =" + result;
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });
                break;
            }
            
            case R.id.SetControlMasterBtn : {
                if (mIDEditText.getText().length() != 0 && mPwdEditText.getText().length() != 0 && mNameEditText.getText().length() != 0) {
                    DJIRemoteControllerMasterInfo info = new DJIRemoteControllerMasterInfo(Integer.parseInt(mIDEditText.getText().toString()),
                                                                                           mNameEditText.getText().toString(), 
                                                                                           Integer.parseInt(mPwdEditText.getText().toString()), 
                                                                                           0);
                    DJIDrone.getDjiRemoteController().joinMasterWithID(info, new DJIExecuteResultCallback() {
    
                        @Override
                        public void onResult(DJIError mErr)
                        {
                            // TODO Auto-generated method stub
                            String ResultsString = "return code =" + mErr.errorDescription;
                            handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                        }
                        
                    });
                } else {
                    String ResultsString = "Information is required.";
                    handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                }
                break;
            }
            
            case R.id.GetControlMasterBtn : {
                DJIDrone.getDjiRemoteController().getJoinedMasterNameAndPassword(new DJIRemoteControllerMasterInfoCallBack() {

                    @Override
                    public void onResult(DJIRemoteControllerMasterInfo info)
                    {
                        // TODO Auto-generated method stub
                        if (0 != info.ID) {
                            String ResultsString = "id: "+info.ID + " pwd: " + info.password + " name: " + info.name;
                            handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                        } else {
                            String ResultsString = "Failure.";
                            handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                        }
                    }
                    
                });
                break;
            }
            
            case R.id.SetSearchModeBtn : {
                DJIDrone.getDjiRemoteController().getAvailableMasters(new DJIRemoteControllerSearchMastersCallBack() {

                    @Override
                    public void onResult(
                            ArrayList<DJIRemoteControllerMasterInfo> result)
                    {
                        // TODO Auto-generated method stub
                        if (stringBuffer.length() != 0)
                            stringBuffer.delete(0, stringBuffer.length() - 1);
                        int cnt = result.size();
                        for (int i = 0; i < cnt; i++) {
                            stringBuffer.append(i + "Master ID:" + result.get(i).ID).append("\n");
                            stringBuffer.append(i + "Master Name:" + result.get(i).name).append("\n");
                            stringBuffer.append(i + "Master Value:" + result.get(i).password).append("\n\n");
                        }
                        String ResultsString = "Printed"+cnt;
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });
                break;
            }
            
            case R.id.SetToggleBtn : {
                DJIDrone.getDjiRemoteController().setToggle(true, new DJIExecuteResultCallback() {

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        String ResultsString = "return code =" + mErr.errorCode;
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });
                break;
            }
            
            case R.id.GetToggleBtn : {
                DJIDrone.getDjiRemoteController().getToggle(new DJIExecuteBooleanResultCallback() {

                    @Override
                    public void onResult(boolean result)
                    {
                        // TODO Auto-generated method stub
                        String ResultsString = "return code =" + (result ? "True" : "False");
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });
                break;
            }
            
            case R.id.StartSearchMaster : {
                DJIDrone.getDjiRemoteController().startSearchMaster(new DJIExecuteResultCallback() {

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        String ResultsString = "return code =" + mErr.errorDescription;
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });
                break;
            }
            
            case R.id.StopSearchMaster : {
                DJIDrone.getDjiRemoteController().stopSearchMaster(new DJIExecuteResultCallback() {

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        String ResultsString = "return code =" + mErr.errorDescription;
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });
                break;
            }
            
            case R.id.GetSlaveListBtn : {
                DJIDrone.getDjiRemoteController().getSlaveList(new DJIRemoteControllerSlaveInfoListCallBack() {

                    @Override
                    public void onResult(
                            ArrayList<DJIRemoteControllerSlaveInfo> result)
                    {
                        // TODO Auto-generated method stub
                        if (stringBuffer.length() != 0)
                            stringBuffer.delete(0, stringBuffer.length() - 1);
                        int cnt = result.size();
                        for (int i = 0; i < cnt; i++) {
                            stringBuffer.append(i + "Slave ID:" + result.get(i).id).append("\n");
                            stringBuffer.append(i + "Slave Name:" + result.get(i).name).append("\n");
                            stringBuffer.append(i + "Slave Value:" + result.get(i).quality).append("\n");
                            stringBuffer.append(i + "Slave capture:" + (result.get(i).takephoto ? "yes" : "no")).append("\n");
                            stringBuffer.append(i + "Slave record:" + (result.get(i).record ? "yes" : "no")).append("\n");
                            stringBuffer.append(i + "Slave playback:" + (result.get(i).playback ? "yes" : "no")).append("\n");
                            stringBuffer.append(i + "Slave pitch:" + (result.get(i).pitch ? "yes" : "no")).append("\n");
                            stringBuffer.append(i + "Slave roll:" + (result.get(i).roll ? "yes" : "no")).append("\n");
                            stringBuffer.append(i + "Slave yaw:" + (result.get(i).yaw ? "yes" : "no")).append("\n");
                            stringBuffer.append(i + "Slave isOpen:" + (result.get(i).isOpen ? "yes" : "no")).append("\n");
                        }
                        String ResultsString = "Printed" + cnt;
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });
                break;
            }
            
            case R.id.SetSlavePermissionBtn : {
                if (mPwdEditText.getText().length() != 0) {
                    DJIRemoteControllerSlaveInfo info = new DJIRemoteControllerSlaveInfo();
                    info.id = Integer.parseInt(mPwdEditText.getText().toString());
                    info.takephoto = true;
                    info.record = true;
                    info.playback = true;
                    info.pitch = true;
                    info.roll = true;
                    info.yaw = true;
                    DJIDrone.getDjiRemoteController().setSlave(info, new DJIExecuteBooleanResultCallback() {
    
                        @Override
                        public void onResult(boolean result)
                        {
                            // TODO Auto-generated method stub
                            String ResultsString = "return code =" + (result ? "True" : "False");
                            handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                        }
                        
                    });
                } else {
                    String ResultsString = "Information is required.";
                    handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                }
                break;
            }
            
            case R.id.GetSlavePermissionBtn : {
                if (mPwdEditText.getText().length() != 0) {
                    DJIDrone.getDjiRemoteController().getSlaveControlPermission(Integer.parseInt(mPwdEditText.getText().toString()), new DJIRemoteControllerPermissionCallBack() {
    
                        @Override
                        public void onResult(DJIRemoteControllerPermission result)
                        {
                            // TODO Auto-generated method stub
                            if (stringBuffer.length() != 0)
                                stringBuffer.delete(0, stringBuffer.length() - 1);
                            int SLAVEID = Integer.parseInt(mPwdEditText.getText().toString());
                            stringBuffer.append(SLAVEID + " Slave ID:" + result.id).append("\n");
                            stringBuffer.append(SLAVEID + " Slave capture:" + (result.takephoto ? "yes" : "no")).append("\n");
                            stringBuffer.append(SLAVEID + " Slave record:" + (result.record ? "yes" : "no")).append("\n");
                            stringBuffer.append(SLAVEID + " Slave playback:" + (result.playback ? "yes" : "no")).append("\n");
                            stringBuffer.append(SLAVEID + " Slave pitch:" + (result.pitch ? "yes" : "no")).append("\n");
                            stringBuffer.append(SLAVEID + " Slave roll:" + (result.roll ? "yes" : "no")).append("\n");
                            stringBuffer.append(SLAVEID + " Slave yaw:" + (result.yaw ? "yes" : "no")).append("\n");
                        }
                        
                    });
                } else {
                    String ResultsString = "Information is required.";
                    handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString)); 
                }
                break;
            }
            
            case R.id.SetControlModeBtn : {
                ArrayList<DJIRemoteControllerCustomerPreference> channelTypeList = new ArrayList<DJIRemoteControllerCustomerPreference>();
                DJIDrone.getDjiRemoteController().setMasterControlMode(DJIRemoteControllerControlMode.China, channelTypeList, new DJIExecuteBooleanResultCallback() {

                    @Override
                    public void onResult(boolean result)
                    {
                        // TODO Auto-generated method stub
                        String ResultsString = "return code =" + (result ? "True" : "False");
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });
                break;
            }
            
            case R.id.GetControlModeBtn : {
                DJIDrone.getDjiRemoteController().getMasterControlMode(new DJIRemoteControllerModeCallBack() {

                    @Override
                    public void onResult(
                            DJIRemoteControllerControlMode mode,
                            ArrayList<DJIRemoteControllerCustomerPreference> channelTypeList)
                    {
                        // TODO Auto-generated method stub
                        String ResultsString = "return code =" + mode.toString();
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });
                break;
            }
            
            case R.id.GetGimbalPermission : {
                DJIDrone.getDjiRemoteController().getGimbalCtrPermission(new DJIExecuteIntResultCallback() {

                    @Override
                    public void onResult(int result)
                    {
                        // TODO Auto-generated method stub
                        String ResultsString = "return code =" + result;
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });
                break;
            }
            
            case R.id.SetSlaveModeBtn : {
                ArrayList<DJIRemoteControllerSlaveControlMode> controlModeList = new ArrayList<DJIRemoteControllerSlaveControlMode>();
                DJIDrone.getDjiRemoteController().setSlaveMode(false, controlModeList , new DJIExecuteResultCallback() {

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        String ResultsString = "return code =" + mErr.errorCode;
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });
                break;
            }
            
            case R.id.GetSlaveModeBtn : {
                DJIDrone.getDjiRemoteController().getSlaveMode(new DJIRemoteControllerSlaveModeCallBack() {

                    @Override
                    public void onResult(boolean isDefault,
                            ArrayList<DJIRemoteControllerSlaveControlMode> result)
                    {
                        // TODO Auto-generated method stub
                        String ResultsString = "isDefalut =" + (isDefault ? "True" : "False");
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });
                break;
            }
            
            case R.id.SetGimbalSpeedBtn : {
                DJIDrone.getDjiRemoteController().setGimbalControlSpeed(40, 40, 40, new DJIExecuteResultCallback() {

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        String ResultsString = "return code =" + mErr.errorCode;
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    } 
                    
                });
                break;
            }
            
            case R.id.GetGimbalSpeedBtn : {
                DJIDrone.getDjiRemoteController().getGimbalControlSpeed(new DJIRemoteControllerGimbalSpeedCallBack() {

                    @Override
                    public void onResult(int pitchSpeed, int rollSpeed,
                            int yawSpeed)
                    {
                        // TODO Auto-generated method stub
                        if (stringBuffer.length() != 0)
                            stringBuffer.delete(0, stringBuffer.length() - 1);
                        stringBuffer.append("pitch: " + pitchSpeed).append("\n");
                        stringBuffer.append("roll: " + rollSpeed).append("\n");
                        stringBuffer.append("yaw: " + yawSpeed).append("\n");
                    }
                    
                });
                break;
            }
            
            case R.id.SetCustomFunctionBtn : {
                DJIDrone.getDjiRemoteController().setCustomButtonFuction(255, 255, new DJIExecuteResultCallback() {

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        String ResultsString = "return code =" + mErr.errorCode;
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });
                break;
            }
            
            case R.id.GetCustomFunctionBtn : {
                DJIDrone.getDjiRemoteController().getCustomerButtonFunction(new DJIRemoteControllerCustomerButtonFunctionCallBack(){

                    @Override
                    public void onResult(int customer1, int customer2)
                    {
                        // TODO Auto-generated method stub
                        String ResultsString = "c1 =" + customer1 + " c2 =" + customer2;
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });
                break;
            }
            
            case R.id.SetFrequencyBtn : {
                DJIDrone.getDjiRemoteController().enterRCPairingMode(new DJIExecuteResultCallback() {

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        String ResultsString = "return code =" + mErr.errorCode;
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });
                break;
            }
            
            case R.id.StopFrequencyBtn : {
                DJIDrone.getDjiRemoteController().exitRCParingMode(new DJIExecuteResultCallback() {
                    
                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        String ResultsString = "return code =" + mErr.errorCode;
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });
            }
            
            case R.id.SetWheelSensitivityBtn : {
                DJIDrone.getDjiRemoteController().setRCControlSensitivity(25, new DJIExecuteResultCallback() {

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        String ResultsString = "return code =" + mErr.errorCode;
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });
                break;
            }
            
            case R.id.GetWheelSensitivityBtn : {
                DJIDrone.getDjiRemoteController().getRCControlSensitivity(new DJIExecuteIntResultCallback() {

                    @Override
                    public void onResult(int result)
                    {
                        // TODO Auto-generated method stub
                        String ResultsString = "return code =" + result;
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });
                break;
            }
            
            case R.id.RemoteControlAttitudeBtn : {
                LayoutInflater inflater = LayoutInflater.from(this);
                attitudeShowView = inflater.inflate(R.layout.show_view, null);
                builder = new AlertDialog.Builder(RemoteControlDemoActivity.this);        
                builder.setCancelable(true);
                builder.setTitle("CustomerParamsSetting");
                builder.setView(attitudeShowView);
                builder.setOnCancelListener(new OnCancelListener() {

                    @Override
                    public void onCancel(DialogInterface dialog)
                    {
                        // TODO Auto-generated method stub
                        if (null != updateTimer) {
                            updateTimer.cancel();
                            updateTimer.purge();
                            updateTimer = null;
                            
                            updateHandler = null;
                        }
                        
                    }
                    
                });
                if (null == updateTimer){
                    updateTimer = new Timer();
                    updateTimer.schedule(new UpdateTimerTask(), 0, 11);
                    updateHandler = new Handler();
                }
                builder.create().show();
                break;
            }

            case R.id.get_version_btn:
                DJIDrone.getDjiRemoteController().getFirmwareVersion(new DJIExecuteStringResultCallback(){

                    @Override
                    public void onResult(String result)
                    {
                        // TODO Auto-generated method stub
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST,  "Firmware version = "+result));
                    }
                    
                });
                break;

            default : 
                break;
        }
    }
    
    class UpdateTimerTask extends TimerTask {

        @Override
        public void run()
        {
            // TODO Auto-generated method stub
            showTV = (TextView)attitudeShowView.findViewById(R.id.ShowTextView);
            updateHandler.post(new Runnable() {

                @Override
                public void run()
                {
                    // TODO Auto-generated method stub
                    showTV.setText(str.toString());
                }
                
            });
            
        }
        
    }
    
    public void onReturn(View view){
        Log.d(TAG ,"onReturn");  
        this.finish();
    }
    
}
