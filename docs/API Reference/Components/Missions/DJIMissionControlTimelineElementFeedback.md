<div class="article"><h1 ><font color="#AAA">class </font>TimelineElementFeedback</h1></div>

~~~java
 interface TimelineElementFeedback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline</td></tr></table></html>



##### Description:



<font color="#666">This protocol defines how the timeline element may contact mission control  to notify it of its own execution. This protocol is not intended to be  implemented by any other object and the use of a protocol is primarily  organizational.



##### Class Members:



#### Callback Method

<div class="api-row" id="djimissioncontroltimelineelementfeedback_elementdidstartrunning"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontroltimelineelementfeedback_elementdidstartrunning_inline">onStart</a></div></div><div class="inline-doc" id="djimissioncontroltimelineelementfeedback_elementdidstartrunning_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onStart</h6></div>

~~~java
@Override
 void onStart(TimelineElement element) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Used by elements to notify Mission Control of their successful start.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIMissionControlTimelineElement.html#djimissioncontroltimelineelement">TimelineElement</a> <font color="#000">element</td><td><font color="#666"><i>A previously scheduled element. Should also be the element running.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontroltimelineelementfeedback_elementfailedstartingwitherror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontroltimelineelementfeedback_elementfailedstartingwitherror_inline">onStartWithError</a></div></div><div class="inline-doc" id="djimissioncontroltimelineelementfeedback_elementfailedstartingwitherror_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onStartWithError</h6></div>

~~~java
@Override
 void onStartWithError(TimelineElement element, DJIError error) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Used by elements to notify Mission Control of a failure preventing to start.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIMissionControlTimelineElement.html#djimissioncontroltimelineelement">TimelineElement</a> <font color="#000">element</td><td><font color="#666"><i>A previously scheduled element. Should also be the element running.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a> <font color="#000">error</td><td><font color="#666"><i>A valid error object.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontroltimelineelementfeedback_elementprogressedwitherror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontroltimelineelementfeedback_elementprogressedwitherror_inline">onProgressWithError</a></div></div><div class="inline-doc" id="djimissioncontroltimelineelementfeedback_elementprogressedwitherror_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onProgressWithError</h6></div>

~~~java
@Override
 void onProgressWithError(TimelineElement element, @Nullable DJIError error) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Used by elements to notify Mission Control of a progress in the execution. Additional information may be pulled by mission control depending on the element. Calling this method with an error means the element is still running  and the error did not cause it to stop.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIMissionControlTimelineElement.html#djimissioncontroltimelineelement">TimelineElement</a> <font color="#000">element</td><td><font color="#666"><i>A previously scheduled element. Should also be the element running.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a> <font color="#000">error</td><td><font color="#666"><i>An optional error if something went wrong.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontroltimelineelementfeedback_elementdidpause"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontroltimelineelementfeedback_elementdidpause_inline">onPause</a></div></div><div class="inline-doc" id="djimissioncontroltimelineelementfeedback_elementdidpause_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onPause</h6></div>

~~~java
@Override
 void onPause(TimelineElement element) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Used by elements to notify Mission Control of a successful pausing.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIMissionControlTimelineElement.html#djimissioncontroltimelineelement">TimelineElement</a> <font color="#000">element</td><td><font color="#666"><i>A previously scheduled element. Should also be the element running.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontroltimelineelementfeedback_elementfailedpausingwitherror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontroltimelineelementfeedback_elementfailedpausingwitherror_inline">onPauseWithError</a></div></div><div class="inline-doc" id="djimissioncontroltimelineelementfeedback_elementfailedpausingwitherror_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onPauseWithError</h6></div>

~~~java
@Override
 void onPauseWithError(TimelineElement element, DJIError error) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Used by elements to notify Mission Control of a failure to pause. The element is expected to be still running.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIMissionControlTimelineElement.html#djimissioncontroltimelineelement">TimelineElement</a> <font color="#000">element</td><td><font color="#666"><i>A previously scheduled element. Should also be the element running.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a> <font color="#000">error</td><td><font color="#666"><i>A valid error object.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontroltimelineelementfeedback_elementdidresume"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontroltimelineelementfeedback_elementdidresume_inline">onResume</a></div></div><div class="inline-doc" id="djimissioncontroltimelineelementfeedback_elementdidresume_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onResume</h6></div>

~~~java
@Override
 void onResume(TimelineElement element) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Used by elements to notify Mission Control of a successful resuming of a previously paused element.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIMissionControlTimelineElement.html#djimissioncontroltimelineelement">TimelineElement</a> <font color="#000">element</td><td><font color="#666"><i>A previously scheduled element. Should also be the element running.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontroltimelineelementfeedback_elementfailedresumingwitherror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontroltimelineelementfeedback_elementfailedresumingwitherror_inline">onResumeWithError</a></div></div><div class="inline-doc" id="djimissioncontroltimelineelementfeedback_elementfailedresumingwitherror_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onResumeWithError</h6></div>

~~~java
@Override
 void onResumeWithError(TimelineElement element, DJIError error) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Used by elements to notify Mission Control of a failure to resume. The element is expected to be still paused.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIMissionControlTimelineElement.html#djimissioncontroltimelineelement">TimelineElement</a> <font color="#000">element</td><td><font color="#666"><i>A previously scheduled element. Should also be the element running.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a> <font color="#000">error</td><td><font color="#666"><i>A valid error object.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontroltimelineelementfeedback_elementdidfinishrunningwitherror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontroltimelineelementfeedback_elementdidfinishrunningwitherror_inline">onFinishWithError</a></div></div><div class="inline-doc" id="djimissioncontroltimelineelementfeedback_elementdidfinishrunningwitherror_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onFinishWithError</h6></div>

~~~java
@Override
 void onFinishWithError(TimelineElement element, DJIError error) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Used by elements to notify Mission Control of the end of the execution of it.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIMissionControlTimelineElement.html#djimissioncontroltimelineelement">TimelineElement</a> <font color="#000">element</td><td><font color="#666"><i>A previously scheduled element. Should also be the element running.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a> <font color="#000">error</td><td><font color="#666"><i>An optional error if the execution end was the result of it.</i></td></tr></table></html></div>

<div class="api-row" id="djimissioncontroltimelineelementfeedback_elementfailedstoppingwitherror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontroltimelineelementfeedback_elementfailedstoppingwitherror_inline">onStopWithError</a></div></div><div class="inline-doc" id="djimissioncontroltimelineelementfeedback_elementfailedstoppingwitherror_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onStopWithError</h6></div>

~~~java
@Override
 void onStopWithError(TimelineElement element, DJIError error) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Used by elements to notify Mission Control of a failure to stop the execution of the element. This should only be used to handle error after stopRun is called.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIMissionControlTimelineElement.html#djimissioncontroltimelineelement">TimelineElement</a> <font color="#000">element</td><td><font color="#666"><i>A previously scheduled element. Should also be the element running.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a> <font color="#000">error</td><td><font color="#666"><i>A valid error object.</i></td></tr></table></html></div>


