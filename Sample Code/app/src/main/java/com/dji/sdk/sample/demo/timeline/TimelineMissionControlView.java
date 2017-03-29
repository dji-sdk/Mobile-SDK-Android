package com.dji.sdk.sample.demo.timeline;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.GeneralUtils;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.PresentableView;
import dji.common.error.DJIError;
import dji.common.gimbal.Attitude;
import dji.common.gimbal.Rotation;
import dji.common.mission.hotpoint.HotpointMission;
import dji.common.mission.waypoint.Waypoint;
import dji.common.mission.waypoint.WaypointAction;
import dji.common.mission.waypoint.WaypointActionType;
import dji.common.mission.waypoint.WaypointMission;
import dji.common.mission.waypoint.WaypointMissionFinishedAction;
import dji.common.mission.waypoint.WaypointMissionFlightPathMode;
import dji.common.mission.waypoint.WaypointMissionGotoWaypointMode;
import dji.common.mission.waypoint.WaypointMissionHeadingMode;
import dji.common.model.LocationCoordinate2D;
import dji.common.util.CommonCallbacks;
import dji.sdk.base.BaseProduct;
import dji.sdk.flightcontroller.FlightController;
import dji.sdk.mission.MissionControl;
import dji.sdk.mission.timeline.TimelineElement;
import dji.sdk.mission.timeline.TimelineEvent;
import dji.sdk.mission.timeline.Mission;
import dji.sdk.mission.timeline.actions.GimbalAttitudeAction;
import dji.sdk.mission.timeline.actions.GoHomeAction;
import dji.sdk.mission.timeline.actions.GoToAction;
import dji.sdk.mission.timeline.actions.HotpointAction;
import dji.sdk.mission.timeline.actions.RecordVideoAction;
import dji.sdk.mission.timeline.actions.ShootPhotoAction;
import dji.sdk.mission.timeline.actions.TakeOffAction;
import dji.sdk.products.Aircraft;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Class for Timeline MissionControl.
 */
public class TimelineMissionControlView extends LinearLayout implements OnClickListener, PresentableView {

    private MissionControl missionControl;
    private FlightController flightController;

    protected Button prepareBtn;
    protected Button startBtn;
    protected Button stopBtn;
    protected Button pauseBtn;
    protected Button resumeBtn;
    protected Button cleanBtn;

    protected TextView timelineInfoTV;
    protected TextView runningInfoTV;
    protected ProgressBar progressBar;

    protected double homeLatitude = 181;
    protected double homeLongitude = 181;

    public TimelineMissionControlView(Context context) {
        super(context);
        initUI(context);
    }

    public TimelineMissionControlView(Context context, @Nullable AttributeSet attrs) {
        super(context);
        initUI(context);
    }

