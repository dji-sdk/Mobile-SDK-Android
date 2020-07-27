<div class="article"><h1 ><font color="#AAA">class </font>ActiveTrackOperator</h1></div>

~~~java
 class ActiveTrackOperator 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The active track mission operator is the only object that controls, runs and monitors ActiveTrack Missions. It can be accessed from <code><a href="/Components/Missions/DJIMissionControl.html#djimissioncontrol">MissionControl</a></code>. <br><br> An ActiveTrack Mission allows an aircraft to track a moving subject using the vision system and without a GPS tracker on the subject. To use an ActiveTrack mission: <ul> <li>Prepare a mission with the rectangle that best represents the target to track </li> <li>Start the mission to initiate tracking of the object and begin the state updates (DJIMissionProgressStatus) </li> <li>At this point, the aircraft will track the target while hovering in place. </li> <li>Give confirmation that the tracked target is correct with <code><a href="/Components/Missions/DJIActiveTrackMissionOperator.html#djiactivetrackmissionoperator_acceptconfirmation">acceptConfirmation</a></code> and the aircraft will begin flying relative to the target. </li> <li>If the tracking algorithm looses sufficient confidence in tracking the target, then the aircraft will stop flying relative to the object and either notify the user (through execution state) that the target is lost or it needs another confirmation that the target is correct. </li> <li>If the mission is paused, the aircraft will hover in place, but continue tracking the target by adjusting gimbal pitch and aircraft yaw. </li> <li>If mission is resumed, confirmation of tracking rectangle will need to be sent through to start flying relative to target. </li> <li>The mission can be canceled with <code><a href="/Components/Missions/DJIActiveTrackMissionOperator.html#djiactivetrackmissionoperator_stopmission">stopTracking</a></code> at any time. <li><code><a href="/Components/Missions/DJIActiveTrackMissionOperator.html#djiactivetrackmissionoperator_stopmission">stopTracking</a></code> should also be used to reject tracking confirmation if the camera is tracking the wrong target. After stopping the mission, the mission needs to be recreated with a new rectangle and loaded into the operator.</li> <li>The main camera is used to track the target, so gimbal cannot be adjusted during an ActiveTrack mission. </li> <li>During the mission the aircraft can be manually flown with pitch, roll and throttle. Yaw and gimbal are automatically controlled to continue tracking the target. </li> <li>If the mission is executing, and after confirmation of the tracking rectangle has been sent, the aircraft can be manually controlled horizontally similar to a <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightorientationmode_homelock">HOME_LOCK</a></code> where the home is the tracked target. If aircraft is manually controlled upward, the aircraft will lift and retreat, and if it is controlled downward, it will go down and get closer to the target. </li> </ul>



##### Class Members:

<div class="api-row" id="djiactivetrackmissionoperator_currentstate"><div class="api-col left">Current State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionoperator_currentstate_inline">getCurrentState</a></div></div><div class="inline-doc" id="djiactivetrackmissionoperator_currentstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrentState</h6></div>

~~~java
@NonNull
 ActiveTrackState getCurrentState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The current state of the operator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate">ActiveTrackState</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate">ActiveTrackState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionoperator_isgesturemodeenabled"><div class="api-col left">Check Gesture Mode Enabled</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionoperator_isgesturemodeenabled_inline">isGestureModeEnabled</a></div></div><div class="inline-doc" id="djiactivetrackmissionoperator_isgesturemodeenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isGestureModeEnabled</h6></div>

~~~java
 boolean isGestureModeEnabled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if gesture mode is enabled. Value is undefined if  the <code><a href="/Components/Missions/DJIActiveTrackMissionEvent.html#djiactivetrackmissionevent_currentstate">getCurrentState</a></code> is one of the following:  <ul> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_notsupported">NOT_SUPPORT</a></code> </li> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_disconnected">DISCONNECTED</a></code> </li>  <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_recovering">RECOVERING</a></code> </li> </ul>



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the product supports gesture mode. </i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionoperator_isautosensingenabled"><div class="api-col left">Check Auto Sensing Enabled</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionoperator_isautosensingenabled_inline">isAutoSensingEnabled</a></div></div><div class="inline-doc" id="djiactivetrackmissionoperator_isautosensingenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isAutoSensingEnabled</h6></div>

