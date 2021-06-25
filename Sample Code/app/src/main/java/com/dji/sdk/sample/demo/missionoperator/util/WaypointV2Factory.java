package com.dji.sdk.sample.demo.missionoperator.util;

import java.util.ArrayList;
import java.util.List;

import dji.common.mission.waypointv2.Action.CameraFocusMode;
import dji.common.mission.waypointv2.Action.WaypointActuator;
import dji.common.mission.waypointv2.Action.WaypointTrigger;
import dji.common.mission.waypointv2.Action.WaypointV2Action;

public class WaypointV2Factory {

    public static WaypointV2Action getAction(WaypointTrigger trigger, int actionId, WaypointActuator actuator) {
        return new WaypointV2Action.Builder()
                .setTrigger(trigger)
                .setActionID(actionId)
                .setActuator(actuator)
                .build();
    }

    public static WaypointV2Action getStopFlyAction(int pointIndex, int actionId) {
        return getAction(ActionUtils.getSimpleReachPointTrigger(pointIndex), actionId, ActionUtils.getStayActuator());
    }

    public static WaypointV2Action getSerialAction(int preActionId, int actionId, WaypointActuator actuator) {
        return getAction(ActionUtils.getSerialTrigger(preActionId), actionId, actuator);
    }

    public static WaypointV2Action getSerialDelayAction(int preActionId, int actionId, float delayTime, WaypointActuator actuator) {
        return getAction(ActionUtils.getSerialWaitTrigger(preActionId, delayTime), actionId, actuator);
    }

    public static List<WaypointV2Action> addActiveFocusAction(int pointIndex, int actionId, float gimbalPitch) {
        final List<WaypointV2Action> actions = new ArrayList<>();
        int id = actionId;
        actions.add(getStopFlyAction(pointIndex, id));
        actions.add(getSerialAction(id, ++id, ActionUtils.getGimbalActuator(-90, 0)));
        actions.add(getSerialDelayAction(id, ++id, 1f, ActionUtils.getCameraFocusModeActuator(CameraFocusMode.AUTO, 0)));
        actions.add(getSerialDelayAction(id, ++id, 0.5f, ActionUtils.getCameraRectFocusActuator(0)));
        actions.add(getSerialDelayAction(id, ++id, 1f, ActionUtils.getCameraFocusModeActuator(CameraFocusMode.MANUAL, 0)));
        actions.add(getSerialAction(id, ++id, ActionUtils.getGimbalActuator(gimbalPitch, 0)));
        actions.add(getSerialDelayAction(id, ++id, 2f, ActionUtils.getStayStartActuator()));
        return actions;
    }
}
