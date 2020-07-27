<div class="article"><h1 ><font color="#AAA">class </font>MultipleOrientationCalibrationHint</h1></div>

~~~java
@EXClassNullAway
 class MultipleOrientationCalibrationHint 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.imu</td></tr></table></html>



##### Description:



<font color="#666">This class is used to lead the user through an IMU calibration for products that require calibration at multiple  orientations. An example workflow is: <br>  <ol> <li>Direct the user to orient the aircraft in one of the uncalibrated  orientations in <code><a href="/Components/IMUState/DJIIMUState_DJIIMUMultiOrientationCalibrationHint.html#djiimustate_djiimumultiorientationcalibrationhint_orientationstocalibrate">getOrientationsToCalibrate</a></code>.</li> <li>Monitor <code><a href="/Components/IMUState/DJIIMUState_DJIIMUMultiOrientationCalibrationHint.html#djiimustate_djiimumultiorientationcalibrationhint_status">getState</a></code>  until <code><a href="/Components/IMUState/DJIIMUState.html#djiimustate_djiimumultiorientationcalibrationstatus_calibrating">CALIBRATING</a></code> turns  to <code><a href="/Components/IMUState/DJIIMUState.html#djiimustate_djiimumultiorientationcalibrationstatus_done">COMPLETED</a></code>.</li> <li>Repeat until <code><a href="/Components/IMUState/DJIIMUState_DJIIMUMultiOrientationCalibrationHint.html#djiimustate_djiimumultiorientationcalibrationhint_orientationstocalibrate">getOrientationsToCalibrate</a></code> is empty.</li> </ol>



##### Class Members:

<div class="api-row" id="djiimustate_djiimumultiorientationcalibrationhint_status"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiimustate_djiimumultiorientationcalibrationhint_status_inline">getState</a></div></div><div class="inline-doc" id="djiimustate_djiimumultiorientationcalibrationhint_status_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getState</h6></div>

~~~java
 OrientationCalibrationState getState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.imu</td></tr></table></html>



##### Description:



<font color="#666">Gets the calibration status of the current orientation.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/IMUState/DJIIMUState.html#djiimustate_djiimumultiorientationcalibrationstatus">OrientationCalibrationState</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/IMUState/DJIIMUState.html#djiimustate_djiimumultiorientationcalibrationstatus">OrientationCalibrationState</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djiimustate_djiimumultiorientationcalibrationhint_orientationstocalibrate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiimustate_djiimumultiorientationcalibrationhint_orientationstocalibrate_inline">getOrientationsToCalibrate</a></div></div><div class="inline-doc" id="djiimustate_djiimumultiorientationcalibrationhint_orientationstocalibrate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getOrientationsToCalibrate</h6></div>

~~~java
 HashSet<CalibrationOrientation> getOrientationsToCalibrate() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.imu</td></tr></table></html>



##### Description:



<font color="#666">Gets an array with the aircraft orientations that have not been calibrated yet. Each element  is a  <code><a href="/Components/IMUState/DJIIMUState.html#djiimustate_djiimucalibrationorientation">CalibrationOrientation</a></code> enum value.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">HashSet&lt;<a href="/Components/IMUState/DJIIMUState.html#djiimustate_djiimucalibrationorientation">CalibrationOrientation</a>&gt;</td><td><font color="#666"><i>An instance of HashSet <code><a href="/Components/IMUState/DJIIMUState.html#djiimustate_djiimucalibrationorientation">CalibrationOrientation</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiimustate_djiimumultiorientationcalibrationhint_orientationscalibrated"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiimustate_djiimumultiorientationcalibrationhint_orientationscalibrated_inline">getOrientationsCalibrated</a></div></div><div class="inline-doc" id="djiimustate_djiimumultiorientationcalibrationhint_orientationscalibrated_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getOrientationsCalibrated</h6></div>

~~~java
 HashSet<CalibrationOrientation> getOrientationsCalibrated() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.imu</td></tr></table></html>



##### Description:



<font color="#666">Gets an array with the aircraft orientations that have been calibrated. Each element is  a  <code><a href="/Components/IMUState/DJIIMUState.html#djiimustate_djiimucalibrationorientation">CalibrationOrientation</a></code> enum value.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">HashSet&lt;<a href="/Components/IMUState/DJIIMUState.html#djiimustate_djiimucalibrationorientation">CalibrationOrientation</a>&gt;</td><td><font color="#666"><i>An instance of HashSet<code><a href="/Components/IMUState/DJIIMUState.html#djiimustate_djiimucalibrationorientation">CalibrationOrientation</a></code>.</i></td></tr></table></html></div>


