<div class="article"><h1 ><font color="#AAA">class </font>IMUState</h1></div>

~~~java
@EXClassNullAway
 class IMUState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.imu</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_imu_state_key">FlightControllerKey.IMU_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">This class provides the inertial measurement unit's (IMU) state information.



##### Class Members:

<div class="api-row" id="djiimustate_imuid"><div class="api-col left">Information</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiimustate_imuid_inline">getIndex</a></div></div><div class="inline-doc" id="djiimustate_imuid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getIndex</h6></div>

~~~java
 int getIndex() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.imu</td></tr></table></html>



##### Description:



<font color="#666">The IMU's ID. Starts at 0.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djiimustate_gyroscopestatus"><div class="api-col left">Sensor</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiimustate_gyroscopestatus_inline">getGyroscopeState</a></div></div><div class="inline-doc" id="djiimustate_gyroscopestatus_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getGyroscopeState</h6></div>

~~~java
 SensorState getGyroscopeState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.imu</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999">IMU_STATE_GYROSCOPE_STATE</td></tr></table></html>



##### Description:



<font color="#666">Returns the gyroscopic sensor's state value.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/IMUState/DJIIMUState.html#djiimustate_djiimusensorstatus">SensorState</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/IMUState/DJIIMUState.html#djiimustate_djiimusensorstatus">SensorState</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djiimustate_accelerometorstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiimustate_accelerometorstatus_inline">getAccelerometerState</a></div></div><div class="inline-doc" id="djiimustate_accelerometorstatus_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAccelerometerState</h6></div>

~~~java
 SensorState getAccelerometerState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.imu</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999">IMU_STATE_ACCELEROMETER_STATE</td></tr></table></html>



##### Description:



<font color="#666">Returns the accelerometers sensor state value.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/IMUState/DJIIMUState.html#djiimustate_djiimusensorstatus">SensorState</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/IMUState/DJIIMUState.html#djiimustate_djiimusensorstatus">SensorState</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djiimustate_calibrationprogress"><div class="api-col left">Calibration</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiimustate_calibrationprogress_inline">getCalibrationProgress</a></div></div><div class="inline-doc" id="djiimustate_calibrationprogress_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCalibrationProgress</h6></div>

~~~java
 int getCalibrationProgress() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.imu</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999">IMU_STATE_CALIBRATION_PROGRESS</td></tr></table></html>



##### Description:



<font color="#666">Returns the IMU's calibration progress, its range being [1, 100]. If the IMU is  not calibrating, the value of the calibration progress will be -1.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djiimustate_calibrationstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiimustate_calibrationstatus_inline">getCalibrationState</a></div></div><div class="inline-doc" id="djiimustate_calibrationstatus_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCalibrationState</h6></div>

~~~java
 CalibrationState getCalibrationState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.imu</td></tr></table></html>



##### Description:



<font color="#666">Returns the status of the IMU's calibration.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">CalibrationState</td><td><font color="#666"><i>An enum value of <code><a href="/Components/IMUState/DJIIMUState.html#djiimustate_djiimucalibrationstatus">CalibrationState</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djiimustate_multiorientationcalibrationhint"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiimustate_multiorientationcalibrationhint_inline">getMultipleOrientationCalibrationHint</a></div></div><div class="inline-doc" id="djiimustate_multiorientationcalibrationhint_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMultipleOrientationCalibrationHint</h6></div>

~~~java
 MultipleOrientationCalibrationHint getMultipleOrientationCalibrationHint() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.imu</td></tr></table></html>



##### Description:



<font color="#666">For products that require the user to orient the aircraft during the IMU calibration, this method can be used to  inform the user when each orientation is done. It is supported by flight controller firmware 3.2.0.0 or above.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/IMUState/DJIIMUState_DJIIMUMultiOrientationCalibrationHint.html#djiimustate_djiimumultiorientationcalibrationhint">MultipleOrientationCalibrationHint</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/IMUState/DJIIMUState_DJIIMUMultiOrientationCalibrationHint.html#djiimustate_djiimumultiorientationcalibrationhint">MultipleOrientationCalibrationHint</a></code></i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiflightcontroller_imustatechangedcallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/IMUState/DJIFlightController_IMUStateChangedCallbackInterface.html">Callback</a></div></div><div class="api-row" id="djiimustate_djiimusensorstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiimustate_djiimusensorstatus_inline">SensorState</a></div></div><div class="inline-doc" id="djiimustate_djiimusensorstatus_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>SensorState</h6></div>

~~~java
@EXClassNullAway
 enum SensorState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.imu</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999">IMU_STATE_ACCELEROMETER_STATE, IMU_STATE_GYROSCOPE_STATE</td></tr></table></html>



##### Description:



