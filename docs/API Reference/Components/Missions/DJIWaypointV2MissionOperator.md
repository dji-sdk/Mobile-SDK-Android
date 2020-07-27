<div class="article"><h1 ><font color="#AAA">class </font>WaypointV2MissionOperator</h1></div>

~~~java
 interface WaypointV2MissionOperator 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The waypoint operator is the only object that controls, runs and monitors Waypoint V2 Missions.  It can be accessed from <code><a href="/Components/Missions/DJIMissionControl.html#djimissioncontrol">MissionControl</a></code>.



##### Class Members:



##### Related:

<div class="api-row" id="djiwaypointv2mission"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2Mission.html">WaypointV2Mission</a></div></div><div class="api-row" id="djiwaypointv2missionoperator_djiwaypointv2missionstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_djiwaypointv2missionstate_inline">WaypointV2MissionState</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_djiwaypointv2missionstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>WaypointV2MissionState</h6></div>

~~~java
 enum WaypointV2MissionState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">All the possible state of <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator">WaypointV2MissionOperator</a></code>.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2missionoperator_djiwaypointv2missionstate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The state of the operator is unknown. It is the initial state when the operator is just created.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2missionoperator_djiwaypointv2missionstate_disconnected_inline"></a>DISCONNECTED</td><td><font color="#666">The connection between the mobile device, remote controller and aircraft is broken.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2missionoperator_djiwaypointv2missionstate_recovering_inline"></a>RECOVERING</td><td><font color="#666">The connection between the mobile device, remote controller and aircraft is built-up.  The operator is synchronizing the state from the aircraft.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2missionoperator_djiwaypointv2missionstate_notsupported_inline"></a>NOT_SUPPORTED</td><td><font color="#666">The connected product does not support waypoint mission 2.0.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2missionoperator_djiwaypointv2missionstate_readytoupload_inline"></a>READY_TO_UPLOAD</td><td><font color="#666">The aircraft is ready to upload a mission.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2missionoperator_djiwaypointv2missionstate_uploading_inline"></a>UPLOADING</td><td><font color="#666">The uploading is started successfully. Detail information for each waypoint is being uploaded one by one.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2missionoperator_djiwaypointv2missionstate_readytoexecute_inline"></a>READY_TO_EXECUTE</td><td><font color="#666">Waypoint mission is uploaded completely and the aircraft is ready to start the execution.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2missionoperator_djiwaypointv2missionstate_executing_inline"></a>EXECUTING</td><td><font color="#666">The execution is started successfully.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2missionoperator_djiwaypointv2missionstate_interrupted_inline"></a>INTERRUPTED</td><td><font color="#666">Waypoint mission is paused successfully. User can call <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_interruptmission">interruptMission</a></code> to continue the execution.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiwaypointv2missionoperator_djiwaypointv2missionactionstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_djiwaypointv2missionactionstate_inline">ActionState</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_djiwaypointv2missionactionstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ActionState</h6></div>

~~~java
 enum ActionState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">All the possible action state of <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator">WaypointV2MissionOperator</a></code>.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2missionoperator_djiwaypointv2missionactionstate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The state of the operator is unknown. It is the initial action state when the operator is just created.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2missionoperator_djiwaypointv2missionactionstate_disconnected_inline"></a>DISCONNECTED</td><td><font color="#666">The connection between the mobile device, remote controller and aircraft is broken.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2missionoperator_djiwaypointv2missionactionstate_recovering_inline"></a>RECOVERING</td><td><font color="#666">The connection between the mobile device, remote controller and aircraft is built-up.  The operator is synchronizing the action state from the aircraft.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2missionoperator_djiwaypointv2missionactionstate_notsupported_inline"></a>NOT_SUPPORTED</td><td><font color="#666">The connected product does not support waypoint mission 2.0.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2missionoperator_djiwaypointv2missionactionstate_readytoupload_inline"></a>READY_TO_UPLOAD</td><td><font color="#666">The aircraft is ready to upload actions.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2missionoperator_djiwaypointv2missionactionstate_uploading_inline"></a>UPLOADING</td><td><font color="#666">The uploading is started successfully. Detail information for each action is being uploaded one by one.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2missionoperator_djiwaypointv2missionactionstate_readytoexecute_inline"></a>READY_TO_EXECUTE</td><td><font color="#666">Waypoint mission is uploaded completely and the aircraft is ready to start the execution.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2missionoperator_djiwaypointv2missionactionstate_executing_inline"></a>Executing</td><td><font color="#666">The execution is started successfully.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2missionoperator_djiwaypointv2missionactionstate_interrupted_inline"></a>Interrupted</td><td><font color="#666">Waypoint mission is interrupted successfully. User can call <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_interruptmission">interruptMission</a></code> to continue the execution.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiwaypointv2missionoperator_djiwaypointv2interruptrecoveraction"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_djiwaypointv2interruptrecoveraction_inline">InterruptRecoverActionType</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_djiwaypointv2interruptrecoveraction_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>InterruptRecoverActionType</h6></div>

