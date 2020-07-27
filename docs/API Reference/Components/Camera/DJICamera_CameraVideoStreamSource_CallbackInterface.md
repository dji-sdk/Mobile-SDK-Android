<div class="article"><h1 ><font color="#AAA">class </font>Callback</h1></div>

~~~java
 interface Callback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">When the video stream source has been changed, the interface will invoke  the <code><a href="/Components/Camera/DJICamera_CameraVideoStreamSource_CallbackInterface.html#djicamera_cameravideostreamsource_callbackinterface_onupdate">onUpdate</a></code> method to notify all subscribers to update.



##### Class Members:



#### Callback Method

<div class="api-row" id="djicamera_cameravideostreamsource_callbackinterface_onupdate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_cameravideostreamsource_callbackinterface_onupdate_inline">onUpdate</a></div></div><div class="inline-doc" id="djicamera_cameravideostreamsource_callbackinterface_onupdate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
        void onUpdate(CameraVideoStreamSource streamSource)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">When the video stream source has been changed, the method will be invoked.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera.html#djicamera_djicameravideostreamsource">CameraVideoStreamSource</a> <font color="#000">streamSource</td><td><font color="#666"><i>An object of <code><a href="/Components/Camera/DJICamera.html#djicamera_djicameravideostreamsource">CameraVideoStreamSource</a></code>.</i></td></tr></table></html></div>


