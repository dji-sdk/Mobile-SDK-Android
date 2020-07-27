<div class="article"><h1 ><font color="#AAA">class </font>Capabilities</h1></div>

~~~java
 class Capabilities implements DJIParamAccessListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Some of the camera's parameters have dynamic ranges. The <code><a href="/Components/Camera/DJICamera_DJICameraParameters.html#djicamera_djicameraparameters">Capabilities</a></code> class allows you to query the valid range for a parameter. Type-casting is required to get the corresponding enumerator value for each range element.



##### Class Members:

<div class="api-row" id="djicamera_djicameraparameters_adddjicameraparameterslistener"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraparameters_adddjicameraparameterslistener_inline">addDJICameraParametersListener</a></div></div><div class="inline-doc" id="djicamera_djicameraparameters_adddjicameraparameterslistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addDJICameraParametersListener</h6></div>

~~~java
 void addDJICameraParametersListener(DJICameraParametersListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Adds the listener for the camera range change.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraParameters_ListenerInterface.html#djicamera_djicameraparameters_listenerinterface">DJICameraParametersListener</a> <font color="#000">listener</td><td><font color="#666"><i>Camera range change listener.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameraparameters_removelistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraparameters_removelistener_inline">removeListener</a></div></div><div class="inline-doc" id="djicamera_djicameraparameters_removelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeListener</h6></div>

~~~java
 void removeListener(DJICameraParametersListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Remove listener which is listening to the camera range change.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraParameters_ListenerInterface.html#djicamera_djicameraparameters_listenerinterface">DJICameraParametersListener</a> <font color="#000">listener</td><td><font color="#666"><i>An instance of DJICameraParametersListener.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameraparameters_removealllistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraparameters_removealllistener_inline">removeAllListener</a></div></div><div class="inline-doc" id="djicamera_djicameraparameters_removealllistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeAllListener</h6></div>

~~~java
 void removeAllListener() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Remove all listeners.

</div>

<div class="api-row" id="djicamera_djicameraparameters_setmultispectralshutterspeedrangecallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraparameters_setmultispectralshutterspeedrangecallback_inline">setMultispectralShutterSpeedRangeCallback</a></div></div><div class="inline-doc" id="djicamera_djicameraparameters_setmultispectralshutterspeedrangecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMultispectralShutterSpeedRangeCallback</h6></div>

~~~java
 void setMultispectralShutterSpeedRangeCallback(MultispectralShutterSpeedRangeCallback listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Use this to listen the shutter speed supported by the multispectral camera single-band sensors (sensors except the RGB one).  Only supported by multispectral camera of P4 Multispectral.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraParameters_MultispectralShutterSpeedRangeCallbackInterface.html#djicamera_djicameraparameters_multispectralshutterspeedrangecallbackinterface">MultispectralShutterSpeedRangeCallback</a> <font color="#000">listener</td><td><font color="#666"><i>The interface of <code><a href="/Components/Camera/DJICamera_DJICameraParameters_MultispectralShutterSpeedRangeCallbackInterface.html#djicamera_djicameraparameters_multispectralshutterspeedrangecallbackinterface">MultispectralShutterSpeedRangeCallback</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameraparameters_setmultispectralexposurecompensationrangecallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraparameters_setmultispectralexposurecompensationrangecallback_inline">setMultispectralExposureCompensationRangeCallback</a></div></div><div class="inline-doc" id="djicamera_djicameraparameters_setmultispectralexposurecompensationrangecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMultispectralExposureCompensationRangeCallback</h6></div>

~~~java
 void setMultispectralExposureCompensationRangeCallback(MultispectralExposureCompensationRangeCallback listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Use this to listen the exposure compensation supported by the multispectral camera single-band sensors (sensors except the RGB one).  Only supported by multispectral camera of P4 Multispectral.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraParameters_MultispectralExposureCompensationRangeCallbackInterface.html#djicamera_djicameraparameters_multispectralexposurecompensationrangecallbackinterface">MultispectralExposureCompensationRangeCallback</a> <font color="#000">listener</td><td><font color="#666"><i>The interface of <code><a href="/Components/Camera/DJICamera_DJICameraParameters_MultispectralExposureCompensationRangeCallbackInterface.html#djicamera_djicameraparameters_multispectralexposurecompensationrangecallbackinterface">MultispectralExposureCompensationRangeCallback</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameraparameters_supportedcameramoderange"><div class="api-col left">Camera Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraparameters_supportedcameramoderange_inline">modeRange</a></div></div><div class="inline-doc" id="djicamera_djicameraparameters_supportedcameramoderange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>modeRange</h6></div>

~~~java
 CameraMode[] modeRange() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_mode_range_key">CameraKey.MODE_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the current valid range for camera mode (<code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode">CameraMode</a></code>). Returns <code>null</code> if  current camera has no supported camera mode or the camera is disconnected.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode">CameraMode</a>[]</td><td><font color="#666"><i>Array of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode">CameraMode</a></code> elements. Each element represents one current supported camera mode.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameraparameters_supportedcameraexposuremoderange"><div class="api-col left">Exposure</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraparameters_supportedcameraexposuremoderange_inline">exposureModeRange</a></div></div><div class="inline-doc" id="djicamera_djicameraparameters_supportedcameraexposuremoderange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>exposureModeRange</h6></div>

~~~java
 ExposureMode[] exposureModeRange() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_exposure_mode_range_key">CameraKey.EXPOSURE_MODE_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the current valid range for camera's exposure mode (<code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode">ExposureMode</a></code>). Returns  <code>null</code> if current camera does not support any exposure mode or the camera is disconnected.  @return Array of NSNumber. Each element represent one current supported exposure mode.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode">ExposureMode</a>[]</td><td><font color="#666"><i>Array of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode">ExposureMode</a></code>. Each element represent one current supported exposure mode.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameraparameters_supportedcameraisorange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraparameters_supportedcameraisorange_inline">ISORange</a></div></div><div class="inline-doc" id="djicamera_djicameraparameters_supportedcameraisorange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>ISORange</h6></div>

~~~java
 ISO[] ISORange() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_iso_range_key">CameraKey.ISO_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the current valid range for camera's ISO (see <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraiso">ISO</a></code>). Returns <code>null</code> if current camera does not support any ISO value or the camera is disconnected. @return A CameraISO array. Each element represent one current supported ISO value.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">ISO[]</td><td><font color="#666"><i>Array of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraiso">ISO</a></code>. Each element represent one current supported ISO value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameraparameters_supportedcamerashutterspeedrange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraparameters_supportedcamerashutterspeedrange_inline">shutterSpeedRange</a></div></div><div class="inline-doc" id="djicamera_djicameraparameters_supportedcamerashutterspeedrange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>shutterSpeedRange</h6></div>

~~~java
 ShutterSpeed[] shutterSpeedRange() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_shutter_speed_range_key">CameraKey.SHUTTER_SPEED_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the current valid range for camera's shutter speed (see <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashutterspeed">ShutterSpeed</a></code>). Returns  <code>null</code> if current camera does not support any shutter speed value or the camera is  disconnected. @return Array of CameraShutterSpeed. Each element represent one current  supported shutter speed value.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashutterspeed">ShutterSpeed</a>[]</td><td><font color="#666"><i>Array of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashutterspeed">ShutterSpeed</a></code>. Each element represent one current supported shutter speed value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameraparameters_supportedcameraaperturerange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraparameters_supportedcameraaperturerange_inline">apertureRange</a></div></div><div class="inline-doc" id="djicamera_djicameraparameters_supportedcameraaperturerange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>apertureRange</h6></div>

