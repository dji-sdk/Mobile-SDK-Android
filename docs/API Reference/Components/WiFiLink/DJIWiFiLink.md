<div class="article"><h1 ><font color="#AAA">class </font>WiFiLink</h1></div>

~~~java
 class WiFiLink extends BaseComponent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/BaseComponent/DJIBaseComponent.html#djibasecomponent">BaseComponent</a></code></td></tr></table></html>



##### Description:



<font color="#666">This class provides methods to change the setting of the product's WiFi. Rebooting WiFi is required in order to make new settings take effect.



##### Class Members:

<div class="api-row" id="djiwifilink_setdjiwifisignalqualitychangedcallback"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwifilink_setdjiwifisignalqualitychangedcallback_inline">setMagneticInterferenceCallback</a></div></div><div class="inline-doc" id="djiwifilink_setdjiwifisignalqualitychangedcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMagneticInterferenceCallback</h6></div>

~~~java
 void setMagneticInterferenceCallback(MagneticInterferenceCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Sets up the callback for WiFi magnetic interference level.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/WiFiLink/DJIWiFiLink_DJIWiFiSignalQualityChangedCallbackInterface.html#djiwifilink_djiwifisignalqualitychangedcallbackinterface">MagneticInterferenceCallback</a> <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiwifilink_setrssicallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwifilink_setrssicallback_inline">setChannelInterferenceCallback</a></div></div><div class="inline-doc" id="djiwifilink_setrssicallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setChannelInterferenceCallback</h6></div>

~~~java
 void setChannelInterferenceCallback(ChannelInterferenceCallback channelInterferenceCallback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_channel_interference_key">AirLinkKey.CHANNEL_INTERFERENCE</a></td></tr></table></html>



##### Description:



<font color="#666">Setter for RSSI callback



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">ChannelInterferenceCallback <font color="#000">channelInterferenceCallback</td><td><font color="#666"><i>your implementation of <code><a href="/Components/WiFiLink/DJIWiFiLink_RSSICallbackInterface.html#djiwifilink_rssicallbackinterface">ChannelInterferenceCallback</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwifilink_rebootwifi"><div class="api-col left">Reboot WiFi</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwifilink_rebootwifi_inline">reboot</a></div></div><div class="inline-doc" id="djiwifilink_rebootwifi_inline"

><div class="article"><h6 ><font color="#AAA">method </font>reboot</h6></div>

~~~java
 void reboot(final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_reboot_key">AirLinkKey.REBOOT</a></td></tr></table></html>



##### Description:



<font color="#666">Reboot WiFi to enable new settings to take effect.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiwifilink_setwifissid"><div class="api-col left">WiFi SSID</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwifilink_setwifissid_inline">setSSID</a></div></div><div class="inline-doc" id="djiwifilink_setwifissid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSSID</h6></div>

~~~java
 void setSSID(String ssid, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_ssid_key">AirLinkKey.SSID</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the WiFi SSID. The setting will take effect only after the product reboots.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String <font color="#000">ssid</td><td><font color="#666"><i>The WiFi SSID to change. It should only include alphabetic characters, numbers, spaces, '-' and should not be  more than 30 characters.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Remote execution result error callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiwifilink_getwifissid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwifilink_getwifissid_inline">getSSID</a></div></div><div class="inline-doc" id="djiwifilink_getwifissid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSSID</h6></div>

~~~java
 void getSSID(final CompletionCallbackWith<String> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_ssid_key">AirLinkKey.SSID</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the WiFi SSID.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiwifilink_setwifipassword"><div class="api-col left">WiFi Password</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwifilink_setwifipassword_inline">setPassword</a></div></div><div class="inline-doc" id="djiwifilink_setwifipassword_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPassword</h6></div>

~~~java
 void setPassword(String password, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_password_key">AirLinkKey.PASSWORD</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the WiFi Password.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String <font color="#000">password</td><td><font color="#666"><i>The new WiFi password. It must be at least 8 characters and can only includes alphabetic characters and numbers.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Remote execution result error callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiwifilink_getwifipassword"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwifilink_getwifipassword_inline">getPassword</a></div></div><div class="inline-doc" id="djiwifilink_getwifipassword_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPassword</h6></div>

~~~java
 void getPassword(final CompletionCallbackWith<String> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_password_key">AirLinkKey.PASSWORD</a></td></tr></table></html>



##### Description:



<font color="#666">Get the WiFi Password.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiwifilink_setwififrequencyband"><div class="api-col left">WiFi Frequency Band</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwifilink_setwififrequencyband_inline">setFrequencyBand</a></div></div><div class="inline-doc" id="djiwifilink_setwififrequencyband_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFrequencyBand</h6></div>

~~~java
 void setFrequencyBand(WiFiFrequencyBand frequencyBand, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_wifi_frequency_band_key">AirLinkKey.WIFI_FREQUENCY_BAND</a></td></tr></table></html>



##### Description:



<font color="#666">It is not supported by Spark or Mavic Air. For these products, set different channel  numbers to select the frequency band. It is not supported by Mavic Mini.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_djiwififrequencyband">WiFiFrequencyBand</a> <font color="#000">frequencyBand</td><td><font color="#666"><i>WiFi frequency band to change to.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiwifilink_getwififrequencyband"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwifilink_getwififrequencyband_inline">getFrequencyBand</a></div></div><div class="inline-doc" id="djiwifilink_getwififrequencyband_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFrequencyBand</h6></div>

~~~java
 void getFrequencyBand(final CompletionCallbackWith<WiFiFrequencyBand> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_wifi_frequency_band_key">AirLinkKey.WIFI_FREQUENCY_BAND</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the current WiFi frequency band. It is not supported by Spark or Mavic Air.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;<a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_djiwififrequencyband">WiFiFrequencyBand</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiwifilink_setchannelselectionmode"><div class="api-col left">Channel Selection Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwifilink_setchannelselectionmode_inline">setSelectionMode</a></div></div><div class="inline-doc" id="djiwifilink_setchannelselectionmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSelectionMode</h6></div>

~~~java
 void setSelectionMode(WiFiSelectionMode mode, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Sets the channel selection mode. Both channel number and bandwidth can be changed.  If the 5 GHz band is available,  then channels from that band can also be used. .



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">WiFiSelectionMode <font color="#000">mode</td><td><font color="#666"><i>Selection mode to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiwifilink_getchannelselectionmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwifilink_getchannelselectionmode_inline">getSelectionMode</a></div></div><div class="inline-doc" id="djiwifilink_getchannelselectionmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSelectionMode</h6></div>

~~~java
 void getSelectionMode(final CompletionCallbackWith<WiFiSelectionMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Gets the channel selection mode. .



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;WiFiSelectionMode&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiwifilink_setwifichannel"><div class="api-col left">WiFi Channel</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwifilink_setwifichannel_inline">setChannelNumber</a></div></div><div class="inline-doc" id="djiwifilink_setwifichannel_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setChannelNumber</h6></div>

~~~java
 void setChannelNumber(int channelNumber, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_channel_number_key">AirLinkKey.CHANNEL_NUMBER</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the WiFi channel. <code><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_setwifichannel">setChannelNumber</a></code>  must be used to determine which channels are possible to set. When a new channel is set,  the WiFi on the product will reboot. The channel can only be changed when the product is not flying. Supported by Mavic Pro & Mavic Mini.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">channelNumber</td><td><font color="#666"><i>Index of the channel to select.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiwifilink_getwifichannel"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwifilink_getwifichannel_inline">getChannelNumber</a></div></div><div class="inline-doc" id="djiwifilink_getwifichannel_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getChannelNumber</h6></div>

~~~java
 void getChannelNumber(final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_channel_number_key">AirLinkKey.CHANNEL_NUMBER</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the WiFi channel. Channels 1-13 are in the 2.4 GHz band. Other channels are in the 5 GHz band.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiwifilink_getavailablechannels"><div class="api-col left">Get Available Channels</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwifilink_getavailablechannels_inline">getAvailableChannelNumbers</a></div></div><div class="inline-doc" id="djiwifilink_getavailablechannels_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAvailableChannelNumbers</h6></div>

~~~java
 void getAvailableChannelNumbers(final CompletionCallbackWith<Integer[]> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_available_channel_numbers_key">AirLinkKey.AVAILABLE_CHANNEL_NUMBERS</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the channels available for the current frequency band. When <code>FREQUENCY_BAND_DUAL</code>  is  selected, channels for both 2.4GHz and 5GHz are available. Supported only by Mavic Pro & Mavic Mini.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;Integer[]&gt; <font color="#000">callback</td><td><font color="#666"><i>The completion block with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiwifilink_setdatarate"><div class="api-col left">WiFi Data Rate</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwifilink_setdatarate_inline">setDataRate</a></div></div><div class="inline-doc" id="djiwifilink_setdatarate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setDataRate</h6></div>

~~~java
 void setDataRate(WifiDataRate rate, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_data_rate_key">AirLinkKey.DATA_RATE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the WiFi data rate (throughput). Higher data rates increase the quality of video transmission, but can only be  used at shorter ranges. It is not supported by Spark or Mavic Air.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_djiwifidatarate">WifiDataRate</a> <font color="#000">rate</td><td><font color="#666"><i>Data rate (throughput).</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiwifilink_getdatarate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwifilink_getdatarate_inline">getDataRate</a></div></div><div class="inline-doc" id="djiwifilink_getdatarate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDataRate</h6></div>

~~~java
 void getDataRate(final CompletionCallbackWith<WifiDataRate> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_data_rate_key">AirLinkKey.DATA_RATE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the current data rate (throughput). It is not supported by Spark or Mavic Air.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;<a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_djiwifidatarate">WifiDataRate</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiwifilink_djiwifisignalqualitychangedcallbackinterface"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/WiFiLink/DJIWiFiLink_DJIWiFiSignalQualityChangedCallbackInterface.html">MagneticInterferenceCallback</a></div></div><div class="api-row" id="djiwifilink_rssicallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/WiFiLink/DJIWiFiLink_RSSICallbackInterface.html">ChannelInterferenceCallback</a></div></div><div class="api-row" id="djiwifilink_djiwififrequencyband"><div class="api-col left">Information</div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwifilink_djiwififrequencyband_inline">WiFiFrequencyBand</a></div></div><div class="inline-doc" id="djiwifilink_djiwififrequencyband_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>WiFiFrequencyBand</h6></div>

~~~java
@EXClassNullAway
 enum WiFiFrequencyBand 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_wifi_frequency_band_key">AirLinkKey.WIFI_FREQUENCY_BAND</a></td></tr></table></html>



##### Description:



<font color="#666">WiFi frequency band.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwifilink_djiwififrequencyband_2dot4g_inline"></a>FREQUENCY_BAND_ONLY_2_DOT_4</td><td><font color="#666">The WiFi Frequency band is 2.4 GHz.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwifilink_djiwififrequencyband_5g_inline"></a>FREQUENCY_BAND_5_GHZ</td><td><font color="#666">The WiFi Frequency band is 5 GHz.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwifilink_djiwififrequencyband_dualband_inline"></a>FREQUENCY_BAND_DUAL</td><td><font color="#666">Dual frequency band mode. The WiFi frequency band can be either 2.4 GHz or 5 GHz.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwifilink_djiwififrequencyband_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The WiFi Frequency is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiwifilink_djiwifichannelinterference"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/WiFiLink/DJIWiFiLink_DJIWiFiChannelInterference.html">WifiChannelInterference</a></div></div><div class="api-row" id="djiwifilink_djiwifisignalquality"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwifilink_djiwifisignalquality_inline">WiFiMagneticInterferenceLevel</a></div></div><div class="inline-doc" id="djiwifilink_djiwifisignalquality_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>WiFiMagneticInterferenceLevel</h6></div>

~~~java
@EXClassNullAway
 enum WiFiMagneticInterferenceLevel 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_magnetic_interference_key">AirLinkKey.MAGNETIC_INTERFERENCE</a></td></tr></table></html>



##### Description:



<font color="#666">WiFi magnetic interference - as measured by Osmo, Phantom 3 4K and Phantom 3 Standard.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwifilink_djiwifisignalquality_good_inline"></a>LOW</td><td><font color="#666">WiFi magnetic interference is low.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwifilink_djiwifisignalquality_medium_inline"></a>MEDIUM</td><td><font color="#666">WiFi magnetic interference is medium. At this level, the video quality will be degraded compared to when the signal quality is low.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwifilink_djiwifisignalquality_bad_inline"></a>HIGH</td><td><font color="#666">WiFi magnetic interference is high. At this level, the video quality will be degraded compared to when the signal quality is medium.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwifilink_djiwifisignalquality_unknown_inline"></a>UNKNOWN</td><td><font color="#666">WiFi magnetic interference is Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiwifilink_djiwifidatarate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwifilink_djiwifidatarate_inline">WifiDataRate</a></div></div><div class="inline-doc" id="djiwifilink_djiwifidatarate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>WifiDataRate</h6></div>

~~~java
@EXClassNullAway
 enum WifiDataRate 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_data_rate_key">AirLinkKey.DATA_RATE</a></td></tr></table></html>



##### Description:



<font color="#666">WiFi data rate. Lower rates are used for longer ranges, but will have lower video quality.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwifilink_djiwifidatarate_1mbps_inline"></a>RATE_1_MBPS</td><td><font color="#666">1 Mbps.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwifilink_djiwifidatarate_2mbps_inline"></a>RATE_2_MBPS</td><td><font color="#666">2 Mbps.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwifilink_djiwifidatarate_4mbps_inline"></a>RATE_4_MBPS</td><td><font color="#666">4 Mbps.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwifilink_djiwifidatarate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

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


