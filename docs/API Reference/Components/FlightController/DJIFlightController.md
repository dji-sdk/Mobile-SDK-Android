<div class="article"><h1 ><font color="#AAA">class </font>FlightController</h1></div>

~~~java
 class FlightController extends BaseComponent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/BaseComponent/DJIBaseComponent.html#djibasecomponent">BaseComponent</a></code></td></tr></table></html>



##### Description:



<font color="#666">This class contains components of the flight controller and provides methods to send different commands to the flight controller. This object is available from the <code><a href="/Products/Aircraft/DJIAircraft.html#djiaircraft">Aircraft</a></code> object which is a subclass of <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct">BaseProduct</a></code>.



##### Class Members:



#### State Updates

<div class="api-row" id="djiflightcontroller_setupdatesystemstatecallback"><div class="api-col left">Callbacks</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setupdatesystemstatecallback_inline">setStateCallback</a></div></div><div class="inline-doc" id="djiflightcontroller_setupdatesystemstatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setStateCallback</h6></div>

~~~java
 void setStateCallback(@Nullable FlightControllerState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets the callback function that updates the flight controller's current state data. This method is called 10 times per second.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/FlightController/DJIFlightController_DJIFlightControllerCurrentState.html#djiflightcontroller_djiflightcontrollercurrentstate">FlightControllerState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_setonimustatechangedcallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setonimustatechangedcallback_inline">setIMUStateCallback</a></div></div><div class="inline-doc" id="djiflightcontroller_setonimustatechangedcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setIMUStateCallback</h6></div>

~~~java
 void setIMUStateCallback(@Nullable IMUState.Callback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets the IMU State callback, which will receive the changed state of the IMU.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/IMUState/DJIIMUState.html#djiimustate">IMUState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>The callback for receiving the changed state of IMU.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_setasbinformationcallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setasbinformationcallback_inline">setASBInformationCallback</a></div></div><div class="inline-doc" id="djiflightcontroller_setasbinformationcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setASBInformationCallback</h6></div>

~~~java
 void setASBInformationCallback(@Nullable AirSenseSystemInformation.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets the AirSenseSystemInformation callback, which will receive the AirSenseSystemInformation.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/FlightController/DJIAirSenseSystemInformation.html#djiairsensesysteminformation">AirSenseSystemInformation</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>The callback for receiving the <code><a href="/Components/FlightController/DJIAirSenseSystemInformation.html#djiairsensesysteminformation">AirSenseSystemInformation</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_setreceiveexternaldevicedatacallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setreceiveexternaldevicedatacallback_inline">setOnboardSDKDeviceDataCallback</a></div></div><div class="inline-doc" id="djiflightcontroller_setreceiveexternaldevicedatacallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setOnboardSDKDeviceDataCallback</h6></div>

~~~java
 void setOnboardSDKDeviceDataCallback(
        @Nullable OnboardSDKDeviceDataCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets the callback function that updates the data received from an external device (e.g. the onboard device).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/FlightController/DJIFlightController_ReceivedDataFromExternalDeviceCallbackInterface.html#djiflightcontroller_receiveddatafromexternaldevicecallbackinterface">OnboardSDKDeviceDataCallback</a> <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Get State

<div class="api-row" id="djiflightcontroller_getcurrentstate"><div class="api-col left">Current State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_getcurrentstate_inline">getState</a></div></div><div class="inline-doc" id="djiflightcontroller_getcurrentstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getState</h6></div>

~~~java
@NonNull
 FlightControllerState getState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Returns the current state of flight controller.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJIFlightControllerCurrentState.html#djiflightcontroller_djiflightcontrollercurrentstate">FlightControllerState</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/FlightController/DJIFlightController_DJIFlightControllerCurrentState.html#djiflightcontroller_djiflightcontrollercurrentstate">FlightControllerState</a></code>.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Sensors

<div class="api-row" id="djiflightcontroller_compass"><div class="api-col left">Compass</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_compass_inline">getCompass</a></div></div><div class="inline-doc" id="djiflightcontroller_compass_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCompass</h6></div>

~~~java
 Compass getCompass() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Compass object.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Compass/DJICompass.html#djicompass">Compass</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/Compass/DJICompass.html#djicompass">Compass</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_getcompasscount"><div class="api-col left">Compass Count</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_getcompasscount_inline">getCompassCount</a></div></div><div class="inline-doc" id="djiflightcontroller_getcompasscount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCompassCount</h6></div>

~~~java
 int getCompassCount()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Number of Compass modules in the flight controller.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_rtk"><div class="api-col left">RTK Positioning</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_rtk_inline">getRTK</a></div></div><div class="inline-doc" id="djiflightcontroller_rtk_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRTK</h6></div>

~~~java
@Nullable
 RTK getRTK() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">RTK positioning object.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">RTK</td><td><font color="#666"><i>An instance of <code><a href="/Components/RTK/DJIRTK.html#djirtk">RTK</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_numberofimus"><div class="api-col left">IMU</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_numberofimus_inline">getIMUCount</a></div></div><div class="inline-doc" id="djiflightcontroller_numberofimus_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getIMUCount</h6></div>

~~~java
 int getIMUCount()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_imu_count_key">FlightControllerKey.IMU_COUNT</a></td></tr></table></html>



##### Description:



<font color="#666">Number of IMU modules in the flight controller. Most products have one IMU. <br> <br> Exceptions: <br> <ul> <li>Phantom 4, Phantom 4 Pro, Mavic Pro, and Inspire 2 each have two IMUs</li> <li>A3, Matrice 600, and Matrice 600 Pro each have one inner IMU and can have at most two external IMUs.</li> <li>N3 has two inner IMUs and can have one external IMU.</li> </ul>



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_startimucalibration"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_startimucalibration_inline">startIMUCalibration</a></div></div><div class="inline-doc" id="djiflightcontroller_startimucalibration_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startIMUCalibration</h6></div>

~~~java
 void startIMUCalibration(@Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_start_imu_calibration_key">FlightControllerKey.START_IMU_CALIBRATION</a></td></tr></table></html>



##### Description:



<font color="#666">Starts IMU calibration. For aircraft with multiple IMUs, this method will start the calibration of all IMUs. Keep the aircraft stationary and horizontal during calibration, which will take 5 to 10 minutes. The completion block will be called once the calibration is started. Use the <code><a href="/Components/IMUState/DJIFlightController_IMUStateChangedCallbackInterface.html#djiflightcontroller_updateimustate">onUpdate</a></code> method to check the execution status of the IMU calibration. It is recommended to  reboot the device after IMU calibration. It is recommended to invoke <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_rebootdrone">reboot</a></code> after IMU calibration.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_startimucalibrationforid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_startimucalibrationforid_inline">startIMUCalibration</a></div></div><div class="inline-doc" id="djiflightcontroller_startimucalibrationforid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startIMUCalibration</h6></div>

~~~java
 void startIMUCalibration(@IntRange(from = 0, to = 2) int index,
                                             @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_start_imu_calibration_with_id_key">FlightControllerKey.START_IMU_CALIBRATION_WITH_ID</a></td></tr></table></html>



##### Description:



<font color="#666">Starts the calibration for IMU with a specific ID. Keep the aircraft stationary and horizontal during calibration, which will take 5 to 10 minutes. The completion block will be called once the calibration is started. Use the <code><a href="/Components/IMUState/DJIFlightController_IMUStateChangedCallbackInterface.html#djiflightcontroller_updateimustate">onUpdate</a></code> method to check the execution status of the IMU calibration. It is recommended to reboot the device after IMU calibration.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 2) int <font color="#000">index</td><td><font color="#666"><i>The IMU with the specific ID to calibrate.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback to check if the calibration starts successfully.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_startgravitycentercalibration"><div class="api-col left">Gravity Center Calibration</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_startgravitycentercalibration_inline">startGravityCenterCalibration</a></div></div><div class="inline-doc" id="djiflightcontroller_startgravitycentercalibration_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startGravityCenterCalibration</h6></div>

~~~java
 void startGravityCenterCalibration(@Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Starts gravity center calibration. Keep the aircraft hover without wind during calibration. The completion  block will be called once the calibration is started. 



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_stopgravitycentercalibration"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_stopgravitycentercalibration_inline">stopGravityCenterCalibration</a></div></div><div class="inline-doc" id="djiflightcontroller_stopgravitycentercalibration_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopGravityCenterCalibration</h6></div>

~~~java
 void stopGravityCenterCalibration(@Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Stop gravity center calibration.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<html><p><br></p></html>

#### PipeLines

<div class="api-row" id="djionboardsdkdevice_savepipelineslog"><div class="api-col left">Save pipeline Log</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djionboardsdkdevice_savepipelineslog_inline">savePipelinesLog</a></div></div><div class="inline-doc" id="djionboardsdkdevice_savepipelineslog_inline"

><div class="article"><h6 ><font color="#AAA">method </font>savePipelinesLog</h6></div>

~~~java
 void savePipelinesLog(boolean enabled) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets true to save log for pipelines. In order to improve developer's experience  on SDK interconnectivity, <code><a href="/Components/Pipeline/DJIPipeline.html#djipipeline">Pipeline</a></code> is designed to save log  files locally when files are transferred, during which the speed is 475KB per minute.  Please be careful with the device storage.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to save log files.</i></td></tr></table></html></div>

<div class="api-row" id="djionboardsdkdevice_getpipelines"><div class="api-col left">Get pipeline</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djionboardsdkdevice_getpipelines_inline">getPipelines</a></div></div><div class="inline-doc" id="djionboardsdkdevice_getpipelines_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPipelines</h6></div>

~~~java
 Pipelines getPipelines() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">The pipelines to transmit data between onboard device and DJI mobile SDK. It's only supported by Matrice 300 RTK.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Pipeline/DJIPipelines.html#djipipelines">Pipelines</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/Pipeline/DJIPipelines.html#djipipelines">Pipelines</a></code>.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Sub Components

<div class="api-row" id="djiflightcontroller_landinggear"><div class="api-col left">Landing Gear</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_landinggear_inline">getLandingGear</a></div></div><div class="inline-doc" id="djiflightcontroller_landinggear_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLandingGear</h6></div>

~~~java
 LandingGear getLandingGear() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Landing Gear object. For products with movable landing gear only.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/LandingGear/DJILandingGear.html#djilandinggear">LandingGear</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/LandingGear/DJILandingGear.html#djilandinggear">LandingGear</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_islandinggearmovable"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_islandinggearmovable_inline">isLandingGearMovable</a></div></div><div class="inline-doc" id="djiflightcontroller_islandinggearmovable_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isLandingGearMovable</h6></div>

~~~java
 boolean isLandingGearMovable()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_is_landing_gear_movable_key">FlightControllerKey.IS_LANDING_GEAR_MOVABLE</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if landing gear is supported for the connected aircraft.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_simulator"><div class="api-col left">Simulator</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_simulator_inline">getSimulator</a></div></div><div class="inline-doc" id="djiflightcontroller_simulator_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSimulator</h6></div>

~~~java
 Simulator getSimulator() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Simulator object.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Simulator/DJISimulator.html#djisimulator">Simulator</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/Simulator/DJISimulator.html#djisimulator">Simulator</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_isonboardsdkdeviceavailable"><div class="api-col left">Onboard SDK Device</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_isonboardsdkdeviceavailable_inline">isOnboardSDKDeviceAvailable</a></div></div><div class="inline-doc" id="djiflightcontroller_isonboardsdkdeviceavailable_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isOnboardSDKDeviceAvailable</h6></div>

~~~java
 boolean isOnboardSDKDeviceAvailable()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_is_on_board_sdk_available_key">FlightControllerKey.IS_ON_BOARD_SDK_AVAILABLE</a></td></tr></table></html>



##### Description:



<font color="#666">Returns if the Onboard SDK feature is available on the connected product.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_senddatatoonboardsdkdevice"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_senddatatoonboardsdkdevice_inline">sendDataToOnboardSDKDevice</a></div></div><div class="inline-doc" id="djiflightcontroller_senddatatoonboardsdkdevice_inline"

><div class="article"><h6 ><font color="#AAA">method </font>sendDataToOnboardSDKDevice</h6></div>

~~~java
 void sendDataToOnboardSDKDevice(@Size(min = 1, max = 100) byte[] data,
                                                    @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_send_data_to_on_board_sdk_device_key">FlightControllerKey.SEND_DATA_TO_ON_BOARD_SDK_DEVICE</a></td></tr></table></html>



##### Description:



<font color="#666">If there is a device connected to the aircraft using the Onboard SDK, this method will send data to that device. The size of the data cannot be greater than 100 bytes, and will be sent in 40 byte increments every 14ms. This method is only supported on products that support the Onboard SDK (Matrice 210 V1, Matrice 210 V2, Matrice 300 RTK, Matrice 100, Matrice 600, Matrice 600 Pro, A3, A3 Pro, and N3).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Size(min = 1, max = 100) byte[] <font color="#000">data</td><td><font color="#666"><i>Data to be sent to the external device. The size of the data should not be larger than 100 bytes.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Flight Actions

<div class="api-row" id="djiflightcontroller_turnonmotors"><div class="api-col left">Motors</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_turnonmotors_inline">turnOnMotors</a></div></div><div class="inline-doc" id="djiflightcontroller_turnonmotors_inline"

><div class="article"><h6 ><font color="#AAA">method </font>turnOnMotors</h6></div>

~~~java
 void turnOnMotors(@Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_turn_on_motors_key">FlightControllerKey.TURN_ON_MOTORS</a></td></tr></table></html>



##### Description:



<font color="#666">Turns on the aircraft's motors. Supported by flight controller firmware 3.1.0.0 or above.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_turnoffmotors"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_turnoffmotors_inline">turnOffMotors</a></div></div><div class="inline-doc" id="djiflightcontroller_turnoffmotors_inline"

><div class="article"><h6 ><font color="#AAA">method </font>turnOffMotors</h6></div>

~~~java
 void turnOffMotors(@Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_turn_off_motors_key">FlightControllerKey.TURN_OFF_MOTORS</a></td></tr></table></html>



##### Description:



<font color="#666">Turns off the aircraft's motors. The method can only be called when the aircraft is on the ground.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_seturgentstopmodeenabled"><div class="api-col left">Urgent Stop Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_seturgentstopmodeenabled_inline">setUrgentStopModeEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_seturgentstopmodeenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setUrgentStopModeEnabled</h6></div>

~~~java
 void setUrgentStopModeEnabled(boolean enabled, @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Enables urgent stop mode. When urgent stop mode is enabled, the motor can be stopped by pushing sticks  inner/outer simultaneously at any time. Use with caution. Supported only by Phantom 4 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable urgent stop mode.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Callback that receives the setter execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_geturgentstopmodeenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_geturgentstopmodeenabled_inline">getUrgentStopModeEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_geturgentstopmodeenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getUrgentStopModeEnabled</h6></div>

~~~java
 void getUrgentStopModeEnabled(
        @NonNull final CompletionCallbackWith<Boolean> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets if urgent stop mode is enabled or not. Supported only by Phantom 4 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion callback that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_setescbeepenabled"><div class="api-col left">ESC Beep</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setescbeepenabled_inline">setESCBeepEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_setescbeepenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setESCBeepEnabled</h6></div>

~~~java
 void setESCBeepEnabled(boolean enabled, @Nullable final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Enables ESC beeping.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable ESC beeping.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_getescbeepenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_getescbeepenabled_inline">getESCBeepEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_getescbeepenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getESCBeepEnabled</h6></div>

~~~java
 void getESCBeepEnabled(@NonNull final CompletionCallbackWith<Boolean> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Determines if ESC beeping is enabled.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_setgravitystatecallback"><div class="api-col left">Callback</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setgravitystatecallback_inline">setGravityCenterStateCallback</a></div></div><div class="inline-doc" id="djiflightcontroller_setgravitystatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setGravityCenterStateCallback</h6></div>

~~~java
 void setGravityCenterStateCallback(@Nullable GravityCenterState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets the callback function that updates the gravity calibration's current state data.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/FlightController/DJIFlightController_DJIGravityCenterState.html#djiflightcontroller_djigravitycenterstate">GravityCenterState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_takeoff"><div class="api-col left">Take Off</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_takeoff_inline">startTakeoff</a></div></div><div class="inline-doc" id="djiflightcontroller_takeoff_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startTakeoff</h6></div>

~~~java
 void startTakeoff(@Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_take_off_key">FlightControllerKey.TAKE_OFF</a></td></tr></table></html>



##### Description:



<font color="#666">Starts aircraft takeoff. Takeoff is considered complete when the aircraft is hovering 1.2 meters (4 feet) above the ground. Completion block is called when aircraft crosses 0.5 meters (1.6 feet). If the motors are already on, this command cannot be executed.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_precisiontakeoff"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_precisiontakeoff_inline">startPrecisionTakeoff</a></div></div><div class="inline-doc" id="djiflightcontroller_precisiontakeoff_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startPrecisionTakeoff</h6></div>

~~~java
 void startPrecisionTakeoff(@Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Starts aircraft precision takeoff. Precision Takeoff is considered complete when the aircraft is hovering  6 meters (20 feet) above the ground. Completion block is called when aircraft crosses 0.5 meters (1.6 feet).  If the motors are already on, this command cannot be executed. <br> This feature need vision assisted positioning enabled on.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_canceltakeoff"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_canceltakeoff_inline">cancelTakeoff</a></div></div><div class="inline-doc" id="djiflightcontroller_canceltakeoff_inline"

><div class="article"><h6 ><font color="#AAA">method </font>cancelTakeoff</h6></div>

~~~java
 void cancelTakeoff(@Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_cancel_take_off_key">FlightControllerKey.CANCEL_TAKE_OFF</a></td></tr></table></html>



##### Description:



<font color="#666">Stops aircraft takeoff. If called before <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_takeoff">startTakeoff</a></code> is complete, the aircraft will cancel takeoff (<code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_takeoff">startTakeoff</a></code> completion block will return an error) and hover at the current height.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_autolanding"><div class="api-col left">Land</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_autolanding_inline">startLanding</a></div></div><div class="inline-doc" id="djiflightcontroller_autolanding_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startLanding</h6></div>

~~~java
 void startLanding(@Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_start_landing_key">FlightControllerKey.START_LANDING</a></td></tr></table></html>



##### Description:



<font color="#666">Starts auto-landing of the aircraft. Returns completion block once aircraft begins to descend for auto-land.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_cancelautolanding"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_cancelautolanding_inline">cancelLanding</a></div></div><div class="inline-doc" id="djiflightcontroller_cancelautolanding_inline"

><div class="article"><h6 ><font color="#AAA">method </font>cancelLanding</h6></div>

~~~java
 void cancelLanding(@Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_cancel_landing_key">FlightControllerKey.CANCEL_LANDING</a></td></tr></table></html>



##### Description:



<font color="#666">Stops auto-landing of the aircraft. If called before <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_autolanding">startLanding</a></code> is complete, then the auto landing will be canceled (<code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_autolanding">startLanding</a></code> completion block will return an error) and the aircraft will hover at its current location.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_confirmlanding"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_confirmlanding_inline">confirmLanding</a></div></div><div class="inline-doc" id="djiflightcontroller_confirmlanding_inline"

><div class="article"><h6 ><font color="#AAA">method </font>confirmLanding</h6></div>

~~~java
 void confirmLanding(@Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_confirm_landing_key">FlightControllerKey.CONFIRM_LANDING</a></td></tr></table></html>



##### Description:



<font color="#666">Confirms continuation of landing action. When the clearance between the aircraft and the ground is less than 0.3m, the aircraft will pause landing and wait for user's confirmation. Can use <code><a href="/Components/FlightController/DJIFlightController_DJIFlightControllerCurrentState.html#djiflightcontroller_djiflightcontrollercurrentstate_islandingconfirmationneeded">isLandingConfirmationNeeded</a></code> in <code><a href="/Components/FlightController/DJIFlightController_DJIFlightControllerCurrentState.html#djiflightcontroller_djiflightcontrollercurrentstate">FlightControllerState</a></code> to check if confirmation is needed. It is supported by flight controller firmware 3.2.0.0 and above.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_rebootdrone"><div class="api-col left">Reboot Drone</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_rebootdrone_inline">reboot</a></div></div><div class="inline-doc" id="djiflightcontroller_rebootdrone_inline"

><div class="article"><h6 ><font color="#AAA">method </font>reboot</h6></div>

~~~java
 void reboot(@Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Reboot the aircraft. It is recommended to invoke this method after IMU calibration. It is only supported by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback that receives the execution result.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### LED Settings

<div class="api-row" id="djiflightcontroller_setledsenabledsettings"><div class="api-col left">Enable LED</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setledsenabledsettings_inline">setLEDsEnabledSettings</a></div></div><div class="inline-doc" id="djiflightcontroller_setledsenabledsettings_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setLEDsEnabledSettings</h6></div>

~~~java
 void setLEDsEnabledSettings(LEDsSettings ledsSettings, @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_leds_enabled_settings_key">FlightControllerKey.LEDS_ENABLED_SETTINGS</a></td></tr></table></html>



##### Description:



<font color="#666">Turns on/off different sets of LEDs on the aircraft. All the LEDs are on by default.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJIFlightControllerLEDsSettings.html#djiflightcontroller_djiflightcontrollerledssettings">LEDsSettings</a> <font color="#000">ledsSettings</td><td><font color="#666"><i>Settings to control LEDs.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback that receives the setter execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_getledsenabledsettings"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_getledsenabledsettings_inline">getLEDsEnabledSettings</a></div></div><div class="inline-doc" id="djiflightcontroller_getledsenabledsettings_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLEDsEnabledSettings</h6></div>

~~~java
 void getLEDsEnabledSettings(@NonNull CompletionCallbackWith<LEDsSettings> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Determines the status of LEDs on the aircraft.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/FlightController/DJIFlightController_DJIFlightControllerLEDsSettings.html#djiflightcontroller_djiflightcontrollerledssettings">LEDsSettings</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Virtual Sticks

<div class="api-row" id="djiflightcontroller_virtualstickcontrolmodecategory_isvirtualstickcontrolmodeavailable"><div class="api-col left">Setup</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_virtualstickcontrolmodecategory_isvirtualstickcontrolmodeavailable_inline">isVirtualStickControlModeAvailable</a></div></div><div class="inline-doc" id="djiflightcontroller_virtualstickcontrolmodecategory_isvirtualstickcontrolmodeavailable_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isVirtualStickControlModeAvailable</h6></div>

~~~java
 boolean isVirtualStickControlModeAvailable()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_is_virtual_stick_control_mode_available_key">FlightControllerKey.IS_VIRTUAL_STICK_CONTROL_MODE_AVAILABLE</a></td></tr></table></html>



##### Description:



<font color="#666">Indicates whether the virtual stick control interface can be used. Virtual stick mode is only available when all of the follow requirements are met: <ul> <li>Virtual stick mode is enabled.</li> <li>No waypoint, hotpoint, or follow-me mission is running.</li> <li><code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightorientationmode">FlightOrientationMode</a></code> is set to <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightorientationmode_defaultaircraftheading">AIRCRAFT_HEADING</a></code></li> <li>Terrain-follow is disabled if the aircraft supports this feature.</li> <li>Tripod mode is disabled if the aircraft supports this feature.</li> </ul>



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if virtual stick mode is available.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_virtualstickcontrolmodecategory_setvirtualstickmodeenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_virtualstickcontrolmodecategory_setvirtualstickmodeenabled_inline">setVirtualStickModeEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_virtualstickcontrolmodecategory_setvirtualstickmodeenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setVirtualStickModeEnabled</h6></div>

~~~java
 void setVirtualStickModeEnabled(boolean enabled, @Nullable final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_virtual_stick_control_mode_enabled_key">FlightControllerKey.VIRTUAL_STICK_CONTROL_MODE_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Enables/disables virtual stick control mode. By enabling virtual stick control mode, the aircraft can be controlled using <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_virtualstickcontrolmodecategory_sendvirtualstickflightcontroldata">sendVirtualStickFlightControlData</a></code>. Not supported by Mavic Pro when using the WiFi connection.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable virtual stick mode.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_virtualstickcontrolmodecategory_getvirtualstickmodeenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_virtualstickcontrolmodecategory_getvirtualstickmodeenabled_inline">getVirtualStickModeEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_virtualstickcontrolmodecategory_getvirtualstickmodeenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVirtualStickModeEnabled</h6></div>

~~~java
 void getVirtualStickModeEnabled(@NonNull final CompletionCallbackWith<Boolean> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_virtual_stick_control_mode_enabled_key">FlightControllerKey.VIRTUAL_STICK_CONTROL_MODE_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Gets virtual stick mode status (enabled/disabled). Not supported by Mavic Pro when using the WiFi connection.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_virtualstickadvancedmodeenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_virtualstickadvancedmodeenabled_inline">isVirtualStickAdvancedModeEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_virtualstickadvancedmodeenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isVirtualStickAdvancedModeEnabled</h6></div>

~~~java
 boolean isVirtualStickAdvancedModeEnabled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if Virtual Stick advanced mode is enabled. By default, it is <code>false</code>. Assuming GPS signal is good, advanced mode will allow aircraft to compensate for wind when hovering. For the Phantom 4, collision avoidance can be enabled for virtual stick control if advanced mode is on, and collision avoidance is enabled in <code><a href="/Components/IntelligentFlightAssistant/DJIIntelligentFlightAssistant.html#djiintelligentflightassistant">FlightAssistant</a></code>. Only supported by flight controller firmware versions 3.1.x.x or above. CAUTION: It will be reset to <code>false</code> when the flight controller is reconnected.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_setvirtualstickadvancedmodeenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setvirtualstickadvancedmodeenabled_inline">setVirtualStickAdvancedModeEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_setvirtualstickadvancedmodeenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setVirtualStickAdvancedModeEnabled</h6></div>

~~~java
 void setVirtualStickAdvancedModeEnabled(boolean virtualStickAdvancedModeEnabled) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Set <code>true</code> to enable Virtual Stick advanced mode. By default, it is <code>false</code>. Assuming GPS signal is good, advanced mode will allow aircraft to compensate for wind when hovering.
  For the Phantom 4, collision avoidance can be enabled for virtual stick
  control if advanced mode is on, and collision avoidance is enabled in <code><a href="/Components/IntelligentFlightAssistant/DJIIntelligentFlightAssistant.html#djiintelligentflightassistant">FlightAssistant</a></code>.
  Only supported by flight controller firmware versions 3.1.0.0 or above.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">virtualStickAdvancedModeEnabled</td><td><font color="#666"><i>&lt;code&gt;True&lt;/code&gt; for enabling advanced mode.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_verticalcontrolmode"><div class="api-col left">Control Modes</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_verticalcontrolmode_inline">getVerticalControlMode</a></div></div><div class="inline-doc" id="djiflightcontroller_verticalcontrolmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVerticalControlMode</h6></div>

~~~java
 VerticalControlMode getVerticalControlMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">The vertical control mode for virtual stick. CAUTION: It will be reset to <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djivirtualstickverticalcontrolmode_velocity">VELOCITY</a></code> when the flight controller is reconnected.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djivirtualstickverticalcontrolmode">VerticalControlMode</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djivirtualstickverticalcontrolmode">VerticalControlMode</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_setverticalcontrolmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setverticalcontrolmode_inline">setVerticalControlMode</a></div></div><div class="inline-doc" id="djiflightcontroller_setverticalcontrolmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setVerticalControlMode</h6></div>

~~~java
 void setVerticalControlMode(@NonNull VerticalControlMode verticalControlMode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets whether virtual stick vertical controller changes aircraft's altitude or vertical velocity.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djivirtualstickverticalcontrolmode">VerticalControlMode</a> <font color="#000">verticalControlMode</td><td><font color="#666"><i>A specific DJIVirtualStickVerticalControlMode object.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_rollpitchcontrolmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_rollpitchcontrolmode_inline">getRollPitchControlMode</a></div></div><div class="inline-doc" id="djiflightcontroller_rollpitchcontrolmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRollPitchControlMode</h6></div>

~~~java
 RollPitchControlMode getRollPitchControlMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">The roll and pitch control mode for virtual stick. CAUTION: It will be reset to <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djivirtualstickrollpitchcontrolmode_angle">ANGLE</a></code> when the flight controller is reconnected.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djivirtualstickrollpitchcontrolmode">RollPitchControlMode</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djivirtualstickrollpitchcontrolmode">RollPitchControlMode</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_setrollpitchcontrolmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setrollpitchcontrolmode_inline">setRollPitchControlMode</a></div></div><div class="inline-doc" id="djiflightcontroller_setrollpitchcontrolmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setRollPitchControlMode</h6></div>

~~~java
 void setRollPitchControlMode(@NonNull RollPitchControlMode rollPitchControlMode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets whether roll/pitch virtual controllers change aircraft's angle relative to level orientation, or aircraft's velocity on horizontal axes.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djivirtualstickrollpitchcontrolmode">RollPitchControlMode</a> <font color="#000">rollPitchControlMode</td><td><font color="#666"><i>A specific DJIVirtualStickRollPitchControlMode object.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_yawcontrolmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_yawcontrolmode_inline">getYawControlMode</a></div></div><div class="inline-doc" id="djiflightcontroller_yawcontrolmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getYawControlMode</h6></div>

~~~java
 YawControlMode getYawControlMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">The yaw control mode for virtual stick. CAUTION: It will be reset to <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djivirtualstickyawcontrolmode_angle">ANGLE</a></code> when the flight controller is reconnected.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djivirtualstickyawcontrolmode">YawControlMode</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djivirtualstickyawcontrolmode">YawControlMode</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_setyawcontrolmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setyawcontrolmode_inline">setYawControlMode</a></div></div><div class="inline-doc" id="djiflightcontroller_setyawcontrolmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setYawControlMode</h6></div>

~~~java
 void setYawControlMode(@NonNull YawControlMode yawControlMode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets whether virtual stick yaw controller changes aircraft's heading by angle or by angular velocity.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djivirtualstickyawcontrolmode">YawControlMode</a> <font color="#000">yawControlMode</td><td><font color="#666"><i>A specific DJIVirtualStickYawControlMode object.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_rollpitchcoordinatesystem"><div class="api-col left">Coordinate System</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_rollpitchcoordinatesystem_inline">getRollPitchCoordinateSystem</a></div></div><div class="inline-doc" id="djiflightcontroller_rollpitchcoordinatesystem_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRollPitchCoordinateSystem</h6></div>

~~~java
 FlightCoordinateSystem getRollPitchCoordinateSystem() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">The coordinate system for virtual stick. CAUTION: It will be reset to <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djivirtualstickflightcoordinatesystem_ground">GROUND</a></code> when the flight controller is reconnected.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djivirtualstickflightcoordinatesystem">FlightCoordinateSystem</a></td><td><font color="#666"><i>Coordinate system object.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_setrollpitchcoordinatesystem"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setrollpitchcoordinatesystem_inline">setRollPitchCoordinateSystem</a></div></div><div class="inline-doc" id="djiflightcontroller_setrollpitchcoordinatesystem_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setRollPitchCoordinateSystem</h6></div>

~~~java
 void setRollPitchCoordinateSystem(@NonNull FlightCoordinateSystem rollPitchCoordinateSystem) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets whether horizontal axes are fixed relative to the ground or to the aircraft.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djivirtualstickflightcoordinatesystem">FlightCoordinateSystem</a> <font color="#000">rollPitchCoordinateSystem</td><td><font color="#666"><i>A specific rollPitchCoordinateSystem object.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_virtualstickcontrolmodecategory_sendvirtualstickflightcontroldata"><div class="api-col left">Send Command</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_virtualstickcontrolmodecategory_sendvirtualstickflightcontroldata_inline">sendVirtualStickFlightControlData</a></div></div><div class="inline-doc" id="djiflightcontroller_virtualstickcontrolmodecategory_sendvirtualstickflightcontroldata_inline"

><div class="article"><h6 ><font color="#AAA">method </font>sendVirtualStickFlightControlData</h6></div>

~~~java
 void sendVirtualStickFlightControlData(@NonNull FlightControlData controlData,
                                                           @Nullable final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_send_virtual_stick_flight_control_data_key">FlightControllerKey.SEND_VIRTUAL_STICK_FLIGHT_CONTROL_DATA</a></td></tr></table></html>



##### Description:



<font color="#666">Sends flight control data using virtual stick commands. The <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_virtualstickcontrolmodecategory_isvirtualstickcontrolmodeavailable">isVirtualStickControlModeAvailable</a></code> method must return <code>true</code> to use virtual stick commands. Virtual stick commands should be sent to the aircraft between 5 Hz and 25 Hz. If virtual stick commands are not sent frequently enough, the aircraft may regard the connection as broken, which will cause the aircraft to hover in place until the next command comes through.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/FlightController/DJIFlightController_DJIVirtualStickFlightControlData.html#djiflightcontroller_djivirtualstickflightcontroldata">FlightControlData</a> <font color="#000">controlData</td><td><font color="#666"><i>Flight control data</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Flight Assistance

<div class="api-row" id="djiflightcontroller_isintelligentflightassistantsupported"><div class="api-col left">Collision Avoidance and Vision Positioning</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_isintelligentflightassistantsupported_inline">isFlightAssistantSupported</a></div></div><div class="inline-doc" id="djiflightcontroller_isintelligentflightassistantsupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isFlightAssistantSupported</h6></div>

~~~java
 boolean isFlightAssistantSupported()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_is_flight_assistant_supported_key">FlightControllerKey.IS_FLIGHT_ASSISTANT_SUPPORTED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the product supports IntelligentFlightAssistant.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_intelligentflightassistant"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_intelligentflightassistant_inline">getFlightAssistant</a></div></div><div class="inline-doc" id="djiflightcontroller_intelligentflightassistant_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlightAssistant</h6></div>

~~~java
@Nullable
 FlightAssistant getFlightAssistant() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Intelligent flight assistant.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/IntelligentFlightAssistant/DJIIntelligentFlightAssistant.html#djiintelligentflightassistant">FlightAssistant</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/IntelligentFlightAssistant/DJIIntelligentFlightAssistant.html#djiintelligentflightassistant">FlightAssistant</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_accesslocker"><div class="api-col left">Access Locker</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_accesslocker_inline">getAccessLocker</a></div></div><div class="inline-doc" id="djiflightcontroller_accesslocker_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAccessLocker</h6></div>

~~~java
 AccessLocker getAccessLocker() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the instance of the access locker. It is used to encapsulate the access  protection features on the aircraft.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Simulator/DJIAccessLocker.html#djiaccesslocker">AccessLocker</a></td><td><font color="#666"><i>Instance of the access locker. <code>null</code> if it is not supported by the aircraft.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_isaccesslockersupported"><div class="api-col left">Check Access Locker Supported</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_isaccesslockersupported_inline">isAccessLockerSupported</a></div></div><div class="inline-doc" id="djiflightcontroller_isaccesslockersupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isAccessLockerSupported</h6></div>

~~~java
 boolean isAccessLockerSupported()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the product supports AccessLocker.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightorientationmodecategory_setflightorientationmode"><div class="api-col left">Flight Orientation Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightorientationmodecategory_setflightorientationmode_inline">setFlightOrientationMode</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightorientationmodecategory_setflightorientationmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFlightOrientationMode</h6></div>

~~~java
 void setFlightOrientationMode(@NonNull FlightOrientationMode type,
                                                  @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_orientation_mode_key">FlightControllerKey.ORIENTATION_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the aircraft flight orientation relative to the Aircraft Heading, Course Lock, or Home Lock. See the <i>Flight Controller User Guide</i> for more information about flight orientation.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightorientationmode">FlightOrientationMode</a> <font color="#000">type</td><td><font color="#666"><i>The orientation mode.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightorientationmodecategory_lockcourseusingcurrentdirection"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightorientationmodecategory_lockcourseusingcurrentdirection_inline">lockCourseUsingCurrentHeading</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightorientationmodecategory_lockcourseusingcurrentdirection_inline"

><div class="article"><h6 ><font color="#AAA">method </font>lockCourseUsingCurrentHeading</h6></div>

~~~java
 void lockCourseUsingCurrentHeading(@Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_lock_course_using_current_heading_key">FlightControllerKey.LOCK_COURSE_USING_CURRENT_HEADING</a></td></tr></table></html>



##### Description:



<font color="#666">Locks the current heading of the aircraft as the Course Lock. Used when Flight Orientation Mode is <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightorientationmode_courselock">COURSE_LOCK</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result. Please refer to DJIBaseComponent for more information about the block</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_settripodmodeenabled"><div class="api-col left">Tripod Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_settripodmodeenabled_inline">setTripodModeEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_settripodmodeenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setTripodModeEnabled</h6></div>

~~~java
 void setTripodModeEnabled(boolean enabled,
                                              @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Enables/disables tripod mode. Tripod Mode drops the aircraft's maximum speed to 2.2mph (3.6kph), and significantly reduces the control stick sensitivity of the remote controller to give the user the precision needed for accurate framing. When tripod mode is enabled, missions, terrain follow mode, course lock, and home lock are not allowed. Tripod mode is not allowed if the aircraft is running a mission. If GPS or vision positioning aren't available, tripod mode cannot be enabled. If the GPS and/or the vision system is providing the flight controller with velocity information, the aircraft will be able to automatically compensate for wind. If however, position information is not available, manual intervention will be required. User should beware that any manual compensation will be limited due to the reduced maximum velocity and sensitivity. If GPS and vision position become unavailable while in tripod mode, it is advisable to alert the user and disable Tripod Mode.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable tripod mode.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_gettripodmodeenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_gettripodmodeenabled_inline">getTripodModeEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_gettripodmodeenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTripodModeEnabled</h6></div>

~~~java
 void getTripodModeEnabled(@NonNull CompletionCallbackWith<Boolean> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets tripod mode status (enabled/disabled). It is supported by Mavic Pro & Mavic Mini.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_setcinematicmodeenabled"><div class="api-col left">Cinematic Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setcinematicmodeenabled_inline">setCinematicModeEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_setcinematicmodeenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCinematicModeEnabled</h6></div>

~~~java
 void setCinematicModeEnabled(boolean enabled,
                                              @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Enables/disables cinematic mode. In Cinematic Mode, you can shoot more stable and smooth photos and videos. Aircraft yaw speed will be lower and braking distance will be longer. It's only supported by Mavic Pro, Spark, Mavic 2 Zoom and Mavic 2 Pro.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable cinematic mode.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_getcinematicmodeenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_getcinematicmodeenabled_inline">getCinematicModeEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_getcinematicmodeenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCinematicModeEnabled</h6></div>

~~~java
 void getCinematicModeEnabled(@NonNull CompletionCallbackWith<Boolean> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets cinematic mode status (enabled/disabled). It's only supported by Mavic Pro, Spark, Mavic 2 Zoom and  Mavic 2 Pro.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_setcinematicbrakesensitivity"><div class="api-col left">Cinematic Brake</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setcinematicbrakesensitivity_inline">setCinematicBrakeSensitivity</a></div></div><div class="inline-doc" id="djiflightcontroller_setcinematicbrakesensitivity_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCinematicBrakeSensitivity</h6></div>

~~~java
 void setCinematicBrakeSensitivity(int brakeSensitivity, @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Adjusts the braking sensitivity when cinematic mode is enabled. Higher sensitivity can shorten the  braking distance in cinematic mode. It's supported by Mavic Pro, Spark, Mavic 2 Zoom and  Mavic 2 Pro.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">brakeSensitivity</td><td><font color="#666"><i>Brake sensitivity in cinematic mode.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_getcinematicbrakesensitivity"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_getcinematicbrakesensitivity_inline">getCinematicBrakeSensitivity</a></div></div><div class="inline-doc" id="djiflightcontroller_getcinematicbrakesensitivity_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCinematicBrakeSensitivity</h6></div>

~~~java
 void getCinematicBrakeSensitivity(@NonNull CompletionCallbackWith<Integer> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the braking sensitivity when cinematic mode is enabled. Higher sensitivity can shorten the  braking distance in cinematic mode. It's supported by Mavic Pro, Spark, Mavic 2 Zoom and  Mavic 2 Pro.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_setcinematicyawspeed"><div class="api-col left">Cinematic Yaw</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setcinematicyawspeed_inline">setCinematicYawSpeed</a></div></div><div class="inline-doc" id="djiflightcontroller_setcinematicyawspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCinematicYawSpeed</h6></div>

~~~java
 void setCinematicYawSpeed(float yawSpeed, @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Adjusts the aircraft's yaw speed when cinematic mode is enabled. It's supported by Mavic Pro, Spark, Mavic 2 Zoom and  Mavic 2 Pro.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">yawSpeed</td><td><font color="#666"><i>The aircraft's yaw speed in cinematic mode.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_getcinematicyawspeed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_getcinematicyawspeed_inline">getCinematicYawSpeed</a></div></div><div class="inline-doc" id="djiflightcontroller_getcinematicyawspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCinematicYawSpeed</h6></div>

~~~java
 void getCinematicYawSpeed(@NonNull CompletionCallbackWith<Float> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the aircraft's yaw speed when cinematic mode is enabled. It's supported by Mavic Pro, Spark, Mavic 2 Zoom and  Mavic 2 Pro.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Float&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_setterrainfollowmodeenabled"><div class="api-col left">Terrain Follow Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setterrainfollowmodeenabled_inline">setTerrainFollowModeEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_setterrainfollowmodeenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setTerrainFollowModeEnabled</h6></div>

~~~java
 void setTerrainFollowModeEnabled(Boolean enabled,
                                                     @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_terrain_follow_mode_enabled_key">FlightControllerKey.TERRAIN_FOLLOW_MODE_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Enable/disable terrain follow mode. The aircraft uses height information gathered by the onboard ultrasonic system and its downward facing cameras to keep flying at the same height above the ground.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable terrain follow mode.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_getterrainfollowmodeenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_getterrainfollowmodeenabled_inline">getTerrainFollowModeEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_getterrainfollowmodeenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTerrainFollowModeEnabled</h6></div>

~~~java
 void getTerrainFollowModeEnabled(
        @NonNull final CompletionCallbackWith<Boolean> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_terrain_follow_mode_enabled_key">FlightControllerKey.TERRAIN_FOLLOW_MODE_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Gets terrain mode status (enabled/disabled).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_setcontrolmode"><div class="api-col left">Advanced Control Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setcontrolmode_inline">setControlMode</a></div></div><div class="inline-doc" id="djiflightcontroller_setcontrolmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setControlMode</h6></div>

~~~java
 void setControlMode(@NonNull ControlMode mode, @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_control_mode_key">FlightControllerKey.CONTROL_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the control mode of the flight controller. It is highly recommended you keep the default value of <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightcontrollercontrolmode_smart">SMART</a></code>. See <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightcontrollercontrolmode">ControlMode</a></code> for details. Only supported by stand-alone A3.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightcontrollercontrolmode">ControlMode</a> <font color="#000">mode</td><td><font color="#666"><i>Control mode to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback that receives the setter execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_getcontrolmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_getcontrolmode_inline">getControlMode</a></div></div><div class="inline-doc" id="djiflightcontroller_getcontrolmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getControlMode</h6></div>

~~~java
 void getControlMode(@NonNull CompletionCallbackWith<ControlMode> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_control_mode_key">FlightControllerKey.CONTROL_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the control mode of the flight controller.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightcontrollercontrolmode">ControlMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_setautoquickspinenabled"><div class="api-col left">Auto Quick Spin</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setautoquickspinenabled_inline">setAutoQuickSpinEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_setautoquickspinenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAutoQuickSpinEnabled</h6></div>

~~~java
 void setAutoQuickSpinEnabled(boolean enabled, @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Enable/disable Auto Quick Spin. When the gimbal reaches a yaw movement limit, the aircraft will automatically rotate 360 degrees to unwind the gimbal, allowing it to continue moving in the yaw direction. This method is only available when the aircraft is flying at least 3m above the ground. It is only supported by Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable Auto Quick Spin.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_getautoquickspinenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_getautoquickspinenabled_inline">getQuickSpinEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_getautoquickspinenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getQuickSpinEnabled</h6></div>

~~~java
 void getQuickSpinEnabled(@NonNull CompletionCallbackWith<Boolean> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_quick_spin_enabled_key">FlightControllerKey.QUICK_SPIN_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Gets current Auto Quick Spin mode (enabled/disabled). It is only supported by Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_setpropellercageprotectionenabled"><div class="api-col left">Propeller Cage Protection</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setpropellercageprotectionenabled_inline">setPropellerCageProtectionEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_setpropellercageprotectionenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPropellerCageProtectionEnabled</h6></div>

~~~java
 void setPropellerCageProtectionEnabled(boolean enabled, @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Do not turn on the Propeller Cage switch if propeller cages are not mounted. By enabling the Propeller Cage switch, you will set the Force Landing battery  level to 15% and disable Wind Check and Propeller Check. When propeller cages are installed, no other accessories (except for official ND filters)  can be attached. Only supported by Mavic Mini.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable propeller cage protection.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Callback that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_getpropellercageprotectionenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_getpropellercageprotectionenabled_inline">getPropellerCageProtectionEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_getpropellercageprotectionenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPropellerCageProtectionEnabled</h6></div>

~~~java
 void getPropellerCageProtectionEnabled(@NonNull CompletionCallbackWith<Boolean> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets whether the propeller cage switch is turned on.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion block that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightlimitation_setmaxflightheight"><div class="api-col left">Flight Limitation</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightlimitation_setmaxflightheight_inline">setMaxFlightHeight</a></div></div><div class="inline-doc" id="djiflightlimitation_setmaxflightheight_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMaxFlightHeight</h6></div>

~~~java
 void setMaxFlightHeight(@IntRange(from = 20, to = 500) int maxHeight,
                                   @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_max_flight_height_key">FlightControllerKey.MAX_FLIGHT_HEIGHT</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the maximum flight height limitation of the aircraft. The <code>maxHeight</code> value must be in the  range [20, 500] m.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 20, to = 500) int <font color="#000">maxHeight</td><td><font color="#666"><i>Maximum height of the aircraft.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightlimitation_getmaxflightheight"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightlimitation_getmaxflightheight_inline">getMaxFlightHeight</a></div></div><div class="inline-doc" id="djiflightlimitation_getmaxflightheight_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMaxFlightHeight</h6></div>

~~~java
 void getMaxFlightHeight(@NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_max_flight_height_key">FlightControllerKey.MAX_FLIGHT_HEIGHT</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the maximum flight height limitation of the aircraft.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiflightlimitation_setmaxflightradius"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightlimitation_setmaxflightradius_inline">setMaxFlightRadius</a></div></div><div class="inline-doc" id="djiflightlimitation_setmaxflightradius_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMaxFlightRadius</h6></div>

~~~java
 void setMaxFlightRadius(@IntRange(from = 15, to = 8000) int maxRadius,
                                   @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_max_flight_radius_key">FlightControllerKey.MAX_FLIGHT_RADIUS</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the maximum flight radius limitation of the aircraft. The radius is calculated from the home point.  The <code>maxRadius</code> value must be in the range [15, 8000] m.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 15, to = 8000) int <font color="#000">maxRadius</td><td><font color="#666"><i>Maximum flight radius of the aircraft.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightlimitation_getmaxflightradius"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightlimitation_getmaxflightradius_inline">getMaxFlightRadius</a></div></div><div class="inline-doc" id="djiflightlimitation_getmaxflightradius_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMaxFlightRadius</h6></div>

~~~java
 void getMaxFlightRadius(@NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_max_flight_radius_key">FlightControllerKey.MAX_FLIGHT_RADIUS</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the maximum flight radius limitation of the aircraft.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiflightlimitation_setmaxflightradiuslimitationenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightlimitation_setmaxflightradiuslimitationenabled_inline">setMaxFlightRadiusLimitationEnabled</a></div></div><div class="inline-doc" id="djiflightlimitation_setmaxflightradiuslimitationenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMaxFlightRadiusLimitationEnabled</h6></div>

~~~java
 void setMaxFlightRadiusLimitationEnabled(boolean enabled, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_max_flight_radius_enabled_key">FlightControllerKey.MAX_FLIGHT_RADIUS_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Sets whether the maximum flight radius limitation is enabled. If enabled is <code>false</code>,  there is no maximum flight radius limitation.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i>Maximum flight radius limitation is enabled.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightlimitation_getmaxflightradiuslimitationenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightlimitation_getmaxflightradiuslimitationenabled_inline">getMaxFlightRadiusLimitationEnabled</a></div></div><div class="inline-doc" id="djiflightlimitation_getmaxflightradiuslimitationenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMaxFlightRadiusLimitationEnabled</h6></div>

~~~java
 void getMaxFlightRadiusLimitationEnabled(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_max_flight_radius_enabled_key">FlightControllerKey.MAX_FLIGHT_RADIUS_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the maximum flight radius limitation status (enabled/disabled).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Home

<div class="api-row" id="djiflightcontroller_gohome"><div class="api-col left">Go Home</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_gohome_inline">startGoHome</a></div></div><div class="inline-doc" id="djiflightcontroller_gohome_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startGoHome</h6></div>

~~~java
 void startGoHome(@Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_start_go_home_key">FlightControllerKey.START_GO_HOME</a></td></tr></table></html>



##### Description:



<font color="#666">The aircraft will start to go home. The <code>completion callback</code> will return execution result once this method is invoked.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_cancelgohome"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_cancelgohome_inline">cancelGoHome</a></div></div><div class="inline-doc" id="djiflightcontroller_cancelgohome_inline"

><div class="article"><h6 ><font color="#AAA">method </font>cancelGoHome</h6></div>

~~~java
 void cancelGoHome(@Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_cancel_go_home_key">FlightControllerKey.CANCEL_GO_HOME</a></td></tr></table></html>



##### Description:



<font color="#666">The aircraft will stop going home and will hover in place.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_sethomelocation"><div class="api-col left">Location</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_sethomelocation_inline">setHomeLocation</a></div></div><div class="inline-doc" id="djiflightcontroller_sethomelocation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setHomeLocation</h6></div>

~~~java
 void setHomeLocation(@NonNull LocationCoordinate2D homeLocation,
                                         @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_home_location_key">FlightControllerKey.HOME_LOCATION</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the home location of the aircraft. The home location is where the aircraft returns when commanded by <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_gohome">startGoHome</a></code>, when its signal is lost or when the battery is below the lowBatteryWarning threshold. The user should be careful setting a new home point location, as sometimes the product will not be under user control when returning home. A home location is valid if it is within 30m of one of the following: <ul> <li>initial take-off location</li> <li>aircraft's current location</li> <li>current mobile location with at least kCLLocationAccuracyNearestTenMeters accuracy level</li> <li>current remote controller's location as shown by RC GPS.</li> </ul> 



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a> <font color="#000">homeLocation</td><td><font color="#666"><i>Home location latitude and longitude in degrees.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_sethomelocationusingaircraftcurrentlocation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_sethomelocationusingaircraftcurrentlocation_inline">setHomeLocationUsingAircraftCurrentLocation</a></div></div><div class="inline-doc" id="djiflightcontroller_sethomelocationusingaircraftcurrentlocation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setHomeLocationUsingAircraftCurrentLocation</h6></div>

~~~java
 void setHomeLocationUsingAircraftCurrentLocation(@Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_home_location_using_current_aircraft_location_key">FlightControllerKey.HOME_LOCATION_USING_CURRENT_AIRCRAFT_LOCATION</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the home location of the aircraft to the current location of the aircraft. See <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_sethomelocation">setHomeLocation</a></code> for details on home point use.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_gethomelocation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_gethomelocation_inline">getHomeLocation</a></div></div><div class="inline-doc" id="djiflightcontroller_gethomelocation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHomeLocation</h6></div>

~~~java
 void getHomeLocation(@NonNull CompletionCallbackWith<LocationCoordinate2D> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_home_location_key">FlightControllerKey.HOME_LOCATION</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the home point of the aircraft.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_setgohomealtitude"><div class="api-col left">Altitude</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setgohomealtitude_inline">setGoHomeHeightInMeters</a></div></div><div class="inline-doc" id="djiflightcontroller_setgohomealtitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setGoHomeHeightInMeters</h6></div>

~~~java
 void setGoHomeHeightInMeters(@IntRange(from = 20, to = 500) int height,
                                                 @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_go_home_height_in_meters_key">FlightControllerKey.GO_HOME_HEIGHT_IN_METERS</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the minimum altitude, relative to where the aircraft took off, at which the aircraft must be before going home. This can be useful when the user foresees obstacles in the aircraft's flight path. If the aircraft's current altitude is higher than the minimum go home altitude, it will go home at its current altitude. The valid range for the altitude is from 20m to 500m. But if the aircraft is M210 RTK V3, the limit can beyond 500m.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 20, to = 500) int <font color="#000">height</td><td><font color="#666"><i>The aircraft's default go home altitude.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_getgohomealtitude"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_getgohomealtitude_inline">getGoHomeHeightInMeters</a></div></div><div class="inline-doc" id="djiflightcontroller_getgohomealtitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getGoHomeHeightInMeters</h6></div>

~~~java
 void getGoHomeHeightInMeters(@NonNull CompletionCallbackWith<Integer> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_go_home_height_in_meters_key">FlightControllerKey.GO_HOME_HEIGHT_IN_METERS</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the minimum altitude (relative to the take-off location in meters) at which the aircraft must be before going home.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Fail Safes

<div class="api-row" id="djiflightcontroller_setflightfailsafeoperation"><div class="api-col left">Connection</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setflightfailsafeoperation_inline">setConnectionFailSafeBehavior</a></div></div><div class="inline-doc" id="djiflightcontroller_setflightfailsafeoperation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setConnectionFailSafeBehavior</h6></div>

~~~java
 void setConnectionFailSafeBehavior(@NonNull ConnectionFailSafeBehavior behavior,
                                                       @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_connection_fail_safe_behavior_key">FlightControllerKey.CONNECTION_FAIL_SAFE_BEHAVIOR</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the FailSafe action for when the connection between remote controller and aircraft is lost. It is supported by Mavic Mini.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightfailsafeoperation">ConnectionFailSafeBehavior</a> <font color="#000">behavior</td><td><font color="#666"><i>The <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightfailsafeoperation">ConnectionFailSafeBehavior</a></code> object.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_getflightfailsafeoperation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_getflightfailsafeoperation_inline">getConnectionFailSafeBehavior</a></div></div><div class="inline-doc" id="djiflightcontroller_getflightfailsafeoperation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getConnectionFailSafeBehavior</h6></div>

~~~java
 void getConnectionFailSafeBehavior(
        @NonNull CompletionCallbackWith<ConnectionFailSafeBehavior> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_connection_fail_safe_behavior_key">FlightControllerKey.CONNECTION_FAIL_SAFE_BEHAVIOR</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the FailSafe action for when the connection between remote controller and aircraft is lost.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightfailsafeoperation">ConnectionFailSafeBehavior</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_setgohomebatterythreshold"><div class="api-col left">Battery</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setgohomebatterythreshold_inline">setLowBatteryWarningThreshold</a></div></div><div class="inline-doc" id="djiflightcontroller_setgohomebatterythreshold_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setLowBatteryWarningThreshold</h6></div>

~~~java
 void setLowBatteryWarningThreshold(@IntRange(from = 15, to = 50) int percent,
                                                       @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_low_battery_warning_threshold_key">FlightControllerKey.LOW_BATTERY_WARNING_THRESHOLD</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the low battery warning threshold as a percentage. The percentage must be in the range of [15, 50]. It is supported by Mavic Mini.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 15, to = 50) int <font color="#000">percent</td><td><font color="#666"><i>Low battery warning percentage.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_getgohomebatterythreshold"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_getgohomebatterythreshold_inline">getLowBatteryWarningThreshold</a></div></div><div class="inline-doc" id="djiflightcontroller_getgohomebatterythreshold_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLowBatteryWarningThreshold</h6></div>

~~~java
 void getLowBatteryWarningThreshold(@NonNull CompletionCallbackWith<Integer> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_low_battery_warning_threshold_key">FlightControllerKey.LOW_BATTERY_WARNING_THRESHOLD</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the low battery warning threshold as a percentage.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_setlandimmediatelybatterythreshold"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setlandimmediatelybatterythreshold_inline">setSeriousLowBatteryWarningThreshold</a></div></div><div class="inline-doc" id="djiflightcontroller_setlandimmediatelybatterythreshold_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSeriousLowBatteryWarningThreshold</h6></div>

~~~java
 void setSeriousLowBatteryWarningThreshold(@IntRange(from = 10, to = 45) int percent,
                                                              @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_serious_low_battery_warning_threshold_key">FlightControllerKey.SERIOUS_LOW_BATTERY_WARNING_THRESHOLD</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the serious low battery warning threshold as a percentage. The minimum value is 10. The maximum value is value from <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_getgohomebatterythreshold">getLowBatteryWarningThreshold</a></code> minus 5. It is supported by Mavic Mini.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 10, to = 45) int <font color="#000">percent</td><td><font color="#666"><i>Serious low battery warning percentage.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_getlandimmediatelybatterythreshold"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_getlandimmediatelybatterythreshold_inline">getSeriousLowBatteryWarningThreshold</a></div></div><div class="inline-doc" id="djiflightcontroller_getlandimmediatelybatterythreshold_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSeriousLowBatteryWarningThreshold</h6></div>

~~~java
 void getSeriousLowBatteryWarningThreshold(@NonNull CompletionCallbackWith<Integer> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_serious_low_battery_warning_threshold_key">FlightControllerKey.SERIOUS_LOW_BATTERY_WARNING_THRESHOLD</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the serious low battery warning threshold in percentage.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_setsmartreturntohomeenabled"><div class="api-col left">Smart RTH</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setsmartreturntohomeenabled_inline">setSmartReturnToHomeEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_setsmartreturntohomeenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSmartReturnToHomeEnabled</h6></div>

~~~java
 void setSmartReturnToHomeEnabled(boolean enabled, @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Enables/disables Smart Return-To-Home (RTH) feature. When it is enabled, aircraft will request to go home when remaining battery is only enough for completing the go-home action. For Mavic Mini, the aircraft will return to home point when the remaning battery is low.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable smart RTH.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion block that receives the setter execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_getsmartreturntohomeenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_getsmartreturntohomeenabled_inline">getSmartReturnToHomeEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_getsmartreturntohomeenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSmartReturnToHomeEnabled</h6></div>

~~~java
 void getSmartReturnToHomeEnabled(
        @NonNull final CompletionCallbackWith<Boolean> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Determines whether Smart Return-To-Home (RTH) feature is enabled or not. When it is enabled, aircraft will request to go home when remaining battery is only enough for completing the go-home action.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion callback that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_confirmsmartreturntohomerequest"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_confirmsmartreturntohomerequest_inline">confirmSmartReturnToHomeRequest</a></div></div><div class="inline-doc" id="djiflightcontroller_confirmsmartreturntohomerequest_inline"

><div class="article"><h6 ><font color="#AAA">method </font>confirmSmartReturnToHomeRequest</h6></div>

~~~java
 void confirmSmartReturnToHomeRequest(boolean confirmed, @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Confirms or cancels the Smart Return-To-Home (RTH) request. When Smart RTH is enabled, the aircraft will request to go home when the battery is only enough for going home. Before executing the go-home action, the aircraft will wait for the confirmation from users with 10 seconds count-down. If the "confirmed" parameter is <code>false</code>, the request is canceled and the aircraft will not execute go-home action. Otherwise, go-home action will start. Smart RTH will be triggered only once during the same flight. Flight controller with firmware version lower than 3.0.0.0 does not support confirming the Smart RTH request. User can either cancel the request or wait for the countdown to start go-home action. It is supported by Mavic Mini.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">confirmed</td><td><font color="#666"><i><code>true</code> to confirm the request and the aircraft will start go-home immediately.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion block to receive the result.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Flight Mode

<div class="api-row" id="djiflightcontroller_getremotecontrollerflightmodemapping"><div class="api-col left">Mapping</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_getremotecontrollerflightmodemapping_inline">getRCSwitchFlightModeMapping</a></div></div><div class="inline-doc" id="djiflightcontroller_getremotecontrollerflightmodemapping_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRCSwitchFlightModeMapping</h6></div>

~~~java
 void getRCSwitchFlightModeMapping(
        @NonNull CompletionCallbackWith<RemoteControllerFlightMode[]> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the mapping between the flight modes and the flight mode switch positions on the remote controller. Elements 0, 1, and 2 of the returned array map to <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState.html#djiremotecontroller_djiremotecontrollerflightmodeswitchpositionone">POSITION_ONE</a></code>, <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState.html#djiremotecontroller_djiremotecontrollerflightmodeswitchpositiontwo">POSITION_TWO</a></code>, and <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState.html#djiremotecontroller_djiremotecontrollerflightmodeswitchpositionthree">POSITION_THREE</a></code> of the <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState.html#djiremotecontroller_djirchardwarestate_flightmodeswitch">getFlightModeSwitch</a></code>. The value of each Enum item represents the corresponding value of the <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightcontrollerremotecontrollerflightmode">RemoteControllerFlightMode</a></code> Enum representing the flight mode. <br>The mapping is fixed for the Phantom series, Inspire series, Mavic Pro, and M100. For N3, A3, Matrice 600, and Matrice 600 Pro the mapping is firmware dependent. With firmware version 3.2.11.0 or above, the mapping can be customized in DJI Assistant 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightcontrollerremotecontrollerflightmode">RemoteControllerFlightMode</a>[]&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion callback that receives the getter result. Each element of array is an instance with a value of <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightcontrollerremotecontrollerflightmode">RemoteControllerFlightMode</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_setmultipleflightmodeenabled"><div class="api-col left">Multiple Flight Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setmultipleflightmodeenabled_inline">setMultipleFlightModeEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_setmultipleflightmodeenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMultipleFlightModeEnabled</h6></div>

~~~java
 void setMultipleFlightModeEnabled (boolean enabled, @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Enables/disables multiple-flight mode. When multiple-flight mode is enabled, user can change the aircraft's mode to P/F/A/S mode by toggling the switch on the remote controller. If it is disabled, the aircraft will be in P mode.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable multiple-flight mode.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_getmultipleflightmodeenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_getmultipleflightmodeenabled_inline">getMultipleFlightModeEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_getmultipleflightmodeenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMultipleFlightModeEnabled</h6></div>

~~~java
 void getMultipleFlightModeEnabled (@NonNull CompletionCallbackWith<Boolean> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Determines whether multiple-flight mode is enabled. When multiple-flight mode is enabled, user can change the aircraft's mode to P/F/A/S mode by toggling the switch on the remote controller. If it is disabled, the aircraft will be in P mode.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion callback that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_setnovicemodeenabled"><div class="api-col left">Novice Mode Enabled</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setnovicemodeenabled_inline">setNoviceModeEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_setnovicemodeenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setNoviceModeEnabled</h6></div>

~~~java
 void setNoviceModeEnabled(boolean enabled, @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Enables novice mode. When novice mode is enabled, the flight speed will become slower and less responsive handling. For Phantom 4 Pro, enabling novice mode will enable the infrared time-of-flight (TOF) sensors on the left and right.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable novice mode.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion block that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_getnovicemodeenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_getnovicemodeenabled_inline">getNoviceModeEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_getnovicemodeenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getNoviceModeEnabled</h6></div>

~~~java
 void getNoviceModeEnabled(@NonNull CompletionCallbackWith<Boolean> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Determines whether novice mode is enabled or not. If novice mode is enabled, the flight speed is slower and less responsive handling. For Phantom 4 Pro, enabling novice mode will enable the infrared time-of-flight (TOF) sensors on the left and right.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion callback that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_setpowersupplyportenabled"><div class="api-col left">Power Supply Port Enabled</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_setpowersupplyportenabled_inline">setPowerSupplyPortEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_setpowersupplyportenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPowerSupplyPortEnabled</h6></div>

~~~java
 void setPowerSupplyPortEnabled(boolean enabled, @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Enables the power supply port. It is only supported by M200 series and M200 series v2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> if power supply port is enabled.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Callback that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_getpowersupplyportenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_getpowersupplyportenabled_inline">getPowerSupplyPortEnabled</a></div></div><div class="inline-doc" id="djiflightcontroller_getpowersupplyportenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPowerSupplyPortEnabled</h6></div>

~~~java
 void getPowerSupplyPortEnabled(@NonNull final CompletionCallbackWith<Boolean> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Determines whether the power supply port is enabled or not. It is only supported by  M200 series and M200 series v2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion block that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightlimitation_hasreachedmaxflightheight"><div class="api-col left">Max Flight Height</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightlimitation_hasreachedmaxflightheight_inline">hasReachedMaxFlightHeight</a></div></div><div class="inline-doc" id="djiflightlimitation_hasreachedmaxflightheight_inline"

><div class="article"><h6 ><font color="#AAA">method </font>hasReachedMaxFlightHeight</h6></div>

~~~java
 boolean hasReachedMaxFlightHeight() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_has_reached_max_flight_height_key">FlightControllerKey.HAS_REACHED_MAX_FLIGHT_HEIGHT</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the aircraft has reached the maximum flight height.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightlimitation_hasreachedmaxflightradius"><div class="api-col left">Max Flight Radius</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightlimitation_hasreachedmaxflightradius_inline">hasReachedMaxFlightRadius</a></div></div><div class="inline-doc" id="djiflightlimitation_hasreachedmaxflightradius_inline"

><div class="article"><h6 ><font color="#AAA">method </font>hasReachedMaxFlightRadius</h6></div>

~~~java
 boolean hasReachedMaxFlightRadius() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_has_reached_max_flight_radius_key">FlightControllerKey.HAS_REACHED_MAX_FLIGHT_RADIUS</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the aircraft has reached the maximum flight radius.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the aircraft has reached the maximum flight radius.</i></td></tr></table></html></div>

<html><p><br></p></html>

##### Related:

<div class="api-row" id="djiflightcontroller_receiveddatafromexternaldevicecallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightController/DJIFlightController_ReceivedDataFromExternalDeviceCallbackInterface.html">OnboardSDKDeviceDataCallback</a></div></div><div class="api-row" id="djiflightcontroller_visiondrawheadingmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_visiondrawheadingmode_inline">VisionDrawHeadingMode</a></div></div><div class="inline-doc" id="djiflightcontroller_visiondrawheadingmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>VisionDrawHeadingMode</h6></div>

~~~java
@EXClassNullAway
 enum VisionDrawHeadingMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_draw_heading_mode_key">FlightControllerKey.DRAW_HEADING_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">The heading mode of the camera used in the vision drawing the 3D orbit data.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_visiondrawheadingmode_free_inline"></a>FREE</td><td><font color="#666">Free mode - Camera direction can be freely adjusted in flight.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_visiondrawheadingmode_forward_inline"></a>FORWARD</td><td><font color="#666">Regular mode - camera direction consistent with course direction.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_visiondrawheadingmode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiflightcontroller_visiondrawstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_visiondrawstatus_inline">VisionDrawStatus</a></div></div><div class="inline-doc" id="djiflightcontroller_visiondrawstatus_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>VisionDrawStatus</h6></div>

~~~java
@EXClassNullAway
 enum VisionDrawStatus 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_draw_status_key">FlightControllerKey.DRAW_STATUS</a></td></tr></table></html>



##### Description:



<font color="#666">State of the vision drawing the 3D orbit data.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_visiondrawstatus_init_inline"></a>INIT</td><td><font color="#666">Initializing.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_visiondrawstatus_prepare_inline"></a>PREPARE</td><td><font color="#666">Vision got the orbit data, and preparing to calculate the 3D orbit.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_visiondrawstatus_ready_to_go_inline"></a>READY_TO_GO</td><td><font color="#666">Vision has generated the 3D orbit data, and start to download.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_visiondrawstatus_start_auto_inline"></a>START_AUTO</td><td><font color="#666">Starting State (Auto mode).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_visiondrawstatus_start_manual_inline"></a>START_MANUAL</td><td><font color="#666">Staring State (Manual mode).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_visiondrawstatus_pause_inline"></a>PAUSE</td><td><font color="#666">Pause state.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_visiondrawstatus_other_inline"></a>OTHER</td><td><font color="#666">Other unknown state.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiflightcontroller_urgentstopmotormode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_urgentstopmotormode_inline">UrgentStopMotorMode</a></div></div><div class="inline-doc" id="djiflightcontroller_urgentstopmotormode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>UrgentStopMotorMode</h6></div>

~~~java
@EXClassNullAway
 enum UrgentStopMotorMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_urgent_stop_motor_mode_key">FlightControllerKey.URGENT_STOP_MOTOR_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">The Mode enum to urgent stop motor.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_urgentstopmotormode_csc_inline"></a>CSC</td><td><font color="#666">Command only for Inspire 2, Phantom 4, Phantom 4 Professional,  Phantom 4 Advanced and M200 series.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_urgentstopmotormode_never_inline"></a>NEVER</td><td><font color="#666">Command only for Inspire 2, Phantom 4, Phantom 4 Professional,  Phantom 4 Advanced and M200 series.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_urgentstopmotormode_in_out_always_inline"></a>IN_OUT_ALWAYS</td><td><font color="#666">Command only for DJI Mavic Pro and Mavic Air.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_urgentstopmotormode_in_out_when_breakdown_inline"></a>IN_OUT_WHEN_BREAKDOWN</td><td><font color="#666">Command only for DJI Mavic Pro and Mavic Air.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_urgentstopmotormode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate"><div class="api-col left">Current State</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightController/DJIFlightController_DJIFlightControllerCurrentState.html">FlightControllerState</a></div></div><div class="api-row" id="djiflightcontroller_djigravitycenterstate"><div class="api-col left">Gravity Center State</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightController/DJIFlightController_DJIGravityCenterState.html">GravityCenterState</a></div></div><div class="api-row" id="djicompass"><div class="api-col left">Sensors</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Compass/DJICompass.html">Compass</a></div></div><div class="api-row" id="djirtk"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RTK/DJIRTK.html">RTK</a></div></div><div class="api-row" id="djilandinggear"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/LandingGear/DJILandingGear.html">LandingGear</a></div></div><div class="api-row" id="djiintelligentflightassistant"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/IntelligentFlightAssistant/DJIIntelligentFlightAssistant.html">FlightAssistant</a></div></div><div class="api-row" id="djisimulator"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Simulator/DJISimulator.html">Simulator</a></div></div><div class="api-row" id="djiimustate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/IMUState/DJIIMUState.html">IMUState</a></div></div><div class="api-row" id="djiaccesslocker"><div class="api-col left">Access Locker</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Simulator/DJIAccessLocker.html">AccessLocker</a></div></div><div class="api-row" id="djiflightcontroller_djivirtualstickflightcontroldata"><div class="api-col left">Virtual Sticks</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightController/DJIFlightController_DJIVirtualStickFlightControlData.html">FlightControlData</a></div></div><div class="api-row" id="djiflightcontroller_djivirtualstickverticalcontrolmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djivirtualstickverticalcontrolmode_inline">VerticalControlMode</a></div></div><div class="inline-doc" id="djiflightcontroller_djivirtualstickverticalcontrolmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>VerticalControlMode</h6></div>

~~~java
@EXClassNullAway
 enum VerticalControlMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.virtualstick</td></tr></table></html>



##### Description:



<font color="#666">Defines how vertical control values are interpreted by the aircraft.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djivirtualstickverticalcontrolmode_velocity_inline"></a>VELOCITY</td><td><font color="#666">Sets the virtual stick vertical control values to be a vertical velocity. Positive and negative vertical velocity is for the aircraft ascending and descending respectively. Maximum vertical velocity is defined as 4 m/s. Minimum vertical velocity is defined as -4 m/s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djivirtualstickverticalcontrolmode_position_inline"></a>POSITION</td><td><font color="#666">Sets the virtual stick vertical control values to be an altitude. Maximum position is defined as 500 m. Minimum position is defined as 0 m.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiflightcontroller_djivirtualstickrollpitchcontrolmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djivirtualstickrollpitchcontrolmode_inline">RollPitchControlMode</a></div></div><div class="inline-doc" id="djiflightcontroller_djivirtualstickrollpitchcontrolmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>RollPitchControlMode</h6></div>

~~~java
@EXClassNullAway
 enum RollPitchControlMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.virtualstick</td></tr></table></html>



##### Description:



<font color="#666">Defines how manual roll and pitch values are interpreted by the aircraft.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djivirtualstickrollpitchcontrolmode_angle_inline"></a>ANGLE</td><td><font color="#666">Sets the roll and pitch values to be an angle relative to a level aircraft. In the body coordinate system, positive and negative pitch angle is for the aircraft rotating about the y-axis in the positive direction or negative direction, respectively. Positive and negative roll angle is the positive direction or negative direction rotation angle about the x-axis, respectively. However in the ground coordinate system, positive and negative pitch angle is the angle value for the aircraft moving south and north, respectively. Positive and negative roll angle is the angle when the aircraft is moving east and west, respectively. Maximum angle is defined as 30 degrees. Minimum angle is defined as -30 degrees.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djivirtualstickrollpitchcontrolmode_velocity_inline"></a>VELOCITY</td><td><font color="#666">Sets the roll and pitch values to be a velocity. In the body coordinate system, positive and negative pitch velocity is for the aircraft moving towards the positive direction or negative direction along the pitch axis and y-axis, respectively. Positive and negative roll velocity is when the aircraft is moving towards the positive direction or negative direction along the roll axis and x-axis, respectively. However, in the ground coordinate system, positive and negative pitch velocity is for the aircraft moving east and west, respectively.  Positive and negative roll velocity is when the aircraft is moving north and south, respectively. Maximum velocity is defined as 15 meters/s. Minimum velocity is defined as -15 meters/s.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiflightcontroller_djivirtualstickyawcontrolmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djivirtualstickyawcontrolmode_inline">YawControlMode</a></div></div><div class="inline-doc" id="djiflightcontroller_djivirtualstickyawcontrolmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>YawControlMode</h6></div>

~~~java
@EXClassNullAway
 enum YawControlMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.virtualstick</td></tr></table></html>



##### Description:



<font color="#666">Defines how manual yaw values are interpreted by the aircraft.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djivirtualstickyawcontrolmode_angle_inline"></a>ANGLE</td><td><font color="#666">Sets the yaw values to be an angle relative to the north. Positive and negative yaw angle is for the aircraft rotating clockwise and counterclockwise, respectively. Maximum yaw angle is defined as 180 degrees. Minimum yaw angle is defined as -180 degrees.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djivirtualstickyawcontrolmode_angularvelocity_inline"></a>ANGULAR_VELOCITY</td><td><font color="#666">Sets the yaw values to be an angular velocity. Positive and negative angular velocity is for the aircraft rotating clockwise and counterclockwise, respectively. Maximum yaw angular velocity is defined as 100 degrees/s. Minimum yaw angular velocity is defined as -100 degrees/s.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiflightcontroller_djivirtualstickflightcoordinatesystem"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djivirtualstickflightcoordinatesystem_inline">FlightCoordinateSystem</a></div></div><div class="inline-doc" id="djiflightcontroller_djivirtualstickflightcoordinatesystem_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FlightCoordinateSystem</h6></div>

~~~java
@EXClassNullAway
 enum FlightCoordinateSystem 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.virtualstick</td></tr></table></html>



##### Description:



<font color="#666">Flight control coordinate system.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djivirtualstickflightcoordinatesystem_ground_inline"></a>GROUND</td><td><font color="#666">Ground coordinate system.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djivirtualstickflightcoordinatesystem_body_inline"></a>BODY</td><td><font color="#666">Body coordinate system.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercontrolmode"><div class="api-col left">Flight Assistance</div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercontrolmode_inline">ControlMode</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercontrolmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ControlMode</h6></div>

~~~java
@EXClassNullAway
 enum ControlMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_control_mode_key">FlightControllerKey.CONTROL_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Control mode of the flight controller. It determines how the pilot can control the aircraft. By default, it is in smart control mode.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollercontrolmode_smart_inline"></a>SMART</td><td><font color="#666">Smart control mode. The aircraft can stabilize its altitude and attitude in smart mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollercontrolmode_manual_inline"></a>MANUAL</td><td><font color="#666">Manual control mode. The aircraft will not stabilize its altitude and attitude in manual mode. This mode is for advanced pilots only, and should only be used when the pilot understands the risk of operating in this mode. Any damage to the product when operating in this mode will not be covered under warranty.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollercontrolmode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown control mode.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiflightcontroller_djiflightorientationmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightorientationmode_inline">FlightOrientationMode</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightorientationmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FlightOrientationMode</h6></div>

~~~java
@EXClassNullAway
 enum FlightOrientationMode    
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_orientation_mode_key">FlightControllerKey.ORIENTATION_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Tells the aircraft how to interpret flight commands for forward, backward, left and right. See the <i>Flight Controller User Guide</i> for more information.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightorientationmode_courselock_inline"></a>COURSE_LOCK</td><td><font color="#666">The aircraft should move relative to a locked course heading.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightorientationmode_homelock_inline"></a>HOME_LOCK</td><td><font color="#666">The aircraft should move relative radially to the Home Point.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightorientationmode_defaultaircraftheading_inline"></a>AIRCRAFT_HEADING</td><td><font color="#666">The aircraft should move relative to the front of the aircraft.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiflightcontroller_djiflightwindwarning"><div class="api-col left">Flight Wind Warning</div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightwindwarning_inline">FlightWindWarning</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightwindwarning_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FlightWindWarning</h6></div>

~~~java
@EXClassNullAway
 enum FlightWindWarning 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_flight_wind_warning_key">FlightControllerKey.FLIGHT_WIND_WARNING</a></td></tr></table></html>



##### Description:



<font color="#666">Warning caused by the strong wind.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightwindwarning_level0_inline"></a>LEVEL_0</td><td><font color="#666">No wind warning.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightwindwarning_level1_inline"></a>LEVEL_1</td><td><font color="#666">The wind speed is high. Fly with caution and ensure the aircraft remains within the line of sight.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightwindwarning_level2_inline"></a>LEVEL_2</td><td><font color="#666">Strong Wind. Fly with caution and ensure the aircraft remains within line of sight. It is more serious than <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightwindwarning_level1">LEVEL_1</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightwindwarning_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiflightcontroller_djiflightassistantobstaclesensingdirection"><div class="api-col left">Obstacle Sensing Direction</div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightassistantobstaclesensingdirection_inline">DJIFlightAssistantObstacleSensingDirection</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightassistantobstaclesensingdirection_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>DJIFlightAssistantObstacleSensingDirection</h6></div>

~~~java
 enum DJIFlightAssistantObstacleSensingDirection 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flightassistant</td></tr></table></html>



##### Description:



<font color="#666">Obstacle sensing direction. It is only supported by Matrice 300 RTK.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightassistantobstaclesensingdirection_upward_inline"></a>Upward</td><td><font color="#666">Upward sensing.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightassistantobstaclesensingdirection_downward_inline"></a>Downward</td><td><font color="#666">Downward sensing.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightassistantobstaclesensingdirection_horizontal_inline"></a>Horizontal</td><td><font color="#666">Horizontal Field.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiflightcontroller_djilocationcoordinate2d"><div class="api-col left">Home</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html">LocationCoordinate2D</a></div></div><div class="api-row" id="djiflightcontroller_djiflightfailsafeoperation"><div class="api-col left">Fail Safe</div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightfailsafeoperation_inline">ConnectionFailSafeBehavior</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightfailsafeoperation_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ConnectionFailSafeBehavior</h6></div>

~~~java
@EXClassNullAway
 enum ConnectionFailSafeBehavior 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_connection_fail_safe_behavior_key">FlightControllerKey.CONNECTION_FAIL_SAFE_BEHAVIOR</a></td></tr></table></html>



##### Description:



<font color="#666">Defines aircraft failsafe action when signal between the remote controller and the aircraft is lost.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightfailsafeoperation_hover_inline"></a>HOVER</td><td><font color="#666">Hover.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightfailsafeoperation_landing_inline"></a>LANDING</td><td><font color="#666">Landing.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightfailsafeoperation_gohome_inline"></a>GO_HOME</td><td><font color="#666">Return-to-Home.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightfailsafeoperation_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollerremotecontrollerflightmode"><div class="api-col left">Flight Mode</div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollerremotecontrollerflightmode_inline">RemoteControllerFlightMode</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollerremotecontrollerflightmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>RemoteControllerFlightMode</h6></div>

~~~java
@EXClassNullAway
 enum RemoteControllerFlightMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_current_mode_key">FlightControllerKey.CURRENT_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Flight modes that map to the flight mode switch on the remote controller.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerremotecontrollerflightmode_p_inline"></a>P</td><td><font color="#666">Positioning mode. GNSS and Vision Positioning Systems are used for positioning if they are available. For products without F mode, intelligent functions such as missions and intelligent orientation control can be performed in P-mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerremotecontrollerflightmode_s_inline"></a>S</td><td><font color="#666">Sport mode. The maximum flight speed and responsiveness of the aircraft is increased in this mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerremotecontrollerflightmode_a_inline"></a>A</td><td><font color="#666">Attitude mode. The GNSS and Vision Positioning Systems are not used for positioning. The aircraft only uses the barometer to maintain altitude. If receiving a GNSS signal, the aircraft can automatically return home if the Remote Controller signal is lost and if the Home Point has been recorded successfully.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerremotecontrollerflightmode_g_inline"></a>G</td><td><font color="#666">Gentle mode. The sensitivity and speed of aircraft will be substantially decreased in gentle mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerremotecontrollerflightmode_m_inline"></a>M</td><td><font color="#666">Manual mode. The aircraft will not stabilize its altitude nor attitude in manual mode. This mode is for advanced pilots only, and should only be used when the pilot understands the risk of operating in this mode. Any damage to the product when operating in this mode will not be covered under warranty. It is supported by stand-alone A3 and N3 and can be enabled in Assistant 2.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerremotecontrollerflightmode_f_inline"></a>F</td><td><font color="#666">Function mode. Performs the same as Positioning mode with intelligent functions such as missions and intelligent orientation control enabled.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerremotecontrollerflightmode_t_inline"></a>T</td><td><font color="#666">Tripod Mode. This mode drops the aircraft's maximum speed and significantly  reduces the control stick sensitivity of the remote controller to give the  user the precision needed for accurate framing. It is only supported by Mavic 2.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollerremotecontrollerflightmode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown mode.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollersmartrthstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollersmartrthstate_inline">SmartRTHState</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollersmartrthstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>SmartRTHState</h6></div>

~~~java
@EXClassNullAway
 enum SmartRTHState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">State of Smart Return-To-Home (RTH). It is only used when Smart RTH is enabled.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollersmartrthstate_idle_inline"></a>IDLE</td><td><font color="#666">Smart RTH is not triggered yet in the current flight. The Smart RTH state will be reset to this value when the aircraft lands.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollersmartrthstate_countingdown_inline"></a>COUNTING_DOWN</td><td><font color="#666">Smart RTH is triggered and the aircraft is counting down. If no response is received within 10 seconds or the user confirms the request, the aircraft will start to go home and the state will change to <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightcontrollersmartrthstate_executed">EXECUTED</a></code>. If user cancels the request, the state will change to <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightcontrollersmartrthstate_cancelled">CANCELLED</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollersmartrthstate_executed_inline"></a>EXECUTED</td><td><font color="#666">Smart RTH is already executed in the current flight. The state will not be reset until the aircraft lands.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollersmartrthstate_cancelled_inline"></a>CANCELLED</td><td><font color="#666">Smart RTH request is cancelled by the user. The state will not be reset until the aircraft lands.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_djiflightcontrollersmartrthstate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiairsensesysteminformation"><div class="api-col left">Air Sense System Info</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightController/DJIAirSenseSystemInformation.html">AirSenseSystemInformation</a></div></div><div class="api-row" id="djiflightcontroller_djiflightcontrollerledssettings"><div class="api-col left">LED Settings</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightController/DJIFlightController_DJIFlightControllerLEDsSettings.html">LEDsSettings</a></div></div><div class="api-row" id="djiflightcontroller_limits"><div class="api-col left">Limits</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightController/DJIFlightController_Limits.html">Limits</a></div></div><div class="api-row" id="djiflightcontroller_fixedwingcontrol"><div class="api-col left">Fixed Wing Control</div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_fixedwingcontrol_inline">FixedWingControl</a></div></div><div class="inline-doc" id="djiflightcontroller_fixedwingcontrol_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FixedWingControl</h6></div>

~~~java
 enum FixedWingControl 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_fixed_wing_control_key">FlightControllerKey.FIXED_WING_CONTROL</a></td></tr></table></html>



##### Description:



<font color="#666">The aircraft will fly forward automatically at a certain speed after entering Fixed-Wing Mode.  Push the left stick up to ascend and down to descend. Push either stick left or right to rotate  the aircraft. Push the right stick up to accelerate and pushing down will exit Fixed-Wing Mode.  See the <i>Flight  Controller User Guide</i> for more information.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_fixedwingcontrol_ready_inline"></a>READY</td><td><font color="#666">Prepare fixed-wing mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_fixedwingcontrol_enter_inline"></a>ENTER</td><td><font color="#666">Enter fixed-wing mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_fixedwingcontrol_exit_inline"></a>EXIT</td><td><font color="#666">Exit fixed-wing mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflightcontroller_fixedwingcontrol_other_inline"></a>OTHER</td><td><font color="#666">Other reservations.</td></tr></table></html>

##### Class Members:

</div>



##### Inherited Methods:

<div class="api-row" id="djibasecomponent_setdjicomponentlistener"><div class="api-col left">dji.sdk.base.BaseComponent</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_setdjicomponentlistener_inline">setComponentListener</a></div></div><div class="inline-doc" id="djibasecomponent_setdjicomponentlistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setComponentListener</h6></div>

~~~java
 void setComponentListener(ComponentListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Sets the listener for the DJI component.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/BaseComponent/DJIBaseComponent_DJIComponentListenerInterface.html#djibasecomponent_djicomponentlistenerinterface">ComponentListener</a> <font color="#000">listener</td><td><font color="#666"><i>The callback of <code><a href="/Components/BaseComponent/DJIBaseComponent_DJIComponentListenerInterface.html#djibasecomponent_djicomponentlistenerinterface">ComponentListener</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djibasecomponent_index"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_index_inline">getIndex</a></div></div><div class="inline-doc" id="djibasecomponent_index_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getIndex</h6></div>

~~~java
 int getIndex() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Returns the component index. Index is zero based. A component will have an index greater than zero when there  are multiple components of the same type on the DJI product, and one of the components already has the index 0.  For instance, M210 can have two gimbal mounted cameras, and will therefore have two gimbal components with indices  0 and 1, and two camera components with indices 0 and 1. For Matrice 600, there are printed numbers on the battery  boxes. The <code><a href="/Components/Battery/DJIBattery.html#djibattery">Battery</a></code> component instance with index 0 corresponds to battery compartment number 1. For Inspire 2  and M200 series, <code><a href="/Components/Battery/DJIBattery.html#djibattery">Battery</a></code> with index 0 corresponds to the battery on the port (left hand) side of the aircraft.  For M210 and M210 RTK, <code><a href="/Components/Camera/DJICamera.html#djicamera">Camera</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal">Gimbal</a></code> with index 0 corresponds to the camera and gimbal on the port  (left hand) side of the aircraft.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of index.</i></td></tr></table></html></div>

<div class="api-row" id="djibasecomponent_connected"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_connected_inline">isConnected</a></div></div><div class="inline-doc" id="djibasecomponent_connected_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isConnected</h6></div>

~~~java
 boolean isConnected() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the component is connected.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the component is connected.</i></td></tr></table></html></div>

<div class="api-row" id="djibasecomponent_getserialnumber"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_getserialnumber_inline">getSerialNumber</a></div></div><div class="inline-doc" id="djibasecomponent_getserialnumber_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSerialNumber</h6></div>

~~~java
 void getSerialNumber(@NonNull CompletionCallbackWith<String> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Gets the serial number of the component. Depending on the component, this serial number might not match the serial number found  on the physical component.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value returned.</i></td></tr></table></html></div>

<div class="api-row" id="djibasecomponent_getfirmwareversion"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_getfirmwareversion_inline">getFirmwareVersion</a></div></div><div class="inline-doc" id="djibasecomponent_getfirmwareversion_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFirmwareVersion</h6></div>

~~~java
 void getFirmwareVersion(@NonNull CompletionCallbackWith<String> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Returns the firmware version of the component. Each component will  have a different firmware version, the combination of which will  form the package firmware version <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct_getfirmwarepackageversion">getFirmwarePackageVersion</a></code> found in <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct">BaseProduct</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>


