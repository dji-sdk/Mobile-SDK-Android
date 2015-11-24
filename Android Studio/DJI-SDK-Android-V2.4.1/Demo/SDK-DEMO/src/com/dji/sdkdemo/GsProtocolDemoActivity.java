package com.dji.sdkdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import com.dji.sdkdemo.CameraProtocolDemoActivity.Task;
import com.dji.sdkdemo.CameraProtocolDemoActivity.pickerValueChangeListener;
import com.dji.sdkdemo.widget.PopupNumberPicker;

import dji.sdk.api.DJIDrone;
import dji.sdk.api.DJIDroneTypeDef.DJIDroneType;
import dji.sdk.api.DJIError;
import dji.sdk.api.Camera.DJICameraDecodeTypeDef.DecoderType;
import dji.sdk.api.Camera.DJICameraSettingsTypeDef.CameraPhotoFormatType;
import dji.sdk.api.Gimbal.DJIGimbalRotation;
import dji.sdk.api.GroundStation.DJIGroundStationExecutionPushInfo;
import dji.sdk.api.GroundStation.DJIGroundStationFlyingInfo;
import dji.sdk.api.GroundStation.DJIGroundStationMissionPushInfo;
import dji.sdk.api.GroundStation.DJIGroundStationTask;
import dji.sdk.api.GroundStation.DJIGroundStationTypeDef.DJIGroundStationFinishAction;
import dji.sdk.api.GroundStation.DJIGroundStationTypeDef.DJIGroundStationMovingMode;
import dji.sdk.api.GroundStation.DJIGroundStationTypeDef.DJIGroundStationPathMode;
import dji.sdk.api.GroundStation.DJIGroundStationTypeDef.DJINavigationFlightControlCoordinateSystem;
import dji.sdk.api.GroundStation.DJIGroundStationTypeDef.DJINavigationFlightControlHorizontalControlMode;
import dji.sdk.api.GroundStation.DJIGroundStationTypeDef.DJINavigationFlightControlVerticalControlMode;
import dji.sdk.api.GroundStation.DJIGroundStationTypeDef.DJINavigationFlightControlYawControlMode;
import dji.sdk.api.GroundStation.DJIGroundStationTypeDef.GroundStationFlightMode;
import dji.sdk.api.GroundStation.DJIGroundStationTypeDef.GroundStationOnWayPointAction;
import dji.sdk.api.GroundStation.DJIGroundStationTypeDef.GroundStationResult;
import dji.sdk.api.GroundStation.DJIGroundStationTypeDef.GroundStationStatusPushType;
import dji.sdk.api.GroundStation.DJIGroundStationTypeDef.GroundStationWayPointExecutionState;
import dji.sdk.api.GroundStation.DJIGroundStationWayPointAction;
import dji.sdk.api.GroundStation.DJIGroundStationWaypoint;
import dji.sdk.api.MainController.DJIMainControllerSystemState;
import dji.sdk.interfaces.DJIExecuteResultCallback;
import dji.sdk.interfaces.DJIGroundStationExecuteCallBack;
import dji.sdk.interfaces.DJIGroundStationExecutionPushInfoCallBack;
import dji.sdk.interfaces.DJIGroundStationFlyingInfoCallBack;
import dji.sdk.interfaces.DJIGroundStationMissionPushInfoCallBack;
import dji.sdk.interfaces.DJIMcuUpdateStateCallBack;
import dji.sdk.interfaces.DJIReceivedVideoDataCallBack;
import dji.sdk.widget.DjiGLSurfaceView;
import android.R.integer;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 */
public class GsProtocolDemoActivity extends DemoBaseActivity implements OnClickListener{

    private static final String TAG = "GsProtocolDemoActivity";
    
    private static final int NAVI_MODE_ATTITUDE = 0;
    private static final int NAVI_MODE_WAYPOINT = 1;
    private static final int EXECUTION_STATUS_UPLOAD_FINISH = 0;
    private static final int EXECUTION_STATUS_FINISH = 1;
    private static final int EXECUTION_STATUS_REACH_POINT = 2;
    
