package com.dji.sdk.sample.missionmanager;

import android.content.Context;
import android.util.AttributeSet;

import com.dji.sdk.sample.common.Utils;

import dji.common.error.DJIError;
import dji.sdk.missionmanager.DJICustomMission;
import dji.sdk.missionmanager.DJIFollowMeMission;
import dji.sdk.missionmanager.DJIHotPointMission;
import dji.sdk.missionmanager.DJIMission;
import dji.sdk.missionmanager.DJIPanoramaMission;
import dji.sdk.missionmanager.DJIMission;

/**
 * Class for hot point mission.
 */
public class HotpointMissionView extends MissionManagerBaseView {

    public HotpointMissionView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected DJIMission initMission() {
        if (!Utils.checkGpsCoordinate(mHomeLatitude, mHomeLongitude)) {
            Utils.setResultToToast(mContext, "No home point!!!");
            return null;
        }
        DJIHotPointMission hotPointMission = new DJIHotPointMission(mHomeLatitude, mHomeLongitude);
        hotPointMission.altitude = 20;
        return hotPointMission;
    }

    @Override
    public void missionProgressStatus(DJIMission.DJIMissionProgressStatus progressStatus) {
        if (progressStatus == null) {
            return;
        }
        pushSB = new StringBuffer();
        if (progressStatus instanceof DJIHotPointMission.DJIHotPointMissionStatus) {

            Utils.addLineToSB(pushSB, "Radius", ((DJIHotPointMission.DJIHotPointMissionStatus) progressStatus).getCurrentDistanceToHotpoint());
            Utils.addLineToSB(pushSB, "Execute state", ((DJIHotPointMission.DJIHotPointMissionStatus) progressStatus).getExecutionState().name());
            DJIError err = progressStatus.getError();
            Utils.addLineToSB(pushSB, "Mission status", err == null ? "Normal" : err.getDescription());

        } else if (
                progressStatus instanceof DJIFollowMeMission.DJIFollowMeMissionStatus ||
                        progressStatus instanceof DJIHotPointMission.DJIHotPointMissionStatus ||
                        progressStatus instanceof DJIPanoramaMission.DJIPanoramaMissionStatus ||
                        progressStatus instanceof DJICustomMission.DJICustomMissionProgressStatus
                ) {
            Utils.addLineToSB(pushSB, null, "Received " + progressStatus.getClass().getSimpleName());
        } else {
            DJIError err = progressStatus.getError();
            Utils.addLineToSB(pushSB, "Previous mission result", err == null ? "Success" : err.getDescription());
        }
        Utils.setResultToText(mContext, mMissionPushInfoTV, pushSB.toString());
    }
}
