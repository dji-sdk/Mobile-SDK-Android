<div class="article"><h1 ><font color="#AAA">class </font>ActiveTrackTrackingState</h1></div>

~~~java
@EXClassNullAway
 class ActiveTrackTrackingState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The tracking state of the ActiveTrack mission that is executing.



##### Class Members:

<div class="api-row" id="djiactivetracktrackingstate_state"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetracktrackingstate_state_inline">getState</a></div></div><div class="inline-doc" id="djiactivetracktrackingstate_state_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getState</h6></div>

~~~java
@Nullable
 ActiveTrackTargetState getState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The state of the target being tracked.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIActiveTrackTrackingState.html#djiactivetracktargetstate">ActiveTrackTargetState</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIActiveTrackTrackingState.html#djiactivetracktargetstate">ActiveTrackTargetState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetracktrackingstate_targettype"><div class="api-col left">Target Type</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetracktrackingstate_targettype_inline">getType</a></div></div><div class="inline-doc" id="djiactivetracktrackingstate_targettype_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getType</h6></div>

~~~java
@Nullable
 ActiveTrackTargetType getType() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The type of the target being tracked.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIActiveTrackTrackingState.html#djiactivetracktargettype">ActiveTrackTargetType</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIActiveTrackTrackingState.html#djiactivetracktargettype">ActiveTrackTargetType</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetracktrackingstate_targetrect"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetracktrackingstate_targetrect_inline">getTargetRect</a></div></div><div class="inline-doc" id="djiactivetracktrackingstate_targetrect_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTargetRect</h6></div>

~~~java
@Nullable
 RectF getTargetRect() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">A rectangle in the live video view image that represents the target being tracked.  The rectangle is normalized to [0,1] where (0,0) is the top left of the video  preview and (1,1) is the bottom right.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">RectF</td><td><font color="#666"><i>A RectF object.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetracktrackingstate_cannotconfirmreason"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetracktrackingstate_cannotconfirmreason_inline">getReason</a></div></div><div class="inline-doc" id="djiactivetracktrackingstate_cannotconfirmreason_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getReason</h6></div>

~~~java
@NonNull
 ActiveTrackCannotConfirmReason getReason() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Reason why the target cannot be confirmed by the user. It is useful when  <code><a href="/Components/Missions/DJIActiveTrackTrackingState.html#djiactivetracktrackingstate_state">getState</a></code> is  <code><a href="/Components/Missions/DJIActiveTrackTrackingState.html#djiactivetracktargetstate_cannotconfirm">CANNOT_CONFIRM</a></code>.  Otherwise, it is  <code><a href="/Components/Missions/DJIActiveTrackTrackingState.html#djiactivetrackcannotconfirmreason_none">NONE</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIActiveTrackTrackingState.html#djiactivetrackcannotconfirmreason">ActiveTrackCannotConfirmReason</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIActiveTrackTrackingState.html#djiactivetrackcannotconfirmreason">ActiveTrackCannotConfirmReason</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetracktrackingstate_targetindex"><div class="api-col left">Target Index</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetracktrackingstate_targetindex_inline">getTargetIndex</a></div></div><div class="inline-doc" id="djiactivetracktrackingstate_targetindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTargetIndex</h6></div>

~~~java
 int getTargetIndex() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">An int value of target index.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of target index.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetracktrackingstate_progress"><div class="api-col left">Progress</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetracktrackingstate_progress_inline">getCompletionPercentage</a></div></div><div class="inline-doc" id="djiactivetracktrackingstate_progress_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCompletionPercentage</h6></div>

~~~java
 int getCompletionPercentage() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The progress of the executing QuickShot mission. Only applicable when  <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_mode">setMode</a></code> is <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_djiactivetrackmode_quickshot">QUICK_SHOT</a></code>.  For other modes, it is always 0.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the progress.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetracktrackingstate_autosensedsubjects"><div class="api-col left">Auto-sensed Subjects</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetracktrackingstate_autosensedsubjects_inline">getAutoSensedSubjects</a></div></div><div class="inline-doc" id="djiactivetracktrackingstate_autosensedsubjects_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAutoSensedSubjects</h6></div>

~~~java
@Nullable
 SubjectSensingState[] getAutoSensedSubjects() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The auto-sensed subjects after enabling auto sensing.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIActiveTrackMission_DJISubjectSensingState.html#djiactivetrackmission_djisubjectsensingstate">SubjectSensingState</a>[]</td><td><font color="#666"><i>An array of <code><a href="/Components/Missions/DJIActiveTrackMission_DJISubjectSensingState.html#djiactivetrackmission_djisubjectsensingstate">SubjectSensingState</a></code></i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiactivetrackcannotconfirmreason"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiactivetrackcannotconfirmreason_inline">ActiveTrackCannotConfirmReason</a></div></div><div class="inline-doc" id="djiactivetrackcannotconfirmreason_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ActiveTrackCannotConfirmReason</h6></div>

