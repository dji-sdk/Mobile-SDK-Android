package com.dji.sdkdemo;

import java.util.Timer;
import java.util.TimerTask;

import android.R.integer;
import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.TextureView.SurfaceTextureListener;
import android.widget.TextView;
import dji.sdk.api.mediacodec.DJIVideoDecoder;
import dji.sdk.api.DJIDrone;
import dji.sdk.interfaces.DJIReceivedVideoDataCallBack;
import dji.sdk.api.Camera.DJICameraDecodeTypeDef.DecoderType;

public class PreviewDemoHwDecodeActivity extends DemoBaseActivity implements SurfaceTextureListener
{

    private static final String TAG = "PreviewDemoHwDecodeActivity";
    
    private TextureView mVideoSurface;
    private DJIReceivedVideoDataCallBack mReceivedVideoDataCallBack = null;
    
    private TextView mConnectStateTextView;
    private Timer mTimer;
    
    private DJIVideoDecoder mVideoDecoder = null; // 解码器实例
    
    //private boolean recvData = false;
    
    private final static int MSG_INIT_DECODER = 1;
    
    private Handler mHandler = new Handler(new Handler.Callback() {
        
        @Override
        public boolean handleMessage(Message msg)
        {
            // TODO Auto-generated method stub
            switch (msg.what)
            {
                case MSG_INIT_DECODER:
                    Surface mSurface = (Surface)msg.obj;
                    initDecoder(mSurface);
                    break;

                default:
                    break;
            }
            
            return false;
        }
    });
    
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
        
        PreviewDemoHwDecodeActivity.this.runOnUiThread(new Runnable(){

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
                    
//                    if(recvData){
//                        mConnectStateTextView.setTextColor(PreviewDemoActivity.this.getResources().getColor(R.color.blue));
//                    }
//                    else{
//                        mConnectStateTextView.setTextColor(PreviewDemoActivity.this.getResources().getColor(R.color.red));
//                    }
                }
            }
        });
        
    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview_hw_demo);
        
        mVideoSurface = (TextureView)findViewById(R.id.video_previewer_surface);
        
        mVideoSurface.setSurfaceTextureListener(this);
         
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
            DJIDrone.getDjiCamera().setReceivedVideoDataCallBack(null);
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        if (mVideoDecoder != null) {
            mVideoDecoder.stopVideoDecoder();
            mVideoDecoder = null;
        }
        
        super.onDestroy();
    }

    /** 
     * @Description : RETURN BTN RESPONSE FUNCTION
     */
    public void onReturn(View view){
        Log.d(TAG ,"onReturn");  
        this.finish();
    }
    
    /**
     * @param surface
     * @param width
     * @param height
     * @see android.view.TextureView.SurfaceTextureListener#onSurfaceTextureAvailable(android.graphics.SurfaceTexture,
     *      int, int)
     */
    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {
        if (mVideoDecoder == null) {
            Surface mSurface  = new Surface(surface);
            mHandler.sendMessageDelayed(Message.obtain(mHandler, MSG_INIT_DECODER, mSurface), 200);
        } else {
            mVideoDecoder.setSurface(new Surface(surface));
        }
    }

    /**
     * @param surface
     * @param width
     * @param height
     * @see android.view.TextureView.SurfaceTextureListener#onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture,
     *      int, int)
     */
    @Override
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {

    }

    /**
     * @param surface
     * @return
     * @see android.view.TextureView.SurfaceTextureListener#onSurfaceTextureDestroyed(android.graphics.SurfaceTexture)
     */
    @Override
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        if (mVideoDecoder != null)
            mVideoDecoder.setSurface(null);
        return false;
    }

    /**
     * @param surface
     * @see android.view.TextureView.SurfaceTextureListener#onSurfaceTextureUpdated(android.graphics.SurfaceTexture)
     */
    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {

    }

    /**
     * Description : init decoder
     */
    private void initDecoder(Surface surface) {
        DJIDrone.getDjiCamera().setDecodeType(DecoderType.Hardware);
        mVideoDecoder = new DJIVideoDecoder(this, surface);
        //mVideoDecoder.setRecvDataCallBack(null);
        
        mReceivedVideoDataCallBack = new DJIReceivedVideoDataCallBack(){

            @Override
            public void onResult(byte[] videoBuffer, int size)
            {
                //recvData = true;
                DJIDrone.getDjiCamera().sendDataToDecoder(videoBuffer,size);
            }
        };
       
        DJIDrone.getDjiCamera().setReceivedVideoDataCallBack(mReceivedVideoDataCallBack);

    }
}
