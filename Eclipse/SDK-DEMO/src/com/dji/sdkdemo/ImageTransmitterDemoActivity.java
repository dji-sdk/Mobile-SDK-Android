package com.dji.sdkdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import com.dji.sdkdemo.CameraProtocolDemoActivity.pickerValueChangeListener;
import com.dji.sdkdemo.widget.PopupNumberPicker;

import dji.sdk.api.DJIDrone;
import dji.sdk.api.DJIError;
import dji.sdk.api.Camera.DJICameraDecodeTypeDef.DecoderType;
import dji.sdk.api.Camera.DJICameraSettingsTypeDef.CameraMode;
import dji.sdk.api.Camera.DJICameraSettingsTypeDef.CameraVisionType;
import dji.sdk.api.ImageTransmitter.DJIImageTransmitterChannelInfo;
import dji.sdk.api.ImageTransmitter.DJIImageTransmitterRadioSignalQuality;
import dji.sdk.api.ImageTransmitter.DJIImageTransmitterTypeDef.DJIImageTransmitterBandwidth;
import dji.sdk.api.MainController.DJIMainControllerSystemState;
import dji.sdk.api.MainController.DJIMainControllerTypeDef.DJIMcErrorType;
import dji.sdk.interfaces.DJIExecuteResultCallback;
import dji.sdk.interfaces.DJIExecuteStringResultCallback;
import dji.sdk.interfaces.DJIImageTransmitterBandwidthCallback;
import dji.sdk.interfaces.DJIImageTransmitterChannelInfoCallback;
import dji.sdk.interfaces.DJIImageTransmitterChannelPowerCallback;
import dji.sdk.interfaces.DJIImageTransmitterDoubleOutputStateCallback;
import dji.sdk.interfaces.DJIImageTransmitterRadioSignalQualityCallback;
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
import android.widget.TextView;
import android.widget.Toast;


public class ImageTransmitterDemoActivity extends DemoBaseActivity implements OnClickListener{
    private static final String TAG = "ImageTransmitterDemoActivity";
    
    private TextView mConnectStateTextView;

    private DjiGLSurfaceView mDjiGLSurfaceView;
    private DJIReceivedVideoDataCallBack mReceivedVideoDataCallBack  = null;    
    
    private Timer mTimer;
    
    private TextView mUplinkRadioSignalTV;
    private TextView mDownlinkRadioSignalTV;
    private TextView mFrequencyPowerTV;
    
    private Button m_set_it_fq_update_btn;
    private Button m_set_it_channel_btn;
    private Button m_set_it_auto_channel_btn;
    private Button m_get_it_channel_btn;
    private Button m_set_it_bandwidth_btn;
    private Button m_get_it_bandwidth_btn;
    private Button m_set_it_doubleouput_btn;
    private Button m_get_it_doubleouput_btn;
    private Button m_get_it_firmware_version_btn;
    
    private Context m_context;
    private PopupNumberPicker mPopupNumberPicker = null;
    
    private DJIImageTransmitterRadioSignalQualityCallback mUplinkCb = null;
    private DJIImageTransmitterRadioSignalQualityCallback mDownlinkCb = null;
    private DJIImageTransmitterChannelPowerCallback mPowerCb = null;
    
    private String mUplinkResult = "";
    private String mDownlinkResult = "";
    private String mPowerResult = "";
    private boolean isPause = false;
    
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
        
        ImageTransmitterDemoActivity.this.runOnUiThread(new Runnable(){

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
        Toast.makeText(ImageTransmitterDemoActivity.this, result, Toast.LENGTH_SHORT).show();
    }
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_transmitter_controller_demo);

        DJIDrone.getDjiCamera().setDecodeType(DecoderType.Software);
        
        mDjiGLSurfaceView = (DjiGLSurfaceView)findViewById(R.id.DjiSurfaceView_It);
        mConnectStateTextView = (TextView)findViewById(R.id.ConnectStateItTextView);
 
        mUplinkRadioSignalTV = (TextView)findViewById(R.id.UplinkRadioSignalTV);
        mDownlinkRadioSignalTV = (TextView)findViewById(R.id.DownlinkRadioSignalTV);
        mFrequencyPowerTV = (TextView)findViewById(R.id.FrequencyPowerTV);
        
