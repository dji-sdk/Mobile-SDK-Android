<div class="article"><h1 ><font color="#AAA">class </font>HandheldController</h1></div>

~~~java
 class HandheldController extends BaseComponent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.handheldcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/BaseComponent/DJIBaseComponent.html#djibasecomponent">BaseComponent</a></code></td></tr></table></html>



##### Description:



<font color="#666">This class contains interfaces related to the hand controller of a handheld device (such as Osmo). This object is available from the <code><a href="/Products/Handheld/DJIHandheld.html#djihandheld">HandHeld</a></code> subclass off <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct">BaseProduct</a></code>.



##### Class Members:

<div class="api-row" id="djihandheldcontroller_setdjihandheldpowermodelistener"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihandheldcontroller_setdjihandheldpowermodelistener_inline">setPowerModeCallback</a></div></div><div class="inline-doc" id="djihandheldcontroller_setdjihandheldpowermodelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPowerModeCallback</h6></div>

~~~java
 void setPowerModeCallback(@NonNull PowerMode.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.handheldcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIHandheldControllerKey.html#handheldcontrollerkey_power_mode_key">HandheldControllerKey.POWER_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Setup the callback that returns changed power mode state information.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/HandheldController/DJIHandheldController.html#djihandheldcontroller_djihandheldpowermode">PowerMode</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>The callback for the power mode state.</i></td></tr></table></html></div>

<div class="api-row" id="djihandheldcontroller_setupdatehardwarestatecallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihandheldcontroller_setupdatehardwarestatecallback_inline">setHardwareStateCallback</a></div></div><div class="inline-doc" id="djihandheldcontroller_setupdatehardwarestatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setHardwareStateCallback</h6></div>

~~~java
 void setHardwareStateCallback(@Nullable HardwareState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.handheldcontroller</td></tr></table></html>



##### Description:



<font color="#666">Set up the callback for the handheld's hardware state.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable HardwareState.Callback <font color="#000">callback</td><td><font color="#666"><i>Callback for the handheld controller's current hardware state (e.g. the state of the physical buttons and joysticks).</i></td></tr></table></html></div>

<div class="api-row" id="djihandheldcontroller_sethandheldpowermode"><div class="api-col left">Power</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihandheldcontroller_sethandheldpowermode_inline">setPowerMode</a></div></div><div class="inline-doc" id="djihandheldcontroller_sethandheldpowermode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPowerMode</h6></div>

~~~java
 void setPowerMode(@NonNull PowerMode mode, @Nullable final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.handheldcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIHandheldControllerKey.html#handheldcontrollerkey_power_mode_key">HandheldControllerKey.POWER_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Set the power mode for the handheld controller.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/HandheldController/DJIHandheldController.html#djihandheldcontroller_djihandheldpowermode">PowerMode</a> <font color="#000">mode</td><td><font color="#666"><i>The power mode to set. CAUTION! When the mode is <code><a href="/Components/HandheldController/DJIHandheldController.html#djihandheldcontroller_djihandheldpowermode_poweroff">OFF</a></code>, the handheld product will be shut down and the connection will be broken. The user must then power on the device manually.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djihandheldcontroller_controlledwithcommand"><div class="api-col left">LED</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihandheldcontroller_controlledwithcommand_inline">controlLEDWithCommand</a></div></div><div class="inline-doc" id="djihandheldcontroller_controlledwithcommand_inline"

><div class="article"><h6 ><font color="#AAA">method </font>controlLEDWithCommand</h6></div>

~~~java
 void controlLEDWithCommand(@NonNull LEDCommand command,
                                               @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.handheldcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIHandheldControllerKey.html#handheldcontrollerkey_led_command_key">HandheldControllerKey.LED_COMMAND</a></td></tr></table></html>



##### Description:



<font color="#666">Controls the LED of the handheld controller.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerLEDCommand.html#djihandheldcontroller_djihandheldcontrollerledcommand">LEDCommand</a> <font color="#000">command</td><td><font color="#666"><i>The command to control the LED.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djihandheldcontroller_setstickgimbalcontrolenabled"><div class="api-col left">Stick Control</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihandheldcontroller_setstickgimbalcontrolenabled_inline">setStickGimbalControlEnabled</a></div></div><div class="inline-doc" id="djihandheldcontroller_setstickgimbalcontrolenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setStickGimbalControlEnabled</h6></div>

~~~java
 void setStickGimbalControlEnabled(boolean enabled, @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.handheldcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIHandheldControllerKey.html#handheldcontrollerkey_stick_gimbal_control_enabled_key">HandheldControllerKey.STICK_GIMBAL_CONTROL_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Enables/disables the gimbal control with the joystick. By default, it is enabled. The handheld will be reset to the default value  when it reboots or SDK reinitializes. When gimbal control is disabled, the joystick can be used for other purposes in an SDK application by reading its position values with <code><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldjoystickverticaldirection">StickVerticalDirection</a></code> and <code><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldjoystickhorizontaldirection">StickHorizontalDirection</a></code>. Only supported in firmware version 1.2.0.40 or above.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable the gimbal control.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djihandheldcontroller_getstickgimbalcontrolenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihandheldcontroller_getstickgimbalcontrolenabled_inline">getStickGimbalControlEnabled</a></div></div><div class="inline-doc" id="djihandheldcontroller_getstickgimbalcontrolenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getStickGimbalControlEnabled</h6></div>

~~~java
 void getStickGimbalControlEnabled(@NonNull final CompletionCallbackWith<Boolean> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.handheldcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIHandheldControllerKey.html#handheldcontrollerkey_stick_gimbal_control_enabled_key">HandheldControllerKey.STICK_GIMBAL_CONTROL_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if gimbal control with the joystick is enabled. Only supported in firmware version 1.2.0.40 or above.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djihandheldcontroller_djihandheldpowermode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djihandheldcontroller_djihandheldpowermode_inline">PowerMode</a></div></div><div class="inline-doc" id="djihandheldcontroller_djihandheldpowermode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>PowerMode</h6></div>

~~~java
@EXClassNullAway
 enum PowerMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.handheld</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIHandheldControllerKey.html#handheldcontrollerkey_power_mode_key">HandheldControllerKey.POWER_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Handheld Power Mode.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldpowermode_awake_inline"></a>ON</td><td><font color="#666">The handheld product is awake. For Osmo, when it is in this mode, all the components in <code><a href="/Products/Handheld/DJIHandheld.html#djihandheld">HandHeld</a></code> are accessible.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldpowermode_sleeping_inline"></a>SLEEPING</td><td><font color="#666">The handheld product is sleeping. The handheld controller keeps the wireless connection to the mobile device alive but most other components are off. The power consumption is low in this mode. For Osmo in this mode, only the <code><a href="/Components/HandheldController/DJIHandheldController.html#djihandheldcontroller">HandheldController</a></code>, <code><a href="/Components/AirLink/DJIAirLink.html#djiairlink">AirLink</a></code>, and <code><a href="/Components/Battery/DJIBattery.html#djibattery">Battery</a></code> are accessible.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldpowermode_poweroff_inline"></a>OFF</td><td><font color="#666">The handheld product is powered off. Once this mode is set the callback will receive this mode until the handheld device is shut down completely. It is not supported by Osmo Mobile.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldpowermode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The Handheld Power Mode in unknown.</td></tr></table></html>

##### Class Members:

<div class="api-row" id="djihandheldcontroller_djihandheldpowermodelistenerinterface"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldPowerModeListenerInterface.html">Callback</a></div></div></div>

<div class="api-row" id="djihandheldcontroller_djihandheldcontrollerhardwarestate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html">HardwareState</a></div></div><div class="api-row" id="djihandheldcontroller_djihandheldcontrollerstickcontrolmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djihandheldcontroller_djihandheldcontrollerstickcontrolmode_inline">ControllerMode</a></div></div><div class="inline-doc" id="djihandheldcontroller_djihandheldcontrollerstickcontrolmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ControllerMode</h6></div>

~~~java
@EXClassNullAway
 enum ControllerMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.handheldcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_controller_mode_key">GimbalKey.CONTROLLER_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">The control mode for the gimbal physical controller (joystick for Osmo). The total controller deflection is a combination of horizontal and vertical deflection. This translates to gimbal movement around the yaw and pitch axes. The gimbal can be set to either move in both yaw and pitch simultaneously based on horizontal and vertical deflection of the controller, or move in only yaw or pitch exclusively based on whether horizontal or vertical deflection is larger.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldcontrollerstickcontrolmode_oneaxis_inline"></a>ONE_AXIS</td><td><font color="#666">Gimbal movement will be exclusively in yaw or pitch depending on whether the controller horizontal or vertical deflection is greater respectively.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldcontrollerstickcontrolmode_twoaxis_inline"></a>TWO_AXIS</td><td><font color="#666">Gimbal movement will be in both yaw and pitch simultaneously relative to the horizontal and vertical deflection of the controller respectively.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldcontrollerstickcontrolmode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The gimbal controller control mode is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djihandheldcontroller_djihandheldzoomslider"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djihandheldcontroller_djihandheldzoomslider_inline">ZoomState</a></div></div><div class="inline-doc" id="djihandheldcontroller_djihandheldzoomslider_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ZoomState</h6></div>

~~~java
@EXClassNullAway
 enum ZoomState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.handheld</td></tr></table></html>



##### Description:



<font color="#666">The state of the zoom slider on the handheld controller. Used by Osmo Mobile 2 only.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldzoomslider_idle_inline"></a>IDLE</td><td><font color="#666">Zoom slider is idle.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldzoomslider_zoomin_inline"></a>ZOOM_IN</td><td><font color="#666">The slider is pushed up and the camera should zoom in.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldzoomslider_zoomout_inline"></a>ZOOM_OUT</td><td><font color="#666">The slider is pushed down and the camera should zoom out.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldzoomslider_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djihandheldcontroller_djihandheldcontrollerledcommand"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerLEDCommand.html">LEDCommand</a></div></div>

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



<font color="#666">Gets the serial number of the component. Depending on the component, this serial number might not match the serial number found  on the physical component. Not supported by Spark.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value returned.</i></td></tr></table></html></div>

<div class="api-row" id="djibasecomponent_getfirmwareversion"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_getfirmwareversion_inline">getFirmwareVersion</a></div></div><div class="inline-doc" id="djibasecomponent_getfirmwareversion_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFirmwareVersion</h6></div>

~~~java
 void getFirmwareVersion(@NonNull CompletionCallbackWith<String> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Returns the firmware version of the component. Each component will  have a different firmware version, the combination of which will  form the package firmware version <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct_getfirmwarepackageversion">getFirmwarePackageVersion</a></code> found in <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct">BaseProduct</a></code>. Not supported by Spark.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>