    private DjiGLSurfaceView mDjiGLSurfaceView;
    private DJIReceivedVideoDataCallBack mReceivedVideoDataCallBack = null;
    private DJIGroundStationFlyingInfoCallBack mGroundStationFlyingInfoCallBack = null;
    private DJIGroundStationMissionPushInfoCallBack mGroundStationMissionPushInfoCallBack = null;
    private DJIGroundStationExecutionPushInfoCallBack mGroundStationExecutionPushInfoCallBack = null;
    
    private DJIMcuUpdateStateCallBack mMcuUpdateStateCallBack = null;
    
    private GroundStationFlightMode flightMode;
    
    private Button mOpenGsButton;
    private Button mAddOneWaypointButton;
    private Button mRemoveWaypointButton;
    private Button mSetLoop;
    private Button mUploadWaypointButton;
    private Button mTakeOffButton;
    private Button mGohomeButton;
    private Button mCloseGsButton;
    private Button mPauseButton;
    private Button mResumeButton;
    
    private Button mYawLeftBtn;
    private Button mYawRightBtn;
    private Button mYawStopBtn;
    private Button mYawRotateTakePhotoBtn;
    private Button mDownloadResultBtn;
    
    private Button mPitchPlusBtn;
    private Button mPitchMinusBtn;
    private Button mPitchStopBtn;
    private Button mRollPlusBtn;
    private Button mRollMinusBtn;
    private Button mRollStopBtn;
    private Button mThottlePlusBtn;
    private Button mThottleMinusBtn;
    private Button mThottleStopBtn;
    
    private TextView mGroundStationTextView;
    private TextView mGroundStationTextView1;
    private ScrollView mGroundStationInfoScrollView;
    
    private final int SHOWTOAST = 1;
    
    private double homeLocationLatitude = -1;
    private double homeLocationLongitude = -1;   
    private boolean getHomePointFlag = false;
    private DJIGroundStationTask mTask;

    private TextView mConnectStateTextView;
    private TextView showTV;
    
    private Timer mTimer;
    private Timer mCheckYawTimer;
    
    private PopupNumberPicker mPopupNumberPicker = null;  
    private Context m_context;
    
    private View downloadResultView;
    private AlertDialog.Builder builder;
    
    private StringBuffer text1;
    private StringBuffer text2;
    
    private String GsInfoString = "";
    private String GsInfoString1 = "";
    
    private Handler downloadHandler;
    
    class Task extends TimerTask {
        //int times = 1;

        @Override
        public void run() 
        {
            //Log.d(TAG ,"==========>Task Run In!");
            checkConnectState(); 
        }

    };
    private int checkYawTimes = 0;
    class CheckYawTask extends TimerTask {

