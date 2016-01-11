package com.dji.sdk.sample.missionmanager;

import android.content.Context;
import android.util.AttributeSet;

import com.dji.sdk.sample.common.Utils;

import java.util.LinkedList;
import java.util.List;

import dji.sdk.Gimbal.DJIGimbal;
import dji.sdk.MissionManager.DJICustomMission;
import dji.sdk.MissionManager.DJIFollowMeMission;
import dji.sdk.MissionManager.DJIHotPointMission;
import dji.sdk.MissionManager.DJIMission;
import dji.sdk.MissionManager.DJIPanoramaMission;
import dji.sdk.MissionManager.DJIWaypoint;
import dji.sdk.MissionManager.DJIWaypointMission;
import dji.sdk.MissionManager.MissionStep.DJIGimbalAttitudeStep;
import dji.sdk.MissionManager.MissionStep.DJIGoHomeStep;
import dji.sdk.MissionManager.MissionStep.DJIGoToStep;
import dji.sdk.MissionManager.MissionStep.DJIHotpointStep;
import dji.sdk.MissionManager.MissionStep.DJIMissionStep;
import dji.sdk.MissionManager.MissionStep.DJIShootPhotoStep;
import dji.sdk.MissionManager.MissionStep.DJIStartRecordVideoStep;
import dji.sdk.MissionManager.MissionStep.DJIStopRecordVideoStep;
import dji.sdk.MissionManager.MissionStep.DJITakeoffStep;
import dji.sdk.MissionManager.MissionStep.DJIWaypointStep;
import dji.sdk.base.DJIBaseComponent;
import dji.sdk.base.DJIError;

/**
 * Class for custom mission.
 */
public class CustomMissionView extends MissionManagerBaseView {

    public CustomMissionView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected DJIMission initMission() {
        if (!Utils.checkGpsCoordinate(mHomeLatitude, mHomeLongitude)) {
            Utils.setResultToToast(mContext, "No home point!!!");
            return null;
        }

        LinkedList<DJIMissionStep> steps = new LinkedList<DJIMissionStep>();

        //Step 1: takeoff from the ground
        steps.add(new DJITakeoffStep(new DJIBaseComponent.DJICompletionCallback() {

            @Override
            public void onResult(DJIError error) {
                Utils.setResultToToast(mContext, "Takeoff step: " + (error == null ? "Success" : error.getDescription()));
            }
        }));

        //Step 2: reset the gimbal to horizontal angle
        steps.add(new DJIGimbalAttitudeStep(
                DJIGimbal.DJIGimbalRotateAngleMode.AbsoluteAngle,
                new DJIGimbal.DJIGimbalAngleRotation(true, 0f, DJIGimbal.DJIGimbalRotateDirection.Clockwise),
                null,
                null,
                new DJIBaseComponent.DJICompletionCallback() {
                    @Override
                    public void onResult(DJIError error) {
                        Utils.setResultToToast(mContext, "Set gimbal attitude step: " + (error == null ? "Success" : error.getDescription()));

                    }
                }));

        //Step 3: Go 10 meters from home point
        steps.add(new DJIGoToStep(mHomeLatitude, mHomeLongitude, 10, new DJIBaseComponent.DJICompletionCallback() {

            @Override
            public void onResult(DJIError error) {
                Utils.setResultToToast(mContext, "Goto step: " + (error == null ? "Success" : error.getDescription()));
            }
        }));

        //Step 4: shoot 3 photos with 3 seconds interval between each
        steps.add(new DJIShootPhotoStep(3, 3, new DJIBaseComponent.DJICompletionCallback() {
            @Override
            public void onResult(DJIError error) {
                Utils.setResultToToast(mContext, "Take continuous picture step: " + (error == null ? "Success" : error.getDescription()));
            }
        }));

        //Step 5: start recording video
        steps.add(new DJIStartRecordVideoStep(new DJIBaseComponent.DJICompletionCallback() {

            @Override
            public void onResult(DJIError error) {
                Utils.setResultToToast(mContext, "Start record video step: " + (error == null ? "Success" : error.getDescription()));
            }
        }));

        //Step 6: shoot a single photo (if the camera is recording video, then this step will be ignored)
        steps.add(new DJIShootPhotoStep(new DJIBaseComponent.DJICompletionCallback() {

            @Override
            public void onResult(DJIError error) {
                Utils.setResultToToast(mContext, "Take single photo step: " + (error == null ? "Success" : error.getDescription()));
            }
        }));

        //Step 7: start a waypoint mission while the aircraft is still recording the video
        steps.add(new DJIWaypointStep(initTestingWaypointMission(), new DJIBaseComponent.DJICompletionCallback() {

            @Override
            public void onResult(DJIError error) {
                Utils.setResultToToast(mContext, "Waypoint step: " + (error == null ? "Success" : error.getDescription()));
            }
        }));

        //Step 8: stop the recording when the waypoint mission is finished
        steps.add(new DJIStopRecordVideoStep(new DJIBaseComponent.DJICompletionCallback() {

            @Override
            public void onResult(DJIError error) {
                Utils.setResultToToast(mContext, "Stop record video step: " + (error == null ? "Success" : error.getDescription()));
            }

        }));

        //Step 9: shoot a single photo
        steps.add(new DJIShootPhotoStep(new DJIBaseComponent.DJICompletionCallback() {

            @Override
            public void onResult(DJIError error) {
                Utils.setResultToToast(mContext, "Take single photo step: " + (error == null ? "Success" : error.getDescription()));
            }
        }));

        //Step 10: start a hotpoint mission
        DJIHotPointMission hotpointMission = new DJIHotPointMission(mHomeLatitude, mHomeLongitude);
        hotpointMission.altitude = 40;
        steps.add(new DJIHotpointStep(hotpointMission, 90f, new DJIBaseComponent.DJICompletionCallback() {

            @Override
            public void onResult(DJIError error) {
                Utils.setResultToToast(mContext, "Hotpoint step: " + (error == null ? "Success" : error.getDescription()));
            }
        }));

        //Step 11: go back home
        steps.add(new DJIGoHomeStep(new DJIBaseComponent.DJICompletionCallback() {

            @Override
            public void onResult(DJIError error) {
                Utils.setResultToToast(mContext, "Gohome step: " + (error == null ? "Success" : error.getDescription()));
            }
        }));

        DJICustomMission customMission = new DJICustomMission(steps);

        return customMission;
    }

