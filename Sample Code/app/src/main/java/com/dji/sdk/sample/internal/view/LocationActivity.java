package com.dji.sdk.sample.internal.view;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.common.flightcontroller.FlightControllerState;
import dji.common.flightcontroller.GPSSignalLevel;
import dji.sdk.flightcontroller.FlightController;
import dji.sdk.products.Aircraft;
import dji.sdk.sdkmanager.DJISDKManager;

/**
 * Created by Dima Kovalenko on 30.03.2022.
 */
public class LocationActivity extends Activity {

    TextView coords;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        coords = new TextView(this);
        coords.setTextColor(Color.WHITE);
        coords.setTextSize(30);
        setContentView(coords);

        post();
    }

    private void post() {
        new Handler().postDelayed(() -> {
            if (DJISDKManager.getInstance().getProduct() != null) {
                boolean connected = ((Aircraft)DJISDKManager.getInstance().getProduct()).isConnected();
                if (connected && isFlightControllerSupported()) {
                    FlightController mFlightController = ((Aircraft)DJISDKManager.getInstance().getProduct()).getFlightController();
                    mFlightController.setStateCallback(new FlightControllerState.Callback() {
                        @Override
                        public void onUpdate(@NonNull FlightControllerState flightControllerState) {

                        }
                    });
                    FlightControllerState state = mFlightController.getState();
                    double droneLocationLat = state.getAircraftLocation().getLatitude();
                    double droneLocationLng = state.getAircraftLocation().getLongitude();
                    GPSSignalLevel gpsLevel = state.getGPSSignalLevel();
                    coords.setText(gpsLevel + " coords: " + droneLocationLat + ", " + droneLocationLng);
                } else if (!connected) {
                    coords.setText("not connected");
                } else {
                    coords.setText("FlightController is null");
                }
            }
            post();

        }, 1000);
    }

    private boolean isFlightControllerSupported() {
        return DJISDKManager.getInstance().getProduct() != null &&
                DJISDKManager.getInstance().getProduct() instanceof Aircraft &&
                ((Aircraft) DJISDKManager.getInstance().getProduct()).getFlightController() != null;
    }
}
