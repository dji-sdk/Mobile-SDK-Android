<div class="article"><h1 ><font color="#AAA">class </font>Spotlight</h1></div>

~~~java
 class Spotlight extends BaseComponent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.spotlight</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/BaseComponent/DJIBaseComponent.html#djibasecomponent">BaseComponent</a></code></td></tr></table></html>



##### Description:



<font color="#666">This class represents the spotlight accessory mounted on the aircraft. It  provides methods to control the spotlight and get the related states.



##### Class Members:



#### State Updates

<div class="api-row" id="djiaccessoryaggregation_djispotlight_setstatecallback"><div class="api-col left">General</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispotlight_setstatecallback_inline">setStateCallback</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispotlight_setstatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setStateCallback</h6></div>

~~~java
 void setStateCallback(@Nullable SpotlightState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.spotlight</td></tr></table></html>



##### Description:



<font color="#666">Set spotlight state update callback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpotlight_DJISpotlightState.html#djiaccessoryaggregation_djispotlight_djispotlightstate">SpotlightState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Members

<div class="api-row" id="djiaccessoryaggregation_djispotlight_state"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispotlight_state_inline">getState</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispotlight_state_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getState</h6></div>

~~~java
 SpotlightState getState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.spotlight</td></tr></table></html>



##### Description:



<font color="#666">Gets the state of the spotlight.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpotlight_DJISpotlightState.html#djiaccessoryaggregation_djispotlight_djispotlightstate">SpotlightState</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpotlight_DJISpotlightState.html#djiaccessoryaggregation_djispotlight_djispotlightstate">SpotlightState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessoryaggregation_djispotlight_getenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispotlight_getenabled_inline">getEnabled</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispotlight_getenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getEnabled</h6></div>

~~~java
 void getEnabled(@NonNull CommonCallbacks.CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.spotlight</td></tr></table></html>



##### Description:



<font color="#666">Gets on/off status of Spotlight.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessoryaggregation_djispotlight_setenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispotlight_setenabled_inline">setEnabled</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispotlight_setenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setEnabled</h6></div>

~~~java
 void setEnabled(boolean enabled, @Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.spotlight</td></tr></table></html>



##### Description:



<font color="#666">Enables the spotlight to turn it on.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to turn on the spotlight.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessoryaggregation_djispotlight_setbrightness"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessoryaggregation_djispotlight_setbrightness_inline">setBrightness</a></div></div><div class="inline-doc" id="djiaccessoryaggregation_djispotlight_setbrightness_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setBrightness</h6></div>

~~~java
 void setBrightness(@IntRange(from = 1, to = 100) int value,
                              @Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.accessory.spotlight</td></tr></table></html>



##### Description:



<font color="#666">Sets the brightness of the spotlight. The valid range is [1, 100]. 100 means the brightest.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 1, to = 100) int <font color="#000">value</td><td><font color="#666"><i>Brightness value to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<html><p><br></p></html>

##### Related:

<div class="api-row" id="djiaccessoryaggregation_djispotlight_djispotlightstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpotlight_DJISpotlightState.html">SpotlightState</a></div></div>

##### Inherited Methods:

<div class="api-row" id="djibasecomponent_setdjicomponentlistener"><div class="api-col left">dji.sdk.base.BaseComponent</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_setdjicomponentlistener_inline">setComponentListener</a></div></div><div class="inline-doc" id="djibasecomponent_setdjicomponentlistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setComponentListener</h6></div>

~~~java
 void setComponentListener(ComponentListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Sets the listener for the DJI component.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/BaseComponent/DJIBaseComponent_DJIComponentListenerInterface.html#djibasecomponent_djicomponentlistenerinterface">ComponentListener</a> <font color="#000">listener</td><td><font color="#666"><i>The callback of <code><a href="/Components/BaseComponent/DJIBaseComponent_DJIComponentListenerInterface.html#djibasecomponent_djicomponentlistenerinterface">ComponentListener</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djibasecomponent_index"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_index_inline">getIndex</a></div></div><div class="inline-doc" id="djibasecomponent_index_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getIndex</h6></div>

~~~java
 int getIndex() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Returns the component index. Index is zero based. A component will have an index greater than zero when there  are multiple components of the same type on the DJI product, and one of the components already has the index 0.  For instance, M210 can have two gimbal mounted cameras, and will therefore have two gimbal components with indices  0 and 1, and two camera components with indices 0 and 1. For Matrice 600, there are printed numbers on the battery  boxes. The <code><a href="/Components/Battery/DJIBattery.html#djibattery">Battery</a></code> component instance with index 0 corresponds to battery compartment number 1. For Inspire 2  and M200 series, <code><a href="/Components/Battery/DJIBattery.html#djibattery">Battery</a></code> with index 0 corresponds to the battery on the port (left hand) side of the aircraft.  For M210 and M210 RTK, <code><a href="/Components/Camera/DJICamera.html#djicamera">Camera</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal">Gimbal</a></code> with index 0 corresponds to the camera and gimbal on the port  (left hand) side of the aircraft.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of index.</i></td></tr></table></html></div>

<div class="api-row" id="djibasecomponent_connected"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_connected_inline">isConnected</a></div></div><div class="inline-doc" id="djibasecomponent_connected_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isConnected</h6></div>

~~~java
 boolean isConnected() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the component is connected.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the component is connected.</i></td></tr></table></html></div>

<div class="api-row" id="djibasecomponent_getserialnumber"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_getserialnumber_inline">getSerialNumber</a></div></div><div class="inline-doc" id="djibasecomponent_getserialnumber_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSerialNumber</h6></div>

~~~java
 void getSerialNumber(@NonNull CompletionCallbackWith<String> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Gets the serial number of the component. Depending on the component, this serial number might not match the serial number found  on the physical component.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value returned.</i></td></tr></table></html></div>

<div class="api-row" id="djibasecomponent_getfirmwareversion"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_getfirmwareversion_inline">getFirmwareVersion</a></div></div><div class="inline-doc" id="djibasecomponent_getfirmwareversion_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFirmwareVersion</h6></div>

~~~java
 void getFirmwareVersion(@NonNull CompletionCallbackWith<String> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Returns the firmware version of the component. Each component will  have a different firmware version, the combination of which will  form the package firmware version <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct_getfirmwarepackageversion">getFirmwarePackageVersion</a></code> found in <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct">BaseProduct</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>


