<div class="article"><h1 ><font color="#AAA">class </font>TemperatureDataCallback</h1></div>

~~~java
 interface TemperatureDataCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_temperature_data_key">CameraKey.THERMAL_TEMPERATURE_DATA</a></td></tr></table></html>



##### Description:



<font color="#666">Received temperature in degrees Celsius of image. For the XT, the temperature measurement data is the average  of the center four pixels of the image. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Class Members:



#### Callback Method

<div class="api-row" id="djicamera_temperaturedatacallbackinterface_onupdate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_temperaturedatacallbackinterface_onupdate_inline">onUpdate</a></div></div><div class="inline-doc" id="djicamera_temperaturedatacallbackinterface_onupdate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
        void onUpdate(float temperature)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Received temperature in degrees Celsius of image. The thermal imaging camera will only update  the temperature if the temperature data is enabled. For the XT Standard version, the temperature  measurement data is the average of the center four pixels of the image. For the XT Advanced Radiometry  version, the temperature measurement point can be set using <code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalspotmeteringtargetpoint">setThermalSpotMeteringTargetPoint</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">temperature</td><td><font color="#666"><i>The camera's temperature data in degrees Celsius.</i></td></tr></table></html></div>


