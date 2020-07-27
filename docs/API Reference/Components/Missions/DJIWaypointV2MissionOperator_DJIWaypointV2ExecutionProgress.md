<div class="article"><h1 ><font color="#AAA">class </font>WaypointV2ExecutionProgress</h1></div>

~~~java
 interface WaypointV2ExecutionProgress 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The mission execution progress of the waypoint mission operator.



##### Class Members:

<div class="api-row" id="djiwaypointv2missionoperator_djiwaypointv2executionprogress_targetwaypointindex"><div class="api-col left">Target Waypoint Index</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_djiwaypointv2executionprogress_targetwaypointindex_inline">getTargetWaypointIndex</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_djiwaypointv2executionprogress_targetwaypointindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTargetWaypointIndex</h6></div>

~~~java
    int getTargetWaypointIndex()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The index of the waypoint in the mission to which the aircraft will proceed.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the target waypoint index.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionoperator_djiwaypointv2executionprogress_iswaypointreached"><div class="api-col left">Is Waypoint Reached</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_djiwaypointv2executionprogress_iswaypointreached_inline">isWaypointReached</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_djiwaypointv2executionprogress_iswaypointreached_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isWaypointReached</h6></div>

~~~java
    boolean isWaypointReached()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> when the aircraft reaches a waypoint. After the waypoint actions and heading change are complete,  the <code><a href="/Components/Missions/DJIWaypointV2MissionOperator_DJIWaypointV2ExecutionProgress.html#djiwaypointv2missionoperator_djiwaypointv2executionprogress_targetwaypointindex">getTargetWaypointIndex</a></code> will increment and this property will become <code>false</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check waypoint reached.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2missionoperator_djiwaypointv2executionprogress_executionstate"><div class="api-col left">Execution State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missionoperator_djiwaypointv2executionprogress_executionstate_inline">getExecuteState</a></div></div><div class="inline-doc" id="djiwaypointv2missionoperator_djiwaypointv2executionprogress_executionstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getExecuteState</h6></div>

~~~java
@NonNull
    WaypointV2MissionExecuteState getExecuteState()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Current execution state of the aircraft.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_djiwaypointv2missionexecutionstate">WaypointV2MissionExecuteState</a></td><td><font color="#666"><i>An enum value of the <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_djiwaypointv2missionexecutionstate">WaypointV2MissionExecuteState</a></code>.</i></td></tr></table></html></div>


