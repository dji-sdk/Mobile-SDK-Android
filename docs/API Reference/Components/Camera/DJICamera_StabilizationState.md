<div class="article"><h1 ><font color="#AAA">class </font>StabilizationState</h1></div>

~~~java
@EXClassNullAway
 class StabilizationState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The state of the vision stabilization.



##### Class Members:

<div class="api-row" id="djicamera_stabilizationstate_constructor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_stabilizationstate_constructor_inline">StabilizationState</a></div></div><div class="inline-doc" id="djicamera_stabilizationstate_constructor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>StabilizationState</h6></div>

~~~java
 StabilizationState(boolean isActive, boolean isPaused, StabilizationPauseReason reason) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Constructor method for the StabilizationState.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isActive</td><td><font color="#666"><i>The stabilization is active or not.</i></td></tr><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isPaused</td><td><font color="#666"><i>The stabilization is paused or not.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_StabilizationState.html#djicamera_stabilizationstate_stabilizationpausereason">StabilizationPauseReason</a> <font color="#000">reason</td><td><font color="#666"><i>If paused, the reason on the pause.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_stabilizationstate_isactive"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_stabilizationstate_isactive_inline">isActive</a></div></div><div class="inline-doc" id="djicamera_stabilizationstate_isactive_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isActive</h6></div>

~~~java
 boolean isActive() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Check if the stabilization is active or not.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>YES if the stabilization is active.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_stabilizationstate_ispaused"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_stabilizationstate_ispaused_inline">isPaused</a></div></div><div class="inline-doc" id="djicamera_stabilizationstate_ispaused_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isPaused</h6></div>

~~~java
 boolean isPaused() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Check if the stabilization is paused or not.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>YES if the stabilization is paused.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_stabilizationstate_getpausereason"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_stabilizationstate_getpausereason_inline">getPauseReason</a></div></div><div class="inline-doc" id="djicamera_stabilizationstate_getpausereason_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPauseReason</h6></div>

~~~java
 StabilizationPauseReason getPauseReason() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Check if the stabilization is paused or not.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_StabilizationState.html#djicamera_stabilizationstate_stabilizationpausereason">StabilizationPauseReason</a></td><td><font color="#666"><i>YES if the stabilization is paused.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djicamera_stabilizationstate_stabilizationpausereason"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_stabilizationstate_stabilizationpausereason_inline">StabilizationPauseReason</a></div></div><div class="inline-doc" id="djicamera_stabilizationstate_stabilizationpausereason_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>StabilizationPauseReason</h6></div>

~~~java
 static enum StabilizationPauseReason 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The reason on the stabilization pause.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_stabilizationstate_stabilizationpausereason_uncharacteristic_inline"></a>UNCHARACTERISTIC</td><td><font color="#666">No characteristic.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_stabilizationstate_stabilizationpausereason_camera_changing_inline"></a>CAMERA_CHANGING</td><td><font color="#666">The camera is changing.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_stabilizationstate_stabilizationpausereason_gimbal_moving_inline"></a>GIMBAL_MOVING</td><td><font color="#666">The gimbal is moving.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_stabilizationstate_stabilizationpausereason_drone_moving_inline"></a>DRONE_MOVING</td><td><font color="#666">The drone is moving.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_stabilizationstate_stabilizationpausereason_tracking_inline"></a>TRACKING</td><td><font color="#666">In tracking mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_stabilizationstate_stabilizationpausereason_tap_go_inline"></a>TAP_GO</td><td><font color="#666">In Tap Go mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_stabilizationstate_stabilizationpausereason_other_inline"></a>OTHER</td><td><font color="#666">Other.</td></tr></table></html>

##### Class Members:

</div>


