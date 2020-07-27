<div class="article"><h1 ><font color="#AAA">class </font>Listener</h1></div>

~~~java
 interface Listener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Listener used to process Timeline events.



##### Class Members:



#### Callback Method

<div class="api-row" id="djimissioncontrol_djimissioncontroltimelineeventblock"><div class="api-col left">On Event</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissioncontrol_djimissioncontroltimelineeventblock_inline">onEvent</a></div></div><div class="inline-doc" id="djimissioncontrol_djimissioncontroltimelineeventblock_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onEvent</h6></div>

~~~java
        void onEvent(@Nullable TimelineElement element, TimelineEvent event, @Nullable DJIError error)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission</td></tr></table></html>



##### Description:



<font color="#666">Listener used to process Timeline events.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Missions/DJIMissionControlTimelineElement.html#djimissioncontroltimelineelement">TimelineElement</a> <font color="#000">element</td><td><font color="#666"><i>The Timeline element associated with the event, or <code>null</code> if the  event is global to the whole Timeline (e.g. start, finish the  Timeline).</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIMissionControl.html#djimissioncontrol_djimissioncontroltimelineevent">TimelineEvent</a> <font color="#000">event</td><td><font color="#666"><i>Event.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a> <font color="#000">error</td><td><font color="#666"><i>The optional error if the event was error-related.</i></td></tr></table></html></div>


