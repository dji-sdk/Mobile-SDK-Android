<div class="article"><h1 ><font color="#AAA">class </font>ActiveTrackState</h1></div>

~~~java
@EXClassNullAway
 class ActiveTrackState extends MissionState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>MissionState</code></td></tr></table></html>



##### Description:



<font color="#666">All the possible states of <code><a href="/Components/Missions/DJIActiveTrackMissionOperator.html#djiactivetrackmissionoperator">ActiveTrackOperator</a></code>.



##### Class Members:



#### Members

<div class="api-row" id="djiactivetrackmissionstate_unknown"><div class="api-col left">Value</div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionstate_unknown_inline">UNKNOWN</a></div></div><div class="inline-doc" id="djiactivetrackmissionstate_unknown_inline"

><div class="article"><h6 ><font color="#AAA">final </font>UNKNOWN</h6></div>

~~~java
 static final ActiveTrackState UNKNOWN = new ActiveTrackState("UNKNOWN")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The state of the operator is unknown. It is the initial state when the  operator is just created.

</div>

<div class="api-row" id="djiactivetrackmissionstate_disconnected"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionstate_disconnected_inline">DISCONNECTED</a></div></div><div class="inline-doc" id="djiactivetrackmissionstate_disconnected_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DISCONNECTED</h6></div>

~~~java
 static final ActiveTrackState DISCONNECTED = new ActiveTrackState("DISCONNECTED")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The connection between the mobile device and aircraft is broken.

</div>

<div class="api-row" id="djiactivetrackmissionstate_recovering"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionstate_recovering_inline">RECOVERING</a></div></div><div class="inline-doc" id="djiactivetrackmissionstate_recovering_inline"

><div class="article"><h6 ><font color="#AAA">final </font>RECOVERING</h6></div>

~~~java
 static final ActiveTrackState RECOVERING = new ActiveTrackState("RECOVERING")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The connection between the mobile device and aircraft is recovering.  In this state, the operator is synchronizing the state from the aircraft.

</div>

<div class="api-row" id="djiactivetrackmissionstate_notsupported"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionstate_notsupported_inline">NOT_SUPPORT</a></div></div><div class="inline-doc" id="djiactivetrackmissionstate_notsupported_inline"

><div class="article"><h6 ><font color="#AAA">final </font>NOT_SUPPORT</h6></div>

~~~java
 static final ActiveTrackState NOT_SUPPORT = new ActiveTrackState("NOT_SUPPORT")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The connected product does not support ActiveTrack mission.

</div>

<div class="api-row" id="djiactivetrackmissionstate_cannotstart"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionstate_cannotstart_inline">CANNOT_START</a></div></div><div class="inline-doc" id="djiactivetrackmissionstate_cannotstart_inline"

><div class="article"><h6 ><font color="#AAA">final </font>CANNOT_START</h6></div>

~~~java
 static final ActiveTrackState CANNOT_START = new ActiveTrackState("CANNOT_START")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">There is existing error stopping any ActiveTrack mission to start.  

</div>

<div class="api-row" id="djiactivetrackmissionstate_autosensing"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionstate_autosensing_inline">AUTO_SENSING</a></div></div><div class="inline-doc" id="djiactivetrackmissionstate_autosensing_inline"

><div class="article"><h6 ><font color="#AAA">final </font>AUTO_SENSING</h6></div>

~~~java
 static final ActiveTrackState AUTO_SENSING = new ActiveTrackState("AUTO_SENSING")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The active track sensor is enabled and the aircraft is detecting the targets automatically.  If there is target found, user can choose the right tracking subject. In this state, user can  still manually draw the rectangle.

</div>

<div class="api-row" id="djiactivetrackmissionstate_autosensingforquickshot"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionstate_autosensingforquickshot_inline">AUTO_SENSING_FOR_QUICK_SHOT</a></div></div><div class="inline-doc" id="djiactivetrackmissionstate_autosensingforquickshot_inline"

><div class="article"><h6 ><font color="#AAA">final </font>AUTO_SENSING_FOR_QUICK_SHOT</h6></div>

~~~java
 static final ActiveTrackState
        AUTO_SENSING_FOR_QUICK_SHOT = new ActiveTrackState("AUTO_SENSING_FOR_QUICK_SHOT")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The quick shot sensor is enabled.

</div>

<div class="api-row" id="djiactivetrackmissionstate_detectinghuman"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionstate_detectinghuman_inline">DETECTING_HUMAN</a></div></div><div class="inline-doc" id="djiactivetrackmissionstate_detectinghuman_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DETECTING_HUMAN</h6></div>

~~~java
 static final ActiveTrackState DETECTING_HUMAN = new ActiveTrackState("DETECTING_HUMAN")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Gesture mode is enabled and the aircraft is looking for a target automatically.  If a target is found, the operator will go to state <code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_waitingforconfirmation">WAITING_FOR_CONFIRMATION</a></code>  or <code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_cannotconfirm">CANNOT_CONFIRM</a></code>.

