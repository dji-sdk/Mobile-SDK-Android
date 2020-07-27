<div class="article"><h1 ><font color="#AAA">class </font>Builder</h1></div>

~~~java
 static final class Builder 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Default constructor of DJIWaypointV2.



##### Class Members:

<div class="api-row" id="djiwaypointv2_builder_setcoordinate"><div class="api-col left">Set Coordinate</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_builder_setcoordinate_inline">setCoordinate</a></div></div><div class="inline-doc" id="djiwaypointv2_builder_setcoordinate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCoordinate</h6></div>

~~~java
 Builder setCoordinate(@NonNull LocationCoordinate2D coordinate) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Altitude of the aircraft in meters when it reaches waypoint. The altitude of the aircraft is relative to  the ground at the take-off location, has a range of [-200,500], and should not be larger than the  aircraft's maximum altitude. If two adjacent waypoints have different altitudes, the altitude will gradually change as the aircraft flies between waypoints.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a> <font color="#000">coordinate</td><td><font color="#666"><i><code><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></code> object to set.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2_Builder.html#djiwaypointv2_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2_builder_setaltitude"><div class="api-col left">Set Altitude</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_builder_setaltitude_inline">setAltitude</a></div></div><div class="inline-doc" id="djiwaypointv2_builder_setaltitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAltitude</h6></div>

~~~java
 Builder setAltitude(double altitude) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Altitude of the aircraft in meters when it reaches waypoint. The altitude of the aircraft is relative to  the ground at the take-off location, has a range of [-200,500], and should not be larger than the  aircraft's maximum altitude. If two adjacent waypoints have different altitudes, the altitude will  gradually change as the aircraft flies between waypoints.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">double <font color="#000">altitude</td><td><font color="#666"><i>Double type value to set.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2_Builder.html#djiwaypointv2_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2_builder_setpointofinterest"><div class="api-col left">Set Point of Interest</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_builder_setpointofinterest_inline">setPointOfInterest</a></div></div><div class="inline-doc" id="djiwaypointv2_builder_setpointofinterest_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPointOfInterest</h6></div>

~~~java
 Builder setPointOfInterest(LocationCoordinate2D pointOfInterest) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Property is used when <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_headingmode">getHeadingMode</a></code> is <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2headingmode_towardpointofinterest">TOWARD_POINT_OF_INTEREST</a></code>. Aircraft will always be heading to point while executing mission. Default is "kCLLocationCoordinate2DInvalid".



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a> <font color="#000">pointOfInterest</td><td><font color="#666"><i>The object of <code><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></code>.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2_Builder.html#djiwaypointv2_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2_builder_setpointofinterestaltitude"><div class="api-col left">Set Point of Interest Altitude</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_builder_setpointofinterestaltitude_inline">setPointOfInterestAltitude</a></div></div><div class="inline-doc" id="djiwaypointv2_builder_setpointofinterestaltitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPointOfInterestAltitude</h6></div>

~~~java
 Builder setPointOfInterestAltitude(float pointOfInterestAltitude) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Property is used when <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_headingmode">getHeadingMode</a></code> is <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2headingmode_towardpointofinterest">TOWARD_POINT_OF_INTEREST</a></code>. The altitude of the aircraft is relative to the ground at the take-off location, has a range of [-200,500],  and should not be larger than the aircraft's maximum altitude.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">pointOfInterestAltitude</td><td><font color="#666"><i>The float value to set.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2_Builder.html#djiwaypointv2_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2_builder_setflightpathmode"><div class="api-col left">Set Flight Path Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_builder_setflightpathmode_inline">setFlightPathMode</a></div></div><div class="inline-doc" id="djiwaypointv2_builder_setflightpathmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFlightPathMode</h6></div>

