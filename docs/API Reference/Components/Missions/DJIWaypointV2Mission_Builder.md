<div class="article"><h1 ><font color="#AAA">class </font>Builder</h1></div>

~~~java
 static class Builder 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">This class is used for the developer to build the WaypointV2Mission.



##### Class Members:

<div class="api-row" id="djiwaypointv2mission_builder_setmissionid"><div class="api-col left">Set Mission ID</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_builder_setmissionid_inline">setMissionID</a></div></div><div class="inline-doc" id="djiwaypointv2mission_builder_setmissionid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMissionID</h6></div>

~~~java
 Builder setMissionID(long missionID) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Set Mission ID.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">long <font color="#000">missionID</td><td><font color="#666"><i>The value of missionID to set.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2Mission_Builder.html#djiwaypointv2mission_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2mission_builder_setmaxflightspeed"><div class="api-col left">Set Max Flight Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_builder_setmaxflightspeed_inline">setMaxFlightSpeed</a></div></div><div class="inline-doc" id="djiwaypointv2mission_builder_setmaxflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMaxFlightSpeed</h6></div>

~~~java
 Builder setMaxFlightSpeed(float maxFlightSpeed) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">While the aircraft is travelling between waypoints, you can offset its speed by  using the throttle joystick  on the remote controller. <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_maxflightspeed">getMaxFlightSpeed</a></code> is this  offset when the joystick is pushed  to maximum deflection. For example, If  maxFlightSpeed is 10 m/s, then pushing the throttle joystick all the  way up will  add 10 m/s to the aircraft speed, while pushing down will subtract 10 m/s from the  aircraft speed. If the remote controller stick is not at maximum deflection, then  the offset speed will be  interpolated between [0, <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_maxflightspeed">getMaxFlightSpeed</a></code>] with a resolution  of 1000 steps. If the  offset speed is negative, then the aircraft will fly backwards  to previous waypoints. When it reaches the  first waypoint, it will then hover in place  until a positive speed is  applied. <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_maxflightspeed">getMaxFlightSpeed</a></code> has a range of [2,15] m/s.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">maxFlightSpeed</td><td><font color="#666"><i>The value of the max flight speed.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2Mission_Builder.html#djiwaypointv2mission_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2mission_builder_setautoflightspeed"><div class="api-col left">Set Auto Flight Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_builder_setautoflightspeed_inline">setAutoFlightSpeed</a></div></div><div class="inline-doc" id="djiwaypointv2mission_builder_setautoflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAutoFlightSpeed</h6></div>

~~~java
 Builder setAutoFlightSpeed(float autoFlightSpeed) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The base automatic speed of the aircraft as it moves between waypoints with range [-15, 15] m/s.  The aircraft's actual speed is a combination of the base automatic speed, and the speed control  given by  the throttle joystick on the remote controller. If <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_autoflightspeed">getAutoFlightSpeed</a></code> >0: Actual  speed is <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_autoflightspeed">getAutoFlightSpeed</a></code> + Joystick Speed (with combined max of <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_maxflightspeed">getMaxFlightSpeed</a></code>) If <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_autoflightspeed">getAutoFlightSpeed</a></code> =0:  Actual speed is  controlled only by the remote controller joystick. If <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_autoflightspeed">getAutoFlightSpeed</a></code> <0 and the aircraft  is at the first waypoint, the aircraft will hover in place until the speed is made positive by  the remote controller joystick.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">autoFlightSpeed</td><td><font color="#666"><i>The value of the auto flight speed.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2Mission_Builder.html#djiwaypointv2mission_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2mission_builder_setfinishedaction"><div class="api-col left">Set Finished Action</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_builder_setfinishedaction_inline">setFinishedAction</a></div></div><div class="inline-doc" id="djiwaypointv2mission_builder_setfinishedaction_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFinishedAction</h6></div>

~~~java
 Builder setFinishedAction(MissionFinishedAction finishedAction) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Action the aircraft will take when the waypoint mission is complete.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2mission_djiwaypointv2missionfinishedaction">MissionFinishedAction</a> <font color="#000">finishedAction</td><td><font color="#666"><i>The enum value of <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2mission_djiwaypointv2missionfinishedaction">MissionFinishedAction</a></code>.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2Mission_Builder.html#djiwaypointv2mission_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2mission_builder_setgotofirstwaypointmode"><div class="api-col left">Set Go To First Waypoint Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_builder_setgotofirstwaypointmode_inline">setGotoFirstWaypointMode</a></div></div><div class="inline-doc" id="djiwaypointv2mission_builder_setgotofirstwaypointmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setGotoFirstWaypointMode</h6></div>

~~~java
 Builder setGotoFirstWaypointMode(MissionGotoWaypointMode gotoFirstWaypointMode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Defines how the aircraft will go to the first waypoint from its current position.  Default is <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2missiongotofirstwaypointmode_safely">SAFELY</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2missiongotofirstwaypointmode">MissionGotoWaypointMode</a> <font color="#000">gotoFirstWaypointMode</td><td><font color="#666"><i>The enum value of <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2mission_djiwaypointv2missionfinishedaction">MissionFinishedAction</a></code>.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2Mission_Builder.html#djiwaypointv2mission_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2mission_builder_setexitmissiononrcsignallostenabled"><div class="api-col left">Set Exit Mission On RC Signal Lost</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_builder_setexitmissiononrcsignallostenabled_inline">setExitMissionOnRCSignalLostEnabled</a></div></div><div class="inline-doc" id="djiwaypointv2mission_builder_setexitmissiononrcsignallostenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setExitMissionOnRCSignalLostEnabled</h6></div>

~~~java
 Builder setExitMissionOnRCSignalLostEnabled(boolean exitMissionOnRCSignalLostEnabled) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Determines whether the mission should stop when connection between the aircraft and remote controller is lost. Default is <code>false</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">exitMissionOnRCSignalLostEnabled</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2Mission_Builder.html#djiwaypointv2mission_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2mission_builder_setrepeattimes"><div class="api-col left">Set Repeat Times</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_builder_setrepeattimes_inline">setRepeatTimes</a></div></div><div class="inline-doc" id="djiwaypointv2mission_builder_setrepeattimes_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setRepeatTimes</h6></div>

~~~java
 Builder setRepeatTimes(int repeatTimes) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Repeat times for mission execution. Default is 1.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">repeatTimes</td><td><font color="#666"><i>An int value of mission repeat times.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2Mission_Builder.html#djiwaypointv2mission_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2mission_builder_addwaypoints"><div class="api-col left">Add Waypoints</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_builder_addwaypoints_inline">addwaypoints</a></div></div><div class="inline-doc" id="djiwaypointv2mission_builder_addwaypoints_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addwaypoints</h6></div>

~~~java
 Builder addwaypoints(@NonNull List<WaypointV2> waypointList) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Adds an array of waypoints to the waypoint mission. When the waypoints are added  successfully, <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_waypointcount">getWaypointCount</a></code> will increment by the number of added waypoints.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull List&lt;<a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2">WaypointV2</a>&gt; <font color="#000">waypointList</td><td><font color="#666"><i>A list of <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2">WaypointV2</a></code> objects.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2Mission_Builder.html#djiwaypointv2mission_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2mission_builder_addwaypoint"><div class="api-col left">Add Waypoint</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_builder_addwaypoint_inline">addWaypoint</a></div></div><div class="inline-doc" id="djiwaypointv2mission_builder_addwaypoint_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addWaypoint</h6></div>

~~~java
 Builder addWaypoint(@NonNull WaypointV2 waypoint) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">As same as Waypoint 1.0 Add a waypoint to the waypoint mission. When a waypoint is added  successfully, <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_waypointcount">getWaypointCount</a></code> will increment by 1. A waypoint will only be valid  if the distance (in three dimensions) between two adjacent waypoints is in range [0.5,2000] meters.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2">WaypointV2</a> <font color="#000">waypoint</td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2">WaypointV2</a></code> object.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2Mission_Builder.html#djiwaypointv2mission_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2mission_builder_removewaypoint"><div class="api-col left">Remove Waypoint</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_builder_removewaypoint_inline">removeWaypoint</a></div></div><div class="inline-doc" id="djiwaypointv2mission_builder_removewaypoint_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeWaypoint</h6></div>

~~~java
 Builder removeWaypoint(@NonNull WaypointV2 waypoint) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">As same as Waypoint 1.0, removes the last waypoint stored in the mission. When the waypoint is removed  successfully, <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_waypointcount">getWaypointCount</a></code> will decrease by 1.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2">WaypointV2</a> <font color="#000">waypoint</td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2">WaypointV2</a></code> object.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2Mission_Builder.html#djiwaypointv2mission_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2mission_builder_removewaypointbyindex"><div class="api-col left">Remove Waypoint By Index</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_builder_removewaypointbyindex_inline">removeWaypoint</a></div></div><div class="inline-doc" id="djiwaypointv2mission_builder_removewaypointbyindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeWaypoint</h6></div>

~~~java
 Builder removeWaypoint(@NonNull int index) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">As same as Waypoint 1.0, removes the last waypoint stored in the mission. When the waypoint is removed  successfully, <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_waypointcount">getWaypointCount</a></code> will decrease by 1.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull int <font color="#000">index</td><td><font color="#666"><i>The index of the waypoint.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2Mission_Builder.html#djiwaypointv2mission_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2mission_builder_build"><div class="api-col left">Waypoint V2 Mission Builder</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2mission_builder_build_inline">build</a></div></div><div class="inline-doc" id="djiwaypointv2mission_builder_build_inline"

><div class="article"><h6 ><font color="#AAA">method </font>build</h6></div>

~~~java
 WaypointV2Mission build() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Build a <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission">WaypointV2Mission</a></code> object.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission">WaypointV2Mission</a></td><td><font color="#666"><i>The object of <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission">WaypointV2Mission</a></code>.</i></td></tr></table></html></div>


