package com.dji.sdkdemo;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;
import dji.sdk.api.DJIDrone;
import dji.sdk.api.DJIError;
import dji.sdk.api.DJIDroneTypeDef.DJIDroneType;
import dji.sdk.api.Camera.DJICameraDecodeTypeDef.DecoderType;
import dji.sdk.api.Camera.DJICameraSettingsTypeDef.CameraPreviewResolutionType;
import dji.sdk.api.Camera.DJICameraSettingsTypeDef.CameraVideoFrameRate;
import dji.sdk.api.Camera.DJICameraSettingsTypeDef.CameraVideoResolution;
import dji.sdk.interfaces.DJIExecuteResultCallback;
import dji.sdk.interfaces.DJIReceivedVideoDataCallBack;
import dji.sdk.interfaces.DJIReceivedVideoFrameCallBack;
import dji.sdk.widget.DjiGLSurfaceView;

public class GetVideoFrameDataOnlyDemoActivity extends DemoBaseActivity
{

    private static final String TAG = "GetVideoFrameDataOnlyDemoActivity";
    
    private DJIReceivedVideoDataCallBack mReceivedVideoDataCallBack = null;
    private DJIReceivedVideoFrameCallBack mReceivedVideoFrameCallBack = null;
    
    private TextView mConnectStateTextView;
    private Timer mTimer;
    
    private boolean recvFrameData = false;
    
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
        
        GetVideoFrameDataOnlyDemoActivity.this.runOnUiThread(new Runnable(){

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
                    
                    if(recvFrameData){
                        mConnectStateTextView.setTextColor(GetVideoFrameDataOnlyDemoActivity.this.getResources().getColor(R.color.blue));
                    }
                    else{
                        mConnectStateTextView.setTextColor(GetVideoFrameDataOnlyDemoActivity.this.getResources().getColor(R.color.red));
                    }
                }
            }
        });
        
    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_video_frame_demo);
        
        DJIDrone.getDjiCamera().setDecodeType(DecoderType.Software);
        DJIDrone.getDjiCamera().startSoftwareDecode();
        
        mReceivedVideoFrameCallBack = new DJIReceivedVideoFrameCallBack(){

            @Override
            public void onResult(byte[] frameBuffer, int size)
            {
                // TODO Auto-generated method stub
                Log.d(TAG,"Recieve video frame data ,size ="+size);
                recvFrameData = true;
            }
            
        };
        DJIDrone.getDjiCamera().setReceivedVideoFrameDataCallBack(mReceivedVideoFrameCallBack);

        mReceivedVideoDataCallBack = new DJIReceivedVideoDataCallBack(){

            @Override
            public void onResult(byte[] videoBuffer, int size)
            {
                //recvData = true;
                DJIDrone.getDjiCamera().sendDataToDecoder(videoBuffer,size);
            }

        };
        
        DJIDrone.getDjiCamera().setReceivedVideoDataCallBack(mReceivedVideoDataCallBack);
        
        mConnectStateTextView = (TextView)findViewById(R.id.ConnectStatePreviewTextView);
        
    }
    
    @Override
    protected void onResume()
    {
        // TODO Auto-generated method stub
        
        mTimer = new Timer();
        Task task = new Task();
        mTimer.schedule(task, 0, 500);
        
        super.onResume();
    }
    
    @Override
    protected void onPause()
    {
        // TODO Auto-generated method stub
        if(mTimer!=null) {            
            mTimer.cancel();
            mTimer.purge();
            mTimer = null;
        }
        
        super.onPause();
    }
    
    @Override
    protected void onStop()
    {
        // TODO Auto-generated method stub
        
        super.onStop();
    }

    @Override
    protected void onDestroy()
    {
        // TODO Auto-generated method stub
        try
        {
            DJIDrone.getDjiCamera().setReceivedVideoFrameDataCallBack(null);
            DJIDrone.getDjiCamera().setReceivedVideoDataCallBack(null);
            DJIDrone.getDjiCamera().stopSoftwareDecode();
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
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


}
