<div class="article"><h1 ><font color="#AAA">class </font>Callback</h1></div>

~~~java
 interface Callback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">This interface provides general information and current status of the SSD.



##### Class Members:



#### Callback Method

<div class="api-row" id="djicamera_didupdatessdstate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_didupdatessdstate_inline">onUpdate</a></div></div><div class="inline-doc" id="djicamera_didupdatessdstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
        void onUpdate(@NonNull SSDState state)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Called when the camera's SSD state has been updated. This method is available only when <code><a href="/Components/Camera/DJICamera.html#djicamera_isssdsupported">isSSDSupported</a></code> is <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSSDState.html#djicamera_djicamerassdstate">SSDState</a> <font color="#000">state</td><td><font color="#666"><i>The SSD's information.</i></td></tr></table></html></div>


