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
import dji.sdk.missionmanager.DJIWaypointMission;
import dji.sdk.missionmanager.DJIMission;

/**
 * Class for Osmo full circle panorama mission.
 */
public class FullCirclePanoramaMissionView extends MissionManagerBaseView {

    public FullCirclePanoramaMissionView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected DJIMission initMission() {
        return new DJIPanoramaMission(DJIPanoramaMission.DJIPanoramaMode.FullCircle);
    }

    @Override
    public void missionProgressStatus(DJIMission.DJIMissionProgressStatus progressStatus) {
        if (progressStatus == null) {
            return;
        }
        pushSB = new StringBuffer();
        if (progressStatus instanceof DJIPanoramaMission.DJIPanoramaMissionStatus) {

            Utils.addLineToSB(pushSB, "Total capture num", ((DJIPanoramaMission.DJIPanoramaMissionStatus) progressStatus).getTotalNumber());
            Utils.addLineToSB(pushSB, "Current taken num", ((DJIPanoramaMission.DJIPanoramaMissionStatus) progressStatus).getCurrentShotNumber());
            Utils.addLineToSB(pushSB, "Current saved num", ((DJIPanoramaMission.DJIPanoramaMissionStatus) progressStatus).getCurrentSavedNumber());
            DJIError err = progressStatus.getError();
            Utils.addLineToSB(pushSB, "Mission status", err == null ? "Normal" : err.getDescription());

        }
        else if (
                progressStatus instanceof DJIWaypointMission.DJIWaypointMissionStatus ||
                        progressStatus instanceof DJIHotPointMission.DJIHotPointMissionStatus ||
                        progressStatus instanceof DJIFollowMeMission.DJIFollowMeMissionStatus ||
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
