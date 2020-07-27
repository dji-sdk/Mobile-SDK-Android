<div class="article"><h1 ><font color="#AAA">class </font>GimbalState</h1></div>

~~~java
@EXClassNullAway
 class GimbalState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">This class provides the current state of the gimbal.



##### Class Members:



#### Information

<div class="api-row" id="djigimbal_gimbalstate_yawrelativetoaircraftheading"><div class="api-col left">Get Yaw Angle</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_gimbalstate_yawrelativetoaircraftheading_inline">getYawRelativeToAircraftHeading</a></div></div><div class="inline-doc" id="djigimbal_gimbalstate_yawrelativetoaircraftheading_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getYawRelativeToAircraftHeading</h6></div>

~~~java
 float getYawRelativeToAircraftHeading()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_angle_with_aircraft_in_degree_key">GimbalKey.YAW_ANGLE_WITH_AIRCRAFT_IN_DEGREE</a></td></tr></table></html>



##### Description:



<font color="#666">This function will return the angle between gimbal and the drone heading.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of yaw angle.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Members

<div class="api-row" id="djigimbal_gimbalstate_attitude"><div class="api-col left">Attitude</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_gimbalstate_attitude_inline">getAttitudeInDegrees</a></div></div><div class="inline-doc" id="djigimbal_gimbalstate_attitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAttitudeInDegrees</h6></div>

~~~java
 Attitude getAttitudeInDegrees() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_attitude_in_degrees_key">GimbalKey.ATTITUDE_IN_DEGREES</a></td></tr></table></html>



##### Description:



<font color="#666">The current gimbal attitude in degrees. Roll, pitch and yaw are 0 if the gimbal is level with the aircraft and points in the forward direction of North Pole.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Attitude</td><td><font color="#666"><i>An <code><a href="/Components/Gimbal/DJIGimbal_attitude.html#djigimbal_attitude">Attitude</a></code> instance.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_gimbalstate_rollfinetuneindegrees"><div class="api-col left">Roll fine-tune</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_gimbalstate_rollfinetuneindegrees_inline">getRollFineTuneInDegrees</a></div></div><div class="inline-doc" id="djigimbal_gimbalstate_rollfinetuneindegrees_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRollFineTuneInDegrees</h6></div>

~~~java
 float getRollFineTuneInDegrees() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_roll_fine_tune_in_degrees_key">GimbalKey.ROLL_FINE_TUNE_IN_DEGREES</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the gimbal's roll fine-tuned value. The range for the fine-tuned value is [-10, 10] degrees. If the fine-tune value is negative, the gimbal will be fine- tuned to the specified number of degrees in the counterclockwise direction.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_gimbalstate_pitchfinetuneindegrees"><div class="api-col left">Pitch Fine Tune</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_gimbalstate_pitchfinetuneindegrees_inline">getPitchFineTuneInDegrees</a></div></div><div class="inline-doc" id="djigimbal_gimbalstate_pitchfinetuneindegrees_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPitchFineTuneInDegrees</h6></div>

~~~java
 float getPitchFineTuneInDegrees() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Returns the gimbal's pitch fine-tuned value. The range for the fine-tuned value is [-10, 10] degrees. If the fine-tune value is negative, the gimbal will be fine-tuned to the specified number of degrees in the downward direction. It is only supported by Spark.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_gimbalstate_finetunedyaw"><div class="api-col left">Fine Tuned Yaw</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_gimbalstate_finetunedyaw_inline">getYawFineTuneInDegrees</a></div></div><div class="inline-doc" id="djigimbal_gimbalstate_finetunedyaw_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getYawFineTuneInDegrees</h6></div>

~~~java
 float getYawFineTuneInDegrees() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Returns the gimbal's yaw fine-tuned value. The range for the fine-tuned value is [-10, 10] degrees. If the fine-tune value is negative, the gimbal will be fine-tuned to the specified number of degrees in the port (left) direction. Only supported by DJI Mavic Air.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_gimbalstate_workmode"><div class="api-col left">Work Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_gimbalstate_workmode_inline">getMode</a></div></div><div class="inline-doc" id="djigimbal_gimbalstate_workmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMode</h6></div>

~~~java
 GimbalMode getMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_mode_key">GimbalKey.MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the gimbal's current work mode.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">GimbalMode</td><td><font color="#666"><i>A <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_workmode">GimbalMode</a></code> enum value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_gimbalstate_ismobiledevicemounted"><div class="api-col left">Check Mobile Device Mounted</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_gimbalstate_ismobiledevicemounted_inline">isMobileDeviceMounted</a></div></div><div class="inline-doc" id="djigimbal_gimbalstate_ismobiledevicemounted_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isMobileDeviceMounted</h6></div>

~~~java
 boolean isMobileDeviceMounted() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_is_mobile_device_mounted_key">GimbalKey.IS_MOBILE_DEVICE_MOUNTED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the mobile device is mounted on the gimbal.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_gimbalstate_ismotoroverloaded"><div class="api-col left">Check Motor Overloaded</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_gimbalstate_ismotoroverloaded_inline">isMotorOverloaded</a></div></div><div class="inline-doc" id="djigimbal_gimbalstate_ismotoroverloaded_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isMotorOverloaded</h6></div>

~~~java
 boolean isMotorOverloaded() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_is_motor_over_loaded_key">GimbalKey.IS_MOTOR_OVER_LOADED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if one of the gimbal motors is overloaded.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Calibration

