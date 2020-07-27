<div class="article"><h1 ><font color="#AAA">class </font>Builder</h1></div>

~~~java
 static class Builder 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.rtk</td></tr></table></html>



##### Description:



<font color="#666">The class is used to build a <code><a href="/Components/RTK/DJIRTKNetworkServiceProvider_DJIRTKNetworkServicePlansState.html#djirtknetworkserviceprovider_djirtknetworkserviceplansstate">NetworkServicePlansState</a></code> instance.



##### Class Members:

<div class="api-row" id="djirtknetworkserviceprovider_djirtknetworkserviceplansstate_builder_state"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtknetworkserviceprovider_djirtknetworkserviceplansstate_builder_state_inline">state</a></div></div><div class="inline-doc" id="djirtknetworkserviceprovider_djirtknetworkserviceplansstate_builder_state_inline"

><div class="article"><h6 ><font color="#AAA">method </font>state</h6></div>

~~~java
 Builder state(NetworkServiceAccountState state) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.rtk</td></tr></table></html>



##### Description:



<font color="#666">Sets current account state.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RTK/DJIRTK.html#djirtk_djirtknetworkserviceaccountstate">NetworkServiceAccountState</a> <font color="#000">state</td><td><font color="#666"><i>An enum value of <code><a href="/Components/RTK/DJIRTK.html#djirtk_djirtknetworkserviceaccountstate">NetworkServiceAccountState</a></code>.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>A builder instance.</i></td></tr></table></html></div>

<div class="api-row" id="djirtknetworkserviceprovider_djirtknetworkserviceplansstate_builder_supportedrenewaltimes"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtknetworkserviceprovider_djirtknetworkserviceplansstate_builder_supportedrenewaltimes_inline">supportedRenewalTimes</a></div></div><div class="inline-doc" id="djirtknetworkserviceprovider_djirtknetworkserviceplansstate_builder_supportedrenewaltimes_inline"

><div class="article"><h6 ><font color="#AAA">method </font>supportedRenewalTimes</h6></div>

~~~java
 Builder supportedRenewalTimes(int supportedRenewalTimes) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.rtk</td></tr></table></html>



##### Description:



<font color="#666">Sets network RTK supported renewal times.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">supportedRenewalTimes</td><td><font color="#666"><i>An int value.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>A builder instance.</i></td></tr></table></html></div>

<div class="api-row" id="djirtknetworkserviceprovider_djirtknetworkserviceplansstate_builder_plans"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtknetworkserviceprovider_djirtknetworkserviceplansstate_builder_plans_inline">plans</a></div></div><div class="inline-doc" id="djirtknetworkserviceprovider_djirtknetworkserviceplansstate_builder_plans_inline"

><div class="article"><h6 ><font color="#AAA">method </font>plans</h6></div>

~~~java
 Builder plans(List<NetworkServicePlan> plans) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.rtk</td></tr></table></html>



##### Description:



<font color="#666">Sets network RTK plans.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;<a href="/Components/RTK/DJIRTKNetworkServiceProvider_DJIRTKNetworkServicePlan.html#djirtknetworkserviceprovider_djirtknetworkserviceplan">NetworkServicePlan</a>&gt; <font color="#000">plans</td><td><font color="#666"><i>A List of <code><a href="/Components/RTK/DJIRTKNetworkServiceProvider_DJIRTKNetworkServicePlan.html#djirtknetworkserviceprovider_djirtknetworkserviceplan">NetworkServicePlan</a></code>.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>A builder instance.</i></td></tr></table></html></div>

<div class="api-row" id="djirtknetworkserviceprovider_djirtknetworkserviceplansstate_builder_build"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtknetworkserviceprovider_djirtknetworkserviceplansstate_builder_build_inline">build</a></div></div><div class="inline-doc" id="djirtknetworkserviceprovider_djirtknetworkserviceplansstate_builder_build_inline"

><div class="article"><h6 ><font color="#AAA">method </font>build</h6></div>

~~~java
 NetworkServicePlansState build() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.rtk</td></tr></table></html>



##### Description:



<font color="#666">Builds an instance of <code><a href="/Components/RTK/DJIRTKNetworkServiceProvider_DJIRTKNetworkServicePlansState.html#djirtknetworkserviceprovider_djirtknetworkserviceplansstate">NetworkServicePlansState</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RTK/DJIRTKNetworkServiceProvider_DJIRTKNetworkServicePlansState.html#djirtknetworkserviceprovider_djirtknetworkserviceplansstate">NetworkServicePlansState</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RTK/DJIRTKNetworkServiceProvider_DJIRTKNetworkServicePlansState.html#djirtknetworkserviceprovider_djirtknetworkserviceplansstate">NetworkServicePlansState</a></code>.</i></td></tr></table></html></div>