~~~java
 Builder setFlightPathMode(WaypointV2FlightPathMode flightPathMode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Flight path mode waypoint of the aircraft as it moves between waypoints. Default is <code>DJIWaypointV2_DJIWaypointV2FlightPathMode_CurvatureContinuousStop</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2flightpathmode">WaypointV2FlightPathMode</a> <font color="#000">flightPathMode</td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2flightpathmode">WaypointV2FlightPathMode</a></code>.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2_Builder.html#djiwaypointv2_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2_builder_setheadingmode"><div class="api-col left">Set Heading Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_builder_setheadingmode_inline">setHeadingMode</a></div></div><div class="inline-doc" id="djiwaypointv2_builder_setheadingmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setHeadingMode</h6></div>

~~~java
 Builder setHeadingMode(WaypointV2HeadingMode headingMode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Heading of the aircraft as it moves between waypoints. Default is <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2headingmode_auto">AUTO</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2headingmode">WaypointV2HeadingMode</a> <font color="#000">headingMode</td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2headingmode">WaypointV2HeadingMode</a></code>.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2_Builder.html#djiwaypointv2_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2_builder_setheading"><div class="api-col left">Set Heading</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_builder_setheading_inline">setHeading</a></div></div><div class="inline-doc" id="djiwaypointv2_builder_setheading_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setHeading</h6></div>

~~~java
 Builder setHeading(float heading) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The heading to which the aircraft will rotate by the time it reaches the waypoint. The aircraft heading will gradually  change between two waypoints with different headings if the waypoint mission's <code><a href="/Components/Missions/DJIWaypointMission_Builder.html#djiwaypointmission_builder_headingmode">headingMode</a></code> is set to <code>DJIWaypointV2_DJIWaypointV2HeadingMode_UsingWaypointHeading</code>.  A heading has a range of [-180, 180] degrees, where 0 represents True North.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">heading</td><td><font color="#666"><i>A float type value of heading.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2_Builder.html#djiwaypointv2_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2_builder_setturnmode"><div class="api-col left">Set Turn Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_builder_setturnmode_inline">setTurnMode</a></div></div><div class="inline-doc" id="djiwaypointv2_builder_setturnmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setTurnMode</h6></div>

~~~java
 Builder setTurnMode(WaypointV2TurnMode turnMode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Determines whether the aircraft will turn clockwise or anticlockwise when changing its heading.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2turnmode">WaypointV2TurnMode</a> <font color="#000">turnMode</td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2turnmode">WaypointV2TurnMode</a></code>.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2_Builder.html#djiwaypointv2_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2_builder_setusingwaypointautoflightspeed"><div class="api-col left">Set Using Waypoint Auto Flight Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_builder_setusingwaypointautoflightspeed_inline">setUsingWaypointAutoFlightSpeed</a></div></div><div class="inline-doc" id="djiwaypointv2_builder_setusingwaypointautoflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setUsingWaypointAutoFlightSpeed</h6></div>

~~~java
 Builder setUsingWaypointAutoFlightSpeed(boolean usingWaypointAutoFlightSpeed) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Determines whether the aircraft using waypoint auto flight speed executing waypoint mission. If <code>true</code>, the aircraft will use waypoint auto flight speed between two waypoints.  Otherwise, will use <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_autoflightspeed">getAutoFlightSpeed</a></code> as max flight speed.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">usingWaypointAutoFlightSpeed</td><td><font color="#666"><i>A boolean type value to set.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2_Builder.html#djiwaypointv2_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2_builder_setusingwaypointmaxflightspeed"><div class="api-col left">Set Using Waypoint Max Flight Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_builder_setusingwaypointmaxflightspeed_inline">setUsingWaypointMaxFlightSpeed</a></div></div><div class="inline-doc" id="djiwaypointv2_builder_setusingwaypointmaxflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setUsingWaypointMaxFlightSpeed</h6></div>

~~~java
 Builder setUsingWaypointMaxFlightSpeed(boolean usingWaypointMaxFlightSpeed) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Determines whether the aircraft using waypoint max flight speed executing waypoint mission. If <code>true</code>, the aircraft will use waypoint max flight speed between two waypoints.  Otherwise, will use <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_maxflightspeed">getMaxFlightSpeed</a></code> as max flight speed.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">usingWaypointMaxFlightSpeed</td><td><font color="#666"><i>A boolean type value to set.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2_Builder.html#djiwaypointv2_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2_builder_setautoflightspeed"><div class="api-col left">Set Auto Flight Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_builder_setautoflightspeed_inline">setAutoFlightSpeed</a></div></div><div class="inline-doc" id="djiwaypointv2_builder_setautoflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAutoFlightSpeed</h6></div>

~~~java
 Builder setAutoFlightSpeed(float autoFlightSpeed) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The base automatic speed of the aircraft as it moves between waypoints with range [-15, 15] m/s. The aircraft's actual speed is a combination of the base automatic speed, and the  speed control given by the throttle joystick on the remote controller. If "autoFlightSpeed >0": Actual speed is "autoFlightSpeed" + Joystick Speed (with combined max of "maxFlightSpeed")  If "autoFlightSpeed =0": Actual speed is controlled only by the remote controller joystick. If "autoFlightSpeed <0" and the aircraft is at the first waypoint, the aircraft will hover in  place until the speed is made positive by the remote controller joystick. In flight controller firmware 3.2.10.0 or above, different speeds between individual waypoints can also be set in  waypoint objects which will overwrite "autoFlightSpeed".



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">autoFlightSpeed</td><td><font color="#666"><i>A float type value to set.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2_Builder.html#djiwaypointv2_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2_builder_setmaxflightspeed"><div class="api-col left">Set Max Flight Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_builder_setmaxflightspeed_inline">setMaxFlightSpeed</a></div></div><div class="inline-doc" id="djiwaypointv2_builder_setmaxflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMaxFlightSpeed</h6></div>

~~~java
 Builder setMaxFlightSpeed(@FloatRange(from = 2, to = 15) float maxFlightSpeed) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">While the aircraft is travelling between waypoints, you can offset its speed by using the throttle joystick on the remote controller. "maxFlightSpeed" is this offset when the joystick is  pushed to maximum deflection. For example, If maxFlightSpeed is 10 m/s, then pushing the throttle joystick all the way up will add 10 m/s to the aircraft speed, while pushing down will  subtract 10 m/s from the aircraft speed. If the remote controller stick is not at maximum deflection, then the offset speed will be interpolated between "[0, maxFlightSpeed]"" with a  resolution of 1000 steps. If the offset speed is negative, then the aircraft will fly backwards to previous waypoints. When it reaches the first waypoint, it will then hover in place  until a positive speed is applied. "maxFlightSpeed" has a range of [2,15] m/s.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@FloatRange(from = 2, to = 15) float <font color="#000">maxFlightSpeed</td><td><font color="#666"><i>A float type value to set.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2_Builder.html#djiwaypointv2_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2_builder_setdampingdistance"><div class="api-col left">Set Damping Distance</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_builder_setdampingdistance_inline">setDampingDistance</a></div></div><div class="inline-doc" id="djiwaypointv2_builder_setdampingdistance_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setDampingDistance</h6></div>

~~~java
 Builder setDampingDistance(float dampingDistance) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Corner radius of the waypoint. When the flight path mode  is <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2flightpathmode_coordinateturn">COORDINATE_TURN</a></code> the flight path near a waypoint will be acurve (rounded corner) with  radius [0.2,1000]. When there is a corner radius, the aircraft will never pass the waypoint. By default, the radius is 0.2 m. If the corner is made of three adjacent waypoints (Short for A,B,C).  Then the radius of A(short for Ra) plus radius of B(short for Rb) must be smaller than the distance between  A and B. The radius of the first and the last waypoint in a mission does not affect  the flight path and it should keep the default value (0.2m). When the flight path mode is <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2flightpathmode_gotofirstpointalongastraightline">GOTO_FIRST_POINT_ALONG_STRAIGHT_LINE</a></code> When aircraft reaches  the first waypoint, The flight path will be a straight flight with this distance. When the flight path mode is <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2flightpathmode_straightout">STRAIGHT_OUT</a></code> The flight path will be  a straight flight with this distance before until last waypoint.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">dampingDistance</td><td><font color="#666"><i>A float type value of damping distance.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2_Builder.html#djiwaypointv2_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2_builder_build"><div class="api-col left">Build</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_builder_build_inline">build</a></div></div><div class="inline-doc" id="djiwaypointv2_builder_build_inline"

><div class="article"><h6 ><font color="#AAA">method </font>build</h6></div>

~~~java
 WaypointV2 build() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Build the object into a <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2">WaypointV2</a></code> object.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2">WaypointV2</a></td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2_Builder.html#djiwaypointv2_builder">Builder</a></code>.</i></td></tr></table></html></div>


