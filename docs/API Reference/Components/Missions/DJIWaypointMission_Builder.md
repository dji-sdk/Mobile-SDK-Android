<div class="article"><h1 ><font color="#AAA">class </font>Builder</h1></div>

~~~java
 static class Builder 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Class builder.



##### Class Members:

<div class="api-row" id="djiwaypointmission_builder_auto"><div class="api-col left">Constructor</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_auto_inline">Builder</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_auto_inline"

><div class="article"><h6 ><font color="#AAA">method </font>Builder</h6></div>

~~~java
 Builder() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Default constructor of waypoint mission with 0 waypoints.

</div>

<div class="api-row" id="djiwaypointmission_builder_waypointmission"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_waypointmission_inline">Builder</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_waypointmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>Builder</h6></div>

~~~java
 Builder(WaypointMission waypointMissionToClone) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Waypoint mission constructor that clones this waypoint mission from another.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission">WaypointMission</a> <font color="#000">waypointMissionToClone</td><td><font color="#666"><i>Waypoint mission to clone</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_addwaypoint"><div class="api-col left">Waypoints</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_addwaypoint_inline">addWaypoint</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_addwaypoint_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addWaypoint</h6></div>

~~~java
 Builder addWaypoint(@NonNull Waypoint waypoint) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Add a waypoint to the waypoint mission.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIWaypoint.html#djiwaypoint">Waypoint</a> <font color="#000">waypoint</td><td><font color="#666"><i>Waypoint to add.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJIWaypointMission_Builder.html#djiwaypointmission_builder">Builder</a></code> object</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_removewaypoint"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_removewaypoint_inline">removeWaypoint</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_removewaypoint_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeWaypoint</h6></div>

~~~java
 Builder removeWaypoint(@NonNull Waypoint waypoint) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Remove a waypoint from the waypoint mission.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIWaypoint.html#djiwaypoint">Waypoint</a> <font color="#000">waypoint</td><td><font color="#666"><i>Waypoint to remove.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJIWaypointMission_Builder.html#djiwaypointmission_builder">Builder</a></code> object</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_removewaypointwithindex"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_removewaypointwithindex_inline">removeWaypoint</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_removewaypointwithindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeWaypoint</h6></div>

~~~java
 Builder removeWaypoint(@NonNull int index) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Remove a waypoint by index from the waypoint mission.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull int <font color="#000">index</td><td><font color="#666"><i>Index of waypoint to remove.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJIWaypointMission_Builder.html#djiwaypointmission_builder">Builder</a></code> object</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_getwaypointlist"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_getwaypointlist_inline">getWaypointList</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_getwaypointlist_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWaypointList</h6></div>

~~~java
 List<Waypoint> getWaypointList() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">List of waypoints that will define this mission



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;<a href="/Components/Missions/DJIWaypoint.html#djiwaypoint">Waypoint</a>&gt;</td><td><font color="#666"><i>List of waypoints</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_insertwaypoint"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_insertwaypoint_inline">insertWaypoint</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_insertwaypoint_inline"

><div class="article"><h6 ><font color="#AAA">method </font>insertWaypoint</h6></div>

~~~java
 Builder insertWaypoint(@NonNull Waypoint waypoint, int index) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Insert a waypoint to the waypoint mission.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIWaypoint.html#djiwaypoint">Waypoint</a> <font color="#000">waypoint</td><td><font color="#666"><i>Waypoint to insert.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">index</td><td><font color="#666"><i>index to insert the waypoint.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJIWaypointMission_Builder.html#djiwaypointmission_builder">Builder</a></code> object</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_waypointcount"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_waypointcount_inline">waypointCount</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_waypointcount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>waypointCount</h6></div>

~~~java
 Builder waypointCount(int waypointCount) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Number of waypoints in the waypoint mission. This must be set to the correct number of waypoints added to the mission.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">waypointCount</td><td><font color="#666"><i>Waypoint count.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJIWaypointMission_Builder.html#djiwaypointmission_builder">Builder</a></code> object</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_getwaypointcount"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_getwaypointcount_inline">getWaypointCount</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_getwaypointcount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWaypointCount</h6></div>

~~~java
 int getWaypointCount() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Number of waypoints in the waypoint mission.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Waypoint count.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_waypointlist"><div class="api-col left">Waypoint</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_waypointlist_inline">waypointList</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_waypointlist_inline"

><div class="article"><h6 ><font color="#AAA">method </font>waypointList</h6></div>

