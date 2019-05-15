package com.dji.sdk.sample.demo.camera;

import android.app.Service;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.controller.MainActivity;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.utils.VideoFeedView;
import com.dji.sdk.sample.internal.view.PresentableView;
import dji.common.airlink.PhysicalSource;
import dji.common.error.DJIError;
import dji.common.product.Model;
import dji.keysdk.AirLinkKey;
import dji.keysdk.KeyManager;
import dji.keysdk.ProductKey;
import dji.keysdk.callback.SetCallback;
import dji.sdk.base.BaseProduct;
import dji.sdk.camera.Camera;
import dji.sdk.camera.VideoFeeder;
import dji.sdk.products.Aircraft;
import dji.sdk.sdkmanager.DJISDKManager;
import java.util.List;

/**
 * Class that manage live video feed from DJI products to the mobile device.
 * Also give the example of "getPrimaryVideoFeed" and "getSecondaryVideoFeed".
 */
public class VideoFeederView extends LinearLayout
    implements View.OnClickListener, PresentableView, CompoundButton.OnCheckedChangeListener {

    private Switch enableSingle;
    private Switch enableDual;
    private Button lbOnlyBtn;
    private Button extOnlyBtn;
    private Button lbAndExtBtn;
    private Button hdmiOnlyBtn;
    private Button avOnlyBtn;
    private Button hdmiAndAvBtn;
    private Button leftAndRightBtn;
    private Button leftAndFpvBtn;
    private Button rightAndFpvBtn;
    private TextView primaryVideoFeedTitle;
    private TextView fpvVideoFeedTitle;
    private VideoFeedView primaryVideoFeed;
    private VideoFeedView fpvVideoFeed;
    private VideoFeeder.PhysicalSourceListener sourceListener;
    private AirLinkKey extEnabledKey;
    private AirLinkKey lbBandwidthKey;
    private AirLinkKey hdmiBandwidthKey;
    private AirLinkKey mainCameraBandwidthKey;
    private SetCallback setBandwidthCallback;
    private SetCallback setExtEnableCallback;
    private View primaryCoverView;
    private View fpvCoverView;
    private TextView cameraListTitle;
    private String cameraListStr;

    public VideoFeederView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        setOrientation(HORIZONTAL);
        setClickable(true);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.view_video_feeder, this, true);

        initAllKeys();
        initUI();
        initCallbacks();
        setUpListeners();

    }

    private void initUI() {
        enableSingle = (Switch) findViewById(R.id.single_toggle_button);
        enableSingle.setOnCheckedChangeListener(this);
        enableDual = (Switch) findViewById(R.id.dual_toggle_button);
        enableDual.setOnCheckedChangeListener(this);

        lbOnlyBtn = (Button) findViewById(R.id.video_feeder_lb_only);
        lbOnlyBtn.setOnClickListener(this);
        extOnlyBtn = (Button) findViewById(R.id.video_feeder_ext_only);
        extOnlyBtn.setOnClickListener(this);
        lbAndExtBtn = (Button) findViewById(R.id.video_feeder_both_lb_ext);
        lbAndExtBtn.setOnClickListener(this);

        hdmiOnlyBtn = (Button) findViewById(R.id.video_feeder_hdmi_only);
        hdmiOnlyBtn.setOnClickListener(this);
        avOnlyBtn = (Button) findViewById(R.id.video_feeder_av_only);
        avOnlyBtn.setOnClickListener(this);
        hdmiAndAvBtn = (Button) findViewById(R.id.video_feeder_both_hdmi_av);
        hdmiAndAvBtn.setOnClickListener(this);

        leftAndFpvBtn = (Button) findViewById(R.id.video_feeder_left_fpv);
        leftAndFpvBtn.setOnClickListener(this);
        rightAndFpvBtn = (Button) findViewById(R.id.video_feeder_right_fpv);
        rightAndFpvBtn.setOnClickListener(this);
        leftAndRightBtn = (Button) findViewById(R.id.video_feeder_left_right);
        leftAndRightBtn.setOnClickListener(this);

        cameraListTitle = (TextView) findViewById(R.id.camera_index_title);
        primaryVideoFeedTitle = (TextView) findViewById(R.id.primary_video_feed_title);
        fpvVideoFeedTitle = (TextView) findViewById(R.id.fpv_video_feed_title);
        primaryVideoFeed = (VideoFeedView) findViewById(R.id.primary_video_feed);
        fpvVideoFeed = (VideoFeedView) findViewById(R.id.fpv_video_feed);
        primaryCoverView = findViewById(R.id.primary_cover_view);
        primaryVideoFeed.setCoverView(primaryCoverView);
        fpvCoverView = findViewById(R.id.fpv_cover_view);
        fpvVideoFeed.setCoverView(fpvCoverView);
        disableAllButtons();
        initEXTSwitch();
    }

    private void initAllKeys() {
        extEnabledKey = AirLinkKey.createLightbridgeLinkKey(AirLinkKey.IS_EXT_VIDEO_INPUT_PORT_ENABLED);
        lbBandwidthKey = AirLinkKey.createLightbridgeLinkKey(AirLinkKey.BANDWIDTH_ALLOCATION_FOR_LB_VIDEO_INPUT_PORT);
        hdmiBandwidthKey =
            AirLinkKey.createLightbridgeLinkKey(AirLinkKey.BANDWIDTH_ALLOCATION_FOR_HDMI_VIDEO_INPUT_PORT);
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

        setExtEnableCallback = new SetCallback() {
            @Override
            public void onSuccess() {
                updateExtSwitchValue(null);
            }

            @Override
            public void onFailure(@NonNull DJIError error) {
                updateExtSwitchValue(null);
            }
        };
    }

    private void initEXTSwitch() {
        updateExtSwitchValue(null);
    }

    private void updateExtSwitchValue(Object value) {
        if (value == null && KeyManager.getInstance() != null) {
            value = KeyManager.getInstance().getValue(extEnabledKey);
        }
        final Object switchValue = value;
        if (switchValue != null) {
            VideoFeederView.this.post(new Runnable() {
                @Override
                public void run() {
                    enableDual.setOnCheckedChangeListener(null);
                    enableSingle.setOnCheckedChangeListener(null);
                    enableSingle.setChecked((Boolean) switchValue);
                    enableDual.setChecked(!(Boolean) switchValue);
                    enableSingle.setOnCheckedChangeListener(VideoFeederView.this);
                    enableDual.setOnCheckedChangeListener(VideoFeederView.this);
                    enableExtButtons((Boolean) switchValue);
                }
            });
        }
    }

    private void enableExtButtons(boolean isExtEnabled) {
        enableSingle.setEnabled(true);
        enableDual.setEnabled(true);

        if (isExtEnabled) {
            lbOnlyBtn.setEnabled(true);
            extOnlyBtn.setEnabled(true);
            lbAndExtBtn.setEnabled(true);

            hdmiOnlyBtn.setEnabled(false);
            avOnlyBtn.setEnabled(false);
            hdmiAndAvBtn.setEnabled(false);
        } else {
            lbOnlyBtn.setEnabled(false);
            extOnlyBtn.setEnabled(false);
            lbAndExtBtn.setEnabled(false);

            hdmiOnlyBtn.setEnabled(true);
            avOnlyBtn.setEnabled(true);
            hdmiAndAvBtn.setEnabled(true);
        }
    }

    private void disableAllButtons() {
        enableSingle.setEnabled(false);
        enableDual.setEnabled(false);

        lbOnlyBtn.setEnabled(false);
        extOnlyBtn.setEnabled(false);
        lbAndExtBtn.setEnabled(false);

        hdmiOnlyBtn.setEnabled(false);
        avOnlyBtn.setEnabled(false);
        hdmiAndAvBtn.setEnabled(false);

        leftAndFpvBtn.setEnabled(false);
        rightAndFpvBtn.setEnabled(false);
        leftAndRightBtn.setEnabled(false);
    }

    private void setUpListeners() {
        sourceListener = new VideoFeeder.PhysicalSourceListener() {
            @Override
            public void onChange(VideoFeeder.VideoFeed videoFeed, PhysicalSource newPhysicalSource) {
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
            VideoFeeder.VideoDataListener primaryVideoDataListener =
                primaryVideoFeed.registerLiveVideo(VideoFeeder.getInstance().getPrimaryVideoFeed(), true);
            VideoFeeder.VideoDataListener secondaryVideoDataListener =
                fpvVideoFeed.registerLiveVideo(VideoFeeder.getInstance().getSecondaryVideoFeed(), false);

            if (isOpen) {
                String newText =
                    "Primary Source: " + VideoFeeder.getInstance().getPrimaryVideoFeed().getVideoSource().name();
                ToastUtils.setResultToText(primaryVideoFeedTitle, newText);
                if (isMultiStreamPlatform()) {
                    String newTextFpv = "Secondary Source: " + VideoFeeder.getInstance()
                                                                          .getSecondaryVideoFeed()
                                                                          .getVideoSource()
                                                                          .name();
                    ToastUtils.setResultToText(fpvVideoFeedTitle, newTextFpv);
                }
                VideoFeeder.getInstance().addPhysicalSourceListener(sourceListener);
            } else {
                VideoFeeder.getInstance().removePhysicalSourceListener(sourceListener);
                VideoFeeder.getInstance().getPrimaryVideoFeed().removeVideoDataListener(primaryVideoDataListener);
                if (isMultiStreamPlatform()) {
                    VideoFeeder.getInstance()
                               .getSecondaryVideoFeed()
                               .removeVideoDataListener(secondaryVideoDataListener);
                }
            }
        }
    }

    private void updateM210Buttons() {
        if (isM210TwoCameraConnected()) {

            VideoFeederView.this.post(new Runnable() {
                @Override
                public void run() {
                    disableAllButtons();
                    leftAndFpvBtn.setEnabled(true);
                    rightAndFpvBtn.setEnabled(true);
                    leftAndRightBtn.setEnabled(true);
                }
            });
        }
    }

    @Override
    public void onClick(View view) {

        if (view == lbOnlyBtn) {
            onClickLBOnlyBtn();
        } else if (view == extOnlyBtn) {
            onClickExtOnlyBtn();
        } else if (view == lbAndExtBtn) {
            onClickLBAndExtBtn();
        } else if (view == hdmiOnlyBtn) {
            onClickHDMIOnlyBtn();
        } else if (view == avOnlyBtn) {
            onClickAVOnlyBtn();
        } else if (view == hdmiAndAvBtn) {
            onClickHDMIAndAVBtn();
        } else if (view == leftAndFpvBtn) {
            onClickLeftAndFpvBtn();
        } else if (view == rightAndFpvBtn) {
            onClickRightAndFpvBtn();
        } else if (view == leftAndRightBtn) {
            onClickLeftAndRightBtn();
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (compoundButton == enableSingle) {
            onClickSingleSwitch(b);
        } else if (compoundButton == enableDual) {
            onClickDualSwitch(b);
        }
    }

    private void onClickSingleSwitch(boolean checked) {
        KeyManager.getInstance().setValue(extEnabledKey, checked, setExtEnableCallback);
    }

    private void onClickDualSwitch(boolean checked) {
        KeyManager.getInstance().setValue(extEnabledKey, !checked, setExtEnableCallback);
    }

    private void onClickLBOnlyBtn() {
        KeyManager.getInstance().setValue(lbBandwidthKey, 1.0f, setBandwidthCallback);
    }

    private void onClickExtOnlyBtn() {

        KeyManager.getInstance().setValue(lbBandwidthKey, 0.0f, setBandwidthCallback);
    }

    private void onClickLBAndExtBtn() {
        KeyManager.getInstance().setValue(lbBandwidthKey, 0.5f, setBandwidthCallback);
    }

    private void onClickHDMIOnlyBtn() {
        KeyManager.getInstance().setValue(hdmiBandwidthKey, 1.0f, setBandwidthCallback);
    }

    private void onClickAVOnlyBtn() {
        KeyManager.getInstance().setValue(hdmiBandwidthKey, 0.0f, setBandwidthCallback);
    }

    private void onClickHDMIAndAVBtn() {
        KeyManager.getInstance().setValue(hdmiBandwidthKey, 0.5f, setBandwidthCallback);
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
        return R.string.component_listview_video_feeder;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        DJISampleApplication.getEventBus().post(new MainActivity.RequestStartFullScreenEvent());
    }

    @Override
    protected void onDetachedFromWindow() {
        DJISampleApplication.getEventBus().post(new MainActivity.RequestEndFullScreenEvent());
        tearDownListeners();
        super.onDetachedFromWindow();
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }
}
