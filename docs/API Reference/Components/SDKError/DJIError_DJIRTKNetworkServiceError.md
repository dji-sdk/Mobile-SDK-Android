<div class="article"><h1 ><font color="#AAA">class </font>DJIRTKNetworkServiceError</h1></div>

~~~java
 class DJIRTKNetworkServiceError extends DJIError 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code></td></tr></table></html>



##### Description:



<font color="#666">Errors related to RTK network services.



##### Class Members:



#### Members

<div class="api-row" id="djierror_djirtknetworkserviceerror_authenticationfailure"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djirtknetworkserviceerror_authenticationfailure_inline">AUTHENTICATION_FAILURE</a></div></div><div class="inline-doc" id="djierror_djirtknetworkserviceerror_authenticationfailure_inline"

><div class="article"><h6 ><font color="#AAA">final </font>AUTHENTICATION_FAILURE</h6></div>

~~~java
 static final DJIRTKNetworkServiceError AUTHENTICATION_FAILURE =
        new DJIRTKNetworkServiceError("The authentication failed when trying to access to the server.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The authentication failed when trying to access to the server.

</div>

<div class="api-row" id="djierror_djirtknetworkserviceerror_invalidsettings"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djirtknetworkserviceerror_invalidsettings_inline">INVALID_SETTINGS</a></div></div><div class="inline-doc" id="djierror_djirtknetworkserviceerror_invalidsettings_inline"

><div class="article"><h6 ><font color="#AAA">final </font>INVALID_SETTINGS</h6></div>

~~~java
 static final DJIRTKNetworkServiceError INVALID_SETTINGS =
        new DJIRTKNetworkServiceError("The network service settings are invalid.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Network settings are not configured yet or invalid.

</div>

<div class="api-row" id="djierror_djirtknetworkserviceerror_alreadystarted"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djirtknetworkserviceerror_alreadystarted_inline">ALREADY_STARTED</a></div></div><div class="inline-doc" id="djierror_djirtknetworkserviceerror_alreadystarted_inline"

><div class="article"><h6 ><font color="#AAA">final </font>ALREADY_STARTED</h6></div>

~~~java
 static final DJIRTKNetworkServiceError ALREADY_STARTED =
        new DJIRTKNetworkServiceError("The service is already started. Stop it first to re-start the service.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The service is already started. Stop it first to re-start the service.

</div>

<div class="api-row" id="djierror_djirtknetworkserviceerror_invalidgpsdata"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djirtknetworkserviceerror_invalidgpsdata_inline">INVALID_GPS_DATA</a></div></div><div class="inline-doc" id="djierror_djirtknetworkserviceerror_invalidgpsdata_inline"

><div class="article"><h6 ><font color="#AAA">final </font>INVALID_GPS_DATA</h6></div>

~~~java
 static final DJIRTKNetworkServiceError INVALID_GPS_DATA = new DJIRTKNetworkServiceError(
        "The GPS location of the aircraft is invalid. The RTK network service requires the location of the air system.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The GPS location of the aircraft is invalid. The RTK network service requires  the location of the air system.

</div>

<div class="api-row" id="djierror_djirtknetworkserviceerror_incorrectreferencestationsource"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djirtknetworkserviceerror_incorrectreferencestationsource_inline">INCORRECT_REFERENCE_STATION_SOURCE</a></div></div><div class="inline-doc" id="djierror_djirtknetworkserviceerror_incorrectreferencestationsource_inline"

><div class="article"><h6 ><font color="#AAA">final </font>INCORRECT_REFERENCE_STATION_SOURCE</h6></div>

~~~java
 static final DJIRTKNetworkServiceError INCORRECT_REFERENCE_STATION_SOURCE = new DJIRTKNetworkServiceError(
        "Please choose correct reference station srouce.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Please choose correct reference station srouce.

</div>

<div class="api-row" id="djierror_djirtknetworkserviceerror_accountnotloginorexpired"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djirtknetworkserviceerror_accountnotloginorexpired_inline">ACCOUNT_NOT_LOGGED_IN_OR_EXPIRED</a></div></div><div class="inline-doc" id="djierror_djirtknetworkserviceerror_accountnotloginorexpired_inline"

><div class="article"><h6 ><font color="#AAA">final </font>ACCOUNT_NOT_LOGGED_IN_OR_EXPIRED</h6></div>

~~~java
 static final DJIRTKNetworkServiceError
        ACCOUNT_NOT_LOGGED_IN_OR_EXPIRED = new DJIRTKNetworkServiceError("No logged in account or the login session has expired.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">No logged in account or the login session has expired.

</div>

<div class="api-row" id="djierror_djirtknetworkserviceerror_accountunactivated"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djirtknetworkserviceerror_accountunactivated_inline">ACCOUNT_UNACTIVATED</a></div></div><div class="inline-doc" id="djierror_djirtknetworkserviceerror_accountunactivated_inline"

><div class="article"><h6 ><font color="#AAA">final </font>ACCOUNT_UNACTIVATED</h6></div>

~~~java
 static final DJIRTKNetworkServiceError
        ACCOUNT_UNACTIVATED = new DJIRTKNetworkServiceError("Account has not activated, please activate your account first.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Account not activated, please contact DJI Support.  Use <code><a href="/Components/RTK/DJIRTKNetworkServiceProvider.html#djirtknetworkserviceprovider_activatenetworkservice">activateNetworkService</a></code> to activate your account.

</div>

<div class="api-row" id="djierror_djirtknetworkserviceerror_invalidrequest"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djirtknetworkserviceerror_invalidrequest_inline">INVALID_REQUEST</a></div></div><div class="inline-doc" id="djierror_djirtknetworkserviceerror_invalidrequest_inline"

><div class="article"><h6 ><font color="#AAA">final </font>INVALID_REQUEST</h6></div>

~~~java
 static final DJIRTKNetworkServiceError INVALID_REQUEST =
        new DJIRTKNetworkServiceError("Invalid request for the RTK service. Please check if the network RTK service is purchased or activated.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Invalid request for the RTK service. Please check if the network RTK service is purchased  or activated. After purchasing, within 3 minutes, you might also get this error.

</div>

<div class="api-row" id="djierror_djirtknetworkserviceerror_servernotreachable"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djirtknetworkserviceerror_servernotreachable_inline">SERVER_NOT_REACHABLE</a></div></div><div class="inline-doc" id="djierror_djirtknetworkserviceerror_servernotreachable_inline"

><div class="article"><h6 ><font color="#AAA">final </font>SERVER_NOT_REACHABLE</h6></div>

~~~java
 static final DJIRTKNetworkServiceError SERVER_NOT_REACHABLE =
        new DJIRTKNetworkServiceError("Unable to connect to server.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Unable to connect to server.

</div>

<div class="api-row" id="djierror_djirtknetworkserviceerror_accounterror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djirtknetworkserviceerror_accounterror_inline">ACCOUNT_ERROR</a></div></div><div class="inline-doc" id="djierror_djirtknetworkserviceerror_accounterror_inline"

><div class="article"><h6 ><font color="#AAA">final </font>ACCOUNT_ERROR</h6></div>

~~~java
 static final DJIRTKNetworkServiceError ACCOUNT_ERROR =
        new DJIRTKNetworkServiceError("Unknown account error，please contact DJI Support.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Unknown account error, please contact DJI Support.

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


