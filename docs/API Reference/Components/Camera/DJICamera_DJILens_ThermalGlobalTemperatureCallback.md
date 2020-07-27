<div class="article"><h1 ><font color="#AAA">class </font>ThermalGlobalTemperatureCallback</h1></div>

~~~java
 interface ThermalGlobalTemperatureCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Called when the temperature range changed. Only supported by the thermal lens of Zenmuse H20T.



##### Class Members:



#### Callback Method

<div class="api-row" id="djicamera_djilens_thermalglobaltemperaturecallback_onupdate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djilens_thermalglobaltemperaturecallback_onupdate_inline">onUpdate</a></div></div><div class="inline-doc" id="djicamera_djilens_thermalglobaltemperaturecallback_onupdate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
        void onUpdate(float min, float max)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Update the global temperature range.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">min</td><td><font color="#666"><i>The minimum temperature.</i></td></tr><tr valign="top"><td><font color="#70BF41">float <font color="#000">max</td><td><font color="#666"><i>The maximum temperature.</i></td></tr></table></html></div>


