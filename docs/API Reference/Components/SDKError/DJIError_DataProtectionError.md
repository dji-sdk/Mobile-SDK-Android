<div class="article"><h1 ><font color="#AAA">class </font>DataProtectionError</h1></div>

~~~java
@EXClassNullAway
 class DataProtectionError extends DJIError 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.dataprotection</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code></td></tr></table></html>



##### Description:



<font color="#666">The class for all errors related to data protection.



##### Class Members:



##### Related:

<div class="api-row" id="djierror_dataprotectionerror_cannot_add_authorization"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_dataprotectionerror_cannot_add_authorization_inline">CANNOT_ADD_AUTHORIZATION</a></div></div><div class="inline-doc" id="djierror_dataprotectionerror_cannot_add_authorization_inline"

><div class="article"><h6 ><font color="#AAA">final </font>CANNOT_ADD_AUTHORIZATION</h6></div>

~~~java
 static final DataProtectionError CANNOT_ADD_AUTHORIZATION =
        new DataProtectionError("Cannot authorize this type data.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.dataprotection</td></tr></table></html>



##### Description:



<font color="#666">The authorization of this type of data has failed.

</div>

<div class="api-row" id="djierror_dataprotectionerror_cannot_remove_authorization"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_dataprotectionerror_cannot_remove_authorization_inline">CANNOT_REMOVE_AUTHORIZATION</a></div></div><div class="inline-doc" id="djierror_dataprotectionerror_cannot_remove_authorization_inline"

><div class="article"><h6 ><font color="#AAA">final </font>CANNOT_REMOVE_AUTHORIZATION</h6></div>

~~~java
 static final DataProtectionError CANNOT_REMOVE_AUTHORIZATION =
        new DataProtectionError("Cannot remove authorization for this type data.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.dataprotection</td></tr></table></html>



##### Description:



<font color="#666">The removal of this type of data's authorization has failed.

</div>

<div class="api-row" id="djierror_dataprotectionerror_no_hardware_info_authorization"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_dataprotectionerror_no_hardware_info_authorization_inline">NO_HARDWARE_INFO_AUTHORIZATION</a></div></div><div class="inline-doc" id="djierror_dataprotectionerror_no_hardware_info_authorization_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NO_HARDWARE_INFO_AUTHORIZATION</h6></div>

~~~java
 static final DataProtectionError NO_HARDWARE_INFO_AUTHORIZATION =
        new DataProtectionError("Do not have authorization for hardware information .")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.dataprotection</td></tr></table></html>



##### Description:



<font color="#666">SDK does not have authorization to access hardware information.

</div>

<div class="api-row" id="djierror_dataprotectionerror_not_enough_authorization"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_dataprotectionerror_not_enough_authorization_inline">NOT_ENOUGH_AUTHORIZATION</a></div></div><div class="inline-doc" id="djierror_dataprotectionerror_not_enough_authorization_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NOT_ENOUGH_AUTHORIZATION</h6></div>

~~~java
 static final DataProtectionError NOT_ENOUGH_AUTHORIZATION =
        new DataProtectionError("Do not have enough authorization to access data.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.dataprotection</td></tr></table></html>



##### Description:



<font color="#666">SDK does not have authorization to access some privacy related information.

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


