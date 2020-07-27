<div class="article"><h1 ><font color="#AAA">class </font>WaypointV2</h1></div>

~~~java
 class WaypointV2 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The class represents a target point in the waypoint mission. For a waypoint mission, a flight route consists of multiple <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2">WaypointV2</a></code> objects.



##### Class Members:

<div class="api-row" id="djiwaypointv2_coordinate"><div class="api-col left">Coordinate</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_coordinate_inline">getCoordinate</a></div></div><div class="inline-doc" id="djiwaypointv2_coordinate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCoordinate</h6></div>

~~~java
 LocationCoordinate2D getCoordinate() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Waypoint coordinate latitude and longitude in degrees.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></td><td><font color="#666"><i>An object of <code><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2_altitude"><div class="api-col left">Altitude</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_altitude_inline">getAltitude</a></div></div><div class="inline-doc" id="djiwaypointv2_altitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAltitude</h6></div>

~~~java
 double getAltitude() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Altitude of the aircraft in meters when it reaches waypoint. The altitude of the aircraft is relative to  the ground at the take-off location, has a  range of [-200,500], and should not be larger than the aircraft's maximum altitude. If two adjacent waypoints have different altitudes, the altitude  will gradually change as the aircraft flies between waypoints.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">double</td><td><font color="#666"><i>A double type value of the aircraft altitude.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2_pointofinterest"><div class="api-col left">Point of Interest</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_pointofinterest_inline">getPointOfInterest</a></div></div><div class="inline-doc" id="djiwaypointv2_pointofinterest_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPointOfInterest</h6></div>

~~~java
 LocationCoordinate2D getPointOfInterest() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Property is used when <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_headingmode">getHeadingMode</a></code> is <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2headingmode_towardpointofinterest">TOWARD_POINT_OF_INTEREST</a></code>. Aircraft will always be heading to  point while executing mission. Default is "kCLLocationCoordinate2DInvalid".



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></td><td><font color="#666"><i>An object of <code><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2_pointofinterestaltitude"><div class="api-col left">Point of Interest Altitude</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_pointofinterestaltitude_inline">getPointOfInterestAltitude</a></div></div><div class="inline-doc" id="djiwaypointv2_pointofinterestaltitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPointOfInterestAltitude</h6></div>

~~~java
 double getPointOfInterestAltitude() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Property is used when <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_headingmode">getHeadingMode</a></code> is <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2headingmode_towardpointofinterest">TOWARD_POINT_OF_INTEREST</a></code>. The altitude of the aircraft is relative  to the ground at the take-off location, has a range of [-200,500], and should not be larger than the  aircraft's maximum altitude.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">double</td><td><font color="#666"><i>The value of the point of interest altitude.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2_flightpathmode"><div class="api-col left">Flight Path Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_flightpathmode_inline">getFlightPathMode</a></div></div><div class="inline-doc" id="djiwaypointv2_flightpathmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlightPathMode</h6></div>

~~~java
 WaypointV2FlightPathMode getFlightPathMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Flight path mode waypoint of the aircraft as it moves between waypoints. Default is <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2flightpathmode_gotopointalongacurveandstop">GOTO_POINT_CURVE_AND_STOP</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2flightpathmode">WaypointV2FlightPathMode</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2flightpathmode">WaypointV2FlightPathMode</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2_headingmode"><div class="api-col left">Heading Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_headingmode_inline">getHeadingMode</a></div></div><div class="inline-doc" id="djiwaypointv2_headingmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHeadingMode</h6></div>

~~~java
 WaypointV2HeadingMode getHeadingMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Heading of the aircraft as it moves between waypoints. Default is <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2headingmode_auto">AUTO</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2headingmode">WaypointV2HeadingMode</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2headingmode">WaypointV2HeadingMode</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2_heading"><div class="api-col left">Heading</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_heading_inline">getHeading</a></div></div><div class="inline-doc" id="djiwaypointv2_heading_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHeading</h6></div>

~~~java
 float getHeading() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The heading to which the aircraft will rotate by the time it reaches the waypoint. The aircraft heading  will gradually change between two waypoints with  different headings if the waypoint mission's <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2headingmode">WaypointV2HeadingMode</a></code> is set to <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2headingmode_waypointcustom">WAYPOINT_CUSTOM</a></code>. A heading has a range  of [-180, 180] degrees, where 0 represents True North.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>The float type value of aircraft heading.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2_turnmode"><div class="api-col left">Turn Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_turnmode_inline">getTurnMode</a></div></div><div class="inline-doc" id="djiwaypointv2_turnmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTurnMode</h6></div>

~~~java
 WaypointV2TurnMode getTurnMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Determines whether the aircraft will turn clockwise or anticlockwise when changing its heading.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2turnmode">WaypointV2TurnMode</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2turnmode">WaypointV2TurnMode</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2_isusingwaypointmaxflightspeed"><div class="api-col left">Use Waypoint Max Flight Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_isusingwaypointmaxflightspeed_inline">isUsingWaypointMaxFlightSpeed</a></div></div><div class="inline-doc" id="djiwaypointv2_isusingwaypointmaxflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isUsingWaypointMaxFlightSpeed</h6></div>

