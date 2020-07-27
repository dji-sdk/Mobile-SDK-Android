<div class="article"><h1 ><font color="#AAA">class </font>HardwareState</h1></div>

~~~java
@EXClassNullAway
 class HardwareState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Remote Controller's current state.



##### Class Members:

<div class="api-row" id="djiremotecontroller_djirchardwarestate_left"><div class="api-col left">Sticks</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djirchardwarestate_left_inline">getLeftStick</a></div></div><div class="inline-doc" id="djiremotecontroller_djirchardwarestate_left_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLeftStick</h6></div>

~~~java
@Nullable
 Stick getLeftStick() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_left_stick_value_key">RemoteControllerKey.LEFT_STICK_VALUE</a></td></tr></table></html>



##### Description:



<font color="#666">Get left stick.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Stick/DJIStick.html#djistick">Stick</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/Stick/DJIStick.html#djistick">Stick</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djirchardwarestate_right"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djirchardwarestate_right_inline">getRightStick</a></div></div><div class="inline-doc" id="djiremotecontroller_djirchardwarestate_right_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRightStick</h6></div>

~~~java
@Nullable
 Stick getRightStick() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_right_stick_value_key">RemoteControllerKey.RIGHT_STICK_VALUE</a></td></tr></table></html>



##### Description:



<font color="#666">Get right stick.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Stick/DJIStick.html#djistick">Stick</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/Stick/DJIStick.html#djistick">Stick</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djirchardwarestate_leftwheel"><div class="api-col left">Wheels</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djirchardwarestate_leftwheel_inline">getLeftDial</a></div></div><div class="inline-doc" id="djiremotecontroller_djirchardwarestate_leftwheel_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLeftDial</h6></div>

~~~java
@IntRange(from = -660, to = 660)
 int getLeftDial() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999">LEFT_WHEEL</td></tr></table></html>



##### Description:



<font color="#666">Gimbal Dial's (upper left dial) value in the range of [-660,660], where 0 is untouched and positive is turned in the clockwise direction.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Gimbal dial value.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djirchardwarestate_rightwheel"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djirchardwarestate_rightwheel_inline">getRightDial</a></div></div><div class="inline-doc" id="djiremotecontroller_djirchardwarestate_rightwheel_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRightDial</h6></div>

~~~java
@Nullable
 RightDial getRightDial() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999">RIGHT_WHEEL</td></tr></table></html>



##### Description:



<font color="#666">Current state of the Camera Settings Dial (upper right dial) on the Remote Controller.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareRightWheel.html#djiremotecontroller_djirchardwarerightwheel">RightDial</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareRightWheel.html#djiremotecontroller_djirchardwarerightwheel">RightDial</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djirchardwarestate_transformationswitch"><div class="api-col left">Switches</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djirchardwarestate_transformationswitch_inline">getTransformationSwitch</a></div></div><div class="inline-doc" id="djiremotecontroller_djirchardwarestate_transformationswitch_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTransformationSwitch</h6></div>

~~~java
@Nullable
 TransformationSwitch getTransformationSwitch() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_transformation_switch_key">RemoteControllerKey.TRANSFORMATION_SWITCH</a></td></tr></table></html>



##### Description:



<font color="#666">Current state of the Transformation Switch on the Remote Controller.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareTransformationSwitch.html#djiremotecontroller_djirchardwaretransformationswitch">TransformationSwitch</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareTransformationSwitch.html#djiremotecontroller_djirchardwaretransformationswitch">TransformationSwitch</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djirchardwarestate_flightmodeswitch"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djirchardwarestate_flightmodeswitch_inline">getFlightModeSwitch</a></div></div><div class="inline-doc" id="djiremotecontroller_djirchardwarestate_flightmodeswitch_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlightModeSwitch</h6></div>

~~~java
@Nullable
 FlightModeSwitch getFlightModeSwitch() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_flight_mode_switch_position_key">RemoteControllerKey.FLIGHT_MODE_SWITCH_POSITION</a></td></tr></table></html>



##### Description:



<font color="#666">Current position of the Flight Mode Switch on the Remote Controller.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState.html#djiremotecontroller_djiremotecontrollerflightmodeswitchposition">FlightModeSwitch</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState.html#djiremotecontroller_djiremotecontrollerflightmodeswitchposition">FlightModeSwitch</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djirchardwarestate_gohomebutton"><div class="api-col left">Buttons</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djirchardwarestate_gohomebutton_inline">getGoHomeButton</a></div></div><div class="inline-doc" id="djiremotecontroller_djirchardwarestate_gohomebutton_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getGoHomeButton</h6></div>

