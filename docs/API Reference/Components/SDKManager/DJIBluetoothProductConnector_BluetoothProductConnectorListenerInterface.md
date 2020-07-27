<div class="article"><h1 ><font color="#AAA">class </font>BluetoothDevicesListCallback</h1></div>

~~~java
 interface BluetoothDevicesListCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Delegate that receives the product list found by the connector.



##### Class Members:

<div class="api-row" id="djibluetoothproductconnector_connectordidfindproducts"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibluetoothproductconnector_connectordidfindproducts_inline">onUpdate</a></div></div><div class="inline-doc" id="djibluetoothproductconnector_connectordidfindproducts_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
        void onUpdate(@NonNull List<BluetoothDevice> devices)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Provides the list of DJI products that can be connected with the mobile device over Bluetooth. Delegate will  continue to receive an updated list after <code><a href="/Components/SDKManager/DJIBluetoothProductConnector.html#djibluetoothproductconnector_searchbluetoothproducts">searchBluetoothProducts</a></code> is called  until the searching is finished (either product is connected or after 10s).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull List&lt;<a href="/Components/SDKManager/DJIBluetoothProductConnector_DJIBluetoothDevice.html#djibluetoothproductconnector_djibluetoothdevice">BluetoothDevice</a>&gt; <font color="#000">devices</td><td><font color="#666"><i>A list of DJI products found by the connector.</i></td></tr></table></html></div>


