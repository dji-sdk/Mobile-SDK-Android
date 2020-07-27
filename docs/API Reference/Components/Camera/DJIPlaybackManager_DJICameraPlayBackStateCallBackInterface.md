<div class="article"><h1 ><font color="#AAA">class </font>CallBack</h1></div>

~~~java
 interface CallBack 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The interface provides the method to receive the updated state of the playback manager.



##### Class Members:



#### Callback Method

<div class="api-row" id="djiplaybackmanager_updateplaybackstate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_updateplaybackstate_inline">onUpdate</a></div></div><div class="inline-doc" id="djiplaybackmanager_updateplaybackstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
 void onUpdate(PlaybackState state)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Updates the playback state of the camera. This update method will only be called when the camera's work mode is  set to <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode_djicameramodeplayback">PLAYBACK</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIPlaybackManager_DJICameraPlaybackState.html#djiplaybackmanager_djicameraplaybackstate">PlaybackState</a> <font color="#000">state</td><td><font color="#666"><i>Contains the state information when the camera in the playback state, such as numbers of photos in the SD card, numbers of videos in the SD card and the media file type.</i></td></tr></table></html></div>


