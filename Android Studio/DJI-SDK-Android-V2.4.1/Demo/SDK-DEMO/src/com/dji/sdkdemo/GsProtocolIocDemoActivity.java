
package com.dji.sdkdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import com.dji.sdkdemo.CameraProtocolDemoActivity.pickerValueChangeListener;
import com.dji.sdkdemo.widget.PopupNumberPicker;

import dji.sdk.api.DJIDrone;
import dji.sdk.api.Camera.DJICameraDecodeTypeDef.DecoderType;
import dji.sdk.api.GroundStation.DJIGroundStationFlyingInfo;
import dji.sdk.api.GroundStation.DJIGroundStationTypeDef.GroundStationResult;
import dji.sdk.api.GroundStation.DJIGroundStationTypeDef.DJIGroundStationIocType;
import dji.sdk.api.MainController.DJIMainControllerSystemState;
import dji.sdk.api.MainController.DJIMainControllerTypeDef.DJIMcFunctionType;
import dji.sdk.interfaces.DJIExecuteBooleanResultCallback;
import dji.sdk.interfaces.DJIGroundStationExecuteCallBack;
import dji.sdk.interfaces.DJIGroundStationFlyingInfoCallBack;
import dji.sdk.interfaces.DJIMcuUpdateStateCallBack;
import dji.sdk.interfaces.DJIReceivedVideoDataCallBack;
import dji.sdk.widget.DjiGLSurfaceView;
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

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 */
public class GsProtocolIocDemoActivity extends DemoBaseActivity implements OnClickListener{

    private static final String TAG = "GsProtocolIocDemoActivity";

    private DjiGLSurfaceView mDjiGLSurfaceView;
    private DJIReceivedVideoDataCallBack mReceivedVideoDataCallBack = null;
    private DJIGroundStationFlyingInfoCallBack mGroundStationFlyingInfoCallBack = null;
    private DJIMcuUpdateStateCallBack mMcuUpdateStateCallBack = null;

    
    private Button mOpenGsButton;
    private Button mEnterIocButton;
    private Button mExitIocButton;
    private Button mCloseGsButton;

    private final int SHOWTOAST = 1;
    
    private double homeLocationLatitude = -1;
    private double homeLocationLongitude = -1;   
    private boolean getHomePointFlag = false;

    private TextView mConnectStateTextView;
    private Timer mTimer;
    
    private PopupNumberPicker mPopupNumberPicker = null;  
    private Context m_context;

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
        
        GsProtocolIocDemoActivity.this.runOnUiThread(new Runnable(){

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
        Toast.makeText(GsProtocolIocDemoActivity.this, result, Toast.LENGTH_SHORT).show();
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

        setContentView(R.layout.activity_gs_protocol_ioc_demo);
       
        DJIDrone.getDjiCamera().setDecodeType(DecoderType.Software);
        
        mDjiGLSurfaceView = (DjiGLSurfaceView)findViewById(R.id.DjiSurfaceView_gs);         
        mOpenGsButton = (Button)findViewById(R.id.OpenGsButton);
        mEnterIocButton = (Button)findViewById(R.id.EnterIocButton);
        mExitIocButton = (Button)findViewById(R.id.ExitIocButton);
        mCloseGsButton = (Button)findViewById(R.id.CloseGsButton);
        mConnectStateTextView = (TextView)findViewById(R.id.ConnectStateGsTextView);
        
       
        mOpenGsButton.setOnClickListener(this);
        mEnterIocButton.setOnClickListener(this);
        mExitIocButton.setOnClickListener(this);
        mCloseGsButton.setOnClickListener(this);  
        
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
                    Log.e(TAG,"IOCState "+state.IOCState + " IOCType "+state.IOCType);
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

        m_context = this.getApplicationContext();

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
        super.onDestroy();
    }
    


    @Override
    public void onClick(View v) {
        List<String> strlist = null;

        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.OpenGsButton:
                if(!checkGetHomePoint()) return;
            	
                DJIDrone.getDjiGroundStation().openGroundStation(new DJIGroundStationExecuteCallBack(){

                    @Override
                    public void onResult(GroundStationResult result) {
                        // TODO Auto-generated method stub
                        String ResultsString = "open gs code =" + result.toString();
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }
                    
                }); 
                
                break;
                
            case R.id.EnterIocButton:
                if(!checkGetHomePoint()) return;
                
                if (mPopupNumberPicker != null)
                    mPopupNumberPicker.dismiss();

                strlist = new ArrayList<String>();                

                strlist.add("CourseLock");
                strlist.add("HomeLock");

                mPopupNumberPicker = new PopupNumberPicker(m_context,
                        strlist,
                        new pickerValueChangeListener(){

                            @Override
                            public void onValueChange(int pos1, int pos2) {
                                //Log.d(TAG,"pos1 = "+ pos1 +", pos2 = "+pos2);
                                mPopupNumberPicker.dismiss();
                                mPopupNumberPicker = null;
                                
                                DJIGroundStationIocType mIocType = DJIGroundStationIocType.IOCTypeCourseLock;
                                if(pos1 == 0){
                                    mIocType = DJIGroundStationIocType.IOCTypeCourseLock;
                                    
                                    DJIDrone.getDjiMainController().setAircraftFuctionType(DJIMcFunctionType.Lock_Course, new DJIExecuteBooleanResultCallback() {
                                        
                                        @Override
                                        public void onResult(boolean result)
                                        {
                                            // TODO Auto-generated method stub
                                            String ResultsString = "Lock course code =" + result;
                                            handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));                                            
                                        }
                                    });
                                }
                                else{
                                    mIocType = DJIGroundStationIocType.IOCTypeHomeLock;
                                }
                                
                                
                                DJIDrone.getDjiGroundStation().enterIocMode(mIocType, new DJIGroundStationExecuteCallBack(){

                                    @Override
                                    public void onResult(GroundStationResult result) {
                                        // TODO Auto-generated method stub
                                        String ResultsString = "enter ioc code =" + result.toString();
                                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                                    }
                                    
                                }); 
                                
                                
                            }}, 250,
                        200, 0);
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                
                break;
                
            case R.id.ExitIocButton:
                if(!checkGetHomePoint()) return;
                
                DJIDrone.getDjiGroundStation().exitIocMode(new DJIGroundStationExecuteCallBack(){

                    @Override
                    public void onResult(GroundStationResult result) {
                        // TODO Auto-generated method stub
                        String ResultsString = "exit ioc code =" + result.toString();
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
                        String ResultsString = "close gs code =" + result.toString();
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, ResultsString));
                    }

                });  
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
    
}
