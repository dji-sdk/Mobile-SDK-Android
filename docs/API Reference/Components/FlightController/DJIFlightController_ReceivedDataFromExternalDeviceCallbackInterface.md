<div class="article"><h1 ><font color="#AAA">class </font>OnboardSDKDeviceDataCallback</h1></div>

~~~java
 interface OnboardSDKDeviceDataCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Callback function that updates the data received from an external device (e.g.the onboard device).



##### Class Members:



#### Callback Method

<div class="api-row" id="djiflightcontroller_receivedatafromexternaldevice"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_receivedatafromexternaldevice_inline">onReceive</a></div></div><div class="inline-doc" id="djiflightcontroller_receivedatafromexternaldevice_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onReceive</h6></div>

~~~java
 void onReceive(byte[] data)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Called when the data received from an external device (e.g. the onboard device) has been updated.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">byte[] <font color="#000">data</td><td><font color="#666"><i>Data received from an external device. The size of the data will not be larger than 100 bytes.</i></td></tr></table></html></div>