~~~java
@EXClassNullAway
 enum ActiveTrackCannotConfirmReason 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The reason why user is not allowed to confirm the current target.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetrackcannotconfirmreason_none_inline"></a>NONE</td><td><font color="#666">None.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetrackcannotconfirmreason_unstabletarget_inline"></a>UNSTABLE_TARGET</td><td><font color="#666">The target is unstable.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetrackcannotconfirmreason_targettoohigh_inline"></a>TARGET_TOO_HIGH</td><td><font color="#666">The target position is too high.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetrackcannotconfirmreason_blockedbyobstacle_inline"></a>BLOCKED_BY_OBSTACLE</td><td><font color="#666">There is an obstacle between the aircraft and the target that is blocking the target.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetrackcannotconfirmreason_gimbalattitudeerror_inline"></a>GIMBAL_ATTITUDE_ERROR</td><td><font color="#666">The gimbal's attitude is pointing to the ground.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetrackcannotconfirmreason_targettoofar_inline"></a>TARGET_TOO_FAR</td><td><font color="#666">The target is too far away from the aircraft.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetrackcannotconfirmreason_targettooclose_inline"></a>TARGET_TOO_CLOSE</td><td><font color="#666">The target is too close to the aircraft.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetrackcannotconfirmreason_aircrafttoohigh_inline"></a>AIRCRAFT_TOO_HIGH</td><td><font color="#666">The altitude of the aircraft is too high.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetrackcannotconfirmreason_aircrafttoolow_inline"></a>AIRCRAFT_TOO_LOW</td><td><font color="#666">The altitude of the aircraft is too low.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetrackcannotconfirmreason_obstaclesensorerror_inline"></a>OBSTACLE_SENSOR_ERROR</td><td><font color="#666">The obstacle vision sensor has errors.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetrackcannotconfirmreason_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiactivetracktargettype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiactivetracktargettype_inline">ActiveTrackTargetType</a></div></div><div class="inline-doc" id="djiactivetracktargettype_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ActiveTrackTargetType</h6></div>

~~~java
@EXClassNullAway
 enum ActiveTrackTargetType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The type of ActiveTrack target.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetracktargettype_human_inline"></a>HUMAN</td><td><font color="#666">The ActiveTrack target is a human being.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetracktargettype_car_inline"></a>CAR</td><td><font color="#666">The ActiveTrack target is a car.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetracktargettype_van_inline"></a>VAN</td><td><font color="#666">The ActiveTrack target is a van.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetracktargettype_bike_inline"></a>BIKE</td><td><font color="#666">The ActiveTrack target is a bike.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetracktargettype_boat_inline"></a>BOAT</td><td><font color="#666">The ActiveTrack target is a boat.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetracktargettype_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The aircraft cannot recognize the target type.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiactivetracktargetstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiactivetracktargetstate_inline">ActiveTrackTargetState</a></div></div><div class="inline-doc" id="djiactivetracktargetstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ActiveTrackTargetState</h6></div>

~~~java
@EXClassNullAway
 enum ActiveTrackTargetState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The state of the target being tracked by the aircraft.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetracktargetstate_cannotconfirm_inline"></a>CANNOT_CONFIRM</td><td><font color="#666">The aircraft has recognized the target but the user is not allowed to confirm the target. Check <code><a href="/Components/Missions/DJIActiveTrackTrackingState.html#djiactivetracktrackingstate_cannotconfirmreason">getReason</a></code> to get  more information.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetracktargetstate_waitingforconfirmation_inline"></a>WAITING_FOR_CONFIRMATION</td><td><font color="#666">The aircraft has recognized the target and is waiting for user's confirmation.  If this state, the aircraft will hover in the current position while the camera  is tracking the target (by rotating aircraft's yaw or gimbal's altitude). If  user confirms the target, the aircraft will start to following the movement of  the target.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetracktargetstate_trackingwithhighconfidence_inline"></a>TRACKING_WITH_HIGH_CONFIDENCE</td><td><font color="#666">The aircraft has recognized the target with high confidence.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetracktargetstate_trackingwithlowconfidence_inline"></a>TRACKING_WITH_LOW_CONFIDENCE</td><td><font color="#666">The ActiveTrack Mission is tracking a target with low confidence. This is only  an indication that either the aircraft will soon ask for confirmation that the  target is correct, or may loose tracking the target entirely if confidence  doesn't improve.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetracktargetstate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>


