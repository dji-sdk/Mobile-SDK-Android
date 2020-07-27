<div class="article"><h1 ><font color="#AAA">class </font>WatermarkSettings</h1></div>

~~~java
 class WatermarkSettings 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The watermark configuration to decide if timestamp and location stamp will be added to photos or videos.



##### Class Members:

<div class="api-row" id="djicamera_djicamerawatermarksettings_constructor"><div class="api-col left">Constructor</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerawatermarksettings_constructor_inline">WatermarkSettings</a></div></div><div class="inline-doc" id="djicamera_djicamerawatermarksettings_constructor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>WatermarkSettings</h6></div>

~~~java
 WatermarkSettings(boolean enabledForVideos, boolean enabledForPhotos) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Creates an instance of the settings to control the watermark on photos and videos.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabledForVideos</td><td><font color="#666"><i><code>true</code> if the watermark (timestamp and location stamp) is enabled for videos.</i></td></tr><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabledForPhotos</td><td><font color="#666"><i><code>true</code> if the watermark (timestamp and location stamp) is enabled for photos.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerawatermarksettings_enabledforphotos"><div class="api-col left">Enabled For Photos</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerawatermarksettings_enabledforphotos_inline">isEnabledForPhotos</a></div></div><div class="inline-doc" id="djicamera_djicamerawatermarksettings_enabledforphotos_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isEnabledForPhotos</h6></div>

~~~java
 boolean isEnabledForPhotos() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the timestamp and the location stamp is added to photos.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the watermark (timestamp and location stamp) is enabled for photos.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerawatermarksettings_enabledforvideos"><div class="api-col left">Enabled For Videos</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerawatermarksettings_enabledforvideos_inline">isEnabledForVideos</a></div></div><div class="inline-doc" id="djicamera_djicamerawatermarksettings_enabledforvideos_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isEnabledForVideos</h6></div>

~~~java
 boolean isEnabledForVideos() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the timestamp and the location stamp is added to videos. The stamps are updated during the videos.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the watermark (timestamp and location stamp) is enabled for videos.</i></td></tr></table></html></div>


