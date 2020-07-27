<div class="article"><h1 ><font color="#AAA">class </font>ThermalExternalSceneSettings</h1></div>

~~~java
@EXClassNullAway
 class ThermalExternalSceneSettings 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Thermal cameras measure the apparent surface temperature of a given object. This is done by taking the amount of infrared radiation an object emits and calculating the surface temperature by applying a formula that adjusts for external factors. This struct includes all of the external scene parameters that the thermal camera firmware allows  to be customized. There are two types of parameters, optical parameters which specify how much infrared  radiation is transmitted from the surface to the thermal sensor, as well as parameters that specify sources of thermal radiance other than the object. For a more in-depth overview of the physics behind thermal imaging, see https://en.wikipedia.org/wiki/Thermography.



##### Class Members:

<div class="api-row" id="djicamera_djicamerathermalexternalscenesettings_atmospherictemperature"><div class="api-col left">Values</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerathermalexternalscenesettings_atmospherictemperature_inline">getAtmosphericTemperature</a></div></div><div class="inline-doc" id="djicamera_djicamerathermalexternalscenesettings_atmospherictemperature_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAtmosphericTemperature</h6></div>

~~~java
 float getAtmosphericTemperature() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_atmospheric_temperature_key">CameraKey.THERMAL_ATMOSPHERIC_TEMPERATURE</a></td></tr></table></html>



##### Description:



<font color="#666">Atmospheric temperature, can be between -50 and 327.67 degrees Celsius.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>Atmospheric temperature</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerathermalexternalscenesettings_atmospherictransmissioncoefficient"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerathermalexternalscenesettings_atmospherictransmissioncoefficient_inline">getAtmosphericTransmissionCoefficient</a></div></div><div class="inline-doc" id="djicamera_djicamerathermalexternalscenesettings_atmospherictransmissioncoefficient_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAtmosphericTransmissionCoefficient</h6></div>

~~~java
 float getAtmosphericTransmissionCoefficient() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_atmospheric_transmission_coefficient_key">CameraKey.THERMAL_ATMOSPHERIC_TRANSMISSION_COEFFICIENT</a></td></tr></table></html>



##### Description:



<font color="#666">Transmission coefficient of the atmosphere between the scene and the camera, can be between 50 and 100.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>Transmission coefficient</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerathermalexternalscenesettings_backgroundtemperature"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerathermalexternalscenesettings_backgroundtemperature_inline">getBackgroundTemperature</a></div></div><div class="inline-doc" id="djicamera_djicamerathermalexternalscenesettings_backgroundtemperature_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBackgroundTemperature</h6></div>

~~~java
 float getBackgroundTemperature() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_background_temperature_key">CameraKey.THERMAL_BACKGROUND_TEMPERATURE</a></td></tr></table></html>



##### Description:



<font color="#666">Background temperature (reflected by the scene), can be between -50 and 327.67 degrees Celsius.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>Background temperature</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerathermalexternalscenesettings_sceneemissivity"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerathermalexternalscenesettings_sceneemissivity_inline">getSceneEmissivity</a></div></div><div class="inline-doc" id="djicamera_djicamerathermalexternalscenesettings_sceneemissivity_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSceneEmissivity</h6></div>

~~~java
 float getSceneEmissivity() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_scene_emissivity_key">CameraKey.THERMAL_SCENE_EMISSIVITY</a></td></tr></table></html>



##### Description:



<font color="#666">Emissivity of the scene, can be between 50 and 100.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>Emissivity of the scene</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerathermalexternalscenesettings_windowreflection"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerathermalexternalscenesettings_windowreflection_inline">getWindowReflection</a></div></div><div class="inline-doc" id="djicamera_djicamerathermalexternalscenesettings_windowreflection_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWindowReflection</h6></div>

~~~java
 float getWindowReflection() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_window_reflection_key">CameraKey.THERMAL_WINDOW_REFLECTION</a></td></tr></table></html>



##### Description:



<font color="#666">Window reflection, can be between 50 and 100-X where X is the window transmission coefficient parameter.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>Window reflection value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerathermalexternalscenesettings_windowreflectedtemperature"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerathermalexternalscenesettings_windowreflectedtemperature_inline">getWindowReflectedTemperature</a></div></div><div class="inline-doc" id="djicamera_djicamerathermalexternalscenesettings_windowreflectedtemperature_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWindowReflectedTemperature</h6></div>

~~~java
 float getWindowReflectedTemperature() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_window_reflected_temperature_key">CameraKey.THERMAL_WINDOW_REFLECTED_TEMPERATURE</a></td></tr></table></html>



##### Description:



<font color="#666">Temperature reflected in the window, can be between -50 and 327.67 degrees Celsius.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>Temperature reflected in window.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerathermalexternalscenesettings_windowtemperature"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerathermalexternalscenesettings_windowtemperature_inline">getWindowTemperature</a></div></div><div class="inline-doc" id="djicamera_djicamerathermalexternalscenesettings_windowtemperature_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWindowTemperature</h6></div>

~~~java
 float getWindowTemperature() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_window_temperature_key">CameraKey.THERMAL_WINDOW_TEMPERATURE</a></td></tr></table></html>



##### Description:



<font color="#666">Window temperature, can be between -50 and 327.67 degrees Celsius.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>Window temperature.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerathermalexternalscenesettings_windowtransmissioncoefficient"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerathermalexternalscenesettings_windowtransmissioncoefficient_inline">getWindowTransmissionCoefficient</a></div></div><div class="inline-doc" id="djicamera_djicamerathermalexternalscenesettings_windowtransmissioncoefficient_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWindowTransmissionCoefficient</h6></div>

~~~java
 float getWindowTransmissionCoefficient() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_window_transmission_coefficient_key">CameraKey.THERMAL_WINDOW_TRANSMISSION_COEFFICIENT</a></td></tr></table></html>



##### Description:



<font color="#666">Transmission coefficient of the window, can be between 50 and 100-X where X is the window reflection.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>Window transmission coefficient.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djicamera_thermalcameraexternalscenesettingsupdatedcallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_ThermalCameraExternalSceneSettingsUpdatedCallbackInterface.html">Callback</a></div></div>
