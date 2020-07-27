<div class="article"><h1 ><font color="#AAA">class </font>PanoramaMissionEvent</h1></div>

~~~java
@EXClassNullAway
 class PanoramaMissionEvent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">This class encapsulates all the state changes of the Panorama mission operator.



##### Class Members:

<div class="api-row" id="djipanoramamissionevent_previousstate"><div class="api-col left">Previous State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipanoramamissionevent_previousstate_inline">getPreviousState</a></div></div><div class="inline-doc" id="djipanoramamissionevent_previousstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPreviousState</h6></div>

~~~java
@Nullable
 PanoramaMissionState getPreviousState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">The previous state of the operator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIPanoramaMissionState.html#djipanoramamissionstate">PanoramaMissionState</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIPanoramaMissionState.html#djipanoramamissionstate">PanoramaMissionState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djipanoramamissionevent_currentstate"><div class="api-col left">Current State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipanoramamissionevent_currentstate_inline">getCurrentState</a></div></div><div class="inline-doc" id="djipanoramamissionevent_currentstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrentState</h6></div>

~~~java
@NonNull
 PanoramaMissionState getCurrentState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">The current state of the operator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIPanoramaMissionState.html#djipanoramamissionstate">PanoramaMissionState</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIPanoramaMissionState.html#djipanoramamissionstate">PanoramaMissionState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djipanoramamissionevent_status"><div class="api-col left">Status</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipanoramamissionevent_status_inline">getExecutionState</a></div></div><div class="inline-doc" id="djipanoramamissionevent_status_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getExecutionState</h6></div>

~~~java
@Nullable
 PanoramaMissionExecutionState getExecutionState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">The detailed state of the executing Panorama mission. It is only valid when  <code><a href="/Components/Missions/DJIPanoramaMissionOperator.html#djipanoramamissionoperator_currentstate">getCurrentState</a></code> is  <code><a href="/Components/Missions/DJIPanoramaMissionState.html#djipanoramamissionstate_executing">EXECUTING</a></code>. For the other states, it is <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIPanoramaMission_DJIPanoramaMissionStatus.html#djipanoramamission_djipanoramamissionstatus">PanoramaMissionExecutionState</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIPanoramaMission_DJIPanoramaMissionStatus.html#djipanoramamission_djipanoramamissionstatus">PanoramaMissionExecutionState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djipanoramamissionevent_error"><div class="api-col left">Error</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djipanoramamissionevent_error_inline">getError</a></div></div><div class="inline-doc" id="djipanoramamissionevent_error_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getError</h6></div>

~~~java
@Nullable
 DJIError getError() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.panorama</td></tr></table></html>



##### Description:



<font color="#666">The error of DJIPanoramaMissionEvent.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>An object of <code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code>.</i></td></tr></table></html></div>


