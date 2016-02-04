package com.dji.sdk.sample.camera;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.common.BaseSetGetView;
import com.dji.sdk.sample.common.DJISampleApplication;
import com.dji.sdk.sample.utils.DJIDialog;

import dji.sdk.Camera.DJICameraSettingsDef;
import dji.sdk.base.DJIBaseComponent;
import dji.sdk.base.DJIError;

/**
 * Class for setting and getting ISO in camera.
 */
public class SetGetISOView extends BaseSetGetView {

    private static final int SHOW_GET_RESULT = 0;

    private Handler mHandler = new Handler(new Handler.Callback() {

        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case SHOW_GET_RESULT :
                    mTextViewGet.setText((String)msg.obj);
                    break;

                default:
                    break;
            }
            return false;
        }
    });

    private final Runnable runSetShootPhotoCameraMode = new Runnable() {
        @Override
        public void run() {
            setShootPhotoCameraMode();
        }
    };

    private final Runnable runSetCameraISO = new Runnable() {
        @Override
        public void run() {
            setCameraISO();
        }
    };

    private final Runnable runSetManaualExposureMode = new Runnable() {
        @Override
        public void run() {
            setManualExposureMode();
        }
    };

    public SetGetISOView(Context context, AttributeSet attrs) {
        super(context, attrs);
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
        DJISampleApplication.getProductInstance().getCamera().setCameraMode(
                DJICameraSettingsDef.CameraMode.ShootPhoto,
                new DJIBaseComponent.DJICompletionCallback() {
                    @Override
                    public void onResult(DJIError djiError) {
                        if (null == djiError) {
                            mHandler.post(runSetManaualExposureMode);
                        }

                    }
                }
        );
    }

    private void setManualExposureMode() {
        DJISampleApplication.getProductInstance().getCamera().setExposureMode(
                DJICameraSettingsDef.CameraExposureMode.Manual,
                new DJIBaseComponent.DJICompletionCallback() {
                    @Override
                    public void onResult(DJIError djiError) {
                        if (null == djiError)
                            mHandler.post(runSetCameraISO);
                    }
                }
        );
    }

    private void setCameraISO() {
        DJICameraSettingsDef.CameraISO isoArray[] = removeUnknowntype();
        DJICameraSettingsDef.CameraISO cameraISO = DJICameraSettingsDef.CameraISO.Auto;
        if (mSpinnerSet.getSelectedItemPosition() != 0) {
            cameraISO = isoArray[mSpinnerSet.getSelectedItemPosition()];
        }
        DJISampleApplication.getProductInstance().getCamera().setISO(
                cameraISO,
                new DJIBaseComponent.DJICompletionCallback() {
                    @Override
                    public void onResult(DJIError djiError) {
                        if (null == djiError) {
                            DJIDialog.showDialog(getContext(), getResources().getString(R.string.success));
                        } else {
                            DJIDialog.showDialog(getContext(), djiError.getDescription());
                        }
                    }
                });
    }

    @Override
    protected void getMethod() {
        DJISampleApplication.getProductInstance().getCamera().getISO(
                new DJIBaseComponent.DJICompletionCallbackWith<DJICameraSettingsDef.CameraISO>() {
                    @Override
                    public void onSuccess(DJICameraSettingsDef.CameraISO cameraISO) {
                        mHandler.sendMessage(mHandler.obtainMessage(SHOW_GET_RESULT, cameraISO.name()));
                    }

                    @Override
                    public void onFailure(DJIError djiError) {
                        mHandler.sendMessage(mHandler.obtainMessage(SHOW_GET_RESULT, "GetResultFail"));
                    }
                });
    }

    @Override
    protected int getInfo() {
        return R.string.app_name;
    }

    @Override
    protected ArrayAdapter getArrayAdapter() {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.getContext(),
                R.layout.simple_list_item, removeUnknowntype());
        return arrayAdapter;
    }

    private DJICameraSettingsDef.CameraISO[] removeUnknowntype() {
        DJICameraSettingsDef.CameraISO items[] = DJICameraSettingsDef.CameraISO.values();
        DJICameraSettingsDef.CameraISO result[] = new DJICameraSettingsDef.CameraISO[items.length - 1];
        for (int i=0; i<items.length; i++) {
            if(items[i] != DJICameraSettingsDef.CameraISO.Unknown) {
                result[i] = items[i];
            }
        }
        return result;
    }
}
