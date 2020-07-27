<div class="article"><h1 ><font color="#AAA">class </font>WaypointMission</h1></div>

~~~java
@EXClassNullAway
 final class WaypointMission 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">In the waypoint mission, the aircraft will travel between waypoints, execute actions at waypoints, and  adjust heading and altitude between waypoints. Waypoints are physical locations to which the aircraft  will fly. Creating a series of waypoints, in effect, will program a flight route for the aircraft to  follow. Actions can also be added to waypoints, which will be carried out when the aircraft reaches the  waypoint. The aircraft travels between waypoints automatically at a base speed. However, the user can  change the speed by using the pitch joystick. If the stick is pushed up, the speed will increase. If  the stick is pushed down, the speed will slow down. The stick can be pushed down to stop the aircraft  and further pushed to start making the aircraft travel back along the path it came. When the aircraft  is travelling through waypoints in the reverse order, it will not execute waypoint actions at each  waypoint. If the stick is released, the aircraft will again travel through the waypoints in the original  order, and continue to execute waypoint actions (even if executed previously). If the aircraft is pulled  back along the waypoint mission all the way to the first waypoint, then it will hover in place until the  stick is released enough for it to again progress through the mission from start to finish. It is not  supported by Mavic Pro when using WiFi connection. It is not supported by Spark and Phantom 4 RTK.



##### Class Members:



##### Related:

<div class="api-row" id="djiwaypointmission_djiwaypointmissionexecutestate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_djiwaypointmissionexecutestate_inline">WaypointMissionExecuteState</a></div></div><div class="inline-doc" id="djiwaypointmission_djiwaypointmissionexecutestate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>WaypointMissionExecuteState</h6></div>

~~~java
@EXClassNullAway
 enum WaypointMissionExecuteState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Current waypoint mission state.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointmission_djiwaypointmissionexecutestate_initializing_inline"></a>INITIALIZING</td><td><font color="#666">Waypoint mission is initializing, which means the mission has started and the aircraft is going to the first waypoint.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointmission_djiwaypointmissionexecutestate_moving_inline"></a>MOVING</td><td><font color="#666">Aircraft is currently moving toward the mission's next waypoint. This happens when  the <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionflightpathmode">WaypointMissionFlightPathMode</a></code> is set  to <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionflightpathmode_normal">NORMAL</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointmission_djiwaypointmissionexecutestate_curvemodemoving_inline"></a>CURVE_MODE_MOVING</td><td><font color="#666">Aircraft is currently moving. This happens when the <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionflightpathmode">WaypointMissionFlightPathMode</a></code> is set  to <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionflightpathmode_curved">CURVED</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointmission_djiwaypointmissionexecutestate_curvemodeturning_inline"></a>CURVE_MODE_TURNING</td><td><font color="#666">Aircraft is currently turning. This happens when the <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionflightpathmode">WaypointMissionFlightPathMode</a></code>  is set to <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionflightpathmode_curved">CURVED</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointmission_djiwaypointmissionexecutestate_beginaction_inline"></a>BEGIN_ACTION</td><td><font color="#666">Aircraft has reached a waypoint, has rotated to the new heading and is now processing actions. This state  will be called before the waypoint actions starts executing and will occur for each waypoint action.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointmission_djiwaypointmissionexecutestate_doingaction_inline"></a>DOING_ACTION</td><td><font color="#666">Aircraft is at a waypoint and is executing an action.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointmission_djiwaypointmissionexecutestate_finishedaction_inline"></a>FINISHED_ACTION</td><td><font color="#666">Aircraft is at a waypoint and has finished executing the current waypoint action. This state occurs once  for each waypoint action.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointmission_djiwaypointmissionexecutestate_returntofirstwaypoint_inline"></a>RETURN_TO_FIRST_WAYPOINT</td><td><font color="#666">Aircraft has returned to the first waypoint. This happens when the <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_finishedaction">getFinishedAction</a></code>  is set to <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionexecutestate_returntofirstwaypoint">RETURN_TO_FIRST_WAYPOINT</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointmission_djiwaypointmissionexecutestate_paused_inline"></a>PAUSED</td><td><font color="#666">The mission is currently paused by the user.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiwaypoint"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypoint.html">Waypoint</a></div></div><div class="api-row" id="djiwaypointmission_djiwaypointmissionfinishedaction"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_djiwaypointmissionfinishedaction_inline">WaypointMissionFinishedAction</a></div></div><div class="inline-doc" id="djiwaypointmission_djiwaypointmissionfinishedaction_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>WaypointMissionFinishedAction</h6></div>

