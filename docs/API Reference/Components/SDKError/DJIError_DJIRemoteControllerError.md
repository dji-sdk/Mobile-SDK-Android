<div class="article"><h1 ><font color="#AAA">class </font>DJIRemoteControllerError</h1></div>

~~~java
@EXClassNullAway
 class DJIRemoteControllerError extends DJIError 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code></td></tr></table></html>



##### Description:



<font color="#666">Defines all remote controller related errors.



##### Class Members:

<div class="api-row" id="djierror_djiremotecontrollererror_getdjierror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djierror_djiremotecontrollererror_getdjierror_inline">getDJIError</a></div></div><div class="inline-doc" id="djierror_djiremotecontrollererror_getdjierror_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDJIError</h6></div>

~~~java
 static DJIError getDJIError(Ccode ccode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Returns the specific error in DJIRemoteControllerError according to the error code.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Ccode <font color="#000">ccode</td><td><font color="#666"><i>Error code.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>A DJIError instance of the specific error.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djierror_djiremotecontrollererror_firmware_non_sequence"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiremotecontrollererror_firmware_non_sequence_inline">FIRMWARE_NON_SEQUENCE</a></div></div><div class="inline-doc" id="djierror_djiremotecontrollererror_firmware_non_sequence_inline"

><div class="article"><h6 ><font color="#AAA">final </font>FIRMWARE_NON_SEQUENCE</h6></div>

~~~java
 static final DJIRemoteControllerError FIRMWARE_NON_SEQUENCE = new DJIRemoteControllerError("Firmware not pattern")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The sequence number of the firmware is not continuous.

</div>

<div class="api-row" id="djierror_djiremotecontrollererror_firmware_length_wrong"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiremotecontrollererror_firmware_length_wrong_inline">FIRMWARE_LENGTH_WRONG</a></div></div><div class="inline-doc" id="djierror_djiremotecontrollererror_firmware_length_wrong_inline"

><div class="article"><h6 ><font color="#AAA">final </font>FIRMWARE_LENGTH_WRONG</h6></div>

~~~java
 static final DJIRemoteControllerError FIRMWARE_LENGTH_WRONG = new DJIRemoteControllerError("Firmware length invalid")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The file size of the firmware is wrong.

</div>

<div class="api-row" id="djierror_djiremotecontrollererror_firmware_crc_wrong"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiremotecontrollererror_firmware_crc_wrong_inline">FIRMWARE_CRC_WRONG</a></div></div><div class="inline-doc" id="djierror_djiremotecontrollererror_firmware_crc_wrong_inline"

><div class="article"><h6 ><font color="#AAA">final </font>FIRMWARE_CRC_WRONG</h6></div>

~~~java
 static final DJIRemoteControllerError FIRMWARE_CRC_WRONG = new DJIRemoteControllerError("Firmware CRC value invalid")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The check number of the firmware is wrong.

</div>

<div class="api-row" id="djierror_djiremotecontrollererror_flash_clear_wrong"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiremotecontrollererror_flash_clear_wrong_inline">FLASH_CLEAR_WRONG</a></div></div><div class="inline-doc" id="djierror_djiremotecontrollererror_flash_clear_wrong_inline"

><div class="article"><h6 ><font color="#AAA">final </font>FLASH_CLEAR_WRONG</h6></div>

~~~java
 static final DJIRemoteControllerError FLASH_CLEAR_WRONG = new DJIRemoteControllerError("Flash clear error")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The clear action of the flash is wrong.

</div>

<div class="api-row" id="djierror_djiremotecontrollererror_flash_write_wrong"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiremotecontrollererror_flash_write_wrong_inline">FLASH_WRITE_WRONG</a></div></div><div class="inline-doc" id="djierror_djiremotecontrollererror_flash_write_wrong_inline"

><div class="article"><h6 ><font color="#AAA">final </font>FLASH_WRITE_WRONG</h6></div>

~~~java
 static final DJIRemoteControllerError FLASH_WRITE_WRONG = new DJIRemoteControllerError("Flash write error")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The write action of the flash is wrong.

</div>

<div class="api-row" id="djierror_djiremotecontrollererror_update_wrong"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiremotecontrollererror_update_wrong_inline">UPDATE_WRONG</a></div></div><div class="inline-doc" id="djierror_djiremotecontrollererror_update_wrong_inline"

><div class="article"><h6 ><font color="#AAA">final </font>UPDATE_WRONG</h6></div>

~~~java
 static final DJIRemoteControllerError UPDATE_WRONG = new DJIRemoteControllerError("Update error")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The update process is wrong.

</div>

<div class="api-row" id="djierror_djiremotecontrollererror_firmware_match_error"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiremotecontrollererror_firmware_match_error_inline">FIRMWARE_MATCH_ERROR</a></div></div><div class="inline-doc" id="djierror_djiremotecontrollererror_firmware_match_error_inline"

><div class="article"><h6 ><font color="#AAA">final </font>FIRMWARE_MATCH_ERROR</h6></div>

~~~java
 static final DJIRemoteControllerError FIRMWARE_MATCH_ERROR= new DJIRemoteControllerError("Firmware match error")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The firmware does not matched.

</div>

<div class="api-row" id="djierror_djiremotecontrollererror_flash_flushing"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiremotecontrollererror_flash_flushing_inline">FLASH_FLUSHING</a></div></div><div class="inline-doc" id="djierror_djiremotecontrollererror_flash_flushing_inline"

><div class="article"><h6 ><font color="#AAA">final </font>FLASH_FLUSHING</h6></div>

~~~java
 static final DJIRemoteControllerError FLASH_FLUSHING= new DJIRemoteControllerError("Firmware flushing")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The flash is flushing.

</div>

<div class="api-row" id="djierror_djiremotecontrollererror_owner_offline_error"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiremotecontrollererror_owner_offline_error_inline">OWNER_OFFLINE_ERROR</a></div></div><div class="inline-doc" id="djierror_djiremotecontrollererror_owner_offline_error_inline"

><div class="article"><h6 ><font color="#AAA">final </font>OWNER_OFFLINE_ERROR</h6></div>

~~~java
 static final DJIRemoteControllerError OWNER_OFFLINE_ERROR = new DJIRemoteControllerError("The current rc is offline")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Owner offline.

</div>

<div class="api-row" id="djierror_djiremotecontrollererror_device_offline_error"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiremotecontrollererror_device_offline_error_inline">DEVICE_OFFLINE_ERROR</a></div></div><div class="inline-doc" id="djierror_djiremotecontrollererror_device_offline_error_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DEVICE_OFFLINE_ERROR</h6></div>

~~~java
 static final DJIRemoteControllerError DEVICE_OFFLINE_ERROR = new DJIRemoteControllerError("The device to get permission is offline")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Device offline.

</div>

<div class="api-row" id="djierror_djiremotecontrollererror_is_owner_error"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiremotecontrollererror_is_owner_error_inline">IS_OWNER_ERROR</a></div></div><div class="inline-doc" id="djierror_djiremotecontrollererror_is_owner_error_inline"

><div class="article"><h6 ><font color="#AAA">final </font>IS_OWNER_ERROR</h6></div>

~~~java
 static final DJIRemoteControllerError IS_OWNER_ERROR = new DJIRemoteControllerError("Already have control permissions for this device")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Is owner.

</div>

<div class="api-row" id="djierror_djiremotecontrollererror_device_locked_error"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiremotecontrollererror_device_locked_error_inline">DEVICE_LOCKED_ERROR</a></div></div><div class="inline-doc" id="djierror_djiremotecontrollererror_device_locked_error_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DEVICE_LOCKED_ERROR</h6></div>

~~~java
 static final DJIRemoteControllerError DEVICE_LOCKED_ERROR= new DJIRemoteControllerError("The device to get permission is locked")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Device locked.

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