        m_set_it_fq_update_btn = (Button)findViewById(R.id.set_it_fq_update_btn);
        m_set_it_channel_btn = (Button)findViewById(R.id.set_it_channel_btn);
        m_set_it_auto_channel_btn = (Button)findViewById(R.id.set_it_auto_channel_btn);
        m_get_it_channel_btn = (Button)findViewById(R.id.get_it_channel_btn);
        m_set_it_bandwidth_btn = (Button)findViewById(R.id.set_it_bandwidth_btn);
        m_get_it_bandwidth_btn = (Button)findViewById(R.id.get_it_bandwidth_btn);
        m_set_it_doubleouput_btn = (Button)findViewById(R.id.set_it_doubleouput_btn);
        m_get_it_doubleouput_btn = (Button)findViewById(R.id.get_it_doubleouput_btn);
        m_get_it_firmware_version_btn = (Button)findViewById(R.id.get_version_btn);

        m_set_it_fq_update_btn.setOnClickListener(this);
        m_set_it_channel_btn.setOnClickListener(this);
        m_set_it_auto_channel_btn.setOnClickListener(this);
        m_get_it_channel_btn.setOnClickListener(this);
        m_set_it_bandwidth_btn.setOnClickListener(this);
        m_get_it_bandwidth_btn.setOnClickListener(this);
        m_set_it_doubleouput_btn.setOnClickListener(this);
        m_get_it_doubleouput_btn.setOnClickListener(this);
        m_get_it_firmware_version_btn.setOnClickListener(this);
        
        m_context = this.getApplicationContext();
        
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
        
        mUplinkCb = new DJIImageTransmitterRadioSignalQualityCallback() {
            
            @Override
            public void onResult(
                    DJIImageTransmitterRadioSignalQuality mRadioSignalQuality)
            {
                // TODO Auto-generated method stub

                mUplinkResult = "Percent = "+mRadioSignalQuality.mPercent;
                        
                ImageTransmitterDemoActivity.this.runOnUiThread(new Runnable(){

                    @Override
                    public void run() 
                    {   
                        mUplinkRadioSignalTV.setText(mUplinkResult);
                    }
                });
            }
        };
        
        mDownlinkCb = new DJIImageTransmitterRadioSignalQualityCallback() {
            
            @Override
            public void onResult(
                    DJIImageTransmitterRadioSignalQuality mRadioSignalQuality)
            {
                // TODO Auto-generated method stub
                mDownlinkResult = "Percent = "+mRadioSignalQuality.mPercent;
                
                ImageTransmitterDemoActivity.this.runOnUiThread(new Runnable(){

                    @Override
                    public void run() 
                    {   
                        mDownlinkRadioSignalTV.setText(mDownlinkResult);
                    }
                });
            }
        };
        
        mPowerCb = new DJIImageTransmitterChannelPowerCallback() {
            
            @Override
            public void onResult(int[] mFrequency, int size)
            {
                // TODO Auto-generated method stub
                mPowerResult = "size = "+size + "\n";
                for(int i = 0 ; i < size; i++){
                    mPowerResult = mPowerResult + i +" = "+ mFrequency[i];
                    mPowerResult = mPowerResult + "\n";
                }
                
                ImageTransmitterDemoActivity.this.runOnUiThread(new Runnable(){

                    @Override
                    public void run() 
                    {   
                        mFrequencyPowerTV.setText(mPowerResult);
                    }
                });
            }
        };
        
        DJIDrone.getDjiImageTransmitter().setImageTransmitterUplinkRadioSignalQualityCallback(mUplinkCb);
        DJIDrone.getDjiImageTransmitter().setImageTransmitterDownlinkRadioSignalQualityCallback(mDownlinkCb);
        DJIDrone.getDjiImageTransmitter().setImageTransmitterChannelPowerCallback(mPowerCb);
    
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        mDjiGLSurfaceView.resume();
        
        mTimer = new Timer();
        Task task = new Task();
        mTimer.schedule(task, 0, 500);        
        
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
        if(DJIDrone.getDjiImageTransmitter() != null){
            DJIDrone.getDjiImageTransmitter().setImageTransmitterUplinkRadioSignalQualityCallback(null);
            DJIDrone.getDjiImageTransmitter().setImageTransmitterDownlinkRadioSignalQualityCallback(null);
            DJIDrone.getDjiImageTransmitter().setImageTransmitterChannelPowerCallback(null);
        }
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


