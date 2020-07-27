<div class="article"><h1 ><font color="#AAA">class </font>WaypointCameraFocusParam</h1></div>

~~~java
 class WaypointCameraFocusParam 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">This class defines a camera focus operation for <code><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2CameraActuatorParam.html#djiwaypointv2actuator_djiwaypointv2cameraactuatorparam">WaypointCameraActuatorParam</a></code>.



##### Class Members:

<div class="api-row" id="djiwaypointv2cameraactuatorparam_djiwaypointv2camerafocusparam_focustarget"><div class="api-col left">Focus Target</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2cameraactuatorparam_djiwaypointv2camerafocusparam_focustarget_inline">getFocusTarget</a></div></div><div class="inline-doc" id="djiwaypointv2cameraactuatorparam_djiwaypointv2camerafocusparam_focustarget_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFocusTarget</h6></div>

~~~java
 PointF getFocusTarget() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The lens focus target point. When the focus mode is auto, the target point is the focal point. When the focus mode is manual, the target point is the zoom out area if the focus assistant  is enabled for the manual mode. The range for x and y is from 0.0 to 1.0. The point [0.0, 0.0] represents the top-left angle of the screen.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">PointF</td><td><font color="#666"><i>An object of PointF.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiwaypointv2cameraactuatorparam_djiwaypointv2camerafocusparam_builder"><div class="api-col left">Constructor</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2CameraActuatorParam_DJIWaypointV2CameraFocusParam_Builder.html">Builder</a></div></div>