~~~java
 Aperture[] apertureRange() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_aperture_range_key">CameraKey.APERTURE_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the current valid range for camera's aperture (see <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraaperture">Aperture</a></code>). Returns  <code>null</code> if current camera does not support any aperture value or the camera is disconnected.  @return Array of CameraAperture. Each element represent one current supported aperture  value.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraaperture">Aperture</a>[]</td><td><font color="#666"><i>Array of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraaperture">Aperture</a></code>. Each element represent one current supported aperture value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameraparameters_supportedcameraexposurecompensationrange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraparameters_supportedcameraexposurecompensationrange_inline">exposureCompensationRange</a></div></div><div class="inline-doc" id="djicamera_djicameraparameters_supportedcameraexposurecompensationrange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>exposureCompensationRange</h6></div>

~~~java
 ExposureCompensation[] exposureCompensationRange() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_exposure_compensation_range_key">CameraKey.EXPOSURE_COMPENSATION_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the current valid range for camera's exposure compensation (see <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposurecompensation">ExposureCompensation</a></code>).  Returns <code>null</code> if current camera does not support any exposure compensation value or the camera  is disconnected. @return Array of CameraExposureCompensation. Each element represent one  current supported exposure compensation value.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposurecompensation">ExposureCompensation</a>[]</td><td><font color="#666"><i>Array of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposurecompensation">ExposureCompensation</a></code>. Each element represent one current supported exposure compensation value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameraparameters_supportedcameravideoresolutionandframeraterange"><div class="api-col left">Video</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraparameters_supportedcameravideoresolutionandframeraterange_inline">videoResolutionAndFrameRateRange</a></div></div><div class="inline-doc" id="djicamera_djicameraparameters_supportedcameravideoresolutionandframeraterange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>videoResolutionAndFrameRateRange</h6></div>

~~~java
 ResolutionAndFrameRate[] videoResolutionAndFrameRateRange() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_video_resolution_frame_rate_range_key">CameraKey.VIDEO_RESOLUTION_FRAME_RATE_RANGE</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the current valid range for video resolution CameraVideoResolution  and frame rate <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoframerate">VideoFrameRate</a></code>. Returns <code>null</code> if the current camera does  not support any video resolution or frame rate setting, or if the camera is disconnected.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraVideoResolutionAndFrameRate.html#djicamera_djicameravideoresolutionandframerate">ResolutionAndFrameRate</a>[]</td><td><font color="#666"><i>Array of pairs. Each pair represents a valid <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoresolution">VideoResolution</a></code> value and <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoframerate">VideoFrameRate</a></code> value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameraparameters_supportedcamerassdvideoresolutionrange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraparameters_supportedcamerassdvideoresolutionrange_inline">SSDVideoResolutionRange</a></div></div><div class="inline-doc" id="djicamera_djicameraparameters_supportedcamerassdvideoresolutionrange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>SSDVideoResolutionRange</h6></div>

