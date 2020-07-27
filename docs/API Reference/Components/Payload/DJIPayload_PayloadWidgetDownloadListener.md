<div class="article"><h1 ><font color="#AAA">class </font>PayloadWidgetDownloadListener</h1></div>

~~~java
 interface PayloadWidgetDownloadListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.payload</td></tr></table></html>



##### Description:



<font color="#666">Payload widget Download listener.



##### Class Members:



#### Callback Method

<div class="api-row" id="djipayload_payloadwidgetdownloadlistener_onprogress"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_payloadwidgetdownloadlistener_onprogress_inline">onProgress</a></div></div><div class="inline-doc" id="djipayload_payloadwidgetdownloadlistener_onprogress_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onProgress</h6></div>

~~~java
 void onProgress(int process)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.payload</td></tr></table></html>



##### Description:



<font color="#666">Called when fetching widget data is in progress.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">process</td><td><font color="#666"><i>The value is from 0 to 100.</i></td></tr></table></html></div>

<div class="api-row" id="djipayload_payloadwidgetdownloadlistener_onsuccess"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_payloadwidgetdownloadlistener_onsuccess_inline">onSuccess</a></div></div><div class="inline-doc" id="djipayload_payloadwidgetdownloadlistener_onsuccess_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onSuccess</h6></div>

~~~java
 void onSuccess()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.payload</td></tr></table></html>



##### Description:



<font color="#666">Called when fetching widget data successful.

</div>

<div class="api-row" id="djipayload_payloadwidgetdownloadlistener_onfailure"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipayload_payloadwidgetdownloadlistener_onfailure_inline">onFailure</a></div></div><div class="inline-doc" id="djipayload_payloadwidgetdownloadlistener_onfailure_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onFailure</h6></div>

~~~java
 void onFailure(DJIError error)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.payload</td></tr></table></html>



##### Description:



<font color="#666">Called when the payload file download failed.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a> <font color="#000">error</td><td><font color="#666"><i>The error information.</i></td></tr></table></html></div>


