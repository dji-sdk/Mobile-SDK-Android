package com.dji.sdkdemo;

import java.util.Timer;
import java.util.TimerTask;

import com.dji.sdkdemo.CameraProtocolDemoActivity.Task;
import com.dji.sdkdemo.GsProtocolDemoActivity.CheckYawTask;

import dji.sdk.api.DJIDrone;
import dji.sdk.api.Camera.DJICameraDecodeTypeDef.DecoderType;
import dji.sdk.api.DJIDroneTypeDef.DJIDroneType;
import dji.sdk.api.DJIError;
import dji.sdk.api.Gimbal.DJIGimbalRotation;
import dji.sdk.api.GroundStation.DJIGroundStationFlyingInfo;
import dji.sdk.api.GroundStation.DJIGroundStationTask;
import dji.sdk.api.GroundStation.DJIGroundStationTypeDef.DJIGroundStationFinishAction;
import dji.sdk.api.GroundStation.DJIGroundStationTypeDef.DJIGroundStationMovingMode;
import dji.sdk.api.GroundStation.DJIGroundStationTypeDef.DJIGroundStationPathMode;
import dji.sdk.api.GroundStation.DJIGroundStationTypeDef.GroundStationFlightMode;
import dji.sdk.api.GroundStation.DJIGroundStationTypeDef.GroundStationOnWayPointAction;
import dji.sdk.api.GroundStation.DJIGroundStationTypeDef.GroundStationResult;
import dji.sdk.api.GroundStation.DJIGroundStationWaypoint;
import dji.sdk.api.MainController.DJIMainControllerSystemState;
import dji.sdk.interfaces.DJIExecuteResultCallback;
import dji.sdk.interfaces.DJIGroundStationExecuteCallBack;
import dji.sdk.interfaces.DJIGroundStationFlyingInfoCallBack;
import dji.sdk.interfaces.DJIMcuUpdateStateCallBack;
import dji.sdk.interfaces.DJIReceivedVideoDataCallBack;
import dji.sdk.widget.DjiGLSurfaceView;
import android.R.integer;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.salamientertainment.view.onscreenjoystick.OnScreenJoystick;
import com.salamientertainment.view.onscreenjoystick.OnScreenJoystickListener;
import com.seekcircle.SeekCircle;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 */
public class GsProtocolJoystickDemoActivity extends DemoBaseActivity implements OnClickListener{

    private static final String TAG = "GsProtocolJoystickDemoActivity";
    
    private DjiGLSurfaceView mDjiGLSurfaceView;
    private DJIReceivedVideoDataCallBack mReceivedVideoDataCallBack = null;
    private DJIGroundStationFlyingInfoCallBack mGroundStationFlyingInfoCallBack = null;
    
    private DJIMcuUpdateStateCallBack mMcuUpdateStateCallBack = null;
    
    private Button mOpenGsButton;
    private Button mAddOneWaypointButton;
    private Button mUploadWaypointButton;
    private Button mTakeOffButton;
    private Button mGohomeButton;
    private Button mCloseGsButton;
    private Button mPauseButton;
    private Button mResumeButton;
    private Button mOneKeyFlyButton;
    
    private int YawJoyFullCount = 0;
    private int PitchJoyFullCount = 0;
    private int RollJoyFullCount = 0;
    
    private OnScreenJoystick mScreenJoystickRight;
    private OnScreenJoystick mScreenJoystickLeft;

    private final int SHOWTOAST = 1;
    
    private double homeLocationLatitude = -1;
    private double homeLocationLongitude = -1;   
    private double aircraftLocationLatitude = -1;
    private double aircraftLocationLongitude = -1;
    private boolean isFlying = false;
    private boolean getHomePiontFlag = false;
    private DJIGroundStationTask mTask;

    private TextView mConnectStateTextView;
    private Timer mTimer;
    
    private int pitch = 0;	
    private int roll = 0;	
	private int yaw = 0;	
	private int throttle = 0;
	
	Vibrator vibrator;
    
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
        
