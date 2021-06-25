package com.dji.sdk.sample.demo.missionoperator.util;

import android.graphics.PointF;

import java.util.ArrayList;
import java.util.List;

import dji.common.gimbal.Rotation;
import dji.common.gimbal.RotationMode;
import dji.common.mission.waypointv2.Action.ActionTypes;
import dji.common.mission.waypointv2.Action.CameraFocusMode;
import dji.common.mission.waypointv2.Action.CameraFocusRegionType;
import dji.common.mission.waypointv2.Action.WaypointActuator;
import dji.common.mission.waypointv2.Action.WaypointAircraftControlParam;
import dji.common.mission.waypointv2.Action.WaypointAircraftControlStartStopFlyParam;
import dji.common.mission.waypointv2.Action.WaypointCameraActuatorParam;
import dji.common.mission.waypointv2.Action.WaypointCameraFocusModeParam;
import dji.common.mission.waypointv2.Action.WaypointCameraFocusParam;
import dji.common.mission.waypointv2.Action.WaypointCameraFocusRectangleTargetParam;
import dji.common.mission.waypointv2.Action.WaypointGimbalActuatorParam;
import dji.common.mission.waypointv2.Action.WaypointGimbalPathPointInfo;
import dji.common.mission.waypointv2.Action.WaypointGimbalPathShooting;
import dji.common.mission.waypointv2.Action.WaypointGimbalStartPathShootingParam;
import dji.common.mission.waypointv2.Action.WaypointGimbalStopPathShootingParam;
import dji.common.mission.waypointv2.Action.WaypointIntervalTriggerParam;
import dji.common.mission.waypointv2.Action.WaypointReachPointTriggerParam;
import dji.common.mission.waypointv2.Action.WaypointTrajectoryTriggerParam;
import dji.common.mission.waypointv2.Action.WaypointTrigger;
import dji.common.mission.waypointv2.Action.WaypointV2AssociateTriggerParam;

public class ActionUtils {

