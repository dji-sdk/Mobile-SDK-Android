<div class="article"><h1 ><font color="#AAA">class </font>FetchMediaTask</h1></div>

~~~java
 class FetchMediaTask 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Task to fetch contents of a media file. To make <code><a href="/Components/Camera/DJIMediaManager_FetchMediaTaskScheduler.html#djimediamanager_fetchmediataskscheduler">FetchMediaTaskScheduler</a></code> fetch the thumbnail, preview or custom information of a media file, a task should be created by using <code><a href="/Components/Camera/DJIMediaManager_DJIFetchMediaTask.html#djimediamanager_djifetchmediatask_constructor">FetchMediaTask</a></code>.



##### Class Members:

<div class="api-row" id="djimediamanager_djifetchmediatask_constructor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djifetchmediatask_constructor_inline">FetchMediaTask</a></div></div><div class="inline-doc" id="djimediamanager_djifetchmediatask_constructor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>FetchMediaTask</h6></div>

~~~java
 FetchMediaTask(MediaFile file, FetchMediaTaskContent content, Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Creates a task instance.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia">MediaFile</a> <font color="#000">file</td><td><font color="#666"><i>Media file to execute task on.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIMediaManager_DJIFetchMediaTask.html#djimediamanager_djifetchmediataskcontent">FetchMediaTaskContent</a> <font color="#000">content</td><td><font color="#666"><i>Content to fetch.</i></td></tr><tr valign="top"><td><font color="#70BF41">Callback <font color="#000">callback</td><td><font color="#666"><i>The <code>completion callback</code> with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_djifetchmediatask_constructor2"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djifetchmediatask_constructor2_inline">FetchMediaTask</a></div></div><div class="inline-doc" id="djimediamanager_djifetchmediatask_constructor2_inline"

><div class="article"><h6 ><font color="#AAA">method </font>FetchMediaTask</h6></div>

~~~java
 FetchMediaTask(MediaFile file, FetchMediaTaskContent content) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Creates a task instance without callback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia">MediaFile</a> <font color="#000">file</td><td><font color="#666"><i>Media file to execute task on.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIMediaManager_DJIFetchMediaTask.html#djimediamanager_djifetchmediataskcontent">FetchMediaTaskContent</a> <font color="#000">content</td><td><font color="#666"><i>Content to fetch.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djimediamanager_djifetchmediatask_callbackinterface"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJIMediaManager_DJIFetchMediaTask_CallbackInterface.html">Callback</a></div></div><div class="api-row" id="djimediamanager_djifetchmediataskcontent"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djifetchmediataskcontent_inline">FetchMediaTaskContent</a></div></div><div class="inline-doc" id="djimediamanager_djifetchmediataskcontent_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FetchMediaTaskContent</h6></div>

~~~java
 enum FetchMediaTaskContent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">The content to download in a fetch media file task.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djimediamanager_djifetchmediataskcontent_none_inline"></a>NONE</td><td><font color="#666">None.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimediamanager_djifetchmediataskcontent_thumbnail_inline"></a>THUMBNAIL</td><td><font color="#666">The scheduler will download the thumbnail of the media file.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimediamanager_djifetchmediataskcontent_preview_inline"></a>PREVIEW</td><td><font color="#666">The scheduler will download the preview image of the media file.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimediamanager_djifetchmediataskcontent_custominformation_inline"></a>CUSTOM_INFORMATION</td><td><font color="#666">The scheduler will download the custom information of the media file.</td></tr></table></html>

##### Class Members:

</div>