~~~java
@EXClassNullAway
 enum WaypointMissionFinishedAction 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Actions taken when the waypoint mission has finished.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointmission_djiwaypointmissionfinishedaction_noaction_inline"></a>NO_ACTION</td><td><font color="#666">No further action will be taken on completion of mission. At this point, the aircraft can be  controlled by the remote controller.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointmission_djiwaypointmissionfinishedaction_gohome_inline"></a>GO_HOME</td><td><font color="#666">The aircraft will go home when the mission is complete. If the aircraft is more than 20m away from  the home point it will go home and land. Otherwise, it will land directly at the current location.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointmission_djiwaypointmissionfinishedaction_autoland_inline"></a>AUTO_LAND</td><td><font color="#666">The aircraft will land automatically at the last waypoint.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointmission_djiwaypointmissionfinishedaction_gofirstwaypoint_inline"></a>GO_FIRST_WAYPOINT</td><td><font color="#666">The aircraft will go back to its first waypoint and hover in position.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointmission_djiwaypointmissionfinishedaction_continueuntilstop_inline"></a>CONTINUE_UNTIL_END</td><td><font color="#666">When the aircraft reaches its final waypoint, it will hover without ending the mission. The joystick  can still be used to pull the aircraft back along its previous waypoints. The only way this mission  can end is if stopMission is called.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiwaypointmission_djiwaypointmissionheadingmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_djiwaypointmissionheadingmode_inline">WaypointMissionHeadingMode</a></div></div><div class="inline-doc" id="djiwaypointmission_djiwaypointmissionheadingmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>WaypointMissionHeadingMode</h6></div>

~~~java
@EXClassNullAway
 enum WaypointMissionHeadingMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Current waypoint mission heading mode.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointmission_djiwaypointmissionheadingmode_auto_inline"></a>AUTO</td><td><font color="#666">Aircraft's heading will always be in the direction of flight.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointmission_djiwaypointmissionheadingmode_usinginitialdirection_inline"></a>USING_INITIAL_DIRECTION</td><td><font color="#666">Aircraft's heading will be set to the heading when reaching the first waypoint. Before reaching the  first waypoint, the aircraft's heading can be controlled by the remote controller. When the aircraft  reaches the first waypoint, its heading will be fixed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointmission_djiwaypointmissionheadingmode_controledbyremotecontroller_inline"></a>CONTROL_BY_REMOTE_CONTROLLER</td><td><font color="#666">Aircraft's heading will be controlled by the remote controller.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointmission_djiwaypointmissionheadingmode_usingwaypointheading_inline"></a>USING_WAYPOINT_HEADING</td><td><font color="#666">Aircraft's heading will be gradually set to the next waypoint heading while travelling between two adjacent waypoints.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointmission_djiwaypointmissionheadingmode_towardpointofinterest_inline"></a>TOWARD_POINT_OF_INTEREST</td><td><font color="#666">Aircraft's heading will always toward point of interest.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiwaypointmission_djiwaypointmissionflightpathmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_djiwaypointmissionflightpathmode_inline">WaypointMissionFlightPathMode</a></div></div><div class="inline-doc" id="djiwaypointmission_djiwaypointmissionflightpathmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>WaypointMissionFlightPathMode</h6></div>

