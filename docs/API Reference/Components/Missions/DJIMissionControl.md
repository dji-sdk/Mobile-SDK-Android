<div class="article"><h1 ><font color="#AAA">class </font>MissionControl</h1></div>

~~~java
 class MissionControl implements TimelineElementFeedback, Triggerable 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Mission Control handles execution of missions. Either single missions can be run through dedicated mission operators, or a series of missions and actions can be run serially using the Timeline. <br><br> Mission operators look after execution of a single mission. A mission operator has APIs to control the mission (e.g. start, stop, pause etc.) and provides mission state through listeners. <br><br> Mission Control's Timeline is made up of a series of Timeline elements which can be Waypoint missions, Hotpoint missions (through the Hotpoint action <code><a href="/Components/Missions/DJIHotpointAction.html#djihotpointaction">HotpointAction</a></code>) or objects that follow the <code><a href="/Components/Missions/DJIMissionControlTimelineElement.html#djimissioncontroltimelineelement">TimelineElement</a></code> protocol. <code><a href="/Components/Missions/DJIMissionAction.html#djimissionaction">MissionAction</a></code> is a Timeline element, with <code><a href="/Components/Missions/DJIAircraftYawAction.html#djiaircraftyawaction">AircraftYawAction</a></code> and <code><a href="/Components/Missions/DJIGimbalAttitudeAction.html#djigimbalattitudeaction">GimbalAttitudeAction</a></code> subclasses being examples of specific actions. If a mission is being executed in a Timeline, the mission operator can still be used to get state information of the mission as well as change mission execution parameters. <br><br> Timeline elements can also have triggers (<code><a href="/Components/Missions/DJIMissionTrigger.html#djimissiontrigger">Trigger</a></code>) associated with them. Triggers are separate objects that are run in parallel with a Timeline element. The trigger object is used to initiate actions if a set of criteria are met. For example, a trigger could be used to monitor battery level, and then initiate an action once a threshold is passed. Mission Control's Timeline is only supported by aircrafts. Handheld devices (e.g. OSMO) do not support this feature. <br><br> > Mission Control is accessed from <code><a href="/Components/SDKManager/DJISDKManager.html#djisdkmanager_missioncontrol">getMissionControl</a></code> in <code><a href="/Components/SDKManager/DJISDKManager.html#djisdkmanager">DJISDKManager</a></code>.



##### Class Members:



#### Mission Operators

<div class="api-row" id="djimissioncontrol_waypointmissionoperator"><div class="api-col left">Waypoint Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_waypointmissionoperator_inline">getWaypointMissionOperator</a></div></div><div class="inline-doc" id="djimissioncontrol_waypointmissionoperator_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWaypointMissionOperator</h6></div>

~~~java
@NonNull
 WaypointMissionOperator getWaypointMissionOperator() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Returns the operator for waypoint missions.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointMissionOperator.html#djiwaypointmissionoperator">WaypointMissionOperator</a></td><td><font color="#666"><i>A Waypoint mission operator object.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontrol_hotpointmissionoperator"><div class="api-col left">Hotpoint Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_hotpointmissionoperator_inline">getHotpointMissionOperator</a></div></div><div class="inline-doc" id="djimissioncontrol_hotpointmissionoperator_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHotpointMissionOperator</h6></div>

~~~java
@NonNull
 HotpointMissionOperator getHotpointMissionOperator() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Returns the operator for Hotpoint missions.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIHotpointMissionOperator.html#djihotpointmissionoperator">HotpointMissionOperator</a></td><td><font color="#666"><i>A Hotpoint mission operator object.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontrol_followmemissionoperator"><div class="api-col left">Follow Me Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_followmemissionoperator_inline">getFollowMeMissionOperator</a></div></div><div class="inline-doc" id="djimissioncontrol_followmemissionoperator_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFollowMeMissionOperator</h6></div>

~~~java
@NonNull
 FollowMeMissionOperator getFollowMeMissionOperator() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Returns the operator for Follow Me missions.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIFollowMeMissionOperator.html#djifollowmemissionoperator">FollowMeMissionOperator</a></td><td><font color="#666"><i>A Follow Me mission operator object.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontrol_activetrackmissionoperator"><div class="api-col left">ActiveTrack Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_activetrackmissionoperator_inline">getActiveTrackOperator</a></div></div><div class="inline-doc" id="djimissioncontrol_activetrackmissionoperator_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getActiveTrackOperator</h6></div>