~~~java
@Deprecated
 Builder waypointList(
            @NonNull @Size(max = MAX_WAYPOINT_COUNT, min = MIN_WAYPOINT_COUNT) List<Waypoint> waypointList) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">List of waypoints that will define this mission



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull @Size(max = MAX_WAYPOINT_COUNT, min = MIN_WAYPOINT_COUNT) List&lt;<a href="/Components/Missions/DJIWaypoint.html#djiwaypoint">Waypoint</a>&gt; <font color="#000">waypointList</td><td><font color="#666"><i>List of waypoints</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJIWaypointMission_Builder.html#djiwaypointmission_builder">Builder</a></code> object</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_getmissionid"><div class="api-col left">Mission ID</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_getmissionid_inline">getMissionID</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_getmissionid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMissionID</h6></div>

~~~java
 int getMissionID() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Get mission id.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Mission id.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_setmissionid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_setmissionid_inline">setMissionID</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_setmissionid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMissionID</h6></div>

~~~java
 Builder setMissionID(@IntRange(from = 0, to = 65535) int id) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Set mission id.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 65535) int <font color="#000">id</td><td><font color="#666"><i>The id of mission. The valid range is [0, 65535].</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJIWaypointMission_Builder.html#djiwaypointmission_builder">Builder</a></code> object.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_calculatetotaldistance"><div class="api-col left">Distance</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_calculatetotaldistance_inline">calculateTotalDistance</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_calculatetotaldistance_inline"

><div class="article"><h6 ><font color="#AAA">method </font>calculateTotalDistance</h6></div>

~~~java
 float calculateTotalDistance() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Calculate the total distance of the waypoint list.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>The total distance of the waypoint list.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_getlastcalculatedtotaldistance"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_getlastcalculatedtotaldistance_inline">getLastCalculatedTotalDistance</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_getlastcalculatedtotaldistance_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLastCalculatedTotalDistance</h6></div>

~~~java
 float getLastCalculatedTotalDistance() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Get the last calculated total distance of the waypoint list.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>The last calculated total distance of the waypoint list.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_calculatetotaltime"><div class="api-col left">Time</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_calculatetotaltime_inline">calculateTotalTime</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_calculatetotaltime_inline"

><div class="article"><h6 ><font color="#AAA">method </font>calculateTotalTime</h6></div>

~~~java
 Float calculateTotalTime() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Calculate the total time of the waypoint list.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Float</td><td><font color="#666"><i>The total time of the waypoint list.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_getlastcalculatedtotaltime"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_getlastcalculatedtotaltime_inline">getLastCalculatedTotalTime</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_getlastcalculatedtotaltime_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLastCalculatedTotalTime</h6></div>

~~~java
 Float getLastCalculatedTotalTime() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Get the last calculated total time of the waypoint list.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Float</td><td><font color="#666"><i>The last calculated total time of the waypoint list.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_maxflightspeed"><div class="api-col left">Flight Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_maxflightspeed_inline">maxFlightSpeed</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_maxflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>maxFlightSpeed</h6></div>

