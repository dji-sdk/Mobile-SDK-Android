<div class="article"><h1 ><font color="#AAA">class </font>SubjectSensingState</h1></div>

~~~java
 class SubjectSensingState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The state of one of the auto-sensed subject after enabling auto sensing.  Only supported by DJI Mavic Air.



##### Class Members:

<div class="api-row" id="djiactivetrackmission_djisubjectsensingstate_index"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmission_djisubjectsensingstate_index_inline">getIndex</a></div></div><div class="inline-doc" id="djiactivetrackmission_djisubjectsensingstate_index_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getIndex</h6></div>

~~~java
 int getIndex() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">Index of the auto-sensed subjects. After enabling auto sensing, the aircraft  may find multiple subjects and an index will be assigned to each subject.  Use this index to select the subject to track.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of target index.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmission_djisubjectsensingstate_state"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmission_djisubjectsensingstate_state_inline">getState</a></div></div><div class="inline-doc" id="djiactivetrackmission_djisubjectsensingstate_state_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getState</h6></div>

~~~java
 ActiveTrackTargetState getState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The target state of the auto-sensed subject.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIActiveTrackTrackingState.html#djiactivetracktargetstate">ActiveTrackTargetState</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIActiveTrackTrackingState.html#djiactivetracktargetstate">ActiveTrackTargetState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmission_djisubjectsensingstate_targettype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmission_djisubjectsensingstate_targettype_inline">getTargetType</a></div></div><div class="inline-doc" id="djiactivetrackmission_djisubjectsensingstate_targettype_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTargetType</h6></div>

~~~java
 ActiveTrackTargetType getTargetType() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">The type of the auto-sensed subject.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIActiveTrackTrackingState.html#djiactivetracktargettype">ActiveTrackTargetType</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIActiveTrackTrackingState.html#djiactivetracktargettype">ActiveTrackTargetType</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiactivetrackmission_djisubjectsensingstate_targetrect"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiactivetrackmission_djisubjectsensingstate_targetrect_inline">getTargetRect</a></div></div><div class="inline-doc" id="djiactivetrackmission_djisubjectsensingstate_targetrect_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTargetRect</h6></div>

~~~java
 RectF getTargetRect() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.activetrack</td></tr></table></html>



##### Description:



<font color="#666">A rectangle in the live video view image that represents the auto-sensed subject.  The rectangle is normalized to [0,1] where (0,0) is the top left of the video  preview and (1,1) is the bottom right.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">RectF</td><td><font color="#666"><i>A RectF object.</i></td></tr></table></html></div>


