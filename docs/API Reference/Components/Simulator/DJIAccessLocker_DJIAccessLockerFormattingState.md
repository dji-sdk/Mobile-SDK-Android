<div class="article"><h1 ><font color="#AAA">class </font>FormattingState</h1></div>

~~~java
 final class FormattingState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.accesslocker</td></tr></table></html>



##### Description:



<font color="#666">Formatting state of the access locker.



##### Class Members:

<div class="api-row" id="djiaccesslocker_djiaccesslockerformattingstate_progressstate"><div class="api-col left">Progress State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccesslocker_djiaccesslockerformattingstate_progressstate_inline">getProgressState</a></div></div><div class="inline-doc" id="djiaccesslocker_djiaccesslockerformattingstate_progressstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getProgressState</h6></div>

~~~java
 FormattingProgressState getProgressState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.accesslocker</td></tr></table></html>



##### Description:



<font color="#666">The progress state.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Simulator/DJIAccessLocker.html#djiaccesslocker_djiaccesslockerformattingprogressstate">FormattingProgressState</a></td><td><font color="#666"><i>An enum value of the <code><a href="/Components/Simulator/DJIAccessLocker.html#djiaccesslocker_djiaccesslockerformattingprogressstate">FormattingProgressState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccesslocker_djiaccesslockerformattingstate_error"><div class="api-col left">Error</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccesslocker_djiaccesslockerformattingstate_error_inline">getDJIDataLockerError</a></div></div><div class="inline-doc" id="djiaccesslocker_djiaccesslockerformattingstate_error_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDJIDataLockerError</h6></div>

~~~java
@Nullable
 DJIError getDJIDataLockerError() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.accesslocker</td></tr></table></html>



##### Description:



<font color="#666">Checks if the formatting operation is successfully completed. The  recent formatting operation failure if any. NULL if the recent formatting operation succeeded.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>The possible error during the formatting process.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiaccesslocker_djiaccesslockerformattingstate_callbackinterface"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Simulator/DJIAccessLocker_DJIAccessLockerFormattingState_callbackInterface.html">Callback</a></div></div>
