package com.dji.sdk.sample.demo.gimbal;

import android.app.Service;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.controller.MainActivity;
import com.dji.sdk.sample.internal.utils.CallbackHandlers;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.utils.VideoFeedView;
import com.dji.sdk.sample.internal.view.PresentableView;
import dji.common.error.DJIError;
import dji.common.gimbal.CapabilityKey;
import dji.common.gimbal.GimbalMode;
import dji.common.gimbal.Rotation;
import dji.common.gimbal.RotationMode;
import dji.common.product.Model;
import dji.common.util.DJIParamCapability;
import dji.common.util.DJIParamMinMaxCapability;
import dji.keysdk.AirLinkKey;
import dji.keysdk.KeyManager;
import dji.keysdk.ProductKey;
import dji.keysdk.callback.SetCallback;
import dji.sdk.base.BaseProduct;
import dji.sdk.camera.Camera;
import dji.sdk.camera.VideoFeeder;
import dji.sdk.gimbal.Gimbal;
import dji.sdk.products.Aircraft;
import dji.sdk.sdkmanager.DJISDKManager;
import java.util.ArrayList;
import java.util.List;

/**
 * The class for rotating the gimbal, also give an example of the product with multiple gimbals.
 */
public class GimbalCapabilityView extends LinearLayout implements View.OnClickListener, PresentableView {

    private Gimbal gimbal = null;
    private Button pitchMinBtn;
    private Button pitchMaxBtn;
    private Button yawMinBtn;
    private Button yawMaxBtn;
    private Button rollMinBtn;
    private Button rollMaxBtn;
    private Button mBtnSet;
    private Button leftAndRightBtn;
    private Button leftAndFpvBtn;
    private Button rightAndFpvBtn;
    private Spinner mSpinnerSet;
    private View primaryCoverView;
    private View fpvCoverView;
    private TextView cameraListTitle;
    private TextView primaryVideoFeedTitle;
    private TextView fpvVideoFeedTitle;
    private VideoFeedView primaryVideoFeed;
    private VideoFeedView fpvVideoFeed;

    private String cameraListStr;
    private int currentGimbalId = 0;
    private AirLinkKey lbBandwidthKey;
    private AirLinkKey mainCameraBandwidthKey;
    private SetCallback setBandwidthCallback;
    private VideoFeeder.PhysicalSourceListener sourceListener;

    public GimbalCapabilityView(Context context) {
        super(context);
        initUI(context);
        initAllKeys();
        initCallbacks();
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        DJISampleApplication.getEventBus().post(new MainActivity.RequestStartFullScreenEvent());
        setupButtonsState();
        enablePitchExtensionIfPossible();
        if (getGimbalInstance() != null) {
            getGimbalInstance().setMode(GimbalMode.YAW_FOLLOW, new CallbackHandlers.CallbackToastHandler());
        } else {
            ToastUtils.setResultToToast("Product disconnected");
        }
        setUpListeners();
    }

    @Override
    protected void onDetachedFromWindow() {
        DJISampleApplication.getEventBus().post(new MainActivity.RequestEndFullScreenEvent());
        currentGimbalId = 0;
        tearDownListeners();
        super.onDetachedFromWindow();
    }

    private void setupButtonsState() {

        int size = getGimbalSize();
        if (size <1) {
            mSpinnerSet.setEnabled(false);
        } else {
            mSpinnerSet.setAdapter(getArrayAdapter(size));
        }
        pitchMinBtn.setEnabled(isFeatureSupported(CapabilityKey.ADJUST_PITCH));
        pitchMaxBtn.setEnabled(isFeatureSupported(CapabilityKey.ADJUST_PITCH));
        yawMinBtn.setEnabled(isFeatureSupported(CapabilityKey.ADJUST_YAW));
        yawMaxBtn.setEnabled(isFeatureSupported(CapabilityKey.ADJUST_YAW));
        rollMinBtn.setEnabled(isFeatureSupported(CapabilityKey.ADJUST_ROLL));
        rollMaxBtn.setEnabled(isFeatureSupported(CapabilityKey.ADJUST_ROLL));
        leftAndFpvBtn.setEnabled(false);
        rightAndFpvBtn.setEnabled(false);
        leftAndRightBtn.setEnabled(false);
    }

    private Gimbal getGimbalInstance() {
        if (gimbal == null) {
            initGimbal();
        }
        return gimbal;
    }

    private void initGimbal() {
        if (DJISDKManager.getInstance() != null) {
            BaseProduct product = DJISDKManager.getInstance().getProduct();
            if (product != null) {
                if (product instanceof Aircraft) {
                    gimbal = ((Aircraft) product).getGimbals().get(currentGimbalId);
                } else {
                    gimbal = product.getGimbal();
                }
            }
        }
    }

