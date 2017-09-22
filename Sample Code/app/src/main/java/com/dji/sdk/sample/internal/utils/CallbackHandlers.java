package com.dji.sdk.sample.internal.utils;

import dji.common.error.DJIError;
import dji.common.util.CommonCallbacks;

/**
 * The Class used to deal with the CommonCallbacks
 */
public class CallbackHandlers {

    public static class CallbackToastHandler implements CommonCallbacks.CompletionCallback {

        @Override
        public void onResult(DJIError djiError) {
            String message = "Success";
            if (djiError != null) {
                message = djiError.getDescription();
            }
            ToastUtils.setResultToToast(message);
        }
    }

}
