<div class="article"><h1 ><font color="#AAA">class </font>TemperatureDataCallback</h1></div>

~~~java
 interface TemperatureDataCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Received temperature in degrees Celsius of image. For the thermal lens, the temperature measurement data is the average of the center four pixels of the image.  Supported by the thermal lens of Zenmuse H20T.



##### Class Members:



#### Callback Method

<div class="api-row" id="djicamera_djilens_temperaturedatacallbackinterface_onupdate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djilens_temperaturedatacallbackinterface_onupdate_inline">onUpdate</a></div></div><div class="inline-doc" id="djicamera_djilens_temperaturedatacallbackinterface_onupdate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
        void onUpdate(float temperature)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Received temperature in degrees Celsius of image. The thermal imaging lens will only update the temperature if the temperature data is enabled. For the thermal  lens Standard version, the temperature measurement data is the average of the center four pixels of the image.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">temperature</td><td><font color="#666"><i>The thermal lens temperature data in degrees Celsius.</i></td></tr></table></html></div>


