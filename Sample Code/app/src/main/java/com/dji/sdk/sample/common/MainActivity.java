package com.dji.sdk.sample.common;

import android.Manifest;
import android.animation.AnimatorInflater;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.dji.sdk.sample.R;

import java.util.Stack;
import dji.sdk.base.DJIBaseProduct;
import dji.thirdparty.eventbus.EventBus;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getName();

    private FrameLayout mContentFrameLayout;

    private ObjectAnimator mPushInAnimator;
    private ObjectAnimator mPushOutAnimator;
    private ObjectAnimator mPopInAnimator;
    private LayoutTransition mPopOutTransition;

    private Stack<SetViewWrapper> mStack;

    private TextView mTitleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG, "Comes into the onCreate");
        // When the compile and target version is higher than 22, please request the following permissions at runtime to ensure the SDK work well.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.VIBRATE,
                            Manifest.permission.INTERNET, Manifest.permission.ACCESS_WIFI_STATE,
                            Manifest.permission.WAKE_LOCK, Manifest.permission.ACCESS_COARSE_LOCATION,
                            Manifest.permission.ACCESS_NETWORK_STATE, Manifest.permission.ACCESS_FINE_LOCATION,
                            Manifest.permission.CHANGE_WIFI_STATE, Manifest.permission.MOUNT_UNMOUNT_FILESYSTEMS,
                            Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.SYSTEM_ALERT_WINDOW,
                            Manifest.permission.READ_PHONE_STATE,
                    }
                    , 1);
        }
        /**
         * each time the USB from the RC is connected/disconnected,
         * the phone will prompt the user to select the app they want
         * to connect
         */
//        Intent aoaIntent = getIntent();
//        if (aoaIntent!=null) {
//            String action = aoaIntent.getAction();
//            if (action== UsbManager.ACTION_USB_ACCESSORY_ATTACHED) {
//                Intent attachedIntent=new Intent();
//
//                attachedIntent.setAction(DJISDKManager.USB_ACCESSORY_ATTACHED);
//                sendBroadcast(attachedIntent);
//            }
//        }

        setContentView(R.layout.activity_main);

        setupActionBar();
        mContentFrameLayout = (FrameLayout) findViewById(R.id.framelayout_content);

        initParams();
        EventBus.getDefault().register(this);

        IntentFilter filter = new IntentFilter();
        filter.addAction(DJISampleApplication.FLAG_CONNECTION_CHANGE);
        registerReceiver(mReceiver, filter);

    }

    @Override
    protected void onDestroy() {
        EventBus.getDefault().unregister(this);
        unregisterReceiver(mReceiver);
        super.onDestroy();
    }

    private void setupActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if (null != actionBar) {
            actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            actionBar.setCustomView(R.layout.actionbar_custom);

            mTitleTextView = (TextView)(actionBar.getCustomView().findViewById(R.id.title_tv));
        }
    }

    private void setupInAnimations() {
        mPushInAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(this, R.animator.slide_in_right);
        mPushOutAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(this, R.animator.fade_out);
        mPopInAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(this, R.animator.fade_in);
        ObjectAnimator popOutAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(this, R.animator.slide_out_right);

        mPushOutAnimator.setStartDelay(100);

        mPopOutTransition = new LayoutTransition();
        mPopOutTransition.setAnimator(LayoutTransition.DISAPPEARING, popOutAnimator);
        mPopOutTransition.setDuration(popOutAnimator.getDuration());
    }

    private void initParams() {
        setupInAnimations();

        mStack = new Stack<SetViewWrapper>();
        View view = mContentFrameLayout.getChildAt(0);
        mStack.push(new SetViewWrapper(view, R.string.activity_component_list));
    }

    private void pushView(SetViewWrapper wrapper) {
        if (mStack.size() <= 0) return;

        mContentFrameLayout.setLayoutTransition(null);

        int titleId = wrapper.getTitleId();
        View showView = wrapper.getView();

        int preTitleId = mStack.peek().getTitleId();
        View preView = mStack.peek().getView();

        mStack.push(wrapper);

        mContentFrameLayout.addView(showView);

        mPushOutAnimator.setTarget(preView);
        mPushOutAnimator.start();

        mPushInAnimator.setTarget(showView);
        mPushInAnimator.setFloatValues(mContentFrameLayout.getWidth(), 0);
        mPushInAnimator.start();

        refreshTitle();
    }

    protected BroadcastReceiver mReceiver = new BroadcastReceiver() {

        @Override
        public void onReceive(Context context, Intent intent) {
            refreshTitle();
        }

    };

    private void refreshTitle() {
        if(mStack.size() > 1) {
            SetViewWrapper wrapper = mStack.peek();
            mTitleTextView.setText(wrapper.getTitleId());
        } else if(mStack.size() == 1) {
            DJIBaseProduct product = DJISampleApplication.getProductInstance();
            if(product != null && product.getModel() != null) {
                mTitleTextView.setText("" + product.getModel().getDisplayName());
            } else {
                mTitleTextView.setText(R.string.app_name);
            }
        }
    }

    private void popView() {

        if (mStack.size() <= 1) {
            finish();
            return;
        }

        SetViewWrapper removeWrapper = mStack.pop();

        View showView = mStack.peek().getView();
        View removeView = removeWrapper.getView();

        int titleId = mStack.peek().getTitleId();
        int preTitleId = 0;
        if (mStack.size() > 1) {
            preTitleId = mStack.get(mStack.size() - 2).getTitleId();
        }

        mContentFrameLayout.setLayoutTransition(mPopOutTransition);
        mContentFrameLayout.removeView(removeView);

        mPopInAnimator.setTarget(showView);
        mPopInAnimator.start();

        refreshTitle();

    }

    @Override
    public void onBackPressed() {
        if (mStack.size() > 1) {
            popView();
        } else {
            super.onBackPressed();
        }
    }

    public void onEventMainThread(SetViewWrapper wrapper) {
        pushView(wrapper);
    }

    public void onEventMainThread(SetViewWrapper.Remove wrapper) {

        if (mStack.peek().getView() == wrapper.getView()) {
            popView();
        }

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig){
        Log.v(TAG, "Comes into the onConfigruation");
        super.onConfigurationChanged(newConfig);
    }
}
