<div class="article"><h1 ><font color="#AAA">class </font>HotpointMissionEvent</h1></div>

~~~java
@EXClassNullAway
 class HotpointMissionEvent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">This class encapsulates all the state changes of the Hotpoint mission operator.



##### Class Members:

<div class="api-row" id="djihotpointmissionevent_previousstate"><div class="api-col left">Previous State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionevent_previousstate_inline">getPreviousState</a></div></div><div class="inline-doc" id="djihotpointmissionevent_previousstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPreviousState</h6></div>

~~~java
@Nullable
 HotpointMissionState getPreviousState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">The previous state of the operator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate">HotpointMissionState</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate">HotpointMissionState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmissionevent_currentstate"><div class="api-col left">Current State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionevent_currentstate_inline">getCurrentState</a></div></div><div class="inline-doc" id="djihotpointmissionevent_currentstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrentState</h6></div>

~~~java
@NonNull
 HotpointMissionState getCurrentState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">The current state of the operator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate">HotpointMissionState</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate">HotpointMissionState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmissionevent_radius"><div class="api-col left">Radius</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionevent_radius_inline">getRadius</a></div></div><div class="inline-doc" id="djihotpointmissionevent_radius_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRadius</h6></div>

~~~java
 float getRadius() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">The Hotpoint radius in meters of the mission. If there is no executing mission, it is 0.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of radius.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmissionevent_maxangularvelocity"><div class="api-col left">Angular Velocity</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionevent_maxangularvelocity_inline">getMaxAngularVelocity</a></div></div><div class="inline-doc" id="djihotpointmissionevent_maxangularvelocity_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMaxAngularVelocity</h6></div>

~~~java
 float getMaxAngularVelocity() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">The Hotpoint max angular velocity from current radius.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of velocity.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmissionevent_error"><div class="api-col left">Error</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionevent_error_inline">getError</a></div></div><div class="inline-doc" id="djihotpointmissionevent_error_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getError</h6></div>

~~~java
@Nullable
 DJIError getError() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">The encountered error if there is any. Otherwise, it is <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>A object of <code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code>.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djihotpointmissionstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIHotpointMissionState.html">HotpointMissionState</a></div></div>
