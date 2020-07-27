<div class="article"><h1 ><font color="#AAA">class </font>VideoDataRateCallback</h1></div>

~~~java
 interface VideoDataRateCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Updated data rate in Mbps for the wireless downlink (from aircraft to remote controller). This link transfers all information from aircraft to remote controller, which is predominantly video information.



##### Class Members:



#### Callback Method

<div class="api-row" id="djiocusynclink_didupdatevideodatarate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiocusynclink_didupdatevideodatarate_inline">onUpdate</a></div></div><div class="inline-doc" id="djiocusynclink_didupdatevideodatarate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
        void onUpdate(float newValue)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.airlink</td></tr></table></html>



##### Description:



<font color="#666">Updated data rate in Mbps for the wireless downlink (from aircraft to remote controller). This link transfers  all information from aircraft to remote controller, which is predominantly video information.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">newValue</td><td><font color="#666"><i>The data rate of the downlink in Mbps.</i></td></tr></table></html></div>


