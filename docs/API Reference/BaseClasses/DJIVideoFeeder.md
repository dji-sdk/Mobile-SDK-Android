<div class="article"><h1 ><font color="#AAA">class </font>VideoFeeder</h1></div>

~~~java
 class VideoFeeder 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Class that manages live video feed from DJI products to the mobile device.



##### Class Members:

<div class="api-row" id="djivideofeeder_getinstance"><div class="api-col left">Get Instance</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivideofeeder_getinstance_inline">getInstance</a></div></div><div class="inline-doc" id="djivideofeeder_getinstance_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getInstance</h6></div>

~~~java
 static VideoFeeder getInstance() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The instance of <code><a href="/BaseClasses/DJIVideoFeeder.html#djivideofeeder">VideoFeeder</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/BaseClasses/DJIVideoFeeder.html#djivideofeeder">VideoFeeder</a></td><td><font color="#666"><i>An object of <code><a href="/BaseClasses/DJIVideoFeeder.html#djivideofeeder">VideoFeeder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djivideofeeder_addphysicalsourcelistener"><div class="api-col left">Add Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivideofeeder_addphysicalsourcelistener_inline">addPhysicalSourceListener</a></div></div><div class="inline-doc" id="djivideofeeder_addphysicalsourcelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addPhysicalSourceListener</h6></div>

~~~java
 void addPhysicalSourceListener(PhysicalSourceListener listener)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Add physical source listener.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/BaseClasses/DJIVideoFeeder_PhysicalSourceListener.html#djivideofeeder_physicalsourcelistener">PhysicalSourceListener</a> <font color="#000">listener</td><td><font color="#666"><i>An interface of <code><a href="/BaseClasses/DJIVideoFeeder_PhysicalSourceListener.html#djivideofeeder_physicalsourcelistener">PhysicalSourceListener</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djivideofeeder_removephysicalsourcelistener"><div class="api-col left">Remove Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivideofeeder_removephysicalsourcelistener_inline">removePhysicalSourceListener</a></div></div><div class="inline-doc" id="djivideofeeder_removephysicalsourcelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removePhysicalSourceListener</h6></div>

~~~java
 void removePhysicalSourceListener(PhysicalSourceListener listener)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Remove physical source listener.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/BaseClasses/DJIVideoFeeder_PhysicalSourceListener.html#djivideofeeder_physicalsourcelistener">PhysicalSourceListener</a> <font color="#000">listener</td><td><font color="#666"><i>An interface of <code><a href="/BaseClasses/DJIVideoFeeder_PhysicalSourceListener.html#djivideofeeder_physicalsourcelistener">PhysicalSourceListener</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djivideofeeder_primaryvideofeed"><div class="api-col left">Primary Video Feed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivideofeeder_primaryvideofeed_inline">getPrimaryVideoFeed</a></div></div><div class="inline-doc" id="djivideofeeder_primaryvideofeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPrimaryVideoFeed</h6></div>

~~~java
@NonNull
 VideoFeed getPrimaryVideoFeed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The primary video feed. <br> The possible physical sources for the primary video feed include:  <br> - <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_maincamera">MAIN_CAM</a></code> <br> -  <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_lb">LB</a></code> <br> -  <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_hdmi">HDMI</a></code> <br> -  <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_leftcamera">LEFT_CAM</a></code> <br> -  <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_rightcamera">RIGHT_CAM</a></code> <br> For M210 and M210 RTK, the  physical sources are controlled by the bandwidth allocation between the port (left) and starboard  (right) main cameras (<code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_setbandwidthallocationforleftcamera">setBandwidthAllocationForLeftCamera</a></code>): <br> - When bandwidth  is 100% on the left camera, the primary source is  <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_leftcamera">LEFT_CAM</a></code> and the secondary source is  <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_fpvcamera">FPV_CAM</a></code>. <br> - When bandwidth is 0%  on the left camera, the primary source is <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_rightcamera">RIGHT_CAM</a></code>  and the secondary source is <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_fpvcamera">FPV_CAM</a></code>. <br> - When  bandwidth is neither 0% nor 100% on the left camera, the primary source is  <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_leftcamera">LEFT_CAM</a></code> and the secondary source is  <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_rightcamera">RIGHT_CAM</a></code>. <br> For Matrice 300 RTK, the physical  source can be: <br> <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_leftcamera">LEFT_CAM</a></code>, <br> <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_rightcamera">RIGHT_CAM</a></code>, <br> <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_topcamera">TOP_CAM</a></code>  and <br> <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_fpvcamera">FPV_CAM</a></code>. <br> Please note that video playback stream will be received as primary or secondary video feed, if video playback starts on Zenmuse H20/H20T.  Video feed channel could be assigned by <code><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_assignsourcetoprimarychannel">assignSourceToPrimaryChannel</a></code> in <code><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink">OcuSyncLink</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed">VideoFeed</a></td><td><font color="#666"><i>A <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed">VideoFeed</a></code> object.</i></td></tr></table></html></div>

<div class="api-row" id="djivideofeeder_secondaryvideofeed"><div class="api-col left">Secondary Video Feed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivideofeeder_secondaryvideofeed_inline">getSecondaryVideoFeed</a></div></div><div class="inline-doc" id="djivideofeeder_secondaryvideofeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSecondaryVideoFeed</h6></div>

