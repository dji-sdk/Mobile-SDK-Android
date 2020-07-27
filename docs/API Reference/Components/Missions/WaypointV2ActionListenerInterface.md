<div class="article"><h1 ><font color="#AAA">class </font>WaypointV2ActionListener</h1></div>

~~~java
 interface WaypointV2ActionListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Listener that is interested on action event.



##### Class Members:

<div class="api-row" id="waypointv2actionlistenerinterface_ondownloadupdate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#waypointv2actionlistenerinterface_ondownloadupdate_inline">onDownloadUpdate</a></div></div><div class="inline-doc" id="waypointv2actionlistenerinterface_ondownloadupdate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onDownloadUpdate</h6></div>

~~~java
    void onDownloadUpdate(@NonNull ActionDownloadEvent downloadEvent)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Called when a download event happens.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIWaypointV2ActionDownloadEventInterface.html#djiwaypointv2actiondownloadeventinterface">ActionDownloadEvent</a> <font color="#000">downloadEvent</td><td><font color="#666"><i>The callback interface of <code><a href="/Components/Missions/DJIWaypointV2ActionDownloadEventInterface.html#djiwaypointv2actiondownloadeventinterface">ActionDownloadEvent</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="waypointv2actionlistenerinterface_onuploadupdate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#waypointv2actionlistenerinterface_onuploadupdate_inline">onUploadUpdate</a></div></div><div class="inline-doc" id="waypointv2actionlistenerinterface_onuploadupdate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUploadUpdate</h6></div>

~~~java
    void onUploadUpdate(@NonNull ActionUploadEvent uploadEvent)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Called when an upload event happens.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIWaypointV2ActionUploadEventInterface.html#djiwaypointv2actionuploadeventinterface">ActionUploadEvent</a> <font color="#000">uploadEvent</td><td><font color="#666"><i>Upload event.</i></td></tr></table></html></div>

<div class="api-row" id="waypointv2actionlistenerinterface_onexecutionupdate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#waypointv2actionlistenerinterface_onexecutionupdate_inline">onExecutionUpdate</a></div></div><div class="inline-doc" id="waypointv2actionlistenerinterface_onexecutionupdate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onExecutionUpdate</h6></div>

~~~java
    void onExecutionUpdate(@NonNull ActionExecutionEvent executionEvent)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Called when an execution update event happens.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Missions/DJIWaypointV2ActionExecutionEvent.html#djiwaypointv2actionexecutionevent">ActionExecutionEvent</a> <font color="#000">executionEvent</td><td><font color="#666"><i>Execution event.</i></td></tr></table></html></div>

<div class="api-row" id="waypointv2actionlistenerinterface_onexecutionstart"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#waypointv2actionlistenerinterface_onexecutionstart_inline">onExecutionStart</a></div></div><div class="inline-doc" id="waypointv2actionlistenerinterface_onexecutionstart_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onExecutionStart</h6></div>

~~~java
    void onExecutionStart()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Called when an execution start event happens.

</div>

<div class="api-row" id="waypointv2actionlistenerinterface_onexecutionfinish"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#waypointv2actionlistenerinterface_onexecutionfinish_inline">onExecutionFinish</a></div></div><div class="inline-doc" id="waypointv2actionlistenerinterface_onexecutionfinish_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onExecutionFinish</h6></div>

~~~java
    void onExecutionFinish(@Nullable DJIWaypointV2Error error)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.waypoint</td></tr></table></html>



##### Description:



<font color="#666">Called when an execution finish event happens.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/SDKError/DJIError_DJIWaypointV2Error.html#djierror_djiwaypointv2error">DJIWaypointV2Error</a> <font color="#000">error</td><td><font color="#666"><i>An object of <code><a href="/Components/SDKError/DJIError_DJIWaypointV2Error.html#djierror_djiwaypointv2error">DJIWaypointV2Error</a></code>.</i></td></tr></table></html></div>


