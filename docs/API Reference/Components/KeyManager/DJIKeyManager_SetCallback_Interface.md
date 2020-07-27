<div class="article"><h1 ><font color="#AAA">class </font>SetCallback</h1></div>

~~~java
 interface SetCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk.callback</td></tr></table></html>



##### Description:



<font color="#666">Callback called when performing a set on a key.



##### Class Members:



##### Related:

<div class="api-row" id="djikeymanager_setcallback_interface_onsuccess"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djikeymanager_setcallback_interface_onsuccess_inline">onSuccess</a></div></div><div class="inline-doc" id="djikeymanager_setcallback_interface_onsuccess_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onSuccess</h6></div>

~~~java
    void onSuccess()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk.callback</td></tr></table></html>



##### Description:



<font color="#666">Invoked when setting process is done successfully.

</div>

<div class="api-row" id="djikeymanager_setcallback_interface_onfailure"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djikeymanager_setcallback_interface_onfailure_inline">onFailure</a></div></div><div class="inline-doc" id="djikeymanager_setcallback_interface_onfailure_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onFailure</h6></div>

~~~java
    void onFailure(@NonNull DJIError error)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk.callback</td></tr></table></html>



##### Description:



<font color="#666">Invoked when setting process has failed.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a> <font color="#000">error</td><td><font color="#666"><i>The error that occurred.</i></td></tr></table></html></div>


