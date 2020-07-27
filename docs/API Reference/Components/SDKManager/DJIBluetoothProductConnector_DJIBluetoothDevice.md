<div class="article"><h1 ><font color="#AAA">class </font>BluetoothDevice</h1></div>

~~~java
 class BluetoothDevice 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">This class contains information for a DJI Bluetooth device.



##### Class Members:

<div class="api-row" id="djibluetoothproductconnector_djibluetoothdevice_getname"><div class="api-col left">Get Name</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibluetoothproductconnector_djibluetoothdevice_getname_inline">getName</a></div></div><div class="inline-doc" id="djibluetoothproductconnector_djibluetoothdevice_getname_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getName</h6></div>

~~~java
 String getName() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Returns the name of the Bluetooth device.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>A string representing the name.</i></td></tr></table></html></div>

<div class="api-row" id="djibluetoothproductconnector_djibluetoothdevice_getstatus"><div class="api-col left">Get Status</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibluetoothproductconnector_djibluetoothdevice_getstatus_inline">getStatus</a></div></div><div class="inline-doc" id="djibluetoothproductconnector_djibluetoothdevice_getstatus_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getStatus</h6></div>

~~~java
 BluetoothDeviceStatus getStatus() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Returns connection status for the Bluetooth device.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKManager/DJIBluetoothProductConnector_DJIBluetoothDevice.html#djibluetoothproductconnector_djibluetoothdevice_djibluetoothdevicestatus">BluetoothDeviceStatus</a></td><td><font color="#666"><i>The enum value of <code><a href="/Components/SDKManager/DJIBluetoothProductConnector_DJIBluetoothDevice.html#djibluetoothproductconnector_djibluetoothdevice_djibluetoothdevicestatus">BluetoothDeviceStatus</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djibluetoothproductconnector_djibluetoothdevice_getrssi"><div class="api-col left">Get Rssi</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibluetoothproductconnector_djibluetoothdevice_getrssi_inline">getRssi</a></div></div><div class="inline-doc" id="djibluetoothproductconnector_djibluetoothdevice_getrssi_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRssi</h6></div>

~~~java
 int getRssi() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Returns the signal quality.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An Integer representing the signal quality.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djibluetoothproductconnector_djibluetoothdevice_djibluetoothdevicestatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djibluetoothproductconnector_djibluetoothdevice_djibluetoothdevicestatus_inline">BluetoothDeviceStatus</a></div></div><div class="inline-doc" id="djibluetoothproductconnector_djibluetoothdevice_djibluetoothdevicestatus_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>BluetoothDeviceStatus</h6></div>

~~~java
 enum BluetoothDeviceStatus 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">DJI Bluetooth device status enum.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djibluetoothproductconnector_djibluetoothdevice_djibluetoothdevicestatus_connected_inline"></a>CONNECTED</td><td><font color="#666">Bluetooth device connected.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibluetoothproductconnector_djibluetoothdevice_djibluetoothdevicestatus_disconnected_inline"></a>DISCONNECTED</td><td><font color="#666">Bluetooth device disconnected.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibluetoothproductconnector_djibluetoothdevice_djibluetoothdevicestatus_connecting_inline"></a>CONNECTING</td><td><font color="#666">Bluetooth device connecting.</td></tr></table></html>

##### Class Members:

</div>