~~~java
@EXClassNullAway
 enum WaypointMissionFlightPathMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Waypoint mission flight path mode.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointmission_djiwaypointmissionflightpathmode_normal_inline"></a>NORMAL</td><td><font color="#666">The flight path will be normal and the aircraft will move from one waypoint to the next in straight lines.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointmission_djiwaypointmissionflightpathmode_curved_inline"></a>CURVED</td><td><font color="#666">The flight path will be curved and the aircraft will move from one waypoint to the next in a curved motion,  adhering to the <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_cornerradiusinmeters">cornerRadiusInMeters</a></code>, which is set in <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint">Waypoint</a></code>.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiwaypointmission_djiwaypointmissiongotowaypointmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_djiwaypointmissiongotowaypointmode_inline">WaypointMissionGotoWaypointMode</a></div></div><div class="inline-doc" id="djiwaypointmission_djiwaypointmissiongotowaypointmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>WaypointMissionGotoWaypointMode</h6></div>

~~~java
@EXClassNullAway
 enum WaypointMissionGotoWaypointMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">This enum will determine the goto point mode while the drone executes the flight.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointmission_djiwaypointmissiongotowaypointmode_safely_inline"></a>SAFELY</td><td><font color="#666">Go to the waypoint safely. The aircraft will rise to the same altitude of the waypoint if the current  altitude is lower then the waypoint altitude. It then goes to the waypoint coordinate from the current  altitude, and proceeds to the altitude of the waypoint.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointmission_djiwaypointmissiongotowaypointmode_pointtopoint_inline"></a>POINT_TO_POINT</td><td><font color="#666">Go to the waypoint from the current aircraft point to the waypoint directly.</td></tr></table></html>

##### Class Members:

<div class="api-row" id="djiwaypointmission_djiwaypointmissioninterruption_coordinate"><div class="api-col left">Coordinate</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_djiwaypointmissioninterruption_coordinate_inline">getCoordinate</a></div></div><div class="inline-doc" id="djiwaypointmission_djiwaypointmissioninterruption_coordinate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCoordinate</h6></div>

~~~java
 LocationCoordinate2D getCoordinate() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The aircraft's coordinate when the mission is interrupted.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></td><td><font color="#666"><i>An object of <code><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_djiwaypointmissioninterruption_altitude"><div class="api-col left">altitude</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_djiwaypointmissioninterruption_altitude_inline">getAltitude</a></div></div><div class="inline-doc" id="djiwaypointmission_djiwaypointmissioninterruption_altitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAltitude</h6></div>

~~~java
 float getAltitude() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The aircraft's altitude when the mission is interrupted. This value represents the  absolute height. 



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of the waypoint altitude.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_djiwaypointmissioninterruption_index"><div class="api-col left">index</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_djiwaypointmissioninterruption_index_inline">getIndex</a></div></div><div class="inline-doc" id="djiwaypointmission_djiwaypointmissioninterruption_index_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getIndex</h6></div>

~~~java
 int getIndex() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The waypoint index that aircraft latest reached when the mission is interrupted.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the waypoint index.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_djiwaypointmissioninterruption_missionid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_djiwaypointmissioninterruption_missionid_inline">getMissionID</a></div></div><div class="inline-doc" id="djiwaypointmission_djiwaypointmissioninterruption_missionid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMissionID</h6></div>

~~~java
 int getMissionID() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">MissionID of interrupted mission.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the MissionID.</i></td></tr></table></html></div>

</div>

<div class="api-row" id="djiwaypointmission_djiwaypointmissioninterruption"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointMission_DJIWaypointMissionInterruption.html">WaypointMissionInterruption</a></div></div><div class="api-row" id="djiwaypointmission_builder"><div class="api-col left">Make Mission</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointMission_Builder.html">Builder</a></div></div><div class="api-row" id="djiwaypointmission_checkparameters"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_checkparameters_inline">checkParameters</a></div></div><div class="inline-doc" id="djiwaypointmission_checkparameters_inline"

><div class="article"><h6 ><font color="#AAA">method </font>checkParameters</h6></div>