    public static WaypointTrigger getSimpleReachPointTrigger(int index) {
        return new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.REACH_POINT)
                .setReachPointParam(new WaypointReachPointTriggerParam.Builder()
                        .setStartIndex(index)
                        .build())
                .build();
    }

    public static WaypointTrigger getTrajectoryTrigger(int startIndex, int endIndex) {
        return new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.TRAJECTORY)
                .setTrajectoryParam(new WaypointTrajectoryTriggerParam.Builder()
                        .setStartIndex(startIndex)
                        .setEndIndex(endIndex)
                        .build())
                .build();

    }

    public static WaypointTrigger getTimeIntervalTrigger(int pointIndex, float time) {
        return new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.SIMPLE_INTERVAL)
                .setIntervalTriggerParam(new WaypointIntervalTriggerParam.Builder()
                        .setStartIndex(pointIndex)
                        .setType(ActionTypes.ActionIntervalType.TIME)
                        .setInterval(time)
                        .build()
                )
                .build();
    }

    public static WaypointTrigger getDistanceIntervalTrigger(int pointIndex, float distance) {
        return new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.SIMPLE_INTERVAL)
                .setIntervalTriggerParam(new WaypointIntervalTriggerParam.Builder()
                        .setStartIndex(pointIndex)
                        .setType(ActionTypes.ActionIntervalType.DISTANCE)
                        .setInterval(distance)
                        .build()
                )
                .build();
    }

    public static WaypointTrigger getSerialTrigger(int actionIndex) {
        return new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.ASSOCIATE)
                .setAssociateParam(new WaypointV2AssociateTriggerParam.Builder()
                        .setAssociateActionID(actionIndex)
                        .setAssociateType(ActionTypes.AssociatedTimingType.AFTER_FINISHED)
                        .build())
                .build();
    }

    public static WaypointTrigger getSerialWaitTrigger(int actionIndex, float waitTime) {
        return new WaypointTrigger.Builder()
                .setTriggerType(ActionTypes.ActionTriggerType.ASSOCIATE)
                .setAssociateParam(new WaypointV2AssociateTriggerParam.Builder()
                        .setAssociateActionID(actionIndex)
                        .setAssociateType(ActionTypes.AssociatedTimingType.AFTER_FINISHED)
                        .setWaitingTime(waitTime)
                        .build())
                .build();
    }

    public static WaypointActuator getStayActuator() {
        return new WaypointActuator.Builder()
                .setActuatorType(ActionTypes.ActionActuatorType.AIRCRAFT_CONTROL)
                .setAircraftControlActuatorParam(new WaypointAircraftControlParam.Builder()
                        .setAircraftControlType(ActionTypes.AircraftControlType.START_STOP_FLY)
                        .setFlyControlParam(new WaypointAircraftControlStartStopFlyParam.Builder().setStartFly(false).build())
                        .build())
                .build();
    }

    public static WaypointActuator getStayStartActuator() {
        return new WaypointActuator.Builder()
                .setActuatorType(ActionTypes.ActionActuatorType.AIRCRAFT_CONTROL)
                .setAircraftControlActuatorParam(new WaypointAircraftControlParam.Builder()
                        .setAircraftControlType(ActionTypes.AircraftControlType.START_STOP_FLY)
                        .setFlyControlParam(new WaypointAircraftControlStartStopFlyParam.Builder().setStartFly(true).build())
                        .build())
                .build();
    }

    public static WaypointActuator getGimbalActuator(float pitch, int gimbalIndex) {
        Rotation rotaion = new Rotation.Builder()
                .pitch(pitch)
                .time(2)
                .mode(RotationMode.RELATIVE_ANGLE)
                .build();
        return new WaypointActuator.Builder()
                .setActuatorType(ActionTypes.ActionActuatorType.GIMBAL)
                .setActuatorIndex(gimbalIndex)
                .setGimbalActuatorParam(new WaypointGimbalActuatorParam.Builder()
                        .rotation(rotaion)
                        .operationType(ActionTypes.GimbalOperationType.ROTATE_GIMBAL)
                        .build()
                )
                .build();
    }

    public static WaypointActuator getCameraFocusModeActuator(CameraFocusMode mode, int cameraIndex) {
        return new WaypointActuator.Builder()
                .setActuatorType(ActionTypes.ActionActuatorType.CAMERA)
                .setActuatorIndex(cameraIndex)
                .setCameraActuatorParam(new WaypointCameraActuatorParam.Builder()
                        .setCameraOperationType(ActionTypes.CameraOperationType.FOCUS_MODE)
                        .setFocusModeParam(WaypointCameraFocusModeParam.Builder.newBuilder().cameraFocusMode(mode).build())
                        .build())
                .build();
    }

    public static WaypointActuator getCameraRectFocusActuator(int cameraIndex) {
        return new WaypointActuator.Builder()
                .setActuatorType(ActionTypes.ActionActuatorType.CAMERA)
                .setActuatorIndex(cameraIndex)
                .setCameraActuatorParam(new WaypointCameraActuatorParam.Builder()
                        .setCameraOperationType(ActionTypes.CameraOperationType.FOCUS)
                        .setFocusParam(new WaypointCameraFocusParam.Builder()
                                .setCameraFocusRegionType(CameraFocusRegionType.RECTANGLE)
                                .waypointCameraFocusRectangleTargetParam(new WaypointCameraFocusRectangleTargetParam.Builder()
                                        .referencePoint(new PointF(0.25f, 0.25f))
                                .width(0.5f)
                                .height(0.5f)
                                .build())
                                .build())
                        .build())
                .build();
    }

    public static WaypointActuator getStartPathShootingActuator(int cameraIndex, int gimbalPitch, ActionTypes.GimbalPathCycleMode cycleMode) {
        List<WaypointGimbalPathPointInfo> pointInfos = new ArrayList<>();
        pointInfos.add(new WaypointGimbalPathPointInfo.Builder().stayTime(0).eulerPitch(gimbalPitch).build());
        pointInfos.add(new WaypointGimbalPathPointInfo.Builder().stayTime(0).eulerPitch(-90).eulerRoll(90 + gimbalPitch).build());
        pointInfos.add(new WaypointGimbalPathPointInfo.Builder().stayTime(0).eulerPitch(-180 - gimbalPitch).build());
        pointInfos.add(new WaypointGimbalPathPointInfo.Builder().stayTime(0).eulerPitch(-90).eulerRoll(-(90 + gimbalPitch)).build());
        pointInfos.add(new WaypointGimbalPathPointInfo.Builder().stayTime(0).eulerPitch(-90).build());
        return new WaypointActuator.Builder()
                .setActuatorType(ActionTypes.ActionActuatorType.GIMBAL)
                .setActuatorIndex(cameraIndex)
                .setGimbalActuatorParam(new WaypointGimbalActuatorParam.Builder()
                        .operationType(ActionTypes.GimbalOperationType.PATH_SHOOTING)
                        .pathShooting(new WaypointGimbalPathShooting.Builder().startPathShooting(
                                new WaypointGimbalStartPathShootingParam.Builder()
                                        .pathCycleMode(cycleMode)
                                        .pointNum(pointInfos.size())
                                        .pointInfo(pointInfos)
                                        .build())
                                .pathShootingType(ActionTypes.GimbalPathShootingType.START_PATH_SHOOTING)
                                .build())
                        .build())
                .build();
    }

    public static WaypointActuator getStopPathShootingActuator(int cameraIndex, ActionTypes.GimbalPathCycleMode cycleMode) {

        return new WaypointActuator.Builder()
                .setActuatorType(ActionTypes.ActionActuatorType.GIMBAL)
                .setActuatorIndex(cameraIndex)
                .setGimbalActuatorParam(new WaypointGimbalActuatorParam.Builder()
                        .operationType(ActionTypes.GimbalOperationType.PATH_SHOOTING)
                        .pathShooting(new WaypointGimbalPathShooting.Builder().stopPathShooting(
                                new WaypointGimbalStopPathShootingParam.Builder()
                                        .pathCycleMode(cycleMode)
                                        .build())
                                .pathShootingType(ActionTypes.GimbalPathShootingType.STOP_PATH_SHOOTING)
                                .build()
                        ).build()).build();
    }
}
