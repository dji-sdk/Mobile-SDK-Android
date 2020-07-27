<div class="article"><h1 ><font color="#AAA">class </font>PlaybackState</h1></div>

~~~java
 static class PlaybackState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">This class provides the current state of the Playback manager, which includes the numbers of thumbnail and media files, video duration, video play progress, and file download state.



##### Class Members:

<div class="api-row" id="djiplaybackmanager_djicameraplaybackstate_playbackmode"><div class="api-col left">Playback Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_djicameraplaybackstate_playbackmode_inline">getPlaybackMode</a></div></div><div class="inline-doc" id="djiplaybackmanager_djicameraplaybackstate_playbackmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPlaybackMode</h6></div>

~~~java
 PlaybackMode getPlaybackMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The current mode of the Playback manager.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlaybackState.html#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode">PlaybackMode</a></td><td><font color="#666"><i>Playback manager current mode.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_djicameraplaybackstate_numberofmediafiles"><div class="api-col left">File Statistics</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_djicameraplaybackstate_numberofmediafiles_inline">getNumberOfMediaFiles</a></div></div><div class="inline-doc" id="djiplaybackmanager_djicameraplaybackstate_numberofmediafiles_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getNumberOfMediaFiles</h6></div>

~~~java
 int getNumberOfMediaFiles() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The total number of media files on the SD card, including photos and videos.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Number of media files.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_djicameraplaybackstate_numberofthumbnails"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_djicameraplaybackstate_numberofthumbnails_inline">getNumberOfThumbnails</a></div></div><div class="inline-doc" id="djiplaybackmanager_djicameraplaybackstate_numberofthumbnails_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getNumberOfThumbnails</h6></div>

~~~java
 int getNumberOfThumbnails() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The total number of thumbnails for both the photos and videos being viewed on the page. The value of the property  is valid when the <code><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlaybackState.html#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode">PlaybackMode</a></code>  is <code><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlaybackState.html#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode_multiplefilespreview">MULTIPLE_MEDIA_FILE_PREVIEW</a></code> .



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Number of thumbnails.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_djicameraplaybackstate_numberofphotos"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_djicameraplaybackstate_numberofphotos_inline">getPhotoCount</a></div></div><div class="inline-doc" id="djiplaybackmanager_djicameraplaybackstate_numberofphotos_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPhotoCount</h6></div>

~~~java
 int getPhotoCount() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The total number of photos on the SD card.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Number of photos.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_djicameraplaybackstate_numberofvideos"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_djicameraplaybackstate_numberofvideos_inline">getVideoCount</a></div></div><div class="inline-doc" id="djiplaybackmanager_djicameraplaybackstate_numberofvideos_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVideoCount</h6></div>

~~~java
 int getVideoCount() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The total number of videos on the SD card.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Number of videos.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_djicameraplaybackstate_mediafiletype"><div class="api-col left">File Type</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_djicameraplaybackstate_mediafiletype_inline">getFileType</a></div></div><div class="inline-doc" id="djiplaybackmanager_djicameraplaybackstate_mediafiletype_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFileType</h6></div>

~~~java
 FileType getFileType() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The type of the current file. The CameraMediaFileType includes  types of JPEG, DNG and Video. <br> The value of this property is valid when the playbackMode  is <code><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlaybackState.html#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode_singlefilepreview">SINGLE_PHOTO_PREVIEW</a></code>, <code><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlaybackState.html#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode_singlevideoplaybackstart">SINGLE_VIDEO_PLAYBACK_START</a></code> .



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlaybackState.html#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackfileformat">FileType</a></td><td><font color="#666"><i>Media file type.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_djicameraplaybackstate_videoduration"><div class="api-col left">Video</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_djicameraplaybackstate_videoduration_inline">getVideoDuration</a></div></div><div class="inline-doc" id="djiplaybackmanager_djicameraplaybackstate_videoduration_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVideoDuration</h6></div>

~~~java
 int getVideoDuration() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The duration in second of the playing video. The value of the property is valid only when <code><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlaybackState.html#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode">PlaybackMode</a></code>  is <code><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlaybackState.html#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode_singlevideoplaybackstart">SINGLE_VIDEO_PLAYBACK_START</a></code>  .



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Duration of video.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_djicameraplaybackstate_videoplayprogress"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_djicameraplaybackstate_videoplayprogress_inline">getVideoPlayProgress</a></div></div><div class="inline-doc" id="djiplaybackmanager_djicameraplaybackstate_videoplayprogress_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVideoPlayProgress</h6></div>

