<div class="article"><h1 ><font color="#AAA">class </font>WaypointActuator</h1></div>

~~~java
 class WaypointActuator 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">This class defines an actuator for <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action">WaypointV2Action</a></code>. It determines how the action is  performed when a waypoint mission is executed.



##### Class Members:

<div class="api-row" id="djiwaypointv2action_djiwaypointv2actuator_type"><div class="api-col left">Type</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2action_djiwaypointv2actuator_type_inline">getActuatorType</a></div></div><div class="inline-doc" id="djiwaypointv2action_djiwaypointv2actuator_type_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getActuatorType</h6></div>

~~~java
 ActionActuatorType getActuatorType() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The type of actuator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actionactuatortype">ActionActuatorType</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actionactuatortype">ActionActuatorType</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2action_djiwaypointv2actuator_actuatorindex"><div class="api-col left">Actuator Index</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2action_djiwaypointv2actuator_actuatorindex_inline">getActuatorIndex</a></div></div><div class="inline-doc" id="djiwaypointv2action_djiwaypointv2actuator_actuatorindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getActuatorIndex</h6></div>

~~~java
 int getActuatorIndex() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The index of actuator. It is valid when the diagnostics is related to camera  or gimbal and the connected product has multiple gimbals and cameras.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of actuator index.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2action_djiwaypointv2actuator_cameraactuatorparam"><div class="api-col left">Camera Actuator Param</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2action_djiwaypointv2actuator_cameraactuatorparam_inline">getCameraActuatorParam</a></div></div><div class="inline-doc" id="djiwaypointv2action_djiwaypointv2actuator_cameraactuatorparam_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCameraActuatorParam</h6></div>

~~~java
 WaypointCameraActuatorParam getCameraActuatorParam() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The camera actuator param, It is valid only when the <code><a href="/Components/Missions/DJIWaypointV2Action_DJIWaypointV2Actuator.html#djiwaypointv2action_djiwaypointv2actuator_type">getActuatorType</a></code>  is <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actionactuatortype_camera">CAMERA</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2CameraActuatorParam.html#djiwaypointv2actuator_djiwaypointv2cameraactuatorparam">WaypointCameraActuatorParam</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2CameraActuatorParam.html#djiwaypointv2actuator_djiwaypointv2cameraactuatorparam">WaypointCameraActuatorParam</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2action_djiwaypointv2actuator_gimbalactuatorparam"><div class="api-col left">Gimbal Actuator Param</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2action_djiwaypointv2actuator_gimbalactuatorparam_inline">getGimbalActuatorParam</a></div></div><div class="inline-doc" id="djiwaypointv2action_djiwaypointv2actuator_gimbalactuatorparam_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getGimbalActuatorParam</h6></div>

~~~java
 WaypointGimbalActuatorParam getGimbalActuatorParam() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">Parameters for gimbal actuator. It is valid only when the <code><a href="/Components/Missions/DJIWaypointV2Action_DJIWaypointV2Actuator.html#djiwaypointv2action_djiwaypointv2actuator_type">getActuatorType</a></code>  is <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actionactuatortype_gimbal">GIMBAL</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2GimbalActuatorParam.html#djiwaypointv2actuator_djiwaypointv2gimbalactuatorparam">WaypointGimbalActuatorParam</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2GimbalActuatorParam.html#djiwaypointv2actuator_djiwaypointv2gimbalactuatorparam">WaypointGimbalActuatorParam</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2action_djiwaypointv2actuator_aircraftcontrolactuatorparam"><div class="api-col left">Aircraft Control Actuator Param</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2action_djiwaypointv2actuator_aircraftcontrolactuatorparam_inline">getAircraftControlActuatorParam</a></div></div><div class="inline-doc" id="djiwaypointv2action_djiwaypointv2actuator_aircraftcontrolactuatorparam_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAircraftControlActuatorParam</h6></div>

~~~java
 WaypointAircraftControlParam getAircraftControlActuatorParam() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">Parameters for aircraft control actuator. It is valid only when the <code><a href="/Components/Missions/DJIWaypointV2Action_DJIWaypointV2Actuator.html#djiwaypointv2action_djiwaypointv2actuator_type">getActuatorType</a></code>  is <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actionactuatortype_aircraftcontrol">AIRCRAFT_CONTROL</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2AircraftControlParam.html#djiwaypointv2actuator_djiwaypointv2aircraftcontrolparam">WaypointAircraftControlParam</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2GimbalActuatorParam.html#djiwaypointv2actuator_djiwaypointv2gimbalactuatorparam">WaypointGimbalActuatorParam</a></code>.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiwaypointv2actuator_djiwaypointv2gimbalactuatorparam"><div class="api-col left">Gimbal Actuator Param</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2GimbalActuatorParam.html">WaypointGimbalActuatorParam</a></div></div><div class="api-row" id="djiwaypointv2actuator_djiwaypointv2aircraftcontrolparam"><div class="api-col left">Aircraft Control Param</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2AircraftControlParam.html">WaypointAircraftControlParam</a></div></div><div class="api-row" id="djiwaypointv2actuator_djiwaypointv2cameraactuatorparam"><div class="api-col left">Camera Actuator Param</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2CameraActuatorParam.html">WaypointCameraActuatorParam</a></div></div><div class="api-row" id="djiwaypointv2action_djiwaypointv2actuator_builder"><div class="api-col left">Make Waypoint Actuator</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2Action_DJIWaypointV2Actuator_Builder.html">Builder</a></div></div>
