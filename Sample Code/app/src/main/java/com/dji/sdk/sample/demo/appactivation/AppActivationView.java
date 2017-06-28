package com.dji.sdk.sample.demo.appactivation;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.ModuleVerificationUtil;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.BaseAppActivationView;
import dji.common.error.DJIError;
import dji.common.flightcontroller.adsb.AirSenseAirplaneState;
import dji.common.flightcontroller.adsb.AirSenseSystemInformation;
import dji.common.realname.AircraftBindingState;
import dji.common.realname.AircraftBindingState.AircraftBindingStateListener;
import dji.common.realname.AppActivationState;
import dji.common.realname.AppActivationState.AppActivationStateListener;
import dji.common.util.CommonCallbacks;
import dji.sdk.flightcontroller.FlightController;
import dji.sdk.products.Aircraft;
import dji.sdk.realname.AppActivationManager;
import dji.sdk.sdkmanager.DJISDKManager;
import dji.sdk.useraccount.UserAccountManager;
import dji.common.useraccount.UserAccountState;

public class AppActivationView  extends BaseAppActivationView {

    private static final String TAG = AppActivationView.class.getSimpleName();
    private AppActivationManager appActivationManager= DJISDKManager.getInstance().getAppActivationManager();
    private AppActivationStateListener activationStatelistener;
    private AircraftBindingStateListener bindingStateListener;

    public AppActivationView(Context context) {
        super(context);
    }

    //region Mission Action Demo
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn_login:

                UserAccountManager.getInstance()
                                  .logIntoDJIUserAccount(this.getContext(),
                                                         new CommonCallbacks.CompletionCallbackWith<UserAccountState>() {
                                                             @Override
                                                             public void onSuccess(UserAccountState userAccountState) {
                                                                 ToastUtils.setResultToText(accountStateTV,
                                                                                            "Account State: "
                                                                                                + userAccountState.name());
                                                             }

                                                             @Override
                                                             public void onFailure(DJIError djiError) {
                                                                 ToastUtils.setResultToToast("error:"
                                                                                                 + djiError.getDescription());
                                                             }
                                                         });

                break;
            case R.id.btn_login_out:
                UserAccountManager.getInstance().logoutOfDJIUserAccount(new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError error) {
                        if (null == error) {
                            ToastUtils.setResultToToast("Success");
                            ToastUtils.setResultToText(accountStateTV, "NotLoggedIn");
                        } else {
                            ToastUtils.setResultToToast("error:" + error.getDescription());
                        }
                    }
                });
                break;
            default:
                break;
        }
    }
    //endregion

    //region View Life-Cycle
    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setUpListener();

        if (appActivationManager != null) {
            appActivationManager.addAppActivationStateListener(activationStatelistener);

            appActivationStateTV.setText("Activation State:" + appActivationManager.getAppActivationState());

            appActivationManager.addAircraftBindingStateListener(bindingStateListener);
            bindingStateTV.setText("Binding State:" + appActivationManager.getAircraftBindingState());
        }
        accountStateTV.setText("Account State: "+UserAccountManager.getInstance().getUserAccountState());

        if (ModuleVerificationUtil.isFlightControllerAvailable()) {
            FlightController flightController =
                ((Aircraft) DJISampleApplication.getProductInstance()).getFlightController();

            if (flightController != null) {
                flightController.setASBInformationCallback(new AirSenseSystemInformation.Callback() {
                    @Override
                    public void onUpdate(AirSenseSystemInformation information) {
                        final StringBuffer sb = new StringBuffer();
                        addLineToSB(sb, "ADSB Info", "");
                        if (information.getWarningLevel() != null) {
                            addLineToSB(sb, "WarningLevel", "" + information.getWarningLevel().name());
                        }
                        if (information.getAirplaneStates() != null && information.getAirplaneStates().length > 0) {
                            for (int i = 0; i < information.getAirplaneStates().length; i++) {

                                AirSenseAirplaneState state = information.getAirplaneStates()[i];
                                if (state != null) {
                                    addLineToSB(sb, "", "");
                                    addLineToSB(sb, "flight ID", "" + i);
                                    addLineToSB(sb, "ICAO Code", "" + state.getCode());
                                    addLineToSB(sb, "Heading", "" + state.getHeading());
                                    addLineToSB(sb, "Direction", "" + state.getRelativeDirection());
                                    addLineToSB(sb, "Distance", "" + state.getDistance());
                                    addLineToSB(sb, "Warning level", "" + state.getWarningLevel());
                                }
                            }
                        }

                        ToastUtils.setResultToText(adsbStateTV, sb.toString());
                    }
                });
            }
        } else {
            Log.i(DJISampleApplication.TAG, "onAttachedToWindow FC NOT Available");
        }

    }

    @Override
    protected void onDetachedFromWindow() {
        tearDownListener();
        super.onDetachedFromWindow();
    }
    //endregion

    //region Not important stuff
    private void setUpListener() {
        // Example of Listener
        activationStatelistener = new AppActivationStateListener() {
            @Override
            public void onUpdate(final AppActivationState appActivationState) {

                ToastUtils.setResultToText(appActivationStateTV, "Activation State: " + appActivationState);
            }
        };

        bindingStateListener = new AircraftBindingStateListener() {

            @Override
            public void onUpdate(final AircraftBindingState bindingState) {

                ToastUtils.setResultToText(bindingStateTV, "Binding State: " + bindingState);
            }
        };
    }

    private void tearDownListener() {
        if (activationStatelistener != null) {
            // Example of removing listeners
            appActivationManager.removeAppActivationStateListener(activationStatelistener);
        }
        if (bindingStateListener !=null) {
            appActivationManager.removeAircraftBindingStateListener(bindingStateListener);
        }
    }

    public static void addLineToSB(StringBuffer sb, String name, Object value) {
        if (sb == null) return;
        sb.
              append((name == null || "".equals(name)) ? "" : name + ": ").
              append(value == null ? "" : value + "").
              append("\n");
    }

    @Override
    public int getDescription() {
        return R.string.component_listview_app_activation;
    }
}