<div class="api-row" id="djigimbal_gimbalstate_iscalibrationsuccessful"><div class="api-col left">Calibration Succeeded</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_gimbalstate_iscalibrationsuccessful_inline">isCalibrationSuccessful</a></div></div><div class="inline-doc" id="djigimbal_gimbalstate_iscalibrationsuccessful_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isCalibrationSuccessful</h6></div>

~~~java
 boolean isCalibrationSuccessful() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_is_calibration_successful_key">GimbalKey.IS_CALIBRATION_SUCCESSFUL</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the gimbal calibration succeeded.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_gimbalstate_iscalibrating"><div class="api-col left">Calibrate</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_gimbalstate_iscalibrating_inline">isCalibrating</a></div></div><div class="inline-doc" id="djigimbal_gimbalstate_iscalibrating_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isCalibrating</h6></div>

~~~java
 boolean isCalibrating() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_is_calibrating_key">GimbalKey.IS_CALIBRATING</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the gimbal is calibrating.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_gimbalstate_calibrationprogress"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_gimbalstate_calibrationprogress_inline">getCalibrationProgress</a></div></div><div class="inline-doc" id="djigimbal_gimbalstate_calibrationprogress_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCalibrationProgress</h6></div>

~~~java
 int getCalibrationProgress() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_calibration_progress_key">GimbalKey.CALIBRATION_PROGRESS</a></td></tr></table></html>



##### Description:



<font color="#666">Current progress (percentage) for calibration.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Reach Limit

<div class="api-row" id="djigimbal_gimbalstate_ispitchatstop"><div class="api-col left">Pitch Reach Limit</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_gimbalstate_ispitchatstop_inline">isPitchAtStop</a></div></div><div class="inline-doc" id="djigimbal_gimbalstate_ispitchatstop_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isPitchAtStop</h6></div>

~~~java
 boolean isPitchAtStop() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_is_pitch_at_stop_key">GimbalKey.IS_PITCH_AT_STOP</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the gimbal's pitch value is at its limit.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_gimbalstate_isrollatstop"><div class="api-col left">Roll Reach Limit</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_gimbalstate_isrollatstop_inline">isRollAtStop</a></div></div><div class="inline-doc" id="djigimbal_gimbalstate_isrollatstop_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isRollAtStop</h6></div>

~~~java
 boolean isRollAtStop() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_is_roll_at_stop_key">GimbalKey.IS_ROLL_AT_STOP</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the gimbal's roll value is at its limit.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_gimbalstate_isyawatstop"><div class="api-col left">Yaw Reach Limit</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_gimbalstate_isyawatstop_inline">isYawAtStop</a></div></div><div class="inline-doc" id="djigimbal_gimbalstate_isyawatstop_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isYawAtStop</h6></div>

~~~java
 boolean isYawAtStop() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_is_yaw_at_stop_key">GimbalKey.IS_YAW_AT_STOP</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the gimbal's yaw value is at its limit.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Balance

<div class="api-row" id="djigimbal_gimbalstate_istestingbalance"><div class="api-col left">Testing Payload Balance</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_gimbalstate_istestingbalance_inline">isBalanceTesting</a></div></div><div class="inline-doc" id="djigimbal_gimbalstate_istestingbalance_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isBalanceTesting</h6></div>

~~~java
 boolean isBalanceTesting() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_is_testing_balance_key">GimbalKey.IS_TESTING_BALANCE</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the gimbal is currently testing payload balance.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_gimbalstate_pitchtestresult"><div class="api-col left">Pitch Axis Balance Test Result</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_gimbalstate_pitchtestresult_inline">getPitchBalanceTestResult</a></div></div><div class="inline-doc" id="djigimbal_gimbalstate_pitchtestresult_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPitchBalanceTestResult</h6></div>

~~~java
 BalanceTestResult getPitchBalanceTestResult() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_test_result_key">GimbalKey.PITCH_TEST_RESULT</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the pitch axis balance test result.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_balancetestresult">BalanceTestResult</a></td><td><font color="#666"><i>A <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_balancetestresult">BalanceTestResult</a></code> enum value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_gimbalstate_rolltestresult"><div class="api-col left">Roll Axis Balance Test Result</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_gimbalstate_rolltestresult_inline">getRollBalanceTestResult</a></div></div><div class="inline-doc" id="djigimbal_gimbalstate_rolltestresult_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRollBalanceTestResult</h6></div>

~~~java
 BalanceTestResult getRollBalanceTestResult() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_roll_test_result_key">GimbalKey.ROLL_TEST_RESULT</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the roll axis balance test result.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_balancetestresult">BalanceTestResult</a></td><td><font color="#666"><i>A <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_balancetestresult">BalanceTestResult</a></code> enum value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_gimbalstate_balancestate"><div class="api-col left">Gimbal Balance State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_gimbalstate_balancestate_inline">getBalanceState</a></div></div><div class="inline-doc" id="djigimbal_gimbalstate_balancestate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBalanceState</h6></div>

~~~java
 BalanceState getBalanceState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_balance_state_key">GimbalKey.BALANCE_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the balance status of the gimbal.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_loadingbalancestatus">BalanceState</a></td><td><font color="#666"><i>A <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_loadingbalancestatus">BalanceState</a></code> enum value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_gimbalstate_ismountedupwards"><div class="api-col left">Mounted Upwards</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_gimbalstate_ismountedupwards_inline">isMountedUpwards</a></div></div><div class="inline-doc" id="djigimbal_gimbalstate_ismountedupwards_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isMountedUpwards</h6></div>

~~~java
 boolean isMountedUpwards() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the gimbal is mounted upwards on the aircraft. It is only supported by M210 and M210 RTK.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>


