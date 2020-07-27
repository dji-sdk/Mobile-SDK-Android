<div class="article"><h1 ><font color="#AAA">class </font>DJICodecManager</h1></div>

~~~java
 class DJICodecManager implements RecvDataCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.codec</td></tr></table></html>



##### Description:



<font color="#666">Class that handles encoding and decoding of media.



##### Class Members:

<div class="api-row" id="djicodecmanager_destroycodec"><div class="api-col left">Destroy Codec</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicodecmanager_destroycodec_inline">destroyCodec</a></div></div><div class="inline-doc" id="djicodecmanager_destroycodec_inline"

><div class="article"><h6 ><font color="#AAA">method </font>destroyCodec</h6></div>

~~~java
 void destroyCodec()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.codec</td></tr></table></html>



##### Description:



<font color="#666">Destroys the media codec.

</div>

<div class="api-row" id="djicodecmanager_constructor"><div class="api-col left">Create Codec</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicodecmanager_constructor_inline">DJICodecManager</a></div></div><div class="inline-doc" id="djicodecmanager_constructor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJICodecManager</h6></div>

~~~java
 DJICodecManager(Context context, SurfaceTexture surfaceTexture,int width,int height)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.codec</td></tr></table></html>



##### Description:



<font color="#666">Constructor for the class.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Context <font color="#000">context</td><td><font color="#666"><i>The context.</i></td></tr><tr valign="top"><td><font color="#70BF41">SurfaceTexture <font color="#000">surfaceTexture</td><td><font color="#666"><i>The surface texture view.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">width</td><td><font color="#666"><i>The width of surface texture view.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">height</td><td><font color="#666"><i>The height of surface texture view.</i></td></tr></table></html></div>

<div class="api-row" id="djicodecmanager_constructor_surfaceholder"><div class="api-col left">Surface Holder</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicodecmanager_constructor_surfaceholder_inline">DJICodecManager</a></div></div><div class="inline-doc" id="djicodecmanager_constructor_surfaceholder_inline"

><div class="article"><h6 ><font color="#AAA">method </font>DJICodecManager</h6></div>

~~~java
 DJICodecManager(Context context, SurfaceHolder surfaceHolder, int width, int height)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.codec</td></tr></table></html>



##### Description:



<font color="#666">Constructor for the class.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Context <font color="#000">context</td><td><font color="#666"><i>The context.</i></td></tr><tr valign="top"><td><font color="#70BF41">SurfaceHolder <font color="#000">surfaceHolder</td><td><font color="#666"><i>The surface view.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">width</td><td><font color="#666"><i>The width of surface texture view.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">height</td><td><font color="#666"><i>The height of surface texture view.</i></td></tr></table></html></div>

<div class="api-row" id="djicodecmanager_cleansurface"><div class="api-col left">Clean Surface</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicodecmanager_cleansurface_inline">cleanSurface</a></div></div><div class="inline-doc" id="djicodecmanager_cleansurface_inline"

><div class="article"><h6 ><font color="#AAA">method </font>cleanSurface</h6></div>

~~~java
 void cleanSurface()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.codec</td></tr></table></html>



##### Description:



<font color="#666">Cleans the surface from the codec manager.

</div>

<div class="api-row" id="djicodecmanager_switchsource"><div class="api-col left">Switch Source</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicodecmanager_switchsource_inline">switchSource</a></div></div><div class="inline-doc" id="djicodecmanager_switchsource_inline"

><div class="article"><h6 ><font color="#AAA">method </font>switchSource</h6></div>

~~~java
 void switchSource(VideoSource source) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.codec</td></tr></table></html>



##### Description:



<font color="#666">Switches the video source of the decoder.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/CodecManager/DJICodecManager.html#djicodecmanager_videosource">VideoSource</a> <font color="#000">source</td><td><font color="#666"><i>The new video source.</i></td></tr></table></html></div>

<div class="api-row" id="djicodecmanager_isdecoderok"><div class="api-col left">Decoder Status</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicodecmanager_isdecoderok_inline">isDecoderOK</a></div></div><div class="inline-doc" id="djicodecmanager_isdecoderok_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isDecoderOK</h6></div>

~~~java
 boolean isDecoderOK() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.codec</td></tr></table></html>



##### Description:



<font color="#666">Determines whether the decoding status is normal.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the decoding status is normal, false otherwise.</i></td></tr></table></html></div>

<div class="api-row" id="djicodecmanager_senddatatodecoder"><div class="api-col left">Send Data To Decoder</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicodecmanager_senddatatodecoder_inline">sendDataToDecoder</a></div></div><div class="inline-doc" id="djicodecmanager_senddatatodecoder_inline"

><div class="article"><h6 ><font color="#AAA">method </font>sendDataToDecoder</h6></div>

~~~java
 void sendDataToDecoder(byte[] videoBuffer, int size)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.codec</td></tr></table></html>



##### Description:



<font color="#666">Sends H264 raw video data to the decoder.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">byte[] <font color="#000">videoBuffer</td><td><font color="#666"><i>The video buffer data.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">size</td><td><font color="#666"><i>The data size.</i></td></tr></table></html></div>