</div>

<div class="api-row" id="djiactivetrackmissionstate_waitingforconfirmation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionstate_waitingforconfirmation_inline">WAITING_FOR_CONFIRMATION</a></div></div><div class="inline-doc" id="djiactivetrackmissionstate_waitingforconfirmation_inline"

><div class="article"><h6 ><font color="#AAA">final </font>WAITING_FOR_CONFIRMATION</h6></div>

~~~java
 static final ActiveTrackState WAITING_FOR_CONFIRMATION = new ActiveTrackState("WAITING_FOR_CONFIRMATION")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Target is found. Camera is already tracking the target. In order to make the  aircraft follow the target, the confirmation from user is required. Once the  target is confirmed, the state will become  <code><a href="/Components/Missions/DJIActiveTrackMissionState.html#djiactivetrackmissionstate_aircraftfollowing">AIRCRAFT_FOLLOWING</a></code>.

</div>

<div class="api-row" id="djiactivetrackmissionstate_cannotconfirm"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionstate_cannotconfirm_inline">CANNOT_CONFIRM</a></div></div><div class="inline-doc" id="djiactivetrackmissionstate_cannotconfirm_inline"

><div class="article"><h6 ><font color="#AAA">final </font>CANNOT_CONFIRM</h6></div>

~~~java
 static final ActiveTrackState CANNOT_CONFIRM = new ActiveTrackState("CANNOT_CONFIRM")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Target is found. Camera is already tracking the target but there is an error  stopping the aircraft to follow the target. Use <code><a href="/Components/Missions/DJIActiveTrackTrackingState.html#djiactivetracktrackingstate_cannotconfirmreason">getReason</a></code>  in <code><a href="/Components/Missions/DJIActiveTrackTrackingState.html#djiactivetracktrackingstate">ActiveTrackTrackingState</a></code> to check the reason.

</div>

<div class="api-row" id="djiactivetrackmissionstate_aircraftfollowing"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionstate_aircraftfollowing_inline">AIRCRAFT_FOLLOWING</a></div></div><div class="inline-doc" id="djiactivetrackmissionstate_aircraftfollowing_inline"

><div class="article"><h6 ><font color="#AAA">final </font>AIRCRAFT_FOLLOWING</h6></div>

~~~java
 static final ActiveTrackState AIRCRAFT_FOLLOWING = new ActiveTrackState("AIRCRAFT_FOLLOWING")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Target is found. Camera is already tracking the target and the aircraft is following the target.

</div>

<div class="api-row" id="djiactivetrackmissionstate_onlycamerafollowing"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionstate_onlycamerafollowing_inline">ONLY_CAMERA_FOLLOWING</a></div></div><div class="inline-doc" id="djiactivetrackmissionstate_onlycamerafollowing_inline"

><div class="article"><h6 ><font color="#AAA">final </font>ONLY_CAMERA_FOLLOWING</h6></div>

~~~java
 static final ActiveTrackState ONLY_CAMERA_FOLLOWING = new ActiveTrackState("ONLY_CAMERA_FOLLOWING")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The operator is executing an ActiveTrack mission in Splotlight mode or  Spotlight Pro mode. The target is found and camera is following the target.

</div>

<div class="api-row" id="djiactivetrackmissionstate_quickshot"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionstate_quickshot_inline">PERFORMING_QUICK_SHOT</a></div></div><div class="inline-doc" id="djiactivetrackmissionstate_quickshot_inline"

><div class="article"><h6 ><font color="#AAA">final </font>PERFORMING_QUICK_SHOT</h6></div>

~~~java
 static final ActiveTrackState PERFORMING_QUICK_SHOT = new ActiveTrackState("PERFORMING_QUICK_SHOT")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The operator is executing a QuickShot ActiveTrack mission.

</div>

<div class="api-row" id="djiactivetrackmissionstate_findingtrackedtarget"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionstate_findingtrackedtarget_inline">FINDING_TRACKED_TARGET</a></div></div><div class="inline-doc" id="djiactivetrackmissionstate_findingtrackedtarget_inline"

><div class="article"><h6 ><font color="#AAA">final </font>FINDING_TRACKED_TARGET</h6></div>

~~~java
 static final ActiveTrackState FINDING_TRACKED_TARGET = new ActiveTrackState("FINDING_TRACKED_TARGET")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">ActiveTrack is started but the target is lost. The vision system is detecting  the previously found target.

</div>

<div class="api-row" id="djiactivetrackmissionstate_idle"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmissionstate_idle_inline">IDLE</a></div></div><div class="inline-doc" id="djiactivetrackmissionstate_idle_inline"

><div class="article"><h6 ><font color="#AAA">final </font>IDLE</h6></div>

~~~java
 static final ActiveTrackState IDLE = new ActiveTrackState("IDLE")
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The mission is idle.

</div>


