<div class="article"><h1 ><font color="#AAA">class </font>TapFlyMissionOperator</h1></div>

~~~java
 class TapFlyMissionOperator implements DJIParamAccessListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">The operator for TapFly mission. It is used to execute a TapFly mission.



##### Class Members:

<div class="api-row" id="djitapflymissionoperator_addlistener"><div class="api-col left">Add Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djitapflymissionoperator_addlistener_inline">addListener</a></div></div><div class="inline-doc" id="djitapflymissionoperator_addlistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addListener</h6></div>

~~~java
 void addListener(@NonNull TapFlyMissionOperatorListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">Add a listener to listen for all events in the TapFly mission operator.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/TapFlyMissionOperatorListener.html#tapflymissionoperatorlistener">TapFlyMissionOperatorListener</a> <font color="#000">listener</td><td><font color="#666"><i>Listener that is interested in the TapFly mission operator.</i></td></tr></table></html></div>

<div class="api-row" id="djitapflymissionoperator_removelistener"><div class="api-col left">Remove Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djitapflymissionoperator_removelistener_inline">removeListener</a></div></div><div class="inline-doc" id="djitapflymissionoperator_removelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeListener</h6></div>

~~~java
 void removeListener(@NonNull TapFlyMissionOperatorListener targetListener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">Removes listener. The listener will not receive any updates after calling this method.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/TapFlyMissionOperatorListener.html#tapflymissionoperatorlistener">TapFlyMissionOperatorListener</a> <font color="#000">targetListener</td><td><font color="#666"><i>Listener to be removed.</i></td></tr></table></html></div>

<div class="api-row" id="djitapflymissionoperator_removealllisteners"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djitapflymissionoperator_removealllisteners_inline">removeAllListeners</a></div></div><div class="inline-doc" id="djitapflymissionoperator_removealllisteners_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeAllListeners</h6></div>

~~~java
 void removeAllListeners() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">Remove all listeners.

</div>

<div class="api-row" id="djitapflymissionoperator_setupenvironment"><div class="api-col left">Setup Environment</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djitapflymissionoperator_setupenvironment_inline">setupEnvironment</a></div></div><div class="inline-doc" id="djitapflymissionoperator_setupenvironment_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setupEnvironment</h6></div>

~~~java
 void setupEnvironment(@Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">Setup environment and provide result in callback



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djitapflymissionoperator_startmission"><div class="api-col left">Start Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djitapflymissionoperator_startmission_inline">startMission</a></div></div><div class="inline-doc" id="djitapflymissionoperator_startmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startMission</h6></div>

~~~java
 void startMission(@NonNull TapFlyMission mission, @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">Starts to execute a TapFly mission. It can only be called when  the <code><a href="/Components/Missions/DJITapFlyMissionEvent.html#djitapflymissionevent_currentstate">getCurrentState</a></code>   is <code><a href="/Components/Missions/DJITapFlyMissionState.html#djitapflymissionstate_executionstarting">EXECUTION_STARTING</a></code>. If the mission is started successfully,  the <code><a href="/Components/Missions/DJITapFlyMissionEvent.html#djitapflymissionevent_currentstate">getCurrentState</a></code> will  become <code><a href="/Components/Missions/DJITapFlyMissionState.html#djitapflymissionstate_executing">EXECUTING</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJITapFlyMission.html#djitapflymission">TapFlyMission</a> <font color="#000">mission</td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJITapFlyMission.html#djitapflymission">TapFlyMission</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djitapflymissionoperator_stopmission"><div class="api-col left">Stop Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djitapflymissionoperator_stopmission_inline">stopMission</a></div></div><div class="inline-doc" id="djitapflymissionoperator_stopmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopMission</h6></div>

~~~java
 void stopMission(@Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">Stops the executing mission. It can only be called when  the <code><a href="/Components/Missions/DJITapFlyMissionEvent.html#djitapflymissionevent_currentstate">getCurrentState</a></code> is one of the following:  <ul> <li><code><a href="/Components/Missions/DJITapFlyMissionState.html#djitapflymissionstate_executing">EXECUTING</a></code> </li> <li><code><a href="/Components/Missions/DJITapFlyMissionState.html#djitapflymissionstate_executionpaused">EXECUTION_PAUSED</a></code> </li> <li><code><a href="/Components/Missions/DJITapFlyMissionState.html#djitapflymissionstate_executionresetting">EXECUTION_RESETTING</a></code> </li> </ul> After a mission is stopped  successfully, <code><a href="/Components/Missions/DJITapFlyMissionEvent.html#djitapflymissionevent_currentstate">getCurrentState</a></code> will  become <code><a href="/Components/Missions/DJITapFlyMissionState.html#djitapflymissionstate_executionstarting">EXECUTION_STARTING</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djitapflymissionoperator_resetheading"><div class="api-col left">Reset Heading</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djitapflymissionoperator_resetheading_inline">resetHeading</a></div></div><div class="inline-doc" id="djitapflymissionoperator_resetheading_inline"

><div class="article"><h6 ><font color="#AAA">method </font>resetHeading</h6></div>

~~~java
 void resetHeading(@Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">Resets aircraft heading to the flight direction. It can only be used  when <code><a href="/Components/Missions/DJITapFlyMission.html#djitapflymission_tapflymode">tapFlyMode</a></code> is <code><a href="/Components/Missions/DJITapFlyMission.html#djitapflymission_djitapflymode_free">FREE</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djitapflymissionoperator_setautoflightspeed"><div class="api-col left">Auto Flight Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djitapflymissionoperator_setautoflightspeed_inline">setAutoFlightSpeed</a></div></div><div class="inline-doc" id="djitapflymissionoperator_setautoflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAutoFlightSpeed</h6></div>

~~~java
 void setAutoFlightSpeed(float speed, @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">Sets auto flight speed for TapFly mission. It can be changed before or during the  execution of a TapFly mission.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">speed</td><td><font color="#666"><i>Auto flight speed.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djitapflymissionoperator_getautoflightspeed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djitapflymissionoperator_getautoflightspeed_inline">getAutoFlightSpeed</a></div></div><div class="inline-doc" id="djitapflymissionoperator_getautoflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAutoFlightSpeed</h6></div>

~~~java
 void getAutoFlightSpeed(@NonNull CommonCallbacks.CompletionCallbackWith callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">Gets the auto flight speed for TapFly mission in m/s.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djitapflymissionoperator_sethorizontalobstaclebypassenabled"><div class="api-col left">Horizontal Obstacle</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djitapflymissionoperator_sethorizontalobstaclebypassenabled_inline">setHorizontalObstacleBypassEnabled</a></div></div><div class="inline-doc" id="djitapflymissionoperator_sethorizontalobstaclebypassenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setHorizontalObstacleBypassEnabled</h6></div>

~~~java
 void setHorizontalObstacleBypassEnabled(boolean enabled,
                                                   @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> allows the aircraft to bypass or move around an obstacle by going to  the left or right of the obstacle. If <code>false</code>, the aircraft will only  go over an obstacle to avoid it. It can be changed before or during the execution  of a TapFly mission.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> allows aircraft to bypass or move around an obstacle by going to the left or right.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djitapflymissionoperator_gethorizontalobstaclebypassenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djitapflymissionoperator_gethorizontalobstaclebypassenabled_inline">getHorizontalObstacleBypassEnabled</a></div></div><div class="inline-doc" id="djitapflymissionoperator_gethorizontalobstaclebypassenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHorizontalObstacleBypassEnabled</h6></div>

~~~java
 void getHorizontalObstacleBypassEnabled(@NonNull CommonCallbacks.CompletionCallbackWith callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> allows the aircraft to bypass or move around an obstacle by going to  the left or right of the obstacle. If <code>false</code>, the aircraft will only  go over an obstacle to avoid it. It can be changed before or during the execution  of a TapFly mission.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djitapflymissionoperator_gettapflymode"><div class="api-col left">Tap Fly Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djitapflymissionoperator_gettapflymode_inline">getTapFlyMode</a></div></div><div class="inline-doc" id="djitapflymissionoperator_gettapflymode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTapFlyMode</h6></div>

~~~java
 TapFlyMode getTapFlyMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">Get the current tracking mode of the aircraft. It is valid when the <code><a href="/Components/Missions/DJITapFlyMissionState.html#djitapflymissionstate">TapFlyMissionState</a></code>  is one of the following: <br> - <code><a href="/Components/Missions/DJITapFlyMissionState.html#djitapflymissionstate_executing">EXECUTING</a></code> <br> - <code><a href="/Components/Missions/DJITapFlyMissionState.html#djitapflymissionstate_executionpaused">EXECUTION_PAUSED</a></code>  <br> - <code><a href="/Components/Missions/DJITapFlyMissionState.html#djitapflymissionstate_executionresetting">EXECUTION_RESETTING</a></code> <br> For the other states, the value  is <code><a href="/Components/Missions/DJITapFlyMissionState.html#djitapflymissionstate_unknown">UNKNOWN</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJITapFlyMission.html#djitapflymission_djitapflymode">TapFlyMode</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJITapFlyMission.html#djitapflymission_djitapflymode">TapFlyMode</a></code>.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="tapflymissionoperatorlistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/TapFlyMissionOperatorListener.html">TapFlyMissionOperatorListener</a></div></div><div class="api-row" id="djitapflymission"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJITapFlyMission.html">TapFlyMission</a></div></div><div class="api-row" id="djitapflymissionevent"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJITapFlyMissionEvent.html">TapFlyMissionEvent</a></div></div>
