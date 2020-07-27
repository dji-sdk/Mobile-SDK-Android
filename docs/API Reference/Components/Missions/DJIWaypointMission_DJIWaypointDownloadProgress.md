<div class="article"><h1 ><font color="#AAA">class </font>WaypointDownloadProgress</h1></div>

~~~java
@EXClassNullAway
 class WaypointDownloadProgress 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The download progress of the waypoint mission operator.



##### Class Members:

<div class="api-row" id="djiwaypointmission_djiwaypointdownloadprogress_issummarydownloaded"><div class="api-col left">Summary</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_djiwaypointdownloadprogress_issummarydownloaded_inline">isSummaryDownloaded</a></div></div><div class="inline-doc" id="djiwaypointmission_djiwaypointdownloadprogress_issummarydownloaded_inline"

><div class="article"><h6 ><font color="#AAA">property </font>isSummaryDownloaded</h6></div>

~~~java
 boolean isSummaryDownloaded
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if Waypoint summary is downloaded.

</div>

<div class="api-row" id="djiwaypointmission_djiwaypointdownloadprogress_totalwaypointcount"><div class="api-col left">Count</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_djiwaypointdownloadprogress_totalwaypointcount_inline">totalWaypointCount</a></div></div><div class="inline-doc" id="djiwaypointmission_djiwaypointdownloadprogress_totalwaypointcount_inline"

><div class="article"><h6 ><font color="#AAA">property </font>totalWaypointCount</h6></div>

~~~java
 @InitialValue @IntRange(from = WaypointMission.MIN_WAYPOINT_COUNT, to = WaypointMission.MAX_WAYPOINT_COUNT)
    int totalWaypointCount
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The total count of waypoints in the waypoint mission.



##### See Also:



<font color="#666"><code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission">WaypointMission</a></code>, <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission">WaypointMission</a></code>

</div>

<div class="api-row" id="djiwaypointmission_djiwaypointdownloadprogress_downloadedwaypointindex"><div class="api-col left">Index</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_djiwaypointdownloadprogress_downloadedwaypointindex_inline">downloadedWaypointIndex</a></div></div><div class="inline-doc" id="djiwaypointmission_djiwaypointdownloadprogress_downloadedwaypointindex_inline"

><div class="article"><h6 ><font color="#AAA">property </font>downloadedWaypointIndex</h6></div>

~~~java
 @InitialValue @IntRange(from = 0, to = WaypointMission.MAX_WAYPOINT_COUNT - 1) int downloadedWaypointIndex
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The index of the last downloaded waypoint. Information for each waypoint is downloaded one by one in ascending order. If no waypoint has been downloaded, the value will be -1.



##### See Also:



<font color="#666"><code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission">WaypointMission</a></code>

</div>