~~~java
@NonNull
 VideoFeed getSecondaryVideoFeed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The secondary video feed. <br> The possible physical sources for the secondary video feed include:  <br> - <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_fpvcamera">FPV_CAM</a></code> <br> -  <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_ext">EXT</a></code> <br> -  <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_av">AV</a></code>  <br> - <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_rightcamera">RIGHT_CAM</a></code>. For M210 and M210 RTK, the physical  sources are controlled by the bandwidth allocation between the port (left) and starboard (right) main cameras  (<code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_setbandwidthallocationforleftcamera">setBandwidthAllocationForLeftCamera</a></code>): <br> - When bandwidth is 100% on the left camera, the primary  source is <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_leftcamera">LEFT_CAM</a></code> and the secondary source is  <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_fpvcamera">FPV_CAM</a></code>. <br> - When bandwidth is 0% on the left camera,  the primary source is <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_rightcamera">RIGHT_CAM</a></code> and the secondary source is  <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_fpvcamera">FPV_CAM</a></code>. <br> - When bandwidth is neither 0% nor 100% on  the left camera, the primary source is <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_leftcamera">LEFT_CAM</a></code> and the  secondary source is <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_rightcamera">RIGHT_CAM</a></code>. <br> For Matrice 300 RTK, the  physical source can be: <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_leftcamera">LEFT_CAM</a></code>, <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_rightcamera">RIGHT_CAM</a></code>, <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_topcamera">TOP_CAM</a></code>  and <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedphysicalsource_fpvcamera">FPV_CAM</a></code>. Please note that video playback stream will be received as primary or secondary video feed,  if video playback starts on Zenmuse H20/H20T. Video feed channel could be assigned by <code><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_assignsourcetoprimarychannel">assignSourceToPrimaryChannel</a></code> in <code><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink">OcuSyncLink</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed">VideoFeed</a></td><td><font color="#666"><i>A <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed">VideoFeed</a></code> object.</i></td></tr></table></html></div>

<div class="api-row" id="djivideofeeder_providetranscodedvideofeed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivideofeeder_providetranscodedvideofeed_inline">provideTranscodedVideoFeed</a></div></div><div class="inline-doc" id="djivideofeeder_providetranscodedvideofeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>provideTranscodedVideoFeed</h6></div>

~~~java
 VideoFeed provideTranscodedVideoFeed()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Returns a new VideoFeed instance to receive the transcoded video feed from the  main camera. The original video feed from the main camera is transcoded (using MediaCodec)  to generate H.264 video feed for more general usages. The encoder will use the calibrated  decoded feed when lens distortion calibration is needed. Setting the callback of VideoFeed  to null can stop the transcoding.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed">VideoFeed</a></td><td><font color="#666"><i>A <code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed">VideoFeed</a></code> object.</i></td></tr></table></html></div>

<div class="api-row" id="djivideofeeder_settranscodingdatarate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivideofeeder_settranscodingdatarate_inline">setTranscodingDataRate</a></div></div><div class="inline-doc" id="djivideofeeder_settranscodingdatarate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setTranscodingDataRate</h6></div>

~~~java
 void setTranscodingDataRate(float rate)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the destination data rate for the transcoded video feed. The valid range is [2, 20] in Mbps.  CAUTION: Changing the data rate during transcoding may re-start the internal encoder. The  transcoded video feed will get interrupted for a few seconds.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">rate</td><td><font color="#666"><i>The destination data rate for the transcoded video feed.</i></td></tr></table></html></div>

<div class="api-row" id="djivideofeeder_gettranscodingdatarate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivideofeeder_gettranscodingdatarate_inline">getTranscodingDataRate</a></div></div><div class="inline-doc" id="djivideofeeder_gettranscodingdatarate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTranscodingDataRate</h6></div>

~~~java
 float getTranscodingDataRate()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the data rate of all transcoded video feeder, in Mbps.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of the data rate of all transcoded video feeder.</i></td></tr></table></html></div>

<div class="api-row" id="djivideofeeder_islensdistortioncalibrationneeded"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivideofeeder_islensdistortioncalibrationneeded_inline">isLensDistortionCalibrationNeeded</a></div></div><div class="inline-doc" id="djivideofeeder_islensdistortioncalibrationneeded_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isLensDistortionCalibrationNeeded</h6></div>

~~~java
 boolean isLensDistortionCalibrationNeeded()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Determines if the original video feed requires lens distortion calibration. When calibration is needed,  it is not recommended to use the original video feed with the decoding  sample (https://github.com/DJI-Mobile-SDK-Tutorials/Android-VideoStreamDecodingSample). Use the transcoded  video feed instead and also the module: 'library-anti-distortion' should be included.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the video need anti-distortion feature.</i></td></tr></table></html></div>

<div class="api-row" id="djivideofeeder_isfetchkeyframeneeded"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivideofeeder_isfetchkeyframeneeded_inline">isFetchKeyFrameNeeded</a></div></div><div class="inline-doc" id="djivideofeeder_isfetchkeyframeneeded_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isFetchKeyFrameNeeded</h6></div>

~~~java
 boolean isFetchKeyFrameNeeded()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Determines if the original video feed requires SDK to fetch key frame. When fetch key frame is needed, it is  not recommended to use the original video feed with the decoding  sample (https://github.com/DJI-Mobile-SDK-Tutorials/Android-VideoStreamDecodingSample). Use the transcoded video feed instead.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the video need anti-distortion feature.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djivideofeeder_videodatalistenerinterface"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/BaseClasses/DJIVideoFeeder_VideoDataListenerInterface.html">VideoDataListener</a></div></div><div class="api-row" id="djivideofeeder_videoactivestatuslistenerinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/BaseClasses/DJIVideoFeeder_VideoActiveStatusListenerInterface.html">VideoActiveStatusListener</a></div></div><div class="api-row" id="djivideofeeder_djivideofeed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html">VideoFeed</a></div></div><div class="api-row" id="djivideofeeder_physicalsourcelistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/BaseClasses/DJIVideoFeeder_PhysicalSourceListener.html">PhysicalSourceListener</a></div></div>
