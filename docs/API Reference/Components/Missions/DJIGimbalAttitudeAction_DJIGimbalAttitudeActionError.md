<div class="article"><h1 ><font color="#AAA">class </font>GimbalAttitudeActionError</h1></div>

~~~java
 class GimbalAttitudeActionError extends DJIError 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.error</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code></td></tr></table></html>



##### Description:



<font color="#666">A list of all errors relative to the gimbal attitude action.



##### Class Members:



#### Members

<div class="api-row" id="djigimbalattitudeaction_djigimbalattitudeactionerror_yawoutsidemaxcapabilities"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djigimbalattitudeaction_djigimbalattitudeactionerror_yawoutsidemaxcapabilities_inline">YAW_OUTSIDE_MAX_CAPABILITIES</a></div></div><div class="inline-doc" id="djigimbalattitudeaction_djigimbalattitudeactionerror_yawoutsidemaxcapabilities_inline"

><div class="article"><h6 ><font color="#AAA">final </font>YAW_OUTSIDE_MAX_CAPABILITIES</h6></div>

~~~java
 static final GimbalAttitudeActionError
        YAW_OUTSIDE_MAX_CAPABILITIES = new GimbalAttitudeActionError("Yaw value passed is beyond the max capabilities of the gimbal")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.error</td></tr></table></html>



##### Description:



<font color="#666">Yaw value passed is beyond the max capabilities of the gimbal.

</div>

<div class="api-row" id="djigimbalattitudeaction_djigimbalattitudeactionerror_pitchoutsidemaxcapabilities"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djigimbalattitudeaction_djigimbalattitudeactionerror_pitchoutsidemaxcapabilities_inline">PITCH_OUTSIDE_MAX_CAPABILITIES</a></div></div><div class="inline-doc" id="djigimbalattitudeaction_djigimbalattitudeactionerror_pitchoutsidemaxcapabilities_inline"

><div class="article"><h6 ><font color="#AAA">final </font>PITCH_OUTSIDE_MAX_CAPABILITIES</h6></div>

~~~java
 static final GimbalAttitudeActionError
        PITCH_OUTSIDE_MAX_CAPABILITIES = new GimbalAttitudeActionError("Pitch value passed is beyond the max capabilities of the gimbal")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.error</td></tr></table></html>



##### Description:



<font color="#666">Pitch value passed is beyond the max capabilities of the gimbal.

</div>

<div class="api-row" id="djigimbalattitudeaction_djigimbalattitudeactionerror_rolloutsidemaxcapabilities"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djigimbalattitudeaction_djigimbalattitudeactionerror_rolloutsidemaxcapabilities_inline">ROLL_OUTSIDE_MAX_CAPABILITIES</a></div></div><div class="inline-doc" id="djigimbalattitudeaction_djigimbalattitudeactionerror_rolloutsidemaxcapabilities_inline"

><div class="article"><h6 ><font color="#AAA">final </font>ROLL_OUTSIDE_MAX_CAPABILITIES</h6></div>

~~~java
 static final GimbalAttitudeActionError
        ROLL_OUTSIDE_MAX_CAPABILITIES = new GimbalAttitudeActionError("Roll value passed is beyond the max capabilities of the gimbal")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.error</td></tr></table></html>



##### Description:



<font color="#666">Roll value passed is beyond the max capabilities of the gimbal.

</div>

<div class="api-row" id="djigimbalattitudeaction_djigimbalattitudeactionerror_completiontimeinvalid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djigimbalattitudeaction_djigimbalattitudeactionerror_completiontimeinvalid_inline">COMPLETION_TIME_INVALID</a></div></div><div class="inline-doc" id="djigimbalattitudeaction_djigimbalattitudeactionerror_completiontimeinvalid_inline"

><div class="article"><h6 ><font color="#AAA">final </font>COMPLETION_TIME_INVALID</h6></div>

~~~java
 static final GimbalAttitudeActionError
        COMPLETION_TIME_INVALID = new GimbalAttitudeActionError("Completion Time value passed is invalid (<0)")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.error</td></tr></table></html>



##### Description:



<font color="#666">Completion Time value passed is invalid (less than 0).

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


