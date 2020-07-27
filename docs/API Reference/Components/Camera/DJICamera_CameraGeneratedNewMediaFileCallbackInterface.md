<div class="article"><h1 ><font color="#AAA">class </font>Callback</h1></div>

~~~java
 interface Callback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Tells that a new media file (photo or video) is generated.



##### Class Members:



#### Callback Method

<div class="api-row" id="djicamera_didgeneratenewmediafile"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_didgeneratenewmediafile_inline">onNewFile</a></div></div><div class="inline-doc" id="djicamera_didgeneratenewmediafile_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onNewFile</h6></div>

~~~java
 void onNewFile(@NonNull MediaFile mediaFile)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Called when a new media file (photo or video) has been generated. <br> In this callback method, the <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia">MediaFile</a></code> instance properties  <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_durationinseconds">getDurationInSeconds</a></code> and <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_videoorientation">getVideoOrientation</a></code> require special consideration.  The thumbnail property normally has a pointer to a UIImage of the thumbnail, but this is only available when the camera is in <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode_djicameramodemediadownload">MEDIA_DOWNLOAD</a></code> work mode. Additionally, for this instance of <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia">MediaFile</a></code>, the <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_durationinseconds">getDurationInSeconds</a></code> property is 0 and the <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_videoorientation">getVideoOrientation</a></code> property is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraorientation_landscape">LANDSCAPE</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia">MediaFile</a> <font color="#000">mediaFile</td><td><font color="#666"><i>The new media file.</i></td></tr></table></html></div>