~~~java
@NonNull
 ActiveTrackOperator getActiveTrackOperator() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Returns the operator for ActiveTrack missions.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIActiveTrackMissionOperator.html#djiactivetrackmissionoperator">ActiveTrackOperator</a></td><td><font color="#666"><i>An ActiveTrack mission operator object.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontrol_tapflymissionoperator"><div class="api-col left">Tap Fly Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_tapflymissionoperator_inline">getTapFlyMissionOperator</a></div></div><div class="inline-doc" id="djimissioncontrol_tapflymissionoperator_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTapFlyMissionOperator</h6></div>

~~~java
@NonNull
 TapFlyMissionOperator getTapFlyMissionOperator() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Returns the operator for TapFly missions.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJITapFlyMissionOperator.html#djitapflymissionoperator">TapFlyMissionOperator</a></td><td><font color="#666"><i>A TapFly mission operator object.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontrol_panoramamissionoperator"><div class="api-col left">Panorama Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_panoramamissionoperator_inline">getPanoramaMissionOperator</a></div></div><div class="inline-doc" id="djimissioncontrol_panoramamissionoperator_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPanoramaMissionOperator</h6></div>

~~~java
@NonNull
 PanoramaMissionOperator getPanoramaMissionOperator() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Returns the operator for Panorama missions.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIPanoramaMissionOperator.html#djipanoramamissionoperator">PanoramaMissionOperator</a></td><td><font color="#666"><i>A Panorama mission operator object.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontrol_intelligenthotpointmissionoperator"><div class="api-col left">Intelligent Hotpoint Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_intelligenthotpointmissionoperator_inline">getIntelligentHotpointMissionOperator</a></div></div><div class="inline-doc" id="djimissioncontrol_intelligenthotpointmissionoperator_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getIntelligentHotpointMissionOperator</h6></div>

~~~java
@NonNull
 IntelligentHotpointMissionOperator getIntelligentHotpointMissionOperator() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Returns the operator for Intelligent Hotpoint missions.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator.html#djiintelligenthotpointmissionoperator">IntelligentHotpointMissionOperator</a></td><td><font color="#666"><i>An Intelligent Hotpoint mission operator object.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontrol_waypointv2missionoperator"><div class="api-col left">Waypoint V2 Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_waypointv2missionoperator_inline">getWaypointMissionV2Operator</a></div></div><div class="inline-doc" id="djimissioncontrol_waypointv2missionoperator_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWaypointMissionV2Operator</h6></div>

~~~java
@Nullable
 WaypointV2MissionOperator getWaypointMissionV2Operator() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Returns the operator for waypoint v2 mission. Only Supported by Matrice 300 RTK.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIWaypointV2MissionOperator.html#djiwaypointv2missionoperator">WaypointV2MissionOperator</a></td><td><font color="#666"><i>An waypoint v2 mission operator object.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Timeline

<div class="api-row" id="djimissioncontrol_scheduleelement"><div class="api-col left">Setup</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_scheduleelement_inline">scheduleElement</a></div></div><div class="inline-doc" id="djimissioncontrol_scheduleelement_inline"

><div class="article"><h6 ><font color="#AAA">method </font>scheduleElement</h6></div>

~~~java
 DJIError scheduleElement(@NonNull TimelineElement element) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Adds an element to the end of the Timeline.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIMissionControlTimelineElement.html#djimissioncontroltimelineelement">TimelineElement</a> <font color="#000">element</td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJIMissionControlTimelineElement.html#djimissioncontroltimelineelement">TimelineElement</a></code> element.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>The first error if one occurred.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontrol_scheduleelements"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_scheduleelements_inline">scheduleElements</a></div></div><div class="inline-doc" id="djimissioncontrol_scheduleelements_inline"

><div class="article"><h6 ><font color="#AAA">method </font>scheduleElements</h6></div>

