<div class="article"><h1 ><font color="#AAA">class </font>WaypointMissionOperator</h1></div>

~~~java
 class WaypointMissionOperator 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The waypoint operator is the only object that controls, runs and monitors Waypoint Missions. It can be accessed from <code><a href="/Components/Missions/DJIMissionControl.html#djimissioncontrol">MissionControl</a></code>.



##### Class Members:



#### Preparation

<div class="api-row" id="djiwaypointmissionoperator_loadmission"><div class="api-col left">Operator</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionoperator_loadmission_inline">loadMission</a></div></div><div class="inline-doc" id="djiwaypointmissionoperator_loadmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>loadMission</h6></div>

~~~java
@Nullable
 DJIError loadMission(@NonNull WaypointMission mission) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Loads the WaypointMission into device memory. This also verifies all the information of <code>mission</code>. If something is incorrect, callback.result() will be called with an Error. Otherwise, callback.result() will be called with a <code>null</code> value. The <code>mission</code> object will remain in device memory even after the WaypointMission execution has finished.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission">WaypointMission</a> <font color="#000">mission</td><td><font color="#666"><i>Waypoint mission to load.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>Returns an error when mission data is invalid or the mission cannot be loaded in the current state.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmissionoperator_loadedmission"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionoperator_loadedmission_inline">getLoadedMission</a></div></div><div class="inline-doc" id="djiwaypointmissionoperator_loadedmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLoadedMission</h6></div>

~~~java
@Nullable
 WaypointMission getLoadedMission() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Gets the currently loaded mission of the operator. There are two ways to load a mission. 1. A mission can be loaded by user through <code><a href="/Components/Missions/DJIWaypointMissionOperator.html#djiwaypointmissionoperator_loadmission">loadMission</a></code>. 2. If the aircraft is already executing a waypoint mission when SDK is re-connected, the operator will download part of the mission's information from the aircraft and load it automatically. In that case, the loaded mission will only contain the summary of the executing mission but information for each waypoint is absent. User can call <code><a href="/Components/Missions/DJIWaypointMissionOperator.html#djiwaypointmissionoperator_downloadmission">downloadMission</a></code> to get all the information for the loaded mission. The <code><a href="/Components/Missions/DJIWaypointMissionOperator.html#djiwaypointmissionoperator_loadedmission">getLoadedMission</a></code> will be reset to <code>null</code> when the execution of the loadedMission is stopped, finished or interrupted.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission">WaypointMission</a></td><td><font color="#666"><i>A object of <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission">WaypointMission</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmissionoperator_getpreviousinterruption"><div class="api-col left">Get Previous Interruption</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionoperator_getpreviousinterruption_inline">getPreviousInterruption</a></div></div><div class="inline-doc" id="djiwaypointmissionoperator_getpreviousinterruption_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPreviousInterruption</h6></div>

