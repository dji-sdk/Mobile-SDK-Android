<div class="article"><h1 ><font color="#AAA">class </font>YuvDataCallback</h1></div>

~~~java
 interface YuvDataCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.codec</td></tr></table></html>



##### Description:



<font color="#666">Interface for the YUV data callback.



##### Class Members:



#### Callback Method

<div class="api-row" id="djicodecmanager_onyuvdatareceived"><div class="api-col left">Yuv Data Received</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicodecmanager_onyuvdatareceived_inline">onYuvDataReceived</a></div></div><div class="inline-doc" id="djicodecmanager_onyuvdatareceived_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onYuvDataReceived</h6></div>

~~~java
        void onYuvDataReceived(MediaFormat format, ByteBuffer yuvFrame, int dataSize, int width, int height)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.codec</td></tr></table></html>



##### Description:



<font color="#666">Callback method for processing the yuv frame data from hardware decoder.  Only works well after <code><a href="/Components/CodecManager/DJICodecManager.html#djicodecmanager_enabledyuvdata">enabledYuvData</a></code> is invoked and set as <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">MediaFormat <font color="#000">format</td><td><font color="#666"><i>the format of YUV.</i></td></tr><tr valign="top"><td><font color="#70BF41">ByteBuffer <font color="#000">yuvFrame</td><td><font color="#666"><i>YUV data buffer in the codec.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">dataSize</td><td><font color="#666"><i>size of the YUV data</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">width</td><td><font color="#666"><i>width of the video</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">height</td><td><font color="#666"><i>height of the video</i></td></tr></table></html></div>


