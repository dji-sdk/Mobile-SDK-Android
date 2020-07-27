<div class="article"><h1 ><font color="#AAA">class </font>WaypointV2Mission</h1></div>

~~~java
 class WaypointV2Mission 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">In the waypoint mission, the aircraft will travel between waypoints, execute actions at waypoints, and adjust  heading and altitude between waypoints. Waypoints are physical locations to which the aircraft  will fly. Creating  a series of waypoints, in effect, will program a flight route for the aircraft to follow. Actions can also be added  to waypoints, which will be carried out when the aircraft reaches the  waypoint. The aircraft travels between waypoints  automatically at a base speed. However, the user can  change the speed by using the pitch joystick. If the stick is  pushed up, the speed will increase. If the stick is pushed down, the speed will slow down. The stick can be pushed down  to stop the aircraft  and further pushed to start making the aircraft travel back along the path it came. When the aircraft  is travelling through waypoints in the reverse order, it will not execute waypoint actions at each  waypoint. If the stick is  released, the aircraft will again travel through the waypoints in the original  order, and continue to execute waypoint actions  (even if executed previously). If the aircraft is pulled  back along the waypoint mission all the way to the first waypoint, then  it will hover in place until the  stick is released enough for it to again progress through the mission from start to finish. It is  only supported by <code><a href="/BaseClasses/DJIBaseProduct.html#djiaircraft_djiaircraftmodelnamematrice300rtk">MATRICE_300_RTK</a></code>.



##### Class Members:

<div class="api-row" id="djiwaypointv2mission_iscomplete"><div class="api-col left">Mission Download</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_iscomplete_inline">isComplete</a></div></div><div class="inline-doc" id="djiwaypointv2mission_iscomplete_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isComplete</h6></div>

~~~java
 boolean isComplete() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">When downloading a waypoint mission, the number of waypoints in <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_allwaypoints">getWaypointList</a></code> will be  less than <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_waypointcount">getWaypointCount</a></code> until the download is complete. This property is <code>true</code> when all  the information in the waypoint mission is downloaded, and complete in this object.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2mission_checkparameters"><div class="api-col left">Check Parameters</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_checkparameters_inline">checkParameters</a></div></div><div class="inline-doc" id="djiwaypointv2mission_checkparameters_inline"

><div class="article"><h6 ><font color="#AAA">method </font>checkParameters</h6></div>

~~~java
@Nullable
 DJIError checkParameters() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Checks if the configuration for the mission is valid before loading it into <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator">WaypointV2MissionOperator</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>Error found when checking parameters of the waypoint. <code>nil</code> if all the parameters are valid.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2mission_missionid"><div class="api-col left">Mission ID</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_missionid_inline">getMissionID</a></div></div><div class="inline-doc" id="djiwaypointv2mission_missionid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMissionID</h6></div>

~~~java
 long getMissionID() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The Mission ID.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">long</td><td><font color="#666"><i>A long value of Mission ID.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2mission_waypointcount"><div class="api-col left">Waypoint Count</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_waypointcount_inline">getWaypointCount</a></div></div><div class="inline-doc" id="djiwaypointv2mission_waypointcount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWaypointCount</h6></div>

~~~java
 int getWaypointCount() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Number of waypoints in the waypoint mission. Note there are some cases when the waypoint count will be different to the  waypoint array length from <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_allwaypoints">getWaypointList</a></code>. This is usually the case when the waypoint  mission is still being downloaded  from the aircraft and the mission object hasn't  existed previously (e.g. when the mobile device is connected to an aircraft  with a previously uploaded mission). In these cases, <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_iscomplete">isComplete</a></code>  will return <code>true</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of waypoint count.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2mission_maxflightspeed"><div class="api-col left">Max Flight Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_maxflightspeed_inline">getMaxFlightSpeed</a></div></div><div class="inline-doc" id="djiwaypointv2mission_maxflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMaxFlightSpeed</h6></div>

