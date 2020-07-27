<div class="article"><h1 ><font color="#AAA">class </font>FollowMeMissionState</h1></div>

~~~java
@EXClassNullAway
 final class FollowMeMissionState extends MissionState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.followme</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>MissionState</code></td></tr></table></html>



##### Description:



<font color="#666">All the possible state of <code><a href="/Components/Missions/DJIFollowMeMissionOperator.html#djifollowmemissionoperator">FollowMeMissionOperator</a></code>.



##### Class Members:



#### Members

<div class="api-row" id="djifollowmemissionstate_unknown"><div class="api-col left">Value</div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djifollowmemissionstate_unknown_inline">UNKNOWN</a></div></div><div class="inline-doc" id="djifollowmemissionstate_unknown_inline"

><div class="article"><h6 ><font color="#AAA">final </font>UNKNOWN</h6></div>

~~~java
 static final FollowMeMissionState UNKNOWN = new FollowMeMissionState("UNKNOWN")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">The state of the operator is unknown. It is the initial state when the  operator is just created.

</div>

<div class="api-row" id="djifollowmemissionstate_disconnected"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djifollowmemissionstate_disconnected_inline">DISCONNECTED</a></div></div><div class="inline-doc" id="djifollowmemissionstate_disconnected_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DISCONNECTED</h6></div>

~~~java
 static final FollowMeMissionState DISCONNECTED = new FollowMeMissionState("DISCONNECTED")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">The connection between the mobile device and aircraft is lost.

</div>

<div class="api-row" id="djifollowmemissionstate_notsupported"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djifollowmemissionstate_notsupported_inline">NOT_SUPPORTED</a></div></div><div class="inline-doc" id="djifollowmemissionstate_notsupported_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NOT_SUPPORTED</h6></div>

~~~java
 static final FollowMeMissionState NOT_SUPPORTED = new FollowMeMissionState("NOT_SUPPORTED")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">The connected product does not support Follow Me mission.

</div>

<div class="api-row" id="djifollowmemissionstate_recovering"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djifollowmemissionstate_recovering_inline">RECOVERING</a></div></div><div class="inline-doc" id="djifollowmemissionstate_recovering_inline"

><div class="article"><h6 ><font color="#AAA">final </font>RECOVERING</h6></div>

~~~java
 static final FollowMeMissionState RECOVERING = new FollowMeMissionState("RECOVERING")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">The connection between the mobile device and aircraft is built-up. The operator  is synchronizing the state from the aircraft.

</div>

<div class="api-row" id="djifollowmemissionstate_notready"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djifollowmemissionstate_notready_inline">NOT_READY</a></div></div><div class="inline-doc" id="djifollowmemissionstate_notready_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NOT_READY</h6></div>

~~~java
 static final FollowMeMissionState NOT_READY = new FollowMeMissionState("NOT_READY")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">The current state is not ready for uploading a mission.

</div>

<div class="api-row" id="djifollowmemissionstate_readytostart"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djifollowmemissionstate_readytostart_inline">READY_TO_EXECUTE</a></div></div><div class="inline-doc" id="djifollowmemissionstate_readytostart_inline"

><div class="article"><h6 ><font color="#AAA">final </font>READY_TO_EXECUTE</h6></div>

~~~java
 static final FollowMeMissionState READY_TO_EXECUTE = new FollowMeMissionState("READY_TO_EXECUTE")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">The operator is ready to start a Follow Me mission.

</div>

<div class="api-row" id="djifollowmemissionstate_executing"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djifollowmemissionstate_executing_inline">EXECUTING</a></div></div><div class="inline-doc" id="djifollowmemissionstate_executing_inline"

><div class="article"><h6 ><font color="#AAA">final </font>EXECUTING</h6></div>

~~~java
 static final FollowMeMissionState EXECUTING = new FollowMeMissionState("EXECUTING")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">The mission execution is started successfully.

</div>

<div class="api-row" id="djifollowmemissionstate_gotstuck"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djifollowmemissionstate_gotstuck_inline">GOT_STUCK</a></div></div><div class="inline-doc" id="djifollowmemissionstate_gotstuck_inline"

><div class="article"><h6 ><font color="#AAA">final </font>GOT_STUCK</h6></div>

~~~java
 static final FollowMeMissionState GOT_STUCK = new FollowMeMissionState("GOT_STUCK")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">The mission execution is not executing successfully.

</div>


