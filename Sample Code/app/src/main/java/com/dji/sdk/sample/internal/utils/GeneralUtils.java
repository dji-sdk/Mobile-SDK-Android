package com.dji.sdk.sample.internal.utils;

/**
 * Created by dji on 15/12/18.
 */

public class GeneralUtils {
    public static final double ONE_METER_OFFSET = 0.00000899322;
    private static long lastClickTime;

    public static boolean isFastDoubleClick() {
        long time = System.currentTimeMillis();
        long timeD = time - lastClickTime;
        if (0 < timeD && timeD < 800) {
            return true;
        }
        lastClickTime = time;
        return false;
    }

    public static boolean checkGpsCoordinate(double latitude, double longitude) {
        return (latitude > -90 && latitude < 90 && longitude > -180 && longitude < 180) && (latitude != 0f
            && longitude != 0f);
    }

    public static double toRadian(double x) {
        return x * Math.PI / 180.0;
    }

    public static double toDegree(double x) {
        return x * 180 / Math.PI;
    }

    public static double cosForDegree(double degree) {
        return Math.cos(degree * Math.PI / 180.0f);
    }

    public static double calcLongitudeOffset(double latitude) {
        return ONE_METER_OFFSET / cosForDegree(latitude);
    }

    public static void addLineToSB(StringBuffer sb, String name, Object value) {
        if (sb == null) return;
        sb.
              append(name == null ? "" : name + ": ").
              append(value == null ? "" : value + "").
              append("\n");
    }
}
