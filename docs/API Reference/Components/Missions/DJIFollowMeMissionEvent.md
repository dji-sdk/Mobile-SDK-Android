<div class="article"><h1 ><font color="#AAA">class </font>FollowMeMissionEvent</h1></div>

~~~java
@EXClassNullAway
 class FollowMeMissionEvent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">This class encapsulates all the state change of the Follow Me mission operator.



##### Class Members:

<div class="api-row" id="djifollowmemissionevent_previousstate"><div class="api-col left">Previous State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djifollowmemissionevent_previousstate_inline">getPreviousState</a></div></div><div class="inline-doc" id="djifollowmemissionevent_previousstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPreviousState</h6></div>

~~~java
@Nullable
 FollowMeMissionState getPreviousState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">The previous follow me mission state, check the <code><a href="/Components/Missions/DJIFollowMeMissionState.html#djifollowmemissionstate">FollowMeMissionState</a></code> enum value.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIFollowMeMissionState.html#djifollowmemissionstate">FollowMeMissionState</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIFollowMeMissionState.html#djifollowmemissionstate">FollowMeMissionState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djifollowmemissionevent_currentstate"><div class="api-col left">Current State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djifollowmemissionevent_currentstate_inline">getCurrentState</a></div></div><div class="inline-doc" id="djifollowmemissionevent_currentstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrentState</h6></div>

~~~java
@NonNull
 FollowMeMissionState getCurrentState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">The current follow me mission state, check the <code><a href="/Components/Missions/DJIFollowMeMissionState.html#djifollowmemissionstate">FollowMeMissionState</a></code> enum value.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIFollowMeMissionState.html#djifollowmemissionstate">FollowMeMissionState</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIFollowMeMissionState.html#djifollowmemissionstate">FollowMeMissionState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djifollowmemissionevent_distancetotarget"><div class="api-col left">Distance to Target</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djifollowmemissionevent_distancetotarget_inline">getDistanceToTarget</a></div></div><div class="inline-doc" id="djifollowmemissionevent_distancetotarget_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDistanceToTarget</h6></div>

~~~java
 float getDistanceToTarget() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">Get the distance to the target.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of the distance to the target.</i></td></tr></table></html></div>

<div class="api-row" id="djifollowmemissionevent_error"><div class="api-col left">Error</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djifollowmemissionevent_error_inline">getError</a></div></div><div class="inline-doc" id="djifollowmemissionevent_error_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getError</h6></div>

~~~java
@Nullable
 DJIError getError() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">The encountered error if there is any. Otherwise, it is <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>An object of <code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code>.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djifollowmemissionstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIFollowMeMissionState.html">FollowMeMissionState</a></div></div>
