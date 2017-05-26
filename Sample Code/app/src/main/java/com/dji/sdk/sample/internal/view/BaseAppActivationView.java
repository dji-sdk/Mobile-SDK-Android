package com.dji.sdk.sample.internal.view;

import android.app.Service;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.dji.sdk.sample.R;

public abstract class BaseAppActivationView extends FrameLayout implements View.OnClickListener,PresentableView{

    protected Button userAccountStateBtn;
    protected TextView bindingStateTV;
    protected TextView appActivationStateTV;
    protected TextView accountStateTV;
    protected TextView adsbStateTV;

    public BaseAppActivationView(Context context) {
        super(context);
        init(context);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }

    private void init(Context context) {
        setClickable(true);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);

        layoutInflater.inflate(R.layout.view_app_activation, this, true);

        appActivationStateTV = (TextView) findViewById(R.id.tv_activation_state_info);
        bindingStateTV = (TextView) findViewById(R.id.tv_binding_state_info);
        accountStateTV = (TextView) findViewById(R.id.tv_account_state_info);
        adsbStateTV = (TextView) findViewById(R.id.tv_adsb_info);
        userAccountStateBtn = (Button) findViewById(R.id.btn_login);
        userAccountStateBtn.setOnClickListener(this);
    }

}