<font color="#666">Enum for IMU calibration Status.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiimustate_djiimusensorstatus_disconnect_inline"></a>DISCONNECTED</td><td><font color="#666">The IMU sensor is disconnected from the flight controller.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiimustate_djiimusensorstatus_calibrating_inline"></a>CALIBRATING</td><td><font color="#666">The IMU sensor is calibrating</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiimustate_djiimusensorstatus_calibrationfailed_inline"></a>CALIBRATION_FAILED</td><td><font color="#666">Calibrate of the IMU sensor failed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiimustate_djiimusensorstatus_dataexception_inline"></a>DATA_EXCEPTION</td><td><font color="#666">The IMU sensor has a data exception. Calibrate the IMU and restart the aircraft. If afterwards the status still  exists, you may need to contact DJI for further assistance.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiimustate_djiimusensorstatus_warmingup_inline"></a>WARMING_UP</td><td><font color="#666">The IMU sensor is warming up.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiimustate_djiimusensorstatus_motion_inline"></a>IN_MOTION</td><td><font color="#666">The IMU sensor is not static; the aircraft may not be stable enough to calculate sensor data correctly.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiimustate_djiimusensorstatus_biasnormal_inline"></a>NORMAL_BIAS</td><td><font color="#666">The IMU's bias value is normal; the aircraft can safely take off.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiimustate_djiimusensorstatus_biasmedium_inline"></a>MEDIUM_BIAS</td><td><font color="#666">The IMU's bias value is medium; the aircraft can safely take off.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiimustate_djiimusensorstatus_biaslarge_inline"></a>LARGE_BIAS</td><td><font color="#666">The IMU's bias value is large; the aircraft cannot take off. IMU calibration is needed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiimustate_djiimusensorstatus_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The IMU sensor's status is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiimustate_djiimucalibrationstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiimustate_djiimucalibrationstatus_inline">CalibrationState</a></div></div><div class="inline-doc" id="djiimustate_djiimucalibrationstatus_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>CalibrationState</h6></div>

~~~java
@EXClassNullAway
 enum CalibrationState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.imu</td></tr></table></html>



##### Description:



<font color="#666">Enum for IMU calibration Status.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiimustate_djiimucalibrationstatus_none_inline"></a>NONE</td><td><font color="#666">IMU not in calibration; no calibration is executing.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiimustate_djiimucalibrationstatus_inprogress_inline"></a>CALIBRATING</td><td><font color="#666">IMU calibration is in progress.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiimustate_djiimucalibrationstatus_succeeded_inline"></a>SUCCESSFUL</td><td><font color="#666">IMU calibration succeeded.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiimustate_djiimucalibrationstatus_failed_inline"></a>FAILED</td><td><font color="#666">IMU calibration failed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiimustate_djiimucalibrationstatus_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown calibration status.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiimustate_djiimucalibrationorientation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiimustate_djiimucalibrationorientation_inline">CalibrationOrientation</a></div></div><div class="inline-doc" id="djiimustate_djiimucalibrationorientation_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>CalibrationOrientation</h6></div>

~~~java
@EXClassNullAway
 enum CalibrationOrientation 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">The different orientations the aircraft needs for a multi-orientation IMU calibration.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiimustate_djiimucalibrationorientation_nosedown_inline"></a>NOSE_DOWN</td><td><font color="#666">The front/nose of the aircraft should be pointed down.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiimustate_djiimucalibrationorientation_taildown_inline"></a>TAIL_DOWN</td><td><font color="#666">The back/tail of the aircraft should be pointed down.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiimustate_djiimucalibrationorientation_rightdown_inline"></a>RIGHT_DOWN</td><td><font color="#666">The right/starboard side of the aircraft should be pointed down.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiimustate_djiimucalibrationorientation_leftdown_inline"></a>LEFT_DOWN</td><td><font color="#666">The left/port side of the aircraft should be pointed down.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiimustate_djiimucalibrationorientation_bottomdown_inline"></a>BOTTOM_DOWN</td><td><font color="#666">The bottom/underbelly of the aircraft should be pointed down.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiimustate_djiimucalibrationorientation_topdown_inline"></a>TOP_DOWN</td><td><font color="#666">The top of the aircraft should be pointed down.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiimustate_djiimumultiorientationcalibrationstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiimustate_djiimumultiorientationcalibrationstatus_inline">OrientationCalibrationState</a></div></div><div class="inline-doc" id="djiimustate_djiimumultiorientationcalibrationstatus_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>OrientationCalibrationState</h6></div>

~~~java
@EXClassNullAway
 enum OrientationCalibrationState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.imu</td></tr></table></html>



##### Description:



<font color="#666">IMU calibration status for the current aircraft orientation.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiimustate_djiimumultiorientationcalibrationstatus_calibrating_inline"></a>CALIBRATING</td><td><font color="#666">Calibration of current aircraft orientation is in progress.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiimustate_djiimumultiorientationcalibrationstatus_done_inline"></a>COMPLETED</td><td><font color="#666">Calibration of current aircraft orientation is done. The orientation will be added  to <code><a href="/Components/IMUState/DJIIMUState_DJIIMUMultiOrientationCalibrationHint.html#djiimustate_djiimumultiorientationcalibrationhint_orientationscalibrated">getOrientationsCalibrated</a></code>. The aircraft should be  rotated to a remaining orientation  in <code><a href="/Components/IMUState/DJIIMUState_DJIIMUMultiOrientationCalibrationHint.html#djiimustate_djiimumultiorientationcalibrationhint_orientationstocalibrate">getOrientationsToCalibrate</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiimustate_djiimumultiorientationcalibrationstatus_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown. Used by products that do not require IMU multi-orientation calibration.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiimustate_djiimumultiorientationcalibrationhint"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/IMUState/DJIIMUState_DJIIMUMultiOrientationCalibrationHint.html">MultipleOrientationCalibrationHint</a></div></div>
