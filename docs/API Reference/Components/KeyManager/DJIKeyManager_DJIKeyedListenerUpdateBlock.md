<div class="article"><h1 ><font color="#AAA">class </font>KeyListener</h1></div>

~~~java
 interface KeyListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk.callback</td></tr></table></html>



##### Description:



<font color="#666">Interface to check if the value behind a key is updated.



##### Class Members:

<div class="api-row" id="djikeymanager_keylistener_interface_onvaluechange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djikeymanager_keylistener_interface_onvaluechange_inline">onValueChange</a></div></div><div class="inline-doc" id="djikeymanager_keylistener_interface_onvaluechange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onValueChange</h6></div>

~~~java
    void onValueChange(@Nullable Object oldValue, @Nullable Object newValue)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk.callback</td></tr></table></html>



##### Description:



<font color="#666">The callback, called every time the value behind a key is updated.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable Object <font color="#000">oldValue</td><td><font color="#666"><i>The old value. <code>null</code> if no value was present before.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable Object <font color="#000">newValue</td><td><font color="#666"><i>The new value. <code>null</code> if the stored values are being flushed.</i></td></tr></table></html></div>


