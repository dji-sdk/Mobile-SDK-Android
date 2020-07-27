<div class="article"><h1 ><font color="#AAA">class </font>DJIWaypointV2Error</h1></div>

~~~java
 class DJIWaypointV2Error extends DJIError 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code></td></tr></table></html>



##### Description:



<font color="#666">Errors related to the payload.



##### Class Members:

<div class="api-row" id="djierror_djiwaypointv2error_geterrortype"><div class="api-col left">Get Error Type</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_geterrortype_inline">getDJIError</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_geterrortype_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDJIError</h6></div>

~~~java
 static DJIWaypointV2Error getDJIError(int errorCode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Get the mission waypoint error type.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">errorCode</td><td><font color="#666"><i>An int value of the error code.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/SDKError/DJIError_DJIWaypointV2Error.html#djierror_djiwaypointv2error">DJIWaypointV2Error</a></td><td><font color="#666"><i>Value of the <code><a href="/Components/SDKError/DJIError_DJIWaypointV2Error.html#djierror_djiwaypointv2error">DJIWaypointV2Error</a></code> enum.</i></td></tr></table></html></div>



#### Members

<div class="api-row" id="djierror_djiwaypointv2error_missioncountoverrange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_missioncountoverrange_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_missioncountoverrange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error MISSION_COUNT_OVER_RANGE
            = new DJIWaypointV2Error("The mission waypoint count is larger than max waypoint count of 65535..", -2001)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The mission waypoint count is larger than max waypoint count 65535.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_missioncounttoofew"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_missioncounttoofew_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_missioncounttoofew_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error MISSION_COUNT_TOO_FEW
            = new DJIWaypointV2Error("The mission waypoint count than less than min waypoint count 2.", -2002)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The mission waypoint count is less than min waypoint count 2.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_missionmaxflightspeedinvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_missionmaxflightspeedinvalid_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_missionmaxflightspeedinvalid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error MISSION_MAX_FLIGHT_SPEED_INVALID
            = new DJIWaypointV2Error("The mission max flight speed greaterthan 15m/s or less than 2m/s.", -2004)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The mission <code>DJIMutableWaypointV2Mission_maxFlightSpeed</code> is greater than 15m/s or less than 2m/s. See <code>DJIMutableWaypointV2Mission_maxFlightSpeed</code>.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_missionautoflightspeedinvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_missionautoflightspeedinvalid_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_missionautoflightspeedinvalid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error MISSION_AUTO_FLIGHT_SPEED_INVALID
            = new DJIWaypointV2Error("The mission auto flight speed is greater than max flight speed.", -2005)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The mission <code>DJIMutableWaypointV2Mission_autoFlightSpeed</code> is greater than <code>DJIMutableWaypointV2Mission_maxFlightSpeed</code>.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_missiongotofirstwaypointmodeinvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_missiongotofirstwaypointmodeinvalid_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_missiongotofirstwaypointmodeinvalid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error MISSION_GOTO_FIRST_WAYPOINT_MODE_INVALID
            = new DJIWaypointV2Error("The mission goto first waypoint mode is invalid.", -2006)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The mission <code>DJIMutableWaypointV2Mission_gotoFirstWaypointMode</code> is out of range of <code><a href="/Components/Missions/DJIWaypointV2Mission.html#djiwaypointv2missiongotofirstwaypointmode">MissionGotoWaypointMode</a></code>.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_missionfinishedactioninvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_missionfinishedactioninvalid_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_missionfinishedactioninvalid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error MISSION_FINISHED_ACTION_INVALID
            = new DJIWaypointV2Error("The mission finished action is invalid.", -2007)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The mission <code><a href="/Components/Missions/DJIWaypointV2Mission_Builder.html#djiwaypointv2mission_builder_setfinishedaction">setFinishedAction</a></code> is out of range of <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2mission_djiwaypointv2missionfinishedaction">MissionFinishedAction</a></code>.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_missionexitmissiononrcsignallostinvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_missionexitmissiononrcsignallostinvalid_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_missionexitmissiononrcsignallostinvalid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error MISSION_EXIT_MISSION_ON_RC_SIGNAL_LOST_INVALID
            = new DJIWaypointV2Error("The mission exit mission on RC signal lost is invalid.", -2008)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The mission <code>DJIMutableWaypointV2Mission_exitMissionOnRCSignalLost</code> is invalid.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_missionalreadyexecuting"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_missionalreadyexecuting_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_missionalreadyexecuting_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error MISSION_ALREADY_EXECUTING
            = new DJIWaypointV2Error("There is already a mission in execution when trying to upload a new mission.", -2010)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">There is already a mission executing when trying to upload a new mission.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_uploadwaypointcountovermissionwaypointcount"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_uploadwaypointcountovermissionwaypointcount_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_uploadwaypointcountovermissionwaypointcount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error UPLOAD_WAYPOINT_COUNT_OVER_MISSION_WAYPOINT_COUNT
            = new DJIWaypointV2Error("The upload waypoint count is bigger than mission waypoint count.", -2012)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The upload waypoint count is bigger than mission waypoint count.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_missionwaypointdistancetooclose"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_missionwaypointdistancetooclose_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_missionwaypointdistancetooclose_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error MISSION_WAYPOINT_DISTANCE_TOO_CLOSE
            = new DJIWaypointV2Error("Waypoint is too close to two adjacent waypoints. The min distance is 0.5m.", -2014)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Waypoint is too close to two adjacent waypoints. The min distance is 0.5m.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_missionwaypointdistancetofar"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_missionwaypointdistancetofar_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_missionwaypointdistancetofar_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error MISSION_WAYPOINT_DISTANCE_TO_FAR
            = new DJIWaypointV2Error("Waypoint is too from two adjacent waypoints, The max distance is 5km.", -2015)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Waypoint is too far from two adjacent waypoints, The max distance is 5km.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_missionwaypointmaxflightspeedovermissionmaxflightspeed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_missionwaypointmaxflightspeedovermissionmaxflightspeed_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_missionwaypointmaxflightspeedovermissionmaxflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error MISSION_WAYPOINT_MAX_FLIGHT_SPEED_OVER_MISSION_MAX_FLIGHT_SPEED
            = new DJIWaypointV2Error("The upload waypoints have onewaypoint max flight speed greaterthan mission max flight speed.", -2016)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The upload waypoints have a <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_maxflightspeed">getMaxFlightSpeed</a></code> is greater than <code>DJIMutableWaypointV2Mission_maxFlightSpeed</code> waypoint.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_waypointautoflightspeedoverwaypointmaxflightspeed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_waypointautoflightspeedoverwaypointmaxflightspeed_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_waypointautoflightspeedoverwaypointmaxflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error WAYPOINT_AUTO_FLIGHT_SPEED_OVER_WAYPOINT_MAX_FLIGHT_SPEED
            = new DJIWaypointV2Error("The upload waypoints have one waypoint auto flight speed greater than max flight speed.", -2017)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The upload waypoint has a <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_autoflightspeed">getAutoFlightSpeed</a></code> is greater than <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_maxflightspeed">getMaxFlightSpeed</a></code> waypoint.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_waypointautoflightspeedovermissionmaxflightspeed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_waypointautoflightspeedovermissionmaxflightspeed_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_waypointautoflightspeedovermissionmaxflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error WAYPOINT_AUTO_FLIGHT_SPEED_OVER_MISSION_MAX_FLGHT_SPEED
            = new DJIWaypointV2Error("The upload waypoints have one waypoint auto flight speed greater than mission max flight speed.", -2018)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The upload waypoints have a  <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_autoflightspeed">getAutoFlightSpeed</a></code> is greater than <code>DJIMutableWaypointV2Mission_maxFlightSpeed</code> waypoint.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_waypointheadingmodeinvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_waypointheadingmodeinvalid_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_waypointheadingmodeinvalid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error WAYPOINT_HEADING_MODE_INVALID
            = new DJIWaypointV2Error("The waypoint heading mode is invalid.", -2019)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The waypoint <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_headingmode">getHeadingMode</a></code> is invalid.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_waypointheadinginvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_waypointheadinginvalid_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_waypointheadinginvalid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error WAYPOINT_HEADING_INVALID
            = new DJIWaypointV2Error("The waypoint heading invalid.", -2020)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The waypoint <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_heading">getHeading</a></code> is invalid. See <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_heading">getHeading</a></code>.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_waypointturnmodeinvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_waypointturnmodeinvalid_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_waypointturnmodeinvalid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error WAYPOINT_TURN_MODE_INVALID
            = new DJIWaypointV2Error("The waypoint turn mode is invalid.", -2021)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The waypoint <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_turnmode">getTurnMode</a></code> is invalid.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_waypointflightpathmodeinvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_waypointflightpathmodeinvalid_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_waypointflightpathmodeinvalid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error WAYPOINT_FLIGHT_PATH_MODE_INVALID
            = new DJIWaypointV2Error("The waypoint flight path mode is invalid.", -2022)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The waypoint <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_flightpathmode">getFlightPathMode</a></code> is invalid.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_waypointdampingdistanceinvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_waypointdampingdistanceinvalid_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_waypointdampingdistanceinvalid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error WAYPOINT_DAMPING_DISTANCE_INVALID
            = new DJIWaypointV2Error("The waypoint damping distance is greater than or equal the distance of adjacent waypoint.", -2027)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The waypoint <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_dampingdistance">getDampingDistance</a></code> is greater than or equal to the distance of adjacent waypoint.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_lastwaypointflightpathmodeinvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_lastwaypointflightpathmodeinvalid_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_lastwaypointflightpathmodeinvalid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error LAST_WAYPOINT_FLIGHT_PATH_MODE_INVALID
            = new DJIWaypointV2Error("The waypoint flight path mode is invalid for last waypoint.", -2024)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The waypoint <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_flightpathmode">getFlightPathMode</a></code> is invalid for last waypoint.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_uploadwaypointindexnotcontinue"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_uploadwaypointindexnotcontinue_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_uploadwaypointindexnotcontinue_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error UPLOAD_WAYPOINT_INDEX_NOT_CONTINUE
            = new DJIWaypointV2Error("The index of upload waypoint is not continue after the stored waypoint.", -2025)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The index of upload waypoint is not continue after the stored waypoint.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_firstwaypointflightpathmodeinvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_firstwaypointflightpathmodeinvalid_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_firstwaypointflightpathmodeinvalid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error FIRST_WAYPOINT_FLIGHT_PATH_MODE_INVALID
            = new DJIWaypointV2Error("The waypoint flight path mode is invalid for first waypoint.", -2026)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The waypoint <code><a href="/Components/Missions/DJIWaypointV2.html#djiwaypointv2_flightpathmode">getFlightPathMode</a></code> is invalid for first waypoint.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_waypointcoordinateinvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_waypointcoordinateinvalid_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_waypointcoordinateinvalid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error WAYPOINT_COORDINATE_INVALID
            = new DJIWaypointV2Error("The waypoint position coordinate exceeds rational range.", -2028)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The waypoint position coordinate exceeds rational range.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_exceedflyingradiuslimit"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_exceedflyingradiuslimit_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_exceedflyingradiuslimit_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error EXCEED_FLYING_RADIUS_LIMIT
            = new DJIWaypointV2Error("The waypoint position exceeds radius limit.", -2030)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The waypoint position exceeds radius limit.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_exceedflyingheightlimit"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_exceedflyingheightlimit_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_exceedflyingheightlimit_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error EXCEED_FLYING_HEIGHT_LIMIT
            = new DJIWaypointV2Error("The waypoint position exceeds height limit.", -2031)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The waypoint position exceeds height limit.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_sdkversionnotmatched"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_sdkversionnotmatched_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_sdkversionnotmatched_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error SDK_VERSION_NOT_MATCHED
            = new DJIWaypointV2Error("The version of the SDK doesn't match the firmware version.", -2032)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The version of the SDK doesn't match the firmware version.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_downloadmissionrangeoverstoragecount"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_downloadmissionrangeoverstoragecount_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_downloadmissionrangeoverstoragecount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error DOWNLOAD_MISSION_RANGE_OVER_STORAGE_COUNT
            = new DJIWaypointV2Error("The index of first and end waypoint expected to download is not in range of waypoints stored in aircraft.", -3001)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The index of first and last waypoint expected to download is not in range of waypoints stored in aircraft.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_nomissionuploadedinaircraft"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_nomissionuploadedinaircraft_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_nomissionuploadedinaircraft_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error NO_MISSION_UPLOADED_IN_AIRCRAFT
            = new DJIWaypointV2Error("There is no mission uploaded in aircraft.", -3002)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">There is no mission uploaded in aircraft.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_downloadwaypointnotuploaded"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_downloadwaypointnotuploaded_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_downloadwaypointnotuploaded_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error DOWNLOAD_WAYPOINT_NOT_UPLOADED
            = new DJIWaypointV2Error("The mission info is not uploaded yet.", -3003)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The mission info is not uploaded yet.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_aircraftcurrentpostiontofirstwaypointtoofar"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_aircraftcurrentpostiontofirstwaypointtoofar_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_aircraftcurrentpostiontofirstwaypointtoofar_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error AIRCRAFT_CURRENT_POSITION_TO_FIRST_WAYPOINT_TOO_FAR
            = new DJIWaypointV2Error("The aircraft current position is too far away from the first waypoint.", -4001)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft current position is too far away from the first waypoint.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_uploadedwaypointstoofew"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_uploadedwaypointstoofew_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_uploadedwaypointstoofew_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error UPLOADED_WAYPOINTS_TOO_FEW
            = new DJIWaypointV2Error("The uploaded waypoints is too few.", -4005)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The uploaded waypoints are too few.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_nomissionexecuting"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_nomissionexecuting_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_nomissionexecuting_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error NO_MISSION_EXECUTING
            = new DJIWaypointV2Error("There is no mission executing.", -4006)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">There is no mission executing.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_missionalreadystarted"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_missionalreadystarted_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_missionalreadystarted_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error MISSION_ALREADY_STARTED
            = new DJIWaypointV2Error("The mission was already started.", -4007)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The mission has already started by calling <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_startmission">startMission</a></code>.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_missionalreadystopped"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_missionalreadystopped_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_missionalreadystopped_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error MISSION_ALREADY_STOPPED
            = new DJIWaypointV2Error("The mission was already stopped.", -4008)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The mission has already stopped by calling <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_stopmission">stopMission</a></code>.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_noexecutingmissiontorecover"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_noexecutingmissiontorecover_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_noexecutingmissiontorecover_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error NO_EXECUTING_MISSION_TO_RECOVER
            = new DJIWaypointV2Error("There is no executing mission to recover mission.", -4011)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">There is no executing mission to recover when calling <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_recovermission">recoverMission</a></code>.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_missionalreadyinterrupted"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_missionalreadyinterrupted_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_missionalreadyinterrupted_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error MISSION_ALREADY_INTERRUPTED
            = new DJIWaypointV2Error("The mission already was interrupted.", -4012)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The mission has already been interrupted by calling <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_interruptmission">interruptMission</a></code>.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_recovernorecordedpoint"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_recovernorecordedpoint_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_recovernorecordedpoint_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error RECOVER_NO_RECORDED_POINT
            = new DJIWaypointV2Error("There is no recorded point to recover.", -4015)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">There is no waypoint recorded to recover the mission when <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_recovermission">recoverMission</a></code> is called.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_aircraftflyingstatuserror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_aircraftflyingstatuserror_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_aircraftflyingstatuserror_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error AIRCRAFT_FLYING_STATUS_ERROR
            = new DJIWaypointV2Error("The aircraft flying stauts bad.", -5001)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft flying status is bad.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_aircraftstatehomepointnotrecord"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_aircraftstatehomepointnotrecord_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_aircraftstatehomepointnotrecord_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error AIRCRAFT_STATE_HOME_POINT_NOT_RECORD
            = new DJIWaypointV2Error("The aircraft home point is not recorded yet.", -5002)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft home point is not recorded yet.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_aircraftgpssignalweak"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_aircraftgpssignalweak_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_aircraftgpssignalweak_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error AIRCRAFT_GPS_SIGNAL_WEEK
            = new DJIWaypointV2Error("The aircraft GPS signal is weak.", -5003)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft GPS signal is weak.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_aircraftrtknotready"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_aircraftrtknotready_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_aircraftrtknotready_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error AIRCRAFT_RTK_NOT_READY
            = new DJIWaypointV2Error("The aircraft RTK is not ready.", -5004)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft RTK is not ready.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_missioncrossnoflyzone"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_missioncrossnoflyzone_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_missioncrossnoflyzone_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error MISSION_CROSS_NO_FLY_ZONE
            = new DJIWaypointV2Error("The mission is across the no-fly zone.", -6001)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The mission is across the no-fly zone.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_aircraftlowbattery"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_aircraftlowbattery_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_aircraftlowbattery_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error AIRCRAFT_LOW_BATTERY
            = new DJIWaypointV2Error("The aircraft battery is low.", -6002)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft battery is low.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_uploadedactionidduplicated"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_uploadedactionidduplicated_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_uploadedactionidduplicated_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error UPLOADED_ACTION_ID_DUPLICATED
            = new DJIWaypointV2Error("The uploaded action Id is duplicated.", -7001)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The uploaded action ID is duplicated.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_actionstoragenotenough"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_actionstoragenotenough_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_actionstoragenotenough_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error ACTION_STORAGE_NOT_ENOUGH
            = new DJIWaypointV2Error("There is not enough memory space to store actions in aircraft.", -7002)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">There is not enough space to store actions in aircraft.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_downloadactionsfailed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_downloadactionsfailed_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_downloadactionsfailed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error DOWNLOAD_ACTIONS_FAILED
            = new DJIWaypointV2Error("Download actions failed.", -7004)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Download actions failed.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_uploadactiontriggertypeinvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_uploadactiontriggertypeinvalid_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_uploadactiontriggertypeinvalid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error UPLOAD_ACTION_TRIGGER_TYPE_INVALID
            = new DJIWaypointV2Error("The upload action trigger type is invalid.", -8001)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The upload action trigger type is invalid.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_actionassociatetriggertypeinvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_actionassociatetriggertypeinvalid_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_actionassociatetriggertypeinvalid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error ACTION_ASSOCIATE_TRIGGER_TYPE_INVALID
            = new DJIWaypointV2Error("The action associate trigger type is invalid.", -8005)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The action associate trigger <code><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2AssociateTriggerParam.html#djiwaypointv2trigger_djiwaypointv2associatetriggerparam_actionassociatedtype">getAssociateType</a></code> is invalid.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_actionintervaltriggertypeinvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_actionintervaltriggertypeinvalid_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_actionintervaltriggertypeinvalid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error ACTION_INTERVAL_TRIGGER_TYPE_INVALID
            = new DJIWaypointV2Error("The action interval trigger type is invalid.", -8006)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The action associate trigger <code><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2IntervalTriggerParam.html#djiwaypointv2trigger_djiwaypointv2intervaltriggerparam_actionintervaltype">getType</a></code> is invalid.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_actionactuatornotsupport"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_actionactuatornotsupport_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_actionactuatornotsupport_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error ACTION_ACTUATOR_NOT_SUPPORT
            = new DJIWaypointV2Error("The action actuator is not supported.", -9001)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The action actuator is not supported.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_actionactuatortypeinvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_actionactuatortypeinvalid_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_actionactuatortypeinvalid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error ACTION_ACTUATOR_TYPE_INVALID
            = new DJIWaypointV2Error("The action actuator type is invalid.", -9002)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The action actuator <code><a href="/Components/Missions/DJIWaypointV2Action_DJIWaypointV2Actuator.html#djiwaypointv2action_djiwaypointv2actuator_type">getActuatorType</a></code> is invalid.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_actionactuatoroperationtypeinvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_actionactuatoroperationtypeinvalid_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_actionactuatoroperationtypeinvalid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error ACTION_ACTUATOR_OPERATION_TYPE_INVALID
            = new DJIWaypointV2Error("The action actuator operation type is invalid.", -9003)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The action actuator operation type is invalid. See <code><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2CameraActuatorParam.html#djiwaypointv2actuator_djiwaypointv2cameraactuatorparam_operationtype">getCameraOperationType</a></code> or <code><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2AircraftControlParam.html#djiwaypointv2actuator_djiwaypointv2aircraftcontrolparam_operationtype">getAircraftControlType</a></code>  or <code><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2GimbalActuatorParam.html#djiwaypointv2actuator_djiwaypointv2gimbalactuatorparam_operationtype">getOperationType</a></code>.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_actionactuatorgimbalparaminvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_actionactuatorgimbalparaminvalid_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_actionactuatorgimbalparaminvalid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error ACTION_ACTUATOR_GIMBAL_PARAM_INVALID
            = new DJIWaypointV2Error("The action gimbal actuator parameters invalid.", -11001)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The action gimbal actuator parameters are invalid.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_actionrotategimbalfailed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_actionrotategimbalfailed_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_actionrotategimbalfailed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error ACTION_ROTATE_GIMBAL_FAILED
            = new DJIWaypointV2Error("The action actuator rotate gimbal failed.", -11004)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The action actuator rotate gimbal failed.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_actionrotateaircraftyawparaminvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_actionrotateaircraftyawparaminvalid_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_actionrotateaircraftyawparaminvalid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error ACTION_ROTATE_AIRCRAFT_YAW_PARAM_INVALID
            = new DJIWaypointV2Error("The action of rotate aircraft yaw parameters are invalid.", -12001)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The action <code><a href="/Components/Missions/DJIWaypointV2Actuator_DJIWaypointV2AircraftControlParam.html#djiwaypointv2actuator_djiwaypointv2aircraftcontrolparam">WaypointAircraftControlParam</a></code> parameters are invalid.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_actionrotateaircraftyawfailed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_actionrotateaircraftyawfailed_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_actionrotateaircraftyawfailed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error ACTION_ROTATE_AIRCRAFT_YAW_FAILED
            = new DJIWaypointV2Error("The action actuator rotate aircraft yaw execute failed.", -12002)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The action actuator rotate aircraft yaw execute failed.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_actuatorandtriggerdonotmatch"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_actuatorandtriggerdonotmatch_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_actuatorandtriggerdonotmatch_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error ACTUATOR_AND_TRIGGER_DO_NOT_MATCH
            = new DJIWaypointV2Error("The action actuator and the trigger type do not match.", -12)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The action actuator and the trigger type do not match.

</div>

<div class="api-row" id="djierror_djiwaypointv2error_unknown"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiwaypointv2error_unknown_inline">DJIWaypointV2Error</a></div></div><div class="inline-doc" id="djierror_djiwaypointv2error_unknown_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJIWaypointV2Error</h6></div>

~~~java
 static DJIWaypointV2Error UNKNOWN
            = new DJIWaypointV2Error("UnKnown", 10010)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Unknown error type.

</div>



##### Inherited Methods:

<div class="api-row" id="djierror_djisdkflighthuberrorforcode"><div class="api-col left">dji.common.error.DJIError</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflighthuberrorforcode_inline">getDJIError</a></div></div><div class="inline-doc" id="djierror_djisdkflighthuberrorforcode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDJIError</h6></div>

~~~java
 static DJIError getDJIError(int errorCode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Returns the specific error in the <code><a href="/Components/SDKError/DJIError_DJISDKFlightHubError.html#djierror_djisdkflighthuberror">DJIFlightHubError</a></code> according to the error code.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">errorCode</td><td><font color="#666"><i>errorCode for <code><a href="/Components/SDKError/DJIError_DJISDKFlightHubError.html#djierror_djisdkflighthuberror">DJIFlightHubError</a></code>.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>An NSError object initialized with errorCode. If the errorCode was 0, returns nil.</i></td></tr></table></html></div>

<div class="api-row" id="djierror_djiutmisserrorforcodewitherrorcode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiutmisserrorforcodewitherrorcode_inline">getDJIError</a></div></div><div class="inline-doc" id="djierror_djiutmisserrorforcodewitherrorcode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDJIError</h6></div>

~~~java
 static DJIError getDJIError(int errorCode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.utmiss</td></tr></table></html>



##### Description:



<font color="#666">Get DJIUTMISSError.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">errorCode</td><td><font color="#666"><i>An int value of error code.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>An object of <code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djierror_getdescription"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_getdescription_inline">getDescription</a></div></div><div class="inline-doc" id="djierror_getdescription_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDescription</h6></div>

~~~java
 String getDescription() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Returns the description of the error code.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>The description of the error code.</i></td></tr></table></html></div>

<div class="api-row" id="djierror_setdescription"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_setdescription_inline">setDescription</a></div></div><div class="inline-doc" id="djierror_setdescription_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setDescription</h6></div>

~~~java
 void setDescription(String desc) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Sets the description for the error code.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String <font color="#000">desc</td><td><font color="#666"><i>Description string.</i></td></tr></table></html></div>


