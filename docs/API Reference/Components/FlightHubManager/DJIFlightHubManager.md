<div class="article"><h1 ><font color="#AAA">class </font>FlightHubManager</h1></div>

~~~java
 class FlightHubManager implements DJIParamAccessListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub</td></tr></table></html>



##### Description:



<font color="#666">The FlightHubManager class provides methods to interact with DJI FlightHub (https://www.dji.com/flighthub). SDK provides interfaces to upload the states of the connected aircraft to the FlightHub server and download the flight data from the server. To access DJI FlightHub features through SDK, the logged-in user should be already activated with a valid FlightHub license. Use <code><a href="/Components/FlightHubManager/DJIFlightHubManager.html#djiflighthubmanager_isuseractivated">isUserActivated</a></code> to check if the user is activated. Note: Invoke <code><a href="/Components/FlightHubManager/DJIFlightHubManager.html#djiflighthubmanager_updateactivationstate">updateActivationState</a></code> before using any other method to verify your accessibility.



##### Class Members:

<div class="api-row" id="djiflighthubmanager_uploadtimeinterval"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_uploadtimeinterval_inline">getFlightDataUploadInterval</a></div></div><div class="inline-doc" id="djiflighthubmanager_uploadtimeinterval_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlightDataUploadInterval</h6></div>

~~~java
 int getFlightDataUploadInterval() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub</td></tr></table></html>



##### Description:



<font color="#666">Current interval for uploading real-time flight data.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the interval.</i></td></tr></table></html></div>

<div class="api-row" id="djiflighthubmanager_uploadstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_uploadstate_inline">getUploadState</a></div></div><div class="inline-doc" id="djiflighthubmanager_uploadstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getUploadState</h6></div>

~~~java
 UploadState getUploadState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub</td></tr></table></html>



##### Description:



<font color="#666">Gets current upload state.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightHubManager/DJIFlightHubManager.html#djiflighthubmanager_djiflighthubuploadstate">UploadState</a></td><td><font color="#666"><i>Upload state.</i></td></tr></table></html></div>

<div class="api-row" id="djiflighthubmanager_isuseractivated"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_isuseractivated_inline">isUserActivated</a></div></div><div class="inline-doc" id="djiflighthubmanager_isuseractivated_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isUserActivated</h6></div>

~~~java
 boolean isUserActivated() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub</td></tr></table></html>



##### Description:



<font color="#666">Determines if the user has been activated. It is a cached data and it will be refreshed  when <code><a href="/Components/FlightHubManager/DJIFlightHubManager.html#djiflighthubmanager_updateactivationstate">updateActivationState</a></code> is called.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if <code><a href="/Components/FlightHubManager/DJIFlightHubManager.html#djiflighthubmanager_updateactivationstate">updateActivationState</a></code> is invoked at least once. <code>false</code> if <code><a href="/Components/FlightHubManager/DJIFlightHubManager.html#djiflighthubmanager_updateactivationstate">updateActivationState</a></code> is never invoked.</i></td></tr></table></html></div>

<div class="api-row" id="djiflighthubmanager_setflightdatauploadinterval"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_setflightdatauploadinterval_inline">setFlightDataUploadInterval</a></div></div><div class="inline-doc" id="djiflighthubmanager_setflightdatauploadinterval_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFlightDataUploadInterval</h6></div>

~~~java
 DJIFlightHubError setFlightDataUploadInterval(@IntRange(from = 1, to = 10) int interval) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub</td></tr></table></html>



##### Description:



<font color="#666">Sets the interval for uploading real-time flight data. By default, the interval is 5 seconds.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 1, to = 10) int <font color="#000">interval</td><td><font color="#666"><i>Interval in seconds. The value should be in the range [1, 10].</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError_DJISDKFlightHubError.html#djierror_djisdkflighthuberror">DJIFlightHubError</a></td><td><font color="#666"><i>Error if the input is invalid.</i></td></tr></table></html></div>

<div class="api-row" id="djiflighthubmanager_setuploadflightdataenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_setuploadflightdataenabled_inline">setUploadFlightDataEnabled</a></div></div><div class="inline-doc" id="djiflighthubmanager_setuploadflightdataenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setUploadFlightDataEnabled</h6></div>

