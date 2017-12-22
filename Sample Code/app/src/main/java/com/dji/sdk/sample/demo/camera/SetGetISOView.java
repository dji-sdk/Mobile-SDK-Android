package com.dji.sdk.sample.demo.camera;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.widget.ArrayAdapter;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.DialogUtils;
import com.dji.sdk.sample.internal.view.BaseSetGetView;

import dji.common.camera.SettingsDefinitions;
import dji.common.error.DJIError;
import dji.common.util.CommonCallbacks;

/**
 * Class for setting and getting ISO in camera.
 */
public class SetGetISOView extends BaseSetGetView {

    private static final int SHOW_GET_RESULT = 0;
    private final Runnable runSetCameraISO = new Runnable() {
        @Override
        public void run() {
            setCameraISO();
        }
    };
    private Handler mHandler = new Handler(new Handler.Callback() {

        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case SHOW_GET_RESULT:
                    mTextViewGet.setText((String) msg.obj);
                    break;

                default:
                    break;
            }
            return false;
        }
    });
    private final Runnable runSetManaualExposureMode = new Runnable() {
        @Override
        public void run() {
            setManualExposureMode();
        }
    };
    private final Runnable runSetShootPhotoCameraMode = new Runnable() {
        @Override
        public void run() {
            setShootPhotoCameraMode();
        }
    };

    public SetGetISOView(Context context) {
        super(context);
    }

    @Override
    protected void setMethod() {
        if (null != DJISampleApplication.getProductInstance()) {
            if (null != DJISampleApplication.getProductInstance().getCamera()) {
                mHandler.post(runSetShootPhotoCameraMode);
            }
        }
    }

    private void setShootPhotoCameraMode() {
        DJISampleApplication.getProductInstance()
                .getCamera()
                .setMode(SettingsDefinitions.CameraMode.SHOOT_PHOTO,
                        new CommonCallbacks.CompletionCallback() {
                            @Override
                            public void onResult(DJIError djiError) {
                                if (null == djiError) {
                                    mHandler.post(runSetManaualExposureMode);
                                }
                            }
                        });
    }

    private void setManualExposureMode() {
        DJISampleApplication.getProductInstance()
                .getCamera()
                .setExposureMode(SettingsDefinitions.ExposureMode.MANUAL,
                        new CommonCallbacks.CompletionCallback() {
                            @Override
                            public void onResult(DJIError djiError) {
                                if (null == djiError) {
                                    mHandler.post(runSetCameraISO);
                                }
                            }
                        });
    }

    private void setCameraISO() {
        SettingsDefinitions.ISO isoArray[] = removeUnknowntype();
        SettingsDefinitions.ISO cameraISO = SettingsDefinitions.ISO.AUTO;
        if (mSpinnerSet.getSelectedItemPosition() != 0) {
            cameraISO = isoArray[mSpinnerSet.getSelectedItemPosition()];
        }
        DJISampleApplication.getProductInstance()
                .getCamera()
                .setISO(cameraISO, new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError djiError) {
                        DialogUtils.showDialogBasedOnError(getContext(), djiError);
                    }
                });
    }

    @Override
    protected void getMethod() {
        DJISampleApplication.getProductInstance()
                .getCamera()
                .getISO(new CommonCallbacks.CompletionCallbackWith<SettingsDefinitions.ISO>() {
                    @Override
                    public void onSuccess(SettingsDefinitions.ISO cameraISO) {
                        mHandler.sendMessage(mHandler.obtainMessage(SHOW_GET_RESULT, cameraISO.name()));
                    }

                    @Override
                    public void onFailure(DJIError djiError) {
                        mHandler.sendMessage(mHandler.obtainMessage(SHOW_GET_RESULT, "GetResultFail"));
                    }
                });
    }

    @Override
    protected ArrayAdapter getArrayAdapter() {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.getContext(), R.layout.simple_list_item, removeUnknowntype());
        return arrayAdapter;
    }

    private SettingsDefinitions.ISO[] removeUnknowntype() {
        SettingsDefinitions.ISO items[] = SettingsDefinitions.ISO.values();
        SettingsDefinitions.ISO result[] = new SettingsDefinitions.ISO[items.length - 2];
        int j = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != SettingsDefinitions.ISO.UNKNOWN && items[i] != SettingsDefinitions.ISO.AUTO) {
                result[j++] = items[i];
            }
        }
        return result;
    }

    @Override
    public int getDescription() {
        return R.string.camera_listview_iso;
    }
}
