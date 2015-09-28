
package com.dji.sdkdemo;

import java.util.Timer;
import java.util.TimerTask;

import com.dji.sdkdemo.util.Tools;

import dji.sdk.api.DJIDrone;
import dji.sdk.api.RangeExtender.DJIRangeExtenderMsgTypeDef.RangeExtenderActionResult;
import dji.sdk.interfaces.DJIRangeExtenderActionCallback;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RangeExtenderDemoActivity extends DemoBaseActivity implements OnClickListener{
    private static final String TAG = "RangeExtenderDemoActivity";
    
    private TextView mCurrentBindedSsidTextView;
    private TextView mCurrentBindedMacTextView;
    private TextView mCurrentPowerLevelTextView;
    private TextView mConnectStateTextView;
    private EditText mEditMacAddr4,mEditMacAddr5,mEditMacAddr6;
    private EditText mNewSsidEditText;
    private EditText mSetPasswordEditText;
    
    private Button mStartBindButton;
    private Button mStartRenameButton;
    private Button mStartSetPasswordButton;
    
    
    private Timer mTimer;
    private Context mContext;
    private boolean bConnectCameraFlag = false;
    private boolean bConnectExenderFlag = false;
    
    private final int SHOWTOAST = 1;
    private final int SHOW_CONNECT_FAILED_DIALOG = 2;
    private final int REFRESH_BINDED_INFO = 3;    
    private final int SHOW_BIND_SUCCESS_DIALOG = 4;
    private final int SHOW_BIND_FAILED_DIALOG = 5;
    private final int SHOW_RENAME_SUCCESS_DIALOG = 6;
    private final int SHOW_RENAME_FAILED_DIALOG = 7;
    private final int SHOW_SETPASSWORD_SUCCESS_DIALOG = 8;
    private final int SHOW_SETPASSWORD_FAILED_DIALOG = 9;
    private final int SHOW_PROGRESS_DIALOG = 10;
    private final int HIDE_PROGRESS_DIALOG = 11;
    
    
    private AlertDialog mAlertDialog;
    private ProgressDialog mDialog;
    
    class Task extends TimerTask {
        int times = 0;
        @Override
        public void run() 
        {
            //Log.d(TAG ,"==========>Task Run In!");
            times++;
            if(times %4 == 0){
                times = 0;
                refreshPowerLevel();
            }
            checkConnectState(); 
        }

    };
    private void showDialog(String message) {
        
        if( mAlertDialog!=null && mAlertDialog.isShowing()){
            mAlertDialog.dismiss();
        }
        
        mAlertDialog = new AlertDialog.Builder(this)
        .setCancelable(false)
        .setTitle(R.string.Info)
        .setMessage(message) 
        .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { //左侧按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                RangeExtenderDemoActivity.this.finish();
            }
        })
        .create();

        mAlertDialog.show();
        
    }
    
    private Handler handler = new Handler(new Handler.Callback() {
        
        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case SHOWTOAST:
                    setResultToToast((String)msg.obj); 
                    break;
                case REFRESH_BINDED_INFO:
                    refreshBindedInfo();
                    break; 
                case SHOW_CONNECT_FAILED_DIALOG:
                    showDialog(getString(R.string.failed_to_get_repeater_info));
                    break;                   
                case SHOW_BIND_SUCCESS_DIALOG:
                    showDialog(getString(R.string.Bind_Success));
                    break;
                case SHOW_BIND_FAILED_DIALOG:
                    showDialog(getString(R.string.Bind_Failed));
                    break;
                case SHOW_RENAME_SUCCESS_DIALOG:
                    showDialog(getString(R.string.Rename_Success));
                    break;
                case SHOW_RENAME_FAILED_DIALOG:
                    showDialog(getString(R.string.Rename_Failed));
                    break;  
                case SHOW_SETPASSWORD_SUCCESS_DIALOG:
                    showDialog(getString(R.string.Set_Password_Success));
                    break;
                case SHOW_SETPASSWORD_FAILED_DIALOG:
                    showDialog(getString(R.string.Set_Password_Failed));
                    break;  
                case SHOW_PROGRESS_DIALOG:
                    ShowProgressDialog();
                    break;  
                case HIDE_PROGRESS_DIALOG:
                    HideProgressDialog();
                    break;                      
                    
                default:
                    break;
            }
            return false;
        }
    });
    
    private void setResultToToast(String result){
        Toast.makeText(RangeExtenderDemoActivity.this, result, Toast.LENGTH_SHORT).show();
    }
    
    private void checkConnectState(){
        
        RangeExtenderDemoActivity.this.runOnUiThread(new Runnable(){

            @Override
            public void run() 
            {   
                if(DJIDrone.getDjiCamera() != null){
                    boolean bConnectState = DJIDrone.getDjiCamera().getCameraConnectIsOk();
                    if(bConnectState){
                        mConnectStateTextView.setText(R.string.camera_connection_ok);
                        bConnectCameraFlag = true;
                    }
                    else{
                        mConnectStateTextView.setText(R.string.camera_connection_break);
                        bConnectCameraFlag = false;
                    }
                }
            }
        });
        
    }
    
    private void refreshPowerLevel(){
        
        RangeExtenderDemoActivity.this.runOnUiThread(new Runnable(){

            @Override
            public void run() 
            {   
                int level = DJIDrone.getDjiRangeExtender().getRangeExtenderPowerLevel();
                
                if(level >= 0){
                    mCurrentPowerLevelTextView.setText("Power Level:\n"+level);
                }
            }
        });
        
    }
    
    
    private void refreshBindedInfo(){
        
        RangeExtenderDemoActivity.this.runOnUiThread(new Runnable(){

            @Override
            public void run() 
            {   
                String mSsid = DJIDrone.getDjiRangeExtender().getCurrentBindingSSID();
                String mMac = DJIDrone.getDjiRangeExtender().getCurrentBindingMAC();
                mCurrentBindedSsidTextView.setText(mSsid);
                mCurrentBindedMacTextView.setText(mMac);
            }
        });
        
    }
    
    private void startBind(){
        
        if(!bConnectExenderFlag ){
            return;
        }
        String mac_byte4 = mEditMacAddr4.getText().toString();
        String mac_byte5 = mEditMacAddr5.getText().toString();
        String mac_byte6 = mEditMacAddr6.getText().toString();
        
        if(mac_byte4.length() < 2 || mac_byte5.length() < 2 || mac_byte6.length() < 2){
            handler.sendMessage(handler.obtainMessage(SHOWTOAST, getString(R.string.mac_not_finish_input)));
            return;
        }
        
        mac_byte4 = mac_byte4.toLowerCase();
        mac_byte5 = mac_byte5.toLowerCase();
        mac_byte6 = mac_byte6.toLowerCase();
        
        String mMAC = "60"+":"+"60"+":"+"1f"+":"+mac_byte4+":"+mac_byte5+":"+mac_byte6; 
        String mSSID = "FC200_"+mac_byte4+mac_byte5+mac_byte6;
        handler.sendMessage(handler.obtainMessage(SHOW_PROGRESS_DIALOG, null));
        DJIDrone.getDjiRangeExtender().bindRangeExtenderWithCameraMAC(mMAC,mSSID,new DJIRangeExtenderActionCallback(){

            @Override
            public void onResult(RangeExtenderActionResult result) {
                // TODO Auto-generated method stub
                handler.sendMessage(handler.obtainMessage(HIDE_PROGRESS_DIALOG, null));
                if(result == RangeExtenderActionResult.Bind_Result_Successed){
                    handler.sendMessage(handler.obtainMessage(SHOW_BIND_SUCCESS_DIALOG, null));
                }
                else{
                    handler.sendMessage(handler.obtainMessage(SHOW_BIND_FAILED_DIALOG, null));
                }
            }
            
        });
    }
    
    private void startRename(){
        
        if(!bConnectExenderFlag ){
            return;
        }
        
        String mNewSSID = "Phantom_"+mNewSsidEditText.getText().toString();
        
        if(!Tools.RepeaterSsidCheck(mNewSSID)){
            handler.sendMessage(handler.obtainMessage(SHOWTOAST, getString(R.string.ssid_invalid_char)));
            return;
        }
        
        handler.sendMessage(handler.obtainMessage(SHOW_PROGRESS_DIALOG, null));
        DJIDrone.getDjiRangeExtender().renameSsidOfRangeExtender(mNewSSID,new DJIRangeExtenderActionCallback(){

            @Override
            public void onResult(RangeExtenderActionResult result) {
                // TODO Auto-generated method stub
                handler.sendMessage(handler.obtainMessage(HIDE_PROGRESS_DIALOG, null));
                if(result == RangeExtenderActionResult.Rename_Result_Successed){
                    handler.sendMessage(handler.obtainMessage(SHOW_RENAME_SUCCESS_DIALOG, null));
                }
                else{
                    handler.sendMessage(handler.obtainMessage(SHOW_RENAME_FAILED_DIALOG, null));
                }
            }
            
        });
        
    }
    
    private void startSetPassword(){
        
        if(!bConnectExenderFlag ){
            return;
        }
        
        String mPassword = mSetPasswordEditText.getText().toString();
        
        if(mPassword == null){
            Log.d(TAG, "startSetPassword mPassword == null");
            return;
        }
        else{
            //Log.e(TAG, "startSetPassword mPassword =["+mPassword+"]");
            //Log.e(TAG, "startSetPassword len =["+mPassword.length()+"]");
            if(mPassword.length() == 0){
                mPassword = "";
                //Log.e(TAG, "startSetPassword "+"".equalsIgnoreCase(mPassword));
            }
            else{
                if(!Tools.RepeaterPasswordCheck(mPassword)){
                    handler.sendMessage(handler.obtainMessage(SHOWTOAST, getString(R.string.ssid_invalid_char)));
                    return;
                }
            }

        }

        handler.sendMessage(handler.obtainMessage(SHOW_PROGRESS_DIALOG, null));
        DJIDrone.getDjiRangeExtender().setRangeExtenderWifiPassword(mPassword,new DJIRangeExtenderActionCallback(){

            @Override
            public void onResult(RangeExtenderActionResult result) {
                // TODO Auto-generated method stub
                handler.sendMessage(handler.obtainMessage(HIDE_PROGRESS_DIALOG, null));
                if(result == RangeExtenderActionResult.SetPassword_Result_Successed){
                    handler.sendMessage(handler.obtainMessage(SHOW_SETPASSWORD_SUCCESS_DIALOG, null));
                }
                else{
                    handler.sendMessage(handler.obtainMessage(SHOW_SETPASSWORD_FAILED_DIALOG, null));
                }
            }
            
        });
        
    }
    
    private void CreateProgressDialog() {
        
        mDialog = new ProgressDialog(RangeExtenderDemoActivity.this);
        mDialog.setMessage(RangeExtenderDemoActivity.this.getResources().getString(
                R.string.Message_Waiting));
        mDialog.setCanceledOnTouchOutside(false);
        mDialog.setCancelable(false);
    }
    
    private void ShowProgressDialog() {
        if(mDialog != null){
            mDialog.show();
        }
    }

    private void HideProgressDialog() {
        if (null != mDialog && mDialog.isShowing()) {
            mDialog.dismiss();
        }
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_range_extender);

        mCurrentBindedSsidTextView = (TextView)findViewById(R.id.CurrentBindedSsidTextView);
        mCurrentBindedMacTextView = (TextView)findViewById(R.id.CurrentBindedMacTextView);
        mCurrentPowerLevelTextView = (TextView)findViewById(R.id.CurrentPowerLevelTextView);        
        mConnectStateTextView = (TextView)findViewById(R.id.ConnectStateExtenderTextView);        
        mEditMacAddr4 = (EditText)findViewById(R.id.EditMacAddr4);
        mEditMacAddr5 = (EditText)findViewById(R.id.EditMacAddr5);
        mEditMacAddr6 = (EditText)findViewById(R.id.EditMacAddr6);  
        mNewSsidEditText = (EditText)findViewById(R.id.NewSsidEditText);  
        mSetPasswordEditText =  (EditText)findViewById(R.id.NewPasswordEditText);         
        mStartBindButton = (Button)findViewById(R.id.StartBindButton);
        mStartRenameButton = (Button)findViewById(R.id.StartRenameButton);
        mStartSetPasswordButton = (Button)findViewById(R.id.StartSetPasswordButton);
        
        
        Tools.EditTextInputHexLimit(mEditMacAddr4,2);
        Tools.EditTextInputHexLimit(mEditMacAddr5,2);
        Tools.EditTextInputHexLimit(mEditMacAddr6,2);  
        
        mStartBindButton.setOnClickListener(this);
        mStartRenameButton.setOnClickListener(this);
        mStartSetPasswordButton.setOnClickListener(this);
        
        CreateProgressDialog();
        
        mContext = getApplicationContext();
        bConnectExenderFlag = false;
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        
        mTimer = new Timer();
        Task task = new Task();
        mTimer.schedule(task, 0, 500);
        
        handler.sendMessage(handler.obtainMessage(SHOW_PROGRESS_DIALOG, null));
        
        DJIDrone.getDjiRangeExtender().connectRangeExtender(mContext,new DJIRangeExtenderActionCallback(){

            @Override
            public void onResult(RangeExtenderActionResult result) {
                // TODO Auto-generated method stub
                Log.d(TAG,"connectRangeExtender result = "+result.toString());
                
                handler.sendMessage(handler.obtainMessage(HIDE_PROGRESS_DIALOG, null));
                
                if(result == RangeExtenderActionResult.Connect_Result_Successed){
                    handler.sendMessage(handler.obtainMessage(REFRESH_BINDED_INFO, null));
                    bConnectExenderFlag = true;
                }
                else{
                    bConnectExenderFlag = false;
                    handler.sendMessage(handler.obtainMessage(SHOW_CONNECT_FAILED_DIALOG, null));
                }
            }
            
        });
        
        super.onResume();
    }
    
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        
        if(mTimer!=null) {            
            mTimer.cancel();
            mTimer.purge();
            mTimer = null;
        }
        
        DJIDrone.getDjiRangeExtender().disconnectRangeExtender(mContext,new DJIRangeExtenderActionCallback(){

            @Override
            public void onResult(RangeExtenderActionResult result) {
                // TODO Auto-generated method stub
                Log.d(TAG,"disconnectRangeExtender result = "+result.toString());
                
                if(result == RangeExtenderActionResult.DisConnect_Result_Successed){
                    

                }
                else{

                }
            }
            
        });
        
        super.onPause();
    }
    
    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
    }
    
    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
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

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.StartBindButton:
                startBind();
                break;
            case R.id.StartRenameButton:
                startRename();
                break;
            case R.id.StartSetPasswordButton:
                startSetPassword();
                break;    
            default:
                break;
        }
    }
    
}