~~~java
 void getPreviousInterruption(CommonCallbacks.CompletionCallbackWith<WaypointMissionInterruption> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Gets the interruption of the last waypoint mission. If a waypoint mission is interrupted  before the completion, the aircraft will record the interruption information. This information  is only available when the last waypoint mission is incomplete and the first waypoint of the  mission has been reached. The interruption will also be recorded if the mission is stopped by  the user. The interruption information is recorded in the aircraft and the information persists  even after the aircraft's reboot. Supported only by Phantom 4 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;<a href="/Components/Missions/DJIWaypointMission_DJIWaypointMissionInterruption.html#djiwaypointmission_djiwaypointmissioninterruption">WaypointMissionInterruption</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmissionoperator_uploadmission"><div class="api-col left">Mission Upload to Aircraft</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionoperator_uploadmission_inline">uploadMission</a></div></div><div class="inline-doc" id="djiwaypointmissionoperator_uploadmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>uploadMission</h6></div>

~~~java
 void uploadMission(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Starts to upload the <code><a href="/Components/Missions/DJIWaypointMissionOperator.html#djiwaypointmissionoperator_loadedmission">getLoadedMission</a></code> to the aircraft. It can only be called when the <code><a href="/Components/Missions/DJIWaypointMissionOperator.html#djiwaypointmissionoperator_loadedmission">getLoadedMission</a></code> is complete and the <code><a href="/Components/Missions/DJIWaypointMissionOperator.html#djiwaypointmissionoperator_currentstate">getCurrentState</a></code> is <code><a href="/Components/Missions/DJIWaypointMissionState.html#djiwaypointmissionstate_readytoupload">READY_TO_UPLOAD</a></code>. If a timeout error occurs during the previous upload, the upload operation will resume from the previous break-point. After a mission is uploaded successfully, the <code><a href="/Components/Missions/DJIWaypointMissionState.html#djiwaypointmissionstate">WaypointMissionState</a></code> will become <code><a href="/Components/Missions/DJIWaypointMissionState.html#djiwaypointmissionstate_readytoexecute">READY_TO_EXECUTE</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion block that will be called when the upload operation succeeds or fails to start. </i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmissionoperator_retryuploadmission"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionoperator_retryuploadmission_inline">retryUploadMission</a></div></div><div class="inline-doc" id="djiwaypointmissionoperator_retryuploadmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>retryUploadMission</h6></div>

~~~java
 void retryUploadMission(@Nullable CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Retry upload waypoint mission.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmissionoperator_downloadmission"><div class="api-col left">Mission Download from Aircraft</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionoperator_downloadmission_inline">downloadMission</a></div></div><div class="inline-doc" id="djiwaypointmissionoperator_downloadmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>downloadMission</h6></div>

~~~java
 void downloadMission(@Nullable CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Downloads information of each waypoint from aircraft and save it to <code><a href="/Components/Missions/DJIWaypointMissionOperator.html#djiwaypointmissionoperator_loadedmission">getLoadedMission</a></code>. If a download operation is started, the operator will download the information of waypoints missing in <code><a href="/Components/Missions/DJIWaypointMissionOperator.html#djiwaypointmissionoperator_loadedmission">getLoadedMission</a></code> one-by-one in ascending order. If <code><a href="/Components/Missions/DJIWaypointMissionOperator.html#djiwaypointmissionoperator_loadedmission">getLoadedMission</a></code> is already complete (containing all the waypoints), this method will call <code>completion</code> immediately without error. It can only be called when the <code><a href="/Components/Missions/DJIWaypointMissionOperator.html#djiwaypointmissionoperator_currentstate">getCurrentState</a></code> is one of the following: - <code><a href="/Components/Missions/DJIWaypointMissionState.html#djiwaypointmissionstate_executing">EXECUTING</a></code> - <code><a href="/Components/Missions/DJIWaypointMissionState.html#djiwaypointmissionstate_executionpaused">EXECUTION_PAUSED</a></code>



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback that will be called when the download operation succeeds or fails to start. </i></td></tr></table></html></div>

<html><p><br></p></html>

#### Mission Execution

<div class="api-row" id="djiwaypointmissionoperator_startmission"><div class="api-col left">Execution</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionoperator_startmission_inline">startMission</a></div></div><div class="inline-doc" id="djiwaypointmissionoperator_startmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startMission</h6></div>

~~~java
 void startMission(@Nullable CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Starts the execution of the uploaded mission. It can only be called when the <code><a href="/Components/Missions/DJIWaypointMissionOperator.html#djiwaypointmissionoperator_currentstate">getCurrentState</a></code> is <code><a href="/Components/Missions/DJIWaypointMissionState.html#djiwaypointmissionstate_readytoexecute">READY_TO_EXECUTE</a></code>. After a mission is started successfully, the <code><a href="/Components/Missions/DJIWaypointMissionOperator.html#djiwaypointmissionoperator_currentstate">getCurrentState</a></code> will become <code><a href="/Components/Missions/DJIWaypointMissionState.html#djiwaypointmissionstate_executing">EXECUTING</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion block that will be called when the operator succeeds or fails to start the execution. If it fails, an error will be returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmissionoperator_resumemission"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionoperator_resumemission_inline">resumeMission</a></div></div><div class="inline-doc" id="djiwaypointmissionoperator_resumemission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>resumeMission</h6></div>

~~~java
 void resumeMission(@Nullable CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Resumes the paused mission. It can only be called when the <code><a href="/Components/Missions/DJIWaypointMissionOperator.html#djiwaypointmissionoperator_currentstate">getCurrentState</a></code> is <code><a href="/Components/Missions/DJIWaypointMissionState.html#djiwaypointmissionstate_executionpaused">EXECUTION_PAUSED</a></code>. After a mission is resumed successfully, the <code><a href="/Components/Missions/DJIWaypointMissionOperator.html#djiwaypointmissionoperator_currentstate">getCurrentState</a></code> will become <code><a href="/Components/Missions/DJIWaypointMissionState.html#djiwaypointmissionstate_executing">EXECUTING</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion block that will be called when the operator succeeds or fails to resume the mission. If it fails, an error will be returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmissionoperator_pausemission"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionoperator_pausemission_inline">pauseMission</a></div></div><div class="inline-doc" id="djiwaypointmissionoperator_pausemission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>pauseMission</h6></div>

~~~java
 void pauseMission(@Nullable CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Pauses the executing mission. It can only be called when the <code><a href="/Components/Missions/DJIWaypointMissionState.html#djiwaypointmissionstate">WaypointMissionState</a></code> is <code><a href="/Components/Missions/DJIWaypointMissionState.html#djiwaypointmissionstate_executing">EXECUTING</a></code>. After a mission is paused successfully, the <code><a href="/Components/Missions/DJIWaypointMissionOperator.html#djiwaypointmissionoperator_currentstate">getCurrentState</a></code> will become <code><a href="/Components/Missions/DJIWaypointMissionState.html#djiwaypointmissionstate_executionpaused">EXECUTION_PAUSED</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion block that will be called when the operator succeeds or fails to pause the mission. If it fails, an error will be returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmissionoperator_stopmission"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionoperator_stopmission_inline">stopMission</a></div></div><div class="inline-doc" id="djiwaypointmissionoperator_stopmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopMission</h6></div>

~~~java
 void stopMission(@Nullable CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Stops the executing or paused mission. It can only be called when the <code><a href="/Components/Missions/DJIWaypointMissionOperator.html#djiwaypointmissionoperator_currentstate">getCurrentState</a></code> is one of the following: - <code><a href="/Components/Missions/DJIWaypointMissionState.html#djiwaypointmissionstate_executing">EXECUTING</a></code> - <code><a href="/Components/Missions/DJIWaypointMissionState.html#djiwaypointmissionstate_executionpaused">EXECUTION_PAUSED</a></code> After a mission is stopped successfully, <code><a href="/Components/Missions/DJIWaypointMissionOperator.html#djiwaypointmissionoperator_currentstate">getCurrentState</a></code> will become <code><a href="/Components/Missions/DJIWaypointMissionState.html#djiwaypointmissionstate_readytoupload">READY_TO_UPLOAD</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion block that will be called when the operator succeeds or fails to stop the mission. If it fails, an error will be returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmissionoperator_setautoflightspeed"><div class="api-col left">Auto flight speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionoperator_setautoflightspeed_inline">setAutoFlightSpeed</a></div></div><div class="inline-doc" id="djiwaypointmissionoperator_setautoflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAutoFlightSpeed</h6></div>

~~~java
 void setAutoFlightSpeed(@FloatRange(from = -15.0f, to = 15.0f) float speed,
                                   @Nullable CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Set the flight speed while the mission is executing automatically (without manual joystick speed input). This is the only property or method in this class that can communicate with the aircraft during a mission. All other properties and methods are used offline to prepare the mission which is then uploaded to the aircraft.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@FloatRange(from = -15.0f, to = 15.0f) float <font color="#000">speed</td><td><font color="#666"><i>Auto flight speed to be set. The absolute value of the auto flight speed should be less than or equal to the <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_maxflightspeed">getMaxFlightSpeed</a></code>. Its range is [-<code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_maxflightspeed">getMaxFlightSpeed</a></code>, <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_maxflightspeed">getMaxFlightSpeed</a></code>] m/s.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionoperator_setautoflightspeed"><div class="api-col left">Auto Flight Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_setautoflightspeed_inline">setAutoFlightSpeed</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_setautoflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAutoFlightSpeed</h6></div>

~~~java
    void setAutoFlightSpeed(@FloatRange(from = -15.0f, to = 15.0f) float speed, @Nullable CompletionCallback<DJIWaypointV2Error> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Set the flight speed while the mission is executing automatically (without manual joystick speed input). This is the only property or method in this  class that can communicate with the aircraft during a mission. All other properties and methods are used offline to prepare the mission which is then  uploaded to the aircraft.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@FloatRange(from = -15.0f, to = 15.0f) float <font color="#000">speed</td><td><font color="#666"><i>Auto flight speed to be set. The absolute value of the auto flight speed should be less than or equal to the <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_maxflightspeed">getMaxFlightSpeed</a></code>. Its range is [-<code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_maxflightspeed">getMaxFlightSpeed</a></code>, <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_maxflightspeed">getMaxFlightSpeed</a></code>] m/s.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback&lt;<a href="/Components/SDKError/DJIError_DJIWaypointV2Error.html#djierror_djiwaypointv2error">DJIWaypointV2Error</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionoperator_getautoflightspeed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_getautoflightspeed_inline">getAutoFlightSpeed</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_getautoflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAutoFlightSpeed</h6></div>

~~~java
    void getAutoFlightSpeed(CommonCallbacks.CompletionCallbackWith<Float> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Get the flight speed while the mission is executing.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;Float&gt; <font color="#000">callback</td><td><font color="#666"><i>Callback.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### State

<div class="api-row" id="djiwaypointmissionoperator_currentstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionoperator_currentstate_inline">getCurrentState</a></div></div><div class="inline-doc" id="djiwaypointmissionoperator_currentstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrentState</h6></div>

~~~java
@NonNull
 WaypointMissionState getCurrentState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The current state of the operator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointMissionState.html#djiwaypointmissionstate">WaypointMissionState</a></td><td><font color="#666"><i>A object of <code><a href="/Components/Missions/DJIWaypointMissionState.html#djiwaypointmissionstate">WaypointMissionState</a></code>.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Listener

<div class="api-row" id="djiwaypointmissionoperator_addlistener"><div class="api-col left">Add</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionoperator_addlistener_inline">addListener</a></div></div><div class="inline-doc" id="djiwaypointmissionoperator_addlistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addListener</h6></div>

~~~java
 void addListener(@NonNull final WaypointMissionOperatorListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Add listener to listen for events.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Components/Missions/DJIWaypointMissionOperator_Listener.html#djiwaypointmissionoperator_listener">WaypointMissionOperatorListener</a> <font color="#000">listener</td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIWaypointMissionOperator_Listener.html#djiwaypointmissionoperator_listener">WaypointMissionOperatorListener</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmissionoperator_removelistener"><div class="api-col left">Remove</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionoperator_removelistener_inline">removeListener</a></div></div><div class="inline-doc" id="djiwaypointmissionoperator_removelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeListener</h6></div>

~~~java
 void removeListener(@NonNull WaypointMissionOperatorListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Removes listener. If the same listener is listening to multiple events and notifications (e.g. upload event and download event), it will not receive any update of them.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIWaypointMissionOperator_Listener.html#djiwaypointmissionoperator_listener">WaypointMissionOperatorListener</a> <font color="#000">listener</td><td><font color="#666"><i>Listener to be removed.</i></td></tr></table></html></div>

<html><p><br></p></html>

##### Related:

<div class="api-row" id="djiwaypointmission"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointMission.html">WaypointMission</a></div></div><div class="api-row" id="djiwaypointmissionevent"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointMissionEvent.html">WaypointMissionEvent</a></div></div><div class="api-row" id="djiwaypointmissionuploadevent"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointMissionUploadEvent.html">WaypointMissionUploadEvent</a></div></div><div class="api-row" id="djiwaypointmissiondownloadevent"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointMissionDownloadEvent.html">WaypointMissionDownloadEvent</a></div></div><div class="api-row" id="djiwaypointmissionexecutionevent"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointMissionExecutionEvent.html">WaypointMissionExecutionEvent</a></div></div><div class="api-row" id="djiwaypointmissionstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointMissionState.html">WaypointMissionState</a></div></div><div class="api-row" id="djiwaypointmissionoperator_listener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointMissionOperator_Listener.html">WaypointMissionOperatorListener</a></div></div>