~~~java
@Nullable
 DJIError checkParameters() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Checks if the configuration for the mission is valid before loading it into <code><a href="/Components/Missions/DJIWaypointMissionOperator.html#djiwaypointmissionoperator">WaypointMissionOperator</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>Error found when checking parameters of the waypoint. <code>null</code> if all the parameters are valid.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_waypointcount"><div class="api-col left">Waypoint Information</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_waypointcount_inline">getWaypointCount</a></div></div><div class="inline-doc" id="djiwaypointmission_waypointcount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWaypointCount</h6></div>

~~~java
 int getWaypointCount() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Number of waypoints in the waypoint mission. 



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Waypoint count.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_getmissionid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_getmissionid_inline">getMissionID</a></div></div><div class="inline-doc" id="djiwaypointmission_getmissionid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMissionID</h6></div>

~~~java
 int getMissionID() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Get the mission id.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Mission ID.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_allwaypoints"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_allwaypoints_inline">getWaypointList</a></div></div><div class="inline-doc" id="djiwaypointmission_allwaypoints_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWaypointList</h6></div>

~~~java
@Size(max = MAX_WAYPOINT_COUNT, min = MIN_WAYPOINT_COUNT)
 List<Waypoint> getWaypointList() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Returns an list of all waypoints in the mission.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;<a href="/Components/Missions/DJIWaypoint.html#djiwaypoint">Waypoint</a>&gt;</td><td><font color="#666"><i>A List of <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint">Waypoint</a></code> instances contained in the mission.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_maxflightspeed"><div class="api-col left">Flight Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_maxflightspeed_inline">getMaxFlightSpeed</a></div></div><div class="inline-doc" id="djiwaypointmission_maxflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMaxFlightSpeed</h6></div>

