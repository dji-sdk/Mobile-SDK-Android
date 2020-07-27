<div class="article"><h1 ><font color="#AAA">class </font>IntelligentHotpointMissionOperator</h1></div>

~~~java
 class IntelligentHotpointMissionOperator 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">The Intelligent hotpoint mission operator is the only object that controls, runs and monitors Intelligent  Hotpoint Missions. It can be accessed from <code><a href="/Components/Missions/DJIMissionControl.html#djimissioncontrol">MissionControl</a></code>. <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator">IntelligentHotpointMissionOperator</a></code>  has two ways to start an Intelligent hotpoint mission: One is to start a <code>DJIIntelligentHotpointMission</code>,  which will repeatedly around a specified point called hotpoint. The other you will target a rect in your  FPV view, and send it to Vision system to track, when the state change to <code>DJIIntelligentHotpointMissionOperator_WaitingForConfirmation</code>,  you can <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator_acceptconfirmationwithcompletion">acceptConfirmation</a></code>, then the aircraft will fly around the object.  When mission executing, it will not need target object, actually track mode only help to set hotpoint at a target  object. <br> Now only supported by Mavic 2 Zoom and Mavic 2 Pro.



##### Class Members:



##### Related:

<div class="api-row" id="djiintelligenthotpointmission"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIIntelligentHotpointMission.html">IntelligentHotpointMission</a></div></div><div class="api-row" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html">IntelligentHotpointMissionState</a></div></div><div class="api-row" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionEvent.html">IntelligentHotpointMissionEvent</a></div></div><div class="api-row" id="djiintelligenthotpointmissionoperatorlistenerinterface"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIIntelligentHotpointMissionOperatorListenerInterface.html">IntelligentHotpointMissionOperatorListener</a></div></div><div class="api-row" id="djiintelligenthotpointmissionoperator_ispoimodeenabled"><div class="api-col left">POI Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_ispoimodeenabled_inline">isPOIModeEnabled</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_ispoimodeenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isPOIModeEnabled</h6></div>

~~~java
 boolean isPOIModeEnabled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if POI mode is enabled. Value is undefined if  the <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionEvent.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_currentstate">getCurrentState</a></code> is one of the  following: <br> - <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_notsupported">NOT_SUPPORTED</a></code>  <br> - <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_disconnected">DISCONNECTED</a></code>  <br> - <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_recovering">RECOVERING</a></code>. <br> Now only  supported by Mavic 2 Zoom and Mavic 2 Pro.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check if POI Mode is enabled.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_enablepoimode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_enablepoimode_inline">enablePOIMode</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_enablepoimode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>enablePOIMode</h6></div>

