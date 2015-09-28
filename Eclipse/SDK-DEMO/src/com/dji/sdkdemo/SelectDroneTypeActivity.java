package com.dji.sdkdemo;

import java.util.Timer;
import java.util.TimerTask;

import dji.sdk.api.DJIDrone;
import dji.sdk.api.DJIDroneTypeDef.DJIDroneType;
import dji.sdk.interfaces.DJIDroneTypeChangedCallback;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint("ViewHolder") public class SelectDroneTypeActivity extends DemoBaseActivity
{
    private static final String TAG = "SelectDroneTypeActivity";
    
    private static final int SHOW_ALTER_DIALOG = 0;
    
    private DJIDroneType mType;
    
    private Handler mHandler = new Handler(new Handler.Callback() {
        
        @Override
        public boolean handleMessage(Message msg)
        {
            switch (msg.what) {
                case SHOW_ALTER_DIALOG : {

                    mOKBtn.setOnClickListener(new OnClickListener() {
                        
                        @Override
                        public void onClick(View v)
                        {   dialog.dismiss();
                            if (DJIDroneType.DJIDrone_Inspire1 == mType) {
                                onListItemClick(1);
                                return ;
                            }
                              
                            if (DJIDroneType.DJIDrone_Phantom3_Professional == mType) {
                                onListItemClick(1);
                                return;
                            }
                              
                            if (DJIDroneType.DJIDrone_Phantom3_Advanced == mType) {
                                onListItemClick(2);
                                return;
                            }
                              
                            if (DJIDroneType.DJIDrone_M100 == mType) {
                                onListItemClick(3);
                                return;
                            }
                            
                        }
                    });
                    TextView mTextView = (TextView) dialog.findViewById(R.id.DroneNodificationTextView);
                    mTextView.setText("The Drone is " + mType.name());
                    dialog.show();
                    break;
                }
                
                default :
                    break;
            }
            return false;
        }
    });
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_drone_type);
        
        ListView mListView = (ListView)findViewById(R.id.select_drone_listView); 
        mListView.setAdapter(new SelectDroneTypeAdapter());
        mListView.setOnItemClickListener(new OnItemClickListener() {  
            public void onItemClick(AdapterView<?> arg0, View v, int index, long arg3) {  
                onListItemClick(index);
            }  
        });
                
        DJIDrone.initAPPManager(this.getApplicationContext(), new DJIDroneTypeChangedCallback() {

            @Override
            public void onResult(DJIDroneType type)
            {
                mType = type;
                mHandler.sendEmptyMessage(SHOW_ALTER_DIALOG);
            }
            
        });
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
        super.onDestroy();
        Process.killProcess(Process.myPid());
    }
    
    private void onListItemClick(int index) {
        Intent intent = null;

        intent = new Intent(SelectDroneTypeActivity.this, MainActivity.class);
        
        intent.putExtra("DroneType", index);
        this.startActivity(intent);
    }
    
    private static final DroneTypeInfo[] DroneTypes = {
        new DroneTypeInfo(R.string.drone_type_title_p2v,R.string.drone_type_desc_p2v),
        new DroneTypeInfo(R.string.drone_type_title_inspire1,R.string.drone_type_desc_inspire1),
        new DroneTypeInfo(R.string.drone_type_title_p3s, R.string.drone_type_desc_p3s),
        new DroneTypeInfo(R.string.drone_type_title_m100, R.string.drone_type_desc_m100)
    };

    private  class SelectDroneTypeAdapter extends BaseAdapter {
        public SelectDroneTypeAdapter() {
            super();
        }

        @Override
        public View getView(int index, View convertView, ViewGroup parent) {
            convertView = View.inflate(SelectDroneTypeActivity.this, R.layout.demo_info_item, null);
            TextView title = (TextView)convertView.findViewById(R.id.title);
            TextView desc = (TextView)convertView.findViewById(R.id.desc);

            title.setText(DroneTypes[index].title);
            desc.setText(DroneTypes[index].desc);
            return convertView;
        }
        @Override
        public int getCount() {
            return DroneTypes.length;
        }
        @Override
        public Object getItem(int index) {
            return  DroneTypes[index];
        }

        @Override
        public long getItemId(int id) {
            return id;
        }
    }
    
   private static class DroneTypeInfo{
        private final int title;
        private final int desc;

        public DroneTypeInfo(int title , int desc) {
            this.title = title;
            this.desc  = desc;
        }
    }
   private static boolean first = false;
   private Timer ExitTimer = new Timer();
       
   class ExitCleanTask extends TimerTask{

           @Override
           public void run() {
               
               Log.e("ExitCleanTask", "Run in!!!! ");
               first = false;
           }
   }   
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Log.d(TAG,"onKeyDown KEYCODE_BACK");
            
            if (first) {
                first = false;
                finish();
            } 
            else 
            {
                first = true;
                Toast.makeText(SelectDroneTypeActivity.this, getText(R.string.press_again_exit), Toast.LENGTH_SHORT).show();
                ExitTimer.schedule(new ExitCleanTask(), 2000);
            }
            
            //finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
   
}
