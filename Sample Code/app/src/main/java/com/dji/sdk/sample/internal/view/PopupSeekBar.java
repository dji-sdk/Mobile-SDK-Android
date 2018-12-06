package com.dji.sdk.sample.internal.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.SeekBarValueChangeListener;
import com.dji.sdk.sample.internal.utils.DensityUtil;

@SuppressLint("InflateParams")
public class PopupSeekBar extends PopupWindow {

    private static int MIN_VALUE = -1;
    private static int MAX_VALUE = -1;
    private static int selectedValue = -1;
    private static String TAG = "";
    private SeekBarValueChangeListener onCallBack = null;
    private TextView currentValueTextView;
    private Button submitButton;
    private SeekBar seekBar;

    public PopupSeekBar(Context context, int minValue, int maxValue, String tag,
                        SeekBarValueChangeListener itemClickEvent, int w, int h, int pos) {
        super(context);

        MIN_VALUE = minValue;
        MAX_VALUE = maxValue;
        TAG = tag;
        onCallBack = itemClickEvent;

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.seekbar, null);
        this.setContentView(view);
        this.setWidth(DensityUtil.dip2px(context, w));
        this.setHeight(DensityUtil.dip2px(context, h));
        this.setFocusable(true);//

        currentValueTextView = (TextView) view.findViewById(R.id.tv_progress);
        submitButton = (Button) view.findViewById(R.id.btn_submitValue);
        seekBar = (SeekBar) view.findViewById(R.id.seekBar_continuousValue);
        seekBar.setProgress(MIN_VALUE);
        seekBar.setMax(MAX_VALUE);
        seekBar.setOnSeekBarChangeListener(new OnDJISeekBarChangeListener());


        submitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                onCallBack.onValueChange(selectedValue, -1);
            }
        });

    }

    public void setProgress(int progress) {
        if (this.seekBar != null) {
            this.seekBar.setProgress(progress);
        }
    }

    class OnDJISeekBarChangeListener implements SeekBar.OnSeekBarChangeListener {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress,
                                      boolean fromUser) {
            if (progress < MIN_VALUE) {
                PopupSeekBar.this.seekBar.setProgress(MIN_VALUE);
                PopupSeekBar.this.seekBar.refreshDrawableState();
                selectedValue = MIN_VALUE;
                currentValueTextView.setText(TAG + " minimum value: " + MIN_VALUE);
            } else {
                selectedValue = progress;
                currentValueTextView.setText(TAG + " selected value: " + progress);
            }

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // TODO Auto-generated method stub

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // TODO Auto-generated method stub

        }

    }
}
