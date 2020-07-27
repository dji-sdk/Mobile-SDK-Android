<div class="article"><h1 ><font color="#AAA">class </font>HandheldControllerKey</h1></div>

~~~java
 class HandheldControllerKey extends DJIKey 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/KeyManager/DJIKey.html#djikey">DJIKey</a></code></td></tr></table></html>



##### Description:



<font color="#666"><code><a href="/Components/KeyManager/DJIHandheldControllerKey.html#djihandheldcontrollerkey">HandheldControllerKey</a></code> provides dedicated access to all handheld  controller attributes.



##### Class Members:

<div class="api-row" id="djihandheldcontrollerkey_create"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djihandheldcontrollerkey_create_inline">create</a></div></div><div class="inline-doc" id="djihandheldcontrollerkey_create_inline"

><div class="article"><h6 ><font color="#AAA">method </font>create</h6></div>

~~~java
 static HandheldControllerKey create(@HandheldControllerParamKey @NonNull String paramKey) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Creates a HandheldController key.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@HandheldControllerParamKey @NonNull String <font color="#000">paramKey</td><td><font color="#666"><i>A valid paramKey.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/KeyManager/DJIHandheldControllerKey.html#djihandheldcontrollerkey">HandheldControllerKey</a></td><td><font color="#666"><i>Handheld Controller Key</i></td></tr></table></html></div>



##### Inherited Methods:



##### Class Keys:

<html><table class="key_table"><tr><td colspan=2><a href="#handheldcontrollerkey_is_mode_button_being_pressed_key"></a><p class="key_table_key_string key_table_key_first_row">IS_MODE_BUTTON_BEING_PRESSED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#handheldcontrollerkey_mode_button_key"></a><p class="key_table_key_string key_table_key_row">MODE_BUTTON</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldtriggerstatus">HandheldButtonClickEvent</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldtriggerstatus">HandheldButtonClickEvent</a></code>

</p></td></tr><tr><td colspan=2><a href="#handheldcontrollerkey_stick_horizontal_direction_key"></a><p class="key_table_key_string key_table_key_row">STICK_HORIZONTAL_DIRECTION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldjoystickhorizontaldirection">StickHorizontalDirection</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_joystickhorizontaldirection">getStickHorizontalDirection</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldjoystickhorizontaldirection">StickHorizontalDirection</a></code>

</p></td></tr><tr><td colspan=2><a href="#handheldcontrollerkey_component_key_key"></a><p class="key_table_key_string key_table_key_row">COMPONENT_KEY</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#handheldcontrollerkey_power_mode_key"></a><p class="key_table_key_string key_table_key_row">POWER_MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/HandheldController/DJIHandheldController.html#djihandheldcontroller_djihandheldpowermode">PowerMode</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/HandheldController/DJIHandheldController.html#djihandheldcontroller_setdjihandheldpowermodelistener">setPowerModeCallback</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/HandheldController/DJIHandheldController.html#djihandheldcontroller_sethandheldpowermode">setPowerMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldPowerModeListenerInterface.html#djihandheldcontroller_updatepowermode">onUpdate</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/HandheldController/DJIHandheldController.html#djihandheldcontroller_djihandheldpowermode">PowerMode</a></code>

</p></td></tr><tr><td colspan=2><a href="#handheldcontrollerkey_handheld_name_key"></a><p class="key_table_key_string key_table_key_row">HANDHELD_NAME</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>String</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#handheldcontrollerkey_is_trigger_being_pressed_key"></a><p class="key_table_key_string key_table_key_row">IS_TRIGGER_BEING_PRESSED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_istriggerbeingpressed">isTriggerBeingPressed</a></code>

</p></td></tr><tr><td colspan=2><a href="#handheldcontrollerkey_trigger_button_key"></a><p class="key_table_key_string key_table_key_row">TRIGGER_BUTTON</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldtriggerstatus">HandheldButtonClickEvent</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_triggerstate">getTriggerButton</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldtriggerstatus">HandheldButtonClickEvent</a></code>

</p></td></tr><tr><td colspan=2><a href="#handheldcontrollerkey_led_command_key"></a><p class="key_table_key_string key_table_key_row">LED_COMMAND</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/HandheldController/DJIHandheldController.html#djihandheldcontroller_controlledwithcommand">controlLEDWithCommand</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerLEDCommand.html#djihandheldcontroller_djihandheldcontrollerledcommand">LEDCommand</a></code>

</p></td></tr><tr><td colspan=2><a href="#handheldcontrollerkey_stick_key"></a><p class="key_table_key_string key_table_key_row">STICK</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandhelpcontrollerhardwarestate_stickposition">getStick</a></code>

</p></td></tr><tr><td colspan=2><a href="#handheldcontrollerkey_stick_gimbal_control_enabled_key"></a><p class="key_table_key_string key_table_key_row">STICK_GIMBAL_CONTROL_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/HandheldController/DJIHandheldController.html#djihandheldcontroller_setstickgimbalcontrolenabled">setStickGimbalControlEnabled</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/HandheldController/DJIHandheldController.html#djihandheldcontroller_getstickgimbalcontrolenabled">getStickGimbalControlEnabled</a></code>

</p></td></tr><tr><td colspan=2><a href="#handheldcontrollerkey_stick_vertical_direction_key"></a><p class="key_table_key_string key_table_key_row">STICK_VERTICAL_DIRECTION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldjoystickverticaldirection">StickVerticalDirection</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_joystickverticaldirection">getStickVerticalDirection</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldjoystickverticaldirection">StickVerticalDirection</a></code>

</p></td></tr><tr><td colspan=2><a href="#handheldcontrollerkey_full_serial_number_hash_key"></a><p class="key_table_key_string key_table_key_row">FULL_SERIAL_NUMBER_HASH</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>String</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#handheldcontrollerkey_record_and_shutter_buttons_key"></a><p class="key_table_key_string key_table_key_row">RECORD_AND_SHUTTER_BUTTONS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldbuttonstatus">RecordAndShutterButtons</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_handheldbuttonstatus">getRecordAndShutterButtons</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/HandheldController/DJIHandheldController_DJIHandheldControllerHardwareState.html#djihandheldcontroller_djihandheldcontrollerhardwarestate_djihandheldbuttonstatus">RecordAndShutterButtons</a></code>

</p></td></tr><tr><td colspan=2><a href="#handheldcontrollerkey_serial_number_key"></a><p class="key_table_key_string key_table_key_row">SERIAL_NUMBER</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>String</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr></table></html>
