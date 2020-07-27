<div class="article"><h1 ><font color="#AAA">class </font>MultiDeviceAggregationState</h1></div>

~~~java
 class MultiDeviceAggregationState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The aggregation state related to devices that can pair to the remote controller.  It contains the pairing  state and the connection state of the device (aircraft or  RTK base station). It is only used when the remote controller supports multi-device  pairing. Only Supported by Phantom 4 RTK.



##### Class Members:

<div class="api-row" id="djiremotecontroller_djircmultideviceaggregationstate_aircraftstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircmultideviceaggregationstate_aircraftstate_inline">getAircraftState</a></div></div><div class="inline-doc" id="djiremotecontroller_djircmultideviceaggregationstate_aircraftstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAircraftState</h6></div>

~~~java
 MultiDeviceState getAircraftState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The device state of aircraft.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircmultidevicestate">MultiDeviceState</a></td><td><font color="#666"><i>An enum value of the <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircmultidevicestate">MultiDeviceState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djircmultideviceaggregationstate_rtkgroundsystemstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircmultideviceaggregationstate_rtkgroundsystemstate_inline">getRtkBaseStationState</a></div></div><div class="inline-doc" id="djiremotecontroller_djircmultideviceaggregationstate_rtkgroundsystemstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRtkBaseStationState</h6></div>

~~~java
 MultiDeviceState getRtkBaseStationState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The device state of RTK base station.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircmultidevicestate">MultiDeviceState</a></td><td><font color="#666"><i>An enum value of the <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djircmultidevicestate">MultiDeviceState</a></code>.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiremotecontroller_djircmultideviceaggregationstate_callbackinterface"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_DJIRCMultiDeviceAggregationState_callbackInterface.html">Callback</a></div></div>
