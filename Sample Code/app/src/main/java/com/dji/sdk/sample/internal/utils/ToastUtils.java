package com.dji.sdk.sample.internal.utils;

import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import android.widget.Toast;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;

/**
 * Created by DJI on 2/28/17.
 */

public class ToastUtils {
    private static Handler mUIHandler = new Handler(Looper.getMainLooper());

    public static void setResultToToast(final String string) {
        mUIHandler.post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(DJISampleApplication.getInstance(), string, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public static void setResultToText(final TextView tv, final String s) {
        mUIHandler.post(new Runnable() {
            @Override
            public void run() {
                if (tv == null) {
                    Toast.makeText(DJISampleApplication.getInstance(), "tv is null", Toast.LENGTH_SHORT).show();
                } else {
                    tv.setText(s);
                }
            }
        });
    }
}