<div class="api-row" id="djicodecmanager_senddatatodecoderwithsource"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicodecmanager_senddatatodecoderwithsource_inline">sendDataToDecoder</a></div></div><div class="inline-doc" id="djicodecmanager_senddatatodecoderwithsource_inline"

><div class="article"><h6 ><font color="#AAA">method </font>sendDataToDecoder</h6></div>

~~~java
 void sendDataToDecoder(byte[] videoBuffer, int size, VideoSource source) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.codec</td></tr></table></html>



##### Description:



<font color="#666">Sends H264 raw video data to the decoder.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">byte[] <font color="#000">videoBuffer</td><td><font color="#666"><i>The video buffer data.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">size</td><td><font color="#666"><i>The data size.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/CodecManager/DJICodecManager.html#djicodecmanager_videosource">VideoSource</a> <font color="#000">source</td><td><font color="#666"><i>The source of the data.</i></td></tr></table></html></div>

<div class="api-row" id="djicodecmanager_senddatatodecoderwithsourceid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicodecmanager_senddatatodecoderwithsourceid_inline">sendDataToDecoder</a></div></div><div class="inline-doc" id="djicodecmanager_senddatatodecoderwithsourceid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>sendDataToDecoder</h6></div>

~~~java
 void sendDataToDecoder(byte[] videoBuffer, int size, int source) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.codec</td></tr></table></html>



##### Description:



<font color="#666">Sends H264 raw video data to the decoder with source id.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">byte[] <font color="#000">videoBuffer</td><td><font color="#666"><i>The video buffer data.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">size</td><td><font color="#666"><i>The data size.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">source</td><td><font color="#666"><i>source id.</i></td></tr></table></html></div>

<div class="api-row" id="djicodecmanager_getvideowidth"><div class="api-col left">Get Video Width</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicodecmanager_getvideowidth_inline">getVideoWidth</a></div></div><div class="inline-doc" id="djicodecmanager_getvideowidth_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVideoWidth</h6></div>

~~~java
 Integer getVideoWidth() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.codec</td></tr></table></html>



##### Description:



<font color="#666">Get the video width.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Integer</td><td><font color="#666"><i>Video width Integer value.</i></td></tr></table></html></div>

<div class="api-row" id="djicodecmanager_getvideoheight"><div class="api-col left">Get Video Height</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicodecmanager_getvideoheight_inline">getVideoHeight</a></div></div><div class="inline-doc" id="djicodecmanager_getvideoheight_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVideoHeight</h6></div>

~~~java
 Integer getVideoHeight()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.codec</td></tr></table></html>



##### Description:



<font color="#666">Get the video height.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Integer</td><td><font color="#666"><i>Video height Integer value.</i></td></tr></table></html></div>

<div class="api-row" id="djicodecmanager_onsurfacesizechanged"><div class="api-col left">Surface Size Changed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicodecmanager_onsurfacesizechanged_inline">onSurfaceSizeChanged</a></div></div><div class="inline-doc" id="djicodecmanager_onsurfacesizechanged_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onSurfaceSizeChanged</h6></div>

~~~java
 void onSurfaceSizeChanged(int width, int height,int degree) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.codec</td></tr></table></html>



##### Description:



<font color="#666">Resizes the surface when the size of the surface texture view has changed.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">width</td><td><font color="#666"><i>The new width of the surface</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">height</td><td><font color="#666"><i>The new height of the surface</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">degree</td><td><font color="#666"><i>The new degree of the surface</i></td></tr></table></html></div>

<div class="api-row" id="djicodecmanager_enabledyuvdata"><div class="api-col left">Enable Yuv Data</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicodecmanager_enabledyuvdata_inline">enabledYuvData</a></div></div><div class="inline-doc" id="djicodecmanager_enabledyuvdata_inline"

><div class="article"><h6 ><font color="#AAA">method </font>enabledYuvData</h6></div>

~~~java
 void enabledYuvData(Boolean enabled) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.codec</td></tr></table></html>



##### Description:



<font color="#666">To enable the YUV data output to user which must set the surface  as null to avoid native buffer.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Boolean <font color="#000">enabled</td><td><font color="#666"><i>The YUV data callback.</i></td></tr></table></html></div>

<div class="api-row" id="djicodecmanager_setpeakfocusthresholdenabled"><div class="api-col left">Peak Focus Threshold</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicodecmanager_setpeakfocusthresholdenabled_inline">setPeakFocusThresholdEnabled</a></div></div><div class="inline-doc" id="djicodecmanager_setpeakfocusthresholdenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPeakFocusThresholdEnabled</h6></div>

~~~java
 void setPeakFocusThresholdEnabled(boolean isEnabled)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.codec</td></tr></table></html>



##### Description:



<font color="#666">Enable Peak Focus Threshold.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isEnabled</td><td><font color="#666"><i>Enable/disable focus threshold.</i></td></tr></table></html></div>

