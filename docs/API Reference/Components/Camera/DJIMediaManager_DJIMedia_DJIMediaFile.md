<div class="article"><h1 ><font color="#AAA">class </font>AudioMediaFile</h1></div>

~~~java
 class AudioMediaFile extends MediaFile 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia">MediaFile</a></code></td></tr></table></html>



##### Description:



<font color="#666">This class represents the information of an audio file in the aircraft. The audio  file is not accessible if the aircraft is connected to a PC with the USB port.  For M2E Speaker, it only supports audio files with the following conditions:  The audio channel is mono. The audio sample rate is 44,100 Hz. The PCM (Pulse-code modulation)  sample depth is 16 bit per sample. The <code><a href="/Components/Camera/DJIMediaManager_DJIMedia_DJIMediaFile.html#djimediamanager_djimedia_djimediafile">AudioMediaFile</a></code> contains  following properties: <br> - <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_filename">getFileName</a></code> <br> - <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_durationinseconds">getDurationInSeconds</a></code>  <br>- <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_getid">getIndex</a></code> <br> - <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_storagelocation">getStorageLocation</a></code>



##### Class Members:

<div class="api-row" id="djimediamanager_djimedia_djimediafile_audiostoragelocation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_djimediafile_audiostoragelocation_inline">getAudioStorageLocation</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_djimediafile_audiostoragelocation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAudioStorageLocation</h6></div>

~~~java
 SettingsDefinitions.AudioStorageLocation getAudioStorageLocation() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">The storage location to store the file in the aircraft.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJIMediaManager_DJIMedia_DJIMediaFile.html#djimediamanager_djimedia_djimediafile_djiaudiostoragelocation">AudioStorageLocation</a></td><td><font color="#666"><i>An enum value of the <code><a href="/Components/Camera/DJIMediaManager_DJIMedia_DJIMediaFile.html#djimediamanager_djimedia_djimediafile_djiaudiostoragelocation">AudioStorageLocation</a></code>.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djimediamanager_djimedia_djimediafile_djiaudiostoragelocation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_djimediafile_djiaudiostoragelocation_inline">AudioStorageLocation</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_djimediafile_djiaudiostoragelocation_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>AudioStorageLocation</h6></div>

~~~java
 enum AudioStorageLocation 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.accessory</td></tr></table></html>



##### Description:



<font color="#666">Storage types of audio files. The storage types will determine the strategy of  the aircraft to keep the file.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djimediamanager_djimedia_djimediafile_djiaudiostoragelocation_temporary_inline"></a>TEMPORARY</td><td><font color="#666">The audio file is stored to a temporary space. Files with temporary storage  location will be automatically deleted when the aircraft reboots.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimediamanager_djimedia_djimediafile_djiaudiostoragelocation_persistent_inline"></a>PERSISTENT</td><td><font color="#666">The audio file is stored to a persistent space. Files with persistent storage  location should be deleted manually by calling <code><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker.html#djiaccessoryaggregation_djispeaker_deletefiles">delete</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimediamanager_djimedia_djimediafile_djiaudiostoragelocation_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>



##### Inherited Methods:

<div class="api-row" id="djimediamanager_djimedia_filename"><div class="api-col left">dji.sdk.media.MediaFile</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_filename_inline">getFileName</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_filename_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFileName</h6></div>

~~~java
 String getFileName() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Returns the name of the media file in the SD Card.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>A String instance of the name of the media file.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_valid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_valid_inline">isValid</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_valid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isValid</h6></div>

~~~java
 boolean isValid() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the media file is still valid. If a media file is from the file list of the media manager, the file will become invalid after the file list is reset.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check if the media file is still valid.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_getid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_getid_inline">getIndex</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_getid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getIndex</h6></div>

~~~java
 int getIndex() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Get the file index used in the camera.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the file index.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_mediatype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_mediatype_inline">getMediaType</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_mediatype_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMediaType</h6></div>

~~~java
 MediaType getMediaType() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Returns the type of media file.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_djimediatype">MediaType</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_djimediatype">MediaType</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_quickshotvideotype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_quickshotvideotype_inline">getQuickShotVideoType</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_quickshotvideotype_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getQuickShotVideoType</h6></div>

~~~java
@Nullable
 QuickShotVideoType getQuickShotVideoType() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Returns the type of QuickShot video media file. It is valid when <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_getvideofiletype">getVideoFileType</a></code> is <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_djimediavideofiletype_quickshot">QUICK_SHOT</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_djimediaquickshotvideotype">QuickShotVideoType</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_djimediaquickshotvideotype">QuickShotVideoType</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_shootphotomode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_shootphotomode_inline">getShootPhotoMode</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_shootphotomode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getShootPhotoMode</h6></div>

~~~java
 ShootPhotoMode getShootPhotoMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Returns the <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashootphotomode">ShootPhotoMode</a></code> of a photo. Returns <code>null</code> if <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_mediatype">getMediaType</a></code> is
 <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_djimediatype_mov">MOV</a></code> or <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_djimediatype_mp4">MP4</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashootphotomode">ShootPhotoMode</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashootphotomode">ShootPhotoMode</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_panoramamode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_panoramamode_inline">getPanoramaMode</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_panoramamode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPanoramaMode</h6></div>

