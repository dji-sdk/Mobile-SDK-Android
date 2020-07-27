<div class="article"><h1 ><font color="#AAA">class </font>VideoSizeCalculatorUtil</h1></div>

~~~java
 class VideoSizeCalculatorUtil 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.util</td></tr></table></html>



##### Description:



<font color="#666">Utility class for calculating the appropriate size of the video based on screen type and video type  defined by aircraft's mode and resolution settings



##### Class Members:

<div class="api-row" id="djivideosizecalculatorutil_setlistener"><div class="api-col left">Set Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivideosizecalculatorutil_setlistener_inline">setListener</a></div></div><div class="inline-doc" id="djivideosizecalculatorutil_setlistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setListener</h6></div>

~~~java
 void setListener(VideoSizeListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.util</td></tr></table></html>



##### Description:



<font color="#666">Set a listener of the VideoSizeListener interface.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Utils/DJIVideoSizeCalculatorUtil_Interface.html#djivideosizecalculatorutil_interface">VideoSizeListener</a> <font color="#000">listener</td><td><font color="#666"><i>A listener for the VideoSizeListener interface.</i></td></tr></table></html></div>

<div class="api-row" id="djivideosizecalculatorutil_setvideotypebysize"><div class="api-col left">Set Video Type By Size</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivideosizecalculatorutil_setvideotypebysize_inline">setVideoTypeBySize</a></div></div><div class="inline-doc" id="djivideosizecalculatorutil_setvideotypebysize_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setVideoTypeBySize</h6></div>

~~~java
 void setVideoTypeBySize(int videoWidth, int videoHeight, int cameraIndex) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.util</td></tr></table></html>



##### Description:



<font color="#666">Set Video type by video size and camera index.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">videoWidth</td><td><font color="#666"><i>Width of the video as received from the DJICodecManager.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">videoHeight</td><td><font color="#666"><i>Height of the video as received from the DJICodecManager.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">cameraIndex</td><td><font color="#666"><i>Index of the camera which is the source of the video.</i></td></tr></table></html></div>

<div class="api-row" id="djivideosizecalculatorutil_setvideoisrotated"><div class="api-col left">Set Video Is Rotated</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivideosizecalculatorutil_setvideoisrotated_inline">setVideoIsRotated</a></div></div><div class="inline-doc" id="djivideosizecalculatorutil_setvideoisrotated_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setVideoIsRotated</h6></div>

~~~java
 void setVideoIsRotated(boolean isRotated) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.util</td></tr></table></html>



##### Description:



<font color="#666">Set video orientation.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isRotated</td><td><font color="#666"><i><code>true</code> for portrait orientation and False for landscape.</i></td></tr></table></html></div>

<div class="api-row" id="djivideosizecalculatorutil_setscreentypebysize"><div class="api-col left">Set Screen Type By Size</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivideosizecalculatorutil_setscreentypebysize_inline">setScreenTypeBySize</a></div></div><div class="inline-doc" id="djivideosizecalculatorutil_setscreentypebysize_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setScreenTypeBySize</h6></div>

~~~java
 void setScreenTypeBySize(int viewWidth, int viewHeight) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.util</td></tr></table></html>



##### Description:



<font color="#666">Set screen type by screen size using the view width and height.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">viewWidth</td><td><font color="#666"><i>Width of the view in which the video is being displayed.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">viewHeight</td><td><font color="#666"><i>Height of the view in which the video is being displayed.</i></td></tr></table></html></div>

<div class="api-row" id="djivideosizecalculatorutil_calculatevideosize"><div class="api-col left">Calculate Video Size</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivideosizecalculatorutil_calculatevideosize_inline">calculateVideoSize</a></div></div><div class="inline-doc" id="djivideosizecalculatorutil_calculatevideosize_inline"

><div class="article"><h6 ><font color="#AAA">method </font>calculateVideoSize</h6></div>

~~~java
 void calculateVideoSize() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.util</td></tr></table></html>



##### Description:



<font color="#666">Calculate the video size with the set options.

</div>



##### Related:

<div class="api-row" id="djivideosizecalculatorutil_interface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Utils/DJIVideoSizeCalculatorUtil_Interface.html">VideoSizeListener</a></div></div>
