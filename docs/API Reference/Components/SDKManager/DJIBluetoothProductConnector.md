<div class="article"><h1 ><font color="#AAA">class </font>BluetoothProductConnector</h1></div>

~~~java
 class BluetoothProductConnector 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Some DJI products can be controlled using the Mobile SDK over a Bluetooth wireless  connection. This class contains methods to search for, connect to, and disconnect from such products.



##### Class Members:

<div class="api-row" id="djibluetoothproductconnector_setbluetoothproductconnectorlistener"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibluetoothproductconnector_setbluetoothproductconnectorlistener_inline">setBluetoothDevicesListCallback</a></div></div><div class="inline-doc" id="djibluetoothproductconnector_setbluetoothproductconnectorlistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setBluetoothDevicesListCallback</h6></div>

~~~java
 void setBluetoothDevicesListCallback(@Nullable BluetoothDevicesListCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Set DJIBluetoothProductConnector Listener.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/SDKManager/DJIBluetoothProductConnector_BluetoothProductConnectorListenerInterface.html#djibluetoothproductconnector_bluetoothproductconnectorlistenerinterface">BluetoothDevicesListCallback</a> <font color="#000">callback</td><td><font color="#666"><i>The callback of <code><a href="/Components/SDKManager/DJIBluetoothProductConnector_BluetoothProductConnectorListenerInterface.html#djibluetoothproductconnector_bluetoothproductconnectorlistenerinterface">BluetoothDevicesListCallback</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djibluetoothproductconnector_searchbluetoothproducts"><div class="api-col left">Search</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibluetoothproductconnector_searchbluetoothproducts_inline">searchBluetoothProducts</a></div></div><div class="inline-doc" id="djibluetoothproductconnector_searchbluetoothproducts_inline"

><div class="article"><h6 ><font color="#AAA">method </font>searchBluetoothProducts</h6></div>

~~~java
 void searchBluetoothProducts(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Used to start searching for DJI Products that are near the mobile device and can be controlled with the Mobile  SDK using Bluetooth. Use <code><a href="/Components/SDKManager/DJIBluetoothProductConnector_BluetoothProductConnectorListenerInterface.html#djibluetoothproductconnector_connectordidfindproducts">onUpdate</a></code> to receive the product list.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion block returns the command execution result. It is called once the searching is started.</i></td></tr></table></html></div>

<div class="api-row" id="djibluetoothproductconnector_connectproductwithcompletion"><div class="api-col left">Connection</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibluetoothproductconnector_connectproductwithcompletion_inline">connect</a></div></div><div class="inline-doc" id="djibluetoothproductconnector_connectproductwithcompletion_inline"

><div class="article"><h6 ><font color="#AAA">method </font>connect</h6></div>

~~~java
 void connect(BluetoothDevice product, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Connects to the DJI product using Bluetooth. Once it is connected, <code><a href="/Components/SDKManager/DJISDKManager.html#djisdkmanager">DJISDKManager</a></code> can be used to access the product.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKManager/DJIBluetoothProductConnector_DJIBluetoothDevice.html#djibluetoothproductconnector_djibluetoothdevice">BluetoothDevice</a> <font color="#000">product</td><td><font color="#666"><i>The Bluetooth product to connect to.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The completion block returns the command execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djibluetoothproductconnector_disconnectproduct"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibluetoothproductconnector_disconnectproduct_inline">disconnect</a></div></div><div class="inline-doc" id="djibluetoothproductconnector_disconnectproduct_inline"

><div class="article"><h6 ><font color="#AAA">method </font>disconnect</h6></div>

~~~java
 void disconnect(final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Disconnects connected Bluetooth product.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The completion block returns the command execution result.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djibluetoothproductconnector_bluetoothproductconnectorlistenerinterface"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/SDKManager/DJIBluetoothProductConnector_BluetoothProductConnectorListenerInterface.html">BluetoothDevicesListCallback</a></div></div><div class="api-row" id="djibluetoothproductconnector_djibluetoothdevice"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/SDKManager/DJIBluetoothProductConnector_DJIBluetoothDevice.html">BluetoothDevice</a></div></div>
