<div class="article"><h1 ><font color="#AAA">class </font>ChannelInterferenceCallback</h1></div>

~~~java
 interface ChannelInterferenceCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Callback to listen to any changes in interference levels for channels that are not being used for communication.



##### Class Members:



#### Callback Method

<div class="api-row" id="djiwifilink_didupdatechannelinterferencepowers"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwifilink_didupdatechannelinterferencepowers_inline">onUpdate</a></div></div><div class="inline-doc" id="djiwifilink_didupdatechannelinterferencepowers_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
        void onUpdate(final WifiChannelInterference[] channelInterferences)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">This will be invoked when there is a change in RSSI. Interference power of the available channels.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Components/WiFiLink/DJIWiFiLink_DJIWiFiChannelInterference.html#djiwifilink_djiwifichannelinterference">WifiChannelInterference</a>[] <font color="#000">channelInterferences</td><td><font color="#666"><i>An array of all the current RSSIs.</i></td></tr></table></html></div>


