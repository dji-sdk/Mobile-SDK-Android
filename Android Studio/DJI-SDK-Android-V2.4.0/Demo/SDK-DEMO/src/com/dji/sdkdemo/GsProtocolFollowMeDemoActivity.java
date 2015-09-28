package com.dji.sdkdemo;

import java.util.Timer;
import java.util.TimerTask;

import com.dji.sdkdemo.util.GPSTracker;

import dji.sdk.api.DJIDrone;
import dji.sdk.api.Camera.DJICameraDecodeTypeDef.DecoderType;
import dji.sdk.api.GroundStation.DJIFollowMeInitializationInfo;
import dji.sdk.api.GroundStation.DJIFollowMeTarget;
import dji.sdk.api.GroundStation.DJIGroundStationMissionPushInfo;
import dji.sdk.api.GroundStation.DJIGroundStationTypeDef.GroundStationFollowMeMode;
import dji.sdk.api.GroundStation.DJIGroundStationTypeDef.GroundStationFollowMeYawMode;
import dji.sdk.api.GroundStation.DJIGroundStationTypeDef.GroundStationResult;
import dji.sdk.api.GroundStation.DJIGroundStationTypeDef.GroundStationStatusPushType;
import dji.sdk.api.MainController.DJIMainControllerSystemState;
import dji.sdk.interfaces.DJIGroundStationExecuteCallBack;
import dji.sdk.interfaces.DJIGroundStationMissionPushInfoCallBack;
import dji.sdk.interfaces.DJIMcuUpdateStateCallBack;
import dji.sdk.interfaces.DJIReceivedVideoDataCallBack;
import dji.sdk.widget.DjiGLSurfaceView;
import android.R.integer;
import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 */
public class GsProtocolFollowMeDemoActivity extends DemoBaseActivity implements OnClickListener
{
    private static final String TAG = "GsProtocolFollowMeDemoActivity";
    
    private static final boolean Test_In_Simulator = false;
    
    protected static final int SHOWTOAST = -1;
    
    private boolean getHomePiontFlag = false;
    private boolean hasCanceled = false;
    private boolean hasPaused = false;
    private boolean startSuccessFlag = false;
    
    private double droneLatitude = 0.0;
    private double droneLongitude = 0.0;
//    private double offsetLatitude = 0.0;
//    private double offsetLongitude = 0.0;
//    
//    private int index = 0;
//    private double[] recordPhoneLatitude = new double[10];
//    private double[] recordPhoneLongitude = new double[10];
//    private double[] recordDroneLatitude = new double[10];
//    private double[] recordDroneLongitude = new double[10];
    
    private String result;
    
    private Button mOpenGroundStation;
    private Button mStartFollowMe;
    private Button mStartSendGPS;
    private Button mPauseFollowMe;
    private Button mResumeFollowMe;
    private Button mCancelFollowMe;
    private Button mCloseGroundStation;
    
    private TextView mConnectStateTextView;
    private TextView mMobileGpsTextView;
    private TextView mFollowMeTextView;
    private Timer mTimer;
    private Timer sendGPSTimer;
    
    private Context mContext;
    
    GPSTracker gpsTracker;
    
    sendGPS task;
    
    private String FollowMeInfoString = "";
    
    DJIGroundStationMissionPushInfoCallBack mGroundStationMissionPushInfoCallBack;
    
    private DjiGLSurfaceView mDjiGLSurfaceView;
    private DJIReceivedVideoDataCallBack mReceivedVideoDataCallBack = null;
    private DJIMcuUpdateStateCallBack mMcuUpdateStateCallBack = null;
    
    class Task extends TimerTask {
        //int times = 1;

        @Override
        public void run() 
        {
            //Log.d(TAG ,"==========>Task Run In!");
            checkConnectState(); 
        }

    };
    
    class sendGPS extends TimerTask {

