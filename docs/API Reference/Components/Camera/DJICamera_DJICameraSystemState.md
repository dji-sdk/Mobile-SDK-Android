<div class="article"><h1 ><font color="#AAA">class </font>SystemState</h1></div>

~~~java
@EXClassNullAway
 class SystemState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">This class provides general information and current status of the camera.



##### Class Members:

<div class="api-row" id="djicamera_cameraupdatedsystemstatecallbackinterface"><div class="api-col left">Callback</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_CameraUpdatedSystemStateCallbackInterface.html">Callback</a></div></div><div class="api-row" id="djicamera_djicamerasystemstate_mode"><div class="api-col left">Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasystemstate_mode_inline">getMode</a></div></div><div class="inline-doc" id="djicamera_djicamerasystemstate_mode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMode</h6></div>

~~~java
 CameraMode getMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_mode_key">CameraKey.MODE</a></td></tr></table></html>



##### Description:



<font color="#666">The current mode of the camera.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode">CameraMode</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode">CameraMode</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasystemstate_flatcameramode"><div class="api-col left">Flat Camera Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasystemstate_flatcameramode_inline">getFlatMode</a></div></div><div class="inline-doc" id="djicamera_djicamerasystemstate_flatcameramode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlatMode</h6></div>

~~~java
 FlatCameraMode getFlatMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets current flat mode of the camera. This is available only when <code><a href="/Components/Camera/DJICamera.html#djicamera_isflatcameramodesupported">isFlatCameraModeSupported</a></code> returns <code>true</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera.html#djicamera_djiflatcameramode">FlatCameraMode</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Camera/DJICamera.html#djicamera_djiflatcameramode">FlatCameraMode</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasystemstate_isplayingback"><div class="api-col left">Check Playback Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasystemstate_isplayingback_inline">isInPlayback</a></div></div><div class="inline-doc" id="djicamera_djicamerasystemstate_isplayingback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isInPlayback</h6></div>

~~~java
 boolean isInPlayback() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> If the camera is in playback mode. This is available only when <code><a href="/Components/Camera/DJICamera.html#djicamera_isflatcameramodesupported">isFlatCameraModeSupported</a></code> returns <code>true</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A bolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasystemstate_isshootingsinglephoto"><div class="api-col left">Photo</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasystemstate_isshootingsinglephoto_inline">isShootingSinglePhoto</a></div></div><div class="inline-doc" id="djicamera_djicamerasystemstate_isshootingsinglephoto_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isShootingSinglePhoto</h6></div>

~~~java
 boolean isShootingSinglePhoto() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_is_shooting_single_photo_key">CameraKey.IS_SHOOTING_SINGLE_PHOTO</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> when the camera is performing any photo capture in any <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashootphotomode">ShootPhotoMode</a></code>. Between photo capture in interval and time lapse mode, this property will be <code>false</code>. The camera is shooting a single photo.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasystemstate_isshootingsinglephotoinrawformat"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasystemstate_isshootingsinglephotoinrawformat_inline">isShootingSinglePhotoInRAWFormat</a></div></div><div class="inline-doc" id="djicamera_djicamerasystemstate_isshootingsinglephotoinrawformat_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isShootingSinglePhotoInRAWFormat</h6></div>

~~~java
 boolean isShootingSinglePhotoInRAWFormat() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_is_shooting_single_photo_in_raw_format_key">CameraKey.IS_SHOOTING_SINGLE_PHOTO_IN_RAW_FORMAT</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> when the camera is performing a photo capture in RAW or RAW+JPEG format. Between photo capture in interval and time lapse mode, this property will be <code>false</code>. If saving the photo in JPEG only, this property will always be <code>false</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasystemstate_isshootingintervalphoto"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasystemstate_isshootingintervalphoto_inline">isShootingIntervalPhoto</a></div></div><div class="inline-doc" id="djicamera_djicamerasystemstate_isshootingintervalphoto_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isShootingIntervalPhoto</h6></div>

~~~java
 boolean isShootingIntervalPhoto() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_is_shooting_interval_photo_key">CameraKey.IS_SHOOTING_INTERVAL_PHOTO</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> when the camera is performing an interval capture. <code>true</code> after <code><a href="/Components/Camera/DJICamera.html#djicamera_startshootphoto">startShootPhoto</a></code> is called, and <code>false</code> after <code><a href="/Components/Camera/DJICamera.html#djicamera_stopshootphoto">stopShootPhoto</a></code> is called.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasystemstate_isshootingburstphoto"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasystemstate_isshootingburstphoto_inline">isShootingBurstPhoto</a></div></div><div class="inline-doc" id="djicamera_djicamerasystemstate_isshootingburstphoto_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isShootingBurstPhoto</h6></div>

