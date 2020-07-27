<div class="article"><h1 ><font color="#AAA">class </font>WaypointV2MissionUploadEvent</h1></div>

~~~java
 interface WaypointV2MissionUploadEvent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The upload event of a waypoint mission.



##### Class Members:

<div class="api-row" id="djiwaypointv2missionuploadevent_previousstate"><div class="api-col left">Previous State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionuploadevent_previousstate_inline">getPreviousState</a></div></div><div class="inline-doc" id="djiwaypointv2missionuploadevent_previousstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPreviousState</h6></div>

~~~java
@Nullable
    WaypointV2MissionState getPreviousState()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The previous state of the operator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate">WaypointV2MissionState</a></td><td><font color="#666"><i>An enum value of the <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate">WaypointV2MissionState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionuploadevent_currentstate"><div class="api-col left">Current State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionuploadevent_currentstate_inline">getCurrentState</a></div></div><div class="inline-doc" id="djiwaypointv2missionuploadevent_currentstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrentState</h6></div>

~~~java
@NonNull
    WaypointV2MissionState getCurrentState()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The current state of the operator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate">WaypointV2MissionState</a></td><td><font color="#666"><i>An enum value of the <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionstate">WaypointV2MissionState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionuploadevent_progress"><div class="api-col left">Progress</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionuploadevent_progress_inline">getProgress</a></div></div><div class="inline-doc" id="djiwaypointv2missionuploadevent_progress_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getProgress</h6></div>

~~~java
@Nullable
    WaypointV2UploadProgress getProgress()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The upload progress of the mission. It is <code>null</code> if there is an error during uploading.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2MissionOperator_DJIWaypointV2UploadProgress.html#djiwaypointv2missionoperator_djiwaypointv2uploadprogress">WaypointV2UploadProgress</a></td><td><font color="#666"><i>An object of the <code><a href="/Components/Missions/DJIWaypointV2MissionOperator_DJIWaypointV2UploadProgress.html#djiwaypointv2missionoperator_djiwaypointv2uploadprogress">WaypointV2UploadProgress</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionuploadevent_error"><div class="api-col left">Error</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionuploadevent_error_inline">getError</a></div></div><div class="inline-doc" id="djiwaypointv2missionuploadevent_error_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getError</h6></div>

~~~java
@Nullable
    DJIWaypointV2Error getError()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The encountered error during upload if there is any. Otherwise, it is <code>nil</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError_DJIWaypointV2Error.html#djierror_djiwaypointv2error">DJIWaypointV2Error</a></td><td><font color="#666"><i>An object of the <code><a href="/Components/SDKError/DJIError_DJIWaypointV2Error.html#djierror_djiwaypointv2error">DJIWaypointV2Error</a></code>.</i></td></tr></table></html></div>


