<div class="article"><h1 ><font color="#AAA">class </font>WaypointMissionState</h1></div>

~~~java
@EXClassNullAway
 final class WaypointMissionState extends MissionState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>MissionState</code></td></tr></table></html>



##### Description:



<font color="#666">All the possible state of <code><a href="/Components/Missions/DJIWaypointMissionOperator.html#djiwaypointmissionoperator">WaypointMissionOperator</a></code>.



##### Class Members:

<div class="api-row" id="djiwaypointmissionstate_notsupported"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionstate_notsupported_inline">NOT_SUPPORTED</a></div></div><div class="inline-doc" id="djiwaypointmissionstate_notsupported_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NOT_SUPPORTED</h6></div>

~~~java
 static final WaypointMissionState NOT_SUPPORTED = new WaypointMissionState("NOT_SUPPORTED")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The connected product does not support waypoint mission.

</div>

<div class="api-row" id="djiwaypointmissionstate_readytoupload"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionstate_readytoupload_inline">READY_TO_UPLOAD</a></div></div><div class="inline-doc" id="djiwaypointmissionstate_readytoupload_inline"

><div class="article"><h6 ><font color="#AAA">final </font>READY_TO_UPLOAD</h6></div>

~~~java
 static final WaypointMissionState READY_TO_UPLOAD = new WaypointMissionState("READY_TO_UPLOAD")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The aircraft is ready to upload a mission.

</div>

<div class="api-row" id="djiwaypointmissionstate_uploading"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionstate_uploading_inline">UPLOADING</a></div></div><div class="inline-doc" id="djiwaypointmissionstate_uploading_inline"

><div class="article"><h6 ><font color="#AAA">final </font>UPLOADING</h6></div>

~~~java
 static final WaypointMissionState UPLOADING = new WaypointMissionState("UPLOADING")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The uploading is started successfully. Detail information for each waypoint is being uploaded one by one.

</div>

<div class="api-row" id="djiwaypointmissionstate_readytoexecute"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionstate_readytoexecute_inline">READY_TO_EXECUTE</a></div></div><div class="inline-doc" id="djiwaypointmissionstate_readytoexecute_inline"

><div class="article"><h6 ><font color="#AAA">final </font>READY_TO_EXECUTE</h6></div>

~~~java
 static final WaypointMissionState READY_TO_EXECUTE = new WaypointMissionState("READY_TO_EXECUTE")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Waypoint mission is uploaded completely and the aircraft is ready to start the execution.

</div>

<div class="api-row" id="djiwaypointmissionstate_executing"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionstate_executing_inline">EXECUTING</a></div></div><div class="inline-doc" id="djiwaypointmissionstate_executing_inline"

><div class="article"><h6 ><font color="#AAA">final </font>EXECUTING</h6></div>

~~~java
 static final WaypointMissionState EXECUTING = new WaypointMissionState("EXECUTING")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The execution is started successfully.

</div>

<div class="api-row" id="djiwaypointmissionstate_executionpaused"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionstate_executionpaused_inline">EXECUTION_PAUSED</a></div></div><div class="inline-doc" id="djiwaypointmissionstate_executionpaused_inline"

><div class="article"><h6 ><font color="#AAA">final </font>EXECUTION_PAUSED</h6></div>

~~~java
 static final WaypointMissionState EXECUTION_PAUSED = new WaypointMissionState("EXECUTION_PAUSED")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Waypoint mission is paused successfully. User can call <code><a href="/Components/Missions/DJIWaypointMissionOperator.html#djiwaypointmissionoperator_resumemission">resumeMission</a></code> to continue the execution.

</div>

<div class="api-row" id="djiwaypointmissionstate_disconnected"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionstate_disconnected_inline">DISCONNECTED</a></div></div><div class="inline-doc" id="djiwaypointmissionstate_disconnected_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DISCONNECTED</h6></div>

~~~java
 static final WaypointMissionState DISCONNECTED = new WaypointMissionState("DISCONNECTED")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The connection between the mobile device, remote controller and aircraft is broken.

</div>

<div class="api-row" id="djiwaypointmissionstate_recovering"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionstate_recovering_inline">RECOVERING</a></div></div><div class="inline-doc" id="djiwaypointmissionstate_recovering_inline"

><div class="article"><h6 ><font color="#AAA">final </font>RECOVERING</h6></div>

~~~java
 static final WaypointMissionState RECOVERING = new WaypointMissionState("RECOVERING")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The connection between the mobile device, remote controller and aircraft is built-up. The operator is synchronizing the state from the aircraft.

</div>

<div class="api-row" id="djiwaypointmissionstate_unknown"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiwaypointmissionstate_unknown_inline">UNKNOWN</a></div></div><div class="inline-doc" id="djiwaypointmissionstate_unknown_inline"

><div class="article"><h6 ><font color="#AAA">final </font>UNKNOWN</h6></div>

~~~java
 static final WaypointMissionState UNKNOWN = new WaypointMissionState("UNKNOWN")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">The state of the operator is unknown. It is the initial state when the operator is just created.

</div>


