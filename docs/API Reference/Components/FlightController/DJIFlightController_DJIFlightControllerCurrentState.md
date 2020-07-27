<div class="article"><h1 ><font color="#AAA">class </font>FlightControllerState</h1></div>

~~~java
@EXClassNullAway
 class FlightControllerState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">This class represents the current state of the flight controller.



##### Class Members:



#### State Updates

<div class="api-row" id="djiflightcontroller_updatesystemstatecallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightController/DJIFlightController_UpdateSystemStateCallbackInterface.html">Callback</a></div></div><html><p><br></p></html>

#### Flight Information

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_aremotorson"><div class="api-col left">Motors</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_aremotorson_inline">areMotorsOn</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_aremotorson_inline"

><div class="article"><h6 ><font color="#AAA">method </font>areMotorsOn</h6></div>

~~~java
 boolean areMotorsOn() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_are_motor_on_key">FlightControllerKey.ARE_MOTOR_ON</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if motors are on.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_isflying"><div class="api-col left">Flight</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_isflying_inline">isFlying</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_isflying_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isFlying</h6></div>

~~~java
 boolean isFlying() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_is_flying_key">FlightControllerKey.IS_FLYING</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if aircraft is flying.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_aircraftlocation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_aircraftlocation_inline">getAircraftLocation</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_aircraftlocation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAircraftLocation</h6></div>

~~~java
 LocationCoordinate3D getAircraftLocation() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_aircraft_location_latitude_key">FlightControllerKey.AIRCRAFT_LOCATION_LATITUDE</a>, <a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_aircraft_location_longitude_key">FlightControllerKey.AIRCRAFT_LOCATION_LONGITUDE</a>, <a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_altitude_key">FlightControllerKey.ALTITUDE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the current location of the aircraft as a coordinate. <code>nil</code> if the location is invalid.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate3D.html#djiflightcontroller_djilocationcoordinate3d">LocationCoordinate3D</a></td><td><font color="#666"><i>The current location of the aircraft as a coordinate.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_takeofflocationaltitude"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_takeofflocationaltitude_inline">getTakeoffLocationAltitude</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_takeofflocationaltitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTakeoffLocationAltitude</h6></div>

~~~java
 float getTakeoffLocationAltitude() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999">DJIFlightControllerParamTakeoffLocationAltitude</td></tr></table></html>



##### Description:



<font color="#666">Relative altitude of the aircraft home location relative to sea level, in meters.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of the altitude.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_attitude"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_attitude_inline">getAttitude</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_attitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAttitude</h6></div>

~~~java
 Attitude getAttitude() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_attitude_pitch_key">FlightControllerKey.ATTITUDE_PITCH</a>, <a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_attitude_roll_key">FlightControllerKey.ATTITUDE_ROLL</a>, <a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_attitude_yaw_key">FlightControllerKey.ATTITUDE_YAW</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the attitude of the aircraft, where the pitch, roll, and yaw values will be  in the range of [-180, 180] degrees. If its pitch, roll, and yaw values are 0, the aircraft will  be hovering level with a True North heading.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Attitude</td><td><font color="#666"><i>The attitude of the aircraft.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_velocityx"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_velocityx_inline">getVelocityX</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_velocityx_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVelocityX</h6></div>

~~~java
 float getVelocityX() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_velocity_x_key">FlightControllerKey.VELOCITY_X</a></td></tr></table></html>



##### Description:



<font color="#666">Current speed of the aircraft in the x direction, in meters per second, using the N-E-D (North-East-Down)  coordinate system.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of the current speed of the aircraft in the x direction.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_velocityy"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_velocityy_inline">getVelocityY</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_velocityy_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVelocityY</h6></div>

~~~java
 float getVelocityY() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_velocity_y_key">FlightControllerKey.VELOCITY_Y</a></td></tr></table></html>



##### Description:



<font color="#666">Current speed of the aircraft in the y direction, in meters per second, using the N-E-D (North-East-Down)  coordinate system.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of the current speed of the aircraft in the y direction.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_velocityz"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_velocityz_inline">getVelocityZ</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_velocityz_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVelocityZ</h6></div>

~~~java
 float getVelocityZ() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_velocity_z_key">FlightControllerKey.VELOCITY_Z</a></td></tr></table></html>



##### Description:



<font color="#666">Current speed of the aircraft in the z direction, in meters per second, using the N-E-D (North-East-Down)  coordinate system.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of the current speed of the aircraft in the z direction.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_flighttime"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_flighttime_inline">getFlightTimeInSeconds</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_flighttime_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlightTimeInSeconds</h6></div>

