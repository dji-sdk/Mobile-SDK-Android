<div class="article"><h1 ><font color="#AAA">class </font>HotpointAction</h1></div>

~~~java
 class HotpointAction extends MissionAction 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.actions</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/Missions/DJIMissionAction.html#djimissionaction">MissionAction</a></code></td></tr></table></html>



##### Description:



<font color="#666">This class represents a hotpoint action used as an element in a Timeline mission. By creating an object of this class and adding it to Mission Control's Timeline,  the aircraft will fly along a portion of a circle centered on a location of interest when the Timeline reaches the action.



##### Class Members:

<div class="api-row" id="djihotpointaction_initwithmission"><div class="api-col left">Constructor</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointaction_initwithmission_inline">HotpointAction</a></div></div><div class="inline-doc" id="djihotpointaction_initwithmission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>HotpointAction</h6></div>

~~~java
 HotpointAction(HotpointMission hotpointMission) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.actions</td></tr></table></html>



##### Description:



<font color="#666">Initialize with hotpoint mission. The Hotpoint action  will automatically stop after one complete orbit (360 degrees).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission">HotpointMission</a> <font color="#000">hotpointMission</td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission">HotpointMission</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointaction_initwithmissionsurroundingangle"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointaction_initwithmissionsurroundingangle_inline">HotpointAction</a></div></div><div class="inline-doc" id="djihotpointaction_initwithmissionsurroundingangle_inline"

><div class="article"><h6 ><font color="#AAA">method </font>HotpointAction</h6></div>

~~~java
 HotpointAction(HotpointMission mission, float surroundingAngle) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.actions</td></tr></table></html>



##### Description:



<font color="#666">Initialize with a hotpoint mission and the angular distance the  aircraft should travel within the orbit.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission">HotpointMission</a> <font color="#000">mission</td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission">HotpointMission</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">float <font color="#000">surroundingAngle</td><td><font color="#666"><i>Angle in degrees.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointaction_surroundingangle"><div class="api-col left">Surrounding Angle</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointaction_surroundingangle_inline">setSurroundingAngle</a></div></div><div class="inline-doc" id="djihotpointaction_surroundingangle_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSurroundingAngle</h6></div>

~~~java
 void setSurroundingAngle(float surroundingAngle) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.actions</td></tr></table></html>



##### Description:



<font color="#666">The angular distance in degrees the aircraft will travel in the  orbit of the hotpoint. The default is 360 degrees.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">surroundingAngle</td><td><font color="#666"><i>Angle in degrees</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointaction_getsurroundingangle"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointaction_getsurroundingangle_inline">getSurroundingAngle</a></div></div><div class="inline-doc" id="djihotpointaction_getsurroundingangle_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSurroundingAngle</h6></div>

~~~java
 float getSurroundingAngle() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.actions</td></tr></table></html>



##### Description:



<font color="#666">The angular distance in degrees the aircraft will travel in the  orbit of the hotpoint. The default is 360 degrees.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>Angle in degrees.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointaction_mission"><div class="api-col left">Mission</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointaction_mission_inline">getHotpointMission</a></div></div><div class="inline-doc" id="djihotpointaction_mission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHotpointMission</h6></div>

~~~java
 HotpointMission getHotpointMission() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.actions</td></tr></table></html>



##### Description:



<font color="#666">The hotpoint mission which is associated with this action.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission">HotpointMission</a></td><td><font color="#666"><i>A <code><a href="/Components/Missions/DJIHotPointMission.html#djihotpointmission">HotpointMission</a></code> object.</i></td></tr></table></html></div>



##### Inherited Methods:

<div class="api-row" id="djimissionaction_isrunning"><div class="api-col left">dji.sdk.mission.timeline.actions.MissionAction</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissionaction_isrunning_inline">isRunning</a></div></div><div class="inline-doc" id="djimissionaction_isrunning_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isRunning</h6></div>

~~~java
 boolean isRunning() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.actions</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the action is running.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>



##### Inherited Methods:

<div class="api-row" id="djimissioncontroltimelineelement_triggers"><div class="api-col left">dji.sdk.mission.timeline.TimelineElement</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontroltimelineelement_triggers_inline">getTriggers</a></div></div><div class="inline-doc" id="djimissioncontroltimelineelement_triggers_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTriggers</h6></div>

~~~java
 List<Trigger> getTriggers() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline</td></tr></table></html>



##### Description:



