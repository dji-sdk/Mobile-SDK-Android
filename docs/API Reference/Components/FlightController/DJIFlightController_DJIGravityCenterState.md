<div class="article"><h1 ><font color="#AAA">class </font>GravityCenterState</h1></div>

~~~java
 final class GravityCenterState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">This class provides the gravity state information.



##### Class Members:

<div class="api-row" id="djiflightcontroller_djigravitycenterstate_calibrationstate"><div class="api-col left">Calibration State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djigravitycenterstate_calibrationstate_inline">getCalibrationState</a></div></div><div class="inline-doc" id="djiflightcontroller_djigravitycenterstate_calibrationstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCalibrationState</h6></div>

~~~java
@Nullable
 GravityCenterCalibrationState getCalibrationState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">The status of the gravity's calibration.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJIGravityCenterState.html#djiflightcontroller_djigravitycenterstate_djigravitycentercalibrationstate">GravityCenterCalibrationState</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/FlightController/DJIFlightController_DJIGravityCenterState.html#djiflightcontroller_djigravitycenterstate_djigravitycentercalibrationstate">GravityCenterCalibrationState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djigravitycenterstate_calibrationerror"><div class="api-col left">Calibration Error</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djigravitycenterstate_calibrationerror_inline">getCalibrationError</a></div></div><div class="inline-doc" id="djiflightcontroller_djigravitycenterstate_calibrationerror_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCalibrationError</h6></div>

~~~java
@Nullable
 DJIError getCalibrationError() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets calibration errors. Returns <code>null</code> when gravity calibration is normal.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code>.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiflightcontroller_djigravitycenterstate_djigravitycentercalibrationstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djigravitycenterstate_djigravitycentercalibrationstate_inline">GravityCenterCalibrationState</a></div></div><div class="inline-doc" id="djiflightcontroller_djigravitycenterstate_djigravitycentercalibrationstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>GravityCenterCalibrationState</h6></div>

~~~java
 enum GravityCenterCalibrationState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Enum for gravity calibration State.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djigravitycenterstate_djigravitycentercalibrationstate_none_inline"></a>NONE</td><td><font color="#666">The aircraft is not calibrating the gravity center.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djigravitycenterstate_djigravitycentercalibrationstate_calibrating_inline"></a>CALCULATING</td><td><font color="#666">The aircraft is calibrating the gravity center.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djigravitycenterstate_djigravitycentercalibrationstate_successful_inline"></a>SUCCESSFUL</td><td><font color="#666">The aircraft calibrates the gravity center successfully.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djigravitycenterstate_djigravitycentercalibrationstate_failed_inline"></a>FAILED</td><td><font color="#666">The aircraft calibrates the gravity center failed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djigravitycenterstate_djigravitycentercalibrationstate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown calibration status.</td></tr></table></html>

##### Class Members:

</div>


