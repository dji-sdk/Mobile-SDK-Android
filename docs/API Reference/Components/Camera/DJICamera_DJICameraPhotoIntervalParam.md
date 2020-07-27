<div class="article"><h1 ><font color="#AAA">class </font>PhotoTimeIntervalSettings</h1></div>

~~~java
 static class PhotoTimeIntervalSettings 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_time_interval_settings_key">CameraKey.PHOTO_TIME_INTERVAL_SETTINGS</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the number of pictures, and sets the time interval between pictures for the Interval shoot photo mode.



##### Class Members:

<div class="api-row" id="djicamera_djicameraphotointervalparam_contstructor"><div class="api-col left">Capture Count</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraphotointervalparam_contstructor_inline">PhotoTimeIntervalSettings</a></div></div><div class="inline-doc" id="djicamera_djicameraphotointervalparam_contstructor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>PhotoTimeIntervalSettings</h6></div>

~~~java
 PhotoTimeIntervalSettings(int captureCount, int timeIntervalInSeconds) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Constructor.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">captureCount</td><td><font color="#666"><i>Number of photos to take.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">timeIntervalInSeconds</td><td><font color="#666"><i>Time interval in seconds between taking photos.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameraphotointervalparam_capturecount"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraphotointervalparam_capturecount_inline">getCaptureCount</a></div></div><div class="inline-doc" id="djicamera_djicameraphotointervalparam_capturecount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCaptureCount</h6></div>

~~~java
 int getCaptureCount() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The number of photos to capture. The value range is [2, 255]. If 255 is selected, then the camera will continue to take pictures until stopShootPhotoWithCompletion is called. For thermal imaging camera and Z30 camera, it can only be set to 255.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Number of photos to capture</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameraphotointervalparam_timeintervalinseconds"><div class="api-col left">Time Interval</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraphotointervalparam_timeintervalinseconds_inline">getTimeIntervalInSeconds</a></div></div><div class="inline-doc" id="djicamera_djicameraphotointervalparam_timeintervalinseconds_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTimeIntervalInSeconds</h6></div>

~~~java
 int getTimeIntervalInSeconds() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The time interval between when two photos are taken. The range for this parameter depends the photo file format(DJICameraPhotoFileFormat). For XT camera, the range is [1, 60] seconds. For all other products, when the file format is JPEG, the range is [2, 2^16 - 1] seconds; when the file format is RAW or RAW+JPEG, the range is [10, 2^16 - 1] seconds.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Time interval in seconds.</i></td></tr></table></html></div>