~~~java
 int getFlightTimeInSeconds() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_fly_time_in_seconds_key">FlightControllerKey.FLY_TIME_IN_SECONDS</a></td></tr></table></html>



##### Description:



<font color="#666">The accumulated flight time, in seconds, since the aircraft's motors were turned on.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the flight time.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Flight Actions

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_islandingconfirmationneeded"><div class="api-col left">Land</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_islandingconfirmationneeded_inline">isLandingConfirmationNeeded</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_islandingconfirmationneeded_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isLandingConfirmationNeeded</h6></div>

~~~java
 boolean isLandingConfirmationNeeded() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_is_landing_confirmation_needed_key">FlightControllerKey.IS_LANDING_CONFIRMATION_NEEDED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the clearance between the aircraft and the ground is less than 0.3m, and  confirmation from the user is needed to continue the landing. When the confirmation is needed, <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_confirmlanding">confirmLanding</a></code> in <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller">FlightController</a></code> can be used to continue landing. It is
 supported by flight controller firmware 3.2.0.0 or above.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>Whether confirmation is needed or not.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Flight Mode

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_flightmode"><div class="api-col left">Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_flightmode_inline">getFlightMode</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_flightmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlightMode</h6></div>

~~~java
 FlightMode getFlightMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_flight_mode_key">FlightControllerKey.FLIGHT_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Flight controller flight mode. For more info, see  https://developer.dji.com/mobile-sdk/documentation/introduction/component-guide-remotecontroller.html#flight-mode



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJIFlightControllerCurrentState.html#djiflightcontroller_djiflightcontrollerflightmode">FlightMode</a></td><td><font color="#666"><i>An enum value of the <code><a href="/Components/FlightController/DJIFlightController_DJIFlightControllerCurrentState.html#djiflightcontroller_djiflightcontrollerflightmode">FlightMode</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_flightmodestring"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_flightmodestring_inline">getFlightModeString</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_flightmodestring_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlightModeString</h6></div>

~~~java
 String getFlightModeString() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_flight_mode_string_key">FlightControllerKey.FLIGHT_MODE_STRING</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the flight mode as a string.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>The flight mode as a string. For example, "P-GPS" or "P-Atti".</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_ismultiplemodeopen"><div class="api-col left">Multi Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_ismultiplemodeopen_inline">isMultipleModeOpen</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_ismultiplemodeopen_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isMultipleModeOpen</h6></div>

~~~java
 boolean isMultipleModeOpen() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_multi_mode_open_key">FlightControllerKey.MULTI_MODE_OPEN</a></td></tr></table></html>



##### Description:



<font color="#666">Determines whether multiple flight modes are open. This will reflect whether navigation mode (ground  station) is enabled.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the navigation mode is enabled.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Sensors

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_satellitecount"><div class="api-col left">GPS</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_satellitecount_inline">getSatelliteCount</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_satellitecount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSatelliteCount</h6></div>

~~~java
 int getSatelliteCount() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_satellite_count_key">FlightControllerKey.SATELLITE_COUNT</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the GPS satellite count.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>The double value of the GPS satellite count.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_gpssignalstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_gpssignalstatus_inline">getGPSSignalLevel</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_gpssignalstatus_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getGPSSignalLevel</h6></div>

~~~java
 GPSSignalLevel getGPSSignalLevel() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_gps_signal_level_key">FlightControllerKey.GPS_SIGNAL_LEVEL</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the aircraft's current GPS signal quality.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJIFlightControllerCurrentState.html#djiflightcontroller_djigpssignalstatus">GPSSignalLevel</a></td><td><font color="#666"><i>The aircraft's current GPS signal quality.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_isimupreheating"><div class="api-col left">IMU</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_isimupreheating_inline">isIMUPreheating</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_isimupreheating_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isIMUPreheating</h6></div>

~~~java
 boolean isIMUPreheating() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_is_imu_preheating_key">FlightControllerKey.IS_IMU_PREHEATING</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if IMU is preheating.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_isultrasonicbeingused"><div class="api-col left">Ultrasonic Sensor</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_isultrasonicbeingused_inline">isUltrasonicBeingUsed</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_isultrasonicbeingused_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isUltrasonicBeingUsed</h6></div>

