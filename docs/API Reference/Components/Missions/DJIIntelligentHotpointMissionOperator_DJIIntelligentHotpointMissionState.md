<div class="article"><h1 ><font color="#AAA">class </font>IntelligentHotpointMissionState</h1></div>

~~~java
@EXClassNullAway
 class IntelligentHotpointMissionState extends MissionState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>MissionState</code></td></tr></table></html>



##### Description:



<font color="#666">The states of the <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator">IntelligentHotpointMissionOperator</a></code>.



##### Class Members:



#### Members

<div class="api-row" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_unknown"><div class="api-col left">Value</div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_unknown_inline">UNKNOWN</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_unknown_inline"

><div class="article"><h6 ><font color="#AAA">final </font>UNKNOWN</h6></div>

~~~java
 static final IntelligentHotpointMissionState UNKNOWN = new IntelligentHotpointMissionState("UNKNOWN")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">The state of the operator is unknown. This is the initial state when the operator has just been created.

</div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_disconnected"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_disconnected_inline">DISCONNECTED</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_disconnected_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DISCONNECTED</h6></div>

~~~java
 static final IntelligentHotpointMissionState DISCONNECTED = new IntelligentHotpointMissionState("DISCONNECTED")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">The state of the operator is unknown. This is the initial state when the operator has just been created.

</div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_recovering"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_recovering_inline">RECOVERING</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_recovering_inline"

><div class="article"><h6 ><font color="#AAA">final </font>RECOVERING</h6></div>

~~~java
 static final IntelligentHotpointMissionState RECOVERING = new IntelligentHotpointMissionState("RECOVERING")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">The connection between the mobile device and aircraft is recovering. At this time, the operator is  synchronizing the state from the aircraft.

</div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_notsupported"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_notsupported_inline">NOT_SUPPORTED</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_notsupported_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NOT_SUPPORTED</h6></div>

~~~java
 static final IntelligentHotpointMissionState NOT_SUPPORTED = new IntelligentHotpointMissionState("NOT_SUPPORTED")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">The connected product does not support Hotpoint mission.

</div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_noready"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_noready_inline">NOT_READY</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_noready_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NOT_READY</h6></div>

~~~java
 static final IntelligentHotpointMissionState NOT_READY = new IntelligentHotpointMissionState("NOT_READY")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">The operator is not ready to start an Intelligent Hotpoint mission.

</div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_readytostart"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_readytostart_inline">READY_TO_START</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_readytostart_inline"

><div class="article"><h6 ><font color="#AAA">final </font>READY_TO_START</h6></div>

~~~java
 static final IntelligentHotpointMissionState READY_TO_START = new IntelligentHotpointMissionState("READY_TO_START")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">The operator is ready to start an Intelligent Hotpoint mission.

</div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_recognizingtarget"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_recognizingtarget_inline">RECOGNIZING_TARGET</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_recognizingtarget_inline"

><div class="article"><h6 ><font color="#AAA">final </font>RECOGNIZING_TARGET</h6></div>

~~~java
 static final IntelligentHotpointMissionState RECOGNIZING_TARGET = new IntelligentHotpointMissionState("RECOGNIZING_TARGET")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">The aircraft's Vision system is recognizing the track object. If recognized the target, the state will change to <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_waitingforconfirmation">WAITING_FOR_CONFIRMATION</a></code>.

</div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_waitingforconfirmation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_waitingforconfirmation_inline">WAITING_FOR_CONFIRMATION</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_waitingforconfirmation_inline"

><div class="article"><h6 ><font color="#AAA">final </font>WAITING_FOR_CONFIRMATION</h6></div>

~~~java
 static final IntelligentHotpointMissionState WAITING_FOR_CONFIRMATION = new IntelligentHotpointMissionState("WAITING_FOR_CONFIRMATION")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">The aircraft has recognized the target and is waiting for confirmation.

</div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_measuringtarget"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_measuringtarget_inline">MEASURING_TARGET</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_measuringtarget_inline"

><div class="article"><h6 ><font color="#AAA">final </font>MEASURING_TARGET</h6></div>

~~~java
 static final IntelligentHotpointMissionState MEASURING_TARGET = new IntelligentHotpointMissionState("MEASURING_TARGET")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Confirm success and when a tracking mission started, The Vision system will measure the track object and calculate the surrounding path. Then it will begin to surround the track target. The state will change  to <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_executing">EXECUTING</a></code>.

</div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_executing"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_executing_inline">EXECUTING</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_executing_inline"

><div class="article"><h6 ><font color="#AAA">final </font>EXECUTING</h6></div>

~~~java
 static final IntelligentHotpointMissionState EXECUTING = new IntelligentHotpointMissionState("EXECUTING")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">The execution is started successfully.

</div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_executionpaused"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_executionpaused_inline">EXECUTION_PAUSED</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_executionpaused_inline"

><div class="article"><h6 ><font color="#AAA">final </font>EXECUTION_PAUSED</h6></div>

~~~java
 static final IntelligentHotpointMissionState EXECUTION_PAUSED = new IntelligentHotpointMissionState("EXECUTION_PAUSED")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Hotpoint mission is paused successfully. User can call <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator_resumemission">resumeMission</a></code> to continue the execution.

</div>


