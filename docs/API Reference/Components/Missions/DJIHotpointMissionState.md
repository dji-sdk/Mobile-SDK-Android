<div class="article"><h1 ><font color="#AAA">class </font>HotpointMissionState</h1></div>

~~~java
@EXClassNullAway
 class HotpointMissionState extends MissionState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>MissionState</code></td></tr></table></html>



##### Description:



<font color="#666">States of <code><a href="/Components/Missions/DJIHotpointMissionOperator.html#djihotpointmissionoperator">HotpointMissionOperator</a></code>.



##### Class Members:



#### Members

<div class="api-row" id="djihotpointmissionstate_unknown"><div class="api-col left">Value</div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionstate_unknown_inline">UNKNOWN</a></div></div><div class="inline-doc" id="djihotpointmissionstate_unknown_inline"

><div class="article"><h6 ><font color="#AAA">final </font>UNKNOWN</h6></div>

~~~java
 static final HotpointMissionState UNKNOWN = new HotpointMissionState("UNKNOWN")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">The state of the operator is unknown. This is the initial state when the operator has just been created.

</div>

<div class="api-row" id="djihotpointmissionstate_disconnected"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionstate_disconnected_inline">DISCONNECTED</a></div></div><div class="inline-doc" id="djihotpointmissionstate_disconnected_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DISCONNECTED</h6></div>

~~~java
 static final HotpointMissionState DISCONNECTED = new HotpointMissionState("DISCONNECTED")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">The connection between the mobile device and aircraft is broken.

</div>

<div class="api-row" id="djihotpointmissionstate_recovering"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionstate_recovering_inline">RECOVERING</a></div></div><div class="inline-doc" id="djihotpointmissionstate_recovering_inline"

><div class="article"><h6 ><font color="#AAA">final </font>RECOVERING</h6></div>

~~~java
 static final HotpointMissionState RECOVERING = new HotpointMissionState("RECOVERING")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">The connection between the mobile device and aircraft is recovering. At this time, the operator is synchronizing the state from the aircraft.

</div>

<div class="api-row" id="djihotpointmissionstate_notsupported"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionstate_notsupported_inline">NOT_SUPPORTED</a></div></div><div class="inline-doc" id="djihotpointmissionstate_notsupported_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NOT_SUPPORTED</h6></div>

~~~java
 static final HotpointMissionState NOT_SUPPORTED = new HotpointMissionState("NOT_SUPPORTED")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">The connected product does not support Hotpoint mission.

</div>

<div class="api-row" id="djihotpointmissionstate_readytoexecute"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionstate_readytoexecute_inline">READY_TO_EXECUTE</a></div></div><div class="inline-doc" id="djihotpointmissionstate_readytoexecute_inline"

><div class="article"><h6 ><font color="#AAA">final </font>READY_TO_EXECUTE</h6></div>

~~~java
 static final HotpointMissionState READY_TO_EXECUTE = new HotpointMissionState("READY_TO_EXECUTE")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Mission is uploaded completely and the aircraft is ready to start the execution.

</div>

<div class="api-row" id="djihotpointmissionstate_initialphase"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionstate_initialphase_inline">INITIAL_PHASE</a></div></div><div class="inline-doc" id="djihotpointmissionstate_initialphase_inline"

><div class="article"><h6 ><font color="#AAA">final </font>INITIAL_PHASE</h6></div>

~~~java
 static final HotpointMissionState INITIAL_PHASE = new HotpointMissionState("INITIAL_PHASE")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">The aircraft is moving towards the start point of the Hotpoint mission.

</div>

<div class="api-row" id="djihotpointmissionstate_executing"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionstate_executing_inline">EXECUTING</a></div></div><div class="inline-doc" id="djihotpointmissionstate_executing_inline"

><div class="article"><h6 ><font color="#AAA">final </font>EXECUTING</h6></div>

~~~java
 static final HotpointMissionState EXECUTING = new HotpointMissionState("EXECUTING")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">The execution is started successfully.

</div>

<div class="api-row" id="djihotpointmissionstate_executionpaused"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionstate_executionpaused_inline">EXECUTION_PAUSED</a></div></div><div class="inline-doc" id="djihotpointmissionstate_executionpaused_inline"

><div class="article"><h6 ><font color="#AAA">final </font>EXECUTION_PAUSED</h6></div>

~~~java
 static final HotpointMissionState EXECUTION_PAUSED = new HotpointMissionState("EXECUTION_PAUSED")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Hotpoint mission is paused successfully. User can call <code><a href="/Components/Missions/DJIHotpointMissionOperator.html#djihotpointmissionoperator_resumemission">resume</a></code> to continue the execution.

</div>


