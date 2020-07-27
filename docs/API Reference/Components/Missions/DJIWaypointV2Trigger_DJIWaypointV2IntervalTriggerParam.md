<div class="article"><h1 ><font color="#AAA">class </font>WaypointIntervalTriggerParam</h1></div>

~~~java
 class WaypointIntervalTriggerParam 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">This class defines <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actiontriggertype_trajectory">TRAJECTORY</a></code>.



##### Class Members:

<div class="api-row" id="djiwaypointv2trigger_djiwaypointv2intervaltriggerparam_startindex"><div class="api-col left">Start Index</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2trigger_djiwaypointv2intervaltriggerparam_startindex_inline">getStartIndex</a></div></div><div class="inline-doc" id="djiwaypointv2trigger_djiwaypointv2intervaltriggerparam_startindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getStartIndex</h6></div>

~~~java
 int getStartIndex() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">It determines the index of the waypoint at which the trigger starts.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of start index.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2trigger_djiwaypointv2intervaltriggerparam_actionintervaltype"><div class="api-col left">Action Interval Type</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2trigger_djiwaypointv2intervaltriggerparam_actionintervaltype_inline">getType</a></div></div><div class="inline-doc" id="djiwaypointv2trigger_djiwaypointv2intervaltriggerparam_actionintervaltype_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getType</h6></div>

~~~java
 ActionIntervalType getType() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The type of interval trigger. See <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actionintervaltype">ActionIntervalType</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actionintervaltype">ActionIntervalType</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actionintervaltype">ActionIntervalType</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2trigger_djiwaypointv2intervaltriggerparam_interval"><div class="api-col left">Interval</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2trigger_djiwaypointv2intervaltriggerparam_interval_inline">getInterval</a></div></div><div class="inline-doc" id="djiwaypointv2trigger_djiwaypointv2intervaltriggerparam_interval_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getInterval</h6></div>

~~~java
 float getInterval() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">If the <code><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2IntervalTriggerParam.html#djiwaypointv2trigger_djiwaypointv2intervaltriggerparam_actionintervaltype">getType</a></code>  is <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actionintervaltype_time">TIME</a></code> The time interval in seconds  when two action are executed as the aircraft moves from the current waypoint to the next waypoint.  If the <code><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2IntervalTriggerParam.html#djiwaypointv2trigger_djiwaypointv2intervaltriggerparam_actionintervaltype">getType</a></code>  is <code><a href="/Components/Missions/DJIWaypointV2Action.html#djiwaypointv2action_djiwaypointv2actionintervaltype_distance">DISTANCE</a></code> The distance interval in meters  when two action are executed as the aircraft moves from the current waypoint to the next waypoint.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of the interval.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiwaypointv2trigger_djiwaypointv2intervaltriggerparam_builder"><div class="api-col left">Make Waypoint Interval Trigger Param</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2IntervalTriggerParam_Builder.html">Builder</a></div></div>
