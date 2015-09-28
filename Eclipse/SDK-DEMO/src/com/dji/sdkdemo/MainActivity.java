package com.dji.sdkdemo;

import dji.sdk.api.DJIDrone;
import dji.sdk.api.DJIError;
import dji.sdk.api.DJIDroneTypeDef.DJIDroneType;
import dji.sdk.interfaces.DJIGeneralListener;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends DemoBaseActivity
{
    private static final String TAG = "MainActivity";
    private int type = 0;
    
    private final int SHOWDIALOG = 2;
    
    private Handler handler = new Handler(new Handler.Callback() {
        
        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case SHOWDIALOG:
                    showMessage(getString(R.string.demo_activation_message_title),(String)msg.obj); 
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
        setContentView(R.layout.activity_main);
        
        ListView mListView = (ListView)findViewById(R.id.listView); 

        Intent intent= getIntent();  
        type = intent.getIntExtra("DroneType", 0);
        Log.v("type","Type" + type);
        
        if (type == 1 || type == 3) {
            mListView.setAdapter(new DemoListAdapter());
        } else if (type == 2) {
            mListView.setAdapter(new p3sDemoListAdapter());
        } 
        else {
            mListView.setAdapter(new p2vDemoListAdapter());
        }
        mListView.setOnItemClickListener(new OnItemClickListener() {  
            public void onItemClick(AdapterView<?> arg0, View v, int index, long arg3) {  
                onListItemClick(index);
            }  
        }); 
        
        //Log.e(TAG, "type = "+type);
        onInitSDK(type);
        
        new Thread(){
            public void run() {
                try {
                    DJIDrone.checkPermission(getApplicationContext(), new DJIGeneralListener() {
                        
                        @Override
                        public void onGetPermissionResult(int result) {
                            // TODO Auto-generated method stub
                            Log.e(TAG, "onGetPermissionResult = "+result);
                            Log.e(TAG, "onGetPermissionResultDescription = "+DJIError.getCheckPermissionErrorDescription(result));
                            if (result == 0) {
                                handler.sendMessage(handler.obtainMessage(SHOWDIALOG, DJIError.getCheckPermissionErrorDescription(result)));
                            } else {
                                handler.sendMessage(handler.obtainMessage(SHOWDIALOG, getString(R.string.demo_activation_error)+DJIError.getCheckPermissionErrorDescription(result)+"\n"+getString(R.string.demo_activation_error_code)+result));
                        
                            }
                        }
                    });
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }.start();
    }
    
    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
    }
    
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
    }
       
    @Override
    protected void onDestroy()
    {
        // TODO Auto-generated method stub
        onUnInitSDK();
        super.onDestroy();
    }
    
    private void onInitSDK(int type){
        switch(type){
            case 0 : {
                DJIDrone.initWithType(this.getApplicationContext(),DJIDroneType.DJIDrone_Vision);
                break;
            }
            case 1 : {
                DJIDrone.initWithType(this.getApplicationContext(),DJIDroneType.DJIDrone_Inspire1);
                break;
            }
            case 2 : {
                DJIDrone.initWithType(this.getApplicationContext(),DJIDroneType.DJIDrone_Phantom3_Advanced);
                break;
            }
            case 3 : {
                DJIDrone.initWithType(this.getApplicationContext(),DJIDroneType.DJIDrone_M100);
                break;
            }
            default : {
                break;
            }
        }
    	
        DJIDrone.connectToDrone();

    }
    
    private void onUnInitSDK(){
        DJIDrone.disconnectToDrone();
    }
    
    private void onListItemClick(int index) {
        Intent intent = null;
        switch (type) {
            case 0 : {
                intent = new Intent(MainActivity.this,p2vDemos[index].demoClass);
                break;
            }
            
            case 1 : {
                intent = new Intent(MainActivity.this, demos[index].demoClass);
                break;
            }
            //added by jian.zhao for p3s
            case 2 : {
                intent = new Intent(MainActivity.this, p3sDemos[index].demoClass);
                break;
            }
            
            case 3 : {
                intent = new Intent(MainActivity.this, demos[index].demoClass);
                break;
            }
            
            default : {
                break;
            }
        }
        this.startActivity(intent);
    }
    
    private static final DemoInfo[] demos = {
        new DemoInfo(R.string.demo_title_preview,R.string.demo_desc_preview, PreviewDemoActivity.class),
        new DemoInfo(R.string.demo_title_preview,R.string.demo_hw_decode_desc_preview, PreviewDemoHwDecodeActivity.class),
        new DemoInfo(R.string.demo_title_camera_protocol,R.string.demo_desc_camera_protocol, CameraProtocolDemoActivity.class),
        new DemoInfo(R.string.demo_title_main_controller_protocol,R.string.demo_desc_main_controller_protocol, MainControllerDemoActivity.class),
        new DemoInfo(R.string.demo_title_battery_protocol,R.string.demo_desc_battery_protocol, BatteryInfoDemoActivity.class),
        new DemoInfo(R.string.demo_title_gimbal_protocol,R.string.demo_desc_gimbal_protocol, GimbalDemoActivity.class),
        new DemoInfo(R.string.demo_title_gs_protocol,R.string.demo_desc_gs_protocol, GsProtocolDemoActivity.class),
        new DemoInfo(R.string.demo_title_gs_ioc_protocol,R.string.demo_desc_gs_ioc_protocol, GsProtocolIocDemoActivity.class),
        new DemoInfo(R.string.demo_title_gs_protocol_joystick,R.string.demo_desc_gs_protocol_joystick, GsProtocolJoystickDemoActivity.class),
        new DemoInfo(R.string.title_activity_gs_hot_point_protocol_demo,R.string.demo_desc_hot_point_protocol, GsProtocolHotPointDemoActivity.class),
        new DemoInfo(R.string.title_activity_gs_follow_me_protocol_demo,R.string.demo_desc_follow_me_protocol, GsProtocolFollowMeDemoActivity.class),
        new DemoInfo(R.string.demo_title_remote_control_protocol,R.string.demo_desc_remote_control_protocol,RemoteControlDemoActivity.class),
        new DemoInfo(R.string.demo_title_image_transmitter_protocol,R.string.demo_desc_image_transmitter_protocol,ImageTransmitterDemoActivity.class),
        new DemoInfo(R.string.demo_title_media_sync,R.string.demo_desc_media_sync, MediaSyncDemoActivity.class),
        new DemoInfo(R.string.demo_title_get_video_frame,R.string.demo_desc_get_video_frame,GetVideoFrameDataOnlyDemoActivity.class)
    };
    
    private static final DemoInfo[] p2vDemos = {
        new DemoInfo(R.string.demo_title_preview,R.string.demo_desc_preview, PreviewDemoActivity.class),
        new DemoInfo(R.string.demo_title_camera_protocol,R.string.demo_desc_camera_protocol, CameraProtocolDemoActivity.class),
        new DemoInfo(R.string.demo_title_main_controller_protocol,R.string.demo_desc_main_controller_protocol, MainControllerDemoActivity.class),
        new DemoInfo(R.string.demo_title_battery_protocol,R.string.demo_desc_battery_protocol, BatteryInfoDemoActivity.class),
        new DemoInfo(R.string.demo_title_gimbal_protocol,R.string.demo_desc_gimbal_protocol, GimbalDemoActivity.class),
        new DemoInfo(R.string.demo_title_gs_protocol,R.string.demo_desc_gs_protocol, GsProtocolDemoActivity.class),
        new DemoInfo(R.string.demo_title_gs_protocol_joystick,R.string.demo_desc_gs_protocol_joystick, GsProtocolJoystickDemoActivity.class),
        new DemoInfo(R.string.demo_title_range_extender,R.string.demo_desc_range_extender, RangeExtenderDemoActivity.class),
        new DemoInfo(R.string.demo_title_media_sync,R.string.demo_desc_media_sync, MediaSyncDemoActivity.class)
    };
    // added by jian.zhao for p3s
    private static final DemoInfo[] p3sDemos = {
        new DemoInfo(R.string.demo_title_preview,R.string.demo_desc_preview, PreviewDemoActivity.class),
        new DemoInfo(R.string.demo_title_camera_protocol,R.string.demo_desc_camera_protocol, CameraProtocolDemoActivity.class),
        new DemoInfo(R.string.demo_title_main_controller_protocol,R.string.demo_desc_main_controller_protocol, MainControllerDemoActivity.class),
        new DemoInfo(R.string.demo_title_battery_protocol,R.string.demo_desc_battery_protocol, BatteryInfoDemoActivity.class),
        new DemoInfo(R.string.demo_title_gimbal_protocol,R.string.demo_desc_gimbal_protocol, GimbalDemoActivity.class),
        new DemoInfo(R.string.demo_title_gs_protocol,R.string.demo_desc_gs_protocol, GsProtocolDemoActivity.class),
        new DemoInfo(R.string.demo_title_gs_ioc_protocol,R.string.demo_desc_gs_ioc_protocol, GsProtocolIocDemoActivity.class),
        new DemoInfo(R.string.demo_title_gs_protocol_joystick,R.string.demo_desc_gs_protocol_joystick, GsProtocolJoystickDemoActivity.class),
        new DemoInfo(R.string.title_activity_gs_hot_point_protocol_demo,R.string.demo_desc_hot_point_protocol, GsProtocolHotPointDemoActivity.class),
        new DemoInfo(R.string.title_activity_gs_follow_me_protocol_demo,R.string.demo_desc_follow_me_protocol, GsProtocolFollowMeDemoActivity.class),
        new DemoInfo(R.string.demo_title_remote_control_protocol,R.string.demo_desc_remote_control_protocol,RemoteControlDemoActivity.class),
        new DemoInfo(R.string.demo_title_image_transmitter_protocol,R.string.demo_desc_image_transmitter_protocol,ImageTransmitterDemoActivity.class),
        new DemoInfo(R.string.demo_title_media_sync,R.string.demo_desc_media_sync, MediaSyncDemoActivity.class)
    };

    @SuppressLint("ViewHolder")
    private  class DemoListAdapter extends BaseAdapter {
        public DemoListAdapter() {
            super();
        }

        @Override
        public View getView(int index, View convertView, ViewGroup parent) {
            convertView = View.inflate(MainActivity.this, R.layout.demo_info_item, null);
            TextView title = (TextView)convertView.findViewById(R.id.title);
            TextView desc = (TextView)convertView.findViewById(R.id.desc);

            title.setText(demos[index].title);
            desc.setText(demos[index].desc);
            return convertView;
        }
        @Override
        public int getCount() {
            return demos.length;
        }
        @Override
        public Object getItem(int index) {
            return  demos[index];
        }

        @Override
        public long getItemId(int id) {
            return id;
        }
    }
    
    @SuppressLint("ViewHolder")
    private  class p2vDemoListAdapter extends BaseAdapter {
        public p2vDemoListAdapter() {
            super();
        }

        @Override
        public View getView(int index, View convertView, ViewGroup parent) {
            convertView = View.inflate(MainActivity.this, R.layout.demo_info_item, null);
            TextView title = (TextView)convertView.findViewById(R.id.title);
            TextView desc = (TextView)convertView.findViewById(R.id.desc);

            title.setText(p2vDemos[index].title);
            desc.setText(p2vDemos[index].desc);
            return convertView;
        }
        @Override
        public int getCount() {
            return p2vDemos.length;
        }
        @Override
        public Object getItem(int index) {
            return  p2vDemos[index];
        }

        @Override
        public long getItemId(int id) {
            return id;
        }
    }
    // added by jian.zhao for p3s.
    @SuppressLint("ViewHolder")
    private  class p3sDemoListAdapter extends BaseAdapter {
        public p3sDemoListAdapter() {
            super();
        }

        @Override
        public View getView(int index, View convertView, ViewGroup parent) {
            convertView = View.inflate(MainActivity.this, R.layout.demo_info_item, null);
            TextView title = (TextView)convertView.findViewById(R.id.title);
            TextView desc = (TextView)convertView.findViewById(R.id.desc);

            title.setText(p3sDemos[index].title);
            desc.setText(p3sDemos[index].desc);
            return convertView;
        }
        @Override
        public int getCount() {
            return p3sDemos.length;
        }
        @Override
        public Object getItem(int index) {
            return  p3sDemos[index];
        }

        @Override
        public long getItemId(int id) {
            return id;
        }
    }
    
   private static class DemoInfo{
        private final int title;
        private final int desc;
        private final Class<? extends android.app.Activity> demoClass;

        public DemoInfo(int title , int desc,Class<? extends android.app.Activity> demoClass) {
            this.title = title;
            this.desc  = desc;
            this.demoClass = demoClass;
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
   
   public void showMessage(String title, String msg) {
       AlertDialog.Builder builder = new AlertDialog.Builder(this);
       builder.setTitle(title)
               .setMessage(msg)
               .setCancelable(false)
               .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int id) {
                       dialog.cancel();
                   }
               });
       AlertDialog alert = builder.create();
       alert.show();
   }
   
}
