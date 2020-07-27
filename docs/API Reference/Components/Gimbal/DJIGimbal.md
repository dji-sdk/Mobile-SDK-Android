<div class="article"><h1 ><font color="#AAA">class </font>Gimbal</h1></div>

~~~java
 class Gimbal extends BaseComponent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/BaseComponent/DJIBaseComponent.html#djibasecomponent">BaseComponent</a></code></td></tr></table></html>



##### Description:



<font color="#666">This class provides multiple methods to control the gimbal. These include setting the gimbal work mode, rotating the gimbal with angle, starting the gimbal auto calibration, etc. This object is available from the <code><a href="/Products/Aircraft/DJIAircraft.html#djiaircraft">Aircraft</a></code> or <code><a href="/Products/Handheld/DJIHandheld.html#djihandheld">HandHeld</a></code> object which is a subclass of <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct">BaseProduct</a></code>.



##### Class Members:



#### State Updates

<div class="api-row" id="djigimbal_setgimbalstateupdatecallback"><div class="api-col left">General</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_setgimbalstateupdatecallback_inline">setStateCallback</a></div></div><div class="inline-doc" id="djigimbal_setgimbalstateupdatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setStateCallback</h6></div>

~~~java
 void setStateCallback(@Nullable GimbalState.Callback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Sets up the gimbal state update callback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Gimbal/DJIGimbal_GimbalState.html#djigimbal_gimbalstate">GimbalState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>The execution callback.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_setgimbaladvancedsettingsstateupdatecallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_setgimbaladvancedsettingsstateupdatecallback_inline">setMovementSettingsCallback</a></div></div><div class="inline-doc" id="djigimbal_setgimbaladvancedsettingsstateupdatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMovementSettingsCallback</h6></div>

~~~java
 void setMovementSettingsCallback(@Nullable MovementSettings.Callback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Sets up the gimbal advanced setting state update callback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Gimbal/DJIGimbal_movementSettingsState.html#djigimbal_movementsettingsstate">MovementSettings</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>The execution callback.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_setgimbalbatteryremainingenergyupdatecallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_setgimbalbatteryremainingenergyupdatecallback_inline">setBatteryChargeRemainingCallback</a></div></div><div class="inline-doc" id="djigimbal_setgimbalbatteryremainingenergyupdatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setBatteryChargeRemainingCallback</h6></div>

~~~java
 void setBatteryChargeRemainingCallback(@Nullable BatteryChargeRemainingCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Sets the gimbal remaining energy callback. The unit is percentage.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Gimbal/DJIGimbal_batteryRemainingEnergyUpdateCallbackInterface.html#djigimbal_batteryremainingenergyupdatecallbackinterface">BatteryChargeRemainingCallback</a> <font color="#000">callback</td><td><font color="#666"><i>The execution callback.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Information

<div class="api-row" id="djigimbal_gimbalcapabilities"><div class="api-col left">Gimbal Capability</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_gimbalcapabilities_inline">getCapabilities</a></div></div><div class="inline-doc" id="djigimbal_gimbalcapabilities_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCapabilities</h6></div>

~~~java
 Map<CapabilityKey, DJIParamCapability> getCapabilities() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_capabilities_key">GimbalKey.CAPABILITIES</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the gimbal's features and possible range of settings. Each key is a possible gimbal feature and is in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilitykey">CapabilityKey</a></code> enum. The value for each key is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability.html#djiparamcapability">DJIParamCapability</a></code> or its sub-classes. The <code><a href="/Components/ParamCapability/DJIParamCapability.html#djiparamcapability_issupported">isSupported</a></code> property can be used to query if a feature is supported by the gimbal and the <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax_min">getMin</a></code> and <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax_max">getMax</a></code> properties of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> can be used to query the valid range for the setting. When a feature is not supported, the values for <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax_min">getMin</a></code> and <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax_max">getMax</a></code> are undefined.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Map&lt;CapabilityKey, <a href="/Components/ParamCapability/DJIParamCapability.html#djiparamcapability">DJIParamCapability</a>&gt;</td><td><font color="#666"><i>A Map&lt;CapabilityKey, DJIParamCapability&gt; instance.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Operation Mode

<div class="api-row" id="djigimbal_setgimbalworkmode"><div class="api-col left">Set Work Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_setgimbalworkmode_inline">setMode</a></div></div><div class="inline-doc" id="djigimbal_setgimbalworkmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMode</h6></div>

~~~java
 void setMode(@NonNull final GimbalMode mode, @Nullable final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_mode_key">GimbalKey.MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the gimbal's work mode.  Not supported by Mavic Mini.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final GimbalMode <font color="#000">mode</td><td><font color="#666"><i>Gimbal work mode to be set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_resetgimbal"><div class="api-col left">Reset Gimbal</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_resetgimbal_inline">reset</a></div></div><div class="inline-doc" id="djigimbal_resetgimbal_inline"

><div class="article"><h6 ><font color="#AAA">method </font>reset</h6></div>

~~~java
@Deprecated
 void reset(@Nullable final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_reset_gimbal_key">GimbalKey.RESET_GIMBAL</a></td></tr></table></html>



##### Description:



<font color="#666">Resets the gimbal. The behaviors are product-dependent. Osmo series (e.g. Osmo, Osmo Pro): The gimbal's pitch and yaw will be set to the origin, which is the standard position for the gimbal. Phantom series (e.g. Phantom 3 Professional, Phantom 4 series): The first call sets gimbal to point down vertically to the earth. The second call sets gimbal to the standard position. Other products (e.g. Inspire 1): Only the gimbal's pitch will the set to the origin.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_resetgimbalwithaxisandresetdirection"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_resetgimbalwithaxisandresetdirection_inline">reset</a></div></div><div class="inline-doc" id="djigimbal_resetgimbalwithaxisandresetdirection_inline"

><div class="article"><h6 ><font color="#AAA">method </font>reset</h6></div>

~~~java
 void reset(Axis axis, ResetDirection resetDirection, @Nullable final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Resets the gimbal. The behaviors are dependent on the selected axis and reset direction. <br> Supported by: <br> Zenmuse H20 and Zenmuse  H20T (firmware version v01.00.06.98 and above) <br> DJI X-port (firmware version v02.00.07.60 and above) <br> Zenmuse Z30 (firmware  version v01.01.03.00 and above) <br> Zenmuse X5S (firmware version v01.01.03.00 and above) <br> Zenmuse X7 (firmware version v00.02.05.68  and above) <br> Zenmuse XT2 (firmware version v00.02.06.46 and above) <br> Zenmuse XTS (firmware version v00.02.32.82 and above)



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>The axis to reset.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_resetdirection">ResetDirection</a> <font color="#000">resetDirection</td><td><font color="#666"><i>The direction on axis to reset.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Moving the Gimbal

<div class="api-row" id="djigimbal_rotategimbalwithrotation"><div class="api-col left">Rotate Gimbal</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_rotategimbalwithrotation_inline">rotate</a></div></div><div class="inline-doc" id="djigimbal_rotategimbalwithrotation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>rotate</h6></div>

~~~java
 void rotate(@NonNull final Rotation rotation, @Nullable final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_rotate_key">GimbalKey.ROTATE</a></td></tr></table></html>



##### Description:



<font color="#666">Rotate gimbal's pitch, roll, and yaw with <code>DJIGimbalRotation</code>. For X5S, X4S and X7, rotating the gimbal with mode <code><a href="/Components/Gimbal/DJIGimbal_DJIGimbalRotation.html#djigimbal_djigimbalrotation_djigimbalrotationmode_relativeangle">RELATIVE_ANGLE</a></code> or <code><a href="/Components/Gimbal/DJIGimbal_DJIGimbalRotation.html#djigimbal_djigimbalrotation_djigimbalrotationmode_absoluteangle">ABSOLUTE_ANGLE</a></code>, will reset the gimbal mode to <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_workmode_freemode">FREE</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Components/Gimbal/DJIGimbal_DJIGimbalRotation.html#djigimbal_djigimbalrotation">Rotation</a> <font color="#000">rotation</td><td><font color="#666"><i>An instance of <code><a href="/Components/Gimbal/DJIGimbal_DJIGimbalRotation.html#djigimbal_djigimbalrotation">Rotation</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The callback of <code><a href="/Utils/DJICommonCallbacks_CompletionCallback_Interface.html#djicommoncallbacks_completioncallback_interface">CompletionCallback<T</a></code>.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Calibration

<div class="api-row" id="djigimbal_startgimbalautocalibration"><div class="api-col left">Calibrate</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_startgimbalautocalibration_inline">startCalibration</a></div></div><div class="inline-doc" id="djigimbal_startgimbalautocalibration_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startCalibration</h6></div>

~~~java
 void startCalibration(@Nullable final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_start_calibration_key">GimbalKey.START_CALIBRATION</a></td></tr></table></html>



##### Description:



<font color="#666">Starts calibrating the gimbal. The product should be stationary (not flying, or being held) and horizontal during calibration. For gimbal's with adjustable payloads, the payload should be present and balanced before doing a calibration. For Osmo Mobile series, user should double-click the trigger (or mode button on Osmo Mobile 2) or restart the device to re-center the gimbal after the calibration.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_finetunegimbalrollindegrees"><div class="api-col left">Fine Tune Roll</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_finetunegimbalrollindegrees_inline">fineTuneRollInDegrees</a></div></div><div class="inline-doc" id="djigimbal_finetunegimbalrollindegrees_inline"

><div class="article"><h6 ><font color="#AAA">method </font>fineTuneRollInDegrees</h6></div>

~~~java
 void fineTuneRollInDegrees(@FloatRange(from = -2.0f, to = 2.0f) float offset,
                                               @Nullable final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_fine_tune_roll_in_degrees_key">GimbalKey.FINE_TUNE_ROLL_IN_DEGREES</a></td></tr></table></html>



##### Description:



<font color="#666">The gimbal roll can be fine tuned with a custom offset. The range for the custom offset is [-2.0, 2.0] degrees. If the offset is negative, the gimbal will be fine tuned the specified number of degrees in the counterclockwise direction.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@FloatRange(from = -2.0f, to = 2.0f) float <font color="#000">offset</td><td><font color="#666"><i>Fine-tuned offset, in degrees, to be tuned.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_finetunegimbalpitchindegrees"><div class="api-col left">Fine Tune Pitch</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_finetunegimbalpitchindegrees_inline">fineTunePitchInDegrees</a></div></div><div class="inline-doc" id="djigimbal_finetunegimbalpitchindegrees_inline"

><div class="article"><h6 ><font color="#AAA">method </font>fineTunePitchInDegrees</h6></div>

~~~java
 void fineTunePitchInDegrees(@FloatRange(from = -2.0f, to = 2.0f) float offset,
                                                @Nullable final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">The gimbal pitch can be fine tuned with a custom offset. The range for the custom offset is [-2.0, 2.0] degrees. If the offset is negative, the gimbal will be fine tuned the specified number of degrees in the counterclockwise direction. It is only supported by Spark and Mavic 2 Series.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@FloatRange(from = -2.0f, to = 2.0f) float <font color="#000">offset</td><td><font color="#666"><i>Fine-tuned offset, in degrees, to be tuned.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_finetuneyawindegrees"><div class="api-col left">Fine Tune Yaw</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_finetuneyawindegrees_inline">fineTuneYawInDegrees</a></div></div><div class="inline-doc" id="djigimbal_finetuneyawindegrees_inline"

><div class="article"><h6 ><font color="#AAA">method </font>fineTuneYawInDegrees</h6></div>

~~~java
 void fineTuneYawInDegrees(@FloatRange(from = -2.0f, to = 2.0f) float offset,
                                              @Nullable final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">The gimbal yaw can be fine tuned with a custom offset. The range for the custom offset is [-2.0, 2.0] degrees. If the offset is negative, the gimbal will be fine tuned the specified number of degrees in the counterclockwise direction. It is only supported by Mavic Air and Mavic 2 Series.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@FloatRange(from = -2.0f, to = 2.0f) float <font color="#000">offset</td><td><font color="#666"><i>Fine-tuned offset, in degrees, to be tuned.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_startgimbalbalancetest"><div class="api-col left">Balance Test</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_startgimbalbalancetest_inline">startBalanceTest</a></div></div><div class="inline-doc" id="djigimbal_startgimbalbalancetest_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startBalanceTest</h6></div>

~~~java
 void startBalanceTest(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_start_balance_test_key">GimbalKey.START_BALANCE_TEST</a></td></tr></table></html>



##### Description:



<font color="#666">Starts testing the balance of the gimbal payload. For gimbals that allow payloads to be changed, a balance test should be performed to ensure the camera is mounted correctly. The product should be stationary (not flying, or being held) and horizontal during testing. See <code><a href="/Components/Gimbal/DJIGimbal_GimbalState.html#djigimbal_gimbalstate">GimbalState</a></code> for the test result.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s). The callback will execute when the balance test is successfully started.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Movement Setting

<div class="api-row" id="djigimbal_setmovementsettingsprofile"><div class="api-col left">Gimbal Movement Setting</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_setmovementsettingsprofile_inline">setMovementSettingsProfile</a></div></div><div class="inline-doc" id="djigimbal_setmovementsettingsprofile_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMovementSettingsProfile</h6></div>

~~~java
 void setMovementSettingsProfile(@NonNull MovementSettingsProfile profile,
                                                    @Nullable final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_movement_settings_profile_key">GimbalKey.MOVEMENT_SETTINGS_PROFILE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the movement settings profile. The movement settings profile has options for both preset and custom profiles for SmoothTrack and Controller settings. Settings for SmoothTrack and Controller can only be set manually when using a custom profile.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_movementsettingsprofile">MovementSettingsProfile</a> <font color="#000">profile</td><td><font color="#666"><i>Profile to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_getmovementsettingsprofile"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_getmovementsettingsprofile_inline">getMovementSettingsProfile</a></div></div><div class="inline-doc" id="djigimbal_getmovementsettingsprofile_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMovementSettingsProfile</h6></div>

~~~java
 void getMovementSettingsProfile(
            @NonNull final CompletionCallbackWith<MovementSettingsProfile> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_movement_settings_profile_key">GimbalKey.MOVEMENT_SETTINGS_PROFILE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the advanced settings profile. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_movementsettingsprofile">MovementSettingsProfile</a></code> to check if it is supported by the gimbal.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Gimbal/DJIGimbal.html#djigimbal_movementsettingsprofile">MovementSettingsProfile</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>callback that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_loadfactorysettings"><div class="api-col left">Load Factory Settings</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_loadfactorysettings_inline">restoreFactorySettings</a></div></div><div class="inline-doc" id="djigimbal_loadfactorysettings_inline"

><div class="article"><h6 ><font color="#AAA">method </font>restoreFactorySettings</h6></div>

~~~java
 void restoreFactorySettings(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_restore_factory_settings_key">GimbalKey.RESTORE_FACTORY_SETTINGS</a></td></tr></table></html>



##### Description:



<font color="#666">Restores the gimbal's settings to factory settings.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The completion callback that receives execution result.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Range Extension

<div class="api-row" id="djigimbal_setpitchrangeextensionenabled"><div class="api-col left">Enable Pitch Range Extension</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_setpitchrangeextensionenabled_inline">setPitchRangeExtensionEnabled</a></div></div><div class="inline-doc" id="djigimbal_setpitchrangeextensionenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPitchRangeExtensionEnabled</h6></div>

~~~java
 void setPitchRangeExtensionEnabled(boolean isEnabled,
                                                       @Nullable final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_range_extension_enabled_key">GimbalKey.PITCH_RANGE_EXTENSION_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Extends the pitch range of gimbal. If extended, the gimbal's pitch control range can be [-90, 30], otherwise, it's [-90, 0]. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parampitchrangeextensionenabled">PITCH_RANGE_EXTENSION</a></code> to check if it is supported by the gimbal.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isEnabled</td><td><font color="#666"><i>Whether the pitch range should be extended.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The completion callback that receives execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_getpitchrangeextensionenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_getpitchrangeextensionenabled_inline">getPitchRangeExtensionEnabled</a></div></div><div class="inline-doc" id="djigimbal_getpitchrangeextensionenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPitchRangeExtensionEnabled</h6></div>

~~~java
 void getPitchRangeExtensionEnabled(@NonNull final CompletionCallbackWith<Boolean> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_range_extension_enabled_key">GimbalKey.PITCH_RANGE_EXTENSION_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Get the extend gimbal pitch range state. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parampitchrangeextensionenabled">PITCH_RANGE_EXTENSION</a></code> to check if it is supported by the gimbal.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The completion callback that receives execution result.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Motor Control Configuration

<div class="api-row" id="djigimbal_configuremotorcontrolwithpreset"><div class="api-col left">Configure</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_configuremotorcontrolwithpreset_inline">applyMotorControlPreset</a></div></div><div class="inline-doc" id="djigimbal_configuremotorcontrolwithpreset_inline"

><div class="article"><h6 ><font color="#AAA">method </font>applyMotorControlPreset</h6></div>

~~~java
 void applyMotorControlPreset(@NonNull MotorControlPreset preset,
                                        @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_apply_motor_control_preset_key">GimbalKey.APPLY_MOTOR_CONTROL_PRESET</a></td></tr></table></html>



##### Description:



<font color="#666">Configures gimbal's motor control with a preset configuration applicable for most popular cameras. In order to the optimize the performance, motor control tuning is still required.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_motorcontrolpreset">MotorControlPreset</a> <font color="#000">preset</td><td><font color="#666"><i>The preset configuration to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The completion callback that receives execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_setmotorcontrolstiffnessonaxis"><div class="api-col left">Stiffness</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_setmotorcontrolstiffnessonaxis_inline">setMotorControlStiffness</a></div></div><div class="inline-doc" id="djigimbal_setmotorcontrolstiffnessonaxis_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMotorControlStiffness</h6></div>

~~~java
 void setMotorControlStiffness(@NonNull Axis axis,
                                         @IntRange(from = 0, to = 100) int stiffness,
                                         @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_motor_control_stiffness_key">GimbalKey.PITCH_MOTOR_CONTROL_STIFFNESS</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_roll_motor_control_stiffness_key">GimbalKey.ROLL_MOTOR_CONTROL_STIFFNESS</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_motor_control_stiffness_key">GimbalKey.YAW_MOTOR_CONTROL_STIFFNESS</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the coefficient of speed error control. It can be seen as the coefficient for the proportional term in the PID controller. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parammotorcontrolstiffnesspitch">PITCH_MOTOR_CONTROL_STIFFNESS</a></code>, <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parammotorcontrolstiffnessyaw">YAW_MOTOR_CONTROL_STIFFNESS</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parammotorcontrolstiffnessroll">ROLL_MOTOR_CONTROL_STIFFNESS</a></code> with <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> to check if the gimbal supports this feature and the range of possible values (unitless).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>The axis that the setting is applied to.</i></td></tr><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 100) int <font color="#000">stiffness</td><td><font color="#666"><i>The stiffness value to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The completion callback that receives execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_getmotorcontrolstiffnessonaxis"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_getmotorcontrolstiffnessonaxis_inline">getMotorControlStiffness</a></div></div><div class="inline-doc" id="djigimbal_getmotorcontrolstiffnessonaxis_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMotorControlStiffness</h6></div>

~~~java
 void getMotorControlStiffness(@NonNull final Axis axis,
                                         @NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_motor_control_stiffness_key">GimbalKey.PITCH_MOTOR_CONTROL_STIFFNESS</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_roll_motor_control_stiffness_key">GimbalKey.ROLL_MOTOR_CONTROL_STIFFNESS</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_motor_control_stiffness_key">GimbalKey.YAW_MOTOR_CONTROL_STIFFNESS</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the coefficient of speed error control. It can be seen as the coefficient for the proportional term in the PID controller. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parammotorcontrolstiffnesspitch">PITCH_MOTOR_CONTROL_STIFFNESS</a></code>, <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parammotorcontrolstiffnessyaw">YAW_MOTOR_CONTROL_STIFFNESS</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parammotorcontrolstiffnessroll">ROLL_MOTOR_CONTROL_STIFFNESS</a></code> with <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> to check if the gimbal supports this feature and the range of possible values (unitless).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>The axis to query.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The completion callback that receives execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_setmotorcontrolstrengthonaxis"><div class="api-col left">Strength</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_setmotorcontrolstrengthonaxis_inline">setMotorControlStrength</a></div></div><div class="inline-doc" id="djigimbal_setmotorcontrolstrengthonaxis_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMotorControlStrength</h6></div>

~~~java
 void setMotorControlStrength(@NonNull Axis axis,
                                        @IntRange(from = 0, to = 100) int strength,
                                        @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_motor_control_strength_key">GimbalKey.PITCH_MOTOR_CONTROL_STRENGTH</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_roll_motor_control_strength_key">GimbalKey.ROLL_MOTOR_CONTROL_STRENGTH</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_motor_control_strength_key">GimbalKey.YAW_MOTOR_CONTROL_STRENGTH</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the coefficient of attitude accuracy control. It can be seen as the coefficient for the integral term in the PID controller. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parammotorcontrolstrengthpitch">PITCH_MOTOR_CONTROL_STRENGTH</a></code>, <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parammotorcontrolstrengthyaw">YAW_MOTOR_CONTROL_STRENGTH</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parammotorcontrolstrengthroll">ROLL_MOTOR_CONTROL_STRENGTH</a></code> with <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> to check if the gimbal supports this feature and the range of possible values (unitless).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>The axis that the setting is applied to.</i></td></tr><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 100) int <font color="#000">strength</td><td><font color="#666"><i>The strength value to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The completion callback that receives execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_getmotorcontrolstrengthonaxis"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_getmotorcontrolstrengthonaxis_inline">getMotorControlStrength</a></div></div><div class="inline-doc" id="djigimbal_getmotorcontrolstrengthonaxis_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMotorControlStrength</h6></div>

~~~java
 void getMotorControlStrength(@NonNull final Axis axis,
                                        @NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_motor_control_strength_key">GimbalKey.PITCH_MOTOR_CONTROL_STRENGTH</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_roll_motor_control_strength_key">GimbalKey.ROLL_MOTOR_CONTROL_STRENGTH</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_motor_control_strength_key">GimbalKey.YAW_MOTOR_CONTROL_STRENGTH</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the coefficient of attitude accuracy control. It can be seen as the coefficient for the integral term in the PID controller. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parammotorcontrolstrengthpitch">PITCH_MOTOR_CONTROL_STRENGTH</a></code>, <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parammotorcontrolstrengthyaw">YAW_MOTOR_CONTROL_STRENGTH</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parammotorcontrolstrengthroll">ROLL_MOTOR_CONTROL_STRENGTH</a></code> with <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> to check if the gimbal supports this feature and the range of possible values (unitless).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>The axis to query.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The completion callback that receives execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_setmotorcontrolgyrofilteringonaxis"><div class="api-col left">Gyro Filtering</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_setmotorcontrolgyrofilteringonaxis_inline">setMotorControlGyroFilteringFactor</a></div></div><div class="inline-doc" id="djigimbal_setmotorcontrolgyrofilteringonaxis_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMotorControlGyroFilteringFactor</h6></div>

~~~java
 void setMotorControlGyroFilteringFactor(@NonNull Axis axis,
                                                   @IntRange(from = 0, to = 100) int filteringFactor,
                                                   @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_motor_control_gyro_filtering_factor_key">GimbalKey.PITCH_MOTOR_CONTROL_GYRO_FILTERING_FACTOR</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_roll_motor_control_gyro_filtering_factor_key">GimbalKey.ROLL_MOTOR_CONTROL_GYRO_FILTERING_FACTOR</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_motor_control_gyro_filtering_factor_key">GimbalKey.YAW_MOTOR_CONTROL_GYRO_FILTERING_FACTOR</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the coefficient of denoising the output. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parammotorcontrolgyrofilteringpitch">PITCH_MOTOR_CONTROL_GYRO_FILTERING_FACTOR</a></code>, <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parammotorcontrolgyrofilteringyaw">YAW_MOTOR_CONTROL_GYRO_FILTERING_FACTOR</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parammotorcontrolgyrofilteringroll">ROLL_MOTOR_CONTROL_GYRO_FILTERING_FACTOR</a></code> with <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> to check if the gimbal supports this feature and the range of possible values (unitless).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 100) int <font color="#000">filteringFactor</td><td><font color="#666"><i>The gyro filtering value to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>The axis that the setting is applied to.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Asynchronous execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_getmotorcontrolgyrofilteringonaxis"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_getmotorcontrolgyrofilteringonaxis_inline">getMotorControlGyroFilteringFactor</a></div></div><div class="inline-doc" id="djigimbal_getmotorcontrolgyrofilteringonaxis_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMotorControlGyroFilteringFactor</h6></div>

~~~java
 void getMotorControlGyroFilteringFactor(@NonNull final Axis axis,
                                                   @NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_motor_control_gyro_filtering_factor_key">GimbalKey.PITCH_MOTOR_CONTROL_GYRO_FILTERING_FACTOR</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_roll_motor_control_gyro_filtering_factor_key">GimbalKey.ROLL_MOTOR_CONTROL_GYRO_FILTERING_FACTOR</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_motor_control_gyro_filtering_factor_key">GimbalKey.YAW_MOTOR_CONTROL_GYRO_FILTERING_FACTOR</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the coefficient of denoising the output. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parammotorcontrolgyrofilteringpitch">PITCH_MOTOR_CONTROL_GYRO_FILTERING_FACTOR</a></code>, <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parammotorcontrolgyrofilteringyaw">YAW_MOTOR_CONTROL_GYRO_FILTERING_FACTOR</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parammotorcontrolgyrofilteringroll">ROLL_MOTOR_CONTROL_GYRO_FILTERING_FACTOR</a></code> with <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> to check if the gimbal supports this feature and the range of possible values (unitless).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>The axis to query.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The completion callback that receives execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_setmotorcontrolprecontrolonaxis"><div class="api-col left">Precontrol</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_setmotorcontrolprecontrolonaxis_inline">setMotorControlPreControl</a></div></div><div class="inline-doc" id="djigimbal_setmotorcontrolprecontrolonaxis_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMotorControlPreControl</h6></div>

~~~java
 void setMotorControlPreControl(@NonNull Axis axis,
                                          @IntRange(from = 0, to = 100) int preControl,
                                          @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_motor_control_pre_control_key">GimbalKey.PITCH_MOTOR_CONTROL_PRE_CONTROL</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_roll_motor_control_pre_control_key">GimbalKey.ROLL_MOTOR_CONTROL_PRE_CONTROL</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_motor_control_pre_control_key">GimbalKey.YAW_MOTOR_CONTROL_PRE_CONTROL</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the value for pre-adjust. It can be seen as the coefficient for the derivative term in the PID controller. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parammotorcontrolprecontrolpitch">PITCH_MOTOR_CONTROL_PRE_CONTROL</a></code>, <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parammotorcontrolprecontrolyaw">YAW_MOTOR_CONTROL_PRE_CONTROL</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parammotorcontrolprecontrolroll">ROLL_MOTOR_CONTROL_PRE_CONTROL</a></code> with <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> to check if the gimbal supports this feature and the range of possible values (unitless).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>The axis that the setting is applied to.</i></td></tr><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 100) int <font color="#000">preControl</td><td><font color="#666"><i>The Precontrol value to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Asynchronous execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_getmotorcontrolprecontrolonaxis"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_getmotorcontrolprecontrolonaxis_inline">getMotorControlPreControl</a></div></div><div class="inline-doc" id="djigimbal_getmotorcontrolprecontrolonaxis_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMotorControlPreControl</h6></div>

~~~java
 void getMotorControlPreControl(@NonNull final Axis axis,
                                          @NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_motor_control_pre_control_key">GimbalKey.PITCH_MOTOR_CONTROL_PRE_CONTROL</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_roll_motor_control_pre_control_key">GimbalKey.ROLL_MOTOR_CONTROL_PRE_CONTROL</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_motor_control_pre_control_key">GimbalKey.YAW_MOTOR_CONTROL_PRE_CONTROL</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the value for pre-adjust. It can be seen as the coefficient for the derivative term in the PID controller. Only supported by Ronin-MX. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parammotorcontrolprecontrolpitch">PITCH_MOTOR_CONTROL_PRE_CONTROL</a></code>, <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parammotorcontrolprecontrolyaw">YAW_MOTOR_CONTROL_PRE_CONTROL</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parammotorcontrolprecontrolroll">ROLL_MOTOR_CONTROL_PRE_CONTROL</a></code> with <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> to check if the gimbal supports this feature and the range of possible values (unitless).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>The axis to query.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The completion callback that receives execution result.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Controller Setting

<div class="api-row" id="djigimbal_setcontrollerdeadbandonaxis"><div class="api-col left">Deadband</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_setcontrollerdeadbandonaxis_inline">setControllerDeadband</a></div></div><div class="inline-doc" id="djigimbal_setcontrollerdeadbandonaxis_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setControllerDeadband</h6></div>

~~~java
 void setControllerDeadband(@NonNull Axis axis,
                                      @IntRange(from = 0, to = 90) int deadband,
                                      @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_controller_deadband_key">GimbalKey.PITCH_CONTROLLER_DEADBAND</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_controller_deadband_key">GimbalKey.YAW_CONTROLLER_DEADBAND</a></td></tr></table></html>



##### Description:



<font color="#666">Sets physical controller (e.g. the joystick on Osmo or the remote controller of the aircraft) deadband on an axis. A larger deadband requires more controller movement to start gimbal motion. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramcontrollerdeadbandyaw">YAW_CONTROLLER_DEADBAND</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramcontrollerdeadbandpitch">PITCH_CONTROLLER_DEADBAND</a></code> with <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> to check if the gimbal supports this feature and the range of possible values (unitless).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 90) int <font color="#000">deadband</td><td><font color="#666"><i>The deadband value to be set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>The axis that the setting will be applied to.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The completion callback that receives execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_getcontrollerdeadbandonaxis"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_getcontrollerdeadbandonaxis_inline">getControllerDeadband</a></div></div><div class="inline-doc" id="djigimbal_getcontrollerdeadbandonaxis_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getControllerDeadband</h6></div>

~~~java
 void getControllerDeadband(@NonNull final Axis direction,
                                      @NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_controller_deadband_key">GimbalKey.PITCH_CONTROLLER_DEADBAND</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_controller_deadband_key">GimbalKey.YAW_CONTROLLER_DEADBAND</a></td></tr></table></html>



##### Description:



<font color="#666">Gets physical controller deadband value on an axis. A larger deadband requires more controller movement to start gimbal motion. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramcontrollerdeadbandyaw">YAW_CONTROLLER_DEADBAND</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramcontrollerdeadbandpitch">PITCH_CONTROLLER_DEADBAND</a></code> with <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> to check if the gimbal supports this feature and the range of possible values (unitless).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">direction</td><td><font color="#666"><i>The axis to query.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The completion callback that receives execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_setcontrollerspeedonaxis"><div class="api-col left">Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_setcontrollerspeedonaxis_inline">setControllerSpeedCoefficient</a></div></div><div class="inline-doc" id="djigimbal_setcontrollerspeedonaxis_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setControllerSpeedCoefficient</h6></div>

~~~java
 void setControllerSpeedCoefficient(@NonNull Axis axis,
                                                       @IntRange(from = 0, to = 100) int speedCoefficient,
                                                       @Nullable final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_controller_speed_coefficient_key">GimbalKey.PITCH_CONTROLLER_SPEED_COEFFICIENT</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_controller_speed_coefficient_key">GimbalKey.YAW_CONTROLLER_SPEED_COEFFICIENT</a></td></tr></table></html>



##### Description:



<font color="#666">Sets physical controller (e.g. the joystick on Osmo or the remote controller of the aircraft) speed on an axis. Speed setting controls the mapping between the movement of the controller and the gimbal speed. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramcontrollerspeedyaw">YAW_CONTROLLER_SPEED_COEFFICIENT</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramcontrollerspeedpitch">PITCH_CONTROLLER_SPEED_COEFFICIENT</a></code> with <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> to check if the gimbal supports this feature and the range of possible values (unitless).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 100) int <font color="#000">speedCoefficient</td><td><font color="#666"><i>The speed value to be set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>The axis that the setting will be applied to.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Asynchronous execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_getcontrollerspeedonaxis"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_getcontrollerspeedonaxis_inline">getControllerSpeedCoefficient</a></div></div><div class="inline-doc" id="djigimbal_getcontrollerspeedonaxis_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getControllerSpeedCoefficient</h6></div>

~~~java
 void getControllerSpeedCoefficient(@NonNull Axis axis,
                                                       @NonNull final CompletionCallbackWith<Integer> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_controller_speed_coefficient_key">GimbalKey.PITCH_CONTROLLER_SPEED_COEFFICIENT</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_controller_speed_coefficient_key">GimbalKey.YAW_CONTROLLER_SPEED_COEFFICIENT</a></td></tr></table></html>



##### Description:



<font color="#666">Gets physical controller speed value on an axis. Speed setting controls the mapping between the movement of the controller and the gimbal speed. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramcontrollerspeedyaw">YAW_CONTROLLER_SPEED_COEFFICIENT</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramcontrollerspeedpitch">PITCH_CONTROLLER_SPEED_COEFFICIENT</a></code> with <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> to check if the gimbal supports this feature and the range of possible values (unitless).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>The axis to query.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The completion block that receives execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_setcontrollersmoothingonaxis"><div class="api-col left">Smoothing</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_setcontrollersmoothingonaxis_inline">setControllerSmoothingFactor</a></div></div><div class="inline-doc" id="djigimbal_setcontrollersmoothingonaxis_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setControllerSmoothingFactor</h6></div>

~~~java
 void setControllerSmoothingFactor(@NonNull Axis axis,
                                                      @IntRange(from = 0, to = 30) int smoothingFactor,
                                                      @Nullable final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_controller_smoothing_factor_key">GimbalKey.PITCH_CONTROLLER_SMOOTHING_FACTOR</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_controller_smoothing_factor_key">GimbalKey.YAW_CONTROLLER_SMOOTHING_FACTOR</a></td></tr></table></html>



##### Description:



<font color="#666">Sets physical controller (e.g. the joystick on Osmo or the remote controller of the aircraft) smoothing on an axis. Smoothing controls the deceleration of the gimbal. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramcontrollersmoothingyaw">YAW_CONTROLLER_SMOOTHING_FACTOR</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramcontrollersmoothingpitch">PITCH_CONTROLLER_SMOOTHING_FACTOR</a></code> with <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> to check if the gimbal supports this feature and the range of possible values (unitless).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 30) int <font color="#000">smoothingFactor</td><td><font color="#666"><i>The smoothing value to be set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>The axis that the setting will be applied to.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The completion block that receives execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_getcontrollersmoothingonaxis"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_getcontrollersmoothingonaxis_inline">getControllerSmoothingFactor</a></div></div><div class="inline-doc" id="djigimbal_getcontrollersmoothingonaxis_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getControllerSmoothingFactor</h6></div>

~~~java
 void getControllerSmoothingFactor(@NonNull Axis axis,
                                                      @NonNull final CompletionCallbackWith<Integer> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_controller_smoothing_factor_key">GimbalKey.PITCH_CONTROLLER_SMOOTHING_FACTOR</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_controller_smoothing_factor_key">GimbalKey.YAW_CONTROLLER_SMOOTHING_FACTOR</a></td></tr></table></html>



##### Description:



<font color="#666">Gets physical controller smoothing value on an axis. Smoothing controls the deceleration of the gimbal. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramcontrollersmoothingyaw">YAW_CONTROLLER_SMOOTHING_FACTOR</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramcontrollersmoothingpitch">PITCH_CONTROLLER_SMOOTHING_FACTOR</a></code> with <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> to check if the gimbal supports this feature and the range of possible values (unitless).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>The axis to query.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The completion block that receives execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_setmaxspeedonaxis"><div class="api-col left">Max Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_setmaxspeedonaxis_inline">setControllerMaxSpeed</a></div></div><div class="inline-doc" id="djigimbal_setmaxspeedonaxis_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setControllerMaxSpeed</h6></div>

~~~java
 void setControllerMaxSpeed(@NonNull Axis axis,
                                               @IntRange(from = 0, to = 100) int maxSpeed,
                                               @Nullable final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Sets physical controller max speed value on an axis. It controls the mapping between the movement of the controller and the gimbal speed. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parampitchcontrollermaxspeed">PITCH_CONTROLLER_MAX_SPEED</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramyawcontrollermaxspeed">YAW_CONTROLLER_MAX_SPEED</a></code> with "capabilities" to check if the gimbal supports this feature and the range of possible values (unitless).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>The axis that the setting will be applied to.</i></td></tr><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 100) int <font color="#000">maxSpeed</td><td><font color="#666"><i>The maximum speed to set for one axis.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The completion callback that receives execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_getmaxspeedonaxis"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_getmaxspeedonaxis_inline">getControllerMaxSpeed</a></div></div><div class="inline-doc" id="djigimbal_getmaxspeedonaxis_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getControllerMaxSpeed</h6></div>

~~~java
 void getControllerMaxSpeed(@NonNull Axis axis,
                                               @NonNull final CompletionCallbackWith<Integer> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Gets physical controller max speed value on an axis. It controls the mapping between the movement of the controller and the gimbal speed. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parampitchcontrollermaxspeed">PITCH_CONTROLLER_MAX_SPEED</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramyawcontrollermaxspeed">YAW_CONTROLLER_MAX_SPEED</a></code> with "capabilities" to check if the gimbal supports this feature and the range of possible values (unitless).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>The axis to query.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The completion callback that receives execution result.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Smooth Track Setting

<div class="api-row" id="djigimbal_setsmoothtrackenabledonaxis"><div class="api-col left">Enable</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_setsmoothtrackenabledonaxis_inline">setSmoothTrackEnabled</a></div></div><div class="inline-doc" id="djigimbal_setsmoothtrackenabledonaxis_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSmoothTrackEnabled</h6></div>

~~~java
 void setSmoothTrackEnabled(@NonNull Axis axis,
                                               boolean enabled,
                                               @Nullable final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_smooth_track_enabled_key">GimbalKey.PITCH_SMOOTH_TRACK_ENABLED</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_smooth_track_enabled_key">GimbalKey.YAW_SMOOTH_TRACK_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Enables SmoothTrack for the axis. Only supported by Osmo. Ronin-MX supports SmoothTrack but it is always enabled for both pitch axis and yaw axis. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramsmoothtrackenabledpitch">PITCH_SMOOTH_TRACK_ENABLED</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramsmoothtrackenabledyaw">YAW_SMOOTH_TRACK_ENABLED</a></code> with <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> to check if the gimbal supports this feature.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable SmoothTrack on the axis.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>The axis that the setting will be applied to.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The completion callback that receives execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_getsmoothtrackenabledonaxis"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_getsmoothtrackenabledonaxis_inline">getSmoothTrackEnabled</a></div></div><div class="inline-doc" id="djigimbal_getsmoothtrackenabledonaxis_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSmoothTrackEnabled</h6></div>

~~~java
 void getSmoothTrackEnabled(@NonNull Axis axis,
                                               @NonNull final CompletionCallbackWith<Boolean> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_smooth_track_enabled_key">GimbalKey.PITCH_SMOOTH_TRACK_ENABLED</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_smooth_track_enabled_key">GimbalKey.YAW_SMOOTH_TRACK_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Gets whether an axis has SmoothTrack enabled. Only supported by Osmo. Ronin-MX supports SmoothTrack but it is always enabled for both pitch axis and yaw axis. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramsmoothtrackenabledpitch">PITCH_SMOOTH_TRACK_ENABLED</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramsmoothtrackenabledyaw">YAW_SMOOTH_TRACK_ENABLED</a></code> with <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> to check if the gimbal supports this feature.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>The axis to query.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The completion callback that receives execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_setsmoothtrackspeedonaxis"><div class="api-col left">Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_setsmoothtrackspeedonaxis_inline">setSmoothTrackSpeed</a></div></div><div class="inline-doc" id="djigimbal_setsmoothtrackspeedonaxis_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSmoothTrackSpeed</h6></div>

~~~java
 void setSmoothTrackSpeed(@NonNull Axis axis,
                                             @IntRange(from = 0, to = 100) int speed,
                                             @Nullable final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_smooth_track_speed_key">GimbalKey.PITCH_SMOOTH_TRACK_SPEED</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_smooth_track_speed_key">GimbalKey.YAW_SMOOTH_TRACK_SPEED</a></td></tr></table></html>



##### Description:



<font color="#666">Sets gimbal SmoothTrack catch up speed on an axis. SmoothTrack speed determines how fast the gimbal will catch up with a large, translated handle movement. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramsmoothtrackspeedpitch">PITCH_SMOOTH_TRACK_SPEED</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramsmoothtrackspeedyaw">YAW_SMOOTH_TRACK_SPEED</a></code> with <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> to check if the gimbal supports this feature and the range of possible values (unitless).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>Gimbal axis.</i></td></tr><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 100) int <font color="#000">speed</td><td><font color="#666"><i>SmoothTrack speed.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_getsmoothtrackspeedonaxis"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_getsmoothtrackspeedonaxis_inline">getSmoothTrackSpeed</a></div></div><div class="inline-doc" id="djigimbal_getsmoothtrackspeedonaxis_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSmoothTrackSpeed</h6></div>

~~~java
 void getSmoothTrackSpeed(@NonNull Axis axis,
                                             @NonNull final CompletionCallbackWith<Integer> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_smooth_track_speed_key">GimbalKey.PITCH_SMOOTH_TRACK_SPEED</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_smooth_track_speed_key">GimbalKey.YAW_SMOOTH_TRACK_SPEED</a></td></tr></table></html>



##### Description:



<font color="#666">Gets gimbal SmoothTrack speed on an axis. SmoothTrack speed determines how fast the gimbal will catch up with a large, translated handle movement. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramsmoothtrackspeedpitch">PITCH_SMOOTH_TRACK_SPEED</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramsmoothtrackspeedyaw">YAW_SMOOTH_TRACK_SPEED</a></code> with <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> to check if the gimbal supports this feature and the range of possible values (unitless).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>Gimbal axis.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_setsmoothtrackdeadbandonaxis"><div class="api-col left">Deadband</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_setsmoothtrackdeadbandonaxis_inline">setSmoothTrackDeadband</a></div></div><div class="inline-doc" id="djigimbal_setsmoothtrackdeadbandonaxis_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSmoothTrackDeadband</h6></div>

~~~java
 void setSmoothTrackDeadband(@NonNull Axis axis,
                                                @IntRange(from = 0, to = 90) int deadband,
                                                @Nullable final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_smooth_track_deadband_key">GimbalKey.YAW_SMOOTH_TRACK_DEADBAND</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_smooth_track_deadband_key">GimbalKey.PITCH_SMOOTH_TRACK_DEADBAND</a></td></tr></table></html>



##### Description:



<font color="#666">Sets SmoothTrack deadband on an axis. A larger deadband requires more handle movement to translate into gimbal motion. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramsmoothtrackdeadbandpitch">PITCH_SMOOTH_TRACK_DEADBAND</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramsmoothtrackdeadbandyaw">YAW_SMOOTH_TRACK_DEADBAND</a></code> with <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> to check if the gimbal supports this feature and the range of possible values in degrees.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>Gimbal axis.</i></td></tr><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 90) int <font color="#000">deadband</td><td><font color="#666"><i>SmoothTrack deadband [0,90].</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_getsmoothtrackdeadbandonaxis"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_getsmoothtrackdeadbandonaxis_inline">getSmoothTrackDeadband</a></div></div><div class="inline-doc" id="djigimbal_getsmoothtrackdeadbandonaxis_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSmoothTrackDeadband</h6></div>

~~~java
 void getSmoothTrackDeadband(@NonNull Axis axis,
                                                @NonNull final CompletionCallbackWith<Integer> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_smooth_track_deadband_key">GimbalKey.YAW_SMOOTH_TRACK_DEADBAND</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_smooth_track_deadband_key">GimbalKey.PITCH_SMOOTH_TRACK_DEADBAND</a></td></tr></table></html>



##### Description:



<font color="#666">Gets SmoothTrack deadband on an axis. A larger deadband requires more handle movement to translate into gimbal motion. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramsmoothtrackdeadbandpitch">PITCH_SMOOTH_TRACK_DEADBAND</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramsmoothtrackdeadbandyaw">YAW_SMOOTH_TRACK_DEADBAND</a></code> with <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> to check if the gimbal supports this feature and the range of possible values in degrees.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>Gimbal axis.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_setsmoothtrackaccelerationonaxis"><div class="api-col left">Acceleration</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_setsmoothtrackaccelerationonaxis_inline">setSmoothTrackAcceleration</a></div></div><div class="inline-doc" id="djigimbal_setsmoothtrackaccelerationonaxis_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSmoothTrackAcceleration</h6></div>

~~~java
 void setSmoothTrackAcceleration(@NonNull Axis axis,
                                                    @IntRange(from = 0, to = 30) int acceleration,
                                                    @Nullable final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_smooth_track_acceleration_key">GimbalKey.YAW_SMOOTH_TRACK_ACCELERATION</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_smooth_track_acceleration_key">GimbalKey.PITCH_SMOOTH_TRACK_ACCELERATION</a></td></tr></table></html>



##### Description:



<font color="#666">Sets SmoothTrack acceleration on an axis. Acceleration determines how closely the camera will follow the translated yaw handle movement. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramsmoothtrackaccelerationpitch">PITCH_SMOOTH_TRACK_ACCELERATION</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramsmoothtrackaccelerationyaw">YAW_SMOOTH_TRACK_ACCELERATION</a></code> with <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> to check if the gimbal supports this feature and the range of possible values (unitless).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>Gimbal axis.</i></td></tr><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 30) int <font color="#000">acceleration</td><td><font color="#666"><i>SmoothTrack acceleration [0,30].</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_getsmoothtrackaccelerationonaxis"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_getsmoothtrackaccelerationonaxis_inline">getSmoothTrackAcceleration</a></div></div><div class="inline-doc" id="djigimbal_getsmoothtrackaccelerationonaxis_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSmoothTrackAcceleration</h6></div>

~~~java
 void getSmoothTrackAcceleration(@NonNull Axis axis,
                                                    @NonNull final CompletionCallbackWith<Integer> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_smooth_track_acceleration_key">GimbalKey.YAW_SMOOTH_TRACK_ACCELERATION</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_smooth_track_acceleration_key">GimbalKey.PITCH_SMOOTH_TRACK_ACCELERATION</a></td></tr></table></html>



##### Description:



<font color="#666">Gets SmoothTrack acceleration on an axis. Acceleration determines how closely the camera will follow the translated yaw handle movement. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramsmoothtrackaccelerationpitch">PITCH_SMOOTH_TRACK_ACCELERATION</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramsmoothtrackaccelerationyaw">YAW_SMOOTH_TRACK_ACCELERATION</a></code> with <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> to check if the gimbal supports this feature and the range of possible values (unitless).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>Gimbal axis.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Endpoint Setting

<div class="api-row" id="djigimbal_setendpointindirection"><div class="api-col left">Set Endpoint</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_setendpointindirection_inline">setEndpoint</a></div></div><div class="inline-doc" id="djigimbal_setendpointindirection_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setEndpoint</h6></div>

~~~java
 void setEndpoint(@NonNull EndpointDirection direction,
                            @IntRange(from = 0, to = 179) int endpoint,
                            @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_up_endpoint_key">GimbalKey.PITCH_UP_ENDPOINT</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_right_endpoint_key">GimbalKey.YAW_RIGHT_ENDPOINT</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_right_endpoint_key">GimbalKey.YAW_RIGHT_ENDPOINT</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_left_endpoint_key">GimbalKey.YAW_LEFT_ENDPOINT</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_down_endpoint_key">GimbalKey.PITCH_DOWN_ENDPOINT</a></td></tr></table></html>



##### Description:



<font color="#666">Endpoint settings determine the farthest points to which the gimbal will rotate during manual controller input. Only supported by Ronin-MX. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramendpointpitchup">PITCH_UP_ENDPOINT</a></code>, <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramendpointpitchdown">PITCH_DOWN_ENDPOINT</a></code>, <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramendpointyawleft">YAW_LEFT_ENDPOINT</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramendpointyawright">YAW_RIGHT_ENDPOINT</a></code> in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> to check if the gimbal supports this feature and what the valid range of endpoints are.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 179) int <font color="#000">endpoint</td><td><font color="#666"><i>The endpoint value to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_endpointdirection">EndpointDirection</a> <font color="#000">direction</td><td><font color="#666"><i>The direction that the setting will be applied to.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The completion callback that receives execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_getendpointindirection"><div class="api-col left">Get Endpoint</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_getendpointindirection_inline">getEndpoint</a></div></div><div class="inline-doc" id="djigimbal_getendpointindirection_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getEndpoint</h6></div>

~~~java
 void getEndpoint(@NonNull final EndpointDirection direction,
                            @NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_up_endpoint_key">GimbalKey.PITCH_UP_ENDPOINT</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_right_endpoint_key">GimbalKey.YAW_RIGHT_ENDPOINT</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_right_endpoint_key">GimbalKey.YAW_RIGHT_ENDPOINT</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_left_endpoint_key">GimbalKey.YAW_LEFT_ENDPOINT</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the farthest points to which the gimbal will rotate during manual controller input. Use <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramendpointpitchup">PITCH_UP_ENDPOINT</a></code>, <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramendpointpitchdown">PITCH_DOWN_ENDPOINT</a></code>, <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramendpointyawleft">YAW_LEFT_ENDPOINT</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_paramendpointyawright">YAW_RIGHT_ENDPOINT</a></code> with <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> to check if the gimbal supports this feature.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_endpointdirection">EndpointDirection</a> <font color="#000">direction</td><td><font color="#666"><i>The endpoint direction.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The completion callback that receives execution result.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Other Settings

<div class="api-row" id="djigimbal_setmotorenabled"><div class="api-col left">Enable Motor</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_setmotorenabled_inline">setMotorEnabled</a></div></div><div class="inline-doc" id="djigimbal_setmotorenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMotorEnabled</h6></div>

~~~java
 void setMotorEnabled(boolean enabled, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_motor_enabled_key">GimbalKey.MOTOR_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Turns on and off the gimbal motors. <code>false</code> means the gimbal power remains on, however the motors will not work.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable the motor.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_getmotorenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_getmotorenabled_inline">getMotorEnabled</a></div></div><div class="inline-doc" id="djigimbal_getmotorenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMotorEnabled</h6></div>

~~~java
 void getMotorEnabled(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_motor_enabled_key">GimbalKey.MOTOR_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Determines whether the gimbal motors are enabled to work or not.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_togglegimbalselfie"><div class="api-col left">Toggle Gimbal Selfie</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_togglegimbalselfie_inline">toggleSelfie</a></div></div><div class="inline-doc" id="djigimbal_togglegimbalselfie_inline"

><div class="article"><h6 ><font color="#AAA">method </font>toggleSelfie</h6></div>

~~~java
 void toggleSelfie(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_toggle_selfie_key">GimbalKey.TOGGLE_SELFIE</a></td></tr></table></html>



##### Description:



<font color="#666">Resets gimbal position to selfie setup. If the gimbal yaw is not at 180  degrees, then calling this method will rotate the gimbal yaw to 180  degrees (effectively pointing the camera to the person holding the gimbal).  If the gimbal yaw is at 180 degrees, then the gimbal will rotate in yaw to 0 degrees.  It's only supported by DJI OSMO, OSMO Pro and OSMO Raw.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_setcontrollermode"><div class="api-col left">Gimbal Controller Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_setcontrollermode_inline">setControllerMode</a></div></div><div class="inline-doc" id="djigimbal_setcontrollermode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setControllerMode</h6></div>

~~~java
 void setControllerMode(@NonNull ControllerMode mode,
                                  @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_controller_mode_key">GimbalKey.CONTROLLER_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the gimbal's controller mode. The control mode for the gimbal controller (joystick for Osmo). The total controller deflection is a combination of horizontal and vertical deflection. This translates to gimbal movement around the yaw and pitch axes. The gimbal can be set to either move in both yaw and pitch simultaneously based on horizontal and vertical deflection of the controller, or move in only yaw or pitch exclusively based on whether horizontal or vertical deflection is larger.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/HandheldController/DJIHandheldController.html#djihandheldcontroller_djihandheldcontrollerstickcontrolmode">ControllerMode</a> <font color="#000">mode</td><td><font color="#666"><i>See enum named <code><a href="/Components/HandheldController/DJIHandheldController.html#djihandheldcontroller_djihandheldcontrollerstickcontrolmode">ControllerMode</a></code> in DJIGimbal to find details on different gimbal stick control modes.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_getcontrollermode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_getcontrollermode_inline">getControllerMode</a></div></div><div class="inline-doc" id="djigimbal_getcontrollermode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getControllerMode</h6></div>

~~~java
 void getControllerMode(@NonNull final CompletionCallbackWith<ControllerMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_controller_mode_key">GimbalKey.CONTROLLER_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the gimbal's controller mode.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/HandheldController/DJIHandheldController.html#djihandheldcontroller_djihandheldcontrollerstickcontrolmode">ControllerMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_setinvertedcontrolenabled"><div class="api-col left">Inverted Control</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_setinvertedcontrolenabled_inline">setInvertedControlEnabled</a></div></div><div class="inline-doc" id="djigimbal_setinvertedcontrolenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setInvertedControlEnabled</h6></div>

~~~java
 void setInvertedControlEnabled(@NonNull Axis axis,
                                          boolean enabled,
                                          @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_inverted_control_enabled_key">GimbalKey.YAW_INVERTED_CONTROL_ENABLED</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_inverted_control_enabled_key">GimbalKey.PITCH_INVERTED_CONTROL_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Inverts the physical control for gimbal movement on an axis. The setting can only be applied to the pitch or yaw axis.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable inverted control.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>The axis that the setting will be applied to.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_getinvertedcontrolenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_getinvertedcontrolenabled_inline">getInvertedControlEnabled</a></div></div><div class="inline-doc" id="djigimbal_getinvertedcontrolenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getInvertedControlEnabled</h6></div>

~~~java
 void getInvertedControlEnabled(@NonNull Axis axis,
                                          @NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_inverted_control_enabled_key">GimbalKey.YAW_INVERTED_CONTROL_ENABLED</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_inverted_control_enabled_key">GimbalKey.PITCH_INVERTED_CONTROL_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Determines whether the physical control is inverted for gimbal movement on an axis. The setting can only be applied to the pitch or yaw axis.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>The axis to query.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_setattitudesynchronizationenabled"><div class="api-col left">Attitude Synchronization</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_setattitudesynchronizationenabled_inline">setAttitudeSynchronizationEnabled</a></div></div><div class="inline-doc" id="djigimbal_setattitudesynchronizationenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAttitudeSynchronizationEnabled</h6></div>

~~~java
 void setAttitudeSynchronizationEnabled(boolean enabled,
                                                  @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Synchronizes the attitude of port (left) gimbal and starboard (right) gimbal. It is only valid when both gimbals are connected. If only 1 gimbal is connected, this setting will be reset to <code>false</code>. Enables this setting will reset <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_getcontrollinggimbalindex">getControllingGimbalIndex</a></code> to index 0. It is only supported by M210 and M210 RTK, not supported by DJI X-Port.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable the synchronization.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_getattitudesynchronizationenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_getattitudesynchronizationenabled_inline">getAttitudeSynchronizationEnabled</a></div></div><div class="inline-doc" id="djigimbal_getattitudesynchronizationenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAttitudeSynchronizationEnabled</h6></div>

~~~java
 void getAttitudeSynchronizationEnabled(@NonNull Axis axis,
                                                  @NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Determines whether both gimbals' attitudes are synchronized. If only 1 gimbal is connected, this setting will be reset to <code>false</code>. It is only supported by M210 and M210 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a> <font color="#000">axis</td><td><font color="#666"><i>An enum value of <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_axis">Axis</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_startmultigimbalattitudesynchronization"><div class="api-col left">Multi Gimbal Attitude Sync</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_startmultigimbalattitudesynchronization_inline">startMultiGimbalAttitudeSynchronization</a></div></div><div class="inline-doc" id="djigimbal_startmultigimbalattitudesynchronization_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startMultiGimbalAttitudeSynchronization</h6></div>

~~~java
 void startMultiGimbalAttitudeSynchronization(int[] gimbals, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Selects two to three gimbals to run with Multi-Gimbal Connection, which can be controlled by a single user.  Please check if payloads have been connected with gimbal. The left gimbal, the right gimbal and the upper  gimbal can be chosen. It is only supported by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int[] <font color="#000">gimbals</td><td><font color="#666"><i>Array of gimbal indexes, in which 0 represents the left gimbal, 1 represents the right gimbal  and 2 stands for the upper one. <code>nil</code> if this function is disabled.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The completion block that receives execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_stopmultigimbalattitudesynchronization"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_stopmultigimbalattitudesynchronization_inline">stopMultiGimbalAttitudeSynchronization</a></div></div><div class="inline-doc" id="djigimbal_stopmultigimbalattitudesynchronization_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopMultiGimbalAttitudeSynchronization</h6></div>

~~~java
 void stopMultiGimbalAttitudeSynchronization(final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Stops the gimbals to run with Multi-Gimbal Connection. Please check if payloads have been connected with gimbal.  It is only supported by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The callback that receives execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_getmultigimbalattitudesynchronizationstatus"><div class="api-col left">Multi Gimbal Attitude Sync Status</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_getmultigimbalattitudesynchronizationstatus_inline">getMultiGimbalAttitudeSynchronizationStatus</a></div></div><div class="inline-doc" id="djigimbal_getmultigimbalattitudesynchronizationstatus_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMultiGimbalAttitudeSynchronizationStatus</h6></div>

~~~java
 MultiGimbalConnectionWorkingStatus getMultiGimbalAttitudeSynchronizationStatus() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Gets the working status of Multi-Gimbal Connection. It is only supported by Matrice 300 RTK.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Gimbal/DJIGimbal_DJIMultiGimbalConnectionWorkingStatus.html#djigimbal_djimultigimbalconnectionworkingstatus">MultiGimbalConnectionWorkingStatus</a></td><td><font color="#666"><i>Multiple gimbal synchronization status.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_setyawsimultaneousfollowenabled"><div class="api-col left">Yaw Simultaneous Follow</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_setyawsimultaneousfollowenabled_inline">setYawSimultaneousFollowEnabled</a></div></div><div class="inline-doc" id="djigimbal_setyawsimultaneousfollowenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setYawSimultaneousFollowEnabled</h6></div>

~~~java
 void setYawSimultaneousFollowEnabled(boolean isEnabled, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Enables this to make the gimbal respond to the controller command to rotate aircraft's heading.  Enabling this setting makes gimbal rotate simultaneously with aircraft's heading when the user  is controlling the aircraft's heading with the remote controller.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isEnabled</td><td><font color="#666"><i><code>true</code> to enable yaw simultaneous follow.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_getyawsimultaneousfollowenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_getyawsimultaneousfollowenabled_inline">getYawSimultaneousFollowEnabled</a></div></div><div class="inline-doc" id="djigimbal_getyawsimultaneousfollowenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getYawSimultaneousFollowEnabled</h6></div>

~~~java
 void getYawSimultaneousFollowEnabled(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Determines whether yaw simultaneous follow is enabled. Enabling this setting makes gimbal rotate  simultaneously with aircraft's heading when the user is controlling the aircraft's heading with the remote controller.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_startbalancedetection"><div class="api-col left">Start Balance Detection</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_startbalancedetection_inline">startBalanceDetection</a></div></div><div class="inline-doc" id="djigimbal_startbalancedetection_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startBalanceDetection</h6></div>

~~~java
 void startBalanceDetection(final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Starts the balance detection. <br> Note: <br> Please DO NOT turn on the motors. The tilt angle of the pitch and roll axis  should be between -30 and -20 degrees. Please fit the screw on the auxiliary arm after the balance detection. Invoked  before <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_startcoaxialitydetection">startConcentricityDetection</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_startcontrolparametersautotuning">startControlParametersAutoTuning</a></code>. Or start balance detection  with default control parameters. <br> This can only be invoked during <code><a href="/Components/Payload/DJIPayload.html#djipayload_djipayloadproductphase_development">DEVELOPMENT</a></code> phase.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The callback that receives execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_stopbalancedetection"><div class="api-col left">Stop Balance Detection</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_stopbalancedetection_inline">stopBalanceDetection</a></div></div><div class="inline-doc" id="djigimbal_stopbalancedetection_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopBalanceDetection</h6></div>

~~~java
 void stopBalanceDetection(final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Stops the balance detection. This can only be invoked during <code><a href="/Components/Payload/DJIPayload.html#djipayload_djipayloadproductphase_development">DEVELOPMENT</a></code> phase.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The callback that receives execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_startcoaxialitydetection"><div class="api-col left">Start Coaxiality Detection</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_startcoaxialitydetection_inline">startConcentricityDetection</a></div></div><div class="inline-doc" id="djigimbal_startcoaxialitydetection_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startConcentricityDetection</h6></div>

~~~java
 void startConcentricityDetection(final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Starts the coaxiality detection. <br> Note: <br> Please DO NOT turn on the motors. The tilt angle of the pitch and  roll axis cannot be greater than 5 degrees. Please start coaxiality detection after gimbal's balance detection and fitting  the screw on the auxiliary arm. This can only be invoked during <code><a href="/Components/Payload/DJIPayload.html#djipayload_djipayloadproductphase_development">DEVELOPMENT</a></code> phase.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The callback that receives execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_stopcoaxialitydetection"><div class="api-col left">Stop Coaxiality Detection</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_stopcoaxialitydetection_inline">stopConcentricityDetection</a></div></div><div class="inline-doc" id="djigimbal_stopcoaxialitydetection_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopConcentricityDetection</h6></div>

~~~java
 void stopConcentricityDetection(final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Stops the coaxiality detection. This can only be invoked during <code><a href="/Components/Payload/DJIPayload.html#djipayload_djipayloadproductphase_development">DEVELOPMENT</a></code> phase.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The callback that receives execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_startcontrolparametersautotuning"><div class="api-col left">Start Control Parameters Auto Tuning</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_startcontrolparametersautotuning_inline">startControlParametersAutoTuning</a></div></div><div class="inline-doc" id="djigimbal_startcontrolparametersautotuning_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startControlParametersAutoTuning</h6></div>

~~~java
 void startControlParametersAutoTuning(final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Starts the control parameters auto tuning. <br> Note: <br> Please DO NOT turn on the motors. The tilt angle of the pitch  and roll axis cannot be greater than 5 degrees. This can only be invoked during <code><a href="/Components/Payload/DJIPayload.html#djipayload_djipayloadproductphase_development">DEVELOPMENT</a></code> phase.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The callback that receives execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_stopcontrolparametersautotuning"><div class="api-col left">Stop Control Parameters Auto Tuning</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_stopcontrolparametersautotuning_inline">stopControlParametersAutoTuning</a></div></div><div class="inline-doc" id="djigimbal_stopcontrolparametersautotuning_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopControlParametersAutoTuning</h6></div>

~~~java
 void stopControlParametersAutoTuning(final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Stops the control parameters auto tuning. This can only be invoked during <code><a href="/Components/Payload/DJIPayload.html#djipayload_djipayloadproductphase_development">DEVELOPMENT</a></code> phase.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The callback that receives execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_resetcontrolparameters"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_resetcontrolparameters_inline">resetControlParameters</a></div></div><div class="inline-doc" id="djigimbal_resetcontrolparameters_inline"

><div class="article"><h6 ><font color="#AAA">method </font>resetControlParameters</h6></div>

~~~java
 void resetControlParameters(final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Restores gimbal's control parameters coefficient. <br> Note: <br> Please DO NOT turn on the motors.  This can only be invoked during <code><a href="/Components/Payload/DJIPayload.html#djipayload_djipayloadproductphase_development">DEVELOPMENT</a></code> phase.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The callback that receives execution result.</i></td></tr></table></html></div>

<html><p><br></p></html>

##### Related:

<div class="api-row" id="djigimbal_gimbalstate"><div class="api-col left">General</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Gimbal/DJIGimbal_GimbalState.html">GimbalState</a></div></div><div class="api-row" id="djigimbal_movementsettingsstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Gimbal/DJIGimbal_movementSettingsState.html">MovementSettings</a></div></div><div class="api-row" id="djigimbal_attitude"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Gimbal/DJIGimbal_attitude.html">Attitude</a></div></div><div class="api-row" id="djigimbal_axis"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djigimbal_axis_inline">Axis</a></div></div><div class="inline-doc" id="djigimbal_axis_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>Axis</h6></div>

~~~java
@EXClassNullAway
 enum Axis 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Gimbal Axis.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_axis_yaw_inline"></a>YAW</td><td><font color="#666">Gimbal's yaw axis.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_axis_pitch_inline"></a>PITCH</td><td><font color="#666">Gimbal's pitch axis.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_axis_roll_inline"></a>ROLL</td><td><font color="#666">Gimbal's roll axis. Not available in <code>DJIGimbal_resetWithAxisAndResetDirection</code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_axis_yaw_and_pitch_inline"></a>YAW_AND_PITCH</td><td><font color="#666">Gimbal's yaw and pitch axis.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djigimbal_workmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djigimbal_workmode_inline">GimbalMode</a></div></div><div class="inline-doc" id="djigimbal_workmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>GimbalMode</h6></div>

~~~java
@EXClassNullAway
 enum GimbalMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_mode_key">GimbalKey.MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Gimbal work modes.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_workmode_freemode_inline"></a>FREE</td><td><font color="#666">The gimbal can move independently of the aircraft's yaw. In this mode, even if the aircraft yaw changes, the camera will continue pointing in the same world direction. This mode is only available for the Ronin-MX when the M600 or M600 Pro landing gear is retracted.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_workmode_fpvmode_inline"></a>FPV</td><td><font color="#666">The gimbal's work mode is FPV mode. In this mode, the gimbal yaw will follow the aircraft's heading, and the gimbal roll will follow the RC's roll channel value. The pitch will be available to move. This mode is only available for the Ronin-MX when the M600 landing gear is retracted.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_workmode_yawfollowmode_inline"></a>YAW_FOLLOW</td><td><font color="#666">The gimbal's work mode is such that it will follow the yaw. In this mode, the gimbal yaw will be fixed, while pitch and roll will be available to move.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_workmode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The gimbal's work mode is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djigimbal_balancetestresult"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djigimbal_balancetestresult_inline">BalanceTestResult</a></div></div><div class="inline-doc" id="djigimbal_balancetestresult_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>BalanceTestResult</h6></div>

~~~java
@EXClassNullAway
 enum BalanceTestResult 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_test_result_key">GimbalKey.PITCH_TEST_RESULT</a>, <a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_roll_test_result_key">GimbalKey.ROLL_TEST_RESULT</a></td></tr></table></html>



##### Description:



<font color="#666">For gimbals that allow payloads to be changed, a balance test should be performed to ensure the camera is mounted correctly.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_balancetestresult_great_inline"></a>PASS</td><td><font color="#666">The balance test result is great.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_balancetestresult_good_inline"></a>MARGINAL</td><td><font color="#666">The balance test result is good. When this result is returned, it is possible there was some noise in the balance measurement. For best results, it is recommended to run the balance test again and adjust the payload position until the result becomes great.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_balancetestresult_bad_inline"></a>FAIL</td><td><font color="#666">The balance test result is bad. The payload should be adjusted when this result is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_balancetestresult_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The balance test result is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djigimbal_movementsettingsprofile"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djigimbal_movementsettingsprofile_inline">MovementSettingsProfile</a></div></div><div class="inline-doc" id="djigimbal_movementsettingsprofile_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>MovementSettingsProfile</h6></div>

~~~java
@EXClassNullAway
 enum MovementSettingsProfile 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_movement_settings_profile_key">GimbalKey.MOVEMENT_SETTINGS_PROFILE</a></td></tr></table></html>



##### Description:



<font color="#666">The Movement Settings Profile contains presets for SmoothTrack and the Physical Controller sensitivity. SmoothTrack and Controller settings can only be manually changed if Custom1 or Custom2 profiles are selected.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_movementsettingsprofile_fast_inline"></a>FAST</td><td><font color="#666">The gimbal's SmoothTrack and Controller sensitivity is high. When the gimbal is using this profile, user cannot change the Movement Settings manually.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_movementsettingsprofile_medium_inline"></a>MEDIUM</td><td><font color="#666">The gimbal's SmoothTrack and Controller sensitivity is medium. When the gimbal is using this profile, user cannot change the Movement Settings manually.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_movementsettingsprofile_slow_inline"></a>SLOW</td><td><font color="#666">The gimbal's SmoothTrack and Controller sensitivity is slow. When the gimbal is using this profile, user cannot change the Movement Settings manually.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_movementsettingsprofile_custom1_inline"></a>CUSTOM_1</td><td><font color="#666">The gimbal uses a custom configuration in memory slot 1 where the yaw and pitch speed, deadband, and acceleration can be defined.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_movementsettingsprofile_custom2_inline"></a>CUSTOM_2</td><td><font color="#666">The gimbal uses a custom configuration in memory slot 2 where the yaw and pitch speed, deadband, and acceleration can be defined.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_movementsettingsprofile_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The gimbal's user config type is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djigimbal_motorcontrolpreset"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djigimbal_motorcontrolpreset_inline">MotorControlPreset</a></div></div><div class="inline-doc" id="djigimbal_motorcontrolpreset_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>MotorControlPreset</h6></div>

~~~java
@EXClassNullAway
 enum MotorControlPreset 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_apply_motor_control_preset_key">GimbalKey.APPLY_MOTOR_CONTROL_PRESET</a></td></tr></table></html>



##### Description:



<font color="#666">Different cameras have different preset parameters for gimbal motor stiffness, strength, gyro filtering and pre-control.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_motorcontrolpreset_red_inline"></a>RED</td><td><font color="#666">The gimbal's motor control configuration is optimized for RED cameras.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_motorcontrolpreset_dslrcamera_inline"></a>DSLR</td><td><font color="#666">The gimbal's motor control configuration is optimized for most DSLR cameras.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_motorcontrolpreset_mirrorlesscamera_inline"></a>MIRRORLESS</td><td><font color="#666">The gimbal's motor control configuration is optimized for most mirrorless cameras.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djigimbal_endpointdirection"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djigimbal_endpointdirection_inline">EndpointDirection</a></div></div><div class="inline-doc" id="djigimbal_endpointdirection_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>EndpointDirection</h6></div>

~~~java
@EXClassNullAway
 enum EndpointDirection 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Gimbal endpoint setting.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_endpointdirection_pitchup_inline"></a>PITCH_UP</td><td><font color="#666">Pitch (also called tilt) endpoint setting in the upwards direction.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_endpointdirection_pitchdown_inline"></a>PITCH_DOWN</td><td><font color="#666">Pitch (also called tilt) endpoint setting in the downwards direction.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_endpointdirection_yawleft_inline"></a>YAW_LEFT</td><td><font color="#666">Yaw (also called pan) endpoint setting in the left direction.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_endpointdirection_yawright_inline"></a>YAW_RIGHT</td><td><font color="#666">Yaw (also called pan) endpoint setting in the right direction.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djigimbal_loadingbalancestatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djigimbal_loadingbalancestatus_inline">BalanceState</a></div></div><div class="inline-doc" id="djigimbal_loadingbalancestatus_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>BalanceState</h6></div>

~~~java
@EXClassNullAway
 enum BalanceState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_balance_state_key">GimbalKey.BALANCE_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">The loading balance status of the gimbal. The gimbal loading is changeable for Osmo Mobile. When the mounted mobile device is changed, in order to  optimize the gimbal performance, user can adjust the gimbal physically based on the status.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_loadingbalancestatus_balanced_inline"></a>BALANCED</td><td><font color="#666">The gimbal is balanced.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_loadingbalancestatus_tiltingleft_inline"></a>TILTING_LEFT</td><td><font color="#666">The gimbal is tilting left. Adjust the photo to the right hand side to balance the gimbal.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_loadingbalancestatus_tiltingright_inline"></a>TILTING_RIGHT</td><td><font color="#666">The gimbal is tilting right. Adjust the photo to the left hand side to balance the gimbal.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_loadingbalancestatus_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The balance status is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djigimbal_gimbalcapabilitykey"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djigimbal_gimbalcapabilitykey_inline">CapabilityKey</a></div></div><div class="inline-doc" id="djigimbal_gimbalcapabilitykey_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>CapabilityKey</h6></div>

~~~java
@EXClassNullAway
 enum CapabilityKey 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">These enums are keys for gimbal capability map.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_paramadjustpitch_inline"></a>ADJUST_PITCH</td><td><font color="#666">Key enum in the <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> dictionary that holds the complete capability of the gimbal. A negative value in the valid range represents counter-clockwise rotation. A positive value in the valid range represents clockwise rotation.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_paramadjustyaw_inline"></a>ADJUST_YAW</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal supports yaw axis adjustment. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range in degrees is returned. A negative value in the valid range represents counter-clockwise rotation. A positive value in the valid range represents clockwise rotation. For Gimbal's that allow a pitch range extension (see <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_parampitchrangeextensionenabled">PITCH_RANGE_EXTENSION</a></code>, the range will be representative of the extended range whether it is enabled or not.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_paramadjustroll_inline"></a>ADJUST_ROLL</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal supports roll axis adjustment. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range in degrees is returned. A negative value in the valid range represents counter-clockwise rotation. A positive value in the valid range represents clockwise rotation.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_parammovementsettingsprofile_inline"></a>MOVEMENT_SETTINGS</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal supports Advanced Settings Profiles. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability.html#djiparamcapability">DJIParamCapability</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_parampitchrangeextensionenabled_inline"></a>PITCH_RANGE_EXTENSION</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal supports a range extension in pitch. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range in degrees is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_paramcontrollerspeedpitch_inline"></a>PITCH_CONTROLLER_SPEED_COEFFICIENT</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's pitch axis response speed to manual control can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_paramcontrollerspeedyaw_inline"></a>YAW_CONTROLLER_SPEED_COEFFICIENT</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's yaw axis response speed to manual control can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_paramcontrollersmoothingpitch_inline"></a>PITCH_CONTROLLER_SMOOTHING_FACTOR</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's pitch axis smoothing can be adjusted when using manual control. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_paramcontrollersmoothingyaw_inline"></a>YAW_CONTROLLER_SMOOTHING_FACTOR</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's yaw axis smoothing can be adjusted when using manual control. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_paramcontrollerdeadbandpitch_inline"></a>PITCH_CONTROLLER_DEADBAND</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's manual control pitch axis deadband can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_paramcontrollerdeadbandyaw_inline"></a>YAW_CONTROLLER_DEADBAND</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's manual control yaw axis deadband can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_parampitchcontrollermaxspeed_inline"></a>PITCH_CONTROLLER_MAX_SPEED</td><td><font color="#666">Key  in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's manual control pitch axis max speed can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_paramyawcontrollermaxspeed_inline"></a>YAW_CONTROLLER_MAX_SPEED</td><td><font color="#666">Key  in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's manual control yaw axis max speed can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_paramsmoothtrackenabledpitch_inline"></a>PITCH_SMOOTH_TRACK_ENABLED</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's pitch axis SmoothTrack can be toggled. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability.html#djiparamcapability">DJIParamCapability</a></code>. Ronin-MX cannot toggle the SmoothTrack functionality and it is always enabled.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_paramsmoothtrackenabledyaw_inline"></a>YAW_SMOOTH_TRACK_ENABLED</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's yaw axis SmoothTrack can be toggled. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability.html#djiparamcapability">DJIParamCapability</a></code>. Ronin-MX cannot toggle the SmoothTrack functionality and it is always enabled.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_paramsmoothtrackaccelerationpitch_inline"></a>PITCH_SMOOTH_TRACK_ACCELERATION</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's pitch axis SmoothTrack acceleration can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_paramsmoothtrackaccelerationyaw_inline"></a>YAW_SMOOTH_TRACK_ACCELERATION</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's yaw axis SmoothTrack acceleration can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_paramsmoothtrackspeedpitch_inline"></a>PITCH_SMOOTH_TRACK_SPEED</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's pitch axis SmoothTrack speed can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_paramsmoothtrackspeedyaw_inline"></a>YAW_SMOOTH_TRACK_SPEED</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's yaw axis SmoothTrack speed can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_paramsmoothtrackdeadbandpitch_inline"></a>PITCH_SMOOTH_TRACK_DEADBAND</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's pitch axis SmoothTrack deadband can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_paramsmoothtrackdeadbandyaw_inline"></a>YAW_SMOOTH_TRACK_DEADBAND</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's yaw axis SmoothTrack deadband can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_paramendpointpitchup_inline"></a>PITCH_UP_ENDPOINT</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's pitch up endpoint can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_paramendpointpitchdown_inline"></a>PITCH_DOWN_ENDPOINT</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's pitch down endpoint can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_paramendpointyawleft_inline"></a>YAW_LEFT_ENDPOINT</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's yaw left endpoint can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_paramendpointyawright_inline"></a>YAW_RIGHT_ENDPOINT</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's yaw right endpoint can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_parammotorcontrolstiffnesspitch_inline"></a>PITCH_MOTOR_CONTROL_STIFFNESS</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's pitch axis motor control stiffness can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_parammotorcontrolstiffnessyaw_inline"></a>YAW_MOTOR_CONTROL_STIFFNESS</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's yaw axis motor control stiffness can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_parammotorcontrolstiffnessroll_inline"></a>ROLL_MOTOR_CONTROL_STIFFNESS</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's roll axis motor control stiffness can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_parammotorcontrolstrengthpitch_inline"></a>PITCH_MOTOR_CONTROL_STRENGTH</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's pitch axis motor control strength can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_parammotorcontrolstrengthyaw_inline"></a>YAW_MOTOR_CONTROL_STRENGTH</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's yaw axis motor control strength can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_parammotorcontrolstrengthroll_inline"></a>ROLL_MOTOR_CONTROL_STRENGTH</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's roll axis motor control strength can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_parammotorcontrolgyrofilteringpitch_inline"></a>PITCH_MOTOR_CONTROL_GYRO_FILTERING_FACTOR</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's pitch axis motor control gyro filtering can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_parammotorcontrolgyrofilteringyaw_inline"></a>YAW_MOTOR_CONTROL_GYRO_FILTERING_FACTOR</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's yaw axis motor control gyro filtering can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_parammotorcontrolgyrofilteringroll_inline"></a>ROLL_MOTOR_CONTROL_GYRO_FILTERING_FACTOR</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's roll axis motor control gyro filtering can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_parammotorcontrolprecontrolpitch_inline"></a>PITCH_MOTOR_CONTROL_PRE_CONTROL</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's pitch axis motor control "precontrol" can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_parammotorcontrolprecontrolyaw_inline"></a>YAW_MOTOR_CONTROL_PRE_CONTROL</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's yaw axis motor control "precontrol" can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_parammotorcontrolprecontrolroll_inline"></a>ROLL_MOTOR_CONTROL_PRE_CONTROL</td><td><font color="#666">Key enum in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> associated with whether the gimbal's roll axis motor control "precontrol" can be adjusted. The corresponding value in <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_gimbalcapabilities">getCapabilities</a></code> is an instance of <code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code> meaning both the feature's existence as well as its possible range (unitless) is returned.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djigimbal_djigimbalrotation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Gimbal/DJIGimbal_DJIGimbalRotation.html">Rotation</a></div></div><div class="api-row" id="djigimbal_djimultigimbalconnectionworkingstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Gimbal/DJIGimbal_DJIMultiGimbalConnectionWorkingStatus.html">MultiGimbalConnectionWorkingStatus</a></div></div><div class="api-row" id="djigimbal_djigimbaldetectionresultonaxis"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbaldetectionresultonaxis_inline">DetectionResultOnAxis</a></div></div><div class="inline-doc" id="djigimbal_djigimbaldetectionresultonaxis_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>DetectionResultOnAxis</h6></div>

~~~java
 enum DetectionResultOnAxis 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">Gimbal's balance or coaxiality detection result on axis.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbaldetectionresultonaxis_great_inline"></a>GREAT</td><td><font color="#666">Balance or coaxiality detection result is great.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbaldetectionresultonaxis_good_inline"></a>GOOD</td><td><font color="#666">Balance or coaxiality detection result is good.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbaldetectionresultonaxis_bad_inline"></a>BAD</td><td><font color="#666">Balance or coaxiality detection result is bad. Please adjust gimbal's balance or  coaxiality according to corresponding result.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbaldetectionresultonaxis_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The gimbal detection result is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djigimbal_djigimbalbalancedetectionprogressstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalbalancedetectionprogressstatus_inline">BalanceDetectionProgressStatus</a></div></div><div class="inline-doc" id="djigimbal_djigimbalbalancedetectionprogressstatus_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>BalanceDetectionProgressStatus</h6></div>

~~~java
 enum BalanceDetectionProgressStatus 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">Current balance detection progress status of balance detection.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalbalancedetectionprogressstatus_inprocess_inline"></a>IN_PROCESS</td><td><font color="#666">Gimbal's balance detection is in process.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalbalancedetectionprogressstatus_finished_inline"></a>FINISHED</td><td><font color="#666">Gimbal's balance detection has finished.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalbalancedetectionprogressstatus_error_inline"></a>ERROR</td><td><font color="#666">Gimbal's balance balance detection has stopped with error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalbalancedetectionprogressstatus_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Gimbal's balance detection status is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djigimbal_djigimbalcoaxialitydetectionprogressstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalcoaxialitydetectionprogressstatus_inline">CoaxialityDetectionProgressStatus</a></div></div><div class="inline-doc" id="djigimbal_djigimbalcoaxialitydetectionprogressstatus_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>CoaxialityDetectionProgressStatus</h6></div>

~~~java
 enum CoaxialityDetectionProgressStatus 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">Current coaxiality detection progress status of balance detection.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalcoaxialitydetectionprogressstatus_inprocess_inline"></a>IN_PROCESS</td><td><font color="#666">Gimbal's coaxiality detection is in process.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalcoaxialitydetectionprogressstatus_finished_inline"></a>FINISHED</td><td><font color="#666">Gimbal's coaxiality detection has finished.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalcoaxialitydetectionprogressstatus_error_inline"></a>ERROR</td><td><font color="#666">Gimbal's coaxiality detection has stopped with error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalcoaxialitydetectionprogressstatus_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Gimbal's coaxiality detection status is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djigimbal_djigimbaldirectionadjustmentresult"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbaldirectionadjustmentresult_inline">DirectionAdjustmentResult</a></div></div><div class="inline-doc" id="djigimbal_djigimbaldirectionadjustmentresult_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>DirectionAdjustmentResult</h6></div>

~~~java
 enum DirectionAdjustmentResult 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">Gimbal's direction adjustment result.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbaldirectionadjustmentresult_good_inline"></a>GOOD</td><td><font color="#666">The direction check result is good.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbaldirectionadjustmentresult_bad_inline"></a>BAD</td><td><font color="#666">Gimbal's direction adjustment result is bad.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbaldirectionadjustmentresult_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Gimbal's direction adjustment result is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djigimbal_djigimbalsuggesteddirectionadjustment"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalsuggesteddirectionadjustment_inline">SuggestedDirectionAdjustment</a></div></div><div class="inline-doc" id="djigimbal_djigimbalsuggesteddirectionadjustment_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>SuggestedDirectionAdjustment</h6></div>

~~~java
 enum SuggestedDirectionAdjustment 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">The suggested direction adjustment of gimbal.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalsuggesteddirectionadjustment_none_inline"></a>NONE</td><td><font color="#666">No need to adjust.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalsuggesteddirectionadjustment_left_inline"></a>LEFT</td><td><font color="#666">Manually adjust the camera to the corresponding direction on axis.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalsuggesteddirectionadjustment_right_inline"></a>RIGHT</td><td><font color="#666">Manually adjust the camera to the corresponding direction on axis.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalsuggesteddirectionadjustment_upwards_inline"></a>UPWARDS</td><td><font color="#666">Manually adjust the camera to the corresponding direction on axis.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalsuggesteddirectionadjustment_downwards_inline"></a>DOWNWARDS</td><td><font color="#666">Manually adjust the camera to the corresponding direction on axis.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalsuggesteddirectionadjustment_forwards_inline"></a>FORWARDS</td><td><font color="#666">Manually adjust the camera to the corresponding direction on axis.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalsuggesteddirectionadjustment_backwards_inline"></a>BACKWARDS</td><td><font color="#666">Manually adjust the camera to the corresponding direction on axis.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djigimbal_djigimbalcontrolparametersautotuningstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalcontrolparametersautotuningstatus_inline">ControlParametersAutoTuningStatus</a></div></div><div class="inline-doc" id="djigimbal_djigimbalcontrolparametersautotuningstatus_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ControlParametersAutoTuningStatus</h6></div>

~~~java
 enum ControlParametersAutoTuningStatus 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">The control parameters auto tuning status of the gimbal.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalcontrolparametersautotuningstatus_inprocess_inline"></a>IN_PROCESS</td><td><font color="#666">Control parameters auto-tuning is in progress.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalcontrolparametersautotuningstatus_finished_inline"></a>FINISHED</td><td><font color="#666">Control parameters auto-tuning is finished.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalcontrolparametersautotuningstatus_error_inline"></a>ERROR</td><td><font color="#666">The control parameters auto tuning occurs error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalcontrolparametersautotuningstatus_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown control parameters auto-tuning state.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djigimbal_djigimbalrotationalinertiastate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalrotationalinertiastate_inline">RotationalInertiaState</a></div></div><div class="inline-doc" id="djigimbal_djigimbalrotationalinertiastate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>RotationalInertiaState</h6></div>

~~~java
 enum RotationalInertiaState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">Gimbal's rotational inertia state.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalrotationalinertiastate_normal_inline"></a>NORMAL</td><td><font color="#666">The rotational inertia of axis is normal.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalrotationalinertiastate_toosmall_inline"></a>SMALLER</td><td><font color="#666">The rotational inertia is too small. PayLoad need to be added.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalrotationalinertiastate_toolarge_inline"></a>TOO_LARGER</td><td><font color="#666">The rotational inertia is too large. Payload need to be reduced.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalrotationalinertiastate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djigimbal_djigimbalaxialstiffnessstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalaxialstiffnessstate_inline">AxialStiffnessState</a></div></div><div class="inline-doc" id="djigimbal_djigimbalaxialstiffnessstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>AxialStiffnessState</h6></div>

~~~java
 enum AxialStiffnessState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">Gimbal's stiffness on axis.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalaxialstiffnessstate_normal_inline"></a>NORMAL</td><td><font color="#666">Normal stiffness on axis.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalaxialstiffnessstate_low_inline"></a>LOW</td><td><font color="#666">Low stiffness on axis.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalaxialstiffnessstate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The stiffness on axis is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djigimbal_resetdirection"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djigimbal_resetdirection_inline">ResetDirection</a></div></div><div class="inline-doc" id="djigimbal_resetdirection_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ResetDirection</h6></div>

~~~java
 enum ResetDirection 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Gimbal reset direction.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_resetdirection_up_or_down_inline"></a>UP_OR_DOWN</td><td><font color="#666">The standard position for the upper gimbal is pointing up vertically to the sky. The standard  position for the downward gimbal is pointing down vertically to the earth.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_resetdirection_center_inline"></a>CENTER</td><td><font color="#666">Applies only to the yaw. The standard position is pointing to the center.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djigimbal_stateupdatecallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Gimbal/DJIGimbal_stateUpdateCallbackInterface.html">Callback</a></div></div><div class="api-row" id="djigimbal_movementsettingsstateupdatecallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Gimbal/DJIGimbal_movementSettingsStateUpdateCallbackInterface.html">Callback</a></div></div><div class="api-row" id="djigimbal_batteryremainingenergyupdatecallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Gimbal/DJIGimbal_batteryRemainingEnergyUpdateCallbackInterface.html">BatteryChargeRemainingCallback</a></div></div><div class="api-row" id="djigimbal_djigimbalbalancedetectionstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Gimbal/DJIGimbal_DJIGimbalBalanceDetectionState.html">GimbalBalanceDetectionState</a></div></div><div class="api-row" id="djigimbal_djigimbalcontrolparametersautotuningstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Gimbal/DJIGimbal_DJIGimbalControlParametersAutoTuningState.html">GimbalControlParametersAutoTuningState</a></div></div><div class="api-row" id="djigimbal_djigimbalcoaxialitydetectionstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Gimbal/DJIGimbal_DJIGimbalCoaxialityDetectionState.html">GimbalCoaxialityDetectionState</a></div></div>

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