    /*
     * Check if The Gimbal Capability is supported
     */
    private boolean isFeatureSupported(CapabilityKey key) {

        Gimbal gimbal = getGimbalInstance();
        if (gimbal == null) {
            return false;
        }

        DJIParamCapability capability = null;
        if (gimbal.getCapabilities() != null) {
            capability = gimbal.getCapabilities().get(key);
        }

        if (capability != null) {
            return capability.isSupported();
        }
        return false;
    }

    private void enablePitchExtensionIfPossible() {

        Gimbal gimbal = getGimbalInstance();
        if (gimbal == null) {
            return;
        }
        boolean ifPossible = isFeatureSupported(CapabilityKey.PITCH_RANGE_EXTENSION);
        if (ifPossible) {
            gimbal.setPitchRangeExtensionEnabled(true, new CallbackHandlers.CallbackToastHandler());
        }
    }

    private void sendRotateGimbalCommand(Rotation rotation) {

        Gimbal gimbal = getGimbalInstance();
        if (gimbal == null) {
            return;
        }

        gimbal.rotate(rotation, new CallbackHandlers.CallbackToastHandler());
    }

    private Object getCorrespondingKeyWithButton(Button button) {
        if (button == pitchMaxBtn || button == pitchMinBtn) {
            return CapabilityKey.ADJUST_PITCH;
        } else if (button == yawMaxBtn || button == yawMinBtn) {
            return CapabilityKey.ADJUST_YAW;
        } else if (button == rollMaxBtn || button == rollMinBtn) {
            return CapabilityKey.ADJUST_ROLL;
        }
        return null;
    }

    private void initUI(Context context) {
        setClickable(true);
        setOrientation(HORIZONTAL);

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);

        layoutInflater.inflate(R.layout.view_gimbal_capability, this, true);

        mSpinnerSet = (Spinner) findViewById(R.id.spinner_set);
        mBtnSet = (Button) findViewById(R.id.btn_set);
        pitchMinBtn = (Button) findViewById(R.id.btn_pitchMin);
        pitchMaxBtn = (Button) findViewById(R.id.btn_pitchMax);
        yawMinBtn = (Button) findViewById(R.id.btn_yawMin);
        yawMaxBtn = (Button) findViewById(R.id.btn_yawMax);
        rollMinBtn = (Button) findViewById(R.id.btn_rollMin);
        rollMaxBtn = (Button) findViewById(R.id.btn_rollMax);
        Button resetBtn = (Button) findViewById(R.id.btn_reset);
        leftAndFpvBtn = (Button) findViewById(R.id.video_feeder_left_fpv);
        rightAndFpvBtn = (Button) findViewById(R.id.video_feeder_right_fpv);
        leftAndRightBtn = (Button) findViewById(R.id.video_feeder_left_right);
        cameraListTitle = (TextView) findViewById(R.id.camera_index_title);
        primaryVideoFeedTitle = (TextView) findViewById(R.id.primary_video_feed_title);
        fpvVideoFeedTitle = (TextView) findViewById(R.id.fpv_video_feed_title);
        primaryVideoFeed = (VideoFeedView) findViewById(R.id.primary_video_feed);
        fpvVideoFeed = (VideoFeedView) findViewById(R.id.fpv_video_feed);
        primaryCoverView = findViewById(R.id.primary_cover_view);
        primaryVideoFeed.setCoverView(primaryCoverView);
        fpvCoverView = findViewById(R.id.fpv_cover_view);
        fpvVideoFeed.setCoverView(fpvCoverView);

