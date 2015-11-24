
package com.dji.sdkdemo;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import dji.sdk.api.DJIDrone;
import dji.sdk.api.DJIDroneTypeDef.DJIDroneType;
import dji.sdk.api.DJIError;
import dji.sdk.api.Camera.DJICameraDecodeTypeDef.DecoderType;
import dji.sdk.api.Camera.DJICameraSettingsTypeDef.CameraVisionType;
import dji.sdk.api.Gimbal.DJIGimbalAttitude;
import dji.sdk.api.Gimbal.DJIGimbalCapacity;
import dji.sdk.api.Gimbal.DJIGimbalCustomerParamsCommand;
import dji.sdk.api.Gimbal.DJIGimbalRotation;
import dji.sdk.api.Gimbal.DJIGimbalTypeDef.CommandId;
import dji.sdk.api.Gimbal.DJIGimbalTypeDef.GimbalWorkMode;
import dji.sdk.interfaces.DJIExecuteResultCallback;
import dji.sdk.interfaces.DJIExecuteStringResultCallback;
import dji.sdk.interfaces.DJIGimbalErrorCallBack;
import dji.sdk.interfaces.DJIGimbalGetCustomerParamsCallBack;
import dji.sdk.interfaces.DJIGimbalUpdateAttitudeCallBack;
import dji.sdk.interfaces.DJIReceivedVideoDataCallBack;
import dji.sdk.widget.DjiGLSurfaceView;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class GimbalDemoActivity extends DemoBaseActivity implements OnClickListener{
    private static final String TAG = "GimbalDemoActivity";
    
    private Button mPitchUpBtn;
    private Button mPitchDownBtn;
    private Button mPitchGoBtn;
    private Button mYawLeftBtn;
    private Button mYawRightBtn;
    private Button mGimbalAttitudeBtn;
    private Button mRollUpBtn;
    private Button mRollDownBtn;
    private Button mAutoCalibrationBtn;
    private Button mStartFPV;
    private Button mRollFinetuneUpBtn;
    private Button mRollFinetuneDownBtn;
    private Button mGetFirmwareVersion;
    private Button mGetCapacity;
    
    private LinearLayout lineLayout;
    private RelativeLayout relativeLayout;
    
    private EditText mPitchGoEditText;
    
    private DjiGLSurfaceView mDjiGLSurfaceView;
    private DJIReceivedVideoDataCallBack mReceivedVideoDataCallBack;    
    private DJIGimbalErrorCallBack mGimbalErrorCallBack;
    private DJIGimbalUpdateAttitudeCallBack mGimbalUpdateAttitudeCallBack;
    private CameraVisionType type = DJIDrone.getDjiCamera().getVisionType(); 
    
    private static final int SHOWTOAST = 1;
    
    private TextView mConnectStateTextView;
    private Timer mTimer;
    private String AttiudeString = "";
    
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
        
        GimbalDemoActivity.this.runOnUiThread(new Runnable(){

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
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gimbal_demo);
        
        DJIDrone.getDjiCamera().setDecodeType(DecoderType.Software);
        
        mDjiGLSurfaceView = (DjiGLSurfaceView)findViewById(R.id.DjiSurfaceView_gimbal);
        mPitchUpBtn = (Button)findViewById(R.id.PitchUpButton);
        mPitchDownBtn = (Button)findViewById(R.id.PitchDownButton);
        mPitchGoBtn = (Button)findViewById(R.id.PitchGoButton);
        mPitchGoEditText = (EditText)findViewById(R.id.PitchGoEditText);
        mYawLeftBtn = (Button)findViewById(R.id.YawLeftButton);
        mYawRightBtn = (Button)findViewById(R.id.YawRightButton);
        mConnectStateTextView = (TextView)findViewById(R.id.ConnectStateGimbalTextView);     
        mGimbalAttitudeBtn = (Button)findViewById(R.id.AttitudeButton);
        mRollUpBtn = (Button)findViewById(R.id.RollUpButton);
        mRollDownBtn = (Button)findViewById(R.id.RollDownButton);
        mAutoCalibrationBtn = (Button)findViewById(R.id.StartGimbalAutoCalibration);
        mStartFPV = (Button)findViewById(R.id.SetFPV);
        mRollFinetuneUpBtn = (Button)findViewById(R.id.RollFinetunePlus);
        mRollFinetuneDownBtn = (Button)findViewById(R.id.RollFinetuneMinus);
        mGetFirmwareVersion = (Button)findViewById(R.id.get_version_btn);
        mGetCapacity = (Button)findViewById(R.id.get_gimbal_capacity_btn);
        
        mPitchGoBtn.setOnClickListener(this);
        mPitchGoEditText.setHint(DJIDrone.getDjiGimbal().getGimbalPitchMinAngle() + " ~ " + DJIDrone.getDjiGimbal().getGimbalPitchMaxAngle());
        mRollFinetuneUpBtn.setOnClickListener(this);
        mRollFinetuneDownBtn.setOnClickListener(this);
        mAutoCalibrationBtn.setOnClickListener(this);
        mStartFPV.setOnClickListener(this);
        mGetFirmwareVersion.setOnClickListener(this);
        mGetCapacity.setOnClickListener(this);
        
        Minus_Listener minuslisten = new Minus_Listener();
        Plus_Listener Pluslisten = new Plus_Listener();
        Yaw_Minus_Listener yawMinusListen = new Yaw_Minus_Listener();
        Yaw_Plus_Listener yawPlusListen = new Yaw_Plus_Listener();
        Roll_Minus_Listener rollMinusListen = new Roll_Minus_Listener();
        Roll_Plus_Listener rollPlusListen = new Roll_Plus_Listener();
        
        mPitchUpBtn.setOnTouchListener(Pluslisten);
        mPitchDownBtn.setOnTouchListener(minuslisten);
        mYawLeftBtn.setOnTouchListener(yawPlusListen);
        mYawRightBtn.setOnTouchListener(yawMinusListen);
        mRollUpBtn.setOnTouchListener(rollPlusListen);
        mRollDownBtn.setOnTouchListener(rollMinusListen);
        
        mGimbalAttitudeBtn.setEnabled(false);
        mGimbalAttitudeBtn.setClickable(false);
        
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
        
        mGimbalErrorCallBack = new DJIGimbalErrorCallBack(){

            @Override
            public void onError(int error) {
                // TODO Auto-generated method stub
                //Log.d(TAG, "Gimbal error = "+error);
            }
            
        };
        
        mGimbalUpdateAttitudeCallBack = new DJIGimbalUpdateAttitudeCallBack(){

            @Override
            public void onResult(DJIGimbalAttitude attitude) {
                // TODO Auto-generated method stub
                //Log.d(TAG, attitude.toString());

                StringBuffer sb = new StringBuffer();
                sb.append(getString(R.string.gimbal_attitude)).append("\n");
                sb.append("pitch=").append(attitude.pitch).append("\n");
                sb.append("roll=").append(attitude.roll).append("\n");
                sb.append("yaw=").append(attitude.yaw).append("\n");
                sb.append("yawAngle=").append(DJIDrone.getDjiGimbal().getYawAngle()).append("\n");
                sb.append("roll adjust=").append(attitude.rollAdjust).append("\n");
                
                AttiudeString = sb.toString();
                
                GimbalDemoActivity.this.runOnUiThread(new Runnable(){

                    @Override
                    public void run() 
                    {   
                        mGimbalAttitudeBtn.setText(AttiudeString);
                    }
                });
                
                
            }
            
        };
        
        DJIDrone.getDjiGimbal().setGimbalErrorCallBack(mGimbalErrorCallBack);
        DJIDrone.getDjiGimbal().setGimbalUpdateAttitudeCallBack(mGimbalUpdateAttitudeCallBack);
        
        if (DJIDroneType.DJIDrone_Vision == DJIDrone.getDroneType()) {
            lineLayout = (LinearLayout)findViewById(R.id.RollSpeedLineBar);
            lineLayout.setVisibility(View.GONE);
            lineLayout = (LinearLayout)findViewById(R.id.YawSpeedLineBar);
            lineLayout.setVisibility(View.GONE);
            relativeLayout = (RelativeLayout)findViewById(R.id.GimbalFunctionBar);
            relativeLayout.setVisibility(View.GONE);
            relativeLayout = (RelativeLayout)findViewById(R.id.RollFinetuneView);
            relativeLayout.setVisibility(View.GONE);
            mGetFirmwareVersion.setVisibility(View.GONE);
        }
    }
    
    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        mDjiGLSurfaceView.resume();
        
        mTimer = new Timer();
        Task task = new Task();
        mTimer.schedule(task, 0, 500);
        
        DJIDrone.getDjiGimbal().startUpdateTimer(1000);
        
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
        
        DJIDrone.getDjiGimbal().stopUpdateTimer();
        
        super.onPause();
    }
    
    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
    }
    
    @Override
    protected void onDestroy()
    {
        // TODO Auto-generated method stub
        
        
        if(DJIDrone.getDjiCamera() != null)
        DJIDrone.getDjiCamera().setReceivedVideoDataCallBack(null);
        mDjiGLSurfaceView.destroy();
        super.onDestroy();
    }
    
    private boolean gs = false;
    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            
            case R.id.PitchGoButton:                
                new Thread()
                {
                    public void run()
                    {
                        String vString = mPitchGoEditText.getText().toString();
                                                
                        int pitchGo = 0;
                        try {
                            pitchGo = Integer.parseInt(vString);
                        } catch (Exception e) {
                            // TODO: handle exception
                            pitchGo = 0;
                            
                            GimbalDemoActivity.this.runOnUiThread(new Runnable() {
                                
                                @Override
                                public void run() {
                                    // TODO Auto-generated method stub
                                    mPitchGoEditText.setText("0");
                                }
                            });  
                            
                        }
                        //Log.e("", "PitchGoButton click");
                        DJIGimbalRotation mPitch = new DJIGimbalRotation(true, false,true, pitchGo);
                        
                        DJIDrone.getDjiGimbal().updateGimbalAttitude(mPitch,null,null);

                    }
                }.start();
                
                break;  
                
            case R.id.YawLeftButton:                
                new Thread()
                {
                    DJIGimbalRotation mYaw = new DJIGimbalRotation(true, true,false, 60);
                    DJIGimbalRotation mYaw_stop = new DJIGimbalRotation(true, false,false, 0);
                    public void run()
                    {
                            
                        DJIDrone.getDjiGimbal().updateGimbalAttitude(null,null,mYaw);
                        
                        try 
                        {
                            Thread.sleep(150);
                        } catch (InterruptedException e)
                        {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        DJIDrone.getDjiGimbal().updateGimbalAttitude(null,null,mYaw_stop);
                    }
                }.start();
                
                break;  
                
            case R.id.YawRightButton:                
                new Thread()
                {
                    DJIGimbalRotation mYaw = new DJIGimbalRotation(true, false,false, 60);
                    DJIGimbalRotation mYaw_stop = new DJIGimbalRotation(true, false,false, 0);
                    public void run()
                    {
                            
                        DJIDrone.getDjiGimbal().updateGimbalAttitude(null,null,mYaw);
                    
                        try 
                        {
                            Thread.sleep(150);
                        } catch (InterruptedException e)
                        {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        DJIDrone.getDjiGimbal().updateGimbalAttitude(null,null,mYaw_stop);
                    }
                }.start();
                
                break;      
                
            case R.id.StartGimbalAutoCalibration : {
                DJIDrone.getDjiGimbal().startGimbalAutoCalibration(new DJIExecuteResultCallback() {

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
            
            case R.id.SetFPV : {
                DJIDrone.getDjiGimbal().setGimbalWorkMode(GimbalWorkMode.Fpv, new DJIExecuteResultCallback() {

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, mErr.errorDescription));
                    }
                    
                });
                break;
            }

            case R.id.RollFinetunePlus : {
                DJIDrone.getDjiGimbal().setRollFinetune(10, new DJIExecuteResultCallback() {
                        
                        @Override
                        public void onResult(DJIError mErr)
                        {

                        }
                        
                    });
                break;
            }
            
            case R.id.RollFinetuneMinus : {
                DJIDrone.getDjiGimbal().setRollFinetune(-10, new DJIExecuteResultCallback() {
                        
                        @Override
                        public void onResult(DJIError mErr)
                        {
                            // TODO Auto-generated method stub
                        }
                        
                    });
                break;
            }
            
            case R.id.get_version_btn: {
                DJIDrone.getDjiGimbal().getFirmwareVersion(new DJIExecuteStringResultCallback(){

                    @Override
                    public void onResult(String result)
                    {
                        // TODO Auto-generated method stub
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST,  "Firmware version = "+result));
                    }
                    
                });
                break;
            }
            
            case R.id.get_gimbal_capacity_btn : {
                DJIGimbalCapacity gimbalCapacity = DJIDrone.getDjiGimbal().getDJIGimbalCapacity();
                handler.sendMessage(handler.obtainMessage(SHOWTOAST, gimbalCapacity.toString()));
                break;
            }
     
            default:
                break;
        }
    }
    
    private void setResultToToast(String result){
        Toast.makeText(GimbalDemoActivity.this, result, Toast.LENGTH_SHORT).show();
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

    private boolean mIsPitchUp = false;
    private boolean mIsPitchDown = false;
    class Plus_Listener implements OnClickListener, OnTouchListener {
        @Override
        public void onClick(View view) {
            //Log.e("", "plus click");
        }
   
        @Override
        public boolean onTouch(View v, MotionEvent event) {

            if (event.getAction() == MotionEvent.ACTION_DOWN) 
            {
                mIsPitchUp = true;

                new Thread()
                {
                    public void run()
                    {
                    	DJIGimbalRotation mPitch = null;
                        if(type == CameraVisionType.Camera_Type_Plus || type == CameraVisionType.Camera_Type_Inspire){
                        	mPitch = new DJIGimbalRotation(true,true,false, 150);
                        }
                        else{
                        	mPitch = new DJIGimbalRotation(true,true,false, 20);
                        }
                        DJIGimbalRotation mPitch_stop = new DJIGimbalRotation(false, false,false, 0);
                        
                        while(mIsPitchUp)
                        {
                            //Log.e("", "A5S plus click");

                            DJIDrone.getDjiGimbal().updateGimbalAttitude(mPitch,null,null);
                        
                            try 
                            {
                                Thread.sleep(50);
                            } catch (InterruptedException e)
                            {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                        }
                        DJIDrone.getDjiGimbal().updateGimbalAttitude(mPitch_stop,null,null);
                    }
                }.start();
                
            } else if (event.getAction() == MotionEvent.ACTION_UP|| event.getAction() == MotionEvent.ACTION_OUTSIDE || event.getAction() == MotionEvent.ACTION_CANCEL) 
            {
            
                mIsPitchUp = false;

            }

            return false;
        }
    };

    class Minus_Listener implements OnClickListener, OnTouchListener {
        @Override
        public void onClick(View view) {
            //Log.e("", "minus click");
        }
   
        @Override
        public boolean onTouch(View v, MotionEvent event) {

            if (event.getAction() == MotionEvent.ACTION_DOWN) 
            {
                mIsPitchDown = true;

                new Thread()
                {
                    public void run()
                    {
                    	DJIGimbalRotation mPitch = null;
                        if(type == CameraVisionType.Camera_Type_Plus || type == CameraVisionType.Camera_Type_Inspire)
                        {
                        	mPitch = new DJIGimbalRotation(true, false,false, 150); 	
                        }else
                        {
                            
                            mPitch = new DJIGimbalRotation(true, false, false, 20);
                        }
                        
                        DJIGimbalRotation mPitch_stop = new DJIGimbalRotation(false, false,false, 0);
                    	
                        while(mIsPitchDown)
                        {
                            //Log.e("", "A5S plus click");

                            
                            DJIDrone.getDjiGimbal().updateGimbalAttitude(mPitch,null,null);
                        
                            try 
                            {
                                Thread.sleep(50);
                            } catch (InterruptedException e)
                            {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                        }
                        DJIDrone.getDjiGimbal().updateGimbalAttitude(mPitch_stop,null,null);
                    }
                }.start();
                
            } else if (event.getAction() == MotionEvent.ACTION_UP|| event.getAction() == MotionEvent.ACTION_OUTSIDE || event.getAction() == MotionEvent.ACTION_CANCEL) 
            {
            
                mIsPitchDown = false;

            }

            return false;
        }
    };
    
    private boolean mIsRollDown = false;
    private boolean mIsRollup = false;
    class Roll_Minus_Listener implements OnClickListener, OnTouchListener {
        @Override
        public void onClick(View view) {
            //Log.e("", "minus click");
        }
   
        @Override
        public boolean onTouch(View v, MotionEvent event) {

            if (event.getAction() == MotionEvent.ACTION_DOWN) 
            {
                mIsRollDown = true;

                new Thread()
                {
                    public void run()
                    {
                        DJIGimbalRotation mRoll = null;
                        if(type == CameraVisionType.Camera_Type_Plus || type == CameraVisionType.Camera_Type_Inspire)
                        {
                            mRoll = new DJIGimbalRotation(true, false,false, 150);     
                        }else
                        {
                            
                            mRoll = new DJIGimbalRotation(true, false, false, 20);
                        }
                        
                        DJIGimbalRotation mRoll_stop = new DJIGimbalRotation(false, false,false, 0);
                        
                        while(mIsRollDown)
                        {
                            //Log.e("", "A5S plus click");

                            
                            DJIDrone.getDjiGimbal().updateGimbalAttitude(null,mRoll,null);
                        
                            try 
                            {
                                Thread.sleep(50);
                            } catch (InterruptedException e)
                            {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                        }
                        DJIDrone.getDjiGimbal().updateGimbalAttitude(null,mRoll_stop,null);
                    }
                }.start();
                
            } else if (event.getAction() == MotionEvent.ACTION_UP|| event.getAction() == MotionEvent.ACTION_OUTSIDE || event.getAction() == MotionEvent.ACTION_CANCEL) 
            {
            
                mIsRollDown = false;

            }

            return false;
        }
    };
    
    class Roll_Plus_Listener implements OnClickListener, OnTouchListener {
        @Override
        public void onClick(View view) {
            //Log.e("", "plus click");
        }
   
        @Override
        public boolean onTouch(View v, MotionEvent event) {

            if (event.getAction() == MotionEvent.ACTION_DOWN) 
            {
                mIsRollup = true;

                new Thread()
                {
                    public void run()
                    {
                        DJIGimbalRotation mRoll = null;
                        if(type == CameraVisionType.Camera_Type_Plus || type == CameraVisionType.Camera_Type_Inspire){
                            mRoll = new DJIGimbalRotation(true,true,false, 150);
                        }
                        else{
                            mRoll = new DJIGimbalRotation(true,true,false, 20);
                        }
                        DJIGimbalRotation mRoll_stop = new DJIGimbalRotation(false, false,false, 0);
                        
                        while(mIsRollup)
                        {
                            //Log.e("", "A5S plus click");

                            DJIDrone.getDjiGimbal().updateGimbalAttitude(null,mRoll,null);
                        
                            try 
                            {
                                Thread.sleep(50);
                            } catch (InterruptedException e)
                            {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                        }
                        DJIDrone.getDjiGimbal().updateGimbalAttitude(null,mRoll_stop,null);
                    }
                }.start();
                
            } else if (event.getAction() == MotionEvent.ACTION_UP|| event.getAction() == MotionEvent.ACTION_OUTSIDE || event.getAction() == MotionEvent.ACTION_CANCEL) 
            {
            
                mIsRollup = false;

            }

            return false;
        }
    };
    
    private boolean mIsYawDown = false;
    private boolean mIsYawup = false;
    class Yaw_Minus_Listener implements OnClickListener, OnTouchListener {
        @Override
        public void onClick(View view) {
            //Log.e("", "minus click");
        }
   
        @Override
        public boolean onTouch(View v, MotionEvent event) {

            if (event.getAction() == MotionEvent.ACTION_DOWN) 
            {
                mIsYawDown = true;

                new Thread()
                {
                    public void run()
                    {
                        DJIGimbalRotation mYaw = null;
                        if(type == CameraVisionType.Camera_Type_Plus || type == CameraVisionType.Camera_Type_Inspire)
                        {
                            mYaw = new DJIGimbalRotation(true, true,false, 150);     
                        }else
                        {
                            
                            mYaw = new DJIGimbalRotation(true, true, false, 20);
                        }
                        
                        DJIGimbalRotation mYaw_stop = new DJIGimbalRotation(false, false,false, 0);
                        
                        while(mIsYawDown)
                        {
                            //Log.e("", "A5S plus click");

                            
                            DJIDrone.getDjiGimbal().updateGimbalAttitude(null,null,mYaw);
                        
                            try 
                            {
                                Thread.sleep(50);
                            } catch (InterruptedException e)
                            {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                        }
                        DJIDrone.getDjiGimbal().updateGimbalAttitude(null,null,mYaw_stop);
                    }
                }.start();
                
            } else if (event.getAction() == MotionEvent.ACTION_UP|| event.getAction() == MotionEvent.ACTION_OUTSIDE || event.getAction() == MotionEvent.ACTION_CANCEL) 
            {
            
                mIsYawDown = false;

            }

            return false;
        }
    };
    
    class Yaw_Plus_Listener implements OnClickListener, OnTouchListener {
        @Override
        public void onClick(View view) {
            //Log.e("", "plus click");
        }
   
        @Override
        public boolean onTouch(View v, MotionEvent event) {

            if (event.getAction() == MotionEvent.ACTION_DOWN) 
            {
                mIsYawup = true;

                new Thread()
                {
                    public void run()
                    {
                        DJIGimbalRotation mYaw = null;
                        if(type == CameraVisionType.Camera_Type_Plus || type == CameraVisionType.Camera_Type_Inspire){
                            mYaw = new DJIGimbalRotation(true,false,false, 150);
                        }
                        else{
                            mYaw = new DJIGimbalRotation(true,false,false, 20);
                        }
                        DJIGimbalRotation mYaw_stop = new DJIGimbalRotation(false, false,false, 0);
                        
                        while(mIsYawup)
                        {
                            //Log.e("", "A5S plus click");

                            DJIDrone.getDjiGimbal().updateGimbalAttitude(null,null,mYaw);
                        
                            try 
                            {
                                Thread.sleep(50);
                            } catch (InterruptedException e)
                            {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                        }
                        DJIDrone.getDjiGimbal().updateGimbalAttitude(null,null,mYaw_stop);
                    }
                }.start();
                
            } else if (event.getAction() == MotionEvent.ACTION_UP|| event.getAction() == MotionEvent.ACTION_OUTSIDE || event.getAction() == MotionEvent.ACTION_CANCEL) 
            {
            
                mIsYawup = false;

            }

            return false;
        }
    };
}
