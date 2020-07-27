<div class="article"><h1 ><font color="#AAA">class </font>GoToAction</h1></div>

~~~java
 class GoToAction extends MissionAction 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.actions</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/Missions/DJIMissionAction.html#djimissionaction">MissionAction</a></code></td></tr></table></html>



##### Description:



<font color="#666">This class represents a go-to action used as an element in a Timeline mission. By creating an object of this class and adding it to Mission Control's Timeline,  the aircraft will go to a specified location when the Timeline reaches the action.



##### Class Members:

<div class="api-row" id="djigotoaction_initwithcoordinate"><div class="api-col left">Constructor</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigotoaction_initwithcoordinate_inline">GoToAction</a></div></div><div class="inline-doc" id="djigotoaction_initwithcoordinate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>GoToAction</h6></div>

~~~java
 GoToAction(LocationCoordinate2D coordinate) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.actions</td></tr></table></html>



##### Description:



<font color="#666">Go to the specified coordinate from the current aircraft position.  The actionType of this object is set to GoToActionType.COORDINATE.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a> <font color="#000">coordinate</td><td><font color="#666"><i>Target coordinate.</i></td></tr></table></html></div>

<div class="api-row" id="djigotoaction_initwithaltitude"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigotoaction_initwithaltitude_inline">GoToAction</a></div></div><div class="inline-doc" id="djigotoaction_initwithaltitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>GoToAction</h6></div>

~~~java
 GoToAction(float altitude) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.actions</td></tr></table></html>



##### Description:



<font color="#666">Go to the specified altitude (in meters) from the current aircraft position. The  actionType of this object is set to GoToActionType.ALTITUDE.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">altitude</td><td><font color="#666"><i>Target altitude in meters.</i></td></tr></table></html></div>

<div class="api-row" id="djigotoaction_initwithcoordinatewithaltitude"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigotoaction_initwithcoordinatewithaltitude_inline">GoToAction</a></div></div><div class="inline-doc" id="djigotoaction_initwithcoordinatewithaltitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>GoToAction</h6></div>

~~~java
 GoToAction(LocationCoordinate2D coordinate, float altitude) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.actions</td></tr></table></html>



##### Description:



<font color="#666">Go to the specified coordinate and altitude (in meters) from the current aircraft position.   The actionType of this object is set to GoToActionType.COORDINATE_AND_ALTITUDE.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a> <font color="#000">coordinate</td><td><font color="#666"><i>Target coordinate.</i></td></tr><tr valign="top"><td><font color="#70BF41">float <font color="#000">altitude</td><td><font color="#666"><i>Target altitude in meters.</i></td></tr></table></html></div>

<div class="api-row" id="djigotoaction_setflightspeed"><div class="api-col left">Flight Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigotoaction_setflightspeed_inline">setFlightSpeed</a></div></div><div class="inline-doc" id="djigotoaction_setflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFlightSpeed</h6></div>

~~~java
 void setFlightSpeed(float flightSpeed) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.actions</td></tr></table></html>



##### Description:



<font color="#666">Flight speed of the aircraft when going to the target location. Default is 8 m/s.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">flightSpeed</td><td><font color="#666"><i>A float value of the flight speed.</i></td></tr></table></html></div>

<div class="api-row" id="djigotoaction_getflightspeed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigotoaction_getflightspeed_inline">getFlightSpeed</a></div></div><div class="inline-doc" id="djigotoaction_getflightspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlightSpeed</h6></div>

~~~java
 float getFlightSpeed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.actions</td></tr></table></html>



##### Description:



<font color="#666">Flight speed of the aircraft when going to the target location. Default is 8 m/s.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of flight speed.</i></td></tr></table></html></div>



#### GoToAction

<div class="api-row" id="djigotoaction_djigotoactionerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIGoToAction_DJIGoToActionError.html">GoToActionError</a></div></div>

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


