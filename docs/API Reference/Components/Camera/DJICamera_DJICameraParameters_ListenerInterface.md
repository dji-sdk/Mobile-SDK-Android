<div class="article"><h1 ><font color="#AAA">class </font>DJICameraParametersListener</h1></div>

~~~java
 interface DJICameraParametersListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Defines video resolution and frame rate as a type.



##### Class Members:

<div class="api-row" id="djicamera_listener_oncameraisorangechange"><div class="api-col left">Update</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_listener_oncameraisorangechange_inline">onCameraISORangeChange</a></div></div><div class="inline-doc" id="djicamera_listener_oncameraisorangechange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onCameraISORangeChange</h6></div>

~~~java
        void onCameraISORangeChange(ISO[] newRange)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">When the camera ISO range is changed, the listener will receive this callback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">ISO[] <font color="#000">newRange</td><td><font color="#666"><i>The new range.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_listener_oncameraexposurecompensationrangechange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_listener_oncameraexposurecompensationrangechange_inline">onCameraExposureCompensationRangeChange</a></div></div><div class="inline-doc" id="djicamera_listener_oncameraexposurecompensationrangechange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onCameraExposureCompensationRangeChange</h6></div>

~~~java
        void onCameraExposureCompensationRangeChange(ExposureCompensation[] newRange)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">When the camera exposure compensation range is changed, the listener will receive this callback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposurecompensation">ExposureCompensation</a>[] <font color="#000">newRange</td><td><font color="#666"><i>The new range.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_listener_oncameraexposuremoderangechange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_listener_oncameraexposuremoderangechange_inline">onCameraExposureModeRangeChange</a></div></div><div class="inline-doc" id="djicamera_listener_oncameraexposuremoderangechange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onCameraExposureModeRangeChange</h6></div>

~~~java
        void onCameraExposureModeRangeChange(SettingsDefinitions.ExposureMode[] newRange)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">When the camera exposure mode range is changed, the listener will receive this callback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode">ExposureMode</a>[] <font color="#000">newRange</td><td><font color="#666"><i>The new range.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_listener_oncamerashutterspeedrangechange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_listener_oncamerashutterspeedrangechange_inline">onCameraShutterSpeedRangeChange</a></div></div><div class="inline-doc" id="djicamera_listener_oncamerashutterspeedrangechange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onCameraShutterSpeedRangeChange</h6></div>

~~~java
        void onCameraShutterSpeedRangeChange(ShutterSpeed[] newRange)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">When the camera shutter speed range is changed, the listener will receive this callback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashutterspeed">ShutterSpeed</a>[] <font color="#000">newRange</td><td><font color="#666"><i>The new range.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_listener_oncameramoderangechange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_listener_oncameramoderangechange_inline">onCameraModeRangeChange</a></div></div><div class="inline-doc" id="djicamera_listener_oncameramoderangechange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onCameraModeRangeChange</h6></div>

~~~java
        void onCameraModeRangeChange(CameraMode[] newRange)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">When the camera mode range is changed, the listener will receive this callback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode">CameraMode</a>[] <font color="#000">newRange</td><td><font color="#666"><i>The new range.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_listener_onflatcameramoderangechange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_listener_onflatcameramoderangechange_inline">onFlatCameraModeRangeChange</a></div></div><div class="inline-doc" id="djicamera_listener_onflatcameramoderangechange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onFlatCameraModeRangeChange</h6></div>

~~~java
        void onFlatCameraModeRangeChange(FlatCameraMode[] newRange)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">When the flat camera mode range is changed, the listener will receive this callback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera.html#djicamera_djiflatcameramode">FlatCameraMode</a>[] <font color="#000">newRange</td><td><font color="#666"><i>The new range.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_listener_oncameravideoresolutionandframeraterangechange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_listener_oncameravideoresolutionandframeraterangechange_inline">onCameraVideoResolutionAndFrameRateRangeChange</a></div></div><div class="inline-doc" id="djicamera_listener_oncameravideoresolutionandframeraterangechange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onCameraVideoResolutionAndFrameRateRangeChange</h6></div>

~~~java
        void onCameraVideoResolutionAndFrameRateRangeChange(ResolutionAndFrameRate[] newRange)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">When the camera video resolution and frame rate range is changed, the listener will receive this callback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraVideoResolutionAndFrameRate.html#djicamera_djicameravideoresolutionandframerate">ResolutionAndFrameRate</a>[] <font color="#000">newRange</td><td><font color="#666"><i>The new range.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_listener_oncameraaperturerangechange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_listener_oncameraaperturerangechange_inline">onCameraApertureRangeChange</a></div></div><div class="inline-doc" id="djicamera_listener_oncameraaperturerangechange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onCameraApertureRangeChange</h6></div>

~~~java
        void onCameraApertureRangeChange(Aperture[] newRange)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">When the camera aperture range is changed, the listener will receive this callback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraaperture">Aperture</a>[] <font color="#000">newRange</td><td><font color="#666"><i>The new range.</i></td></tr></table></html></div>

<div class="api-row" id="oncamerassdrawvideoresolutionrangechange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#oncamerassdrawvideoresolutionrangechange_inline">onCameraSSDRawVideoResolutionRangeChange</a></div></div><div class="inline-doc" id="oncamerassdrawvideoresolutionrangechange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onCameraSSDRawVideoResolutionRangeChange</h6></div>

~~~java
        void onCameraSSDRawVideoResolutionRangeChange(VideoResolution[] newRange)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">When the camera SSD raw video resolution and frame rate range is changed, the listener will receive this callback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoresolution">VideoResolution</a>[] <font color="#000">newRange</td><td><font color="#666"><i>The new range.</i></td></tr></table></html></div>