~~~java
 DJIError scheduleElements(@NonNull List<TimelineElement> elements) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Adds a list of elements to the end of the Timeline.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull List&lt;<a href="/Components/Missions/DJIMissionControlTimelineElement.html#djimissioncontroltimelineelement">TimelineElement</a>&gt; <font color="#000">elements</td><td><font color="#666"><i>A list of <code><a href="/Components/Missions/DJIMissionControlTimelineElement.html#djimissioncontroltimelineelement">TimelineElement</a></code> elements.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>The first error if one occurred. </i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontrol_scheduleelementatindex"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_scheduleelementatindex_inline">scheduleElementAtIndex</a></div></div><div class="inline-doc" id="djimissioncontrol_scheduleelementatindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>scheduleElementAtIndex</h6></div>

~~~java
 DJIError scheduleElementAtIndex(TimelineElement element, int index) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Insert an element into the Timeline at an index.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIMissionControlTimelineElement.html#djimissioncontroltimelineelement">TimelineElement</a> <font color="#000">element</td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJIMissionControlTimelineElement.html#djimissioncontroltimelineelement">TimelineElement</a></code> element</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">index</td><td><font color="#666"><i>The element index to insert the new element before.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>The first error if one occurred.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontrol_unscheduleelement"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_unscheduleelement_inline">unscheduleElement</a></div></div><div class="inline-doc" id="djimissioncontrol_unscheduleelement_inline"

><div class="article"><h6 ><font color="#AAA">method </font>unscheduleElement</h6></div>

~~~java
 void unscheduleElement(TimelineElement element) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Remove element from the Timeline. If the same element was used more than once in the  Timeline, then the first one will be removed.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIMissionControlTimelineElement.html#djimissioncontroltimelineelement">TimelineElement</a> <font color="#000">element</td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJIMissionControlTimelineElement.html#djimissioncontroltimelineelement">TimelineElement</a></code> element that is already in the Timeline.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontrol_unscheduleelementatindex"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_unscheduleelementatindex_inline">unscheduleElementAtIndex</a></div></div><div class="inline-doc" id="djimissioncontrol_unscheduleelementatindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>unscheduleElementAtIndex</h6></div>

~~~java
 void unscheduleElementAtIndex(int index) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Removes the Element at an index in the Timeline.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">index</td><td><font color="#666"><i>Index of element to remove.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontrol_scheduledelementatindex"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_scheduledelementatindex_inline">scheduledElementAtIndex</a></div></div><div class="inline-doc" id="djimissioncontrol_scheduledelementatindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>scheduledElementAtIndex</h6></div>

~~~java
@Nullable
 TimelineElement scheduledElementAtIndex(int index) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Returns the element at a given index in the Timeline.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">index</td><td><font color="#666"><i>An element index in the Timeline.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIMissionControlTimelineElement.html#djimissioncontroltimelineelement">TimelineElement</a></td><td><font color="#666"><i>Either a mission, an element or <code>null</code> if nothing was at the given index.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontrol_scheduledcount"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_scheduledcount_inline">scheduledCount</a></div></div><div class="inline-doc" id="djimissioncontrol_scheduledcount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>scheduledCount</h6></div>

~~~java
 int scheduledCount() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Returns the number of elements within the Timeline.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Element count.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontrol_unscheduleeverything"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_unscheduleeverything_inline">unscheduleEverything</a></div></div><div class="inline-doc" id="djimissioncontrol_unscheduleeverything_inline"

><div class="article"><h6 ><font color="#AAA">method </font>unscheduleEverything</h6></div>

~~~java
 void unscheduleEverything() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Clears the Timeline, removing all elements.

</div>

<div class="api-row" id="djimissioncontrol_scheduletriggers"><div class="api-col left">Schedule Trigger</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_scheduletriggers_inline">setTriggers</a></div></div><div class="inline-doc" id="djimissioncontrol_scheduletriggers_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setTriggers</h6></div>

~~~java
@Override
 void setTriggers(List<Trigger> triggers) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Set the triggers for the Timeline.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;<a href="/Components/Missions/DJIMissionTrigger.html#djimissiontrigger">Trigger</a>&gt; <font color="#000">triggers</td><td><font color="#666"><i>List of <code><a href="/Components/Missions/DJIMissionTrigger.html#djimissiontrigger">Trigger</a></code> objects.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontrol_getscheduletriggers"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_getscheduletriggers_inline">getTriggers</a></div></div><div class="inline-doc" id="djimissioncontrol_getscheduletriggers_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTriggers</h6></div>

