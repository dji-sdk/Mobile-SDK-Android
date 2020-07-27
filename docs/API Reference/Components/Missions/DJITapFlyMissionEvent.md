<div class="article"><h1 ><font color="#AAA">class </font>TapFlyMissionEvent</h1></div>

~~~java
 class TapFlyMissionEvent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">This class encapsulates all the state changes of the TapFly mission operator.



##### Class Members:

<div class="api-row" id="djitapflymissionevent_previousstate"><div class="api-col left">Previous State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djitapflymissionevent_previousstate_inline">getPreviousState</a></div></div><div class="inline-doc" id="djitapflymissionevent_previousstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPreviousState</h6></div>

~~~java
@Nullable
 TapFlyMissionState getPreviousState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">The previous state of the operator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJITapFlyMissionState.html#djitapflymissionstate">TapFlyMissionState</a></td><td><font color="#666"><i>A object of <code><a href="/Components/Missions/DJITapFlyMissionState.html#djitapflymissionstate">TapFlyMissionState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djitapflymissionevent_currentstate"><div class="api-col left">Current State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djitapflymissionevent_currentstate_inline">getCurrentState</a></div></div><div class="inline-doc" id="djitapflymissionevent_currentstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrentState</h6></div>

~~~java
@NonNull
 TapFlyMissionState getCurrentState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">The current state of the operator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJITapFlyMissionState.html#djitapflymissionstate">TapFlyMissionState</a></td><td><font color="#666"><i>A object of <code><a href="/Components/Missions/DJITapFlyMissionState.html#djitapflymissionstate">TapFlyMissionState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djitapflymissionevent_executionstate"><div class="api-col left">Execution State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djitapflymissionevent_executionstate_inline">getExecutionState</a></div></div><div class="inline-doc" id="djitapflymissionevent_executionstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getExecutionState</h6></div>

~~~java
@Nullable
 TapFlyExecutionState getExecutionState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">The detailed state of the executing TapFly mission. It is only valid  when <code><a href="/Components/Missions/DJITapFlyMissionEvent.html#djitapflymissionevent_currentstate">getCurrentState</a></code> is one of the following:  <ul> <li><code><a href="/Components/Missions/DJITapFlyMissionState.html#djitapflymissionstate_executing">EXECUTING</a></code> </li> <li><code><a href="/Components/Missions/DJITapFlyMissionState.html#djitapflymissionstate_executionpaused">EXECUTION_PAUSED</a></code> </li> </ul> For the other states, it is <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJITapFlyMission_DJITapFlyExecutionState.html#djitapflymission_djitapflyexecutionstate">TapFlyExecutionState</a></td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJITapFlyMission_DJITapFlyExecutionState.html#djitapflymission_djitapflyexecutionstate">TapFlyExecutionState</a></code> object.</i></td></tr></table></html></div>

<div class="api-row" id="djitapflymissionevent_error"><div class="api-col left">Error</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djitapflymissionevent_error_inline">getError</a></div></div><div class="inline-doc" id="djitapflymissionevent_error_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getError</h6></div>

~~~java
@Nullable
 DJIError getError() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">The encountered error if any. Otherwise, it is <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>A <code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code> object.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djitapflymissionstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJITapFlyMissionState.html">TapFlyMissionState</a></div></div>