~~~java
 boolean isUsingWaypointMaxFlightSpeed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Determines whether the aircraft using waypoint max flight speed executing waypoint mission. If <code>true</code>, the aircraft will use waypoint max flight speed between two waypoints.  Otherwise, will use <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_maxflightspeed">getMaxFlightSpeed</a></code> as max flight speed.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check if the aircraft use waypoint max flight speed.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2_maxflightspeed"><div class="api-col left">Max Flight Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_maxflightspeed_inline">getMaxFlightSpeed</a></div></div><div class="inline-doc" id="djiwaypointv2_maxflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMaxFlightSpeed</h6></div>

~~~java
 float getMaxFlightSpeed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">While the aircraft is travelling between waypoints, you can offset its speed by using the throttle joystick on the remote controller. <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_maxflightspeed">getMaxFlightSpeed</a></code> is this offset  when the joystick is pushed to maximum deflection. For example, If maxFlightSpeed is 10 m/s, then pushing the throttle joystick all the way up will add 10 m/s to the aircraft speed,  while pushing down will subtract 10 m/s from the aircraft speed. If the remote controller stick is not at maximum deflection, then the offset speed will be interpolated  between "[0, <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_maxflightspeed">getMaxFlightSpeed</a></code>]"" with a resolution of 1000 steps. If the offset speed is negative, then the aircraft will fly backwards to previous waypoints. When it  reaches the first waypoint, it will then hover in place until a positive speed is applied. <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_maxflightspeed">getMaxFlightSpeed</a></code> has a range of [2,15] m/s.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>The float value of max flight speed.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2_isusingwaypointautoflightspeed"><div class="api-col left">Use Waypoint Auto Flight Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_isusingwaypointautoflightspeed_inline">isUsingWaypointAutoFlightSpeed</a></div></div><div class="inline-doc" id="djiwaypointv2_isusingwaypointautoflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isUsingWaypointAutoFlightSpeed</h6></div>

~~~java
 boolean isUsingWaypointAutoFlightSpeed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Determines whether the aircraft using waypoint auto flight speed executing waypoint mission. If <code>true</code>, the aircraft will use waypoint auto flight speed between two waypoints. Otherwise,  will use <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2mission_autoflightspeed">getAutoFlightSpeed</a></code> as max flight speed.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check if the aircraft use waypoint auto flight speed.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2_autoflightspeed"><div class="api-col left">Auto Flight Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_autoflightspeed_inline">getAutoFlightSpeed</a></div></div><div class="inline-doc" id="djiwaypointv2_autoflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAutoFlightSpeed</h6></div>

~~~java
 float getAutoFlightSpeed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The base automatic speed of the aircraft as it moves between waypoints with range [-15, 15] m/s. The aircraft's actual speed is a combination of the base automatic speed, and the speed control  given by the throttle joystick on the remote controller. If "<code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_autoflightspeed">getAutoFlightSpeed</a></code> >0": Actual speed is <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_autoflightspeed">getAutoFlightSpeed</a></code> + Joystick Speed (with combined max  of <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_maxflightspeed">getMaxFlightSpeed</a></code>) If "<code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_autoflightspeed">getAutoFlightSpeed</a></code> =0": Actual speed is controlled only by the remote controller joystick. If "<code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_autoflightspeed">getAutoFlightSpeed</a></code> <0" and  the aircraft is at the first waypoint, the aircraft will hover in place until the speed is made positive by the remote controller joystick. In flight controller firmware 3.2.10.0 or above,  different speeds between individual waypoints can also be set in waypoint objects which will overwrite <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_autoflightspeed">getAutoFlightSpeed</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>The float value of auto flight speed.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2_dampingdistance"><div class="api-col left">Damping Distance</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_dampingdistance_inline">getDampingDistance</a></div></div><div class="inline-doc" id="djiwaypointv2_dampingdistance_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDampingDistance</h6></div>

~~~java
 float getDampingDistance() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Corner radius of the waypoint. When the flight path mode is <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2flightpathmode_coordinateturn">COORDINATE_TURN</a></code> the flight path near a waypoint will be acurve (rounded corner) with  radius [0.2,1000]. When there is a corner radius, the aircraft will never pass the waypoint. By default, the radius is 0.2 m. If the corner is made of three adjacent waypoints (Short for A,B,C).  Then the radius of A(short for Ra) plus radius of B(short for Rb) must be smaller than the distance between  A and B. The radius of the first and the last waypoint in a mission does not affect the  flight path and it should keep the default value (0.2m). When the flight path mode is <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2flightpathmode_gotofirstpointalongastraightline">GOTO_FIRST_POINT_ALONG_STRAIGHT_LINE</a></code> When aircraft reaches the first waypoint,  The flight path will be a straight flight with this distance. When the flight path mode is <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2flightpathmode_straightout">STRAIGHT_OUT</a></code> The flight path will be a straight flight with this distance  before until last waypoint.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of Damping Distance.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiwaypointv2_builder"><div class="api-col left">Constructor</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2_Builder.html">Builder</a></div></div><div class="api-row" id="djiwaypointv2_djiwaypointv2flightpathmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_djiwaypointv2flightpathmode_inline">WaypointV2FlightPathMode</a></div></div><div class="inline-doc" id="djiwaypointv2_djiwaypointv2flightpathmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>WaypointV2FlightPathMode</h6></div>