~~~java
 VideoResolution[] SSDVideoResolutionRange() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Returns the current valid range for camera's RAW video resolution. Returns 'nil' if current  camera does not support any RAW video resolution or the camera is disconnected.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoresolution">VideoResolution</a>[]</td><td><font color="#666"><i>Array of pairs. Each pair represents a valid <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoresolution">VideoResolution</a></code> value and <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoframerate">VideoFrameRate</a></code> value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameraparameters_thermalpaletterange"><div class="api-col left">Thermal Palette Range</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraparameters_thermalpaletterange_inline">thermalPaletteRange</a></div></div><div class="inline-doc" id="djicamera_djicameraparameters_thermalpaletterange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>thermalPaletteRange</h6></div>

~~~java
@Nullable
 SettingsDefinitions.ThermalPalette[] thermalPaletteRange() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Returns the current valid range for thermal camera's palette (see <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalpalette">ThermalPalette</a></code>).  Returns <code>nil</code> if  current thermal camera has not supported palette or the thermal camera is disconnected.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalpalette">ThermalPalette</a>[]</td><td><font color="#666"><i>Array of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalpalette">ThermalPalette</a></code> elements. Each element represents one current palette value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameraparameters_multispectralshutterspeedrange"><div class="api-col left">Multispectral Shutter Speed Range</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraparameters_multispectralshutterspeedrange_inline">multispectralShutterSpeedRange</a></div></div><div class="inline-doc" id="djicamera_djicameraparameters_multispectralshutterspeedrange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>multispectralShutterSpeedRange</h6></div>

~~~java
@Nullable
 SettingsDefinitions.ShutterSpeed[] multispectralShutterSpeedRange() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Returns the current valid range for multispectral camera's single-band sensors's (sensors except the RGB one). shutter speed (see <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashutterspeed">ShutterSpeed</a></code>).  Returns <code>null</code> if current camera does not support any shutter speed value or the camera is disconnected. Only supported by multispectral camera of P4 Multispectral.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashutterspeed">ShutterSpeed</a>[]</td><td><font color="#666"><i>Array of the <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashutterspeed">ShutterSpeed</a></code> enum values. Each element represent one current supported shutter speed value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameraparameters_multispectralexposurecompensationrange"><div class="api-col left">Multispectral Exposure Compensation Range</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraparameters_multispectralexposurecompensationrange_inline">multispectralExposureCompensationRange</a></div></div><div class="inline-doc" id="djicamera_djicameraparameters_multispectralexposurecompensationrange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>multispectralExposureCompensationRange</h6></div>

~~~java
@Nullable
 SettingsDefinitions.ExposureCompensation[] multispectralExposureCompensationRange() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Returns the current valid range for multispectral camera's single-band sensors's (sensors except the RGB one). Exposure compensation (see <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposurecompensation">ExposureCompensation</a></code>).   Returns <code>NULL</code> if current camera does not support any exposure compensation value or the multispectral camera is disconnected. Only supported by multispectral camera of P4 Multispectral.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposurecompensation">ExposureCompensation</a>[]</td><td><font color="#666"><i>Array of the <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposurecompensation">ExposureCompensation</a></code> enum value. Each element represent one current supported exposure compensation value.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djicamera_djicameraparameters_listenerinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraParameters_ListenerInterface.html">DJICameraParametersListener</a></div></div><div class="api-row" id="djicamera_djicameraparameters_djisupportedflatcameramoderange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraparameters_djisupportedflatcameramoderange_inline">FlatCameraModeRange</a></div></div><div class="inline-doc" id="djicamera_djicameraparameters_djisupportedflatcameramoderange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>FlatCameraModeRange</h6></div>

~~~java
@Nullable
 FlatCameraMode[] FlatCameraModeRange() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Returns the current valid range for flat camera mode (<code><a href="/Components/Camera/DJICamera.html#djicamera_djiflatcameramode">FlatCameraMode</a></code>). Returns <code>null</code>  if <code><a href="/Components/Camera/DJICamera.html#djicamera_isflatcameramodesupported">isFlatCameraModeSupported</a></code> return <code>false</code> or the camera is disconnected.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera.html#djicamera_djiflatcameramode">FlatCameraMode</a>[]</td><td><font color="#666"><i>Array of <code><a href="/Components/Camera/DJICamera.html#djicamera_djiflatcameramode">FlatCameraMode</a></code> elements. Each element represents one current supported flat camera mode.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameraparameters_multispectralshutterspeedrangecallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraParameters_MultispectralShutterSpeedRangeCallbackInterface.html">MultispectralShutterSpeedRangeCallback</a></div></div><div class="api-row" id="djicamera_djicameraparameters_multispectralexposurecompensationrangecallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraParameters_MultispectralExposureCompensationRangeCallbackInterface.html">MultispectralExposureCompensationRangeCallback</a></div></div>
