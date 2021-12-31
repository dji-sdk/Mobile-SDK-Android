package com.dji.sdk.sample.demo.lookat;
import android.app.AlertDialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.Helper;
import com.dji.sdk.sample.internal.utils.PopupUtils;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.utils.VideoFeedView;
import com.dji.sdk.sample.internal.utils.ViewHelper;
import com.dji.sdk.sample.internal.view.PresentableView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import dji.common.airlink.PhysicalSource;
import dji.common.camera.CameraVideoStreamSource;
import dji.common.camera.LaserMeasureInformation;
import dji.common.camera.SettingsDefinitions;
import dji.common.error.DJIError;
import dji.common.flightcontroller.LocationCoordinate3D;
import dji.common.util.CommonCallbacks;
import dji.keysdk.CameraKey;
import dji.keysdk.DJIKey;
import dji.keysdk.KeyManager;
import dji.keysdk.callback.GetCallback;
import dji.keysdk.callback.SetCallback;
import dji.liveviewar.jni.GPSPos;
import dji.sdk.base.BaseProduct;
import dji.sdk.camera.Camera;
import dji.sdk.camera.Lens;
import dji.sdk.camera.VideoFeeder;
import dji.sdk.camera.view.PinPoint;
import dji.sdk.camera.view.PinPointInfo;
import dji.sdk.gimbal.Gimbal;
import dji.sdk.gimbal.mode.LookAtMode;
import dji.sdk.products.Aircraft;
import dji.sdk.sdkmanager.DJISDKManager;

import static com.google.android.gms.internal.zzahn.runOnUiThread;

public class LookAtMissionView extends LinearLayout implements View.OnClickListener, PresentableView {

    private Button setVideoSourceBtn;
    private Button enableLaserBtn;
    private Button splitSreenDiaplayBtn;
    private Button addPinBtn;
    private Button clearPinBtn;
    private Button doLookAtBtn;
    private TextView curPhysicalSource;
    private TextView curVideoStreamSource;
    private TextView laserInfoTv;
    private VideoFeedView primaryVideoFeed;
    private OverLayerTopView overLayerTopView;

    private VideoFeeder.PhysicalSourceListener sourceListener;
    private CameraVideoStreamSource.Callback videoStreamSourceCallback;
    private LaserMeasureInformation.Callback laserCallback;

    private LocationCoordinate3D curLocation = null;
    private Camera mCamera = null;
    private List<Lens> lenses = null;
    private Lens mLens = null;
    private List<Point> currentPoints = new ArrayList<>();
    private Timer timer = null;
    private int index=0;
    private int lensIndex=0;

