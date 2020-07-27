<div class="article"><h1 ><font color="#AAA">class </font>WaypointV2Action</h1></div>

~~~java
 class WaypointV2Action 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">This class represents an action for <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission">WaypointV2Mission</a></code>. It determines how action is performed when a waypoint mission is executed.



##### Class Members:

<div class="api-row" id="djiwaypointv2action_actionid"><div class="api-col left">Action ID</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2action_actionid_inline">getActionID</a></div></div><div class="inline-doc" id="djiwaypointv2action_actionid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getActionID</h6></div>

~~~java
 int getActionID() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The ID of Action.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of Action ID.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2action_trigger"><div class="api-col left">Trigger</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2action_trigger_inline">getTrigger</a></div></div><div class="inline-doc" id="djiwaypointv2action_trigger_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTrigger</h6></div>

~~~java
 WaypointTrigger getTrigger() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The trigger of action.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2Action_DJIWaypointV2Trigger.html#djiwaypointv2action_djiwaypointv2trigger">WaypointTrigger</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIWaypointV2Action_DJIWaypointV2Trigger.html#djiwaypointv2action_djiwaypointv2trigger">WaypointTrigger</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2action_actuator"><div class="api-col left">Actuator</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2action_actuator_inline">getActuator</a></div></div><div class="inline-doc" id="djiwaypointv2action_actuator_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getActuator</h6></div>

~~~java
 WaypointActuator getActuator() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The actuator of action.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2Action_DJIWaypointV2Actuator.html#djiwaypointv2action_djiwaypointv2actuator">WaypointActuator</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIWaypointV2Action_DJIWaypointV2Actuator.html#djiwaypointv2action_djiwaypointv2actuator">WaypointActuator</a></code>.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiwaypointv2action_builder"><div class="api-col left">Make Waypoint V2 Action</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2Action_Builder.html">Builder</a></div></div><div class="api-row" id="djiwaypointv2action_djiwaypointv2actuator"><div class="api-col left">Actuator</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2Action_DJIWaypointV2Actuator.html">WaypointActuator</a></div></div><div class="api-row" id="djiwaypointv2action_djiwaypointv2trigger"><div class="api-col left">Trigger</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2Action_DJIWaypointV2Trigger.html">WaypointTrigger</a></div></div><div class="api-row" id="djiwaypointv2actiondownloadprogressinterface"><div class="api-col left">Download Progress</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2ActionDownloadProgressInterface.html">ActionDownloadProgress</a></div></div><div class="api-row" id="djiwaypointv2actionexecutionprogressinterface"><div class="api-col left">Execution Progress</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2ActionExecutionProgressInterface.html">ActionExecutionProgress</a></div></div><div class="api-row" id="djiwaypointv2action_actiontypes"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2Action_ActionTypes.html">ActionTypes</a></div></div><div class="api-row" id="djiwaypointv2action_djiwaypointv2actionintervaltype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2action_djiwaypointv2actionintervaltype_inline">ActionIntervalType</a></div></div><div class="inline-doc" id="djiwaypointv2action_djiwaypointv2actionintervaltype_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ActionIntervalType</h6></div>

~~~java
 enum ActionIntervalType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The type of <code><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2IntervalTriggerParam.html#djiwaypointv2trigger_djiwaypointv2intervaltriggerparam">WaypointIntervalTriggerParam</a></code>,  Determines the interval type of how action repeats.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2action_djiwaypointv2actionintervaltype_distance_inline"></a>DISTANCE</td><td><font color="#666">The action will be repeated after a particular distance.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2action_djiwaypointv2actionintervaltype_time_inline"></a>TIME</td><td><font color="#666">The action will be repeated after a particular period of time.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2action_djiwaypointv2actionintervaltype_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown action trigger type.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiwaypointv2action_djiwaypointv2actiontriggertype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2action_djiwaypointv2actiontriggertype_inline">ActionTriggerType</a></div></div><div class="inline-doc" id="djiwaypointv2action_djiwaypointv2actiontriggertype_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ActionTriggerType</h6></div>

