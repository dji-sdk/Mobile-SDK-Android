<div class="article"><h1 ><font color="#AAA">class </font>HotpointMission</h1></div>

~~~java
@EXClassNullAway
 class HotpointMission 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">This class represents a Hotpoint mission. In a Hotpoint mission, the aircraft will repeatedly fly circles of a constant radius around a specified point called a Hot Point. The user can control the aircraft to fly around the Hotpoint with a specific radius and altitude. During execution, the user can also use the physical remote controller to modify its radius and speed. It is not supported by Mavic Pro when using WiFi connection. It is not supported by Spark.



##### Class Members:

<div class="api-row" id="djihotpointmission_hotpoint"><div class="api-col left">Coordinate</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmission_hotpoint_inline">setHotpoint</a></div></div><div class="inline-doc" id="djihotpointmission_hotpoint_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setHotpoint</h6></div>

~~~java
 void setHotpoint(LocationCoordinate2D hotpoint) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Sets the coordinate of the hotpoint.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a> <font color="#000">hotpoint</td><td><font color="#666"><i>A LocationCoordinate2D object of hotpoint.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmission_gethotpoint"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmission_gethotpoint_inline">getHotpoint</a></div></div><div class="inline-doc" id="djihotpointmission_gethotpoint_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHotpoint</h6></div>

~~~java
 LocationCoordinate2D getHotpoint() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Gets the coordinate of the hotpoint.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></td><td><font color="#666"><i>A object of <code><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmission_startpoint"><div class="api-col left">Start Point</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmission_startpoint_inline">setStartPoint</a></div></div><div class="inline-doc" id="djihotpointmission_startpoint_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setStartPoint</h6></div>

~~~java
 void setStartPoint(HotpointStartPoint startPoint) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Set aircraft's initial point on the circular flight path when starting the hotpoint  mission.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission_djihotpointstartpoint">HotpointStartPoint</a> <font color="#000">startPoint</td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission_djihotpointstartpoint">HotpointStartPoint</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmission_getstartpoint"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmission_getstartpoint_inline">getStartPoint</a></div></div><div class="inline-doc" id="djihotpointmission_getstartpoint_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getStartPoint</h6></div>

~~~java
 HotpointStartPoint getStartPoint() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Get aircraft's initial point on the circular flight path when starting the hotpoint  mission.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission_djihotpointstartpoint">HotpointStartPoint</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission_djihotpointstartpoint">HotpointStartPoint</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmission_heading"><div class="api-col left">Heading</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmission_heading_inline">setHeading</a></div></div><div class="inline-doc" id="djihotpointmission_heading_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setHeading</h6></div>

~~~java
 void setHeading(HotpointHeading heading) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Aircraft's heading while flying around the hotpoint. It can be pointed toward or  away from the hotpoint, forward or backward along its flight route, or can be  manually controlled by the remote controller.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission_djihotpointheading">HotpointHeading</a> <font color="#000">heading</td><td><font color="#666"><i>Aircraft heading.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmission_getheading"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmission_getheading_inline">getHeading</a></div></div><div class="inline-doc" id="djihotpointmission_getheading_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHeading</h6></div>

~~~java
 HotpointHeading getHeading() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Get the aircraft's heading while flying around the hotpoint. It can be pointed toward or  away from the hotpoint, forward or backward along its flight route, and can be  controlled by the remote controller.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission_djihotpointheading">HotpointHeading</a></td><td><font color="#666"><i>Aircraft heading.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmission_altitude"><div class="api-col left">Altitude</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmission_altitude_inline">setAltitude</a></div></div><div class="inline-doc" id="djihotpointmission_altitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAltitude</h6></div>

~~~java
 void setAltitude(double altitude) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Sets the altitude of the hotpoint orbit with a range [5,500] meters.  The altitude is relative to the ground altitude from which the aircraft took off.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">double <font color="#000">altitude</td><td><font color="#666"><i>A double value of altitude to set.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmission_getaltitude"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmission_getaltitude_inline">getAltitude</a></div></div><div class="inline-doc" id="djihotpointmission_getaltitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAltitude</h6></div>

~~~java
 double getAltitude() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Gets the altitude of the hotpoint orbit with a range [5,500] meters.  The altitude is relative to the ground altitude from which the aircraft took off.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">double</td><td><font color="#666"><i>A double value of altitude.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmission_radius"><div class="api-col left">Radius</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmission_radius_inline">setRadius</a></div></div><div class="inline-doc" id="djihotpointmission_radius_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setRadius</h6></div>

