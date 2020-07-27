<div class="article"><h1 ><font color="#AAA">class </font>ActionExecutionEvent</h1></div>

~~~java
 interface ActionExecutionEvent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The execution event of a waypoint mission.



##### Class Members:

<div class="api-row" id="djiwaypointv2actionexecutionevent_getpreviousstate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2actionexecutionevent_getpreviousstate_inline">getPreviousState</a></div></div><div class="inline-doc" id="djiwaypointv2actionexecutionevent_getpreviousstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPreviousState</h6></div>

~~~java
@Nullable
    ActionState getPreviousState()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The previous state of the operator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionactionstate">ActionState</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionactionstate">ActionState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2actionexecutionevent_getcurrentstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2actionexecutionevent_getcurrentstate_inline">getCurrentState</a></div></div><div class="inline-doc" id="djiwaypointv2actionexecutionevent_getcurrentstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrentState</h6></div>

~~~java
@NonNull
    ActionState getCurrentState()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The current state of the operator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionactionstate">ActionState</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator_djiwaypointv2missionactionstate">ActionState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2actionexecutionevent_getprogress"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2actionexecutionevent_getprogress_inline">getProgress</a></div></div><div class="inline-doc" id="djiwaypointv2actionexecutionevent_getprogress_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getProgress</h6></div>

~~~java
@Nullable
    ActionExecutionProgress getProgress()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The execution progress of the mission. It is <code>null</code> if there is an error during the execution.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2ActionExecutionProgressInterface.html#djiwaypointv2actionexecutionprogressinterface">ActionExecutionProgress</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIWaypointV2ActionExecutionProgressInterface.html#djiwaypointv2actionexecutionprogressinterface">ActionExecutionProgress</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2actionexecutionevent_geterror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2actionexecutionevent_geterror_inline">getError</a></div></div><div class="inline-doc" id="djiwaypointv2actionexecutionevent_geterror_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getError</h6></div>

~~~java
@Nullable
    DJIWaypointV2Error getError()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The encountered error during the execution if there is any. Otherwise, it is <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError_DJIWaypointV2Error.html#djierror_djiwaypointv2error">DJIWaypointV2Error</a></td><td><font color="#666"><i>An object of <code><a href="/Components/SDKError/DJIError_DJIWaypointV2Error.html#djierror_djiwaypointv2error">DJIWaypointV2Error</a></code>.</i></td></tr></table></html></div>


