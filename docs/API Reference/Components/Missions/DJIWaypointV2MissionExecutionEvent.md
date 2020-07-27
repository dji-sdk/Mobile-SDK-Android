<div class="article"><h1 ><font color="#AAA">class </font>WaypointV2MissionExecutionEvent</h1></div>

~~~java
 interface WaypointV2MissionExecutionEvent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The execution event of a waypoint mission.



##### Class Members:

<div class="api-row" id="djiwaypointv2missionexecutionevent_previousstate"><div class="api-col left">Previous State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionexecutionevent_previousstate_inline">getPreviousState</a></div></div><div class="inline-doc" id="djiwaypointv2missionexecutionevent_previousstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPreviousState</h6></div>

~~~java
@Nullable
    WaypointV2MissionState getPreviousState()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The previous state of the operator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate">WaypointV2MissionState</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate">WaypointV2MissionState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionexecutionevent_currentstate"><div class="api-col left">Current State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionexecutionevent_currentstate_inline">getCurrentState</a></div></div><div class="inline-doc" id="djiwaypointv2missionexecutionevent_currentstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrentState</h6></div>

~~~java
@NonNull
    WaypointV2MissionState getCurrentState()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The current state of the operator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate">WaypointV2MissionState</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIWaypointMissionState.html#djiwaypointmissionstate">WaypointMissionState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionexecutionevent_progress"><div class="api-col left">Progress</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionexecutionevent_progress_inline">getProgress</a></div></div><div class="inline-doc" id="djiwaypointv2missionexecutionevent_progress_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getProgress</h6></div>

~~~java
@Nullable
    WaypointV2ExecutionProgress getProgress()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The execution progress of the mission. It is <code>nil</code> if there is an error during the execution.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2MissionOperator_DJIWaypointV2ExecutionProgress.html#djiwaypointv2missionoperator_djiwaypointv2executionprogress">WaypointV2ExecutionProgress</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIWaypointV2MissionOperator_DJIWaypointV2ExecutionProgress.html#djiwaypointv2missionoperator_djiwaypointv2executionprogress">WaypointV2ExecutionProgress</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionexecutionevent_error"><div class="api-col left">Error</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionexecutionevent_error_inline">getError</a></div></div><div class="inline-doc" id="djiwaypointv2missionexecutionevent_error_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getError</h6></div>

~~~java
@Nullable
    DJIWaypointV2Error getError()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The encountered error during the execution if there is any. Otherwise, it is <code>nil</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError_DJIWaypointV2Error.html#djierror_djiwaypointv2error">DJIWaypointV2Error</a></td><td><font color="#666"><i>An object of <code><a href="/Components/SDKError/DJIError_DJIWaypointV2Error.html#djierror_djiwaypointv2error">DJIWaypointV2Error</a></code>.</i></td></tr></table></html></div>


