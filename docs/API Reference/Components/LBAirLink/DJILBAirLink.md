<div class="article"><h1 ><font color="#AAA">class </font>LightbridgeLink</h1></div>

~~~java
 class LightbridgeLink extends BaseComponent implements DJIParamAccessListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>BaseComponent implements DJIParamAccessListener</code></td></tr></table></html>



##### Description:



<font color="#666">This class contains methods to change settings of the Lightbridge Air Link.



##### Class Members:



#### Actions

<div class="api-row" id="djilbairlink_setchannelselectionmode"><div class="api-col left">Downlink Channel Selection Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_setchannelselectionmode_inline">setChannelSelectionMode</a></div></div><div class="inline-doc" id="djilbairlink_setchannelselectionmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setChannelSelectionMode</h6></div>

~~~java
 void setChannelSelectionMode(ChannelSelectionMode mode, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_channel_selection_mode_key">AirLinkKey.CHANNEL_SELECTION_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the downlink channel selection mode (automatic or manual).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_djilbairlinkchannelselectionmode">ChannelSelectionMode</a> <font color="#000">mode</td><td><font color="#666"><i>Channel selection mode for the air link.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djilbairlink_getchannelselectionmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_getchannelselectionmode_inline">getChannelSelectionMode</a></div></div><div class="inline-doc" id="djilbairlink_getchannelselectionmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getChannelSelectionMode</h6></div>

~~~java
 void getChannelSelectionMode(final CompletionCallbackWith<ChannelSelectionMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_channel_selection_mode_key">AirLinkKey.CHANNEL_SELECTION_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the downlink channel selection mode.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;<a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_djilbairlinkchannelselectionmode">ChannelSelectionMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djilbairlink_getchannelrange"><div class="api-col left">Change Range</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_getchannelrange_inline">getChannelRange</a></div></div><div class="inline-doc" id="djilbairlink_getchannelrange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getChannelRange</h6></div>

~~~java
 void getChannelRange(final CompletionCallbackWith<Integer[]> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_channel_range_key">AirLinkKey.CHANNEL_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the channels available for the current frequency band.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;Integer[]&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djilbairlink_setchannel"><div class="api-col left">Downlink Channel</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_setchannel_inline">setChannelNumber</a></div></div><div class="inline-doc" id="djilbairlink_setchannel_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setChannelNumber</h6></div>

~~~java
 void setChannelNumber(int channelNumber, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_channel_number_key">AirLinkKey.CHANNEL_NUMBER</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the fixed downlink channel. Channel selection mode should be set  to <code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_djilbairlinkchannelselectionmode_manual">MANUAL</a></code>. The valid range  of channel can be obtained from <code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_getchannelrange">getChannelRange</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">channelNumber</td><td><font color="#666"><i>Specific channel for the air link.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djilbairlink_getchannel"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_getchannel_inline">getChannelNumber</a></div></div><div class="inline-doc" id="djilbairlink_getchannel_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getChannelNumber</h6></div>

~~~java
 void getChannelNumber(final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_channel_number_key">AirLinkKey.CHANNEL_NUMBER</a></td></tr></table></html>



##### Description:



<font color="#666">Gets current downlink channel of air link.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djilbairlink_setdatarate"><div class="api-col left">Downlink Data Rate</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_setdatarate_inline">setDataRate</a></div></div><div class="inline-doc" id="djilbairlink_setdatarate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setDataRate</h6></div>

~~~java
 void setDataRate(LightbridgeDataRate rate, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Sets the downlink data rate (throughput). Higher data rates increase the quality of video transmission, but can  only be used at shorter ranges.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_djilbairlinkdatarate">LightbridgeDataRate</a> <font color="#000">rate</td><td><font color="#666"><i>Fixed rate (throughput).</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djilbairlink_getdatarate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_getdatarate_inline">getDataRate</a></div></div><div class="inline-doc" id="djilbairlink_getdatarate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDataRate</h6></div>

~~~java
 void getDataRate(final CompletionCallbackWith<LightbridgeDataRate> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Gets the current downlink data rate (throughput).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;<a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_djilbairlinkdatarate">LightbridgeDataRate</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djilbairlink_setfpvqualitylatency"><div class="api-col left">FPV Video Quality vs Latency</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_setfpvqualitylatency_inline">setTransmissionMode</a></div></div><div class="inline-doc" id="djilbairlink_setfpvqualitylatency_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setTransmissionMode</h6></div>

~~~java
 void setTransmissionMode(@NonNull LightbridgeTransmissionMode mode, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_transmission_mode_key">AirLinkKey.TRANSMISSION_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets FPV video quality vs latency preference. This mode only affects the FPV camera and not the camera on the HD Gimbal.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_djilbairlinkfpvvideoqualitylatency">LightbridgeTransmissionMode</a> <font color="#000">mode</td><td><font color="#666"><i>Quality vs Latency tradeoff for the FPV video</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djilbairlink_getfpvqualitylatency"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_getfpvqualitylatency_inline">getTransmissionMode</a></div></div><div class="inline-doc" id="djilbairlink_getfpvqualitylatency_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTransmissionMode</h6></div>

~~~java
 void getTransmissionMode(final CompletionCallbackWith<LightbridgeTransmissionMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_transmission_mode_key">AirLinkKey.TRANSMISSION_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets FPV video quality vs latency preference. This mode only affects the FPV camera and not the camera on the HD Gimbal.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;<a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_djilbairlinkfpvvideoqualitylatency">LightbridgeTransmissionMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djilbairlink_setfpvvideobandwidthpercent"><div class="api-col left">Downlink Video Bandwidth</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_setfpvvideobandwidthpercent_inline">setBandwidthAllocationForLBVideoInputPort</a></div></div><div class="inline-doc" id="djilbairlink_setfpvvideobandwidthpercent_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setBandwidthAllocationForLBVideoInputPort</h6></div>

~~~java
 void setBandwidthAllocationForLBVideoInputPort(@FloatRange(from = 0.0f, to = 1.0f) float percent,
                                                          final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_bandwidth_allocation_for_lb_video_input_port_key">AirLinkKey.BANDWIDTH_ALLOCATION_FOR_LB_VIDEO_INPUT_PORT</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the percentage downlink video bandwidth dedicated to the video  feed from one of the LB input ports. The remaining percentage is dedicated  to the video feed from EXT input port. Setting 100% dedicates all the video bandwidth to LB.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@FloatRange(from = 0.0f, to = 1.0f) float <font color="#000">percent</td><td><font color="#666"><i>Percentage downlink bandwidth for video feed from LB port.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djilbairlink_getfpvvideobandwidthpercent"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_getfpvvideobandwidthpercent_inline">getBandwidthAllocationForLBVideoInputPort</a></div></div><div class="inline-doc" id="djilbairlink_getfpvvideobandwidthpercent_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBandwidthAllocationForLBVideoInputPort</h6></div>

~~~java
 void getBandwidthAllocationForLBVideoInputPort(final CompletionCallbackWith<Float> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_bandwidth_allocation_for_lb_video_input_port_key">AirLinkKey.BANDWIDTH_ALLOCATION_FOR_LB_VIDEO_INPUT_PORT</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the percentage downlink video bandwidth dedicated to the video feed from one of  the LB input ports. The remaining percentage is dedicated to the video feed from EXT input port.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;Float&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djilbairlink_setbandwidthallocationformaincamera"><div class="api-col left">Bandwidth Allocation</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_setbandwidthallocationformaincamera_inline">setBandwidthAllocationForMainCamera</a></div></div><div class="inline-doc" id="djilbairlink_setbandwidthallocationformaincamera_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setBandwidthAllocationForMainCamera</h6></div>

~~~java
 void setBandwidthAllocationForMainCamera(@FloatRange(from = 0.0f, to = 1.0f) float percent,
                                                    @Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Sets the percentage downlink video bandwidth dedicated to the main camera or main cameras (for  M210 and M210 RTK). The remaining percentage is dedicated to the FPV camera. For M210 and M210  RTK, the bandwidth for main cameras can be further divided by calling  <code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_setbandwidthallocationforleftcamera">setBandwidthAllocationForLeftCamera</a></code>. It is only supported by Inspire 2  and M200 series.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@FloatRange(from = 0.0f, to = 1.0f) float <font color="#000">percent</td><td><font color="#666"><i>Percentage downlink bandwidth for main camera(s).</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djilbairlink_getbandwidthallocationformaincamera"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_getbandwidthallocationformaincamera_inline">getBandwidthAllocationForMainCamera</a></div></div><div class="inline-doc" id="djilbairlink_getbandwidthallocationformaincamera_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBandwidthAllocationForMainCamera</h6></div>

~~~java
 void getBandwidthAllocationForMainCamera(
        @NonNull final CommonCallbacks.CompletionCallbackWith<Float> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Gets the percentage downlink video bandwidth dedicated to the main camera or main cameras  (for M210 and M210 RTK). The remaining percentage is dedicated to the FPV camera. It is  only supported by Inspire 2 and M200 series.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;Float&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djilbairlink_setbandwidthallocationforleftcamera"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_setbandwidthallocationforleftcamera_inline">setBandwidthAllocationForLeftCamera</a></div></div><div class="inline-doc" id="djilbairlink_setbandwidthallocationforleftcamera_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setBandwidthAllocationForLeftCamera</h6></div>

~~~java
 void setBandwidthAllocationForLeftCamera(@FloatRange(from = 0.0f, to = 1.0f) float percent,
                                                    @Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Sets the percentage of the main cameras' bandwidth dedicated to the left camera. The remaining percentage  is dedicated to the right camera. The main cameras' bandwidth is determined by  <code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_setbandwidthallocationformaincamera">setBandwidthAllocationForMainCamera</a></code>. <br> This setting will influence the physical sources  of video feeds (<code><a href="/BaseClasses/DJIVideoFeeder.html#djivideofeeder_primaryvideofeed">getPrimaryVideoFeed</a></code> and <code><a href="/BaseClasses/DJIVideoFeeder.html#djivideofeeder_secondaryvideofeed">getSecondaryVideoFeed</a></code>): <br><br> - When  bandwidth is 100% on the left camera, the primary source is <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_leftcamera">LEFT_CAM</a></code>  and the secondary source is <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_fpvcamera">FPV_CAM</a></code>. <br> - When bandwidth 0% on  the left camera, the primary source is <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_rightcamera">RIGHT_CAM</a></code> and the secondary  source is <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_fpvcamera">FPV_CAM</a></code>. <br> - When bandwidth is neither 0% nor 100% on  the left camera, the primary source is <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_leftcamera">LEFT_CAM</a></code> and the secondary  source is <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_rightcamera">RIGHT_CAM</a></code>. It is only supported by M210 and M210 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@FloatRange(from = 0.0f, to = 1.0f) float <font color="#000">percent</td><td><font color="#666"><i>Percentage downlink bandwidth for FPV camera.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djilbairlink_getbandwidthallocationforleftcamera"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_getbandwidthallocationforleftcamera_inline">getBandwidthAllocationForLeftCamera</a></div></div><div class="inline-doc" id="djilbairlink_getbandwidthallocationforleftcamera_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBandwidthAllocationForLeftCamera</h6></div>

~~~java
 void getBandwidthAllocationForLeftCamera(@NonNull final CommonCallbacks.CompletionCallbackWith<Float> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">When a product has multiple main cameras, this method gets the percentage bandwidth allocation  dedicated to the port (left) camera. The remaining percentage is dedicated to the starboard  (right) camera. The total bandwidth allocated to both main cameras (vs the FPV camera) is  determined by <code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_setbandwidthallocationformaincamera">setBandwidthAllocationForMainCamera</a></code>. <br> This setting will  influence the physical sources of video feeds (<code><a href="/BaseClasses/DJIVideoFeeder.html#djivideofeeder_primaryvideofeed">getPrimaryVideoFeed</a></code>  and <code><a href="/BaseClasses/DJIVideoFeeder.html#djivideofeeder_secondaryvideofeed">getSecondaryVideoFeed</a></code>): <br> - When bandwidth is 100% on the left camera,  the primary source is <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_leftcamera">LEFT_CAM</a></code>  and the secondary source is <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_fpvcamera">FPV_CAM</a></code>.  <br> - When bandwidth is 0% on the left camera, the primary source is  <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_rightcamera">RIGHT_CAM</a></code> and the secondary source  is <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_fpvcamera">FPV_CAM</a></code>. <br> - When bandwidth is  neither 0% nor 100% on the left camera, the primary source is  <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_leftcamera">LEFT_CAM</a></code> and the secondary source is  <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_rightcamera">RIGHT_CAM</a></code>. <br> It is only supported  by M210 and M210 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;Float&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djilbairlink_isdualencodemodesupported"><div class="api-col left">Check Dual Encode Mode Supported</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_isdualencodemodesupported_inline">isDualEncodeModeSupported</a></div></div><div class="inline-doc" id="djilbairlink_isdualencodemodesupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isDualEncodeModeSupported</h6></div>

~~~java
@Deprecated
 boolean isDualEncodeModeSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if Lightbridge 2 device supports dual encode mode. Dual encode mode allows the  Lightbridge module to encode and transmit both it's AV and HDMI inputs simultaneously.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djilbairlink_setencodemode"><div class="api-col left">Encode Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_setencodemode_inline">setEXTVideoInputPortEnabled</a></div></div><div class="inline-doc" id="djilbairlink_setencodemode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setEXTVideoInputPortEnabled</h6></div>

~~~java
 void setEXTVideoInputPortEnabled(boolean enabled, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_is_ext_video_input_port_enabled_key">AirLinkKey.IS_EXT_VIDEO_INPUT_PORT_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Sets Lightbridge 2 encode mode. It is only available when  <code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_isdualencodemodesupported">isDualEncodeModeSupported</a></code> returns  <code>true</code>. For Lightbridge 2 modules that don't support dual encode mode, the encode mode is  always single.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i>The encode mode to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djilbairlink_getencodemode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_getencodemode_inline">getEXTVideoInputPortEnabled</a></div></div><div class="inline-doc" id="djilbairlink_getencodemode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getEXTVideoInputPortEnabled</h6></div>

~~~java
 void getEXTVideoInputPortEnabled(final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_is_ext_video_input_port_enabled_key">AirLinkKey.IS_EXT_VIDEO_INPUT_PORT_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Gets Lightbridge 2 encode mode. It is only available when <code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_isdualencodemodesupported">isDualEncodeModeSupported</a></code> returns  <code>true</code>. For Lightbridge 2 modules that don't support dual encode mode, the encode mode is  always single.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djilbairlink_getdualencodemodepercent"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_getdualencodemodepercent_inline">getBandwidthAllocationForHDMIVideoInputPort</a></div></div><div class="inline-doc" id="djilbairlink_getdualencodemodepercent_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBandwidthAllocationForHDMIVideoInputPort</h6></div>

~~~java
 void getBandwidthAllocationForHDMIVideoInputPort(final CompletionCallbackWith<Float> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_bandwidth_allocation_for_hdmi_video_input_port_key">AirLinkKey.BANDWIDTH_ALLOCATION_FOR_HDMI_VIDEO_INPUT_PORT</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the computational power and bandwidth balance between AV and HDMI inputs on the Lightbridge 2 module when  dual encode mode is enabled. It is only available when <code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_isdualencodemodesupported">isDualEncodeModeSupported</a></code> returns  <code>true</code>. When <code>percent</code> is 0.0, all resources are allocated for video data from AV  port. When <code>percent</code> is 1.0, all resources are allocated for video data from HDMI port.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;Float&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djilbairlink_setdualencodemodepercent"><div class="api-col left">Dual Encode Mode Percent</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_setdualencodemodepercent_inline">setBandwidthAllocationForHDMIVideoInputPort</a></div></div><div class="inline-doc" id="djilbairlink_setdualencodemodepercent_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setBandwidthAllocationForHDMIVideoInputPort</h6></div>

~~~java
 void setBandwidthAllocationForHDMIVideoInputPort(float percent, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_bandwidth_allocation_for_hdmi_video_input_port_key">AirLinkKey.BANDWIDTH_ALLOCATION_FOR_HDMI_VIDEO_INPUT_PORT</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the computational power and bandwidth balance between AV and HDMI inputs on the Lightbridge 2 module when  dual encode mode is enabled. Balance is in percent [0.0,  1.0]. It is only available  when <code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_isdualencodemodesupported">isDualEncodeModeSupported</a></code> returns <code>true</code>. When <code>percent</code> is 0.0,  all resources are allocated for video data from AV port. When <code>percent</code> is 1.0, all resources are  allocated for video data from HDMI port.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">percent</td><td><font color="#666"><i>Percentage resources dedicated to HDMI encoding and transmission.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djilbairlink_getsupportedfrequencyband"><div class="api-col left">Get Supported Frequency Band</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_getsupportedfrequencyband_inline">getSupportedFrequencyBands</a></div></div><div class="inline-doc" id="djilbairlink_getsupportedfrequencyband_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSupportedFrequencyBands</h6></div>

~~~java
 void getSupportedFrequencyBands(final CompletionCallbackWith<LightbridgeFrequencyBand[]> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_lb_supported_frequency_bands_key">AirLinkKey.LB_SUPPORTED_FREQUENCY_BANDS</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the frequency bands supported by the product in the current area. It is only supported by Inspire 2 and  Phantom 4 Pro. For the other products with LB air link, the frequency band is always 2.4 GHz.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;<a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_djilbairlinkfrequencyband">LightbridgeFrequencyBand</a>[]&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djilbairlink_setfrequencyband"><div class="api-col left">Frequency Band</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_setfrequencyband_inline">setFrequencyBand</a></div></div><div class="inline-doc" id="djilbairlink_setfrequencyband_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFrequencyBand</h6></div>

~~~java
 void setFrequencyBand(LightbridgeFrequencyBand frequencyBand, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_lb_frequency_band_key">AirLinkKey.LB_FREQUENCY_BAND</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the LB air link frequency band. It is only supported by Inspire 2 and Phantom 4 Pro. For the other products
 with LB air link, the frequency band is always 2.4 GHz.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_djilbairlinkfrequencyband">LightbridgeFrequencyBand</a> <font color="#000">frequencyBand</td><td><font color="#666"><i>LBAirLink frequency band to change to.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djilbairlink_getfrequencyband"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_getfrequencyband_inline">getFrequencyBand</a></div></div><div class="inline-doc" id="djilbairlink_getfrequencyband_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFrequencyBand</h6></div>

~~~java
 void getFrequencyBand(final CompletionCallbackWith<LightbridgeFrequencyBand> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_lb_frequency_band_key">AirLinkKey.LB_FREQUENCY_BAND</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the LB air link frequency band. It is only supported by Inspire 2 and Phantom 4 Pro. For the other products  with LB air link, the frequency band is always 2.4 GHz.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;<a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_djilbairlinkfrequencyband">LightbridgeFrequencyBand</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<html><p><br></p></html>

##### Related:

<div class="api-row" id="djilbairlink_djilbairlinkchannelinterference"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/LBAirLink/DJILBAirLink_DJILBAirLinkChannelInterference.html">ChannelInterference</a></div></div><div class="api-row" id="djilbairlink_djilbairlinkfrequencyband"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djilbairlink_djilbairlinkfrequencyband_inline">LightbridgeFrequencyBand</a></div></div><div class="inline-doc" id="djilbairlink_djilbairlinkfrequencyband_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>LightbridgeFrequencyBand</h6></div>

~~~java
@EXClassNullAway
 enum LightbridgeFrequencyBand 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_lb_frequency_band_key">AirLinkKey.LB_FREQUENCY_BAND</a>, <a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_lb_supported_frequency_bands_key">AirLinkKey.LB_SUPPORTED_FREQUENCY_BANDS</a></td></tr></table></html>



##### Description:



<font color="#666">LBAirLink frequency band. Supported only by Phantom 4 Professional.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djilbairlink_djilbairlinkfrequencyband_2dot4g_inline"></a>FREQUENCY_BAND_2_DOT_4_GHZ</td><td><font color="#666">The LBAirLink Frequency band is 2.4 GHz.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djilbairlink_djilbairlinkfrequencyband_5dot7g_inline"></a>FREQUENCY_BAND_5_DOT_7_GHZ</td><td><font color="#666">The LBAirLink Frequency band is 5.7 GHz.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djilbairlink_djilbairlinkfrequencyband_5dot8g_inline"></a>FREQUENCY_BAND_5_DOT_8_GHZ</td><td><font color="#666">The LBAirLink Frequency band is 5.8 GHz.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djilbairlink_djilbairlinkfrequencyband_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The LBAirLink Frequency is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djilbairlink_djilbairlinkchannelselectionmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djilbairlink_djilbairlinkchannelselectionmode_inline">ChannelSelectionMode</a></div></div><div class="inline-doc" id="djilbairlink_djilbairlinkchannelselectionmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ChannelSelectionMode</h6></div>

~~~java
@EXClassNullAway
 enum ChannelSelectionMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_channel_selection_mode_key">AirLinkKey.CHANNEL_SELECTION_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Downlink channel selection mode (manual or automatic) for the wireless link.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djilbairlink_djilbairlinkchannelselectionmode_auto_inline"></a>AUTO</td><td><font color="#666">Air link will automatically select the best physical channel based on the signal environment.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djilbairlink_djilbairlinkchannelselectionmode_manual_inline"></a>MANUAL</td><td><font color="#666">Manually select the physical channel.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djilbairlink_djilbairlinkchannelselectionmode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown physical channel selection mode.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djilbairlink_djilbairlinkfpvvideoqualitylatency"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djilbairlink_djilbairlinkfpvvideoqualitylatency_inline">LightbridgeTransmissionMode</a></div></div><div class="inline-doc" id="djilbairlink_djilbairlinkfpvvideoqualitylatency_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>LightbridgeTransmissionMode</h6></div>

~~~java
@EXClassNullAway
 enum LightbridgeTransmissionMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_transmission_mode_key">AirLinkKey.TRANSMISSION_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">FPV(First-person view) Video can prioritize either quality or latency.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djilbairlink_djilbairlinkfpvvideoqualitylatency_highquality_inline"></a>HIGH_QUALITY</td><td><font color="#666">High quality priority.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djilbairlink_djilbairlinkfpvvideoqualitylatency_lowlatency_inline"></a>LOW_LATENCY</td><td><font color="#666">Low latency priority.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djilbairlink_djilbairlinkfpvvideoqualitylatency_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djilbairlink_djilbairlinkdatarate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djilbairlink_djilbairlinkdatarate_inline">LightbridgeDataRate</a></div></div><div class="inline-doc" id="djilbairlink_djilbairlinkdatarate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>LightbridgeDataRate</h6></div>

~~~java
@EXClassNullAway
 enum LightbridgeDataRate 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.airlink</td></tr></table></html>



##### Description:



<font color="#666">Wireless downlink data rate. Lower rates are used for longer ranges, but will have lower video quality.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djilbairlink_djilbairlinkdatarate_4mbps_inline"></a>BANDWIDTH_4_MBPS</td><td><font color="#666">4 Mbps (Potential range up to 3 km)</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djilbairlink_djilbairlinkdatarate_6mbps_inline"></a>BANDWIDTH_6_MBPS</td><td><font color="#666">6 Mbps (Potential range up to 2 km)</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djilbairlink_djilbairlinkdatarate_8mbps_inline"></a>BANDWIDTH_8_MBPS</td><td><font color="#666">8 Mbps (Potential range up to 1.5 km)</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djilbairlink_djilbairlinkdatarate_10mbps_inline"></a>BANDWIDTH_10_MBPS</td><td><font color="#666">10 Mbps (Potential range up to 0.7 km)</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djilbairlink_djilbairlinkdatarate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djilbairlink_djilightbridgeantennarssi"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/LBAirLink/DJILBAirLink_DJILightbridgeAntennaRSSI.html">LightbridgeAntennaRSSI</a></div></div><div class="api-row" id="djilbairlink_antennarssicallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/LBAirLink/DJILBAirLink_AntennaRSSICallbackInterface.html">AntennaRSSICallback</a></div></div><div class="api-row" id="djilbairlink_updateallchannelinterferencecallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/LBAirLink/DJILBAirLink_UpdateAllChannelInterferenceCallbackInterface.html">ChannelInterferenceCallback</a></div></div><html><p><br></p></html>

#### State Updates

<div class="api-row" id="djilbairlink_setaircraftantennarssicallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_setaircraftantennarssicallback_inline">setAircraftAntennaRSSICallback</a></div></div><div class="inline-doc" id="djilbairlink_setaircraftantennarssicallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAircraftAntennaRSSICallback</h6></div>

~~~java
 void setAircraftAntennaRSSICallback(AntennaRSSICallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_aircraft_antenna_rssi_key">AirLinkKey.AIRCRAFT_ANTENNA_RSSI</a></td></tr></table></html>



##### Description:



<font color="#666">Set callback to receive RSSI information on each antenna of aircraft.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/LBAirLink/DJILBAirLink_AntennaRSSICallbackInterface.html#djilbairlink_antennarssicallbackinterface">AntennaRSSICallback</a> <font color="#000">callback</td><td><font color="#666"><i>The interface of <code><a href="/Components/LBAirLink/DJILBAirLink_AntennaRSSICallbackInterface.html#djilbairlink_antennarssicallbackinterface">AntennaRSSICallback</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djilbairlink_setremotecontrollerantennarssicallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_setremotecontrollerantennarssicallback_inline">setRemoteControllerAntennaRSSICallback</a></div></div><div class="inline-doc" id="djilbairlink_setremotecontrollerantennarssicallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setRemoteControllerAntennaRSSICallback</h6></div>

~~~java
 void setRemoteControllerAntennaRSSICallback(AntennaRSSICallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIAirLinkKey.html#airlinkkey_remote_controller_antenna_rssi_key">AirLinkKey.REMOTE_CONTROLLER_ANTENNA_RSSI</a></td></tr></table></html>



##### Description:



<font color="#666">Set callback to receive RSSI information on each antenna of remote controller.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/LBAirLink/DJILBAirLink_AntennaRSSICallbackInterface.html#djilbairlink_antennarssicallbackinterface">AntennaRSSICallback</a> <font color="#000">callback</td><td><font color="#666"><i>The interface of <code><a href="/Components/LBAirLink/DJILBAirLink_AntennaRSSICallbackInterface.html#djilbairlink_antennarssicallbackinterface">AntennaRSSICallback</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djilbairlink_updateallchannelinterferencecallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilbairlink_updateallchannelinterferencecallback_inline">setChannelInterferenceCallback</a></div></div><div class="inline-doc" id="djilbairlink_updateallchannelinterferencecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setChannelInterferenceCallback</h6></div>

~~~java
 void setChannelInterferenceCallback(ChannelInterferenceCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Sets up the DJILBAirLinkUpdatedAllChannelInterferenceCallback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">ChannelInterferenceCallback <font color="#000">callback</td><td><font color="#666"><i>The <code><a href="/Components/LBAirLink/DJILBAirLink_UpdateAllChannelInterferenceCallbackInterface.html#djilbairlink_updateallchannelinterferencecallbackinterface">ChannelInterferenceCallback</a></code>.</i></td></tr></table></html></div>