        /** 
         *  
         * @see java.util.TimerTask#run() 
         */ 	
        @Override
        public void run()
        {
            // TODO Auto-generated method stub
            if (!hasCanceled) {
                
                if(hasPaused){
                    return;
                }
                
                if(Test_In_Simulator){ //Test Flow
                    droneLatitude = droneLatitude+0.0000199322;
                    final double latitude = droneLatitude;
                    final double longitude = droneLongitude;
                    DJIFollowMeTarget target = new DJIFollowMeTarget();
                    target.latitude = latitude;
                    target.longitude = longitude;

                    DJIDrone.getDjiGroundStation().sendFollowTargetGps(target, new DJIGroundStationExecuteCallBack() {
        
                        @Override
                        public void onResult(GroundStationResult mResult)
                        {
                            // TODO Auto-generated method stub
                          result = "Follow target = (" + latitude + " , " + longitude + ")\n"
                                  +"Drone Target = (" + droneLatitude + " , " + droneLongitude + ")\n"
                                  +"result ="+mResult.toString();
                          
                          GsProtocolFollowMeDemoActivity.this.runOnUiThread(new Runnable() {

                              @Override
                              public void run()
                              {
                                  // TODO Auto-generated method stub
                                  mMobileGpsTextView.setText(result);
                              }
                              
                          });
                        }
                        
                    });
                }
                else{
                    Location location = gpsTracker.getLocation();
                    double mlatitude = 0, mlongitude = 0;
                    if (null != location && gpsTracker.getGpsEnabled() && gpsTracker.getAccuracy() <= 20) {
                        mlatitude = location.getLatitude();
                        mlongitude = location.getLongitude();
                        Log.v("GPS","I'm not null");
                    }
                    else{
                        GsProtocolFollowMeDemoActivity.this.runOnUiThread(new Runnable() {

                            @Override
                            public void run()
                            {
                                // TODO Auto-generated method stub
                                mMobileGpsTextView.setText("Moblie Phone Gps not ready!");
                            }
                            
                        });
                        return;
                    }
                    
                    if(gpsTracker.getAccuracy() > 20){
                        GsProtocolFollowMeDemoActivity.this.runOnUiThread(new Runnable() {

                            @Override
                            public void run()
                            {
                                // TODO Auto-generated method stub
                                mMobileGpsTextView.setText("Mobile Phone Gps Accuracy is not enough this time,accuracy = "+gpsTracker.getAccuracy());
                            }
                            
                        });
                        return;
                    }
                    
                    Log.v("GPS", mlatitude + "," + mlongitude);
                    final double latitude = mlatitude, longitude = mlongitude;
                    DJIFollowMeTarget target = new DJIFollowMeTarget();
                    target.latitude = latitude;
                    target.longitude = longitude;

                    DJIDrone.getDjiGroundStation().sendFollowTargetGps(target, new DJIGroundStationExecuteCallBack() {
        
                        @Override
                        public void onResult(GroundStationResult mResult)
                        {
                            // TODO Auto-generated method stub
//                          String ResultsString = "Follow target = (" + latitude + " , " + longitude + ")\n" + mErr.errorDescription;
//                          handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                          result = "Follow target = (" + latitude + " , " + longitude + ")\n"
                                  +"Drone Target = (" + droneLatitude + " , " + droneLongitude + ")\n"
                                  +"result ="+mResult.toString();
                          
                          GsProtocolFollowMeDemoActivity.this.runOnUiThread(new Runnable() {

                              @Override
                              public void run()
                              {
                                  // TODO Auto-generated method stub
                                  mMobileGpsTextView.setText(result);
                              }
                              
                          });
                        }
                        
                    });                    
                }
            }
        }
    }

    private void checkConnectState(){
        
        GsProtocolFollowMeDemoActivity.this.runOnUiThread(new Runnable(){

            @Override
            public void run() 
            {   
                boolean bConnectState = DJIDrone.getDjiCamera().getCameraConnectIsOk();
                if(bConnectState){
                    mConnectStateTextView.setText(R.string.camera_connection_ok);
                }
                else{
                    mConnectStateTextView.setText(R.string.camera_connection_break);
                }
            }
        });
        
    }
    
