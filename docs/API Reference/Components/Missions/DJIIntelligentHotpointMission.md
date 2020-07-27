<div class="article"><h1 ><font color="#AAA">class </font>IntelligentHotpointMission</h1></div>

~~~java
@EXClassNullAway
 class IntelligentHotpointMission 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">This class represents an Intelligent Hotpoint mission. In an Intelligent Hotpoint mission, the aircraft will  repeatedly fly circles of a constant radius around a specified point called a Hotpoint. The user can control  the aircraft to fly around the Hotpoint with a specific radius and altitude. During execution, the user can  also use the physical remote controller to modify its radius and speed. It is only supported by Mavic 2 Zoom and Mavic 2 Pro.



##### Class Members:

<div class="api-row" id="djiintelligenthotpointmission_constructor"><div class="api-col left">Constructor</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmission_constructor_inline">IntelligentHotpointMission</a></div></div><div class="inline-doc" id="djiintelligenthotpointmission_constructor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>IntelligentHotpointMission</h6></div>

~~~java
 IntelligentHotpointMission(LocationCoordinate2D hotpoint)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Constructor method for the DJIIntelligentHotpointMission.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a> <font color="#000">hotpoint</td><td><font color="#666"><i>Location of the hotpoint.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmission_checkparameters"><div class="api-col left">Check Parameters</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmission_checkparameters_inline">checkParameters</a></div></div><div class="inline-doc" id="djiintelligenthotpointmission_checkparameters_inline"

><div class="article"><h6 ><font color="#AAA">method </font>checkParameters</h6></div>

~~~java
@Nullable
 DJIError checkParameters() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Checks if the configuration for mission is valid before calling <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator_startmission">startMission</a></code> of <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator">IntelligentHotpointMissionOperator</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>Null if everything is OK, a DJIError if at least one is invalid.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmission_hotpoint"><div class="api-col left">Hotpoint</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmission_hotpoint_inline">setHotpoint</a></div></div><div class="inline-doc" id="djiintelligenthotpointmission_hotpoint_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setHotpoint</h6></div>

~~~java
 void setHotpoint(LocationCoordinate2D hotpoint)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Sets the coordinate of the hotpoint.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a> <font color="#000">hotpoint</td><td><font color="#666"><i>A <code><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></code> object of hotpoint.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmission_gethotpoint"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmission_gethotpoint_inline">getHotpoint</a></div></div><div class="inline-doc" id="djiintelligenthotpointmission_gethotpoint_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHotpoint</h6></div>

~~~java
 LocationCoordinate2D getHotpoint()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Gets the coordinate of the hotpoint.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></td><td><font color="#666"><i>A <code><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></code> object of hotpoint.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiintelligenthotpointmission_djiintelligenthotpointmaxradius"><div class="api-col left">Radius</div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmission_djiintelligenthotpointmaxradius_inline">MAX_RADIUS</a></div></div><div class="inline-doc" id="djiintelligenthotpointmission_djiintelligenthotpointmaxradius_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MAX_RADIUS</h6></div>

~~~java
 static final double MAX_RADIUS = 500
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Maximum radius, in meters, of the circular path the aircraft will fly around the point of interest. Currently 500m.

</div>

<div class="api-row" id="djiintelligenthotpointmission_djiintelligenthotpointminradius"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmission_djiintelligenthotpointminradius_inline">MIN_RADIUS</a></div></div><div class="inline-doc" id="djiintelligenthotpointmission_djiintelligenthotpointminradius_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MIN_RADIUS</h6></div>

~~~java
 static final double MIN_RADIUS = 5
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Minimum radius, in meters, of the circular path the aircraft will fly around the point of interest.

</div>

<div class="api-row" id="djiintelligenthotpointmission_djiintelligenthotpointmaxaltitude"><div class="api-col left">Altitude</div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmission_djiintelligenthotpointmaxaltitude_inline">MAX_ALTITUDE</a></div></div><div class="inline-doc" id="djiintelligenthotpointmission_djiintelligenthotpointmaxaltitude_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MAX_ALTITUDE</h6></div>

~~~java
 static final double MAX_ALTITUDE = 500
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Maximum altitude in meters for an Intelligent Hotpoint mission.

</div>

<div class="api-row" id="djiintelligenthotpointmission_djiintelligenthotpointminaltitude"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmission_djiintelligenthotpointminaltitude_inline">MIN_ALTITUDE</a></div></div><div class="inline-doc" id="djiintelligenthotpointmission_djiintelligenthotpointminaltitude_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MIN_ALTITUDE</h6></div>

~~~java
 static final double MIN_ALTITUDE = 5
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Minimum altitude in meters for an Intelligent Hotpoint mission.

</div>

<div class="api-row" id="djiintelligenthotpointmission_djiintelligenthotpointmissionmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmission_djiintelligenthotpointmissionmode_inline">IntelligentHotpointMissionMode</a></div></div><div class="inline-doc" id="djiintelligenthotpointmission_djiintelligenthotpointmissionmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>IntelligentHotpointMissionMode</h6></div>

~~~java
 enum IntelligentHotpointMissionMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flightassistant</td></tr></table></html>



##### Description:



<font color="#666">This enum defines the mission mode.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiintelligenthotpointmission_djiintelligenthotpointmissionmode_gps_inline"></a>GPS_BASED</td><td><font color="#666">This mode means current mission is started by <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator_startmission">startMission</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiintelligenthotpointmission_djiintelligenthotpointmissionmode_vision_inline"></a>VISION_BASED</td><td><font color="#666">This mode means current mission is started by <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator_startrecognizetargetinrect">startRecognizeTargetInRect</a></code>  and <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator_acceptconfirmationwithcompletion">acceptConfirmation</a></code>. In this mode, you  can <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator_resetgimbaltocenter">resetGimbalToCenter</a></code> while mission is executing or paused.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiintelligenthotpointmission_djiintelligenthotpointmissionmode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The mission mode is unknown.</td></tr></table></html>

##### Class Members:

</div>