~~~java
 enum InterruptRecoverActionType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">Determines the recover mission flying to which point. call <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_recovermission">recoverMission</a></code> to recover mission.  The waypoint mission is interrupted by invoking <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_interruptmission">interruptMission</a></code>. The waypoint mission is  interrupted by moving remote controller's joystick. Other interruption such as obstacle avoidance.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2missionoperator_djiwaypointv2interruptrecoveraction_gobacktorecordedpoint_inline"></a>GoBackToRecordPoint</td><td><font color="#666">When the mission is recovered, the aircraft flying to the recorded point.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2missionoperator_djiwaypointv2interruptrecoveraction_gobacktocurrentprojectionpoint_inline"></a>GoBackToCurrentProjectionPoint</td><td><font color="#666">When the mission is recovered, the aircraft flying to the recorded point current projection point.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2missionoperator_djiwaypointv2interruptrecoveraction_gobacktonextprojectionpoint_inline"></a>GoBackToNextProjectionPoint</td><td><font color="#666">When the mission is recovered, the aircraft flying to the recorded point next projection point.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2missionoperator_djiwaypointv2interruptrecoveraction_gobacktonexttwoprojectionpoint_inline"></a>GoBackToNextNextProjectionPoint</td><td><font color="#666">When the mission is recovered, the aircraft flying to the recorded point next two projection point.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2missionoperator_djiwaypointv2interruptrecoveraction_unknown_inline"></a>Unknown</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiwaypointv2mission_djiwaypointv2missionfinishedaction"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_djiwaypointv2missionfinishedaction_inline">MissionFinishedAction</a></div></div><div class="inline-doc" id="djiwaypointv2mission_djiwaypointv2missionfinishedaction_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>MissionFinishedAction</h6></div>

~~~java
 enum MissionFinishedAction 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Actions will be taken when the waypoint mission is finished.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2mission_djiwaypointv2missionfinishedaction_noaction_inline"></a>NO_ACTION</td><td><font color="#666">No further action will be taken. The aircraft can be controlled by the remote controller.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2mission_djiwaypointv2missionfinishedaction_gohome_inline"></a>GO_HOME</td><td><font color="#666">Goes home when the mission is finished. The aircraft will land directly if it is within 20  meters away from the home point.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2mission_djiwaypointv2missionfinishedaction_autolanding_inline"></a>AUTO_LAND</td><td><font color="#666">The aircraft will land automatically at the last waypoint.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2mission_djiwaypointv2missionfinishedaction_gotofirstwaypoint_inline"></a>GO_FIRST_WAYPOINT</td><td><font color="#666">The aircraft will go back to the first waypoint and hover.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2mission_djiwaypointv2missionfinishedaction_continueuntilstop_inline"></a>CONTINUE_UNTIL_STOP</td><td><font color="#666">When the aircraft reaches its final waypoint, it will hover without ending the mission. The joystick  can still be used to pull the aircraft back along its previous waypoints. The only way this mission  can end is if stopMission is called.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiwaypointv2missionoperator_djiwaypointv2uploadprogress"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2MissionOperator_DJIWaypointV2UploadProgress.html">WaypointV2UploadProgress</a></div></div><div class="api-row" id="djiwaypointv2missionoperator_djiwaypointv2downloadprogress"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2MissionOperator_DJIWaypointV2DownloadProgress.html">WaypointV2DownloadProgress</a></div></div><div class="api-row" id="djiwaypointv2missionoperator_djiwaypointv2executionprogress"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2MissionOperator_DJIWaypointV2ExecutionProgress.html">WaypointV2ExecutionProgress</a></div></div><div class="api-row" id="waypointv2missionoperatorlistenerinterface"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/WaypointV2MissionOperatorListenerInterface.html">WaypointV2MissionOperatorListener</a></div></div><div class="api-row" id="waypointv2actionlistenerinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/WaypointV2ActionListenerInterface.html">WaypointV2ActionListener</a></div></div><div class="api-row" id="djiwaypointv2actiondownloadeventinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2ActionDownloadEventInterface.html">ActionDownloadEvent</a></div></div><div class="api-row" id="djiwaypointv2actionuploadeventinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2ActionUploadEventInterface.html">ActionUploadEvent</a></div></div><div class="api-row" id="djiwaypointv2actionexecutionevent"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2ActionExecutionEvent.html">ActionExecutionEvent</a></div></div><div class="api-row" id="djiwaypointv2actionuploadprogressinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2ActionUploadProgressInterface.html">ActionUploadProgress</a></div></div><div class="api-row" id="djiwaypointv2missionexecutionevent"><div class="api-col left">Mission Execution Event</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2MissionExecutionEvent.html">WaypointV2MissionExecutionEvent</a></div></div><div class="api-row" id="djiwaypointv2missiondownloadevent"><div class="api-col left">Mission Download Event</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2MissionDownloadEvent.html">WaypointV2MissionDownloadEvent</a></div></div><div class="api-row" id="djiwaypointv2missionuploadevent"><div class="api-col left">Mission Upload Event</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2MissionUploadEvent.html">WaypointV2MissionUploadEvent</a></div></div><div class="api-row" id="djiwaypointv2action"><div class="api-col left">Waypoint Action</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2Action.html">WaypointV2Action</a></div></div><html><p><br></p></html>