~~~java
@Nullable
 Button getGoHomeButton() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_go_home_button_key">RemoteControllerKey.GO_HOME_BUTTON</a></td></tr></table></html>



##### Description:



<font color="#666">Current state of the Return To Home Button.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState_Button.html#djiremotecontroller_djirchardwarestate_button">Button</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState_Button.html#djiremotecontroller_djirchardwarestate_button">Button</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djirchardwarestate_recordbutton"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djirchardwarestate_recordbutton_inline">getRecordButton</a></div></div><div class="inline-doc" id="djiremotecontroller_djirchardwarestate_recordbutton_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRecordButton</h6></div>

~~~java
@Nullable
 Button getRecordButton() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_record_button_key">RemoteControllerKey.RECORD_BUTTON</a></td></tr></table></html>



##### Description:



<font color="#666">Current state of the Video Recording Button.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState_Button.html#djiremotecontroller_djirchardwarestate_button">Button</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState_Button.html#djiremotecontroller_djirchardwarestate_button">Button</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djirchardwarestate_shutterbutton"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djirchardwarestate_shutterbutton_inline">getShutterButton</a></div></div><div class="inline-doc" id="djiremotecontroller_djirchardwarestate_shutterbutton_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getShutterButton</h6></div>

~~~java
@Nullable
 Button getShutterButton() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_shutter_button_key">RemoteControllerKey.SHUTTER_BUTTON</a></td></tr></table></html>



##### Description:



<font color="#666">Current state of the Shutter Button.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState_Button.html#djiremotecontroller_djirchardwarestate_button">Button</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState_Button.html#djiremotecontroller_djirchardwarestate_button">Button</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djirchardwarestate_playbackbutton"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djirchardwarestate_playbackbutton_inline">getPlaybackButton</a></div></div><div class="inline-doc" id="djiremotecontroller_djirchardwarestate_playbackbutton_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPlaybackButton</h6></div>

~~~java
@Nullable
 Button getPlaybackButton() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_playback_button_key">RemoteControllerKey.PLAYBACK_BUTTON</a></td></tr></table></html>



##### Description:



<font color="#666">Current state of the Playback Button. The Playback Button is not supported on Phantom 4 remote controllers.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState_Button.html#djiremotecontroller_djirchardwarestate_button">Button</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState_Button.html#djiremotecontroller_djirchardwarestate_button">Button</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djirchardwarestate_pausebutton"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djirchardwarestate_pausebutton_inline">getPauseButton</a></div></div><div class="inline-doc" id="djiremotecontroller_djirchardwarestate_pausebutton_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPauseButton</h6></div>

~~~java
@Nullable
 Button getPauseButton() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_pause_button_key">RemoteControllerKey.PAUSE_BUTTON</a></td></tr></table></html>



##### Description:



<font color="#666">Current state of the Pause Button. The Pause button is only supported on Phantom 4 remote controllers.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState_Button.html#djiremotecontroller_djirchardwarestate_button">Button</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState_Button.html#djiremotecontroller_djirchardwarestate_button">Button</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djirchardwarestate_custombutton1"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djirchardwarestate_custombutton1_inline">getC1Button</a></div></div><div class="inline-doc" id="djiremotecontroller_djirchardwarestate_custombutton1_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getC1Button</h6></div>

~~~java
@Nullable
 Button getC1Button() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_custom_button_1_key">RemoteControllerKey.CUSTOM_BUTTON_1</a></td></tr></table></html>



##### Description:



<font color="#666">Current state of custom button 1 (left Back Button). It is not supported by remote controllers  for Mavic Air or Spark.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState_Button.html#djiremotecontroller_djirchardwarestate_button">Button</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState_Button.html#djiremotecontroller_djirchardwarestate_button">Button</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djirchardwarestate_custombutton2"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djirchardwarestate_custombutton2_inline">getC2Button</a></div></div><div class="inline-doc" id="djiremotecontroller_djirchardwarestate_custombutton2_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getC2Button</h6></div>

~~~java
@Nullable
 Button getC2Button() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_custom_button_2_key">RemoteControllerKey.CUSTOM_BUTTON_2</a></td></tr></table></html>



##### Description:



<font color="#666">Current state of custom button 2 (right Back Button).



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState_Button.html#djiremotecontroller_djirchardwarestate_button">Button</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState_Button.html#djiremotecontroller_djirchardwarestate_button">Button</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djirchardwarestate_custombutton3"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djirchardwarestate_custombutton3_inline">getC3Button</a></div></div><div class="inline-doc" id="djiremotecontroller_djirchardwarestate_custombutton3_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getC3Button</h6></div>

~~~java
@Nullable
 Button getC3Button() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Current state of custom button 3 (right Front Button). It is only supported by DJI Smart Controller.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState_Button.html#djiremotecontroller_djirchardwarestate_button">Button</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState_Button.html#djiremotecontroller_djirchardwarestate_button">Button</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djirchardwarestate_fnbutton"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djirchardwarestate_fnbutton_inline">getFunctionButton</a></div></div><div class="inline-doc" id="djiremotecontroller_djirchardwarestate_fnbutton_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFunctionButton</h6></div>

~~~java
@Nullable
 Button getFunctionButton() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Current state of fn button. It is only supported by remote controllers for Spark  or Mavic Air.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState_Button.html#djiremotecontroller_djirchardwarestate_button">Button</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState_Button.html#djiremotecontroller_djirchardwarestate_button">Button</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djirchardwarestate_fivedbutton"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djirchardwarestate_fivedbutton_inline">getFiveDButton</a></div></div><div class="inline-doc" id="djiremotecontroller_djirchardwarestate_fivedbutton_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFiveDButton</h6></div>

~~~java
@Nullable
 FiveDButton getFiveDButton() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_five_d_button_key">RemoteControllerKey.FIVE_D_BUTTON</a></td></tr></table></html>



##### Description:



<font color="#666">Current state of the 5D button. The button can be moved up, down, left and right and can be pressed. The 5D  button is supported by Mavic Pro and Mavic 2 remote controllers.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController_DJIRCFiveDButton.html#djiremotecontroller_djircfivedbutton">FiveDButton</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCFiveDButton.html#djiremotecontroller_djircfivedbutton">FiveDButton</a></code>.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiremotecontroller_rchardwarestateupdatecallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_RCHardwareStateUpdateCallbackInterface.html">HardwareStateCallback</a></div></div><div class="api-row" id="djiremotecontroller_djirchardwarerightwheel"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareRightWheel.html">RightDial</a></div></div><div class="api-row" id="djiremotecontroller_djirchardwaretransformationswitch"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareTransformationSwitch.html">TransformationSwitch</a></div></div><div class="api-row" id="djiremotecontroller_djiremotecontrollerflightmodeswitchposition"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djiremotecontrollerflightmodeswitchposition_inline">FlightModeSwitch</a></div></div><div class="inline-doc" id="djiremotecontroller_djiremotecontrollerflightmodeswitchposition_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FlightModeSwitch</h6></div>

~~~java
 enum FlightModeSwitch 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_flight_mode_switch_position_key">RemoteControllerKey.FLIGHT_MODE_SWITCH_POSITION</a></td></tr></table></html>



##### Description:



<font color="#666">Remote Controller Flight Mode switch position.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djiremotecontrollerflightmodeswitchpositionone_inline"></a>POSITION_ONE</td><td><font color="#666">Position One. For all products except Mavic Pro, this is the left most position of the flight mode switch on a remote controller from the perspective of the pilot. For example, on a Phantom 4 remote controller,  Position One is labeled "A". For Mavic Pro, Spark and Mavic Air, this is  the position that is furthest away from the pilot and labeled "Sport".</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djiremotecontrollerflightmodeswitchpositiontwo_inline"></a>POSITION_TWO</td><td><font color="#666">Position Two. For all products except Mavic Pro, this is the middle position of the flight mode switch on a remote controller from the perspective of the pilot. For example, on a Phantom 4 remote controller, Position Two is labeled "S". For Mavic Pro, Spark and Mavic Air, this is the position that is closest  to the pilot (the P position).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djiremotecontrollerflightmodeswitchpositionthree_inline"></a>POSITION_THREE</td><td><font color="#666">Position Three. For all products except Mavic Pro, this is the right most position of the flight mode switch on a remote controller from the perspective of the pilot. For example, on a Phantom 4 remote controller, Position Two is labeled "P". Mavic Pro, Spark or Mavic Air does not have  a third position for the flight mode switch.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiremotecontroller_djirchardwarestate_button"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState_Button.html">Button</a></div></div><div class="api-row" id="djiremotecontroller_djircfivedbutton"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_DJIRCFiveDButton.html">FiveDButton</a></div></div>
