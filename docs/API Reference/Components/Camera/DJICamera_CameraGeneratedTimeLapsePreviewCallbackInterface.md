<div class="article"><h1 ><font color="#AAA">class </font>TimeLapsePreviewCallback</h1></div>

~~~java
 interface TimeLapsePreviewCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Tells the callback that a preview image for the Time-lapse is generated. This method is available only when isTimeLapseSupported returns TRUE.



##### Class Members:



#### Callback Method

<div class="api-row" id="djicamera_didgeneratetimelapsepreview"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_didgeneratetimelapsepreview_inline">onGenerate</a></div></div><div class="inline-doc" id="djicamera_didgeneratetimelapsepreview_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onGenerate</h6></div>

~~~java
        void onGenerate(@NonNull Bitmap previewImage)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Called when a time-lapse preview image has been generated. This method is only available on Osmo with firmware version v1.5.2.0 or above.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull Bitmap <font color="#000">previewImage</td><td><font color="#666"><i>The new generated preview image.</i></td></tr></table></html></div>


