<div class="article"><h1 ><font color="#AAA">class </font>BatteryPowerLevelTrigger</h1></div>

~~~java
 class BatteryPowerLevelTrigger extends Trigger 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.triggers</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/Missions/DJIMissionTrigger.html#djimissiontrigger">Trigger</a></code></td></tr></table></html>



##### Description:



<font color="#666">The class can be used to trigger an action during the execution of a  timeline if the aircraft battery goes below a certain level.



##### Class Members:

<div class="api-row" id="djimissiontrigger_djibatterylevelmissiontrigger_batterypercentagetriggervalue"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissiontrigger_djibatterylevelmissiontrigger_batterypercentagetriggervalue_inline">setPowerPercentageTriggerValue</a></div></div><div class="inline-doc" id="djimissiontrigger_djibatterylevelmissiontrigger_batterypercentagetriggervalue_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPowerPercentageTriggerValue</h6></div>

~~~java
 void setPowerPercentageTriggerValue(float powerPercentageTriggerValue) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.triggers</td></tr></table></html>



##### Description:



<font color="#666">If the remaining percentage drops below or equal to this value, the action will be triggered.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">powerPercentageTriggerValue</td><td><font color="#666"><i>The power percentage trigger value to set.</i></td></tr></table></html></div>



##### Inherited Methods:

<div class="api-row" id="djimissiontrigger_isactive"><div class="api-col left">dji.sdk.mission.timeline.triggers.Trigger</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissiontrigger_isactive_inline">isActive</a></div></div><div class="inline-doc" id="djimissiontrigger_isactive_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isActive</h6></div>

~~~java
 boolean isActive() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.triggers</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the trigger is currently active. The trigger is active when the Timeline element it is associated with is being executed in the Timeline.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if active.</i></td></tr></table></html></div>

<div class="api-row" id="djimissiontrigger_setaction"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissiontrigger_setaction_inline">setAction</a></div></div><div class="inline-doc" id="djimissiontrigger_setaction_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAction</h6></div>

~~~java
 void setAction(Action action) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.triggers</td></tr></table></html>



##### Description:



<font color="#666">The action to execute. It is up to the trigger's implementation to decide when  to call this action. The action should never be called by anything but the  trigger. Actions can be implemented without using this property, but in addition <code><a href="/Components/Missions/DJIMissionTrigger.html#djimissiontrigger_notifylistenersofeventerror">notifyListenersOfEvent</a></code> needs to be used to notify any listeners of the Trigger that an action was executed. <br><br> In future subclasses of this property to be provided, this action  block will be used to give developers control of an action when a  set of criteria has been met. For example, a subclass of this may  be a battery threshold trigger. Once the battery passes some threshold developers will be able to define the action they want to trigger.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIMissionTrigger_DJIMissionTriggerActionInterface.html#djimissiontrigger_djimissiontriggeractioninterface">Action</a> <font color="#000">action</td><td><font color="#666"><i>Action to trigger.</i></td></tr></table></html></div>

<div class="api-row" id="djimissiontrigger_start"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissiontrigger_start_inline">start</a></div></div><div class="inline-doc" id="djimissiontrigger_start_inline"

><div class="article"><h6 ><font color="#AAA">method </font>start</h6></div>

~~~java
 void start()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.triggers</td></tr></table></html>



##### Description:



<font color="#666">Begins trigger activity including monitoring the criteria required to  trigger the action. When subclassing,  the super class's <code>start</code> method should be called on the first line.

</div>

<div class="api-row" id="djimissiontrigger_stop"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissiontrigger_stop_inline">stop</a></div></div><div class="inline-doc" id="djimissiontrigger_stop_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stop</h6></div>

~~~java
 void stop() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.triggers</td></tr></table></html>



##### Description:



<font color="#666">Ends all trigger activities including monitoring the criteria required to  trigger the action. When subclassing,  the super class's <code>stop</code> method should be called at the end.

</div>

<div class="api-row" id="djimissiontrigger_addlistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissiontrigger_addlistener_inline">addListener</a></div></div><div class="inline-doc" id="djimissiontrigger_addlistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addListener</h6></div>

~~~java
 void addListener(Listener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.triggers</td></tr></table></html>



##### Description:



<font color="#666">Adds a listener to all trigger events 



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Listener <font color="#000">listener</td><td><font color="#666"><i>A listener object</i></td></tr></table></html></div>

<div class="api-row" id="djimissiontrigger_removelistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissiontrigger_removelistener_inline">removeListener</a></div></div><div class="inline-doc" id="djimissiontrigger_removelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeListener</h6></div>

~~~java
 void removeListener(Listener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.triggers</td></tr></table></html>



##### Description:



<font color="#666">Removes the listener from the listeners pool of all trigger events.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Listener <font color="#000">listener</td><td><font color="#666"><i>A previously added listener object.</i></td></tr></table></html></div>

<div class="api-row" id="djimissiontrigger_removealllisteners"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissiontrigger_removealllisteners_inline">removeAllListeners</a></div></div><div class="inline-doc" id="djimissiontrigger_removealllisteners_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeAllListeners</h6></div>

~~~java
 void removeAllListeners()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.triggers</td></tr></table></html>



##### Description:



<font color="#666">Removes all listeners from the listeners pool of all trigger events.

</div>

<div class="api-row" id="djimissiontrigger_notifylistenersofeventerror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissiontrigger_notifylistenersofeventerror_inline">notifyListenersOfEvent</a></div></div><div class="inline-doc" id="djimissiontrigger_notifylistenersofeventerror_inline"

><div class="article"><h6 ><font color="#AAA">method </font>notifyListenersOfEvent</h6></div>

~~~java
 void notifyListenersOfEvent(TriggerEvent event, DJIError error) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.triggers</td></tr></table></html>



##### Description:



<font color="#666">Notifies listeners about a trigger event. Should be used in subclasses especially after calling the action.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIMissionTrigger.html#djimissiontrigger_djimissiontriggerevent">TriggerEvent</a> <font color="#000">event</td><td><font color="#666"><i>A valid DJIMissionTriggerEvent.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a> <font color="#000">error</td><td><font color="#666"><i>An optional error.</i></td></tr></table></html></div>


