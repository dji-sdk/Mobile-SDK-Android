<div class="article"><h1 ><font color="#AAA">class </font>WaypointV2UploadProgress</h1></div>

~~~java
 interface WaypointV2UploadProgress 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The upload progress of the waypoint mission operator.



##### Class Members:

<div class="api-row" id="djiwaypointv2missionoperator_djiwaypointv2uploadprogress_iswaypointsummaryuploaded"><div class="api-col left">Check Waypoint Summary Uploaded</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_djiwaypointv2uploadprogress_iswaypointsummaryuploaded_inline">isSummaryUploaded</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_djiwaypointv2uploadprogress_iswaypointsummaryuploaded_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isSummaryUploaded</h6></div>

~~~java
   boolean isSummaryUploaded()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The waypoint mission operator has uploaded the mission's summary (information except waypoints).



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check summary uploaded.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionoperator_djiwaypointv2uploadprogress_lastuploadedwaypointindex"><div class="api-col left">Last Uploaded Waypoint Index</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_djiwaypointv2uploadprogress_lastuploadedwaypointindex_inline">getLastUploadedWaypointIndex</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_djiwaypointv2uploadprogress_lastuploadedwaypointindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLastUploadedWaypointIndex</h6></div>

~~~java
    int getLastUploadedWaypointIndex()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The last uploaded waypoint's index. Waypoint is uploaded in ascending order. If no waypoint has been uploaded,  the value should be -1.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of last uploaded waypoint index.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionoperator_djiwaypointv2uploadprogress_totalwaypointcount"><div class="api-col left">Total Waypoint Count</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_djiwaypointv2uploadprogress_totalwaypointcount_inline">getTotalWaypointCount</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_djiwaypointv2uploadprogress_totalwaypointcount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTotalWaypointCount</h6></div>

~~~java
    int getTotalWaypointCount()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The total count of waypoints in the waypoint mission.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of total waypoint count.</i></td></tr></table></html></div>