~~~java
 boolean isUltrasonicBeingUsed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_is_ultrasonic_being_used_key">FlightControllerKey.IS_ULTRASONIC_BEING_USED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the ultrasonic sensor is being used. Variables that can impact the quality  of the ultrasound measurement, or whether it's being used, are height above ground and the type of ground  (if it reflects sound waves well). Usually, the ultrasonic sensor works when the aircraft is less than 8m  above ground.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_ultrasonicheight"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_ultrasonicheight_inline">getUltrasonicHeightInMeters</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_ultrasonicheight_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getUltrasonicHeightInMeters</h6></div>

~~~java
 float getUltrasonicHeightInMeters() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_ultrasonic_height_in_meters_key">FlightControllerKey.ULTRASONIC_HEIGHT_IN_METERS</a></td></tr></table></html>



##### Description:



<font color="#666">Height of aircraft measured by the ultrasonic sensor in meters. The data will only be available  if <code><a href="/Components/FlightController/DJIFlightController_DJIFlightControllerCurrentState.html#djiflightcontroller_djiflightcontrollercurrentstate_isultrasonicbeingused">isUltrasonicBeingUsed</a></code> returns <code>true</code>. Height has a precision of 0.1m. This value has reference significance when the height  is below 5 meters.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of the height of the aircraft measured by the ultrasonic sensor in meters.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_isultrasonicerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_isultrasonicerror_inline">doesUltrasonicHaveError</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_isultrasonicerror_inline"

><div class="article"><h6 ><font color="#AAA">method </font>doesUltrasonicHaveError</h6></div>

~~~java
 boolean doesUltrasonicHaveError() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_ultrasonic_error_key">FlightControllerKey.ULTRASONIC_ERROR</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if ultrasonic sensor has error.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if ultrasonic sensor has error.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_isvisionsensorbeingused"><div class="api-col left">Vision Sensor</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_isvisionsensorbeingused_inline">isVisionPositioningSensorBeingUsed</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_isvisionsensorbeingused_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isVisionPositioningSensorBeingUsed</h6></div>

~~~java
 boolean isVisionPositioningSensorBeingUsed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_is_vision_positioning_sensor_being_used_key">FlightControllerKey.IS_VISION_POSITIONING_SENSOR_BEING_USED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if a vision sensor is being used. Variables that can impact the quality of the  vision measurement, or whether it's being used, are height above ground and the type of ground (if it has  sufficiently rich texture). Usually, the vision sensor works when the aircraft is less than 3m above ground.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Flight Assistance

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_orientationmode"><div class="api-col left">Orientation Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_orientationmode_inline">getOrientationMode</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_orientationmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getOrientationMode</h6></div>

~~~java
 FlightOrientationMode getOrientationMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_orientation_mode_key">FlightControllerKey.ORIENTATION_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">The aircraft's current orientation mode.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightorientationmode">FlightOrientationMode</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightorientationmode">FlightOrientationMode</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_isfailsafe"><div class="api-col left">Connection Fail Safe</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_isfailsafe_inline">isFailsafeEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_isfailsafe_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isFailsafeEnabled</h6></div>

~~~java
 boolean isFailsafeEnabled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_is_fail_safe_key">FlightControllerKey.IS_FAIL_SAFE</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the signal is lost between remote controller and aircraft, and FailSafe is enabled.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_remainingbattery"><div class="api-col left">Remaining Battery</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_remainingbattery_inline">getBatteryThresholdBehavior</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_remainingbattery_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBatteryThresholdBehavior</h6></div>

~~~java
 BatteryThresholdBehavior getBatteryThresholdBehavior() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_battery_threshold_behavior_key">FlightControllerKey.BATTERY_THRESHOLD_BEHAVIOR</a></td></tr></table></html>



##### Description:



<font color="#666">Recommended action based on remaining battery life.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJIFlightControllerCurrentState.html#djiflightcontroller_djiflightcontrollercurrentstate_djiaircraftremainingbatterystate">BatteryThresholdBehavior</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/FlightController/DJIFlightController_DJIFlightControllerCurrentState.html#djiflightcontroller_djiflightcontrollercurrentstate_djiaircraftremainingbatterystate">BatteryThresholdBehavior</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_islowerthanbatterywarningthreshold"><div class="api-col left">Battery Warning Threshold</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_islowerthanbatterywarningthreshold_inline">isLowerThanBatteryWarningThreshold</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_islowerthanbatterywarningthreshold_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isLowerThanBatteryWarningThreshold</h6></div>

