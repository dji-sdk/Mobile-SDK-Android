<div class="article"><h1 ><font color="#AAA">class </font>WaypointUploadProgress</h1></div>

~~~java
@EXClassNullAway
 class WaypointUploadProgress 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The upload progress of the waypoint mission operator.



##### Class Members:

<div class="api-row" id="djiwaypointmission_djiwaypointuploadprogress_uploadedwaypointindex"><div class="api-col left">Index</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_djiwaypointuploadprogress_uploadedwaypointindex_inline">uploadedWaypointIndex</a></div></div><div class="inline-doc" id="djiwaypointmission_djiwaypointuploadprogress_uploadedwaypointindex_inline"

><div class="article"><h6 ><font color="#AAA">property </font>uploadedWaypointIndex</h6></div>

~~~java
 @InitialValue @IntRange(from = 0, to = WaypointMission.MAX_WAYPOINT_COUNT - 1) int uploadedWaypointIndex
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The index of the last uploaded waypoint. Information for each waypoint is uploaded one by one in ascending order. If no waypoint has been uploaded, the value will be -1.



##### See Also:



<font color="#666"><code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission">WaypointMission</a></code>

</div>

<div class="api-row" id="djiwaypointmission_djiwaypointuploadprogress_totalwaypointcount"><div class="api-col left">Count</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_djiwaypointuploadprogress_totalwaypointcount_inline">totalWaypointCount</a></div></div><div class="inline-doc" id="djiwaypointmission_djiwaypointuploadprogress_totalwaypointcount_inline"

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

<div class="api-row" id="djiwaypointmission_djiwaypointuploadprogress_iswaypointsummaryuploaded"><div class="api-col left">Summary</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_djiwaypointuploadprogress_iswaypointsummaryuploaded_inline">isSummaryUploaded</a></div></div><div class="inline-doc" id="djiwaypointmission_djiwaypointuploadprogress_iswaypointsummaryuploaded_inline"

><div class="article"><h6 ><font color="#AAA">property </font>isSummaryUploaded</h6></div>

~~~java
 boolean isSummaryUploaded
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The waypoint mission operator has uploaded the the mission's summary (information except waypoints).

</div>


