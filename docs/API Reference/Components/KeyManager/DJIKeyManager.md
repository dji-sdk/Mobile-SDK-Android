<div class="article"><h1 ><font color="#AAA">class </font>KeyManager</h1></div>

~~~java
 class KeyManager 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666"><code><a href="/Components/KeyManager/DJIKeyManager.html#djikeymanager">KeyManager</a></code> provides access to the keyed interface using <code><a href="/Components/KeyManager/DJIKey.html#djikey">DJIKey</a></code> and corresponding subclass objects. <code><a href="/Components/KeyManager/DJIKeyManager.html#djikeymanager">KeyManager</a></code> is accessed from <code><a href="/Components/SDKManager/DJISDKManager.html#djisdkmanager_keymanager">getKeyManager</a></code> in <code><a href="/Components/SDKManager/DJISDKManager.html#djisdkmanager">DJISDKManager</a></code>.



##### Class Members:

<div class="api-row" id="djikeymanager_getvalueforkey"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djikeymanager_getvalueforkey_inline">getValue</a></div></div><div class="inline-doc" id="djikeymanager_getvalueforkey_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getValue</h6></div>

~~~java
 @Nullable Object getValue(@NonNull DJIKey key) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Returns the latest known value if available for the key.  Does not pull it from the product if unavailable.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/KeyManager/DJIKey.html#djikey">DJIKey</a> <font color="#000">key</td><td><font color="#666"><i>An instance of <code><a href="/Components/KeyManager/DJIKey.html#djikey">DJIKey</a></code>.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable Object</td><td><font color="#666"><i>The value associated with the key.</i></td></tr></table></html></div>

<div class="api-row" id="djikeymanager_getvalueforkeywithcompletion"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djikeymanager_getvalueforkeywithcompletion_inline">getValue</a></div></div><div class="inline-doc" id="djikeymanager_getvalueforkeywithcompletion_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getValue</h6></div>