~~~java
 void setRadius(double radius) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Sets the circular flight path radius with which the aircraft will fly around the  hotpoint. The value of this property should be in the range  of [<code><a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission_djihotpointminradius">MIN_RADIUS</a></code>, <code><a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission_djihotpointmaxradius">MAX_RADIUS</a></code>] meters.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">double <font color="#000">radius</td><td><font color="#666"><i>A double value of radius to set.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmission_getradius"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmission_getradius_inline">getRadius</a></div></div><div class="inline-doc" id="djihotpointmission_getradius_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRadius</h6></div>

~~~java
 double getRadius() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Gets the circular flight path radius with which the aircraft will fly around the  hotpoint. The value of this property should be in the range  of [<code><a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission_djihotpointminradius">MIN_RADIUS</a></code>, <code><a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission_djihotpointmaxradius">MAX_RADIUS</a></code>] meters.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">double</td><td><font color="#666"><i>A double value of radius.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmission_angularvelocity"><div class="api-col left">Angular Velocity</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmission_angularvelocity_inline">setAngularVelocity</a></div></div><div class="inline-doc" id="djihotpointmission_angularvelocity_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAngularVelocity</h6></div>

~~~java
 void setAngularVelocity(float angularVelocity) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Sets the angular velocity in degrees/s of the aircraft as it orbits the hot  point. The default value is 20 degrees/s. The maximum angular velocity allowed  is relative to the orbit radius.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">angularVelocity</td><td><font color="#666"><i>Angular velocity in degrees/s.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmission_getangularvelocity"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmission_getangularvelocity_inline">getAngularVelocity</a></div></div><div class="inline-doc" id="djihotpointmission_getangularvelocity_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAngularVelocity</h6></div>

~~~java
 float getAngularVelocity() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Gets the angular velocity (in degrees/second) of the aircraft as it orbits the hot  point. The default value is 20 degrees/s. The angular velocity is relative to the  orbit radius.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>An int value of angular velocity.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmission_isclockwise"><div class="api-col left">Direction</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmission_isclockwise_inline">isClockwise</a></div></div><div class="inline-doc" id="djihotpointmission_isclockwise_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isClockwise</h6></div>

~~~java
 boolean isClockwise() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the aircraft will move in a clockwise direction around the hotpoint.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check if is clockwise.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmission_setclockwise"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmission_setclockwise_inline">setClockwise</a></div></div><div class="inline-doc" id="djihotpointmission_setclockwise_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setClockwise</h6></div>

~~~java
 void setClockwise(boolean clockwise) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Set to <code>true</code> if the aircraft should move in a clockwise direction around the hotpoint.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">clockwise</td><td><font color="#666"><i><code>true</code> for clockwise direction.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmission_constructor"><div class="api-col left">Constructor</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmission_constructor_inline">HotpointMission</a></div></div><div class="inline-doc" id="djihotpointmission_constructor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>HotpointMission</h6></div>

~~~java
 HotpointMission(LocationCoordinate2D hotpoint,
                           double altitude,
                           double radius,
                           float angularVelocity,
                           boolean isClockwise,
                           HotpointStartPoint startPoint,
                           HotpointHeading heading) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Constructor method for the DJIHotPointMission.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a> <font color="#000">hotpoint</td><td><font color="#666"><i>Location of the hotpoint.</i></td></tr><tr valign="top"><td><font color="#70BF41">double <font color="#000">altitude</td><td><font color="#666"><i>Altitude of the orbit in meters</i></td></tr><tr valign="top"><td><font color="#70BF41">double <font color="#000">radius</td><td><font color="#666"><i>Radius of the orbit in meters</i></td></tr><tr valign="top"><td><font color="#70BF41">float <font color="#000">angularVelocity</td><td><font color="#666"><i>Angular velocity of the aircraft in degrees/s</i></td></tr><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isClockwise</td><td><font color="#666"><i><code>true</code> if the aircraft should move in a clockwise direction around the hotpoint.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission_djihotpointstartpoint">HotpointStartPoint</a> <font color="#000">startPoint</td><td><font color="#666"><i>Initial location on the orbit to start</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission_djihotpointheading">HotpointHeading</a> <font color="#000">heading</td><td><font color="#666"><i>Aircraft heading during the mission</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmission_resetmissionwithdata"><div class="api-col left">Reset Data</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmission_resetmissionwithdata_inline">resetMissionWithData</a></div></div><div class="inline-doc" id="djihotpointmission_resetmissionwithdata_inline"

><div class="article"><h6 ><font color="#AAA">method </font>resetMissionWithData</h6></div>

