package com.dji.sdk.sample.missionmanager;

import android.content.Context;
import android.util.AttributeSet;

import com.dji.sdk.sample.common.Utils;

import dji.sdk.MissionManager.DJICustomMission;
import dji.sdk.MissionManager.DJIFollowMeMission;
import dji.sdk.MissionManager.DJIHotPointMission;
import dji.sdk.MissionManager.DJIMission;
import dji.sdk.MissionManager.DJIPanoramaMission;
import dji.sdk.MissionManager.DJIWaypointMission;
import dji.sdk.base.DJIBaseComponent;
import dji.sdk.base.DJIError;

/**
 * Class for follow me mission.
 */
public class FollowmeMissionView extends MissionManagerBaseView {

    public FollowmeMissionView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected DJIMission initMission() {
        if (!Utils.checkGpsCoordinate(mHomeLatitude, mHomeLongitude)) {
            Utils.setResultToToast(mContext, "No home point!!!");
            return null;
        }
        return new DJIFollowMeMission(mHomeLatitude, mHomeLongitude);
    }

    @Override
    public void missionProgressStatus(DJIMission.DJIMissionProgressStatus progressStatus) {
        if (progressStatus == null) {
            return;
        }
        pushSB = new StringBuffer();
        if (progressStatus instanceof DJIFollowMeMission.DJIFollowMeMissionStatus) {
            Utils.addLineToSB(pushSB, "Distance", ((DJIFollowMeMission.DJIFollowMeMissionStatus) progressStatus).getHorizontalDistance());
            Utils.addLineToSB(pushSB, "Execute state", ((DJIFollowMeMission.DJIFollowMeMissionStatus) progressStatus).getExecutionState().name());
            DJIError err = progressStatus.getError();
            Utils.addLineToSB(pushSB, "Mission status", err == null ? "Normal" : err.getDescription());

        }
        else if (
                progressStatus instanceof DJIWaypointMission.DJIWaypointMissionStatus ||
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

    static class UpdateFollowmeSimLocationThread extends Thread {

        private DJIMission mDJIMission = null;
        private double mHomeLatitude = 181;
        private double mHomeLongitude = 181;

        private boolean mIsRunning = false;
        private boolean mIsPausing = false;

        float clock = 0;
        float radius = 6378137;
        private double tarPosLat;
        private double tarPosLon;
        private double tgtPosX;
        private double tgtPosY;

        public UpdateFollowmeSimLocationThread(DJIMission mission, double homeLat, double homeLng) {
            super();
            mDJIMission = mission;
            this.mHomeLatitude = homeLat;
            this.mHomeLongitude = homeLng;
        }

        @Override
        public void run() {
            if (
                    mDJIMission == null ||
                            mDJIMission.getMissionType() != DJIMission.DJIMissionType.Followme ||
                            !Utils.checkGpsCoordinate(mHomeLatitude, mHomeLongitude)
                    )
                return;
            mIsRunning = true;


            while (mIsRunning && clock < 1800) {
                tgtPosX = 5 * Math.sin(clock / 10 * 0.5);
                tgtPosY = 5 * Math.cos(clock / 10 * 0.5);
                tarPosLat = Utils.Radian(mHomeLatitude) + tgtPosX / radius;
                tarPosLon = Utils.Radian(mHomeLongitude) + tgtPosY  / radius / Math.cos(Utils.Radian(mHomeLatitude));
                DJIFollowMeMission.updateFollowMeCoordinate(
                        Utils.Degree(tarPosLat), Utils.Degree(tarPosLon), new DJIBaseComponent.DJICompletionCallback() {

                            @Override
                            public void onResult(DJIError error) {
                            }
                        });
                if (!mIsPausing)
                    clock ++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void stopRunning() {
            mIsRunning = false;
        }

        public void setIsPause(boolean isPaused) {
            mIsPausing = isPaused;
        }
    }
}
