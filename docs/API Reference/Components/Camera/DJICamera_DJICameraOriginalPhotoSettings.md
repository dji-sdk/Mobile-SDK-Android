<div class="article"><h1 ><font color="#AAA">class </font>OriginalPhotoSettings</h1></div>

~~~java
 class OriginalPhotoSettings 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Settings to determine the behavior for the original photos created when doing composite shooting (e.g. panorama).



##### Class Members:

<div class="api-row" id="djicamera_djicameraoriginalphotosettings_shouldsaveoriginalphotos"><div class="api-col left">Save Photos</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraoriginalphotosettings_shouldsaveoriginalphotos_inline">shouldSaveOriginalPhotos</a></div></div><div class="inline-doc" id="djicamera_djicameraoriginalphotosettings_shouldsaveoriginalphotos_inline"

><div class="article"><h6 ><font color="#AAA">method </font>shouldSaveOriginalPhotos</h6></div>

~~~java
 boolean shouldSaveOriginalPhotos() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the camera should save the original photos.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the camera should save the original photos.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameraoriginalphotosettings_format"><div class="api-col left">Photo Format</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraoriginalphotosettings_format_inline">getFormat</a></div></div><div class="inline-doc" id="djicamera_djicameraoriginalphotosettings_format_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFormat</h6></div>

~~~java
 SettingsDefinitions.PhotoFileFormat getFormat() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The format for the original photos if the user decides to save them. Mavic Air cannot change this  setting and it will ignore this property.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotofileformat">PhotoFileFormat</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotofileformat">PhotoFileFormat</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameraoriginalphotosettings_constructor"><div class="api-col left">Constructor</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraoriginalphotosettings_constructor_inline">OriginalPhotoSettings</a></div></div><div class="inline-doc" id="djicamera_djicameraoriginalphotosettings_constructor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>OriginalPhotoSettings</h6></div>

~~~java
 OriginalPhotoSettings(boolean shouldSaveOriginalPhotos) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Creates an instance of the configuration to decide whether or not to save the original photos or  not. <code><a href="/Components/Camera/DJICamera_DJICameraOriginalPhotoSettings.html#djicamera_djicameraoriginalphotosettings_format">getFormat</a></code> will be <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotofileformat_jpeg">JPEG</a></code>.  Use this constructor for Mavic Air.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">shouldSaveOriginalPhotos</td><td><font color="#666"><i><code>true</code> to save the original photos.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameraoriginalphotosettings_constructorwithformat"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraoriginalphotosettings_constructorwithformat_inline">OriginalPhotoSettings</a></div></div><div class="inline-doc" id="djicamera_djicameraoriginalphotosettings_constructorwithformat_inline"

><div class="article"><h6 ><font color="#AAA">method </font>OriginalPhotoSettings</h6></div>

~~~java
 OriginalPhotoSettings(boolean shouldSaveOriginalPhotos,
                                 SettingsDefinitions.PhotoFileFormat format) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Creates an instance of the configuration to decide whether or not to save the original photos and the format in which to save them.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">shouldSaveOriginalPhotos</td><td><font color="#666"><i><code>true</code> to save the original photos.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotofileformat">PhotoFileFormat</a> <font color="#000">format</td><td><font color="#666"><i>The format to save the original photos.</i></td></tr></table></html></div>


