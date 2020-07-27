<div class="article"><h1 ><font color="#AAA">class </font>ExposureSettings</h1></div>

~~~java
@EXClassNullAway
 class ExposureSettings 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_exposure_settings_key">CameraKey.EXPOSURE_SETTINGS</a></td></tr></table></html>



##### Description:



<font color="#666">This class contains current values for some camera parameters related to exposure, which determines how sensitive the picture is to light and depends on the balance of the ISO value, the shutter speed, and the aperture value. When the camera is in different exposure modes, different parameters are automatically changed by the camera to either get the correct exposure (in  Program, Shutter Priority and Aperture Priority modes), or report back the current exposure (in Manual mode). The current values of these parameters used by the camera are contained in this class.



##### Class Members:

<div class="api-row" id="djicamera_djicameraexposureparameters_aperture"><div class="api-col left">Aperture</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraexposureparameters_aperture_inline">getAperture</a></div></div><div class="inline-doc" id="djicamera_djicameraexposureparameters_aperture_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAperture</h6></div>

~~~java
 Aperture getAperture() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Returns the current aperture value being used by the camera. A larger aperture results in a higher exposure and shallower depth of field. For cameras that do not support adjustable aperture (e.g. Zenmuse X3), the real aperture value is fixed.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraaperture">Aperture</a></td><td><font color="#666"><i>The enum value of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraaperture">Aperture</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameraexposureparameters_shutterspeed"><div class="api-col left">ShutterSpeed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraexposureparameters_shutterspeed_inline">getShutterSpeed</a></div></div><div class="inline-doc" id="djicamera_djicameraexposureparameters_shutterspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getShutterSpeed</h6></div>

~~~java
 ShutterSpeed getShutterSpeed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Returns the current shutter speed being used by the camera. A slower shutter speed results in a higher exposure, but more blurring in areas of the scene that are moving.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashutterspeed">ShutterSpeed</a></td><td><font color="#666"><i>The enum value of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashutterspeed">ShutterSpeed</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameraexposureparameters_iso"><div class="api-col left">ISO</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraexposureparameters_iso_inline">getISO</a></div></div><div class="inline-doc" id="djicamera_djicameraexposureparameters_iso_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getISO</h6></div>

~~~java
 int getISO() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Returns the current ISO value being used by the camera. <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraiso">ISO</a></code> defines the number of the ISO values separated by one exposure stop. However, when the ISO is in automatic mode, the camera can select ISO values less than one stop apart, and therefore this property is the actual ISO value being used by the camera. A higher ISO results in a higher exposure, and more noise in the resulting image.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>The enum value of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraiso">ISO</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameraexposureparameters_exposurecompensation"><div class="api-col left">Exposure Compensation</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraexposureparameters_exposurecompensation_inline">getExposureCompensation</a></div></div><div class="inline-doc" id="djicamera_djicameraexposureparameters_exposurecompensation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getExposureCompensation</h6></div>

~~~java
 ExposureCompensation getExposureCompensation() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Returns the camera's current exposure compensation. In Program, Aperture Priority and Shutter Priority modes, the exposure compensation value changes the exposure target the camera is using to calculate correct exposure and is set by the user. For example, Aperture Priority mode indicates that the priority is to maintain the aperture setting and adjusting the exposure by varying the ISO and shutter speed. In Manual mode, this value is reported from the camera and reports how much the  exposure needs to be compensated for to get to what the camera thinks is the correct exposure. In Manual mode, the range of exposure compensation reported by the camera is -2.0 EV to 2.0 EV. In Program, Aperture Priority and Shutter Priority modes, the range of exposure compensation is -3.0 EV to + 3.0 EV. For the Z30 camera in manual mode, exposureCompensation is not used and the value is always 'DJICameraExposureCompensationN00'.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposurecompensation">ExposureCompensation</a></td><td><font color="#666"><i>The enum value of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposurecompensation">ExposureCompensation</a></code></i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djicamera_cameraupdatedcurrentexposurevaluescallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_CameraUpdatedCurrentExposureValuesCallbackInterface.html">Callback</a></div></div>
