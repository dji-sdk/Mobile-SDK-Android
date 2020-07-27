<div class="article"><h1 ><font color="#AAA">class </font>VideoDataListener</h1></div>

~~~java
 interface VideoDataListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Video data listener.



##### Class Members:



#### Callback Method

<div class="api-row" id="djivideofeeder_videodatalistenerinterface_onreceive"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivideofeeder_videodatalistenerinterface_onreceive_inline">onReceive</a></div></div><div class="inline-doc" id="djivideofeeder_videodatalistenerinterface_onreceive_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onReceive</h6></div>

~~~java
        void onReceive(byte[] videoBuffer, int size)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Listener that is called when video data is received, but  if <code><a href="/BaseClasses/DJIVideoFeeder.html#djivideofeeder_islensdistortioncalibrationneeded">isLensDistortionCalibrationNeeded</a></code> return true, the callback will never be called.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">byte[] <font color="#000">videoBuffer</td><td><font color="#666"><i>An array containing video buffer.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">size</td><td><font color="#666"><i>The size of the buffer that contains valid data.</i></td></tr></table></html></div>


