<div class="article"><h1 ><font color="#AAA">class </font>Callback</h1></div>

~~~java
 interface Callback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.imu</td></tr></table></html>



##### Description:



<font color="#666">Callback interface that is used to receive IMU state from flight controller.



##### Class Members:



#### Callback Method

<div class="api-row" id="djiflightcontroller_updateimustate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_updateimustate_inline">onUpdate</a></div></div><div class="inline-doc" id="djiflightcontroller_updateimustate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
        void onUpdate(@NonNull IMUState state)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.imu</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_imu_state_key">FlightControllerKey.IMU_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">Called when the flight controller pushes an IMU state update. The callback method would not be called if the aircraft is flying.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/IMUState/DJIIMUState.html#djiimustate">IMUState</a> <font color="#000">state</td><td><font color="#666"><i>Information about the IMU state pushed by the flight controller.</i></td></tr></table></html></div>


