<div class="article"><h1 ><font color="#AAA">class </font>ActiveTrackMissionEvent</h1></div>

~~~java
@EXClassNullAway
 class ActiveTrackMissionEvent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">This class encapsulates all the state changes of the ActiveTrack mission operator.



##### Class Members:

<div class="api-row" id="djiactivetrackmissionevent_previousstate"><div class="api-col left">Previous State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionevent_previousstate_inline">getPreviousState</a></div></div><div class="inline-doc" id="djiactivetrackmissionevent_previousstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPreviousState</h6></div>

~~~java
 @Nullable ActiveTrackState getPreviousState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The previous state of the operator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate">ActiveTrackState</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate">ActiveTrackState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionevent_currentstate"><div class="api-col left">Current State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionevent_currentstate_inline">getCurrentState</a></div></div><div class="inline-doc" id="djiactivetrackmissionevent_currentstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrentState</h6></div>

~~~java
 @Nullable ActiveTrackState getCurrentState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The current state of the operator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate">ActiveTrackState</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate">ActiveTrackState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionevent_trackingstate"><div class="api-col left">Tracking State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionevent_trackingstate_inline">getTrackingState</a></div></div><div class="inline-doc" id="djiactivetrackmissionevent_trackingstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTrackingState</h6></div>

~~~java
 @Nullable ActiveTrackTrackingState getTrackingState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The tracking state of the executing ActiveTrack mission. It is only valid  when <code><a href="/Components/Missions/DJIActiveTrackMissionEvent.html#djiactivetrackmissionevent_currentstate">getCurrentState</a></code> is one of the following:   <ul> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_waitingforconfirmation">WAITING_FOR_CONFIRMATION</a></code> </li> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_cannotconfirm">CANNOT_CONFIRM</a></code> </li> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_aircraftfollowing">AIRCRAFT_FOLLOWING</a></code> </li> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_onlycamerafollowing">ONLY_CAMERA_FOLLOWING</a></code> </li> </ul> For the other states, it is <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Missions/DJIActiveTrackTrackingState.html#djiactivetracktrackingstate">ActiveTrackTrackingState</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIActiveTrackTrackingState.html#djiactivetracktrackingstate">ActiveTrackTrackingState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionevent_error"><div class="api-col left">Error</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionevent_error_inline">getError</a></div></div><div class="inline-doc" id="djiactivetrackmissionevent_error_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getError</h6></div>

~~~java
 @Nullable DJIError getError() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The encountered error if there is any. Otherwise, it is <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>An error of <code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code>.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiactivetrackmissionstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIActiveTrackMissionState.html">ActiveTrackState</a></div></div>
