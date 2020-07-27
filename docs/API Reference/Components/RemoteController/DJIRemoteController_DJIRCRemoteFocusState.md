<div class="article"><h1 ><font color="#AAA">class </font>FocusControllerState</h1></div>

~~~java
@EXClassNullAway
 class FocusControllerState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Remote Controller's Remote Focus State. The focus product has one dial (focus control) that controls two separate parts of the camera: focal length and aperture. However it can only control one of these at any one time and is an absolute dial, meaning that a specific rotational position of the dial corresponds to a specific focal length or aperture. This means that whenever the dial control mode is changed, the dial first has to be reset to the new mode's previous dial position before the dial can be used to adjust the setting of the new mode. Example workflow:<br/><ol> <li>Use dial to set an Aperture of f2.2</li> <li>Change dial control mode to focal length (set <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCRemoteFocusState.html#djiremotecontroller_djircremotefocuscontroltype">ControlType</a></code>)</li><li>Use the dial to change the focal length</li><li>Change dial control mode back to aperture<ul><li> set <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCRemoteFocusState.html#djiremotecontroller_djircremotefocuscontroltype">ControlType</a></code></li> <li><code><a href="/Components/RemoteController/DJIRemoteController_DJIRCRemoteFocusState.html#djiremotecontroller_djircremotefocusstate_isfocuscontrolworks">isWorking</a></code> will now be NO</li></ul></li><li> Adjust dial back to f2.2<ul><li><code><a href="/Components/RemoteController/DJIRemoteController_DJIRCRemoteFocusState.html#djiremotecontroller_djircremotefocuscontroldirection">Direction</a></code> is the direction the dial should be rotated</li><li><code><a href="/Components/RemoteController/DJIRemoteController_DJIRCRemoteFocusState.html#djiremotecontroller_djircremotefocusstate_isfocuscontrolworks">isWorking</a></code> will become YES when set back to f2.2</li></ul></li><li>Now the dial can be used to adjust the aperture.</ol>



##### Class Members:



##### Related:

<div class="api-row" id="djiremotecontroller_rcremotefocusstateupdatecallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_RCRemoteFocusStateUpdateCallbackInterface.html">FocusControllerStateCallback</a></div></div><div class="api-row" id="djiremotecontroller_djircremotefocuscontroltype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircremotefocuscontroltype_inline">ControlType</a></div></div><div class="inline-doc" id="djiremotecontroller_djircremotefocuscontroltype_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ControlType</h6></div>

~~~java
 enum ControlType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_focus_controller_control_type_key">RemoteControllerKey.FOCUS_CONTROLLER_CONTROL_TYPE</a></td></tr></table></html>



##### Description:



<font color="#666">Remote Focus Control Type.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircremotefocuscontroltype_aperture_inline"></a>APERTURE</td><td><font color="#666">Control Aperture.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircremotefocuscontroltype_focallength_inline"></a>FOCAL_LENGTH</td><td><font color="#666">Control Focal Length.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircremotefocuscontroltype_focusdistance_inline"></a>FOCUS_DISTANCE</td><td><font color="#666">Adjust focus distance.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircremotefocuscontroltype_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown types.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiremotecontroller_djircremotefocuscontroldirection"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircremotefocuscontroldirection_inline">Direction</a></div></div><div class="inline-doc" id="djiremotecontroller_djircremotefocuscontroldirection_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>Direction</h6></div>

~~~java
 enum Direction 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_focus_controller_direction_key">RemoteControllerKey.FOCUS_CONTROLLER_DIRECTION</a></td></tr></table></html>



##### Description:



<font color="#666">Remote Focus Control Direction.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircremotefocuscontroldirection_clockwise_inline"></a>CLOCKWISE</td><td><font color="#666">Clockwise.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircremotefocuscontroldirection_counterclockwise_inline"></a>COUNTER_CLOCKWISE</td><td><font color="#666">CounterClockwise.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircremotefocuscontroldirection_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<html><p><br></p></html>

#### Members

<div class="api-row" id="djiremotecontroller_djircremotefocusstate_isfocuscontrolworks"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircremotefocusstate_isfocuscontrolworks_inline">isWorking</a></div></div><div class="inline-doc" id="djiremotecontroller_djircremotefocusstate_isfocuscontrolworks_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isWorking</h6></div>

~~~java
 boolean isWorking() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_focus_controller_is_working_key">RemoteControllerKey.FOCUS_CONTROLLER_IS_WORKING</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the focus control works. The control can be either changing the Aperture or  Focal Length. If it is <code>false</code>, follow  the <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCRemoteFocusState.html#djiremotecontroller_djircremotefocuscontroldirection">Direction</a></code> to rotate the Remote Focus Device until it  turns to <code>true</code> again.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djircremotefocusstate_controltype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircremotefocusstate_controltype_inline">getControlType</a></div></div><div class="inline-doc" id="djiremotecontroller_djircremotefocusstate_controltype_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getControlType</h6></div>

~~~java
 ControlType getControlType() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_focus_controller_control_type_key">RemoteControllerKey.FOCUS_CONTROLLER_CONTROL_TYPE</a></td></tr></table></html>



##### Description:



<font color="#666">Remote Focus Control Type.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController_DJIRCRemoteFocusState.html#djiremotecontroller_djircremotefocuscontroltype">ControlType</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCRemoteFocusState.html#djiremotecontroller_djircremotefocuscontroltype">ControlType</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djircremotefocusstate_direction"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircremotefocusstate_direction_inline">getDirection</a></div></div><div class="inline-doc" id="djiremotecontroller_djircremotefocusstate_direction_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDirection</h6></div>

~~~java
 Direction getDirection() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_focus_controller_direction_key">RemoteControllerKey.FOCUS_CONTROLLER_DIRECTION</a></td></tr></table></html>



##### Description:



<font color="#666">Remote Focus Control Direction. Use this with  the <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCRemoteFocusState.html#djiremotecontroller_djircremotefocusstate_isfocuscontrolworks">isWorking</a></code> value. It will give you the correct  rotation direction when <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCRemoteFocusState.html#djiremotecontroller_djircremotefocusstate_isfocuscontrolworks">isWorking</a></code> is  <code>false</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController_DJIRCRemoteFocusState.html#djiremotecontroller_djircremotefocuscontroldirection">Direction</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCRemoteFocusState.html#djiremotecontroller_djircremotefocuscontroldirection">Direction</a></code></i></td></tr></table></html></div>


