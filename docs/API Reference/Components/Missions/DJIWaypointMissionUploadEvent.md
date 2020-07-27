<div class="article"><h1 ><font color="#AAA">class </font>WaypointMissionUploadEvent</h1></div>

~~~java
@EXClassNullAway
 final class WaypointMissionUploadEvent extends WaypointMissionEvent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/Missions/DJIWaypointMissionEvent.html#djiwaypointmissionevent">WaypointMissionEvent</a></code></td></tr></table></html>



##### Description:



<font color="#666">The upload event of a waypoint mission.



##### Class Members:

<div class="api-row" id="djiwaypointmissionuploadevent_progress"><div class="api-col left">Progress</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionuploadevent_progress_inline">getProgress</a></div></div><div class="inline-doc" id="djiwaypointmissionuploadevent_progress_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getProgress</h6></div>

~~~java
@Nullable
 WaypointUploadProgress getProgress() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The upload progress of the mission. It is <code>null</code> if there is an error during upload.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointMission_DJIWaypointUploadProgress.html#djiwaypointmission_djiwaypointuploadprogress">WaypointUploadProgress</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIWaypointMission_DJIWaypointUploadProgress.html#djiwaypointmission_djiwaypointuploadprogress">WaypointUploadProgress</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmissionuploadevent_previousstate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionuploadevent_previousstate_inline">getPreviousState</a></div></div><div class="inline-doc" id="djiwaypointmissionuploadevent_previousstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPreviousState</h6></div>

~~~java

    @Nullable
    WaypointMissionState getPreviousState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The previous state of the operator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable     <a href="/Components/Missions/DJIWaypointMissionState.html#djiwaypointmissionstate">WaypointMissionState</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIWaypointMissionState.html#djiwaypointmissionstate">WaypointMissionState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmissionuploadevent_currentstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionuploadevent_currentstate_inline">getCurrentState</a></div></div><div class="inline-doc" id="djiwaypointmissionuploadevent_currentstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrentState</h6></div>

~~~java

    @NonNull
    WaypointMissionState getCurrentState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The current state of the operator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull     <a href="/Components/Missions/DJIWaypointMissionState.html#djiwaypointmissionstate">WaypointMissionState</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIWaypointMissionState.html#djiwaypointmissionstate">WaypointMissionState</a></code>.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiwaypointmission_djiwaypointuploadprogress"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointMission_DJIWaypointUploadProgress.html">WaypointUploadProgress</a></div></div>

##### Inherited Methods:

<div class="api-row" id="djiwaypointmissionevent_geterror"><div class="api-col left">dji.common.mission.waypoint.WaypointMissionEvent</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionevent_geterror_inline">getError</a></div></div><div class="inline-doc" id="djiwaypointmissionevent_geterror_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getError</h6></div>

~~~java
@Nullable
 DJIError getError() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Error for Waypoint mission event.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>An object of <code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code>.</i></td></tr></table></html></div>


