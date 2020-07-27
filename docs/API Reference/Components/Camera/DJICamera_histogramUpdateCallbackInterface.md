<div class="article"><h1 ><font color="#AAA">class </font>HistogramCallback</h1></div>

~~~java
 interface HistogramCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Called whenever the camera histogram's light values change.



##### Class Members:



#### Callback Method

<div class="api-row" id="djicamera_updatehistogramlightvalue"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_updatehistogramlightvalue_inline">onUpdate</a></div></div><div class="inline-doc" id="djicamera_updatehistogramlightvalue_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
 void onUpdate(short[] lightValues)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_histogram_light_values_key">CameraKey.HISTOGRAM_LIGHT_VALUES</a></td></tr></table></html>



##### Description:



<font color="#666">Update the histogram's light values.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">short[] <font color="#000">lightValues</td><td><font color="#666"><i>The histogram's light values.</i></td></tr></table></html></div>


