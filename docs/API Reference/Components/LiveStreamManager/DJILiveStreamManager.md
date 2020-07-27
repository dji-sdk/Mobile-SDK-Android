<div class="article"><h1 ><font color="#AAA">class </font>LiveStreamManager</h1></div>

~~~java
 class LiveStreamManager 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">The manager is used to stream the video to a RTMP server to do live streaming with DJI products.



##### Class Members:

<div class="api-row" id="djilivestreammanager_isstreaming"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilivestreammanager_isstreaming_inline">isStreaming</a></div></div><div class="inline-doc" id="djilivestreammanager_isstreaming_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isStreaming</h6></div>

~~~java
 boolean isStreaming() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Determines if the live streaming starts or not. After starting this flag will not be affected by the RTMP server status.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the live stream manager is streaming.</i></td></tr></table></html></div>

<div class="api-row" id="djilivestreammanager_setliveurl"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilivestreammanager_setliveurl_inline">setLiveUrl</a></div></div><div class="inline-doc" id="djilivestreammanager_setliveurl_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setLiveUrl</h6></div>

~~~java
 void setLiveUrl (String url) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Sets the URL address of the RTMP Server. This method should be called before the calling of <code><a href="/Components/LiveStreamManager/DJILiveStreamManager.html#djilivestreammanager_startstream">startStream</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String <font color="#000">url</td><td><font color="#666"><i>The URL address string of the RTMP Server.</i></td></tr></table></html></div>

<div class="api-row" id="djilivestreammanager_getliveurl"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilivestreammanager_getliveurl_inline">getLiveUrl</a></div></div><div class="inline-doc" id="djilivestreammanager_getliveurl_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLiveUrl</h6></div>

~~~java
 String getLiveUrl() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Gets the current URL address of the RTMP Server.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>A string of the URL address.</i></td></tr></table></html></div>

<div class="api-row" id="djilivestreammanager_startstream"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilivestreammanager_startstream_inline">startStream</a></div></div><div class="inline-doc" id="djilivestreammanager_startstream_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startStream</h6></div>

~~~java
 int startStream() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Starts the live streaming. If the manager starts successfully, <code><a href="/Components/LiveStreamManager/DJILiveStreamManager.html#djilivestreammanager_isstreaming">isStreaming</a></code> will return <code>true</code>. The  encoder will start to encoding the video frame if it is needed. The video will be streamed to the RTMP server if the server  is available. The audio can be streamed along with the video if the audio setting is enabled.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the error code.</i></td></tr></table></html></div>

<div class="api-row" id="djilivestreammanager_stopstream"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilivestreammanager_stopstream_inline">stopStream</a></div></div><div class="inline-doc" id="djilivestreammanager_stopstream_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopStream</h6></div>

~~~java
 void stopStream() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Stop the live streaming. The operation is asynchronous  and <code><a href="/Components/LiveStreamManager/DJILiveStreamManager.html#djilivestreammanager_isstreaming">isStreaming</a></code> will return <code>false</code>  when the operation is complete.

</div>

<div class="api-row" id="djilivestreammanager_getstarttime"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilivestreammanager_getstarttime_inline">getStartTime</a></div></div><div class="inline-doc" id="djilivestreammanager_getstarttime_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getStartTime</h6></div>

~~~java
 long getStartTime() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Returns the start time of the live streaming. The start time is  updated when <code><a href="/Components/LiveStreamManager/DJILiveStreamManager.html#djilivestreammanager_startstream">startStream</a></code> is successful.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">long</td><td><font color="#666"><i>A long value of the start time.</i></td></tr></table></html></div>

<div class="api-row" id="djilivestreammanager_setaudiostreamingenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilivestreammanager_setaudiostreamingenabled_inline">setAudioStreamingEnabled</a></div></div><div class="inline-doc" id="djilivestreammanager_setaudiostreamingenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAudioStreamingEnabled</h6></div>

~~~java
 void setAudioStreamingEnabled(boolean enabled) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Enables/disables the audio streaming. When it is enabled, the audio received by the mobile device's microphone will be streamed  to the RTMP server along with the video. This setting will take effect before <code><a href="/Components/LiveStreamManager/DJILiveStreamManager.html#djilivestreammanager_startstream">startStream</a></code> is called.  Changing this setting after <code><a href="/Components/LiveStreamManager/DJILiveStreamManager.html#djilivestreammanager_startstream">startStream</a></code> is called requires restarting the streaming. The audio can be  muted during the streaming by calling <code><a href="/Components/LiveStreamManager/DJILiveStreamManager.html#djilivestreammanager_setaudiomuted">setAudioMuted</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i>Pass <code>true</code> to enable the audio streaming, <code>false</code> to disable the audio streaming.</i></td></tr></table></html></div>

