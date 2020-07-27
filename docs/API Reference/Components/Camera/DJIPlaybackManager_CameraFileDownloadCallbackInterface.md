<div class="article"><h1 ><font color="#AAA">class </font>FileDownloadCallback</h1></div>

~~~java
 interface FileDownloadCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">This callback will notify the process of downloading selected files.<br>



##### Class Members:



#### Callback Method

<div class="api-row" id="djiplaybackmanager_camerafiledownloadonstart"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_camerafiledownloadonstart_inline">onStart</a></div></div><div class="inline-doc" id="djiplaybackmanager_camerafiledownloadonstart_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onStart</h6></div>

~~~java
 void onStart()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Called as a file is about to start downloading.

</div>

<div class="api-row" id="djiplaybackmanager_camerafiledownloadonend"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_camerafiledownloadonend_inline">onEnd</a></div></div><div class="inline-doc" id="djiplaybackmanager_camerafiledownloadonend_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onEnd</h6></div>

~~~java
 void onEnd()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Called when a file has completed downloading.

</div>

<div class="api-row" id="djiplaybackmanager_camerafiledownloadonerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_camerafiledownloadonerror_inline">onError</a></div></div><div class="inline-doc" id="djiplaybackmanager_camerafiledownloadonerror_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onError</h6></div>

~~~java
 void onError(Exception exception)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Called when there is an error during download.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Exception <font color="#000">exception</td><td><font color="#666"><i>The error exception.</i></td></tr></table></html></div>

<div class="api-row" id="djiplaybackmanager_camerafiledownloadonprogressupdate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiplaybackmanager_camerafiledownloadonprogressupdate_inline">onProgressUpdate</a></div></div><div class="inline-doc" id="djiplaybackmanager_camerafiledownloadonprogressupdate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onProgressUpdate</h6></div>

~~~java
 void onProgressUpdate(int progress)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Called to update the progress on downloading a file in percent. Range is [0, 100].



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">progress</td><td><font color="#666"><i>The progress of downloading.</i></td></tr></table></html></div>


