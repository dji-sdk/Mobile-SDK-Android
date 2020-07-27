<div class="article"><h1 ><font color="#AAA">class </font>WaypointMissionOperatorListener</h1></div>

~~~java
 interface WaypointMissionOperatorListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Listener interface for Waypoint mission operator events.



##### Class Members:

<div class="api-row" id="djiwaypointmissionoperator_listener_onuploadupdate"><div class="api-col left">Upload</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionoperator_listener_onuploadupdate_inline">onUploadUpdate</a></div></div><div class="inline-doc" id="djiwaypointmissionoperator_listener_onuploadupdate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUploadUpdate</h6></div>

~~~java
    void onUploadUpdate(@NonNull WaypointMissionUploadEvent uploadEvent)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Called when an upload event happens.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIWaypointMissionUploadEvent.html#djiwaypointmissionuploadevent">WaypointMissionUploadEvent</a> <font color="#000">uploadEvent</td><td><font color="#666"><i>Upload event</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmissionoperator_listener_ondownloadupdate"><div class="api-col left">Download</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionoperator_listener_ondownloadupdate_inline">onDownloadUpdate</a></div></div><div class="inline-doc" id="djiwaypointmissionoperator_listener_ondownloadupdate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onDownloadUpdate</h6></div>

~~~java
    void onDownloadUpdate(@NonNull WaypointMissionDownloadEvent downloadEvent)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Called when an download event happens.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIWaypointMissionDownloadEvent.html#djiwaypointmissiondownloadevent">WaypointMissionDownloadEvent</a> <font color="#000">downloadEvent</td><td><font color="#666"><i>Download event</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmissionoperator_listener_onstart"><div class="api-col left">Start</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionoperator_listener_onstart_inline">onExecutionStart</a></div></div><div class="inline-doc" id="djiwaypointmissionoperator_listener_onstart_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onExecutionStart</h6></div>

~~~java
    void onExecutionStart()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Called when the waypoint mission starts.

</div>

<div class="api-row" id="djiwaypointmissionoperator_listener_onexecutionupdate"><div class="api-col left">Execution</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionoperator_listener_onexecutionupdate_inline">onExecutionUpdate</a></div></div><div class="inline-doc" id="djiwaypointmissionoperator_listener_onexecutionupdate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onExecutionUpdate</h6></div>

~~~java
    void onExecutionUpdate(@NonNull WaypointMissionExecutionEvent executionEvent)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Called when there is an execution update for the waypoint mission operator.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIWaypointMissionExecutionEvent.html#djiwaypointmissionexecutionevent">WaypointMissionExecutionEvent</a> <font color="#000">executionEvent</td><td><font color="#666"><i>Execution event.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmissionoperator_listener_onfinish"><div class="api-col left">Finish</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionoperator_listener_onfinish_inline">onExecutionFinish</a></div></div><div class="inline-doc" id="djiwaypointmissionoperator_listener_onfinish_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onExecutionFinish</h6></div>

~~~java
    void onExecutionFinish(@Nullable DJIError error)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Called when the waypoint mission ends.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a> <font color="#000">error</td><td><font color="#666"><i>Error if the waypoint mission didn't end as expected.</i></td></tr></table></html></div>


