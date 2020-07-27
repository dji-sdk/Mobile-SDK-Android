<div class="article"><h1 ><font color="#AAA">class </font>FocusState</h1></div>

~~~java
@EXClassNullAway
 class FocusState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">This class contains information about the lens' current state, including lens type, focus status, focus mode, focus assistant state, and Auto Focus (AF) switch state.



##### Class Members:

<div class="api-row" id="djicamera_cameraupdatedlensstatecallbackinterface"><div class="api-col left">Callback</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_CameraUpdatedLensStateCallbackInterface.html">Callback</a></div></div><div class="api-row" id="djicamera_djicameralensstate_islensinstalled"><div class="api-col left">Lens</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameralensstate_islensinstalled_inline">isLensMounted</a></div></div><div class="inline-doc" id="djicamera_djicameralensstate_islensinstalled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isLensMounted</h6></div>

~~~java
 boolean isLensMounted() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_lens_is_installed_key">CameraKey.LENS_IS_INSTALLED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if lens is installed on the camera.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameralensstate_focusstatus"><div class="api-col left">Focus Status</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameralensstate_focusstatus_inline">getFocusStatus</a></div></div><div class="inline-doc" id="djicamera_djicameralensstate_focusstatus_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFocusStatus</h6></div>

~~~java
 FocusStatus getFocusStatus() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_focus_status_key">CameraKey.FOCUS_STATUS</a></td></tr></table></html>



##### Description:



<font color="#666">The current focus status of the lens. If the lens is not installed, the value is undefined.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameralensfocusstatus">FocusStatus</a></td><td><font color="#666"><i>A <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameralensfocusstatus">FocusStatus</a></code> enum value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameralensstate_isafswitchon"><div class="api-col left">MF/AF Focus Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameralensstate_isafswitchon_inline">isAFSwitchOn</a></div></div><div class="inline-doc" id="djicamera_djicameralensstate_isafswitchon_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isAFSwitchOn</h6></div>

~~~java
 boolean isAFSwitchOn() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_lens_is_af_switch_on_key">CameraKey.LENS_IS_AF_SWITCH_ON</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the lens Auto Focus (AF) switch is on. If the lens is not installed, the value is undefined. If <code>true</code>, <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setlensfocusmode">setFocusMode</a></code> can be used to control the focal point.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameralensstate_focusmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameralensstate_focusmode_inline">getFocusMode</a></div></div><div class="inline-doc" id="djicamera_djicameralensstate_focusmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFocusMode</h6></div>

~~~java
 FocusMode getFocusMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_focus_mode_key">CameraKey.FOCUS_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">The current focus mode. If the lens is not installed, the value is undefined.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameralensfocusmode">FocusMode</a></td><td><font color="#666"><i>A <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameralensfocusmode">FocusMode</a></code> enum value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameralensstate_isfocusassistantenabledformf"><div class="api-col left">Focus Assistant</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameralensstate_isfocusassistantenabledformf_inline">isFocusAssistantEnabledForMF</a></div></div><div class="inline-doc" id="djicamera_djicameralensstate_isfocusassistantenabledformf_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isFocusAssistantEnabledForMF</h6></div>

~~~java
 boolean isFocusAssistantEnabledForMF() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_focus_assistant_settings_key">CameraKey.FOCUS_ASSISTANT_SETTINGS</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the focus assistant is enabled for Manual focus mode. If the lens is not installed, the value is undefined.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameralensstate_isfocusassistantenabledforaf"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameralensstate_isfocusassistantenabledforaf_inline">isFocusAssistantEnabledForAF</a></div></div><div class="inline-doc" id="djicamera_djicameralensstate_isfocusassistantenabledforaf_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isFocusAssistantEnabledForAF</h6></div>

~~~java
 boolean isFocusAssistantEnabledForAF() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_focus_assistant_settings_key">CameraKey.FOCUS_ASSISTANT_SETTINGS</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the focus assistant is enabled for Auto focus mode. If the lens is not installed, the value is undefined.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameralensstate_isfocusassistantworking"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameralensstate_isfocusassistantworking_inline">isFocusAssistantWorking</a></div></div><div class="inline-doc" id="djicamera_djicameralensstate_isfocusassistantworking_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isFocusAssistantWorking</h6></div>

~~~java
 boolean isFocusAssistantWorking() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_lens_is_focus_assistant_working_key">CameraKey.LENS_IS_FOCUS_ASSISTANT_WORKING</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the focus target is zooming out. If the lens is not installed, the value is undefined.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameralensstate_sensorcleaningstate"><div class="api-col left">Sensor Cleaning State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameralensstate_sensorcleaningstate_inline">getSensorCleaningState</a></div></div><div class="inline-doc" id="djicamera_djicameralensstate_sensorcleaningstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSensorCleaningState</h6></div>

~~~java
 SensorCleaningState getSensorCleaningState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Get the sensor cleaning state.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasensorcleaningstate">SensorCleaningState</a></td><td><font color="#666"><i>A <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasensorcleaningstate">SensorCleaningState</a></code> enum value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameralensstate_targetfocallength"><div class="api-col left">Target Focal Length</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameralensstate_targetfocallength_inline">getTargetFocalLength</a></div></div><div class="inline-doc" id="djicamera_djicameralensstate_targetfocallength_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTargetFocalLength</h6></div>

~~~java
 int getTargetFocalLength() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The focal length that user wants to set. Supported by Zenmuse H20T & Zenmuse H20. The unit is millimeter.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>A "targetFocusLength" int value.</i></td></tr></table></html></div>


