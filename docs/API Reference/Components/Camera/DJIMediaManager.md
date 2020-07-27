<div class="article"><h1 ><font color="#AAA">class </font>MediaManager</h1></div>

~~~java
 class MediaManager implements DJIParamAccessListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">The media manager is used to interact with the file system on the SD card or the internal storage. By using the media manager, the user can get the metadata for all the multimedia files, and has access to each individual multimedia file.



##### Class Members:

<div class="api-row" id="djimediamanager_updatevideoplaybackstatecallback"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_updatevideoplaybackstatecallback_inline">addMediaUpdatedVideoPlaybackStateListener</a></div></div><div class="inline-doc" id="djimediamanager_updatevideoplaybackstatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addMediaUpdatedVideoPlaybackStateListener</h6></div>

~~~java
 void addMediaUpdatedVideoPlaybackStateListener(VideoPlaybackStateListener callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Sets the callback object for updating the video playback state of the media manager.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIMediaManager_updateVideoPlaybackStateCallbackInterface.html#djimediamanager_updatevideoplaybackstatecallbackinterface">VideoPlaybackStateListener</a> <font color="#000">callback</td><td><font color="#666"><i>callback object of updating the vision detection state.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_taskscheduler"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_taskscheduler_inline">getScheduler</a></div></div><div class="inline-doc" id="djimediamanager_taskscheduler_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getScheduler</h6></div>

~~~java
 FetchMediaTaskScheduler getScheduler() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Fetch media task scheduler. This can be used to queue the download of the previews, thumbnails and XML custom data from multiple media files.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIMediaManager_FetchMediaTaskScheduler.html#djimediamanager_fetchmediataskscheduler">FetchMediaTaskScheduler</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Camera/DJIMediaManager_FetchMediaTaskScheduler.html#djimediamanager_fetchmediataskscheduler">FetchMediaTaskScheduler</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_sdcardfileliststate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_sdcardfileliststate_inline">getSDCardFileListState</a></div></div><div class="inline-doc" id="djimediamanager_sdcardfileliststate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSDCardFileListState</h6></div>

~~~java
@NonNull
 FileListState getSDCardFileListState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">The file list state of the SD card.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_djimediafileliststate">FileListState</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_djimediafileliststate">FileListState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_sdcardfilelistsnapshot"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_sdcardfilelistsnapshot_inline">getSDCardFileListSnapshot</a></div></div><div class="inline-doc" id="djimediamanager_sdcardfilelistsnapshot_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSDCardFileListSnapshot</h6></div>

~~~java
@Nullable
 List<MediaFile> getSDCardFileListSnapshot() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Returns a copy of the current file list on the SD card. Returns <code>null</code> if <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_sdcardfileliststate">getSDCardFileListState</a></code> is reset.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;<a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia">MediaFile</a>&gt;</td><td><font color="#666"><i>An array of <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia">MediaFile</a></code> objects.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_internalstoragefileliststate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_internalstoragefileliststate_inline">getInternalStorageFileListState</a></div></div><div class="inline-doc" id="djimediamanager_internalstoragefileliststate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getInternalStorageFileListState</h6></div>

~~~java
@NonNull
 FileListState getInternalStorageFileListState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">The file list state of the internal storage.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_djimediafileliststate">FileListState</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_djimediafileliststate">FileListState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_internalstoragefilelistsnapshot"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_internalstoragefilelistsnapshot_inline">getInternalStorageFileListSnapshot</a></div></div><div class="inline-doc" id="djimediamanager_internalstoragefilelistsnapshot_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getInternalStorageFileListSnapshot</h6></div>

~~~java
@Nullable
 List<MediaFile> getInternalStorageFileListSnapshot() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Returns a copy of the current file list on the internal storage. Returns <code>nil</code> if <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_internalstoragefileliststate">getInternalStorageFileListState</a></code> is reset or unknown.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;<a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia">MediaFile</a>&gt;</td><td><font color="#666"><i>An array of <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia">MediaFile</a></code> objects.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_refreshfilelistofstoragelocation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_refreshfilelistofstoragelocation_inline">refreshFileListOfStorageLocation</a></div></div><div class="inline-doc" id="djimediamanager_refreshfilelistofstoragelocation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>refreshFileListOfStorageLocation</h6></div>

~~~java
 void refreshFileListOfStorageLocation(SettingsDefinitions.StorageLocation storageLocation,
                                                 CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Refreshes the file list of the storage. If the current state is <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_djimediafileliststate_reset">RESET</a></code>, the media manager will try to fetch the complete file list. If the current state  is <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_djimediafileliststate_incomplete">INCOMPLETE</a></code>, the media manager will only fetch the missing list of files. If the file list is refreshed successfully, the corresponding file list state (either <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_sdcardfileliststate">getSDCardFileListState</a></code> or <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_internalstoragefileliststate">getInternalStorageFileListState</a></code>) will become <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_djimediafileliststate_uptodate">UP_TO_DATE</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerastoragelocation">StorageLocation</a> <font color="#000">storageLocation</td><td><font color="#666"><i>The storage location of the file list to refresh.</i></td></tr><tr valign="top"><td><font color="#70BF41">CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_deletefiles"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_deletefiles_inline">deleteFiles</a></div></div><div class="inline-doc" id="djimediamanager_deletefiles_inline"

><div class="article"><h6 ><font color="#AAA">method </font>deleteFiles</h6></div>

~~~java
 void deleteFiles(@NonNull final List<MediaFile> files,
                            final CompletionCallbackWithTwoParam<List<MediaFile>, DJICameraError> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Delete media files from storages. If the operation is started successfully, <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_djimediafileliststate">FileListState</a></code> will become  <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_djimediafileliststate_deleting">DELETING</a></code>. If there is error or  "failedFiles" is not empty, <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_djimediafileliststate">FileListState</a></code> will become <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_djimediafileliststate_reset">RESET</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final List&lt;<a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia">MediaFile</a>&gt; <font color="#000">files</td><td><font color="#666"><i>A list of <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia">MediaFile</a></code> objects.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWithTwoParam&lt;List&lt;<a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia">MediaFile</a>&gt;, <a href="/Components/SDKError/DJIError_DJICameraError.html#djierror_djicameraerror">DJICameraError</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>A completion callback of CompletionCallbackWithTwoParam&lt;List&lt;MediaFile&gt;.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_exitmediadownloading"><div class="api-col left">Download</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_exitmediadownloading_inline">exitMediaDownloading</a></div></div><div class="inline-doc" id="djimediamanager_exitmediadownloading_inline"

><div class="article"><h6 ><font color="#AAA">method </font>exitMediaDownloading</h6></div>

~~~java
 void exitMediaDownloading() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">This will entirely stop the downloading process and of course clean the downloading thread pool. The camera will exit the MEDIA_DOWNLOAD mode and enter the SHOOT_PHOTO mode. <br><br> Precondition:<br> The camera enters the MediaDownload mode.<br> <br> <br>Post Condition:<br> After this function invoked, the camera mode will shift to TAKEPHOTO mode.<br>

</div>

<div class="api-row" id="djimediamanager_addupdatefileliststatelistener"><div class="api-col left">Add listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_addupdatefileliststatelistener_inline">addUpdateFileListStateListener</a></div></div><div class="inline-doc" id="djimediamanager_addupdatefileliststatelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addUpdateFileListStateListener</h6></div>

~~~java
 void addUpdateFileListStateListener(@NonNull FileListStateListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Start listen to the update of file list state.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJIMediaManager_FileListStateListener.html#djimediamanager_fileliststatelistener">FileListStateListener</a> <font color="#000">listener</td><td><font color="#666"><i>A <code><a href="/Components/Camera/DJIMediaManager_FileListStateListener.html#djimediamanager_fileliststatelistener">FileListStateListener</a></code> interface.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_addupdatestoragelocationlistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_addupdatestoragelocationlistener_inline">addUpdateStorageLocationListener</a></div></div><div class="inline-doc" id="djimediamanager_addupdatestoragelocationlistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addUpdateStorageLocationListener</h6></div>

~~~java
 void addUpdateStorageLocationListener(@NonNull SettingsDefinitions.StorageLocation storageLocation,
                                                 @NonNull FileListStateListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Start listen to the update of file list state.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerastoragelocation">StorageLocation</a> <font color="#000">storageLocation</td><td><font color="#666"><i>The storage location of the file list.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJIMediaManager_FileListStateListener.html#djimediamanager_fileliststatelistener">FileListStateListener</a> <font color="#000">listener</td><td><font color="#666"><i>A <code><a href="/Components/Camera/DJIMediaManager_FileListStateListener.html#djimediamanager_fileliststatelistener">FileListStateListener</a></code> interface.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_removefileliststatecallback"><div class="api-col left">Remove listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_removefileliststatecallback_inline">removeFileListStateCallback</a></div></div><div class="inline-doc" id="djimediamanager_removefileliststatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeFileListStateCallback</h6></div>

~~~java
 void removeFileListStateCallback(@NonNull FileListStateListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Stop listen to the update of file list state.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJIMediaManager_FileListStateListener.html#djimediamanager_fileliststatelistener">FileListStateListener</a> <font color="#000">listener</td><td><font color="#666"><i>A <code><a href="/Components/Camera/DJIMediaManager_FileListStateListener.html#djimediamanager_fileliststatelistener">FileListStateListener</a></code> interface.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_videoplayback_isvideoplaybacksupported"><div class="api-col left">Video Playback</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_videoplayback_isvideoplaybacksupported_inline">isVideoPlaybackSupported</a></div></div><div class="inline-doc" id="djimediamanager_videoplayback_isvideoplaybacksupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isVideoPlaybackSupported</h6></div>

~~~java
 boolean isVideoPlaybackSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Checks if the media manager supports video playback or not. @return <code>true</code> if the media manager supports video playback.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the media manager supports video playback.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_videoplayback_playvideo"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_videoplayback_playvideo_inline">playVideoMediaFile</a></div></div><div class="inline-doc" id="djimediamanager_videoplayback_playvideo_inline"

><div class="article"><h6 ><font color="#AAA">method </font>playVideoMediaFile</h6></div>

~~~java
 void playVideoMediaFile(@NonNull MediaFile videoMediaFile, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Start video playback through <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager">MediaManager</a></code>. When the media manager is playing a video, video data can be received from <code><a href="/Components/Camera/DJICamera_CameraReceivedVideoDataCallbackInterface.html#djicamera_didreceivevideodata">onReceive</a></code> and playback state received from <code><a href="/Components/Camera/DJIMediaManager_updateVideoPlaybackStateCallbackInterface.html#djimediamanager_updatevideoplaybackstate">onUpdate</a></code>. Video playback through <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager">MediaManager</a></code> is fixed at 720p.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia">MediaFile</a> <font color="#000">videoMediaFile</td><td><font color="#666"><i>The video to play.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_videoplayback_resume"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_videoplayback_resume_inline">resume</a></div></div><div class="inline-doc" id="djimediamanager_videoplayback_resume_inline"

><div class="article"><h6 ><font color="#AAA">method </font>resume</h6></div>

~~~java
 void resume(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">The media manager resumes the paused video.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_videoplayback_pause"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_videoplayback_pause_inline">pause</a></div></div><div class="inline-doc" id="djimediamanager_videoplayback_pause_inline"

><div class="article"><h6 ><font color="#AAA">method </font>pause</h6></div>

~~~java
 void pause(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">The media manager pauses the playing video.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_videoplayback_stop"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_videoplayback_stop_inline">stop</a></div></div><div class="inline-doc" id="djimediamanager_videoplayback_stop_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stop</h6></div>

~~~java
 void stop(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">The media manager stops the playing video.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_videoplayback_movetoposition"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_videoplayback_movetoposition_inline">moveToPosition</a></div></div><div class="inline-doc" id="djimediamanager_videoplayback_movetoposition_inline"

><div class="article"><h6 ><font color="#AAA">method </font>moveToPosition</h6></div>

~~~java
 void moveToPosition(@FloatRange(from = 0) float position, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Video playback is skipped to the new position in seconds from the start of the video.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@FloatRange(from = 0) float <font color="#000">position</td><td><font color="#666"><i>New position to play in seconds from start of video. Input with precision of greater than 3 decimal places, will be rounded to 3.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_iscustomizedcffilesupported"><div class="api-col left">Check Customize DCF File Support</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_iscustomizedcffilesupported_inline">isCustomizeDCFFileSupported</a></div></div><div class="inline-doc" id="djimediamanager_iscustomizedcffilesupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isCustomizeDCFFileSupported</h6></div>

~~~java
    protected boolean isCustomizeDCFFileSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Checks if the media manager supports customize DCF file naming rule or not. It is Only supported by GD610.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">protected boolean</td><td><font color="#666"><i><code>true</code> if the camera supports customize DCF file.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djimedia_fetchthumbnail"><div class="api-col left">Download Media</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimedia_fetchthumbnail_inline">fetchThumbnail</a></div></div><div class="inline-doc" id="djimediamanager_djimedia_fetchthumbnail_inline"

><div class="article"><h6 ><font color="#AAA">method </font>fetchThumbnail</h6></div>

~~~java
 void fetchThumbnail(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Fetches this media's thumbnail with a resolution (99 x 99) from the SD card. This method can be used to fetch either a photo or a video, where the first frame of the video is the thumbnail that is fetched. It is not available if the media type is Panorama. <br><br> Precondition:<br> The camera mode is MediaDownload mode. <br><br> Post Condition:<br> This method will start to download the media thumbnail in the SD card. The content can be videos or images.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The <code>completion callback</code> with the returned execution result.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djimediamanager_djimediafileliststate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djimediafileliststate_inline">FileListState</a></div></div><div class="inline-doc" id="djimediamanager_djimediafileliststate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FileListState</h6></div>

~~~java
 enum FileListState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">States of the file list in <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager">MediaManager</a></code>.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djimediamanager_djimediafileliststate_uptodate_inline"></a>UP_TO_DATE</td><td><font color="#666">The file list is up-to-date: it is synchronized with the SD card in the aircraft.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimediamanager_djimediafileliststate_incomplete_inline"></a>INCOMPLETE</td><td><font color="#666">New files have been generated since the last call of <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_refreshfilelistofstoragelocation">refreshFileListOfStorageLocation</a></code>. Calling <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_refreshfilelistofstoragelocation">refreshFileListOfStorageLocation</a></code> can synchronize the newly generated files and append them to the end of the file list.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimediamanager_djimediafileliststate_reset_inline"></a>RESET</td><td><font color="#666">The file list is reset. The file list will be reset in one of the following cases: <br> - Camera is disconnected. <br> - SD card is formatted. <br> - SD card is not inserted. <br> - Error occurs when deleting files from SD card. <br> In this state, <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_sdcardfilelistsnapshot">getSDCardFileListSnapshot</a></code> will return <code>null</code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimediamanager_djimediafileliststate_deleting_inline"></a>DELETING</td><td><font color="#666"><code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager_deletefiles">deleteFiles</a></code> has been called and the operation is still in progress.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimediamanager_djimediafileliststate_renaming_inline"></a>RENAMING</td><td><font color="#666">A renaming operation is in progress.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimediamanager_djimediafileliststate_syncing_inline"></a>SYNCING</td><td><font color="#666">The media manager is synchronizing the file list from the SD card.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimediamanager_djimediafileliststate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djimediamanager_fetchmediataskscheduler"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJIMediaManager_FetchMediaTaskScheduler.html">FetchMediaTaskScheduler</a></div></div><div class="api-row" id="djimediamanager_updatevideoplaybackstatecallbackinterface"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJIMediaManager_updateVideoPlaybackStateCallbackInterface.html">VideoPlaybackStateListener</a></div></div><div class="api-row" id="djimediamanager_cameradownloadlistenerinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJIMediaManager_CameraDownloadListenerInterface.html">DownloadListener<E></a></div></div><div class="api-row" id="djimediamanager_fileliststatelistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJIMediaManager_FileListStateListener.html">FileListStateListener</a></div></div><div class="api-row" id="djimediamanager_djimedia"><div class="api-col left">Media</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJIMediaManager_DJIMedia.html">MediaFile</a></div></div><div class="api-row" id="djimediamanager_videoplayback_djimediavideoplaybackstate"><div class="api-col left">Video Playback</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJIMediaManager_VideoPlayback_DJIMediaVideoPlaybackState.html">VideoPlaybackState</a></div></div>
