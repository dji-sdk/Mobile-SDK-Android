<div class="article"><h1 ><font color="#AAA">class </font>DJIMissionError</h1></div>

~~~java
@EXClassNullAway
 class DJIMissionError extends DJIError 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code></td></tr></table></html>



##### Description:



<font color="#666">Defines all mission manager related errors.



##### Class Members:



#### Mission

<div class="api-row" id="djierror_djisdkmissionerror_missionnotstarted"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_missionnotstarted_inline">MISSION_NOT_STARTED</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_missionnotstarted_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MISSION_NOT_STARTED</h6></div>

~~~java
 static final DJIMissionError MISSION_NOT_STARTED = new DJIMissionError("Mission is not started yet")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Mission is not started yet.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_commonstateerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_commonstateerror_inline">COMMON_STATE_ERROR</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_commonstateerror_inline"

><div class="article"><h6 ><font color="#AAA">final </font>COMMON_STATE_ERROR</h6></div>

~~~java
 static final DJIMissionError COMMON_STATE_ERROR = new DJIMissionError("The command is not supported in current state.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The command is not supported in current state.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_waypointmissionerrormaxflightspeed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_waypointmissionerrormaxflightspeed_inline">MAX_FLIGHT_SPEED_NOT_VALID</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_waypointmissionerrormaxflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MAX_FLIGHT_SPEED_NOT_VALID</h6></div>

~~~java
 static final DJIMissionError MAX_FLIGHT_SPEED_NOT_VALID =
            new DJIMissionError("Max Flight speed value provided is invalid")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Max Flight speed value provided is invalid.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_waypointmissionerrorautoflightspeed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_waypointmissionerrorautoflightspeed_inline">AUTO_FLIGHT_SPEED_NOT_VALID</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_waypointmissionerrorautoflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">final </font>AUTO_FLIGHT_SPEED_NOT_VALID</h6></div>

~~~java
 static final DJIMissionError AUTO_FLIGHT_SPEED_NOT_VALID =
            new DJIMissionError("Auto flight speed value provided is invalid")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Auto flight speed value provided is invalid.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_waypointmissionerrorrepeattime"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_waypointmissionerrorrepeattime_inline">REPEAT_TIME_NOT_VALID</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_waypointmissionerrorrepeattime_inline"

><div class="article"><h6 ><font color="#AAA">final </font>REPEAT_TIME_NOT_VALID</h6></div>

~~~java
 static final DJIMissionError REPEAT_TIME_NOT_VALID =
            new DJIMissionError("Repeat time value provided is invalid")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Repeat time value provided is invalid.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_waypointmissionerrorwaypointcount"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_waypointmissionerrorwaypointcount_inline">WAYPOINT_COUNT_NOT_VALID</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_waypointmissionerrorwaypointcount_inline"

><div class="article"><h6 ><font color="#AAA">final </font>WAYPOINT_COUNT_NOT_VALID</h6></div>

~~~java
 static final DJIMissionError WAYPOINT_COUNT_NOT_VALID = new DJIMissionError("Waypoint count is invalid")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Waypoint count is invalid.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_waypointmissionerrorwaypointlistsize"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_waypointmissionerrorwaypointlistsize_inline">WAYPOINT_LIST_SIZE_NOT_VALID</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_waypointmissionerrorwaypointlistsize_inline"

><div class="article"><h6 ><font color="#AAA">final </font>WAYPOINT_LIST_SIZE_NOT_VALID</h6></div>

~~~java
 static final DJIMissionError WAYPOINT_LIST_SIZE_NOT_VALID =
            new DJIMissionError("Waypoint list size is invalid")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Waypoint list size is invalid.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_waypointerrorcoordinate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_waypointerrorcoordinate_inline">WAYPOINT_COORDINATE_NOT_VALID</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_waypointerrorcoordinate_inline"

><div class="article"><h6 ><font color="#AAA">final </font>WAYPOINT_COORDINATE_NOT_VALID</h6></div>

~~~java
 static final DJIMissionError WAYPOINT_COORDINATE_NOT_VALID =
            new DJIMissionError("Waypoint coordinate provided is invalid")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Waypoint coordinate provided is invalid.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_waypointerroraltitude"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_waypointerroraltitude_inline">ALTITUDE_NOT_VALID</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_waypointerroraltitude_inline"

><div class="article"><h6 ><font color="#AAA">final </font>ALTITUDE_NOT_VALID</h6></div>

~~~java
 static final DJIMissionError ALTITUDE_NOT_VALID =
            new DJIMissionError("Waypoint altitude provided is invalid")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Waypoint altitude provided is invalid.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_waypointerrorheading"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_waypointerrorheading_inline">HEADING_NOT_VALID</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_waypointerrorheading_inline"

><div class="article"><h6 ><font color="#AAA">final </font>HEADING_NOT_VALID</h6></div>

~~~java
 static final DJIMissionError HEADING_NOT_VALID = new DJIMissionError("Waypoint heading provided is invalid")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Waypoint heading provided is invalid.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_waypointerrorrepeattime"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_waypointerrorrepeattime_inline">ACTION_REPEAT_TIME_NOT_VALID</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_waypointerrorrepeattime_inline"

><div class="article"><h6 ><font color="#AAA">final </font>ACTION_REPEAT_TIME_NOT_VALID</h6></div>

~~~java
 static final DJIMissionError ACTION_REPEAT_TIME_NOT_VALID =
            new DJIMissionError("Waypoint repeat time provided is invalid")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Waypoint repeat time provided is invalid.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_waypointerroractiontimeout"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_waypointerroractiontimeout_inline">ACTION_TIMEOUT_NOT_VALID</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_waypointerroractiontimeout_inline"

><div class="article"><h6 ><font color="#AAA">final </font>ACTION_TIMEOUT_NOT_VALID</h6></div>

~~~java
 static final DJIMissionError ACTION_TIMEOUT_NOT_VALID =
            new DJIMissionError("Waypoint action timeout provided is invalid")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Waypoint action timeout provided is invalid.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_waypointerrorcornerradius"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_waypointerrorcornerradius_inline">CORNER_RADIUS_NOT_VALID</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_waypointerrorcornerradius_inline"

><div class="article"><h6 ><font color="#AAA">final </font>CORNER_RADIUS_NOT_VALID</h6></div>

~~~java
 static final DJIMissionError CORNER_RADIUS_NOT_VALID =
            new DJIMissionError("Waypoint corner radius provided is invalid")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Waypoint corner radius provided is invalid.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_waypointerrorgimbalpitch"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_waypointerrorgimbalpitch_inline">GIMBAL_PITCH_NOT_VALID</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_waypointerrorgimbalpitch_inline"

><div class="article"><h6 ><font color="#AAA">final </font>GIMBAL_PITCH_NOT_VALID</h6></div>

~~~java
 static final DJIMissionError GIMBAL_PITCH_NOT_VALID =
            new DJIMissionError("Waypoint gimbal pitch provided is invalid")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Waypoint gimbal pitch provided is invalid.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_waypointerrorspeed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_waypointerrorspeed_inline">WAYPOINT_SPEED_NOT_VALID</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_waypointerrorspeed_inline"

><div class="article"><h6 ><font color="#AAA">final </font>WAYPOINT_SPEED_NOT_VALID</h6></div>

~~~java
 static final DJIMissionError WAYPOINT_SPEED_NOT_VALID =
            new DJIMissionError("Waypoint speed provided is invalid")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Waypoint speed provided is invalid.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_waypointerrorshootphotodistance"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_waypointerrorshootphotodistance_inline">SHOOT_PHOTO_NOT_VALID</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_waypointerrorshootphotodistance_inline"

><div class="article"><h6 ><font color="#AAA">final </font>SHOOT_PHOTO_NOT_VALID</h6></div>

~~~java
 static final DJIMissionError SHOOT_PHOTO_NOT_VALID =
            new DJIMissionError("Waypoint shoot photo distance provided is invalid")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Waypoint shoot photo distance provided is invalid.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_waypointerrorstayactionparam"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_waypointerrorstayactionparam_inline">STAY_ACTION_NOT_VALID</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_waypointerrorstayactionparam_inline"

><div class="article"><h6 ><font color="#AAA">final </font>STAY_ACTION_NOT_VALID</h6></div>

~~~java
 static final DJIMissionError STAY_ACTION_NOT_VALID =
            new DJIMissionError("Waypoint stay action param provided is invalid")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Waypoint stay action param provided is invalid.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_waypointerrorrotategimbalactionparam"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_waypointerrorrotategimbalactionparam_inline">ROTATE_GIMBAL_ACTION_NOT_VALID</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_waypointerrorrotategimbalactionparam_inline"

><div class="article"><h6 ><font color="#AAA">final </font>ROTATE_GIMBAL_ACTION_NOT_VALID</h6></div>

~~~java
 static final DJIMissionError ROTATE_GIMBAL_ACTION_NOT_VALID =
            new DJIMissionError("Waypoint rotate gimbal action param provided is invalid")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Waypoint rotate gimbal action param provided is invalid.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_waypointerrorrotateaircraftactionparam"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_waypointerrorrotateaircraftactionparam_inline">ROTATE_AIRCRAFT_ACTION_NOT_VALID</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_waypointerrorrotateaircraftactionparam_inline"

><div class="article"><h6 ><font color="#AAA">final </font>ROTATE_AIRCRAFT_ACTION_NOT_VALID</h6></div>

~~~java
 static final DJIMissionError ROTATE_AIRCRAFT_ACTION_NOT_VALID =
            new DJIMissionError("Waypoint rotate aircraft action param provided is invalid")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Waypoint rotate aircraft action param provided is invalid.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_indicesarediscontinuous"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_indicesarediscontinuous_inline">INDICES_ARE_DISCONTINUOUS</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_indicesarediscontinuous_inline"

><div class="article"><h6 ><font color="#AAA">final </font>INDICES_ARE_DISCONTINUOUS</h6></div>

~~~java
 static final DJIMissionError INDICES_ARE_DISCONTINUOUS = new DJIMissionError("Waypoint indices are discontinuous", 0xAC)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Waypoint indecies are discontinuous.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_indexoutofrange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_indexoutofrange_inline">INDEX_OUT_OF_RANGE</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_indexoutofrange_inline"

><div class="article"><h6 ><font color="#AAA">final </font>INDEX_OUT_OF_RANGE</h6></div>

~~~java
 static final DJIMissionError INDEX_OUT_OF_RANGE = new DJIMissionError("Waypoint index out of range.", 0xAD)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Waypoint index out of range.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_invaliddatasize"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_invaliddatasize_inline">INVALID_DATA_SIZE</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_invaliddatasize_inline"

><div class="article"><h6 ><font color="#AAA">final </font>INVALID_DATA_SIZE</h6></div>

~~~java
 static final DJIMissionError INVALID_DATA_SIZE = new DJIMissionError("Waypoint data size is invalid. It is for internal usage.", 0xAF)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Waypoint data size is invalid. It is for internal usage.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_takeofffailurecausedbyattitude"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_takeofffailurecausedbyattitude_inline">TAKE_OFF_FAILURE_CAUSED_BY_ATTITUDE</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_takeofffailurecausedbyattitude_inline"

><div class="article"><h6 ><font color="#AAA">final </font>TAKE_OFF_FAILURE_CAUSED_BY_ATTITUDE</h6></div>

~~~java
 static final DJIMissionError TAKE_OFF_FAILURE_CAUSED_BY_ATTITUDE = new DJIMissionError("The aircraft cannot take off because of improper aircraft's attitude.", 0xB3)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft cannot take off because of improper aircraft's attitude.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_invalidintervalshootparam"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_invalidintervalshootparam_inline">INVALID_INTERVAL_SHOOT_PARAM</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_invalidintervalshootparam_inline"

><div class="article"><h6 ><font color="#AAA">final </font>INVALID_INTERVAL_SHOOT_PARAM</h6></div>

~~~java
 static final DJIMissionError INVALID_INTERVAL_SHOOT_PARAM = new DJIMissionError("The time interval or the distance interval is invalid.", 0xB4)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The time interval or the distance interval is invalid.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_waypointgetinterruptionfailureforcompletemission"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_waypointgetinterruptionfailureforcompletemission_inline">WAYPOINT_GET_INTERRUPTION_FAILURE_FOR_COMPLETE_MISSION</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_waypointgetinterruptionfailureforcompletemission_inline"

><div class="article"><h6 ><font color="#AAA">final </font>WAYPOINT_GET_INTERRUPTION_FAILURE_FOR_COMPLETE_MISSION</h6></div>

~~~java
 static final DJIMissionError WAYPOINT_GET_INTERRUPTION_FAILURE_FOR_COMPLETE_MISSION = new DJIMissionError("The waypoint mission interruption is not available because mission has completed.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The waypoint mission interruption is not available because the last mission completed successfully.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_waypointgetinterruptionfailurewithoutreachingfirstwaypoint"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_waypointgetinterruptionfailurewithoutreachingfirstwaypoint_inline">WAYPOINT_GET_INTERRUPTION_FAILURE_WITHOUT_REACHING_FIRST_WAYPOINT</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_waypointgetinterruptionfailurewithoutreachingfirstwaypoint_inline"

><div class="article"><h6 ><font color="#AAA">final </font>WAYPOINT_GET_INTERRUPTION_FAILURE_WITHOUT_REACHING_FIRST_WAYPOINT</h6></div>

~~~java
 static final DJIMissionError WAYPOINT_GET_INTERRUPTION_FAILURE_WITHOUT_REACHING_FIRST_WAYPOINT = new DJIMissionError("The waypoint mission interruption is not available because the aircraft didn't reach the first waypoint in the last mission.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The waypoint mission interruption is not available because the aircraft didn't reach the first waypoint in the last mission.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_systemabnormal"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_systemabnormal_inline">SYSTEM_ABNORMAL</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_systemabnormal_inline"

><div class="article"><h6 ><font color="#AAA">final </font>SYSTEM_ABNORMAL</h6></div>

~~~java
 static final DJIMissionError SYSTEM_ABNORMAL = new DJIMissionError("System error, please try again. If the error continues, restart the aircraft.", 5301)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">System error, please try again. If the error continues, restart the aircraft.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_targetareaistoosmall"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_targetareaistoosmall_inline">TARGET_AREA_IS_TOO_SMALL</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_targetareaistoosmall_inline"

><div class="article"><h6 ><font color="#AAA">final </font>TARGET_AREA_IS_TOO_SMALL</h6></div>

~~~java
 static final DJIMissionError TARGET_AREA_IS_TOO_SMALL = new DJIMissionError("Frame selection subject too small.", 5302)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Frame selection subject too small.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_insufficientfeaturesintargetarea"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_insufficientfeaturesintargetarea_inline">INSUFFICIENT_FEATURES_IN_TARGET_AREA</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_insufficientfeaturesintargetarea_inline"

><div class="article"><h6 ><font color="#AAA">final </font>INSUFFICIENT_FEATURES_IN_TARGET_AREA</h6></div>

~~~java
 static final DJIMissionError INSUFFICIENT_FEATURES_IN_TARGET_AREA = new DJIMissionError("Frame selection subject texture not obvious.", 5303)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Frame selection subject texture not obvious.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_losttargetwhilewatching"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_losttargetwhilewatching_inline">LOST_TARGET_WHILE_WATCHING</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_losttargetwhilewatching_inline"

><div class="article"><h6 ><font color="#AAA">final </font>LOST_TARGET_WHILE_WATCHING</h6></div>

~~~java
 static final DJIMissionError LOST_TARGET_WHILE_WATCHING = new DJIMissionError("Tracking subject lost while watching.", 5304)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Tracking subject lost while watching.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_losttargetwhileexecuting"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_losttargetwhileexecuting_inline">LOST_TARGET_WHILE_EXECUTING</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_losttargetwhileexecuting_inline"

><div class="article"><h6 ><font color="#AAA">final </font>LOST_TARGET_WHILE_EXECUTING</h6></div>

~~~java
 static final DJIMissionError LOST_TARGET_WHILE_EXECUTING = new DJIMissionError("Tracking subject lost while executing.", 5305)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Tracking subject lost while executing.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_reprojectionfailedwhileexecuting"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_reprojectionfailedwhileexecuting_inline">REPROJECTION_FAILED_WHILE_EXECUTING</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_reprojectionfailedwhileexecuting_inline"

><div class="article"><h6 ><font color="#AAA">final </font>REPROJECTION_FAILED_WHILE_EXECUTING</h6></div>

~~~java
 static final DJIMissionError REPROJECTION_FAILED_WHILE_EXECUTING = new DJIMissionError("Failed to measure, please try again.", 5306)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Failed to estimate, please try again.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_targettooclose"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_targettooclose_inline">TARGET_TOO_CLOSE</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_targettooclose_inline"

><div class="article"><h6 ><font color="#AAA">final </font>TARGET_TOO_CLOSE</h6></div>

~~~java
 static final DJIMissionError TARGET_TOO_CLOSE = new DJIMissionError("Frame subject too close.", 5307)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Frame subject too close.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_targetsizechanged"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_targetsizechanged_inline">TARGET_SIZE_CHANGED</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_targetsizechanged_inline"

><div class="article"><h6 ><font color="#AAA">final </font>TARGET_SIZE_CHANGED</h6></div>

~~~java
 static final DJIMissionError TARGET_SIZE_CHANGED = new DJIMissionError("Target size changed, please try again. If the error persists, restart the aircraft.", 5308)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Target size changed, please try again. If the error persists,  restart the aircraft.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_gpsabnormal"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_gpsabnormal_inline">GPS_ABNORMAL</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_gpsabnormal_inline"

><div class="article"><h6 ><font color="#AAA">final </font>GPS_ABNORMAL</h6></div>

~~~java
 static final DJIMissionError GPS_ABNORMAL = new DJIMissionError("GPS signal weak. Please try again in an open area.", 5309)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">GPS signal weak. Please try again in an open area.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_hotpointinvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_hotpointinvalid_inline">HOT_POINT_INVALID</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_hotpointinvalid_inline"

><div class="article"><h6 ><font color="#AAA">final </font>HOT_POINT_INVALID</h6></div>

~~~java
 static final DJIMissionError HOT_POINT_INVALID = new DJIMissionError("Hotpoint parameter do not meet requirements.", 5310)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Hotpoint parameter do not meet requirements.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_watchtargetfailed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_watchtargetfailed_inline">WATCH_TARGET_FAILED</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_watchtargetfailed_inline"

><div class="article"><h6 ><font color="#AAA">final </font>WATCH_TARGET_FAILED</h6></div>

~~~java
 static final DJIMissionError WATCH_TARGET_FAILED = new DJIMissionError("Gimbal reached movement limit, subjecting failed. Please try again.", 5311)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Gimbal reached movement limit, subjecting failed. Please try again.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_estimatetimeout"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_estimatetimeout_inline">ESTIMATE_TIMEOUT</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_estimatetimeout_inline"

><div class="article"><h6 ><font color="#AAA">final </font>ESTIMATE_TIMEOUT</h6></div>

~~~java
 static final DJIMissionError ESTIMATE_TIMEOUT = new DJIMissionError("Estimate timeout, mission exit.", 5312)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Estimate timeout, mission exit.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_estimateresultinvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_estimateresultinvalid_inline">ESTIMATE_RESULT_INVALID</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_estimateresultinvalid_inline"

><div class="article"><h6 ><font color="#AAA">final </font>ESTIMATE_RESULT_INVALID</h6></div>

~~~java
 static final DJIMissionError ESTIMATE_RESULT_INVALID = new DJIMissionError("Failed to estimate subject location.", 5313)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Failed to estimate subject location.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_exitbyuserbutton"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_exitbyuserbutton_inline">EXIT_BY_USER_BUTTON</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_exitbyuserbutton_inline"

><div class="article"><h6 ><font color="#AAA">final </font>EXIT_BY_USER_BUTTON</h6></div>

~~~java
 static final DJIMissionError EXIT_BY_USER_BUTTON = new DJIMissionError("Current mission exit by user button.", 5314)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Current mission exit by user button.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_radiuslimit"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_radiuslimit_inline">RADIUS_LIMIT</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_radiuslimit_inline"

><div class="article"><h6 ><font color="#AAA">final </font>RADIUS_LIMIT</h6></div>

~~~java
 static final DJIMissionError RADIUS_LIMIT = new DJIMissionError("The aircraft reach the distance limit.Please operate the aircraft within the distance limit.", 5315)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft reach the distance limit. Please operate the aircraft within the distance limit.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_altitudelimit"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_altitudelimit_inline">ALTITUDE_LIMIT</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_altitudelimit_inline"

><div class="article"><h6 ><font color="#AAA">final </font>ALTITUDE_LIMIT</h6></div>

~~~java
 static final DJIMissionError ALTITUDE_LIMIT = new DJIMissionError("The aircraft reach the altitude limit. Please operate the aircraft within the altitude limit.", 5316)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft reach the altitude limit. Please operate the aircraft within the Altitude limit.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_controlfailed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_controlfailed_inline">CONTROL_FAILED</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_controlfailed_inline"

><div class="article"><h6 ><font color="#AAA">final </font>CONTROL_FAILED</h6></div>

~~~java
 static final DJIMissionError CONTROL_FAILED = new DJIMissionError("Intelligent Hotpoint mission execute failed, the description is the fail reason", 5317)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Intelligent Hotpoint mission execute failed, the description is the fail reason.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_lostconnectionwithremotecontroller"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_lostconnectionwithremotecontroller_inline">LOST_CONNECTION_WITH_REMOTE_CONTROLLER</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_lostconnectionwithremotecontroller_inline"

><div class="article"><h6 ><font color="#AAA">final </font>LOST_CONNECTION_WITH_REMOTE_CONTROLLER</h6></div>

~~~java
 static final DJIMissionError LOST_CONNECTION_WITH_REMOTE_CONTROLLER = new DJIMissionError("Lost connection with Remote Controller", 5318)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Lost connection with remoteController.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_obstacleencounteredwhileestimating"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_obstacleencounteredwhileestimating_inline">OBSTACLE_ENCOUNTERED_WHILE_ESTIMATING</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_obstacleencounteredwhileestimating_inline"

><div class="article"><h6 ><font color="#AAA">final </font>OBSTACLE_ENCOUNTERED_WHILE_ESTIMATING</h6></div>

~~~java
 static final DJIMissionError OBSTACLE_ENCOUNTERED_WHILE_ESTIMATING = new DJIMissionError("Obstacles encountered while estimating, current mission quitted.", 5319)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Obstacles encountered while estimating, current mission quitted.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_obstacleencounteredwhilesurrounding"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_obstacleencounteredwhilesurrounding_inline">OBSTACLE_ENCOUNTERED_WHILE_SURROUNDING</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_obstacleencounteredwhilesurrounding_inline"

><div class="article"><h6 ><font color="#AAA">final </font>OBSTACLE_ENCOUNTERED_WHILE_SURROUNDING</h6></div>

~~~java
 static final DJIMissionError OBSTACLE_ENCOUNTERED_WHILE_SURROUNDING = new DJIMissionError("Obstacles encountered while surrounding, current mission suspended.", 5320)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Obstacles encountered while surrounding, current mission suspended.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_targetistoofaraway"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_targetistoofaraway_inline">TARGET_IS_TOO_FAR_AWAY</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_targetistoofaraway_inline"

><div class="article"><h6 ><font color="#AAA">final </font>TARGET_IS_TOO_FAR_AWAY</h6></div>

~~~java
 static final DJIMissionError TARGET_IS_TOO_FAR_AWAY = new DJIMissionError("Target is too far away, the aircraft needs to continue to measure distance", 5321)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Target is too faraway, the aircraft needs to continue to measure distance.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_altitudetoolow"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_altitudetoolow_inline">HOTPOINT_ALTITUDE_TOO_LOW</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_altitudetoolow_inline"

><div class="article"><h6 ><font color="#AAA">final </font>HOTPOINT_ALTITUDE_TOO_LOW</h6></div>

~~~java
 static final DJIMissionError HOTPOINT_ALTITUDE_TOO_LOW = new DJIMissionError("Aircraft's altitude is too low to execute hotpoint mission.", 5322)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Aircraft's altitude is too low to execute hotpoint mission.

</div>

<html><p><br></p></html>

#### Waypoint Mission

<div class="api-row" id="djierror_djisdkmissionerror_multimodedisabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_multimodedisabled_inline">MULTI_MODE_DISABLED</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_multimodedisabled_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MULTI_MODE_DISABLED</h6></div>

~~~java
 static final DJIMissionError MULTI_MODE_DISABLED = new DJIMissionError("The mission cannot start when multi-mode is disabled.", 0xCB)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The mission cannot start when multi-mode is disabled.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_getdjierror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_getdjierror_inline">getDJIError</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_getdjierror_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDJIError</h6></div>

~~~java
 static DJIError getDJIError(Ccode ccode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Returns the specific error in DJIMissionManagerError according to the error code.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Ccode <font color="#000">ccode</td><td><font color="#666"><i>Error code.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>The DJIError object.</i></td></tr></table></html></div>

<html><p><br></p></html>

##### Related:

<div class="api-row" id="djierror_djimissionmanagererror_common_unsupported"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_common_unsupported_inline">COMMON_UNSUPPORTED</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_common_unsupported_inline"

><div class="article"><h6 ><font color="#AAA">final </font>COMMON_UNSUPPORTED</h6></div>

~~~java
 static final DJIMissionError COMMON_UNSUPPORTED = new DJIMissionError("Not supported")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Unsupported feature error. <br>Where possible:<br> This error will be returned by the function for a special feature interface when the feature is not supported by the device.<br>

</div>

<div class="api-row" id="djierror_djimissionmanagererror_common_disconnected"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_common_disconnected_inline">COMMON_DISCONNECTED</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_common_disconnected_inline"

><div class="article"><h6 ><font color="#AAA">final </font>COMMON_DISCONNECTED</h6></div>

~~~java
 static final DJIMissionError COMMON_DISCONNECTED = new DJIMissionError("Disconnected")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Disconnected.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_began"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_began_inline">BEGAN</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_began_inline"

><div class="article"><h6 ><font color="#AAA">final </font>BEGAN</h6></div>

~~~java
 static final DJIMissionError BEGAN = new DJIMissionError("began", 0x01)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Mission began (Phantom 2 series).

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_canceled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_canceled_inline">CANCELED</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_canceled_inline"

><div class="article"><h6 ><font color="#AAA">final </font>CANCELED</h6></div>

~~~java
 static final DJIMissionError CANCELED = new DJIMissionError("canceled", 0x02)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Mission canceled.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_failed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_failed_inline">FAILED</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_failed_inline"

><div class="article"><h6 ><font color="#AAA">final </font>FAILED</h6></div>

~~~java
 static final DJIMissionError FAILED = new DJIMissionError("failed", 0x03)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Mission failed.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_not_existed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_not_existed_inline">NO_MISSION_RUNNING</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_not_existed_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NO_MISSION_RUNNING</h6></div>

~~~java
 static final DJIMissionError NO_MISSION_RUNNING = new DJIMissionError("Mission not existed")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Mission not existed.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_timeout"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_timeout_inline">TIMEOUT</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_timeout_inline"

><div class="article"><h6 ><font color="#AAA">final </font>TIMEOUT</h6></div>

~~~java
 static final DJIMissionError TIMEOUT = new DJIMissionError("Execution of this process has timed out", 0x04)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Mission timeout.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_gps_not_ready"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_gps_not_ready_inline">GPS_NOT_READY</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_gps_not_ready_inline"

><div class="article"><h6 ><font color="#AAA">final </font>GPS_NOT_READY</h6></div>

~~~java
 static final DJIMissionError GPS_NOT_READY = new DJIMissionError("GPS of aircraft is not ready", 0x06)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The GPS of the aircraft is not ready.<br> Maybe the aircraft haven't got the home point location.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_motor_not_start"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_motor_not_start_inline">MOTORS_DID_NOT_START</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_motor_not_start_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MOTORS_DID_NOT_START</h6></div>

~~~java
 static final DJIMissionError MOTORS_DID_NOT_START =
            new DJIMissionError("The aircraft's motor has not started", 0x07)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft's motor has not started.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_takeoff"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_takeoff_inline">TAKE_OFF</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_takeoff_inline"

><div class="article"><h6 ><font color="#AAA">final </font>TAKE_OFF</h6></div>

~~~java
 static final DJIMissionError TAKE_OFF = new DJIMissionError("Aircraft is taking off", 0x08)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft is taking off.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_is_flying"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_is_flying_inline">IS_FLYING</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_is_flying_inline"

><div class="article"><h6 ><font color="#AAA">final </font>IS_FLYING</h6></div>

~~~java
 static final DJIMissionError IS_FLYING = new DJIMissionError("Aircraft is flying", 0x09)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft is flying.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_not_auto_mode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_not_auto_mode_inline">NOT_AUTO_MODE</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_not_auto_mode_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NOT_AUTO_MODE</h6></div>

~~~java
 static final DJIMissionError NOT_AUTO_MODE = new DJIMissionError("Aircraft is not in auto mode", 0x0A)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft is not in auto mode.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_upload_waypoint_num_max_limit"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_upload_waypoint_num_max_limit_inline">MAX_NUMBER_OF_WAYPOINTS_UPLOAD_LIMIT_REACHED</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_upload_waypoint_num_max_limit_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MAX_NUMBER_OF_WAYPOINTS_UPLOAD_LIMIT_REACHED</h6></div>

~~~java
 static final DJIMissionError MAX_NUMBER_OF_WAYPOINTS_UPLOAD_LIMIT_REACHED =
            new DJIMissionError("Waypoint mission has reached the maximum points limit", 0x0B)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Waypoint mission has reached the maximum points limit.<br> 1. Phantom 2 Vision/Vision+: the max points limit is 16.<br> 2. Inspire1/ Phantom 3 series: the max points limit is 99.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_waypoint_uploading"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_waypoint_uploading_inline">UPLOADING_WAYPOINT</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_waypoint_uploading_inline"

><div class="article"><h6 ><font color="#AAA">final </font>UPLOADING_WAYPOINT</h6></div>

~~~java
 static final DJIMissionError UPLOADING_WAYPOINT = new DJIMissionError("Waypoint mission is uploading", 0xE9)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Waypoint is uploading.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_key_level_low"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_key_level_low_inline">KEY_LEVEL_LOW</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_key_level_low_inline"

><div class="article"><h6 ><font color="#AAA">final </font>KEY_LEVEL_LOW</h6></div>

~~~java
 static final DJIMissionError KEY_LEVEL_LOW =
            new DJIMissionError("The API key provided to you is not at the correct permission level", 0x0D)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The API key provided to you is not at the correct permission level.<br> Check whether your key is a level 2 application key in your AndroidManifest.xml.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_navigation_is_not_open"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_navigation_is_not_open_inline">NAVIGATION_MODE_DISABLED</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_navigation_is_not_open_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NAVIGATION_MODE_DISABLED</h6></div>

~~~java
 static final DJIMissionError NAVIGATION_MODE_DISABLED = new DJIMissionError("Navigation is not open", 0xD1)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Navigation is not open.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_ioc_type_unknown"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_ioc_type_unknown_inline">IOC_TYPE_UNKNOWN</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_ioc_type_unknown_inline"

><div class="article"><h6 ><font color="#AAA">final </font>IOC_TYPE_UNKNOWN</h6></div>

~~~java
 static final DJIMissionError IOC_TYPE_UNKNOWN = new DJIMissionError("The type of IOC is unknown", 0xA1)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The type of IOC is unknown.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_homepoint_value_invalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_homepoint_value_invalid_inline">HOME_POINT_VALUE_INVALID</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_homepoint_value_invalid_inline"

><div class="article"><h6 ><font color="#AAA">final </font>HOME_POINT_VALUE_INVALID</h6></div>

~~~java
 static final DJIMissionError HOME_POINT_VALUE_INVALID =
            new DJIMissionError("The home point is not a valid float value", 0xA2)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The homepoint is not a valid float value.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_homepoint_location_invalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_homepoint_location_invalid_inline">HOME_POINT_LOCATION_INVALID</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_homepoint_location_invalid_inline"

><div class="article"><h6 ><font color="#AAA">final </font>HOME_POINT_LOCATION_INVALID</h6></div>

~~~java
 static final DJIMissionError HOME_POINT_LOCATION_INVALID =
            new DJIMissionError("The latitude and longitude of homepoint are invalid", 0xA3)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The latitude and longitude of the homepoint are invalid.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_homepoint_direction_unknown"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_homepoint_direction_unknown_inline">HOME_POINT_DIRECTION_UNKNOWN</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_homepoint_direction_unknown_inline"

><div class="article"><h6 ><font color="#AAA">final </font>HOME_POINT_DIRECTION_UNKNOWN</h6></div>

~~~java
 static final DJIMissionError HOME_POINT_DIRECTION_UNKNOWN =
            new DJIMissionError("The direction of homepoint is unknown", 0xA6)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The direction of the homepoint is unknown.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_homepoint_paused"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_homepoint_paused_inline">HOME_POINT_MISSION_PAUSED</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_homepoint_paused_inline"

><div class="article"><h6 ><font color="#AAA">final </font>HOME_POINT_MISSION_PAUSED</h6></div>

~~~java
 static final DJIMissionError HOME_POINT_MISSION_PAUSED =
            new DJIMissionError("The home-point mission is paused", 0xA9)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Homepoint is paused.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_homepoint_not_paused"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_homepoint_not_paused_inline">HOME_POINT_MISSION_NOT_PAUSED</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_homepoint_not_paused_inline"

><div class="article"><h6 ><font color="#AAA">final </font>HOME_POINT_MISSION_NOT_PAUSED</h6></div>

~~~java
 static final DJIMissionError HOME_POINT_MISSION_NOT_PAUSED =
            new DJIMissionError("The home-point  mission is not paused", 0xAA)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The homepoint is not paused.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_followme_distance_too_large"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_followme_distance_too_large_inline">FOLLOW_ME_DISTANCE_TOO_LARGE</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_followme_distance_too_large_inline"

><div class="article"><h6 ><font color="#AAA">final </font>FOLLOW_ME_DISTANCE_TOO_LARGE</h6></div>

~~~java
 static final DJIMissionError FOLLOW_ME_DISTANCE_TOO_LARGE = new DJIMissionError(
            "Distance between the aircraft and mobile phone is beyond acceptable limit(must be lower than 20000m)", 0xB0)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The distance between the aircraft and mobile phone is too large (must be lower than 20000m). This error will be returned when initializing the follow me task.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_followme_disconnect_time_toolong"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_followme_disconnect_time_toolong_inline">FOLLOW_ME_DISCONNECT_TIME_TOO_LONG</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_followme_disconnect_time_toolong_inline"

><div class="article"><h6 ><font color="#AAA">final </font>FOLLOW_ME_DISCONNECT_TIME_TOO_LONG</h6></div>

~~~java
 static final DJIMissionError FOLLOW_ME_DISCONNECT_TIME_TOO_LONG =
            new DJIMissionError("The disconnect time of follow me mission is too long", 0xB1)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The disconnect time of the Follow Me mission is too long.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_followme_gimbal_pitch_error"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_followme_gimbal_pitch_error_inline">FOLLOW_ME_GIMBAL_PITCH_ERROR</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_followme_gimbal_pitch_error_inline"

><div class="article"><h6 ><font color="#AAA">final </font>FOLLOW_ME_GIMBAL_PITCH_ERROR</h6></div>

~~~java
 static final DJIMissionError FOLLOW_ME_GIMBAL_PITCH_ERROR =
            new DJIMissionError("The initial pitch angle of gimbal is too large", 0xB2)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The initial pitch angle of the gimbal is too large.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_altitude_too_high"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_altitude_too_high_inline">ALTITUDE_TOO_HIGH</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_altitude_too_high_inline"

><div class="article"><h6 ><font color="#AAA">final </font>ALTITUDE_TOO_HIGH</h6></div>

~~~java
 static final DJIMissionError ALTITUDE_TOO_HIGH = new DJIMissionError("The altitude is too high", 0xC0)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The altitude is too high.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_altitude_too_low"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_altitude_too_low_inline">ALTITUDE_TOO_LOW</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_altitude_too_low_inline"

><div class="article"><h6 ><font color="#AAA">final </font>ALTITUDE_TOO_LOW</h6></div>

~~~java
 static final DJIMissionError ALTITUDE_TOO_LOW = new DJIMissionError("The altitude is too low", 0xC1)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The altitude is too low.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_mission_radius_invalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_mission_radius_invalid_inline">MISSION_RADIUS_INVALID</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_mission_radius_invalid_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MISSION_RADIUS_INVALID</h6></div>

~~~java
 static final DJIMissionError MISSION_RADIUS_INVALID =
            new DJIMissionError("The radius of mission is invalid", 0xC2)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The radius of mission is invalid.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_mission_speed_too_large"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_mission_speed_too_large_inline">MISSION_SPEED_TOO_HIGH</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_mission_speed_too_large_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MISSION_SPEED_TOO_HIGH</h6></div>

~~~java
 static final DJIMissionError MISSION_SPEED_TOO_HIGH =
            new DJIMissionError("The speed of mission is too large", 0xC3)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The speed of the mission is too high.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_mission_entrypoint_invalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_mission_entrypoint_invalid_inline">MISSION_ENTRY_POINT_INVALID</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_mission_entrypoint_invalid_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MISSION_ENTRY_POINT_INVALID</h6></div>

~~~java
 static final DJIMissionError MISSION_ENTRY_POINT_INVALID =
            new DJIMissionError("The entry point of mission is invalid", 0xC4)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The entry point of the mission is invalid.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_mission_heading_mode_invalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_mission_heading_mode_invalid_inline">MISSION_HEADING_MODE_INVALID</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_mission_heading_mode_invalid_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MISSION_HEADING_MODE_INVALID</h6></div>

~~~java
 static final DJIMissionError MISSION_HEADING_MODE_INVALID =
            new DJIMissionError("The heading mode of mission is invalid", 0xC5)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The heading mode of the mission is invalid.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_mission_radius_overlimited"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_mission_radius_overlimited_inline">MISSION_RADIUS_OVER_LIMIT</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_mission_radius_overlimited_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MISSION_RADIUS_OVER_LIMIT</h6></div>

~~~java
 static final DJIMissionError MISSION_RADIUS_OVER_LIMIT =
            new DJIMissionError("The radius of mission is over the acceptable limit, pls try to login and check radius of waypoint", 0xC7)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The radius of the mission is over the acceptable limit.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_unsupported_navigation_for_the_product"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_unsupported_navigation_for_the_product_inline">NAVIGATION_MODE_NOT_SUPPORTED</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_unsupported_navigation_for_the_product_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NAVIGATION_MODE_NOT_SUPPORTED</h6></div>

~~~java
 static final DJIMissionError NAVIGATION_MODE_NOT_SUPPORTED =
            new DJIMissionError("Navigation mode is not supported", 0xC8)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Navigation in the product is unsupported.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_distance_from_mission_target_too_long"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_distance_from_mission_target_too_long_inline">DISTANCE_FROM_MISSION_TARGET_TOO_LONG</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_distance_from_mission_target_too_long_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DISTANCE_FROM_MISSION_TARGET_TOO_LONG</h6></div>

~~~java
 static final DJIMissionError DISTANCE_FROM_MISSION_TARGET_TOO_LONG =
            new DJIMissionError("The distance from mission target position is too long", 0xC9)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The distance from the mission target is too long.<br> For example, the distance from hotpoint target position is too long,  <br> or the distance from the first waypoint target position is too long

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_rc_mode_error"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_rc_mode_error_inline">RC_MODE_ERROR</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_rc_mode_error_inline"

><div class="article"><h6 ><font color="#AAA">final </font>RC_MODE_ERROR</h6></div>

~~~java
 static final DJIMissionError RC_MODE_ERROR =
            new DJIMissionError("Mode error, please make sure the remote controller's mode switch is in 'F' mode.", 0xD0)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Remote controller mode error.<br> You should put the remote controller's mode selection bar to F position.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_ioc_working"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_ioc_working_inline">IOC_WORKING</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_ioc_working_inline"

><div class="article"><h6 ><font color="#AAA">final </font>IOC_WORKING</h6></div>

~~~java
 static final DJIMissionError IOC_WORKING = new DJIMissionError("The IOC mode is working", 0xD2)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The IOC mode is working.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_mission_not_init"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_mission_not_init_inline">MISSION_NOT_INITIALIZED</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_mission_not_init_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MISSION_NOT_INITIALIZED</h6></div>

~~~java
 static final DJIMissionError MISSION_NOT_INITIALIZED = new DJIMissionError("The mission is not initialized", 0xD3)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The mission is not initialized.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_mission_not_exist"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_mission_not_exist_inline">MISSION_NOT_EXIST</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_mission_not_exist_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MISSION_NOT_EXIST</h6></div>

~~~java
 static final DJIMissionError MISSION_NOT_EXIST = new DJIMissionError("The mission does not exist", 0xD4)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The mission does not exist.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_mission_conflict"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_mission_conflict_inline">MISSION_CONFLICT</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_mission_conflict_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MISSION_CONFLICT</h6></div>

~~~java
 static final DJIMissionError MISSION_CONFLICT =
            new DJIMissionError("There is a conflicting setting in the mission", 0xD5)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">There is a conflicting setting in the mission.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_mission_estimate_time_too_long"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_mission_estimate_time_too_long_inline">MISSION_ESTIMATE_TIME_TOO_LONG</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_mission_estimate_time_too_long_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MISSION_ESTIMATE_TIME_TOO_LONG</h6></div>

~~~java
 static final DJIMissionError MISSION_ESTIMATE_TIME_TOO_LONG =
            new DJIMissionError("The estimated time for the mission is too long", 0xD6)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The estimated time for the mission is too long.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_rtk_is_not_ready"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_rtk_is_not_ready_inline">RTK_IS_NOT_READY</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_rtk_is_not_ready_inline"

><div class="article"><h6 ><font color="#AAA">final </font>RTK_IS_NOT_READY</h6></div>

~~~java
 static final DJIMissionError RTK_IS_NOT_READY = new DJIMissionError("RTK is not ready", 0xCD)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">RTK is not ready.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_multi_mode_is_off"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_multi_mode_is_off_inline">MULTI_MODE_IS_OFF</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_multi_mode_is_off_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MULTI_MODE_IS_OFF</h6></div>

~~~java
 static final DJIMissionError MULTI_MODE_IS_OFF = new DJIMissionError("Multi-mode switch is not turned on", 0xCB)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Multi-mode switch is not turned on.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_high_priority_mission_executing"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_high_priority_mission_executing_inline">HIGH_PRIORITY_MISSION_EXECUTING</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_high_priority_mission_executing_inline"

><div class="article"><h6 ><font color="#AAA">final </font>HIGH_PRIORITY_MISSION_EXECUTING</h6></div>

~~~java
 static final DJIMissionError HIGH_PRIORITY_MISSION_EXECUTING =
            new DJIMissionError("A higher priority mission is executing", 0xD7)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">A higher priority mission is executing.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_mission_condition_not_satisfied"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_mission_condition_not_satisfied_inline">MISSION_CONDITION_NOT_SATISFIED</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_mission_condition_not_satisfied_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MISSION_CONDITION_NOT_SATISFIED</h6></div>

~~~java
 static final DJIMissionError MISSION_CONDITION_NOT_SATISFIED =
            new DJIMissionError("The condition of mission is not satisfied", 0xDC)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The condition of the mission is not satisfied.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_mission_across_noflyzone"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_mission_across_noflyzone_inline">MISSION_ACROSS_NO_FLY_ZONE</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_mission_across_noflyzone_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MISSION_ACROSS_NO_FLY_ZONE</h6></div>

~~~java
 static final DJIMissionError MISSION_ACROSS_NO_FLY_ZONE =
            new DJIMissionError("The mission is across the no fly zone", 0xDD)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The mission is across a no fly zone.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_mission_info_invalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_mission_info_invalid_inline">MISSION_INFO_INVALID</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_mission_info_invalid_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MISSION_INFO_INVALID</h6></div>

~~~java
 static final DJIMissionError MISSION_INFO_INVALID =
            new DJIMissionError("The information of mission is invalid", 0xE0)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The information for the mission is invalid.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_waypoint_info_invalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_waypoint_info_invalid_inline">WAYPOINT_INFO_INVALID</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_waypoint_info_invalid_inline"

><div class="article"><h6 ><font color="#AAA">final </font>WAYPOINT_INFO_INVALID</h6></div>

~~~java
 static final DJIMissionError WAYPOINT_INFO_INVALID =
            new DJIMissionError("The information of waypoint is invalid", 0xE1)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The information for the waypoint is invalid.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_waypoint_trace_too_long"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_waypoint_trace_too_long_inline">WAYPOINT_TRACE_TOO_LONG</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_waypoint_trace_too_long_inline"

><div class="article"><h6 ><font color="#AAA">final </font>WAYPOINT_TRACE_TOO_LONG</h6></div>

~~~java
 static final DJIMissionError WAYPOINT_TRACE_TOO_LONG =
            new DJIMissionError("The trace of waypoint is too long", 0xE2)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The waypoint trace is too long. The maximum waypoint trace is 30km. The waypoint trace is the sum of all distances between waypoints in a mission.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_waypoint_total_trace_too_long"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_waypoint_total_trace_too_long_inline">WAYPOINT_TOTAL_TRACE_TOO_LONG</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_waypoint_total_trace_too_long_inline"

><div class="article"><h6 ><font color="#AAA">final </font>WAYPOINT_TOTAL_TRACE_TOO_LONG</h6></div>

~~~java
 static final DJIMissionError WAYPOINT_TOTAL_TRACE_TOO_LONG =
            new DJIMissionError("The total trace of waypoint is too long", 0xE3)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The total waypoint mission distance is too long. The maximum total distance is 40km. The total distance includes the sum of: <ul>
  <li>Distance from current aircraft location to first waypoint</li>
  <li>Sum of all distances between waypoints</li>
  <li>Distance from last waypoint to the homepoint.</li>
</ul>

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_waypoint_index_overrange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_waypoint_index_overrange_inline">WAYPOINT_INDEX_OVER_RANGE</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_waypoint_index_overrange_inline"

><div class="article"><h6 ><font color="#AAA">final </font>WAYPOINT_INDEX_OVER_RANGE</h6></div>

~~~java
 static final DJIMissionError WAYPOINT_INDEX_OVER_RANGE =
            new DJIMissionError("The index of waypoint is over range", 0xE4)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The index of the waypoint is out of range.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_waypoint_distance_too_close"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_waypoint_distance_too_close_inline">WAYPOINT_DISTANCE_TOO_CLOSE</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_waypoint_distance_too_close_inline"

><div class="article"><h6 ><font color="#AAA">final </font>WAYPOINT_DISTANCE_TOO_CLOSE</h6></div>

~~~java
 static final DJIMissionError WAYPOINT_DISTANCE_TOO_CLOSE =
            new DJIMissionError("The waypoint distance is too close", 0xE5)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The waypoint distance is too close.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_waypoint_distance_too_long"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_waypoint_distance_too_long_inline">WAYPOINT_DISTANCE_TOO_LONG</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_waypoint_distance_too_long_inline"

><div class="article"><h6 ><font color="#AAA">final </font>WAYPOINT_DISTANCE_TOO_LONG</h6></div>

~~~java
 static final DJIMissionError WAYPOINT_DISTANCE_TOO_LONG =
            new DJIMissionError("The waypoint distance is too long", 0xE6)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The waypoint distance is too long. A valid distance between two adjacent waypoints is less than 2km and greater than 0.5m. In addition, the first and last waypoint of the mission must also have a separation of less than 2km and greater than 0.5m. If the separation of any consecutive waypoints or the separation of the first and last waypoint is larger than 2km, then this error will be raised.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_waypoint_damping_check_failed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_waypoint_damping_check_failed_inline">WAYPOINT_DAMPING_CHECK_FAILED</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_waypoint_damping_check_failed_inline"

><div class="article"><h6 ><font color="#AAA">final </font>WAYPOINT_DAMPING_CHECK_FAILED</h6></div>

~~~java
 static final DJIMissionError WAYPOINT_DAMPING_CHECK_FAILED =
            new DJIMissionError("The damping check is failed", 0xE7)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The damping check failed.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_waypoint_action_param_invalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_waypoint_action_param_invalid_inline">WAYPOINT_ACTION_PARAMETER_INVALID</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_waypoint_action_param_invalid_inline"

><div class="article"><h6 ><font color="#AAA">final </font>WAYPOINT_ACTION_PARAMETER_INVALID</h6></div>

~~~java
 static final DJIMissionError WAYPOINT_ACTION_PARAMETER_INVALID =
            new DJIMissionError("The parameter of waypoint action is invalid", 0xE8)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The parameter of the waypoint action is invalid.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_waypoint_mission_info_not_uploaded"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_waypoint_mission_info_not_uploaded_inline">WAYPOINT_MISSION_INFO_NOT_UPLOADED</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_waypoint_mission_info_not_uploaded_inline"

><div class="article"><h6 ><font color="#AAA">final </font>WAYPOINT_MISSION_INFO_NOT_UPLOADED</h6></div>

~~~java
 static final DJIMissionError WAYPOINT_MISSION_INFO_NOT_UPLOADED =
            new DJIMissionError("The info of waypoint mission is not completely uploaded", 0xEA)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The information for the waypoint mission is not completely uploaded.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_waypoint_upload_not_complete"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_waypoint_upload_not_complete_inline">WAYPOINT_UPLOAD_NOT_COMPLETE</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_waypoint_upload_not_complete_inline"

><div class="article"><h6 ><font color="#AAA">final </font>WAYPOINT_UPLOAD_NOT_COMPLETE</h6></div>

~~~java
 static final DJIMissionError WAYPOINT_UPLOAD_NOT_COMPLETE =
            new DJIMissionError("The waypoint uploading is not complete", 0xEB)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The waypoint uploading is not complete.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_waypoint_request_is_running"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_waypoint_request_is_running_inline">WAYPOINT_REQUEST_IS_RUNNING</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_waypoint_request_is_running_inline"

><div class="article"><h6 ><font color="#AAA">final </font>WAYPOINT_REQUEST_IS_RUNNING</h6></div>

~~~java
 static final DJIMissionError WAYPOINT_REQUEST_IS_RUNNING =
            new DJIMissionError("The waypoint request is running", 0xEC)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The waypoint mission is running.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_waypoint_not_running"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_waypoint_not_running_inline">WAYPOINT_NOT_RUNNING</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_waypoint_not_running_inline"

><div class="article"><h6 ><font color="#AAA">final </font>WAYPOINT_NOT_RUNNING</h6></div>

~~~java
 static final DJIMissionError WAYPOINT_NOT_RUNNING =
            new DJIMissionError("The waypoint mission is not running", 0xED)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The waypoint mission is not running.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_waypoint_idle_velocity_invalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_waypoint_idle_velocity_invalid_inline">WAYPOINT_IDLE_VELOCITY_INVALID</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_waypoint_idle_velocity_invalid_inline"

><div class="article"><h6 ><font color="#AAA">final </font>WAYPOINT_IDLE_VELOCITY_INVALID</h6></div>

~~~java
 static final DJIMissionError WAYPOINT_IDLE_VELOCITY_INVALID =
            new DJIMissionError("The idle velocity is invalid", 0xEE)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The idle velocity is invalid.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_aircraft_starting_motor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_aircraft_starting_motor_inline">AIRCRAFT_STARTING_MOTOR</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_aircraft_starting_motor_inline"

><div class="article"><h6 ><font color="#AAA">final </font>AIRCRAFT_STARTING_MOTOR</h6></div>

~~~java
 static final DJIMissionError AIRCRAFT_STARTING_MOTOR =
            new DJIMissionError("The aircraft is starting the motor", 0xF3)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft is starting the motor.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_wrong_cmd"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_wrong_cmd_inline">WRONG_CMD</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_wrong_cmd_inline"

><div class="article"><h6 ><font color="#AAA">final </font>WRONG_CMD</h6></div>

~~~java
 static final DJIMissionError WRONG_CMD = new DJIMissionError("The command is wrong", 0xF4)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The command is wrong.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_pointing_aircraft_not_in_the_air"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_pointing_aircraft_not_in_the_air_inline">POINTING_AIRCRAFT_NOT_IN_THE_AIR</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_pointing_aircraft_not_in_the_air_inline"

><div class="article"><h6 ><font color="#AAA">final </font>POINTING_AIRCRAFT_NOT_IN_THE_AIR</h6></div>

~~~java
 static final DJIMissionError POINTING_AIRCRAFT_NOT_IN_THE_AIR =
            new DJIMissionError("The aircraft is not in the air. Please take off first.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft is not in the air. Please take off first.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_vision_sensor_low_quality"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_vision_sensor_low_quality_inline">VISION_SENSOR_LOW_QUALITY</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_vision_sensor_low_quality_inline"

><div class="article"><h6 ><font color="#AAA">final </font>VISION_SENSOR_LOW_QUALITY</h6></div>

~~~java
 static final DJIMissionError VISION_SENSOR_LOW_QUALITY =
            new DJIMissionError("The quality of vision sensor is low.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The quality of vision sensor is low.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_z30_only_support_spotlight_pro"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_z30_only_support_spotlight_pro_inline">Z30_ONLY_SUPPORT_SPOTLIGHT_PRO</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_z30_only_support_spotlight_pro_inline"

><div class="article"><h6 ><font color="#AAA">final </font>Z30_ONLY_SUPPORT_SPOTLIGHT_PRO</h6></div>

~~~java
 static final DJIMissionError Z30_ONLY_SUPPORT_SPOTLIGHT_PRO = new DJIMissionError("Current Camera only support spotlight pro mode!")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The camera only supports spotlight pro mode.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_user_cancel_uploading_mission"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_user_cancel_uploading_mission_inline">USER_CANCEL_UPLOADING_MISSION</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_user_cancel_uploading_mission_inline"

><div class="article"><h6 ><font color="#AAA">final </font>USER_CANCEL_UPLOADING_MISSION</h6></div>

~~~java
 static final DJIMissionError USER_CANCEL_UPLOADING_MISSION = new DJIMissionError("Uploading mission has been canceled!")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The uploading mission has been canceled by the user.

</div>

<div class="api-row" id="djierror_djimissionmanagererror_mission_result_unknown"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djimissionmanagererror_mission_result_unknown_inline">UNKNOWN</a></div></div><div class="inline-doc" id="djierror_djimissionmanagererror_mission_result_unknown_inline"

><div class="article"><h6 ><font color="#AAA">final </font>UNKNOWN</h6></div>

~~~java
 static final DJIMissionError UNKNOWN = new DJIMissionError("Unknown result")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Unknown result.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_modeerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_modeerror_inline">MODE_ERROR</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_modeerror_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MODE_ERROR</h6></div>

~~~java
 static final DJIMissionError MODE_ERROR =
            new DJIMissionError("The control mode of the aircraft is not in the correct state", 0x05)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Cannot execute in the current mode. For products and flight controller firmware versions that support 'F' mode (e.g. Phantom 3 Professional, Inspire 1, A3 with flight controller firmware version lower than 3.2.10.0, etc), please make sure the remote controller's mode switch is in 'F' mode. For the others, please make sure the remote controller's mode switch is in 'P' mode.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_aircraftbadgps"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_aircraftbadgps_inline">GPS_SIGNAL_WEAK</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_aircraftbadgps_inline"

><div class="article"><h6 ><font color="#AAA">final </font>GPS_SIGNAL_WEAK</h6></div>

~~~java
 static final DJIMissionError GPS_SIGNAL_WEAK = new DJIMissionError("The GPS signal of the aircraft is weak", 0xD8)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The GPS signal of the aircraft is weak.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_aircraftlowbattery"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_aircraftlowbattery_inline">LOW_BATTERY</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_aircraftlowbattery_inline"

><div class="article"><h6 ><font color="#AAA">final </font>LOW_BATTERY</h6></div>

~~~java
 static final DJIMissionError LOW_BATTERY = new DJIMissionError("Low battery level warning", 0xD9)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Low battery level warning.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_aircraftnotintheair"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_aircraftnotintheair_inline">AIRCRAFT_NOT_IN_THE_AIR</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_aircraftnotintheair_inline"

><div class="article"><h6 ><font color="#AAA">final </font>AIRCRAFT_NOT_IN_THE_AIR</h6></div>

~~~java
 static final DJIMissionError AIRCRAFT_NOT_IN_THE_AIR = new DJIMissionError("The aircraft is not in the air", 0xDA)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft is not in the air.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_aircraftaltitudetoohigh"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_aircraftaltitudetoohigh_inline">AIRCRAFT_ALTITUDE_TOO_HIGH</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_aircraftaltitudetoohigh_inline"

><div class="article"><h6 ><font color="#AAA">final </font>AIRCRAFT_ALTITUDE_TOO_HIGH</h6></div>

~~~java
 static final DJIMissionError AIRCRAFT_ALTITUDE_TOO_HIGH =
            new DJIMissionError("The aircraft's altitude is too high.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft's altitude is too high.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_aircraftaltitudetoolow"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_aircraftaltitudetoolow_inline">AIRCRAFT_ALTITUDE_TOO_LOW</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_aircraftaltitudetoolow_inline"

><div class="article"><h6 ><font color="#AAA">final </font>AIRCRAFT_ALTITUDE_TOO_LOW</h6></div>

~~~java
 static final DJIMissionError AIRCRAFT_ALTITUDE_TOO_LOW =
            new DJIMissionError("The aircraft's altitude is too low.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft's altitude is too low.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_aircrafttakingoff"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_aircrafttakingoff_inline">AIRCRAFT_TAKING_OFF</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_aircrafttakingoff_inline"

><div class="article"><h6 ><font color="#AAA">final </font>AIRCRAFT_TAKING_OFF</h6></div>

~~~java
 static final DJIMissionError AIRCRAFT_TAKING_OFF = new DJIMissionError("The aircraft is taking off", 0xF0)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Aircraft is taking off.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_aircraftlanding"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_aircraftlanding_inline">AIRCRAFT_LANDING</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_aircraftlanding_inline"

><div class="article"><h6 ><font color="#AAA">final </font>AIRCRAFT_LANDING</h6></div>

~~~java
 static final DJIMissionError AIRCRAFT_LANDING = new DJIMissionError("The aircraft is landing", 0xF1)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Aircraft is landing.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_aircraftgoinghome"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_aircraftgoinghome_inline">AIRCRAFT_GOING_HOME</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_aircraftgoinghome_inline"

><div class="article"><h6 ><font color="#AAA">final </font>AIRCRAFT_GOING_HOME</h6></div>

~~~java
 static final DJIMissionError AIRCRAFT_GOING_HOME = new DJIMissionError("The aircraft is going home", 0xF2)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Aircraft is going home.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_aircrafthomepointnotrecorded"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_aircrafthomepointnotrecorded_inline">HOME_POINT_NOT_RECORDED</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_aircrafthomepointnotrecorded_inline"

><div class="article"><h6 ><font color="#AAA">final </font>HOME_POINT_NOT_RECORDED</h6></div>

~~~java
 static final DJIMissionError HOME_POINT_NOT_RECORDED =
            new DJIMissionError("The home point of aircraft is not recorded", 0xDE)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The home point of the aircraft is not recorded.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_aircraftinnovicemode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_aircraftinnovicemode_inline">IN_NOVICE_MODE</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_aircraftinnovicemode_inline"

><div class="article"><h6 ><font color="#AAA">final </font>IN_NOVICE_MODE</h6></div>

~~~java
 static final DJIMissionError IN_NOVICE_MODE = new DJIMissionError("The aircraft is in novice mode now", 0xCA)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Aircraft is in novice mode.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_aircraftinnoflyzone"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_aircraftinnoflyzone_inline">AIRCRAFT_IN_NO_FLY_ZONE</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_aircraftinnoflyzone_inline"

><div class="article"><h6 ><font color="#AAA">final </font>AIRCRAFT_IN_NO_FLY_ZONE</h6></div>

~~~java
 static final DJIMissionError AIRCRAFT_IN_NO_FLY_ZONE =
            new DJIMissionError("The aircraft is in the no fly zone", 0xDF)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Aircraft is in a no fly zone.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_reachflightlimitation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_reachflightlimitation_inline">REACH_FLIGHT_LIMITATION</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_reachflightlimitation_inline"

><div class="article"><h6 ><font color="#AAA">final </font>REACH_FLIGHT_LIMITATION</h6></div>

~~~java
 static final DJIMissionError REACH_FLIGHT_LIMITATION =
            new DJIMissionError("The aircraft has reached the flight limitation.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft has reached the flight limitation.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_aircraftrunningmission"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_aircraftrunningmission_inline">RUNNING_MISSION</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_aircraftrunningmission_inline"

><div class="article"><h6 ><font color="#AAA">final </font>RUNNING_MISSION</h6></div>

~~~java
 static final DJIMissionError RUNNING_MISSION = new DJIMissionError("The aircraft is running a mission")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft is running a mission.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_aircraftnearhomepoint"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_aircraftnearhomepoint_inline">TOO_CLOSE_TO_HOME_POINT</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_aircraftnearhomepoint_inline"

><div class="article"><h6 ><font color="#AAA">final </font>TOO_CLOSE_TO_HOME_POINT</h6></div>

~~~java
 static final DJIMissionError TOO_CLOSE_TO_HOME_POINT =
            new DJIMissionError("Aircraft is too close to home point", 0xA0)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Aircraft is too close to the home point.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_missionparametersinvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_missionparametersinvalid_inline">MISSION_PARAMETERS_INVALID</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_missionparametersinvalid_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MISSION_PARAMETERS_INVALID</h6></div>

~~~java
 static final DJIMissionError MISSION_PARAMETERS_INVALID =
            new DJIMissionError("The parameters of the mission are invalid", 0xDB)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The parameters of the mission are invalid.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_missionresumefailed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_missionresumefailed_inline">MISSION_RESUME_FAILED</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_missionresumefailed_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MISSION_RESUME_FAILED</h6></div>

~~~java
 static final DJIMissionError MISSION_RESUME_FAILED = new DJIMissionError("Failed to resume the mission", 0xC6)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Mission resume failed.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_trackingtargetlost"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_trackingtargetlost_inline">TRACKING_TARGET_LOST</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_trackingtargetlost_inline"

><div class="article"><h6 ><font color="#AAA">final </font>TRACKING_TARGET_LOST</h6></div>

~~~java
 static final DJIMissionError TRACKING_TARGET_LOST = new DJIMissionError("The tracking target is lost.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The tracking target is lost.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_novideofeed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_novideofeed_inline">NO_VIDEO_FEED</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_novideofeed_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NO_VIDEO_FEED</h6></div>

~~~java
 static final DJIMissionError NO_VIDEO_FEED =
            new DJIMissionError("No live video feed is captured for the ActiveTrack Mission. ")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">No live video feed is captured for the ActiveTrack Mission.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_videoframeratetoolow"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_videoframeratetoolow_inline">VIDEO_FRAME_RATE_TOO_LOW</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_videoframeratetoolow_inline"

><div class="article"><h6 ><font color="#AAA">final </font>VIDEO_FRAME_RATE_TOO_LOW</h6></div>

~~~java
 static final DJIMissionError VIDEO_FRAME_RATE_TOO_LOW =
            new DJIMissionError("The frame rate of the live video feed is too low.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The frame rate of the live video feed is too low.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_visionsystemnotauthorized"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_visionsystemnotauthorized_inline">VISION_SYSTEM_NOT_AUTHORIZED</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_visionsystemnotauthorized_inline"

><div class="article"><h6 ><font color="#AAA">final </font>VISION_SYSTEM_NOT_AUTHORIZED</h6></div>

~~~java
 static final DJIMissionError VISION_SYSTEM_NOT_AUTHORIZED =
            new DJIMissionError("The vision system cannot get the authorization to control the aircraft. ")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The vision system cannot get the authorization to control the aircraft.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_visionsystemerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_visionsystemerror_inline">VISION_SYSTEM_ERROR</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_visionsystemerror_inline"

><div class="article"><h6 ><font color="#AAA">final </font>VISION_SYSTEM_ERROR</h6></div>

~~~java
 static final DJIMissionError VISION_SYSTEM_ERROR =
            new DJIMissionError("The vision system encounters system error.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The vision system encounters system error.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_cannotbypassobstacle"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_cannotbypassobstacle_inline">CANNOT_BYPASS_OBSTACLE</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_cannotbypassobstacle_inline"

><div class="article"><h6 ><font color="#AAA">final </font>CANNOT_BYPASS_OBSTACLE</h6></div>

~~~java
 static final DJIMissionError CANNOT_BYPASS_OBSTACLE =
            new DJIMissionError("The aircraft cannot bypass the obstacle.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft cannot bypass the obstacle.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_stoppedbyuser"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_stoppedbyuser_inline">STOPPED_BY_USER</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_stoppedbyuser_inline"

><div class="article"><h6 ><font color="#AAA">final </font>STOPPED_BY_USER</h6></div>

~~~java
 static final DJIMissionError STOPPED_BY_USER = new DJIMissionError("Mission was stopped by the user.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Mission was stopped by the user.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_visionsystemneedcalibration"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_visionsystemneedcalibration_inline">VISION_SYSTEM_NEEDS_CALIBRATION</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_visionsystemneedcalibration_inline"

><div class="article"><h6 ><font color="#AAA">final </font>VISION_SYSTEM_NEEDS_CALIBRATION</h6></div>

~~~java
 static final DJIMissionError VISION_SYSTEM_NEEDS_CALIBRATION =
            new DJIMissionError("The vision system requires calibration.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The vision system requires calibration.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_visionsensoroverexposed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_visionsensoroverexposed_inline">VISION_SENSOR_OVEREXPOSED</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_visionsensoroverexposed_inline"

><div class="article"><h6 ><font color="#AAA">final </font>VISION_SENSOR_OVEREXPOSED</h6></div>

~~~java
 static final DJIMissionError VISION_SENSOR_OVEREXPOSED =
            new DJIMissionError("The vision sensors are overexposed.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The vision sensors are overexposed.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_visionsensorunderexposed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_visionsensorunderexposed_inline">VISION_SENSOR_UNDEREXPOSED</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_visionsensorunderexposed_inline"

><div class="article"><h6 ><font color="#AAA">final </font>VISION_SENSOR_UNDEREXPOSED</h6></div>

~~~java
 static final DJIMissionError VISION_SENSOR_UNDEREXPOSED =
            new DJIMissionError("The vision sensors are underexposed.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The vision sensors are underexposed.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_visiondataabnormal"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_visiondataabnormal_inline">VISION_DATA_ABNORMAL</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_visiondataabnormal_inline"

><div class="article"><h6 ><font color="#AAA">final </font>VISION_DATA_ABNORMAL</h6></div>

~~~java
 static final DJIMissionError VISION_DATA_ABNORMAL =
            new DJIMissionError("The data from the vision system is abnormal.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The data from the vision system is abnormal.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_featurepointcannotmatch"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_featurepointcannotmatch_inline">FEATURE_POINT_CANNOT_MATCH</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_featurepointcannotmatch_inline"

><div class="article"><h6 ><font color="#AAA">final </font>FEATURE_POINT_CANNOT_MATCH</h6></div>

~~~java
 static final DJIMissionError FEATURE_POINT_CANNOT_MATCH =
            new DJIMissionError("The feature points found by both vision sensors cannot match.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The feature points found by both vision sensors cannot match.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_trackingrecttoosmall"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_trackingrecttoosmall_inline">TRACKING_RECT_TOO_SMALL</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_trackingrecttoosmall_inline"

><div class="article"><h6 ><font color="#AAA">final </font>TRACKING_RECT_TOO_SMALL</h6></div>

~~~java
 static final DJIMissionError TRACKING_RECT_TOO_SMALL =
            new DJIMissionError("The tracking rectangle is too small.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The tracking rectangle is too small.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_trackingrecttoolarge"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_trackingrecttoolarge_inline">TRACKING_RECT_TOO_LARGE</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_trackingrecttoolarge_inline"

><div class="article"><h6 ><font color="#AAA">final </font>TRACKING_RECT_TOO_LARGE</h6></div>

~~~java
 static final DJIMissionError TRACKING_RECT_TOO_LARGE =
            new DJIMissionError("The tracking rectangle is too large.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The tracking rectangle is too large.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_trackingtargetnotenoughfeature"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_trackingtargetnotenoughfeature_inline">TRACKING_TARGET_NOT_ENOUGH_FEATURES</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_trackingtargetnotenoughfeature_inline"

><div class="article"><h6 ><font color="#AAA">final </font>TRACKING_TARGET_NOT_ENOUGH_FEATURES</h6></div>

~~~java
 static final DJIMissionError TRACKING_TARGET_NOT_ENOUGH_FEATURES =
            new DJIMissionError("The tracking target doesn't have enough features to lock onto.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The tracking target doesn't have enough features to lock onto.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_trackingtargettooclose"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_trackingtargettooclose_inline">TRACKING_TARGET_TOO_CLOSE</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_trackingtargettooclose_inline"

><div class="article"><h6 ><font color="#AAA">final </font>TRACKING_TARGET_TOO_CLOSE</h6></div>

~~~java
 static final DJIMissionError TRACKING_TARGET_TOO_CLOSE =
            new DJIMissionError("The tracking target is too close to the aircraft.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The Tracking target is too close to the aircraft.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_trackingtargettoofar"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_trackingtargettoofar_inline">TRACKING_TARGET_TOO_FAR</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_trackingtargettoofar_inline"

><div class="article"><h6 ><font color="#AAA">final </font>TRACKING_TARGET_TOO_FAR</h6></div>

~~~java
 static final DJIMissionError TRACKING_TARGET_TOO_FAR =
            new DJIMissionError("The tracking target is too far away from the aircraft.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The tracking target is too far away from the aircraft.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_trackingtargettoohigh"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_trackingtargettoohigh_inline">TRACKING_TARGET_TOO_HIGH</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_trackingtargettoohigh_inline"

><div class="article"><h6 ><font color="#AAA">final </font>TRACKING_TARGET_TOO_HIGH</h6></div>

~~~java
 static final DJIMissionError TRACKING_TARGET_TOO_HIGH =
            new DJIMissionError("The tracking target is too high.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The tracking target is too high.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_trackingtargetshaking"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_trackingtargetshaking_inline">TRACKING_TARGET_SHAKING</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_trackingtargetshaking_inline"

><div class="article"><h6 ><font color="#AAA">final </font>TRACKING_TARGET_SHAKING</h6></div>

~~~java
 static final DJIMissionError TRACKING_TARGET_SHAKING =
            new DJIMissionError("The tracking target is shaking too much.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The tracking target is shaking too much.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_trackingtargetlowconfidence"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_trackingtargetlowconfidence_inline">TRACKING_TARGET_LOW_CONFIDENCE</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_trackingtargetlowconfidence_inline"

><div class="article"><h6 ><font color="#AAA">final </font>TRACKING_TARGET_LOW_CONFIDENCE</h6></div>

~~~java
 static final DJIMissionError TRACKING_TARGET_LOW_CONFIDENCE =
            new DJIMissionError("The ActiveTrack mission is too unsure the tracking object and confirmation is required.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The ActiveTrack mission is too unsure the tracking object and confirmation is required.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_missionpausedbyuser"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_missionpausedbyuser_inline">TRACKING_PAUSED_BY_USER</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_missionpausedbyuser_inline"

><div class="article"><h6 ><font color="#AAA">final </font>TRACKING_PAUSED_BY_USER</h6></div>

~~~java
 static final DJIMissionError TRACKING_PAUSED_BY_USER = new DJIMissionError("Mission is paused by user.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Mission is paused by user.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_gimbalpitchtoolow"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_gimbalpitchtoolow_inline">TRACKING_GIMBAL_PITCH_TOO_LOW</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_gimbalpitchtoolow_inline"

><div class="article"><h6 ><font color="#AAA">final </font>TRACKING_GIMBAL_PITCH_TOO_LOW</h6></div>

~~~java
 static final DJIMissionError TRACKING_GIMBAL_PITCH_TOO_LOW =
            new DJIMissionError("The gimbal pitch is too low.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Gimbal pitch is too low.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_obstacledetected"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_obstacledetected_inline">TRACKING_OBSTACLE_DETECTED</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_obstacledetected_inline"

><div class="article"><h6 ><font color="#AAA">final </font>TRACKING_OBSTACLE_DETECTED</h6></div>

~~~java
 static final DJIMissionError TRACKING_OBSTACLE_DETECTED = new DJIMissionError("Obstacles are detected.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Encounter an obstacle.

</div>

<div class="api-row" id="djierror_djisdkmissionerror_reachaltitudelowerbound"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkmissionerror_reachaltitudelowerbound_inline">REACH_ALTITUDE_LOWER_BOUND</a></div></div><div class="inline-doc" id="djierror_djisdkmissionerror_reachaltitudelowerbound_inline"

><div class="article"><h6 ><font color="#AAA">final </font>REACH_ALTITUDE_LOWER_BOUND</h6></div>

~~~java
 static final DJIMissionError REACH_ALTITUDE_LOWER_BOUND =
            new DJIMissionError("The aircraft reaches the altitude lower bound of the TapFly Mission.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft reaches the altitude lower bound of the TapFly Mission.

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


