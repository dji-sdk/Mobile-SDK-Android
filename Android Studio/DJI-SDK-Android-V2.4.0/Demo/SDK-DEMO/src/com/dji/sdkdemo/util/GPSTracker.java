//Courtesy of http://www.androidhive.info/2012/08/android-working-with-google-places-and-maps-tutorial/

package com.dji.sdkdemo.util;

import java.util.Iterator;
import android.app.AlertDialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.CursorJoiner.Result;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.Settings;
import android.text.format.Time;
import android.util.Log;
import android.widget.Toast;

public class GPSTracker extends Service implements LocationListener {

    private  Context mContext;

    // flag for GPS status
    boolean isGPSEnabled = false;

    // flag for network status
    boolean isNetworkEnabled = false;

    // flag for GPS status
    boolean canGetLocation = false;

    Location location = null; // location
    double latitude; // latitude
    double longitude; // longitude
    float accuracy; //定位精度

    // The minimum distance to change Updates in meters
    private static final float MIN_DISTANCE_CHANGE_FOR_UPDATES = 0.0f; // 0.5 meters

    // The minimum time between updates in milliseconds
    private static final long MIN_TIME_BW_UPDATES = 500; // 1 second

    // Declaring a Location Manager
    protected LocationManager locationManager;

    public GPSTracker(Context context) {
        this.mContext = context;
        getLocation();
    }      

    public Location getLocation() {
        try {
            locationManager = (LocationManager) mContext.getSystemService(LOCATION_SERVICE);

            // getting GPS status
            isGPSEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);

            if (!isGPSEnabled) {
                Log.d("GPS", "gps no  provider is enabled");
                this.canGetLocation = false;
            } else {
                this.canGetLocation = true;
                locationManager.requestLocationUpdates(
                        LocationManager.GPS_PROVIDER,
                        MIN_TIME_BW_UPDATES,
                        MIN_DISTANCE_CHANGE_FOR_UPDATES, this);
                Log.d("GPS", "GPS Enabled");
                if (locationManager != null) {
                    location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
                    if (location != null) {
                        latitude = location.getLatitude();
                        longitude = location.getLongitude();
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        //locationManager.addGpsStatusListener(statusListener); // 注册状态信息回调
        return location;
    }
    
     
    /** 
     * @Description : Get Gps Setting State
     * @author      : andy.zhao
     * @date        : 2014年8月14日 下午10:40:56
     * @return      : boolean
     */
    public boolean getGpsEnabled(){
        boolean result = false;
        locationManager = (LocationManager) mContext.getSystemService(LOCATION_SERVICE);

        // getting GPS status
        result = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        return result;
    }

    /**
     * Stop using GPS listener Calling this function will stop using GPS in your
     * app
     * */
    public void stopUsingGPS() {
        if (locationManager != null) {
            locationManager.removeUpdates(GPSTracker.this);
        }
    }

    /**
     * Function to get latitude
     * */
    public double getLatitude() {
        if (location != null) {
            latitude = location.getLatitude();
        }

        // return latitude
        return latitude;
    }

    /**
     * Function to get longitude
     * */
    public double getLongitude() {
        if (location != null) {
            longitude = location.getLongitude();
        }

        // return longitude
        return longitude;
    }
    
       /**
     * Function to get accuracy
     * */
    public float getAccuracy() {
        if (location != null) {
            accuracy = location.getAccuracy();
        }

        // return accuracy
        return accuracy;
    }
    

    /**
     * Function to check GPS/wifi enabled
     * 
     * @return boolean
     * */
    public boolean canGetLocation() {
        return this.canGetLocation;
    }

    /**
     * Function to show settings alert dialog On pressing Settings button will
     * lauch Settings Options
     * */
    public void showSettingsAlert() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(mContext);

        // Setting Dialog Title
        alertDialog.setTitle("GPS is settings");

        // Setting Dialog Message
        alertDialog.setMessage("GPS is not enabled. Do you want to go to settings menu?");

        // On pressing Settings button
        alertDialog.setPositiveButton("Settings",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(
                                Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                        mContext.startActivity(intent);
                    }
                });

        // on pressing cancel button
        alertDialog.setNegativeButton("Cancel",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

        // Showing Alert Message
        alertDialog.show();
    }  
  
    @Override   
    public void onLocationChanged(Location location) {
        this.location = location;
    }

    @Override
    public void onProviderDisabled(String provider) {
    }

    @Override
    public void onProviderEnabled(String provider) {
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
    }

    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    }
    
//  /** 
//     * 卫星状态监听器 
//     */  
//    private final GpsStatus.Listener statusListener = new GpsStatus.Listener() {  
//        public void onGpsStatusChanged(int event) { // GPS状态变化时的回调，如卫星数  
//            GpsStatus status = locationManager.getGpsStatus(null); // 取当前状态  
//            updateGpsStatus(event, status);
//        }  
//    };  
//  
//    public int num = 0;
//    private void updateGpsStatus(int event, GpsStatus status) {  
//        if (event == GpsStatus.GPS_EVENT_SATELLITE_STATUS) {  
//            int maxSatellites = status.getMaxSatellites();  
//            Iterator<GpsSatellite> it = status.getSatellites().iterator();  
//            num = 0;
//            while (it.hasNext() && num <= maxSatellites) {  
//                GpsSatellite s = it.next(); 
//                num++;  
//            }  
//  
//        }  
//    }    
}