~~~java
 void getValue(@NonNull DJIKey key, @NonNull final GetCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Performs a get on a gettable key, pulling the information from the product if necessary.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/KeyManager/DJIKey.html#djikey">DJIKey</a> <font color="#000">key</td><td><font color="#666"><i>A valid gettable key</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Components/KeyManager/DJIKeyManager_GetCallback_Interface.html#djikeymanager_getcallback_interface">GetCallback</a> <font color="#000">callback</td><td><font color="#666"><i>A valid get callback.</i></td></tr></table></html></div>

<div class="api-row" id="djikeymanager_setvalueforkeywithcompletion"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djikeymanager_setvalueforkeywithcompletion_inline">setValue</a></div></div><div class="inline-doc" id="djikeymanager_setvalueforkeywithcompletion_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setValue</h6></div>

~~~java
 void setValue(@NonNull DJIKey key, @NonNull Object value, @Nullable final SetCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Performs a set on a settable key, changing attributes on the  connected product.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull Object <font color="#000">value</td><td><font color="#666"><i>A value object relevant to the given key</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/KeyManager/DJIKey.html#djikey">DJIKey</a> <font color="#000">key</td><td><font color="#666"><i>A valid settable key</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Components/KeyManager/DJIKeyManager_SetCallback_Interface.html#djikeymanager_setcallback_interface">SetCallback</a> <font color="#000">callback</td><td><font color="#666"><i>A set callback.</i></td></tr></table></html></div>

<div class="api-row" id="djikeymanager_performactionforkeywithargumentsandcompletion"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djikeymanager_performactionforkeywithargumentsandcompletion_inline">performAction</a></div></div><div class="inline-doc" id="djikeymanager_performactionforkeywithargumentsandcompletion_inline"

><div class="article"><h6 ><font color="#AAA">method </font>performAction</h6></div>

~~~java
 void performAction(@NonNull DJIKey key, @Nullable final ActionCallback callback, final Object... arguments) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Performs an action on an actionable key.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/KeyManager/DJIKey.html#djikey">DJIKey</a> <font color="#000">key</td><td><font color="#666"><i>A valid actionable key</i></td></tr><tr valign="top"><td><font color="#70BF41">final Object... <font color="#000">arguments</td><td><font color="#666"><i>Optional arguments relevant to the specific key</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Components/KeyManager/DJIKeyManager_ActionCallback_Interface.html#djikeymanager_actioncallback_interface">ActionCallback</a> <font color="#000">callback</td><td><font color="#666"><i>An action callback.</i></td></tr></table></html></div>

<div class="api-row" id="djikeymanager_startlisteningforchangesonkeuywithlistenerandupdateblock"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djikeymanager_startlisteningforchangesonkeuywithlistenerandupdateblock_inline">addListener</a></div></div><div class="inline-doc" id="djikeymanager_startlisteningforchangesonkeuywithlistenerandupdateblock_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addListener</h6></div>

~~~java
 void addListener(@NonNull DJIKey key, @NonNull final KeyListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Subscribes the listener object to all changes of value on the given  key.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/KeyManager/DJIKey.html#djikey">DJIKey</a> <font color="#000">key</td><td><font color="#666"><i>A valid value-based key (get, set and/or action)</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Components/KeyManager/DJIKeyManager_DJIKeyedListenerUpdateBlock.html#djikeymanager_djikeyedlistenerupdateblock">KeyListener</a> <font color="#000">listener</td><td><font color="#666"><i>A valid object to hold the subscription</i></td></tr></table></html></div>

<div class="api-row" id="djikeymanager_stoplisteningonkeyoflistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djikeymanager_stoplisteningonkeyoflistener_inline">removeListener</a></div></div><div class="inline-doc" id="djikeymanager_stoplisteningonkeyoflistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeListener</h6></div>

~~~java
 void removeListener(@NonNull final KeyListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Stops the subscription to updates of a specific key value for a  specific listener. Does not affect other listeners subscribing to  this key or other subscriptions of the <code>listener</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Components/KeyManager/DJIKeyManager_DJIKeyedListenerUpdateBlock.html#djikeymanager_djikeyedlistenerupdateblock">KeyListener</a> <font color="#000">listener</td><td><font color="#666"><i>The listener object passed at the moment of calling startListening.</i></td></tr></table></html></div>

<div class="api-row" id="djikeymanager_iskeysupported"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djikeymanager_iskeysupported_inline">isKeySupported</a></div></div><div class="inline-doc" id="djikeymanager_iskeysupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isKeySupported</h6></div>

~~~java
 boolean isKeySupported(@NonNull DJIKey key) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Determines if a key is supported by the connected product.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/KeyManager/DJIKey.html#djikey">DJIKey</a> <font color="#000">key</td><td><font color="#666"><i>Key to be check on current product.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the key is supported.</i></td></tr></table></html></div>

<div class="api-row" id="djikeymanager_removekey"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djikeymanager_removekey_inline">removeKey</a></div></div><div class="inline-doc" id="djikeymanager_removekey_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeKey</h6></div>

~~~java
 void removeKey(DJIKey key) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Remove a key's cache value.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/KeyManager/DJIKey.html#djikey">DJIKey</a> <font color="#000">key</td><td><font color="#666"><i>Key to be removed on current product.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djikey"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/KeyManager/DJIKey.html">DJIKey</a></div></div><div class="api-row" id="djikeymanager_getcallback_interface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/KeyManager/DJIKeyManager_GetCallback_Interface.html">GetCallback</a></div></div><div class="api-row" id="djikeymanager_setcallback_interface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/KeyManager/DJIKeyManager_SetCallback_Interface.html">SetCallback</a></div></div><div class="api-row" id="djikeymanager_actioncallback_interface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/KeyManager/DJIKeyManager_ActionCallback_Interface.html">ActionCallback</a></div></div><div class="api-row" id="djikeymanager_djikeyedlistenerupdateblock"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/KeyManager/DJIKeyManager_DJIKeyedListenerUpdateBlock.html">KeyListener</a></div></div>
