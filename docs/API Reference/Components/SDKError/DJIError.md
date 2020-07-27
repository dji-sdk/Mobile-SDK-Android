<div class="article"><h1 ><font color="#AAA">class </font>DJIError</h1></div>

~~~java
@EXClassNullAway
 class DJIError 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Class that handles all errors that are not handled by individual components.



##### Class Members:

<div class="api-row" id="djierror_djisdkflighthuberrorforcode"><div class="api-col left">Get DJIFlightHubError</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkflighthuberrorforcode_inline">getDJIError</a></div></div><div class="inline-doc" id="djierror_djisdkflighthuberrorforcode_inline"

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

<div class="api-row" id="djierror_djiutmisserrorforcodewitherrorcode"><div class="api-col left">Get DJIUTMISSError with Params</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiutmisserrorforcodewitherrorcode_inline">getDJIError</a></div></div><div class="inline-doc" id="djierror_djiutmisserrorforcodewitherrorcode_inline"

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



##### Related:

<div class="api-row" id="djierror_djigimbalerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/SDKError/DJIError_DJIGimbalError.html">DJIGimbalError</a></div></div><div class="api-row" id="djierror_dataprotectionerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/SDKError/DJIError_DataProtectionError.html">DataProtectionError</a></div></div><div class="api-row" id="djierror_djisdkerror_registration_success"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djisdkerror_registration_success_inline">REGISTRATION_SUCCESS</a></div></div><div class="inline-doc" id="djierror_djisdkerror_registration_success_inline"

><div class="article"><h6 ><font color="#AAA">final </font>REGISTRATION_SUCCESS</h6></div>

~~~java
 static final DJISDKError REGISTRATION_SUCCESS = new DJISDKError("API Key successfully registered")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">API Key successfully registered.

</div>

<div class="api-row" id="djierror_djisdkflighthuberror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/SDKError/DJIError_DJISDKFlightHubError.html">DJIFlightHubError</a></div></div><div class="api-row" id="djierror_djirtknetworkserviceerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/SDKError/DJIError_DJIRTKNetworkServiceError.html">DJIRTKNetworkServiceError</a></div></div><div class="api-row" id="djierror_djiaccessoryaggregationerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/SDKError/DJIError_DJIAccessoryAggregationError.html">DJIAccessoryAggregationError</a></div></div><div class="api-row" id="djierror_djiaccesslockererror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/SDKError/DJIError_DJIAccessLockerError.html">DJIAccessLockerError</a></div></div><div class="api-row" id="djierror_djipayloaderror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/SDKError/DJIError_DJIPayloadError.html">DJIPayloadError</a></div></div><div class="api-row" id="djierror_djiutmisserror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/SDKError/DJIError_DJIUTMISSError.html">DJIUTMISSError</a></div></div><div class="api-row" id="djierror_djildmerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/SDKError/DJIError_DJILDMError.html">DJILDMError</a></div></div><div class="api-row" id="djierror_djiupgradeerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/SDKError/DJIError_DJIUpgradeError.html">DJIUpgradeError</a></div></div><div class="api-row" id="djierror_djiwaypointv2error"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/SDKError/DJIError_DJIWaypointV2Error.html">DJIWaypointV2Error</a></div></div><div class="api-row" id="djierror_djipipelineerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/SDKError/DJIError_DJIPipelineError.html">PipelineError</a></div></div><div class="api-row" id="djierror_djisdkerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/SDKError/DJIError_DJISDKError.html">DJISDKError</a></div></div><div class="api-row" id="djierror_djisdkcacheerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/SDKError/DJIError_DJISDKCacheError.html">DJISDKCacheError</a></div></div><div class="api-row" id="djierror_common_execution_failed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_common_execution_failed_inline">CANNOT_PAUSE_STABILIZATION</a></div></div><div class="inline-doc" id="djierror_common_execution_failed_inline"

