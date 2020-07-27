<div class="article"><h1 ><font color="#AAA">class </font>MultispectralExposureState</h1></div>

~~~java
@EXClassNullAway
 class MultispectralExposureState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The exposure state of a single-band sensor on the multispectral camera. The parameters in the state determines the relationship  between exposure and sensor data values. When the camera is in different exposure modes, parameters may be changed by the camera  automatically to optimize the exposure.



##### Class Members:

<div class="api-row" id="djicamera_djicameramultispectralexposurestate_band"><div class="api-col left">Band</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameramultispectralexposurestate_band_inline">getSpectrumBand</a></div></div><div class="inline-doc" id="djicamera_djicameramultispectralexposurestate_band_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSpectrumBand</h6></div>

~~~java
 SettingsDefinitions.SpectrumBand getSpectrumBand() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The spectrum for which this exposure state is.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_spectrumband">SpectrumBand</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_spectrumband">SpectrumBand</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameramultispectralexposurestate_shutterspeed"><div class="api-col left">Shutter Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameramultispectralexposurestate_shutterspeed_inline">getShutterSpeed</a></div></div><div class="inline-doc" id="djicamera_djicameramultispectralexposurestate_shutterspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getShutterSpeed</h6></div>

~~~java
 SettingsDefinitions.ShutterSpeed getShutterSpeed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The shutter speed of the single band sensor.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashutterspeed">ShutterSpeed</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashutterspeed">ShutterSpeed</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameramultispectralexposurestate_sensorgain"><div class="api-col left">Sensor Gain</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameramultispectralexposurestate_sensorgain_inline">getSensorGain</a></div></div><div class="inline-doc" id="djicamera_djicameramultispectralexposurestate_sensorgain_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSensorGain</h6></div>

~~~java
 float getSensorGain() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The gain of the sensor.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of sensor gain.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameramultispectralexposurestatecallbackinterface"><div class="api-col left">Callback</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraMultispectralExposureStateCallbackInterface.html">Callback</a></div></div>
