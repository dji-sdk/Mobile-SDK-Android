<div class="article"><h1 ><font color="#AAA">class </font>OcuSyncLink</h1></div>

~~~java
 class OcuSyncLink extends BaseComponent implements DJIParamAccessListener
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>BaseComponent implements DJIParamAccessListener</code></td></tr></table></html>



##### Description:



<font color="#666">This class contains methods to change OcuSync link settings.



##### Class Members:

<div class="api-row" id="djiocusynclink_setvideodatarateupdatedcallback"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiocusynclink_setvideodatarateupdatedcallback_inline">setVideoDataRateCallback</a></div></div><div class="inline-doc" id="djiocusynclink_setvideodatarateupdatedcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setVideoDataRateCallback</h6></div>

~~~java
 synchronized void setVideoDataRateCallback(VideoDataRateCallback videoDataRateCallback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Sets the callback for VideoDataRateUpdatedCallback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/OcuSyncLink/DJIOcuSyncLink_VideoDataRateUpdatedCallbackInterface.html#djiocusynclink_videodatarateupdatedcallbackinterface">VideoDataRateCallback</a> <font color="#000">videoDataRateCallback</td><td><font color="#666"><i>An interface of <code><a href="/Components/OcuSyncLink/DJIOcuSyncLink_VideoDataRateUpdatedCallbackInterface.html#djiocusynclink_videodatarateupdatedcallbackinterface">VideoDataRateCallback</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiocusynclink_setreceivedwarningmessagecallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiocusynclink_setreceivedwarningmessagecallback_inline">setWarningMessagesCallback</a></div></div><div class="inline-doc" id="djiocusynclink_setreceivedwarningmessagecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setWarningMessagesCallback</h6></div>

~~~java
 synchronized void setWarningMessagesCallback(final WarningMessagesCallback warningMessagesCallback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Sets the callback for ReceivedWarningMessageCallback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Components/OcuSyncLink/DJIOcuSyncLink_ReceivedWarningMessageCallbackInterface.html#djiocusynclink_receivedwarningmessagecallbackinterface">WarningMessagesCallback</a> <font color="#000">warningMessagesCallback</td><td><font color="#666"><i>Your implementation of <code><a href="/Components/OcuSyncLink/DJIOcuSyncLink_ReceivedWarningMessageCallbackInterface.html#djiocusynclink_receivedwarningmessagecallbackinterface">WarningMessagesCallback</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiocusynclink_setfrequencyinterferenceupdatedcallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiocusynclink_setfrequencyinterferenceupdatedcallback_inline">setChannelInterferenceCallback</a></div></div><div class="inline-doc" id="djiocusynclink_setfrequencyinterferenceupdatedcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setChannelInterferenceCallback</h6></div>

~~~java
 synchronized void setChannelInterferenceCallback(ChannelInterferenceCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Sets the FrequencyInterferenceUpdatedCallback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">ChannelInterferenceCallback <font color="#000">callback</td><td><font color="#666"><i>Your implementation of <code><a href="/Components/OcuSyncLink/DJIOcuSyncLink_FrequencyInterferenceUpdatedCallbackInterface.html#djiocusynclink_frequencyinterferenceupdatedcallbackinterface">ChannelInterferenceCallback</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiocusynclink_setchannelselectionmode"><div class="api-col left">Channel Selection Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiocusynclink_setchannelselectionmode_inline">setChannelSelectionMode</a></div></div><div class="inline-doc" id="djiocusynclink_setchannelselectionmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setChannelSelectionMode</h6></div>

~~~java
 void setChannelSelectionMode(ChannelSelectionMode mode,
                                        final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_channel_selection_mode_key">AirLinkKey.CHANNEL_SELECTION_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the channel selection mode. Both channel number and bandwidth can be changed. If the 5 GHz band is available,  then channels from that band can also be used.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_djilbairlinkchannelselectionmode">ChannelSelectionMode</a> <font color="#000">mode</td><td><font color="#666"><i>Selection mode to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiocusynclink_getchannelselectionmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiocusynclink_getchannelselectionmode_inline">getChannelSelectionMode</a></div></div><div class="inline-doc" id="djiocusynclink_getchannelselectionmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getChannelSelectionMode</h6></div>

~~~java
 void getChannelSelectionMode(final CompletionCallbackWith<ChannelSelectionMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_channel_selection_mode_key">AirLinkKey.CHANNEL_SELECTION_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the channel selection mode.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;<a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_djilbairlinkchannelselectionmode">ChannelSelectionMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiocusynclink_setocusyncmagneticinterferencelevelcallback"><div class="api-col left">OcuSync Magnetic Interference</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiocusynclink_setocusyncmagneticinterferencelevelcallback_inline">setOcuSyncMagneticInterferenceLevelCallback</a></div></div><div class="inline-doc" id="djiocusynclink_setocusyncmagneticinterferencelevelcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setOcuSyncMagneticInterferenceLevelCallback</h6></div>

~~~java
 synchronized void setOcuSyncMagneticInterferenceLevelCallback(OcuSyncMagneticInterferenceLevel.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Set the callback of <code><a href="/Components/OcuSyncLink/DJIOcuSyncLink_DJIOcuSyncMagneticInterferenceLevelCallbackInterface.html#djiocusynclink_djiocusyncmagneticinterferencelevelcallbackinterface">Callback</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_djiocusyncmagneticinterferencelevel">OcuSyncMagneticInterferenceLevel</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>Your implementation of <code><a href="/Components/OcuSyncLink/DJIOcuSyncLink_DJIOcuSyncMagneticInterferenceLevelCallbackInterface.html#djiocusynclink_djiocusyncmagneticinterferencelevelcallbackinterface">Callback</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiocusynclink_setchannelbandwidth"><div class="api-col left">Channel Bandwidth</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiocusynclink_setchannelbandwidth_inline">setChannelBandwidth</a></div></div><div class="inline-doc" id="djiocusynclink_setchannelbandwidth_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setChannelBandwidth</h6></div>

~~~java
 void setChannelBandwidth(OcuSyncBandwidth bandwidth,
                                    final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_bandwidth_key">AirLinkKey.BANDWIDTH</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the channel bandwidth of the OcuSync link. It can be set only when the selection mode is  <code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_djilbairlinkchannelselectionmode_manual">MANUAL</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_djiocusyncbandwidth">OcuSyncBandwidth</a> <font color="#000">bandwidth</td><td><font color="#666"><i>Bandwidth to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiocusynclink_getchannelbandwidth"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiocusynclink_getchannelbandwidth_inline">getChannelBandwidth</a></div></div><div class="inline-doc" id="djiocusynclink_getchannelbandwidth_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getChannelBandwidth</h6></div>

~~~java
 void getChannelBandwidth(final CompletionCallbackWith<OcuSyncBandwidth> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_bandwidth_key">AirLinkKey.BANDWIDTH</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the channel bandwidth of the OcuSync link.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;<a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_djiocusyncbandwidth">OcuSyncBandwidth</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiocusynclink_setchannelnumber"><div class="api-col left">Channel Number</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiocusynclink_setchannelnumber_inline">setChannelNumber</a></div></div><div class="inline-doc" id="djiocusynclink_setchannelnumber_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setChannelNumber</h6></div>

~~~java
 void setChannelNumber(int channelNumber, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_frequency_point_index_key">AirLinkKey.FREQUENCY_POINT_INDEX</a></td></tr></table></html>



##### Description:



<font color="#666">Selects the channel number. The OcuSync link operates on a  10 MHz or 20 MHz channel between 2400.5 MHz and 2482.5 MHz. The channel can be centered at 1 MHz steps within the  band. Therefore for a 10 MHz bandwidth, the OcuSync channel can be centered at 2405.5 MHz, 2406.5 MHz and every 1  MHz to 2477.5 MHz. For a 20 MHz bandwidth, channel center can be at 2410.5 MHz to 2472.5 MHz in 1 MHz steps. The  channel location within the band is specified using the Channel Number. Channel Number is defined as the integer  of 0.5 MHz less than the channel center frequency. E.g. Channel Number 2406 represents the 10 MHz channel centered  at 2406.5 MHz (this is only for the 10 MHz bandwidth as 20 MHz bandwidth channels start at 2410.5 MHz). Channel  Number 2450 represents the channel centered at 2450.5 MHz (of any bandwidth).  Use <code><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_getchannelnumbervalidrange">getChannelNumberValidRange</a></code> to check the valid Channel Numbers for a given bandwidth. Channel  Number can only be set when the channel selection mode is <code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_djilbairlinkchannelselectionmode_manual">MANUAL</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">channelNumber</td><td><font color="#666"><i>Channel number to set OcuSync channel to.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Callback that receives the setter result.</i></td></tr></table></html></div>

<div class="api-row" id="djiocusynclink_getchannelnumber"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiocusynclink_getchannelnumber_inline">getChannelNumber</a></div></div><div class="inline-doc" id="djiocusynclink_getchannelnumber_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getChannelNumber</h6></div>

~~~java
 void getChannelNumber(final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_frequency_point_index_key">AirLinkKey.FREQUENCY_POINT_INDEX</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the current OcuSync Link Channel Number. The OcuSync link operates on a 10 MHz or 20 MHz channel between  2400.5 MHz and 2482.5 MHz. The channel can be centered at 1 MHz steps within the band. Therefore for a 10 MHz  bandwidth, the OcuSync channel can be centered at 2405.5 MHz, 2406.5 MHz and every 1 MHz to 2477.5 MHz. For a  20 MHz bandwidth, channel center can be at 2410.5 MHz to 2472.5 MHz in 1 MHz steps. The channel location within  the band is specified using the Channel Number. Channel Number is defined as the integer of 0.5 MHz less than the  channel center frequency. E.g. Channel Number 2406 represents the 10 MHz channel centered at 2406.5 MHz (this is  only for the 10 MHz bandwidth as 20 MHz bandwidth channels start at 2410.5 MHz). Channel Number 2450 represents  the channel centered at 2450.5 MHz (of any bandwidth).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion block that receives the getter result.</i></td></tr></table></html></div>

<div class="api-row" id="djiocusynclink_getchannelnumbervalidrange"><div class="api-col left">Get Channel Number Valid Range</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiocusynclink_getchannelnumbervalidrange_inline">getChannelNumberValidRange</a></div></div><div class="inline-doc" id="djiocusynclink_getchannelnumbervalidrange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getChannelNumberValidRange</h6></div>

~~~java
 void getChannelNumberValidRange(final CompletionCallbackWith<Integer[]> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_frequency_point_index_valid_range_key">AirLinkKey.FREQUENCY_POINT_INDEX_VALID_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the valid range of Channel Numbers. The OcuSync link operates on a 10 MHz or 20 MHz channel between  2400.5 MHz and 2482.5 MHz. The channel can be centered at 1 MHz steps within the band. Therefore for a 10 MHz  bandwidth, the OcuSync channel can be centered at 2405.5 MHz, 2406.5 MHz and every 1 MHz to 2477.5 MHz. For a  20 MHz bandwidth, channel center can be at 2410.5 MHz to 2472.5 MHz in 1 MHz steps. The channel location within  the band is specified using the Channel Number. Channel Number is defined as the integer of 0.5 MHz less than the  channel center frequency. E.g. Channel Number 2406 represents the 10 MHz channel centered at 2406.5 MHz (this is  only for the 10 MHz bandwidth as 20 MHz bandwidth channels start at 2410.5 MHz). Channel Number 2450 represents  the channel centered at 2450.5 MHz (of any bandwidth). This method should be used to confirm the Channel Number  to be set with <code><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_setchannelnumber">setChannelNumber</a></code> is valid.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;Integer[]&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiocusynclink_getsupportedfrequencybandswithcompletion"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiocusynclink_getsupportedfrequencybandswithcompletion_inline">getSupportedFrequencyBands</a></div></div><div class="inline-doc" id="djiocusynclink_getsupportedfrequencybandswithcompletion_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSupportedFrequencyBands</h6></div>

~~~java
 void getSupportedFrequencyBands(final CompletionCallbackWith<OcuSyncFrequencyBand[]> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_ocusync_supported_frequency_bands_key">AirLinkKey.OCUSYNC_SUPPORTED_FREQUENCY_BANDS</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the frequency bands supported by the product in the current area. It is supported by P4P V2 and Mavic 2 Series. For  Mavic Pro, only 2.4GHz is supported.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;<a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_djiocusyncfrequencyband">OcuSyncFrequencyBand</a>[]&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiocusynclink_setfrequencyband"><div class="api-col left">Set Frequency Band</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiocusynclink_setfrequencyband_inline">setFrequencyBand</a></div></div><div class="inline-doc" id="djiocusynclink_setfrequencyband_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFrequencyBand</h6></div>

~~~java
 void setFrequencyBand(OcuSyncFrequencyBand frequencyBand, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Sets the OcuSync air link frequency band. It is only supported by Phantom 4 Pro V2 and Mavic 2 Series. For Mavic Pro,  the frequency band is always 2.4 GHz.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_djiocusyncfrequencyband">OcuSyncFrequencyBand</a> <font color="#000">frequencyBand</td><td><font color="#666"><i>Frequency band to change to.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiocusynclink_getfrequencybandwithcompletion"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiocusynclink_getfrequencybandwithcompletion_inline">getFrequencyBand</a></div></div><div class="inline-doc" id="djiocusynclink_getfrequencybandwithcompletion_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFrequencyBand</h6></div>

~~~java
 void getFrequencyBand(final CompletionCallbackWith<OcuSyncFrequencyBand> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Gets the OcuSync air link frequency band. It is only supported by Phantom 4 Pro V2 and Mavic 2 Series. For Mavic Pro, the frequency band is always 2.4 GHz.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;<a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_djiocusyncfrequencyband">OcuSyncFrequencyBand</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiocusynclink_setbandwidthallocationforprimaryvideo"><div class="api-col left">Set Bandwidth Allocation</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiocusynclink_setbandwidthallocationforprimaryvideo_inline">setBandwidthAllocationForPrimaryVideo</a></div></div><div class="inline-doc" id="djiocusynclink_setbandwidthallocationforprimaryvideo_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setBandwidthAllocationForPrimaryVideo</h6></div>

~~~java
 void setBandwidthAllocationForPrimaryVideo(@FloatRange(from = 0.0f, to = 1.0f) float percent,
                                                    @Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Sets the percentage of the primary video bandwidth. The remaining percentage is dedicated to the secondary video. The primary source can only be <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_leftcamera">LEFT_CAM</a></code> or <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_rightcamera">RIGHT_CAM</a></code>.  The secondary source can be <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_leftcamera">LEFT_CAM</a></code>, <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_rightcamera">RIGHT_CAM</a></code>  and <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_fpvcamera">FPV_CAM</a></code>. It is only supported by M200 series v2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@FloatRange(from = 0.0f, to = 1.0f) float <font color="#000">percent</td><td><font color="#666"><i>Percentage downlink bandwidth for the primary video feed.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiocusynclink_getbandwidthallocationforprimaryvideo"><div class="api-col left">Get Bandwidth Allocation</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiocusynclink_getbandwidthallocationforprimaryvideo_inline">getBandwidthAllocationForPrimaryVideo</a></div></div><div class="inline-doc" id="djiocusynclink_getbandwidthallocationforprimaryvideo_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBandwidthAllocationForPrimaryVideo</h6></div>

~~~java
 void getBandwidthAllocationForPrimaryVideo(@NonNull final CommonCallbacks.CompletionCallbackWith<Float> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">When a product has multiple main cameras, this method gets the percentage bandwidth allocation dedicated to the primary video. The remaining percentage is dedicated  to the secondary video. It is only supported by M200 series v2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;Float&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiocusynclink_assignsourcetoprimarychannel"><div class="api-col left">Assign Source</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiocusynclink_assignsourcetoprimarychannel_inline">assignSourceToPrimaryChannel</a></div></div><div class="inline-doc" id="djiocusynclink_assignsourcetoprimarychannel_inline"

><div class="article"><h6 ><font color="#AAA">method </font>assignSourceToPrimaryChannel</h6></div>

~~~java
 void assignSourceToPrimaryChannel(PhysicalSource primarySource, PhysicalSource secondarySource, @Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Assign the primary video and the secondary video source. It can be supported by M200 series V2 and Matrice 300 RTK. On M200 series v2, the primary source only can  be <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_leftcamera">LEFT_CAM</a></code> or <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_fpvcamera">FPV_CAM</a></code>. The secondary  source can be <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_leftcamera">LEFT_CAM</a></code>, <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_rightcamera">RIGHT_CAM</a></code>  and <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_fpvcamera">FPV_CAM</a></code>. On Matrice 300 RTK, both primary and secondary sources can  be <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_leftcamera">LEFT_CAM</a></code>, <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_rightcamera">RIGHT_CAM</a></code>, <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_topcamera">TOP_CAM</a></code>  and <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_fpvcamera">FPV_CAM</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource">PhysicalSource</a> <font color="#000">primarySource</td><td><font color="#666"><i>The primary video source.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource">PhysicalSource</a> <font color="#000">secondarySource</td><td><font color="#666"><i>The secondary video source.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiocusynclink_closeallvideosources"><div class="api-col left">Close Video Sources</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiocusynclink_closeallvideosources_inline">closeAllVideoSources</a></div></div><div class="inline-doc" id="djiocusynclink_closeallvideosources_inline"

><div class="article"><h6 ><font color="#AAA">method </font>closeAllVideoSources</h6></div>

~~~java
 void closeAllVideoSources(@Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Stops all video streaming if there is any active source. It is only supported by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiocusynclink_videodatarateupdatedcallbackinterface"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/OcuSyncLink/DJIOcuSyncLink_VideoDataRateUpdatedCallbackInterface.html">VideoDataRateCallback</a></div></div><div class="api-row" id="djiocusynclink_receivedwarningmessagecallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/OcuSyncLink/DJIOcuSyncLink_ReceivedWarningMessageCallbackInterface.html">WarningMessagesCallback</a></div></div><div class="api-row" id="djiocusynclink_frequencyinterferenceupdatedcallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/OcuSyncLink/DJIOcuSyncLink_FrequencyInterferenceUpdatedCallbackInterface.html">ChannelInterferenceCallback</a></div></div><div class="api-row" id="djiocusynclink_djiocusyncfrequencyinterference"><div class="api-col left">Information</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/OcuSyncLink/DJIOcuSyncLink_DJIOcuSyncFrequencyInterference.html">FrequencyInterference</a></div></div><div class="api-row" id="djiocusynclink_djiocusyncwarningmessage"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiocusynclink_djiocusyncwarningmessage_inline">OcuSyncWarningMessage</a></div></div><div class="inline-doc" id="djiocusynclink_djiocusyncwarningmessage_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>OcuSyncWarningMessage</h6></div>

~~~java
@EXClassNullAway
 enum OcuSyncWarningMessage 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_warning_messages_key">AirLinkKey.WARNING_MESSAGES</a></td></tr></table></html>



##### Description:



<font color="#666">OcuSync link warning messages.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiocusynclink_djiocusyncwarningmessage_strongtakeoffinterference_inline"></a>STRONG_TAKE_OFF_INTERFERENCE</td><td><font color="#666">Warning that interference is high for take-off. When the signal gets weaker as separation between remote  controller and aircraft get larger, there is a change the link will fail.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiocusynclink_djiocusyncwarningmessage_strongdownlinkinterference_inline"></a>STRONG_DOWN_LINK_INTERFERENCE</td><td><font color="#666">There is strong interference on the downlink signal incident on the remote controller. If the channel selection  mode  <code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_djilbairlinkchannelselectionmode_manual">MANUAL</a></code> is being used, consider changing to   <code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_djilbairlinkchannelselectionmode_auto">AUTO</a></code> as the OcuSync link can automatically select  Channel Numbers and bandwidth to mitigate interference on the fly.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiocusynclink_djiocusyncwarningmessage_stronguplinkinterference_inline"></a>STRONG_UP_LINK_INTERFERENCE</td><td><font color="#666">There is strong interference on the uplink signal incident on the aircraft.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiocusynclink_djiocusyncwarningmessage_weaksignal_inline"></a>WEAK_SIGNAL</td><td><font color="#666">Weak OcuSync signal strength. Be aware of anything blocking the signal between the remote controller and aircraft,  adjust the orientation of the antennas on the remote controller, or reduce the distance between remote controller  and aircraft to increase signal strength.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiocusynclink_djiocusyncwarningmessage_aircraftlinkreboot_inline"></a>AIRCRAFT_LINK_REBOOT</td><td><font color="#666">The OcuSync link on the aircraft is rebooting.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiocusynclink_djiocusyncwarningmessage_uplinkbroken_inline"></a>UP_LINK_BROKEN</td><td><font color="#666">The uplink from the remote controller to the aircraft is broken. Usually if only the uplink disconnects, it is due  to interference on the aircraft's OcuSync antennas. Try changing the channel number if the interference source  cannot be removed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiocusynclink_djiocusyncwarningmessage_downlinkbroken_inline"></a>DOWN_LINK_BROKEN</td><td><font color="#666">The downlink from the aircraft to the remote controller is broken. Usually if only the downlink disconnects, it is  due to interference on the remote controller's OcuSync antennas. Try changing channel number, or reducing the  bandwidth of the channel to make it more robust.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiocusynclink_djiocusyncwarningmessage_linkunusable_inline"></a>LINK_UNUSABLE</td><td><font color="#666">The link between the remote controller and the aircraft is unusable. It is determined to be unusable if signal is  too weak. Check to see if the antennas are setup correctly and the path from remote controller to aircraft is  unobstructed.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiocusynclink_djiocusyncfrequencyband"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiocusynclink_djiocusyncfrequencyband_inline">OcuSyncFrequencyBand</a></div></div><div class="inline-doc" id="djiocusynclink_djiocusyncfrequencyband_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>OcuSyncFrequencyBand</h6></div>

~~~java
 enum OcuSyncFrequencyBand 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_ocusync_frequency_band_key">AirLinkKey.OCUSYNC_FREQUENCY_BAND</a>, <a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_ocusync_supported_frequency_bands_key">AirLinkKey.OCUSYNC_SUPPORTED_FREQUENCY_BANDS</a></td></tr></table></html>



##### Description:



<font color="#666">The frequency bands for OcuSync.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiocusynclink_djiocusyncfrequencyband_2dot4ghz_inline"></a>FREQUENCY_BAND_2_DOT_4_GHZ</td><td><font color="#666">The Frequency band is 2.4 GHz.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiocusynclink_djiocusyncfrequencyband_5dot8ghz_inline"></a>FREQUENCY_BAND_5_DOT_8_GHZ</td><td><font color="#666">The Frequency band is 5.8 GHz.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiocusynclink_djiocusyncfrequencyband_dual_inline"></a>FREQUENCY_BAND_DUAL</td><td><font color="#666">Dual frequency band mode. The frequency band can be either 2.4 GHz or 5 GHz.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiocusynclink_djiocusyncfrequencyband_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiocusynclink_djiocusyncbandwidth"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiocusynclink_djiocusyncbandwidth_inline">OcuSyncBandwidth</a></div></div><div class="inline-doc" id="djiocusynclink_djiocusyncbandwidth_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>OcuSyncBandwidth</h6></div>

~~~java
@EXClassNullAway
 enum OcuSyncBandwidth 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_bandwidth_key">AirLinkKey.BANDWIDTH</a></td></tr></table></html>



##### Description:



<font color="#666">The channel bandwidth for the OcuSync downlink (from the aircraft to the remote controller). Setting a smaller  bandwidth will reduce the data rate, but make the connection more robust.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiocusynclink_djiocusyncbandwidth_20mhz_inline"></a>Bandwidth20MHz</td><td><font color="#666">The frequency band of the OcuSync link is 20 MHz (up to 46 Mbps).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiocusynclink_djiocusyncbandwidth_10mhz_inline"></a>Bandwidth10MHz</td><td><font color="#666">The frequency band of the OcuSync link is 10 MHz (up to 23 Mbps).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiocusynclink_djiocusyncbandwidth_40mhz_inline"></a>Bandwidth40MHZ</td><td><font color="#666">The frequency band of the OcuSync link is 40 MHz (up to 80 Mbps).  Only supported by Matrice 300 RTK.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiocusynclink_djiocusyncbandwidth_unknown_inline"></a>Unknown</td><td><font color="#666">Unknown frequency band.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiocusynclink_djiocusyncmagneticinterferencelevel"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiocusynclink_djiocusyncmagneticinterferencelevel_inline">OcuSyncMagneticInterferenceLevel</a></div></div><div class="inline-doc" id="djiocusynclink_djiocusyncmagneticinterferencelevel_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>OcuSyncMagneticInterferenceLevel</h6></div>

~~~java
 enum OcuSyncMagneticInterferenceLevel 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.airlink</td></tr></table></html>



##### Description:



<font color="#666">OcuSync link magnetic interference level.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiocusynclink_djiocusyncmagneticinterferencelevel_none_inline"></a>NONE</td><td><font color="#666">There is no detected Ocusync link magnetic interference.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiocusynclink_djiocusyncmagneticinterferencelevel_low_inline"></a>LOW</td><td><font color="#666">There is a low level of detected Ocusync link magnetic interference.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiocusynclink_djiocusyncmagneticinterferencelevel_medium_inline"></a>MEDIUM</td><td><font color="#666">There is a medium level of detected Ocusync link magnetic interference.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiocusynclink_djiocusyncmagneticinterferencelevel_high_inline"></a>HIGH</td><td><font color="#666">There is a high level of detected Ocusync link magnetic interference.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiocusynclink_djiocusyncmagneticinterferencelevel_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The level of the detected OcuSync link magnetic interference is currently unknown.</td></tr></table></html>

##### Class Members:



##### Related:

<div class="api-row" id="djiocusynclink_djiocusyncmagneticinterferencelevelcallbackinterface"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/OcuSyncLink/DJIOcuSyncLink_DJIOcuSyncMagneticInterferenceLevelCallbackInterface.html">Callback</a></div></div></div>