~~~java
 int getVideoPlayProgress() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The progress, in percentage, of the playing video. The valid range is [0, 100]. The value the property is valid  only when <code><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlaybackState.html#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode">PlaybackMode</a></code>  is <code><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlaybackState.html#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode_singlevideoplaybackstart">SINGLE_VIDEO_PLAYBACK_START</a></code>  .



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Percentage progress of view playback.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_djicameraplaybackstate_videoplayposition"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_djicameraplaybackstate_videoplayposition_inline">getVideoPlayPosition</a></div></div><div class="inline-doc" id="djiplaybackmanager_djicameraplaybackstate_videoplayposition_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVideoPlayPosition</h6></div>

~~~java
 int getVideoPlayPosition() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The played duration, in seconds, of the playing video. The value the property is valid only when <code><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlaybackState.html#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode">PlaybackMode</a></code>  is <code><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlaybackState.html#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode_singlevideoplaybackstart">SINGLE_VIDEO_PLAYBACK_START</a></code> .



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Current play position of video.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_djicameraplaybackstate_photowidth"><div class="api-col left">Photo</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_djicameraplaybackstate_photowidth_inline">getPhotoWidth</a></div></div><div class="inline-doc" id="djiplaybackmanager_djicameraplaybackstate_photowidth_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPhotoWidth</h6></div>

~~~java
 int getPhotoWidth() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The width of the photo.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Width of photo.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_djicameraplaybackstate_photoheight"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_djicameraplaybackstate_photoheight_inline">getPhotoHeight</a></div></div><div class="inline-doc" id="djiplaybackmanager_djicameraplaybackstate_photoheight_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPhotoHeight</h6></div>

~~~java
 int getPhotoHeight() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The dimension of the previewing photo. The value of the property is valid only  when <code><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlaybackState.html#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode">PlaybackMode</a></code>  is <code><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlaybackState.html#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode_singlefilepreview">SINGLE_PHOTO_PREVIEW</a></code>  and <code><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlaybackState.html#djiplaybackmanager_djicameraplaybackstate_mediafiletype">getFileType</a></code>  is <code><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlaybackState.html#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackfileformat_jpeg">JPEG</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Height of photo.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_djicameraplaybackstate_currentselectedfileindex"><div class="api-col left">Selection</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_djicameraplaybackstate_currentselectedfileindex_inline">getCurrentSelectedFileIndex</a></div></div><div class="inline-doc" id="djiplaybackmanager_djicameraplaybackstate_currentselectedfileindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrentSelectedFileIndex</h6></div>

~~~java
 int getCurrentSelectedFileIndex() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The index of the current selected file.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Index of selected file.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_djicameraplaybackstate_numberofselectedfiles"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_djicameraplaybackstate_numberofselectedfiles_inline">getSelectedFileCount</a></div></div><div class="inline-doc" id="djiplaybackmanager_djicameraplaybackstate_numberofselectedfiles_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSelectedFileCount</h6></div>

~~~java
 int getSelectedFileCount() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The total number of the selected files. The value is valid while <code><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlaybackState.html#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode">PlaybackMode</a></code> is in <code>DJICameraPlaybackModeMultipleFilesEdit</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Number of selected files.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_djicameraplaybackstate_isallfilesinpageselected"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_djicameraplaybackstate_isallfilesinpageselected_inline">areAllFilesInPageSelected</a></div></div><div class="inline-doc" id="djiplaybackmanager_djicameraplaybackstate_isallfilesinpageselected_inline"

><div class="article"><h6 ><font color="#AAA">method </font>areAllFilesInPageSelected</h6></div>

~~~java
 boolean areAllFilesInPageSelected() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if all the files on the current page are selected.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>Response of all files being selected on page.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_djicameraplaybackstate_isselectedfilevalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_djicameraplaybackstate_isselectedfilevalid_inline">isSelectedFileValid</a></div></div><div class="inline-doc" id="djiplaybackmanager_djicameraplaybackstate_isselectedfilevalid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isSelectedFileValid</h6></div>

~~~java
 boolean isSelectedFileValid() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the previewing file is a valid photo or video. The value of the property is valid  only when <code><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlaybackState.html#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode">PlaybackMode</a></code>  is <code><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlaybackState.html#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode_singlefilepreview">SINGLE_PHOTO_PREVIEW</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>If file being previewed is a valid photo or video file.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_djicameraplaybackstate_filedeletestatus"><div class="api-col left">Delete</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_djicameraplaybackstate_filedeletestatus_inline">getPlaybackDeletionState</a></div></div><div class="inline-doc" id="djiplaybackmanager_djicameraplaybackstate_filedeletestatus_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPlaybackDeletionState</h6></div>

