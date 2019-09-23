package com.dji.sdk.sample.demo.timeline;

import android.app.Service;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.dji.sdk.sample.R;
import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.dji.sdk.sample.internal.utils.GeneralUtils;
import com.dji.sdk.sample.internal.utils.ToastUtils;
import com.dji.sdk.sample.internal.view.PresentableView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import dji.common.error.DJIError;
import dji.common.gimbal.Attitude;
import dji.common.gimbal.Rotation;
import dji.common.mission.hotpoint.HotpointHeading;
import dji.common.mission.hotpoint.HotpointMission;
import dji.common.mission.hotpoint.HotpointStartPoint;
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
import dji.sdk.mission.Triggerable;
import dji.sdk.mission.timeline.TimelineElement;
import dji.sdk.mission.timeline.TimelineEvent;
import dji.sdk.mission.timeline.TimelineMission;
import dji.sdk.mission.timeline.actions.GimbalAttitudeAction;
import dji.sdk.mission.timeline.actions.GoHomeAction;
import dji.sdk.mission.timeline.actions.GoToAction;
import dji.sdk.mission.timeline.actions.HotpointAction;
import dji.sdk.mission.timeline.actions.RecordVideoAction;
import dji.sdk.mission.timeline.actions.ShootPhotoAction;
import dji.sdk.mission.timeline.actions.TakeOffAction;
import dji.sdk.mission.timeline.triggers.AircraftLandedTrigger;
import dji.sdk.mission.timeline.triggers.BatteryPowerLevelTrigger;
import dji.sdk.mission.timeline.triggers.Trigger;
import dji.sdk.mission.timeline.triggers.TriggerEvent;
import dji.sdk.mission.timeline.triggers.WaypointReachedTrigger;
import dji.sdk.products.Aircraft;

/**
 * Class for Timeline MissionControl.
 */
public class TimelineMissionControlView extends LinearLayout implements OnClickListener, PresentableView {

    private MissionControl missionControl;
    private FlightController flightController;
    private TimelineEvent preEvent;
    private TimelineElement preElement;
    private DJIError preError;

    protected Button getHomeBtn;
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

    /**
     * Demo on BatteryPowerLevelTrigger.  Once the batter remaining power is equal or less than the value,
     * the trigger's action will be called.
     *
     * @param triggerTarget which can be any action object or timeline object.
     */
    private void addBatteryPowerLevelTrigger(Triggerable triggerTarget) {
        float value = 20f;
        BatteryPowerLevelTrigger trigger = new BatteryPowerLevelTrigger();
        trigger.setPowerPercentageTriggerValue(value);
        addTrigger(trigger, triggerTarget, " at level " + value);
    }

    /**
     * Demo on WaypointReachedTrigger.  Once the expected waypoint is reached in the waypoint mission execution process,
     * this trigger's action will be called. If user has some special things to do for this waypoint, the code can be put
     * in this trigger action method.
     *
     * @param triggerTarget
     */
    private void addWaypointReachedTrigger(Triggerable triggerTarget) {
        int value = 1;
        WaypointReachedTrigger trigger = new WaypointReachedTrigger();
        trigger.setWaypointIndex(value);
        addTrigger(trigger, triggerTarget, " at index " + value);
    }

    /**
     * Demo on AircraftLandedTrigger. Once the aircraft is landed, this trigger action will be called if the timeline is
     * not finished yet.
     * @param triggerTarget
     */
    private void addAircraftLandedTrigger(Triggerable triggerTarget) {
        AircraftLandedTrigger trigger = new AircraftLandedTrigger();
        addTrigger(trigger, triggerTarget, "");
    }

    private Trigger.Listener triggerListener = new Trigger.Listener() {
        @Override
        public void onEvent(Trigger trigger, TriggerEvent event, @Nullable DJIError error) {
            setRunningResultToText("Trigger " + trigger.getClass().getSimpleName() + " event is " + event.name() + (error==null? " ":error.getDescription()));
        }
    };

    private void initTrigger(final Trigger trigger) {
        trigger.addListener(triggerListener);
        trigger.setAction(new Trigger.Action() {
            @Override
            public void onCall() {
                setRunningResultToText("Trigger " + trigger.getClass().getSimpleName() + " Action method onCall() is invoked");
            }
        });
    }

