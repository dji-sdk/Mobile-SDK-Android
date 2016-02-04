package com.dji.sdk.sample.missionmanager;

import android.content.Context;
import android.util.AttributeSet;

import com.dji.sdk.sample.common.Utils;

import java.util.LinkedList;
import java.util.List;

import dji.sdk.MissionManager.DJICustomMission;
import dji.sdk.MissionManager.DJIFollowMeMission;
import dji.sdk.MissionManager.DJIHotPointMission;
import dji.sdk.MissionManager.DJIMission;
import dji.sdk.MissionManager.DJIPanoramaMission;
import dji.sdk.MissionManager.DJIWaypoint;
import dji.sdk.MissionManager.DJIWaypointMission;
import dji.sdk.base.DJIBaseComponent;
import dji.sdk.base.DJIError;

/**
 * Class for waypoint mission.
 */
public class WaypointMissionView extends MissionManagerBaseView {

    public WaypointMissionView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected DJIMission initMission() {
        if (!Utils.checkGpsCoordinate(mHomeLatitude, mHomeLongitude)) {
            Utils.setResultToToast(mContext, "No home point!!!");
            return null;
        }

        // Step 1: create mission
        DJIWaypointMission waypointMission = new DJIWaypointMission();
        waypointMission.maxFlightSpeed = 14;
        waypointMission.autoFlightSpeed = 4;
        List<DJIWaypoint> waypointsList = new LinkedList<>();

        // Step 2: create waypoints and prepare coordinates
        DJIWaypoint northPoint = new DJIWaypoint(mHomeLatitude + 10 * Utils.ONE_METER_OFFSET, mHomeLongitude, 10f);
        DJIWaypoint eastPoint = new DJIWaypoint(mHomeLatitude, mHomeLongitude + 10 * Utils.calcLongitudeOffset(mHomeLatitude), 20f);
        DJIWaypoint southPoint = new DJIWaypoint(mHomeLatitude - 10 * Utils.ONE_METER_OFFSET, mHomeLongitude, 30f);
        DJIWaypoint westPoint = new DJIWaypoint(mHomeLatitude, mHomeLongitude - 10 * Utils.calcLongitudeOffset(mHomeLatitude), 40f);

        //Step 3: add actions
        northPoint.addAction(new DJIWaypoint.DJIWaypointAction(DJIWaypoint.DJIWaypointActionType.GimbalPitch, -60));
        northPoint.addAction(new DJIWaypoint.DJIWaypointAction(DJIWaypoint.DJIWaypointActionType.StartTakePhoto, 0));
        eastPoint.addAction(new DJIWaypoint.DJIWaypointAction(DJIWaypoint.DJIWaypointActionType.StartTakePhoto, 0));
        southPoint.addAction(new DJIWaypoint.DJIWaypointAction(DJIWaypoint.DJIWaypointActionType.RotateAircraft, 60));
        southPoint.addAction(new DJIWaypoint.DJIWaypointAction(DJIWaypoint.DJIWaypointActionType.StartRecord, 0));
        westPoint.addAction(new DJIWaypoint.DJIWaypointAction(DJIWaypoint.DJIWaypointActionType.StopRecord, 0));

        //Step 4: add waypoints into the mission
        waypointsList.add(northPoint);
        waypointsList.add(eastPoint);
        waypointsList.add(southPoint);
        waypointsList.add(westPoint);
        waypointMission.addWaypoints(waypointsList);

        return waypointMission;
    }

    private int lastTargetWPIndex = -1;
    @Override
    public void missionProgressStatus(DJIMission.DJIMissionProgressStatus progressStatus) {
        if (progressStatus == null) {
            return;
        }
        pushSB = new StringBuffer();
        if (progressStatus instanceof DJIWaypointMission.DJIWaypointMissionStatus) {

            Utils.addLineToSB(pushSB, "Target waypoint index", ((DJIWaypointMission.DJIWaypointMissionStatus) progressStatus).getTargetWaypointIndex());
            Utils.addLineToSB(pushSB, "Is waypoint reached", ((DJIWaypointMission.DJIWaypointMissionStatus) progressStatus).isWaypointReached());
            Utils.addLineToSB(pushSB, "Execute state", ((DJIWaypointMission.DJIWaypointMissionStatus) progressStatus).getExecState().name());
            DJIError err = progressStatus.getError();
            Utils.addLineToSB(pushSB, "Mission status", err == null ? "Normal" : err.getDescription());

            if (((DJIWaypointMission.DJIWaypointMissionStatus) progressStatus).getTargetWaypointIndex() == 2 && lastTargetWPIndex == 1) {
                DJIWaypointMission.setAutoFlightSpeed(10, new DJIBaseComponent.DJICompletionCallback() {

                    @Override
                    public void onResult(DJIError error) {
                        Utils.setResultToToast(mContext, "Set auto flight speed: " + (error == null ? "Success" : error.getDescription()));
                    }
                });
            }
            lastTargetWPIndex = ((DJIWaypointMission.DJIWaypointMissionStatus) progressStatus).getTargetWaypointIndex();
        }
        else if (
                progressStatus instanceof DJIFollowMeMission.DJIFollowMeMissionStatus ||
                        progressStatus instanceof DJIHotPointMission.DJIHotPointMissionStatus ||
                        progressStatus instanceof DJIPanoramaMission.DJIPanoramaMissionStatus ||
                        progressStatus instanceof DJICustomMission.DJICustomMissionProgressStatus
                ) {
            Utils.addLineToSB(pushSB, null, "Received " + progressStatus.getClass().getSimpleName());
        }
        else {
            DJIError err = progressStatus.getError();
            Utils.addLineToSB(pushSB, "Previous mission result", err == null ? "Success" : err.getDescription());
        }
        Utils.setResultToText(mContext, mMissionPushInfoTV, pushSB.toString());
    }
}