#### Preparation

<div class="api-row" id="djiwaypointv2missionoperator_loadedmission"><div class="api-col left">Loaded Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_loadedmission_inline">getLoadedMission</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_loadedmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLoadedMission</h6></div>

~~~java
@Nullable
    WaypointV2Mission getLoadedMission()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Gets the currently loaded mission of the operator. There are two ways to load a mission. 1. A mission can be  loaded by user through <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_loadmission">loadMission</a></code>. 2. If the aircraft is already executing  a waypoint mission when SDK is re-connected, the operator will download part of the mission's information from  the aircraft and load it automatically. In that case, the loaded mission will only contain the summary of the  executing mission but information for each waypoint is absent. User can call <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_downloadmission">downloadMission</a></code>  to get all the information for the loaded mission. The <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_loadedmission">getLoadedMission</a></code> will be reset to <code>null</code>  when the execution of the loadedMission is stopped, finished.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission">WaypointV2Mission</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission">WaypointV2Mission</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionoperator_loadmission"><div class="api-col left">Load Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_loadmission_inline">loadMission</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_loadmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>loadMission</h6></div>

~~~java
    void loadMission(@NonNull WaypointV2Mission mission, @Nullable CompletionCallback<DJIWaypointV2Error> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Loads a waypoint mission into the operator. A mission can be loaded only when the <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate">WaypointV2MissionState</a></code> is one of the  following : <br> - <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate_readytoupload">READY_TO_UPLOAD</a></code> <br> - <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate_readytoexecute">READY_TO_EXECUTE</a></code> <br> Calling <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_loadmission">loadMission</a></code>  when the current state is <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate_readytoexecute">READY_TO_EXECUTE</a></code> will change the state to <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate_readytoupload">READY_TO_UPLOAD</a></code>.  After calling <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_loadedmission">getLoadedMission</a></code>,



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission">WaypointV2Mission</a> <font color="#000">mission</td><td><font color="#666"><i>Waypoint mission to load.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback&lt;<a href="/Components/SDKError/DJIError_DJIWaypointV2Error.html#djierror_djiwaypointv2error">DJIWaypointV2Error</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Returns an error when mission data is invalid or the mission cannot be loaded in the current state.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionoperator_loadedactioncount"><div class="api-col left">Loaded Action Count</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_loadedactioncount_inline">getLoadedActionCount</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_loadedactioncount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLoadedActionCount</h6></div>

~~~java
    int getLoadedActionCount()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Gets the currently loaded actions count of the operator. There are two ways to load a mission. 1. Actions can be loaded by user through <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_loadmission">loadMission</a></code>.  2. If the aircraft is already executing a waypoint mission and it has uploaded actions when SDK is re-connected, the operator will recover uploaded action count.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of loaded action count.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionoperator_loadedactions"><div class="api-col left">Loaded Actions</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_loadedactions_inline">getLoadedActions</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_loadedactions_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLoadedActions</h6></div>

~~~java
@Nullable
    List<WaypointV2Action> getLoadedActions()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Gets the count of loaded actions in current operator. There are two ways to load a mission. 1. Actions can be loaded by user through <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_loadmission">loadMission</a></code>.  2. If the aircraft is already executing a waypoint mission and it has uploaded actions when SDK is re-connected, the operator will recover uploaded action count. load it automatically.  In that case, the loaded actions will be <code>null</code>, if user want get summary of the executing actions user can call <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_downloadmission">downloadMission</a></code> to get all the information  for the loaded actions. The <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_loadedactions">getLoadedActions</a></code> will be reset to <code>null</code> when the execution of the getLoadedMission is stopped, finished.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;<a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action">WaypointV2Action</a>&gt;</td><td><font color="#666"><i>A list of <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action">WaypointV2Action</a></code> objects.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionoperator_currentstate"><div class="api-col left">Current State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_currentstate_inline">getCurrentState</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_currentstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrentState</h6></div>

~~~java
@NonNull
    WaypointV2MissionState getCurrentState()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The current state of the operator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate">WaypointV2MissionState</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate">WaypointV2MissionState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionoperator_currentactionstate"><div class="api-col left">Current Action State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_currentactionstate_inline">getCurrentActionState</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_currentactionstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrentActionState</h6></div>

~~~java
@NonNull
    ActionState getCurrentActionState()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The current action state of the operator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionactionstate">ActionState</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionactionstate">ActionState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionoperator_uploadmission"><div class="api-col left">Upload Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_uploadmission_inline">uploadMission</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_uploadmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>uploadMission</h6></div>

~~~java
    void uploadMission(@Nullable CompletionCallback<DJIWaypointV2Error> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Starts to upload the <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_loadedmission">getLoadedMission</a></code> to the aircraft. It can only be called when  the <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_loadedmission">getLoadedMission</a></code> is complete and the <code>DJIWaypointV2MissionActionExecutionEvent_currentState</code>  is <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate_readytoupload">READY_TO_UPLOAD</a></code>. If a timeout error occurs during the previous upload, the upload operation will  resume from the previous break-point. After a mission is uploaded successfully, the <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate">WaypointV2MissionState</a></code> will  become <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate_readytoexecute">READY_TO_EXECUTE</a></code>.  If it is started successfully, use <code>DJIWaypointV2MissionOperator_Listener_onUploadUpdate</code>  to receive the detailed progress.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback&lt;<a href="/Components/SDKError/DJIError_DJIWaypointV2Error.html#djierror_djiwaypointv2error">DJIWaypointV2Error</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Callback will be invoked with the result if the upload command has been received successfully by the aircraft. If the upload command is successfully sent,  use <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_addwaypointeventlistener">addWaypointEventListener</a></code> to check the detailed progress.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionoperator_uploadwaypointactions"><div class="api-col left">Upload Waypoint Actions</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_uploadwaypointactions_inline">uploadWaypointActions</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_uploadwaypointactions_inline"

><div class="article"><h6 ><font color="#AAA">method </font>uploadWaypointActions</h6></div>

~~~java
    void uploadWaypointActions(List<WaypointV2Action> actions, @Nullable CompletionCallback<DJIWaypointV2Error> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Starts to upload the <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_loadedactions">getLoadedActions</a></code> to the aircraft. It can only be called when the <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_loadedactions">getLoadedActions</a></code>  is complete and the <code>DJIWaypointV2MissionActionExecutionEvent_currentState</code> is <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate_readytoexecute">READY_TO_EXECUTE</a></code>. If a timeout error occurs during the  previous upload, the upload operation will resume from the previous break-point. After a mission is uploaded successfully, the <code>DJIWaypointV2MissionActionState</code>  will become <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionactionstate_readytoexecute">READY_TO_EXECUTE</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;<a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action">WaypointV2Action</a>&gt; <font color="#000">actions</td><td><font color="#666"><i>A list of <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action">WaypointV2Action</a></code> objects.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback&lt;<a href="/Components/SDKError/DJIError_DJIWaypointV2Error.html#djierror_djiwaypointv2error">DJIWaypointV2Error</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Callback will be invoked with the result if the upload action command has been received successfully by the aircraft. If the upload command is successfully sent,  use <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_addactionlistener">addActionListener</a></code> to check the detailed progress.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionoperator_downloadmission"><div class="api-col left">Download Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_downloadmission_inline">downloadMission</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_downloadmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>downloadMission</h6></div>

~~~java
    void downloadMission(@Nullable CompletionCallback<DJIWaypointV2Error> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Downloads information of Actions from startActionID to endActionID. The information of waypoints missing in <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_loadedmission">getLoadedMission</a></code> ascending order. If <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_loadedmission">getLoadedMission</a></code>  is already complete (containing all the waypoints), this method will call <code>completion</code> immediately without error. It can only be called when the <code>DJIWaypointV2MissionActionExecutionEvent_currentState</code> is one of the  following: <br> - <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionactionstate_executing">Executing</a></code> <br> - <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate_interrupted">INTERRUPTED</a></code>



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback&lt;<a href="/Components/SDKError/DJIError_DJIWaypointV2Error.html#djierror_djiwaypointv2error">DJIWaypointV2Error</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Callback that will be called when the download operation succeeds or fails to start. If it is started successfully, use <code>DJIWaypointV2MissionOperator_Listener_onDownloadUpdate</code> to receive the detailed progress.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionoperator_downloadactions"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_downloadactions_inline">downloadActions</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_downloadactions_inline"

><div class="article"><h6 ><font color="#AAA">method </font>downloadActions</h6></div>

~~~java
    void downloadActions(@Nullable CompletionCallback<DJIWaypointV2Error> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Downloads information of each waypoint from aircraft and save it to <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_loadedmission">getLoadedMission</a></code>. If a download operation starts, the operator will download the information of waypoints missing in <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_loadedmission">getLoadedMission</a></code>  one-by-one in ascending order. If <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_loadedmission">getLoadedMission</a></code> is already complete (containing all the waypoints), this method will call <code>completion</code> immediately without error. It can only be called when the <code>DJIWaypointV2MissionActionExecutionEvent_currentState</code>  is one of the following: <br> - <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionactionstate_executing">Executing</a></code> <br> - <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate_interrupted">INTERRUPTED</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback&lt;<a href="/Components/SDKError/DJIError_DJIWaypointV2Error.html#djierror_djiwaypointv2error">DJIWaypointV2Error</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Callback that will be called when the download operation succeeds or fails to start. If it is started successfully, use <code>DJIWaypointV2MissionOperator_addListenerToDownloadEvent</code> to receive the detailed progress.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Listener

<div class="api-row" id="djiwaypointv2missionoperator_addwaypointeventlistener"><div class="api-col left">Add to Listen for Waypoint Event</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_addwaypointeventlistener_inline">addWaypointEventListener</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_addwaypointeventlistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addWaypointEventListener</h6></div>

~~~java
    void addWaypointEventListener(@NonNull final WaypointV2MissionOperatorListener listener)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Add listener to listen for waypoint events.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Components/Missions/WaypointV2MissionOperatorListenerInterface.html#waypointv2missionoperatorlistenerinterface">WaypointV2MissionOperatorListener</a> <font color="#000">listener</td><td><font color="#666"><i>An object of <code>DJIWaypointV2MissionOperator_Listener</code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionoperator_removewaypointlistener"><div class="api-col left">Remove Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_removewaypointlistener_inline">removeWaypointListener</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_removewaypointlistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeWaypointListener</h6></div>

~~~java
     void removeWaypointListener(@NonNull WaypointV2MissionOperatorListener listener)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Removes listener. If the same listener is listening to multiple  events and notifications (e.g. upload event and download event), it will not receive any update of them.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/WaypointV2MissionOperatorListenerInterface.html#waypointv2missionoperatorlistenerinterface">WaypointV2MissionOperatorListener</a> <font color="#000">listener</td><td><font color="#666"><i>Listener to be removed.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionoperator_addactionlistener"><div class="api-col left">Add Action Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_addactionlistener_inline">addActionListener</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_addactionlistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addActionListener</h6></div>

~~~java
    void addActionListener(@NonNull final WaypointV2ActionListener listener)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Add listener to listen the events.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Components/Missions/WaypointV2ActionListenerInterface.html#waypointv2actionlistenerinterface">WaypointV2ActionListener</a> <font color="#000">listener</td><td><font color="#666"><i>An object of <code>DJIWaypointV2MissionOperator_ActionListener</code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionoperator_removeactionlistener"><div class="api-col left">Remove Action Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_removeactionlistener_inline">removeActionListener</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_removeactionlistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeActionListener</h6></div>

~~~java
    void removeActionListener(@NonNull WaypointV2ActionListener listener)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Removes listener. If the same listener is listening to multiple events and notifications (e.g. upload event and download event),  it will not receive any update of them.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/WaypointV2ActionListenerInterface.html#waypointv2actionlistenerinterface">WaypointV2ActionListener</a> <font color="#000">listener</td><td><font color="#666"><i>Listener to be removed.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Mission Execution

<div class="api-row" id="djiwaypointv2missionoperator_startmission"><div class="api-col left">Start Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_startmission_inline">startMission</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_startmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startMission</h6></div>

~~~java
    void startMission(@Nullable CompletionCallback<DJIWaypointV2Error> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Starts the execution of the uploaded mission. It can only be called when the <code>DJIWaypointV2MissionActionExecutionEvent_currentState</code> is <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate_readytoexecute">READY_TO_EXECUTE</a></code>. After a mission is started successfully, the <code>DJIWaypointV2MissionActionExecutionEvent_currentState</code>  will become <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionactionstate_executing">Executing</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback&lt;<a href="/Components/SDKError/DJIError_DJIWaypointV2Error.html#djierror_djiwaypointv2error">DJIWaypointV2Error</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion block that will be called when the operator succeeds or fails to start the execution. If it fails, an error will be returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionoperator_interruptmission"><div class="api-col left">Interrupt Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_interruptmission_inline">interruptMission</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_interruptmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>interruptMission</h6></div>

~~~java
    void interruptMission(@Nullable CompletionCallback<DJIWaypointV2Error> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Pauses the executing mission. It can only be called when the <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate">WaypointV2MissionState</a></code> is <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionactionstate_executing">Executing</a></code>. After a mission is  paused successfully, the <code>DJIWaypointV2MissionActionExecutionEvent_currentState</code> will become <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate_interrupted">INTERRUPTED</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback&lt;<a href="/Components/SDKError/DJIError_DJIWaypointV2Error.html#djierror_djiwaypointv2error">DJIWaypointV2Error</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Callback that will be called when the operator succeeds or fails to pause the mission. If it fails, an error will be returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionoperator_recovermission"><div class="api-col left">Recover Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_recovermission_inline">recoverMission</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_recovermission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>recoverMission</h6></div>

~~~java
    void recoverMission(@Nullable CompletionCallback<DJIWaypointV2Error> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Resumes the paused mission. It can only be called when the <code>DJIWaypointV2MissionActionExecutionEvent_currentState</code> is <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate_interrupted">INTERRUPTED</a></code>.  After a mission is resumed successfully, the <code>DJIWaypointV2MissionActionExecutionEvent_currentState</code> will become <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionactionstate_executing">Executing</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback&lt;<a href="/Components/SDKError/DJIError_DJIWaypointV2Error.html#djierror_djiwaypointv2error">DJIWaypointV2Error</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Callback that will be called when the operator succeeds or fails to resume the mission. If it fails, an error will be returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionoperator_stopmission"><div class="api-col left">Stop Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_stopmission_inline">stopMission</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_stopmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopMission</h6></div>

~~~java
    void stopMission(@Nullable CompletionCallback<DJIWaypointV2Error> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Stops the executing or paused mission. It can only be called when the <code>DJIWaypointV2MissionActionExecutionEvent_currentState</code> is one of the  following: <br> - <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionactionstate_executing">Executing</a></code> <br> - <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate_interrupted">INTERRUPTED</a></code> After a mission finishes  successfully, <code>DJIWaypointV2MissionActionExecutionEvent_currentState</code> will become <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate_readytoupload">READY_TO_UPLOAD</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback&lt;<a href="/Components/SDKError/DJIError_DJIWaypointV2Error.html#djierror_djiwaypointv2error">DJIWaypointV2Error</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion block that will be called when the operator succeeds or fails to resume the mission. If it fails, an error will be returned.</i></td></tr></table></html></div>


