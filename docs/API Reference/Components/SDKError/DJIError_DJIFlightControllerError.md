<div class="article"><h1 ><font color="#AAA">class </font>DJIFlightControllerError</h1></div>

~~~java
@EXClassNullAway
 class DJIFlightControllerError extends DJIError 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code></td></tr></table></html>



##### Description:



<font color="#666">Defines all flight controller errors.



##### Class Members:

<div class="api-row" id="djierror_djiflightcontrollererror_getdjierror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiflightcontrollererror_getdjierror_inline">getDJIError</a></div></div><div class="inline-doc" id="djierror_djiflightcontrollererror_getdjierror_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDJIError</h6></div>

~~~java
 static DJIError getDJIError(Ccode ccode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Returns the specific error in DJIFlightControllerError according to the error code.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Ccode <font color="#000">ccode</td><td><font color="#666"><i>Error code.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>The DJIError object.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djierror_djiflightcontrollererror_not_logged_in"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiflightcontrollererror_not_logged_in_inline">NOT_LOGGED_IN</a></div></div><div class="inline-doc" id="djierror_djiflightcontrollererror_not_logged_in_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NOT_LOGGED_IN</h6></div>

~~~java
 static final DJIFlightControllerError NOT_LOGGED_IN = new DJIFlightControllerError("You are not logged in.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">No user is logged in.

</div>

<div class="api-row" id="djierror_djiflightcontrollererror_fail_to_enter_transport_mode_when_motors_on"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiflightcontrollererror_fail_to_enter_transport_mode_when_motors_on_inline">FAIL_TO_ENTER_TRANSPORT_MODE_WHEN_MOTORS_ON</a></div></div><div class="inline-doc" id="djierror_djiflightcontrollererror_fail_to_enter_transport_mode_when_motors_on_inline"

><div class="article"><h6 ><font color="#AAA">final </font>FAIL_TO_ENTER_TRANSPORT_MODE_WHEN_MOTORS_ON</h6></div>

~~~java
 static final DJIFlightControllerError FAIL_TO_ENTER_TRANSPORT_MODE_WHEN_MOTORS_ON = new DJIFlightControllerError("When the motors are on, the aircraft could not get into transport mode.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">When the motors are on, the aircraft could not get into transport mode.

</div>

<div class="api-row" id="djierror_djiflightcontrollererror_imu_calibration_error_in_the_air_or_motors_on"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiflightcontrollererror_imu_calibration_error_in_the_air_or_motors_on_inline">IMU_CALIBRATION_ERROR_IN_THE_AIR_OR_MOTORS_ON</a></div></div><div class="inline-doc" id="djierror_djiflightcontrollererror_imu_calibration_error_in_the_air_or_motors_on_inline"

><div class="article"><h6 ><font color="#AAA">final </font>IMU_CALIBRATION_ERROR_IN_THE_AIR_OR_MOTORS_ON</h6></div>

~~~java
 static final DJIFlightControllerError IMU_CALIBRATION_ERROR_IN_THE_AIR_OR_MOTORS_ON = new DJIFlightControllerError("IMU calibration is now allowed if the aircraft's motors are on or the aircraft is in the air.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">IMU calibration is not allowed if the aircraft's motors are on or the aircraft is in the air.

</div>

<div class="api-row" id="djierror_djiflightcontrollererror_flight_controller_invalid_parameter"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiflightcontrollererror_flight_controller_invalid_parameter_inline">INVALID_PARAMETER</a></div></div><div class="inline-doc" id="djierror_djiflightcontrollererror_flight_controller_invalid_parameter_inline"

><div class="article"><h6 ><font color="#AAA">final </font>INVALID_PARAMETER</h6></div>

~~~java
 static final DJIFlightControllerError INVALID_PARAMETER =
        new DJIFlightControllerError("FlightController received invalid parameters")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The parameter is not a valid value.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_badgps"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_badgps_inline">GPS_SIGNAL_WEAK</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_badgps_inline"

><div class="article"><h6 ><font color="#AAA">final </font>GPS_SIGNAL_WEAK</h6></div>

~~~java
 static final DJIFlightControllerError GPS_SIGNAL_WEAK = new DJIFlightControllerError(
        "GPS level is too weak to allow flight controller to obtain accurate location.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">GPS level is not high enough to allow flight controller to obtain accurate location.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_gimbalnotremoved"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_gimbalnotremoved_inline">COULD_NOT_ENTER_TRANSPORT_MODE</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_gimbalnotremoved_inline"

><div class="article"><h6 ><font color="#AAA">final </font>COULD_NOT_ENTER_TRANSPORT_MODE</h6></div>

~~~java
 static final DJIFlightControllerError COULD_NOT_ENTER_TRANSPORT_MODE =
        new DJIFlightControllerError("Aircraft could not enter transport mode, since the gimbal is still connected")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Aircraft could not enter transport mode, since the gimbal is still connected.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_aircraftflying"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_aircraftflying_inline">CANNOT_TURN_OFF_MOTORS_WHILE_AIRCRAFT_FLYING</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_aircraftflying_inline"

><div class="article"><h6 ><font color="#AAA">final </font>CANNOT_TURN_OFF_MOTORS_WHILE_AIRCRAFT_FLYING</h6></div>

~~~java
 static final DJIFlightControllerError CANNOT_TURN_OFF_MOTORS_WHILE_AIRCRAFT_FLYING =
        new DJIFlightControllerError("The aircraft is flying and the motors could not be shut down.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft is flying. For safety consideration, the motors could not be shut down.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_homepointtoofar"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_homepointtoofar_inline">HOME_POINT_TOO_FAR</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_homepointtoofar_inline"

><div class="article"><h6 ><font color="#AAA">final </font>HOME_POINT_TOO_FAR</h6></div>

~~~java
 static final DJIFlightControllerError HOME_POINT_TOO_FAR = new DJIFlightControllerError(
        "Location is not within 30M of initial take-off location OR current RC location.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The new home point is too far.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_gohomealtitudetoolow"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_gohomealtitudetoolow_inline">GO_HOME_ALTITUDE_TOO_LOW</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_gohomealtitudetoolow_inline"

><div class="article"><h6 ><font color="#AAA">final </font>GO_HOME_ALTITUDE_TOO_LOW</h6></div>

~~~java
 static final DJIFlightControllerError GO_HOME_ALTITUDE_TOO_LOW =
        new DJIFlightControllerError("The go home altitude is too low (lower than 20m).")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The new home altitude is too low. (Lower than 20m).

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_gohomealtitudetoohigh"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_gohomealtitudetoohigh_inline">GO_HOME_ALTITUDE_TOO_HIGH</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_gohomealtitudetoohigh_inline"

><div class="article"><h6 ><font color="#AAA">final </font>GO_HOME_ALTITUDE_TOO_HIGH</h6></div>

~~~java
 static final DJIFlightControllerError GO_HOME_ALTITUDE_TOO_HIGH =
        new DJIFlightControllerError("The go home altitude is too high.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The new home altitude is too high. (higher than 500m).

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_gohomealtitudehigherthanmaxflightheight"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_gohomealtitudehigherthanmaxflightheight_inline">GO_HOME_ALTITUDE_HIGHER_THAN_MAX_FLIGHT_HEIGHT</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_gohomealtitudehigherthanmaxflightheight_inline"

><div class="article"><h6 ><font color="#AAA">final </font>GO_HOME_ALTITUDE_HIGHER_THAN_MAX_FLIGHT_HEIGHT</h6></div>

~~~java
 static final DJIFlightControllerError GO_HOME_ALTITUDE_HIGHER_THAN_MAX_FLIGHT_HEIGHT =
		new DJIFlightControllerError("The go home altitude is too high (higher than max flight height).")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The go home altitude is too high (higher than max flight height).

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_rtkstarterror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_rtkstarterror_inline">RTK_CANNOT_START</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_rtkstarterror_inline"

><div class="article"><h6 ><font color="#AAA">final </font>RTK_CANNOT_START</h6></div>

~~~java
 static final DJIFlightControllerError RTK_CANNOT_START =
        new DJIFlightControllerError("The RTK starting is failed.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">RTK cannot start properly. Please reboot.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_rtkconnectionbroken"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_rtkconnectionbroken_inline">RTK_CONNECTION_BROKEN</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_rtkconnectionbroken_inline"

><div class="article"><h6 ><font color="#AAA">final </font>RTK_CONNECTION_BROKEN</h6></div>

~~~java
 static final DJIFlightControllerError RTK_CONNECTION_BROKEN = new DJIFlightControllerError("The RTK connection is lost.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Connection between base station and mobile station is broken.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_rtkbsantennaerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_rtkbsantennaerror_inline">RTK_BS_ANTENNA_ERROR</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_rtkbsantennaerror_inline"

><div class="article"><h6 ><font color="#AAA">final </font>RTK_BS_ANTENNA_ERROR</h6></div>

~~~java
 static final DJIFlightControllerError RTK_BS_ANTENNA_ERROR = new DJIFlightControllerError("The RTK base station antenna is broken.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">RTK base station antenna error. Check if the antenna is connected to the correct port.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_rtkbscoordinatesreset"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_rtkbscoordinatesreset_inline">RTK_BS_COORDINATE_RESET</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_rtkbscoordinatesreset_inline"

><div class="article"><h6 ><font color="#AAA">final </font>RTK_BS_COORDINATE_RESET</h6></div>

~~~java
 static final DJIFlightControllerError RTK_BS_COORDINATE_RESET =
        new DJIFlightControllerError("The RTK base station location has been reset")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">RTK base station's coordinate resets.

</div>

<html><p><br></p></html>

#### Members

<div class="api-row" id="djierror_djisdkflightcontrollererror_groundsystemnotactivated"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_groundsystemnotactivated_inline">BASE_STATION_NOT_ACTIVATED</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_groundsystemnotactivated_inline"

><div class="article"><h6 ><font color="#AAA">final </font>BASE_STATION_NOT_ACTIVATED</h6></div>

~~~java
 static final DJIFlightControllerError BASE_STATION_NOT_ACTIVATED = new DJIFlightControllerError(" The base station isn't activated.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The base station isn't activated.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_groundsystemismoved"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_groundsystemismoved_inline">BASE_STATION_IS_MOVED</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_groundsystemismoved_inline"

><div class="article"><h6 ><font color="#AAA">final </font>BASE_STATION_IS_MOVED</h6></div>

~~~java
 static final DJIFlightControllerError BASE_STATION_IS_MOVED = new DJIFlightControllerError("The base station is moved. Land the aircraft to re-establish the connection to the ground station.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The base station is moved. Land the aircraft to re-establish  the connection to the ground station.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_groundsystemfell"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_groundsystemfell_inline">BASE_STATION_FELL</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_groundsystemfell_inline"

><div class="article"><h6 ><font color="#AAA">final </font>BASE_STATION_FELL</h6></div>

~~~java
 static final DJIFlightControllerError BASE_STATION_FELL = new DJIFlightControllerError("The base station fell. Land the aircraft to re-establish the connection to the ground station.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The base station fell. Land the aircraft to re-establish the connection  to the base station.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_rtkbasestationparameternumbernotmatch"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_rtkbasestationparameternumbernotmatch_inline">BASE_STATION_PARAMETER_NUMBER_NOT_MATCH</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_rtkbasestationparameternumbernotmatch_inline"

><div class="article"><h6 ><font color="#AAA">final </font>BASE_STATION_PARAMETER_NUMBER_NOT_MATCH</h6></div>

~~~java
 static final DJIFlightControllerError BASE_STATION_PARAMETER_NUMBER_NOT_MATCH = new DJIFlightControllerError("Base station internal error. Parameter numbers do not match. Please contact <dev@dji.com>.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Base station internal error. Parameter numbers do not match. Please contact <dev@dji.com>.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_rtkbasestationparameterlengthnotmatch"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_rtkbasestationparameterlengthnotmatch_inline">BASE_STATION_PARAMETER_LENGTH_NOT_MATCH</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_rtkbasestationparameterlengthnotmatch_inline"

><div class="article"><h6 ><font color="#AAA">final </font>BASE_STATION_PARAMETER_LENGTH_NOT_MATCH</h6></div>

~~~java
 static final DJIFlightControllerError BASE_STATION_PARAMETER_LENGTH_NOT_MATCH = new DJIFlightControllerError("Base station internal error. Parameters' length do not match. Please contact <dev@dji.com>.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Base station internal error. Parameters' length do not match. Please contact <dev@dji.com>.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_rtkbasestationparameterreadonly"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_rtkbasestationparameterreadonly_inline">BASE_STATION_PARAMETER_READ_ONLY</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_rtkbasestationparameterreadonly_inline"

><div class="article"><h6 ><font color="#AAA">final </font>BASE_STATION_PARAMETER_READ_ONLY</h6></div>

~~~java
 static final DJIFlightControllerError BASE_STATION_PARAMETER_READ_ONLY = new DJIFlightControllerError("Base station internal error. Parameters read only. Please contact <dev@dji.com>.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Base station internal error. Parameters read only. Please contact <dev@dji.com>.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_gravitycentercalibrationnotflying"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_gravitycentercalibrationnotflying_inline">GRAVITY_CENTER_CALIBRATION_NOT_FLYING</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_gravitycentercalibrationnotflying_inline"

><div class="article"><h6 ><font color="#AAA">final </font>GRAVITY_CENTER_CALIBRATION_NOT_FLYING</h6></div>

~~~java
 static final DJIFlightControllerError GRAVITY_CENTER_CALIBRATION_NOT_FLYING= new DJIFlightControllerError("The aircraft cannot start the gravity center calibration because it is not flying.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft cannot start the gravity center calibration because it is not flying.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_gravitycentercalibrationcannotworkinsimulator"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_gravitycentercalibrationcannotworkinsimulator_inline">GRAVITY_CENTER_CALIBRATION_NOT_FLYING_NOT_WORK_IN_SIMULATOR</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_gravitycentercalibrationcannotworkinsimulator_inline"

><div class="article"><h6 ><font color="#AAA">final </font>GRAVITY_CENTER_CALIBRATION_NOT_FLYING_NOT_WORK_IN_SIMULATOR</h6></div>

~~~java
 static final DJIFlightControllerError GRAVITY_CENTER_CALIBRATION_NOT_FLYING_NOT_WORK_IN_SIMULATOR = new DJIFlightControllerError("The aircraft cannot start the gravity center calibration because the simulator starts.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft cannot start the gravity center calibration because the simulator starts.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_gravitycalibrationisrunning"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_gravitycalibrationisrunning_inline">GRAVITY_CENTER_CALIBRATION_IS_RUNNING</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_gravitycalibrationisrunning_inline"

><div class="article"><h6 ><font color="#AAA">final </font>GRAVITY_CENTER_CALIBRATION_IS_RUNNING</h6></div>

~~~java
 static final DJIFlightControllerError GRAVITY_CENTER_CALIBRATION_IS_RUNNING = new DJIFlightControllerError("The aircraft cannot start the gravity center calibration before the previous calibration finishes.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft cannot start the gravity center calibration before the previous calibration finishes.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_gravitycalibrationnothovering"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_gravitycalibrationnothovering_inline">GRAVITY_CENTER_CALIBRATION_NOT_HOVERING</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_gravitycalibrationnothovering_inline"

><div class="article"><h6 ><font color="#AAA">final </font>GRAVITY_CENTER_CALIBRATION_NOT_HOVERING</h6></div>

~~~java
 static final DJIFlightControllerError GRAVITY_CENTER_CALIBRATION_NOT_HOVERING = new DJIFlightControllerError("The aircraft cannot start the gravity center calibration because it is not hovering.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft cannot start the gravity center calibration because it is not hovering.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_gravitycalibrationstoppedbyuser"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_gravitycalibrationstoppedbyuser_inline">GRAVITY_CENTER_CALIBRATION_STOPPED_BY_USER</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_gravitycalibrationstoppedbyuser_inline"

><div class="article"><h6 ><font color="#AAA">final </font>GRAVITY_CENTER_CALIBRATION_STOPPED_BY_USER</h6></div>

~~~java
 static final DJIFlightControllerError GRAVITY_CENTER_CALIBRATION_STOPPED_BY_USER = new DJIFlightControllerError("The gravity center calibration is stopped by the user.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The gravity center calibration is stopped by the user.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_gravitycalibrationfailedinbigwind"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_gravitycalibrationfailedinbigwind_inline">GRAVITY_CENTER_CALIBRATION_FAILED_IN_BIG_WIND</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_gravitycalibrationfailedinbigwind_inline"

><div class="article"><h6 ><font color="#AAA">final </font>GRAVITY_CENTER_CALIBRATION_FAILED_IN_BIG_WIND</h6></div>

~~~java
 static final DJIFlightControllerError GRAVITY_CENTER_CALIBRATION_FAILED_IN_BIG_WIND = new DJIFlightControllerError("The gravity center calibration is interrupted because the wind is too strong.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The gravity center calibration is interrupted because the wind is too strong.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_ownerofflineerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_ownerofflineerror_inline">OWNER_OFFLINE_ERROR</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_ownerofflineerror_inline"

><div class="article"><h6 ><font color="#AAA">final </font>OWNER_OFFLINE_ERROR</h6></div>

~~~java
 static final DJIFlightControllerError OWNER_OFFLINE_ERROR= new DJIFlightControllerError("The current rc is offline")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Owner offline error.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_devicelockederror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_devicelockederror_inline">DEVICE_LOCKED_ERROR</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_devicelockederror_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DEVICE_LOCKED_ERROR</h6></div>

~~~java
 static final DJIFlightControllerError DEVICE_LOCKED_ERROR= new DJIFlightControllerError("The device to lock is locked")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Device locked error.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_owneroutcontrolerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_owneroutcontrolerror_inline">OWNER_OUT_CONTROL_ERROR</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_owneroutcontrolerror_inline"

><div class="article"><h6 ><font color="#AAA">final </font>OWNER_OUT_CONTROL_ERROR</h6></div>

~~~java
 static final DJIFlightControllerError OWNER_OUT_CONTROL_ERROR= new DJIFlightControllerError("The current rc does not have this device control permission.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Owner out control error.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_cannotbeexecutedwithcurrentattitude"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_cannotbeexecutedwithcurrentattitude_inline">COMMAND_NOT_SUPPORTED_BY_CURRENT_ATTITUDE</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_cannotbeexecutedwithcurrentattitude_inline"

><div class="article"><h6 ><font color="#AAA">final </font>COMMAND_NOT_SUPPORTED_BY_CURRENT_ATTITUDE</h6></div>

~~~java
 static final DJIFlightControllerError COMMAND_NOT_SUPPORTED_BY_CURRENT_ATTITUDE = new DJIFlightControllerError("The command cannot be executed with the current attitude.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The command cannot be executed with the current attitude.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_rtkbasestationneedlogin"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_rtkbasestationneedlogin_inline">BASE_STATION_NEED_LOGIN</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_rtkbasestationneedlogin_inline"

><div class="article"><h6 ><font color="#AAA">final </font>BASE_STATION_NEED_LOGIN</h6></div>

~~~java
 static final DJIFlightControllerError BASE_STATION_NEED_LOGIN = new DJIFlightControllerError("For Matrice 300 RTK, you must login before set name, or set referencingLocation etc.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">For Matrice 300 RTK, you must login before you can set name, or use <code><a href="/Components/RTKBaseStation/DJIRTKBaseStation.html#djirtkbasestation_setbasestationreferencinglocation">setBaseStationReferencingLocation</a></code> etc.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_cannotbasestationscaninflying"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_cannotbasestationscaninflying_inline">CANNOT_BASE_STATION_SCAN_IN_FLYING</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_cannotbasestationscaninflying_inline"

><div class="article"><h6 ><font color="#AAA">final </font>CANNOT_BASE_STATION_SCAN_IN_FLYING</h6></div>

~~~java
 static final DJIFlightControllerError CANNOT_BASE_STATION_SCAN_IN_FLYING = new DJIFlightControllerError("For Matrice 300 RTK, you could not trigger scan base station when flying")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">For Matrice 300 RTK, you cannot scan fro a base station while flying.

</div>

<div class="api-row" id="djierror_djisdkflightcontrollererror_rtkbasestationpasswordinvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflightcontrollererror_rtkbasestationpasswordinvalid_inline">BASE_STATION_PASSWORD_INVALID</a></div></div><div class="inline-doc" id="djierror_djisdkflightcontrollererror_rtkbasestationpasswordinvalid_inline"

><div class="article"><h6 ><font color="#AAA">final </font>BASE_STATION_PASSWORD_INVALID</h6></div>

~~~java
 static final DJIFlightControllerError BASE_STATION_PASSWORD_INVALID =
			new DJIFlightControllerError("Base station administrator account's password is invalid. Please login again. If you reset your password, please use the default password.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Base station administrator account password is invalid. Please login again. If you reset your password, please use the default password.

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


