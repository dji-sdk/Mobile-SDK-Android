<div class="article"><h1 ><font color="#AAA">class </font>DJIDiagnostics</h1></div>

~~~java
 class DJIDiagnostics 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Product Diagnostics.



##### Class Members:

<div class="api-row" id="djidiagnostics_type"><div class="api-col left">Type</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djidiagnostics_type_inline">getType</a></div></div><div class="inline-doc" id="djidiagnostics_type_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getType</h6></div>

~~~java
 DJIDiagnosticsType getType() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Gets diagnostics type.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Diagnostics/DJIDiagnostics.html#djidiagnostics_djidiagnosticstype">DJIDiagnosticsType</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Diagnostics/DJIDiagnostics.html#djidiagnostics_djidiagnosticstype">DJIDiagnosticsType</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djidiagnostics_code"><div class="api-col left">Error Code</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djidiagnostics_code_inline">getCode</a></div></div><div class="inline-doc" id="djidiagnostics_code_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCode</h6></div>

~~~java
 int getCode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Get diagnostics error code. 



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Diagnostics error code.</i></td></tr></table></html></div>

<div class="api-row" id="djidiagnostics_reason"><div class="api-col left">Reason for the Error</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djidiagnostics_reason_inline">getReason</a></div></div><div class="inline-doc" id="djidiagnostics_reason_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getReason</h6></div>

~~~java
 String getReason() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">The reason of the error.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>Reason of the error.</i></td></tr></table></html></div>

<div class="api-row" id="djidiagnostics_solution"><div class="api-col left">Solution for the Error</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djidiagnostics_solution_inline">getSolution</a></div></div><div class="inline-doc" id="djidiagnostics_solution_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSolution</h6></div>

~~~java
 String getSolution() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">The suggested solution for the error.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>The suggest solution for the error.</i></td></tr></table></html></div>

<div class="api-row" id="djidiagnostics_healthinformation"><div class="api-col left">Health Information</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djidiagnostics_healthinformation_inline">getHealthInformation</a></div></div><div class="inline-doc" id="djidiagnostics_healthinformation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHealthInformation</h6></div>

~~~java
 @Nullable DeviceHealthInformation getHealthInformation() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">The device healthy information, only available when the component is <code>DJIDiagnostics_DJIDiagnosticsWarningComponent_DeviceHealthInformation</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Diagnostics/DJIDiagnostics_DJIDiagnosticsDeviceHealthInformation.html#djidiagnostics_djidiagnosticsdevicehealthinformation">DeviceHealthInformation</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Diagnostics/DJIDiagnostics_DJIDiagnosticsDeviceHealthInformation.html#djidiagnostics_djidiagnosticsdevicehealthinformation">DeviceHealthInformation</a></code>.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djidiagnostics_djidiagnosticserror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djidiagnostics_djidiagnosticserror_inline">DJIDiagnosticsError</a></div></div><div class="inline-doc" id="djidiagnostics_djidiagnosticserror_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>DJIDiagnosticsError</h6></div>

~~~java
 enum DJIDiagnosticsError 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.internal.diagnostics</td></tr></table></html>



##### Description:



