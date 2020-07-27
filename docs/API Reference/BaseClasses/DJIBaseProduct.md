<div class="article"><h1 ><font color="#AAA">class </font>BaseProduct</h1></div>

~~~java
 class BaseProduct 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Abstract class for all DJI Products. <code><a href="/Products/Aircraft/DJIAircraft.html#djiaircraft">Aircraft</a></code> and <code><a href="/Products/Handheld/DJIHandheld.html#djihandheld">HandHeld</a></code> objects are subclasses of <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct">BaseProduct</a></code> and can be accessed from <code><a href="/Components/SDKManager/DJISDKManager.html#djisdkmanager_product">getProduct</a></code> in <code><a href="/Components/SDKManager/DJISDKManager.html#djisdkmanager">DJISDKManager</a></code>. Additional components can be found in <code><a href="/Products/Aircraft/DJIAircraft.html#djiaircraft">Aircraft</a></code> and <code><a href="/Products/Handheld/DJIHandheld.html#djihandheld">HandHeld</a></code> that are unique to those products only.



##### Class Members:

<div class="api-row" id="djibaseproduct_setupdatediagnosticslistcallback"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibaseproduct_setupdatediagnosticslistcallback_inline">setDiagnosticsInformationCallback</a></div></div><div class="inline-doc" id="djibaseproduct_setupdatediagnosticslistcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setDiagnosticsInformationCallback</h6></div>

