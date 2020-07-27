<div class="article"><h1 ><font color="#AAA">class </font>MobileRemoteController</h1></div>

~~~java
 class MobileRemoteController extends BaseComponent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mobilerc</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/BaseComponent/DJIBaseComponent.html#djibasecomponent">BaseComponent</a></code></td></tr></table></html>



##### Description:



<font color="#666">A simulated remote controller on the mobile device to control the aircraft when the physical remote controller is absent. The mobile remote controller only supports Mode 2 control style and flight mode P. It is supported by Mavic Pro using WiFi. This object is available from the <code><a href="/Products/Aircraft/DJIAircraft.html#djiaircraft">Aircraft</a></code> subclass off <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct">BaseProduct</a></code>.



##### Class Members:

<div class="api-row" id="djimobileremotecontroller_leftstickvertical"><div class="api-col left">Left Stick Vertical</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimobileremotecontroller_leftstickvertical_inline">setLeftStickVertical</a></div></div><div class="inline-doc" id="djimobileremotecontroller_leftstickvertical_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setLeftStickVertical</h6></div>

~~~java
 void setLeftStickVertical(float data) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mobilerc</td></tr></table></html>



##### Description:



<font color="#666">Simulates the vertical movement of the left stick, which changes the aircraft's thrust causing it to raise or  lower in elevation. The valid range is [-1, 1].



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">data</td><td><font color="#666"><i>A float value of the left stick vertical movement.</i></td></tr></table></html></div>

<div class="api-row" id="djimobileremotecontroller_getleftstickvertical"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimobileremotecontroller_getleftstickvertical_inline">getLeftStickVertical</a></div></div><div class="inline-doc" id="djimobileremotecontroller_getleftstickvertical_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLeftStickVertical</h6></div>

~~~java
 float getLeftStickVertical() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mobilerc</td></tr></table></html>



##### Description:



<font color="#666">Gets the vertical movement value of the left stick.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djimobileremotecontroller_leftstickhorizontal"><div class="api-col left">Left Stick Horizontal</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimobileremotecontroller_leftstickhorizontal_inline">setLeftStickHorizontal</a></div></div><div class="inline-doc" id="djimobileremotecontroller_leftstickhorizontal_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setLeftStickHorizontal</h6></div>

~~~java
 void setLeftStickHorizontal(float data) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mobilerc</td></tr></table></html>



##### Description:



<font color="#666">Simulates the horizontal movement of the left stick, which changes the yaw of the aircraft causing it to rotate  horizontally. The valid range is [-1, 1].



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">data</td><td><font color="#666"><i>A float value of the left stick horizontal movement.</i></td></tr></table></html></div>

<div class="api-row" id="djimobileremotecontroller_getleftstickhorizontal"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimobileremotecontroller_getleftstickhorizontal_inline">getLeftStickHorizontal</a></div></div><div class="inline-doc" id="djimobileremotecontroller_getleftstickhorizontal_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLeftStickHorizontal</h6></div>

~~~java
 float getLeftStickHorizontal() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mobilerc</td></tr></table></html>



##### Description:



<font color="#666">Gets the horizontal movement value of the left stick.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djimobileremotecontroller_rightstickvertical"><div class="api-col left">Right Stick Vertical</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimobileremotecontroller_rightstickvertical_inline">setRightStickVertical</a></div></div><div class="inline-doc" id="djimobileremotecontroller_rightstickvertical_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setRightStickVertical</h6></div>

~~~java
 void setRightStickVertical(float data) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mobilerc</td></tr></table></html>



##### Description:



<font color="#666">Simulates the vertical movement of the right stick, which changes the the aircraft's pitch causing it to fly  forward or backward. The valid range is [-1, 1].



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">data</td><td><font color="#666"><i>A float value of the right stick vertical movement.</i></td></tr></table></html></div>

<div class="api-row" id="djimobileremotecontroller_getrightstickvertical"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimobileremotecontroller_getrightstickvertical_inline">getRightStickVertical</a></div></div><div class="inline-doc" id="djimobileremotecontroller_getrightstickvertical_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRightStickVertical</h6></div>

~~~java
 float getRightStickVertical() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mobilerc</td></tr></table></html>



##### Description:



<font color="#666">Gets the vertical movement value of the right stick.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djimobileremotecontroller_rightstickhorizontal"><div class="api-col left">Right Stick Horizontal</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimobileremotecontroller_rightstickhorizontal_inline">setRightStickHorizontal</a></div></div><div class="inline-doc" id="djimobileremotecontroller_rightstickhorizontal_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setRightStickHorizontal</h6></div>

~~~java
 void setRightStickHorizontal(float data) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mobilerc</td></tr></table></html>



##### Description:



<font color="#666">Simulates the horizontal movement of the right stick, which changes the the aircraft's roll causing it to fly  left or right. The valid range is  [-1, 1].



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">data</td><td><font color="#666"><i>A float value of the left stick horizontal movement.</i></td></tr></table></html></div>

<div class="api-row" id="djimobileremotecontroller_getrightstickhorizontal"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djimobileremotecontroller_getrightstickhorizontal_inline">getRightStickHorizontal</a></div></div><div class="inline-doc" id="djimobileremotecontroller_getrightstickhorizontal_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRightStickHorizontal</h6></div>

~~~java
 float getRightStickHorizontal() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mobilerc</td></tr></table></html>



##### Description:



<font color="#666">Gets the horizontal movement value of the right stick.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>



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