~~~java
@Override
 List<Trigger> getTriggers() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Returns the list of triggers which are dependents of the Timeline.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;<a href="/Components/Missions/DJIMissionTrigger.html#djimissiontrigger">Trigger</a>&gt;</td><td><font color="#666"><i><code><a href="/Components/Missions/DJIMissionTrigger.html#djimissiontrigger">Trigger</a></code> list.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontrol_starttimeline"><div class="api-col left">Control</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_starttimeline_inline">startTimeline</a></div></div><div class="inline-doc" id="djimissioncontrol_starttimeline_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startTimeline</h6></div>

~~~java
 void startTimeline() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Start Timeline execution from the current element index <code><a href="/Components/Missions/DJIMissionControl.html#djimissioncontrol_currenttimelinemarker">getCurrentTimelineMarker</a></code>.

</div>

<div class="api-row" id="djimissioncontrol_pausetimeline"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_pausetimeline_inline">pauseTimeline</a></div></div><div class="inline-doc" id="djimissioncontrol_pausetimeline_inline"

><div class="article"><h6 ><font color="#AAA">method </font>pauseTimeline</h6></div>

~~~java
 void pauseTimeline() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Pause execution of the Timeline, and current element (if pausible). If the current element is not pausible then this method will do nothing.

</div>

<div class="api-row" id="djimissioncontrol_resumetimeline"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_resumetimeline_inline">resumeTimeline</a></div></div><div class="inline-doc" id="djimissioncontrol_resumetimeline_inline"

><div class="article"><h6 ><font color="#AAA">method </font>resumeTimeline</h6></div>

~~~java
 void resumeTimeline() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Resume element and Timeline execution.

</div>

<div class="api-row" id="djimissioncontrol_stoptimeline"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_stoptimeline_inline">stopTimeline</a></div></div><div class="inline-doc" id="djimissioncontrol_stoptimeline_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopTimeline</h6></div>

~~~java
 void stopTimeline() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Stops the execution of the Timeline, resets the marker index to 0.  Release thread resources of timeline.

</div>

<div class="api-row" id="djimissioncontrol_istimelinerunning"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_istimelinerunning_inline">isTimelineRunning</a></div></div><div class="inline-doc" id="djimissioncontrol_istimelinerunning_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isTimelineRunning</h6></div>

~~~java
 boolean isTimelineRunning() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the Timeline is running.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value that is <code>true</code> if Timeline is running.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontrol_currenttimelinemarker"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_currenttimelinemarker_inline">getCurrentTimelineMarker</a></div></div><div class="inline-doc" id="djimissioncontrol_currenttimelinemarker_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrentTimelineMarker</h6></div>

~~~java
 int getCurrentTimelineMarker() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Tells the index in the timeline array that marks where the timeline is currently at.  Changing this value will reposition where the timeline will resume/start work.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Timeline element index.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontrol_setcurrenttimelinemarker"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_setcurrenttimelinemarker_inline">setCurrentTimelineMarker</a></div></div><div class="inline-doc" id="djimissioncontrol_setcurrenttimelinemarker_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCurrentTimelineMarker</h6></div>

~~~java
 void setCurrentTimelineMarker(int currentTimelineMaker) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Sets the element index within the Timeline to start execution.  This value can be set only when a Timeline is stopped (not executing or paused).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">currentTimelineMaker</td><td><font color="#666"><i>Timeline element index.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontrol_istimelinepaused"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_istimelinepaused_inline">isTimelinePaused</a></div></div><div class="inline-doc" id="djimissioncontrol_istimelinepaused_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isTimelinePaused</h6></div>

~~~java
 boolean isTimelinePaused() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if Timeline is paused.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if Timeline is paused.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontrol_runningelement"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_runningelement_inline">getRunningElement</a></div></div><div class="inline-doc" id="djimissioncontrol_runningelement_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRunningElement</h6></div>