~~~java
 void resetMissionWithData(HotpointMission data) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Reset Mission with Hotpoint Mission data.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission">HotpointMission</a> <font color="#000">data</td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission">HotpointMission</a></code>.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djihotpointmission_djihotpointmaxradius"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djihotpointmission_djihotpointmaxradius_inline">MAX_RADIUS</a></div></div><div class="inline-doc" id="djihotpointmission_djihotpointmaxradius_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MAX_RADIUS</h6></div>

~~~java
 static final double MAX_RADIUS = 500
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Maximum radius, in meters, of the circular path the aircraft will fly around the  point of interest. Currently 500m.

</div>

<div class="api-row" id="djihotpointmission_djihotpointminradius"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djihotpointmission_djihotpointminradius_inline">MIN_RADIUS</a></div></div><div class="inline-doc" id="djihotpointmission_djihotpointminradius_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MIN_RADIUS</h6></div>

~~~java
 static final double MIN_RADIUS = 5
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Minimum radius, in meters, of the circular path the aircraft will fly around the  point of interest.

</div>

<div class="api-row" id="djihotpointmission_djihotpointmaxaltitude"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djihotpointmission_djihotpointmaxaltitude_inline">MAX_ALTITUDE</a></div></div><div class="inline-doc" id="djihotpointmission_djihotpointmaxaltitude_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MAX_ALTITUDE</h6></div>

~~~java
 static final double MAX_ALTITUDE = 500
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Maximum altitude in meters for a Hotpoint mission.

</div>

<div class="api-row" id="djihotpointmission_djihotpointminaltitude"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djihotpointmission_djihotpointminaltitude_inline">MIN_ALTITUDE</a></div></div><div class="inline-doc" id="djihotpointmission_djihotpointminaltitude_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MIN_ALTITUDE</h6></div>

~~~java
 static final double MIN_ALTITUDE = 5
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Minimum altitude in meters for a Hotpoint mission.

</div>

<div class="api-row" id="djihotpointmission_djihotpointstartpoint"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djihotpointmission_djihotpointstartpoint_inline">HotpointStartPoint</a></div></div><div class="inline-doc" id="djihotpointmission_djihotpointstartpoint_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>HotpointStartPoint</h6></div>

~~~java
@EXClassNullAway
 enum HotpointStartPoint 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Aircraft starting point relative to the hotpoint.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djihotpointmission_djihotpointstartpoint_north_inline"></a>NORTH</td><td><font color="#666">Start from the North.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihotpointmission_djihotpointstartpoint_south_inline"></a>SOUTH</td><td><font color="#666">Start from the South.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihotpointmission_djihotpointstartpoint_west_inline"></a>WEST</td><td><font color="#666">Start from the West.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihotpointmission_djihotpointstartpoint_east_inline"></a>EAST</td><td><font color="#666">Start from the East.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihotpointmission_djihotpointstartpoint_nearest_inline"></a>NEAREST</td><td><font color="#666">Start the circle surrounding the hotpoint at the nearest point on the  circle to the aircraft's current location.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djihotpointmission_djihotpointheading"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djihotpointmission_djihotpointheading_inline">HotpointHeading</a></div></div><div class="inline-doc" id="djihotpointmission_djihotpointheading_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>HotpointHeading</h6></div>

~~~java
@EXClassNullAway
 enum HotpointHeading 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Heading of the aircraft while orbiting the hotpoint.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djihotpointmission_djihotpointheading_alongcirclelookingforward_inline"></a>ALONG_CIRCLE_LOOKING_FORWARDS</td><td><font color="#666">Heading is in the forward direction of travel along the circular path.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihotpointmission_djihotpointheading_alongcirclelookingbackward_inline"></a>ALONG_CIRCLE_LOOKING_BACKWARDS</td><td><font color="#666">Heading is in the backward direction of travel along the circular path.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihotpointmission_djihotpointheading_towardhotpoint_inline"></a>TOWARDS_HOT_POINT</td><td><font color="#666">Heading is toward the hotpoint.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihotpointmission_djihotpointheading_awayfromhotpoint_inline"></a>AWAY_FROM_HOT_POINT</td><td><font color="#666">Heading of the aircraft is looking away from the hotpoint. It is in the  direction of the vector defined from the hotpoint to the aircraft.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihotpointmission_djihotpointheading_controlledbyremotecontroller_inline"></a>CONTROLLED_BY_REMOTE_CONTROLLER</td><td><font color="#666">Heading is controlled by the remote controller.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihotpointmission_djihotpointheading_usinginitialheading_inline"></a>USING_INITIAL_HEADING</td><td><font color="#666">The heading remains the same as the heading of the aircraft when the mission started.</td></tr></table></html>

##### Class Members:

</div>


