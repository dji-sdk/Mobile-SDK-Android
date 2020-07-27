<div class="article"><h1 ><font color="#AAA">class </font>RTKNetworkServiceProvider</h1></div>

~~~java
 class RTKNetworkServiceProvider implements RTKNetworkService 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.network</td></tr></table></html>



##### Description:



<font color="#666">This class is used to control the RTK network service. The DJIRTKNetworkServiceProvider can  initiate the communication to a third-party RTK network server. The information from the server can  be streamed to the RTK airsystem. SDK will not cache the settings to the disk. The provider should be  configured in each life cycle of SDK. The life cycle of the network service provider is independent  from the aircraft. Therefore, it can be configured before connecting to DJI aircrafts. It is only supported  by Phantom 4 RTK and Matrice 210 RTK V2.



##### Class Members:

<div class="api-row" id="djirtknetworkserviceprovider_getinstance"><div class="api-col left">Get Instance</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtknetworkserviceprovider_getinstance_inline">getInstance</a></div></div><div class="inline-doc" id="djirtknetworkserviceprovider_getinstance_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getInstance</h6></div>

~~~java
 synchronized static RTKNetworkServiceProvider getInstance() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.network</td></tr></table></html>



##### Description:



<font color="#666">Accessor for <code><a href="/Components/RTK/DJIRTKNetworkServiceProvider.html#djirtknetworkserviceprovider">RTKNetworkServiceProvider</a></code> object.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">synchronized static <a href="/Components/RTK/DJIRTKNetworkServiceProvider.html#djirtknetworkserviceprovider">RTKNetworkServiceProvider</a></td><td><font color="#666"><i>An instance of the <code><a href="/Components/RTK/DJIRTKNetworkServiceProvider.html#djirtknetworkserviceprovider">RTKNetworkServiceProvider</a></code> object.</i></td></tr></table></html></div>

<div class="api-row" id="djirtknetworkserviceprovider_setnetworkservicesettings"><div class="api-col left">Set Network Service Settings</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtknetworkserviceprovider_setnetworkservicesettings_inline">setCustomNetworkSettings</a></div></div><div class="inline-doc" id="djirtknetworkserviceprovider_setnetworkservicesettings_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCustomNetworkSettings</h6></div>

~~~java
 void setCustomNetworkSettings(@NonNull final NetworkServiceSettings settings) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.network</td></tr></table></html>



##### Description:



<font color="#666">Sets the configuration for the network service that provides network reference stations.  The network service should use NTRIP (Networked Transport of RTCM via Internet Protocol).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Components/RTK/DJIRTKNetworkServiceProvider_DJIRTKNetworkServiceSettings.html#djirtknetworkserviceprovider_djirtknetworkservicesettings">NetworkServiceSettings</a> <font color="#000">settings</td><td><font color="#666"><i>The configuration to set.</i></td></tr></table></html></div>

<div class="api-row" id="djirtknetworkserviceprovider_networkservicesettings"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtknetworkserviceprovider_networkservicesettings_inline">getCustomNetworkSettings</a></div></div><div class="inline-doc" id="djirtknetworkserviceprovider_networkservicesettings_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCustomNetworkSettings</h6></div>

~~~java
 NetworkServiceSettings getCustomNetworkSettings() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.network</td></tr></table></html>



##### Description:



<font color="#666">Gets the configuration for the network service that provides network reference stations.  The network service should use NTRIP(Networked Transport of RTCM via Internet Protocol).



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RTK/DJIRTKNetworkServiceProvider_DJIRTKNetworkServiceSettings.html#djirtknetworkserviceprovider_djirtknetworkservicesettings">NetworkServiceSettings</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RTK/DJIRTKNetworkServiceProvider_DJIRTKNetworkServiceSettings.html#djirtknetworkserviceprovider_djirtknetworkservicesettings">NetworkServiceSettings</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djirtknetworkserviceprovider_startnetworkservice"><div class="api-col left">Start Network Service</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtknetworkserviceprovider_startnetworkservice_inline">startNetworkService</a></div></div><div class="inline-doc" id="djirtknetworkserviceprovider_startnetworkservice_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startNetworkService</h6></div>

