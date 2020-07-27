<div class="article"><h1 ><font color="#AAA">class </font>WaypointV2DownloadProgress</h1></div>

~~~java
 interface WaypointV2DownloadProgress 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The download progress of the waypoint mission operator.



##### Class Members:

<div class="api-row" id="djiwaypointv2mission_djiwaypointv2downloadprogress_issummarydownloaded"><div class="api-col left">Check Summary Downloaded</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_djiwaypointv2downloadprogress_issummarydownloaded_inline">isSummaryDownloaded</a></div></div><div class="inline-doc" id="djiwaypointv2mission_djiwaypointv2downloadprogress_issummarydownloaded_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isSummaryDownloaded</h6></div>

~~~java
    boolean isSummaryDownloaded()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if Waypoint summary is downloaded.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check summary downloaded.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionoperator_djiwaypointv2downloadprogress_lastdownloadedwaypointindex"><div class="api-col left">Last Downloaded Waypoint Index</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_djiwaypointv2downloadprogress_lastdownloadedwaypointindex_inline">getLastDownloadedWaypointIndex</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_djiwaypointv2downloadprogress_lastdownloadedwaypointindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLastDownloadedWaypointIndex</h6></div>

~~~java
    int getLastDownloadedWaypointIndex()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The last index of downloaded waypoint. Waypoint is downloaded in ascending order. If no waypoint has been  downloaded, the value shoud be -1.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the last downloaded waypoint index.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionoperator_djiwaypointv2downloadprogress_totalwaypointcount"><div class="api-col left">Total Waypoint Count</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_djiwaypointv2downloadprogress_totalwaypointcount_inline">getTotalWaypointCount</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_djiwaypointv2downloadprogress_totalwaypointcount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTotalWaypointCount</h6></div>

~~~java
    int getTotalWaypointCount()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The total count of waypoints in the waypoint mission.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the total waypoint count.</i></td></tr></table></html></div>


