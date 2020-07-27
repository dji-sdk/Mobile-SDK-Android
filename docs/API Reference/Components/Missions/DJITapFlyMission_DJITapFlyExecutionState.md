<div class="article"><h1 ><font color="#AAA">class </font>TapFlyExecutionState</h1></div>

~~~java
@EXClassNullAway
 class TapFlyExecutionState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">This class provides the detailed state of a TapFly Mission that is executing.



##### Class Members:

<div class="api-row" id="djitapflymission_djitapflyexecutionstate_direction"><div class="api-col left">Direction</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djitapflymission_djitapflyexecutionstate_direction_inline">getDirection</a></div></div><div class="inline-doc" id="djitapflymission_djitapflyexecutionstate_direction_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDirection</h6></div>

~~~java
 Vector getDirection() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">The direction vector the aircraft is travelling in using the N-E-D  (North-East-Down) coordinate system.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJITapFlyMission_DJIVector.html#djitapflymission_djivector">Vector</a></td><td><font color="#666"><i>A Vector object.</i></td></tr></table></html></div>

<div class="api-row" id="djitapflymission_djitapflyexecutionstate_imagelocation"><div class="api-col left">Image Location</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djitapflymission_djitapflyexecutionstate_imagelocation_inline">getImageLocation</a></div></div><div class="inline-doc" id="djitapflymission_djitapflyexecutionstate_imagelocation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getImageLocation</h6></div>

~~~java
 PointF getImageLocation() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">The image point from the video feed where the vision system should calculate the  flight direction from. The image point is normalized to [0,1] where (0,0) is the  top left corner and (1,1) is the bottom right.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">PointF</td><td><font color="#666"><i>A PointF object.</i></td></tr></table></html></div>

<div class="api-row" id="djitapflymission_djitapflyexecutionstate_speed"><div class="api-col left">Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djitapflymission_djitapflyexecutionstate_speed_inline">getSpeed</a></div></div><div class="inline-doc" id="djitapflymission_djitapflyexecutionstate_speed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSpeed</h6></div>

~~~java
 float getSpeed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">The real-time speed of the aircraft in m/s.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of speed.</i></td></tr></table></html></div>

<div class="api-row" id="djitapflymission_djitapflyexecutionstate_bypassdirection"><div class="api-col left">Bypass Direction</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djitapflymission_djitapflyexecutionstate_bypassdirection_inline">getBypassDirection</a></div></div><div class="inline-doc" id="djitapflymission_djitapflyexecutionstate_bypassdirection_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBypassDirection</h6></div>

~~~java
 BypassDirection getBypassDirection() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">The direction the aircraft is moving around or bypassing an obstacle in. Will be  <code><a href="/Components/Missions/DJITapFlyMission.html#djitapflymission_djibypassdirection_none">NONE</a></code> if the aircraft is not executing  an avoidance maneuver.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJITapFlyMission.html#djitapflymission_djibypassdirection">BypassDirection</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJITapFlyMission.html#djitapflymission_djibypassdirection">BypassDirection</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djitapflymission_djitapflyexecutionstate_relativeheading"><div class="api-col left">Relative Heading</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djitapflymission_djitapflyexecutionstate_relativeheading_inline">getRelativeHeading</a></div></div><div class="inline-doc" id="djitapflymission_djitapflyexecutionstate_relativeheading_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRelativeHeading</h6></div>

~~~java
 float getRelativeHeading() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">Aircraft's heading relative to the flight direction.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of relative heading.</i></td></tr></table></html></div>