~~~java
 void setDiagnosticsInformationCallback(DiagnosticsInformationCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Sets up the diagnostics list update callback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Diagnostics/DJIDiagnostics_DiagnosticsInformationCallbackInterface.html#djidiagnostics_diagnosticsinformationcallbackinterface">DiagnosticsInformationCallback</a> <font color="#000">callback</td><td><font color="#666"><i>The callback of <code><a href="/Components/Diagnostics/DJIDiagnostics_DiagnosticsInformationCallbackInterface.html#djidiagnostics_diagnosticsinformationcallbackinterface">DiagnosticsInformationCallback</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djibaseproduct_getfirmwarepackageversion"><div class="api-col left">Information</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibaseproduct_getfirmwarepackageversion_inline">getFirmwarePackageVersion</a></div></div><div class="inline-doc" id="djibaseproduct_getfirmwarepackageversion_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFirmwarePackageVersion</h6></div>

~~~java
 String getFirmwarePackageVersion() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIProductKey.html#productkey_firmware_package_version_key">ProductKey.FIRMWARE_PACKAGE_VERSION</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the product's firmware package version. Products other than Phantom 4, Phantom 4 Pro, Mavic Pro, and Inspire 2, require internet connection. The execution time for this method depends on the speed of internet connectivity.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>The product's firmware package version string.</i></td></tr></table></html></div>

<div class="api-row" id="djibaseproduct_setname"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibaseproduct_setname_inline">setName</a></div></div><div class="inline-doc" id="djibaseproduct_setname_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setName</h6></div>

~~~java
 void setName(@NonNull String name, @Nullable final CommonCallbacks.CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Retrieves the model of the product.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull String <font color="#000">name</td><td><font color="#666"><i>Name to be set to the aircraft.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Asynchronous execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djibaseproduct_getname"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibaseproduct_getname_inline">getName</a></div></div><div class="inline-doc" id="djibaseproduct_getname_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getName</h6></div>

~~~java
 void getName(final CommonCallbacks.CompletionCallbackWith<String> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Retrieves the model of the product.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value.</i></td></tr></table></html></div>

<div class="api-row" id="djibaseproduct_model"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibaseproduct_model_inline">getModel</a></div></div><div class="inline-doc" id="djibaseproduct_model_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getModel</h6></div>

~~~java
 Model getModel() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIProductKey.html#productkey_model_name_key">ProductKey.MODEL_NAME</a></td></tr></table></html>



##### Description:



<font color="#666">Retrieves the model of the product. See <code><a href="/Products/Aircraft/DJIAircraft.html#djiaircraft">Aircraft</a></code> and <code><a href="/Products/Handheld/DJIHandheld.html#djihandheld">HandHeld</a></code> for the possible strings that can be returned.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/BaseClasses/DJIBaseProduct.html#djimodelnamestring">Model</a></td><td><font color="#666"><i>The model of the product.</i></td></tr></table></html></div>

<div class="api-row" id="djibaseproduct_connected"><div class="api-col left">Connectivity</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibaseproduct_connected_inline">isConnected</a></div></div><div class="inline-doc" id="djibaseproduct_connected_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isConnected</h6></div>

~~~java
 boolean isConnected() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIProductKey.html#productkey_connection_key">ProductKey.CONNECTION</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the device is connected.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the device is connected.</i></td></tr></table></html></div>

<div class="api-row" id="djibaseproduct_getcamera"><div class="api-col left">Components</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibaseproduct_getcamera_inline">getCamera</a></div></div><div class="inline-doc" id="djibaseproduct_getcamera_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCamera</h6></div>

~~~java
 Camera getCamera() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Retrieves an instance of the device's camera. Only supported by the product with single gimbal, except Zenmuse XT2 and Mavic 2 Enterprise Camera.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera.html#djicamera">Camera</a></td><td><font color="#666"><i>An instance of the aircraft's camera.</i></td></tr></table></html></div>

<div class="api-row" id="djibaseproduct_getbattery"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibaseproduct_getbattery_inline">getBattery</a></div></div><div class="inline-doc" id="djibaseproduct_getbattery_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBattery</h6></div>

~~~java
 Battery getBattery() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Retrieves an instance of the product's smart battery. When using products with multiple batteries, such as the M600 or Inspire 2, use <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct_getbatteries">getBatteries</a></code>, as this method will only return a single battery.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Battery</td><td><font color="#666"><i>An instance of the aircraft's smart battery.</i></td></tr></table></html></div>

<div class="api-row" id="djibaseproduct_getbatteries"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibaseproduct_getbatteries_inline">getBatteries</a></div></div><div class="inline-doc" id="djibaseproduct_getbatteries_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBatteries</h6></div>

~~~java
 synchronized List<Battery> getBatteries() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Returns an array of aircraft's batteries. It is used when the aircraft has multiple batteries, e.g. Matrice 600.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">synchronized List&lt;Battery&gt;</td><td><font color="#666"><i>A List of <code><a href="/Components/Battery/DJIBattery.html#djibattery">Battery</a></code> objects.</i></td></tr></table></html></div>

<div class="api-row" id="djibaseproduct_getgimbal"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibaseproduct_getgimbal_inline">getGimbal</a></div></div><div class="inline-doc" id="djibaseproduct_getgimbal_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getGimbal</h6></div>

~~~java
 Gimbal getGimbal() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Retrieves an instance of the device's gimbal.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Gimbal/DJIGimbal.html#djigimbal">Gimbal</a></td><td><font color="#666"><i>An instance of the aircraft's gimbal.</i></td></tr></table></html></div>

<div class="api-row" id="djibaseproduct_getairlink"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibaseproduct_getairlink_inline">getAirLink</a></div></div><div class="inline-doc" id="djibaseproduct_getairlink_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAirLink</h6></div>

~~~java
 AirLink getAirLink() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Retrieves an instance of the device's AirLink.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/AirLink/DJIAirLink.html#djiairlink">AirLink</a></td><td><font color="#666"><i>An instance of the aircraft's AirLink.</i></td></tr></table></html></div>

<div class="api-row" id="djibaseproduct_getaccessoryaggregation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibaseproduct_getaccessoryaggregation_inline">getAccessoryAggregation</a></div></div><div class="inline-doc" id="djibaseproduct_getaccessoryaggregation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAccessoryAggregation</h6></div>

~~~java
@Nullable
 AccessoryAggregation getAccessoryAggregation() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Retrieves an instance of the accessory aggregation.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation.html#djiaccessoryaggregation">AccessoryAggregation</a></td><td><font color="#666"><i>'NULL' if the product does not support accessories (e.g. spotlight, speaker or beacon).</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djibaseproduct_componentkey"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djibaseproduct_componentkey_inline">ComponentKey</a></div></div><div class="inline-doc" id="djibaseproduct_componentkey_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ComponentKey</h6></div>

~~~java
 enum ComponentKey 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Specifies all the components.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djibaseproduct_componentkey_camera_inline"></a>CAMERA</td><td><font color="#666">Camera component.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibaseproduct_componentkey_gimbal_inline"></a>GIMBAL</td><td><font color="#666">Gimbal component.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibaseproduct_componentkey_remotecontroller_inline"></a>REMOTE_CONTROLLER</td><td><font color="#666">Remote Controller component.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibaseproduct_componentkey_flightcontroller_inline"></a>FLIGHT_CONTROLLER</td><td><font color="#666">Flight Controller component.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibaseproduct_componentkey_battery_inline"></a>BATTERY</td><td><font color="#666">Battery component.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibaseproduct_componentkey_handheldcontroller_inline"></a>HAND_HELD_CONTROLLER</td><td><font color="#666">Handheld Controller component.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibaseproduct_componentkey_airlink_inline"></a>AIR_LINK</td><td><font color="#666">AirLink component.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibaseproduct_componentkey_mobileremotecontroller_inline"></a>MOBILE_REMOTE_CONTROLLER</td><td><font color="#666">Mobile remote controller component.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibaseproduct_componentkey_accessoryaggregation_inline"></a>ACCESSORY_AGGREGATION</td><td><font color="#666">Accessory aggregation component.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibaseproduct_componentkey_basestation_inline"></a>BASE_STATION</td><td><font color="#666">The RTK base station component.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djimodelnamestring"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djimodelnamestring_inline">Model</a></div></div><div class="inline-doc" id="djimodelnamestring_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>Model</h6></div>

~~~java
@EXClassNullAway
@Keep
 enum Model 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.product</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIProductKey.html#productkey_model_name_key">ProductKey.MODEL_NAME</a></td></tr></table></html>



##### Description:



<font color="#666">Class containing all product strings.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnameunknownaircraft_inline"></a>UNKNOWN_AIRCRAFT</td><td><font color="#666">The Aircraft's model name is unknown.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnameinspire1_inline"></a>INSPIRE_1</td><td><font color="#666">The aircraft's model name is Inspire 1.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnameinspire1pro_inline"></a>INSPIRE_1_PRO</td><td><font color="#666">The aircraft's model name is Inspire 1 Pro.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnameinspire1raw_inline"></a>INSPIRE_1_RAW</td><td><font color="#666">The aircraft's model name is Inspire 1 Raw.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnameinspire2_inline"></a>INSPIRE_2</td><td><font color="#666">The aircraft's model name is Inspire 2.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamephantom3professional_inline"></a>PHANTOM_3_PROFESSIONAL</td><td><font color="#666">The aircraft's model name is Phantom 3 Professional.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamephantom3advanced_inline"></a>PHANTOM_3_ADVANCED</td><td><font color="#666">The aircraft's model name is Phantom 3 Advanced.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamephantom3standard_inline"></a>PHANTOM_3_STANDARD</td><td><font color="#666">The aircraft's model name is Phantom 3 Standard.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamephantom34k_inline"></a>Phantom_3_4K</td><td><font color="#666">The aircraft's model name is Phantom 3 4K.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamephantom4_inline"></a>PHANTOM_4</td><td><font color="#666">The aircraft's model name is Phantom 4.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamephantom4pro_inline"></a>PHANTOM_4_PRO</td><td><font color="#666">The aircraft's model name is Phantom 4 Pro.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamephantom4prov2_inline"></a>PHANTOM_4_PRO_V2</td><td><font color="#666">The aircraft's model name is Phantom 4 Pro V2.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamephantom4multispectral_inline"></a>P_4_MULTISPECTRAL</td><td><font color="#666">The aircraft's model name is P4 Multispectral.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamematrice100_inline"></a>MATRICE_100</td><td><font color="#666">The aircraft's model name is Matrice 100.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamematrice600_inline"></a>MATRICE_600</td><td><font color="#666">The aircraft's model name is Matrice 600.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamematrice600pro_inline"></a>MATRICE_600_PRO</td><td><font color="#666">The aircraft's model name is Matrice 600 Pro.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamea3_inline"></a>A3</td><td><font color="#666">The aircraft flight controller's model name is A3.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamemavicpro_inline"></a>MAVIC_PRO</td><td><font color="#666">The aircraft's model name is Mavic Pro.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamespark_inline"></a>Spark</td><td><font color="#666">The aircraft's model name is Spark.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamematrice210_inline"></a>MATRICE_210</td><td><font color="#666">The aircraft's model name is Matrice 210.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamematrice210rtk_inline"></a>MATRICE_210_RTK</td><td><font color="#666">The aircraft's model name is Matrice 210 RTK.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamematrice200v2_inline"></a>MATRICE_200_V2</td><td><font color="#666">The aircraft's model name is Matrice 200 V2.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamematrice210v2_inline"></a>MATRICE_210_V2</td><td><font color="#666">The aircraft's model name is Matrice 210 V2.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamematrice210rtkv2_inline"></a>MATRICE_210_RTK_V2</td><td><font color="#666">The aircraft's model name is Matrice 210 RTK V2.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamematrice300rtk_inline"></a>MATRICE_300_RTK</td><td><font color="#666">The aircraft's model name is Matrice 300 RTK.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamemavicair_inline"></a>MAVIC_AIR</td><td><font color="#666">The aircraft's model name is Mavic Air.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamemavic2pro_inline"></a>MAVIC_2_PRO</td><td><font color="#666">The aircraft's model name is Mavic 2 Pro.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamemavic2zoom_inline"></a>MAVIC_2_ZOOM</td><td><font color="#666">The aircraft's model name is Mavic 2 Zoom.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamemavic2_inline"></a>MAVIC_2</td><td><font color="#666">The aircraft's model name is either Mavic 2 Pro or Mavic 2 Zoom.  The camera is not recognized yet.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamemavic2enterprise_inline"></a>MAVIC_2_ENTERPRISE</td><td><font color="#666">The aircraft's model name is Mavic 2 Enterprise.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamemavic2enterprisedual_inline"></a>MAVIC_2_ENTERPRISE_DUAL</td><td><font color="#666">The aircraft's model name is Mavic 2 Enterprise Dual.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamemavicmini_inline"></a>MAVIC_MINI</td><td><font color="#666">The aircraft's model name is Mavic Mini.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaircraft_djiaircraftmodelnamen3_inline"></a>N3</td><td><font color="#666">The aircraft flight controller's model name is N3.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheld_djihandheldmodelnameunknownhandheld_inline"></a>UNKNOWN_HANDHELD</td><td><font color="#666">Handheld device model name unknown.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheld_djihandheldmodelnameosmo_inline"></a>OSMO</td><td><font color="#666">Handheld device model name Osmo.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheld_djihandheldmodelnameosmopro_inline"></a>OSMO_PRO</td><td><font color="#666">Handheld device model name Osmo Pro.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheld_djihandheldmodelnameosmoraw_inline"></a>OSMO_RAW</td><td><font color="#666">Handheld device model name Osmo RAW.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheld_djihandheldmodelnameosmomobile_inline"></a>OSMO_MOBILE</td><td><font color="#666">Handheld device model name Osmo Mobile.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheld_djihandheldmodelnameosmoplus_inline"></a>OSMO_PLUS</td><td><font color="#666">Handheld device model name Osmo+.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheld_djihandheldmodelnameosmomobile2_inline"></a>OSMO_MOBILE_2</td><td><font color="#666">Handheld device model name Osmo Mobile 2.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djivideofeeder"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/BaseClasses/DJIVideoFeeder.html">VideoFeeder</a></div></div>