    @Override
    public void missionProgressStatus(DJIMission.DJIMissionProgressStatus progressStatus) {
        if (progressStatus == null) {
            return;
        }
        pushSB = new StringBuffer();
        if (progressStatus instanceof DJICustomMission.DJICustomMissionProgressStatus) {
            Utils.addLineToSB(
                    pushSB,
                    "Current step",
                    ((DJICustomMission.DJICustomMissionProgressStatus) progressStatus)
                            .getCurrentExecutingStep() == null ? "NULL" : ((DJICustomMission.DJICustomMissionProgressStatus) progressStatus)
                            .getCurrentExecutingStep().getClass().getSimpleName());
        }
        else if (
                progressStatus instanceof DJIWaypointMission.DJIWaypointMissionStatus ||
                        progressStatus instanceof DJIHotPointMission.DJIHotPointMissionStatus ||
                        progressStatus instanceof DJIPanoramaMission.DJIPanoramaMissionStatus ||
                        progressStatus instanceof DJIFollowMeMission.DJIFollowMeMissionStatus
                ) {
            Utils.addLineToSB(pushSB, null, "Received " + progressStatus.getClass().getSimpleName());
        }
        else {
            DJIError err = progressStatus.getError();
            Utils.addLineToSB(pushSB, "Previous mission result", err == null ? "Success" : err.getDescription());
        }
        Utils.setResultToText(mContext, mMissionPushInfoTV, pushSB.toString());
    }

    private DJIWaypointMission initTestingWaypointMission() {
        if (!Utils.checkGpsCoordinate(mHomeLatitude, mHomeLongitude)) {
            Utils.setResultToToast(mContext, "No home point!!!");
            return null;
        }

        DJIWaypointMission waypointMission = new DJIWaypointMission();
        List<DJIWaypoint> testingWaypoints = new LinkedList<>();

        DJIWaypoint northPoint = new DJIWaypoint(mHomeLatitude + 10 * Utils.ONE_METER_OFFSET, mHomeLongitude, 10f);
        DJIWaypoint eastPoint = new DJIWaypoint(mHomeLatitude, mHomeLongitude + 10 * Utils.calcLongitudeOffset(mHomeLatitude), 20f);
        DJIWaypoint southPoint = new DJIWaypoint(mHomeLatitude - 10 * Utils.ONE_METER_OFFSET, mHomeLongitude, 30f);
        DJIWaypoint westPoint = new DJIWaypoint(mHomeLatitude, mHomeLongitude - 10 * Utils.calcLongitudeOffset(mHomeLatitude), 40f);

        northPoint.addAction(new DJIWaypoint.DJIWaypointAction(DJIWaypoint.DJIWaypointActionType.GimbalPitch, -60));
        southPoint.addAction(new DJIWaypoint.DJIWaypointAction(DJIWaypoint.DJIWaypointActionType.RotateAircraft, 60));

        testingWaypoints.add(northPoint);
        testingWaypoints.add(eastPoint);
        testingWaypoints.add(southPoint);
        testingWaypoints.add(westPoint);

        waypointMission.addWaypoints(testingWaypoints);
        return waypointMission;
    }
}
