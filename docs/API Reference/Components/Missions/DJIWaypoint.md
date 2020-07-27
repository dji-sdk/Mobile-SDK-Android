<div class="article"><h1 ><font color="#AAA">class </font>Waypoint</h1></div>

~~~java
@EXClassNullAway
 class Waypoint 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The class represents a target point in the waypoint mission. For a waypoint mission, a flight route  consists of multiple <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint">Waypoint</a></code> objects. The user can also define the actions to perform for  each <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint">Waypoint</a></code>.



##### Class Members:

<div class="api-row" id="djiwaypoint_initwithcoordinate"><div class="api-col left">Constructor</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_initwithcoordinate_inline">Waypoint</a></div></div><div class="inline-doc" id="djiwaypoint_initwithcoordinate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>Waypoint</h6></div>

~~~java
 Waypoint(double latitude, double longitude, float altitude) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Initiate instance with specific waypoint.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">double <font color="#000">latitude</td><td><font color="#666"><i>The latitude of the waypoint.</i></td></tr><tr valign="top"><td><font color="#70BF41">double <font color="#000">longitude</td><td><font color="#666"><i>The longitude of the waypoint.</i></td></tr><tr valign="top"><td><font color="#70BF41">float <font color="#000">altitude</td><td><font color="#666"><i>The altitude of the waypoint.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypoint_coordinate"><div class="api-col left">Coordinate</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_coordinate_inline">coordinate</a></div></div><div class="inline-doc" id="djiwaypoint_coordinate_inline"

><div class="article"><h6 ><font color="#AAA">property </font>coordinate</h6></div>

~~~java
 LocationCoordinate2D coordinate
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Waypoint coordinate latitude and longitude in degrees.

</div>

<div class="api-row" id="djiwaypoint_altitude"><div class="api-col left">Altitude</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_altitude_inline">altitude</a></div></div><div class="inline-doc" id="djiwaypoint_altitude_inline"

><div class="article"><h6 ><font color="#AAA">property </font>altitude</h6></div>

~~~java
 @FloatRange(from = MIN_ALTITUDE, to = MAX_ALTITUDE) float altitude
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Altitude of the aircraft in meters when it reaches waypoint. The altitude of the aircraft is relative to  the ground at the take-off location, and should not be larger than the aircraft's maximum altitude. If  two adjacent waypoints have different altitudes, the altitude will gradually change as the aircraft flies  between waypoints.

</div>

<div class="api-row" id="djiwaypoint_heading"><div class="api-col left">Heading</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_heading_inline">heading</a></div></div><div class="inline-doc" id="djiwaypoint_heading_inline"

><div class="article"><h6 ><font color="#AAA">property </font>heading</h6></div>

~~~java
 @IntRange(from = MIN_HEADING, to = MAX_HEADING) int heading
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The heading to which the aircraft will rotate by the time it reaches the waypoint. The aircraft heading  will gradually change between two waypoints with different headings if the waypoint  mission's <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_headingmode">getHeadingMode</a></code> is set  to <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionheadingmode_usingwaypointheading">USING_WAYPOINT_HEADING</a></code>. A heading has a range of  [-180, 180] degrees, where 0 represents True North.

</div>

<div class="api-row" id="djiwaypoint_cornerradiusinmeters"><div class="api-col left">Corner Radius</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_cornerradiusinmeters_inline">cornerRadiusInMeters</a></div></div><div class="inline-doc" id="djiwaypoint_cornerradiusinmeters_inline"

><div class="article"><h6 ><font color="#AAA">property </font>cornerRadiusInMeters</h6></div>

~~~java
 @FloatRange(from = MIN_CORNER_RADIUS, to = MAX_CORNER_RADIUS) float cornerRadiusInMeters = 0.2f
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Corner radius of the waypoint. When the flight path mode  is <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionflightpathmode_curved">CURVED</a></code> the flight path near a waypoint will be  a curve (rounded corner) with radius [0.2,1000]. When there is a corner radius, the aircraft will never  go through the waypoint. By default, the radius is 0.2 m. If the corner is made of three adjacent waypoints (Short for A,B,C)  . Then the radius of A(short for Ra) plus radius of B(short for Rb) must be smaller than the distance between  A and B. The radius of the first and the last waypoint in a mission does not affect the flight path and it should keep the default value (0.2m).