~~~java
 boolean isShootingBurstPhoto() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_is_shooting_burst_photo_key">CameraKey.IS_SHOOTING_BURST_PHOTO</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> when the camera is performing a burst capture. <code>true</code> after <code><a href="/Components/Camera/DJICamera.html#djicamera_startshootphoto">startShootPhoto</a></code> is called, and <code>false</code> after the burst is complete. The camera is shooting burst photos.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasystemstate_isshootingrawburstphoto"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasystemstate_isshootingrawburstphoto_inline">isShootingRAWBurstPhoto</a></div></div><div class="inline-doc" id="djicamera_djicamerasystemstate_isshootingrawburstphoto_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isShootingRAWBurstPhoto</h6></div>

~~~java
 boolean isShootingRAWBurstPhoto() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_is_shooting_raw_burst_photo_key">CameraKey.IS_SHOOTING_RAW_BURST_PHOTO</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> when the camera is performing a RAW burst capture. <code>true</code> after <code><a href="/Components/Camera/DJICamera.html#djicamera_startshootphoto">startShootPhoto</a></code> is called, and <code>false</code> after the RAW burst is complete. The camera is shooting RAW burst photos.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasystemstate_currentpanoramaphotocount"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasystemstate_currentpanoramaphotocount_inline">getCurrentPanoramaPhotoCount</a></div></div><div class="inline-doc" id="djicamera_djicamerasystemstate_currentpanoramaphotocount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrentPanoramaPhotoCount</h6></div>

~~~java
 int getCurrentPanoramaPhotoCount() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The current completed photo count of the executing panorama shot.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasystemstate_isshootingshallowfocusphoto"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasystemstate_isshootingshallowfocusphoto_inline">isShootingShallowFocusPhoto</a></div></div><div class="inline-doc" id="djicamera_djicamerasystemstate_isshootingshallowfocusphoto_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isShootingShallowFocusPhoto</h6></div>

~~~java
 boolean isShootingShallowFocusPhoto() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> when the camera is performing a ShallowFocus capture.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasystemstate_isshootingpanoramaphoto"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasystemstate_isshootingpanoramaphoto_inline">isShootingPanoramaPhoto</a></div></div><div class="inline-doc" id="djicamera_djicamerasystemstate_isshootingpanoramaphoto_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isShootingPanoramaPhoto</h6></div>

~~~java
 boolean isShootingPanoramaPhoto() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> when the camera is performing a Panorama capture.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasystemstate_isstoringphoto"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasystemstate_isstoringphoto_inline">isStoringPhoto</a></div></div><div class="inline-doc" id="djicamera_djicamerasystemstate_isstoringphoto_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isStoringPhoto</h6></div>

~~~java
 boolean isStoringPhoto() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_is_storing_photo_key">CameraKey.IS_STORING_PHOTO</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the camera is storing a photo. When <code><a href="/Components/Camera/DJICamera_DJICameraSystemState.html#djicamera_djicamerasystemstate_isstoringphoto">isStoringPhoto</a></code> is <code>true</code>, the user cannot change the camera mode or start to shoot another photo.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasystemstate_panoramaprogress"><div class="api-col left">Panorama</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasystemstate_panoramaprogress_inline">getPanoramaProgress</a></div></div><div class="inline-doc" id="djicamera_djicamerasystemstate_panoramaprogress_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPanoramaProgress</h6></div>

~~~java
 int getPanoramaProgress() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The progress of the executing panorama shot. It is <code>null</code> if there is no executing panorama shot.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasystemstate_isrecording"><div class="api-col left">Video</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasystemstate_isrecording_inline">isRecording</a></div></div><div class="inline-doc" id="djicamera_djicamerasystemstate_isrecording_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isRecording</h6></div>

~~~java
 boolean isRecording() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_is_recording_key">CameraKey.IS_RECORDING</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the camera is recording video.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasystemstate_currentvideorecordingtimeinseconds"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasystemstate_currentvideorecordingtimeinseconds_inline">getCurrentVideoRecordingTimeInSeconds</a></div></div><div class="inline-doc" id="djicamera_djicamerasystemstate_currentvideorecordingtimeinseconds_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrentVideoRecordingTimeInSeconds</h6></div>

~~~java
 int getCurrentVideoRecordingTimeInSeconds() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_current_video_recording_time_in_seconds_key">CameraKey.CURRENT_VIDEO_RECORDING_TIME_IN_SECONDS</a></td></tr></table></html>



##### Description:



<font color="#666">The duration, in seconds, of the video currently being recorded by the camera.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasystemstate_iscameraoverheated"><div class="api-col left">Error</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasystemstate_iscameraoverheated_inline">isOverheating</a></div></div><div class="inline-doc" id="djicamera_djicamerasystemstate_iscameraoverheated_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isOverheating</h6></div>

~~~java
 boolean isOverheating() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_is_overheating_key">CameraKey.IS_OVERHEATING</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the camera is too hot.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasystemstate_iscameraerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasystemstate_iscameraerror_inline">hasError</a></div></div><div class="inline-doc" id="djicamera_djicamerasystemstate_iscameraerror_inline"

><div class="article"><h6 ><font color="#AAA">method </font>hasError</h6></div>

~~~java
 boolean hasError() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_has_error_key">CameraKey.HAS_ERROR</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if there is a camera sensor error.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>


