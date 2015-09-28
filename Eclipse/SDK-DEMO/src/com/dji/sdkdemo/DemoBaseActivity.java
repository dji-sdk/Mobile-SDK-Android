package com.dji.sdkdemo;

import dji.midware.data.manager.P3.ServiceManager;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DemoBaseActivity extends Activity{
    private static final int INTERVAL_LOG = 300;
    private static long mLastTime = 0l;
    
    protected Dialog dialog;
    protected Button mOKBtn;
    protected Button mCancelBtn;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_switch_drone);
        dialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
        Window dialogWindow = dialog.getWindow();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes();
        dialogWindow.setGravity(Gravity.CENTER);
        dialogWindow.setAttributes(lp);
        
        mOKBtn = (Button) dialog.findViewById(R.id.OKBtn);
        mCancelBtn = (Button) dialog.findViewById(R.id.CancelBtn);
        
        mCancelBtn.setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v)
            {
                dialog.dismiss();
            }
        });
    }
    
    
    @Override
    protected void onResume() {
        super.onResume();

        ServiceManager.getInstance().pauseService(false);
    }
    
    @Override
    protected void onPause() {
        super.onPause();

        ServiceManager.getInstance().pauseService(true);
    }
    
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
            final long current = System.currentTimeMillis();
            if (current - mLastTime < INTERVAL_LOG) {
                Log.d("", "click double");
                mLastTime = 0;
            } else {
                mLastTime = current;
                Log.d("", "click single");
            }
        }
        return super.dispatchTouchEvent(ev);
    }
    
}