<div class="api-row" id="djicodecmanager_setpeakfocusthreshold"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicodecmanager_setpeakfocusthreshold_inline">setPeakFocusThreshold</a></div></div><div class="inline-doc" id="djicodecmanager_setpeakfocusthreshold_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPeakFocusThreshold</h6></div>

~~~java
 void setPeakFocusThreshold(float peakFocusThresholdValue)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.codec</td></tr></table></html>



##### Description:



<font color="#666">Set the peak focus threshold value.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">peakFocusThresholdValue</td><td><font color="#666"><i>A float value representing peak focus threshold.</i></td></tr></table></html></div>

<div class="api-row" id="djicodecmanager_setoverexposurewarningenabled"><div class="api-col left">Over Exposure Warning</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicodecmanager_setoverexposurewarningenabled_inline">setOverexposureWarningEnabled</a></div></div><div class="inline-doc" id="djicodecmanager_setoverexposurewarningenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setOverexposureWarningEnabled</h6></div>

~~~java
 void setOverexposureWarningEnabled(boolean isEnabled) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.codec</td></tr></table></html>



##### Description:



<font color="#666">Enable or disable the over exposure warning.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isEnabled</td><td><font color="#666"><i>Enable/Disable the over exposure warning.</i></td></tr></table></html></div>

<div class="api-row" id="djicodecmanager_setyuvdatacallback"><div class="api-col left">Set Callback</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicodecmanager_setyuvdatacallback_inline">setYuvDataCallback</a></div></div><div class="inline-doc" id="djicodecmanager_setyuvdatacallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setYuvDataCallback</h6></div>

~~~java
 void setYuvDataCallback(YuvDataCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.codec</td></tr></table></html>



##### Description:



<font color="#666">Sends YUV data from hardware decoder.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/CodecManager/DJICodecManager_YuvDataCallbackInterface.html#djicodecmanager_yuvdatacallbackinterface">YuvDataCallback</a> <font color="#000">callback</td><td><font color="#666"><i>The YUV data callback.</i></td></tr></table></html></div>

<div class="api-row" id="djicodecmanager_getyuvdatacallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicodecmanager_getyuvdatacallback_inline">getYuvDataCallback</a></div></div><div class="inline-doc" id="djicodecmanager_getyuvdatacallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getYuvDataCallback</h6></div>

~~~java
 YuvDataCallback getYuvDataCallback() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.codec</td></tr></table></html>



##### Description:



<font color="#666">Sends YUV data from hardware decoder.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/CodecManager/DJICodecManager_YuvDataCallbackInterface.html#djicodecmanager_yuvdatacallbackinterface">YuvDataCallback</a></td><td><font color="#666"><i>The YUV data callback.</i></td></tr></table></html></div>

<div class="api-row" id="djicodecmanager_getyuvdata"><div class="api-col left">Get YUV Data</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicodecmanager_getyuvdata_inline">getYuvData</a></div></div><div class="inline-doc" id="djicodecmanager_getyuvdata_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getYuvData</h6></div>

~~~java
 byte[] getYuvData(int width, int height) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.codec</td></tr></table></html>



##### Description:



<font color="#666">Gets YUV data from hardware decoder.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">width</td><td><font color="#666"><i>width of the video.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">height</td><td><font color="#666"><i>height of the video.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">byte[]</td><td><font color="#666"><i>The YUV data from the hardware decoder.</i></td></tr></table></html></div>

<div class="api-row" id="djicodecmanager_getrgbadata"><div class="api-col left">Get Rgba Data</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicodecmanager_getrgbadata_inline">getRgbaData</a></div></div><div class="inline-doc" id="djicodecmanager_getrgbadata_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRgbaData</h6></div>

~~~java
 byte[] getRgbaData(int width, int height) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.codec</td></tr></table></html>



##### Description:



<font color="#666">Gets RGBA data from hardware decoder.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">width</td><td><font color="#666"><i>width of the video.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">height</td><td><font color="#666"><i>height of the video.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">byte[]</td><td><font color="#666"><i>The RGBA data from the hardware decoder.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djicodecmanager_yuvdatacallbackinterface"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/CodecManager/DJICodecManager_YuvDataCallbackInterface.html">YuvDataCallback</a></div></div><div class="api-row" id="djicodecmanager_videosource"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicodecmanager_videosource_inline">VideoSource</a></div></div><div class="inline-doc" id="djicodecmanager_videosource_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>VideoSource</h6></div>

~~~java
 enum VideoSource 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.codec</td></tr></table></html>



##### Description:



<font color="#666">The source of the video feed.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicodecmanager_videosource_camera_inline"></a>CAMERA</td><td><font color="#666">The source of the video feed is the main camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicodecmanager_videosource_fpv_inline"></a>FPV</td><td><font color="#666">The source of the video feed is the FPV camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicodecmanager_videosource_secondary_camera_inline"></a>SECONDARY_CAMERA</td><td><font color="#666">The source of the video feed is the secondary camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicodecmanager_videosource_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The source of the video feed is unknown.</td></tr></table></html>

##### Class Members:

</div>


