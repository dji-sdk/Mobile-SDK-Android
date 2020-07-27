<div class="article"><h1 ><font color="#AAA">class </font>WaypointCameraZoomParam</h1></div>

~~~java
 class WaypointCameraZoomParam 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">This class defines a camera focal length operation for <code><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2CameraActuatorParam.html#djiwaypointv2actuator_djiwaypointv2cameraactuatorparam">WaypointCameraActuatorParam</a></code>.



##### Class Members:

<div class="api-row" id="djiwaypointv2cameraactuatorparam_djiwaypointv2camerafocallengthparam_focallength"><div class="api-col left">Operation Type</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2cameraactuatorparam_djiwaypointv2camerafocallengthparam_focallength_inline">getFocalLength</a></div></div><div class="inline-doc" id="djiwaypointv2cameraactuatorparam_djiwaypointv2camerafocallengthparam_focallength_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFocalLength</h6></div>

~~~java
 int getFocalLength() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">Focal length of zoom lens. Valid range is [<code><a href="/Components/Camera/DJICamera_DJICameraOpticalZoomSpec.html#djicamera_djicameraopticalzoomspec_minfocallength">getMinFocalLength</a></code>, <code><a href="/Components/Camera/DJICamera_DJICameraOpticalZoomSpec.html#djicamera_djicameraopticalzoomspec_minfocallength">getMinFocalLength</a></code>]  and must be a multiple of <code><a href="/Components/Camera/DJICamera_DJICameraOpticalZoomSpec.html#djicamera_djicameraopticalzoomspec_focallengthstep">getFocalLengthStep</a></code>. Only support by those camera <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_isopticalzoomsupported">isOpticalZoomSupported</a></code> return <code>true</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the zoom lens' focal length.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiwaypointv2cameraactuatorparam_djiwaypointv2camerafocallengthparam_builder"><div class="api-col left">Builder</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2CameraActuatorParam_DJIWaypointV2CameraFocalLengthParam_Builder.html">Builder</a></div></div>
