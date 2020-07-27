<div class="article"><h1 ><font color="#AAA">class </font>SignalQualityCallback</h1></div>

~~~java
@EXClassNullAway
 interface SignalQualityCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.airlink</td></tr></table></html>



##### Description:



<font color="#666">Updated signal quality in percent for the wireless link. Signal quality is a function of signal strength, interference and data rate. Signal  quality will be more susceptible to weak signal strengths or high  interference when the data rate is high.



##### Class Members:

<div class="api-row" id="djiairlink_signalqualitycallbackupdate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairlink_signalqualitycallbackupdate_inline">onUpdate</a></div></div><div class="inline-doc" id="djiairlink_signalqualitycallbackupdate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
    void onUpdate(int quality)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.airlink</td></tr></table></html>



##### Description:



<font color="#666">Update signal quality.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">quality</td><td><font color="#666"><i>The signal quality in percent with range [0, 100], where 100 is the best quality.</i></td></tr></table></html></div>


