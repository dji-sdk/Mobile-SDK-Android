<div class="article"><h1 ><font color="#AAA">class </font>DJIAccessLockerError</h1></div>

~~~java
 class DJIAccessLockerError extends DJIError 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code></td></tr></table></html>



##### Description:



<font color="#666">Errors related to the access locker.



##### Class Members:



#### Members

<div class="api-row" id="djierror_djiaccesslockererror_invalidstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiaccesslockererror_invalidstate_inline">INVALID_STATE</a></div></div><div class="inline-doc" id="djierror_djiaccesslockererror_invalidstate_inline"

><div class="article"><h6 ><font color="#AAA">final </font>INVALID_STATE</h6></div>

~~~java
 static final DJIAccessLockerError INVALID_STATE = new DJIAccessLockerError("The command is not valid in current state.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The command is not valid in current state.

</div>

<div class="api-row" id="djierror_djiaccesslockererror_firmwarewrite"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiaccesslockererror_firmwarewrite_inline">FIRMWARE_WRITE_ERROR</a></div></div><div class="inline-doc" id="djierror_djiaccesslockererror_firmwarewrite_inline"

><div class="article"><h6 ><font color="#AAA">final </font>FIRMWARE_WRITE_ERROR</h6></div>

~~~java
 static final DJIAccessLockerError FIRMWARE_WRITE_ERROR = new DJIAccessLockerError("Write failure when updating data in the firmware.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Write failure when updating data in the firmware.

</div>

<div class="api-row" id="djierror_djiaccesslockererror_firmwareread"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiaccesslockererror_firmwareread_inline">FIRMWARE_READ_ERROR</a></div></div><div class="inline-doc" id="djierror_djiaccesslockererror_firmwareread_inline"

><div class="article"><h6 ><font color="#AAA">final </font>FIRMWARE_READ_ERROR</h6></div>

~~~java
 static final DJIAccessLockerError FIRMWARE_READ_ERROR = new DJIAccessLockerError("Read failure when accessing data in the firmware.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Read failure when accessing data in the firmware.

</div>

<div class="api-row" id="djierror_djiaccesslockererror_securitycodeincorrect"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiaccesslockererror_securitycodeincorrect_inline">SECURITY_CODE_INCORRECT</a></div></div><div class="inline-doc" id="djierror_djiaccesslockererror_securitycodeincorrect_inline"

><div class="article"><h6 ><font color="#AAA">final </font>SECURITY_CODE_INCORRECT</h6></div>

~~~java
 static final DJIAccessLockerError
        SECURITY_CODE_INCORRECT= new DJIAccessLockerError("The security code is incorrect.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The Security Code is incorrect.

</div>

<div class="api-row" id="djierror_djiaccesslockererror_notsetup"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiaccesslockererror_notsetup_inline">NOT_SET_UP_ERROR</a></div></div><div class="inline-doc" id="djierror_djiaccesslockererror_notsetup_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NOT_SET_UP_ERROR</h6></div>

~~~java
 static final DJIAccessLockerError NOT_SET_UP_ERROR =
        new DJIAccessLockerError("The user account is not set up for the security feature yet.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The user account is not set up for the security feature yet.

</div>

<div class="api-row" id="djierror_djiaccesslockererror_alreadyunlocked"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiaccesslockererror_alreadyunlocked_inline">ALREADY_UNLOCKED</a></div></div><div class="inline-doc" id="djierror_djiaccesslockererror_alreadyunlocked_inline"

><div class="article"><h6 ><font color="#AAA">final </font>ALREADY_UNLOCKED</h6></div>

~~~java
 static final DJIAccessLockerError ALREADY_UNLOCKED =
        new DJIAccessLockerError("The aircraft is already unlocked.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The aircraft is already unlocked.

</div>

<div class="api-row" id="djierror_djiaccesslockererror_securitycodeincorrectfivetimes"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiaccesslockererror_securitycodeincorrectfivetimes_inline">SECURITY_CODE_INCORRECT_FIVE_TIMES</a></div></div><div class="inline-doc" id="djierror_djiaccesslockererror_securitycodeincorrectfivetimes_inline"

><div class="article"><h6 ><font color="#AAA">final </font>SECURITY_CODE_INCORRECT_FIVE_TIMES</h6></div>

~~~java
 static final DJIAccessLockerError SECURITY_CODE_INCORRECT_FIVE_TIMES =
        new DJIAccessLockerError("Attempt with wrong security codes more than 5 times. The aircraft is disable and try again in 1 minute.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Attempt with wrong Security Code more than 5 times. The aircraft is  disable and try again in 1 minute.

</div>

<div class="api-row" id="djierror_djiaccesslockererror_securitycodeincorrecttwentytimes"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiaccesslockererror_securitycodeincorrecttwentytimes_inline">SECURITY_CODE_INCORRECT_TWENTY_TIMES</a></div></div><div class="inline-doc" id="djierror_djiaccesslockererror_securitycodeincorrecttwentytimes_inline"

><div class="article"><h6 ><font color="#AAA">final </font>SECURITY_CODE_INCORRECT_TWENTY_TIMES</h6></div>

~~~java
 static final DJIAccessLockerError SECURITY_CODE_INCORRECT_TWENTY_TIMES =
        new DJIAccessLockerError("Attempt with wrong security codes more than 20 times. The aircraft is disable and try again in 24 hours.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">Attempt with wrong Security Code more than 20 times. The aircraft is disable and try again in 24 hours.

</div>

<div class="api-row" id="djierror_djiaccesslockererror_usernamenotexist"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiaccesslockererror_usernamenotexist_inline">USERNAME_NOT_EXIST</a></div></div><div class="inline-doc" id="djierror_djiaccesslockererror_usernamenotexist_inline"

><div class="article"><h6 ><font color="#AAA">final </font>USERNAME_NOT_EXIST</h6></div>

~~~java
 static final DJIAccessLockerError USERNAME_NOT_EXIST =
        new DJIAccessLockerError("The username does not exist.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The username does not exist.

</div>

<div class="api-row" id="djierror_djiaccesslockererror_securitycodeformatinvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djierror_djiaccesslockererror_securitycodeformatinvalid_inline">SECURITY_CODE_FORMAT_INVALID</a></div></div><div class="inline-doc" id="djierror_djiaccesslockererror_securitycodeformatinvalid_inline"

><div class="article"><h6 ><font color="#AAA">final </font>SECURITY_CODE_FORMAT_INVALID</h6></div>

~~~java
 static final DJIAccessLockerError SECURITY_CODE_FORMAT_INVALID= new DJIAccessLockerError("The new security code is not valid.A valid security code should contain only numbers and letters and its length is not less than 6 characters and not longer than 8 characters.")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.error</td></tr></table></html>



##### Description:



<font color="#666">The new security code is not valid. A valid security code should contain only numbers and letters and  its length is not less than 4 characters and not longer than 8 characters.

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


