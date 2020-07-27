<div class="article"><h1 ><font color="#AAA">class </font>HotpointMissionOperator</h1></div>

~~~java
 class HotpointMissionOperator 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">The hotpoint mission operator is the only object that controls, runs and monitors Hotpoint Missions. It can be accessed from <code><a href="/Components/Missions/DJIMissionControl.html#djimissioncontrol">MissionControl</a></code>.



##### Class Members:

<div class="api-row" id="djihotpointmissionoperator_currentstate"><div class="api-col left">Current State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionoperator_currentstate_inline">getCurrentState</a></div></div><div class="inline-doc" id="djihotpointmissionoperator_currentstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrentState</h6></div>

~~~java
@NonNull
 HotpointMissionState getCurrentState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">The current state of the executing Hotpoint mission executing.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate">HotpointMissionState</a></td><td><font color="#666"><i>The state of the Hotpoint mission.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmissionoperator_addlistenertoevents"><div class="api-col left">Add Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionoperator_addlistenertoevents_inline">addListener</a></div></div><div class="inline-doc" id="djihotpointmissionoperator_addlistenertoevents_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addListener</h6></div>

~~~java
 void addListener(@NonNull HotpointMissionOperatorListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Adds listener to receive all of the Hotpoint mission operator events.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIHotpointMissionOperatorListener.html#djihotpointmissionoperatorlistener">HotpointMissionOperatorListener</a> <font color="#000">listener</td><td><font color="#666"><i>Listener that is interested in the Hotpoint mission operator.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmissionoperator_removelistener"><div class="api-col left">Remove Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionoperator_removelistener_inline">removeListener</a></div></div><div class="inline-doc" id="djihotpointmissionoperator_removelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeListener</h6></div>

~~~java
 void removeListener(@NonNull HotpointMissionOperatorListener targetListener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Removes listener. 



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIHotpointMissionOperatorListener.html#djihotpointmissionoperatorlistener">HotpointMissionOperatorListener</a> <font color="#000">targetListener</td><td><font color="#666"><i>Listener to be removed.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmissionoperator_removealllisteners"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionoperator_removealllisteners_inline">removeAllListeners</a></div></div><div class="inline-doc" id="djihotpointmissionoperator_removealllisteners_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeAllListeners</h6></div>

~~~java
 void removeAllListeners() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Remove all listeners from listener pool.

</div>

<div class="api-row" id="djihotpointmissionoperator_startmission"><div class="api-col left">Start Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionoperator_startmission_inline">startMission</a></div></div><div class="inline-doc" id="djihotpointmissionoperator_startmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startMission</h6></div>

~~~java
 void startMission(@NonNull final HotpointMission mission, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Starts to execute a Hotpoint mission. This only be called when the <code><a href="/Components/Missions/DJIHotpointMissionOperator.html#djihotpointmissionoperator_currentstate">getCurrentState</a></code> is <code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_readytoexecute">READY_TO_EXECUTE</a></code>. After a mission is started successfully, the <code><a href="/Components/Missions/DJIHotpointMissionOperator.html#djihotpointmissionoperator_currentstate">getCurrentState</a></code> will become <code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_initialphase">INITIAL_PHASE</a></code> or <code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_executing">EXECUTING</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission">HotpointMission</a> <font color="#000">mission</td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission">HotpointMission</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmissionoperator_pausemission"><div class="api-col left">Pause Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionoperator_pausemission_inline">pause</a></div></div><div class="inline-doc" id="djihotpointmissionoperator_pausemission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>pause</h6></div>

~~~java
 void pause(@Nullable CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Pauses the executing mission. It can only be called when the <code><a href="/Components/Missions/DJIHotpointMissionOperator.html#djihotpointmissionoperator_currentstate">getCurrentState</a></code> is  <code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_initialphase">INITIAL_PHASE</a></code> or <code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_executing">EXECUTING</a></code>.  If this method is called in the <code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_initialphase">INITIAL_PHASE</a></code> state, the aircraft will continue flying to the start point but it will not continue to circle around the hotpoint until the user resumes the mission. After a mission is paused successfully, the <code><a href="/Components/Missions/DJIHotpointMissionOperator.html#djihotpointmissionoperator_currentstate">getCurrentState</a></code> will become <code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_executionpaused">EXECUTION_PAUSED</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmissionoperator_resumemission"><div class="api-col left">Resume Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionoperator_resumemission_inline">resume</a></div></div><div class="inline-doc" id="djihotpointmissionoperator_resumemission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>resume</h6></div>

~~~java
 void resume(@Nullable CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Resumes the paused mission. It can only be called when the <code><a href="/Components/Missions/DJIHotpointMissionOperator.html#djihotpointmissionoperator_currentstate">getCurrentState</a></code> is <code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_executionpaused">EXECUTION_PAUSED</a></code>. After a mission is resumed successfully, the <code><a href="/Components/Missions/DJIHotpointMissionOperator.html#djihotpointmissionoperator_currentstate">getCurrentState</a></code> will become <code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_initialphase">INITIAL_PHASE</a></code> or <code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_executing">EXECUTING</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmissionoperator_stopmission"><div class="api-col left">Stop Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionoperator_stopmission_inline">stop</a></div></div><div class="inline-doc" id="djihotpointmissionoperator_stopmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stop</h6></div>

~~~java
 void stop(@Nullable CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Stops the executing or paused mission. It can only be called when <code><a href="/Components/Missions/DJIHotpointMissionOperator.html#djihotpointmissionoperator_currentstate">getCurrentState</a></code> is one of the following: <ul> <li><code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_initialphase">INITIAL_PHASE</a></code> </li> <li><code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_executing">EXECUTING</a></code> </li> <li><code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_executionpaused">EXECUTION_PAUSED</a></code> </li> </ul> After a mission is stopped successfully, <code><a href="/Components/Missions/DJIHotpointMissionOperator.html#djihotpointmissionoperator_currentstate">getCurrentState</a></code> will become <code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_readytoexecute">READY_TO_EXECUTE</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmissionoperator_getexecutingmission"><div class="api-col left">Get Executing Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionoperator_getexecutingmission_inline">getExecutingMission</a></div></div><div class="inline-doc" id="djihotpointmissionoperator_getexecutingmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getExecutingMission</h6></div>

~~~java
 void getExecutingMission(@NonNull HotpointMission mission, @NonNull CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Gets the executing mission from the aircraft. It can only be called when <code><a href="/Components/Missions/DJIHotpointMissionOperator.html#djihotpointmissionoperator_currentstate">getCurrentState</a></code> is one of the following: <ul> <li><code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_initialphase">INITIAL_PHASE</a></code> </li> <li><code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_executing">EXECUTING</a></code> </li> <li><code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_executionpaused">EXECUTION_PAUSED</a></code></li> </ul>



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission">HotpointMission</a> <font color="#000">mission</td><td><font color="#666"><i>Detailed information of the mission being executed. <code><a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission_altitude">setAltitude</a></code> and <code><a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission_radius">setRadius</a></code> may be different from the initial settings when starting the mission. It is <code>null</code> if there is an error encountered when trying to get the mission.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmissionoperator_setangularvelocity"><div class="api-col left">Set Angular Velocity</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionoperator_setangularvelocity_inline">setAngularVelocity</a></div></div><div class="inline-doc" id="djihotpointmissionoperator_setangularvelocity_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAngularVelocity</h6></div>

~~~java
 void setAngularVelocity(float angularVelocity, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Sets angular velocity for the executing mission. It can only be called when <code><a href="/Components/Missions/DJIHotpointMissionOperator.html#djihotpointmissionoperator_currentstate">getCurrentState</a></code> is one of the following: <ul> <li><code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_initialphase">INITIAL_PHASE</a></code> </li> <li><code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_executing">EXECUTING</a></code> </li> <li><code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_executionpaused">EXECUTION_PAUSED</a></code> </li> </ul>



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">angularVelocity</td><td><font color="#666"><i>Angular velocity to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmissionoperator_setradius"><div class="api-col left">Set Radius</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionoperator_setradius_inline">setRadius</a></div></div><div class="inline-doc" id="djihotpointmissionoperator_setradius_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setRadius</h6></div>

~~~java
 void setRadius(@FloatRange(from = 5, to = 500) float radius, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Sets radius for the executing mission. It can only be called when the <code><a href="/Components/Missions/DJIHotpointMissionOperator.html#djihotpointmissionoperator_currentstate">getCurrentState</a></code> is one of the following: <ul> <li><code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_initialphase">INITIAL_PHASE</a></code> </li> <li><code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_executing">EXECUTING</a></code> </li> <li><code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_executionpaused">EXECUTION_PAUSED</a></code> </li> </ul>



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@FloatRange(from = 5, to = 500) float <font color="#000">radius</td><td><font color="#666"><i>Radius to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmissionoperator_resetmissionheading"><div class="api-col left">Reset Mission Heading</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionoperator_resetmissionheading_inline">resetHeading</a></div></div><div class="inline-doc" id="djihotpointmissionoperator_resetmissionheading_inline"

><div class="article"><h6 ><font color="#AAA">method </font>resetHeading</h6></div>

~~~java
 void resetHeading(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Resets aircraft's heading to the direction defined by <code><a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission_heading">setHeading</a></code> of <code><a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission">HotpointMission</a></code>. It can only be called when the <code><a href="/Components/Missions/DJIHotpointMissionOperator.html#djihotpointmissionoperator_currentstate">getCurrentState</a></code> is one of the following: <ul> <li><code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_initialphase">INITIAL_PHASE</a></code> </li> <li><code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_executing">EXECUTING</a></code> </li> <li><code><a href="/Components/Missions/DJIHotpointMissionState.html#djihotpointmissionstate_executionpaused">EXECUTION_PAUSED</a></code> </li> </ul>



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmissionoperator_maxangularvelocityforradius"><div class="api-col left">Max Angular Velocity</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionoperator_maxangularvelocityforradius_inline">getMaxAngularVelocityForRadius</a></div></div><div class="inline-doc" id="djihotpointmissionoperator_maxangularvelocityforradius_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMaxAngularVelocityForRadius</h6></div>

~~~java
 static void getMaxAngularVelocityForRadius(@FloatRange(from = 5, to = 500) double radius,
                                                      @NonNull final CompletionCallbackWith<Float> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Returns the maximum supported angular velocity, in degrees/s, for a given Hotpoint mission radius in meters. Returns 0 if an unsupported radius is specified.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@FloatRange(from = 5, to = 500) double <font color="#000">radius</td><td><font color="#666"><i>Hotpoint radius with a range of [5,500] meters. This is used to calculate the  maximum angular velocity.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Float&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djihotpointmission"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIHotPointMission.html">HotpointMission</a></div></div><div class="api-row" id="djihotpointmissionoperatorlistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIHotpointMissionOperatorListener.html">HotpointMissionOperatorListener</a></div></div><div class="api-row" id="djihotpointmissionevent"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIHotpointMissionEvent.html">HotpointMissionEvent</a></div></div>