        GsProtocolJoystickDemoActivity.this.runOnUiThread(new Runnable(){

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
    
    private Timer mCheckModeForPauseTimer;
    private GroundStationFlightMode mFlightMode;
    class CheckModeForPauseTask extends TimerTask {

        @Override
        public void run() 
        {
        	if(mFlightMode == GroundStationFlightMode.GS_Mode_Pause_1 || mFlightMode == GroundStationFlightMode.GS_Mode_Pause_2 || mFlightMode == GroundStationFlightMode.GS_Mode_Gps_Atti){
        		if(checkGetHomePoint()){
                  DJIDrone.getDjiGroundStation().pauseGroundStationTask(new DJIGroundStationExecuteCallBack(){

                      @Override
                      public void onResult(GroundStationResult result) {
                          // TODO Auto-generated method stub
                          String ResultsString = "pause result =" + result.toString();
                          handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                          
                          if(result == GroundStationResult.GS_Result_Success){
                          	if(mCheckModeForPauseTimer != null){
              	        		mCheckModeForPauseTimer.cancel();
              		            mCheckModeForPauseTimer.purge();
              		            mCheckModeForPauseTimer = null;
              		            
              		            DealSuccessWithVibrate();
                      		}
                          }
                      }
                  }); 
        		}
	            return;            
        	}
            
        	
//        	if(mFlightMode == GroundStationFlightMode.GS_Mode_Waypoint){        		
//        		if(checkGetHomePoint()){
//                    DJIDrone.getDjiGroundStation().pauseGroundStationTask(new DJIGroundStationHoverCallBack(){
//
//                        @Override
//                        public void onResult(GroundStationHoverResult result) {
//                            // TODO Auto-generated method stub
//                            String ResultsString = "pause return code =" + result.value();
//                            handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
//                            
//                            if(result == GroundStationHoverResult.GS_Hover_Successed){
//                            	if(mCheckModeForPauseTimer != null){
//                	        		mCheckModeForPauseTimer.cancel();
//                		            mCheckModeForPauseTimer.purge();
//                		            mCheckModeForPauseTimer = null;
//                		            
//                		            DealSuccessWithVibrate();
//                        		}
//                            }
//                        }
//                    }); 
//            	}
//        	
//        	} 
        	
        	Log.d(TAG ,"mFlightMode==========>"+mFlightMode);
        }

    };
    
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
        Toast.makeText(GsProtocolJoystickDemoActivity.this, result, Toast.LENGTH_SHORT).show();
    }
    
    private boolean checkGetHomePoint(){
        if(!getHomePiontFlag){
            setResultToToast(getString(R.string.gs_not_get_home_point));
        }
        return getHomePiontFlag;
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_gs_protocol_joystick_demo);
        
        DJIDrone.getDjiCamera().setDecodeType(DecoderType.Software);
        
        mDjiGLSurfaceView = (DjiGLSurfaceView)findViewById(R.id.DjiSurfaceView_gs);         
        mOpenGsButton = (Button)findViewById(R.id.OpenGsButton);
        mAddOneWaypointButton = (Button)findViewById(R.id.AddWaypointButton);
        mUploadWaypointButton = (Button)findViewById(R.id.UploadWaypointButton);
        mTakeOffButton = (Button)findViewById(R.id.TakeOffButton);
        mGohomeButton = (Button)findViewById(R.id.GohomeButton);
        mCloseGsButton = (Button)findViewById(R.id.CloseGsButton);
        mPauseButton = (Button)findViewById(R.id.PauseButton);
        mResumeButton = (Button)findViewById(R.id.ResumeButton);       
        mConnectStateTextView = (TextView)findViewById(R.id.ConnectStateGsTextView);
        mScreenJoystickRight = (OnScreenJoystick)findViewById(R.id.directionJoystickRight);
        mScreenJoystickLeft = (OnScreenJoystick)findViewById(R.id.directionJoystickLeft);
        mOneKeyFlyButton = (Button)findViewById(R.id.OneKeyFlyButton);

        mOpenGsButton.setOnClickListener(this);
        mAddOneWaypointButton.setOnClickListener(this);
        mUploadWaypointButton.setOnClickListener(this);
        mTakeOffButton.setOnClickListener(this);
        mGohomeButton.setOnClickListener(this);
        mCloseGsButton.setOnClickListener(this);  
        mPauseButton.setOnClickListener(this);
        mResumeButton.setOnClickListener(this);
        mOneKeyFlyButton.setOnClickListener(this);

        
        mScreenJoystickLeft.setJoystickListener(new OnScreenJoystickListener(){

			@Override
			public void onTouch(OnScreenJoystick joystick, float pX, float pY) {
				// TODO Auto-generated method stub
				//Log.d(TAG ,"mScreenJoystickLeft "+pX+" "+pY);
                if(Math.abs(pX) < 0.02 ){
                    pX = 0;
                }
                
                if(Math.abs(pY) < 0.02 ){
                    pY = 0;
                }
				
				int YawJoyControlMaxSpeed = 500;				
				
				yaw = (int)(YawJoyControlMaxSpeed * pX);
				
				throttle = 0;
				
				if(pY > 0){
					throttle = 1;
				}
				else if(pY <= -0.9){
					//if(pY == -1){
					//	throttle = 2;
					//}
					throttle = 2;
				}
			
//                new Thread()
//                {
//                    public void run()
//                    {
                            
                        DJIDrone.getDjiGroundStation().setAircraftJoystick(yaw, pitch, roll, throttle,new DJIGroundStationExecuteCallBack(){

                            @Override
                            public void onResult(GroundStationResult result) {
                                // TODO Auto-generated method stub
                                
                            }
                            
                        });
//                    }
//                }.start();
				
			}
        	
        });
        
        mScreenJoystickRight.setJoystickListener(new OnScreenJoystickListener(){

			@Override
			public void onTouch(OnScreenJoystick joystick, float pX, float pY) {
				// TODO Auto-generated method stub
				//Log.d(TAG ,"mScreenJoystickRight "+pX+" "+pY);
                if(Math.abs(pX) < 0.02 ){
                    pX = 0;
                }
                
                if(Math.abs(pY) < 0.02 ){
                    pY = 0;
                }
				int PitchJoyControlMaxSpeed = 1000;
				int RollJoyControlMaxSpeed = 1000;
				
				
				pitch = (int)(PitchJoyControlMaxSpeed * pY);
				
				roll = (int)(RollJoyControlMaxSpeed * pX);

				//Log.d(TAG ,"mScreenJoystickRight pitch="+pitch);
				//Log.d(TAG ,"mScreenJoystickRight roll="+roll);
				
//                new Thread()
//                {
//                    public void run()
//                    {
                            
                        DJIDrone.getDjiGroundStation().setAircraftJoystick(yaw, pitch, roll, throttle,new DJIGroundStationExecuteCallBack(){

                            @Override
                            public void onResult(GroundStationResult result) {
                                // TODO Auto-generated method stub
                                
                            }
                            
                        });
//                    }
//                }.start();
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
        
        mMcuUpdateStateCallBack = new DJIMcuUpdateStateCallBack(){

            @Override
            public void onResult(DJIMainControllerSystemState state) {
                // TODO Auto-generated method stub
            	//Log.e(TAG, "DJIMainControllerSystemState homeLocationLatitude " +state.homeLocationLatitude);
            	//Log.e(TAG, "DJIMainControllerSystemState homeLocationLongitude " +state.homeLocationLongitude);
                homeLocationLatitude = state.homeLocationLatitude;
                homeLocationLongitude = state.homeLocationLongitude;
                
                aircraftLocationLatitude = state.droneLocationLatitude;
                aircraftLocationLongitude = state.droneLocationLongitude;
                
                isFlying = state.isFlying;
                
                if(homeLocationLatitude != -1 && homeLocationLongitude != -1 && homeLocationLatitude != 0 && homeLocationLongitude != 0){
                    getHomePiontFlag = true;
                }
                else{
                    getHomePiontFlag = false;
                }
            }
           
        };        

        DJIDrone.getDjiMC().setMcuUpdateStateCallBack(mMcuUpdateStateCallBack);
        
        
        mGroundStationFlyingInfoCallBack = new DJIGroundStationFlyingInfoCallBack(){

			@Override
			public void onResult(DJIGroundStationFlyingInfo flyingInfo) {
				// TODO Auto-generated method stub
				//Log.e(TAG, "DJIGroundStationFlyingInfo homeLocationLatitude " +flyingInfo.homeLocationLatitude);
            	//Log.e(TAG, "DJIGroundStationFlyingInfo homeLocationLongitude " +flyingInfo.homeLocationLongitude);
            	
				mFlightMode = flyingInfo.flightMode;
			}
        	
        };

        DJIDrone.getDjiGroundStation().setGroundStationFlyingInfoCallBack(mGroundStationFlyingInfoCallBack);
        
        mTask = new DJIGroundStationTask();
        
        
        vibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);  
    }
    
    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        mDjiGLSurfaceView.resume();
        
        mTimer = new Timer();
        Task task = new Task();
        mTimer.schedule(task, 0, 500);
       
        DJIDrone.getDjiMC().startUpdateTimer(1000);
        DJIDrone.getDjiGroundStation().startUpdateTimer(1000);
        
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
        DJIDrone.getDjiGroundStation().stopUpdateTimer();
        
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
        if(mCheckModeForPauseTimer != null){
      		mCheckModeForPauseTimer.cancel();
	        mCheckModeForPauseTimer.purge();
	        mCheckModeForPauseTimer = null;
  		}

        super.onDestroy();
    }
    


    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.OpenGsButton:
                if(!checkGetHomePoint()) return;
                
                DJIDrone.getDjiGroundStation().openGroundStation(new DJIGroundStationExecuteCallBack(){

                    @Override
                    public void onResult(GroundStationResult result) {
                        // TODO Auto-generated method stub
                        String ResultsString = "result =" + result.toString();
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                }); 

                break;
                
            case R.id.AddWaypointButton:
                if(!checkGetHomePoint()) return;
                
                if(DJIDrone.getDroneType() == DJIDroneType.DJIDrone_Vision){
                  //north
                    DJIGroundStationWaypoint mWayPoint1 = new DJIGroundStationWaypoint(homeLocationLatitude+0.0000899322, homeLocationLongitude);
                    mWayPoint1.altitude = 15f;
                    mWayPoint1.speed = 2; // slow 2
                    mWayPoint1.heading = 0;
                    mWayPoint1.maxReachTime = 999; 
                    mWayPoint1.stayTime = 10;       
                    mWayPoint1.turnMode = 1;
    
                    //east
                    DJIGroundStationWaypoint mWayPoint2 = new DJIGroundStationWaypoint(homeLocationLatitude, homeLocationLongitude+0.0000899322);
                    mWayPoint2.altitude = 5f;
                    mWayPoint2.speed = 2; // slow 2
                    mWayPoint2.heading = 80;
                    mWayPoint2.maxReachTime = 999; 
                    mWayPoint2.stayTime = 20;  
                    mWayPoint2.turnMode = 1;

                    mTask.addWaypoint(mWayPoint2);

                    //south
                    DJIGroundStationWaypoint mWayPoint3 = new DJIGroundStationWaypoint(homeLocationLatitude-0.0000899322, homeLocationLongitude);
                    mWayPoint3.altitude = 30f;
                    mWayPoint3.speed = 2; // slow 2
                    mWayPoint3.heading = -60;
                    mWayPoint3.maxReachTime = 999; 
                    mWayPoint3.stayTime = 25;     
                    mWayPoint3.turnMode = 1;
                    
                    mTask.addWaypoint(mWayPoint3);
                    mTask.wayPointCount = mTask.getAllWaypoint().size();
                }
                else{
                    //north
                    DJIGroundStationWaypoint mWayPoint1 = new DJIGroundStationWaypoint(homeLocationLatitude+0.0000899322, homeLocationLongitude);
                    mWayPoint1.action.actionRepeat = 1;
                    mWayPoint1.altitude = 15f;
                    mWayPoint1.heading = 0;
                    mWayPoint1.actionTimeout = 10;       
                    mWayPoint1.turnMode = 1;
                    mWayPoint1.dampingDistance = 1.5f;
                    mWayPoint1.hasAction = true;
                    
                    mWayPoint1.addAction(GroundStationOnWayPointAction.Way_Point_Action_Simple_Shot, 1);
                    mWayPoint1.addAction(GroundStationOnWayPointAction.Way_Point_Action_Video_Start, 0);
                    mWayPoint1.addAction(GroundStationOnWayPointAction.Way_Point_Action_Video_Stop,  0);
                    mTask.addWaypoint(mWayPoint1);
                    
                    //east
                    DJIGroundStationWaypoint mWayPoint2 = new DJIGroundStationWaypoint(homeLocationLatitude, homeLocationLongitude+0.0000899322);
                    mWayPoint2.action.actionRepeat = 1;
                    mWayPoint2.altitude = 20f;
                    mWayPoint2.heading = 80;
                    mWayPoint2.actionTimeout = 20;  
                    mWayPoint2.turnMode = 1;
                    mWayPoint2.dampingDistance = 2.5f;
                    mWayPoint2.hasAction = true;
                    
                    mWayPoint2.addAction(GroundStationOnWayPointAction.Way_Point_Action_Craft_Yaw, -130);
                    
                    mTask.addWaypoint(mWayPoint2);

                    //south
                    DJIGroundStationWaypoint mWayPoint3 = new DJIGroundStationWaypoint(homeLocationLatitude-0.0000899322, homeLocationLongitude);
                    mWayPoint3.action.actionRepeat = 1;
                    mWayPoint3.altitude = 30f;
                    mWayPoint3.heading = -60;
                    mWayPoint3.actionTimeout = 25;     
                    mWayPoint3.turnMode = 1;
                    mWayPoint3.dampingDistance = 1.0f;
                    mWayPoint3.hasAction = true;
                    
                    mWayPoint3.addAction(GroundStationOnWayPointAction.Way_Point_Action_Gimbal_Pitch, -89);
                    mTask.addWaypoint(mWayPoint3);
                    
                    mTask.finishAction = DJIGroundStationFinishAction.Go_Home;
                    mTask.movingMode = DJIGroundStationMovingMode.GSHeadingUsingWaypointHeading;
                    mTask.pathMode = DJIGroundStationPathMode.Point_To_Point;
                    mTask.wayPointCount = mTask.getAllWaypoint().size();
                }
                
                break;
                
            case R.id.UploadWaypointButton:
                if(!checkGetHomePoint()) return;
                
                DJIDrone.getDjiGroundStation().uploadGroundStationTask(mTask, new DJIGroundStationExecuteCallBack(){

                    @Override
                    public void onResult(GroundStationResult result) {
                        // TODO Auto-generated method stub
                        String ResultsString = "result =" + result.toString();
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                });                
                break;
                
            case R.id.TakeOffButton:
                if(!checkGetHomePoint()) return;
                DJIDrone.getDjiGroundStation().startGroundStationTask(new DJIGroundStationExecuteCallBack(){

                    @Override
                    public void onResult(GroundStationResult result) {
                        // TODO Auto-generated method stub
                        String ResultsString = "result =" + result.toString();
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                });                
                break;
                
            case R.id.GohomeButton:
                if(!checkGetHomePoint()) return;
                DJIDrone.getDjiGroundStation().goHome(new DJIGroundStationExecuteCallBack(){

                    @Override
                    public void onResult(GroundStationResult result) {
                        // TODO Auto-generated method stub
                        String ResultsString = "result =" + result.toString();
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }

                });                
                break;   
                
            case R.id.CloseGsButton:
                if(!checkGetHomePoint()) return;

                DJIDrone.getDjiGroundStation().closeGroundStation(new DJIGroundStationExecuteCallBack(){

                    @Override
                    public void onResult(GroundStationResult result) {
                        // TODO Auto-generated method stub
                        String ResultsString = "result =" + result.toString();
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }

                });  
                break;  
                
            case R.id.PauseButton:
                if(!checkGetHomePoint()) return;
                DJIDrone.getDjiGroundStation().pauseGroundStationTask(new DJIGroundStationExecuteCallBack(){

                    @Override
                    public void onResult(GroundStationResult result) {
                        // TODO Auto-generated method stub
                        String ResultsString = "result =" + result.toString();
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                });  
                break;  

            case R.id.ResumeButton:
                if(!checkGetHomePoint()) return;
                
                DJIDrone.getDjiGroundStation().continueGroundStationTask(new DJIGroundStationExecuteCallBack(){

                    @Override
                    public void onResult(GroundStationResult result) {
                        // TODO Auto-generated method stub
                        String ResultsString = "result =" + result.toString();
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }

                });  
                break; 
                
            case R.id.OneKeyFlyButton:
            	if(!checkGetHomePoint()) {            		
            		//DealErrorWithVibrate();
            		return;            	
            	}
            	
            	if(!isFlying){
            		DJIDrone.getDjiGroundStation().openGroundStation(new DJIGroundStationExecuteCallBack(){

                        @Override
                        public void onResult(GroundStationResult result) {
                            // TODO Auto-generated method stub
                            String ResultsString = "opengs result =" + result.toString();
                            handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                            
                            if(result == GroundStationResult.GS_Result_Success){
                            	
                            	//one key fly
                                DJIDrone.getDjiGroundStation().oneKeyFly(new DJIGroundStationExecuteCallBack(){                            	
    								@Override
    								public void onResult(GroundStationResult result) {
    									// TODO Auto-generated method stub
    									
    									String ResultsString = "one key fly result =" + result.toString();
    			                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
    			                        
    									if(result == GroundStationResult.GS_Result_Success){
    									    
    									    if(DJIDrone.getDroneType() == DJIDroneType.DJIDrone_Vision){
    	                                           mCheckModeForPauseTimer = new Timer();
    	                                            CheckModeForPauseTask mCheckTask = new CheckModeForPauseTask();
    	                                            mCheckModeForPauseTimer.schedule(mCheckTask, 100, 1000);
    									    }
    									    else{
    									        DealSuccessWithVibrate();
    									    }
    									}
    									else{
    										DealErrorWithVibrate();
    									}
    								}
                                	
                                });                         
                            }
                            else{
                            	DealErrorWithVibrate();
                            }
                            
                        }
                        
                    });
            	}
            	else{
            		DJIDrone.getDjiGroundStation().openGroundStation(new DJIGroundStationExecuteCallBack(){

                        @Override
                        public void onResult(GroundStationResult result) {
                            // TODO Auto-generated method stub
                            String ResultsString = "opengs result =" + result.toString();
                            handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                            
                            if(result == GroundStationResult.GS_Result_Success){
                            	
                                if(DJIDrone.getDroneType() == DJIDroneType.DJIDrone_Vision){
                                    mCheckModeForPauseTimer = new Timer();
                                    CheckModeForPauseTask mCheckTask = new CheckModeForPauseTask();
                                    mCheckModeForPauseTimer.schedule(mCheckTask, 100, 1000);
                                }
                                else{
                                    DealSuccessWithVibrate();
                                } 
                                
                            }
                            else{
                            	DealErrorWithVibrate();
                            }
                            
                        }
                        
                    });
            	} 
            	break;            

            default:
                break;
        }
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
    
    private void DealErrorWithVibrate(){
        long [] pattern = {100,400};   
        vibrator.vibrate(pattern,-1); 
    }
    
    private void DealSuccessWithVibrate(){
        long [] pattern = {100,400,100,400};   
        vibrator.vibrate(pattern,-1);           
    }
    
}
