package com.dji.sdk.sample.internal.view;

import android.app.Service;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.dji.sdk.sample.R;

/**
 * Created by dji on 15/12/20.
 */

public abstract class BaseSetGetView extends LinearLayout implements View.OnClickListener, PresentableView {

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
            switch (msg.what) {
                case SET_GET_TEXTVIEW_WITH_RESULT:
                    mTextViewGet.setText(mGetTextString);
                    break;

                default:
                    break;
            }
            return false;
        }
    });

    public BaseSetGetView(Context context) {
        super(context);
        initUI(context);
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }

    private void initUI(Context context) {
        setOrientation(VERTICAL);
        setBackgroundColor(context.getResources().getColor(R.color.white));
        setClickable(true);
        setWeightSum(1);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);

        layoutInflater.inflate(R.layout.view_set_get, this, true);

        mTextViewGet = (TextView) findViewById(R.id.text_get);
        mTextViewInfo = (TextView) findViewById(R.id.text_info);

        mBtnGet = (Button) findViewById(R.id.btn_get);
        mBtnSet = (Button) findViewById(R.id.btn_set);

        mSpinnerSet = (Spinner) findViewById(R.id.spinner_set);

        mTextViewInfo.setText(context.getString(getDescription()));

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

            default:
                setMethod();
                break;
        }
    }

    protected abstract void setMethod();

    protected abstract void getMethod();

    protected abstract ArrayAdapter getArrayAdapter();
}