~~~java
 enum ActionTriggerType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">Possible types of action trigger.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2action_djiwaypointv2actiontriggertype_reachpoint_inline"></a>REACH_POINT</td><td><font color="#666">The action will be trigger when the aircraft reach the waypoint point. The parameters should be setting  by <code><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2ReachPointTriggerParam.html#djiwaypointv2trigger_djiwaypointv2reachpointtriggerparam">WaypointReachPointTriggerParam</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2action_djiwaypointv2actiontriggertype_actionassociated_inline"></a>ASSOCIATE</td><td><font color="#666">The action will be triggered when action associated executes. The parameters should be defined  by <code><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2AssociateTriggerParam.html#djiwaypointv2trigger_djiwaypointv2associatetriggerparam">WaypointV2AssociateTriggerParam</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2action_djiwaypointv2actiontriggertype_trajectory_inline"></a>TRAJECTORY</td><td><font color="#666">The action will be triggered when the aircraft flies from one waypoint to the next.  This trigger applies only to <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2actionactuatorgimbaloperationtype_aircraftcontrolgimbal">AIRCRAFT_CONTROL_GIMBAL</a></code>.  When this is triggered, the gimbal will rotate at a constant speed from the start waypoint index to the end waypoint index. The parameters should be defined by <code><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2TrajectoryTriggerParam.html#djiwaypointv2trigger_djiwaypointv2trajectorytriggerparam">WaypointTrajectoryTriggerParam</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2action_djiwaypointv2actiontriggertype_interval_inline"></a>SIMPLE_INTERVAL</td><td><font color="#666">The action will be triggered when the aircraft flies between two waypoints The parameters should be defined by <code><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2IntervalTriggerParam.html#djiwaypointv2trigger_djiwaypointv2intervaltriggerparam">WaypointIntervalTriggerParam</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2action_djiwaypointv2actiontriggertype_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiwaypointv2action_djiwaypointv2actionactuatortype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2action_djiwaypointv2actionactuatortype_inline">ActionActuatorType</a></div></div><div class="inline-doc" id="djiwaypointv2action_djiwaypointv2actionactuatortype_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ActionActuatorType</h6></div>

~~~java
 enum ActionActuatorType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">Possible types of action actuator.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2action_djiwaypointv2actionactuatortype_camera_inline"></a>CAMERA</td><td><font color="#666">The action will be executed by the camera. The parameters should be defined by <code><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2CameraActuatorParam.html#djiwaypointv2actuator_djiwaypointv2cameraactuatorparam">WaypointCameraActuatorParam</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2action_djiwaypointv2actionactuatortype_gimbal_inline"></a>GIMBAL</td><td><font color="#666">The action will be executed by the gimbal. The parameters should be defined by <code><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2GimbalActuatorParam.html#djiwaypointv2actuator_djiwaypointv2gimbalactuatorparam">WaypointGimbalActuatorParam</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2action_djiwaypointv2actionactuatortype_aircraftcontrol_inline"></a>AIRCRAFT_CONTROL</td><td><font color="#666">The action will executes by controlling aircraft. The parameters should be defined by <code><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2AircraftControlParam.html#djiwaypointv2actuator_djiwaypointv2aircraftcontrolparam">WaypointAircraftControlParam</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2action_djiwaypointv2actionactuatortype_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown actuator type.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiwaypointv2actionactuatorgimbaloperationtype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2actionactuatorgimbaloperationtype_inline">GimbalOperationType</a></div></div><div class="inline-doc" id="djiwaypointv2actionactuatorgimbaloperationtype_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>GimbalOperationType</h6></div>

~~~java
 enum GimbalOperationType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The type of gimbal actuator operation.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2actionactuatorgimbaloperationtype_rotategimbal_inline"></a>ROTATE_GIMBAL</td><td><font color="#666">Rotates the gimbal. Only valid when the trigger type is <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actiontriggertype_reachpoint">REACH_POINT</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2actionactuatorgimbaloperationtype_aircraftcontrolgimbal_inline"></a>AIRCRAFT_CONTROL_GIMBAL</td><td><font color="#666">Rotates the gimbal. Only valid when the trigger type is <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actiontriggertype_trajectory">TRAJECTORY</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2actionactuatorgimbaloperationtype_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiwaypointv2actionactuatorcameraoperationtype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2actionactuatorcameraoperationtype_inline">CameraOperationType</a></div></div><div class="inline-doc" id="djiwaypointv2actionactuatorcameraoperationtype_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>CameraOperationType</h6></div>

~~~java
 enum CameraOperationType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">Possible types of camera actuator operation.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2actionactuatorcameraoperationtype_takephoto_inline"></a>SHOOT_SINGLE_PHOTO</td><td><font color="#666">Starts to shoot a photo.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2actionactuatorcameraoperationtype_startrecordvideo_inline"></a>START_RECORD_VIDEO</td><td><font color="#666">Starts to record a video.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2actionactuatorcameraoperationtype_stoprecordvideo_inline"></a>STOP_RECORD_VIDEO</td><td><font color="#666">Stops to record a video.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2actionactuatorcameraoperationtype_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiwaypointv2actionactuatoraircraftcontroloperationtype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2actionactuatoraircraftcontroloperationtype_inline">AircraftControlType</a></div></div><div class="inline-doc" id="djiwaypointv2actionactuatoraircraftcontroloperationtype_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>AircraftControlType</h6></div>

~~~java
 enum AircraftControlType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">Possible types of aircraft control actuator operation.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2actionactuatoraircraftcontroloperationtype_rotateyaw_inline"></a>ROTATE_YAW</td><td><font color="#666">Rotates the aircraft's yaw.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2actionactuatoraircraftcontroloperationtype_flyingcontrol_inline"></a>START_STOP_FLY</td><td><font color="#666">Keeps the aircraft stop flying or start flying.</td></tr></table></html>

##### Class Members:

</div>


