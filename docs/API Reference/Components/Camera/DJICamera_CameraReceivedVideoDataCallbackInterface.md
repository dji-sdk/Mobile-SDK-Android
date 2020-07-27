<div class="article"><h1 ><font color="#AAA">class </font>VideoDataCallback</h1></div>

~~~java
 interface VideoDataCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Video data update callback. H.264 (also called MPEG-4 Part 10 Advanced Video Coding or MPEG-4 AVC) is a video coding format that is currently one of the most commonly used formats for the recording, compression, and distribution of video content.



##### Class Members:



#### Callback Method

<div class="api-row" id="djicamera_didreceivevideodata"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_didreceivevideodata_inline">onReceive</a></div></div><div class="inline-doc" id="djicamera_didreceivevideodata_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onReceive</h6></div>

~~~java
 void onReceive(byte[] videoBuffer, int length)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Video data update callback. H.264 (also called MPEG-4 Part 10 Advanced Video Coding or MPEG-4 AVC) is a video coding format that is currently one of the most commonly used formats for the recording, compression, and distribution of video content.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">byte[] <font color="#000">videoBuffer</td><td><font color="#666"><i>H.264 video data buffer. Don't free the buffer after it has been used. The units for the video buffer are bytes.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">length</td><td><font color="#666"><i>Size of the address of the video data buffer in bytes.</i></td></tr></table></html></div>


