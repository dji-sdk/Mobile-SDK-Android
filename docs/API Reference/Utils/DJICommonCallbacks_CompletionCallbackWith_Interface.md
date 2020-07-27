<div class="article"><h1 ><font color="#AAA">class </font>CompletionCallbackWith<T></h1></div>

~~~java
 interface CompletionCallbackWith<T> 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.util</td></tr></table></html>



##### Description:



<font color="#666">Completion callback for asynchronous operations when information that requires one parameter (T) needs to be returned from the operation. The parameter T will be defined where the operation called.



##### Class Members:



#### Callback Interfaces

<div class="api-row" id="djicommoncallbacks_completioncallbackwith_interface_onsuccess"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicommoncallbacks_completioncallbackwith_interface_onsuccess_inline">onSuccess</a></div></div><div class="inline-doc" id="djicommoncallbacks_completioncallbackwith_interface_onsuccess_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onSuccess</h6></div>

~~~java
 void onSuccess(T t)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.util</td></tr></table></html>



##### Description:



<font color="#666">Invoked when the asynchronous operation completes successfully. Override to handle in your own code.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">T <font color="#000">t</td><td><font color="#666"><i>The parameter being returned.</i></td></tr></table></html></div>

<div class="api-row" id="djicommoncallbacks_completioncallbackwith_interface_onfailure"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicommoncallbacks_completioncallbackwith_interface_onfailure_inline">onFailure</a></div></div><div class="inline-doc" id="djicommoncallbacks_completioncallbackwith_interface_onfailure_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onFailure</h6></div>

~~~java
 void onFailure(DJIError error)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.util</td></tr></table></html>



##### Description:



<font color="#666">Invoked when the asynchronous operation fails to complete normally. Override to handle in your own code.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a> <font color="#000">error</td><td><font color="#666"><i>The DJI error result</i></td></tr></table></html></div>


