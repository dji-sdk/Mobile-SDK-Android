<div class="article"><h1 ><font color="#AAA">class </font>ActiveTrackMission</h1></div>

~~~java
@EXClassNullAway
 class ActiveTrackMission 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">ActiveTrack Mission allows an aircraft to track a moving subject using the  vision system and without a GPS tracker on the subject.



##### Class Members:

<div class="api-row" id="djiactivetrackmission_targetrect"><div class="api-col left">Target Rect</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmission_targetrect_inline">setTargetRect</a></div></div><div class="inline-doc" id="djiactivetrackmission_targetrect_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setTargetRect</h6></div>

~~~java
 void setTargetRect(RectF targetRect) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">A bounding box for the target. The rectangle is normalized to [0,1] where (0,0) is the top left  of the video preview and (1,1) is the bottom right. The <code>size</code> parameter of <code>CGRect</code> can be set  to 0 to initialize the mission with a point instead of a rectangle. If the mission is  initialized with a point, the vision system will try to recognize the object around the point  and return the representative rect in the status delegate. <br><br> This property is used when  the <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission">ActiveTrackMission</a></code> object is passed to <code><a href="/Components/Missions/DJIActiveTrackMissionOperator.html#djiactivetrackmissionoperator_startmission">startTracking</a></code>.  If the object is passed to <code><a href="/Components/Missions/DJIActiveTrackMissionOperator.html#djiactivetrackmissionoperator_startautosensingmission">startAutoSensingMission</a></code>, this property  will be ignored. Use <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_subjectindex">setTargetIndex</a></code> to select the target to track instead.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">RectF <font color="#000">targetRect</td><td><font color="#666"><i>A RectF object.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmission_gettargetrect"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmission_gettargetrect_inline">getTargetRect</a></div></div><div class="inline-doc" id="djiactivetrackmission_gettargetrect_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTargetRect</h6></div>

~~~java
 RectF getTargetRect() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Get RectF object that represents target



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">RectF</td><td><font color="#666"><i>A RectF object.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmission_subjectindex"><div class="api-col left">Subject Index</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmission_subjectindex_inline">setTargetIndex</a></div></div><div class="inline-doc" id="djiactivetrackmission_subjectindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setTargetIndex</h6></div>

~~~java
 void setTargetIndex (int targetIndex) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The index of the subject to track. After starting auto sensing (by calling <code><a href="/Components/Missions/DJIActiveTrackMissionOperator.html#djiactivetrackmissionoperator_enableautosensing">enableAutoSensing</a></code>  or <code><a href="/Components/Missions/DJIActiveTrackMissionOperator.html#djiactivetrackmissionoperator_enableautosensingforquickshot">enableAutoSensingForQuickShot</a></code>), the aircraft will push the sensed subjects  (<code><a href="/Components/Missions/DJIActiveTrackTrackingState.html#djiactivetracktrackingstate_autosensedsubjects">getAutoSensedSubjects</a></code>). Select the subject to track by passing the index of the subject. <br><br>This  property is used when the <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission">ActiveTrackMission</a></code> object is passed to <code><a href="/Components/Missions/DJIActiveTrackMissionOperator.html#djiactivetrackmissionoperator_startautosensingmission">startAutoSensingMission</a></code>.  If the object is passed to <code><a href="/Components/Missions/DJIActiveTrackMissionOperator.html#djiactivetrackmissionoperator_startmission">startTracking</a></code>, this property will be ignored. Use <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_targetrect">setTargetRect</a></code>  to define the target to track.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">targetIndex</td><td><font color="#666"><i>The index of the subject to track.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmission_mode"><div class="api-col left">Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmission_mode_inline">setMode</a></div></div><div class="inline-doc" id="djiactivetrackmission_mode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMode</h6></div>

