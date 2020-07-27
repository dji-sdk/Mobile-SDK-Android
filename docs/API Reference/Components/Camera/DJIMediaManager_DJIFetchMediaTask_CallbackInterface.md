<div class="article"><h1 ><font color="#AAA">class </font>Callback</h1></div>

~~~java
 interface Callback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Callback that is called when the scheduler finishes downloading content for a fetch media file task. If multiple content types are defined for a file, this completion block will be called at the completion of each content type being downloaded. The order content types will be downloaded in is first <code><a href="/Components/Camera/DJIMediaManager_DJIFetchMediaTask.html#djimediamanager_djifetchmediataskcontent_thumbnail">THUMBNAIL</a></code>, then <code><a href="/Components/Camera/DJIMediaManager_DJIFetchMediaTask.html#djimediamanager_djifetchmediataskcontent_preview">PREVIEW</a></code>.



##### Class Members:



#### Callback Method

<div class="api-row" id="djimediamanager_djifetchmediatask_callback"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_djifetchmediatask_callback_inline">onUpdate</a></div></div><div class="inline-doc" id="djimediamanager_djifetchmediatask_callback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
        void onUpdate(MediaFile file, FetchMediaTaskContent option, DJIError error)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Called each time the scheduler finishes downloading content.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia">MediaFile</a> <font color="#000">file</td><td><font color="#666"><i>file to execute task on.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIMediaManager_DJIFetchMediaTask.html#djimediamanager_djifetchmediataskcontent">FetchMediaTaskContent</a> <font color="#000">option</td><td><font color="#666"><i>An enum value of <code><a href="/Components/Camera/DJIMediaManager_DJIFetchMediaTask.html#djimediamanager_djifetchmediataskcontent">FetchMediaTaskContent</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a> <font color="#000">error</td><td><font color="#666"><i>Error retrieving the value.</i></td></tr></table></html></div>


