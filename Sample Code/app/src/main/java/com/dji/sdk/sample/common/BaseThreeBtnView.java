package com.dji.sdk.sample.common;

import android.app.Service;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.dji.sdk.sample.R;

/**
 * Created by dji on 15/12/20.
 */
public abstract class BaseThreeBtnView extends RelativeLayout implements View.OnClickListener {
    protected TextView mTexInfo;

    protected Button mBtn1;
    protected Button mBtn2;
    protected Button mBtn3;

    public BaseThreeBtnView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initUI(context, attrs);
    }

    private void initUI(Context context, AttributeSet attrs) {
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Service.LAYOUT_INFLATER_SERVICE);

        View content = layoutInflater.inflate(R.layout.view_three_btn, null, false);
        addView(content, new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));

        mTexInfo = (TextView) findViewById(R.id.text_info);

        mBtn1 = (Button) findViewById(R.id.btn_first);
        mBtn2 = (Button) findViewById(R.id.btn_second);
        mBtn3 = (Button) findViewById(R.id.btn_third);

        mTexInfo.setText(getString(getInfoResourceId()));

        mBtn1.setText(getString(getBtn1TextResourceId()));
        mBtn2.setText(getString(getBtn2TextResourceId()));
        mBtn3.setText(getString(getBtn3TextResourceId()));

        mBtn1.setOnClickListener(this);
        mBtn2.setOnClickListener(this);
        mBtn3.setOnClickListener(this);

    }

    private String getString(int id) {
        return getResources().getString(id);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btn_first :
                getBtn1Method();
                break;

            case R.id.btn_second :
                getBtn2Method();
                break;

            case R.id.btn_third:
                getBtn3Method();
                break;
        }
    }

    protected abstract int getBtn1TextResourceId();
    protected abstract int getBtn2TextResourceId();
    protected abstract int getBtn3TextResourceId();

    protected abstract int getInfoResourceId();

    protected abstract void getBtn1Method();
    protected abstract void getBtn2Method();
    protected abstract void getBtn3Method();

}
