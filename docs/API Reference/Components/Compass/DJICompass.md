<div class="article"><h1 ><font color="#AAA">class </font>Compass</h1></div>

~~~java
 class Compass 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">This class provides compass status information and compass calibration methods. Products with multiple compasses (like the Phantom 4) have their compass state fused into one compass class for simplicity.



##### Class Members:

<div class="api-row" id="djicompass_heading"><div class="api-col left">Heading</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicompass_heading_inline">getHeading</a></div></div><div class="inline-doc" id="djicompass_heading_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHeading</h6></div>

~~~java
 float getHeading() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_compass_heading_key">FlightControllerKey.COMPASS_HEADING</a></td></tr></table></html>



##### Description:



<font color="#666">Represents the heading, in degrees. True North is 0 degrees, positive heading is East of North, and negative  heading is West of North. Heading bounds are [-180, 180].



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A double value of the heading, in degrees.</i></td></tr></table></html></div>

<div class="api-row" id="djicompass_haserror"><div class="api-col left">Error</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicompass_haserror_inline">hasError</a></div></div><div class="inline-doc" id="djicompass_haserror_inline"

><div class="article"><h6 ><font color="#AAA">method </font>hasError</h6></div>

~~~java
 boolean hasError() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_compass_has_error_key">FlightControllerKey.COMPASS_HAS_ERROR</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the compass has an error. If <code>true</code>, the compass  needs calibration.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicompass_iscalibrating"><div class="api-col left">Check Calibrating</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicompass_iscalibrating_inline">isCalibrating</a></div></div><div class="inline-doc" id="djicompass_iscalibrating_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isCalibrating</h6></div>

~~~java
 boolean isCalibrating() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_compass_is_calibrating_key">FlightControllerKey.COMPASS_IS_CALIBRATING</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the compass is currently calibrating.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicompass_calibrationstatus"><div class="api-col left">Calibration Status</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicompass_calibrationstatus_inline">getCalibrationState</a></div></div><div class="inline-doc" id="djicompass_calibrationstatus_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCalibrationState</h6></div>

~~~java
 CompassCalibrationState getCalibrationState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_compass_calibration_status_key">FlightControllerKey.COMPASS_CALIBRATION_STATUS</a></td></tr></table></html>



##### Description:



<font color="#666">Shows the calibration status.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Compass/DJICompass.html#djicompass_djicompasscalibrationstatus">CompassCalibrationState</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Compass/DJICompass.html#djicompass_djicompasscalibrationstatus">CompassCalibrationState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djicompass_startcalibration"><div class="api-col left">Calibration</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicompass_startcalibration_inline">startCalibration</a></div></div><div class="inline-doc" id="djicompass_startcalibration_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startCalibration</h6></div>

~~~java
 void startCalibration(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_compass_start_calibration_key">FlightControllerKey.COMPASS_START_CALIBRATION</a></td></tr></table></html>



##### Description:



<font color="#666">Starts compass calibration. Make sure there are no magnets or metal objects near the compass.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback. See DJIBaseComponent for more information about the callback and what is  recommended be done with it.</i></td></tr></table></html></div>

<div class="api-row" id="djicompass_stopcalibration"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicompass_stopcalibration_inline">stopCalibration</a></div></div><div class="inline-doc" id="djicompass_stopcalibration_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopCalibration</h6></div>

~~~java
 void stopCalibration(@Nullable CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_compass_stop_calibration_key">FlightControllerKey.COMPASS_STOP_CALIBRATION</a></td></tr></table></html>



##### Description:



<font color="#666">Stops compass calibration.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback. See DJIBaseComponent for more information about the callback and what is recommended  be done with it.</i></td></tr></table></html></div>

<div class="api-row" id="djicompass_calibrationstatuscallback"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicompass_calibrationstatuscallback_inline">setCalibrationStateCallback</a></div></div><div class="inline-doc" id="djicompass_calibrationstatuscallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCalibrationStateCallback</h6></div>

~~~java
 void setCalibrationStateCallback(@Nullable CompassCalibrationState.Callback  callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_compass_calibration_status_key">FlightControllerKey.COMPASS_CALIBRATION_STATUS</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the callback for compass calibration.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Compass/DJICompass.html#djicompass_djicompasscalibrationstatus">CompassCalibrationState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>The callback with compass calibration state</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djicompass_djicompasscalibrationstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicompass_djicompasscalibrationstatus_inline">CompassCalibrationState</a></div></div><div class="inline-doc" id="djicompass_djicompasscalibrationstatus_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>CompassCalibrationState</h6></div>

~~~java
@EXClassNullAway
 enum CompassCalibrationState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_compass_calibration_status_key">FlightControllerKey.COMPASS_CALIBRATION_STATUS</a></td></tr></table></html>



##### Description:



<font color="#666">An enum class representing compass calibration.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicompass_djicompasscalibrationstatus_normal_inline"></a>NOT_CALIBRATING</td><td><font color="#666">Normal state. Compass not in calibration.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicompass_djicompasscalibrationstatus_horizontal_inline"></a>HORIZONTAL</td><td><font color="#666">Compass horizontal calibration. The user should hold the aircraft horizontally and rotate it 360 degrees.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicompass_djicompasscalibrationstatus_vertical_inline"></a>VERTICAL</td><td><font color="#666">Compass vertical calibration. The user should hold the aircraft vertically, with the nose pointed towards the  ground, and rotate the aircraft 360 degrees.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicompass_djicompasscalibrationstatus_succeeded_inline"></a>SUCCESSFUL</td><td><font color="#666">Compass calibration succeeded.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicompass_djicompasscalibrationstatus_failed_inline"></a>FAILED</td><td><font color="#666">Compass calibration failed. Make sure there are no magnets or metal objects near the compass and retry.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicompass_djicompasscalibrationstatus_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Compass calibration status unknown.</td></tr></table></html>

##### Class Members:

<div class="api-row" id="djicompass_compasscalibrationstatecallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Compass/DJICompass_CompassCalibrationStateCallback.html">Callback</a></div></div></div>


