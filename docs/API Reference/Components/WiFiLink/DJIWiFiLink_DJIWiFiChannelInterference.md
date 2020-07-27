<div class="article"><h1 ><font color="#AAA">class </font>WifiChannelInterference</h1></div>

~~~java
@EXClassNullAway
 class WifiChannelInterference 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_channel_interference_key">AirLinkKey.CHANNEL_INTERFERENCE</a></td></tr></table></html>



##### Description:



<font color="#666">The interference power of a WiFi channel.



##### Class Members:

<div class="api-row" id="djiwifilink_djiwifichannelinterference_power"><div class="api-col left">Value</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwifilink_djiwifichannelinterference_power_inline">getPower</a></div></div><div class="inline-doc" id="djiwifilink_djiwifichannelinterference_power_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPower</h6></div>

~~~java
 int getPower() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.airlink</td></tr></table></html>



##### Description:



<font color="#666">The interference power with range from [-60, -100] dBm. A smaller, more negative  value represents less interference and better communication quality.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the interference power.</i></td></tr></table></html></div>

<div class="api-row" id="djiwifilink_djiwifichannelinterference_channel"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwifilink_djiwifichannelinterference_channel_inline">getChannel</a></div></div><div class="inline-doc" id="djiwifilink_djiwifichannelinterference_channel_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getChannel</h6></div>

~~~java
 int getChannel() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.airlink</td></tr></table></html>



##### Description:



<font color="#666">The channel index.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the channel index.</i></td></tr></table></html></div>

<div class="api-row" id="djiwifilink_djiwifichannelinterference_band"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwifilink_djiwifichannelinterference_band_inline">getBand</a></div></div><div class="inline-doc" id="djiwifilink_djiwifichannelinterference_band_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBand</h6></div>

~~~java
 WiFiFrequencyBand getBand() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.airlink</td></tr></table></html>



##### Description:



<font color="#666">The frequency band that the channel belongs to.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_djiwififrequencyband">WiFiFrequencyBand</a></td><td><font color="#666"><i>A value of <code><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_djiwififrequencyband">WiFiFrequencyBand</a></code> Enum.</i></td></tr></table></html></div>


