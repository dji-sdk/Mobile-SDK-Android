<div class="article"><h1 ><font color="#AAA">class </font>ReceiverInfo</h1></div>

~~~java
@EXClassNullAway
 final class ReceiverInfo 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Single RTK receiver information. Each receiver is connected to a single antenna.



##### Class Members:

<div class="api-row" id="djirtk_djirtkreceiverinfo_isconstellationsupported"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkreceiverinfo_isconstellationsupported_inline">isConstellationSupported</a></div></div><div class="inline-doc" id="djirtk_djirtkreceiverinfo_isconstellationsupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isConstellationSupported</h6></div>

~~~java
 boolean isConstellationSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if constellation is supported. The European and American versions of RTK support GPS and GLONASS, while the Asia Pacific version supports GPS and BeiDou.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkreceiverinfo_satellitecount"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkreceiverinfo_satellitecount_inline">getSatelliteCount</a></div></div><div class="inline-doc" id="djirtk_djirtkreceiverinfo_satellitecount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSatelliteCount</h6></div>

~~~java
 int getSatelliteCount() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Valid satellite count for this receiver.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>