<font color="#666">If implemented, Mission Control loads and activates the triggers for the duration that the Timeline element is executing.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;<a href="/Components/Missions/DJIMissionTrigger.html#djimissiontrigger">Trigger</a>&gt;</td><td><font color="#666"><i>A List of <code><a href="/Components/Missions/DJIMissionTrigger.html#djimissiontrigger">Trigger</a></code> object.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontroltimelineelement_settriggers"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontroltimelineelement_settriggers_inline">setTriggers</a></div></div><div class="inline-doc" id="djimissioncontroltimelineelement_settriggers_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setTriggers</h6></div>

~~~java
 void setTriggers(List<Trigger> triggers) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline</td></tr></table></html>



##### Description:



<font color="#666">Set the triggers array list to the timeline.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;<a href="/Components/Missions/DJIMissionTrigger.html#djimissiontrigger">Trigger</a>&gt; <font color="#000">triggers</td><td><font color="#666"><i>A list of <code><a href="/Components/Missions/DJIMissionTrigger.html#djimissiontrigger">Trigger</a></code> objects.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontroltimelineelement_ispausable"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontroltimelineelement_ispausable_inline">isPausable</a></div></div><div class="inline-doc" id="djimissioncontroltimelineelement_ispausable_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isPausable</h6></div>

~~~java
 boolean isPausable()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the element can be paused. If <code>false</code>, then when the Timeline is asked  to pause when this element is running, nothing will happen.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the element can be paused.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontroltimelineelement_checkvalidity"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontroltimelineelement_checkvalidity_inline">checkValidity</a></div></div><div class="inline-doc" id="djimissioncontroltimelineelement_checkvalidity_inline"

><div class="article"><h6 ><font color="#AAA">method </font>checkValidity</h6></div>

~~~java
 DJIError checkValidity()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline</td></tr></table></html>



##### Description:



<font color="#666">Returns an error if there is a configuration or parameter error in the element.  Returns <code>null</code> if there is no issue.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>A <code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code> object.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontroltimelineelement_willrun"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontroltimelineelement_willrun_inline">willRun</a></div></div><div class="inline-doc" id="djimissioncontroltimelineelement_willrun_inline"

><div class="article"><h6 ><font color="#AAA">method </font>willRun</h6></div>

~~~java
 void willRun()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline</td></tr></table></html>



##### Description:



<font color="#666">If Implemented, this is called by Mission Control right before running the element.

</div>

<div class="api-row" id="djimissioncontroltimelineelement_run"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontroltimelineelement_run_inline">run</a></div></div><div class="inline-doc" id="djimissioncontroltimelineelement_run_inline"

><div class="article"><h6 ><font color="#AAA">method </font>run</h6></div>

~~~java
 void run()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline</td></tr></table></html>



##### Description:



<font color="#666">Starts execution of Timeline element. Missions adopting this behavior are being run with their respective operators.

</div>

<div class="api-row" id="djimissioncontroltimelineelement_pauserun"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontroltimelineelement_pauserun_inline">pause</a></div></div><div class="inline-doc" id="djimissioncontroltimelineelement_pauserun_inline"

><div class="article"><h6 ><font color="#AAA">method </font>pause</h6></div>

~~~java
 void pause() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline</td></tr></table></html>



##### Description:



<font color="#666">Pauses the execution of the element. Must be implemented if <code><a href="/Components/Missions/DJIMissionControlTimelineElement.html#djimissioncontroltimelineelement_ispausable">isPausable</a></code> returns <code>true</code>.

</div>

<div class="api-row" id="djimissioncontroltimelineelement_resumerun"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontroltimelineelement_resumerun_inline">resume</a></div></div><div class="inline-doc" id="djimissioncontroltimelineelement_resumerun_inline"

><div class="article"><h6 ><font color="#AAA">method </font>resume</h6></div>

~~~java
 void resume() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline</td></tr></table></html>



##### Description:



<font color="#666">Resumes the execution of the element. Must be implemented if <code><a href="/Components/Missions/DJIMissionControlTimelineElement.html#djimissioncontroltimelineelement_ispausable">isPausable</a></code> returns <code>true</code>.

</div>

<div class="api-row" id="djimissioncontroltimelineelement_stoprun"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontroltimelineelement_stoprun_inline">stop</a></div></div><div class="inline-doc" id="djimissioncontroltimelineelement_stoprun_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stop</h6></div>

~~~java
 void stop()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline</td></tr></table></html>



##### Description:



<font color="#666">Stops execution of the element.

</div>

<div class="api-row" id="djimissioncontroltimelineelement_didrun"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontroltimelineelement_didrun_inline">didRun</a></div></div><div class="inline-doc" id="djimissioncontroltimelineelement_didrun_inline"

><div class="article"><h6 ><font color="#AAA">method </font>didRun</h6></div>

~~~java
 void didRun()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline</td></tr></table></html>



##### Description:



<font color="#666">Called after element execution, regardless of whether or not it was successful.

</div>