##### See Also:



<font color="#666"><code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_cornerradiusinmeters">cornerRadiusInMeters</a></code>

</div>

<div class="api-row" id="djiwaypoint_turnmode"><div class="api-col left">Turn Mode</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_turnmode_inline">turnMode</a></div></div><div class="inline-doc" id="djiwaypoint_turnmode_inline"

><div class="article"><h6 ><font color="#AAA">property </font>turnMode</h6></div>

~~~java
 WaypointTurnMode turnMode
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Determines whether the aircraft will turn clockwise or anticlockwise when changing its heading.



##### See Also:



<font color="#666"><code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_djiwaypointturnmode">WaypointTurnMode</a></code>

</div>

<div class="api-row" id="djiwaypoint_gimbalpitch"><div class="api-col left">Gimbal Pitch</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_gimbalpitch_inline">gimbalPitch</a></div></div><div class="inline-doc" id="djiwaypoint_gimbalpitch_inline"

><div class="article"><h6 ><font color="#AAA">property </font>gimbalPitch</h6></div>

~~~java
 @FloatRange(from = MIN_GIMBAL_PITCH, to = MAX_GIMBAL_PITCH) float gimbalPitch
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Gimbal pitch angle when reached this waypoint. This property is used when the    <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_rotategimbalpitch">isGimbalPitchRotationEnabled</a></code> is TRUE. Value should in range [-90, 0] degree.

</div>

<div class="api-row" id="djiwaypoint_speed"><div class="api-col left">Speed</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_speed_inline">speed</a></div></div><div class="inline-doc" id="djiwaypoint_speed_inline"

><div class="article"><h6 ><font color="#AAA">property </font>speed</h6></div>

~~~java
 @FloatRange(from = MIN_SPEED, to = MAX_SPEED) float speed
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The base automatic speed of the aircraft as it moves between this waypoint and the next waypoint with range  [0, 15] m/s. By default, it is 0.0 and the aircraft will fly with <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_autoflightspeed">getAutoFlightSpeed</a></code> of  the waypoint mission. If greater than 0, 'speed' will override <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_autoflightspeed">getAutoFlightSpeed</a></code>.  This 'speed' can only define movement forward through the waypoint mission in comparison  to <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_autoflightspeed">getAutoFlightSpeed</a></code> which can be both forward and backwards through a waypoint  mission. <br> Waypoint mission speed priority from highest to lowest is: <br> 1) manual speed adjustment  with remote controller joy sticks <br> 2) 'speed' <br> 3) <code><a href="/Components/Missions/DJIWaypointMissionOperator.html#djiwaypointmissionoperator_setautoflightspeed">setAutoFlightSpeed</a></code> <br>  4) <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_autoflightspeed">getAutoFlightSpeed</a></code> <br> Warning: 'speed', <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_shootphototimeinterval">shootPhotoTimeInterval</a></code>  and <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_shootphotodistanceinterval">shootPhotoDistanceInterval</a></code> relate to behavior between this waypoint and the next  waypoint in the mission. In comparison, <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_turnmode">turnMode</a></code>, <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_altitude">altitude</a></code>  and <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_heading">heading</a></code> relate to behavior between the last waypoint and this waypoint in the waypoint  mission. Only supported by flight controller firmware 3.2.10.0 or above.

</div>

<div class="api-row" id="djiwaypoint_shootphototimeinterval"><div class="api-col left">Shoot Photo Time Interval</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_shootphototimeinterval_inline">shootPhotoTimeInterval</a></div></div><div class="inline-doc" id="djiwaypoint_shootphototimeinterval_inline"

><div class="article"><h6 ><font color="#AAA">property </font>shootPhotoTimeInterval</h6></div>

