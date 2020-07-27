<div class="article"><h1 ><font color="#AAA">class </font>StorageState</h1></div>

~~~java
@EXClassNullAway
 class StorageState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">This class provides the general information and state of the storage (SD card or the internal storage).



##### Class Members:

<div class="api-row" id="djicamera_cameraupdatedstoragestatecallbackinterface"><div class="api-col left">Callback</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_CameraUpdatedStorageStateCallbackInterface.html">Callback</a></div></div><div class="api-row" id="djicamera_djicamerasdcardstate_isinserted"><div class="api-col left">Operating State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasdcardstate_isinserted_inline">isInserted</a></div></div><div class="inline-doc" id="djicamera_djicamerasdcardstate_isinserted_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isInserted</h6></div>

~~~java
 boolean isInserted() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_sdcard_is_inserted_key">CameraKey.SDCARD_IS_INSERTED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the SD card is inserted in the camera. It is always <code>true</code> when it is the internal storage.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasdcardstate_isinitializing"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasdcardstate_isinitializing_inline">isInitializing</a></div></div><div class="inline-doc" id="djicamera_djicamerasdcardstate_isinitializing_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isInitializing</h6></div>

~~~java
 boolean isInitializing() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_sdcard_is_initializing_key">CameraKey.SDCARD_IS_INITIALIZING</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the storage is initializing. Note that if the storage is initializing, the value for other properties in <code><a href="/Components/Camera/DJICamera_DJICameraSDCardState.html#djicamera_djicamerasdcardstate">StorageState</a></code> is undefined.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasdcardstate_isreadonly"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasdcardstate_isreadonly_inline">isReadOnly</a></div></div><div class="inline-doc" id="djicamera_djicamerasdcardstate_isreadonly_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isReadOnly</h6></div>

~~~java
 boolean isReadOnly() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_sdcard_is_read_only_key">CameraKey.SDCARD_IS_READ_ONLY</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the storage is read-only.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasdcardstate_isformatted"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasdcardstate_isformatted_inline">isFormatted</a></div></div><div class="inline-doc" id="djicamera_djicamerasdcardstate_isformatted_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isFormatted</h6></div>

~~~java
 boolean isFormatted() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_sdcard_is_formatted_key">CameraKey.SDCARD_IS_FORMATTED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the storage is formatted.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasdcardstate_isformatting"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasdcardstate_isformatting_inline">isFormatting</a></div></div><div class="inline-doc" id="djicamera_djicamerasdcardstate_isformatting_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isFormatting</h6></div>

~~~java
 boolean isFormatting() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_sdcard_is_formatting_key">CameraKey.SDCARD_IS_FORMATTING</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the storage is formatting.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasdcardstate_isfull"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasdcardstate_isfull_inline">isFull</a></div></div><div class="inline-doc" id="djicamera_djicamerasdcardstate_isfull_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isFull</h6></div>

~~~java
 boolean isFull() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_sdcard_is_full_key">CameraKey.SDCARD_IS_FULL</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the storage cannot save any more media.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasdcardstate_isverified"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasdcardstate_isverified_inline">isVerified</a></div></div><div class="inline-doc" id="djicamera_djicamerasdcardstate_isverified_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isVerified</h6></div>

~~~java
 boolean isVerified() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_sdcard_is_verified_key">CameraKey.SDCARD_IS_VERIFIED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the SD card is verified as genuine. The SD card is not valid if it is fake, which can be a problem if the SD card was purchased by a non-reputable retailer. It is always <code>true</code> when it is the internal storage.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasdcardstate_isinvalidformat"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasdcardstate_isinvalidformat_inline">isInvalidFormat</a></div></div><div class="inline-doc" id="djicamera_djicamerasdcardstate_isinvalidformat_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isInvalidFormat</h6></div>

~~~java
 boolean isInvalidFormat() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_sdcard_is_invalid_format_key">CameraKey.SDCARD_IS_INVALID_FORMAT</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the storage filesystem format is invalid.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasdcardstate_haserror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasdcardstate_haserror_inline">hasError</a></div></div><div class="inline-doc" id="djicamera_djicamerasdcardstate_haserror_inline"

><div class="article"><h6 ><font color="#AAA">method </font>hasError</h6></div>

~~~java
 boolean hasError() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_sdcard_has_error_key">CameraKey.SDCARD_HAS_ERROR</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if there is an error with the storage.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasdcardstate_location"><div class="api-col left">Storage Location</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasdcardstate_location_inline">getStorageLocation</a></div></div><div class="inline-doc" id="djicamera_djicamerasdcardstate_location_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getStorageLocation</h6></div>

~~~java
 SettingsDefinitions.StorageLocation getStorageLocation() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The location of the storage.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerastoragelocation">StorageLocation</a></td><td><font color="#666"><i>A enum value of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerastoragelocation">StorageLocation</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasdcardstate_totalspaceinmegabytes"><div class="api-col left">Capacity</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasdcardstate_totalspaceinmegabytes_inline">getTotalSpaceInMB</a></div></div><div class="inline-doc" id="djicamera_djicamerasdcardstate_totalspaceinmegabytes_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTotalSpaceInMB</h6></div>

~~~java
 int getTotalSpaceInMB() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_sdcard_total_space_in_mb_key">CameraKey.SDCARD_TOTAL_SPACE_IN_MB</a></td></tr></table></html>



##### Description:



<font color="#666">Total space in Megabytes (MB) available on the storage.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasdcardstate_remainingspaceinmegabytes"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasdcardstate_remainingspaceinmegabytes_inline">getRemainingSpaceInMB</a></div></div><div class="inline-doc" id="djicamera_djicamerasdcardstate_remainingspaceinmegabytes_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRemainingSpaceInMB</h6></div>

~~~java
 int getRemainingSpaceInMB() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_sdcard_remaining_space_in_mb_key">CameraKey.SDCARD_REMAINING_SPACE_IN_MB</a></td></tr></table></html>



##### Description:



<font color="#666">Remaining space in Megabytes (MB) on the storage.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasdcardstate_availablecapturecount"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasdcardstate_availablecapturecount_inline">getAvailableCaptureCount</a></div></div><div class="inline-doc" id="djicamera_djicamerasdcardstate_availablecapturecount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAvailableCaptureCount</h6></div>

~~~java
 long getAvailableCaptureCount() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_sdcard_available_capture_count_key">CameraKey.SDCARD_AVAILABLE_CAPTURE_COUNT</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the number of pictures that can be taken with the remaining space available on the storage.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">long</td><td><font color="#666"><i>A long value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerasdcardstate_availablerecordingtimeinseconds"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasdcardstate_availablerecordingtimeinseconds_inline">getAvailableRecordingTimeInSeconds</a></div></div><div class="inline-doc" id="djicamera_djicamerasdcardstate_availablerecordingtimeinseconds_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAvailableRecordingTimeInSeconds</h6></div>

~~~java
 int getAvailableRecordingTimeInSeconds() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_sdcard_available_recording_time_in_seconds_key">CameraKey.SDCARD_AVAILABLE_RECORDING_TIME_IN_SECONDS</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the number of seconds available for recording with the remaining space available on the storage.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>