~~~java
 void setUploadFlightDataEnabled(boolean enabled) throws Exception 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub</td></tr></table></html>



##### Description:



<font color="#666">Set <code>true</code> to enable SDK to upload real-time flight data of the connected aircraft to DJI  FlightHub server. When it is enabled, SDK will start uploading flight data automatically when  the aircraft is flying. FlightHub user can access the uploaded flight data on the FlightHub  online system. Stop uploading data by setting <code>false</code> as parameter. Use <code><a href="/Components/FlightHubManager/DJIFlightHubManager.html#djiflighthubmanager_uploadstate">getUploadState</a></code>  to check current uploading state.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i>Interval in seconds. The value should be in the range [1, 10].</i></td></tr></table></html></div>

<div class="api-row" id="djiflighthubmanager_updateactivationstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_updateactivationstate_inline">updateActivationState</a></div></div><div class="inline-doc" id="djiflighthubmanager_updateactivationstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>updateActivationState</h6></div>

~~~java
 void updateActivationState(CompletionCallback callback) throws Exception 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub</td></tr></table></html>



##### Description:



<font color="#666">Updates the logged-in user's activation state for DJI FlightHub. This method is only valid when the user  is logged in. When the state is updated, the state will be cached to <code><a href="/Components/FlightHubManager/DJIFlightHubManager.html#djiflighthubmanager_isuseractivated">isUserActivated</a></code>. Please invoke the <code><a href="/Components/DataProtectionManager/DJIDataProtectionManager.html#djidataprotectionmanager_authorizeaccesstodjidevicehardwareinfo">authorizeAccessToDJIDeviceHardwareInfo</a></code> to authorize DJI server to access DJI device's hardware information.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflighthubmanager_getteamsinformation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_getteamsinformation_inline">getTeamsInformation</a></div></div><div class="inline-doc" id="djiflighthubmanager_getteamsinformation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTeamsInformation</h6></div>

~~~java
 void getTeamsInformation(final CommonCallbacks.CompletionCallbackWith<List<Team>> callback) throws Exception 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub</td></tr></table></html>



##### Description:



<font color="#666">Gets the teams' information that is visible for the user.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;List&lt;<a href="/Components/FlightHubManager/DJIFlightHubManager_DJIFlightHubTeam.html#djiflighthubmanager_djiflighthubteam">Team</a>&gt;&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned a list of Team objects.</i></td></tr></table></html></div>

<div class="api-row" id="djiflighthubmanager_gethistoricalflightpath"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_gethistoricalflightpath_inline">getHistoricalFlightPath</a></div></div><div class="inline-doc" id="djiflighthubmanager_gethistoricalflightpath_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHistoricalFlightPath</h6></div>

~~~java
 void getHistoricalFlightPath(String orderId, final CommonCallbacks.CompletionCallbackWith<List<FlightPathNode>> callback) throws Exception 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub</td></tr></table></html>



##### Description:



<font color="#666">Gets the flight path nodes of a historical flight path with the specific path ID. This information is  only visible for the administrator of the group and the captain of the team.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String <font color="#000">orderId</td><td><font color="#666"><i>Corresponding order id that the user wants to check with the flight path.</i></td></tr><tr valign="top"><td><font color="#70BF41">final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;List&lt;<a href="/Components/FlightHubManager/DJIFlightHubManager_DJIFlightHubFlightPathNode.html#djiflighthubmanager_djiflighthubflightpathnode">FlightPathNode</a>&gt;&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned a list of FlightPathNode objects.</i></td></tr></table></html></div>

<div class="api-row" id="djiflighthubmanager_getflightstatistics"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_getflightstatistics_inline">getFlightStatistics</a></div></div><div class="inline-doc" id="djiflighthubmanager_getflightstatistics_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlightStatistics</h6></div>

~~~java
 void getFlightStatistics(long startTime, long endTime, @Nullable String account, String teamId, final
                                  CommonCallbacks.CompletionCallbackWith<HistoricalFlight> callback) throws Exception 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub</td></tr></table></html>



##### Description:



<font color="#666">Gets flight statistics over a period of time. Specify the account to get the statistics related to one  user. Otherwise, statistics for the whole team will be fetched. Only <code><a href="/Components/FlightHubManager/DJIFlightHubManager.html#djiflighthubmanager_djiflighthubrole_administrator">ADMINISTRATOR</a></code>  and <code><a href="/Components/FlightHubManager/DJIFlightHubManager.html#djiflighthubmanager_djiflighthubrole_captain">CAPTAIN</a></code> can access the flight statistics.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">long <font color="#000">startTime</td><td><font color="#666"><i>Chosen start time of milliseconds.</i></td></tr><tr valign="top"><td><font color="#70BF41">long <font color="#000">endTime</td><td><font color="#666"><i>Chosen end time of milliseconds.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable String <font color="#000">account</td><td><font color="#666"><i>The account that the user wants to check. Set to be null if whole team flight statistics is expected.</i></td></tr><tr valign="top"><td><font color="#70BF41">String <font color="#000">teamId</td><td><font color="#666"><i>Team id that the user wants to check.</i></td></tr><tr valign="top"><td><font color="#70BF41">final                                   <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;<a href="/Components/FlightHubManager/DJIFlightHubManager_DJIFlightHubHistoricalFlight.html#djiflighthubmanager_djiflighthubhistoricalflight">HistoricalFlight</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned HistoricalFlight objects.</i></td></tr></table></html></div>

<div class="api-row" id="djiflighthubmanager_bindaircrafttoteam"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_bindaircrafttoteam_inline">bindAircraft</a></div></div><div class="inline-doc" id="djiflighthubmanager_bindaircrafttoteam_inline"

><div class="article"><h6 ><font color="#AAA">method </font>bindAircraft</h6></div>

~~~java
 void bindAircraft(String teamId, final CompletionCallback callback) throws Exception 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub</td></tr></table></html>



##### Description:



<font color="#666">Bind the connected aircraft to DJI FlightHub system. Specify the team ID that the aircraft will belongs to.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String <font color="#000">teamId</td><td><font color="#666"><i>Team ID that current aircraft is expected to bind to.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflighthubmanager_unbindaircraft"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_unbindaircraft_inline">unbindAircraft</a></div></div><div class="inline-doc" id="djiflighthubmanager_unbindaircraft_inline"

><div class="article"><h6 ><font color="#AAA">method </font>unbindAircraft</h6></div>

~~~java
 void unbindAircraft(final CompletionCallback callback) throws Exception 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub</td></tr></table></html>



##### Description:



<font color="#666">Unbinds current aircraft from the certain team. Only <code><a href="/Components/FlightHubManager/DJIFlightHubManager.html#djiflighthubmanager_djiflighthubrole_administrator">ADMINISTRATOR</a></code>  and <code><a href="/Components/FlightHubManager/DJIFlightHubManager.html#djiflighthubmanager_djiflighthubrole_captain">CAPTAIN</a></code> can do this operation.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflighthubmanager_getliveviewstreamsourcewithsn"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_getliveviewstreamsourcewithsn_inline">getLiveViewStreamSource</a></div></div><div class="inline-doc" id="djiflighthubmanager_getliveviewstreamsourcewithsn_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLiveViewStreamSource</h6></div>

~~~java
 void getLiveViewStreamSource(final String sn, final CommonCallbacks.CompletionCallbackWith<LiveStream> callback) throws Exception 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub</td></tr></table></html>



##### Description:



<font color="#666">Gets the live view stream sourcing by the other aircraft to DJI FlightHub. The stream is using RTMP  (Real-Time Messaging Protocol). External libraries are required to decode and render the live view.  Only <code><a href="/Components/FlightHubManager/DJIFlightHubManager.html#djiflighthubmanager_djiflighthubrole_administrator">ADMINISTRATOR</a></code> and <code><a href="/Components/FlightHubManager/DJIFlightHubManager.html#djiflighthubmanager_djiflighthubrole_captain">CAPTAIN</a></code> can do this operation.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final String <font color="#000">sn</td><td><font color="#666"><i>Serial number of the aircraft sourcing the live view stream.</i></td></tr><tr valign="top"><td><font color="#70BF41">final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;<a href="/Components/FlightHubManager/DJIFlightHubManager_DJIFlightHubLiveStream.html#djiflighthubmanager_djiflighthublivestream">LiveStream</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned LiveStream objects.</i></td></tr></table></html></div>