~~~java
 float shootPhotoTimeInterval
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The time interval in seconds when two photos are taken as the aircraft moves between the current waypoint  and the next waypoint. The first photo will be taken as the aircraft leaves the current waypoint. The  maximum value is 6,000.0. The minimum value is above 0.0 and depends on the camera type and the camera  parameters. When the photo file format is JPEG, the recommended minimum value is 2.0. When the photo file  format is RAW, the minimum value is 10.0. If the input exceeds the camera's capability, the pictures will  be taken at the maximum possible speed. The default value is 0.0 and no photo will be taken. For a  waypoint, either <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_shootphototimeinterval">shootPhotoTimeInterval</a></code> or <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_shootphotodistanceinterval">shootPhotoDistanceInterval</a></code>  is 0.0. Input with precision of greater than 1 decimal places, will be rounded to 1. Warning: 'speed', <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_shootphototimeinterval">shootPhotoTimeInterval</a></code>  and <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_shootphotodistanceinterval">shootPhotoDistanceInterval</a></code> relate to behavior between this waypoint and the next waypoint  in the mission. In comparison, <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_turnmode">turnMode</a></code>, <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_altitude">altitude</a></code> and <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_heading">heading</a></code>  relate to behavior between the last waypoint and this waypoint in the waypoint mission. Only supported by flight  controller firmware 3.2.10.0 or above.

</div>

<div class="api-row" id="djiwaypoint_shootphotodistanceinterval"><div class="api-col left">Shoot Photo Distance Interval</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_shootphotodistanceinterval_inline">shootPhotoDistanceInterval</a></div></div><div class="inline-doc" id="djiwaypoint_shootphotodistanceinterval_inline"

><div class="article"><h6 ><font color="#AAA">property </font>shootPhotoDistanceInterval</h6></div>

~~~java
 float shootPhotoDistanceInterval
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The distance interval in meters when two photos are taken as the aircraft moves between the current  waypoint and the next waypoint. The maximum value is 6,000.0. The minimum value is above 0.0 and depends  on the camera type, the camera parameters and the flight speed. When the photo file format is JPEG, the  time interval between two photos cannot smaller than 2 seconds. When the photo file format is RAW, the  time interval between two photos cannot smaller than 10 seconds. If the input exceeds the camera's  capability, the taken photos may be less than expectation. The default value is 0.0 and no photo will be  taken. For a waypoint, either <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_shootphototimeinterval">shootPhotoTimeInterval</a></code>  or <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_shootphotodistanceinterval">shootPhotoDistanceInterval</a></code> is 0.0. Input with precision of greater than 1 decimal  places, will be rounded to 1. Warning: 'speed', <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_shootphototimeinterval">shootPhotoTimeInterval</a></code>  and <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_shootphotodistanceinterval">shootPhotoDistanceInterval</a></code> relate to behavior between this waypoint and the next  waypoint in the mission. In comparison, <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_turnmode">turnMode</a></code>, <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_altitude">altitude</a></code>  and <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_heading">heading</a></code> relate to behavior between the last waypoint and this waypoint in the waypoint  mission. Only supported by flight controller firmware 3.2.10.0 or above.

</div>

<div class="api-row" id="djiwaypoint_waypointactions"><div class="api-col left">Actions</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_waypointactions_inline">waypointActions</a></div></div><div class="inline-doc" id="djiwaypoint_waypointactions_inline"

><div class="article"><h6 ><font color="#AAA">property </font>waypointActions</h6></div>

~~~java
 List<WaypointAction> waypointActions
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Array of all waypoint actions for the respective waypoint. The waypoint actions will be executed  consecutively from the start of the array once the aircraft reaches the waypoint.

</div>

<div class="api-row" id="djiwaypoint_getactionatindex"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_getactionatindex_inline">getActionAtIndex</a></div></div><div class="inline-doc" id="djiwaypoint_getactionatindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getActionAtIndex</h6></div>

