<div class="article"><h1 ><font color="#AAA">class </font>WaypointExecutionProgress</h1></div>

~~~java
@EXClassNullAway
 class WaypointExecutionProgress 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The mission execution progress of the waypoint mission operator.



##### Class Members:

<div class="api-row" id="djiwaypointmission_djiwaypointexecutionprogress_targetwaypointindex"><div class="api-col left">Target Waypoint Index</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_djiwaypointexecutionprogress_targetwaypointindex_inline">targetWaypointIndex</a></div></div><div class="inline-doc" id="djiwaypointmission_djiwaypointexecutionprogress_targetwaypointindex_inline"

><div class="article"><h6 ><font color="#AAA">property </font>targetWaypointIndex</h6></div>

~~~java
 @InitialValue @IntRange(from = 0, to = WaypointMission.MAX_WAYPOINT_COUNT - 1) int targetWaypointIndex
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Index of the waypoint for the next mission to which the aircraft will proceed.



##### See Also:



<font color="#666"><code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission">WaypointMission</a></code>

</div>

<div class="api-row" id="djiwaypointmission_djiwaypointexecutionprogress_iswaypointreached"><div class="api-col left">Check Reached Waypoint</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_djiwaypointexecutionprogress_iswaypointreached_inline">isWaypointReached</a></div></div><div class="inline-doc" id="djiwaypointmission_djiwaypointexecutionprogress_iswaypointreached_inline"

><div class="article"><h6 ><font color="#AAA">property </font>isWaypointReached</h6></div>

~~~java
 boolean isWaypointReached
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">YES when the aircraft reaches a waypoint. After the waypoint actions and heading change is complete,  the <code><a href="/Components/Missions/DJIWaypointMission_DJIWaypointExecutionProgress.html#djiwaypointmission_djiwaypointexecutionprogress_targetwaypointindex">targetWaypointIndex</a></code> will increment and this  property will become NO.

</div>

<div class="api-row" id="djiwaypointmission_djiwaypointexecutionprogress_execstate"><div class="api-col left">Execution State</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_djiwaypointexecutionprogress_execstate_inline">executeState</a></div></div><div class="inline-doc" id="djiwaypointmission_djiwaypointexecutionprogress_execstate_inline"

><div class="article"><h6 ><font color="#AAA">property </font>executeState</h6></div>

~~~java
 @NonNull WaypointMissionExecuteState executeState
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Current execution state of the aircraft.



##### See Also:



<font color="#666"><code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionexecutestate">WaypointMissionExecuteState</a></code>

</div>