~~~java
 boolean isLowerThanBatteryWarningThreshold() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the battery is lower than the low battery warning threshold.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_islowerthanseriousbatterywarningthreshold"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_islowerthanseriousbatterywarningthreshold_inline">isLowerThanSeriousBatteryWarningThreshold</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_islowerthanseriousbatterywarningthreshold_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isLowerThanSeriousBatteryWarningThreshold</h6></div>

~~~java
 boolean isLowerThanSeriousBatteryWarningThreshold() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the battery is lower than the serious low battery warning threshold.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_windwarning"><div class="api-col left">Wind Warning</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_windwarning_inline">getFlightWindWarning</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_windwarning_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlightWindWarning</h6></div>

~~~java
 FlightWindWarning getFlightWindWarning() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Warning related to high winds.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightwindwarning">FlightWindWarning</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightwindwarning">FlightWindWarning</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_countofflights"><div class="api-col left">Count of Flights</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_countofflights_inline">getFlightCount</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_countofflights_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlightCount</h6></div>

~~~java
 int getFlightCount()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">The count of flights within the battery life cycle. Cleared when power-on.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of flight count.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_flightlogindex"><div class="api-col left">Flight Log Index</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_flightlogindex_inline">getFlightLogIndex</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_flightlogindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlightLogIndex</h6></div>

~~~java
 int getFlightLogIndex()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">The current index of the flight log on the aircraft. It is useful to find the corresponding flight log.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the flight log index.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_isactivebrakeengaged"><div class="api-col left">Check Active Brake Engaged</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_isactivebrakeengaged_inline">isActiveBrakeEngaged</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_isactivebrakeengaged_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isActiveBrakeEngaged</h6></div>

~~~java
 boolean isActiveBrakeEngaged() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> when Active Brake is enaged to avoid obstacles. It is supported only by Matrice 300 RTK.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if Active Brake is engaged.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Home

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_ishomepointset"><div class="api-col left">Location</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_ishomepointset_inline">isHomeLocationSet</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_ishomepointset_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isHomeLocationSet</h6></div>

~~~java
 boolean isHomeLocationSet() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_is_home_location_set_key">FlightControllerKey.IS_HOME_LOCATION_SET</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the home point has been set.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_homelocation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_homelocation_inline">getHomeLocation</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_homelocation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHomeLocation</h6></div>

~~~java
 LocationCoordinate2D getHomeLocation() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_home_location_key">FlightControllerKey.HOME_LOCATION</a>, <a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_home_location_latitude_key">FlightControllerKey.HOME_LOCATION_LATITUDE</a>, <a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_home_location_longitude_key">FlightControllerKey.HOME_LOCATION_LONGITUDE</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the home location of the aircraft as a coordinate.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_smartgohomestatus"><div class="api-col left">Go Home Assessment</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_smartgohomestatus_inline">getGoHomeAssessment</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_smartgohomestatus_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getGoHomeAssessment</h6></div>

~~~java
 GoHomeAssessment getGoHomeAssessment() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the aircraft's smart go home data. If smart go home is enabled, all the  smart go home data will be available  in <code><a href="/Components/FlightController/DJIFlightController_DJIFlightControllerCurrentState_DJIFlightControllerSmartGoHomeStatus.html#djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus">GoHomeAssessment</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJIFlightControllerCurrentState_DJIFlightControllerSmartGoHomeStatus.html#djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus">GoHomeAssessment</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/FlightController/DJIFlightController_DJIFlightControllerCurrentState_DJIFlightControllerSmartGoHomeStatus.html#djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus">GoHomeAssessment</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_gohomeexecutionstatus"><div class="api-col left">Go Home State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_gohomeexecutionstatus_inline">getGoHomeExecutionState</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_gohomeexecutionstatus_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getGoHomeExecutionState</h6></div>

~~~java
 GoHomeExecutionState getGoHomeExecutionState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_go_home_status_key">FlightControllerKey.GO_HOME_STATUS</a></td></tr></table></html>



##### Description:



<font color="#666">The current status of go-home execution.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJIFlightControllerCurrentState.html#djiflightcontroller_djiflightcontrollergohomeexecutionstatus">GoHomeExecutionState</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/FlightController/DJIFlightController_DJIFlightControllerCurrentState.html#djiflightcontroller_djiflightcontrollergohomeexecutionstatus">GoHomeExecutionState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_isgoinghome"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_isgoinghome_inline">isGoingHome</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_isgoinghome_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isGoingHome</h6></div>

