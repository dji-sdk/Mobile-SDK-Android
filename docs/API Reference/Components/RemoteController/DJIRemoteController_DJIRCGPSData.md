<div class="article"><h1 ><font color="#AAA">class </font>GPSData</h1></div>

~~~java
@EXClassNullAway
 class GPSData 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_gps_data_key">RemoteControllerKey.GPS_DATA</a></td></tr></table></html>



##### Description:



<font color="#666">Remote Controller's GPS data. Only supported by Remote Controller using DJI Lightbridge.



##### Class Members:

<div class="api-row" id="djiremotecontroller_djircgpsdata_time"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircgpsdata_time_inline">getTime</a></div></div><div class="inline-doc" id="djiremotecontroller_djircgpsdata_time_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTime</h6></div>

~~~java
 Time getTime() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The Remote Controller's GPS time.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController_DJIRCGpsTime.html#djiremotecontroller_djircgpstime">Time</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCGPSData.html#djiremotecontroller_djircgpsdata_time">getTime</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djircgpsdata_location"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircgpsdata_location_inline">getLocation</a></div></div><div class="inline-doc" id="djiremotecontroller_djircgpsdata_location_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLocation</h6></div>

~~~java
 GPSLocation getLocation() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The Remote Controller's location.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController_GPSLocation.html#djiremotecontroller_gpslocation">GPSLocation</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RemoteController/DJIRemoteController_GPSLocation.html#djiremotecontroller_gpslocation">GPSLocation</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djircgpsdata_speedeast"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircgpsdata_speedeast_inline">getEastSpeed</a></div></div><div class="inline-doc" id="djiremotecontroller_djircgpsdata_speedeast_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getEastSpeed</h6></div>

~~~java
 float getEastSpeed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The Remote Controller's speed in the East direction in meters/second. A negative speed means the Remote  Controller is moving in the West direction.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djircgpsdata_speednorth"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircgpsdata_speednorth_inline">getNorthSpeed</a></div></div><div class="inline-doc" id="djiremotecontroller_djircgpsdata_speednorth_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getNorthSpeed</h6></div>

~~~java
 float getNorthSpeed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The Remote Controller's speed in the North direction in meters/second. A negative speed means the Remote  Controller is moving in the South direction.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djircgpsdata_satellitecount"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircgpsdata_satellitecount_inline">getSatelliteCount</a></div></div><div class="inline-doc" id="djiremotecontroller_djircgpsdata_satellitecount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSatelliteCount</h6></div>

~~~java
 int getSatelliteCount() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The number of GPS satellites the Remote Controller detects.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djircgpsdata_accuracy"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircgpsdata_accuracy_inline">getLocationAccuracy</a></div></div><div class="inline-doc" id="djiremotecontroller_djircgpsdata_accuracy_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLocationAccuracy</h6></div>

~~~java
 float getLocationAccuracy() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The the margin of error, in meters, for the GPS location.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djircgpsdata_isvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircgpsdata_isvalid_inline">isValid</a></div></div><div class="inline-doc" id="djiremotecontroller_djircgpsdata_isvalid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isValid</h6></div>

~~~java
 boolean isValid() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the GPS data is valid. The data is not valid if there are too few satellites  or the signal strength is too low.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiremotecontroller_djircgpstime"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_DJIRCGpsTime.html">Time</a></div></div><div class="api-row" id="djiremotecontroller_gpslocation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_GPSLocation.html">GPSLocation</a></div></div>