    private void addTrigger(Trigger trigger, Triggerable triggerTarget, String additionalComment) {

        if (triggerTarget != null) {

            initTrigger(trigger);
            List<Trigger> triggers = triggerTarget.getTriggers();
            if (triggers == null) {
                triggers = new ArrayList<>();
            }

            triggers.add(trigger);
            triggerTarget.setTriggers(triggers);

            setTimelinePlanToText(triggerTarget.getClass().getSimpleName()
                                              + " Trigger "
                                              + triggerTarget.getTriggers().size()
                                              + ") "
                                              + trigger.getClass().getSimpleName()
                                              + additionalComment);
        }
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
        setTimelinePlanToText("Step 2: set the gimbal pitch -30 angle in 2 seconds");
        Attitude attitude = new Attitude(-30, Rotation.NO_ROTATION, Rotation.NO_ROTATION);
        GimbalAttitudeAction gimbalAction = new GimbalAttitudeAction(attitude);
        gimbalAction.setCompletionTime(2);
        elements.add(gimbalAction);

        //Step 3: Go 10 meters from home point
        setTimelinePlanToText("Step 3: Go 10 meters from home point");
        elements.add(new GoToAction(new LocationCoordinate2D(homeLatitude, homeLongitude), 10));

        //Step 4: shoot 3 photos with 2 seconds interval between each
        setTimelinePlanToText("Step 4: shoot 3 photos with 2 seconds interval between each");
        elements.add(ShootPhotoAction.newShootIntervalPhotoAction(3,2));

        //Step 5: shoot a single photo
        setTimelinePlanToText("Step 5: shoot a single photo");
        elements.add(ShootPhotoAction.newShootSinglePhotoAction());

        //Step 6: start recording video
        setTimelinePlanToText("Step 6: start recording video");
        elements.add(RecordVideoAction.newStartRecordVideoAction());


        //Step 7: start a waypoint mission while the aircraft is still recording the video
        setTimelinePlanToText("Step 7: start a waypoint mission while the aircraft is still recording the video");
        TimelineElement waypointMission = TimelineMission.elementFromWaypointMission(initTestingWaypointMission());
        elements.add(waypointMission);
        addWaypointReachedTrigger(waypointMission);

        //Step 8: stop the recording when the waypoint mission is finished
        setTimelinePlanToText("Step 8: stop the recording when the waypoint mission is finished");
        elements.add(RecordVideoAction.newStopRecordVideoAction());

        //Step 9: shoot a single photo
        setTimelinePlanToText("Step 9: shoot a single photo");
        elements.add(ShootPhotoAction.newShootSinglePhotoAction());

        //Step 10: start a hotpoint mission
        setTimelinePlanToText("Step 10: start a hotpoint mission to surround 360 degree");
        HotpointMission hotpointMission = new HotpointMission();
        hotpointMission.setHotpoint(new LocationCoordinate2D(homeLatitude, homeLongitude));
        hotpointMission.setAltitude(10);
        hotpointMission.setRadius(10);
        hotpointMission.setAngularVelocity(10);
        HotpointStartPoint startPoint = HotpointStartPoint.NEAREST;
        hotpointMission.setStartPoint(startPoint);
        HotpointHeading heading = HotpointHeading.TOWARDS_HOT_POINT;
        hotpointMission.setHeading(heading);
        elements.add(new HotpointAction(hotpointMission, 360));

        //Step 11: go back home
        setTimelinePlanToText("Step 11: go back home");
        elements.add(new GoHomeAction());

        //Step 12: restore gimbal attitude
        //This last action will delay the timeline to finish after land on ground, which will
        //make sure the AircraftLandedTrigger will be triggered.
        setTimelinePlanToText("Step 2: set the gimbal pitch -30 angle in 2 seconds");
        attitude = new Attitude(0, Rotation.NO_ROTATION, Rotation.NO_ROTATION);
        gimbalAction = new GimbalAttitudeAction(attitude);
        gimbalAction.setCompletionTime(2);
        elements.add(gimbalAction);

        addAircraftLandedTrigger(missionControl);
        addBatteryPowerLevelTrigger(missionControl);

        if (missionControl.scheduledCount() > 0) {
            missionControl.unscheduleEverything();
            missionControl.removeAllListeners();
        }

        missionControl.scheduleElements(elements);
        missionControl.addListener(listener);
    }

