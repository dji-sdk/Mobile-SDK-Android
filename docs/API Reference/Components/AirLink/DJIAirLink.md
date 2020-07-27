<div class="article"><h1 ><font color="#AAA">class </font>AirLink</h1></div>

~~~java
 class AirLink extends BaseComponent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/BaseComponent/DJIBaseComponent.html#djibasecomponent">BaseComponent</a></code></td></tr></table></html>



##### Description:



<font color="#666">This class contains information about the wireless link between the aircraft and the remote controller, the aircraft and the mobile device or the handheld product and the mobile device. To determine whether a particular wireless link is supported, check the isSupported flag. This object is available from the <code><a href="/Products/Aircraft/DJIAircraft.html#djiaircraft">Aircraft</a></code> or <code><a href="/Products/Handheld/DJIHandheld.html#djihandheld">HandHeld</a></code> object which is a subclass of <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct">BaseProduct</a></code>.



##### Class Members:

<div class="api-row" id="djiairlink_setuplinksignalqualitycallback"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairlink_setuplinksignalqualitycallback_inline">setUplinkSignalQualityCallback</a></div></div><div class="inline-doc" id="djiairlink_setuplinksignalqualitycallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setUplinkSignalQualityCallback</h6></div>

~~~java
 void setUplinkSignalQualityCallback(SignalQualityCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Define a callback to listen for updates on the uplink signal. This link transfers all information from the remote controller to the  aircraft, which is predominantly control information. The callback will be updated when the signal quality changed.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/AirLink/DJIAirlink_SignalQualityCallbackInterface.html#djiairlink_signalqualitycallbackinterface">SignalQualityCallback</a> <font color="#000">callback</td><td><font color="#666"><i>The <code><a href="/Components/AirLink/DJIAirlink_SignalQualityCallbackInterface.html#djiairlink_signalqualitycallbackinterface">SignalQualityCallback</a></code> interface.</i></td></tr></table></html></div>

<div class="api-row" id="djiairlink_setdownlinksignalqualitycallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairlink_setdownlinksignalqualitycallback_inline">setDownlinkSignalQualityCallback</a></div></div><div class="inline-doc" id="djiairlink_setdownlinksignalqualitycallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setDownlinkSignalQualityCallback</h6></div>

~~~java
 void setDownlinkSignalQualityCallback(SignalQualityCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Define a callback to listen for updates on the downlink signal. This link transfers all information from aircraft to remote controller,  which is predominantly video information. Signal quality is a function of signal strength, interference and data rate. Signal quality  will be more susceptible to weak signal strengths or high interference when the data rate is high.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/AirLink/DJIAirlink_SignalQualityCallbackInterface.html#djiairlink_signalqualitycallbackinterface">SignalQualityCallback</a> <font color="#000">callback</td><td><font color="#666"><i>The <code><a href="/Components/AirLink/DJIAirlink_SignalQualityCallbackInterface.html#djiairlink_signalqualitycallbackinterface">SignalQualityCallback</a></code> interface.</i></td></tr></table></html></div>

<div class="api-row" id="djiairlink_setcountrycodecallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairlink_setcountrycodecallback_inline">setCountryCodeCallback</a></div></div><div class="inline-doc" id="djiairlink_setcountrycodecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCountryCodeCallback</h6></div>

~~~java
 void setCountryCodeCallback(CountryCodeCallback countryCodeCallback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Sets the Callback for CountryCode update.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/AirLink/DJIAirLink_CountryCodeCallbackInterface.html#djiairlink_countrycodecallbackinterface">CountryCodeCallback</a> <font color="#000">countryCodeCallback</td><td><font color="#666"><i>The <code><a href="/Components/AirLink/DJIAirLink_CountryCodeCallbackInterface.html#djiairlink_countrycodecallbackinterface">CountryCodeCallback</a></code> interface.</i></td></tr></table></html></div>

<div class="api-row" id="djiairlink_addbasestationsignalqualityupdatedcallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairlink_addbasestationsignalqualityupdatedcallback_inline">addBaseStationSignalQualityUpdatedCallback</a></div></div><div class="inline-doc" id="djiairlink_addbasestationsignalqualityupdatedcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addBaseStationSignalQualityUpdatedCallback</h6></div>

~~~java
 void addBaseStationSignalQualityUpdatedCallback(BaseStationSignalQualityUpdatedCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Adds the Callback for base station signal quality update.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/AirLink/DJIAirLink_BaseStationSignalQualityUpdatedCallbackInterface.html#djiairlink_basestationsignalqualityupdatedcallbackinterface">BaseStationSignalQualityUpdatedCallback</a> <font color="#000">callback</td><td><font color="#666"><i>The <code><a href="/Components/AirLink/DJIAirLink_BaseStationSignalQualityUpdatedCallbackInterface.html#djiairlink_basestationsignalqualityupdatedcallbackinterface">BaseStationSignalQualityUpdatedCallback</a></code> interface.</i></td></tr></table></html></div>

<div class="api-row" id="djiairlink_removebasestationsignalqualityupdatedcallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairlink_removebasestationsignalqualityupdatedcallback_inline">removeBaseStationSignalQualityUpdatedCallback</a></div></div><div class="inline-doc" id="djiairlink_removebasestationsignalqualityupdatedcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeBaseStationSignalQualityUpdatedCallback</h6></div>

~~~java
 void removeBaseStationSignalQualityUpdatedCallback(BaseStationSignalQualityUpdatedCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Removes the Callback for base station signal quality update.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/AirLink/DJIAirLink_BaseStationSignalQualityUpdatedCallbackInterface.html#djiairlink_basestationsignalqualityupdatedcallbackinterface">BaseStationSignalQualityUpdatedCallback</a> <font color="#000">callback</td><td><font color="#666"><i>The <code><a href="/Components/AirLink/DJIAirLink_BaseStationSignalQualityUpdatedCallbackInterface.html#djiairlink_basestationsignalqualityupdatedcallbackinterface">BaseStationSignalQualityUpdatedCallback</a></code> interface.</i></td></tr></table></html></div>

<div class="api-row" id="djiairlink_islbairlinksupported"><div class="api-col left">Lightbridge</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairlink_islbairlinksupported_inline">isLightbridgeLinkSupported</a></div></div><div class="inline-doc" id="djiairlink_islbairlinksupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isLightbridgeLinkSupported</h6></div>

~~~java
 boolean isLightbridgeLinkSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_is_lightbridge_link_supported_key">AirLinkKey.IS_LIGHTBRIDGE_LINK_SUPPORTED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if Lightbridge Air Link is supported.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiairlink_lbairlink"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairlink_lbairlink_inline">getLightbridgeLink</a></div></div><div class="inline-doc" id="djiairlink_lbairlink_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLightbridgeLink</h6></div>

~~~java
 LightbridgeLink getLightbridgeLink() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Returns the Lightbridge Air Link if it is available.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink">LightbridgeLink</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink">LightbridgeLink</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiairlink_isocusynclinksupported"><div class="api-col left">OcuSync</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairlink_isocusynclinksupported_inline">isOcuSyncLinkSupported</a></div></div><div class="inline-doc" id="djiairlink_isocusynclinksupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isOcuSyncLinkSupported</h6></div>

~~~java
 boolean isOcuSyncLinkSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the OcuSync Link is supported. OcuSync Link is only supported by Mavic Pro.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiairlink_ocusynclink"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairlink_ocusynclink_inline">getOcuSyncLink</a></div></div><div class="inline-doc" id="djiairlink_ocusynclink_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getOcuSyncLink</h6></div>

~~~java
 OcuSyncLink getOcuSyncLink() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Returns the OcuSync Link if it is available.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink">OcuSyncLink</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink">OcuSyncLink</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiairlink_iswifilinksupported"><div class="api-col left">WiFi</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairlink_iswifilinksupported_inline">isWiFiLinkSupported</a></div></div><div class="inline-doc" id="djiairlink_iswifilinksupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isWiFiLinkSupported</h6></div>

~~~java
 boolean isWiFiLinkSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_is_wifi_link_supported_key">AirLinkKey.IS_WIFI_LINK_SUPPORTED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if WiFi Air Link is supported.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiairlink_wifilink"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairlink_wifilink_inline">getWiFiLink</a></div></div><div class="inline-doc" id="djiairlink_wifilink_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWiFiLink</h6></div>

~~~java
 WiFiLink getWiFiLink() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Returns the WiFi Air Link if it is available.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink">WiFiLink</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink">WiFiLink</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiairlink_updatecountrycodewithcompletion"><div class="api-col left">Update Country Code</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairlink_updatecountrycodewithcompletion_inline">updateCountryCode</a></div></div><div class="inline-doc" id="djiairlink_updatecountrycodewithcompletion_inline"

><div class="article"><h6 ><font color="#AAA">method </font>updateCountryCode</h6></div>

~~~java
 void updateCountryCode(@Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Update/Sync the latest CountryCode to the DJI Product.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiairlink_isupdatecountrycoderequired"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairlink_isupdatecountrycoderequired_inline">isUpdateCountryCodeRequired</a></div></div><div class="inline-doc" id="djiairlink_isupdatecountrycoderequired_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isUpdateCountryCodeRequired</h6></div>

~~~java
 boolean isUpdateCountryCodeRequired() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Checks if we need to update country code to the DJI Product.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the country code is required to update.</i></td></tr></table></html></div>

<div class="api-row" id="djiairlink_setautoupdatecountrycodeenabled"><div class="api-col left">Auto Update Country Code</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairlink_setautoupdatecountrycodeenabled_inline">setAutoUpdateCountryCodeEnabled</a></div></div><div class="inline-doc" id="djiairlink_setautoupdatecountrycodeenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAutoUpdateCountryCodeEnabled</h6></div>

~~~java
 static void setAutoUpdateCountryCodeEnabled(boolean enabled) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Enable/Disable automatic update CountryCode feature.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable auto update of the country code.</i></td></tr></table></html></div>

<div class="api-row" id="djiairlink_getautoupdatecountrycodeenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairlink_getautoupdatecountrycodeenabled_inline">getAutoUpdateCountryCodeEnabled</a></div></div><div class="inline-doc" id="djiairlink_getautoupdatecountrycodeenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAutoUpdateCountryCodeEnabled</h6></div>

~~~java
 static boolean getAutoUpdateCountryCodeEnabled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Determines if auto update country code is enabled. When it is enabled, SDK will update the country  code to the aircraft automatically when it is required. It is enabled by default and the value is  stored persistently on the device.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static boolean</td><td><font color="#666"><i><code>true</code> if auto update country code is enabled.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiairlink_signalqualitycallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/AirLink/DJIAirlink_SignalQualityCallbackInterface.html">SignalQualityCallback</a></div></div><div class="api-row" id="djiairlink_countrycodecallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/AirLink/DJIAirLink_CountryCodeCallbackInterface.html">CountryCodeCallback</a></div></div><div class="api-row" id="djiairlink_basestationsignalqualityupdatedcallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/AirLink/DJIAirLink_BaseStationSignalQualityUpdatedCallbackInterface.html">BaseStationSignalQualityUpdatedCallback</a></div></div><div class="api-row" id="djilbairlink"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/LBAirLink/DJILBAirLink.html">LightbridgeLink</a></div></div><div class="api-row" id="djiocusynclink"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html">OcuSyncLink</a></div></div><div class="api-row" id="djiwifilink"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/WiFiLink/DJIWiFiLink.html">WiFiLink</a></div></div>

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


