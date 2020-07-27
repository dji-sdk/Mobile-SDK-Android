<div class="article"><h1 ><font color="#AAA">class </font>CompletionCallback<T</h1></div>

~~~java
 interface CompletionCallback<T extends DJIError> 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.util</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>DJIError></code></td></tr></table></html>



##### Description:



<font color="#666">Completion callback for asynchronous operations when no information needs to be returned from the operation.



##### Class Members:



#### Callback Interfaces

<div class="api-row" id="djicommoncallbacks_completioncallback_interface_onresult"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicommoncallbacks_completioncallback_interface_onresult_inline">onResult</a></div></div><div class="inline-doc" id="djicommoncallbacks_completioncallback_interface_onresult_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onResult</h6></div>

~~~java
 void onResult(T error)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.util</td></tr></table></html>



##### Description:



<font color="#666">Invoked when the asynchronous operation completes. If the operation  completes successfully, <code>error</code> will be <code>null</code>. Override to handle in your own code.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">T <font color="#000">error</td><td><font color="#666"><i>The DJI error result</i></td></tr></table></html></div>


