<div class="article"><h1 ><font color="#AAA">class </font>LiveStream</h1></div>

~~~java
 final class LiveStream 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub.model</td></tr></table></html>



##### Description:



<font color="#666">This class represents the live stream information of devices in the same team.



##### Class Members:

<div class="api-row" id="djiflighthubmanager_djiflighthublivestream_rtmpurl"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_djiflighthublivestream_rtmpurl_inline">getRtmpURL</a></div></div><div class="inline-doc" id="djiflighthubmanager_djiflighthublivestream_rtmpurl_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRtmpURL</h6></div>

~~~java
 String getRtmpURL() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub.model</td></tr></table></html>



##### Description:



<font color="#666">Gets the RTMP(Real-Time Messaging Protocol) URL of the live stream. When the  device is broadcasting, user can receive the live stream's video data and audio data through RTMP.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>A URL string.</i></td></tr></table></html></div>

<div class="api-row" id="djiflighthubmanager_djiflighthublivestream_isvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_djiflighthublivestream_isvalid_inline">isValid</a></div></div><div class="inline-doc" id="djiflighthubmanager_djiflighthublivestream_isvalid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isValid</h6></div>

~~~java
 boolean isValid() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub.model</td></tr></table></html>



##### Description:



<font color="#666">Determines if the live stream is valid. When the team member stops live streaming or the device  is disconnected, the live stream will become invalid.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the live stream is valid.</i></td></tr></table></html></div>


