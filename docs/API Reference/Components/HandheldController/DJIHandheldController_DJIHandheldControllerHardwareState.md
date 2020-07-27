<div class="article"><h1 ><font color="#AAA">class </font>HardwareState</h1></div>

~~~java
@EXClassNullAway
 class HardwareState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.handheld</td></tr></table></html>



##### Description:



<font color="#666">The status of the shutter button and record button on the handheld controller. Used by Osmo Mobile only.



##### Class Members:

<div class="api-row" id="djihandheldcontroller_djihandheldcontrollerhardwarestate_handheldbuttonstatus"><div class="api-col left">Button</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_handheldbuttonstatus_inline">getRecordAndShutterButtons</a></div></div><div class="inline-doc" id="djihandheldcontroller_djihandheldcontrollerhardwarestate_handheldbuttonstatus_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRecordAndShutterButtons</h6></div>

~~~java
 RecordAndShutterButtons getRecordAndShutterButtons() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.handheld</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIHandheldControllerKey.html#handheldcontrollerkey_record_and_shutter_buttons_key">HandheldControllerKey.RECORD_AND_SHUTTER_BUTTONS</a></td></tr></table></html>



##### Description:



<font color="#666">Status of the shutter button and record button.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldbuttonstatus">RecordAndShutterButtons</a></td><td><font color="#666"><i>A <code><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldbuttonstatus">RecordAndShutterButtons</a></code> enum value.</i></td></tr></table></html></div>

<div class="api-row" id="djihandheldcontroller_djihandheldcontrollerhardwarestate_triggerstate"><div class="api-col left">Trigger</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_triggerstate_inline">getTriggerButton</a></div></div><div class="inline-doc" id="djihandheldcontroller_djihandheldcontrollerhardwarestate_triggerstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTriggerButton</h6></div>

~~~java
 HandheldButtonClickEvent getTriggerButton() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.handheld</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIHandheldControllerKey.html#handheldcontrollerkey_trigger_button_key">HandheldControllerKey.TRIGGER_BUTTON</a></td></tr></table></html>



##### Description:



<font color="#666">Status of the trigger button.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldtriggerstatus">HandheldButtonClickEvent</a></td><td><font color="#666"><i>A <code><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldtriggerstatus">HandheldButtonClickEvent</a></code> enum value.</i></td></tr></table></html></div>

<div class="api-row" id="djihandheldcontroller_djihandheldcontrollerhardwarestate_modebutton"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_modebutton_inline">getModeButton</a></div></div><div class="inline-doc" id="djihandheldcontroller_djihandheldcontrollerhardwarestate_modebutton_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getModeButton</h6></div>

~~~java
 HandheldButtonClickEvent getModeButton() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.handheld</td></tr></table></html>



##### Description:



<font color="#666">Status of the mode button. It is only supported by Osmo Mobile 2.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldtriggerstatus">HandheldButtonClickEvent</a></td><td><font color="#666"><i>A <code><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldtriggerstatus">HandheldButtonClickEvent</a></code> enum value.</i></td></tr></table></html></div>

<div class="api-row" id="djihandheldcontroller_djihandheldcontrollerhardwarestate_istriggerbeingpressed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_istriggerbeingpressed_inline">isTriggerBeingPressed</a></div></div><div class="inline-doc" id="djihandheldcontroller_djihandheldcontrollerhardwarestate_istriggerbeingpressed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isTriggerBeingPressed</h6></div>

~~~java
 boolean isTriggerBeingPressed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.handheld</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIHandheldControllerKey.html#handheldcontrollerkey_is_trigger_being_pressed_key">HandheldControllerKey.IS_TRIGGER_BEING_PRESSED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> when the trigger is being pressed. It is only supported in firmware version 1.2.0.40 or above.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djihandheldcontroller_djihandheldcontrollerhardwarestate_ismodebuttonbeingpressed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_ismodebuttonbeingpressed_inline">isModeButtonBeingPressed</a></div></div><div class="inline-doc" id="djihandheldcontroller_djihandheldcontrollerhardwarestate_ismodebuttonbeingpressed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isModeButtonBeingPressed</h6></div>

