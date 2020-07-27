<div class="article"><h1 ><font color="#AAA">class </font>NetworkServiceState</h1></div>

~~~java
 class NetworkServiceState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.rtk</td></tr></table></html>



##### Description:



<font color="#666">The state of network service that provides reference station information.



##### Class Members:

<div class="api-row" id="djirtknetworkserviceprovider_djirtknetworkservicestate_channelstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtknetworkserviceprovider_djirtknetworkservicestate_channelstate_inline">getChannelState</a></div></div><div class="inline-doc" id="djirtknetworkserviceprovider_djirtknetworkservicestate_channelstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getChannelState</h6></div>

~~~java
 NetworkServiceChannelState getChannelState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.rtk</td></tr></table></html>



##### Description:



<font color="#666">The state of the channel from the aircraft to the server that provides RTK network service.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RTK/DJIRTKNetworkServiceProvider.html#djirtknetworkserviceprovider_djirtknetworkservicechannelstate">NetworkServiceChannelState</a></td><td><font color="#666"><i>The enum value of <code><a href="/Components/RTK/DJIRTKNetworkServiceProvider.html#djirtknetworkserviceprovider_djirtknetworkservicechannelstate">NetworkServiceChannelState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djirtknetworkserviceprovider_djirtknetworkservicestate_error"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtknetworkserviceprovider_djirtknetworkservicestate_error_inline">getError</a></div></div><div class="inline-doc" id="djirtknetworkserviceprovider_djirtknetworkservicestate_error_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getError</h6></div>

~~~java
 DJIRTKNetworkServiceError getError() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.rtk</td></tr></table></html>



##### Description:



<font color="#666">The encountered error if any when building up the channel from the aircraft to the server  that provides RTK network service.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError_DJIRTKNetworkServiceError.html#djierror_djirtknetworkserviceerror">DJIRTKNetworkServiceError</a></td><td><font color="#666"><i>The object of <code><a href="/Components/SDKError/DJIError_DJIRTKNetworkServiceError.html#djierror_djirtknetworkserviceerror">DJIRTKNetworkServiceError</a></code>.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djirtknetworkserviceprovider_djirtknetworkservicestate_callback"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RTK/DJIRTKNetworkServiceProvider_DJIRTKNetworkServiceState_callback.html">Callback</a></div></div>
