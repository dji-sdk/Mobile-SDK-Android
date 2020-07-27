<div class="article"><h1 ><font color="#AAA">class </font>DownloadListener<E></h1></div>

~~~java
 interface DownloadListener<E> 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">This callback will notify the app when the media download executed.



##### Class Members:



#### Callback Method

<div class="api-row" id="djimediamanager_cameradownloadonstart"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_cameradownloadonstart_inline">onStart</a></div></div><div class="inline-doc" id="djimediamanager_cameradownloadonstart_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onStart</h6></div>

~~~java
 void onStart()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Called when the file download begins.

</div>

<div class="api-row" id="djimediamanager_cameradownloadonrateupdate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_cameradownloadonrateupdate_inline">onRateUpdate</a></div></div><div class="inline-doc" id="djimediamanager_cameradownloadonrateupdate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onRateUpdate</h6></div>

~~~java
 void onRateUpdate(long total, long current, long persize)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Called to show the download rate. It is called every 1 second. Hence, the persize which is the download size among two calls is the download rate.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">long <font color="#000">total</td><td><font color="#666"><i>The total size.</i></td></tr><tr valign="top"><td><font color="#70BF41">long <font color="#000">current</td><td><font color="#666"><i>The current download size.</i></td></tr><tr valign="top"><td><font color="#70BF41">long <font color="#000">persize</td><td><font color="#666"><i>The download size between two calls.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_cameradownloadonprogress"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_cameradownloadonprogress_inline">onProgress</a></div></div><div class="inline-doc" id="djimediamanager_cameradownloadonprogress_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onProgress</h6></div>

~~~java
 void onProgress(long total, long current)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Called to update the download progress. It is called every time there is data received.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">long <font color="#000">total</td><td><font color="#666"><i>The total size of the file being downloaded.</i></td></tr><tr valign="top"><td><font color="#70BF41">long <font color="#000">current</td><td><font color="#666"><i>The current download data size.</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_cameradownloadonsuccess"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_cameradownloadonsuccess_inline">onSuccess</a></div></div><div class="inline-doc" id="djimediamanager_cameradownloadonsuccess_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onSuccess</h6></div>

~~~java
 void onSuccess(E data)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Called when the media download is completed.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">E <font color="#000">data</td><td><font color="#666"><i>The media that was successfully downloaded</i></td></tr></table></html></div>

<div class="api-row" id="djimediamanager_cameradownloadonfailure"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimediamanager_cameradownloadonfailure_inline">onFailure</a></div></div><div class="inline-doc" id="djimediamanager_cameradownloadonfailure_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onFailure</h6></div>

~~~java
 void onFailure(DJIError error)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.media</td></tr></table></html>



##### Description:



<font color="#666">Called when the media download failed.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a> <font color="#000">error</td><td><font color="#666"><i>The error information.</i></td></tr></table></html></div>


