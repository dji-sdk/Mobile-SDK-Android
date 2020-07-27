<div class="article"><h1 ><font color="#AAA">class </font>WaypointV2MissionOperatorListener</h1></div>

~~~java
 interface WaypointV2MissionOperatorListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Listen mission event.



##### Class Members:

<div class="api-row" id="waypointv2missionoperatorlistenerinterface_ondownloadupdate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#waypointv2missionoperatorlistenerinterface_ondownloadupdate_inline">onDownloadUpdate</a></div></div><div class="inline-doc" id="waypointv2missionoperatorlistenerinterface_ondownloadupdate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onDownloadUpdate</h6></div>

~~~java
    void onDownloadUpdate(@NonNull WaypointV2MissionDownloadEvent downloadEvent)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Called when an download event happens.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIWaypointV2MissionDownloadEvent.html#djiwaypointv2missiondownloadevent">WaypointV2MissionDownloadEvent</a> <font color="#000">downloadEvent</td><td><font color="#666"><i>The download event.</i></td></tr></table></html></div>

<div class="api-row" id="waypointv2missionoperatorlistenerinterface_onuploadupdate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#waypointv2missionoperatorlistenerinterface_onuploadupdate_inline">onUploadUpdate</a></div></div><div class="inline-doc" id="waypointv2missionoperatorlistenerinterface_onuploadupdate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUploadUpdate</h6></div>

~~~java
    void onUploadUpdate(@NonNull WaypointV2MissionUploadEvent uploadEvent)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Called when an upload event happens.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIWaypointV2MissionUploadEvent.html#djiwaypointv2missionuploadevent">WaypointV2MissionUploadEvent</a> <font color="#000">uploadEvent</td><td><font color="#666"><i>The upload event.</i></td></tr></table></html></div>

<div class="api-row" id="waypointv2missionoperatorlistenerinterface_onexecutionupdate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#waypointv2missionoperatorlistenerinterface_onexecutionupdate_inline">onExecutionUpdate</a></div></div><div class="inline-doc" id="waypointv2missionoperatorlistenerinterface_onexecutionupdate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onExecutionUpdate</h6></div>

~~~java
    void onExecutionUpdate(@NonNull WaypointV2MissionExecutionEvent executionEvent)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Called when there is an execution update for the waypoint mission operator.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIWaypointV2MissionExecutionEvent.html#djiwaypointv2missionexecutionevent">WaypointV2MissionExecutionEvent</a> <font color="#000">executionEvent</td><td><font color="#666"><i>Execution event.</i></td></tr></table></html></div>

<div class="api-row" id="waypointv2missionoperatorlistenerinterface_onexecutionstart"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#waypointv2missionoperatorlistenerinterface_onexecutionstart_inline">onExecutionStart</a></div></div><div class="inline-doc" id="waypointv2missionoperatorlistenerinterface_onexecutionstart_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onExecutionStart</h6></div>

~~~java
    void onExecutionStart()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Called when the waypoint mission starts.

</div>

<div class="api-row" id="waypointv2missionoperatorlistenerinterface_onexecutionfinish"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#waypointv2missionoperatorlistenerinterface_onexecutionfinish_inline">onExecutionFinish</a></div></div><div class="inline-doc" id="waypointv2missionoperatorlistenerinterface_onexecutionfinish_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onExecutionFinish</h6></div>

~~~java
    void onExecutionFinish(@Nullable DJIWaypointV2Error error)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Called when the waypoint mission ends.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/SDKError/DJIError_DJIWaypointV2Error.html#djierror_djiwaypointv2error">DJIWaypointV2Error</a> <font color="#000">error</td><td><font color="#666"><i>Error if the waypoint mission didn't end as expected.</i></td></tr></table></html></div>


