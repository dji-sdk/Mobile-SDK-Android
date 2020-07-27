<div class="article"><h1 ><font color="#AAA">class </font>RecordVideoAction</h1></div>

~~~java
 class RecordVideoAction extends MissionAction 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.actions</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/Missions/DJIMissionAction.html#djimissionaction">MissionAction</a></code></td></tr></table></html>



##### Description:



<font color="#666">This class represents a video recording action used as an element in a Timeline mission. By creating an object of this class and adding it to Mission Control's Timeline,  the camera can start or stop video recording when the Timeline reaches the action.



##### Class Members:

<div class="api-row" id="djirecordvideoaction_initwithduration"><div class="api-col left">Constructor</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirecordvideoaction_initwithduration_inline">newRecordVideoActionWithDuration</a></div></div><div class="inline-doc" id="djirecordvideoaction_initwithduration_inline"

><div class="article"><h6 ><font color="#AAA">method </font>newRecordVideoActionWithDuration</h6></div>

~~~java
 static RecordVideoAction newRecordVideoActionWithDuration(int duration) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.actions</td></tr></table></html>



##### Description:



<font color="#666">Initialize instance with video recording duration in seconds.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">duration</td><td><font color="#666"><i>Time in seconds.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/Missions/DJIRecordVideoAction.html#djirecordvideoaction">RecordVideoAction</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/Missions/DJIRecordVideoAction.html#djirecordvideoaction">RecordVideoAction</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djirecordvideoaction_initwithstartrecordvideo"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirecordvideoaction_initwithstartrecordvideo_inline">newStartRecordVideoAction</a></div></div><div class="inline-doc" id="djirecordvideoaction_initwithstartrecordvideo_inline"

><div class="article"><h6 ><font color="#AAA">method </font>newStartRecordVideoAction</h6></div>

~~~java
 static RecordVideoAction newStartRecordVideoAction() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.actions</td></tr></table></html>



##### Description:



<font color="#666">Initialize instance for start video recording only.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/Missions/DJIRecordVideoAction.html#djirecordvideoaction">RecordVideoAction</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/Missions/DJIRecordVideoAction.html#djirecordvideoaction">RecordVideoAction</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djirecordvideoaction_initwithstoprecordvideo"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirecordvideoaction_initwithstoprecordvideo_inline">newStopRecordVideoAction</a></div></div><div class="inline-doc" id="djirecordvideoaction_initwithstoprecordvideo_inline"

><div class="article"><h6 ><font color="#AAA">method </font>newStopRecordVideoAction</h6></div>

~~~java
 static RecordVideoAction newStopRecordVideoAction() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.actions</td></tr></table></html>



##### Description:



<font color="#666">Initialize instance for stop video recording only.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/Missions/DJIRecordVideoAction.html#djirecordvideoaction">RecordVideoAction</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/Missions/DJIRecordVideoAction.html#djirecordvideoaction">RecordVideoAction</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djirecordvideoaction_setcameraindex"><div class="api-col left">Camera Index</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirecordvideoaction_setcameraindex_inline">setCameraIndex</a></div></div><div class="inline-doc" id="djirecordvideoaction_setcameraindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCameraIndex</h6></div>

~~~java
 void setCameraIndex(int index) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.actions</td></tr></table></html>



##### Description:



<font color="#666">Set the expected action camera index. For example there are two  cameras in M210, if you want to run action on camera I, you can  either set the index as 0 or do nothing because of the default  index is 0; if you want to run action on camera II, you need set  the index as 1. Default index is 0 if user does not call this method  to specify the index.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">index</td><td><font color="#666"><i>Index of the camera on which the action is expected to run.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djirecordvideoaction_djirecordvideoactionerror"><div class="api-col left">Error</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Missions/DJIRecordVideoAction_DJIRecordVideoActionError.html">RecordVideoActionError</a></div></div>

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


