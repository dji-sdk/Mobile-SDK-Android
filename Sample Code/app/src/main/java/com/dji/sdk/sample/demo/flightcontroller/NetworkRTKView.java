package com.dji.sdk.sample.demo.flightcontroller;

import android.app.Service;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.PresentableView;

import com.dji.sdk.sample.R;

import androidx.annotation.NonNull;
import dji.common.error.DJIError;
import dji.common.flightcontroller.RTKState;
import dji.common.flightcontroller.rtk.CoordinateSystem;
import dji.common.flightcontroller.rtk.ReferenceStationSource;
import dji.common.util.CommonCallbacks;
import dji.sdk.flightcontroller.RTK;
import dji.sdk.network.RTKNetworkServiceProvider;

public class NetworkRTKView extends RelativeLayout implements View.OnClickListener, PresentableView {
    private TextView rtkInfoTV;
    private Button networkRTKBtn;
    private Button coordinateSystemBtn;
    private Button enableRTKBtn;

    private RTK rtk = null;
    private boolean isNetowrkRTKSet = false;
    private boolean isCoordinateSystemSet = false;

    public NetworkRTKView(Context context) {
        super(context);
        initUI(context);
        initRTK();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (ModuleVerificationUtil.isRTKAvailable()) {
                rtk.setStateCallback(new RTKState.Callback() {
                    @Override
                    public void onUpdate(@NonNull RTKState rtkState) {
                        String rtkStateBoard = "";
                        rtkStateBoard += "Positioning solution: " + rtkState.getPositioningSolution().name() + "\n";
                        rtkStateBoard += "is RTK being used: " + rtkState.isRTKBeingUsed() + "\n";
                        rtkStateBoard += "Fusion latitude: " + rtkState.getFusionMobileStationLocation().getLatitude() + "\n";
                        rtkStateBoard += "Fusion longitude: " + rtkState.getFusionMobileStationLocation().getLongitude() + "\n";
                        rtkStateBoard += "Fusion altitude: " + rtkState.getFusionMobileStationAltitude() + "\n";
                        rtkStateBoard += "Heading valid: " + rtkState.isHeadingValid() + "\n";
                        rtkStateBoard += "Fusion heading: " + rtkState.getFusionHeading() + "\n";
                        ToastUtils.setResultToText(rtkInfoTV, rtkStateBoard);
                    }
                });
            }
        } catch (Exception e) {

        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    private void initUI(Context context) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.view_networkrtk, this, true);
        rtkInfoTV = (TextView) findViewById(R.id.rtk_info);
        networkRTKBtn = (Button) findViewById(R.id.btn_set_network_rtk);
        coordinateSystemBtn = (Button) findViewById(R.id.btn_set_coordinate_system);
        enableRTKBtn = (Button) findViewById(R.id.btn_enable_rtk);
        networkRTKBtn.setOnClickListener(this);
        coordinateSystemBtn.setOnClickListener(this);
        enableRTKBtn.setOnClickListener(this);
    }

    private void initRTK() {
        if (ModuleVerificationUtil.isRTKAvailable()) {
            rtk = DJISampleApplication.getAircraftInstance().getFlightController().getRTK();
        }
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btn_set_network_rtk:
                if (rtk != null) {
                    rtk.setReferenceStationSource(ReferenceStationSource.NETWORK_RTK, new CommonCallbacks.CompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {
                            if (djiError == null) {
                                ToastUtils.setResultToToast("setReferenceStationSource ok");
                                isNetowrkRTKSet = true;
                            } else {
                                ToastUtils.setResultToToast("setReferenceStationSource failed" + djiError.getDescription());
                            }
                        }
                    });
                }
                break;
            case R.id.btn_set_coordinate_system:
                if (rtk != null) {
                    RTKNetworkServiceProvider.getInstance().setNetworkServiceCoordinateSystem(CoordinateSystem.WGS84, new CommonCallbacks.CompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {
                            if (djiError == null) {
                                ToastUtils.setResultToToast("setNetworkServiceCoordinateSystem to WGS84");
                                isCoordinateSystemSet = true;
                            } else {
                                ToastUtils.setResultToToast("setNetworkServiceCoordinateSystem failed" + djiError.getDescription());
                            }
                        }
                    });
                }
                break;
            case R.id.btn_enable_rtk:
                if (rtk != null && isNetowrkRTKSet && isCoordinateSystemSet) {
                    rtk.setRtkEnabled(true, new CommonCallbacks.CompletionCallback() {
                        @Override
                        public void onResult(DJIError djiError) {
                            ToastUtils.setResultToToast(djiError == null ? "setRtkEnabled ok" : "setRtkEnabled failed: " + djiError.getDescription());
                        }
                    });
                }
                break;
            default:
                break;
        }
    }

    @Override
    public int getDescription() {
        return R.string.flight_controller_listview_networkRTK;
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }
}
