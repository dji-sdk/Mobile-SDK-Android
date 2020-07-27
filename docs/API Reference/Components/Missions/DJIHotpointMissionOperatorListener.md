<div class="article"><h1 ><font color="#AAA">class </font>HotpointMissionOperatorListener</h1></div>

~~~java
 interface HotpointMissionOperatorListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Listener interface for listening to Hotpoint mission events.



##### Class Members:



#### Callback Method

<div class="api-row" id="djihotpointmissionoperatorlistener_onexecutionupdate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionoperatorlistener_onexecutionupdate_inline">onExecutionUpdate</a></div></div><div class="inline-doc" id="djihotpointmissionoperatorlistener_onexecutionupdate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onExecutionUpdate</h6></div>

~~~java
    void onExecutionUpdate(@NonNull HotpointMissionEvent event)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Called when a new Hotpoint mission event occurs.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIHotpointMissionEvent.html#djihotpointmissionevent">HotpointMissionEvent</a> <font color="#000">event</td><td><font color="#666"><i>Updated event.</i></td></tr></table></html></div>

<div class="api-row" id="djihotpointmissionoperatorlistener_onexecutionstart"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionoperatorlistener_onexecutionstart_inline">onExecutionStart</a></div></div><div class="inline-doc" id="djihotpointmissionoperatorlistener_onexecutionstart_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onExecutionStart</h6></div>

~~~java
    void onExecutionStart()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Called when the Hotpoint mission starts.

</div>

<div class="api-row" id="djihotpointmissionoperatorlistener_onexecutionfinish"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihotpointmissionoperatorlistener_onexecutionfinish_inline">onExecutionFinish</a></div></div><div class="inline-doc" id="djihotpointmissionoperatorlistener_onexecutionfinish_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onExecutionFinish</h6></div>

~~~java
    void onExecutionFinish(@Nullable DJIError error)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.hotpoint</td></tr></table></html>



##### Description:



<font color="#666">Called when the Hotpoint mission ends.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a> <font color="#000">error</td><td><font color="#666"><i>Used when mission is finishes in an unexpected way.</i></td></tr></table></html></div>