~~~java
 void setMode(ActiveTrackMode mode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">ActiveTrack Mission mode. Defaults to <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_djiactivetrackmode_trace">TRACE</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_djiactivetrackmode">ActiveTrackMode</a> <font color="#000">mode</td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_djiactivetrackmode">ActiveTrackMode</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmission_quickshotmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmission_quickshotmode_inline">getQuickShotMode</a></div></div><div class="inline-doc" id="djiactivetrackmission_quickshotmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getQuickShotMode</h6></div>

~~~java
 QuickShotMode getQuickShotMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The QuickShot mode determines the preset flight path. It is only used when <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_mode">setMode</a></code>  is <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_djiactivetrackmode_quickshot">QUICK_SHOT</a></code>.  Defaults to <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_djiactivetrackquickshotmode_unknown">UNKNOWN</a></code>.  It is only supported by Spark.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_djiactivetrackquickshotmode">QuickShotMode</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_djiactivetrackquickshotmode">QuickShotMode</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmission_setquickshotmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmission_setquickshotmode_inline">setQuickShotMode</a></div></div><div class="inline-doc" id="djiactivetrackmission_setquickshotmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setQuickShotMode</h6></div>

~~~java
 void setQuickShotMode(QuickShotMode quickShotMode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Set the QuickShot mode. It is only supported by Spark.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_djiactivetrackquickshotmode">QuickShotMode</a> <font color="#000">quickShotMode</td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_djiactivetrackquickshotmode">QuickShotMode</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmission_constructor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmission_constructor_inline">ActiveTrackMission</a></div></div><div class="inline-doc" id="djiactivetrackmission_constructor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>ActiveTrackMission</h6></div>

~~~java
 ActiveTrackMission(RectF targetRect, ActiveTrackMode mode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">A constructor method for ActiveTrackMission. The first param can be nullable if  the object is passed to <code><a href="/Components/Missions/DJIActiveTrackMissionOperator.html#djiactivetrackmissionoperator_startautosensingmission">startAutoSensingMission</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">RectF <font color="#000">targetRect</td><td><font color="#666"><i>The target rect.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_djiactivetrackmode">ActiveTrackMode</a> <font color="#000">mode</td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_djiactivetrackmode">ActiveTrackMode</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmission_getmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmission_getmode_inline">getMode</a></div></div><div class="inline-doc" id="djiactivetrackmission_getmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMode</h6></div>

~~~java
 ActiveTrackMode getMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Get the current ActiveTrack mode for ActiveTrack mission.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_djiactivetrackmode">ActiveTrackMode</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_djiactivetrackmode">ActiveTrackMode</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmission_gettargetindex"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmission_gettargetindex_inline">getTargetIndex</a></div></div><div class="inline-doc" id="djiactivetrackmission_gettargetindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTargetIndex</h6></div>

~~~java
 int getTargetIndex() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Get Target Index.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of target index.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiactivetracktrackingstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIActiveTrackTrackingState.html">ActiveTrackTrackingState</a></div></div><div class="api-row" id="djiactivetrackmission_djisubjectsensingstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIActiveTrackMission_DJISubjectSensingState.html">SubjectSensingState</a></div></div><div class="api-row" id="djiactivetrackmission_djiactivetrackmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmission_djiactivetrackmode_inline">ActiveTrackMode</a></div></div><div class="inline-doc" id="djiactivetrackmission_djiactivetrackmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ActiveTrackMode</h6></div>

~~~java
@EXClassNullAway
 enum ActiveTrackMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_active_track_mode_key">FlightControllerKey.ACTIVE_TRACK_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Different modes of the ActiveTrack Mission. Defaults to  <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_djiactivetrackmode_trace">TRACE</a></code>, set to  others to enable the feature.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetrackmission_djiactivetrackmode_trace_inline"></a>TRACE</td><td><font color="#666">Aircraft moves in behind the subject keeping a constant distance to it.  Mission with this mode can only be started when the aircraft is flying.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetrackmission_djiactivetrackmode_profile_inline"></a>PROFILE</td><td><font color="#666">Aircraft moves in parallel with the subject in the frame instead of behind.  Mission with this mode can only be started when the aircraft is flying.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetrackmission_djiactivetrackmode_spotlight_inline"></a>SPOTLIGHT</td><td><font color="#666">In Spotlight mode, the aircraft camera automatically follows the subject by  rotating the aircraft's yaw, but the aircraft does not automatically keep a  constant distance with the subject. Mission with this mode can only be started  when the aircraft is flying.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetrackmission_djiactivetrackmode_spotlightpro_inline"></a>SPOTLIGHT_PRO</td><td><font color="#666">In Spotlight Pro mode, the aircraft camera automatically follows the subject by  rotating the gimbal's yaw, but the aircraft does not automatically keep a constant  distance with the subject.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetrackmission_djiactivetrackmode_quickshot_inline"></a>QUICK_SHOT</td><td><font color="#666">In QuickShot mode, the aircraft will fly in one of four preset paths (see <code><a href="/Components/Missions/DJIActiveTrackMission.html#djiactivetrackmission_djiactivetrackquickshotmode">QuickShotMode</a></code>)  while tracking the object recording a video. When a QuickShot mission ends, a 10-second video will be  generated. It is only supported by Spark.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetrackmission_djiactivetrackmode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The active track mode is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiactivetrackmission_djiactivetrackquickshotmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmission_djiactivetrackquickshotmode_inline">QuickShotMode</a></div></div><div class="inline-doc" id="djiactivetrackmission_djiactivetrackquickshotmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>QuickShotMode</h6></div>

~~~java
@EXClassNullAway
 enum QuickShotMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">QuickShot modes, which define different preset path for a QuickShot mission.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetrackmission_djiactivetrackquickshotmode_circle_inline"></a>CIRCLE</td><td><font color="#666">Aircraft will circle around the object it is tracking.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetrackmission_djiactivetrackquickshotmode_dronie_inline"></a>DRONIE</td><td><font color="#666">Aircraft will fly backward and upward with camera locked on the object it is tracking.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetrackmission_djiactivetrackquickshotmode_helix_inline"></a>HELIX</td><td><font color="#666">Aircraft will fly upward, spiraling around the object it is tracking.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetrackmission_djiactivetrackquickshotmode_rocket_inline"></a>ROCKET</td><td><font color="#666">The aircraft will ascend with the camera pointing downward on the object it is tracking.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetrackmission_djiactivetrackquickshotmode_boomerang_inline"></a>BOOMERANG</td><td><font color="#666">The aircraft will fly around the tracking object in an upwardly sloped oval with the video finishing  at the start point. Supported by DJI Mavic Air, Mavic 2 Zoom and Mavic 2 Pro.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetrackmission_djiactivetrackquickshotmode_asteroid_inline"></a>ASTEROID</td><td><font color="#666">The aircraft will fly backward and upward while recording video, capture a sphere  panorama at the end of the flight path, then combine the footage and panorama into  a short video. Supported by DJI Mavic Air, Mavic 2 Zoom and Mavic 2 Pro.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetrackmission_djiactivetrackquickshotmode_dollyzoom_inline"></a>DOLLY_ZOOM</td><td><font color="#666">The aircraft will fly backward and upward. It will adjust the zoom during flight to keep the selected subject the same while the background changes. Ensure there is sufficient space when using Dolly Zoom. Allow at least triple distance from aircraft to the subject behind the aircraft. Only supported by Mavic 2 Zoom.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiactivetrackmission_djiactivetrackquickshotmode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>


