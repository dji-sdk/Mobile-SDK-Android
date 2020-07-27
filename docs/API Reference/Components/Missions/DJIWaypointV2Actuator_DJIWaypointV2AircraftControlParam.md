<div class="article"><h1 ><font color="#AAA">class </font>WaypointAircraftControlParam</h1></div>

~~~java
 class WaypointAircraftControlParam 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">This class defines the parameters for <code><a href="/Components/Missions/DJIWaypointV2Action_DJIWaypointV2Actuator.html#djiwaypointv2action_djiwaypointv2actuator">WaypointActuator</a></code>. It determines how the  aircraft control actuator will be performed when a waypoint mission is executed.



##### Class Members:

<div class="api-row" id="djiwaypointv2actuator_djiwaypointv2aircraftcontrolparam_operationtype"><div class="api-col left">Operation Type</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2actuator_djiwaypointv2aircraftcontrolparam_operationtype_inline">getAircraftControlType</a></div></div><div class="inline-doc" id="djiwaypointv2actuator_djiwaypointv2aircraftcontrolparam_operationtype_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAircraftControlType</h6></div>

~~~java
 ActionTypes.AircraftControlType getAircraftControlType() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The operation type of aircraft control actuator. See <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2actionactuatoraircraftcontroloperationtype">AircraftControlType</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2Action_ActionTypes.html#djiwaypointv2action_actiontypes">ActionTypes</a>.<a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2actionactuatoraircraftcontroloperationtype">AircraftControlType</a></td><td><font color="#666"><i>A value of <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2actionactuatoraircraftcontroloperationtype">AircraftControlType</a></code> enum.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2actuator_djiwaypointv2aircraftcontrolparam_yawrotatingparam"><div class="api-col left">Yaw Rotating Param</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2actuator_djiwaypointv2aircraftcontrolparam_yawrotatingparam_inline">getRotateYawParam</a></div></div><div class="inline-doc" id="djiwaypointv2actuator_djiwaypointv2aircraftcontrolparam_yawrotatingparam_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRotateYawParam</h6></div>

~~~java
 WaypointAircraftControlRotateYawParam getRotateYawParam() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The parameter for rotating the aircraft's heading. It's valid only when <code><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2AircraftControlParam.html#djiwaypointv2actuator_djiwaypointv2aircraftcontrolparam_operationtype">getAircraftControlType</a></code>  is <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2actionactuatoraircraftcontroloperationtype_rotateyaw">ROTATE_YAW</a></code>



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2AircraftControlParam_DJIWaypointV2AircraftControlRotateHeadingParam.html#djiwaypointv2aircraftcontrolparam_djiwaypointv2aircraftcontrolrotateheadingparam">WaypointAircraftControlRotateYawParam</a></td><td><font color="#666"><i>The object of <code><a href="/Components/Missions/DJIWaypointV2AircraftControlParam_DJIWaypointV2AircraftControlRotateHeadingParam.html#djiwaypointv2aircraftcontrolparam_djiwaypointv2aircraftcontrolrotateheadingparam">WaypointAircraftControlRotateYawParam</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2actuator_djiwaypointv2aircraftcontrolparam_flycontrolparam"><div class="api-col left">Fly Control Param</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2actuator_djiwaypointv2aircraftcontrolparam_flycontrolparam_inline">getFlyControlParam</a></div></div><div class="inline-doc" id="djiwaypointv2actuator_djiwaypointv2aircraftcontrolparam_flycontrolparam_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlyControlParam</h6></div>

~~~java
 WaypointAircraftControlStartStopFlyParam getFlyControlParam() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The parameters to control flying behavior.  It's valid only when <code><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2AircraftControlParam.html#djiwaypointv2actuator_djiwaypointv2aircraftcontrolparam_operationtype">getAircraftControlType</a></code>  is <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2actionactuatoraircraftcontroloperationtype_flyingcontrol">START_STOP_FLY</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2AircraftControlParam_DJIWaypointV2AircraftControlFlyingParam.html#djiwaypointv2aircraftcontrolparam_djiwaypointv2aircraftcontrolflyingparam">WaypointAircraftControlStartStopFlyParam</a></td><td><font color="#666"><i>The object of <code><a href="/Components/Missions/DJIWaypointV2AircraftControlParam_DJIWaypointV2AircraftControlFlyingParam.html#djiwaypointv2aircraftcontrolparam_djiwaypointv2aircraftcontrolflyingparam">WaypointAircraftControlStartStopFlyParam</a></code>.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiwaypointv2actuator_djiwaypointv2aircraftcontrolparam_builder"><div class="api-col left">Make Aircraft Control Param</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2AircraftControlParam_Builder.html">Builder</a></div></div><div class="api-row" id="djiwaypointv2aircraftcontrolparam_djiwaypointv2aircraftcontrolflyingparam"><div class="api-col left">Aircraft Control Flying Param</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2AircraftControlParam_DJIWaypointV2AircraftControlFlyingParam.html">WaypointAircraftControlStartStopFlyParam</a></div></div><div class="api-row" id="djiwaypointv2aircraftcontrolparam_djiwaypointv2aircraftcontrolrotateheadingparam"><div class="api-col left">Aircraft Control Rotate Heading Param</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2AircraftControlParam_DJIWaypointV2AircraftControlRotateHeadingParam.html">WaypointAircraftControlRotateYawParam</a></div></div>
