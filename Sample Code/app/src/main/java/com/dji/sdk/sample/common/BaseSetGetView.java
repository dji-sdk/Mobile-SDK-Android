package com.dji.sdk.sample.common;

import android.app.Service;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.dji.sdk.sample.R;


/**
 * Created by dji on 15/12/20.
 */

public abstract class BaseSetGetView extends RelativeLayout implements View.OnClickListener {

    protected static final int SET_GET_TEXTVIEW_WITH_RESULT = 0;

    protected TextView mTextViewGet;
    protected TextView mTextViewInfo;

    protected Button mBtnGet;
    protected Button mBtnSet;

    protected Spinner mSpinnerSet;
    protected String mGetTextString;

    protected Handler mHandler = new Handler(new Handler.Callback() {

        @Override
        public boolean handleMessage(Message msg) {
            switch(msg.what) {
                case SET_GET_TEXTVIEW_WITH_RESULT :
                    mTextViewGet.setText(mGetTextString);
                    break;

                default:
                    break;
            }
            return false;
        }
    });

    public BaseSetGetView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initUI(context, attrs);
    }

    private void initUI(Context context, AttributeSet attrs) {
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Service.LAYOUT_INFLATER_SERVICE);

        View content = layoutInflater.inflate(R.layout.view_set_get, null, false);
        addView(content, new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));

        mTextViewGet = (TextView) findViewById(R.id.text_get);
        mTextViewInfo = (TextView) findViewById(R.id.text_info);

        mBtnGet = (Button) findViewById(R.id.btn_get);
        mBtnSet = (Button) findViewById(R.id.btn_set);

        mSpinnerSet = (Spinner) findViewById(R.id.spinner_set);

        mTextViewInfo.setText(getResources().getString(getInfo()));

        mSpinnerSet.setAdapter(getArrayAdapter());

        mBtnGet.setOnClickListener(this);
        mBtnSet.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_get:
                getMethod();
                break;

            case R.id.btn_set:
                setMethod();
                break;
        }
    }

    protected abstract void setMethod();

    protected abstract void getMethod();

    protected abstract int getInfo();

    protected abstract ArrayAdapter getArrayAdapter();
}