~~~java
 boolean isAutoSensingEnabled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if auto sensing is enabled. Value is undefined if  the <code><a href="/Components/Missions/DJIActiveTrackMissionEvent.html#djiactivetrackmissionevent_currentstate">getCurrentState</a></code> is one of the following:  <ul> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_notsupported">NOT_SUPPORT</a></code> </li> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_disconnected">DISCONNECTED</a></code> </li>  <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_recovering">RECOVERING</a></code> </li> </ul>



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if auto sensing is enabled. </i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionoperator_isautosensingforquickshotenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionoperator_isautosensingforquickshotenabled_inline">isAutoSensingForQuickShotEnabled</a></div></div><div class="inline-doc" id="djiactivetrackmissionoperator_isautosensingforquickshotenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isAutoSensingForQuickShotEnabled</h6></div>

~~~java
 boolean isAutoSensingForQuickShotEnabled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if auto sensing for QuickShot is enabled. Value is undefined if  the <code><a href="/Components/Missions/DJIActiveTrackMissionEvent.html#djiactivetrackmissionevent_currentstate">getCurrentState</a></code> is one of the following:  <ul> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_notsupported">NOT_SUPPORT</a></code> </li> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_disconnected">DISCONNECTED</a></code> </li>  <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_recovering">RECOVERING</a></code> </li> </ul>



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the product supports gesture mode. </i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionoperator_addlistener"><div class="api-col left">Add Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionoperator_addlistener_inline">addListener</a></div></div><div class="inline-doc" id="djiactivetrackmissionoperator_addlistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addListener</h6></div>

