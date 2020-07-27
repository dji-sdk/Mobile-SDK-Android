<div class="article"><h1 ><font color="#AAA">class </font>MissionControlError</h1></div>

~~~java
 class MissionControlError extends DJIError 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.error</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code></td></tr></table></html>



##### Description:



<font color="#666">Defines all MissionControl related errors.



##### Class Members:



#### Members

<div class="api-row" id="djimissioncontrolerror_timelineerrorcantschedulewhilerunning"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djimissioncontrolerror_timelineerrorcantschedulewhilerunning_inline">CANNOT_SCHEDULE_WHILE_RUNNING</a></div></div><div class="inline-doc" id="djimissioncontrolerror_timelineerrorcantschedulewhilerunning_inline"

><div class="article"><h6 ><font color="#AAA">final </font>CANNOT_SCHEDULE_WHILE_RUNNING</h6></div>

~~~java
 static final MissionControlError
        CANNOT_SCHEDULE_WHILE_RUNNING = new MissionControlError("Cannot schedule new element while the timeline was running")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.error</td></tr></table></html>



##### Description:



<font color="#666">Tried to schedule new element while the Timeline was running.

</div>

<div class="api-row" id="djimissioncontrolerror_timelineerrornotpausable"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djimissioncontrolerror_timelineerrornotpausable_inline">NOT_PAUSABLE</a></div></div><div class="inline-doc" id="djimissioncontrolerror_timelineerrornotpausable_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NOT_PAUSABLE</h6></div>

~~~java
 static final MissionControlError
        NOT_PAUSABLE = new MissionControlError("The action is not pausable, but timeline will pause to start next action")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.error</td></tr></table></html>



##### Description:



<font color="#666">Unsupported feature error. Where possible: This error will be returned by the function for a  special feature interface when the feature is not supported by the device.

</div>

<div class="api-row" id="djimissioncontrolerror_timelineerrornotresumable"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djimissioncontrolerror_timelineerrornotresumable_inline">NOT_RESUMABLE</a></div></div><div class="inline-doc" id="djimissioncontrolerror_timelineerrornotresumable_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NOT_RESUMABLE</h6></div>

~~~java
 static final MissionControlError
        NOT_RESUMABLE = new MissionControlError("The action is not resumable, but timeline will resume to start next action")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.error</td></tr></table></html>



##### Description:



<font color="#666">Unsupported feature error. Where possible: This error will be returned by the function for a  special feature interface when the feature is not supported by the device.

</div>

<div class="api-row" id="djimissioncontrolerror_timelineerroroutofbounds"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djimissioncontrolerror_timelineerroroutofbounds_inline">TIMELINE_ELEMENT_OUT_OF_BOUNDS</a></div></div><div class="inline-doc" id="djimissioncontrolerror_timelineerroroutofbounds_inline"

><div class="article"><h6 ><font color="#AAA">final </font>TIMELINE_ELEMENT_OUT_OF_BOUNDS</h6></div>

~~~java
 static final MissionControlError
        TIMELINE_ELEMENT_OUT_OF_BOUNDS = new MissionControlError("The index of item to be executed is out of bounds")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.error</td></tr></table></html>



##### Description:



<font color="#666">Cannot start the timeline because the index of to be executed item is out of bounds.

</div>

<div class="api-row" id="djimissioncontrolerror_timelineerroralreadyrunning"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djimissioncontrolerror_timelineerroralreadyrunning_inline">ALREADY_RUNNING</a></div></div><div class="inline-doc" id="djimissioncontrolerror_timelineerroralreadyrunning_inline"

><div class="article"><h6 ><font color="#AAA">final </font>ALREADY_RUNNING</h6></div>

~~~java
 static final MissionControlError
        ALREADY_RUNNING = new MissionControlError("The timeline is already in running")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.error</td></tr></table></html>



##### Description:



<font color="#666">Cannot start the timeline while the Timeline is running.

</div>

<div class="api-row" id="djimissioncontrolerror_timelineerrornotrunning"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djimissioncontrolerror_timelineerrornotrunning_inline">NOT_RUNNING</a></div></div><div class="inline-doc" id="djimissioncontrolerror_timelineerrornotrunning_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NOT_RUNNING</h6></div>

~~~java
 static final MissionControlError
        NOT_RUNNING = new MissionControlError("The timeline is not running")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.error</td></tr></table></html>



##### Description:



<font color="#666">Timeline is not running.

</div>

<div class="api-row" id="djimissioncontrolerror_triggererroractionnull"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djimissioncontrolerror_triggererroractionnull_inline">ACTION_IS_NULL</a></div></div><div class="inline-doc" id="djimissioncontrolerror_triggererroractionnull_inline"

><div class="article"><h6 ><font color="#AAA">final </font>ACTION_IS_NULL</h6></div>

~~~java
 static final MissionControlError
        ACTION_IS_NULL = new MissionControlError("The trigger action is triggered, but the action object is null")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.error</td></tr></table></html>



##### Description:



<font color="#666">Trigger action is triggered, but the action object is null.

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