><div class="article"><h6 ><font color="#AAA">final </font>CANNOT_PAUSE_STABILIZATION</h6></div>

~~~java
 static final DJIError CANNOT_PAUSE_STABILIZATION = new DJIError("Can't pause stabilization.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The execution could not be executed.

</div>

<div class="api-row" id="djierror_common_system_busy"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_common_system_busy_inline">COMMON_SYSTEM_BUSY</a></div></div><div class="inline-doc" id="djierror_common_system_busy_inline"

><div class="article"><h6 ><font color="#AAA">final </font>COMMON_SYSTEM_BUSY</h6></div>

~~~java
 static final DJIError COMMON_SYSTEM_BUSY = new DJIError("The system is too busy to execute the action")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The system is too busy to execute the action.

</div>

<div class="api-row" id="djierror_common_unknown"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_common_unknown_inline">COMMON_UNKNOWN</a></div></div><div class="inline-doc" id="djierror_common_unknown_inline"

><div class="article"><h6 ><font color="#AAA">final </font>COMMON_UNKNOWN</h6></div>

~~~java
 static final DJIError COMMON_UNKNOWN = new DJIError("SDK error, please contact <dev@dji.com> for help.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Catch all for various errors.

</div>

<div class="api-row" id="djierror_common_undefined"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_common_undefined_inline">COMMON_UNDEFINED</a></div></div><div class="inline-doc" id="djierror_common_undefined_inline"

><div class="article"><h6 ><font color="#AAA">final </font>COMMON_UNDEFINED</h6></div>

~~~java
 static final DJIError COMMON_UNDEFINED = new DJIError("Undefined Error")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Undefined error. <br> This error will be returned when the error is undefined.<br><br> public void setMultiControlMode(boolean value,final DJIExecuteResultCallback mCallBack)<br>

</div>

<div class="api-row" id="djierror_common_timeout"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_common_timeout_inline">COMMON_TIMEOUT</a></div></div><div class="inline-doc" id="djierror_common_timeout_inline"

><div class="article"><h6 ><font color="#AAA">final </font>COMMON_TIMEOUT</h6></div>

~~~java
 static final DJIError COMMON_TIMEOUT = new DJIError("Execution of this process has timed out")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Execution timeout.<br> This error will be returned when the execution times out.<br><br> public void sendDataToExternalDevice(byte[] data,final DJIExecuteResultCallback mCallBack)<br> public void setMultiControlMode(boolean value,final DJIExecuteResultCallback mCallBack)<br>

</div>

<div class="api-row" id="djierror_common_param_illegal"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_common_param_illegal_inline">COMMON_PARAM_ILLEGAL</a></div></div><div class="inline-doc" id="djierror_common_param_illegal_inline"

><div class="article"><h6 ><font color="#AAA">final </font>COMMON_PARAM_ILLEGAL</h6></div>

~~~java
 static final DJIError COMMON_PARAM_ILLEGAL = new DJIError("Param Illegal")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Illegal parameters.<br> This error will be returned by the function for setting camera parameters in DJIPhantomCamera and DJIInspireCamera, when illegal parameters are used.<br>

</div>

<div class="api-row" id="djierror_common_param_invalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_common_param_invalid_inline">COMMON_PARAM_INVALID</a></div></div><div class="inline-doc" id="djierror_common_param_invalid_inline"

><div class="article"><h6 ><font color="#AAA">final </font>COMMON_PARAM_INVALID</h6></div>

~~~java
 static final DJIError COMMON_PARAM_INVALID = new DJIError("Param Invalid")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Invalid parameters.<br> This error will be returned by the function for setting camera parameters when invalid parameters are used.<br>

</div>

<div class="api-row" id="djierror_common_unsupported"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_common_unsupported_inline">COMMON_UNSUPPORTED</a></div></div><div class="inline-doc" id="djierror_common_unsupported_inline"

><div class="article"><h6 ><font color="#AAA">final </font>COMMON_UNSUPPORTED</h6></div>

~~~java
 static final DJIError COMMON_UNSUPPORTED = new DJIError("Not supported")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Unsupported feature.<br> This error will be returned by the function for some special feature interface when the feature isn't supported by the device.<br>

</div>

<div class="api-row" id="djierror_common_disconnected"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_common_disconnected_inline">COMMON_DISCONNECTED</a></div></div><div class="inline-doc" id="djierror_common_disconnected_inline"

><div class="article"><h6 ><font color="#AAA">final </font>COMMON_DISCONNECTED</h6></div>

~~~java
 static final DJIError COMMON_DISCONNECTED = new DJIError("Disconnected")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Disconnected error.<br> This error will be returned by the function for some special interface when the DJI product is not connected to the mobile device.<br>

</div>

<div class="api-row" id="djierror_firmware_non_sequence"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_firmware_non_sequence_inline">FIRMWARE_NON_SEQUENCE</a></div></div><div class="inline-doc" id="djierror_firmware_non_sequence_inline"

><div class="article"><h6 ><font color="#AAA">final </font>FIRMWARE_NON_SEQUENCE</h6></div>

~~~java
 static final DJIError FIRMWARE_NON_SEQUENCE = new DJIError("Firmware pattern number not continuous")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Inspire only.<br> The sequence number of firmware is not continuous.

</div>

<div class="api-row" id="djierror_firmware_length_wrong"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_firmware_length_wrong_inline">FIRMWARE_LENGTH_WRONG</a></div></div><div class="inline-doc" id="djierror_firmware_length_wrong_inline"

><div class="article"><h6 ><font color="#AAA">final </font>FIRMWARE_LENGTH_WRONG</h6></div>

~~~java
 static final DJIError FIRMWARE_LENGTH_WRONG = new DJIError("Firmware length invalid")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The file size of the firmware is invalid.

</div>

<div class="api-row" id="djierror_firmware_crc_wrong"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_firmware_crc_wrong_inline">FIRMWARE_CRC_WRONG</a></div></div><div class="inline-doc" id="djierror_firmware_crc_wrong_inline"

><div class="article"><h6 ><font color="#AAA">final </font>FIRMWARE_CRC_WRONG</h6></div>

~~~java
 static final DJIError FIRMWARE_CRC_WRONG = new DJIError("Firmware crc value invalid")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Inspire only.<br> The check number of the firmware is invalid.

</div>

<div class="api-row" id="djierror_flash_clear_wrong"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_flash_clear_wrong_inline">FLASH_CLEAR_WRONG</a></div></div><div class="inline-doc" id="djierror_flash_clear_wrong_inline"

><div class="article"><h6 ><font color="#AAA">final </font>FLASH_CLEAR_WRONG</h6></div>

~~~java
 static final DJIError FLASH_CLEAR_WRONG = new DJIError("Flash clear error ")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The clear action of the flash is invalid.

</div>

<div class="api-row" id="djierror_flash_write_wrong"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_flash_write_wrong_inline">FLASH_WRITE_WRONG</a></div></div><div class="inline-doc" id="djierror_flash_write_wrong_inline"

><div class="article"><h6 ><font color="#AAA">final </font>FLASH_WRITE_WRONG</h6></div>

~~~java
 static final DJIError FLASH_WRITE_WRONG = new DJIError("Flash write error ")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The write action of the flash is invalid.

</div>

<div class="api-row" id="djierror_update_wrong"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_update_wrong_inline">UPDATE_WRONG</a></div></div><div class="inline-doc" id="djierror_update_wrong_inline"

><div class="article"><h6 ><font color="#AAA">final </font>UPDATE_WRONG</h6></div>

~~~java
 static final DJIError UPDATE_WRONG = new DJIError("Update error")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The update process is invalid.

</div>

<div class="api-row" id="djierror_firmware_match_wrong"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_firmware_match_wrong_inline">FIRMWARE_MATCH_WRONG</a></div></div><div class="inline-doc" id="djierror_firmware_match_wrong_inline"

><div class="article"><h6 ><font color="#AAA">final </font>FIRMWARE_MATCH_WRONG</h6></div>

~~~java
 static final DJIError FIRMWARE_MATCH_WRONG = new DJIError("Firmware match error ")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">There is a firmware match error.

</div>

<div class="api-row" id="djierror_flash_flushing"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_flash_flushing_inline">FLASH_FLUSHING</a></div></div><div class="inline-doc" id="djierror_flash_flushing_inline"

><div class="article"><h6 ><font color="#AAA">final </font>FLASH_FLUSHING</h6></div>

~~~java
 static final DJIError FLASH_FLUSHING = new DJIError("Firmware flushing")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The flash is flushing.

</div>

<div class="api-row" id="djierror_media_invalid_request_type"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_media_invalid_request_type_inline">MEDIA_INVALID_REQUEST_TYPE</a></div></div><div class="inline-doc" id="djierror_media_invalid_request_type_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MEDIA_INVALID_REQUEST_TYPE</h6></div>

~~~java
 static final DJIError MEDIA_INVALID_REQUEST_TYPE =
        new DJIError("Media download result: media downloading request type is invalid")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The media download request type is invalid.

</div>

<div class="api-row" id="djierror_media_no_such_file"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_media_no_such_file_inline">MEDIA_NO_SUCH_FILE</a></div></div><div class="inline-doc" id="djierror_media_no_such_file_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MEDIA_NO_SUCH_FILE</h6></div>

~~~java
 static final DJIError MEDIA_NO_SUCH_FILE = new DJIError("Media download result: no such file")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Media download error: no such file.

</div>

<div class="api-row" id="djierror_media_request_client_abort"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_media_request_client_abort_inline">MEDIA_REQUEST_CLIENT_ABORT</a></div></div><div class="inline-doc" id="djierror_media_request_client_abort_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MEDIA_REQUEST_CLIENT_ABORT</h6></div>

~~~java
 static final DJIError MEDIA_REQUEST_CLIENT_ABORT =
        new DJIError("Media download result: the client aborts the downloading")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Media download error: the client aborted the downloading.

</div>

<div class="api-row" id="djierror_media_request_disconnect"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_media_request_disconnect_inline">MEDIA_REQUEST_DISCONNECT</a></div></div><div class="inline-doc" id="djierror_media_request_disconnect_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MEDIA_REQUEST_DISCONNECT</h6></div>

~~~java
 static final DJIError MEDIA_REQUEST_DISCONNECT =
        new DJIError("Media download result: the downloading link disconnects")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Result of media downloading: the downloading link disconnects.

</div>

<div class="api-row" id="djierror_image_transmitter_invalid_parameter"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_image_transmitter_invalid_parameter_inline">IMAGE_TRANSMITTER_INVALID_PARAMETER</a></div></div><div class="inline-doc" id="djierror_image_transmitter_invalid_parameter_inline"

><div class="article"><h6 ><font color="#AAA">final </font>IMAGE_TRANSMITTER_INVALID_PARAMETER</h6></div>

~~~java
 static final DJIError IMAGE_TRANSMITTER_INVALID_PARAMETER =
        new DJIError("The input parameter is out of bound or invalid.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The input parameters is out of bound or invalid.

</div>

<div class="api-row" id="djierror_command_not_supported_by_firmware"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_command_not_supported_by_firmware_inline">COMMAND_NOT_SUPPORTED_BY_FIRMWARE</a></div></div><div class="inline-doc" id="djierror_command_not_supported_by_firmware_inline"

><div class="article"><h6 ><font color="#AAA">final </font>COMMAND_NOT_SUPPORTED_BY_FIRMWARE</h6></div>

~~~java
 static final DJIError COMMAND_NOT_SUPPORTED_BY_FIRMWARE =
        new DJIError("The command is not supported by the current firmware version.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The command is not supported by the current firmware version.

</div>

<div class="api-row" id="djierror_command_not_supported_by_hardware"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_command_not_supported_by_hardware_inline">COMMAND_NOT_SUPPORTED_BY_HARDWARE</a></div></div><div class="inline-doc" id="djierror_command_not_supported_by_hardware_inline"

><div class="article"><h6 ><font color="#AAA">final </font>COMMAND_NOT_SUPPORTED_BY_HARDWARE</h6></div>

~~~java
 static final DJIError COMMAND_NOT_SUPPORTED_BY_HARDWARE =
        new DJIError("The command is not supported by the current hardware.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The command is not supported by the current hardware version.

</div>

<div class="api-row" id="djierror_unable_to_get_firmware_version"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_unable_to_get_firmware_version_inline">UNABLE_TO_GET_FIRMWARE_VERSION</a></div></div><div class="inline-doc" id="djierror_unable_to_get_firmware_version_inline"

><div class="article"><h6 ><font color="#AAA">final </font>UNABLE_TO_GET_FIRMWARE_VERSION</h6></div>

~~~java
 static final DJIError UNABLE_TO_GET_FIRMWARE_VERSION = new DJIError(
        "Unable to get the firmware version. Note: The sdk will fetch the firmware version from the server so, please ensure you have Internet connectivity before you invoke getVersion().")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Unable to get the firmware version. Note: The SDK gets the firmware version table from the server. Ensure Internet connectivity before you invoke getVersion().

</div>

<div class="api-row" id="djierror_unable_to_get_flags"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_unable_to_get_flags_inline">UNABLE_TO_GET_FLAGS</a></div></div><div class="inline-doc" id="djierror_unable_to_get_flags_inline"

><div class="article"><h6 ><font color="#AAA">final </font>UNABLE_TO_GET_FLAGS</h6></div>

~~~java
 static final DJIError UNABLE_TO_GET_FLAGS = new DJIError(
        "Unable to get the analytics flags from server. Please ensure you have Internet connectivity before you invoke this method.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Unable to get the analytics flags from server. Note: Ensure Internet connectivity before you invoke this method.

</div>

<div class="api-row" id="djierror_unable_to_get_flag_but_retry"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_unable_to_get_flag_but_retry_inline">UNABLE_TO_GET_FLAG_BUT_RETRY</a></div></div><div class="inline-doc" id="djierror_unable_to_get_flag_but_retry_inline"

><div class="article"><h6 ><font color="#AAA">final </font>UNABLE_TO_GET_FLAG_BUT_RETRY</h6></div>

~~~java
 static final DJIError UNABLE_TO_GET_FLAG_BUT_RETRY = new DJIError(
        "Unable to get the analytics flags from server, but retrying.  Please ensure you have Internet connectivity before invoking this method")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Unable to get the analytics flags from server, but retrying.

</div>

<div class="api-row" id="djierror_set_param_failed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_set_param_failed_inline">SET_PARAM_FAILED</a></div></div><div class="inline-doc" id="djierror_set_param_failed_inline"

><div class="article"><h6 ><font color="#AAA">final </font>SET_PARAM_FAILED</h6></div>

~~~java
 static final DJIError SET_PARAM_FAILED = new DJIError("set param failed")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Set param failed.

</div>

<div class="api-row" id="djierror_battery_pair_failed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_battery_pair_failed_inline">BATTERY_PAIR_FAILED</a></div></div><div class="inline-doc" id="djierror_battery_pair_failed_inline"

><div class="article"><h6 ><font color="#AAA">final </font>BATTERY_PAIR_FAILED</h6></div>

~~~java
 static final DJIError BATTERY_PAIR_FAILED = new DJIError("Unable to pair the batteries")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Unable to pair the batteries.

</div>

<div class="api-row" id="djierror_battery_get_smart_battery_info_failed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_battery_get_smart_battery_info_failed_inline">BATTERY_GET_SMART_BATTERY_INFO_FAILED</a></div></div><div class="inline-doc" id="djierror_battery_get_smart_battery_info_failed_inline"

><div class="article"><h6 ><font color="#AAA">final </font>BATTERY_GET_SMART_BATTERY_INFO_FAILED</h6></div>

~~~java
 static final DJIError BATTERY_GET_SMART_BATTERY_INFO_FAILED = new DJIError("Get smart battery info failed")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Get smart battery information failed.<br> This error will be returned by the functions for getting information in DJIPhantomBattery and DJIAircraftBattery when the request to get information failed.<br><br> public void getSmartBatteryRestTimeForAll(DJISmartBatteryExecuteResultCallback mCallBack)<br> public void getSmartBatteryNeedTimeForGoHome(DJISmartBatteryExecuteResultCallback mCallBack)<br> public void getSmartBatteryNeedTimeForLand(DJISmartBatteryExecuteResultCallback mCallBack)<br> public void getSmartBatteryGohomeBatteryLevel(DJISmartBatteryExecuteResultCallback mCallBack)<br> public void getSmartBatteryLandBatteryLevel(DJISmartBatteryExecuteResultCallback mCallBack)<br> public void getSmartBatteryRadiusForGohome(DJISmartBatteryExecuteResultCallback mCallBack)<br> public void getSmartBatteryRequestGohomeFlag(DJISmartBatteryExecuteResultCallback mCallBack)<br>

</div>

<div class="api-row" id="djierror_no_network"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_no_network_inline">NO_NETWORK</a></div></div><div class="inline-doc" id="djierror_no_network_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NO_NETWORK</h6></div>

~~~java
 static final DJIError NO_NETWORK = new DJIError("No network")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">No network access.

</div>

<div class="api-row" id="djierror_database_is_not_ready"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_database_is_not_ready_inline">DATABASE_IS_NOT_READY</a></div></div><div class="inline-doc" id="djierror_database_is_not_ready_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DATABASE_IS_NOT_READY</h6></div>

~~~java
 static final DJIError DATABASE_IS_NOT_READY = new DJIError("Database is not ready")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Database is not ready.

</div>

<div class="api-row" id="djierror_djicameraerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/SDKError/DJIError_DJICameraError.html">DJICameraError</a></div></div><div class="api-row" id="djierror_djiflightcontrollererror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/SDKError/DJIError_DJIFlightControllerError.html">DJIFlightControllerError</a></div></div><div class="api-row" id="djierror_djimissionmanagererror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/SDKError/DJIError_DJIMissionManagerError.html">DJIMissionError</a></div></div><div class="api-row" id="djierror_djiairlinkerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/SDKError/DJIError_DJIAirLinkError.html">DJIAirLinkError</a></div></div><div class="api-row" id="djierror_djibatteryerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/SDKError/DJIError_DJIBatteryError.html">DJIBatteryError</a></div></div><div class="api-row" id="djierror_djigeoerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/SDKError/DJIError_DJIGeoError.html">DJIFlySafeError</a></div></div><div class="api-row" id="djierror_djiremotecontrollererror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/SDKError/DJIError_DJIRemoteControllerError.html">DJIRemoteControllerError</a></div></div><div class="api-row" id="djierror_media_request_server_abort"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_media_request_server_abort_inline">MEDIA_REQUEST_SERVER_ABORT</a></div></div><div class="inline-doc" id="djierror_media_request_server_abort_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MEDIA_REQUEST_SERVER_ABORT</h6></div>

~~~java
 static final DJIError MEDIA_REQUEST_SERVER_ABORT =
        new DJIError("Media download result: the server aborts the downloading")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Media download error: the server aborted the downloading.

</div>


