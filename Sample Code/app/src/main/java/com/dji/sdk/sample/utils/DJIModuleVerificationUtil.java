package com.dji.sdk.sample.utils;

import com.dji.sdk.sample.common.DJISampleApplication;

import dji.sdk.Products.DJIAircraft;
import dji.sdk.Products.DJIHandHeld;

/**
 * Created by dji on 16/1/6.
 */
public class DJIModuleVerificationUtil {
    public static boolean isProductModuleValid() {
        return (null != DJISampleApplication.getProductInstance());
    }

    public static boolean isAircraft() {
        return DJISampleApplication.getProductInstance() instanceof DJIAircraft;
    }

    public static boolean isHandHeld() {
        return DJISampleApplication.getProductInstance() instanceof DJIHandHeld;
    }
    public static boolean isCameraModuleValid() {
        return isProductModuleValid() &&
                (null != DJISampleApplication.getProductInstance().getCamera());
    }

    public static boolean isPlaybackValid() {
        return isCameraModuleValid() &&
                (null != DJISampleApplication.getProductInstance().getCamera().getPlayback());
    }

    public static boolean isMediaManagerValid() {
        return isCameraModuleValid() &&
                (null != DJISampleApplication.getProductInstance().getCamera().getMediaManager());
    }

    public static boolean isRemoteControllerValid() {
        return isProductModuleValid() && isAircraft() &&
        (null != DJISampleApplication.getAircraftInstance().getRemoteController());
    }

    public static boolean isFlightControllerValid() {
        return isProductModuleValid() && isAircraft() &&
        (null != DJISampleApplication.getAircraftInstance().getFlightController());
    }

    public static boolean isCompassValid() {
        return isFlightControllerValid() && isAircraft() &&
        (null != DJISampleApplication.getAircraftInstance().getFlightController().getCompass());
    }

    public static boolean isFlightLimitationValid() {
        return isFlightControllerValid() && isAircraft() &&
                (null != DJISampleApplication.getAircraftInstance().
                        getFlightController().getFlightLimitation());
    }

    public static boolean isGimbalModuleValid() {
        return isProductModuleValid() &&
                (null != DJISampleApplication.getProductInstance().getGimbal());
    }

    public static boolean isAirlinkAvailable() {
        return isProductModuleValid() &&
                (null != DJISampleApplication.getProductInstance().getAirLink());
    }

    public static boolean isWiFiAirlinkAvailable() {
        return isAirlinkAvailable() &&
                (null != DJISampleApplication.getProductInstance().getAirLink().getWiFiLink());
    }

    public static boolean isLBAirlinkAvailable() {
        return isAirlinkAvailable() &&
                (null != DJISampleApplication.getProductInstance().getAirLink().getLBAirLink());
    }

}
