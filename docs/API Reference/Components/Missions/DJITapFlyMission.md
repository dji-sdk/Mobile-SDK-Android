<div class="article"><h1 ><font color="#AAA">class </font>TapFlyMission</h1></div>

~~~java
@EXClassNullAway
 class TapFlyMission 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">A TapFly Mission is initialized with a position target from the live video  stream. The 3D direction of the coordinate is calculated, and the aircraft  will proceed to fly in that direction. The aircraft can automatically avoid  obstacles when the scene is sufficiently illuminated (more than 300 lux but  less than 10,000 lux). The aircraft will stop flying in the direction if it  reaches its radius limitation, the mission is stopped, the user pulls back on  the pitch stick or if it comes to an obstacle it cannot bypass. The Remote  Controller yaw stick can be used to adjust the heading of the aircraft during  mission execution, which also adjusts the direction of flight to the new yaw.  Using any other stick controls will cancel the mission.



##### Class Members:

<div class="api-row" id="djitapflymission_imagelocationtocalculatedirection"><div class="api-col left">Image Location</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djitapflymission_imagelocationtocalculatedirection_inline">target</a></div></div><div class="inline-doc" id="djitapflymission_imagelocationtocalculatedirection_inline"

><div class="article"><h6 ><font color="#AAA">property </font>target</h6></div>

~~~java
 PointF target
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">The image point from the video feed where the vision system should calculate  the flight direction from. The image point is normalized to [0,1] where (0,0)  is the top left corner and (1,1) is the bottom right.

</div>

<div class="api-row" id="djitapflymission_tapflymode"><div class="api-col left">Tap Fly Mode</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djitapflymission_tapflymode_inline">tapFlyMode</a></div></div><div class="inline-doc" id="djitapflymission_tapflymode_inline"

><div class="article"><h6 ><font color="#AAA">property </font>tapFlyMode</h6></div>

~~~java
 TapFlyMode tapFlyMode
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">TapFly Mission mode. Defaults to <code><a href="/Components/Missions/DJITapFlyMission.html#djitapflymission_djitapflymode_forward">FORWARD</a></code>.  Additional modes only supported by the Phantom 4 Pro.



##### See Also:



<font color="#666"><code><a href="/Components/Missions/DJITapFlyMission.html#djitapflymission_djitapflymode">TapFlyMode</a></code>

</div>

<div class="api-row" id="djitapflymission_ishorizontalobstacleavoidanceenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djitapflymission_ishorizontalobstacleavoidanceenabled_inline">isHorizontalObstacleAvoidanceEnabled</a></div></div><div class="inline-doc" id="djitapflymission_ishorizontalobstacleavoidanceenabled_inline"

><div class="article"><h6 ><font color="#AAA">property </font>isHorizontalObstacleAvoidanceEnabled</h6></div>

~~~java
 boolean isHorizontalObstacleAvoidanceEnabled
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> to enable horizontal obstacle avoidance.

</div>

<div class="api-row" id="djitapflymission_speed"><div class="api-col left">Target</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djitapflymission_speed_inline">speed</a></div></div><div class="inline-doc" id="djitapflymission_speed_inline"

><div class="article"><h6 ><font color="#AAA">property </font>speed</h6></div>

~~~java
 float speed
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">Speed in m/s during tap fly mission.

</div>



##### Related:

<div class="api-row" id="djitapflymission_djitapflyexecutionstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJITapFlyMission_DJITapFlyExecutionState.html">TapFlyExecutionState</a></div></div><div class="api-row" id="djitapflymission_djivector"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJITapFlyMission_DJIVector.html">Vector</a></div></div><div class="api-row" id="djitapflymission_djibypassdirection"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djitapflymission_djibypassdirection_inline">BypassDirection</a></div></div><div class="inline-doc" id="djitapflymission_djibypassdirection_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>BypassDirection</h6></div>

~~~java
@EXClassNullAway
 enum BypassDirection 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">Direction aircraft is moving around or bypassing an obstacle in.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djitapflymission_djibypassdirection_none_inline"></a>NONE</td><td><font color="#666">Flying normally, no obstacle to be avoided.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djitapflymission_djibypassdirection_over_inline"></a>OVER</td><td><font color="#666">Avoiding the obstacle by going over the top of it.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djitapflymission_djibypassdirection_left_inline"></a>LEFT</td><td><font color="#666">Avoiding the obstacle by going to the left of it.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djitapflymission_djibypassdirection_right_inline"></a>RIGHT</td><td><font color="#666">Avoiding the obstacle by going to the right of it.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djitapflymission_djibypassdirection_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown obstacle avoidance direction</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djitapflymission_djitapflymode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djitapflymission_djitapflymode_inline">TapFlyMode</a></div></div><div class="inline-doc" id="djitapflymission_djitapflymode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>TapFlyMode</h6></div>

~~~java
@EXClassNullAway
 enum TapFlyMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.tapfly</td></tr></table></html>



##### Description:



<font color="#666">Different modes of the TapFly Mission. Defaults to  <code><a href="/Components/Missions/DJITapFlyMission.html#djitapflymission_djitapflymode_forward">FORWARD</a></code>, set to others to enable  the feature.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djitapflymission_djitapflymode_forward_inline"></a>FORWARD</td><td><font color="#666">Aircraft will fly towards the target. Forward Obstacle  Sensing System is active.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djitapflymission_djitapflymode_backward_inline"></a>BACKWARD</td><td><font color="#666">Aircraft will fly in the opposite direction from the target.  Backward Obstacle Sensing System is active.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djitapflymission_djitapflymode_free_inline"></a>FREE</td><td><font color="#666">Aircraft will fly towards the target. User can control the heading  by remote controller's stick. Obstacle Sensing Systems may fail to  work when aircraft is flying sideward.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djitapflymission_djitapflymode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The TapFly mode is unknown.</td></tr></table></html>

##### Class Members:

</div>


