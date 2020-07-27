<div class="article"><h1 ><font color="#AAA">class </font>Callback</h1></div>

~~~java
 interface Callback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_exposure_settings_key">CameraKey.EXPOSURE_SETTINGS</a></td></tr></table></html>



##### Description:



<font color="#666">Called whenever the camera parameters change. In automatic exposure modes (Program, Shutter Priority and Aperture Priority) the camera may be automatically changing aperture, shutter speed and ISO (depending on the mode and camera) when lighting conditions change. In Manual mode, the exposure compensation is automatically updated to let the user know how much compensation the exposure needs to get to an exposure the camera calculates as correct.



##### Class Members:



#### Callback Method

<div class="api-row" id="djicamera_didupdatecurrentexposureparameters"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_didupdatecurrentexposureparameters_inline">onUpdate</a></div></div><div class="inline-doc" id="djicamera_didupdatecurrentexposureparameters_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
        void onUpdate(@NonNull ExposureSettings values)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_exposure_settings_key">CameraKey.EXPOSURE_SETTINGS</a></td></tr></table></html>



##### Description:



<font color="#666">Called whenever the camera parameters change. In automatic exposure modes (Program, Shutter Priority and Aperture Priority) the camera may be automatically changing aperture, shutter speed and ISO (depending on the mode and camera) when lighting conditions change. In Manual mode, the exposure compensation is automatically updated to let the user know how much compensation the exposure needs to get to an exposure the camera calculates as correct. For Zenmuse H20 and Zenmuse H20T, please use class <code>DJILens</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraExposureParameters.html#djicamera_djicameraexposureparameters">ExposureSettings</a> <font color="#000">values</td><td><font color="#666"><i>The updated values for parameters.</i></td></tr></table></html></div>


