<div class="article"><h1 ><font color="#AAA">class </font>VideoFeed</h1></div>

~~~java
 interface VideoFeed 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Video feed. Use it to receive video data from a physical source.



##### Class Members:

<div class="api-row" id="djivideofeeder_djivideofeed_setpriority"><div class="api-col left">Set Priority</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivideofeeder_djivideofeed_setpriority_inline">setPriority</a></div></div><div class="inline-doc" id="djivideofeeder_djivideofeed_setpriority_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPriority</h6></div>

~~~java
        void setPriority(@NonNull VideoFeedPriority priority, @Nullable final CommonCallbacks.CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Set the channel priority of the video feed. Priority will affect the bandwidth allocation if it is  not <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedpriority_unknown">UNKNOWN</a></code>, which is the default value. For example,  if the data comes from the payload device mounted on left gimbal is prefer, please set the priority to <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedpriority_high">HIGH</a></code>,  and physicalSource is <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_leftcamera">LEFT_CAM</a></code>. The others should be  set to <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedpriority_medium">MEDIUM</a></code> or <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedpriority_low">LOW</a></code>.  Only supported by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedpriority">VideoFeedPriority</a> <font color="#000">priority</td><td><font color="#666"><i>Priority for the primary video feed.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>callback The execution callback with the value(s) returned.</i></td></tr></table></html></div>

<div class="api-row" id="djivideofeeder_djivideofeed_getpriority"><div class="api-col left">Get Priority</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivideofeeder_djivideofeed_getpriority_inline">getPriority</a></div></div><div class="inline-doc" id="djivideofeeder_djivideofeed_getpriority_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPriority</h6></div>

~~~java
        void getPriority(@NonNull final CommonCallbacks.CompletionCallbackWith<VideoFeedPriority> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Get the channel priority of the video feed. Only supported by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;<a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedpriority">VideoFeedPriority</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>callback The execution callback with the value(s) returned.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djivideofeeder_djivideofeed_djivideofeedphysicalsource"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djivideofeeder_djivideofeed_djivideofeedphysicalsource_inline">PhysicalSource</a></div></div><div class="inline-doc" id="djivideofeeder_djivideofeed_djivideofeedphysicalsource_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>PhysicalSource</h6></div>

~~~java
@EXClassNullAway
 enum PhysicalSource 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.airlink</td></tr></table></html>



##### Description:



<font color="#666">The physical source of a video feed.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djivideofeeder_djivideofeed_djivideofeedphysicalsource_maincamera_inline"></a>MAIN_CAM</td><td><font color="#666">The video feed is from the main camera. It is the physical source used by most of DJI products.  <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_leftcamera">LEFT_CAM</a></code>  and <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_rightcamera">RIGHT_CAM</a></code> are used instead in  M210 series and M210 V2 series.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivideofeeder_djivideofeed_djivideofeedphysicalsource_fpvcamera_inline"></a>FPV_CAM</td><td><font color="#666">The video feed is from the FPV camera on Inspire 2, M200 series and M200 series v2 and Matrice 300 RTK.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivideofeeder_djivideofeed_djivideofeedphysicalsource_ext_inline"></a>EXT</td><td><font color="#666">The video feed is from EXT port while EXT port is enabled. It is only used for  Lightbridge 2 or aircrafts with Lightbridge 2 (e.g. M600).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivideofeeder_djivideofeed_djivideofeedphysicalsource_lb_inline"></a>LB</td><td><font color="#666">The video feed is from one of the LB ports (AV or HDMI) while EXT Port is enabled.  It is only used for stand-alone Lightbridge 2 or aircraft with stand-alone Lightbridge 2 modules (e.g. M600).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivideofeeder_djivideofeed_djivideofeedphysicalsource_hdmi_inline"></a>HDMI</td><td><font color="#666">The video feed is from the HDMI port while EXT port is disabled.  It is only used for stand-alone Lightbridge 2 or aircraft with stand-alone Lightbridge 2 modules.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivideofeeder_djivideofeed_djivideofeedphysicalsource_av_inline"></a>AV</td><td><font color="#666">The video feed is from AV port while EXT port is disabled. It is only used for stand-alone Lightbridge 2 or aircraft with stand-alone Lightbridge 2 modules.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivideofeeder_djivideofeed_djivideofeedphysicalsource_leftcamera_inline"></a>LEFT_CAM</td><td><font color="#666">The video feed is from the port (left) main camera. It is only used for M210 series and M210 V2 series and Matrice 300 RTK.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivideofeeder_djivideofeed_djivideofeedphysicalsource_rightcamera_inline"></a>RIGHT_CAM</td><td><font color="#666">The video feed is from the starboard (right) main camera. It is only used for M210 series and M210 V2 series and Matrice 300 RTK.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivideofeeder_djivideofeed_djivideofeedphysicalsource_topcamera_inline"></a>TOP_CAM</td><td><font color="#666">The video feed is from the camera above the aircraft. It is only used for Matrice 300 RTK.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivideofeeder_djivideofeed_djivideofeedphysicalsource_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown video physical source.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djivideofeeder_djivideofeed_djivideofeedpriority"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djivideofeeder_djivideofeed_djivideofeedpriority_inline">VideoFeedPriority</a></div></div><div class="inline-doc" id="djivideofeeder_djivideofeed_djivideofeedpriority_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>VideoFeedPriority</h6></div>

~~~java
 enum VideoFeedPriority 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.airlink</td></tr></table></html>



##### Description:



<font color="#666">The enum is used to represent priority of a stream channel. It is supported only by Matrice 300 RTK.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djivideofeeder_djivideofeed_djivideofeedpriority_high_inline"></a>HIGH</td><td><font color="#666">The stream channel's priority is high.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivideofeeder_djivideofeed_djivideofeedpriority_medium_inline"></a>MEDIUM</td><td><font color="#666">The stream channel's priority is medium.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivideofeeder_djivideofeed_djivideofeedpriority_low_inline"></a>LOW</td><td><font color="#666">The stream channel's priority is low.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivideofeeder_djivideofeed_djivideofeedpriority_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The stream channel's priority is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djivideofeeder_djivideofeed_djivideofeedphysicalsourcecallbackinterface"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed_DJIVideoFeedPhysicalSourceCallbackInterface.html">Callback</a></div></div><html><p><br></p></html>

#### Callback Method

<div class="api-row" id="djivideofeeder_djivideofeed_getvideosource"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivideofeeder_djivideofeed_getvideosource_inline">getVideoSource</a></div></div><div class="inline-doc" id="djivideofeeder_djivideofeed_getvideosource_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVideoSource</h6></div>

~~~java
        PhysicalSource getVideoSource()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the physical sources of the video data.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource">PhysicalSource</a></td><td><font color="#666"><i>An enum value of <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource">PhysicalSource</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djivideofeeder_djivideofeed_addvideodatalistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivideofeeder_djivideofeed_addvideodatalistener_inline">addVideoDataListener</a></div></div><div class="inline-doc" id="djivideofeeder_djivideofeed_addvideodatalistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addVideoDataListener</h6></div>

~~~java
        boolean addVideoDataListener(@NonNull final VideoDataListener listener)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Adds a listener to access the video data that is being shown by the VideoFeed.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/BaseClasses/DJIVideoFeeder_VideoDataListenerInterface.html#djivideofeeder_videodatalistenerinterface">VideoDataListener</a> <font color="#000">listener</td><td><font color="#666"><i>The listener to be added to the VideoFeed.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if listener was added successfully.</i></td></tr></table></html></div>

<div class="api-row" id="djivideofeeder_djivideofeed_removevideodatalistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivideofeeder_djivideofeed_removevideodatalistener_inline">removeVideoDataListener</a></div></div><div class="inline-doc" id="djivideofeeder_djivideofeed_removevideodatalistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeVideoDataListener</h6></div>

~~~java
        boolean removeVideoDataListener(VideoDataListener listener)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Removes the specified listener from the VideoFeed, if it is present (optional  operation).  If this VideoFeed does not contain the listener, it is unchanged.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/BaseClasses/DJIVideoFeeder_VideoDataListenerInterface.html#djivideofeeder_videodatalistenerinterface">VideoDataListener</a> <font color="#000">listener</td><td><font color="#666"><i>The listener to be removed from the VideoFeed.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the listener was removed successfully.</i></td></tr></table></html></div>

<div class="api-row" id="djivideofeeder_djivideofeed_getlisteners"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivideofeeder_djivideofeed_getlisteners_inline">getListeners</a></div></div><div class="inline-doc" id="djivideofeeder_djivideofeed_getlisteners_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getListeners</h6></div>

~~~java
        Set<VideoDataListener> getListeners()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Returns the list of the existing video data listeners.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Set&lt;<a href="/BaseClasses/DJIVideoFeeder_VideoDataListenerInterface.html#djivideofeeder_videodatalistenerinterface">VideoDataListener</a>&gt;</td><td><font color="#666"><i>A list of existing <code><a href="/BaseClasses/DJIVideoFeeder_VideoDataListenerInterface.html#djivideofeeder_videodatalistenerinterface">VideoDataListener</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djivideofeeder_djivideofeed_addvideoactivestatuslistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivideofeeder_djivideofeed_addvideoactivestatuslistener_inline">addVideoActiveStatusListener</a></div></div><div class="inline-doc" id="djivideofeeder_djivideofeed_addvideoactivestatuslistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addVideoActiveStatusListener</h6></div>

~~~java
        boolean addVideoActiveStatusListener(@NonNull final VideoActiveStatusListener listener)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Adds a listener to access the video active status that is being shown by the VideoFeed.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/BaseClasses/DJIVideoFeeder_VideoActiveStatusListenerInterface.html#djivideofeeder_videoactivestatuslistenerinterface">VideoActiveStatusListener</a> <font color="#000">listener</td><td><font color="#666"><i>The listener to be added to the VideoFeed.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the listener was added successfully.</i></td></tr></table></html></div>

<div class="api-row" id="djivideofeeder_djivideofeed_removevideoactivestatuslistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivideofeeder_djivideofeed_removevideoactivestatuslistener_inline">removeVideoActiveStatusListener</a></div></div><div class="inline-doc" id="djivideofeeder_djivideofeed_removevideoactivestatuslistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeVideoActiveStatusListener</h6></div>

~~~java
        boolean removeVideoActiveStatusListener(VideoActiveStatusListener listener)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Removes the specified listener from the VideoFeed, if it is present (optional operation).  If this VideoFeed does not contain the listener, it is unchanged.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/BaseClasses/DJIVideoFeeder_VideoActiveStatusListenerInterface.html#djivideofeeder_videoactivestatuslistenerinterface">VideoActiveStatusListener</a> <font color="#000">listener</td><td><font color="#666"><i>The listener to be removed from the VideoFeed.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the listener was removed successfully.</i></td></tr></table></html></div>

<div class="api-row" id="djivideofeeder_djivideofeed_destroy"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivideofeeder_djivideofeed_destroy_inline">destroy</a></div></div><div class="inline-doc" id="djivideofeeder_djivideofeed_destroy_inline"

><div class="article"><h6 ><font color="#AAA">method </font>destroy</h6></div>

~~~java
        void destroy()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Destroy all the listeners associated with this VideoFeed.

</div>