~~~java
@Nullable
 TimelineElement getRunningElement() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">The current element that is running in the Timeline. If the Timeline is not running, then this is <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIMissionControlTimelineElement.html#djimissioncontroltimelineelement">TimelineElement</a></td><td><font color="#666"><i>Timeline element</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontrol_addlistenertotimelineprogresswithblock"><div class="api-col left">Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_addlistenertotimelineprogresswithblock_inline">addListener</a></div></div><div class="inline-doc" id="djimissioncontrol_addlistenertotimelineprogresswithblock_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addListener</h6></div>

~~~java
 void addListener(Listener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Adds a listener to all Timeline events.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Listener <font color="#000">listener</td><td><font color="#666"><i>A listener object.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontrol_removelistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_removelistener_inline">removeListener</a></div></div><div class="inline-doc" id="djimissioncontrol_removelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeListener</h6></div>

~~~java
 void removeListener(Listener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Removes the listener from the Timeline events listeners pool.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Listener <font color="#000">listener</td><td><font color="#666"><i>A previously added listener object.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontrol_removealllisteners"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_removealllisteners_inline">removeAllListeners</a></div></div><div class="inline-doc" id="djimissioncontrol_removealllisteners_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeAllListeners</h6></div>

~~~java
 void removeAllListeners() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Removes all listeners from the Timeline events listeners pool.

</div>

<html><p><br></p></html>

##### Related:

<div class="api-row" id="djitriggerable"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJITriggerable.html">Triggerable</a></div></div><div class="api-row" id="djimissioncontroltimelineelement"><div class="api-col left">Timeline Element</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIMissionControlTimelineElement.html">TimelineElement</a></div></div><div class="api-row" id="djimissioncontrol_djimissioncontroltimelineeventblockinterface"><div class="api-col left">Timeline Event</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIMissionControl_DJIMissionControlTimelineEventBlockInterface.html">Listener</a></div></div><div class="api-row" id="djimissioncontrol_djimissioncontroltimelineevent"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_djimissioncontroltimelineevent_inline">TimelineEvent</a></div></div><div class="inline-doc" id="djimissioncontrol_djimissioncontroltimelineevent_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>TimelineEvent</h6></div>

~~~java
 enum TimelineEvent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline</td></tr></table></html>



##### Description:



<font color="#666">Events that can initiate a call to the Mission Control listener.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djimissioncontrol_djimissioncontroltimelineevent_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown event type. This is a default value if no other event is matching.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimissioncontrol_djimissioncontroltimelineevent_started_inline"></a>STARTED</td><td><font color="#666">Timeline successfully started.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimissioncontrol_djimissioncontroltimelineevent_starterror_inline"></a>START_ERROR</td><td><font color="#666">Timeline failed to start.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimissioncontrol_djimissioncontroltimelineevent_progressed_inline"></a>PROGRESSED</td><td><font color="#666">Timeline element progressed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimissioncontrol_djimissioncontroltimelineevent_paused_inline"></a>PAUSED</td><td><font color="#666">Timeline successfully paused.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimissioncontrol_djimissioncontroltimelineevent_pauseerror_inline"></a>PAUSE_ERROR</td><td><font color="#666">Timeline failed to be paused.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimissioncontrol_djimissioncontroltimelineevent_resumed_inline"></a>RESUMED</td><td><font color="#666">Timeline successfully resumed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimissioncontrol_djimissioncontroltimelineevent_resumeerror_inline"></a>RESUME_ERROR</td><td><font color="#666">Timeline failed to resume.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimissioncontrol_djimissioncontroltimelineevent_stopped_inline"></a>STOPPED</td><td><font color="#666">Timeline Stopped successfully.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimissioncontrol_djimissioncontroltimelineevent_stoperror_inline"></a>STOP_ERROR</td><td><font color="#666">Timeline failed to stop and is still continuing in its previous state.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djimissioncontrol_djimissioncontroltimelineevent_finished_inline"></a>FINISHED</td><td><font color="#666">Timeline completed its execution normally.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djimissioncontroltimelineelementfeedback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIMissionControlTimelineElementFeedback.html">TimelineElementFeedback</a></div></div><div class="api-row" id="djimissioncontrolerror"><div class="api-col left">Error</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIMissionControlError.html">MissionControlError</a></div></div>