~~~java
 WaypointAction getActionAtIndex(int index) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Gets the action at the specified index.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">index</td><td><font color="#666"><i>The specified index.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypoint_DJIWaypointAction.html#djiwaypoint_djiwaypointaction">WaypointAction</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/Missions/DJIWaypoint_DJIWaypointAction.html#djiwaypoint_djiwaypointaction">WaypointAction</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypoint_adjustactionatindex"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_adjustactionatindex_inline">adjustActionAtIndex</a></div></div><div class="inline-doc" id="djiwaypoint_adjustactionatindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>adjustActionAtIndex</h6></div>

~~~java
 boolean adjustActionAtIndex(int index, WaypointAction action) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Switches the action at the specified index.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">index</td><td><font color="#666"><i>The specified index.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypoint_DJIWaypointAction.html#djiwaypoint_djiwaypointaction">WaypointAction</a> <font color="#000">action</td><td><font color="#666"><i>A DJIWaypointAction object.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypoint_actionrepeattimes"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_actionrepeattimes_inline">actionRepeatTimes</a></div></div><div class="inline-doc" id="djiwaypoint_actionrepeattimes_inline"

><div class="article"><h6 ><font color="#AAA">property </font>actionRepeatTimes</h6></div>

~~~java
 @IntRange(from = MIN_ACTION_REPEAT_TIMES, to = MAX_ACTION_REPEAT_TIMES) int actionRepeatTimes = 1
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Determines how many times the set of waypoint actions are repeated. The default value is one time, and  the maximum is <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_djimaxactionrepeattimes">MAX_ACTION_REPEAT_TIMES</a></code>.



##### See Also:



<font color="#666"><code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_djimaxactionrepeattimes">MAX_ACTION_REPEAT_TIMES</a></code>, <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_actionrepeattimes">actionRepeatTimes</a></code>

</div>

<div class="api-row" id="djiwaypoint_actiontimeoutinseconds"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_actiontimeoutinseconds_inline">actionTimeoutInSeconds</a></div></div><div class="inline-doc" id="djiwaypoint_actiontimeoutinseconds_inline"

><div class="article"><h6 ><font color="#AAA">property </font>actionTimeoutInSeconds</h6></div>

~~~java
 @IntRange(from = MIN_ACTION_TIMEOUT, to = MAX_ACTION_TIMEOUT) int actionTimeoutInSeconds = 999
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The maximum time set to execute all the waypoint actions for a waypoint. If the time while executing the  waypoint actions goes above the time set, the aircraft will stop executing the waypoint actions for the  current waypoint and will move on to the next waypoint. The value of this property must be in the range  of [0, 999] seconds. The default value is 60 seconds.



##### See Also:



<font color="#666"><code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_actiontimeoutinseconds">actionTimeoutInSeconds</a></code>

</div>

<div class="api-row" id="djiwaypoint_addaction"><div class="api-col left">Add Action</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_addaction_inline">addAction</a></div></div><div class="inline-doc" id="djiwaypoint_addaction_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addAction</h6></div>

~~~java
 boolean addAction(WaypointAction action) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Adds a waypoint action to a waypoint. The number of waypoint actions should not be larger  than <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_djimaxactioncount">MAX_ACTION_COUNT</a></code>. The action will only be executed when the  mission's <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_flightpathmode">getFlightPathMode</a></code> property is set  to <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionflightpathmode_normal">NORMAL</a></code> and will not be executed when the  mission's <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_flightpathmode">getFlightPathMode</a></code> property is set  to <code><a href="/Components/Missions/DJIWaypointMission.html#djiwaypointmission_djiwaypointmissionflightpathmode_curved">CURVED</a></code>. The maximum number of waypoint  actions you can add is 15.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypoint_DJIWaypointAction.html#djiwaypoint_djiwaypointaction">WaypointAction</a> <font color="#000">action</td><td><font color="#666"><i>Waypoint action to be added to the waypoint.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the waypoint action has been added to the waypoint. <code>false</code>  if the waypoint action count is too high, or if the waypoint action was incorrectly setup.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypoint_insertaction"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_insertaction_inline">insertAction</a></div></div><div class="inline-doc" id="djiwaypoint_insertaction_inline"

