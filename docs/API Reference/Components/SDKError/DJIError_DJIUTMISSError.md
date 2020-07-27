<div class="article"><h1 ><font color="#AAA">class </font>DJIUTMISSError</h1></div>

~~~java
 class DJIUTMISSError extends DJIError 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.utmiss</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code></td></tr></table></html>



##### Description:



<font color="#666">Errors related to the UTMISS.



##### Class Members:



#### Members

<div class="api-row" id="djierror_djiutmisserror_wrongfunctionorder"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiutmisserror_wrongfunctionorder_inline">ORDER_OF_FUNC</a></div></div><div class="inline-doc" id="djierror_djiutmisserror_wrongfunctionorder_inline"

><div class="article"><h6 ><font color="#AAA">final </font>ORDER_OF_FUNC</h6></div>

~~~java
 static final DJIUTMISSError ORDER_OF_FUNC = new DJIUTMISSError("You need to call start first!",  -0x01)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.utmiss</td></tr></table></html>



##### Description:



<font color="#666">Wrong order of invoking functions. Failed to initialize.

</div>

<div class="api-row" id="djierror_djiutmisserror_invaliddb"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiutmisserror_invaliddb_inline">INVALID_DB</a></div></div><div class="inline-doc" id="djierror_djiutmisserror_invaliddb_inline"

><div class="article"><h6 ><font color="#AAA">final </font>INVALID_DB</h6></div>

~~~java
 static final DJIUTMISSError INVALID_DB = new DJIUTMISSError("Db create failed!", -0x02)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.utmiss</td></tr></table></html>



##### Description:



<font color="#666">Failed to create database.

</div>

<div class="api-row" id="djierror_djiutmisserror_cachefailed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiutmisserror_cachefailed_inline">CACHE_FAILED</a></div></div><div class="inline-doc" id="djierror_djiutmisserror_cachefailed_inline"

><div class="article"><h6 ><font color="#AAA">final </font>CACHE_FAILED</h6></div>

~~~java
 static final DJIUTMISSError CACHE_FAILED = new DJIUTMISSError("Db insert failed!", -0x03)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.utmiss</td></tr></table></html>



##### Description:



<font color="#666">Failed to insert the data. The data has been lost.

</div>

<div class="api-row" id="djierror_djiutmisserror_emptydb"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiutmisserror_emptydb_inline">EMPTY_DB</a></div></div><div class="inline-doc" id="djierror_djiutmisserror_emptydb_inline"

><div class="article"><h6 ><font color="#AAA">final </font>EMPTY_DB</h6></div>

~~~java
 static final DJIUTMISSError EMPTY_DB = new DJIUTMISSError("Db is empty!", -0x04)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.utmiss</td></tr></table></html>



##### Description:



<font color="#666">The database is currently empty.

</div>

<div class="api-row" id="djierror_djiutmisserror_uploadfailed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiutmisserror_uploadfailed_inline">UPLOAD_FAILED</a></div></div><div class="inline-doc" id="djierror_djiutmisserror_uploadfailed_inline"

><div class="article"><h6 ><font color="#AAA">final </font>UPLOAD_FAILED</h6></div>

~~~java
 static final DJIUTMISSError UPLOAD_FAILED = new DJIUTMISSError("Upload failed!", -0x05)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.utmiss</td></tr></table></html>



##### Description:



<font color="#666">Failed to upload. Request code is bigger than 299.

</div>

<div class="api-row" id="djierror_djiutmisserror_areanotsupport"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiutmisserror_areanotsupport_inline">AREA_NOT_SUPPORTED</a></div></div><div class="inline-doc" id="djierror_djiutmisserror_areanotsupport_inline"

><div class="article"><h6 ><font color="#AAA">final </font>AREA_NOT_SUPPORTED</h6></div>

~~~java
 static final DJIUTMISSError AREA_NOT_SUPPORTED = new DJIUTMISSError("Area is not supported!", -0xF0)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.utmiss</td></tr></table></html>



##### Description:



<font color="#666">Current area does not support this function.

</div>

<div class="api-row" id="djierror_djiutmisserror_utmisshadstarted"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiutmisserror_utmisshadstarted_inline">UTMISS_HAD_STARTED</a></div></div><div class="inline-doc" id="djierror_djiutmisserror_utmisshadstarted_inline"

><div class="article"><h6 ><font color="#AAA">final </font>UTMISS_HAD_STARTED</h6></div>

~~~java
 static final DJIUTMISSError UTMISS_HAD_STARTED = new DJIUTMISSError("UTMISS had started!", -0xF1)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.utmiss</td></tr></table></html>



##### Description:



<font color="#666">UTMISS has started already.

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


