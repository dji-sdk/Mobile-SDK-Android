package com.dji.sdkdemo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import com.dji.sdkdemo.widget.PopupNumberPickerDouble;
import com.dji.sdkdemo.widget.PopupNumberPicker;
import com.dji.sdkdemo.widget.PopupNumberPickerDoubleRecording;

import dji.sdk.api.DJIDrone;
import dji.sdk.api.DJIDroneTypeDef.DJIDroneType;
import dji.sdk.api.DJIError;
import dji.sdk.api.Camera.DJICameraFileNamePushInfo;
import dji.sdk.api.Camera.DJICameraPlaybackState;
import dji.sdk.api.Camera.DJICameraSDCardInfo;
import dji.sdk.api.Camera.DJICameraShutterSpeed;
import dji.sdk.api.Camera.DJICameraSystemState;
import dji.sdk.api.Camera.DJIInspireCamera;
import dji.sdk.api.Camera.DJICameraDecodeTypeDef.DecoderType;
import dji.sdk.api.Camera.DJICameraSettingsTypeDef.*;
import dji.sdk.api.media.DJIMedia;
import dji.sdk.interfaces.DJICameraFileNameInfoCallBack;
import dji.sdk.interfaces.DJICameraPlayBackStateCallBack;
import dji.sdk.interfaces.DJICameraSdCardInfoCallBack;
import dji.sdk.interfaces.DJICameraSystemStateCallBack;
import dji.sdk.interfaces.DJIExecuteResultCallback;
import dji.sdk.interfaces.DJIExecuteStringResultCallback;
import dji.sdk.interfaces.DJIFileDownloadCallBack;
import dji.sdk.interfaces.DJIMediaFetchCallBack;
import dji.sdk.interfaces.DJIReceivedVideoDataCallBack;
import dji.sdk.util.DjiLocationCoordinate2D;
import dji.sdk.widget.DjiGLSurfaceView;
import android.R.integer;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class CameraProtocolDemoActivity extends DemoBaseActivity implements OnClickListener
{
    private static final String TAG = "CameraProtocolDemoActivity";
    
    private Button mStartTakePhotoBtn;
    private Button mStopTakePhotoBtn;
    private Button mStartRecordingBtn;
    private Button mStopRecordingBtn;
    private Button m_camera_set_workmode_btn;
    private Button m_camera_set_photosize_btn;
    private Button m_camera_get_photosize_btn;   
    private Button m_camera_set_iso_btn;
    private Button m_camera_get_iso_btn;
    private Button m_camera_set_whitebalance_btn;
    private Button m_camera_get_whitebalance_btn;
    private Button m_camera_set_exposuremetering_btn;
    private Button m_camera_get_exposuremetering_btn;
    private Button m_camera_set_exposurecompensation_btn;
    private Button m_camera_get_exposurecompensation_btn;
    private Button m_camera_set_antiflicker_btn;
    private Button m_camera_get_antiflicker_btn;
    private Button m_camera_set_sharpness_btn;
    private Button m_camera_get_sharpness_btn;
    private Button m_camera_set_contrast_btn;
    private Button m_camera_get_contrast_btn;
    private Button m_camera_set_mutiphotocount_btn;
    private Button m_camera_get_mutiphotocount_btn;
    private Button m_camera_set_cameraaction_btn;
    private Button m_camera_get_cameraaction_btn;
    private Button m_camera_set_photoformat_btn;
    private Button m_camera_get_photoformat_btn;
    private Button m_camera_set_recordingparam_btn;
    private Button m_camera_get_recordingparam_btn;
    private Button m_camera_set_continuousparam_btn;
    private Button m_camera_get_continuousparam_btn;
        
    private Button m_camera_set_mode_btn;
    private Button m_camera_get_version_btn;
    private Button m_camera_get_visiontype_btn;
    private Button m_camera_get_connectisok_btn;
    private Button m_camera_sync_time_btn;
    private Button m_camera_save_config_btn;
    private Button m_camera_restore_default_btn;
    private Button m_camera_format_sdcard_btn;
    
    //inspire playback mode button
    private Button m_camera_toggle_state_btn;
    private Button m_camera_multi_preview_mode_btn;
    private Button m_camera_multi_preview_nextpage_btn;
    private Button m_camera_multi_preview_prevpage_btn;
    private Button m_camera_multi_edit_enter_btn;
    private Button m_camera_multi_edit_exit_btn;
    private Button m_camera_multi_edit_select_file_btn;
    private Button m_camera_multi_edit_unselect_file_btn;
    private Button m_camera_multi_edit_select_allfile_btn;
    private Button m_camera_multi_edit_unselect_allfile_btn;
    private Button m_camera_multi_edit_select_page_btn;
    private Button m_camera_multi_edit_unselect_page_btn;
    private Button m_camera_multi_edit_delete_all_select_btn;
    private Button m_camera_multi_edit_download_all_select_btn;
    
    private Button m_camera_single_preview_mode_btn;
    private Button m_camera_single_preview_nextpage_btn;
    private Button m_camera_single_preview_prevpage_btn;
    private Button m_camera_single_preview_delect_current_btn;
    
    private Button m_camera_single_preview_play_video_btn;
    private Button m_camera_single_preview_stop_video_btn;
    private Button m_camera_single_preview_seek_video_btn;
    
    private ScrollView mScrollView;
    private RelativeLayout mFunctionLayout;
    private TextView mCameraPlaybackStateTV;
    private ScrollView mCameraPlaybackStateScrollView;
    
    private DjiGLSurfaceView mDjiGLSurfaceView;
    private DJIReceivedVideoDataCallBack mReceivedVideoDataCallBack = null;
    
    private final int SHOWTOAST = 1;
    private final int SHOW_DOWNLOAD_PROGRESS_DIALOG = 2;
    private final int HIDE_DOWNLOAD_PROGRESS_DIALOG = 3;
    
    private TextView mConnectStateTextView;
    private Timer mTimer;
    
    private PopupNumberPicker mPopupNumberPicker = null;    
    private PopupNumberPickerDouble mPopupNumberPickerDouble = null;    
    private PopupNumberPickerDoubleRecording mPopupNumberPickerDoubleRecording = null;
    
    private Context m_context;
    
    private DJICameraFileNameInfoCallBack mCameraFileNameInfoCallBack = null;
    
    private int setValue = 0;
    
    private int mPlayBackThumbnailNum = -1;
    private int mPlayBackMediaFileNum = -1;
    private int mPlayBackCurrentSelectIndex = -1;
    private String mPlayBackStateString = "";
    private int mSdcardRemainSize = 0;
    
    private DJICameraPlayBackStateCallBack mCameraPlayBackStateCallBack = null;
    
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
        
        CameraProtocolDemoActivity.this.runOnUiThread(new Runnable(){

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

                case SHOW_DOWNLOAD_PROGRESS_DIALOG:
                    ShowDownloadProgressDialog();
                    break;  
                    
                case HIDE_DOWNLOAD_PROGRESS_DIALOG:
                    HideDownloadProgressDialog();
                    break; 
                    
                default:
                    break;
            }
            return false;
        }
    });
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_protocol_demo);
 
        DJIDrone.getDjiCamera().setDecodeType(DecoderType.Software);
        
        mDjiGLSurfaceView = (DjiGLSurfaceView)findViewById(R.id.DjiSurfaceView_02);
        
        mDjiGLSurfaceView.start();
        
        mReceivedVideoDataCallBack = new DJIReceivedVideoDataCallBack(){

            @Override
            public void onResult(byte[] videoBuffer, int size)
            {
                // TODO Auto-generated method stub
                mDjiGLSurfaceView.setDataToDecoder(videoBuffer, size);
            }

            
        };
        
        DJIDrone.getDjiCamera().setDjiCameraSystemStateCallBack(new DJICameraSystemStateCallBack() {
            
            @Override
            public void onResult(DJICameraSystemState state)
            {
                // TODO Auto-generated method stub
                if (state.isTakingContinusPhoto) {
                    handler.sendMessage(handler.obtainMessage(SHOWTOAST, "isTakingContinuousPhoto"));
                }
            }
        });
        
        DJIDrone.getDjiCamera().setReceivedVideoDataCallBack(mReceivedVideoDataCallBack);
        
        mCameraFileNameInfoCallBack = new DJICameraFileNameInfoCallBack(){

			@Override
			public void onResult(final DJICameraFileNamePushInfo mInfo) {
				// TODO Auto-generated method stub
				Log.d(TAG, "camera file info type = "+mInfo.type.toString());
				Log.d(TAG, "camera file info filePath = "+mInfo.filePath);
				Log.d(TAG, "camera file info fileName = "+mInfo.fileName);
			}        	
        };
             
        DJIDrone.getDjiCamera().setDjiCameraFileNameInfoCallBack(mCameraFileNameInfoCallBack);        
        
        mCameraPlayBackStateCallBack = new DJICameraPlayBackStateCallBack() {
            
            @Override
            public void onResult(DJICameraPlaybackState mState)
            {
                // TODO Auto-generated method stub
                
                StringBuffer sb = new StringBuffer();
                sb.append("playbackMode=").append(mState.playbackMode.toString()).append("\n");
                sb.append("mediaFileType=").append(mState.mediaFileType.toString())
                        .append("\n");
                sb.append("numbersOfThumbnail=").append(mState.numbersOfThumbnail).append("\n");
                sb.append("numbersOfMediaFiles=").append(mState.numbersOfMediaFiles).append("\n");
                sb.append("currentSelectedFileIndex=").append(mState.currentSelectedFileIndex).append("\n");
                sb.append("videoDuration=").append(mState.videoDuration).append("\n");
                sb.append("videoPlayProgress=").append(mState.videoPlayProgress).append("\n");
                sb.append("videoPlayPosition=").append(mState.videoPlayPosition)
                        .append("\n");
                sb.append("numbersOfSelected=").append(mState.numbersOfSelected).append("\n");
                sb.append("numbersOfPhotos=").append(mState.numbersOfPhotos).append("\n");
                sb.append("numbersOfVideos=").append(mState.numbersOfVideos).append("\n");
                sb.append("zoomScale=").append(mState.zoomScale).append("\n");
                sb.append("photoWidth=").append(mState.photoWidth).append("\n");
                sb.append("photoHeight=").append(mState.photoHeight).append("\n");
                sb.append("photoCenterCoordinateX=").append(mState.photoCenterCoordinateX).append("\n");
                sb.append("photoCenterCoordinateY=").append(mState.photoCenterCoordinateY).append("\n");
                sb.append("fileDeleteStatus=").append(mState.fileDeleteStatus.toString()).append("\n");
                sb.append("isAllFilesInPageSelected=").append(mState.isAllFilesInPageSelected).append("\n");
                sb.append("isSelectedFileValid=").append(mState.isSelectedFileValid).append("\n");
                sb.append("isFileDownloaded=").append(mState.isFileDownloaded);
                
                mPlayBackStateString = sb.toString();
                
                CameraProtocolDemoActivity.this.runOnUiThread(new Runnable(){

                    @Override
                    public void run() 
                    {   
                        mCameraPlaybackStateTV.setText(mPlayBackStateString);
                    }
                });
                
                mPlayBackThumbnailNum = mState.numbersOfThumbnail;
                mPlayBackMediaFileNum = mState.numbersOfMediaFiles;
                mPlayBackCurrentSelectIndex = mState.currentSelectedFileIndex;
            }
        };
        
        DJIDrone.getDjiCamera().setDJICameraPlayBackStateCallBack(mCameraPlayBackStateCallBack);
        
        DJIDrone.getDjiCamera().setDjiCameraSdcardInfoCallBack(new DJICameraSdCardInfoCallBack() {
            
            @Override
            public void onResult(DJICameraSDCardInfo mInfo)
            {
                // TODO Auto-generated method stub
                if(mSdcardRemainSize != mInfo.remainSize){
                    mSdcardRemainSize = mInfo.remainSize;
                    
                    //String result = "sdcard remain size =" + mSdcardRemainSize ;
                    //handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                }
            }
        });
        
        mScrollView = (ScrollView)findViewById(R.id.scrollView1);
        mCameraPlaybackStateTV = (TextView)findViewById(R.id.CameraPlaybackStateTV);
        mCameraPlaybackStateScrollView = (ScrollView)findViewById(R.id.CameraPlaybackStateScrollView);
        mFunctionLayout = (RelativeLayout)findViewById(R.id.function_rl);
        
        mStartTakePhotoBtn = (Button)findViewById(R.id.StartTakePhotoButton);
        mStopTakePhotoBtn = (Button)findViewById(R.id.StopTakePhotoButton);
        mStartRecordingBtn = (Button)findViewById(R.id.StartRecordingButton);
        mStopRecordingBtn = (Button)findViewById(R.id.StopRecordingButton);
        m_camera_set_workmode_btn = (Button)findViewById(R.id.SetWorkMode);
        m_camera_set_photosize_btn = (Button)findViewById(R.id.camera_set_photosize_btn);
        m_camera_get_photosize_btn = (Button)findViewById(R.id.camera_get_photosize_btn);   
        m_camera_set_iso_btn = (Button)findViewById(R.id.camera_set_iso_btn);
        m_camera_get_iso_btn = (Button)findViewById(R.id.camera_get_iso_btn);
        m_camera_set_whitebalance_btn = (Button)findViewById(R.id.camera_set_whitebalance_btn);
        m_camera_get_whitebalance_btn = (Button)findViewById(R.id.camera_get_whitebalance_btn);
        m_camera_set_exposuremetering_btn = (Button)findViewById(R.id.camera_set_exposuremetering_btn);
        m_camera_get_exposuremetering_btn = (Button)findViewById(R.id.camera_get_exposuremetering_btn);
        m_camera_set_exposurecompensation_btn = (Button)findViewById(R.id.camera_set_exposurecompensation_btn);
        m_camera_get_exposurecompensation_btn = (Button)findViewById(R.id.camera_get_exposurecompensation_btn);
        m_camera_set_antiflicker_btn = (Button)findViewById(R.id.camera_set_antiflicker_btn);
        m_camera_get_antiflicker_btn = (Button)findViewById(R.id.camera_get_antiflicker_btn);
        m_camera_set_sharpness_btn = (Button)findViewById(R.id.camera_set_sharpness_btn);
        m_camera_get_sharpness_btn = (Button)findViewById(R.id.camera_get_sharpness_btn);
        m_camera_set_contrast_btn = (Button)findViewById(R.id.camera_set_contrast_btn);
        m_camera_get_contrast_btn = (Button)findViewById(R.id.camera_get_contrast_btn);
        m_camera_set_mutiphotocount_btn = (Button)findViewById(R.id.camera_set_mutiphotocount_btn);
        m_camera_get_mutiphotocount_btn = (Button)findViewById(R.id.camera_get_mutiphotocount_btn);
        m_camera_set_cameraaction_btn = (Button)findViewById(R.id.camera_set_cameraaction_btn);
        m_camera_get_cameraaction_btn = (Button)findViewById(R.id.camera_get_cameraaction_btn);
        m_camera_set_photoformat_btn = (Button)findViewById(R.id.camera_set_photoformat_btn);
        m_camera_get_photoformat_btn = (Button)findViewById(R.id.camera_get_photoformat_btn);
        m_camera_set_recordingparam_btn = (Button)findViewById(R.id.camera_set_recordingparam_btn);
        m_camera_get_recordingparam_btn = (Button)findViewById(R.id.camera_get_recordingparam_btn);
        m_camera_set_continuousparam_btn = (Button)findViewById(R.id.camera_set_continuousparam_btn);
        m_camera_get_continuousparam_btn = (Button)findViewById(R.id.camera_get_continuousparam_btn);            
        m_camera_set_mode_btn = (Button)findViewById(R.id.camera_set_mode_btn);
        m_camera_get_version_btn = (Button)findViewById(R.id.camera_get_version_btn);
        m_camera_get_visiontype_btn = (Button)findViewById(R.id.camera_get_visiontype_btn);
        m_camera_get_connectisok_btn = (Button)findViewById(R.id.camera_get_connectisok_btn);
        m_camera_sync_time_btn = (Button)findViewById(R.id.camera_sync_time_btn);
        m_camera_save_config_btn = (Button)findViewById(R.id.camera_save_config_btn);
        m_camera_restore_default_btn = (Button)findViewById(R.id.camera_restore_default_btn);
        m_camera_format_sdcard_btn = (Button)findViewById(R.id.camera_format_sdcard_btn);

        m_camera_toggle_state_btn = (Button)findViewById(R.id.camera_toggle_state_btn);
        m_camera_multi_preview_mode_btn = (Button)findViewById(R.id.camera_multi_preview_mode_btn);
        m_camera_multi_preview_nextpage_btn = (Button)findViewById(R.id.camera_multi_preview_nextpage_btn);
        m_camera_multi_preview_prevpage_btn = (Button)findViewById(R.id.camera_multi_preview_prevpage_btn);
        m_camera_multi_edit_enter_btn = (Button)findViewById(R.id.camera_multi_edit_enter_btn);
        m_camera_multi_edit_exit_btn = (Button)findViewById(R.id.camera_multi_edit_exit_btn);
        m_camera_multi_edit_select_file_btn = (Button)findViewById(R.id.camera_multi_edit_select_file_btn);
        m_camera_multi_edit_unselect_file_btn = (Button)findViewById(R.id.camera_multi_edit_unselect_file_btn);
        m_camera_multi_edit_select_allfile_btn = (Button)findViewById(R.id.camera_multi_edit_select_allfile_btn);
        m_camera_multi_edit_unselect_allfile_btn = (Button)findViewById(R.id.camera_multi_edit_unselect_allfile_btn);
        m_camera_multi_edit_select_page_btn = (Button)findViewById(R.id.camera_multi_edit_select_page_btn);
        m_camera_multi_edit_unselect_page_btn = (Button)findViewById(R.id.camera_multi_edit_unselect_page_btn);
        m_camera_multi_edit_delete_all_select_btn = (Button)findViewById(R.id.camera_multi_edit_delete_all_select_btn);
        m_camera_multi_edit_download_all_select_btn = (Button)findViewById(R.id.camera_multi_edit_download_all_select_btn);
        
        m_camera_single_preview_mode_btn = (Button)findViewById(R.id.camera_single_preview_mode_btn);
        m_camera_single_preview_nextpage_btn = (Button)findViewById(R.id.camera_single_preview_nextpage_btn);
        m_camera_single_preview_prevpage_btn = (Button)findViewById(R.id.camera_single_preview_prevpage_btn);
        m_camera_single_preview_delect_current_btn = (Button)findViewById(R.id.camera_single_preview_delect_current_btn);
        
        m_camera_single_preview_play_video_btn = (Button)findViewById(R.id.camera_single_preview_play_video_btn);
        m_camera_single_preview_stop_video_btn = (Button)findViewById(R.id.camera_single_preview_stop_video_btn);
        m_camera_single_preview_seek_video_btn = (Button)findViewById(R.id.camera_single_preview_seek_video_btn);
        
        mStartTakePhotoBtn.setOnClickListener(this);
        mStopTakePhotoBtn.setOnClickListener(this);
        mStartRecordingBtn.setOnClickListener(this);
        mStopRecordingBtn.setOnClickListener(this);
        m_camera_set_workmode_btn.setOnClickListener(this);
        m_camera_set_photosize_btn.setOnClickListener(this);
        m_camera_get_photosize_btn.setOnClickListener(this);   
        m_camera_set_iso_btn.setOnClickListener(this);
        m_camera_get_iso_btn.setOnClickListener(this);
        m_camera_set_whitebalance_btn.setOnClickListener(this);
        m_camera_get_whitebalance_btn.setOnClickListener(this);
        m_camera_set_exposuremetering_btn.setOnClickListener(this);
        m_camera_get_exposuremetering_btn.setOnClickListener(this);
        m_camera_set_exposurecompensation_btn.setOnClickListener(this);
        m_camera_get_exposurecompensation_btn.setOnClickListener(this);
        m_camera_set_antiflicker_btn.setOnClickListener(this);
        m_camera_get_antiflicker_btn.setOnClickListener(this);
        m_camera_set_sharpness_btn.setOnClickListener(this);
        m_camera_get_sharpness_btn.setOnClickListener(this);
        m_camera_set_contrast_btn.setOnClickListener(this);
        m_camera_get_contrast_btn.setOnClickListener(this);
        m_camera_set_mutiphotocount_btn.setOnClickListener(this);
        m_camera_get_mutiphotocount_btn.setOnClickListener(this);
        m_camera_set_cameraaction_btn.setOnClickListener(this);
        m_camera_get_cameraaction_btn.setOnClickListener(this);
        m_camera_set_photoformat_btn.setOnClickListener(this);
        m_camera_get_photoformat_btn.setOnClickListener(this);
        m_camera_set_recordingparam_btn.setOnClickListener(this);
        m_camera_get_recordingparam_btn.setOnClickListener(this);
        m_camera_set_continuousparam_btn.setOnClickListener(this);
        m_camera_get_continuousparam_btn.setOnClickListener(this);            
        m_camera_set_mode_btn.setOnClickListener(this);
        m_camera_get_version_btn.setOnClickListener(this);
        m_camera_get_visiontype_btn.setOnClickListener(this);
        m_camera_get_connectisok_btn.setOnClickListener(this);
        m_camera_sync_time_btn.setOnClickListener(this);
        m_camera_save_config_btn.setOnClickListener(this);
        m_camera_restore_default_btn.setOnClickListener(this);
        m_camera_format_sdcard_btn.setOnClickListener(this);
        
        m_camera_toggle_state_btn.setOnClickListener(this);
        m_camera_multi_preview_mode_btn.setOnClickListener(this);
        m_camera_multi_preview_nextpage_btn.setOnClickListener(this);
        m_camera_multi_preview_prevpage_btn.setOnClickListener(this);
        m_camera_multi_edit_enter_btn.setOnClickListener(this);
        m_camera_multi_edit_exit_btn.setOnClickListener(this);
        m_camera_multi_edit_select_file_btn.setOnClickListener(this);
        m_camera_multi_edit_unselect_file_btn.setOnClickListener(this);
        m_camera_multi_edit_select_allfile_btn.setOnClickListener(this);
        m_camera_multi_edit_unselect_allfile_btn.setOnClickListener(this);
        m_camera_multi_edit_select_page_btn.setOnClickListener(this);
        m_camera_multi_edit_unselect_page_btn.setOnClickListener(this);
        m_camera_multi_edit_delete_all_select_btn.setOnClickListener(this);
        m_camera_multi_edit_download_all_select_btn.setOnClickListener(this);
        
        m_camera_single_preview_mode_btn.setOnClickListener(this);
        m_camera_single_preview_nextpage_btn.setOnClickListener(this);
        m_camera_single_preview_prevpage_btn.setOnClickListener(this);
        m_camera_single_preview_delect_current_btn.setOnClickListener(this);
        
        m_camera_single_preview_play_video_btn.setOnClickListener(this);
        m_camera_single_preview_stop_video_btn.setOnClickListener(this);
        m_camera_single_preview_seek_video_btn.setOnClickListener(this);


        mConnectStateTextView = (TextView)findViewById(R.id.ConnectStateCameraTextView);
     
        m_context = this.getApplicationContext();
        
        if(DJIDroneType.DJIDrone_Vision == DJIDrone.getDroneType()){
            m_camera_set_workmode_btn.setVisibility(View.GONE);            
            mFunctionLayout.setVisibility(View.GONE);            
            mCameraPlaybackStateScrollView.setVisibility(View.GONE); 
//            m_camera_multi_edit_exit_btn.setVisibility(View.GONE);
//            m_camera_multi_edit_select_file_btn.setVisibility(View.GONE);
//            m_camera_multi_edit_unselect_file_btn.setVisibility(View.GONE);
//            m_camera_multi_edit_select_allfile_btn.setVisibility(View.GONE);
//            m_camera_multi_edit_unselect_allfile_btn.setVisibility(View.GONE);
//            m_camera_multi_edit_select_page_btn.setVisibility(View.GONE);
//            m_camera_multi_edit_unselect_page_btn.setVisibility(View.GONE);
//            m_camera_multi_edit_delete_all_select_btn.setVisibility(View.GONE);
//            m_camera_multi_edit_download_all_select_btn.setVisibility(View.GONE);
            
        }
        else{
            m_camera_set_mode_btn.setVisibility(View.GONE);
            mFunctionLayout.setVisibility(View.INVISIBLE);
            mCameraPlaybackStateScrollView.setVisibility(View.INVISIBLE);
        }
        
        CreateProgressDialog();
        
    }
    
    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        mDjiGLSurfaceView.resume();
        
        mTimer = new Timer();
        Task task = new Task();
        mTimer.schedule(task, 0, 500);
        
        DJIDrone.getDjiCamera().startUpdateTimer(1000);
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
        
        DJIDrone.getDjiCamera().stopUpdateTimer();
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
    public void onClick(View v)
    {
        List<String> strlist = null;
        List<String> strlist2 = null;
        int TotalStringCnt = 0;
        String[] mSettingStrs = null;
        
        // TODO Auto-generated method stub
        switch (v.getId())
        {
            case R.id.SetWorkMode:
                strlist = new ArrayList<String>();    
                
                strlist.add("Capture");
                strlist.add("Record");
                if (DJIDrone.getDroneType() != DJIDroneType.DJIDrone_Phantom3_Advanced && DJIDrone.getDroneType() != DJIDroneType.DJIDrone_Vision) {
                    strlist.add("Playback");
				}

                mPopupNumberPicker = new PopupNumberPicker(m_context,
                        strlist,
                        new pickerValueChangeListener(){

                            @Override
                            public void onValueChange(int pos1, int pos2) {
                                //Log.d(TAG,"pos1 = "+ pos1 +", pos2 = "+pos2);
                                mPopupNumberPicker.dismiss();
                                mPopupNumberPicker = null;
                                CameraMode mode = CameraMode.Camera_Unknown_Mode;
                                if (DJIDroneType.DJIDrone_Vision != DJIDrone.getDroneType()) {
                                    switch (pos1) {
                                        case 0 : {
                                            mFunctionLayout.setVisibility(View.INVISIBLE);
                                            mCameraPlaybackStateScrollView.setVisibility(View.INVISIBLE);
                                            mScrollView.setVisibility(View.VISIBLE);
                                            mode = CameraMode.Camera_Capture_Mode;
                                            break;
                                        }
                                        
                                        case 1 : {
                                            mFunctionLayout.setVisibility(View.INVISIBLE);
                                            mCameraPlaybackStateScrollView.setVisibility(View.INVISIBLE);
                                            mScrollView.setVisibility(View.VISIBLE);
                                            mode = CameraMode.Camera_Record_Mode;
                                            break;
                                        }
                                        
                                        case 2 : {
                                            mFunctionLayout.setVisibility(View.VISIBLE);
                                            mCameraPlaybackStateScrollView.setVisibility(View.VISIBLE);
                                            mScrollView.setVisibility(View.INVISIBLE);
                                            mode = CameraMode.Camera_PlayBack_Mode;
                                            break;
                                        }
                                        
                                        case 3 : {
                                            mFunctionLayout.setVisibility(View.INVISIBLE);
                                            mCameraPlaybackStateScrollView.setVisibility(View.VISIBLE);
                                            mScrollView.setVisibility(View.VISIBLE);
                                            mode = CameraMode.Camera_TransCode_Mode;
                                            break;
                                        }
                                        
                                    }
                                } else {
                                        mode = CameraMode.Camera_Unknown_Mode;
                                }
                                
                                DJIDrone.getDjiCamera().setCameraMode(mode, new DJIExecuteResultCallback(){

                                    @Override
                                    public void onResult(DJIError mErr)
                                    {
                                        // TODO Auto-generated method stub
                                        Log.d(TAG, "Set Camera Mode errorCode = "+ mErr.errorCode);
                                        Log.d(TAG, "Set Camera Mode errorDescription = "+ mErr.errorDescription);
                                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                    }
                                    
                                });
                                
                                
                            }}, 250,
                        200, 0);
                
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                break;
            case R.id.StartTakePhotoButton:
//                DJIDrone.getDjiCamera().startTakePhoto(new DJIExecuteResultCallback(){
//
//                    @Override
//                    public void onResult(DJIError mErr)
//                    {
//                        // TODO Auto-generated method stub
//
//                        Log.d(TAG, "Start Takephoto errorCode = "+ mErr.errorCode);
//                        Log.d(TAG, "Start Takephoto errorDescription = "+ mErr.errorDescription);
//                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
//                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
//                                               
//                    }
//                    
//                });
                
                strlist = new ArrayList<String>();                
                strlist.add("Single");
                strlist.add("Burst");
                strlist.add("Time");
                
                mPopupNumberPicker = new PopupNumberPicker(m_context,
                        strlist,
                        new pickerValueChangeListener(){

                            @Override
                            public void onValueChange(int pos1, int pos2) {
                                //Log.d(TAG,"pos1 = "+ pos1 +", pos2 = "+pos2);
                                mPopupNumberPicker.dismiss();
                                mPopupNumberPicker = null;
                                CameraCaptureMode mode = CameraCaptureMode.Camera_Single_Capture;
                                    switch (pos1) {
                                        case 0 : {
                                            mode = CameraCaptureMode.Camera_Single_Capture;
                                            break;
                                        }
                                        
                                        case 1 : {
                                            mode = CameraCaptureMode.Camera_Multi_Capture;
                                            break;
                                        }
                                        
                                        case 2 : {
                                            mode = CameraCaptureMode.Camera_Continous_Capture;
                                            break;
                                        }
                                    }
                                
                                DJIDrone.getDjiCamera().startTakePhoto(mode, new DJIExecuteResultCallback(){

                                    @Override
                                    public void onResult(DJIError mErr)
                                    {
                                        // TODO Auto-generated method stub
                                        Log.d(TAG, "Set Action errorCode = "+ mErr.errorCode);
                                        Log.d(TAG, "Set Action errorDescription = "+ mErr.errorDescription);
                                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                    }
                                    
                                });
                                
                                
                            }}, 250,
                        200, 0);
                
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                    
                  break;

            case R.id.StopTakePhotoButton:
                DJIDrone.getDjiCamera().stopTakePhoto(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "Stop Takephoto errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "Stop Takephoto errorDescription = "+ mErr.errorDescription);
                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                               
                    }
                    
                });
                
