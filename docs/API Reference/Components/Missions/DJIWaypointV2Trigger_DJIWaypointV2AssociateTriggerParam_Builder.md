<div class="article"><h1 ><font color="#AAA">class </font>Builder</h1></div>

~~~java
 static final class Builder 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">The class is used to create the object of <code><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2AssociateTriggerParam.html#djiwaypointv2trigger_djiwaypointv2associatetriggerparam">WaypointV2AssociateTriggerParam</a></code>.



##### Class Members:

<div class="api-row" id="djiwaypointv2trigger_djiwaypointv2associatetriggerparam_builder_setassociatetype"><div class="api-col left">Set Associate Type</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2trigger_djiwaypointv2associatetriggerparam_builder_setassociatetype_inline">setAssociateType</a></div></div><div class="inline-doc" id="djiwaypointv2trigger_djiwaypointv2associatetriggerparam_builder_setassociatetype_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAssociateType</h6></div>

~~~java
 Builder setAssociateType(AssociatedTimingType associateType) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">Sets the AssociateType of the trigger. The AssociateType determines the time and the way to trigger the action  to execute.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2Action_ActionTypes.html#djiwaypointv2triggerassociatedtimingtype">AssociatedTimingType</a> <font color="#000">associateType</td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIWaypointV2Action_ActionTypes.html#djiwaypointv2triggerassociatedtimingtype">AssociatedTimingType</a></code>.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2AssociateTriggerParam_Builder.html#djiwaypointv2trigger_djiwaypointv2associatetriggerparam_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2trigger_djiwaypointv2associatetriggerparam_builder_setwaitingtime"><div class="api-col left">Set Waiting Time</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2trigger_djiwaypointv2associatetriggerparam_builder_setwaitingtime_inline">setWaitingTime</a></div></div><div class="inline-doc" id="djiwaypointv2trigger_djiwaypointv2associatetriggerparam_builder_setwaitingtime_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setWaitingTime</h6></div>

~~~java
 Builder setWaitingTime(float waitingTimeInSec) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">Sets the waiting time.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">waitingTimeInSec</td><td><font color="#666"><i>A float value of the waiting time in sec.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2AssociateTriggerParam_Builder.html#djiwaypointv2trigger_djiwaypointv2associatetriggerparam_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2trigger_djiwaypointv2associatetriggerparam_builder_setassociateactionid"><div class="api-col left">Set Associate Action ID</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2trigger_djiwaypointv2associatetriggerparam_builder_setassociateactionid_inline">setAssociateActionID</a></div></div><div class="inline-doc" id="djiwaypointv2trigger_djiwaypointv2associatetriggerparam_builder_setassociateactionid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAssociateActionID</h6></div>

~~~java
 Builder setAssociateActionID(int associateActionID) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">Sets the action id the trigger associated with.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">associateActionID</td><td><font color="#666"><i>An int value of the associate action ID.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2AssociateTriggerParam_Builder.html#djiwaypointv2trigger_djiwaypointv2associatetriggerparam_builder">Builder</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiwaypointv2trigger_djiwaypointv2associatetriggerparam_builder_build"><div class="api-col left">Build</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiwaypointv2trigger_djiwaypointv2associatetriggerparam_builder_build_inline">build</a></div></div><div class="inline-doc" id="djiwaypointv2trigger_djiwaypointv2associatetriggerparam_builder_build_inline"

><div class="article"><h6 ><font color="#AAA">method </font>build</h6></div>

~~~java
 WaypointV2AssociateTriggerParam build() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.waypointv2.Action</td></tr></table></html>



##### Description:



<font color="#666">Generate the immutable class.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2AssociateTriggerParam.html#djiwaypointv2trigger_djiwaypointv2associatetriggerparam">WaypointV2AssociateTriggerParam</a></td><td><font color="#666"><i>The build of <code><a href="/Components/Missions/DJIWaypointV2Trigger_DJIWaypointV2AssociateTriggerParam.html#djiwaypointv2trigger_djiwaypointv2associatetriggerparam">WaypointV2AssociateTriggerParam</a></code>.</i></td></tr></table></html></div>