<div class="api-row" id="djiflighthubmanager_getliveviewstreamdestination"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_getliveviewstreamdestination_inline">getLiveViewStreamDestination</a></div></div><div class="inline-doc" id="djiflighthubmanager_getliveviewstreamdestination_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLiveViewStreamDestination</h6></div>

~~~java
 void getLiveViewStreamDestination(final CommonCallbacks.CompletionCallbackWith<UpStream> callback) throws Exception 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub</td></tr></table></html>



##### Description:



<font color="#666">Gets RTMP (Real-Time Messaging Protocol) url that the connected aircraft should stream to.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;<a href="/Components/FlightHubManager/DJIFlightHubManager_DJIFlightHubUpStream.html#djiflighthubmanager_djiflighthubupstream">UpStream</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned UpStream objects.</i></td></tr></table></html></div>

<div class="api-row" id="djiflighthubmanager_islivestreamstable"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_islivestreamstable_inline">isLiveStreamStable</a></div></div><div class="inline-doc" id="djiflighthubmanager_islivestreamstable_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isLiveStreamStable</h6></div>

~~~java
 void isLiveStreamStable(final CommonCallbacks.CompletionCallbackWith<Boolean> callback) throws Exception 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub</td></tr></table></html>



##### Description:



<font color="#666">Determines whether the live stream is stable from the server perspective.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned boolean result representing if the stream is healthy or not.</i></td></tr></table></html></div>

<div class="api-row" id="djiflighthubmanager_getstreamingdevices"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_getstreamingdevices_inline">getStreamingDevices</a></div></div><div class="inline-doc" id="djiflighthubmanager_getstreamingdevices_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getStreamingDevices</h6></div>

~~~java
 void getStreamingDevices(final CommonCallbacks.CompletionCallbackWith<List<OnlineDevice>> callback) throws Exception 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub</td></tr></table></html>



##### Description:



<font color="#666">Gets the list of devices streaming live video to DJI FlightHubManager.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;List&lt;<a href="/Components/FlightHubManager/DJIFlightHubManager_DJIFlightHubOnlineDevice.html#djiflighthubmanager_djiflighthubonlinedevice">OnlineDevice</a>&gt;&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned a list of OnlineDevice objects.</i></td></tr></table></html></div>

<div class="api-row" id="djiflighthubmanager_getonlinedevices"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_getonlinedevices_inline">getOnlineDevices</a></div></div><div class="inline-doc" id="djiflighthubmanager_getonlinedevices_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getOnlineDevices</h6></div>

~~~java
 void getOnlineDevices(final CommonCallbacks.CompletionCallbackWith<List<OnlineDevice>> callback) throws Exception 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub</td></tr></table></html>



##### Description:



<font color="#666">Gets the list of online devices visiable in DJI FlightHub.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;List&lt;<a href="/Components/FlightHubManager/DJIFlightHubManager_DJIFlightHubOnlineDevice.html#djiflighthubmanager_djiflighthubonlinedevice">OnlineDevice</a>&gt;&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned a list of OnlineDevice objects.</i></td></tr></table></html></div>

<div class="api-row" id="djiflighthubmanager_getrealtimedatawithsns"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_getrealtimedatawithsns_inline">getAircraftRealTimeFlightData</a></div></div><div class="inline-doc" id="djiflighthubmanager_getrealtimedatawithsns_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAircraftRealTimeFlightData</h6></div>

~~~java
 void getAircraftRealTimeFlightData(List<String> sns, final CommonCallbacks.CompletionCallbackWith<List<RealTimeFlightData>> callback) throws Exception 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub</td></tr></table></html>



##### Description:



