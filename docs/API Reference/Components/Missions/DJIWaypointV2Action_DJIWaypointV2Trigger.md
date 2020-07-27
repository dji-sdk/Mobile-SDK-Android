<div class="article"><h1 ><font color="#AAA">class </font>WaypointTrigger</h1></div>

~~~java
 class WaypointTrigger 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">It determines when an action will be performed while the aircraft executes a waypoint mission.



##### Class Members:

<div class="api-row" id="djiwaypointv2action_djiwaypointv2trigger_actiontriggertype"><div class="api-col left">Trigger Type</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2action_djiwaypointv2trigger_actiontriggertype_inline">getTriggerType</a></div></div><div class="inline-doc" id="djiwaypointv2action_djiwaypointv2trigger_actiontriggertype_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTriggerType</h6></div>

~~~java
 ActionTriggerType getTriggerType() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The type of trigger.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actiontriggertype">ActionTriggerType</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actiontriggertype">ActionTriggerType</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2action_djiwaypointv2trigger_reachpointtriggerparam"><div class="api-col left">Reach Point Trigger Param</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2action_djiwaypointv2trigger_reachpointtriggerparam_inline">getReachPointParam</a></div></div><div class="inline-doc" id="djiwaypointv2action_djiwaypointv2trigger_reachpointtriggerparam_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getReachPointParam</h6></div>

~~~java
 WaypointReachPointTriggerParam getReachPointParam() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The parameters of <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actiontriggertype_actionassociated">ASSOCIATE</a></code>. It's  valid only when the <code><a href="/Components/Missions/DJIWaypointV2Action_DJIWaypointV2Trigger.html#djiwaypointv2action_djiwaypointv2trigger_actiontriggertype">getTriggerType</a></code>  is <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actiontriggertype_reachpoint">REACH_POINT</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2ReachPointTriggerParam.html#djiwaypointv2trigger_djiwaypointv2reachpointtriggerparam">WaypointReachPointTriggerParam</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2ReachPointTriggerParam.html#djiwaypointv2trigger_djiwaypointv2reachpointtriggerparam">WaypointReachPointTriggerParam</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2action_djiwaypointv2trigger_associatetriggerparam"><div class="api-col left">Associate Trigger Param</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2action_djiwaypointv2trigger_associatetriggerparam_inline">getAssociateParam</a></div></div><div class="inline-doc" id="djiwaypointv2action_djiwaypointv2trigger_associatetriggerparam_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAssociateParam</h6></div>

~~~java
 WaypointV2AssociateTriggerParam getAssociateParam() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The parameters of <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actiontriggertype_reachpoint">REACH_POINT</a></code>. It's valid  only when the <code><a href="/Components/Missions/DJIWaypointV2Action_DJIWaypointV2Trigger.html#djiwaypointv2action_djiwaypointv2trigger_actiontriggertype">getTriggerType</a></code>  is <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actiontriggertype_actionassociated">ASSOCIATE</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2AssociateTriggerParam.html#djiwaypointv2trigger_djiwaypointv2associatetriggerparam">WaypointV2AssociateTriggerParam</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2AssociateTriggerParam.html#djiwaypointv2trigger_djiwaypointv2associatetriggerparam">WaypointV2AssociateTriggerParam</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2action_djiwaypointv2trigger_trajectorytriggerparam"><div class="api-col left">Trajectory Trigger Param</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2action_djiwaypointv2trigger_trajectorytriggerparam_inline">getTrajectoryParam</a></div></div><div class="inline-doc" id="djiwaypointv2action_djiwaypointv2trigger_trajectorytriggerparam_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTrajectoryParam</h6></div>

~~~java
 WaypointTrajectoryTriggerParam getTrajectoryParam() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The parameters of <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actiontriggertype_trajectory">TRAJECTORY</a></code>. It's valid only  when the <code><a href="/Components/Missions/DJIWaypointV2Action_DJIWaypointV2Trigger.html#djiwaypointv2action_djiwaypointv2trigger_actiontriggertype">getTriggerType</a></code> is <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actiontriggertype_trajectory">TRAJECTORY</a></code>. This trigger applies only to <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2actionactuatorgimbaloperationtype_aircraftcontrolgimbal">AIRCRAFT_CONTROL_GIMBAL</a></code>.  If this action is triggered, the gimbal will rotate at a constant speed from the start waypoint index to the end waypoint index.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2TrajectoryTriggerParam.html#djiwaypointv2trigger_djiwaypointv2trajectorytriggerparam">WaypointTrajectoryTriggerParam</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2TrajectoryTriggerParam.html#djiwaypointv2trigger_djiwaypointv2trajectorytriggerparam">WaypointTrajectoryTriggerParam</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2action_djiwaypointv2trigger_intervaltriggerparam"><div class="api-col left">Interval Trigger Param</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2action_djiwaypointv2trigger_intervaltriggerparam_inline">getIntervalTriggerParam</a></div></div><div class="inline-doc" id="djiwaypointv2action_djiwaypointv2trigger_intervaltriggerparam_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getIntervalTriggerParam</h6></div>

~~~java
 WaypointIntervalTriggerParam getIntervalTriggerParam() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The parameters of <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actiontriggertype_interval">SIMPLE_INTERVAL</a></code>. It's valid only when the <code><a href="/Components/Missions/DJIWaypointV2Action_DJIWaypointV2Trigger.html#djiwaypointv2action_djiwaypointv2trigger_actiontriggertype">getTriggerType</a></code>  is <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actiontriggertype_interval">SIMPLE_INTERVAL</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2IntervalTriggerParam.html#djiwaypointv2trigger_djiwaypointv2intervaltriggerparam">WaypointIntervalTriggerParam</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2IntervalTriggerParam.html#djiwaypointv2trigger_djiwaypointv2intervaltriggerparam">WaypointIntervalTriggerParam</a></code>.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiwaypointv2action_djiwaypointv2trigger_builder"><div class="api-col left">Constructor</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2Action_DJIWaypointV2Trigger_Builder.html">Builder</a></div></div><div class="api-row" id="djiwaypointv2trigger_djiwaypointv2intervaltriggerparam"><div class="api-col left">Interval Trigger Param</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2IntervalTriggerParam.html">WaypointIntervalTriggerParam</a></div></div><div class="api-row" id="djiwaypointv2trigger_djiwaypointv2trajectorytriggerparam"><div class="api-col left">Trajectory Trigger Param</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2TrajectoryTriggerParam.html">WaypointTrajectoryTriggerParam</a></div></div><div class="api-row" id="djiwaypointv2trigger_djiwaypointv2associatetriggerparam"><div class="api-col left">Associate Trigger Param</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2AssociateTriggerParam.html">WaypointV2AssociateTriggerParam</a></div></div><div class="api-row" id="djiwaypointv2trigger_djiwaypointv2reachpointtriggerparam"><div class="api-col left">Reach Point Trigger Param</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2ReachPointTriggerParam.html">WaypointReachPointTriggerParam</a></div></div>
