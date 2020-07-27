<div class="article"><h1 ><font color="#AAA">class </font>IntelligentHotpointMissionOperatorListener</h1></div>

~~~java
 interface IntelligentHotpointMissionOperatorListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Listener interface for listening to intelligent hotpoint mission events.



##### Class Members:

<div class="api-row" id="djiintelligenthotpointmissionoperatorlistenerinterface_onexecutionupdate"><div class="api-col left">State Update</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperatorlistenerinterface_onexecutionupdate_inline">onExecutionUpdate</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperatorlistenerinterface_onexecutionupdate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onExecutionUpdate</h6></div>

~~~java
    void onExecutionUpdate(@NonNull IntelligentHotpointMissionEvent event)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Called when a new intelligent hotpoint mission event occurs.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionEvent.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent">IntelligentHotpointMissionEvent</a> <font color="#000">event</td><td><font color="#666"><i>Updated event.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperatorlistenerinterface_onexecutionstart"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperatorlistenerinterface_onexecutionstart_inline">onExecutionStart</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperatorlistenerinterface_onexecutionstart_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onExecutionStart</h6></div>

~~~java
    void onExecutionStart()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Called when the intelligent hotpoint mission starts.

</div>

<div class="api-row" id="djiintelligenthotpointmissionoperatorlistenerinterface_onexecutionfinish"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperatorlistenerinterface_onexecutionfinish_inline">onExecutionFinish</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperatorlistenerinterface_onexecutionfinish_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onExecutionFinish</h6></div>

~~~java
    void onExecutionFinish(@Nullable DJIError error)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Called when the intelligent hotpoint mission ends.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a> <font color="#000">error</td><td><font color="#666"><i>Used when mission is finishes in an unexpected way.</i></td></tr></table></html></div>


