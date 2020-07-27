<div class="article"><h1 ><font color="#AAA">class </font>DeviceHealthInformation</h1></div>

~~~java
 class DeviceHealthInformation 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.healthmanager</td></tr></table></html>



##### Description:



<font color="#666">Product Diagnostics device healthy information. Only supported by some components  of Matrice 300 RTK and Zenmuse H20 series. It is recommended to use device health  information to replace old diagnostics for flight controller and RTK. There will be  a few duplicated component error for gimbal, battery, perception module on Matrice 300 RTK.  Find error code and detailed description on Github (https://github.com/dji-sdk/Mobile-SDK-Android).



##### Class Members:

<div class="api-row" id="djidiagnostics_djidiagnosticsdevicehealthinformation_informationid"><div class="api-col left">Information ID</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djidiagnostics_djidiagnosticsdevicehealthinformation_informationid_inline">informationId</a></div></div><div class="inline-doc" id="djidiagnostics_djidiagnosticsdevicehealthinformation_informationid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>informationId</h6></div>

~~~java
 long informationId() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.healthmanager</td></tr></table></html>



##### Description:



<font color="#666">A unique code. You can find the detailed information at Github (https://github.com/dji-sdk/Mobile-SDK-Android).



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">long</td><td><font color="#666"><i>A long value of the information id.</i></td></tr></table></html></div>

<div class="api-row" id="djidiagnostics_djidiagnosticsdevicehealthinformation_sensorindex"><div class="api-col left">Sensor Index</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djidiagnostics_djidiagnosticsdevicehealthinformation_sensorindex_inline">sensorIndex</a></div></div><div class="inline-doc" id="djidiagnostics_djidiagnosticsdevicehealthinformation_sensorindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>sensorIndex</h6></div>

~~~java
 int sensorIndex() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.healthmanager</td></tr></table></html>



##### Description:



<font color="#666">Sensor index of a certain device module.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the sensor index.</i></td></tr></table></html></div>

<div class="api-row" id="djidiagnostics_djidiagnosticsdevicehealthinformation_componentindex"><div class="api-col left">Component Index</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djidiagnostics_djidiagnosticsdevicehealthinformation_componentindex_inline">componentId</a></div></div><div class="inline-doc" id="djidiagnostics_djidiagnosticsdevicehealthinformation_componentindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>componentId</h6></div>

~~~java
 int componentId() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.healthmanager</td></tr></table></html>



##### Description:



<font color="#666">Added for double camera and double gimbal, this method could return the index of Component.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the component id.</i></td></tr></table></html></div>

<div class="api-row" id="djidiagnostics_djidiagnosticsdevicehealthinformation_warninglevel"><div class="api-col left">Warning Level</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djidiagnostics_djidiagnosticsdevicehealthinformation_warninglevel_inline">getWarningLevel</a></div></div><div class="inline-doc" id="djidiagnostics_djidiagnosticsdevicehealthinformation_warninglevel_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWarningLevel</h6></div>

~~~java
 WarningLevel getWarningLevel() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.healthmanager</td></tr></table></html>



##### Description:



<font color="#666">Warning level.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">WarningLevel</td><td><font color="#666"><i>An enum value of <code><a href="/Components/Diagnostics/DJIDiagnostics.html#djidiagnostics_devicehealthinformationwarninglevel">WarningLevel</a></code>.</i></td></tr></table></html></div>