//                DJIDrone.getDjiCamera().getCameraGps(new DJIExecuteResultCallback(){
//                    
//                    @Override
//                    public void onResult(DJIError mErr)
//                    {
//                        // TODO Auto-generated method stub
//  
//                        Log.d(TAG, "getCameraGps errorCode = "+ mErr.errorCode);
//                        Log.d(TAG, "getCameraGps errorDescription = "+ mErr.errorDescription);
//                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
//                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
//                                               
//                    }
//                    
//                });  
                
                break;

            case R.id.StartRecordingButton:
                DJIDrone.getDjiCamera().startRecord(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    { 
                        // TODO Auto-generated method stub
                        Log.d(TAG, "Start Recording errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "Start Recording errorDescription = "+ mErr.errorDescription);
                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                               
                    }
                    
                });
                break;

            case R.id.StopRecordingButton:
                DJIDrone.getDjiCamera().stopRecord(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "Stop Recording errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "Stop Recording errorDescription = "+ mErr.errorDescription);
                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                               
                    }
                    
                });
                break;
                
            case R.id.camera_set_photosize_btn:
                if (mPopupNumberPicker != null)
                    mPopupNumberPicker.dismiss();

                strlist = new ArrayList<String>();                
                TotalStringCnt = getResources().getStringArray(R.array.photosizeValues).length;
                mSettingStrs = new String[TotalStringCnt];
                mSettingStrs = getResources().getStringArray(R.array.photosizeValues);
                
                for (int i = 0; i < TotalStringCnt; i++) {
                    strlist.add(mSettingStrs[i]);
                }

                
                mPopupNumberPicker = new PopupNumberPicker(m_context,
                        strlist,
                        new pickerValueChangeListener(){

                            @Override
                            public void onValueChange(int pos1, int pos2) {
                                //Log.d(TAG,"pos1 = "+ pos1 +", pos2 = "+pos2);
                                mPopupNumberPicker.dismiss();
                                mPopupNumberPicker = null;
                                
                                DJIDrone.getDjiCamera().setCameraPhotoSize(CameraPhotoSizeType.values()[pos1],new DJIExecuteResultCallback(){

                                    @Override
                                    public void onResult(DJIError mErr)
                                    {
                                        // TODO Auto-generated method stub
                                        Log.d(TAG, "setCameraPhotoSize errorCode = "+ mErr.errorCode);
                                        Log.d(TAG, "setCameraPhotoSize errorDescription = "+ mErr.errorDescription);
                                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                                               
                                    }
                                    
                                });
                                
                                
                            }}, 250,
                        200, 0);
                
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                
                break;
            case R.id.camera_get_photosize_btn:
            	
            	//final long startTime = System.currentTimeMillis();
            	
                DJIDrone.getDjiCamera().getCameraPhotoSize(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "getCameraPhotoSize errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "getCameraPhotoSize errorDescription = "+ mErr.errorDescription);
                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        if(mErr.errorCode == DJIError.RESULT_OK ){
                            result = result +"\n" + "value:"+ DJIDrone.getDjiCamera().getDjiCameraProperty().photoSize.toString();
                            //Log.d(TAG, "getCameraPhotoSize time = "+ (System.currentTimeMillis()-startTime) +" ms");
                        }
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                               
                    }
                    
                });
                
                break;   
            case R.id.camera_set_iso_btn:
                if (mPopupNumberPicker != null)
                    mPopupNumberPicker.dismiss();

                strlist = new ArrayList<String>();                
                TotalStringCnt = getResources().getStringArray(R.array.isoValues).length;
                mSettingStrs = new String[TotalStringCnt];
                mSettingStrs = getResources().getStringArray(R.array.isoValues);
                
                for (int i = 0; i < TotalStringCnt; i++) {
                    strlist.add(mSettingStrs[i]);
                }
                
                mPopupNumberPicker = new PopupNumberPicker(m_context,
                        strlist,
                        new pickerValueChangeListener(){

                            @Override
                            public void onValueChange(int pos1, int pos2) {
                                //Log.d(TAG,"pos1 = "+ pos1 +", pos2 = "+pos2);
                                mPopupNumberPicker.dismiss();
                                mPopupNumberPicker = null;

                                //Log.d(TAG,"iso value = "+CameraISOType.values()[pos1].toString());
                                
                                DJIDrone.getDjiCamera().setCameraISO(CameraISOType.values()[pos1],new DJIExecuteResultCallback(){

                                    @Override
                                    public void onResult(DJIError mErr)
                                    {
                                        // TODO Auto-generated method stub
                                        Log.d(TAG, "setCameraISO errorCode = "+ mErr.errorCode);
                                        Log.d(TAG, "setCameraISO errorDescription = "+ mErr.errorDescription);
                                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                                               
                                    }
                                    
                                });
                                
                                
                            }}, 250,
                        200, 0);
                
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                break;
                
            case R.id.camera_get_iso_btn:
                DJIDrone.getDjiCamera().getCameraISO(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "getCameraISO errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "getCameraISO errorDescription = "+ mErr.errorDescription);
                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        if(mErr.errorCode == DJIError.RESULT_OK ){
                            result = result +"\n" + "value:"+ DJIDrone.getDjiCamera().getDjiCameraProperty().iso.toString();
                        }
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                               
                    }
                    
                });
                
                break;
                
            case R.id.camera_set_whitebalance_btn:
                if (mPopupNumberPicker != null)
                    mPopupNumberPicker.dismiss();

                strlist = new ArrayList<String>();
                if (DJIDrone.getDroneType()!=DJIDroneType.DJIDrone_Vision) {
                    TotalStringCnt = getResources().getStringArray(R.array.whitebalanceValues).length;
                    mSettingStrs = new String[TotalStringCnt];
                    mSettingStrs = getResources().getStringArray(R.array.whitebalanceValues);
                }else{
                    TotalStringCnt = getResources().getStringArray(R.array.whitebalanceValues_vision).length;
                    mSettingStrs = new String[TotalStringCnt];
                    mSettingStrs = getResources().getStringArray(R.array.whitebalanceValues_vision);
                }

                
                for (int i = 0; i < TotalStringCnt; i++) {
                    strlist.add(mSettingStrs[i]);
                }
 
                mPopupNumberPicker = new PopupNumberPicker(m_context,
                        strlist,
                        new pickerValueChangeListener(){

                            @Override
                            public void onValueChange(int pos1, int pos2) {
                                //Log.d(TAG,"pos1 = "+ pos1 +", pos2 = "+pos2);
                                mPopupNumberPicker.dismiss();
                                mPopupNumberPicker = null;
                                if (DJIDrone.getDroneType()!=DJIDroneType.DJIDrone_Vision && pos1 >2){
                                    pos1 = pos1+1;
                                }
                                DJIDrone.getDjiCamera().setCameraWhiteBalance(CameraWhiteBalanceType.values()[pos1],new DJIExecuteResultCallback(){

                                    @Override
                                    public void onResult(DJIError mErr)
                                    {
                                        // TODO Auto-generated method stub
                                        Log.d(TAG, "setCameraWhiteBalance errorCode = "+ mErr.errorCode);
                                        Log.d(TAG, "setCameraWhiteBalance errorDescription = "+ mErr.errorDescription);
                                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                                               
                                    }
                                    
                                });
                                
                                
                            }}, 250,
                        200, 0);
                
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                
                break;
            case R.id.camera_get_whitebalance_btn:
                DJIDrone.getDjiCamera().getCameraWhiteBalance(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "getCameraWhiteBalance errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "getCameraWhiteBalance errorDescription = "+ mErr.errorDescription);
                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        if(mErr.errorCode == DJIError.RESULT_OK ){
                            result = result +"\n" + "value:"+ DJIDrone.getDjiCamera().getDjiCameraProperty().whiteBalance.toString();
                        }
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                               
                    }
                    
                });

                break;
            case R.id.camera_set_exposuremetering_btn:
                if (mPopupNumberPicker != null)
                    mPopupNumberPicker.dismiss();

                strlist = new ArrayList<String>();                
                TotalStringCnt = getResources().getStringArray(R.array.exposuremeteringValues).length;
                mSettingStrs = new String[TotalStringCnt];
                mSettingStrs = getResources().getStringArray(R.array.exposuremeteringValues);
                
                for (int i = 0; i < TotalStringCnt; i++) {
                    strlist.add(mSettingStrs[i]);
                }

                
                mPopupNumberPicker = new PopupNumberPicker(m_context,
                        strlist,
                        new pickerValueChangeListener(){

                            @Override
                            public void onValueChange(int pos1, int pos2) {
                                //Log.d(TAG,"pos1 = "+ pos1 +", pos2 = "+pos2);
                                mPopupNumberPicker.dismiss();
                                mPopupNumberPicker = null;
                                
                                DJIDrone.getDjiCamera().setCameraExposureMetering(CameraExposureMeteringType.values()[pos1],new DJIExecuteResultCallback(){

                                    @Override
                                    public void onResult(DJIError mErr)
                                    {
                                        // TODO Auto-generated method stub
                                        Log.d(TAG, "setCameraExposureMetering errorCode = "+ mErr.errorCode);
                                        Log.d(TAG, "setCameraExposureMetering errorDescription = "+ mErr.errorDescription);
                                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                                               
                                    }
                                    
                                });
                                
                                
                            }}, 250,
                        200, 0);
                
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                break;
            case R.id.camera_get_exposuremetering_btn:
                DJIDrone.getDjiCamera().getCameraExposureMetering(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "getCameraExposureMetering errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "getCameraExposureMetering errorDescription = "+ mErr.errorDescription);
                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        if(mErr.errorCode == DJIError.RESULT_OK ){
                            result = result +"\n" + "value:"+ DJIDrone.getDjiCamera().getDjiCameraProperty().exposureMetering.toString();
                        }
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                               
                    }
                    
                });                
                break;
            case R.id.camera_set_exposurecompensation_btn:
                if (mPopupNumberPicker != null)
                    mPopupNumberPicker.dismiss();

                strlist = new ArrayList<String>();                
                TotalStringCnt = getResources().getStringArray(R.array.exposurecompensationValues).length;
                mSettingStrs = new String[TotalStringCnt];
                mSettingStrs = getResources().getStringArray(R.array.exposurecompensationValues);
                
                for (int i = 0; i < TotalStringCnt; i++) {
                    strlist.add(mSettingStrs[i]);
                }

                
                mPopupNumberPicker = new PopupNumberPicker(m_context,
                        strlist,
                        new pickerValueChangeListener(){

                            @Override
                            public void onValueChange(int pos1, int pos2) {
                                //Log.d(TAG,"pos1 = "+ pos1 +", pos2 = "+pos2);
                                mPopupNumberPicker.dismiss();
                                mPopupNumberPicker = null;
                                
                                DJIDrone.getDjiCamera().setCameraExposureCompensation(CameraExposureCompensationType.values()[pos1],new DJIExecuteResultCallback(){

                                    @Override
                                    public void onResult(DJIError mErr)
                                    {
                                        // TODO Auto-generated method stub
                                        Log.d(TAG, "setCameraExposureCompensation errorCode = "+ mErr.errorCode);
                                        Log.d(TAG, "setCameraExposureCompensation errorDescription = "+ mErr.errorDescription);
                                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                                               
                                    }
                                    
                                });
                                
                                
                            }}, 250,
                        200, 0);
                
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                break;
            case R.id.camera_get_exposurecompensation_btn:
                DJIDrone.getDjiCamera().getCameraExposureCompensation(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "getCameraExposureCompensation errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "getCameraExposureCompensation errorDescription = "+ mErr.errorDescription);
                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        if(mErr.errorCode == DJIError.RESULT_OK ){
                            result = result +"\n" + "value:"+ DJIDrone.getDjiCamera().getDjiCameraProperty().exposureCompensation.toString();
                        }
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                               
                    }
                    
                });  
                break;
            case R.id.camera_set_antiflicker_btn:
                if (mPopupNumberPicker != null)
                    mPopupNumberPicker.dismiss();

                strlist = new ArrayList<String>();                
                TotalStringCnt = getResources().getStringArray(R.array.antiflickerValues).length;
                mSettingStrs = new String[TotalStringCnt];
                mSettingStrs = getResources().getStringArray(R.array.antiflickerValues);
                
                for (int i = 0; i < TotalStringCnt; i++) {
                    strlist.add(mSettingStrs[i]);
                }

                
                mPopupNumberPicker = new PopupNumberPicker(m_context,
                        strlist,
                        new pickerValueChangeListener(){

                            @Override
                            public void onValueChange(int pos1, int pos2) {
                                //Log.d(TAG,"pos1 = "+ pos1 +", pos2 = "+pos2);
                                mPopupNumberPicker.dismiss();
                                mPopupNumberPicker = null;
                                
                                DJIDrone.getDjiCamera().setCameraAntiFlicker(CameraAntiFlickerType.values()[pos1],new DJIExecuteResultCallback(){

                                    @Override
                                    public void onResult(DJIError mErr)
                                    {
                                        // TODO Auto-generated method stub
                                        Log.d(TAG, "setCameraAntiFlicker errorCode = "+ mErr.errorCode);
                                        Log.d(TAG, "setCameraAntiFlicker errorDescription = "+ mErr.errorDescription);
                                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                                               
                                    }
                                    
                                });
                                
                                
                            }}, 250,
                        200, 0);
                
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                
                break;
            case R.id.camera_get_antiflicker_btn:
                DJIDrone.getDjiCamera().getCameraAntiFlicker(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "getCameraAntiFlicker errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "getCameraAntiFlicker errorDescription = "+ mErr.errorDescription);
                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        if(mErr.errorCode == DJIError.RESULT_OK ){
                            result = result +"\n" + "value:"+ DJIDrone.getDjiCamera().getDjiCameraProperty().antiFlicker.toString();
                        }
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                               
                    }
                    
                });  
                break;
            case R.id.camera_set_sharpness_btn:
                if (mPopupNumberPicker != null)
                    mPopupNumberPicker.dismiss();

                strlist = new ArrayList<String>();                
                TotalStringCnt = getResources().getStringArray(R.array.sharpnessValues).length;
                mSettingStrs = new String[TotalStringCnt];
                mSettingStrs = getResources().getStringArray(R.array.sharpnessValues);
                
                for (int i = 0; i < TotalStringCnt; i++) {
                    strlist.add(mSettingStrs[i]);
                }

                
                mPopupNumberPicker = new PopupNumberPicker(m_context,
                        strlist,
                        new pickerValueChangeListener(){

                            @Override
                            public void onValueChange(int pos1, int pos2) {
                                //Log.d(TAG,"pos1 = "+ pos1 +", pos2 = "+pos2);
                                mPopupNumberPicker.dismiss();
                                mPopupNumberPicker = null;
                                
                                DJIDrone.getDjiCamera().setCameraSharpness(CameraSharpnessType.values()[pos1],new DJIExecuteResultCallback(){

                                    @Override
                                    public void onResult(DJIError mErr)
                                    {
                                        // TODO Auto-generated method stub
                                        Log.d(TAG, "setCameraSharpness errorCode = "+ mErr.errorCode);
                                        Log.d(TAG, "setCameraSharpness errorDescription = "+ mErr.errorDescription);
                                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                                               
                                    }
                                    
                                });
                                
                                
                            }}, 250,
                        200, 0);
                
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                
                break;
            case R.id.camera_get_sharpness_btn:
                DJIDrone.getDjiCamera().getCameraSharpness(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "getCameraSharpness errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "getCameraSharpness errorDescription = "+ mErr.errorDescription);
                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        if(mErr.errorCode == DJIError.RESULT_OK ){
                            result = result +"\n" + "value:"+ DJIDrone.getDjiCamera().getDjiCameraProperty().sharpness.toString();
                        }
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                               
                    }
                    
                });  
                break;
            case R.id.camera_set_contrast_btn:
                if (mPopupNumberPicker != null)
                    mPopupNumberPicker.dismiss();

                strlist = new ArrayList<String>();                
                TotalStringCnt = getResources().getStringArray(R.array.contrastValues).length;
                mSettingStrs = new String[TotalStringCnt];
                mSettingStrs = getResources().getStringArray(R.array.contrastValues);
                
                for (int i = 0; i < TotalStringCnt; i++) {
                    strlist.add(mSettingStrs[i]);
                }

                
                mPopupNumberPicker = new PopupNumberPicker(m_context,
                        strlist,
                        new pickerValueChangeListener(){

                            @Override
                            public void onValueChange(int pos1, int pos2) {
                                //Log.d(TAG,"pos1 = "+ pos1 +", pos2 = "+pos2);
                                mPopupNumberPicker.dismiss();
                                mPopupNumberPicker = null;
                                
                                DJIDrone.getDjiCamera().setCameraContrast(CameraContrastType.values()[pos1],new DJIExecuteResultCallback(){

                                    @Override
                                    public void onResult(DJIError mErr)
                                    {
                                        // TODO Auto-generated method stub
                                        Log.d(TAG, "setCameraContrast errorCode = "+ mErr.errorCode);
                                        Log.d(TAG, "setCameraContrast errorDescription = "+ mErr.errorDescription);
                                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                                               
                                    }
                                    
                                });
                                
                                
                            }}, 250,
                        200, 0);
                
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                
                break;
            case R.id.camera_get_contrast_btn:
                DJIDrone.getDjiCamera().getCameraContrast(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "getCameraContrast errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "getCameraContrast errorDescription = "+ mErr.errorDescription);
                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        if(mErr.errorCode == DJIError.RESULT_OK ){
                            result = result +"\n" + "value:"+ DJIDrone.getDjiCamera().getDjiCameraProperty().contrast.toString();
                        }
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                               
                    }
                    
                }); 
                break;
            case R.id.camera_set_mutiphotocount_btn:                
                if (mPopupNumberPicker != null)
                    mPopupNumberPicker.dismiss();

                strlist = new ArrayList<String>();                
                TotalStringCnt = getResources().getStringArray(R.array.multishotValues).length;
                mSettingStrs = new String[TotalStringCnt];
                mSettingStrs = getResources().getStringArray(R.array.multishotValues);
                
                for (int i = 0; i < TotalStringCnt; i++) {
                    strlist.add(mSettingStrs[i]);
                }
                
                mPopupNumberPicker = new PopupNumberPicker(m_context,
                        strlist,
                        new pickerValueChangeListener(){

                            @Override
                            public void onValueChange(int pos1, int pos2) {
                                //Log.d(TAG,"pos1 = "+ pos1 +", pos2 = "+pos2);
                                mPopupNumberPicker.dismiss();
                                mPopupNumberPicker = null;
                                
                                Log.d(TAG,"CameraMultiShotCount.values()[pos1].toString() = "+CameraMultiShotCount.values()[pos1].toString());
                                
                                DJIDrone.getDjiCamera().setMutiPhotoCount(CameraMultiShotCount.values()[pos1],new DJIExecuteResultCallback(){

                                    @Override
                                    public void onResult(DJIError mErr)
                                    {
                                        // TODO Auto-generated method stub
                                        Log.d(TAG, "setMutiPhotoCount errorCode = "+ mErr.errorCode);
                                        Log.d(TAG, "setMutiPhotoCount errorDescription = "+ mErr.errorDescription);
                                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                                               
                                    }
                                    
                                });
                                
                                
                            }}, 250,
                        200, 0);
                
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                
                break;
            case R.id.camera_get_mutiphotocount_btn:
                DJIDrone.getDjiCamera().getMutiPhotoCount(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "getMutiPhotoCount errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "getMutiPhotoCount errorDescription = "+ mErr.errorDescription);
                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        if(mErr.errorCode == DJIError.RESULT_OK ){
                            result = result +"\n" + "value:"+ DJIDrone.getDjiCamera().getDjiCameraProperty().multiShotCount.toString();
                        }
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                               
                    }
                    
                }); 
                break;
            case R.id.camera_set_cameraaction_btn:
                if (mPopupNumberPicker != null)
                    mPopupNumberPicker.dismiss();

                strlist = new ArrayList<String>();                
                TotalStringCnt = getResources().getStringArray(R.array.cameraactionValues).length;
                mSettingStrs = new String[TotalStringCnt];
                mSettingStrs = getResources().getStringArray(R.array.cameraactionValues);
                
                for (int i = 0; i < TotalStringCnt; i++) {
                    strlist.add(mSettingStrs[i]);
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
                                
                                DJIDrone.getDjiCamera().setCameraActionWhenConnectionBroken(CameraActionWhenBreak.values()[pos1],new DJIExecuteResultCallback(){

                                    @Override
                                    public void onResult(DJIError mErr)
                                    {
                                        // TODO Auto-generated method stub
                                        Log.d(TAG, "setCameraActionWhenConnectionBroken errorCode = "+ mErr.errorCode);
                                        Log.d(TAG, "setCameraActionWhenConnectionBroken errorDescription = "+ mErr.errorDescription);
                                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                                               
                                    }
                                    
                                });
                                
                                
                            }}, 250,
                        200, 0);
                
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                break;
            case R.id.camera_get_cameraaction_btn:
                DJIDrone.getDjiCamera().getCameraActionWhenConnectionBroken(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "getCameraActionWhenConnectionBroken errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "getCameraActionWhenConnectionBroken errorDescription = "+ mErr.errorDescription);
                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        if(mErr.errorCode == DJIError.RESULT_OK ){
                            result = result +"\n" + "value:"+ DJIDrone.getDjiCamera().getDjiCameraProperty().cameraAction.toString();
                        }
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                               
                    }
                    
                }); 
                break;
            case R.id.camera_set_photoformat_btn:
                if (mPopupNumberPicker != null)
                    mPopupNumberPicker.dismiss();

                strlist = new ArrayList<String>();                
                TotalStringCnt = getResources().getStringArray(R.array.photoformatValues).length;
                mSettingStrs = new String[TotalStringCnt];
                mSettingStrs = getResources().getStringArray(R.array.photoformatValues);
                
                for (int i = 0; i < TotalStringCnt; i++) {
                    strlist.add(mSettingStrs[i]);
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
                                
                                DJIDrone.getDjiCamera().setCameraPhotoFormat(CameraPhotoFormatType.values()[pos1],new DJIExecuteResultCallback(){

                                    @Override
                                    public void onResult(DJIError mErr)
                                    {
                                        // TODO Auto-generated method stub
                                        Log.d(TAG, "setCameraPhotoFormat errorCode = "+ mErr.errorCode);
                                        Log.d(TAG, "setCameraPhotoFormat errorDescription = "+ mErr.errorDescription);
                                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                                               
                                    }
                                    
                                });
                                
                                
                            }}, 250,
                        200, 0);
                
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                break;
            case R.id.camera_get_photoformat_btn:
                DJIDrone.getDjiCamera().getCameraPhotoFormat(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "getCameraPhotoFormat errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "getCameraPhotoFormat errorDescription = "+ mErr.errorDescription);
                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        if(mErr.errorCode == DJIError.RESULT_OK ){
                            result = result +"\n" + "value:"+ DJIDrone.getDjiCamera().getDjiCameraProperty().photoFormat.toString();
                        }
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                               
                    }
                    
                });
                break;
            case R.id.camera_set_recordingparam_btn:
                if (mPopupNumberPickerDoubleRecording != null)
                    mPopupNumberPickerDoubleRecording.dismiss();

                strlist = new ArrayList<String>();                
                TotalStringCnt = getResources().getStringArray(R.array.recordingResolutionValues).length;
                mSettingStrs = new String[TotalStringCnt];
                mSettingStrs = getResources().getStringArray(R.array.recordingResolutionValues);
                
                for (int i = 0; i < TotalStringCnt; i++) {
                    strlist.add(mSettingStrs[i]);
                }
                    
                strlist2 = new ArrayList<String>();
                
                TotalStringCnt = getResources().getStringArray(R.array.recordingFovValues).length;
                mSettingStrs = new String[TotalStringCnt];
                mSettingStrs = getResources().getStringArray(R.array.recordingFovValues);
                
                for (int i = 0; i < TotalStringCnt; i++) {
                    strlist2.add(mSettingStrs[i]);
                }
                  
                mPopupNumberPickerDoubleRecording = new PopupNumberPickerDoubleRecording(m_context,
                        strlist,null,strlist2,null,                    
                        new pickerValueChangeListener(){

                            @Override
                            public void onValueChange(int pos1, int pos2) 
                            {
                                //Log.d(TAG,"pos1 = "+pos1+",pos2 = "+pos2);                               
                                mPopupNumberPickerDoubleRecording.dismiss();
                                mPopupNumberPickerDoubleRecording = null;
                                
                                DJIDrone.getDjiCamera().setCameraRecordingParam(CameraRecordingResolutionType.values()[pos1], CameraRecordingFovType.values()[pos2],new DJIExecuteResultCallback(){

                                    @Override
                                    public void onResult(DJIError mErr)
                                    {
                                        // TODO Auto-generated method stub
                                        Log.d(TAG, "setCameraRecordingParam errorCode = "+ mErr.errorCode);
                                        Log.d(TAG, "setCameraRecordingParam errorDescription = "+ mErr.errorDescription);
                                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                                               
                                    }
                                    
                                });
                                
                            }}, 350,200, 0);
                
                mPopupNumberPickerDoubleRecording.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                
                
                break;
            case R.id.camera_get_recordingparam_btn:
                
                DJIDrone.getDjiCamera().getCameraRecordingParam(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "getCameraRecordingParam errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "getCameraRecordingParam errorDescription = "+ mErr.errorDescription);
                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        if(mErr.errorCode == DJIError.RESULT_OK ){
                            result = result +"\n" + "value:"+ DJIDrone.getDjiCamera().getDjiCameraProperty().recordingResolution.toString()+","+DJIDrone.getDjiCamera().getDjiCameraProperty().recordingFov.toString();
                        }
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                               
                    }
                    
                });
                
                break;
                
            case R.id.camera_set_continuousparam_btn:
                
                if (mPopupNumberPickerDouble != null)
                    mPopupNumberPickerDouble.dismiss();

                strlist = new ArrayList<String>();
                for (int i = 3; i <= 60; i++) {                             
                    strlist.add(String.valueOf(i));
                }

                    
                strlist2 = new ArrayList<String>();
                
                for (int i = 1; i <= 255; i++) {    
                    if(i== 255){
                        strlist2.add("∞");
                    }
                    else{
                        strlist2.add(String.valueOf(i));
                    }
                }
                  
                mPopupNumberPickerDouble = new PopupNumberPickerDouble(m_context,
                        strlist,null,strlist2,null,                    
                        new pickerValueChangeListener(){

                            @Override
                            public void onValueChange(int pos1, int pos2) 
                            {
                                Log.d(TAG,"pos1 = "+pos1+",pos2 = "+pos2);                                 
                                
                                
                                mPopupNumberPickerDouble.dismiss();
                                mPopupNumberPickerDouble = null;
                                
                                DJIDrone.getDjiCamera().setContinuousPhotoParam(pos2+1, pos1+3,new DJIExecuteResultCallback(){

                                    @Override
                                    public void onResult(DJIError mErr)
                                    {
                                        // TODO Auto-generated method stub
                                        Log.d(TAG, "setContinuousPhotoParam errorCode = "+ mErr.errorCode);
                                        Log.d(TAG, "setContinuousPhotoParam errorDescription = "+ mErr.errorDescription);
                                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                                               
                                    }
                                    
                                });
                                
                            }}, 350,200, 0);
                
                mPopupNumberPickerDouble.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                break;
            case R.id.camera_get_continuousparam_btn:
                DJIDrone.getDjiCamera().getContinuousPhotoParam(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "getContinuousPhotoParam errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "getContinuousPhotoParam errorDescription = "+ mErr.errorDescription);
                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        if(mErr.errorCode == DJIError.RESULT_OK ){
                            result = result +"\n" + "value:"+ DJIDrone.getDjiCamera().getDjiCameraProperty().mContinuousPhotoParam.toString();
                        }
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                               
                    }
                    
                });
                break;        
            case R.id.camera_set_mode_btn:
                if (mPopupNumberPicker != null)
                    mPopupNumberPicker.dismiss();

                strlist = new ArrayList<String>();                
                TotalStringCnt = getResources().getStringArray(R.array.cameramodeValues).length;
                mSettingStrs = new String[TotalStringCnt];
                mSettingStrs = getResources().getStringArray(R.array.cameramodeValues);
                
                for (int i = 0; i < TotalStringCnt; i++) {
                    strlist.add(mSettingStrs[i]);
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
                                
                                DJIDrone.getDjiCamera().setCameraMode(CameraMode.values()[pos1],new DJIExecuteResultCallback(){

                                    @Override
                                    public void onResult(DJIError mErr)
                                    {
                                        // TODO Auto-generated method stub
                                        Log.d(TAG, "setCameraMode errorCode = "+ mErr.errorCode);
                                        Log.d(TAG, "setCameraMode errorDescription = "+ mErr.errorDescription);
                                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                                               
                                    }
                                    
                                });
                                
                                
                            }}, 250,
                        200, 0);
                
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                
                break;
            case R.id.camera_get_version_btn:
                String mVersion = "";
                if (DJIDrone.getDroneType()!=DJIDroneType.DJIDrone_Vision) {
                    DJIDrone.getDjiCamera().getFirmwareVersion(new DJIExecuteStringResultCallback(){

                        @Override
                        public void onResult(String result)
                        {
                            // TODO Auto-generated method stub
                            String resultStr = "the camera firmware version = "+result;
                            handler.sendMessage(handler.obtainMessage(SHOWTOAST, resultStr));
                        }
                    });
                    

                }else {
                    mVersion= DJIDrone.getDjiCamera().getCameraVersion();
                    String result = "the camera firmware version = "+mVersion;
                    handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                }
                break;
            case R.id.camera_get_visiontype_btn:                
                CameraVisionType mType;
                mType = DJIDrone.getDjiCamera().getVisionType();    
                handler.sendMessage(handler.obtainMessage(SHOWTOAST, "Vision type = "+mType.toString()));
                break;
            case R.id.camera_get_connectisok_btn:
                boolean flag = false;
                flag = DJIDrone.getDjiCamera().getCameraConnectIsOk();  
                handler.sendMessage(handler.obtainMessage(SHOWTOAST, "connect is ok = "+flag));
                break;
            case R.id.camera_sync_time_btn:
                DJIDrone.getDjiCamera().syncTime(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "syncTime errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "syncTime errorDescription = "+ mErr.errorDescription);
                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                               
                    }
                    
                });
                break;
            case R.id.camera_save_config_btn:
                DJIDrone.getDjiCamera().saveCameraConfig(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "saveCameraConfig errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "saveCameraConfig errorDescription = "+ mErr.errorDescription);
                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                               
                    }
                    
                });
                break;
            case R.id.camera_restore_default_btn:
                DJIDrone.getDjiCamera().restoreCameraDefaultSettings(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "restoreCameraDefaultSettings errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "restoreCameraDefaultSettings errorDescription = "+ mErr.errorDescription);
                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                               
                    }
                    
                });
                break;
            case R.id.camera_format_sdcard_btn:
                DJIDrone.getDjiCamera().formatSDCard(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "formatSDCard errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "formatSDCard errorDescription = "+ mErr.errorDescription);
                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                               
                    }
                    
                });
                break;  
                
                
            case R.id.camera_toggle_state_btn:
                if(mCameraPlaybackStateScrollView.getVisibility() == View.VISIBLE){
                    mCameraPlaybackStateScrollView.setVisibility(View.INVISIBLE);
                }
                else{
                    mCameraPlaybackStateScrollView.setVisibility(View.VISIBLE);
                }
                
                break;
            case R.id.camera_multi_preview_mode_btn:
                
                DJIDrone.getDjiCamera().enterMultiplePreviewMode(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "enterMultiplePreviewMode errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "enterMultiplePreviewMode errorDescription = "+ mErr.errorDescription);
                        String result = "enterMultiplePreviewMode errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                    }
                    
                });
                
                break;
                
            case R.id.camera_multi_preview_nextpage_btn:
                
                DJIDrone.getDjiCamera().multiplePreviewNextPage(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "multiplePreviewNextPage errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "multiplePreviewNextPage errorDescription = "+ mErr.errorDescription);
                        String result = "multiplePreviewNextPage errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                    }
                    
                });
                
                break;
                
              
            case R.id.camera_multi_preview_prevpage_btn:
                
                DJIDrone.getDjiCamera().multiplePreviewPreviousPage(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "multiplePreviewPreviousPage errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "multiplePreviewPreviousPage errorDescription = "+ mErr.errorDescription);
                        String result = "multiplePreviewPreviousPage errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                    }
                    
                });
                
                break;
                
            case R.id.camera_multi_edit_enter_btn:
                
                DJIDrone.getDjiCamera().enterMultipleEditMode(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "enterMultipleEditMode errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "enterMultipleEditMode errorDescription = "+ mErr.errorDescription);
                        String result = "enterMultipleEditMode errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                    }
                    
                });
                
                break;
                
            case R.id.camera_multi_edit_exit_btn:
                
                DJIDrone.getDjiCamera().exitMultipleEditMode(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "exitMultipleEditMode errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "exitMultipleEditMode errorDescription = "+ mErr.errorDescription);
                        String result = "exitMultipleEditMode errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                    }
                    
                });
                
                break;
           
            case R.id.camera_multi_edit_select_file_btn:
 
                strlist = new ArrayList<String>();    
                
                for(int i = 1 ; i <= 8 ; i++){
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
                                
                                
                                DJIDrone.getDjiCamera().selectFileAtIndex(pos1, new DJIExecuteResultCallback(){

                                    @Override
                                    public void onResult(DJIError mErr)
                                    {
                                        // TODO Auto-generated method stub
                                        Log.d(TAG, "selectFileAtIndex errorCode = "+ mErr.errorCode);
                                        Log.d(TAG, "selectFileAtIndex errorDescription = "+ mErr.errorDescription);
                                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                    }
                                    
                                });
                                
                                
                            }}, 250,
                        200, 0);
                
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                
                break;
            
            case R.id.camera_multi_edit_unselect_file_btn:

                strlist = new ArrayList<String>();    
                
                for(int i = 1 ; i <= 8 ; i++){
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

                                DJIDrone.getDjiCamera().unselectFileAtIndex(pos1, new DJIExecuteResultCallback(){

                                    @Override
                                    public void onResult(DJIError mErr)
                                    {
                                        // TODO Auto-generated method stub
                                        Log.d(TAG, "unselectFileAtIndex errorCode = "+ mErr.errorCode);
                                        Log.d(TAG, "unselectFileAtIndex errorDescription = "+ mErr.errorDescription);
                                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                    }
                                    
                                });
                                
                                
                            }}, 250,
                        200, 0);
                
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                
                break;
                
            case R.id.camera_multi_edit_select_allfile_btn:
                
                DJIDrone.getDjiCamera().selectAllFiles(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "selectAllFiles errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "selectAllFiles errorDescription = "+ mErr.errorDescription);
                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                    }
                    
                });
                
                break;
             
            case R.id.camera_multi_edit_unselect_allfile_btn:
                
                DJIDrone.getDjiCamera().unselectAllFiles(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "unselectAllFiles errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "unselectAllFiles errorDescription = "+ mErr.errorDescription);
                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                    }
                    
                });
                
                break;
            
            case R.id.camera_multi_edit_select_page_btn:
                
                DJIDrone.getDjiCamera().selectAllFilesInPage(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "selectAllFilesInPage errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "selectAllFilesInPage errorDescription = "+ mErr.errorDescription);
                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                    }
                    
                });
                
                break;
            
            case R.id.camera_multi_edit_unselect_page_btn:
                DJIDrone.getDjiCamera().unselectAllFilesInPage(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "unselectAllFilesInPage errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "unselectAllFilesInPage errorDescription = "+ mErr.errorDescription);
                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                    }
                    
                });
                break;
             
            case R.id.camera_multi_edit_delete_all_select_btn:
                
                DJIDrone.getDjiCamera().deleteAllSelectedFiles(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "deleteAllSelectedFiles errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "deleteAllSelectedFiles errorDescription = "+ mErr.errorDescription);
                        String result = "errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                    }
                    
                });
                
                break;
             
            case R.id.camera_multi_edit_download_all_select_btn:
                
                //"Dji Sdk"
                File destDir = new File(Environment.getExternalStorageDirectory().getPath() + "/Dji_Sdk_Test/");
                DJIDrone.getDjiCamera().downloadAllSelectedFiles(destDir,new DJIFileDownloadCallBack() {
                    
                    @Override
                    public void OnStart()
                    {
                        // TODO Auto-generated method stub
                        handler.sendMessage(handler.obtainMessage(SHOW_DOWNLOAD_PROGRESS_DIALOG, null));
                        
                        if(mDownloadDialog != null){
                            mDownloadDialog.setProgress(0);
                        }
                        
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, "download OnStart"));
                    }

                    @Override
                    public void OnError(Exception exception)
                    {
                        // TODO Auto-generated method stub
                        handler.sendMessage(handler.obtainMessage(HIDE_DOWNLOAD_PROGRESS_DIALOG, null));
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, "download OnError :"+exception.toString()));
                    }
                    
                    @Override
                    public void OnEnd()
                    {
                        // TODO Auto-generated method stub
                        
                        handler.sendMessage(handler.obtainMessage(HIDE_DOWNLOAD_PROGRESS_DIALOG, null));
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, "download OnEnd"));
                        
                        DJIDrone.getDjiCamera().finishDownloadAllSelectedFiles(new DJIExecuteResultCallback() {
                            
                            @Override
                            public void onResult(DJIError mErr)
                            {
                                // TODO Auto-generated method stub
                                Log.e("", "download finishDownloadAllSelectedFiles:"+mErr.errorDescription);
                            }
                        });
                    }

                    @Override
                    public void OnProgressUpdate(int progress)
                    {
                        // TODO Auto-generated method stub
                        if(mDownloadDialog != null){
                            mDownloadDialog.setProgress(progress);
                        }
                        
                    }

                });

                break;
                
            case R.id.camera_single_preview_mode_btn:
               
