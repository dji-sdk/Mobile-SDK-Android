package com.dji.sdk.sample.utils;

import com.dji.sdk.sample.common.DJISampleApplication;

import dji.sdk.products.DJIAircraft;
import dji.sdk.products.DJIHandHeld;

/**
 * Created by dji on 16/1/6.
 */
public class DJIModuleVerificationUtil {
    public static boolean isProductModuleAvailable() {
        return (null != DJISampleApplication.getProductInstance());
    }

    public static boolean isAircraft() {
        return DJISampleApplication.getProductInstance() instanceof DJIAircraft;
    }

    public static boolean isHandHeld() {
        return DJISampleApplication.getProductInstance() instanceof DJIHandHeld;
    }
    public static boolean isCameraModuleAvailable() {
        return isProductModuleAvailable() &&
                (null != DJISampleApplication.getProductInstance().getCamera());
    }

    public static boolean isPlaybackAvailable() {
        return isCameraModuleAvailable() &&
                (null != DJISampleApplication.getProductInstance().getCamera().getPlayback());
    }

    public static boolean isMediaManagerAvailable() {
        return isCameraModuleAvailable() &&
                (null != DJISampleApplication.getProductInstance().getCamera().getMediaManager());
    }

    public static boolean isRemoteControllerAvailable() {
        return isProductModuleAvailable() && isAircraft() &&
        (null != DJISampleApplication.getAircraftInstance().getRemoteController());
    }

    public static boolean isFlightControllerAvailable() {
        return isProductModuleAvailable() && isAircraft() &&
        (null != DJISampleApplication.getAircraftInstance().getFlightController());
    }

    public static boolean isCompassAvailable() {
        return isFlightControllerAvailable() && isAircraft() &&
        (null != DJISampleApplication.getAircraftInstance().getFlightController().getCompass());
    }

    public static boolean isFlightLimitationAvailable() {
        return isFlightControllerAvailable() && isAircraft() &&
                (null != DJISampleApplication.getAircraftInstance().
                        getFlightController().getFlightLimitation());
    }

    public static boolean isGimbalModuleAvailable() {
        return isProductModuleAvailable() &&
                (null != DJISampleApplication.getProductInstance().getGimbal());
    }

    public static boolean isAirlinkAvailable() {
        return isProductModuleAvailable() &&
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