~~~java
 boolean isModeButtonBeingPressed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.handheld</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> when the mode button is being pressed. It is only supported by OSMO Mobile 2.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djihandheldcontroller_djihandheldcontrollerhardwarestate_joystickverticaldirection"><div class="api-col left">Stick</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_joystickverticaldirection_inline">getStickVerticalDirection</a></div></div><div class="inline-doc" id="djihandheldcontroller_djihandheldcontrollerhardwarestate_joystickverticaldirection_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getStickVerticalDirection</h6></div>

~~~java
 StickVerticalDirection getStickVerticalDirection() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.handheld</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIHandheldControllerKey.html#handheldcontrollerkey_stick_vertical_direction_key">HandheldControllerKey.STICK_VERTICAL_DIRECTION</a></td></tr></table></html>



##### Description:



<font color="#666">Status of the joystick in vertical direction.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldjoystickverticaldirection">StickVerticalDirection</a></td><td><font color="#666"><i>A <code><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldjoystickverticaldirection">StickVerticalDirection</a></code> enum value.</i></td></tr></table></html></div>

<div class="api-row" id="djihandheldcontroller_djihandheldcontrollerhardwarestate_joystickhorizontaldirection"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_joystickhorizontaldirection_inline">getStickHorizontalDirection</a></div></div><div class="inline-doc" id="djihandheldcontroller_djihandheldcontrollerhardwarestate_joystickhorizontaldirection_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getStickHorizontalDirection</h6></div>

~~~java
 StickHorizontalDirection getStickHorizontalDirection() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.handheld</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIHandheldControllerKey.html#handheldcontrollerkey_stick_horizontal_direction_key">HandheldControllerKey.STICK_HORIZONTAL_DIRECTION</a></td></tr></table></html>



##### Description:



<font color="#666">Status of the joystick in horizontal direction.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldjoystickhorizontaldirection">StickHorizontalDirection</a></td><td><font color="#666"><i>A <code><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldjoystickhorizontaldirection">StickHorizontalDirection</a></code> enum value.</i></td></tr></table></html></div>

<div class="api-row" id="djihandheldcontroller_djihandhelpcontrollerhardwarestate_stickposition"><div class="api-col left">Joystick Position</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihandheldcontroller_djihandhelpcontrollerhardwarestate_stickposition_inline">getStick</a></div></div><div class="inline-doc" id="djihandheldcontroller_djihandhelpcontrollerhardwarestate_stickposition_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getStick</h6></div>

~~~java
 Stick getStick() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.handheld</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIHandheldControllerKey.html#handheldcontrollerkey_stick_key">HandheldControllerKey.STICK</a></td></tr></table></html>



##### Description:



<font color="#666">Position of the stick in both vertical and horizontal direction. Only supported in firmware version 1.2.0.40 or above.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Stick/DJIStick.html#djistick">Stick</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Stick/DJIStick.html#djistick">Stick</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djihandheldcontroller_djihandhelpcontrollerhardwarestate_zoomslider"><div class="api-col left">Zoom Slider</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihandheldcontroller_djihandhelpcontrollerhardwarestate_zoomslider_inline">getZoomState</a></div></div><div class="inline-doc" id="djihandheldcontroller_djihandhelpcontrollerhardwarestate_zoomslider_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getZoomState</h6></div>

~~~java
 ZoomState getZoomState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.handheld</td></tr></table></html>



##### Description:



<font color="#666">Status of the zoom slider. It is only supported by Osmo Mobile 2.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/HandheldController/DJIHandheldController.html#djihandheldcontroller_djihandheldzoomslider">ZoomState</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/HandheldController/DJIHandheldController.html#djihandheldcontroller_djihandheldzoomslider">ZoomState</a></code>.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djihandheldcontroller_djiupdatehardwarestatecallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/HandheldController/DJIHandheldController_DJIUpdateHardwareStateCallbackInterface.html">Callback</a></div></div><div class="api-row" id="djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldbuttonstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldbuttonstatus_inline">RecordAndShutterButtons</a></div></div><div class="inline-doc" id="djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldbuttonstatus_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>RecordAndShutterButtons</h6></div>

~~~java
@EXClassNullAway
 enum RecordAndShutterButtons 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.handheld</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIHandheldControllerKey.html#handheldcontrollerkey_record_and_shutter_buttons_key">HandheldControllerKey.RECORD_AND_SHUTTER_BUTTONS</a></td></tr></table></html>



##### Description:



