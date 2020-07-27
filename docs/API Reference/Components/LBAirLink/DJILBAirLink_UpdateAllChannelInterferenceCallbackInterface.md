<div class="article"><h1 ><font color="#AAA">class </font>ChannelInterferenceCallback</h1></div>

~~~java
 interface ChannelInterferenceCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Callback of signal strength of all signals present on all available downlink channels. Signals that are not the  communication signal are considered interference.



##### Class Members:



#### Callback Method

<div class="api-row" id="djilbairlink_updateallchannelinterference"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_updateallchannelinterference_inline">onResult</a></div></div><div class="inline-doc" id="djilbairlink_updateallchannelinterference_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onResult</h6></div>

~~~java
        void onResult(ChannelInterference[] channelInterferences)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Signal strength of all signals present on all available downlink channels. Signals  that are not the communication signal are considered interference.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/LBAirLink/DJILBAirLink_DJILBAirLinkChannelInterference.html#djilbairlink_djilbairlinkchannelinterference">ChannelInterference</a>[] <font color="#000">channelInterferences</td><td><font color="#666"><i>The updated interference information. The elements in the array  of <code><a href="/Components/LBAirLink/DJILBAirLink_DJILBAirLinkChannelInterference.html#djilbairlink_djilbairlinkchannelinterference">ChannelInterference</a></code> objects each hold the  interference signal strength of a channel. Elements are sorted by increasing  channel number.</i></td></tr></table></html></div>