~~~java
 PhotoPanoramaMode getPanoramaMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Returns the <code><a href="/Components/Camera/DJICamera.html#djicamera_djicameraphotopanoramamode">PhotoPanoramaMode</a></code> of a photo. It is valid when <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_shootphotomode">getShootPhotoMode</a></code> is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashootphotomode_djicamerashootphotomodepanorama">PANORAMA</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera.html#djicamera_djicameraphotopanoramamode">PhotoPanoramaMode</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Camera/DJICamera.html#djicamera_djicameraphotopanoramamode">PhotoPanoramaMode</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_superresinfobean"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_superresinfobean_inline">getSuperResInfoBean</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_superresinfobean_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSuperResInfoBean</h6></div>

~~~java
 SuperResInfoBean getSuperResInfoBean() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Gets the image information bean of super resolution. It is used to saved to position information of zoom image in wide image.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">SuperResInfoBean</td><td><font color="#666"><i>The image info bean of super resolution.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_downloadedsize"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_downloadedsize_inline">getDownloadedSize</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_downloadedsize_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDownloadedSize</h6></div>

~~~java
 long getDownloadedSize() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Downloaded size in Bytes of the media file.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">long</td><td><font color="#666"><i>A long value of downloaded size.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_filesizeinbytes"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_filesizeinbytes_inline">getFileSize</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_filesizeinbytes_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFileSize</h6></div>

~~~java
 long getFileSize() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Returns the size, in bytes, of the media file.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">long</td><td><font color="#666"><i>Size of media file.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_timecreated"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_timecreated_inline">getDateCreated</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_timecreated_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDateCreated</h6></div>

~~~java
 String getDateCreated() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Returns the time when the media file was created as a string in the format "yyyy-MM-dd kk:mm:ss".



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>A String instance of the media file created date.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_gettimecreated"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_gettimecreated_inline">getTimeCreated</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_gettimecreated_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTimeCreated</h6></div>

~~~java
 long getTimeCreated() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Returns the time when the media file was created as a long type.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">long</td><td><font color="#666"><i>A long value of the media file created date.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_durationinseconds"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_durationinseconds_inline">getDurationInSeconds</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_durationinseconds_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDurationInSeconds</h6></div>

~~~java
 float getDurationInSeconds() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">If the media file is a video, this property returns the duration of the video in seconds. Will be 0s if the media file is a photo.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>Media duration.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_framerate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_framerate_inline">getFrameRate</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_framerate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFrameRate</h6></div>

~~~java
 VideoFrameRate getFrameRate() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Frame rate when the media file is a video.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoframerate">VideoFrameRate</a></td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_resolution"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_resolution_inline">getResolution</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_resolution_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getResolution</h6></div>

~~~java
 VideoResolution getResolution() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Camera resolution.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoresolution">VideoResolution</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoresolution">VideoResolution</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_videoorientation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_videoorientation_inline">getVideoOrientation</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_videoorientation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVideoOrientation</h6></div>

~~~java
 Orientation getVideoOrientation() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">The orientation of the camera when the video file was first recorded. If the camera orientation changes during a video capture, this will report the initial orientation. Will be <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraorientation_landscape">LANDSCAPE</a></code> if the media file is a photo. Only Mavic Pro supports this property. Will be <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraorientation_landscape">LANDSCAPE</a></code> for other products.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraorientation">Orientation</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraorientation">Orientation</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_storagelocation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_storagelocation_inline">getStorageLocation</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_storagelocation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getStorageLocation</h6></div>

~~~java
 StorageLocation getStorageLocation() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Storage location of the media file.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerastoragelocation">StorageLocation</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerastoragelocation">StorageLocation</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_getvideofiletype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_getvideofiletype_inline">getVideoFileType</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_getvideofiletype_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVideoFileType</h6></div>

~~~java
@Nullable
 VideoFileType getVideoFileType() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Returns the type of video media file. This property is only valid when the <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_mediatype">getMediaType</a></code>  is <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_djimediatype_mov">MOV</a></code> or <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_djimediatype_mp4">MP4</a></code>. Returns <code>null</code> for other media types.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_djimediavideofiletype">VideoFileType</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_djimediavideofiletype">VideoFileType</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_custominformation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_custominformation_inline">getCustomInformation</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_custominformation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCustomInformation</h6></div>

~~~java
 String getCustomInformation() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Custom information can be stored in media file's XMP meta data using <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setmediafilecustominformation">setMediaFileCustomInformation</a></code> This property contains the information that was written to this media file. If this property returns <code>null</code>, use <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_fetchcustominformation">fetchCustomInformation</a></code> to populate it. Only supported by Phantom 4 Pro, Phantom 4 Advanced and Inspire 2 with firmware versions from after May 23 2017.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>A string value.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_thumbnail"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_thumbnail_inline">getThumbnail</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_thumbnail_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getThumbnail</h6></div>