        @Override
        public void run() 
        {
            if(checkYawTimes >= 12){
                if(mCheckYawTimer != null){
                    Log.d(TAG ,"==========>mCheckYawTimer cancel!");
                    mCheckYawTimer.cancel();
                    mCheckYawTimer.purge();
                    mCheckYawTimer = null;
                    
                    new Thread()
                    {
                        public void run()
                        {
                                
                            DJIDrone.getDjiGroundStation().setAircraftYawSpeed(0, new DJIGroundStationExecuteCallBack(){

                                @Override
                                public void onResult(GroundStationResult result) {
                                    // TODO Auto-generated method stub
                                    
                                }
                                
                            });
                        }
                    }.start();
                }
                return;
            }
            
            checkYawTimes++;
            Log.d(TAG ,"==========>mCheckYawTimer checkYawTimes="+checkYawTimes);
            
            new Thread()
            {
                public void run()
                {
                        
                    DJIDrone.getDjiGroundStation().setAircraftYawSpeed(300, new DJIGroundStationExecuteCallBack(){

                        @Override
                        public void onResult(GroundStationResult result) {
                            // TODO Auto-generated method stub
                            
                        }
                        
                    });
                    
                    DJIDrone.getDjiCamera().startTakePhoto(new DJIExecuteResultCallback(){

                        @Override
                        public void onResult(DJIError mErr)
                        {
                            // TODO Auto-generated method stub

                            Log.d(TAG, "Start Takephoto errorCode = "+ mErr.errorCode);
                            Log.d(TAG, "Start Takephoto errorDescription = "+ mErr.errorDescription);
                            String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                            handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                                   
                        }
                        
                    });
                }
            }.start();
            
            
        }

    };
    
    
    private void checkConnectState(){
        
        GsProtocolDemoActivity.this.runOnUiThread(new Runnable(){

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
    
    private void setResultToToast(String result){
        Toast.makeText(GsProtocolDemoActivity.this, result, Toast.LENGTH_SHORT).show();
    }
    
    private boolean checkGetHomePoint(){
        if(!getHomePointFlag){
            setResultToToast(getString(R.string.gs_not_get_home_point));
        }
        return getHomePointFlag;
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_gs_protocol_demo);
        
        DJIDrone.getDjiCamera().setDecodeType(DecoderType.Software);
        
        text1 = new StringBuffer();
        text2 = new StringBuffer();
        
        mDjiGLSurfaceView = (DjiGLSurfaceView)findViewById(R.id.DjiSurfaceView_gs);         
        mOpenGsButton = (Button)findViewById(R.id.OpenGsButton);

        mAddOneWaypointButton = (Button)findViewById(R.id.AddWaypointButton);
        mRemoveWaypointButton = (Button)findViewById(R.id.RemoveWaypointButton);
        mSetLoop = (Button)findViewById(R.id.GsSetLoop);
        mUploadWaypointButton = (Button)findViewById(R.id.UploadWaypointButton);
        mTakeOffButton = (Button)findViewById(R.id.TakeOffButton);
        mGohomeButton = (Button)findViewById(R.id.GohomeButton);
        mCloseGsButton = (Button)findViewById(R.id.CloseGsButton);
        mPauseButton = (Button)findViewById(R.id.PauseButton);
        mResumeButton = (Button)findViewById(R.id.ResumeButton);       
        mYawLeftBtn = (Button)findViewById(R.id.GsYawLeftButton);
        mYawRightBtn = (Button)findViewById(R.id.GsYawRightButton);
        mYawStopBtn = (Button)findViewById(R.id.GsYawStopButton);
        mYawRotateTakePhotoBtn = (Button)findViewById(R.id.GsYawRotateTakePhotoButton);         
        mConnectStateTextView = (TextView)findViewById(R.id.ConnectStateGsTextView);
        
        mPitchPlusBtn = (Button)findViewById(R.id.GsPitchPlusButton);
        mPitchMinusBtn = (Button)findViewById(R.id.GsPitchMinusButton);
        mPitchStopBtn = (Button)findViewById(R.id.GsPitchStopButton);
        mRollPlusBtn = (Button)findViewById(R.id.GsRollPlusButton);
        mRollMinusBtn = (Button)findViewById(R.id.GsRollMinusButton);
        mRollStopBtn = (Button)findViewById(R.id.GsRollStopButton);
        mThottlePlusBtn = (Button)findViewById(R.id.GsThrottlePlusButton);
        mThottleMinusBtn = (Button)findViewById(R.id.GsThrottleMinusButton);
        mThottleStopBtn = (Button)findViewById(R.id.GsThrottleStopButton);
        mDownloadResultBtn = (Button)findViewById(R.id.GroundStationDownloadResult);

        mOpenGsButton.setOnClickListener(this);
        mAddOneWaypointButton.setOnClickListener(this);
        mRemoveWaypointButton.setOnClickListener(this);
        mSetLoop.setOnClickListener(this);
        mUploadWaypointButton.setOnClickListener(this);
        mTakeOffButton.setOnClickListener(this);
        mGohomeButton.setOnClickListener(this);
        mCloseGsButton.setOnClickListener(this);  
        mYawLeftBtn.setOnClickListener(this);
        mYawRightBtn.setOnClickListener(this);
        mYawStopBtn.setOnClickListener(this);
        mYawRotateTakePhotoBtn.setOnClickListener(this);
        mPauseButton.setOnClickListener(this);
        mResumeButton.setOnClickListener(this);
        
        mPitchPlusBtn.setOnClickListener(this);
        mPitchMinusBtn.setOnClickListener(this);
        mPitchStopBtn.setOnClickListener(this);
        mRollPlusBtn.setOnClickListener(this);
        mRollMinusBtn.setOnClickListener(this);
        mRollStopBtn.setOnClickListener(this);
        mThottlePlusBtn.setOnClickListener(this);
        mThottleMinusBtn.setOnClickListener(this);
        mThottleStopBtn.setOnClickListener(this);
        mDownloadResultBtn.setOnClickListener(this);
        
        mGroundStationTextView = (TextView)findViewById(R.id.GroundStationInfoTV);
        mGroundStationTextView1 = (TextView)findViewById(R.id.GroundStationInfoTV2);
        mGroundStationInfoScrollView = (ScrollView)findViewById(R.id.GroundStationInfoScrollView);
        
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
                homeLocationLatitude = state.droneLocationLatitude;
                homeLocationLongitude = state.droneLocationLongitude;
                
                if(homeLocationLatitude != -1 && homeLocationLongitude != -1 && homeLocationLatitude != 0 && homeLocationLongitude != 0){
                    getHomePointFlag = true;
                }
                else{
                    getHomePointFlag = false;
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
            	            	
			}
        	
        };

        DJIDrone.getDjiGroundStation().setGroundStationFlyingInfoCallBack(mGroundStationFlyingInfoCallBack);
        
        mGroundStationMissionPushInfoCallBack = new DJIGroundStationMissionPushInfoCallBack() {

			@Override
			public void onResult(DJIGroundStationMissionPushInfo info) {
				// TODO Auto-generated method stub
				StringBuffer sb = new StringBuffer();
				switch(info.missionType.value()) {
				    case NAVI_MODE_WAYPOINT : {
				        sb.append("Mission Type : " + info.missionType.toString()).append("\n");
                        sb.append("Mission Target Index : " + info.targetWayPointIndex).append("\n");
				        sb.append("Mission Current Status : " + GroundStationWayPointExecutionState.find(info.currState).toString()).append("\n");
//                        sb.append("Mission : " + info.targetWayPointIndex).append("\n");
                        break;
				    }
				    
				    case NAVI_MODE_ATTITUDE : {
				        sb.append("Mission Type : " + info.missionType.toString()).append("\n");
				        sb.append("Mission Reserve : " + info.reserved).append("\n");
				        break;
				    }
				    
				    default :
				        sb.append("Worng Selection").append("\n");
				}
				
				GsInfoString = sb.toString();
                
                GsProtocolDemoActivity.this.runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        // TODO Auto-generated method stub
                        mGroundStationTextView.setText(GsInfoString);
                    }
                    
                });
			}
        	
        };
        
        DJIDrone.getDjiGroundStation().setGroundStationMissionPushInfoCallBack(mGroundStationMissionPushInfoCallBack);
                
        mGroundStationExecutionPushInfoCallBack = new DJIGroundStationExecutionPushInfoCallBack() {

			@Override
			public void onResult(DJIGroundStationExecutionPushInfo info) {
				// TODO Auto-generated method stub
				StringBuffer sb = new StringBuffer();
				switch(info.eventType.value()) {
				    case EXECUTION_STATUS_UPLOAD_FINISH : {
				        sb.append("Execution Type : " + info.eventType.toString()).append("\n");
				        sb.append("Validation : " + (info.isMissionValid ? "true" : "false")).append("\n");
				        sb.append("Estimated run time : " + info.estimateRunTime).append("\n");
				        break;
				    }
				    
				    case EXECUTION_STATUS_FINISH : {
				        sb.append("Execution Type : " + info.eventType.toString()).append("\n");
				        sb.append("Repeat : " + Integer.toString(info.isRepeat)).append("\n");
//				        sb.append("Reserve: " + GroundStationWayPointExecutionState.find(info.reserved).toString()).append("\n");
                        break;
                    }
				    
				    case EXECUTION_STATUS_REACH_POINT : {
				        sb.append("Execution Type : " + info.eventType.toString()).append("\n");
                        sb.append("WayPoint index : " + info.wayPointIndex).append("\n");
                        sb.append("Current State : " + GroundStationWayPointExecutionState.find(info.currentState).toString()).append("\n");
                        sb.append("Reserve : " + info.reserved).append("\n");
                        break;
                    }
				}
				
			    GsInfoString1 = sb.toString();
				
				GsProtocolDemoActivity.this.runOnUiThread(new Runnable() {

					@Override
					public void run() {
						// TODO Auto-generated method stub
						mGroundStationTextView1.setText(GsInfoString1);
					}
					
				});
			}
        	
        };
        
        DJIDrone.getDjiGroundStation().setGroundStationExecutionPushInfoCallBack(mGroundStationExecutionPushInfoCallBack);
        
        mTask = new DJIGroundStationTask();
        
        m_context = this.getApplicationContext();
        
        if(DJIDrone.getDroneType() == DJIDroneType.DJIDrone_Vision){
            mGroundStationInfoScrollView.setVisibility(View.INVISIBLE);
            mDownloadResultBtn.setVisibility(View.INVISIBLE);
        }
        

        DJIDrone.getDjiGroundStation().setGroundStationFlyingInfoCallBack(new DJIGroundStationFlyingInfoCallBack() {
            
            @Override
            public void onResult(DJIGroundStationFlyingInfo mInfo)
            {
                StringBuffer sb = new StringBuffer();
                
                sb.append("Altitude = ").append(mInfo.altitude).append("\n");
                sb.append("Way Point Index = ").append(mInfo.targetWaypointIndex).append("\n");
                sb.append("Aircraft's Pitch = ").append(mInfo.pitch).append("\n");
                sb.append("Aircraft's Roll = ").append(mInfo.roll).append("\n");
                sb.append("Aircraft's Yaw = ").append(mInfo.yaw).append("\n");
                sb.append("Aircraft's velocityX = ").append(mInfo.velocityX).append("\n");
                sb.append("Aircraft's veloctiyY = ").append(mInfo.velocityY).append("\n");
                sb.append("Aircraft's veloctiyZ = ").append(mInfo.velocityZ).append("\n");
                
//                handler.sendMessage(handler.obtainMessage(SHOWTOAST, sb.toString()));
            }
        });
    }
    
    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        mDjiGLSurfaceView.resume();
        
        mTimer = new Timer();
        Task task = new Task();
        mTimer.schedule(task, 0, 500);
       
        DJIDrone.getDjiMainController().startUpdateTimer(1000);
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
        
        DJIDrone.getDjiMainController().stopUpdateTimer();
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
        super.onDestroy();
    }
    


    @Override
    public void onClick(View v) {
        List<String> strlist = null;

        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.OpenGsButton:
                if(!checkGetHomePoint()) return;
            	Log.v("Inspire", "ButtonOnClick");
            	
                DJIDrone.getDjiGroundStation().openGroundStation(new DJIGroundStationExecuteCallBack(){

                    @Override
                    public void onResult(GroundStationResult result) {
                        // TODO Auto-generated method stub
                        String ResultsString = "return code =" + result.toString();
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
                
            case R.id.RemoveWaypointButton:
                if (mPopupNumberPicker != null)
                    mPopupNumberPicker.dismiss();
                strlist = new ArrayList<String>();                

                int size = mTask.mWaypointsList.size();
                if (size != 0) {
                    for (int i = 0; i < size; i++){
                        strlist.add(i+"");
                    }
                    mPopupNumberPicker = new PopupNumberPicker(m_context,
                            strlist,
                            new pickerValueChangeListener(){
    
                                @Override
                                public void onValueChange(int pos1, int pos2) {
                                    //Log.d(TAG,"pos1 = "+ pos1 +", pos2 = "+pos2);
                                    mPopupNumberPicker.dismiss();
                                    mPopupNumberPicker = null;
                                    
                                    //Log.d(TAG,"CameraActionWhenBreak.values()[pos1].toString() = "+CameraActionWhenBreak.values()[pos1].toString());
                                    
                                    mTask.removeWaypointAtIndex(pos1);
                                    
                                    Log.v("setloop", pos1+"");
                                    
                                }}, 250,
                            200, 0);
                    mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                            Gravity.CENTER, 0, 0);
                } else {
                    String ResultsString = "There is no way point";
                    handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                }
                break;            
                
            case R.id.GsSetLoop:
                if (mPopupNumberPicker != null)
                    mPopupNumberPicker.dismiss();

                strlist = new ArrayList<String>();                

                strlist.add("True");
                strlist.add("False");

                mPopupNumberPicker = new PopupNumberPicker(m_context,
                        strlist,
                        new pickerValueChangeListener(){

                            @Override
                            public void onValueChange(int pos1, int pos2) {
                                //Log.d(TAG,"pos1 = "+ pos1 +", pos2 = "+pos2);
                                mPopupNumberPicker.dismiss();
                                mPopupNumberPicker = null;
                                
                                if (0 == pos1) {
                                    mTask.setLoop(true);
                                    mTask.repeatNum = 2;
                                } else {
                                    mTask.setLoop(false);
                                    mTask.repeatNum = 0;
                                }
                                
                                Log.v("setloop", pos1+"");
                                
                            }}, 250,
                        200, 0);
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                break;
            case R.id.UploadWaypointButton:
                if(!checkGetHomePoint()) return;
                
                DJIDrone.getDjiGroundStation().uploadGroundStationTask(mTask, new DJIGroundStationExecuteCallBack(){

                    @Override
                    public void onResult(GroundStationResult result) {
                        // TODO Auto-generated method stub
                        String ResultsString = "return code =" + result.toString();
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
                        String ResultsString = "return code =" + result.toString();
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
                        String ResultsString = "return code =" + result.toString();
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
                        String ResultsString = "return code =" + result.toString();
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
                        String ResultsString = "return code =" + result.toString();
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
                        String ResultsString = "return code =" + result.toString();
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }

                });  
                break; 
                
            case R.id.GsYawLeftButton:                
                new Thread()
                {
                    public void run()
                    {
                            
                        DJIDrone.getDjiGroundStation().setAircraftYawSpeed(-100, new DJIGroundStationExecuteCallBack(){

                            @Override
                            public void onResult(GroundStationResult result) {
                                // TODO Auto-generated method stub
                                
                            }
                            
                        });
                    }
                }.start();

                break;  
                
            case R.id.GsYawRightButton:                
                new Thread()
                {
                    public void run()
                    {
                            
                        DJIDrone.getDjiGroundStation().setAircraftYawSpeed(100, new DJIGroundStationExecuteCallBack(){

                            @Override
                            public void onResult(GroundStationResult result) {
                                // TODO Auto-generated method stub
                                
                            }
                            
                        });
                    }
                }.start();
                
                break; 

            case R.id.GsYawStopButton:                
                new Thread()
                {
                    public void run()
                    {
                            
                        DJIDrone.getDjiGroundStation().setAircraftYawSpeed(0, new DJIGroundStationExecuteCallBack(){

                            @Override
                            public void onResult(GroundStationResult result) {
                                // TODO Auto-generated method stub
                            	String ResultsString = "return code =" + result.toString();
                                handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                            }
                            
                        });
                    }
                }.start();
                
                break; 
                
            case R.id.GsYawRotateTakePhotoButton:    
                if(mCheckYawTimer != null) return;
                
                checkYawTimes = 0;
                mCheckYawTimer = new Timer();
                CheckYawTask mCheckYawTask = new CheckYawTask();
                mCheckYawTimer.schedule(mCheckYawTask, 100, 3000);
                
//                new Thread()
//                {
//                    public void run()
//                    {
//                            
//                        DJIDrone.getDjiGroundStation().setAircraftYawSpeed(100, new DJIGroundStationExecuteCallBack(){
//
//                            @Override
//                            public void onResult(GroundStationResult result) {
//                                // TODO Auto-generated method stub
//                                
//                            }
//                            
//                        });
//                    }
//                }.start();
            	

                break;
                
            case R.id.GsPitchPlusButton:                
                DJIDrone.getDjiGroundStation().setAircraftPitchSpeed(200, new DJIGroundStationExecuteCallBack(){

                    @Override
                    public void onResult(GroundStationResult result) {
                        // TODO Auto-generated method stub
                        
                    }
                    
                });
                break;
                
            case R.id.GsPitchMinusButton:                
                DJIDrone.getDjiGroundStation().setAircraftPitchSpeed(-200, new DJIGroundStationExecuteCallBack(){

                    @Override
                    public void onResult(GroundStationResult result) {
                        // TODO Auto-generated method stub
                        
                    }
                    
                });
                break;   
                
            case R.id.GsPitchStopButton:                
                DJIDrone.getDjiGroundStation().setAircraftPitchSpeed(0, new DJIGroundStationExecuteCallBack(){

                    @Override
                    public void onResult(GroundStationResult result) {
                        // TODO Auto-generated method stub
                        
                    }
                    
                });
                break; 
                
            case R.id.GsRollPlusButton:                
                         
                DJIDrone.getDjiGroundStation().setAircraftRollSpeed(200, new DJIGroundStationExecuteCallBack(){

                    @Override
                    public void onResult(GroundStationResult result) {
                        // TODO Auto-generated method stub
                        
                    }
                    
                });
                
                break;
                
            case R.id.GsRollMinusButton:                
                DJIDrone.getDjiGroundStation().setAircraftRollSpeed(-200, new DJIGroundStationExecuteCallBack(){

                    @Override
                    public void onResult(GroundStationResult result) {
                        // TODO Auto-generated method stub
                        
                    }
                    
                });
                break;

            case R.id.GsRollStopButton:                                            
                DJIDrone.getDjiGroundStation().setAircraftRollSpeed(0, new DJIGroundStationExecuteCallBack(){

                    @Override
                    public void onResult(GroundStationResult result) {
                        // TODO Auto-generated method stub
                        
                    }
                    
                });
                break;
                
            case R.id.GsThrottlePlusButton:  
                DJIDrone.getDjiGroundStation().setAircraftThrottle(1, new DJIGroundStationExecuteCallBack(){
    
                    @Override
                    public void onResult(GroundStationResult result) {
                        // TODO Auto-generated method stub
                        
                    }
                    
                });
                
                break;
  
            case R.id.GsThrottleMinusButton:       
                DJIDrone.getDjiGroundStation().setAircraftThrottle(2, new DJIGroundStationExecuteCallBack(){

                    @Override
                    public void onResult(GroundStationResult result) {
                        // TODO Auto-generated method stub
                        
                    }
                    
                });
                
                break;

            case R.id.GsThrottleStopButton:{                
                DJIDrone.getDjiGroundStation().setAircraftThrottle(0, new DJIGroundStationExecuteCallBack(){

                    @Override
                    public void onResult(GroundStationResult result) {
                        // TODO Auto-generated method stub
                        
                    }
                    
                });
                break;
            }
            
            case R.id.GroundStationDownloadResult : {
                LayoutInflater inflater = LayoutInflater.from(this);
                downloadResultView = inflater.inflate(R.layout.show_view, null);
                builder = new AlertDialog.Builder(GsProtocolDemoActivity.this);
                builder.setCancelable(true);
                builder.setTitle("Download Result");
                builder.setView(downloadResultView);
                DJIDrone.getDjiGroundStation().downloadGroundStationTask(new DJIGroundStationExecuteCallBack() {

                    @Override
                    public void onResult(GroundStationResult result)
                    {
                        // TODO Auto-generated method stub
                        if (result == GroundStationResult.GS_Result_Success) {
                            final DJIGroundStationTask task = DJIDrone.getDjiGroundStation().getDJIGroundStationTask();
                            showTV = (TextView)downloadResultView.findViewById(R.id.ShowTextView);
                            StringBuffer str = new StringBuffer();
                            Log.d(TAG, "taskwaypointcount "+task.wayPointCount);
                            for (int i = 0; i < task.wayPointCount; i++){
                                str.append(i + " latitude : " + task.mWaypointsList.get(i).latitude+"\n");
                                str.append(i + " longitude : " + task.mWaypointsList.get(i).longitude+"\n");
                                str.append(i + " hasAction : " + (task.mWaypointsList.get(i).hasAction ? "True" : "False") + "\n");
                                str.append(i + " maxReachTime : " + task.mWaypointsList.get(i).maxReachTime + "\n\n");
                            }
                            showTV.setText(str);
                            Looper.prepare();
                            builder.create().show();
                            Looper.loop();
                        }
                    }
                    
                });
                break;
//                handler.sendMessage(handler.obtainMessage(SHOWTOAST, flightMode.toString()));
            }

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
    
}
