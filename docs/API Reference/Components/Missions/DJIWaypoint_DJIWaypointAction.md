<div class="article"><h1 ><font color="#AAA">class </font>WaypointAction</h1></div>

~~~java
@EXClassNullAway
 class WaypointAction 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">This class represents a waypoint action for <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint">Waypoint</a></code>. It determines what action is performed when  the aircraft reaches the corresponding waypoint.



##### Class Members:

<div class="api-row" id="djiwaypoint_djiwaypointaction_actiontype"><div class="api-col left">Action Type</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_djiwaypointaction_actiontype_inline">actionType</a></div></div><div class="inline-doc" id="djiwaypoint_djiwaypointaction_actiontype_inline"

><div class="article"><h6 ><font color="#AAA">property </font>actionType</h6></div>

~~~java
 WaypointActionType actionType
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Waypoint action of type <code><a href="/Components/Missions/DJIWaypoint_DJIWaypointAction.html#djiwaypoint_djiwaypointactiontype">WaypointActionType</a></code> the aircraft will execute this action once  the aircraft reaches the waypoint. All possible actions are defined in the <code><a href="/Components/Missions/DJIWaypoint_DJIWaypointAction.html#djiwaypoint_djiwaypointactiontype">WaypointActionType</a></code> enum.



##### See Also:



<font color="#666"><code><a href="/Components/Missions/DJIWaypoint_DJIWaypointAction.html#djiwaypoint_djiwaypointactiontype">WaypointActionType</a></code>

</div>

<div class="api-row" id="djiwaypoint_djiwaypointaction_actionparam"><div class="api-col left">Action Param</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_djiwaypointaction_actionparam_inline">actionParam</a></div></div><div class="inline-doc" id="djiwaypoint_djiwaypointaction_actionparam_inline"

><div class="article"><h6 ><font color="#AAA">property </font>actionParam</h6></div>

~~~java
 int actionParam = 0
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Action parameter for a waypoint action. See enum <code><a href="/Components/Missions/DJIWaypoint_DJIWaypointAction.html#djiwaypoint_djiwaypointaction">WaypointAction</a></code> for details on which  actions use <code><a href="/Components/Missions/DJIWaypoint_DJIWaypointAction.html#djiwaypoint_djiwaypointaction_actionparam">actionParam</a></code>.



##### See Also:



<font color="#666"><code><a href="/Components/Missions/DJIWaypoint_DJIWaypointAction.html#djiwaypoint_djiwaypointaction_actionparam">actionParam</a></code>

</div>

<div class="api-row" id="djiwaypoint_djiwaypointaction_initwithactiontype"><div class="api-col left">Init With Action Type And Param</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_djiwaypointaction_initwithactiontype_inline">WaypointAction</a></div></div><div class="inline-doc" id="djiwaypoint_djiwaypointaction_initwithactiontype_inline"

><div class="article"><h6 ><font color="#AAA">method </font>WaypointAction</h6></div>

~~~java
 WaypointAction(WaypointActionType actionType, int actionParam) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Initialize the class with a specific action type and corresponding parameter.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypoint_DJIWaypointAction.html#djiwaypoint_djiwaypointactiontype">WaypointActionType</a> <font color="#000">actionType</td><td><font color="#666"><i>A DJIWaypointActionType object.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">actionParam</td><td><font color="#666"><i>Action parameter of a waypoint action.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiwaypoint_djiwaypointactiontype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiwaypoint_djiwaypointactiontype_inline">WaypointActionType</a></div></div><div class="inline-doc" id="djiwaypoint_djiwaypointactiontype_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>WaypointActionType</h6></div>

~~~java
@EXClassNullAway
 enum WaypointActionType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Waypoint action types.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypoint_djiwaypointactiontype_stay_inline"></a>STAY</td><td><font color="#666">Keeps the aircraft at the waypoint's location. The <code><a href="/Components/Missions/DJIWaypoint_DJIWaypointAction.html#djiwaypoint_djiwaypointaction_actionparam">actionParam</a></code>  parameter will determine how much time in milliseconds the aircraft will stay at the location with  range of [0, 32767] milliseconds.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypoint_djiwaypointactiontype_shootphoto_inline"></a>START_TAKE_PHOTO</td><td><font color="#666">Starts to shoot a photo. The <code><a href="/Components/Missions/DJIWaypoint_DJIWaypointAction.html#djiwaypoint_djiwaypointaction_actionparam">actionParam</a></code> for the waypoint action will  be ignored. The maximum time set to execute this waypoint action is 6 seconds. If the time while executing  the waypoint action goes above 6 seconds, the aircraft will stop executing the waypoint action and will  move on to the next waypoint action, if one exists.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypoint_djiwaypointactiontype_startrecord_inline"></a>START_RECORD</td><td><font color="#666">Starts recording. The <code><a href="/Components/Missions/DJIWaypoint_DJIWaypointAction.html#djiwaypoint_djiwaypointaction_actionparam">actionParam</a></code> for the waypoint action will be  ignored. The maximum time set to execute this waypoint action is 6 seconds. If the time while executing  the waypoint action goes above 6 seconds (e.g. the camera is not present) the aircraft will stop executing  the waypoint action and will move on to the next waypoint action, if one exists.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypoint_djiwaypointactiontype_stoprecord_inline"></a>STOP_RECORD</td><td><font color="#666">Stops recording. The <code><a href="/Components/Missions/DJIWaypoint_DJIWaypointAction.html#djiwaypoint_djiwaypointaction_actionparam">actionParam</a></code> for the waypoint action will be ignored.  The maximum time set to execute this waypoint action is 6 seconds. If the time while executing the waypoint  action goes above 6 seconds (e.g. the camera is not present) the aircraft will stop executing the waypoint  action and will move on to the next waypoint action, if one exists.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypoint_djiwaypointactiontype_rotateaircraft_inline"></a>ROTATE_AIRCRAFT</td><td><font color="#666">Rotates the aircraft's yaw. The rotation direction is determined by the waypoint's <code><a href="/Components/Missions/DJIWaypoint.html#djiwaypoint_turnmode">turnMode</a></code> property.  The <code><a href="/Components/Missions/DJIWaypoint_DJIWaypointAction.html#djiwaypoint_djiwaypointaction_actionparam">actionParam</a></code> value must be in the range of [-180, 180] degrees.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiwaypoint_djiwaypointactiontype_rotategimbalpitch_inline"></a>GIMBAL_PITCH</td><td><font color="#666">Rotates the gimbal's pitch. The actionParam value should be in range [-90, 0] degrees.</td></tr></table></html>

##### Class Members:

</div>