<font color="#666">The status of the shutter button and record button on the handheld controller.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldbuttonstatus_idle_inline"></a>IDLE</td><td><font color="#666">No buttons have been pressed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldbuttonstatus_shutterbuttonpressed_inline"></a>SHUTTER_CLICK</td><td><font color="#666">Only the shutter button was pressed and released.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldbuttonstatus_recordbuttonpressed_inline"></a>RECORD_CLICK</td><td><font color="#666">Only the record button was pressed and released.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldbuttonstatus_shutterbuttonlongpress_inline"></a>SHUTTER_LONG_CLICK</td><td><font color="#666">The shutter button is being pressed without release.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldbuttonstatus_modeunknown_inline"></a>UNKNOWN</td><td><font color="#666">The button status is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldtriggerstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldtriggerstatus_inline">HandheldButtonClickEvent</a></div></div><div class="inline-doc" id="djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldtriggerstatus_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>HandheldButtonClickEvent</h6></div>

~~~java
@EXClassNullAway
 enum HandheldButtonClickEvent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.handheld</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIHandheldControllerKey.html#handheldcontrollerkey_trigger_button_key">HandheldControllerKey.TRIGGER_BUTTON</a>, <a href="/Components/KeyManager/DJIHandheldControllerKey.html#handheldcontrollerkey_mode_button_key">HandheldControllerKey.MODE_BUTTON</a></td></tr></table></html>



##### Description:



<font color="#666">The status of the shutter button and record button on the handheld controller.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldtriggerstatus_idle_inline"></a>IDLE</td><td><font color="#666">Trigger button status is idle.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldtriggerstatus_singleclick_inline"></a>SINGLE_CLICK</td><td><font color="#666">Trigger button is pressed and released.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldtriggerstatus_doubleclick_inline"></a>DOUBLE_CLICK</td><td><font color="#666">Trigger button is pressed twice quickly.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldtriggerstatus_tripleclick_inline"></a>TRIPLE_CLICK</td><td><font color="#666">Trigger button is pressed three times quickly.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldtriggerstatus_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Trigger button status is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldjoystickverticaldirection"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldjoystickverticaldirection_inline">StickVerticalDirection</a></div></div><div class="inline-doc" id="djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldjoystickverticaldirection_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>StickVerticalDirection</h6></div>

~~~java
@EXClassNullAway
 enum StickVerticalDirection 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.handheld</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIHandheldControllerKey.html#handheldcontrollerkey_stick_vertical_direction_key">HandheldControllerKey.STICK_VERTICAL_DIRECTION</a></td></tr></table></html>



##### Description:



<font color="#666">Status of the handheld joystick in vertical direction.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldjoystickverticaldirection_middle_inline"></a>CENTER</td><td><font color="#666">Joystick has no movement in the vertical direction.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldjoystickverticaldirection_up_inline"></a>UP</td><td><font color="#666">Joystick is moved up in the vertical direction.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldjoystickverticaldirection_down_inline"></a>DOWN</td><td><font color="#666">Joystick is moved down in the vertical direction.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldjoystickverticaldirection_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Joystick status in the vertical direction is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldjoystickhorizontaldirection"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldjoystickhorizontaldirection_inline">StickHorizontalDirection</a></div></div><div class="inline-doc" id="djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldjoystickhorizontaldirection_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>StickHorizontalDirection</h6></div>

~~~java
@EXClassNullAway
 enum StickHorizontalDirection 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.handheld</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIHandheldControllerKey.html#handheldcontrollerkey_stick_horizontal_direction_key">HandheldControllerKey.STICK_HORIZONTAL_DIRECTION</a></td></tr></table></html>



##### Description:



<font color="#666">Status of the handheld joystick in horizontal direction.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldjoystickhorizontaldirection_middle_inline"></a>CENTER</td><td><font color="#666">Joystick has no movement in the horizontal direction.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldjoystickhorizontaldirection_left_inline"></a>LEFT</td><td><font color="#666">Joystick is moved left in the horizontal direction.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldjoystickhorizontaldirection_right_inline"></a>RIGHT</td><td><font color="#666">Joystick is moved right in the horizontal direction.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldjoystickhorizontaldirection_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Joystick status in the horizontal direction is unknown.</td></tr></table></html>

##### Class Members:

</div>


