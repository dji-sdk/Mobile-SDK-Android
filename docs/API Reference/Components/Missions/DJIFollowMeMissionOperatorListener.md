<div class="article"><h1 ><font color="#AAA">class </font>FollowMeMissionOperatorListener</h1></div>

~~~java
 interface FollowMeMissionOperatorListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">Listener interface for Follow Me mission.



##### Class Members:



#### Callback Method

<div class="api-row" id="djifollowmemissionoperatorlistener_onexecutionupdate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djifollowmemissionoperatorlistener_onexecutionupdate_inline">onExecutionUpdate</a></div></div><div class="inline-doc" id="djifollowmemissionoperatorlistener_onexecutionupdate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onExecutionUpdate</h6></div>

~~~java
    void onExecutionUpdate(@NonNull FollowMeMissionEvent event)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">All events during mission execution.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIFollowMeMissionEvent.html#djifollowmemissionevent">FollowMeMissionEvent</a> <font color="#000">event</td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIFollowMeMissionEvent.html#djifollowmemissionevent">FollowMeMissionEvent</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djifollowmemissionoperatorlistener_onexecutionstart"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djifollowmemissionoperatorlistener_onexecutionstart_inline">onExecutionStart</a></div></div><div class="inline-doc" id="djifollowmemissionoperatorlistener_onexecutionstart_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onExecutionStart</h6></div>

~~~java
    void onExecutionStart()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">Mission started.

</div>

<div class="api-row" id="djifollowmemissionoperatorlistener_onexecutionfinish"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djifollowmemissionoperatorlistener_onexecutionfinish_inline">onExecutionFinish</a></div></div><div class="inline-doc" id="djifollowmemissionoperatorlistener_onexecutionfinish_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onExecutionFinish</h6></div>

~~~java
    void onExecutionFinish(@Nullable DJIError error)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.followme</td></tr></table></html>



##### Description:



<font color="#666">Mission finished.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a> <font color="#000">error</td><td><font color="#666"><i>Error retrieving the value.</i></td></tr></table></html></div>


