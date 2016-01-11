package com.dji.sdk.sample.common;

import android.app.Service;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.dji.sdk.sample.R;


/**
 * Created by dji on 15/12/28.
 */
public abstract class BasePushDataView extends RelativeLayout {

    protected static final int CHANGE_TEXT_VIEW = 0;

    protected StringBuffer mStringBuffer;
    protected Handler mHandler = new Handler(new Handler.Callback() {

        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case CHANGE_TEXT_VIEW :
                    mTextViewOSD.setText(mStringBuffer.toString());
                    break;

                default:
                    break;
            }
            return false;
        }
    });


    protected TextView mTextViewOSD;

    public BasePushDataView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
        mStringBuffer = new StringBuffer();
    }

    private void init(Context context, AttributeSet attrs) {
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Service.LAYOUT_INFLATER_SERVICE);

        View content = layoutInflater.inflate(R.layout.view_show_osd, null, false);
        addView(content, new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));

        mTextViewOSD = (TextView) findViewById(R.id.text_show_osd);

        mTextViewOSD.setText(getOSDTextResourceString());
    }

    protected abstract String getOSDTextResourceString();
}