        mBtnSet.setOnClickListener(this);
        pitchMinBtn.setOnClickListener(this);
        pitchMaxBtn.setOnClickListener(this);
        yawMinBtn.setOnClickListener(this);
        yawMaxBtn.setOnClickListener(this);
        rollMinBtn.setOnClickListener(this);
        rollMaxBtn.setOnClickListener(this);
        resetBtn.setOnClickListener(this);
        leftAndFpvBtn.setOnClickListener(this);
        rightAndFpvBtn.setOnClickListener(this);
        leftAndRightBtn.setOnClickListener(this);
    }

    private void initAllKeys() {
        lbBandwidthKey = AirLinkKey.createLightbridgeLinkKey(AirLinkKey.BANDWIDTH_ALLOCATION_FOR_LB_VIDEO_INPUT_PORT);
        mainCameraBandwidthKey = AirLinkKey.createLightbridgeLinkKey(AirLinkKey.BANDWIDTH_ALLOCATION_FOR_LEFT_CAMERA);
    }

    private void initCallbacks() {
        setBandwidthCallback = new SetCallback() {
            @Override
            public void onSuccess() {
                ToastUtils.setResultToToast("Set key value successfully");
                if (fpvVideoFeed != null) {
                    fpvVideoFeed.changeSourceResetKeyFrame();
                }
                if (primaryVideoFeed != null) {
                    primaryVideoFeed.changeSourceResetKeyFrame();
                }
            }

            @Override
            public void onFailure(@NonNull DJIError error) {
                ToastUtils.setResultToToast("Failed to set: " + error.getDescription());
            }
        };
    }

    private void rotateGimbalToMin(Button button) {

        Gimbal gimbal = getGimbalInstance();
        if (gimbal == null) {
            return;
        }

        Object key = getCorrespondingKeyWithButton(button);
        Number minValue = ((DJIParamMinMaxCapability) (gimbal.getCapabilities().get(key))).getMin();

        Rotation.Builder builder = new Rotation.Builder().mode(RotationMode.ABSOLUTE_ANGLE).time(2);

        if (key == CapabilityKey.ADJUST_PITCH) {
            builder.pitch(minValue.floatValue());
        } else if (key == CapabilityKey.ADJUST_YAW) {
            builder.yaw(minValue.floatValue());
        } else if (key == CapabilityKey.ADJUST_ROLL) {
            builder.roll(minValue.floatValue());
        }

        sendRotateGimbalCommand(builder.build());
    }

    private void rotateGimbalToMax(Button button) {

        Gimbal gimbal = getGimbalInstance();
        if (gimbal == null) {
            return;
        }

        Object key = getCorrespondingKeyWithButton(button);
        Number maxValue = ((DJIParamMinMaxCapability) (gimbal.getCapabilities().get(key))).getMax();

        Rotation.Builder builder = new Rotation.Builder().mode(RotationMode.ABSOLUTE_ANGLE).time(2);

        if (key == CapabilityKey.ADJUST_PITCH) {
            builder.pitch(maxValue.floatValue());
        } else if (key == CapabilityKey.ADJUST_YAW) {
            builder.yaw(maxValue.floatValue());
        } else if (key == CapabilityKey.ADJUST_ROLL) {
            builder.roll(maxValue.floatValue());
        }

        sendRotateGimbalCommand(builder.build());
    }

    private void onClickLeftAndFpvBtn() {
        KeyManager.getInstance().setValue(lbBandwidthKey, 0.8f, null);
        KeyManager.getInstance().setValue(mainCameraBandwidthKey, 1.0f, setBandwidthCallback);
    }

    private void onClickRightAndFpvBtn() {
        KeyManager.getInstance().setValue(lbBandwidthKey, 0.8f, null);
        KeyManager.getInstance().setValue(mainCameraBandwidthKey, 0.0f, setBandwidthCallback);
    }

    private void onClickLeftAndRightBtn() {
        KeyManager.getInstance().setValue(lbBandwidthKey, 1.0f, null);
        KeyManager.getInstance().setValue(mainCameraBandwidthKey, 0.5f, setBandwidthCallback);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_pitchMin: {
                rotateGimbalToMin((Button) v);
                break;
            }
            case R.id.btn_pitchMax: {
                rotateGimbalToMax((Button) v);
                break;
            }
            case R.id.btn_yawMin: {
                rotateGimbalToMin((Button) v);
                break;
            }
            case R.id.btn_yawMax: {
                rotateGimbalToMax((Button) v);
                break;
            }
            case R.id.btn_rollMin: {
                rotateGimbalToMin((Button) v);
                break;
            }
            case R.id.btn_rollMax: {
                rotateGimbalToMax((Button) v);
                break;
            }
            case R.id.btn_reset: {
                Gimbal gimbal = getGimbalInstance();
                if (gimbal != null) {
                    gimbal.reset(null);
                } else {
                    ToastUtils.setResultToToast("The gimbal is disconnected.");
                }
                break;
            }
            case R.id.btn_set: {
                int position = mSpinnerSet.getSelectedItemPosition();
                if (position >= 0 && position < getGimbalSize()) {
                    currentGimbalId = mSpinnerSet.getSelectedItemPosition();
                    initGimbal();
                    ToastUtils.setResultToToast("Selected gimbal ID:" + currentGimbalId);
                } else {
                    ToastUtils.setResultToToast("The gimbal ID is illegal.");
                }
                break;
            }
            case R.id.video_feeder_left_fpv: {
                onClickLeftAndFpvBtn();
                break;
            }
            case R.id.video_feeder_right_fpv: {
                onClickRightAndFpvBtn();
                break;
            }
            case R.id.video_feeder_left_right: {
                onClickLeftAndRightBtn();
                break;
            }
            default:
                break;
        }
    }

    private ArrayAdapter getArrayAdapter(int size) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            array.add(i);
        }
        return new ArrayAdapter(this.getContext(), R.layout.simple_list_item, array);
    }

    private int getGimbalSize() {
        int size = 0;
        if (DJISDKManager.getInstance() != null) {
            BaseProduct product = DJISDKManager.getInstance().getProduct();
            if (product != null) {
                if (product instanceof Aircraft) {
                    size = ((Aircraft) product).getGimbals().size();
                } else {
                    if (product.getGimbal() != null) {
                        size = 1;
                    }
                }
            }
        }
        return size;
    }

    private void setUpListeners() {
        sourceListener = new VideoFeeder.PhysicalSourceListener() {
            @Override
            public void onChange(VideoFeeder.VideoFeed videoFeed, VideoFeeder.PhysicalSource newPhysicalSource) {
                if (videoFeed == VideoFeeder.getInstance().getPrimaryVideoFeed()) {
                    String newText = "Primary Source: " + newPhysicalSource.toString();
                    ToastUtils.setResultToText(primaryVideoFeedTitle,newText);
                }
                if (videoFeed == VideoFeeder.getInstance().getSecondaryVideoFeed()) {
                    ToastUtils.setResultToText(fpvVideoFeedTitle,"Secondary Source: " + newPhysicalSource.toString());
                }
            }
        };

        setVideoFeederListeners(true);
    }

    private void tearDownListeners() {
        setVideoFeederListeners(false);
    }

    private void setVideoFeederListeners(boolean isOpen) {
        if (VideoFeeder.getInstance() == null) return;

        final BaseProduct product = DJISDKManager.getInstance().getProduct();
        updateM210Buttons();
        if (product != null) {

            if (isOpen) {
                primaryVideoFeed.registerLiveVideo(VideoFeeder.getInstance().getPrimaryVideoFeed(), true);
                String newText = "Primary Source: " + VideoFeeder.getInstance().getPrimaryVideoFeed().getVideoSource().name();
                ToastUtils.setResultToText(primaryVideoFeedTitle,newText);
                if (isMultiStreamPlatform()) {
                    fpvVideoFeed.registerLiveVideo(VideoFeeder.getInstance().getSecondaryVideoFeed(), false);
                    String newTextFpv = "Secondary Source: " + VideoFeeder.getInstance().getSecondaryVideoFeed().getVideoSource().name();
                    ToastUtils.setResultToText(fpvVideoFeedTitle,newTextFpv);
                }
                VideoFeeder.getInstance().addPhysicalSourceListener(sourceListener);
            } else {
                VideoFeeder.getInstance().removePhysicalSourceListener(sourceListener);
                VideoFeeder.getInstance().getPrimaryVideoFeed().setCallback(null);
                if (isMultiStreamPlatform()) {
                    VideoFeeder.getInstance().getSecondaryVideoFeed().setCallback(null);
                }
            }
        }
    }

    private void updateM210Buttons() {
        if (isM210TwoCameraConnected()) {

            GimbalCapabilityView.this.post(new Runnable() {
                @Override
                public void run() {
                    leftAndFpvBtn.setEnabled(true);
                    rightAndFpvBtn.setEnabled(true);
                    leftAndRightBtn.setEnabled(true);
                }
            });
        }
    }

    private boolean isM210TwoCameraConnected() {

        Object model = null;
        if (KeyManager.getInstance() != null) {
            model = KeyManager.getInstance().getValue(ProductKey.create(ProductKey.MODEL_NAME));
        }
        if (model != null) {
            BaseProduct product = DJISDKManager.getInstance().getProduct();
            if (product != null && (product instanceof Aircraft)) {
                List<Camera> cameraList = ((Aircraft) product).getCameras();
                if (cameraList != null) {
                    if (cameraListStr == null) {
                        cameraListStr = new String();
                    }
                    cameraListStr = "";
                    for (int i = 0; i < cameraList.size(); i++) {
                        Camera camera = cameraList.get(i);
                        cameraListStr += "Camera "
                            + i
                            + " is "
                            + camera.getDisplayName()
                            + " is connected "
                            + camera.isConnected()
                            + " camera component index is "
                            + +camera.getIndex()
                            + "\n";
                    }
                }
                ToastUtils.setResultToText(cameraListTitle, cameraListStr);
                if ((model == Model.MATRICE_210 || model == Model.MATRICE_210_RTK)) {
                    return (cameraList != null
                        && cameraList.size() == 2
                        && cameraList.get(0).isConnected()
                        && cameraList.get(1).isConnected());
                }
            }
        }

        return false;
    }

    private boolean isMultiStreamPlatform() {
        Model model = DJISDKManager.getInstance().getProduct().getModel();
        return model != null && (model == Model.INSPIRE_2
            || model == Model.MATRICE_200
            || model == Model.MATRICE_210
            || model == Model.MATRICE_210_RTK
            || model == Model.MATRICE_600
            || model == Model.MATRICE_600_PRO
            || model == Model.A3
            || model == Model.N3);
    }

    @Override
    public int getDescription() {
        return R.string.gimbal_listview_gimbal_capability;
    }
}