//                DJIDrone.getDjiCamera().enterSinglePreviewModeWithIndex(mPlayBackCurrentSelectIndex, new DJIExecuteResultCallback(){
//
//                    @Override
//                    public void onResult(DJIError mErr)
//                    {
//                        // TODO Auto-generated method stub
//                        Log.d(TAG, "enterSinglePreviewModeWithIndex errorCode = "+ mErr.errorCode);
//                        Log.d(TAG, "enterSinglePreviewModeWithIndex errorDescription = "+ mErr.errorDescription);
//                        String result = "enterSinglePreviewModeWithIndex errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
//                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
//                    }
//                    
//                });
                
                
                strlist = new ArrayList<String>();    
                
                for(int i = 1 ; i <= 8 ; i++){
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

                                DJIDrone.getDjiCamera().enterSinglePreviewModeWithIndex(pos1, new DJIExecuteResultCallback(){
                                
                                    @Override
                                    public void onResult(DJIError mErr)
                                    {
                                        // TODO Auto-generated method stub
                                        Log.d(TAG, "enterSinglePreviewModeWithIndex errorCode = "+ mErr.errorCode);
                                        Log.d(TAG, "enterSinglePreviewModeWithIndex errorDescription = "+ mErr.errorDescription);
                                        String result = "enterSinglePreviewModeWithIndex errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                    }
                                    
                                });
                                
                                
                            }}, 250,
                        200, 0);
                
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                
                break;
                
            case R.id.camera_single_preview_nextpage_btn:
                
                DJIDrone.getDjiCamera().singlePreviewNextPage(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "singlePreviewNextPage errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "singlePreviewNextPage errorDescription = "+ mErr.errorDescription);
                        String result = "singlePreviewNextPage errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                    }
                    
                });
                
                break;
                
            case R.id.camera_single_preview_prevpage_btn:
                
                DJIDrone.getDjiCamera().singlePreviewPreviousPage(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "singlePreviewPreviousPage errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "singlePreviewPreviousPage errorDescription = "+ mErr.errorDescription);
                        String result = "singlePreviewPreviousPage errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                    }
                    
                });
                
                break;
                
            case R.id.camera_single_preview_delect_current_btn:
                
                DJIDrone.getDjiCamera().deleteCurrentPreviewFile(new DJIExecuteResultCallback(){

                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "deleteCurrentPreviewFile errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "deleteCurrentPreviewFile errorDescription = "+ mErr.errorDescription);
                        String result = "deleteCurrentPreviewFile errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                    }
                    
                });
                
                break;

            case R.id.camera_single_preview_play_video_btn:
                
                DJIDrone.getDjiCamera().startVideoPlayback( new DJIExecuteResultCallback(){
                    
                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "startVideoPlayback errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "startVideoPlayback errorDescription = "+ mErr.errorDescription);
                        String result = "startVideoPlayback errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                    }
                    
                });
                
                break;
            
            case R.id.camera_single_preview_stop_video_btn:
                
                DJIDrone.getDjiCamera().stopVideoPlayback( new DJIExecuteResultCallback(){
                    
                    @Override
                    public void onResult(DJIError mErr)
                    {
                        // TODO Auto-generated method stub
                        Log.d(TAG, "stopVideoPlayback errorCode = "+ mErr.errorCode);
                        Log.d(TAG, "stopVideoPlayback errorDescription = "+ mErr.errorDescription);
                        String result = "stopVideoPlayback errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                    }
                    
                });
                
                break;
                
            case R.id.camera_single_preview_seek_video_btn:
                
                strlist = new ArrayList<String>();    
                
                for(int i = 0 ; i < 100 ; i++){
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

                                DJIDrone.getDjiCamera().setVideoPlaybackFromLocation((byte)pos1, new DJIExecuteResultCallback(){
                                
                                    @Override
                                    public void onResult(DJIError mErr)
                                    {
                                        // TODO Auto-generated method stub
                                        Log.d(TAG, "setVideoPlaybackFromLocation errorCode = "+ mErr.errorCode);
                                        Log.d(TAG, "setVideoPlaybackFromLocation errorDescription = "+ mErr.errorDescription);
                                        String result = "setVideoPlaybackFromLocation errorCode =" + mErr.errorCode + "\n"+"errorDescription =" + DJIError.getErrorDescriptionByErrcode(mErr.errorCode);
                                        handler.sendMessage(handler.obtainMessage(SHOWTOAST, result));
                                    }
                                    
                                });
                                
                                
                            }}, 250,
                        200, 0);
                
                mPopupNumberPicker.showAtLocation(findViewById(R.id.my_content_view),
                        Gravity.CENTER, 0, 0);
                
                break;
                
            default:
                break;
        }
    }
    
    private void setResultToToast(String result){
        Toast.makeText(CameraProtocolDemoActivity.this, result, Toast.LENGTH_SHORT).show();
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
    
    public interface pickerValueChangeListener {
        void onValueChange(int pos1,int pos2);
    }
    
    private ProgressDialog mDownloadDialog;
    
    private void CreateProgressDialog() {
        
        mDownloadDialog = new ProgressDialog(CameraProtocolDemoActivity.this);
        mDownloadDialog.setTitle(R.string.sync_file_title);
        mDownloadDialog.setIcon(android.R.drawable.ic_dialog_info);
        mDownloadDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        mDownloadDialog.setCanceledOnTouchOutside(false);
        mDownloadDialog.setCancelable(false);        
    }
    
    private void ShowDownloadProgressDialog() {
        if(mDownloadDialog != null){
            mDownloadDialog.show();
        }
    }

    private void HideDownloadProgressDialog() {
        if (null != mDownloadDialog && mDownloadDialog.isShowing()) {
            mDownloadDialog.dismiss();
        }
    }

}