~~~java
 Bitmap getThumbnail() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Returns the thumbnail for this media. If this property returns nil, call <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_djimedia_fetchthumbnail">fetchThumbnail</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Bitmap</td><td><font color="#666"><i>A Bitmap object.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_preview"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_preview_inline">getPreview</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_preview_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPreview</h6></div>

~~~java
 Bitmap getPreview() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Returns the preview image for this media. If this property returns <code>null</code>, call <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_fetchpreview">fetchPreview</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Bitmap</td><td><font color="#666"><i>A Bitmap object.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_resetthumbnail"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_resetthumbnail_inline">resetThumbnail</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_resetthumbnail_inline"

><div class="article"><h6 ><font color="#AAA">method </font>resetThumbnail</h6></div>

~~~java
 void resetThumbnail(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Resets the cached thumbnail to <code>null</code> to release the memory usage.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_fetchpreview"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_fetchpreview_inline">fetchPreview</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_fetchpreview_inline"

><div class="article"><h6 ><font color="#AAA">method </font>fetchPreview</h6></div>

~~~java
 void fetchPreview(@NonNull final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Fetch media's preview image. The preview image is a lower resolution (960 x 540) version of a photo. The <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_djimediatype">MediaType</a></code> of this media object should be <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_djimediatype_jpeg">JPEG</a></code> or <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_djimediatype_tiff">TIFF</a></code>. The preview will be stored in <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_preview">getPreview</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The <code>completion callback</code> with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_resetpreview"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_resetpreview_inline">resetPreview</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_resetpreview_inline"

><div class="article"><h6 ><font color="#AAA">method </font>resetPreview</h6></div>

~~~java
 void resetPreview(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Resets the cached preview image to <code>null</code> to release the memory usage.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The <code>completion callback</code> with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_fetchcustominformation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_fetchcustominformation_inline">fetchCustomInformation</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_fetchcustominformation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>fetchCustomInformation</h6></div>

~~~java
 void fetchCustomInformation(@NonNull CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Custom information can be stored in media file's XMP meta data using <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setmediafilecustominformation">setMediaFileCustomInformation</a></code>. The information will be stored in <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_custominformation">getCustomInformation</a></code>. Only supported by Phantom 4 Pro, Phantom 4 Advanced,  Phantom 4 Pro V2.0, Zenmuse X4S, Zenmuse X5S, Zenmuse X7 and Mavic 2 Enterprise camera.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The <code>completion callback</code> with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_fetchfiledata"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_fetchfiledata_inline">fetchFileData</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_fetchfiledata_inline"

><div class="article"><h6 ><font color="#AAA">method </font>fetchFileData</h6></div>

~~~java
 void fetchFileData(@NonNull final File destDir,
                              @Nullable String fileNameWithoutExtension,
                              @NonNull final DownloadListener<String> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Fetches this media file's full resolution data from the SD card. The difference between  fetching the media data and fetching the thumbnail is that fetching the thumbnail will  return a low-resolution image of the actual picture, while fetching the media data will  return all data for a video or image. If last download action is aborted, it will continue  to download the data from where the file download has been aborted. Not supported by Phantom 4 RTK.  Please use <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_sethighqualitypreviewenabled">setHighQualityPreviewEnabled</a></code> to fetch high quality preview instead.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final File <font color="#000">destDir</td><td><font color="#666"><i>File instance of location to save the files, which can not be null.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable String <font color="#000">fileNameWithoutExtension</td><td><font color="#666"><i>The fileName to store in mobile devices, without the file extension.&lt;br&gt; If it is null, the file name in the camera's SDCard will be used.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull final DownloadListener&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion callback that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_stopfetchingfiledata"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_stopfetchingfiledata_inline">stopFetchingFileData</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_stopfetchingfiledata_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopFetchingFileData</h6></div>

~~~java
 void stopFetchingFileData(@Nullable CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Stops a currently executing call of <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_fetchfiledata">fetchFileData</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The <code>completion callback</code> with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_fetchsubfiledatalist"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_fetchsubfiledatalist_inline">fetchSubFileDataList</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_fetchsubfiledatalist_inline"

><div class="article"><h6 ><font color="#AAA">method </font>fetchSubFileDataList</h6></div>

~~~java
 void fetchSubFileDataList(@NonNull final CompletionCallbackWith<List<MediaFile>> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Fetches the file data of the sub media files. It is available only when <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_mediatype">getMediaType</a></code> is <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_djimediatype_panorama">PANORAMA</a></code> or <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_djimediatype_shallowfocus">SHALLOW_FOCUS</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;List&lt;<a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia">MediaFile</a>&gt;&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion callback that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_fetchsuperresjson"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_fetchsuperresjson_inline">fetchSuperResJSON</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_fetchsuperresjson_inline"

><div class="article"><h6 ><font color="#AAA">method </font>fetchSuperResJSON</h6></div>

~~~java
 void fetchSuperResJSON(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Super Resolution JSON file was used to save super resolution photo coordinate info.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback that receives the execution result.</i></td></tr></table></html></div>