<font color="#666">DJIDiagnosticsError.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_cameraupgradeerror_inline"></a>CAMERA_UPGRADE_ERROR</td><td><font color="#666">Camera upgrade error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_camerasensorerror_inline"></a>CAMERA_SENSOR_ERROR</td><td><font color="#666">Camera sensor error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_cameraoverheat_inline"></a>CAMERA_OVER_HEAT</td><td><font color="#666">Camera is overheated.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_cameraencryptionerror_inline"></a>CAMERA_ENCRYPTION_ERROR</td><td><font color="#666">Camera encryption error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_cameranosdcard_inline"></a>CAMERA_NO_SD_CARD</td><td><font color="#666">NO SD card.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_camerasdcarderror_inline"></a>CAMERA_SD_CARD_ERROR</td><td><font color="#666">SD card error. For more detail, please refer to the reason and the solution.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_camerasdcardnospace_inline"></a>CAMERA_SD_CARD_NO_SPACE</td><td><font color="#666">Remaining SD card capacity is not enough.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_camerasdcardfull_inline"></a>CAMERA_SD_CARD_FULL</td><td><font color="#666">SD card is full.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_camerasdcardreadonly_inline"></a>CAMERA_SD_CARD_READ_ONLY</td><td><font color="#666">SD card is readonly.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_camerasdcardnotformatted_inline"></a>CAMERA_SD_CARD_NOT_FORMATTED</td><td><font color="#666">SD card not formatted.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_chipoverheat_inline"></a>CAMERA_CHIP_OVER_HEAT</td><td><font color="#666">Chip Over Heat.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_temperaturestoohightostoprecord_inline"></a>CAMERA_TemperaturesTooHighToStopRecord</td><td><font color="#666">Temperatures Too High To Stop Record.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_gimbalgyroscopeerror_inline"></a>GIMBAL_GYROSCOPE_ERROR</td><td><font color="#666">Gimbal gyroscope error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_gimbalpitcherror_inline"></a>GIMBAL_PITCH_ERROR</td><td><font color="#666">Gimbal pitch error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_gimbalrollerror_inline"></a>GIMBAL_ROLL_ERROR</td><td><font color="#666">Gimbal roll error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_gimbalyawerror_inline"></a>GIMBAL_YAW_ERROR</td><td><font color="#666">Gimbal yaw error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_gimbalconnecttofcerror_inline"></a>GIMBAL_CONNECT_TO_FC_ERROR</td><td><font color="#666">Gimbal cannot receive flight controller data.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_batterydischargeovercurrent_inline"></a>BATTERY_DISCHARGE_OVER_CURRENT</td><td><font color="#666">Battery current too high during discharge.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_batterydischargeoverheat_inline"></a>BATTERY_DISCHARGE_OVER_HEAT</td><td><font color="#666">Battery too hot during discharge.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_batterylowtemperature_inline"></a>BATTERY_LOW_TEMPERATURE</td><td><font color="#666">Low temperature environment: Battery not suitable for flight.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_batterycellbroken_inline"></a>BATTERY_CELL_BROKEN</td><td><font color="#666">Battery cell is broken.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_batteryneedstudy_inline"></a>BATTERY_NEED_STUDY</td><td><font color="#666">Battery needs a complete charge and discharge cycle.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_batteryillegal_inline"></a>BATTERY_ILLEGAL</td><td><font color="#666">Battery is not a DJI battery.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_singlebatterymode_inline"></a>SINGLE_BATTERY_MODE</td><td><font color="#666">Battery is in single battery mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_fakebatterymode_inline"></a>FAKE_BATTERY_MODE</td><td><font color="#666">Battery is in fake battery mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_cycletimeover_inline"></a>BATTERY_CYCLE_TIME_OVER</td><td><font color="#666">Battery's cycle times is over</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_diffusage_inline"></a>BATTERY_DIFF_USAGE</td><td><font color="#666">Old battery and new battery.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_overload_inline"></a>BATTERY_OVER_LOAD</td><td><font color="#666">Overload.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_lowvoltage_inline"></a>BATTERY_LOW_VOLTAGE</td><td><font color="#666">Battery voltage is low.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_dangerouswarningserious_inline"></a>BATTERY_DANGEROUS_WARNING_SERIOUS</td><td><font color="#666">Dangerous Warning Serious.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_communicationfailed_inline"></a>BATTERY_COMMUNICATION_FAIL</td><td><font color="#666">Battery communication failed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_shortcut_inline"></a>BATTERY_SHORT_CUT</td><td><font color="#666">Battery short-circuit.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_remotecontrollerfpgaerror_inline"></a>REMOTE_CONTROLLER_FPGA_ERROR</td><td><font color="#666">RC FPGA error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_remotecontrollertransmittererror_inline"></a>REMOTE_CONTROLLER_TRANSMITTER_ERROR</td><td><font color="#666">RC transmitter error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_remotecontrollerbatteryerror_inline"></a>REMOTE_CONTROLLER_BATTERY_ERROR</td><td><font color="#666">RC battery error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_remotecontrollergpserror_inline"></a>REMOTE_CONTROLLER_GPS_ERROR</td><td><font color="#666">RC GPS error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_remotecontrollerencryptionerror_inline"></a>REMOTE_CONTROLLER_ENCRYPTION_ERROR</td><td><font color="#666">RC encryption error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_remotecontrollerneedcalibration_inline"></a>REMOTE_CONTROLLER_NEED_CALIBRATION</td><td><font color="#666">RC is not calibrated.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_remotecontrollerbatterylow_inline"></a>REMOTE_CONTROLLER_BATTERY_LOW</td><td><font color="#666">RC battery low.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_remotecontrolleridletoolong_inline"></a>REMOTE_CONTROLLER_IDLE_TOO_LONG</td><td><font color="#666">RC idle for too long.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_remotecontrollerreset_inline"></a>REMOTE_CONTROLLER_RESET</td><td><font color="#666">RC is reset, please check RC settings</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_remotecontrolleroverheat_inline"></a>REMOTE_CONTROLLER_OVER_HEAT</td><td><font color="#666">RC overheated.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_centralboardconnecttobatteryerror_inline"></a>CENTRAL_BOARD_CONNECT_TO_BATTERY_ERROR</td><td><font color="#666">Battery connection to the center board has failed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_centralboardconnecttogpserror_inline"></a>CENTRAL_BOARD_CONNECT_TO_GPS_ERROR</td><td><font color="#666">GPS connection to the center board has failed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_centralboardconnecttofcerror_inline"></a>CENTRAL_BOARD_CONNECT_TO_FC_ERROR</td><td><font color="#666">Flight controller connection to the center board has failed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_videodecoderencryptionerror_inline"></a>VIDEO_DECODER_ENCRYPTION_ERROR</td><td><font color="#666">Video decoder encryption error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_videodecoderconnecttodeserializererror_inline"></a>VIDEO_DECODER_CONNECT_TO_DESERIALIZER_ERROR</td><td><font color="#666">Deserializer disconnected.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_airencodererror_inline"></a>AIR_ENCODER_ERROR</td><td><font color="#666">Aircraft Encoder Error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_airencoderupgrade_inline"></a>AIR_ENCODER_UPGRADE</td><td><font color="#666">Aircraft updating.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_nosignal_inline"></a>AIR_LINK_NO_SIGNAL</td><td><font color="#666">No Signal.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_lowrcsignal_inline"></a>AIR_LINK_LOW_RC_SIGNAL</td><td><font color="#666">Low RC Signal.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_strongrcradiosignalnoise_inline"></a>AIR_LINK_STRONG_RC_RADIO_SIGNAL_NOISE</td><td><font color="#666">Strong RC Radio Signal Noise.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_lowradiosignal_inline"></a>AIR_LINK_LOW_RADIO_SIGNAL</td><td><font color="#666">Low Radio Signal.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_strongradiosignalnoise_inline"></a>AIR_LINK_STRONG_RADIO_SIGNAL_NOISE</td><td><font color="#666">Strong Radio Signal Noise.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_wifimagneticinterferencehigh_inline"></a>AIR_LINK_WIFI_MAGNETIC_INTERFERENCE_HIGH</td><td><font color="#666">WiFi Magnetic Interference High.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_flightcontrollerimuneedcalibration_inline"></a>FLIGHT_CONTROLLER_IMU_NEED_CALIBRATION</td><td><font color="#666">IMU calibration required.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_flightcontrollerimucalibrationincomplete_inline"></a>FLIGHT_CONTROLLER_IMU_CALIBRATION_INCOMPLETE</td><td><font color="#666">IMU calibration incomplete.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_flightcontrollerimudataerror_inline"></a>FLIGHT_CONTROLLER_IMU_DATA_ERROR</td><td><font color="#666">IMU data error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_flightcontrollerimuerror_inline"></a>FLIGHT_CONTROLLER_IMU_ERROR</td><td><font color="#666">General IMU error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_flightcontrollerimuinitfailed_inline"></a>FLIGHT_CONTROLLER_IMU_INIT_FAILED</td><td><font color="#666">IMU initialization failed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_flightcontrollerbarometerinitfailed_inline"></a>FLIGHT_CONTROLLER_BAROMETER_INIT_FAILED</td><td><font color="#666">Barometer initialization failed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_flightcontrollerbarometererror_inline"></a>FLIGHT_CONTROLLER_BAROMETER_ERROR</td><td><font color="#666">Barometer error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_flightcontrolleraccelerometerinitfailed_inline"></a>FLIGHT_CONTROLLER_ACCELEROMETER_INIT_FAILED</td><td><font color="#666">Accelerometer failed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_flightcontrollergyroscopeerror_inline"></a>FLIGHT_CONTROLLER_GYROSCOPE_ERROR</td><td><font color="#666">Gyroscope error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_flightcontrollerattitudeerror_inline"></a>FLIGHT_CONTROLLER_ATTITUDE_ERROR</td><td><font color="#666">Aircraft attitude angle is too large.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_flightcontrollerdatarecorderror_inline"></a>FLIGHT_CONTROLLER_DATA_RECORD_ERROR</td><td><font color="#666">Data recorder errors.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_flightcontrollertakeofffailed_inline"></a>FLIGHT_CONTROLLER_TAKEOFF_FAILED</td><td><font color="#666">Take-off failure.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_flightcontrollersystemerror_inline"></a>FLIGHT_CONTROLLER_SYSTEM_ERROR</td><td><font color="#666">Unknown flight controller error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_flightcontrollerimuheating_inline"></a>FLIGHT_CONTROLLER_IMU_HEATING</td><td><font color="#666">Imu is heating.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_flightcontrollercompassneedrestart_inline"></a>FLIGHT_CONTROLLER_COMPASS_NEED_RESTART</td><td><font color="#666">Compass needs restart.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_flightcontrollercompassabnormal_inline"></a>FLIGHT_CONTROLLER_COMPASS_ABNORMAL</td><td><font color="#666">Compass abnormal.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_flightcontrollerusingwrongpropellers_inline"></a>FLIGHT_CONTROLLER_USING_WRONG_PROPELLERS</td><td><font color="#666">Using the wrong propellers. Inspire 2 has propellers for high  altitudes and low altitudes. This error will be present when the  wrong propellers are being used at the wrong altitude.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_visionsystemneedcalibration_inline"></a>VISION_SYSTEM_NEED_CALIBRATION</td><td><font color="#666">Vision system calibration is required.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_visionpropellerguard_inline"></a>VISION_PROPELLER_GUARD</td><td><font color="#666">Propeller Guard Mounted.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_visionsensorerror_inline"></a>VISION_SENSOR_ERROR</td><td><font color="#666">Vision sensor error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_visionsensorcalibrationerror_inline"></a>VISION_SENSOR_CALIBRATION_ERROR</td><td><font color="#666">Vision sensor calibration error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_visionsensorcommunicationerror_inline"></a>VISION_SENSOR_COMMUNICATION_ERROR</td><td><font color="#666">Vision sensor communication error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_visionsystemerror_inline"></a>VISION_SYSTEM_ERROR</td><td><font color="#666">Vision system error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_gimballocateerror_inline"></a>GIMBAL_LOCATE_ERROR</td><td><font color="#666">Gimbal locate error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_rtkpositioningerror_inline"></a>RTK_POSITIONING_ERROR</td><td><font color="#666">RTK Positioning error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_rtkorienteeringerror_inline"></a>RTK_ORIENTEERING_ERROR</td><td><font color="#666">RTK Orienteering error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_weakambientlight_inline"></a>VISION_WEAK_AMBIENT_LIGHT</td><td><font color="#666">Weak Ambient Light error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_mcreadingdata_inline"></a>FLIGHT_CONTROLLER_MC_READING_DATA</td><td><font color="#666">MC is reading flight data.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_mcdataerror_inline"></a>FLIGHT_CONTROLLER_MC_DATA_ERROR</td><td><font color="#666">MC data error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_notinposition_inline"></a>FLIGHT_CONTROLLER_BATTERY_NOT_IN_POSITION</td><td><font color="#666">Not in Position error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_notenoughforce_inline"></a>FLIGHT_CONTROLLER_NOT_ENOUGH_FORCE</td><td><font color="#666">Aircraft has not enough force.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_gohomefailed_inline"></a>REMOTE_CONTROLLER_GO_HOME_FAIL</td><td><font color="#666">Go home failed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_outofcontrolgoinghome_inline"></a>FLIGHT_CONTROLLER_OUT_OF_CONTROL_GOING_HOME</td><td><font color="#666">Out Of Control Going Home.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_gpserror_inline"></a>FLIGHT_CONTROLLER_GPS_ERROR</td><td><font color="#666">Aircraft GPS Error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_compassinstallerror_inline"></a>FLIGHT_CONTROLLER_COMPASS_INSTALL_ERROR</td><td><font color="#666">Compass Install Error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_onlysupportattimode_inline"></a>FLIGHT_CONTROLLER_ONLY_SUPPORT_ATTI_MODE</td><td><font color="#666">Only Support Atti Mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_watersurfacewarning_inline"></a>FLIGHT_CONTROLLER_WATER_SURFACE_WARNING</td><td><font color="#666">Water Surface Warning.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_kernelboardhightemperature_inline"></a>FLIGHT_CONTROLLER_KERNEL_BOARD_HIGH_TEMPERATURE</td><td><font color="#666">Kernel Board High Temperature.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_enableneargroundalert_inline"></a>FLIGHT_CONTROLLER_ENABLE_NEAR_GROUND_ALERT</td><td><font color="#666">Enable Near Ground Alert.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_headingcontrolabnormal_inline"></a>FLIGHT_CONTROLLER_HEADING_CONTROL_ABNORMAL</td><td><font color="#666">Heading Control Abnormal.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_tiltcontrolabnormal_inline"></a>FLIGHT_CONTROLLER_TILT_CONTROL_ABNORMAL</td><td><font color="#666">Tilt Control Abnormal.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_aircraftvibrationabnormal_inline"></a>FLIGHT_CONTROLLER_AIRCRAFT_VIBRATION_ABNORMAL</td><td><font color="#666">Aircraft Vibration Abnormal.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_paddlehasiceonit_inline"></a>FLIGHT_CONTROLLER_PADDLE_HAS_ICE_ON_IT</td><td><font color="#666">Paddle Has Ice On It.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_gpssignalblockedbygimbal_inline"></a>FLIGHT_CONTROLLER_GPS_SIGNAL_BLOCKED_BY_GIMBAL</td><td><font color="#666">GPS Signal Blocked By Gimbal.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_motorblocked_inline"></a>FLIGHT_CONTROLLER_MOTOR_BLOCKED</td><td><font color="#666">Motor Blocked.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_smartlowpowergohome_inline"></a>FLIGHT_CONTROLLER_SMART_LOW_POWER_GO_HOME</td><td><font color="#666">Smart Low Power Go Home.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_overheatgohome_inline"></a>FLIGHT_CONTROLLER_OVER_HEAT_GO_HOME</td><td><font color="#666">Over Heat Go Home.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_outofflightradiuslimit_inline"></a>FLIGHT_CONTROLLER_OUT_OF_FLIGHT_RADIUS_LIMIT</td><td><font color="#666">Out Of Flight Radius Limit.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_lowvoltagegoinghome_inline"></a>FLIGHT_CONTROLLER_LOW_VOLTAGE_GOING_HOME</td><td><font color="#666">Low Voltage GoingHome.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_lowvoltagelanding_inline"></a>FLIGHT_CONTROLLER_LOW_VOLTAGE_LANDING</td><td><font color="#666">Low Voltage Landing.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_heightlimitreasonnogps_inline"></a>FLIGHT_CONTROLLER_HEIGHT_LIMIT_REASON_NO_GPS</td><td><font color="#666">Height Limit Reason No GPS.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_heightlimitreasoncompassinterrupt_inline"></a>FLIGHT_CONTROLLER_HEIGHT_LIMIT_REASON_COMPASS_INTERRUPT</td><td><font color="#666">Height Limit Reason Compass Interrupt.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_envstatetemptoohigh_inline"></a>FLIGHT_CONTROLLER_ENV_STATE_TEMP_TOO_HIGH</td><td><font color="#666">Env State Temp Too High.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_envstatetemptoolow_inline"></a>FLIGHT_CONTROLLER_ENV_STATE_TEMP_TOO_LOW</td><td><font color="#666">Env State Temp Too Low.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_coverflightenablelimit_inline"></a>FLIGHT_CONTROLLER_COVER_FLIGHT_ENABLE_LIMIT</td><td><font color="#666">Cover Flight Enable Limit.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_motorstopforescshortcircuit_inline"></a>FLIGHT_CONTROLLER_MOTOR_STOP_FOR_ESC_SHORT_CIRCUIT</td><td><font color="#666">Motor Stop For Esc Short Circuit.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_norealnameheightlimit_inline"></a>FLIGHT_CONTROLLER_NO_REAL_NAME_HEIGHT_LIMIT</td><td><font color="#666">No Real Name Height Limit.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_threepropelleremergencylanding_inline"></a>FLIGHT_CONTROLLER_THREE_PROPELLER_EMERGENCY_LANDING</td><td><font color="#666">Three Propeller Emergency Landing.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_landingprotection_inline"></a>FLIGHT_CONTROLLER_LANDING_PROTECTION</td><td><font color="#666">Landing Protection.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_aircraftpropulsionsystemerror_inline"></a>FLIGHT_CONTROLLER_AIRCRAFT_PROPULSION_SYSTEM_ERROR</td><td><font color="#666">Aircraft Propulsion System Error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticserror_stronggalewarning_inline"></a>FLIGHT_CONTROLLER_STRONG_GALE_WARNING</td><td><font color="#666">Strong gale warning.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djidiagnostics_djidiagnosticstype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djidiagnostics_djidiagnosticstype_inline">DJIDiagnosticsType</a></div></div><div class="inline-doc" id="djidiagnostics_djidiagnosticstype_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>DJIDiagnosticsType</h6></div>