~~~java
 PlaybackDeletionState getPlaybackDeletionState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The current status of a file when the user tries to delete it.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlaybackState.html#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackdeletionstatus">PlaybackDeletionState</a></td><td><font color="#666"><i>Status of file being deleted.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_djicameraplaybackstate_isfiledownloaded"><div class="api-col left">Download</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_djicameraplaybackstate_isfiledownloaded_inline">isFileDownloaded</a></div></div><div class="inline-doc" id="djiplaybackmanager_djicameraplaybackstate_isfiledownloaded_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isFileDownloaded</h6></div>

~~~java
 boolean isFileDownloaded() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the previewing file has been downloaded. The value of the property is valid only when <code><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlaybackState.html#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode">PlaybackMode</a></code>  is <code><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlaybackState.html#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode_singlefilepreview">SINGLE_PHOTO_PREVIEW</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the previewing file has been downloaded.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_djicameraplaybackstate_tostring"><div class="api-col left">Convenience</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_djicameraplaybackstate_tostring_inline">toString</a></div></div><div class="inline-doc" id="djiplaybackmanager_djicameraplaybackstate_tostring_inline"

><div class="article"><h6 ><font color="#AAA">method </font>toString</h6></div>

~~~java
@Override
 String toString() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets a string containing information about the playback state. @return A String of playback state.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>A String instance of playback state.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiplaybackmanager_djicameraplaybackstatecallbackinterface"><div class="api-col left">Callback</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlayBackStateCallBackInterface.html">CallBack</a></div></div><div class="api-row" id="djiplaybackmanager_djicameraplaybackstate_djicameraplaybackfileformat"><div class="api-col left">File Format</div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackfileformat_inline">FileType</a></div></div><div class="inline-doc" id="djiplaybackmanager_djicameraplaybackstate_djicameraplaybackfileformat_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FileType</h6></div>

~~~java
 enum FileType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Showing media file types when the camera is in Playback mode.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackfileformat_jpeg_inline"></a>JPEG</td><td><font color="#666">The JPEG media file type.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackfileformat_rawdng_inline"></a>DNG</td><td><font color="#666">The DNG media file type.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackfileformat_video_inline"></a>VIDEO</td><td><font color="#666">The Video media file type.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackfileformat_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The playback file format is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode"><div class="api-col left">Playback Mode</div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode_inline">PlaybackMode</a></div></div><div class="inline-doc" id="djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>PlaybackMode</h6></div>

~~~java
 enum PlaybackMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">A playback mode represents a task that the Playback manager is executing.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode_singlefilepreview_inline"></a>SINGLE_PHOTO_PREVIEW</td><td><font color="#666">Single file preview mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode_singlevideoplaybackstart_inline"></a>SINGLE_VIDEO_PLAYBACK_START</td><td><font color="#666">Single video playback start.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode_singlevideoplaybackpause_inline"></a>SINGLE_VIDEO_PLAYBACK_PAUSED</td><td><font color="#666">Single video playback pause.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode_multiplefilesedit_inline"></a>MULTIPLE_FILES_EDIT</td><td><font color="#666">Multiple file edit.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode_multiplefilespreview_inline"></a>MULTIPLE_MEDIA_FILE_PREVIEW</td><td><font color="#666">Multiple media file preview.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode_download_inline"></a>MEDIA_FILE_DOWNLOAD</td><td><font color="#666">Download media files.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackmode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown playback mode.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiplaybackmanager_djicameraplaybackstate_djicameraplaybackdeletionstatus"><div class="api-col left">Playback Deletion</div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackdeletionstatus_inline">PlaybackDeletionState</a></div></div><div class="inline-doc" id="djiplaybackmanager_djicameraplaybackstate_djicameraplaybackdeletionstatus_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>PlaybackDeletionState</h6></div>

~~~java
 enum PlaybackDeletionState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The file deletion status when deleting a file as the camera is in playback mode.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackdeletionstatus_none_inline"></a>NONE</td><td><font color="#666">Camera is not deleting files.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackdeletionstatus_failure_inline"></a>FAILED</td><td><font color="#666">Media file delete failed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackdeletionstatus_deleting_inline"></a>DELETING</td><td><font color="#666">Media file is deleting.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackdeletionstatus_success_inline"></a>SUCCESSFUL</td><td><font color="#666">Delete Media file successfully.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiplaybackmanager_djicameraplaybackstate_djicameraplaybackdeletionstatus_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Media file unknown delete status.</td></tr></table></html>

##### Class Members:

</div>


