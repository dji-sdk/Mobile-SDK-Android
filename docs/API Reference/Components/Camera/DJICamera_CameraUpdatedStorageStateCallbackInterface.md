<div class="article"><h1 ><font color="#AAA">class </font>Callback</h1></div>

~~~java
 interface Callback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">This interface provides general information and current statuses on the storage.



##### Class Members:



#### Callback Method

<div class="api-row" id="djicamera_didupdatestoragestate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_didupdatestoragestate_inline">onUpdate</a></div></div><div class="inline-doc" id="djicamera_didupdatestoragestate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
        void onUpdate(@NonNull StorageState state)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Called when the camera's storage state has been updated. Use <code><a href="/Components/Camera/DJICamera_DJICameraSDCardState.html#djicamera_djicamerasdcardstate">StorageState</a></code>'s <code><a href="/Components/Camera/DJICamera_DJICameraSDCardState.html#djicamera_djicamerasdcardstate_location">getStorageLocation</a></code> to determine if the updated state is for SD card or the internal storage.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSDCardState.html#djicamera_djicamerasdcardstate">StorageState</a> <font color="#000">state</td><td><font color="#666"><i>The camera storage state. If the camera supports internal storage (e.g. Mavic Air),
  use <code><a href="/Components/Camera/DJICamera_DJICameraSDCardState.html#djicamera_djicamerasdcardstate_location">getStorageLocation</a></code> to determine whether the state is
  for SD card or internal storage.</i></td></tr></table></html></div>


