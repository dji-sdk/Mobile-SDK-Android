<div class="article"><h1 ><font color="#AAA">class </font>AudioFileInfo</h1></div>

~~~java
 class AudioFileInfo 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">The class contains the basic information of an audio file.



##### Class Members:

<div class="api-row" id="djiaccessoryaggregation_djispeaker_djiaudiofileinfo_constructor"><div class="api-col left">Constructor</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_djiaudiofileinfo_constructor_inline">AudioFileInfo</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_djiaudiofileinfo_constructor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>AudioFileInfo</h6></div>

~~~java
 AudioFileInfo(String fileName, SettingsDefinitions.AudioStorageLocation storageLocation) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">Creates an <code><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker_DJIAudioFileInfo.html#djiaccessoryaggregation_djispeaker_djiaudiofileinfo">AudioFileInfo</a></code> instance with a file name and the  storage location on the aircraft.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String <font color="#000">fileName</td><td><font color="#666"><i>The file name of the file. It will be used by the aircraft to store the file  after it is successfully transmitted. A file name should not exceed 20 characters.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJIMediaManager_DJIMedia_DJIMediaFile.html#djimediamanager_djimedia_djimediafile_djiaudiostoragelocation">AudioStorageLocation</a> <font color="#000">storageLocation</td><td><font color="#666"><i>The storage location of the file. The aircraft will use it to determine where  to store the file.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_djiaudiofileinfo_filename"><div class="api-col left">File Name</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_djiaudiofileinfo_filename_inline">getFileName</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_djiaudiofileinfo_filename_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFileName</h6></div>

~~~java
 String getFileName() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">The file name of the audio file. The aircraft will store the audio file with this file name.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>A String value.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessoryaggregation_djispeaker_djiaudiofileinfo_storagelocation"><div class="api-col left">Storage Location</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispeaker_djiaudiofileinfo_storagelocation_inline">getStorageLocation</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispeaker_djiaudiofileinfo_storagelocation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getStorageLocation</h6></div>

~~~java
 SettingsDefinitions.AudioStorageLocation getStorageLocation() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.speaker</td></tr></table></html>



##### Description:



<font color="#666">The storage type of the audio file. The storage types will determine the strategy of  the aircraft to keep the file.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJIMediaManager_DJIMedia_DJIMediaFile.html#djimediamanager_djimedia_djimediafile_djiaudiostoragelocation">AudioStorageLocation</a></td><td><font color="#666"><i>An enum value of the <code><a href="/Components/Camera/DJIMediaManager_DJIMedia_DJIMediaFile.html#djimediamanager_djimedia_djimediafile_djiaudiostoragelocation">AudioStorageLocation</a></code>.</i></td></tr></table></html></div>


