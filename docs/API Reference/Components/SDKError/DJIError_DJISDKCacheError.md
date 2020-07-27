<div class="article"><h1 ><font color="#AAA">class </font>DJISDKCacheError</h1></div>

~~~java
@EXClassNullAway
 class DJISDKCacheError extends DJIError 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code></td></tr></table></html>



##### Description:



<font color="#666">Class that handles all errors about SDK Cache.



##### Class Members:



##### Related:

<div class="api-row" id="djierror_djisdkcacheerror_key_unsupported"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkcacheerror_key_unsupported_inline">KEY_UNSUPPORTED</a></div></div><div class="inline-doc" id="djierror_djisdkcacheerror_key_unsupported_inline"

><div class="article"><h6 ><font color="#AAA">final </font>KEY_UNSUPPORTED</h6></div>

~~~java
 static final DJISDKCacheError KEY_UNSUPPORTED = new DJISDKCacheError("The feature is unsupported.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The key is not supported.

</div>

<div class="api-row" id="djierror_djisdkcacheerror_invalid_value"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkcacheerror_invalid_value_inline">INVALID_VALUE</a></div></div><div class="inline-doc" id="djierror_djisdkcacheerror_invalid_value_inline"

><div class="article"><h6 ><font color="#AAA">final </font>INVALID_VALUE</h6></div>

~~~java
 static final DJISDKCacheError INVALID_VALUE = new DJISDKCacheError("Received invalid value")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Invalid parameters.<br> This error will be returned when the sent parameters are invalid.<br>

</div>

<div class="api-row" id="djierror_djisdkcacheerror_errorenum_invalidkeyformat"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkcacheerror_errorenum_invalidkeyformat_inline">INVALID_KEY_FORMAT</a></div></div><div class="inline-doc" id="djierror_djisdkcacheerror_errorenum_invalidkeyformat_inline"

><div class="article"><h6 ><font color="#AAA">final </font>INVALID_KEY_FORMAT</h6></div>

~~~java
 static final DJISDKCacheError INVALID_KEY_FORMAT = new DJISDKCacheError("The key does not match the "
                                                                                       + "format: component/index/key with index being a number or *.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The key does not match the format: component/index/key with index being a number or *.

</div>

<div class="api-row" id="djierror_djisdkcacheerror_errorenum_invalidkeyforcomponent"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkcacheerror_errorenum_invalidkeyforcomponent_inline">INVALID_KEY_FOR_COMPONENT</a></div></div><div class="inline-doc" id="djierror_djisdkcacheerror_errorenum_invalidkeyforcomponent_inline"

><div class="article"><h6 ><font color="#AAA">final </font>INVALID_KEY_FOR_COMPONENT</h6></div>

~~~java
 static final DJISDKCacheError INVALID_KEY_FOR_COMPONENT =
        new DJISDKCacheError("Not Support")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The key does not exist in component abstraction.

</div>

<div class="api-row" id="djierror_djisdkcacheerror_errorenum_nogetforkey"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkcacheerror_errorenum_nogetforkey_inline">NO_GET_FOR_KEY</a></div></div><div class="inline-doc" id="djierror_djisdkcacheerror_errorenum_nogetforkey_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NO_GET_FOR_KEY</h6></div>

~~~java
 static final DJISDKCacheError NO_GET_FOR_KEY = new DJISDKCacheError("The feature is not gettable.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The key is not gettable.

</div>

<div class="api-row" id="djierror_djisdkcacheerror_errorenum_nosetforkey"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkcacheerror_errorenum_nosetforkey_inline">NO_SET_FOR_KEY</a></div></div><div class="inline-doc" id="djierror_djisdkcacheerror_errorenum_nosetforkey_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NO_SET_FOR_KEY</h6></div>

~~~java
 static final DJISDKCacheError NO_SET_FOR_KEY = new DJISDKCacheError("The feature is not settable.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The key is not settable.

</div>

<div class="api-row" id="djierror_djisdkcacheerror_errorenum_unknowaccesstype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkcacheerror_errorenum_unknowaccesstype_inline">UNKNOWN_ACCESS_TYPE</a></div></div><div class="inline-doc" id="djierror_djisdkcacheerror_errorenum_unknowaccesstype_inline"

><div class="article"><h6 ><font color="#AAA">final </font>UNKNOWN_ACCESS_TYPE</h6></div>

~~~java
 static final DJISDKCacheError UNKNOWN_ACCESS_TYPE = new DJISDKCacheError("The access type requested for the"
                                                                                        + "key unknown. This is an implementation error in the cache as only valid types should be exposed"
                                                                                        + "to the public interfaces.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The access type requested for the key is unknown. This is an implementation error in the cache as only valid types should be exposed to the public interface.

</div>

<div class="api-row" id="djierror_djisdkcacheerror_errorenum_disconnected"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkcacheerror_errorenum_disconnected_inline">DISCONNECTED</a></div></div><div class="inline-doc" id="djierror_djisdkcacheerror_errorenum_disconnected_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DISCONNECTED</h6></div>

~~~java
 static final DJISDKCacheError DISCONNECTED =
        new DJISDKCacheError("The abstraction is no longer" + " connected to real hardware.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The abstraction is no longer connected to real hardware.

</div>

<div class="api-row" id="djierror_djisdkcacheerror_errorenum_nostorageaccess"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkcacheerror_errorenum_nostorageaccess_inline">NO_STORAGE_ACCESS</a></div></div><div class="inline-doc" id="djierror_djisdkcacheerror_errorenum_nostorageaccess_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NO_STORAGE_ACCESS</h6></div>

~~~java
 static final DJISDKCacheError NO_STORAGE_ACCESS =
        new DJISDKCacheError("Can not access to" + " component storage.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Can not access to component storage.

</div>

<div class="api-row" id="djierror_djisdkcacheerror_errorenum_noactionforkey"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkcacheerror_errorenum_noactionforkey_inline">NO_ACTION_FOR_KEY</a></div></div><div class="inline-doc" id="djierror_djisdkcacheerror_errorenum_noactionforkey_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NO_ACTION_FOR_KEY</h6></div>

~~~java
 static final DJISDKCacheError NO_ACTION_FOR_KEY = new DJISDKCacheError("The feature is not actionable.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The key is not actionable.

</div>

<div class="api-row" id="djierror_djisdkcacheerror_errorenum_settervaluetypemismatch"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkcacheerror_errorenum_settervaluetypemismatch_inline">SETTER_VALUE_TYPE_MISMATCH</a></div></div><div class="inline-doc" id="djierror_djisdkcacheerror_errorenum_settervaluetypemismatch_inline"

><div class="article"><h6 ><font color="#AAA">final </font>SETTER_VALUE_TYPE_MISMATCH</h6></div>

~~~java
 static final DJISDKCacheError SETTER_VALUE_TYPE_MISMATCH =
        new DJISDKCacheError("The value type is not correct.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The key does not match the format: component/index/key with index being a number of *.

</div>



##### Inherited Methods:

<div class="api-row" id="djierror_djisdkflighthuberrorforcode"><div class="api-col left">dji.common.error.DJIError</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflighthuberrorforcode_inline">getDJIError</a></div></div><div class="inline-doc" id="djierror_djisdkflighthuberrorforcode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDJIError</h6></div>

~~~java
 static DJIError getDJIError(int errorCode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Returns the specific error in the <code><a href="/Components/SDKError/DJIError_DJISDKFlightHubError.html#djierror_djisdkflighthuberror">DJIFlightHubError</a></code> according to the error code.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">errorCode</td><td><font color="#666"><i>errorCode for <code><a href="/Components/SDKError/DJIError_DJISDKFlightHubError.html#djierror_djisdkflighthuberror">DJIFlightHubError</a></code>.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>An NSError object initialized with errorCode. If the errorCode was 0, returns nil.</i></td></tr></table></html></div>

<div class="api-row" id="djierror_djiutmisserrorforcodewitherrorcode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiutmisserrorforcodewitherrorcode_inline">getDJIError</a></div></div><div class="inline-doc" id="djierror_djiutmisserrorforcodewitherrorcode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDJIError</h6></div>

~~~java
 static DJIError getDJIError(int errorCode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.utmiss</td></tr></table></html>



##### Description:



<font color="#666">Get DJIUTMISSError.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">errorCode</td><td><font color="#666"><i>An int value of error code.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>An object of <code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djierror_getdescription"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_getdescription_inline">getDescription</a></div></div><div class="inline-doc" id="djierror_getdescription_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDescription</h6></div>

~~~java
 String getDescription() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Returns the description of the error code.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>The description of the error code.</i></td></tr></table></html></div>

<div class="api-row" id="djierror_setdescription"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_setdescription_inline">setDescription</a></div></div><div class="inline-doc" id="djierror_setdescription_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setDescription</h6></div>

~~~java
 void setDescription(String desc) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Sets the description for the error code.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String <font color="#000">desc</td><td><font color="#666"><i>Description string.</i></td></tr></table></html></div>