><div class="article"><h6 ><font color="#AAA">method </font>insertAction</h6></div>

~~~java
 boolean insertAction(WaypointAction action, int index) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Insert a waypoint action at index. @return <code>true</code>, if the waypoint action has been  inserted. <code>false</code> if the waypoint action count is too high or the index is invalid.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypoint_DJIWaypointAction.html#djiwaypoint_djiwaypointaction">WaypointAction</a> <font color="#000">action</td><td><font color="#666"><i>Waypoint action to be inserted to the waypoint.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">index</td><td><font color="#666"><i>Index of the inserted action.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypoint_removeaction"><div class="api-col left">Remove Action</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_removeaction_inline">removeAction</a></div></div><div class="inline-doc" id="djiwaypoint_removeaction_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeAction</h6></div>

~~~java
 boolean removeAction(WaypointAction action) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Removes a waypoint action from the waypoint. @return <code>true</code> if the waypoint action  has been removed from the waypoint.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypoint_DJIWaypointAction.html#djiwaypoint_djiwaypointaction">WaypointAction</a> <font color="#000">action</td><td><font color="#666"><i>Waypoint action to be removed from the waypoint.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypoint_removeactionatindex"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_removeactionatindex_inline">removeActionAtIndex</a></div></div><div class="inline-doc" id="djiwaypoint_removeactionatindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeActionAtIndex</h6></div>

~~~java
 boolean removeActionAtIndex(int index) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Removes a waypoint action from the waypoint by index. After removal, all actions higher than the index will  be shifted down by one.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">index</td><td><font color="#666"><i>The index of the waypoint action to be removed.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if waypoint action has been removed from the waypoint.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypoint_removeallactions"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_removeallactions_inline">removeAllAction</a></div></div><div class="inline-doc" id="djiwaypoint_removeallactions_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeAllAction</h6></div>

~~~java
 void removeAllAction() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Remove all the actions.

</div>



##### Related:

<div class="api-row" id="djiwaypoint_djiwaypointaction"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypoint_DJIWaypointAction.html">WaypointAction</a></div></div><div class="api-row" id="djiwaypoint_djiwaypointturnmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_djiwaypointturnmode_inline">WaypointTurnMode</a></div></div><div class="inline-doc" id="djiwaypoint_djiwaypointturnmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>WaypointTurnMode</h6></div>

~~~java
@EXClassNullAway
 enum WaypointTurnMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">How the aircraft will turn at a waypoint to transition between headings.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypoint_djiwaypointturnmode_clockwise_inline"></a>CLOCKWISE</td><td><font color="#666">Changes the heading of the aircraft by rotating the aircraft clockwise.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypoint_djiwaypointturnmode_counterclockwise_inline"></a>COUNTER_CLOCKWISE</td><td><font color="#666">Changes the heading of the aircraft by rotating the aircraft anti-clockwise.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiwaypoint_djimaxactioncount"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_djimaxactioncount_inline">MAX_ACTION_COUNT</a></div></div><div class="inline-doc" id="djiwaypoint_djimaxactioncount_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MAX_ACTION_COUNT</h6></div>

~~~java
 static final int MAX_ACTION_COUNT = 15
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Maximum number of actions a single waypoint can have. The maximum supported number is 15.

</div>

<div class="api-row" id="djiwaypoint_djimaxactionrepeattimes"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_djimaxactionrepeattimes_inline">MAX_ACTION_REPEAT_TIMES</a></div></div><div class="inline-doc" id="djiwaypoint_djimaxactionrepeattimes_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MAX_ACTION_REPEAT_TIMES</h6></div>

~~~java
 static final int MAX_ACTION_REPEAT_TIMES = 15
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Maximum number of times a single waypoint action can be repeated. The maximum supported number is 15.

</div>