~~~java
 void enablePOIMode(@NonNull final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Enable POI mode. enabling POI mode is the pre-condition of starting Intelligent Hotpoint Mission.  Now only supported by Mavic 2 Zoom and Mavic 2 Pro.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>CompletionCallback callback that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_disablepoimode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_disablepoimode_inline">disablePOIMode</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_disablepoimode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>disablePOIMode</h6></div>

~~~java
 void disablePOIMode(@NonNull final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Disable POI mode. When POI mode is disabled, you can not starting Intelligent Hotpoint mission.  Now only supported by Mavic 2 Zoom and Mavic 2 Pro.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_currentstate"><div class="api-col left">Current State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_currentstate_inline">getCurrentState</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_currentstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrentState</h6></div>

~~~java
@NonNull
 IntelligentHotpointMissionState getCurrentState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">The current state of the executing Intelligent Hotpoint mission.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate">IntelligentHotpointMissionState</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate">IntelligentHotpointMissionState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_addlistenertoevents"><div class="api-col left">Add Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_addlistenertoevents_inline">addListener</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_addlistenertoevents_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addListener</h6></div>

~~~java
 void addListener(@NonNull IntelligentHotpointMissionOperatorListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Adds listener to receive all of the Intelligent Hotpoint mission operator events.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIIntelligentHotpointMissionOperatorListenerInterface.html#djiintelligenthotpointmissionoperatorlistenerinterface">IntelligentHotpointMissionOperatorListener</a> <font color="#000">listener</td><td><font color="#666"><i>Listener that is interested in the intelligent hotpoint mission operator.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_removelistener"><div class="api-col left">Remove Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_removelistener_inline">removeListener</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_removelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeListener</h6></div>

~~~java
 void removeListener(@NonNull IntelligentHotpointMissionOperatorListener targetListener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Removes listener. If the listener is listening to events and notifications, then it will stop listening to  all if called with this method.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIIntelligentHotpointMissionOperatorListenerInterface.html#djiintelligenthotpointmissionoperatorlistenerinterface">IntelligentHotpointMissionOperatorListener</a> <font color="#000">targetListener</td><td><font color="#666"><i>Listener to be removed.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_removealllisteners"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_removealllisteners_inline">removeAllListeners</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_removealllisteners_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeAllListeners</h6></div>

~~~java
 void removeAllListeners() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Remove all listeners from listener pool.

</div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_startmission"><div class="api-col left">Start Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_startmission_inline">startMission</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_startmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startMission</h6></div>

~~~java
 void startMission(@NonNull IntelligentHotpointMission mission, @Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Starts to execute an Intelligent Hotpoint mission. This only be called when the <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator_currentstate">getCurrentState</a></code>  is <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_readytostart">READY_TO_START</a></code>. After a mission is started successfully,  the <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator_currentstate">getCurrentState</a></code> will become <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_executing">EXECUTING</a></code>.  If the mission starts successful, the aircraft will fly arround the "hotpoint" of the mission. The current horizontal distance between the aircraft and the hotpoint must  be [5,500]. The current vertical distance between the aircraft and the relative takeoff altitude must be [5,500].



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIIntelligentHotpointMission.html#djiintelligenthotpointmission">IntelligentHotpointMission</a> <font color="#000">mission</td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIIntelligentHotpointMission.html#djiintelligenthotpointmission">IntelligentHotpointMission</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback that will be called when the operator succeeds or fails to start the mission. If it fails, an error will be returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_startrecognizetargetinrect"><div class="api-col left">Start Recognize</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_startrecognizetargetinrect_inline">startRecognizeTargetInRect</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_startrecognizetargetinrect_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startRecognizeTargetInRect</h6></div>

~~~java
 void startRecognizeTargetInRect(@NonNull RectF rectF, @Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Send a target rect in video stream to aircraft, the vision system will recognize the target in the rect. This only be called when  the <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator_currentstate">getCurrentState</a></code> is <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_readytostart">READY_TO_START</a></code>.  After recognize target success, the <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator_currentstate">getCurrentState</a></code> will become <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_waitingforconfirmation">WAITING_FOR_CONFIRMATION</a></code>  means recognize the target successfully or <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_readytostart">READY_TO_START</a></code> means can not recognize the target.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull RectF <font color="#000">rectF</td><td><font color="#666"><i>The tracking target rect in video stream.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback that will be called when the operator succeeds or fails to start recognize target. If it fails, an error will be returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_acceptconfirmationwithcompletion"><div class="api-col left">Accept Confirmation</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_acceptconfirmationwithcompletion_inline">acceptConfirmation</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_acceptconfirmationwithcompletion_inline"

><div class="article"><h6 ><font color="#AAA">method </font>acceptConfirmation</h6></div>

~~~java
 void acceptConfirmation(@Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Confirm the recognized target, only be called when the <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator_currentstate">getCurrentState</a></code>  is <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_waitingforconfirmation">WAITING_FOR_CONFIRMATION</a></code>. If accept successfully,  the <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator_currentstate">getCurrentState</a></code> will become <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_measuringtarget">MEASURING_TARGET</a></code>,  the aircraft will measure the the target and calculate surrounding path. Then the aircraft will start circle around the target on the surrounding path and <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator_currentstate">getCurrentState</a></code>  will become <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_executing">EXECUTING</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback that will be called when the operator succeeds or fails. If it fails, an error will be returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_pausemission"><div class="api-col left">Pause Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_pausemission_inline">pauseMission</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_pausemission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>pauseMission</h6></div>

~~~java
 void pauseMission(@Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Pauses the executing mission. It can only be called when the <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator_currentstate">getCurrentState</a></code> is <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_executing">EXECUTING</a></code>.  After a mission is paused successfully, the <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator_currentstate">getCurrentState</a></code> will become <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_executionpaused">EXECUTION_PAUSED</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback that will be called when the operator succeeds or fails. If it fails, an error will be returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_resumemission"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_resumemission_inline">resumeMission</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_resumemission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>resumeMission</h6></div>

~~~java
 void resumeMission(@Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Resumes the paused mission. It can only be called when the <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator_currentstate">getCurrentState</a></code>  is <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_executionpaused">EXECUTION_PAUSED</a></code>. After a mission is resumed successfully,  the <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator_currentstate">getCurrentState</a></code> will become <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_executing">EXECUTING</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback that will be called when the operator succeeds or fails. If it fails, an error will be returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_stopmission"><div class="api-col left">Stop Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_stopmission_inline">stopMission</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_stopmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopMission</h6></div>

~~~java
 void stopMission(@Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Stops the executing or paused mission. It can only be called when <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator_currentstate">getCurrentState</a></code> is one of the following:  <br> - <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_executing">EXECUTING</a></code> <br> - <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_executionpaused">EXECUTION_PAUSED</a></code>  After a mission is stopped successfully, <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator_currentstate">getCurrentState</a></code> will become <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_readytostart">READY_TO_START</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback that will be called when the operator succeeds or fails. If it fails, an error will be returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_setangularvelocity"><div class="api-col left">Set Angular Velocity</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_setangularvelocity_inline">setAngularVelocity</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_setangularvelocity_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAngularVelocity</h6></div>

~~~java
 void setAngularVelocity(float angularVelocity, @Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Sets angular velocity for the executing mission. It can only be called when <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator_currentstate">getCurrentState</a></code> is one of the following:  <br> - <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_executing">EXECUTING</a></code>  <br> - <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_executionpaused">EXECUTION_PAUSED</a></code>



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">angularVelocity</td><td><font color="#666"><i>Angular velocity to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback that will be called when the operator succeeds or fails. If it fails, an error will be returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_setradius"><div class="api-col left">Set Radius</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_setradius_inline">setRadius</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_setradius_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setRadius</h6></div>

~~~java
 void setRadius(@FloatRange(from = 5, to = 500) float radius, @Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Sets radius for the executing mission. It can only be called when the <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator_currentstate">getCurrentState</a></code> is one of the  following: <br> - <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_executing">EXECUTING</a></code>  <br> - <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_executionpaused">EXECUTION_PAUSED</a></code>



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@FloatRange(from = 5, to = 500) float <font color="#000">radius</td><td><font color="#666"><i>Radius to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback that will be called when the operator succeeds or fails. If it fails, an error will be returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_setaltitude"><div class="api-col left">Set Altitude</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_setaltitude_inline">setAltitude</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_setaltitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAltitude</h6></div>

~~~java
 void setAltitude(@FloatRange(from = 5, to = 500) float altitude, @Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Sets altitude for the executing mission. It can only be called when the <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator_currentstate">getCurrentState</a></code> is one of the following:  <br> - <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_executing">EXECUTING</a></code>  <br> - <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_executionpaused">EXECUTION_PAUSED</a></code>



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@FloatRange(from = 5, to = 500) float <font color="#000">altitude</td><td><font color="#666"><i>altitude to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback that will be called when the operator succeeds or fails. If it fails, an error will be returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_resetgimbaltocenter"><div class="api-col left">Reset Gimbal To Center</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_resetgimbaltocenter_inline">resetGimbalToCenter</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_resetgimbaltocenter_inline"

><div class="article"><h6 ><font color="#AAA">method </font>resetGimbalToCenter</h6></div>

~~~java
 void resetGimbalToCenter(@Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Reset gimbal to center for the executing mission, the camera will direct to the target. It can only be called when the <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator_currentstate">getCurrentState</a></code> is one of the following:  <br> - <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_executing">EXECUTING</a></code> <br> - <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_executionpaused">EXECUTION_PAUSED</a></code> <br> This feature is only avaliable in recognize mission.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback that will be called when the operator succeeds or fails. If it fails, an error will be returned.</i></td></tr></table></html></div>