<div class="api-row" id="djilivestreammanager_setaudiomuted"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilivestreammanager_setaudiomuted_inline">setAudioMuted</a></div></div><div class="inline-doc" id="djilivestreammanager_setaudiomuted_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAudioMuted</h6></div>

~~~java
 void setAudioMuted(boolean enable) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Mutes the audio or unmutes the audio. <br> Notes: this method only works when audio function is enabled ( <code><a href="/Components/LiveStreamManager/DJILiveStreamManager.html#djilivestreammanager_isliveaudioenabled">isLiveAudioEnabled</a></code> returns <code>true</code>).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enable</td><td><font color="#666"><i>Pass <code>true</code> to mute the audio, <code>false</code> to unmute the audio.</i></td></tr></table></html></div>

<div class="api-row" id="djilivestreammanager_isliveaudioenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilivestreammanager_isliveaudioenabled_inline">isLiveAudioEnabled</a></div></div><div class="inline-doc" id="djilivestreammanager_isliveaudioenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isLiveAudioEnabled</h6></div>

~~~java
 boolean isLiveAudioEnabled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Returns <code>true</code> if the audio function is enabled, vice versa.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check if the audio function is enabled.</i></td></tr></table></html></div>

<div class="api-row" id="djilivestreammanager_isaudiomuted"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilivestreammanager_isaudiomuted_inline">isAudioMuted</a></div></div><div class="inline-doc" id="djilivestreammanager_isaudiomuted_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isAudioMuted</h6></div>

~~~java
 boolean isAudioMuted() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Returns <code>true</code> if the audio is muted, vice versa.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check if the audio is muted.</i></td></tr></table></html></div>

<div class="api-row" id="djilivestreammanager_setvideoencodingenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilivestreammanager_setvideoencodingenabled_inline">setVideoEncodingEnabled</a></div></div><div class="inline-doc" id="djilivestreammanager_setvideoencodingenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setVideoEncodingEnabled</h6></div>

~~~java
 void setVideoEncodingEnabled(boolean enable) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Enables/disables the video encoding by force for the live streaming. The basic workflow to process  the video feed from the aircraft is to decode first and then encode again with a specific bit rate  into H.264 stream. Therefore, video encoding is required in default. For some drones like Mavic Pro,  the original video feed from Mavic Pro remote controller can be streamed to a RTMP server directly,  so the video encoding is disabled for Mavic Pro, however, the bit-rate of the original video is very  high, by enabling this flag, the original video will be decoded and encoded to a lower speed video stream.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enable</td><td><font color="#666"><i>Pass <code>true</code> to enable the Video Encoding, <code>false</code> to disable the Video Encoding.</i></td></tr></table></html></div>

<div class="api-row" id="djilivestreammanager_isvideoencodingenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilivestreammanager_isvideoencodingenabled_inline">isVideoEncodingEnabled</a></div></div><div class="inline-doc" id="djilivestreammanager_isvideoencodingenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isVideoEncodingEnabled</h6></div>

~~~java
 boolean isVideoEncodingEnabled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Returns <code>true</code> if video encoding is enabled, vice versa.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the force encoding flag is enabled.</i></td></tr></table></html></div>

<div class="api-row" id="djilivestreammanager_getlivevideofps"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilivestreammanager_getlivevideofps_inline">getLiveVideoFps</a></div></div><div class="inline-doc" id="djilivestreammanager_getlivevideofps_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLiveVideoFps</h6></div>

~~~java
 float getLiveVideoFps() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Returns the real-time live video fps.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of the live video fps.</i></td></tr></table></html></div>

<div class="api-row" id="djilivestreammanager_getlivevideobitrate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilivestreammanager_getlivevideobitrate_inline">getLiveVideoBitRate</a></div></div><div class="inline-doc" id="djilivestreammanager_getlivevideobitrate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLiveVideoBitRate</h6></div>

~~~java
 int getLiveVideoBitRate() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Returns the real-time video stream bit rate in kpbs.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the live video bit rate.</i></td></tr></table></html></div>

<div class="api-row" id="djilivestreammanager_getliveaudiobitrate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilivestreammanager_getliveaudiobitrate_inline">getLiveAudioBitRate</a></div></div><div class="inline-doc" id="djilivestreammanager_getliveaudiobitrate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLiveAudioBitRate</h6></div>

~~~java
 int getLiveAudioBitRate() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Returns the real-time audio stream bit rate in kpbs.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the live audio bit rate.</i></td></tr></table></html></div>

<div class="api-row" id="djilivestreammanager_getlivevideocachesize"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilivestreammanager_getlivevideocachesize_inline">getLiveVideoCacheSize</a></div></div><div class="inline-doc" id="djilivestreammanager_getlivevideocachesize_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLiveVideoCacheSize</h6></div>

~~~java
 int getLiveVideoCacheSize() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Returns the real-time video cache list size, unit: frame.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the live video cache list size.</i></td></tr></table></html></div>