    /** 
     * @param v 
     * @see android.view.View.OnClickListener#onClick(android.view.View) 
     */ 	
    @Override
    public void onClick(View v)
    {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.OpenGsButton : {
                if(!checkGetHomePoint()) return;
                DJIDrone.getDjiGroundStation().openGroundStation(new DJIGroundStationExecuteCallBack() {

                    @Override
                    public void onResult(GroundStationResult result)
                    {
                        // TODO Auto-generated method stub
                        String ResultsString = "open gs result =" + result.toString();
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });
                
                break;
            }
            
            case R.id.StartFollowMeBtn : {
                if(!checkGetHomePoint()) return;
                
                if(Test_In_Simulator){ //Test Flow
                    DJIFollowMeInitializationInfo info = new DJIFollowMeInitializationInfo();
                    info.followMeMode = GroundStationFollowMeMode.Relative_Mode;
                    info.yawMode = GroundStationFollowMeYawMode.Point_To_Customer;
                    info.userLatitude = droneLatitude;
                    info.userLongitude = droneLongitude; 
                    
                    DJIDrone.getDjiGroundStation().startFollowMe(info, new DJIGroundStationExecuteCallBack() {

                        @Override
                        public void onResult(GroundStationResult result)
                        {
                            // TODO Auto-generated method stub
                            String ResultsString = "start follow me result =" + result.toString();
                            handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                            if(result == GroundStationResult.GS_Result_Success){
                                startSuccessFlag = true;
                            }
                        }
                        
                    });
                }
                else{
                    if(!gpsTracker.getGpsEnabled()){
                        String ResultsString = "Mobile Phone Gps is not enable!";
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                        return;
                    }
                    
                    Location location = gpsTracker.getLocation();
                    if(null == location){
                        String ResultsString = "Mobile Phone Gps is null!";
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                        return;
                    }
                    
                    if(gpsTracker.getAccuracy() > 20){
                        String ResultsString = "Mobile Phone Gps Accuracy is not enough,accuracy = "+gpsTracker.getAccuracy();
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                        return; 
                    }
                    
                    DJIFollowMeInitializationInfo info = new DJIFollowMeInitializationInfo();
                    info.followMeMode = GroundStationFollowMeMode.Relative_Mode;
                    info.yawMode = GroundStationFollowMeYawMode.Point_To_Customer;
                    info.userLatitude = location.getLatitude();
                    info.userLongitude = location.getLongitude();  
                    
                    DJIDrone.getDjiGroundStation().startFollowMe(info, new DJIGroundStationExecuteCallBack() {

                        @Override
                        public void onResult(GroundStationResult result)
                        {
                            // TODO Auto-generated method stub
                            String ResultsString = "start follow me result =" + result.toString();
                            handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                            if(result == GroundStationResult.GS_Result_Success){
                                startSuccessFlag = true;
                            }
                        }
                        
                    });
                }
                break;
            }
            
            case R.id.StartSendGPS : {
                if(!checkGetHomePoint()) return;
                
                if(!startSuccessFlag){
                    String ResultsString = "Follow me is not started successfully!";
                    handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));               
                    return;
                }
                hasCanceled = false;
                if (null == sendGPSTimer) {
                    sendGPSTimer = new Timer();
                    task = new sendGPS();
                    sendGPSTimer.schedule(task, 0, 100);
                }
                break;
            }
            
