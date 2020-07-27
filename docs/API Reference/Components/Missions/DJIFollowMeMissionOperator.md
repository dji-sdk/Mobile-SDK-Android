<div class="article"><h1 ><font color="#AAA">class </font>FollowMeMissionOperator</h1></div>

~~~java
 class FollowMeMissionOperator 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">The follow me mission operator is the only object that controls, runs and monitors FollowMe Missions. It can be accessed from <code><a href="/Components/Missions/DJIMissionControl.html#djimissioncontrol">MissionControl</a></code>.



##### Class Members:

<div class="api-row" id="djifollowmemissionoperator_currentstate"><div class="api-col left">Current State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djifollowmemissionoperator_currentstate_inline">getCurrentState</a></div></div><div class="inline-doc" id="djifollowmemissionoperator_currentstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrentState</h6></div>

~~~java
@NonNull
 FollowMeMissionState getCurrentState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">The current state of the executing Follow Me mission.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIFollowMeMissionState.html#djifollowmemissionstate">FollowMeMissionState</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIFollowMeMissionState.html#djifollowmemissionstate">FollowMeMissionState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djifollowmemissionoperator_addlistener"><div class="api-col left">Add Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djifollowmemissionoperator_addlistener_inline">addListener</a></div></div><div class="inline-doc" id="djifollowmemissionoperator_addlistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addListener</h6></div>

~~~java
 void addListener(@NonNull FollowMeMissionOperatorListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">Adds a new listener of all events.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIFollowMeMissionOperatorListener.html#djifollowmemissionoperatorlistener">FollowMeMissionOperatorListener</a> <font color="#000">listener</td><td><font color="#666"><i>An interface of <code><a href="/Components/Missions/DJIFollowMeMissionOperatorListener.html#djifollowmemissionoperatorlistener">FollowMeMissionOperatorListener</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djifollowmemissionoperator_removelistener"><div class="api-col left">Remove Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djifollowmemissionoperator_removelistener_inline">removeListener</a></div></div><div class="inline-doc" id="djifollowmemissionoperator_removelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeListener</h6></div>

~~~java
 void removeListener(@NonNull FollowMeMissionOperatorListener targetListener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">Removes listener. 



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIFollowMeMissionOperatorListener.html#djifollowmemissionoperatorlistener">FollowMeMissionOperatorListener</a> <font color="#000">targetListener</td><td><font color="#666"><i>An interface of <code><a href="/Components/Missions/DJIFollowMeMissionOperatorListener.html#djifollowmemissionoperatorlistener">FollowMeMissionOperatorListener</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djifollowmemissionoperator_removealllisteners"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djifollowmemissionoperator_removealllisteners_inline">removeAllListeners</a></div></div><div class="inline-doc" id="djifollowmemissionoperator_removealllisteners_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeAllListeners</h6></div>

~~~java
 void removeAllListeners() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">Remove all listeners.

</div>

<div class="api-row" id="djifollowmemissionoperator_startmission"><div class="api-col left">Start Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djifollowmemissionoperator_startmission_inline">startMission</a></div></div><div class="inline-doc" id="djifollowmemissionoperator_startmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startMission</h6></div>

~~~java
 void startMission(@NonNull final FollowMeMission mission, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">Starts to execute a Follow Me mission. It can only be called when the  <code><a href="/Components/Missions/DJIFollowMeMissionOperator.html#djifollowmemissionoperator_currentstate">getCurrentState</a></code> is  <code><a href="/Components/Missions/DJIFollowMeMissionState.html#djifollowmemissionstate_readytostart">READY_TO_EXECUTE</a></code>. After a mission is started  successfully, the <code><a href="/Components/Missions/DJIFollowMeMissionOperator.html#djifollowmemissionoperator_currentstate">getCurrentState</a></code> will become  <code><a href="/Components/Missions/DJIFollowMeMissionState.html#djifollowmemissionstate_executing">EXECUTING</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Components/Missions/DJIFollowMeMission.html#djifollowmemission">FollowMeMission</a> <font color="#000">mission</td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIFollowMeMission.html#djifollowmemission">FollowMeMission</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djifollowmemissionoperator_stopmission"><div class="api-col left">Stop Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djifollowmemissionoperator_stopmission_inline">stopMission</a></div></div><div class="inline-doc" id="djifollowmemissionoperator_stopmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopMission</h6></div>

~~~java
 void stopMission(@Nullable CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">Stops the executing mission. It can only be called when the  <code><a href="/Components/Missions/DJIFollowMeMissionOperator.html#djifollowmemissionoperator_currentstate">getCurrentState</a></code> is  <code><a href="/Components/Missions/DJIFollowMeMissionState.html#djifollowmemissionstate_executing">EXECUTING</a></code>. After a mission is stopped successfully,  <code><a href="/Components/Missions/DJIFollowMeMissionOperator.html#djifollowmemissionoperator_currentstate">getCurrentState</a></code> will become  <code><a href="/Components/Missions/DJIFollowMeMissionState.html#djifollowmemissionstate_readytostart">READY_TO_EXECUTE</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djifollowmemissionoperator_updatefollowingtarget"><div class="api-col left">Target</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djifollowmemissionoperator_updatefollowingtarget_inline">updateFollowingTarget</a></div></div><div class="inline-doc" id="djifollowmemissionoperator_updatefollowingtarget_inline"

><div class="article"><h6 ><font color="#AAA">method </font>updateFollowingTarget</h6></div>

~~~java
 void updateFollowingTarget(@NonNull LocationCoordinate2D location,
                                      @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">Update the Follow Me mission's target location to follow.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a> <font color="#000">location</td><td><font color="#666"><i>A LocationCoordinate2D object.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djifollowmemissionoperator_getfollowingtarget"><div class="api-col left">Get Following Target</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djifollowmemissionoperator_getfollowingtarget_inline">getFollowingTarget</a></div></div><div class="inline-doc" id="djifollowmemissionoperator_getfollowingtarget_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFollowingTarget</h6></div>

~~~java
@NonNull
 LocationCoordinate2D getFollowingTarget() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">Get the following target's coordinate location.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></td><td><font color="#666"><i>A location object of LocationCoordinate2D.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djifollowmemissionoperatorlistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIFollowMeMissionOperatorListener.html">FollowMeMissionOperatorListener</a></div></div><div class="api-row" id="djifollowmemission"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIFollowMeMission.html">FollowMeMission</a></div></div><div class="api-row" id="djifollowmemissionevent"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIFollowMeMissionEvent.html">FollowMeMissionEvent</a></div></div>
