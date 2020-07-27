<div class="article"><h1 ><font color="#AAA">class </font>MasterSearchingCallback</h1></div>

~~~java
 interface MasterSearchingCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Receives the information of available master remote controllers.  <code><a href="/Components/RemoteController/DJIRemoteController_MasterSearchingCallbackInterface.html#djiremotecontroller_mastersearchingcallback_onmasterlistupdate">onMasterListUpdate</a></code>  will be called repeated with 1 second interval once master searching  is started successfully. It will stop when the searching is stopped  either by the remote controller itself or by calling <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_stopmasterrcsearch">stopMasterSearching</a></code>.



##### Class Members:



#### Callback Method

<div class="api-row" id="djiremotecontroller_mastersearchingcallback_onresult"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_mastersearchingcallback_onresult_inline">onResult</a></div></div><div class="inline-doc" id="djiremotecontroller_mastersearchingcallback_onresult_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onResult</h6></div>

~~~java
        void onResult(@Nullable DJIError error)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Execution result of <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_startmasterrcsearch">startMasterSearching</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/SDKError/DJIError.html#djierror">DJIError</a> <font color="#000">error</td><td><font color="#666"><i>Error retrieving the value.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_mastersearchingcallback_onmasterlistupdate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_mastersearchingcallback_onmasterlistupdate_inline">onMasterListUpdate</a></div></div><div class="inline-doc" id="djiremotecontroller_mastersearchingcallback_onmasterlistupdate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onMasterListUpdate</h6></div>

~~~java
        void onMasterListUpdate(@NonNull Information[] informationList)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Called every 1 seconds to get available master remote controllers' information.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/RemoteController/DJIRemoteController_DJIRCInfo.html#djiremotecontroller_djircinfo">Information</a>[] <font color="#000">informationList</td><td><font color="#666"><i>Information list array.</i></td></tr></table></html></div>


