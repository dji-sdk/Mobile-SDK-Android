<div class="article"><h1 ><font color="#AAA">class </font>TapFlyMissionState</h1></div>

~~~java
@EXClassNullAway
 final class TapFlyMissionState extends MissionState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.tapfly</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>MissionState</code></td></tr></table></html>



##### Description:



<font color="#666">All the possible states of <code><a href="/Components/Missions/DJITapFlyMissionOperator.html#djitapflymissionoperator">TapFlyMissionOperator</a></code>.



##### Class Members:



#### Members

<div class="api-row" id="djitapflymissionstate_unknown"><div class="api-col left">Value</div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djitapflymissionstate_unknown_inline">UNKNOWN</a></div></div><div class="inline-doc" id="djitapflymissionstate_unknown_inline"

><div class="article"><h6 ><font color="#AAA">final </font>UNKNOWN</h6></div>

~~~java
 static final TapFlyMissionState UNKNOWN = new TapFlyMissionState("UNKNOWN")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">The state of the operator is unknown. This is the initial state when the operator is  first created.

</div>

<div class="api-row" id="djitapflymissionstate_idle"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djitapflymissionstate_idle_inline">IDLE</a></div></div><div class="inline-doc" id="djitapflymissionstate_idle_inline"

><div class="article"><h6 ><font color="#AAA">final </font>IDLE</h6></div>

~~~java
 static final TapFlyMissionState IDLE = new TapFlyMissionState("IDLE")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">The operator is in idle state

</div>

<div class="api-row" id="djitapflymissionstate_executionstarting"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djitapflymissionstate_executionstarting_inline">EXECUTION_STARTING</a></div></div><div class="inline-doc" id="djitapflymissionstate_executionstarting_inline"

><div class="article"><h6 ><font color="#AAA">final </font>EXECUTION_STARTING</h6></div>

~~~java
 static final TapFlyMissionState EXECUTION_STARTING = new TapFlyMissionState("EXECUTION_STARTING")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">The start execution command has been called but the aircraft hasn't yet acknowledged it has started. No other commands should be  called when in this state. The next state is either disconnected,  executing or readyToExecute.

</div>

<div class="api-row" id="djitapflymissionstate_disconnected"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djitapflymissionstate_disconnected_inline">DISCONNECTED</a></div></div><div class="inline-doc" id="djitapflymissionstate_disconnected_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DISCONNECTED</h6></div>

~~~java
 static final TapFlyMissionState DISCONNECTED = new TapFlyMissionState("DISCONNECTED")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">The connection between the mobile device and aircraft is broken.

</div>

<div class="api-row" id="djitapflymissionstate_recovering"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djitapflymissionstate_recovering_inline">RECOVERING</a></div></div><div class="inline-doc" id="djitapflymissionstate_recovering_inline"

><div class="article"><h6 ><font color="#AAA">final </font>RECOVERING</h6></div>

~~~java
 static final TapFlyMissionState RECOVERING = new TapFlyMissionState("RECOVERING")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">The connection between the mobile device and aircraft is recovering.  In this state, the operator is synchronizing the state from the aircraft.

</div>

<div class="api-row" id="djitapflymissionstate_notsupported"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djitapflymissionstate_notsupported_inline">NOT_SUPPORT</a></div></div><div class="inline-doc" id="djitapflymissionstate_notsupported_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NOT_SUPPORT</h6></div>

~~~java
 static final TapFlyMissionState NOT_SUPPORT = new TapFlyMissionState("NOT_SUPPORT")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">The connected product does not support TapFly mission.

</div>

<div class="api-row" id="djitapflymissionstate_cannotstart"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djitapflymissionstate_cannotstart_inline">CAN_NOT_START</a></div></div><div class="inline-doc" id="djitapflymissionstate_cannotstart_inline"

><div class="article"><h6 ><font color="#AAA">final </font>CAN_NOT_START</h6></div>

~~~java
 static final TapFlyMissionState CAN_NOT_START = new TapFlyMissionState("CAN_NOT_START")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">There is an existing error stopping the TapFly mission to start.  

</div>

<div class="api-row" id="djitapflymissionstate_executing"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djitapflymissionstate_executing_inline">EXECUTING</a></div></div><div class="inline-doc" id="djitapflymissionstate_executing_inline"

><div class="article"><h6 ><font color="#AAA">final </font>EXECUTING</h6></div>

~~~java
 static final TapFlyMissionState EXECUTING = new TapFlyMissionState("EXECUTING")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">The operator is executing a TapFly mission.

</div>

<div class="api-row" id="djitapflymissionstate_executionpaused"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djitapflymissionstate_executionpaused_inline">EXECUTION_PAUSED</a></div></div><div class="inline-doc" id="djitapflymissionstate_executionpaused_inline"

><div class="article"><h6 ><font color="#AAA">final </font>EXECUTION_PAUSED</h6></div>

~~~java
 static final TapFlyMissionState EXECUTION_PAUSED = new TapFlyMissionState("EXECUTION_PAUSED")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">The execution of the TapFly mission is paused. User can pause or resume a  TapFly mission by pressing the pause button on the physical remote controller.

</div>

<div class="api-row" id="djitapflymissionstate_executionresetting"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djitapflymissionstate_executionresetting_inline">EXECUTION_RESETTING</a></div></div><div class="inline-doc" id="djitapflymissionstate_executionresetting_inline"

><div class="article"><h6 ><font color="#AAA">final </font>EXECUTION_RESETTING</h6></div>

~~~java
 static final TapFlyMissionState EXECUTION_RESETTING = new TapFlyMissionState("EXECUTION_RESETTING")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">The TapFly mission cannot continue the execution. The execution is being stopped automatically.

</div>