~~~java
 enum DJIDiagnosticsType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Diagnostics components type.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticstype_battery_inline"></a>BATTERY</td><td><font color="#666">Battery component.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticstype_camera_inline"></a>CAMERA</td><td><font color="#666">Camera component.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticstype_center_board_inline"></a>CENTER_BOARD</td><td><font color="#666">Center board component.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticstype_on_screen_display_inline"></a>ON_SCREEN_DISPLAY</td><td><font color="#666">Components' error often shown on the main screen.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticstype_flight_controller_inline"></a>FLIGHT_CONTROLLER</td><td><font color="#666">Flight controller component.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticstype_gimbal_inline"></a>GIMBAL</td><td><font color="#666">Gimbal component.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticstype_lightbridge_inline"></a>LIGHTBRIDGE</td><td><font color="#666">Lightbridge component.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticstype_remote_controller_inline"></a>REMOTE_CONTROLLER</td><td><font color="#666">Remote controller component.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticstype_vision_inline"></a>VISION</td><td><font color="#666">Vision component.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticstype_rtk_inline"></a>RTK</td><td><font color="#666">RTK component.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticstype_device_health_information_inline"></a>DEVICE_HEALTH_INFORMATION</td><td><font color="#666">Device health information. Only supported by some components of Matrice 300 RTK and Zenmuse H20 series.  It is recommended to use device health information to replace old diagnostics for flight controller and RTK.  There will be a few duplicated component error for gimbal, battery, perception module on Matrice 300 RTK.  Find error code and detailed description information in the Readme file on Github (https://github.com/dji-sdk/Mobile-SDK-Android/blob/master/README.md)</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_djidiagnosticstype_other_inline"></a>OTHER</td><td><font color="#666">Other.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djidiagnostics_devicehealthinformationwarninglevel"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djidiagnostics_devicehealthinformationwarninglevel_inline">WarningLevel</a></div></div><div class="inline-doc" id="djidiagnostics_devicehealthinformationwarninglevel_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>WarningLevel</h6></div>

~~~java
 enum WarningLevel 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.healthmanager</td></tr></table></html>



##### Description:



<font color="#666">Warning level for components' health information.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_devicehealthinformationwarninglevel_none_inline"></a>NONE</td><td><font color="#666">No warning.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_devicehealthinformationwarninglevel_notice_inline"></a>NOTICE</td><td><font color="#666">Device health information notice.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_devicehealthinformationwarninglevel_caution_inline"></a>CAUTION</td><td><font color="#666">Warning message. Fly with caution.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_devicehealthinformationwarninglevel_warning_inline"></a>WARNING</td><td><font color="#666">Warning message.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_devicehealthinformation_warninglevel_seriouswarning_inline"></a>SERIOUS_WARNING</td><td><font color="#666">Serious warning message.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djidiagnostics_devicehealthinformationwarninglevel_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djidiagnostics_djidiagnosticsdevicehealthinformation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Diagnostics/DJIDiagnostics_DJIDiagnosticsDeviceHealthInformation.html">DeviceHealthInformation</a></div></div><div class="api-row" id="djidiagnostics_diagnosticsinformationcallbackinterface"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Diagnostics/DJIDiagnostics_DiagnosticsInformationCallbackInterface.html">DiagnosticsInformationCallback</a></div></div>
