<div class="article"><h1 ><font color="#AAA">class </font>GimbalKey</h1></div>

~~~java
 class GimbalKey extends DJIKey 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/KeyManager/DJIKey.html#djikey">DJIKey</a></code></td></tr></table></html>



##### Description:



<font color="#666"><code><a href="/Components/KeyManager/DJIGimbalKey.html#djigimbalkey">GimbalKey</a></code> is an object providing access to Gimbal attributes.



##### Class Members:

<div class="api-row" id="djigimbalkey_create"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbalkey_create_inline">create</a></div></div><div class="inline-doc" id="djigimbalkey_create_inline"

><div class="article"><h6 ><font color="#AAA">method </font>create</h6></div>

~~~java
 static GimbalKey create(@GimbalParamKey @NonNull String paramKey) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Creates a Gimbal key.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@GimbalParamKey @NonNull String <font color="#000">paramKey</td><td><font color="#666"><i>A valid paramKey.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/KeyManager/DJIGimbalKey.html#djigimbalkey">GimbalKey</a></td><td><font color="#666"><i>Gimbal Key</i></td></tr></table></html></div>



##### Inherited Methods:



##### Class Keys:

<html><table class="key_table"><tr><td colspan=2><a href="#gimbalkey_yaw_right_endpoint_key"></a><p class="key_table_key_string key_table_key_first_row">YAW_RIGHT_ENDPOINT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setendpointindirection">setEndpoint</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getendpointindirection">getEndpoint</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_pitch_controller_smoothing_factor_key"></a><p class="key_table_key_string key_table_key_row">PITCH_CONTROLLER_SMOOTHING_FACTOR</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setcontrollersmoothingonaxis">setControllerSmoothingFactor</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getcontrollersmoothingonaxis">getControllerSmoothingFactor</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_movementSettingsState.html#djigimbal_movementsettingsstate_controllersmoothingpitch">getPitchControllerSmoothingFactor</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_start_balance_detection_key"></a><p class="key_table_key_string key_table_key_row">START_BALANCE_DETECTION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#gimbalkey_is_attitude_reset_key"></a><p class="key_table_key_string key_table_key_row">IS_ATTITUDE_RESET</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#gimbalkey_firmware_version_key"></a><p class="key_table_key_string key_table_key_row">FIRMWARE_VERSION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>String</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#gimbalkey_roll_motor_control_gyro_filtering_factor_key"></a><p class="key_table_key_string key_table_key_row">ROLL_MOTOR_CONTROL_GYRO_FILTERING_FACTOR</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setmotorcontrolgyrofilteringonaxis">setMotorControlGyroFilteringFactor</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getmotorcontrolgyrofilteringonaxis">getMotorControlGyroFilteringFactor</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_rotate_key"></a><p class="key_table_key_string key_table_key_row">ROTATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_rotategimbalwithrotation">rotate</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_DJIGimbalRotation.html#djigimbal_djigimbalrotation">Rotation</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_yaw_motor_control_pre_control_key"></a><p class="key_table_key_string key_table_key_row">YAW_MOTOR_CONTROL_PRE_CONTROL</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setmotorcontrolprecontrolonaxis">setMotorControlPreControl</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getmotorcontrolprecontrolonaxis">getMotorControlPreControl</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_balance_state_key"></a><p class="key_table_key_string key_table_key_row">BALANCE_STATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_GimbalState.html#djigimbal_gimbalstate_balancestate">getBalanceState</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_loadingbalancestatus">BalanceState</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_is_calibrating_key"></a><p class="key_table_key_string key_table_key_row">IS_CALIBRATING</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_GimbalState.html#djigimbal_gimbalstate_iscalibrating">isCalibrating</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_motor_enabled_key"></a><p class="key_table_key_string key_table_key_row">MOTOR_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setmotorenabled">setMotorEnabled</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getmotorenabled">getMotorEnabled</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_yaw_angle_with_aircraft_in_degree_key"></a><p class="key_table_key_string key_table_key_row">YAW_ANGLE_WITH_AIRCRAFT_IN_DEGREE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_GimbalState.html#djigimbal_gimbalstate_yawrelativetoaircraftheading">getYawRelativeToAircraftHeading</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_apply_motor_control_preset_key"></a><p class="key_table_key_string key_table_key_row">APPLY_MOTOR_CONTROL_PRESET</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_motorcontrolpreset">MotorControlPreset</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_configuremotorcontrolwithpreset">applyMotorControlPreset</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_motorcontrolpreset">MotorControlPreset</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_concentricity_check_result_key"></a><p class="key_table_key_string key_table_key_row">CONCENTRICITY_CHECK_RESULT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Gimbal/DJIGimbal_DJIGimbalCoaxialityDetectionState.html#djigimbal_djigimbalcoaxialitydetectionstate">GimbalCoaxialityDetectionState</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#gimbalkey_pitch_smooth_track_deadband_key"></a><p class="key_table_key_string key_table_key_row">PITCH_SMOOTH_TRACK_DEADBAND</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setsmoothtrackdeadbandonaxis">setSmoothTrackDeadband</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getsmoothtrackdeadbandonaxis">getSmoothTrackDeadband</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_movementSettingsState.html#djigimbal_movementsettingsstate_smoothtrackdeadbandpitch">getPitchSmoothTrackDeadband</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_yaw_smooth_track_enabled_key"></a><p class="key_table_key_string key_table_key_row">YAW_SMOOTH_TRACK_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setsmoothtrackenabledonaxis">setSmoothTrackEnabled</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getsmoothtrackenabledonaxis">getSmoothTrackEnabled</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_movementSettingsState.html#djigimbal_movementsettingsstate_issmoothtrackenabledyaw">isYawSmoothTrackEnabled</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_is_motor_over_loaded_key"></a><p class="key_table_key_string key_table_key_row">IS_MOTOR_OVER_LOADED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_GimbalState.html#djigimbal_gimbalstate_ismotoroverloaded">isMotorOverloaded</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_is_gimbal_on_top_key"></a><p class="key_table_key_string key_table_key_row">IS_GIMBAL_ON_TOP</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#gimbalkey_serial_number_key"></a><p class="key_table_key_string key_table_key_row">SERIAL_NUMBER</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>String</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#gimbalkey_fine_tune_roll_in_degrees_key"></a><p class="key_table_key_string key_table_key_row">FINE_TUNE_ROLL_IN_DEGREES</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_finetunegimbalrollindegrees">fineTuneRollInDegrees</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_start_calibration_key"></a><p class="key_table_key_string key_table_key_row">START_CALIBRATION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_startgimbalautocalibration">startCalibration</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_is_yaw_at_stop_key"></a><p class="key_table_key_string key_table_key_row">IS_YAW_AT_STOP</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_GimbalState.html#djigimbal_gimbalstate_isyawatstop">isYawAtStop</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_toggle_selfie_key"></a><p class="key_table_key_string key_table_key_row">TOGGLE_SELFIE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_togglegimbalselfie">toggleSelfie</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_roll_motor_control_pre_control_key"></a><p class="key_table_key_string key_table_key_row">ROLL_MOTOR_CONTROL_PRE_CONTROL</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setmotorcontrolprecontrolonaxis">setMotorControlPreControl</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getmotorcontrolprecontrolonaxis">getMotorControlPreControl</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_pitch_down_endpoint_key"></a><p class="key_table_key_string key_table_key_row">PITCH_DOWN_ENDPOINT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setendpointindirection">setEndpoint</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_pitch_motor_control_gyro_filtering_factor_key"></a><p class="key_table_key_string key_table_key_row">PITCH_MOTOR_CONTROL_GYRO_FILTERING_FACTOR</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setmotorcontrolgyrofilteringonaxis">setMotorControlGyroFilteringFactor</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getmotorcontrolgyrofilteringonaxis">getMotorControlGyroFilteringFactor</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_mode_key"></a><p class="key_table_key_string key_table_key_row">MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>GimbalMode</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setgimbalworkmode">setMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_GimbalState.html#djigimbal_gimbalstate_workmode">getMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_workmode">GimbalMode</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_is_testing_balance_key"></a><p class="key_table_key_string key_table_key_row">IS_TESTING_BALANCE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_GimbalState.html#djigimbal_gimbalstate_istestingbalance">isBalanceTesting</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_yaw_controller_deadband_key"></a><p class="key_table_key_string key_table_key_row">YAW_CONTROLLER_DEADBAND</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setcontrollerdeadbandonaxis">setControllerDeadband</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getcontrollerdeadbandonaxis">getControllerDeadband</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_yaw_left_endpoint_key"></a><p class="key_table_key_string key_table_key_row">YAW_LEFT_ENDPOINT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setendpointindirection">setEndpoint</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getendpointindirection">getEndpoint</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_capabilities_key"></a><p class="key_table_key_string key_table_key_row">CAPABILITIES</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Map</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_yaw_controller_smoothing_factor_key"></a><p class="key_table_key_string key_table_key_row">YAW_CONTROLLER_SMOOTHING_FACTOR</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setcontrollersmoothingonaxis">setControllerSmoothingFactor</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getcontrollersmoothingonaxis">getControllerSmoothingFactor</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_movementSettingsState.html#djigimbal_movementsettingsstate_controllersmoothingyaw">getYawControllerSmoothingFactor</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_stiffness_self_tuning_result_key"></a><p class="key_table_key_string key_table_key_row">STIFFNESS_SELF_TUNING_RESULT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Gimbal/DJIGimbal_DJIGimbalControlParametersAutoTuningState.html#djigimbal_djigimbalcontrolparametersautotuningstate">GimbalControlParametersAutoTuningState</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#gimbalkey_roll_motor_control_stiffness_key"></a><p class="key_table_key_string key_table_key_row">ROLL_MOTOR_CONTROL_STIFFNESS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setmotorcontrolstiffnessonaxis">setMotorControlStiffness</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getmotorcontrolstiffnessonaxis">getMotorControlStiffness</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_reset_gimbal_yaw_key"></a><p class="key_table_key_string key_table_key_row">RESET_GIMBAL_YAW</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#gimbalkey_movement_settings_profile_key"></a><p class="key_table_key_string key_table_key_row">MOVEMENT_SETTINGS_PROFILE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_movementsettingsprofile">MovementSettingsProfile</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setmovementsettingsprofile">setMovementSettingsProfile</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getmovementsettingsprofile">getMovementSettingsProfile</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_movementSettingsState.html#djigimbal_movementsettingsstate_profile">getProfile</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_movementsettingsprofile">MovementSettingsProfile</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_roll_fine_tune_in_degrees_key"></a><p class="key_table_key_string key_table_key_row">ROLL_FINE_TUNE_IN_DEGREES</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_GimbalState.html#djigimbal_gimbalstate_rollfinetuneindegrees">getRollFineTuneInDegrees</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_pitch_motor_control_strength_key"></a><p class="key_table_key_string key_table_key_row">PITCH_MOTOR_CONTROL_STRENGTH</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setmotorcontrolstrengthonaxis">setMotorControlStrength</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getmotorcontrolstrengthonaxis">getMotorControlStrength</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_yaw_smooth_track_speed_key"></a><p class="key_table_key_string key_table_key_row">YAW_SMOOTH_TRACK_SPEED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setsmoothtrackspeedonaxis">setSmoothTrackSpeed</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getsmoothtrackspeedonaxis">getSmoothTrackSpeed</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_movementSettingsState.html#djigimbal_movementsettingsstate_smoothtrackspeedyaw">getYawSmoothTrackSpeed</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_calibration_progress_key"></a><p class="key_table_key_string key_table_key_row">CALIBRATION_PROGRESS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_GimbalState.html#djigimbal_gimbalstate_calibrationprogress">getCalibrationProgress</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_start_control_parameters_auto_tuning_key"></a><p class="key_table_key_string key_table_key_row">START_CONTROL_PARAMETERS_AUTO_TUNING</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#gimbalkey_yaw_inverted_control_enabled_key"></a><p class="key_table_key_string key_table_key_row">YAW_INVERTED_CONTROL_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setinvertedcontrolenabled">setInvertedControlEnabled</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getinvertedcontrolenabled">getInvertedControlEnabled</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_pitch_motor_control_pre_control_key"></a><p class="key_table_key_string key_table_key_row">PITCH_MOTOR_CONTROL_PRE_CONTROL</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setmotorcontrolprecontrolonaxis">setMotorControlPreControl</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getmotorcontrolprecontrolonaxis">getMotorControlPreControl</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_roll_test_result_key"></a><p class="key_table_key_string key_table_key_row">ROLL_TEST_RESULT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_balancetestresult">BalanceTestResult</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_GimbalState.html#djigimbal_gimbalstate_rolltestresult">getRollBalanceTestResult</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_balancetestresult">BalanceTestResult</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_is_stuck_key"></a><p class="key_table_key_string key_table_key_row">IS_STUCK</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#gimbalkey_pitch_controller_deadband_key"></a><p class="key_table_key_string key_table_key_row">PITCH_CONTROLLER_DEADBAND</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setcontrollerdeadbandonaxis">setControllerDeadband</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getcontrollerdeadbandonaxis">getControllerDeadband</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_gimbal_attitude_synchronization_enabled_key"></a><p class="key_table_key_string key_table_key_row">GIMBAL_ATTITUDE_SYNCHRONIZATION_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#gimbalkey_fine_tune_pitch_in_degrees_key"></a><p class="key_table_key_string key_table_key_row">FINE_TUNE_PITCH_IN_DEGREES</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#gimbalkey_pitch_controller_speed_coefficient_key"></a><p class="key_table_key_string key_table_key_row">PITCH_CONTROLLER_SPEED_COEFFICIENT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setcontrollerspeedonaxis">setControllerSpeedCoefficient</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getcontrollerspeedonaxis">getControllerSpeedCoefficient</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_movementSettingsState.html#djigimbal_movementsettingsstate_controllerspeedpitch">getPitchControllerSpeedCoefficient</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_reset_gimbal_with_parameters_key"></a><p class="key_table_key_string key_table_key_row">RESET_GIMBAL_WITH_PARAMETERS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#gimbalkey_start_concentricity_detection_key"></a><p class="key_table_key_string key_table_key_row">START_CONCENTRICITY_DETECTION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#gimbalkey_start_balance_test_key"></a><p class="key_table_key_string key_table_key_row">START_BALANCE_TEST</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_startgimbalbalancetest">startBalanceTest</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_controller_mode_key"></a><p class="key_table_key_string key_table_key_row">CONTROLLER_MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/HandheldController/DJIHandheldController.html#djihandheldcontroller_djihandheldcontrollerstickcontrolmode">ControllerMode</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setcontrollermode">setControllerMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getcontrollermode">getControllerMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/HandheldController/DJIHandheldController.html#djihandheldcontroller_djihandheldcontrollerstickcontrolmode">ControllerMode</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_pitch_range_extension_enabled_key"></a><p class="key_table_key_string key_table_key_row">PITCH_RANGE_EXTENSION_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setpitchrangeextensionenabled">setPitchRangeExtensionEnabled</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getpitchrangeextensionenabled">getPitchRangeExtensionEnabled</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_is_roll_at_stop_key"></a><p class="key_table_key_string key_table_key_row">IS_ROLL_AT_STOP</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_GimbalState.html#djigimbal_gimbalstate_isrollatstop">isRollAtStop</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_balance_check_result_key"></a><p class="key_table_key_string key_table_key_row">BALANCE_CHECK_RESULT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Gimbal/DJIGimbal_DJIGimbalBalanceDetectionState.html#djigimbal_djigimbalbalancedetectionstate">GimbalBalanceDetectionState</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#gimbalkey_connection_key"></a><p class="key_table_key_string key_table_key_row">CONNECTION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#gimbalkey_is_pitch_at_stop_key"></a><p class="key_table_key_string key_table_key_row">IS_PITCH_AT_STOP</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_GimbalState.html#djigimbal_gimbalstate_ispitchatstop">isPitchAtStop</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_display_name_key"></a><p class="key_table_key_string key_table_key_row">DISPLAY_NAME</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>String</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#gimbalkey_fine_tune_yaw_in_degrees_key"></a><p class="key_table_key_string key_table_key_row">FINE_TUNE_YAW_IN_DEGREES</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#gimbalkey_pitch_up_endpoint_key"></a><p class="key_table_key_string key_table_key_row">PITCH_UP_ENDPOINT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setendpointindirection">setEndpoint</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getendpointindirection">getEndpoint</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_stop_balance_detection_key"></a><p class="key_table_key_string key_table_key_row">STOP_BALANCE_DETECTION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#gimbalkey_yaw_motor_control_gyro_filtering_factor_key"></a><p class="key_table_key_string key_table_key_row">YAW_MOTOR_CONTROL_GYRO_FILTERING_FACTOR</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setmotorcontrolgyrofilteringonaxis">setMotorControlGyroFilteringFactor</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getmotorcontrolgyrofilteringonaxis">getMotorControlGyroFilteringFactor</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_roll_motor_control_strength_key"></a><p class="key_table_key_string key_table_key_row">ROLL_MOTOR_CONTROL_STRENGTH</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setmotorcontrolstrengthonaxis">setMotorControlStrength</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getmotorcontrolstrengthonaxis">getMotorControlStrength</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_pitch_fine_tune_in_degrees_key"></a><p class="key_table_key_string key_table_key_row">PITCH_FINE_TUNE_IN_DEGREES</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#gimbalkey_pitch_inverted_control_enabled_key"></a><p class="key_table_key_string key_table_key_row">PITCH_INVERTED_CONTROL_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setinvertedcontrolenabled">setInvertedControlEnabled</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getinvertedcontrolenabled">getInvertedControlEnabled</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_stop_control_parameters_auto_tuning_key"></a><p class="key_table_key_string key_table_key_row">STOP_CONTROL_PARAMETERS_AUTO_TUNING</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#gimbalkey_pitch_test_result_key"></a><p class="key_table_key_string key_table_key_row">PITCH_TEST_RESULT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_balancetestresult">BalanceTestResult</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_GimbalState.html#djigimbal_gimbalstate_pitchtestresult">getPitchBalanceTestResult</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_balancetestresult">BalanceTestResult</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_yaw_smooth_track_deadband_key"></a><p class="key_table_key_string key_table_key_row">YAW_SMOOTH_TRACK_DEADBAND</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setsmoothtrackdeadbandonaxis">setSmoothTrackDeadband</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getsmoothtrackdeadbandonaxis">getSmoothTrackDeadband</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_movementSettingsState.html#djigimbal_movementsettingsstate_smoothtrackdeadbandyaw">getYawSmoothTrackDeadband</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_yaw_fine_tune_in_degrees_key"></a><p class="key_table_key_string key_table_key_row">YAW_FINE_TUNE_IN_DEGREES</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#gimbalkey_yaw_motor_control_strength_key"></a><p class="key_table_key_string key_table_key_row">YAW_MOTOR_CONTROL_STRENGTH</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setmotorcontrolstrengthonaxis">setMotorControlStrength</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getmotorcontrolstrengthonaxis">getMotorControlStrength</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_is_mobile_device_mounted_key"></a><p class="key_table_key_string key_table_key_row">IS_MOBILE_DEVICE_MOUNTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_GimbalState.html#djigimbal_gimbalstate_ismobiledevicemounted">isMobileDeviceMounted</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_reset_gimbal_key"></a><p class="key_table_key_string key_table_key_row">RESET_GIMBAL</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_resetgimbal">reset</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_yaw_motor_control_stiffness_key"></a><p class="key_table_key_string key_table_key_row">YAW_MOTOR_CONTROL_STIFFNESS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setmotorcontrolstiffnessonaxis">setMotorControlStiffness</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getmotorcontrolstiffnessonaxis">getMotorControlStiffness</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_yaw_controller_speed_coefficient_key"></a><p class="key_table_key_string key_table_key_row">YAW_CONTROLLER_SPEED_COEFFICIENT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setcontrollerspeedonaxis">setControllerSpeedCoefficient</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getcontrollerspeedonaxis">getControllerSpeedCoefficient</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_movementSettingsState.html#djigimbal_movementsettingsstate_controllerspeedyaw">getYawControllerSpeedCoefficient</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_yaw_smooth_track_acceleration_key"></a><p class="key_table_key_string key_table_key_row">YAW_SMOOTH_TRACK_ACCELERATION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setsmoothtrackaccelerationonaxis">setSmoothTrackAcceleration</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getsmoothtrackaccelerationonaxis">getSmoothTrackAcceleration</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_movementSettingsState.html#djigimbal_movementsettingsstate_smoothtrackaccelerationyaw">getYawSmoothTrackAcceleration</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_is_calibration_successful_key"></a><p class="key_table_key_string key_table_key_row">IS_CALIBRATION_SUCCESSFUL</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_GimbalState.html#djigimbal_gimbalstate_iscalibrationsuccessful">isCalibrationSuccessful</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_restore_factory_settings_key"></a><p class="key_table_key_string key_table_key_row">RESTORE_FACTORY_SETTINGS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_loadfactorysettings">restoreFactorySettings</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_pitch_smooth_track_enabled_key"></a><p class="key_table_key_string key_table_key_row">PITCH_SMOOTH_TRACK_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setsmoothtrackenabledonaxis">setSmoothTrackEnabled</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getsmoothtrackenabledonaxis">getSmoothTrackEnabled</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_movementSettingsState.html#djigimbal_movementsettingsstate_issmoothtrackenabledpitch">isPitchSmoothTrackEnabled</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_pitch_smooth_track_speed_key"></a><p class="key_table_key_string key_table_key_row">PITCH_SMOOTH_TRACK_SPEED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setsmoothtrackspeedonaxis">setSmoothTrackSpeed</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getsmoothtrackspeedonaxis">getSmoothTrackSpeed</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_movementSettingsState.html#djigimbal_movementsettingsstate_smoothtrackspeedpitch">getPitchSmoothTrackSpeed</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_stop_concentricity_detection_key"></a><p class="key_table_key_string key_table_key_row">STOP_CONCENTRICITY_DETECTION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#gimbalkey_attitude_in_degrees_key"></a><p class="key_table_key_string key_table_key_row">ATTITUDE_IN_DEGREES</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Attitude</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_GimbalState.html#djigimbal_gimbalstate_attitude">getAttitudeInDegrees</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_attitude.html#djigimbal_attitude">Attitude</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_yaw_simultaneous_follow_enabled_key"></a><p class="key_table_key_string key_table_key_row">YAW_SIMULTANEOUS_FOLLOW_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#gimbalkey_pitch_smooth_track_acceleration_key"></a><p class="key_table_key_string key_table_key_row">PITCH_SMOOTH_TRACK_ACCELERATION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setsmoothtrackaccelerationonaxis">setSmoothTrackAcceleration</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getsmoothtrackaccelerationonaxis">getSmoothTrackAcceleration</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal_movementSettingsState.html#djigimbal_movementsettingsstate_smoothtrackaccelerationpitch">getPitchSmoothTrackAcceleration</a></code>

</p></td></tr><tr><td colspan=2><a href="#gimbalkey_reset_control_parameters_key"></a><p class="key_table_key_string key_table_key_row">RESET_CONTROL_PARAMETERS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#gimbalkey_pitch_motor_control_stiffness_key"></a><p class="key_table_key_string key_table_key_row">PITCH_MOTOR_CONTROL_STIFFNESS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_setmotorcontrolstiffnessonaxis">setMotorControlStiffness</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_getmotorcontrolstiffnessonaxis">getMotorControlStiffness</a></code>

</p></td></tr></table></html>