    public LookAtMissionView(Context context) {
        super(context);
        setOrientation(LinearLayout.HORIZONTAL);
        setClickable(true);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.look_at_mission_view, this,true);
        init();
    }

    private void init() {
        if (DJISDKManager.getInstance() != null) {
            BaseProduct product = DJISDKManager.getInstance().getProduct();
            if (product != null) {
                if (product instanceof Aircraft) {
                    mCamera = ((Aircraft) product).getCameras().get(0);
                } else {
                    mCamera = product.getCamera();
                }
                lenses = mCamera.getLenses();
                mLens = mCamera.getLens(lensIndex);
            }
        }
        timer = new Timer();
    }

    private void initUI() {
        setVideoSourceBtn = findViewById(R.id.btn_set_video_stream_source);
        enableLaserBtn = findViewById(R.id.btn_laser_enable);
        splitSreenDiaplayBtn = findViewById(R.id.btn_split_screen_display);
        addPinBtn = findViewById(R.id.btn_add_pinpoint);
        clearPinBtn = findViewById(R.id.btn_clear_pinpoint);
        doLookAtBtn = findViewById(R.id.btn_do_look_at);
        curPhysicalSource = findViewById(R.id.tv_look_at_mission_info_physical_source);
        curVideoStreamSource = findViewById(R.id.tv_look_at_mission_info_video_source);
        laserInfoTv = findViewById(R.id.tv_laser_info);
        primaryVideoFeed = findViewById(R.id.primary_video_feed);
        overLayerTopView = findViewById(R.id.mt_over_layer_view);
        initOnclickListener();
    }

    private void initOnclickListener() {
        setVideoSourceBtn.setOnClickListener(this);
        enableLaserBtn.setOnClickListener(this);
        splitSreenDiaplayBtn.setOnClickListener(this);
        addPinBtn.setOnClickListener(this);
        clearPinBtn.setOnClickListener(this);
        doLookAtBtn.setOnClickListener(this);
    }

    private void setVideoListener() {
        if (Helper.isM300Product() && Helper.isH20Series()) {
            BaseProduct product = DJISDKManager.getInstance().getProduct();
            if (product.getAirLink() != null && product.getAirLink().getOcuSyncLink() != null) {
                product.getAirLink().getOcuSyncLink().assignSourceToPrimaryChannel(PhysicalSource.LEFT_CAM, PhysicalSource.FPV_CAM, djiError -> {
                    String result = "";
                    if (djiError == null) {
                        result = "AssignSource Success";
                    } else {
                        result = "AssignSource Failed, " + djiError.getDescription();
                    }
                    ViewHelper.showToast(this.getContext(), result);
                });
            }
        }

        sourceListener = (videoFeed, physicalSource) -> {
            if (videoFeed == VideoFeeder.getInstance().getPrimaryVideoFeed()) {
                String message = "Change Source To " + physicalSource;
                ViewHelper.showToast(this.getContext(), message);
            }
        };

        primaryVideoFeed.registerLiveVideo(VideoFeeder.getInstance().getPrimaryVideoFeed(), true);
        ToastUtils.setResultToText(curPhysicalSource, VideoFeeder.getInstance().getPrimaryVideoFeed().getVideoSource().name());
        VideoFeeder.getInstance().addPhysicalSourceListener(sourceListener);

        videoStreamSourceCallback = (videoStreamSource) -> {
            String message = "Cur Source: " + videoStreamSource.name();
            ToastUtils.setResultToText(curVideoStreamSource, message);
        };

        laserCallback = (laserInformation) -> {
            String laserInfo = "Laser information: \n" + laserInformation;
            ToastUtils.setResultToText(laserInfoTv, laserInfo);
        };
        Camera curCamera = DJISampleApplication.getProductInstance().getCamera();
        if (curCamera != null) {
            curCamera.setCameraVideoStreamSourceCallback(videoStreamSourceCallback);
            if (curCamera.getLens(0) != null) {
                curCamera.getLens(0).setLaserMeasureInformationCallback(laserCallback);
            }
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        initUI();
        setVideoListener();
    }

    @Override
    public void onClick(View v) {
        if (v != null) {
            switch (v.getId()) {
                case R.id.btn_set_video_stream_source:
                    setStreamSource();
                    break;
                case R.id.btn_laser_enable:
                    enableLaser();
                    break;
                case R.id.btn_split_screen_display:
                    splitScreenDisplay();
                    break;
                case R.id.btn_add_pinpoint:
                    addPinPoint();
                    break;
                case R.id.btn_clear_pinpoint:
                    clearPinPoint();
                    break;
                case R.id.btn_do_look_at:
                    lookAt();
                    break;
                default:
                    break;
            }
        }
    }

    private void clearPinPoint() {
        currentPoints = new ArrayList<>();
        refreshPinPointAndCameraInfo();
    }

    private void addPinPoint(){
        KeyManager.getInstance().getValue(CameraKey.createLensKey(CameraKey.LASER_MEASURE_INFORMATION, index,lensIndex), new GetCallback() {
            @Override
            public void onSuccess(@NonNull @NotNull Object o) {
                LaserMeasureInformation laserMeasureInformation = (LaserMeasureInformation) o;
                openInputDialog(getPhysicalSourceByIndex(index), laserMeasureInformation.getTargetLocation().getLongitude(), laserMeasureInformation.getTargetLocation().getLatitude(), laserMeasureInformation.getTargetLocation().getAltitude());
            }

            @Override
            public void onFailure(@NonNull @NotNull DJIError djiError) {
                ViewHelper.showToast(getContext(), "Get Laser Information Failed: "+djiError.getDescription());
            }
        });
    }

    private void openInputDialog(PhysicalSource physicalSource,double longitude,double latitude,double altitude) {
        final EditText inputServer = new EditText(getContext());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(longitude+" "+latitude+" "+altitude);
        inputServer.setHint(stringBuilder.toString());
        inputServer.setText(stringBuilder.toString());
        inputServer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputServer.setHint(null);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Add Pin Point(Lng Lat Alt)").setView(inputServer)
                .setNegativeButton("CANCEL", null);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                addPinPoint(inputServer.getText(), physicalSource);
            }
        });
        builder.show();
    }

    private void addPinPoint(Editable input, PhysicalSource physicalSource) {
        GPSPos gpsPos = new GPSPos();
        try {
            String inputStr = input.toString();
            String[] pos = inputStr.split(" ");
            gpsPos.longitude = Double.valueOf(pos[0]);
            gpsPos.latitude = Double.valueOf(pos[1]);
            gpsPos.altitude = Float.valueOf(pos[2]);

            curLocation = new LocationCoordinate3D(gpsPos.latitude, gpsPos.longitude, gpsPos.altitude);
        } catch (Exception e) {
            ViewHelper.showToast(getContext(), "Input Str Error : " + e.getMessage());
            return;
        }
        Point point = initPinPoint(gpsPos, physicalSource);
        if (point != null) {
            currentPoints.add(point);
            refreshPinPointAndCameraInfo();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    reCalcPinPoints();
                }
            },1000,1000);
        } else {
            ViewHelper.showToast(getContext(), "Add Point Error");
        }

    }

    private void reCalcPinPoints() {
        List<Point> newPoints = new ArrayList<>();
        for (Point point : currentPoints) {
            Point tempPoint = initPinPoint(point.pos, point.physicalSource);
            if (tempPoint != null) {
                newPoints.add(tempPoint);
            }
        }
        currentPoints = newPoints;
        refreshPinPointAndCameraInfo();
    }

    private Point initPinPoint(GPSPos gpsPos, PhysicalSource physicalSource) {
        Point point = new Point();
        point.pos = gpsPos;
        point.physicalSource = physicalSource;
        LocationCoordinate3D locationCoordinate3D = new LocationCoordinate3D(gpsPos.latitude,gpsPos.longitude,gpsPos.altitude);
        mCamera.getLiveviewLocationWithGPS(locationCoordinate3D, physicalSource, new CommonCallbacks.CompletionCallbackWith<PinPointInfo>() {
            @Override
            public void onSuccess(PinPointInfo pinPointInfo) {
                point.pinPointInfo = pinPointInfo;
            }

            @Override
            public void onFailure(DJIError error) {
                point.pinPointInfo = null;
            }
        });
        if (point.pinPointInfo == null) {
            return null;
        }
        return point;
    }

    private void refreshPinPointAndCameraInfo() {
        runOnUiThread(new Runnable(){

            @Override
            public void run() {
                overLayerTopView.onPointsChanged(currentPoints);
                StringBuffer buffer = new StringBuffer();
                buffer.append("currentCameraIndex:").append(index).append("\n");
                buffer.append("currentLensIndex:").append(lensIndex).append("\n");
                for (Point pinPoint : currentPoints) {
                    buffer.append(pinPoint.toString()).append("\n");
                }
                laserInfoTv.setText(buffer.toString());
            }
        });
    }

    private void lookAt() {
        LookAtMode[] modes = LookAtMode.getValues();
        Runnable lookAtRunnable = () -> {
            if (PopupUtils.INSTANCE.getIndex()[0] != -1) {
                doLookAt(curLocation, modes[PopupUtils.INSTANCE.getIndex()[0]]);
                PopupUtils.INSTANCE.resetIndex();
            }
        };
        if (modes != null && modes.length > 0) {
            PopupUtils.INSTANCE.initPopupNumberPicker(ViewHelper.makeList(modes), lookAtRunnable, this);
        }
    }

    private void doLookAt(LocationCoordinate3D locationCoordinate3D, LookAtMode lookAtMode) {
        if (DJISDKManager.getInstance().getProduct() != null) {
            Gimbal gimbal = DJISDKManager.getInstance().getProduct().getGimbal();
            if (gimbal != null && locationCoordinate3D != null && lookAtMode != null) {
                gimbal.lookAt(locationCoordinate3D, lookAtMode, result -> {
                    if (result != null) {
                        ViewHelper.showToast(getContext(), "LookAt Failed: " + result.getDescription());
                    } else {
                        ViewHelper.showToast(getContext(), "LookAt Success");
                    }
                });
            }
        }
    }

    private void setStreamSource() {
        CameraVideoStreamSource[] videoStreamSources = updateCameraVideoStreamSourceRange();
        Runnable videoStreamRunnable = () -> {
            if (PopupUtils.INSTANCE.getIndex()[0] != -1) {
                doSetStreamSource(videoStreamSources[PopupUtils.INSTANCE.getIndex()[0]]);
                PopupUtils.INSTANCE.resetIndex();
            }
        };
        if (videoStreamSources != null && videoStreamSources.length > 0) {
            PopupUtils.INSTANCE.initPopupNumberPicker(ViewHelper.makeList(videoStreamSources), videoStreamRunnable, this);
        }
    }

    private void doSetStreamSource(CameraVideoStreamSource videoStreamSource) {
        KeyManager.getInstance().setValue(CameraKey.create(CameraKey.CAMERA_VIDEO_STREAM_SOURCE, 0), videoStreamSource, new SetCallback() {
            @Override
            public void onSuccess() {
                ViewHelper.showToast(getContext(), "Set Stream Source " + videoStreamSource + " Success!");
            }

            @Override
            public void onFailure(@NonNull @NotNull DJIError djiError) {
                ViewHelper.showToast(getContext(), "Set Stream Source " + videoStreamSource + " Failed: " + djiError.getDescription());
            }
        });
    }

    private CameraVideoStreamSource[] updateCameraVideoStreamSourceRange() {
        DJIKey key = CameraKey.create(CameraKey.CAMERA_VIDEO_STREAM_SOURCE_RANGE, 0);
        if (KeyManager.getInstance().getValue(key) == null) {
            return new CameraVideoStreamSource[]{CameraVideoStreamSource.DEFAULT};
        } else {
            return (CameraVideoStreamSource[]) KeyManager.getInstance().getValue(key);
        }
    }

    private void splitScreenDisplay(){
        KeyManager.getInstance().setValue(CameraKey.create(CameraKey.CAMERA_VIDEO_STREAM_SOURCE, 0), CameraVideoStreamSource.INFRARED_THERMAL, new SetCallback() {
            @Override
            public void onSuccess() {
                mLens.setDisplayMode(SettingsDefinitions.DisplayMode.PIP, new CommonCallbacks.CompletionCallback() {
                    @Override
                    public void onResult(DJIError djiError) {
                        if (djiError == null) {
                            mLens.setPIPPosition(SettingsDefinitions.PIPPosition.SIDE_BY_SIDE, new CommonCallbacks.CompletionCallback() {
                                @Override
                                public void onResult(DJIError djiError) {
                                    if(djiError!=null){
                                        ViewHelper.showToast(getContext(), "Set PIPPosition" + " Failed: " + djiError.getDescription());
                                    }
                                }
                            });
                        } else {
                            ViewHelper.showToast(getContext(), "Set Display Mode" + " Failed: " + djiError.getDescription());
                        }
                    }
                });
            }

            @Override
            public void onFailure(@NonNull @NotNull DJIError djiError) {
                ViewHelper.showToast(getContext(), "Set Stream Source " + CameraVideoStreamSource.INFRARED_THERMAL + " Failed: " + djiError.getDescription());
            }
        });
    }

    private void enableLaser() {
        Boolean[] laserEnableArray = new Boolean[]{true, false};
        Runnable laserRunnable = new Runnable() {
            @Override
            public void run() {
                if (PopupUtils.INSTANCE.getIndex()[0] != -1) {
                    setLaserEnabled(laserEnableArray[PopupUtils.INSTANCE.getIndex()[0]]);
                    PopupUtils.INSTANCE.resetIndex();
                }
            }
        };
        if (laserEnableArray != null && laserEnableArray.length > 0) {
            PopupUtils.INSTANCE.initPopupNumberPicker(ViewHelper.makeList(laserEnableArray), laserRunnable, this);
        }
    }

    private void setLaserEnabled(boolean enabled){
        KeyManager.getInstance().setValue(CameraKey.create(CameraKey.LASER_ENABLED, 0), enabled, new SetCallback() {
            @Override
            public void onSuccess() {
                ViewHelper.showToast(getContext(), "Set Laser Enabled:"+enabled+" Success!");
            }

            @Override
            public void onFailure(@NonNull @NotNull DJIError djiError) {
                ViewHelper.showToast(getContext(), "Set Laser Enabled:"+enabled+" failed: "+djiError.getDescription());
            }
        });
    }

    private PhysicalSource getPhysicalSourceByIndex(int index) {
        switch (index) {
            case 0:
                return PhysicalSource.LEFT_CAM;
            case 1:
                return PhysicalSource.RIGHT_CAM;
            case 4:
                return PhysicalSource.TOP_CAM;
            default:
                return PhysicalSource.LEFT_CAM;
        }
    }

    @Override
    public int getDescription() {
        return R.string.look_at_mission;
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }

    public static class Point {
        public GPSPos pos = new GPSPos(0, 0, 0);
        public PinPointInfo pinPointInfo = new PinPointInfo();
        public PhysicalSource physicalSource;

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("<-------------------Point------------------->\n");
            sb.append("Lng:").append(pos.longitude).append(" ");
            sb.append("Lat:").append(pos.latitude).append(" ");
            sb.append("Alt:").append(pos.altitude).append("\n");
            sb.append("ResultInner:").append(pinPointInfo.getResult()).append("\n");
            for (int i = 0; i < pinPointInfo.getPinPoints().size(); i++) {
                PinPoint vector2 = pinPointInfo.getPinPoints().get(i);
                sb.append("Vector2 index:" + i);
                sb.append("X:").append(vector2.getX()).append(" ");
                sb.append("Y:").append(vector2.getY()).append(" ").append("\n");
            }
            sb.append("PointDirection:").append(pinPointInfo.getPointDirection()).append("\n");
            sb.append("PhysicalSource:").append(physicalSource);
            return sb.toString();
        }
    }
}
