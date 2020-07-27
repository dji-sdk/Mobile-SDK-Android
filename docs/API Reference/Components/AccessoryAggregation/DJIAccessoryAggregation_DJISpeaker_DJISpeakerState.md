<div class="article"><h1 ><font color="#AAA">class </font>SpeakerState</h1></div>

~~~java
 final class SpeakerState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.accessory</td></tr></table></html>



##### Description:



<font color="#666">State of the speaker accessory.



##### Class Members:

<div class="api-row" id="djiaccessoryaggregation_djispeaker_djispeakerstate_volume"><div class="api-col left">Volume</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_djispeakerstate_volume_inline">getVolume</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_djispeakerstate_volume_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVolume</h6></div>

~~~java
 int getVolume() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.accessory</td></tr></table></html>



##### Description:



<font color="#666">The volume of the speaker to play audio.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_djispeakerstate_playingstate"><div class="api-col left">Playing State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_djispeakerstate_playingstate_inline">getPlayingState</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_djispeakerstate_playingstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPlayingState</h6></div>

~~~java
 SettingsDefinitions.SpeakerPlayingState getPlayingState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.accessory</td></tr></table></html>



##### Description:



<font color="#666">Get the audio playing state.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker.html#djiaccessoryaggregation_djispeaker_djispeakerplayingstate">SpeakerPlayingState</a></td><td><font color="#666"><i>An enum value of the <code><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker.html#djiaccessoryaggregation_djispeaker_djispeakerplayingstate">SpeakerPlayingState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_djispeakerstate_playingmode"><div class="api-col left">Playing Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_djispeakerstate_playingmode_inline">getPlayingMode</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_djispeakerstate_playingmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPlayingMode</h6></div>

~~~java
 SettingsDefinitions.PlayMode getPlayingMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.accessory</td></tr></table></html>



##### Description:



<font color="#666">The playing mode of the speaker.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker.html#djiaccessoryaggregation_djispeaker_djispeakerplaymode">PlayMode</a></td><td><font color="#666"><i>An enum value of the <code><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker.html#djiaccessoryaggregation_djispeaker_djispeakerplaymode">PlayMode</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_djispeakerstate_playingindex"><div class="api-col left">Playing Index</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_djispeakerstate_playingindex_inline">getPlayingIndex</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_djispeakerstate_playingindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPlayingIndex</h6></div>

~~~java
 int getPlayingIndex() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.accessory</td></tr></table></html>



##### Description:



<font color="#666">The index of the audio media file being played. If the speaker is not  playing any files, -1 will be returned.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_djispeakerstate_audiostoragelocation"><div class="api-col left">Audio Storage Location</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_djispeakerstate_audiostoragelocation_inline">getStorageLocation</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_djispeakerstate_audiostoragelocation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getStorageLocation</h6></div>

~~~java
 SettingsDefinitions.AudioStorageLocation getStorageLocation() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.accessory</td></tr></table></html>



##### Description:



<font color="#666">The storage location of the file that is being played by the speaker.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJIMediaManager_DJIMedia_DJIMediaFile.html#djimediamanager_djimedia_djimediafile_djiaudiostoragelocation">AudioStorageLocation</a></td><td><font color="#666"><i>An enum value of the <code><a href="/Components/Camera/DJIMediaManager_DJIMedia_DJIMediaFile.html#djimediamanager_djimedia_djimediafile_djiaudiostoragelocation">AudioStorageLocation</a></code>.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiaccessoryaggregation_djispeaker_djispeakerstate_callbackinterface"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker_DJISpeakerState_CallbackInterface.html">Callback</a></div></div>