    private void updateTimelineStatus(@Nullable TimelineElement element, TimelineEvent event, DJIError error) {

        if (element == preElement && event == preEvent && error == preError) {
            return;
        }

        if (element != null) {
            if (element instanceof TimelineMission) {
                setRunningResultToText(((TimelineMission) element).getMissionObject().getClass().getSimpleName()
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

        preEvent = event;
        preElement = element;
        preError = error;
    }

    private WaypointMission initTestingWaypointMission() {
        if (!GeneralUtils.checkGpsCoordinate(homeLatitude, homeLongitude)) {
            ToastUtils.setResultToToast("No home point!!!");
            return null;
        }

        WaypointMission.Builder waypointMissionBuilder = new WaypointMission.Builder().autoFlightSpeed(5f)
                                                                                      .maxFlightSpeed(10f)
                                                                                      .setExitMissionOnRCSignalLostEnabled(false)
                                                                                      .finishedAction(
                                                                                          WaypointMissionFinishedAction.NO_ACTION)
                                                                                      .flightPathMode(
                                                                                          WaypointMissionFlightPathMode.NORMAL)
                                                                                      .gotoFirstWaypointMode(
                                                                                          WaypointMissionGotoWaypointMode.SAFELY)
                                                                                      .headingMode(
                                                                                          WaypointMissionHeadingMode.AUTO)
                                                                                      .repeatTimes(1);;
        List<Waypoint> waypoints = new LinkedList<>();

        Waypoint northPoint = new Waypoint(homeLatitude + 10 * GeneralUtils.ONE_METER_OFFSET, homeLongitude, 10f);
        Waypoint eastPoint =
            new Waypoint(homeLatitude, homeLongitude + 10 * GeneralUtils.calcLongitudeOffset(homeLatitude), 15f);
        Waypoint southPoint = new Waypoint(homeLatitude - 10 * GeneralUtils.ONE_METER_OFFSET, homeLongitude, 10f);
        Waypoint westPoint =
            new Waypoint(homeLatitude, homeLongitude - 10 * GeneralUtils.calcLongitudeOffset(homeLatitude), 15f);

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

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (missionControl != null && missionControl.scheduledCount() > 0) {
            missionControl.unscheduleEverything();
            missionControl.removeAllListeners();
        }
    }

    private void initUI(Context context) {
        setClickable(true);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.view_timeline, this, true);

        timelineInfoTV = (TextView) findViewById(R.id.tv_timeline_info);
        runningInfoTV = (TextView) findViewById(R.id.tv_running_info);
        getHomeBtn = (Button) findViewById(R.id.btn_get_homepoint);
        prepareBtn = (Button) findViewById(R.id.btn_timeline_init);
        startBtn = (Button) findViewById(R.id.btn_timeline_start);
        stopBtn = (Button) findViewById(R.id.btn_timeline_stop);
        pauseBtn = (Button) findViewById(R.id.btn_timeline_pause);
        resumeBtn = (Button) findViewById(R.id.btn_timeline_resume);
        cleanBtn = (Button) findViewById(R.id.btn_timeline_clean);

        getHomeBtn.setOnClickListener(this);
        prepareBtn.setOnClickListener(this);
        startBtn.setOnClickListener(this);
        stopBtn.setOnClickListener(this);
        pauseBtn.setOnClickListener(this);
        resumeBtn.setOnClickListener(this);
        cleanBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn_get_homepoint) {
            if (DJISampleApplication.getProductInstance() instanceof Aircraft && !GeneralUtils.checkGpsCoordinate(
                homeLatitude,
                homeLongitude) && flightController != null) {
                flightController.getHomeLocation(new CommonCallbacks.CompletionCallbackWith<LocationCoordinate2D>() {
                    @Override
                    public void onSuccess(LocationCoordinate2D locationCoordinate2D) {
                        homeLatitude = locationCoordinate2D.getLatitude();
                        homeLongitude = locationCoordinate2D.getLongitude();
                        if (GeneralUtils.checkGpsCoordinate(homeLatitude, homeLongitude)) {
                            setTimelinePlanToText("home point latitude: " + homeLatitude + "\nhome point longitude: " + homeLongitude);
                        } else {
                            ToastUtils.setResultToToast("Failed to get home coordinates: Invalid GPS coordinate");
                        }
                    }

                    @Override
                    public void onFailure(DJIError djiError) {
                        ToastUtils.setResultToToast("Failed to get home coordinates: " + djiError.getDescription());
                    }
                });
            }
            return;
        }

        if (!GeneralUtils.checkGpsCoordinate(homeLatitude, homeLongitude)) {
            ToastUtils.setResultToToast("Home coordinates not yet set...");
            return;
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