~~~java
 Builder maxFlightSpeed(
            @FloatRange(from = MIN_FLIGHT_SPEED, to = MAX_FLIGHT_SPEED) float maxFlightSpeed) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">While the aircraft is travelling between waypoints, you can offset its speed by using the throttle joystick  on the remote controller. <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_maxflightspeed">getMaxFlightSpeed</a></code> is this offset when the joystick is pushed  to maximum deflection. For example, If maxFlightSpeed is 10 m/s, then pushing the throttle joystick all the  way up will add 10 m/s to the aircraft speed, while pushing down will subtract 10 m/s from the aircraft  speed. If the remote controller stick is not at maximum deflection, then the offset speed will be  interpolated between [0, <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_maxflightspeed">getMaxFlightSpeed</a></code>] with a resolution of 1000 steps. If the  offset speed is negative, then the aircraft will fly backwards to previous waypoints. When it reaches the  first waypoint, it will then hover in place until a positive speed is  applied. <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_maxflightspeed">getMaxFlightSpeed</a></code> has a range of [2,15] m/s.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@FloatRange(from = MIN_FLIGHT_SPEED, to = MAX_FLIGHT_SPEED) float <font color="#000">maxFlightSpeed</td><td><font color="#666"><i>Flight speed in m/s</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJIWaypointMission_Builder.html#djiwaypointmission_builder">Builder</a></code> object</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_getmaxflightspeed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_getmaxflightspeed_inline">getMaxFlightSpeed</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_getmaxflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMaxFlightSpeed</h6></div>

~~~java
 float getMaxFlightSpeed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">While the aircraft is travelling between waypoints, you can offset its speed by using the throttle joystick  on the remote controller. <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_maxflightspeed">getMaxFlightSpeed</a></code> is this offset when the joystick is pushed  to maximum deflection. For example, If maxFlightSpeed is 10 m/s, then pushing the throttle joystick all the  way up will add 10 m/s to the aircraft speed, while pushing down will subtract 10 m/s from the aircraft  speed. If the remote controller stick is not at maximum deflection, then the offset speed will be  interpolated between [0, <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_maxflightspeed">getMaxFlightSpeed</a></code>] with a resolution of 1000 steps. If the  offset speed is negative, then the aircraft will fly backwards to previous waypoints. When it reaches the  first waypoint, it will then hover in place until a positive speed is  applied. <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_maxflightspeed">getMaxFlightSpeed</a></code> has a range of [2,15] m/s.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>Flight speed in m/s</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_autoflightspeed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_autoflightspeed_inline">autoFlightSpeed</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_autoflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>autoFlightSpeed</h6></div>

~~~java
 Builder autoFlightSpeed(
            @FloatRange(from = MIN_AUTO_FLIGHT_SPEED, to = MAX_AUTO_FLIGHT_SPEED) float autoFlightSpeed) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The base automatic speed of the aircraft as it moves between waypoints with range [-15, 15] m/s. The  aircraft's actual speed is a combination of the base automatic speed, and the speed control given by  the throttle joystick on the remote controller. If <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_autoflightspeed">getAutoFlightSpeed</a></code> >0: Actual  speed is <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_autoflightspeed">getAutoFlightSpeed</a></code> + Joystick Speed (with combined max  of <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_maxflightspeed">getMaxFlightSpeed</a></code>) If <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_autoflightspeed">getAutoFlightSpeed</a></code> =0: Actual speed is  controlled only by the remote controller joystick. If <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_autoflightspeed">getAutoFlightSpeed</a></code> <0 and the  aircraft is at the first waypoint, the aircraft will hover in place until the speed is made positive by  the remote controller joystick.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@FloatRange(from = MIN_AUTO_FLIGHT_SPEED, to = MAX_AUTO_FLIGHT_SPEED) float <font color="#000">autoFlightSpeed</td><td><font color="#666"><i>Flight speed in m/s</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJIWaypointMission_Builder.html#djiwaypointmission_builder">Builder</a></code> object</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_getautoflightspeed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_getautoflightspeed_inline">getAutoFlightSpeed</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_getautoflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAutoFlightSpeed</h6></div>

~~~java
 float getAutoFlightSpeed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The base automatic speed of the aircraft as it moves between waypoints with range [-15, 15] m/s. The  aircraft's actual speed is a combination of the base automatic speed, and the speed control given by  the throttle joystick on the remote controller. If <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_autoflightspeed">getAutoFlightSpeed</a></code> >0: Actual  speed is <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_autoflightspeed">getAutoFlightSpeed</a></code> + Joystick Speed (with combined max  of <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_maxflightspeed">getMaxFlightSpeed</a></code>) If <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_autoflightspeed">getAutoFlightSpeed</a></code> =0: Actual speed is  controlled only by the remote controller joystick. If <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_autoflightspeed">getAutoFlightSpeed</a></code> <0 and the  aircraft is at the first waypoint, the aircraft will hover in place until the speed is made positive by  the remote controller joystick.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>Flight speed in m/s</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_gotofirstwaypointmode"><div class="api-col left">Start Mission Behavior</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_gotofirstwaypointmode_inline">gotoFirstWaypointMode</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_gotofirstwaypointmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>gotoFirstWaypointMode</h6></div>

~~~java
 Builder gotoFirstWaypointMode(@NonNull WaypointMissionGotoWaypointMode gotoFirstWaypointMode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Defines how the aircraft will go to the first waypoint from its current position. Default  is <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissiongotowaypointmode_safely">SAFELY</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissiongotowaypointmode">WaypointMissionGotoWaypointMode</a> <font color="#000">gotoFirstWaypointMode</td><td><font color="#666"><i>Behavior prior to mission start.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJIWaypointMission_Builder.html#djiwaypointmission_builder">Builder</a></code> object</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_getgotofirstwaypointmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_getgotofirstwaypointmode_inline">getGotoFirstWaypointMode</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_getgotofirstwaypointmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getGotoFirstWaypointMode</h6></div>

~~~java
 WaypointMissionGotoWaypointMode getGotoFirstWaypointMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Defines how the aircraft will go to the first waypoint from its current position. Default  is <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissiongotowaypointmode_safely">SAFELY</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissiongotowaypointmode">WaypointMissionGotoWaypointMode</a></td><td><font color="#666"><i>The behavior of the aircraft at the begining of the mission</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_finishedaction"><div class="api-col left">End Mission Behvaior</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_finishedaction_inline">finishedAction</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_finishedaction_inline"

><div class="article"><h6 ><font color="#AAA">method </font>finishedAction</h6></div>

~~~java
 Builder finishedAction(@NonNull WaypointMissionFinishedAction finishedAction) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Action the aircraft will take when the waypoint mission is complete.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionfinishedaction">WaypointMissionFinishedAction</a> <font color="#000">finishedAction</td><td><font color="#666"><i>Behavior of aircraft when mission is complete.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJIWaypointMission_Builder.html#djiwaypointmission_builder">Builder</a></code> object</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_getfinishedaction"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_getfinishedaction_inline">getFinishedAction</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_getfinishedaction_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFinishedAction</h6></div>

~~~java
 WaypointMissionFinishedAction getFinishedAction() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Action the aircraft will take when the waypoint mission is complete.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionfinishedaction">WaypointMissionFinishedAction</a></td><td><font color="#666"><i>The action to execute when the waypoint mission finishes</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_headingmode"><div class="api-col left">Aircraft Heading</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_headingmode_inline">headingMode</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_headingmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>headingMode</h6></div>

~~~java
 Builder headingMode(@NonNull WaypointMissionHeadingMode headingMode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Heading of the aircraft as it moves between waypoints. Default  is <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionheadingmode_auto">AUTO</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionheadingmode">WaypointMissionHeadingMode</a> <font color="#000">headingMode</td><td><font color="#666"><i>The heading mode.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJIWaypointMission_Builder.html#djiwaypointmission_builder">Builder</a></code> object</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_getheadingmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_getheadingmode_inline">getHeadingMode</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_getheadingmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHeadingMode</h6></div>

~~~java
 WaypointMissionHeadingMode getHeadingMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Heading of the aircraft as it moves between waypoints. Default  is <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionheadingmode_auto">AUTO</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionheadingmode">WaypointMissionHeadingMode</a></td><td><font color="#666"><i>Heading mode.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_setpointofinterest"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_setpointofinterest_inline">setPointOfInterest</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_setpointofinterest_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPointOfInterest</h6></div>

~~~java
 Builder setPointOfInterest(@NonNull LocationCoordinate2D pointOfInterest) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Aircraft heading will be fixed to the point of interest location during the waypoint mission. Used when <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_headingmode">getHeadingMode</a></code>  is <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionheadingmode_towardpointofinterest">TOWARD_POINT_OF_INTEREST</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a> <font color="#000">pointOfInterest</td><td><font color="#666"><i>Point of interest location.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJIWaypointMission_Builder.html#djiwaypointmission_builder">Builder</a></code> object</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_getpointofinterest"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_getpointofinterest_inline">getPointOfInterest</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_getpointofinterest_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPointOfInterest</h6></div>

~~~java
 LocationCoordinate2D getPointOfInterest() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Aircraft heading will be fixed to the point of interest location during the waypoint mission. Used when <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_headingmode">getHeadingMode</a></code>  is <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionheadingmode_towardpointofinterest">TOWARD_POINT_OF_INTEREST</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></td><td><font color="#666"><i>Point of interest location.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_flightpathmode"><div class="api-col left">Flight Path</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_flightpathmode_inline">flightPathMode</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_flightpathmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>flightPathMode</h6></div>

~~~java
 Builder flightPathMode(@NonNull WaypointMissionFlightPathMode flightPathMode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The path the aircraft follows between waypoints. The aircraft can either fly directly between waypoints in a straight line, or turn near a waypoint in the curve where the waypoint location defines a part of the curve.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionflightpathmode">WaypointMissionFlightPathMode</a> <font color="#000">flightPathMode</td><td><font color="#666"><i>The flight path mode.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJIWaypointMission_Builder.html#djiwaypointmission_builder">Builder</a></code> object</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_getflightpathmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_getflightpathmode_inline">getFlightPathMode</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_getflightpathmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlightPathMode</h6></div>

~~~java
 WaypointMissionFlightPathMode getFlightPathMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The path the aircraft follows between waypoints. The aircraft can either fly directly between waypoints in a straight line, or turn near a waypoint in the curve where the waypoint location defines a part of the curve.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionflightpathmode">WaypointMissionFlightPathMode</a></td><td><font color="#666"><i>The flight path mode.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_setexitmissiononrcsignallostenabled"><div class="api-col left">Connection Lost</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_setexitmissiononrcsignallostenabled_inline">setExitMissionOnRCSignalLostEnabled</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_setexitmissiononrcsignallostenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setExitMissionOnRCSignalLostEnabled</h6></div>

~~~java
 Builder setExitMissionOnRCSignalLostEnabled(boolean enabled) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Determines whether the mission should stop when connection between the  aircraft and remote controller is lost. Default is <code>false</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> if mission should stop when connection is lost.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJIWaypointMission_Builder.html#djiwaypointmission_builder">Builder</a></code> object</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_isexitmissiononrcsignallostenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_isexitmissiononrcsignallostenabled_inline">isExitMissionOnRCSignalLostEnabled</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_isexitmissiononrcsignallostenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isExitMissionOnRCSignalLostEnabled</h6></div>

~~~java
 boolean isExitMissionOnRCSignalLostEnabled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Determines whether the mission should stop when connection between the  aircraft and remote controller is lost. Default is <code>false</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if mission should stop when connection is lost.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_setgimbalpitchrotationenabled"><div class="api-col left">Gimbal</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_setgimbalpitchrotationenabled_inline">setGimbalPitchRotationEnabled</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_setgimbalpitchrotationenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setGimbalPitchRotationEnabled</h6></div>

~~~java
 Builder setGimbalPitchRotationEnabled(boolean gimbalPitchRotationEnabled) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the gimbal pitch rotation can be controlled during the waypoint mission. When <code>true</code>, <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_gimbalpitch">gimbalPitch</a></code> in <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint">Waypoint</a></code> is used to control gimbal pitch.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">gimbalPitchRotationEnabled</td><td><font color="#666"><i><code>true</code> if gimbal pitch can be controlled.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJIWaypointMission_Builder.html#djiwaypointmission_builder">Builder</a></code> object</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_isgimbalpitchrotationenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_isgimbalpitchrotationenabled_inline">isGimbalPitchRotationEnabled</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_isgimbalpitchrotationenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isGimbalPitchRotationEnabled</h6></div>

~~~java
 boolean isGimbalPitchRotationEnabled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the gimbal pitch rotation can be controlled during the waypoint mission. When <code>true</code>, <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_gimbalpitch">gimbalPitch</a></code> in <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint">Waypoint</a></code> is used to control gimbal pitch.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if gimbal pitch can be controlled.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_repeattimes"><div class="api-col left">Repeat Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_repeattimes_inline">repeatTimes</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_repeattimes_inline"

><div class="article"><h6 ><font color="#AAA">method </font>repeatTimes</h6></div>

~~~java
 Builder repeatTimes(@IntRange(from = MIN_REPEAT_TIME, to = MAX_REPEAT_TIME) int repeatTimes) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Mission execution can be repeated more than once. The value range is [1, 255]. If 255 is selected,  then the mission will continue to be executed until <code><a href="/Components/Missions/DJIWaypointMissionOperator.html#djiwaypointmissionoperator_stopmission">stopMission</a></code> is  called or any error occurs. Other values represent the exact execution times of the mission.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = MIN_REPEAT_TIME, to = MAX_REPEAT_TIME) int <font color="#000">repeatTimes</td><td><font color="#666"><i>Number of times to repeat mission, the value should be larger than 0.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJIWaypointMission_Builder.html#djiwaypointmission_builder">Builder</a></code> object</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_getrepeattimes"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_getrepeattimes_inline">getRepeatTimes</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_getrepeattimes_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRepeatTimes</h6></div>

~~~java
 int getRepeatTimes() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Gets the repeat times of the mission builder.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Number of times to repeat mission.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_ismissioncomplete"><div class="api-col left">Mission Download</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_ismissioncomplete_inline">isMissionComplete</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_ismissioncomplete_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isMissionComplete</h6></div>

~~~java
 boolean isMissionComplete() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">When downloading a waypoint mission, the number of waypoints in  <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_allwaypoints">getWaypointList</a></code> will be less than  <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_waypointcount">getWaypointCount</a></code> until the download is complete. This property is <code>true</code> when all the information in the waypoint mission is downloaded, and complete in this object.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if mission information is complete.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointmission_builder_build"><div class="api-col left">Build</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointmission_builder_build_inline">build</a></div></div><div class="inline-doc" id="djiwaypointmission_builder_build_inline"

><div class="article"><h6 ><font color="#AAA">method </font>build</h6></div>

~~~java
 WaypointMission build() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Build the object into a <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission">WaypointMission</a></code> object.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission">WaypointMission</a></td><td><font color="#666"><i>Waypoint mission.</i></td></tr></table></html></div>