~~~java
 void addListener(@NonNull ActiveTrackMissionOperatorListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Add a listener to listen to events in the ActiveTrack operator.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/ActiveTrackMissionOperatorListener.html#activetrackmissionoperatorlistener">ActiveTrackMissionOperatorListener</a> <font color="#000">listener</td><td><font color="#666"><i>Listener that is interested in the ActiveTrack mission operator events.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionoperator_removelistener"><div class="api-col left">Remove Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionoperator_removelistener_inline">removeListener</a></div></div><div class="inline-doc" id="djiactivetrackmissionoperator_removelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeListener</h6></div>

~~~java
 void removeListener(@NonNull ActiveTrackMissionOperatorListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Removes listener. The listener will not receive any update after  calling this method.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/ActiveTrackMissionOperatorListener.html#activetrackmissionoperatorlistener">ActiveTrackMissionOperatorListener</a> <font color="#000">listener</td><td><font color="#666"><i>Listener to be removed.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionoperator_removealllisteners"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionoperator_removealllisteners_inline">removeAllListeners</a></div></div><div class="inline-doc" id="djiactivetrackmissionoperator_removealllisteners_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeAllListeners</h6></div>

~~~java
 void removeAllListeners() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Remove all listeners.

</div>

<div class="api-row" id="djiactivetrackmissionoperator_setgesturemodeenabled"><div class="api-col left">Set Gesture Mode Enabled</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionoperator_setgesturemodeenabled_inline">setGestureModeEnabled</a></div></div><div class="inline-doc" id="djiactivetrackmissionoperator_setgesturemodeenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setGestureModeEnabled</h6></div>

~~~java
 void setGestureModeEnabled(boolean enabled, @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Enables/disables gesture mode.  <ul> <li>A human subject can be automatically  detected if they are moving a little (instead of requiring a defining rectangle) </li> <li>The human subject can accept the confirmation to track them by waving their arms. </li> <li>The tracked human can make the camera shoot a photo by showing a rectangle  with their thumbs and index fingers to the aircraft. </li> </ul> Gesture mode can only be enabled  when the aircraft is flying but not tracking a target. The <code><a href="/Components/Missions/DJIActiveTrackMissionEvent.html#djiactivetrackmissionevent_currentstate">getCurrentState</a></code> should be one of the following:  <ul> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_idle">IDLE</a></code> </li> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_cannotstart">CANNOT_START</a></code> </li> </ul>
After the gesture mode is enabled, <code><a href="/Components/Missions/DJIActiveTrackMissionEvent.html#djiactivetrackmissionevent_currentstate">getCurrentState</a></code> will become  <code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_detectinghuman">DETECTING_HUMAN</a></code>.  <br><br> Gesture mode can be disabled when <code><a href="/Components/Missions/DJIActiveTrackMissionEvent.html#djiactivetrackmissionevent_currentstate">getCurrentState</a></code>  is not any of the following: <ul> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_unknown">UNKNOWN</a></code> </li> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_disconnected">DISCONNECTED</a></code> </li> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_recovering">RECOVERING</a></code> </li> <li><code></code>DJIActiveTrackMissionState_NotSupported` </li> </ul> If the aircraft is already tracking a target, disabling gesture mode will  stop the ActiveTrack mission.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable gesture mode.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionoperator_isautosensingsupported"><div class="api-col left">Check AutoSensing Supported</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionoperator_isautosensingsupported_inline">isAutoSensingSupported</a></div></div><div class="inline-doc" id="djiactivetrackmissionoperator_isautosensingsupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isAutoSensingSupported</h6></div>

~~~java
 boolean isAutoSensingSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Checks if the connected product supports auto sensing. When the product  supports auto sensing, enabling auto sensing is the pre-condition of starting active track.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the product supports auto sensing.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionoperator_enableautosensing"><div class="api-col left">Enable AutoSensing</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionoperator_enableautosensing_inline">enableAutoSensing</a></div></div><div class="inline-doc" id="djiactivetrackmissionoperator_enableautosensing_inline"

><div class="article"><h6 ><font color="#AAA">method </font>enableAutoSensing</h6></div>

~~~java
 void enableAutoSensing(@Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Starts auto sensing. After auto sensing starts, the aircraft will sense  humans captured by the camera and return the detected subjects by <code><a href="/Components/Missions/DJIActiveTrackTrackingState.html#djiactivetracktrackingstate_autosensedsubjects">getAutoSensedSubjects</a></code>  in the updated event. QuickShot requires a special auto sensing mode, therefore, use <code><a href="/Components/Missions/DJIActiveTrackMissionOperator.html#djiactivetrackmissionoperator_enableautosensingforquickshot">enableAutoSensingForQuickShot</a></code>  if a QuickShot mission will be performed. It is only supported when <code><a href="/Components/Missions/DJIActiveTrackMissionOperator.html#djiactivetrackmissionoperator_isautosensingsupported">isAutoSensingSupported</a></code>  returns <code>true</code>. When the product supports auto sensing, enabling auto sensing is the pre-condition of starting active track.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionoperator_enableautosensingforquickshot"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionoperator_enableautosensingforquickshot_inline">enableAutoSensingForQuickShot</a></div></div><div class="inline-doc" id="djiactivetrackmissionoperator_enableautosensingforquickshot_inline"

><div class="article"><h6 ><font color="#AAA">method </font>enableAutoSensingForQuickShot</h6></div>

~~~java
 void enableAutoSensingForQuickShot(@Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Starts auto sensing specifically for QuickShot. After auto sensing starts, the aircraft will sense humans captured by the camera and return the  detected subjects by <code><a href="/Components/Missions/DJIActiveTrackTrackingState.html#djiactivetracktrackingstate_autosensedsubjects">getAutoSensedSubjects</a></code> in the updated event. This interface is specific for QuickShot, therefore,  use <code><a href="/Components/Missions/DJIActiveTrackMissionOperator.html#djiactivetrackmissionoperator_enableautosensing">enableAutoSensing</a></code> for missions other than QuickShot. It is only supported  when <code><a href="/Components/Missions/DJIActiveTrackMissionOperator.html#djiactivetrackmissionoperator_isautosensingsupported">isAutoSensingSupported</a></code> returns <code>true</code>. When the product supports auto sensing, enabling auto sensing  is the pre-condition of starting active track.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionoperator_disableautosensing"><div class="api-col left">Disable AutoSensing</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionoperator_disableautosensing_inline">disableAutoSensing</a></div></div><div class="inline-doc" id="djiactivetrackmissionoperator_disableautosensing_inline"

><div class="article"><h6 ><font color="#AAA">method </font>disableAutoSensing</h6></div>

~~~java
 void disableAutoSensing(@Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Stops auto sensing (either for QuickShot or the other active track modes). It is only supported  when <code><a href="/Components/Missions/DJIActiveTrackMissionOperator.html#djiactivetrackmissionoperator_isautosensingsupported">isAutoSensingSupported</a></code> returns <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionoperator_canstartmission"><div class="api-col left">Check Start Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionoperator_canstartmission_inline">canStartTracking</a></div></div><div class="inline-doc" id="djiactivetrackmissionoperator_canstartmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>canStartTracking</h6></div>

~~~java
 DJIError canStartTracking(@NonNull ActiveTrackMission mission) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Checks if the operator can start the mission.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission">ActiveTrackMission</a> <font color="#000">mission</td><td><font color="#666"><i>An ActiveTrack mission.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>The possible error if the operator tries to start the mission.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionoperator_startmission"><div class="api-col left">Start Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionoperator_startmission_inline">startTracking</a></div></div><div class="inline-doc" id="djiactivetrackmissionoperator_startmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startTracking</h6></div>

~~~java
 void startTracking(@NonNull ActiveTrackMission mission,
                              @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Starts to execute an ActiveTrack mission. It can only be called when the <code><a href="/Components/Missions/DJIActiveTrackMissionEvent.html#djiactivetrackmissionevent_currentstate">getCurrentState</a></code> is  <code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_idle">IDLE</a></code>. If a mission with  <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_djiactivetrackmode_trace">TRACE</a></code> or  <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_djiactivetrackmode_profile">PROFILE</a></code> is started  successfully, the <code><a href="/Components/Missions/DJIActiveTrackMissionEvent.html#djiactivetrackmissionevent_currentstate">getCurrentState</a></code>  will become one of the following:  <ul> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_waitingforconfirmation">WAITING_FOR_CONFIRMATION</a></code> </li> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_cannotconfirm">CANNOT_CONFIRM</a></code> </li> </ul> If a mission with  <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_djiactivetrackmode_spotlight">SPOTLIGHT</a></code> or  <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_djiactivetrackmode_spotlightpro">SPOTLIGHT_PRO</a></code> is started  successfully, the <code><a href="/Components/Missions/DJIActiveTrackMissionEvent.html#djiactivetrackmissionevent_currentstate">getCurrentState</a></code> will  become <code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_onlycamerafollowing">ONLY_CAMERA_FOLLOWING</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission">ActiveTrackMission</a> <font color="#000">mission</td><td><font color="#666"><i>The ActiveTrack mission to check.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionoperator_startautosensingmission"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionoperator_startautosensingmission_inline">startAutoSensingMission</a></div></div><div class="inline-doc" id="djiactivetrackmissionoperator_startautosensingmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startAutoSensingMission</h6></div>

~~~java
 void startAutoSensingMission(@NonNull ActiveTrackMission mission,
                                        @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Starts to execute an ActiveTrack mission after auto sensing (either for QuickShot or the other active track modes) is  started. The aircraft will start to track the subject defined by <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_subjectindex">setTargetIndex</a></code>.  If auto sensing for active track modes other than QuickShot is enabled, the active track mode to start is defined  by <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission">ActiveTrackMission</a></code>'s <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_mode">setMode</a></code>. <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_quickshotmode">getQuickShotMode</a></code> of <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission">ActiveTrackMission</a></code>  will be ignored. If auto sensing specifically for QuickShot is enabled, The QuickShot mode to start is defined  by <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission">ActiveTrackMission</a></code>'s <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_quickshotmode">getQuickShotMode</a></code>. <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_quickshotmode">getQuickShotMode</a></code> of <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission">ActiveTrackMission</a></code>  will be ignored. <br><br>It can only be called when the <code><a href="/Components/Missions/DJIActiveTrackMissionEvent.html#djiactivetrackmissionevent_currentstate">getCurrentState</a></code> is one of the following:  <br>- <code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_autosensing">AUTO_SENSING</a></code> <br>- <code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_autosensingforquickshot">AUTO_SENSING_FOR_QUICK_SHOT</a></code> <br>If the aircraft has high  confidence about the auto-sensed subject, confirmation is not required and the state will change to <code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_aircraftfollowing">AIRCRAFT_FOLLOWING</a></code>  or <code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_onlycamerafollowing">ONLY_CAMERA_FOLLOWING</a></code> (determined by the active track mode). Otherwise, the state will change  to <code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_waitingforconfirmation">WAITING_FOR_CONFIRMATION</a></code> and user need to perform <code><a href="/Components/Missions/DJIActiveTrackMissionOperator.html#djiactivetrackmissionoperator_acceptconfirmation">acceptConfirmation</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission">ActiveTrackMission</a> <font color="#000">mission</td><td><font color="#666"><i>The ActiveTrack mission to check.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionoperator_stopmission"><div class="api-col left">Stop Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionoperator_stopmission_inline">stopTracking</a></div></div><div class="inline-doc" id="djiactivetrackmissionoperator_stopmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopTracking</h6></div>

~~~java
 void stopTracking(@Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Stops the executing mission. It can only be called when the  <code><a href="/Components/Missions/DJIActiveTrackMissionEvent.html#djiactivetrackmissionevent_currentstate">getCurrentState</a></code> is one of the following:  <ul> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_waitingforconfirmation">WAITING_FOR_CONFIRMATION</a></code> </li> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_cannotconfirm">CANNOT_CONFIRM</a></code> </li> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_aircraftfollowing">AIRCRAFT_FOLLOWING</a></code> </li> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_onlycamerafollowing">ONLY_CAMERA_FOLLOWING</a></code> </li> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_findingtrackedtarget">FINDING_TRACKED_TARGET</a></code> </li> </ul> After a mission is  stopped successfully, <code><a href="/Components/Missions/DJIActiveTrackMissionEvent.html#djiactivetrackmissionevent_currentstate">getCurrentState</a></code> will become  <code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_idle">IDLE</a></code> or  <code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_detectinghuman">DETECTING_HUMAN</a></code> if gesture mode is enabled.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionoperator_acceptconfirmation"><div class="api-col left">Accept Confirmation</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionoperator_acceptconfirmation_inline">acceptConfirmation</a></div></div><div class="inline-doc" id="djiactivetrackmissionoperator_acceptconfirmation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>acceptConfirmation</h6></div>

~~~java
 void acceptConfirmation(@Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">When the vision system is not sure the tracking rectangle is around the user's  desired target, it will need confirmation before starting to fly relative to the  target. The vision system will need confirmation when  <code><a href="/Components/Missions/DJIActiveTrackMissionEvent.html#djiactivetrackmissionevent_currentstate">getCurrentState</a></code> is  <code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_idle">IDLE</a></code>.  <code><a href="/Components/Missions/DJIActiveTrackTrackingState.html#djiactivetracktrackingstate_targetrect">getTargetRect</a></code> of <code><a href="/Components/Missions/DJIActiveTrackTrackingState.html#djiactivetracktrackingstate">ActiveTrackTrackingState</a></code> can  be used to show the user the rectangle the vision system is using. If the user  agrees the rectangle represents the target they want to track, this method can be  called to start flying relative to the target.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionoperator_rejectconfirmation"><div class="api-col left">Reject Confirmation</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionoperator_rejectconfirmation_inline">rejectConfirmation</a></div></div><div class="inline-doc" id="djiactivetrackmissionoperator_rejectconfirmation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>rejectConfirmation</h6></div>

~~~java
 void rejectConfirmation(@Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Rejects the target rectangle from the aircraft.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionoperator_stopaircraftfollowing"><div class="api-col left">Stop Aircraft Following</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionoperator_stopaircraftfollowing_inline">stopAircraftFollowing</a></div></div><div class="inline-doc" id="djiactivetrackmissionoperator_stopaircraftfollowing_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopAircraftFollowing</h6></div>

~~~java
 void stopAircraftFollowing(@Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Stops the aircraft from following the target and ask for user confirmation again.  It can only be called when the <code><a href="/Components/Missions/DJIActiveTrackMissionEvent.html#djiactivetrackmissionevent_currentstate">getCurrentState</a></code> is  <code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_aircraftfollowing">AIRCRAFT_FOLLOWING</a></code>. After it is called successfully,  <code><a href="/Components/Missions/DJIActiveTrackMissionEvent.html#djiactivetrackmissionevent_currentstate">getCurrentState</a></code> will become  <code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_waitingforconfirmation">WAITING_FOR_CONFIRMATION</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionoperator_setcircularspeed"><div class="api-col left">Set Circular Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionoperator_setcircularspeed_inline">setCircularSpeed</a></div></div><div class="inline-doc" id="djiactivetrackmissionoperator_setcircularspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCircularSpeed</h6></div>

~~~java
 void setCircularSpeed(float speed, @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Setting a non-zero speed starts the aircraft circling the target. Speed can be  set within the range [-5, 5] m/s where a positive speed is a counter-clockwise  movement (when viewing from the top). Reverting the speed to 0 m/s ends the  circling movement. It can only be called when the <code><a href="/Components/Missions/DJIActiveTrackMissionEvent.html#djiactivetrackmissionevent_currentstate">getCurrentState</a></code>  is <code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_aircraftfollowing">AIRCRAFT_FOLLOWING</a></code> .



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">speed</td><td><font color="#666"><i>Circular speed to set in m/s.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionoperator_getcircularspeed"><div class="api-col left">Get Circular Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionoperator_getcircularspeed_inline">getCircularSpeed</a></div></div><div class="inline-doc" id="djiactivetrackmissionoperator_getcircularspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCircularSpeed</h6></div>

~~~java
 void getCircularSpeed(@NonNull CommonCallbacks.CompletionCallbackWith<Float> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">In an ActiveTrack mission, the aircraft can be set to circle the target while  following it. This method returns the circular speed of the aircraft in m/s.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;Float&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionoperator_switchmode"><div class="api-col left">Switch Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionoperator_switchmode_inline">switchMode</a></div></div><div class="inline-doc" id="djiactivetrackmissionoperator_switchmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>switchMode</h6></div>

~~~java
 void switchMode(@NonNull ActiveTrackMode mode, @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Changes the ActiveTrack mode on the currently executing mission. It can only  be called when the <code><a href="/Components/Missions/DJIActiveTrackMissionEvent.html#djiactivetrackmissionevent_currentstate">getCurrentState</a></code> is one of the  following:  <ul> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_waitingforconfirmation">WAITING_FOR_CONFIRMATION</a></code> </li> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_cannotconfirm">CANNOT_CONFIRM</a></code>  </li> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_onlycamerafollowing">ONLY_CAMERA_FOLLOWING</a></code>  </li> <li><code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_findingtrackedtarget">FINDING_TRACKED_TARGET</a></code>  </li> </ul> If the current state  is <code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_aircraftfollowing">AIRCRAFT_FOLLOWING</a></code>,  <code><a href="/Components/Missions/DJIActiveTrackMissionOperator.html#djiactivetrackmissionoperator_stopaircraftfollowing">stopAircraftFollowing</a></code> should be called before  switching the mode. Also, The ActiveTrack mode can only be changed when gesture  mode is disabled.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_djiactivetrackmode">ActiveTrackMode</a> <font color="#000">mode</td><td><font color="#666"><i>Active track mode to change.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionoperator_setrecommendedconfiguration"><div class="api-col left">Recommended Configuration</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionoperator_setrecommendedconfiguration_inline">setRecommendedConfiguration</a></div></div><div class="inline-doc" id="djiactivetrackmissionoperator_setrecommendedconfiguration_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setRecommendedConfiguration</h6></div>

~~~java
 void setRecommendedConfiguration(@Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Sets the recommended camera and gimbal configuration that optimizes performance  for the ActiveTrack Mission in most environments.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionoperator_setretreatenabled"><div class="api-col left">Retreat Enabled</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionoperator_setretreatenabled_inline">setRetreatEnabled</a></div></div><div class="inline-doc" id="djiactivetrackmissionoperator_setretreatenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setRetreatEnabled</h6></div>

~~~java
 void setRetreatEnabled(boolean enabled, @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Enables/disable if the aircraft can retreat (fly backwards) when the target  comes toward it. When it is disabled, the aircraft will not retreat and instead  rotate the gimbal pitch down to track the target as it goes underneath. If the  target goes beyond the gimbal's pitch stop, the target will be lost and the mission  will stop.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable retreat during ActiveTrack mission.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmissionoperator_getretreateanbled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionoperator_getretreateanbled_inline">getRetreatEnabled</a></div></div><div class="inline-doc" id="djiactivetrackmissionoperator_getretreateanbled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRetreatEnabled</h6></div>

~~~java
 void getRetreatEnabled(@NonNull CommonCallbacks.CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Determines whether retreat is enabled in ActiveTrack mission.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiactivetrackmission"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIActiveTrackMission.html">ActiveTrackMission</a></div></div><div class="api-row" id="djiactivetrackmissionevent"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIActiveTrackMissionEvent.html">ActiveTrackMissionEvent</a></div></div><div class="api-row" id="activetrackmissionoperatorlistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/ActiveTrackMissionOperatorListener.html">ActiveTrackMissionOperatorListener</a></div></div>
