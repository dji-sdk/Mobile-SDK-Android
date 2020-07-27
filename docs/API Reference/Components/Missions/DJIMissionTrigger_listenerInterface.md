<div class="article"><h1 ><font color="#AAA">class </font>Listener</h1></div>

~~~java
 interface Listener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.triggers</td></tr></table></html>



##### Description:



<font color="#666">Listener interface for Trigger events.



##### Class Members:



#### Callback Method

<div class="api-row" id="djimissiontrigger_oneventcallback"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimissiontrigger_oneventcallback_inline">onEvent</a></div></div><div class="inline-doc" id="djimissiontrigger_oneventcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onEvent</h6></div>

~~~java
        void onEvent(Trigger trigger, TriggerEvent event, @Nullable DJIError error)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.triggers</td></tr></table></html>



##### Description:



<font color="#666">Called when a trigger event occurs.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIMissionTrigger.html#djimissiontrigger">Trigger</a> <font color="#000">trigger</td><td><font color="#666"><i>The instance of the trigger.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIMissionTrigger.html#djimissiontrigger_djimissiontriggerevent">TriggerEvent</a> <font color="#000">event</td><td><font color="#666"><i>The event type which caused the call.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a> <font color="#000">error</td><td><font color="#666"><i>An optional error.</i></td></tr></table></html></div>