            case R.id.PauseFollowMe : {
                if(!checkGetHomePoint()) return;
                
                if(!startSuccessFlag){
                    String ResultsString = "Follow me is not started successfully!";
                    handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));               
                    return;
                }
                
                DJIDrone.getDjiGroundStation().pauseFollowMe(new DJIGroundStationExecuteCallBack() {

                    @Override
                    public void onResult(GroundStationResult result)
                    {
                        // TODO Auto-generated method stub
                        String ResultsString = "pause follow me result =" + result.toString();
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                        if(result == GroundStationResult.GS_Result_Success){
                            hasPaused = true;
                        }
                    }
                    
                });
                break;
            }
            
            case R.id.ResumeFollowMe : {
                if(!checkGetHomePoint()) return;
                
                if(!startSuccessFlag){
                    String ResultsString = "Follow me is not started successfully!";
                    handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));               
                    return;
                }
                
                DJIDrone.getDjiGroundStation().resumeFollowMe(new DJIGroundStationExecuteCallBack() {

                    @Override
                    public void onResult(GroundStationResult result)
                    {
                        // TODO Auto-generated method stub
                        String ResultsString = "resume follow me result =" + result.toString();
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                        if(result == GroundStationResult.GS_Result_Success){
                            hasPaused = false;
                        }
                    }
                    
                });
                break;
            }
            
            case R.id.CancelFollowMe : {
                if(!checkGetHomePoint()) return;
                
                if(!startSuccessFlag){
                    String ResultsString = "Follow me is not started successfully!";
                    handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));               
                    return;
                }
                
                DJIDrone.getDjiGroundStation().cancelFollowMe(new DJIGroundStationExecuteCallBack() {

                    @Override
                    public void onResult(GroundStationResult result)
                    {
                        // TODO Auto-generated method stub
                        String ResultsString = "cancel follow me result =" + result.toString();
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                        hasCanceled = true;
                        if (null != sendGPSTimer) {
                            sendGPSTimer.cancel();
                            sendGPSTimer.purge();
                            sendGPSTimer = null;
                            task.cancel();
                        }
                        
                        startSuccessFlag = false;
                    }
                    
                });
                break;
            }
            
            case R.id.CloseGroundStation : {
                if(!checkGetHomePoint()) return;
                DJIDrone.getDjiGroundStation().closeGroundStation(new DJIGroundStationExecuteCallBack() {

                    @Override
                    public void onResult(GroundStationResult result)
                    {
                        // TODO Auto-generated method stub
                        
                        hasCanceled = false;
                        hasPaused = false;
                        String ResultsString = "close gs result =" + result.toString();
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });
                break;
            }
        }
    }
    
    private boolean checkGetHomePoint(){
        if(!getHomePiontFlag){
            setResultToToast(getString(R.string.gs_not_get_home_point));
        }
        return getHomePiontFlag;
    }
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_gs_protocol_followme_demo);
        
        DJIDrone.getDjiCamera().setDecodeType(DecoderType.Software);
        
        mContext = getApplicationContext();
        
        mDjiGLSurfaceView = (DjiGLSurfaceView)findViewById(R.id.DjiSurfaceView_gs_follow_me);  
        
        mOpenGroundStation = (Button)findViewById(R.id.OpenGsButton);
        mStartFollowMe = (Button)findViewById(R.id.StartFollowMeBtn);
        mStartSendGPS = (Button)findViewById(R.id.StartSendGPS);
        mPauseFollowMe = (Button)findViewById(R.id.PauseFollowMe);
        mResumeFollowMe = (Button)findViewById(R.id.ResumeFollowMe);
        mCancelFollowMe = (Button)findViewById(R.id.CancelFollowMe);
        mCloseGroundStation = (Button)findViewById(R.id.CloseGroundStation);
        
        mConnectStateTextView = (TextView)findViewById(R.id.ConnectStateGsTextView);
        mMobileGpsTextView = (TextView)findViewById(R.id.FollowMeInfoTV);
        mFollowMeTextView = (TextView)findViewById(R.id.FollowMeInfoTV2);
        
        mOpenGroundStation.setOnClickListener(this);
        mStartFollowMe.setOnClickListener(this);
        mStartSendGPS.setOnClickListener(this);
        mPauseFollowMe.setOnClickListener(this);
        mResumeFollowMe.setOnClickListener(this);
        mCancelFollowMe.setOnClickListener(this);
        mCloseGroundStation.setOnClickListener(this);
        
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
        
        mMcuUpdateStateCallBack = new DJIMcuUpdateStateCallBack() {

            @Override
            public void onResult(DJIMainControllerSystemState state)
            {
                //TODO Auto-generated method stub
                if(Test_In_Simulator && getHomePiontFlag){
                    return;
                }
                
                droneLatitude = state.droneLocationLatitude;
                droneLongitude = state.droneLocationLongitude;
                
                if(droneLatitude != -1 && droneLatitude != -1 && droneLatitude != 0 && droneLatitude != 0){
                    getHomePiontFlag = true;
                }
                else{
                    getHomePiontFlag = false;
                }
            }
            
        };
        
        DJIDrone.getDjiMainController().setMcuUpdateStateCallBack(mMcuUpdateStateCallBack);

        mGroundStationMissionPushInfoCallBack = new DJIGroundStationMissionPushInfoCallBack() {

            @Override
            public void onResult(DJIGroundStationMissionPushInfo info) {
                //TODO Auto-generated method stub
                StringBuffer sb = new StringBuffer();
                switch(info.missionType) {
                    case Navi_Mode_FollowMe : {
                        sb.append("Mission Type : " + info.missionType.toString()).append("\n");
                        sb.append("Mission Status : " + info.followMeMissionStatus).append("\n");
                        sb.append("Follow me gps level : " + info.followMeGpsLevel).append("\n");
                        sb.append("Follow me distance : " + info.followMeDistance/100d).append("\n");
                        sb.append("Follow me reason : " + info.followMeReason).append("\n");
                        break;
                    }
                    
                    case Navi_Mode_Attitude : {
                        sb.append("Mission Type : " + info.missionType.toString()).append("\n");
                        sb.append("Mission Reserve : " + info.reserved).append("\n");
                        break;
                    }
                    
                    default :
                        sb.append("Wrong Selection").append("\n");
                }
                
                FollowMeInfoString = sb.toString();
                
                GsProtocolFollowMeDemoActivity.this.runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        //TODO Auto-generated method stub
                        mFollowMeTextView.setText(FollowMeInfoString);
                    }
                    
                });
            }
            
        };
        
        DJIDrone.getDjiGroundStation().setGroundStationMissionPushInfoCallBack(mGroundStationMissionPushInfoCallBack);

        gpsTracker = new GPSTracker(GsProtocolFollowMeDemoActivity.this);
    }
    
    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        mDjiGLSurfaceView.resume();
        
        mTimer = new Timer();
        Task task = new Task();
        mTimer.schedule(task, 0, 500);
        
        DJIDrone.getDjiMainController().startUpdateTimer(1000);

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
        
        DJIDrone.getDjiMainController().stopUpdateTimer();
        
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
        
        if(DJIDrone.getDjiCamera() != null){
            DJIDrone.getDjiCamera().setReceivedVideoDataCallBack(null);
        }
        mDjiGLSurfaceView.destroy();
        
        if(gpsTracker!=null) gpsTracker.stopUsingGPS();
        
        super.onDestroy();
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
    
    public void onReturn(View view){
        Log.d(TAG ,"onReturn");  
        this.finish();
    }
    
    private void setResultToToast(String result){
        Toast.makeText(GsProtocolFollowMeDemoActivity.this, result, Toast.LENGTH_SHORT).show();
    }
}
