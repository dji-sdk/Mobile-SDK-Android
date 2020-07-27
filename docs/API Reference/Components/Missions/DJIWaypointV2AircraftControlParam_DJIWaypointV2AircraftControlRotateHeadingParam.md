<div class="article"><h1 ><font color="#AAA">class </font>WaypointAircraftControlRotateYawParam</h1></div>

~~~java
 class WaypointAircraftControlRotateYawParam 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">This class defines how the aircraft rotates on the yaw axis.



##### Class Members:

<div class="api-row" id="djiwaypointv2aircraftcontrolparam_djiwaypointv2aircraftcontrolrotateheadingparam_isrelative"><div class="api-col left">Check Relative</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2aircraftcontrolparam_djiwaypointv2aircraftcontrolrotateheadingparam_isrelative_inline">isRelative</a></div></div><div class="inline-doc" id="djiwaypointv2aircraftcontrolparam_djiwaypointv2aircraftcontrolrotateheadingparam_isrelative_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isRelative</h6></div>

~~~java
 boolean isRelative() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">Determines the aircraft rotate heading relative. If <code>true</code>, when the aircraft is rotating, relative to the current angle.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check aircraft rotate heading relative.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2aircraftcontrolparam_djiwaypointv2aircraftcontrolrotateheadingparam_direction"><div class="api-col left">Direction</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2aircraftcontrolparam_djiwaypointv2aircraftcontrolrotateheadingparam_direction_inline">getDirection</a></div></div><div class="inline-doc" id="djiwaypointv2aircraftcontrolparam_djiwaypointv2aircraftcontrolrotateheadingparam_direction_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDirection</h6></div>

~~~java
 WaypointV2MissionTypes.WaypointV2TurnMode getDirection() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">Determines the direction how aircraft changes its heading.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">WaypointV2MissionTypes.<a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2turnmode">WaypointV2TurnMode</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_djiwaypointv2turnmode">WaypointV2TurnMode</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2aircraftcontrolparam_djiwaypointv2aircraftcontrolrotateheadingparam_heading"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2aircraftcontrolparam_djiwaypointv2aircraftcontrolrotateheadingparam_heading_inline">getYawAngle</a></div></div><div class="inline-doc" id="djiwaypointv2aircraftcontrolparam_djiwaypointv2aircraftcontrolrotateheadingparam_heading_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getYawAngle</h6></div>

~~~java
 float getYawAngle() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The heading in degrees to which the aircraft will rotate control by action. If isRelative is <code>true</code> A heading has a range of [-180, 180]  degrees, where 0 represents True North.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of yaw angle.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiwaypointv2aircraftcontrolparam_djiwaypointv2aircraftcontrolrotateheadingparam_builder"><div class="api-col left">Make Waypoint V2 Aircraft Control Rotate Heading Param</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2AircraftControlParam_DJIWaypointV2AircraftControlRotateHeadingParam_Builder.html">Builder</a></div></div>