    @Override
    public void onClick(View view)
    {
        // TODO Auto-generated method stub
        List<String> strlist = null;
        
        switch (view.getId())
        {
            case R.id.set_it_fq_update_btn:
                
                strlist = new ArrayList<String>();    
                
                strlist.add("false");
                strlist.add("true");
                
                mPopupNumberPicker = new PopupNumberPicker(m_context,
                        strlist,
                        new pickerValueChangeListener(){

                            @Override
                            public void onValueChange(int pos1, int pos2) {
                                //Log.d(TAG,"pos1 = "+ pos1 +", pos2 = "+pos2);
                                mPopupNumberPicker.dismiss();
                                mPopupNumberPicker = null;
                                
                                boolean isNeed = false;
                                
                                if(pos1 == 1){
                                    DJIDrone.getDjiImageTransmitter().startNeedChannelPowerUpdates(new DJIExecuteResultCallback(){

                                        @Override
                                        public void onResult(DJIError mErr)
                                        {
                                            // TODO Auto-generated method stub
                                            Log.d(TAG, "setNeedFrequencyPowerUpdates errorCode = "+ mErr.errorCode);
                                            Log.d(TAG, "setNeedFrequencyPowerUpdates errorDescription = "+ mErr.errorDescription);
                                            String result = "setNeedFrequencyPowerUpdates errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                                            handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                        }
                                        
                                    });
                                } else {
                                    DJIDrone.getDjiImageTransmitter().stopNeedChannelPowerUpdates(new DJIExecuteResultCallback(){

                                        @Override
                                        public void onResult(DJIError mErr)
                                        {
                                            // TODO Auto-generated method stub
                                            Log.d(TAG, "setNeedFrequencyPowerUpdates errorCode = "+ mErr.errorCode);
                                            Log.d(TAG, "setNeedFrequencyPowerUpdates errorDescription = "+ mErr.errorDescription);
                                            String result = "setNeedFrequencyPowerUpdates errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                                            handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                        }
                                        
                                    });
                                }
                                
                                

                            }}, 250,
                        200, 0);
                
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                
                break;
            case R.id.set_it_channel_btn:
                
                strlist = new ArrayList<String>();    
                
                for(int i = 0; i < 32 ; i++){
                    strlist.add(""+i);
                }
                
                mPopupNumberPicker = new PopupNumberPicker(m_context,
                        strlist,
                        new pickerValueChangeListener(){

                            @Override
                            public void onValueChange(int pos1, int pos2) {
                                //Log.d(TAG,"pos1 = "+ pos1 +", pos2 = "+pos2);
                                mPopupNumberPicker.dismiss();
                                mPopupNumberPicker = null;
                                
                                DJIDrone.getDjiImageTransmitter().setImageTransmitterChannel(pos1, new DJIExecuteResultCallback() {
                                    
                                    @Override
                                    public void onResult(DJIError mErr)
                                    {
                                        // TODO Auto-generated method stub
                                        Log.d(TAG, "setImageTransmitterChannel errorCode = "+ mErr.errorCode);
                                        Log.d(TAG, "setImageTransmitterChannel errorDescription = "+ mErr.errorDescription);
                                        String result = "setImageTransmitterChannel errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                    }
                                });

                            }}, 250,
                        200, 0);
                
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                
                break;
            case R.id.set_it_auto_channel_btn:
                
                DJIDrone.getDjiImageTransmitter().setImageTransmitterChannelAutoSelect(new DJIExecuteResultCallback() {
                    
                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "setImageTransmitterChannelAuto errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "setImageTransmitterChannelAuto errorDescription = "+ mErr.errorDescription);
                        String result = "setImageTransmitterChannelAuto errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                    }
                });
                
                break;
            case R.id.get_it_channel_btn:
                
                DJIDrone.getDjiImageTransmitter().getImageTransmitterChannel(new DJIImageTransmitterChannelInfoCallback() {
                    
                    @Override
                    public void onResult(DJIImageTransmitterChannelInfo mChannelInfo,
                            DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "getImageTransmitterChannel errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "getImageTransmitterChannel errorDescription = "+ mErr.errorDescription);
                        String result = "getImageTransmitterChannel errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode)+"\n"+
                        "channel = "+mChannelInfo.channel+ " isAuto="+ mChannelInfo.isAuto;
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                    }
                });
                
                break;
            case R.id.set_it_bandwidth_btn:
                strlist = new ArrayList<String>();    
                
                strlist.add("4Mbps");
                strlist.add("6Mbps");
                strlist.add("8Mbps");
                strlist.add("10Mbps");
                
                mPopupNumberPicker = new PopupNumberPicker(m_context,
                        strlist,
                        new pickerValueChangeListener(){

                            @Override
                            public void onValueChange(int pos1, int pos2) {
                                //Log.d(TAG,"pos1 = "+ pos1 +", pos2 = "+pos2);
                                mPopupNumberPicker.dismiss();
                                mPopupNumberPicker = null;
                                
                                DJIImageTransmitterBandwidth mBw = DJIImageTransmitterBandwidth.ImageTransmitter_Bandwidth_Unknown;
                                if(pos1 == 0){
                                    mBw = DJIImageTransmitterBandwidth.ImageTransmitter_Bandwidth_4Mbps;
                                }
                                else if(pos1 == 1){
                                    mBw = DJIImageTransmitterBandwidth.ImageTransmitter_Bandwidth_6Mbps;
                                }
                                else if(pos1 == 2){
                                    mBw = DJIImageTransmitterBandwidth.ImageTransmitter_Bandwidth_8Mbps;
                                }
                                else if(pos1 == 3){
                                    mBw = DJIImageTransmitterBandwidth.ImageTransmitter_Bandwidth_10Mbps;
                                }
                                
                                DJIDrone.getDjiImageTransmitter().setImageTransmitterBandWidth(mBw, new DJIExecuteResultCallback() {
                                    
                                    @Override
                                    public void onResult(DJIError mErr)
                                    {
                                        // TODO Auto-generated method stub
                                        Log.d(TAG, "setImageTransmitterBandWidth errorCode = "+ mErr.errorCode);
                                        Log.d(TAG, "setImageTransmitterBandWidth errorDescription = "+ mErr.errorDescription);
                                        String result = "setImageTransmitterBandWidth errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                    }
                                });

                            }}, 250,
                        200, 0);
                
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                
                
                break;
            case R.id.get_it_bandwidth_btn:
                DJIDrone.getDjiImageTransmitter().getImageTransmitterBandwidth(new DJIImageTransmitterBandwidthCallback() {
                    
                    @Override
                    public void onResult(DJIImageTransmitterBandwidth mBandwidth, DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "getImageTransmitterBandwidth errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "getImageTransmitterBandwidth errorDescription = "+ mErr.errorDescription);
                        String result = "getImageTransmitterBandwidth errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode)+"\n"+
                        "bandwidth = "+mBandwidth.toString();
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                    }
                });
                break;
            case R.id.set_it_doubleouput_btn:
                
                strlist = new ArrayList<String>();    
                
                strlist.add("false");
                strlist.add("true");
                
                mPopupNumberPicker = new PopupNumberPicker(m_context,
                        strlist,
                        new pickerValueChangeListener(){

                            @Override
                            public void onValueChange(int pos1, int pos2) {
                                //Log.d(TAG,"pos1 = "+ pos1 +", pos2 = "+pos2);
                                mPopupNumberPicker.dismiss();
                                mPopupNumberPicker = null;
                                
                                boolean isDouble = false;
                                
                                if(pos1 == 1){
                                    isDouble = true;
                                }
                                
                                DJIDrone.getDjiImageTransmitter().setImageTransmitterDoubleOutput(isDouble, new DJIExecuteResultCallback(){

                                    @Override
                                    public void onResult(DJIError mErr)
                                    {
                                        // TODO Auto-generated method stub
                                        Log.d(TAG, "setImageTransmitterDoubleOutput errorCode = "+ mErr.errorCode);
                                        Log.d(TAG, "setImageTransmitterDoubleOutput errorDescription = "+ mErr.errorDescription);
                                        String result = "setImageTransmitterDoubleOutput errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                    }
                                    
                                });

                            }}, 250,
                        200, 0);
                
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                
                break;
            case R.id.get_it_doubleouput_btn:
                DJIDrone.getDjiImageTransmitter().getImageTransmitterDoubleOutput(new DJIImageTransmitterDoubleOutputStateCallback() {
                    
                    @Override
                    public void onResult(boolean mState, DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "getImageTransmitterDoubleOutput errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "getImageTransmitterDoubleOutput errorDescription = "+ mErr.errorDescription);
                        String result = "getImageTransmitterDoubleOutput errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode)+"\n"+
                        "mState = "+mState;
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                    }
                });

                break;
                
            case R.id.get_version_btn:
                DJIDrone.getDjiImageTransmitter().getFirmwareVersion(new DJIExecuteStringResultCallback(){

                    @Override
                    public void onResult(String result)
                    {
                        // TODO Auto-generated method stub
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST,  "Firmware version = "+result));
                    }
                    
                });
                break;
                
            default:
                break;
        }

    }

}