~~~java
 float getMaxFlightSpeed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">While the aircraft is travelling between waypoints, you can offset its speed by using the throttle joystick  on the remote controller. <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_maxflightspeed">getMaxFlightSpeed</a></code>  is this offset when the joystick is pushed  to maximum deflection. For example, If maxFlightSpeed is 10 m/s, then pushing the throttle joystick all the  way up will add 10 m/s to the aircraft speed, while pushing down will subtract 10 m/s from the aircraft  speed. If the remote controller stick is not at  maximum deflection, then the offset speed will be  interpolated between [0, <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_maxflightspeed">getMaxFlightSpeed</a></code>] with a resolution of 1000 steps. If the  offset speed is  negative, then the aircraft will fly backwards to previous waypoints. When it reaches the  first waypoint, it will then hover in place until a positive speed is  applied. <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_maxflightspeed">getMaxFlightSpeed</a></code> has a range of [2,15] m/s.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of max flight speed.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2mission_autoflightspeed"><div class="api-col left">Auto Flight Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_autoflightspeed_inline">getAutoFlightSpeed</a></div></div><div class="inline-doc" id="djiwaypointv2mission_autoflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAutoFlightSpeed</h6></div>

~~~java
 float getAutoFlightSpeed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The base automatic speed of the aircraft as it moves between waypoints with range [-15, 15] m/s. The aircraft's actual speed is a combination of the base automatic speed,  and the speed control given by the throttle joystick on the remote controller. If <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_autoflightspeed">getAutoFlightSpeed</a></code> >0: Actual  speed is <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_autoflightspeed">getAutoFlightSpeed</a></code> + Joystick Speed (with combined max  of <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_maxflightspeed">getMaxFlightSpeed</a></code>) If <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_autoflightspeed">getAutoFlightSpeed</a></code> =0: Actual speed is  controlled only by the remote controller joystick. If <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_autoflightspeed">getAutoFlightSpeed</a></code> <0 and the  aircraft is at the first waypoint,  the aircraft will hover in place until the speed is made positive by the remote controller joystick.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of auto flight speed.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2mission_finishedaction"><div class="api-col left">End Mission Behavior</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_finishedaction_inline">getFinishedAction</a></div></div><div class="inline-doc" id="djiwaypointv2mission_finishedaction_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFinishedAction</h6></div>

~~~java
 MissionFinishedAction getFinishedAction() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Action the aircraft will take when the waypoint mission is complete.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2mission_djiwaypointv2missionfinishedaction">MissionFinishedAction</a></td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2mission_djiwaypointv2missionfinishedaction">MissionFinishedAction</a></code> enum value.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2mission_gotofirstwaypointmode"><div class="api-col left">Start Mission behavior</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_gotofirstwaypointmode_inline">getGotoFirstWaypointMode</a></div></div><div class="inline-doc" id="djiwaypointv2mission_gotofirstwaypointmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getGotoFirstWaypointMode</h6></div>

~~~java
 MissionGotoWaypointMode getGotoFirstWaypointMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Defines how the aircraft will go to the first waypoint from its current position. Default  is <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2missiongotofirstwaypointmode_safely">SAFELY</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2missiongotofirstwaypointmode">MissionGotoWaypointMode</a></td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2missiongotofirstwaypointmode">MissionGotoWaypointMode</a></code> enum value.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2mission_exitmissiononrcsignallost"><div class="api-col left">Exit Mission On RC Signal Lost</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_exitmissiononrcsignallost_inline">isExitMissionOnRCSignalLostEnabled</a></div></div><div class="inline-doc" id="djiwaypointv2mission_exitmissiononrcsignallost_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isExitMissionOnRCSignalLostEnabled</h6></div>

~~~java
 boolean isExitMissionOnRCSignalLostEnabled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Determines whether the mission should stop when connection between the aircraft and remote controller is lost. Default is <code>false</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2mission_repeattimes"><div class="api-col left">Repeat Times</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_repeattimes_inline">getRepeatTimes</a></div></div><div class="inline-doc" id="djiwaypointv2mission_repeattimes_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRepeatTimes</h6></div>

~~~java
 int getRepeatTimes() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Mission execution can be repeated more than once. A value of 0 means the mission only executes once, and does not repeat. A value of 1 means the  mission will execute a total of two times.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of mission repeart times.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2mission_getwaypointatindex"><div class="api-col left">Get Waypoint At Index</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_getwaypointatindex_inline">getWaypointAtIndex</a></div></div><div class="inline-doc" id="djiwaypointv2mission_getwaypointatindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWaypointAtIndex</h6></div>

~~~java
 @Nullable WaypointV2 getWaypointAtIndex(int index) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Gets the waypoint at the specified index in the mission waypoint array.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">index</td><td><font color="#666"><i>Index of the waypoint to be retrieved.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2">WaypointV2</a></td><td><font color="#666"><i>The <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2">WaypointV2</a></code> at the specified index.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2mission_allwaypoints"><div class="api-col left">Get All Waypoints</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_allwaypoints_inline">getWaypointList</a></div></div><div class="inline-doc" id="djiwaypointv2mission_allwaypoints_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWaypointList</h6></div>

~~~java
 List<WaypointV2> getWaypointList() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Returns an array of all waypoints in the mission.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;<a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2">WaypointV2</a>&gt;</td><td><font color="#666"><i>An array of <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2">WaypointV2</a></code> instances contained in the mission.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2mission_builder"><div class="api-col left">Make Mission</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2Mission_Builder.html">Builder</a></div></div>

##### Related:

<div class="api-row" id="djiwaypointv2"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2.html">WaypointV2</a></div></div><div class="api-row" id="djiwaypointv2missiongotofirstwaypointmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2missiongotofirstwaypointmode_inline">MissionGotoWaypointMode</a></div></div><div class="inline-doc" id="djiwaypointv2missiongotofirstwaypointmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>MissionGotoWaypointMode</h6></div>

~~~java
 enum MissionGotoWaypointMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Possible flight mode to executes the mission.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2missiongotofirstwaypointmode_safely_inline"></a>SAFELY</td><td><font color="#666">Go to the waypoint safely. The aircraft will rise to the same altitude of the waypoint if the current  altitude is lower then the waypoint altitude. It then goes to the waypoint coordinate from the current  altitude, and proceeds to the altitude of the waypoint.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2missiongotofirstwaypointmode_pointtopoint_inline"></a>POINT_TO_POINT</td><td><font color="#666">Go to the waypoint from the current aircraft point to the waypoint directly.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiwaypointv2mission_djiwaypointv2missionexecutionstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_djiwaypointv2missionexecutionstate_inline">WaypointV2MissionExecuteState</a></div></div><div class="inline-doc" id="djiwaypointv2mission_djiwaypointv2missionexecutionstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>WaypointV2MissionExecuteState</h6></div>

~~~java
 enum WaypointV2MissionExecuteState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Current waypoint mission executing state.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2mission_djiwaypointv2missionexecutionstate_initializing_inline"></a>INITIALIZING</td><td><font color="#666">Waypoint mission is initializing, which means the mission has started.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2mission_djiwaypointv2missionexecutionstate_gotofirstwaypoint_inline"></a>GO_TO_FIRST_WAYPOINT</td><td><font color="#666">Aircraft is currently is going to the first waypoint.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2mission_djiwaypointv2missionexecutionstate_moving_inline"></a>MOVING</td><td><font color="#666">Aircraft is currently moving.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2mission_djiwaypointv2missionexecutionstate_interrupted_inline"></a>INTERRUPTED</td><td><font color="#666">Aircraft is currently interrupted by user.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2mission_djiwaypointv2missionexecutionstate_finished_inline"></a>FINISHED</td><td><font color="#666">The aircraft finished the waypoint mission and is leaving from the last waypoint.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2mission_djiwaypointv2missionexecutionstate_gohome_inline"></a>GO_HOME</td><td><font color="#666">Aircraft has returned to the home point. This happens when the <code>DJIMutableWaypointV2Mission_finishedAction</code>  is set to <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2mission_djiwaypointv2missionfinishedaction_gohome">GO_HOME</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2mission_djiwaypointv2missionexecutionstate_landing_inline"></a>LANDING</td><td><font color="#666">Aircraft has been landing. This happens when the <code><a href="/Components/Missions/DJIWaypointV2Mission_Builder.html#djiwaypointv2mission_builder_setfinishedaction">setFinishedAction</a></code> is set  to <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2mission_djiwaypointv2missionfinishedaction_autolanding">AUTO_LAND</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2mission_djiwaypointv2missionexecutionstate_returntofirstwaypoint_inline"></a>RETURN_TO_FIRST_WAYPOINT</td><td><font color="#666">Aircraft has returned to the first waypoint. This happens when the <code><a href="/Components/Missions/DJIWaypointV2Mission_Builder.html#djiwaypointv2mission_builder_setfinishedaction">setFinishedAction</a></code>  is set to <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2mission_djiwaypointv2missionfinishedaction_gotofirstwaypoint">GO_FIRST_WAYPOINT</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2mission_djiwaypointv2missionexecutionstate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown execution state.</td></tr></table></html>

##### Class Members:

</div>


