<div class="article"><h1 ><font color="#AAA">class </font>Builder</h1></div>

~~~java
 static final class Builder 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The class is used to create the object of <code><a href="/Components/Missions/DJIWaypointV2Action_DJIWaypointV2Actuator.html#djiwaypointv2action_djiwaypointv2actuator">WaypointActuator</a></code>.



##### Class Members:

<div class="api-row" id="djiwaypointv2action_djiwaypointv2actuator_builder_setactuatortype"><div class="api-col left">Set Actuator Type</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2action_djiwaypointv2actuator_builder_setactuatortype_inline">setActuatorType</a></div></div><div class="inline-doc" id="djiwaypointv2action_djiwaypointv2actuator_builder_setactuatortype_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setActuatorType</h6></div>

~~~java
 Builder setActuatorType(ActionActuatorType actuatorType) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">Sets the <code>DJIWaypointV2Action_DJIWaypointV2Actuator_type</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actionactuatortype">ActionActuatorType</a> <font color="#000">actuatorType</td><td><font color="#666"><i>The value of missionID to set.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2Action_DJIWaypointV2Actuator_Builder.html#djiwaypointv2action_djiwaypointv2actuator_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2action_djiwaypointv2actuator_builder_setcameraactuatorparam"><div class="api-col left">Set Camera Actuator Param</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2action_djiwaypointv2actuator_builder_setcameraactuatorparam_inline">setCameraActuatorParam</a></div></div><div class="inline-doc" id="djiwaypointv2action_djiwaypointv2actuator_builder_setcameraactuatorparam_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCameraActuatorParam</h6></div>

~~~java
 Builder setCameraActuatorParam(WaypointCameraActuatorParam cameraActuatorParam) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">Sets the camera actuator param, it's only valid when <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actionactuatortype">ActionActuatorType</a></code> is <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actionactuatortype_camera">CAMERA</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2CameraActuatorParam.html#djiwaypointv2actuator_djiwaypointv2cameraactuatorparam">WaypointCameraActuatorParam</a> <font color="#000">cameraActuatorParam</td><td><font color="#666"><i>The object of <code><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2CameraActuatorParam.html#djiwaypointv2actuator_djiwaypointv2cameraactuatorparam">WaypointCameraActuatorParam</a></code>.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2Action_DJIWaypointV2Actuator_Builder.html#djiwaypointv2action_djiwaypointv2actuator_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2action_djiwaypointv2actuator_builder_setgimbalactuatorparam"><div class="api-col left">Set Gimbal Actuator Param</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2action_djiwaypointv2actuator_builder_setgimbalactuatorparam_inline">setGimbalActuatorParam</a></div></div><div class="inline-doc" id="djiwaypointv2action_djiwaypointv2actuator_builder_setgimbalactuatorparam_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setGimbalActuatorParam</h6></div>

~~~java
 Builder setGimbalActuatorParam(WaypointGimbalActuatorParam gimbalActuatorParam) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">Sets the gimbal actuator param, it's only valid when <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actionactuatortype">ActionActuatorType</a></code> is <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actionactuatortype_gimbal">GIMBAL</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2GimbalActuatorParam.html#djiwaypointv2actuator_djiwaypointv2gimbalactuatorparam">WaypointGimbalActuatorParam</a> <font color="#000">gimbalActuatorParam</td><td><font color="#666"><i>The object of <code><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2GimbalActuatorParam.html#djiwaypointv2actuator_djiwaypointv2gimbalactuatorparam">WaypointGimbalActuatorParam</a></code>.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2Action_DJIWaypointV2Actuator_Builder.html#djiwaypointv2action_djiwaypointv2actuator_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2action_djiwaypointv2actuator_builder_setaircraftcontrolactuatorparam"><div class="api-col left">Set Aircraft Control Actuator Param</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2action_djiwaypointv2actuator_builder_setaircraftcontrolactuatorparam_inline">setAircraftControlActuatorParam</a></div></div><div class="inline-doc" id="djiwaypointv2action_djiwaypointv2actuator_builder_setaircraftcontrolactuatorparam_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAircraftControlActuatorParam</h6></div>

~~~java
 Builder setAircraftControlActuatorParam(WaypointAircraftControlParam aircraftControlActuatorParam) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">Sets the aircraft actuator param, it's only valid when <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actionactuatortype">ActionActuatorType</a></code> is <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actionactuatortype_aircraftcontrol">AIRCRAFT_CONTROL</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2AircraftControlParam.html#djiwaypointv2actuator_djiwaypointv2aircraftcontrolparam">WaypointAircraftControlParam</a> <font color="#000">aircraftControlActuatorParam</td><td><font color="#666"><i>The object of <code><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2AircraftControlParam.html#djiwaypointv2actuator_djiwaypointv2aircraftcontrolparam">WaypointAircraftControlParam</a></code>.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2Action_DJIWaypointV2Actuator_Builder.html#djiwaypointv2action_djiwaypointv2actuator_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2action_djiwaypointv2actuator_builder_setactuatorindex"><div class="api-col left">Set Actuator Index</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2action_djiwaypointv2actuator_builder_setactuatorindex_inline">setActuatorIndex</a></div></div><div class="inline-doc" id="djiwaypointv2action_djiwaypointv2actuator_builder_setactuatorindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setActuatorIndex</h6></div>

~~~java
 Builder setActuatorIndex(int index) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">Sets the <code>DJIWaypointV2Action_DJIWaypointV2Actuator_actuatorIndex</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">index</td><td><font color="#666"><i>The actuator index.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2Action_DJIWaypointV2Actuator_Builder.html#djiwaypointv2action_djiwaypointv2actuator_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2action_djiwaypointv2actuator_builder_build"><div class="api-col left">Build</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2action_djiwaypointv2actuator_builder_build_inline">build</a></div></div><div class="inline-doc" id="djiwaypointv2action_djiwaypointv2actuator_builder_build_inline"

><div class="article"><h6 ><font color="#AAA">method </font>build</h6></div>

~~~java
 WaypointActuator build() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">Generates the immutable class.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2Action_DJIWaypointV2Actuator.html#djiwaypointv2action_djiwaypointv2actuator">WaypointActuator</a></td><td><font color="#666"><i>The object of <code><a href="/Components/Missions/DJIWaypointV2Action_DJIWaypointV2Actuator.html#djiwaypointv2action_djiwaypointv2actuator">WaypointActuator</a></code>.</i></td></tr></table></html></div>