~~~java
 enum WaypointV2FlightPathMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Waypoint flight path mode.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2_djiwaypointv2flightpathmode_gotopointalongacurve_inline"></a>CURVATURE_CONTINUOUS_PASSED</td><td><font color="#666">In the mission, the aircraft will go to the waypoint along a curve and fly past the waypoint.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2_djiwaypointv2flightpathmode_gotopointalongacurveandstop_inline"></a>GOTO_POINT_CURVE_AND_STOP</td><td><font color="#666">In the mission, the aircraft will go to the waypoint along a curve and stop at the waypoint.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2_djiwaypointv2flightpathmode_gotopointinastraightlineandstop_inline"></a>GOTO_POINT_STRAIGHT_LINE_AND_STOP</td><td><font color="#666">In the mission, the aircraft will go to the waypoint along a straight line and stop at the waypoint.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2_djiwaypointv2flightpathmode_coordinateturn_inline"></a>COORDINATE_TURN</td><td><font color="#666">In the mission, the aircraft will fly from the previous waypoint to the next waypoint along a smooth curve  without stopping at this waypoint. the next in a curved motion, adhering to the <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_dampingdistance">getDampingDistance</a></code>,  which is set in <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2">WaypointV2</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2_djiwaypointv2flightpathmode_gotofirstpointalongastraightline_inline"></a>GOTO_FIRST_POINT_ALONG_STRAIGHT_LINE</td><td><font color="#666">In the mission, the aircraft will go to the first waypoint along a straight line. This is only valid for the first waypoint.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2_djiwaypointv2flightpathmode_straightout_inline"></a>STRAIGHT_OUT</td><td><font color="#666">Straight exit the Last waypoint, Only valid for last waypoint.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2_djiwaypointv2flightpathmode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiwaypointv2_djiwaypointv2headingmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_djiwaypointv2headingmode_inline">WaypointV2HeadingMode</a></div></div><div class="inline-doc" id="djiwaypointv2_djiwaypointv2headingmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>WaypointV2HeadingMode</h6></div>

~~~java
 enum WaypointV2HeadingMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">Represents current aircraft's heading mode on current waypoint.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2_djiwaypointv2headingmode_auto_inline"></a>AUTO</td><td><font color="#666">Aircraft's heading will always be in the direction of flight.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2_djiwaypointv2headingmode_fixed_inline"></a>FIXED</td><td><font color="#666">Aircraft's heading will be set to the heading when reaching the first waypoint. Before reaching the  first waypoint, the aircraft's heading can be controlled by the remote controller. When the aircraft  reaches the first waypoint, its heading will be fixed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2_djiwaypointv2headingmode_manual_inline"></a>MANUAL</td><td><font color="#666">The aircraft's heading in the mission can be controlled by the remote controller.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2_djiwaypointv2headingmode_waypointcustom_inline"></a>WAYPOINT_CUSTOM</td><td><font color="#666">In the mission, the aircraft's heading will change dynamically and adapt to the heading set at the next waypoint.  See <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_heading">getHeading</a></code> to preset the heading.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2_djiwaypointv2headingmode_towardpointofinterest_inline"></a>TOWARD_POINT_OF_INTEREST</td><td><font color="#666">Aircraft's heading will always toward point of interest. Using <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_pointofinterest">getPointOfInterest</a></code> setting point of interest coordiate and <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_pointofinterestaltitude">getPointOfInterestAltitude</a></code>  setting point of interset altitute.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2_djiwaypointv2headingmode_gimbalyawfollow_inline"></a>GIMBAL_YAW_FOLLOW</td><td><font color="#666">The aircraft's heading rotates simultaneously with its gimbal's yaw.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2_djiwaypointv2headingmode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiwaypointv2_djiwaypointv2turnmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2_djiwaypointv2turnmode_inline">WaypointV2TurnMode</a></div></div><div class="inline-doc" id="djiwaypointv2_djiwaypointv2turnmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>WaypointV2TurnMode</h6></div>

~~~java
 enum WaypointV2TurnMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2</td></tr></table></html>



##### Description:



<font color="#666">The direction when the aircraft changes its heading to adapt to the heading at the waypoint.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2_djiwaypointv2turnmode_clockwise_inline"></a>CLOCKWISE</td><td><font color="#666">The aircraft's heading rotates clockwise.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2_djiwaypointv2turnmode_counterclockwise_inline"></a>COUNTER_CLOCKWISE</td><td><font color="#666">The aircraft's heading rotates counterclockwise.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypointv2_djiwaypointv2turnmode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Changes the heading of the aircraft by rotating the aircraft anti-clockwise.</td></tr></table></html>

##### Class Members:

</div>