~~~java
 void startNetworkService(@Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.network</td></tr></table></html>



##### Description:



<font color="#666">Starts the network service as the reference station. This should be called after setting the  network service (<code><a href="/Components/RTK/DJIRTKNetworkServiceProvider.html#djirtknetworkserviceprovider_setnetworkservicesettings">setCustomNetworkSettings</a></code>).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The completion block that receives the result.</i></td></tr></table></html></div>

<div class="api-row" id="djirtknetworkserviceprovider_stopnetworkservice"><div class="api-col left">Stop Network Service</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtknetworkserviceprovider_stopnetworkservice_inline">stopNetworkService</a></div></div><div class="inline-doc" id="djirtknetworkserviceprovider_stopnetworkservice_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopNetworkService</h6></div>

~~~java
 void stopNetworkService(@NonNull final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.network</td></tr></table></html>



##### Description:



<font color="#666">Stops the network service.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The completion block that receives the result.</i></td></tr></table></html></div>

<div class="api-row" id="djirtknetworkserviceprovider_addnetworkservicestatelistener"><div class="api-col left">Add Network Service State Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtknetworkserviceprovider_addnetworkservicestatelistener_inline">addNetworkServiceStateCallback</a></div></div><div class="inline-doc" id="djirtknetworkserviceprovider_addnetworkservicestatelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addNetworkServiceStateCallback</h6></div>

~~~java
 void addNetworkServiceStateCallback(@NonNull final NetworkServiceState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.network</td></tr></table></html>



##### Description:



<font color="#666">Adds a listener to receive the latest network service state.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Components/RTK/DJIRTKNetworkServiceProvider_DJIRTKNetworkServiceState.html#djirtknetworkserviceprovider_djirtknetworkservicestate">NetworkServiceState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>The completion block that receives the result.</i></td></tr></table></html></div>

<div class="api-row" id="djirtknetworkserviceprovider_removenetworkservicestatelistener"><div class="api-col left">Remove Network Service State Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtknetworkserviceprovider_removenetworkservicestatelistener_inline">removeNetworkServiceStateCallback</a></div></div><div class="inline-doc" id="djirtknetworkserviceprovider_removenetworkservicestatelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeNetworkServiceStateCallback</h6></div>

~~~java
 void removeNetworkServiceStateCallback(@NonNull final NetworkServiceState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.network</td></tr></table></html>



##### Description:



<font color="#666">Removes a listener that is added by passing to <code><a href="/Components/RTK/DJIRTKNetworkServiceProvider.html#djirtknetworkserviceprovider_addnetworkservicestatelistener">addNetworkServiceStateCallback</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Components/RTK/DJIRTKNetworkServiceProvider_DJIRTKNetworkServiceState.html#djirtknetworkserviceprovider_djirtknetworkservicestate">NetworkServiceState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>The completion block that receives the result.</i></td></tr></table></html></div>

<div class="api-row" id="djirtknetworkserviceprovider_setcoordinatesystem"><div class="api-col left">Set Coordinate System</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtknetworkserviceprovider_setcoordinatesystem_inline">setNetworkServiceCoordinateSystem</a></div></div><div class="inline-doc" id="djirtknetworkserviceprovider_setcoordinatesystem_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setNetworkServiceCoordinateSystem</h6></div>

~~~java
 void setNetworkServiceCoordinateSystem(CoordinateSystem coordinateSystem, @NonNull final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.network</td></tr></table></html>



##### Description:



<font color="#666">Sets coordinate system for rtk network service. Only can be used when  current <code><a href="/Components/RTK/DJIRTK.html#djirtk_djirtkreferencestationsource">ReferenceStationSource</a></code> is <code><a href="/Components/RTK/DJIRTK.html#djirtk_djirtkreferencestationsource_networkrtk">NETWORK_RTK</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RTK/DJIRTK.html#djirtk_djirtknetworkservicecoordinatesystem">CoordinateSystem</a> <font color="#000">coordinateSystem</td><td><font color="#666"><i>The <code>DJIRTK_DJIRTKNetworkServiceCoordinateSystem</code> to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The completion block that receives the result.</i></td></tr></table></html></div>

<div class="api-row" id="djirtknetworkserviceprovider_getcoordinatesystem"><div class="api-col left">Get Coordinate System</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtknetworkserviceprovider_getcoordinatesystem_inline">getNetworkServiceCoordinateSystem</a></div></div><div class="inline-doc" id="djirtknetworkserviceprovider_getcoordinatesystem_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getNetworkServiceCoordinateSystem</h6></div>

~~~java
 void getNetworkServiceCoordinateSystem(@NonNull final CommonCallbacks.CompletionCallbackWith<CoordinateSystem> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.network</td></tr></table></html>



##### Description:



<font color="#666">Gets current network RTK coordinate system. Only can be used when  current <code><a href="/Components/RTK/DJIRTK.html#djirtk_djirtkreferencestationsource">ReferenceStationSource</a></code> is <code><a href="/Components/RTK/DJIRTK.html#djirtk_djirtkreferencestationsource_networkrtk">NETWORK_RTK</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;<a href="/Components/RTK/DJIRTK.html#djirtk_djirtknetworkservicecoordinatesystem">CoordinateSystem</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djirtknetworkserviceprovider_activatenetworkservice"><div class="api-col left">Activate Network Service</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtknetworkserviceprovider_activatenetworkservice_inline">activateNetworkService</a></div></div><div class="inline-doc" id="djirtknetworkserviceprovider_activatenetworkservice_inline"

><div class="article"><h6 ><font color="#AAA">method </font>activateNetworkService</h6></div>

~~~java
@Override
 void activateNetworkService(NetworkServicePlanType planType, @NonNull final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.network</td></tr></table></html>



##### Description:



<font color="#666">Activates network RTK <code><a href="/Components/RTK/DJIRTKNetworkServiceProvider.html#djirtknetworkserviceprovider_activatenetworkservice">activateNetworkService</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RTK/DJIRTK.html#djirtk_djirtknetworkserviceplantype">NetworkServicePlanType</a> <font color="#000">planType</td><td><font color="#666"><i>Plan type to activate.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The completion block that receives the result.</i></td></tr></table></html></div>

<div class="api-row" id="djirtknetworkserviceprovider_getnetworkserviceorderplans"><div class="api-col left">Order Plans</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtknetworkserviceprovider_getnetworkserviceorderplans_inline">getNetworkServiceOrderPlans</a></div></div><div class="inline-doc" id="djirtknetworkserviceprovider_getnetworkserviceorderplans_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getNetworkServiceOrderPlans</h6></div>

~~~java
@Override
 void getNetworkServiceOrderPlans(@NonNull final CommonCallbacks.CompletionCallbackWith<NetworkServicePlansState> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.network</td></tr></table></html>



##### Description:



<font color="#666">Gets network service plans.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;<a href="/Components/RTK/DJIRTKNetworkServiceProvider_DJIRTKNetworkServicePlansState.html#djirtknetworkserviceprovider_djirtknetworkserviceplansstate">NetworkServicePlansState</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The completion block that receives the result.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djirtknetworkserviceprovider_djirtknetworkservicechannelstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djirtknetworkserviceprovider_djirtknetworkservicechannelstate_inline">NetworkServiceChannelState</a></div></div><div class="inline-doc" id="djirtknetworkserviceprovider_djirtknetworkservicechannelstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>NetworkServiceChannelState</h6></div>

~~~java
 enum NetworkServiceChannelState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.rtk</td></tr></table></html>



##### Description:



<font color="#666">All the possible state of <code><a href="/Components/RTK/DJIRTKNetworkServiceProvider.html#djirtknetworkserviceprovider_djirtknetworkservicechannelstate">NetworkServiceChannelState</a></code>.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djirtknetworkserviceprovider_djirtknetworkservicechannelstate_disabled_inline"></a>DISABLED</td><td><font color="#666">The network service is not started.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtknetworkserviceprovider_djirtknetworkservicechannelstate_expired_inline"></a>ACCOUNT_EXPIRED</td><td><font color="#666">User account has expired.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtknetworkserviceprovider_djirtknetworkservicechannelstate_networknotreachable_inline"></a>NETWORK_NOT_REACHABLE</td><td><font color="#666">The network is not reachable from the mobile device.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtknetworkserviceprovider_djirtknetworkservicechannelstate_aircraftdisconnected_inline"></a>AIRCRAFT_DISCONNECTED</td><td><font color="#666">The aircraft is not connected.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtknetworkserviceprovider_djirtknetworkservicechannelstate_loginfailure_inline"></a>LOGIN_FAILURE</td><td><font color="#666">SDK cannot login with the provided username and password.  Check <code><a href="/Components/RTK/DJIRTKNetworkServiceProvider_DJIRTKNetworkServiceState.html#djirtknetworkserviceprovider_djirtknetworkservicestate_error">getError</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtknetworkserviceprovider_djirtknetworkservicechannelstate_transmitting_inline"></a>TRANSMITTING</td><td><font color="#666">Data is transmitting through the channel.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtknetworkserviceprovider_djirtknetworkservicechannelstate_disconnected_inline"></a>DISCONNECTED</td><td><font color="#666">The channel is disconnected and the server is not reachable now. Check <code><a href="/Components/RTK/DJIRTKNetworkServiceProvider_DJIRTKNetworkServiceState.html#djirtknetworkserviceprovider_djirtknetworkservicestate_error">getError</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtknetworkserviceprovider_djirtknetworkservicechannelstate_accounterror_inline"></a>ACCOUNT_ERROR</td><td><font color="#666">User account error. Check <code><a href="/Components/RTK/DJIRTKNetworkServiceProvider_DJIRTKNetworkServiceState.html#djirtknetworkserviceprovider_djirtknetworkservicestate_error">getError</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtknetworkserviceprovider_djirtknetworkservicechannelstate_servernotreachable_inline"></a>SERVER_NOT_REACHABLE</td><td><font color="#666">Unable to connect to server.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtknetworkserviceprovider_djirtknetworkservicechannelstate_connecting_inline"></a>CONNECTING</td><td><font color="#666">Connecting to server.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtknetworkserviceprovider_djirtknetworkservicechannelstate_servicesuspension_inline"></a>SERVICE_SUSPENSION</td><td><font color="#666">The account for network RTK plan A has been expired, please activate plan B.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtknetworkserviceprovider_djirtknetworkservicechannelstate_invalidrequest_inline"></a>INVALID_REQUEST</td><td><font color="#666">The invalid request is rejected by the server.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtknetworkserviceprovider_djirtknetworkservicechannelstate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djirtknetworkserviceprovider_djirtknetworkservicestate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RTK/DJIRTKNetworkServiceProvider_DJIRTKNetworkServiceState.html">NetworkServiceState</a></div></div><div class="api-row" id="djirtknetworkserviceprovider_djirtknetworkserviceplan"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RTK/DJIRTKNetworkServiceProvider_DJIRTKNetworkServicePlan.html">NetworkServicePlan</a></div></div><div class="api-row" id="djirtknetworkserviceprovider_djirtknetworkserviceplansstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RTK/DJIRTKNetworkServiceProvider_DJIRTKNetworkServicePlansState.html">NetworkServicePlansState</a></div></div><div class="api-row" id="djirtknetworkserviceprovider_djirtknetworkservicesettings"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RTK/DJIRTKNetworkServiceProvider_DJIRTKNetworkServiceSettings.html">NetworkServiceSettings</a></div></div>
