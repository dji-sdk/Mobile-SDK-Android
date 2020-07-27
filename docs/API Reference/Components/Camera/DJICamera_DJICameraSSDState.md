<div class="article"><h1 ><font color="#AAA">class </font>SSDState</h1></div>

~~~java
@EXClassNullAway
 class SSDState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">This class contains the information about camera's Solid State Drive (SSD) information, including state, whether it is connected, its capacity, video size and rate, etc.



##### Class Members:

<div class="api-row" id="djicamera_cameraupdatedssdstatecallbackinterface"><div class="api-col left">Callback</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_CameraUpdatedSSDStateCallbackInterface.html">Callback</a></div></div><div class="api-row" id="djicamera_djicamerassdstate_operationstate"><div class="api-col left">Operating State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerassdstate_operationstate_inline">getSSDOperationState</a></div></div><div class="inline-doc" id="djicamera_djicamerassdstate_operationstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSSDOperationState</h6></div>

~~~java
 SSDOperationState getSSDOperationState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_ssd_operation_state_key">CameraKey.SSD_OPERATION_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">SSD state information for currently executing operations.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdoperationstate">SSDOperationState</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdoperationstate">SSDOperationState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerassdstate_isconnected"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerassdstate_isconnected_inline">isConnected</a></div></div><div class="inline-doc" id="djicamera_djicamerassdstate_isconnected_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isConnected</h6></div>

~~~java
 boolean isConnected() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_ssd_is_connected_key">CameraKey.SSD_IS_CONNECTED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the SSD is connected. Note, if the camera is disconnected, the values for other properties in <code><a href="/Components/Camera/DJICamera_DJICameraSSDState.html#djicamera_djicamerassdstate">SSDState</a></code> are undefined.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerassdstate_totalspace"><div class="api-col left">Capacity</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerassdstate_totalspace_inline">getCapacity</a></div></div><div class="inline-doc" id="djicamera_djicamerassdstate_totalspace_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCapacity</h6></div>

~~~java
 SSDCapacity getCapacity() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_ssd_total_space_key">CameraKey.SSD_TOTAL_SPACE</a></td></tr></table></html>



##### Description:



<font color="#666">SSD's total capacity. @return Total SSD capacity.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdcapacity">SSDCapacity</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdcapacity">SSDCapacity</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerassdstate_availablerecordingtimeinseconds"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerassdstate_availablerecordingtimeinseconds_inline">getAvailableRecordingTimeInSeconds</a></div></div><div class="inline-doc" id="djicamera_djicamerassdstate_availablerecordingtimeinseconds_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAvailableRecordingTimeInSeconds</h6></div>

~~~java
 int getAvailableRecordingTimeInSeconds() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_ssd_available_recording_time_in_seconds_key">CameraKey.SSD_AVAILABLE_RECORDING_TIME_IN_SECONDS</a></td></tr></table></html>



##### Description:



<font color="#666">SSD's remaining time in seconds, based on the current <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoresolution">VideoResolution</a></code> and <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoframerate">VideoFrameRate</a></code>. @return SSD's remaining time measured in seconds.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerassdstate_remainingspaceinmegabytes"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerassdstate_remainingspaceinmegabytes_inline">getRemainingSpaceInMB</a></div></div><div class="inline-doc" id="djicamera_djicamerassdstate_remainingspaceinmegabytes_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRemainingSpaceInMB</h6></div>

~~~java
 long getRemainingSpaceInMB() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_ssd_remaining_space_in_mb_key">CameraKey.SSD_REMAINING_SPACE_IN_MB</a></td></tr></table></html>



##### Description:



<font color="#666">SSD's remaining capacity in MB. @return SSD's remaining capacity measured in MB.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">long</td><td><font color="#666"><i>A long value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerassdstate_videoresolution"><div class="api-col left">Video</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerassdstate_videoresolution_inline">getVideoResolution</a></div></div><div class="inline-doc" id="djicamera_djicamerassdstate_videoresolution_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVideoResolution</h6></div>

~~~java
 VideoResolution getVideoResolution() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_ssd_video_resolution_and_frame_rate_key">CameraKey.SSD_VIDEO_RESOLUTION_AND_FRAME_RATE</a></td></tr></table></html>



##### Description:



<font color="#666">Video resolution to be saved to SSD. @return SSD's video resolution.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoresolution">VideoResolution</a></td><td><font color="#666"><i>A <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoresolution">VideoResolution</a></code> enum value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerassdstate_videoframerate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerassdstate_videoframerate_inline">getVideoFrameRate</a></div></div><div class="inline-doc" id="djicamera_djicamerassdstate_videoframerate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVideoFrameRate</h6></div>

~~~java
 VideoFrameRate getVideoFrameRate() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_ssd_video_resolution_and_frame_rate_key">CameraKey.SSD_VIDEO_RESOLUTION_AND_FRAME_RATE</a></td></tr></table></html>



##### Description:



<font color="#666">Video framerate to be saved to SSD.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoframerate">VideoFrameRate</a></td><td><font color="#666"><i>A <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoframerate">VideoFrameRate</a></code> enum value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerassdstate_rawphotoburstcount"><div class="api-col left">Photo</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerassdstate_rawphotoburstcount_inline">getRAWPhotoBurstCount</a></div></div><div class="inline-doc" id="djicamera_djicamerassdstate_rawphotoburstcount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRAWPhotoBurstCount</h6></div>

~~~java
 int getRAWPhotoBurstCount() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_raw_photo_burst_count_key">CameraKey.RAW_PHOTO_BURST_COUNT</a></td></tr></table></html>



##### Description:



<font color="#666">Number of photos that are shot in RAW burst mode.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>