~~~java
 float getMaxFlightSpeed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">While the aircraft is travelling between waypoints, you can offset its speed by using the throttle joystick  on the remote controller. <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_maxflightspeed">getMaxFlightSpeed</a></code> is this offset when the joystick is pushed  to maximum deflection. For example, If maxFlightSpeed is 10 m/s, then pushing the throttle joystick all the  way up will add 10 m/s to the aircraft speed, while pushing down will subtract 10 m/s from the aircraft  speed. If the remote controller stick is not at maximum deflection, then the offset speed will be  interpolated between [0, <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_maxflightspeed">getMaxFlightSpeed</a></code>] with a resolution of 1000 steps. If the  offset speed is negative, then the aircraft will fly backwards to previous waypoints. When it reaches the  first waypoint, it will then hover in place until a positive speed is  applied. <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_maxflightspeed">getMaxFlightSpeed</a></code> has a range of [2,15] m/s.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>Flight speed in m/s</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_autoflightspeed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_autoflightspeed_inline">getAutoFlightSpeed</a></div></div><div class="inline-doc" id="djiwaypointmission_autoflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAutoFlightSpeed</h6></div>

~~~java
 float getAutoFlightSpeed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The base automatic speed of the aircraft as it moves between waypoints with range [-15, 15] m/s. The  aircraft's actual speed is a combination of the base automatic speed, and the speed control given by  the throttle joystick on the remote controller. If <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_autoflightspeed">getAutoFlightSpeed</a></code> >0: Actual  speed is <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_autoflightspeed">getAutoFlightSpeed</a></code> + Joystick Speed (with combined max  of <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_maxflightspeed">getMaxFlightSpeed</a></code>) If <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_autoflightspeed">getAutoFlightSpeed</a></code> =0: Actual speed is  controlled only by the remote controller joystick. If <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_autoflightspeed">getAutoFlightSpeed</a></code> <0 and the  aircraft is at the first waypoint, the aircraft will hover in place until the speed is made positive by  the remote controller joystick.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>Flight speed in m/s</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_gotofirstwaypointmode"><div class="api-col left">Start Mission behavior</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_gotofirstwaypointmode_inline">getGotoFirstWaypointMode</a></div></div><div class="inline-doc" id="djiwaypointmission_gotofirstwaypointmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getGotoFirstWaypointMode</h6></div>

~~~java
 WaypointMissionGotoWaypointMode getGotoFirstWaypointMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Defines how the aircraft will go to the first waypoint from its current position. Default  is <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissiongotowaypointmode_safely">SAFELY</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissiongotowaypointmode">WaypointMissionGotoWaypointMode</a></td><td><font color="#666"><i>The behavior of the aircraft at the begining of the mission</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_finishedaction"><div class="api-col left">End Mission Behavior</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_finishedaction_inline">getFinishedAction</a></div></div><div class="inline-doc" id="djiwaypointmission_finishedaction_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFinishedAction</h6></div>

~~~java
 WaypointMissionFinishedAction getFinishedAction() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Action the aircraft will take when the waypoint mission is complete.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionfinishedaction">WaypointMissionFinishedAction</a></td><td><font color="#666"><i>The action to execute when the waypoint mission finishes</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_headingmode"><div class="api-col left">Aircraft Heading</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_headingmode_inline">getHeadingMode</a></div></div><div class="inline-doc" id="djiwaypointmission_headingmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHeadingMode</h6></div>

~~~java
 WaypointMissionHeadingMode getHeadingMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Heading of the aircraft as it moves between waypoints. Default  is <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionheadingmode_auto">AUTO</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionheadingmode">WaypointMissionHeadingMode</a></td><td><font color="#666"><i>Heading mode.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_pointofinterest"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_pointofinterest_inline">getPointOfInterest</a></div></div><div class="inline-doc" id="djiwaypointmission_pointofinterest_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPointOfInterest</h6></div>

~~~java
 LocationCoordinate2D getPointOfInterest() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Aircraft heading will be fixed to the point of interest location during the waypoint mission. Used when <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_headingmode">getHeadingMode</a></code>  is <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionheadingmode_towardpointofinterest">TOWARD_POINT_OF_INTEREST</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></td><td><font color="#666"><i>Point of interest location.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_flightpathmode"><div class="api-col left">Flight Path</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_flightpathmode_inline">getFlightPathMode</a></div></div><div class="inline-doc" id="djiwaypointmission_flightpathmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlightPathMode</h6></div>

~~~java
 WaypointMissionFlightPathMode getFlightPathMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The path the aircraft follows between waypoints. The aircraft can either fly directly between waypoints in a straight line, or turn near a waypoint in the curve where the waypoint location defines a part of the curve.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionflightpathmode">WaypointMissionFlightPathMode</a></td><td><font color="#666"><i>The flight path mode.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_exitmissiononrcsignallost"><div class="api-col left">Connection Lost</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_exitmissiononrcsignallost_inline">isExitMissionOnRCSignalLostEnabled</a></div></div><div class="inline-doc" id="djiwaypointmission_exitmissiononrcsignallost_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isExitMissionOnRCSignalLostEnabled</h6></div>

~~~java
 boolean isExitMissionOnRCSignalLostEnabled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Determines whether the mission should stop when connection between the  aircraft and remote controller is lost. Default is <code>false</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if mission should stop when connection is lost.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_rotategimbalpitch"><div class="api-col left">Gimbal</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_rotategimbalpitch_inline">isGimbalPitchRotationEnabled</a></div></div><div class="inline-doc" id="djiwaypointmission_rotategimbalpitch_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isGimbalPitchRotationEnabled</h6></div>

~~~java
 boolean isGimbalPitchRotationEnabled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the gimbal pitch rotation can be controlled during the waypoint mission. When <code>true</code>, <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_gimbalpitch">gimbalPitch</a></code> in <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint">Waypoint</a></code> is used to control gimbal pitch.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if gimbal pitch can be controlled.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_repeattimes"><div class="api-col left">Repeat Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_repeattimes_inline">getRepeatTimes</a></div></div><div class="inline-doc" id="djiwaypointmission_repeattimes_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRepeatTimes</h6></div>

~~~java
 int getRepeatTimes() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Gets the repeat times of the mission.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Number of times to repeat mission</i></td></tr></table></html></div>