    public TimelineMissionControlView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context);
        initUI(context);
    }

    private void setRunningResultToText(final String s) {
        post(new Runnable() {
            @Override
            public void run() {
                if (runningInfoTV == null) {
                    Toast.makeText(getContext(), "textview = null", Toast.LENGTH_SHORT).show();
                } else {
                    runningInfoTV.append(s + "\n");
                }
            }
        });
    }

    private void setTimelinePlanToText(final String s) {

        post(new Runnable() {
            @Override
            public void run() {
                if (timelineInfoTV == null) {
                    Toast.makeText(getContext(), "textview = null", Toast.LENGTH_SHORT).show();
                } else {
                    timelineInfoTV.append(s + "\n");
                }
            }
        });
    }

    private void initTimeline() {
        if (!GeneralUtils.checkGpsCoordinate(homeLatitude, homeLongitude)) {
            ToastUtils.setResultToToast("No home point!!!");
            return;
        }

        List<TimelineElement> elements = new ArrayList<>();

        missionControl = MissionControl.getInstance();
        final TimelineEvent preEvent = null;
        MissionControl.Listener listener = new MissionControl.Listener() {
            @Override
            public void onEvent(@Nullable TimelineElement element, TimelineEvent event, DJIError error) {
                updateTimelineStatus(element, event, error);
            }
        };

        //Step 1: takeoff from the ground
        setTimelinePlanToText("Step 1: takeoff from the ground");
        elements.add(new TakeOffAction());

        //Step 2: reset the gimbal to horizontal angle in 2 seconds.
        //setTimelinePlanToText("Step 2: reset the gimbal to horizontal angle in 2 seconds");
        //Attitude attitude = new Attitude(0, Rotation.NO_ROTATION, Rotation.NO_ROTATION);
        //GimbalAttitudeAction gimbalAction = new GimbalAttitudeAction(attitude);
        //gimbalAction.setCompletionTime(2);
        //elements.add(gimbalAction);

        //Step 3: Go 10 meters from home point
        //setTimelinePlanToText("Step 3: Go 10 meters from home point");
        //elements.add(new GoToAction(new LocationCoordinate2D(homeLatitude, homeLongitude), 10));

        //Step 4: shoot 3 photos with 2 seconds interval between each
        //setTimelinePlanToText("Step 4: shoot 3 photos with 2 seconds interval between each");
        //elements.add(new ShootPhotoAction(3, 2));

        //Step 5: shoot a single photo
        //setTimelinePlanToText("Step 5: shoot a single photo");
        //elements.add(new ShootPhotoAction());

        //Step 6: start recording video
        setTimelinePlanToText("Step 2: start recording video");
        elements.add(new RecordVideoAction(true));


        //Step 7: start a waypoint mission while the aircraft is still recording the video
        setTimelinePlanToText("Step 3: start a waypoint mission while the aircraft is still recording the video");
        elements.add(Mission.elementFromWaypointMission(initTestingWaypointMission()));

        //Step 8: stop the recording when the waypoint mission is finished
        setTimelinePlanToText("Step 4: stop the recording when the waypoint mission is finished");
        elements.add(new RecordVideoAction(false));

        //Step 9: shoot a single photo
        //setTimelinePlanToText("Step 9: shoot a single photo");
        //elements.add(new ShootPhotoAction());

        //Step 10: start a hotpoint mission
        setTimelinePlanToText("Step 5: start a hotpoint mission to surround 360 degree");
        HotpointMission hotpointMission = new HotpointMission();
        hotpointMission.setHotpoint(new LocationCoordinate2D(homeLatitude, homeLongitude));
        hotpointMission.setAltitude(40);
        hotpointMission.setRadius(10);
        hotpointMission.setAngularVelocity(10);
        elements.add(new HotpointAction(hotpointMission, 360));

        //Step 11: go back home
        setTimelinePlanToText("Step 6: go back home");
        elements.add(new GoHomeAction());

        if (missionControl.scheduledCount() > 0) {
            missionControl.unscheduleEverything();
            missionControl.removeAllListeners();
        }

        missionControl.scheduleElements(elements);
        missionControl.addListener(listener);
    }

    private void updateTimelineStatus(@Nullable TimelineElement element, TimelineEvent event, DJIError error) {

        if (element != null) {
            if (element instanceof Mission) {
                setRunningResultToText(((Mission) element).getMissionObject().getClass().getSimpleName()
                                                + " event is "
                                                + event.toString()
                                                + " "
                                                + (error == null ? "" : error.getDescription()));
            } else {
                setRunningResultToText(element.getClass().getSimpleName()
                                                + " event is "
                                                + event.toString()
                                                + " "
                                                + (error == null ? "" : error.getDescription()));
            }
        } else {
            setRunningResultToText("Timeline Event is " + event.toString() + " " + (error == null
                                                                                         ? ""
                                                                                         : "Failed:"
                                                                                             + error.getDescription()));
        }

    }

    private WaypointMission initTestingWaypointMission() {
        if (!GeneralUtils.checkGpsCoordinate(homeLatitude, homeLongitude)) {
            ToastUtils.setResultToToast("No home point!!!");
            return null;
        }

        WaypointMission.Builder waypointMissionBuilder = new WaypointMission.Builder().autoFlightSpeed(5f)
                                                                                      .maxFlightSpeed(10f)
                                                                                      .setExitMissionOnRCSignalLostEnabled(false)
                                                                                      .finishedAction(WaypointMissionFinishedAction.NO_ACTION)
                                                                                      .flightPathMode(WaypointMissionFlightPathMode.NORMAL)
                                                                                      .gotoFirstWaypointMode(WaypointMissionGotoWaypointMode.SAFELY)
                                                                                      .headingMode(WaypointMissionHeadingMode.AUTO)
                                                                                      .repeatTimes(1);;
        List<Waypoint> waypoints = new LinkedList<>();

        Waypoint northPoint = new Waypoint(homeLatitude + 10 * GeneralUtils.ONE_METER_OFFSET, homeLongitude, 10f);
        Waypoint eastPoint =
            new Waypoint(homeLatitude, homeLongitude + 10 * GeneralUtils.calcLongitudeOffset(homeLatitude), 20f);
        Waypoint southPoint = new Waypoint(homeLatitude - 10 * GeneralUtils.ONE_METER_OFFSET, homeLongitude, 30f);
        Waypoint westPoint =
            new Waypoint(homeLatitude, homeLongitude - 10 * GeneralUtils.calcLongitudeOffset(homeLatitude), 40f);

        northPoint.addAction(new WaypointAction(WaypointActionType.GIMBAL_PITCH, -60));
        southPoint.addAction(new WaypointAction(WaypointActionType.ROTATE_AIRCRAFT, 60));

        waypoints.add(northPoint);
        waypoints.add(eastPoint);
        waypoints.add(southPoint);
        waypoints.add(westPoint);

        waypointMissionBuilder.waypointList(waypoints).waypointCount(waypoints.size());
        return waypointMissionBuilder.build();
    }

    private void startTimeline() {
        if (MissionControl.getInstance().scheduledCount() > 0) {
            MissionControl.getInstance().startTimeline();
        } else {
            ToastUtils.setResultToToast("Init the timeline first by clicking the Init button");
        }
    }

    private void stopTimeline() {
        MissionControl.getInstance().stopTimeline();
    }

    private void pauseTimeline() {
        MissionControl.getInstance().pauseTimeline();
    }


    private void resumeTimeline() {
        MissionControl.getInstance().resumeTimeline();
    }

    private void cleanTimelineDataAndLog() {
        if (missionControl.scheduledCount() > 0) {
            missionControl.unscheduleEverything();
            missionControl.removeAllListeners();
        }
        runningInfoTV.setText("");
        timelineInfoTV.setText("");
    }



    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        BaseProduct product = DJISampleApplication.getProductInstance();

        if (product == null || !product.isConnected()) {
            ToastUtils.setResultToToast("Disconnect");
            missionControl = null;
            return;
        } else {
            missionControl = MissionControl.getInstance();
            if (product instanceof Aircraft) {
                flightController = ((Aircraft) product).getFlightController();
            }
        }
    }

    private void initUI(Context context) {
        setClickable(true);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.view_timeline, this, true);

        timelineInfoTV = (TextView) findViewById(R.id.tv_timeline_info);
        runningInfoTV = (TextView) findViewById(R.id.tv_running_info);
        prepareBtn = (Button) findViewById(R.id.btn_timeline_init);
        startBtn = (Button) findViewById(R.id.btn_timeline_start);
        stopBtn = (Button) findViewById(R.id.btn_timeline_stop);
        pauseBtn = (Button) findViewById(R.id.btn_timeline_pause);
        resumeBtn = (Button) findViewById(R.id.btn_timeline_resume);
        cleanBtn = (Button) findViewById(R.id.btn_timeline_clean);

        prepareBtn.setOnClickListener(this);
        startBtn.setOnClickListener(this);
        stopBtn.setOnClickListener(this);
        pauseBtn.setOnClickListener(this);
        resumeBtn.setOnClickListener(this);
        cleanBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (DJISampleApplication.getProductInstance() instanceof Aircraft && !GeneralUtils.checkGpsCoordinate(
            homeLatitude,
            homeLongitude) && flightController != null) {
            final CountDownLatch cdl = new CountDownLatch(1);
            flightController.getHomeLocation(new CommonCallbacks.CompletionCallbackWith<LocationCoordinate2D>() {
                @Override
                public void onSuccess(LocationCoordinate2D locationCoordinate2D) {
                    homeLatitude = locationCoordinate2D.getLatitude();
                    homeLongitude = locationCoordinate2D.getLongitude();
                    setTimelinePlanToText("home point latitude: "
                                                   + homeLatitude
                                                   + "\nhome point longitude: "
                                                   + homeLongitude);
                }

                @Override
                public void onFailure(DJIError djiError) {
                    cdl.countDown();
                }
            });
            try {
                cdl.await(500, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (!GeneralUtils.checkGpsCoordinate(homeLatitude, homeLongitude)) {
                ToastUtils.setResultToToast("Home coordinates not yet set...");
                return;
            }
        }
        switch (v.getId()) {
            case R.id.btn_timeline_init:
                initTimeline();
                break;
            case R.id.btn_timeline_start:
                startTimeline();
                break;
            case R.id.btn_timeline_stop:
                stopTimeline();
                break;
            case R.id.btn_timeline_pause:
                ToastUtils.setResultToToast("Timeline just supports the pause on the pausable elements, such as hotpoint mission, waypoint mission");
                pauseTimeline();
                break;
            case R.id.btn_timeline_resume:
                ToastUtils.setResultToToast("Timeline just supports the resume on the pausable elements, such as hotpoint mission, waypoint mission");
                resumeTimeline();
                break;
            case R.id.btn_timeline_clean:
                cleanTimelineDataAndLog();
                break;
            default:
                break;
        }
    }

    @Override
    public int getDescription() {
        return R.string.component_listview_timeline_mission_control;
    }

    @NonNull
    @Override
    public String getHint() {
        return this.getClass().getSimpleName() + ".java";
    }
}
