package com.dji.sdk.sample.demo.rid;

import android.app.Service;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.utils.Helper;
import com.dji.sdk.sample.internal.utils.PopupUtils;
import com.dji.sdk.sample.internal.view.PresentableView;

import androidx.annotation.NonNull;
import dji.sdk.sdkmanager.DJISDKManager;
import dji.sdk.uas.AreaCode;
import dji.sdk.uas.UASRemoteIDStatus;
import dji.sdk.uas.UASRemoteIDStatusListener;

import static com.google.android.gms.internal.zzahn.runOnUiThread;

public class UASView extends LinearLayout implements View.OnClickListener, PresentableView {

    Button changeUasCountryBtn;
    TextView uasInfoTV;

    private final UASRemoteIDStatusListener uasRemoteIDStatusListener = new UASRemoteIDStatusListener() {
        @Override
        public void onUpdate(UASRemoteIDStatus uasRemoteIDStatus) {
            runOnUiThread(()-> uasInfoTV.setText(uasRemoteIDStatus.toString()));
        }
    };

    public UASView(Context context) {
        super(context);
        setOrientation(LinearLayout.HORIZONTAL);
        setClickable(true);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.view_uas, this, true);
        init();
    }

    private void init() {

    }

    private void initUI() {
        changeUasCountryBtn = findViewById(R.id.btn_change_uas_country);
        uasInfoTV = findViewById(R.id.tv_uas_info);
        initOnclickListener();
    }

    private void initOnclickListener() {
        changeUasCountryBtn.setOnClickListener(this);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        initUI();
    }

    @Override
    public void onClick(View v) {
        if (v != null) {
            switch (v.getId()) {
                case R.id.btn_change_uas_country:
                    changeUasCountry();
                    break;
                default:
                    break;
            }
        }
    }

    void changeUasCountry() {
        final AreaCode[] areaCodes = AreaCode.values();
        final Runnable r = () -> {
            DJISDKManager.getInstance().getUasRemoteIDManager().setAreaCode(areaCodes[PopupUtils.INSTANCE.getIndex()[0]]);
            initUasListener();
            PopupUtils.INSTANCE.resetIndex();
        };
        PopupUtils.INSTANCE.initPopupNumberPicker(Helper.makeList(areaCodes), r,this);
    }

    private void initUasListener() {
        uasInfoTV.setText("");
        DJISDKManager.getInstance().getUasRemoteIDManager().addUASRemoteIDStatusListener(uasRemoteIDStatusListener);
    }

    @Override
    public int getDescription() {
        return R.string.uas_view;
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }

}