~~~java
 boolean isGoingHome() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_is_going_home_key">FlightControllerKey.IS_GOING_HOME</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the aircraft is going home.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_getgohomeheight"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_getgohomeheight_inline">getGoHomeHeight</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_getgohomeheight_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getGoHomeHeight</h6></div>

~~~java
 int getGoHomeHeight() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_go_home_height_in_meters_key">FlightControllerKey.GO_HOME_HEIGHT_IN_METERS</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the height when the aircraft is going home in meters.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the height when the aircraft is going home.</i></td></tr></table></html></div>

<html><p><br></p></html>

##### Related:

<div class="api-row" id="djiflightcontroller_djiattitude"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightController/DJIFlightController_DJIAttitude.html">Attitude</a></div></div><div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_djiaircraftremainingbatterystate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_djiaircraftremainingbatterystate_inline">BatteryThresholdBehavior</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_djiaircraftremainingbatterystate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>BatteryThresholdBehavior</h6></div>

~~~java
@EXClassNullAway
 enum BatteryThresholdBehavior 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_battery_threshold_behavior_key">FlightControllerKey.BATTERY_THRESHOLD_BEHAVIOR</a></td></tr></table></html>



##### Description:



<font color="#666">Remaining battery life state. This state describes the recommended action based on remaining battery life.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollercurrentstate_djiaircraftremainingbatterystate_normal_inline"></a>FLY_NORMALLY</td><td><font color="#666">Remaining battery life sufficient for normal flying.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollercurrentstate_djiaircraftremainingbatterystate_low_inline"></a>GO_HOME</td><td><font color="#666">Remaining battery life sufficient to go home.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollercurrentstate_djiaircraftremainingbatterystate_verylow_inline"></a>LAND_IMMEDIATELY</td><td><font color="#666">Remaining battery life sufficient to land immediately.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollercurrentstate_djiaircraftremainingbatterystate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollergohomeexecutionstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollergohomeexecutionstatus_inline">GoHomeExecutionState</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollergohomeexecutionstatus_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>GoHomeExecutionState</h6></div>

~~~java
@EXClassNullAway
 enum GoHomeExecutionState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_go_home_status_key">FlightControllerKey.GO_HOME_STATUS</a></td></tr></table></html>



##### Description:



<font color="#666">An enum used to identify the different stages of the go-home command.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollergohomeexecutionstatus_notexecuting_inline"></a>NOT_EXECUTING</td><td><font color="#666">The aircraft is not executing a Go-Home command.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollergohomeexecutionstatus_turndirectiontohomepoint_inline"></a>TURN_DIRECTION_TO_HOME_POINT</td><td><font color="#666">The aircraft is turning the heading direction to the home point.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollergohomeexecutionstatus_gouptoheight_inline"></a>GO_UP_TO_HEIGHT</td><td><font color="#666">The aircraft is going up to the height for go-home command.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollergohomeexecutionstatus_autoflytohomepoint_inline"></a>AUTO_FLY_TO_HOME_POINT</td><td><font color="#666">The aircraft is flying horizontally to home point.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollergohomeexecutionstatus_godowntoground_inline"></a>GO_DOWN_TO_GROUND</td><td><font color="#666">The aircraft is going down after arriving at the home point.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollergohomeexecutionstatus_braking_inline"></a>BRAKING</td><td><font color="#666">The aircraft is braking to avoid collision.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollergohomeexecutionstatus_bypassing_inline"></a>BYPASSING</td><td><font color="#666">The aircraft is bypassing over the obstacle.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollergohomeexecutionstatus_completed_inline"></a>COMPLETED</td><td><font color="#666">The go-home command is completed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollergohomeexecutionstatus_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The go-home status is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiflightcontroller_djilocationcoordinate3d"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate3D.html">LocationCoordinate3D</a></div></div><div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightController/DJIFlightController_DJIFlightControllerCurrentState_DJIFlightControllerSmartGoHomeStatus.html">GoHomeAssessment</a></div></div><div class="api-row" id="djiflightcontroller_djigpssignalstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djigpssignalstatus_inline">GPSSignalLevel</a></div></div><div class="inline-doc" id="djiflightcontroller_djigpssignalstatus_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>GPSSignalLevel</h6></div>

~~~java
@EXClassNullAway
 enum GPSSignalLevel 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_gps_signal_level_key">FlightControllerKey.GPS_SIGNAL_LEVEL</a></td></tr></table></html>



##### Description:



