package com.dji.sdk.sample.internal.view;

import android.app.Service;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dji.sdk.sample.R;

/**
 * Created by dji on 15/12/20.
 */
public abstract class BaseThreeBtnView extends LinearLayout implements View.OnClickListener, PresentableView {

    protected final static int DISABLE = 0;
    private TextView infoText;
    protected Button middleBtn;
    protected Button leftBtn;
    protected Button rightBtn;

    public BaseThreeBtnView(Context context) {
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
        layoutInflater.inflate(R.layout.view_three_btn, this, true);

        infoText = (TextView) findViewById(R.id.text_info);

        middleBtn = (Button) findViewById(R.id.btn_middle);

        leftBtn = (Button) findViewById(R.id.btn_left);
        rightBtn = (Button) findViewById(R.id.btn_right);

        if (getMiddleBtnTextResourceId() == DISABLE) {
            middleBtn.setVisibility(INVISIBLE);
        } else {
            middleBtn.setText(getString(getMiddleBtnTextResourceId()));
            middleBtn.setOnClickListener(this);
        }

        if (getLeftBtnTextResourceId() == DISABLE) {
            leftBtn.setVisibility(INVISIBLE);
        } else {
            leftBtn.setText(getString(getLeftBtnTextResourceId()));
            leftBtn.setOnClickListener(this);
        }

        if (getRightBtnTextResourceId() == DISABLE) {
            rightBtn.setVisibility(INVISIBLE);
        } else {
            rightBtn.setText(getString(getRightBtnTextResourceId()));
            rightBtn.setOnClickListener(this);
        }

        infoText.setText(getString(getDescriptionResourceId()));
    }

    private String getString(int id) {
        return getResources().getString(id);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_middle:
                handleMiddleBtnClick();
                break;

            case R.id.btn_left:
                handleLeftBtnClick();
                break;

            default:
                handleRightBtnClick();
                break;
        }
    }

    protected void changeDescription(@StringRes int newDescriptionResID) {
        changeDescription(getContext().getString(newDescriptionResID));
    }

    protected void changeDescription(final String newDescription) {
        post(new Runnable() {
            @Override
            public void run() {
                infoText.setText(newDescription);
            }
        });
    }

    /**
     * @return DISABLE to hide button
     */
    protected abstract int getMiddleBtnTextResourceId();

    /**
     * @return DISABLE to hide button
     */
    protected abstract int getLeftBtnTextResourceId();

    /**
     * @return DISABLE to hide button
     */
    protected abstract int getRightBtnTextResourceId();

    protected abstract int getDescriptionResourceId();

    protected abstract void handleMiddleBtnClick();

    protected abstract void handleLeftBtnClick();

    protected abstract void handleRightBtnClick();
}