<font color="#666">Gets real time flight data of the given aircraft(s).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;String&gt; <font color="#000">sns</td><td><font color="#666"><i>Serial numbers of aircraft expected.</i></td></tr><tr valign="top"><td><font color="#70BF41">final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;List&lt;<a href="/Components/FlightHubManager/DJIFlightHubManager_DJIFlightHubRealTimeFlightData.html#djiflighthubmanager_djiflighthubrealtimeflightdata">RealTimeFlightData</a>&gt;&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned a list of <code><a href="/Components/FlightHubManager/DJIFlightHubManager_DJIFlightHubRealTimeFlightData.html#djiflighthubmanager_djiflighthubrealtimeflightdata">RealTimeFlightData</a></code> objects.</i></td></tr></table></html></div>

<div class="api-row" id="djiflighthubmanager_addupdateduploadstatecallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_addupdateduploadstatecallback_inline">addUpdatedUploadStateCallback</a></div></div><div class="inline-doc" id="djiflighthubmanager_addupdateduploadstatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addUpdatedUploadStateCallback</h6></div>

~~~java
 void addUpdatedUploadStateCallback(UpdatedUploadStateCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub</td></tr></table></html>



##### Description:



<font color="#666">Add upload state callback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightHubManager/DJIFlightHubManager_UpdatedUploadStateCallbackInterface.html#djiflighthubmanager_updateduploadstatecallbackinterface">UpdatedUploadStateCallback</a> <font color="#000">callback</td><td><font color="#666"><i>The <code><a href="/Components/FlightHubManager/DJIFlightHubManager_UpdatedUploadStateCallbackInterface.html#djiflighthubmanager_updateduploadstatecallbackinterface">UpdatedUploadStateCallback</a></code> object to receive upload state.</i></td></tr></table></html></div>

<div class="api-row" id="djiflighthubmanager_removeupdateduploadstatecallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_removeupdateduploadstatecallback_inline">removeUpdatedUploadStateCallback</a></div></div><div class="inline-doc" id="djiflighthubmanager_removeupdateduploadstatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeUpdatedUploadStateCallback</h6></div>

~~~java
 void removeUpdatedUploadStateCallback(UpdatedUploadStateCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub</td></tr></table></html>



##### Description:



<font color="#666">Remove upload state callback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightHubManager/DJIFlightHubManager_UpdatedUploadStateCallbackInterface.html#djiflighthubmanager_updateduploadstatecallbackinterface">UpdatedUploadStateCallback</a> <font color="#000">callback</td><td><font color="#666"><i>The <code><a href="/Components/FlightHubManager/DJIFlightHubManager_UpdatedUploadStateCallbackInterface.html#djiflighthubmanager_updateduploadstatecallbackinterface">UpdatedUploadStateCallback</a></code> object to receive upload state.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiflighthubmanager_djiflighthubuploadstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_djiflighthubuploadstate_inline">UploadState</a></div></div><div class="inline-doc" id="djiflighthubmanager_djiflighthubuploadstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>UploadState</h6></div>

~~~java
 enum UploadState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub</td></tr></table></html>



##### Description:



<font color="#666">The uploading state of the flight data for DJI FlightHub system.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflighthubmanager_djiflighthubuploadstate_disabled_inline"></a>DISABLED</td><td><font color="#666">The uploading process is disabled.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflighthubmanager_djiflighthubuploadstate_networknotreachable_inline"></a>NETWORK_NOT_REACHABLE</td><td><font color="#666">The uploading process is enabled but it is not started because the network is not reachable.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflighthubmanager_djiflighthubuploadstate_notloggedin_inline"></a>NOT_LOGGED_IN</td><td><font color="#666">The uploading process is enabled but it is not started because no account is logged in.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflighthubmanager_djiflighthubuploadstate_aircraftdisconnected_inline"></a>AIRCRAFT_DISCONNECTED</td><td><font color="#666">The uploading process is enabled but it is not started because the aircraft is disconnected.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflighthubmanager_djiflighthubuploadstate_rejectedbyserver_inline"></a>REJECTED_BY_SERVER</td><td><font color="#666">The uploading process is enabled but the uploading request is rejected by the server.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflighthubmanager_djiflighthubuploadstate_readytoupload_inline"></a>READY_TO_UPLOAD</td><td><font color="#666">The uploading process is enabled and it will start when the aircraft takes off.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflighthubmanager_djiflighthubuploadstate_uploading_inline"></a>UPLOADING</td><td><font color="#666">SDK is uploading flight data to DJI FlightHub system.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflighthubmanager_djiflighthubuploadstate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiflighthubmanager_djiflighthubrole"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflighthubmanager_djiflighthubrole_inline">Role</a></div></div><div class="inline-doc" id="djiflighthubmanager_djiflighthubrole_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>Role</h6></div>

~~~java
 enum Role 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flighthub</td></tr></table></html>



##### Description:



<font color="#666">Different roles of members in a FlightHub group. Different roles will have different  permissions to access data in the sytem.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflighthubmanager_djiflighthubrole_administrator_inline"></a>ADMINISTRATOR</td><td><font color="#666">The administrator is the leader of a group (a group consists of several teams). This role  will appear in the member list of all the teams and this role can access all the data of the group.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflighthubmanager_djiflighthubrole_captain_inline"></a>CAPTAIN</td><td><font color="#666">A captain is the leader of a team. <code><a href="/Components/FlightHubManager/DJIFlightHubManager.html#djiflighthubmanager_djiflighthubrole_administrator">ADMINISTRATOR</a></code> can define a captain for a  team in the group but it is not compulsory for a team to have a captain. The captain can access the data of the team.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflighthubmanager_djiflighthubrole_pilot_inline"></a>PILOT</td><td><font color="#666">A pilot is a member in the team without special permissions.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflighthubmanager_djiflighthubrole_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiflighthubmanager_djiflighthubonlinedevice"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightHubManager/DJIFlightHubManager_DJIFlightHubOnlineDevice.html">OnlineDevice</a></div></div><div class="api-row" id="djiflighthubmanager_djiflighthubbounddevice"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightHubManager/DJIFlightHubManager_DJIFlightHubBoundDevice.html">BoundDevice</a></div></div><div class="api-row" id="djiflighthubmanager_djiflighthubuser"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightHubManager/DJIFlightHubManager_DJIFlightHubUser.html">User</a></div></div><div class="api-row" id="djiflighthubmanager_djiflighthubteam"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightHubManager/DJIFlightHubManager_DJIFlightHubTeam.html">Team</a></div></div><div class="api-row" id="djiflighthubmanager_djiflighthubupstream"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightHubManager/DJIFlightHubManager_DJIFlightHubUpStream.html">UpStream</a></div></div><div class="api-row" id="djiflighthubmanager_djiflighthublivestream"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightHubManager/DJIFlightHubManager_DJIFlightHubLiveStream.html">LiveStream</a></div></div><div class="api-row" id="djiflighthubmanager_djiflighthubflightpathnode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightHubManager/DJIFlightHubManager_DJIFlightHubFlightPathNode.html">FlightPathNode</a></div></div><div class="api-row" id="djiflighthubmanager_djiflighthubflighthistoricaldetail"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightHubManager/DJIFlightHubManager_DJIFlightHubFlightHistoricalDetail.html">FlightHistoricalDetail</a></div></div><div class="api-row" id="djiflighthubmanager_djiflighthubstatistics"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightHubManager/DJIFlightHubManager_DJIFlightHubStatistics.html">Statistics</a></div></div><div class="api-row" id="djiflighthubmanager_djiflighthubhistoricalflight"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightHubManager/DJIFlightHubManager_DJIFlightHubHistoricalFlight.html">HistoricalFlight</a></div></div><div class="api-row" id="djiflighthubmanager_djiflighthubrealtimeflightdata"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightHubManager/DJIFlightHubManager_DJIFlightHubRealTimeFlightData.html">RealTimeFlightData</a></div></div><div class="api-row" id="djiflighthubmanager_updateduploadstatecallbackinterface"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightHubManager/DJIFlightHubManager_UpdatedUploadStateCallbackInterface.html">UpdatedUploadStateCallback</a></div></div><div class="api-row" id="djiflightcontroller_djigravitycenterstateinterfacecallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightHubManager/DJIFlightController_DJIGravityCenterStateInterfaceCallback.html">Callback</a></div></div>