<font color="#666">A enum class representing GPS signal levels, which are used to measure the signal quality.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djigpssignalstatus_level0_inline"></a>LEVEL_0</td><td><font color="#666">The GPS has almost no signal, which is very bad.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djigpssignalstatus_level1_inline"></a>LEVEL_1</td><td><font color="#666">The GPS signal is very weak.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djigpssignalstatus_level2_inline"></a>LEVEL_2</td><td><font color="#666">The GPS signal is weak. At this level, the aircraft's go home functionality will still work.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djigpssignalstatus_level3_inline"></a>LEVEL_3</td><td><font color="#666">The GPS signal is good. At this level, the aircraft can hover in the air.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djigpssignalstatus_level4_inline"></a>LEVEL_4</td><td><font color="#666">The GPS signal is very good. At this level, the aircraft can record the home point.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djigpssignalstatus_level5_inline"></a>LEVEL_5</td><td><font color="#666">The GPS signal is very strong.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djigpssignalstatus_none_inline"></a>NONE</td><td><font color="#666">There is no GPS signal.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollerflightmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollerflightmode_inline">FlightMode</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollerflightmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FlightMode</h6></div>

~~~java
@EXClassNullAway
 enum FlightMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_flight_mode_key">FlightControllerKey.FLIGHT_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Flight controller flight modes. For more information, see http://wiki.dji.com/en/index.php/Phantom_3_Professional-Aircraft.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_manual_inline"></a>MANUAL</td><td><font color="#666">Manual mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_atti_inline"></a>ATTI</td><td><font color="#666">Attitude mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_atticourselock_inline"></a>ATTI_COURSE_LOCK</td><td><font color="#666">Attitude course lock mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_attihover_inline"></a>ATTI_HOVER</td><td><font color="#666">Attitude hover mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_gpsatti_inline"></a>GPS_ATTI</td><td><font color="#666">GPS Attitude mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_gpscourselock_inline"></a>GPS_COURSE_LOCK</td><td><font color="#666">GPS course lock mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_gpshomelock_inline"></a>GPS_HOME_LOCK</td><td><font color="#666">GPS Home mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_gpshotpoint_inline"></a>GPS_HOT_POINT</td><td><font color="#666">GPS hotpoint mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_assistedtakeoff_inline"></a>ASSISTED_TAKEOFF</td><td><font color="#666">Assisted takeoff mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_autotakeoff_inline"></a>AUTO_TAKEOFF</td><td><font color="#666">Auto takeoff mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_autolanding_inline"></a>AUTO_LANDING</td><td><font color="#666">Auto landing mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_attilanding_inline"></a>ATTI_LANDING</td><td><font color="#666">Attitude landing mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_gpswaypoint_inline"></a>GPS_WAYPOINT</td><td><font color="#666">GPS waypoint mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_gohome_inline"></a>GO_HOME</td><td><font color="#666">Go home mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_joystick_inline"></a>JOYSTICK</td><td><font color="#666">Joystick mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_attilimited_inline"></a>ATTI_LIMITED</td><td><font color="#666">Attitude limited mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_draw_inline"></a>DRAW</td><td><font color="#666">Draw mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_gpsattilimited_inline"></a>GPS_ATTI_WRISTBAND</td><td><font color="#666">GPS attitude limited mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_gpsfollowme_inline"></a>GPS_FOLLOW_ME</td><td><font color="#666">GPS follow me mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_activetrack_inline"></a>ACTIVE_TRACK</td><td><font color="#666">ActiveTrack mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_tapfly_inline"></a>TAP_FLY</td><td><font color="#666">TapFly mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_sport_inline"></a>GPS_SPORT</td><td><font color="#666">Sport mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_gpsnoive_inline"></a>GPS_NOVICE</td><td><font color="#666">GPS Novice mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The main controller flight mode is unknown.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_confirmlanding_inline"></a>CONFIRM_LANDING</td><td><font color="#666">Confirm landing mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_terrainfollow_inline"></a>TERRAIN_FOLLOW</td><td><font color="#666">The aircraft should move following the terrain.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_tripod_inline"></a>TRIPOD</td><td><font color="#666">Tripod mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_activetrackspotlight_inline"></a>TRACK_SPOTLIGHT</td><td><font color="#666">Active track mode, corresponds to Spotlight active track mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerflightmode_motorsjuststarted_inline"></a>MOTORS_JUST_STARTED</td><td><font color="#666">The motors are just started.</td></tr></table></html>

##### Class Members:

</div>


