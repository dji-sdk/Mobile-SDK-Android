<div class="article"><h1 ><font color="#AAA">class </font>WhiteBalance</h1></div>

~~~java
@EXClassNullAway
 class WhiteBalance 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_white_balance_key">CameraKey.WHITE_BALANCE</a></td></tr></table></html>



##### Description:



<font color="#666">This class contains current values for some camera parameters related to white balance. Values for the camera's current white balance preset and color temperature can be obtained from this class.



##### Class Members:

<div class="api-row" id="djicamera_djicamerawhitebalanceinterface_preset"><div class="api-col left">White Balance Preset</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerawhitebalanceinterface_preset_inline">getWhiteBalancePreset</a></div></div><div class="inline-doc" id="djicamera_djicamerawhitebalanceinterface_preset_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWhiteBalancePreset</h6></div>

~~~java
 WhiteBalancePreset getWhiteBalancePreset() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The current preset for white balance.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerawhitebalance">WhiteBalancePreset</a></td><td><font color="#666"><i>White balance preset.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerawhitebalanceinterface_colortemperature"><div class="api-col left">Color Temperature</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerawhitebalanceinterface_colortemperature_inline">getColorTemperature</a></div></div><div class="inline-doc" id="djicamera_djicamerawhitebalanceinterface_colortemperature_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getColorTemperature</h6></div>

~~~java
 int getColorTemperature() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The current setting for color temperature. Real color temperature value (K) = value * 100. For example, 50 -> 5000K.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Color temperature.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerawhitebalanceinterface_initwithpreset"><div class="api-col left">Init with Preset</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerawhitebalanceinterface_initwithpreset_inline">WhiteBalance</a></div></div><div class="inline-doc" id="djicamera_djicamerawhitebalanceinterface_initwithpreset_inline"

><div class="article"><h6 ><font color="#AAA">method </font>WhiteBalance</h6></div>

~~~java
 WhiteBalance(@NonNull WhiteBalancePreset preset) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Create a <code><a href="/Components/Camera/DJICamera_DJICameraWhiteBalanceInterface.html#djicamera_djicamerawhitebalanceinterface">WhiteBalance</a></code> instance with a white balance preset.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerawhitebalance">WhiteBalancePreset</a> <font color="#000">preset</td><td><font color="#666"><i>White balance preset that is not <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerawhitebalance_customcolortemperature">CUSTOM</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicamerawhitebalanceinterface_initwithcustomcolortemperature"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerawhitebalanceinterface_initwithcustomcolortemperature_inline">WhiteBalance</a></div></div><div class="inline-doc" id="djicamera_djicamerawhitebalanceinterface_initwithcustomcolortemperature_inline"

><div class="article"><h6 ><font color="#AAA">method </font>WhiteBalance</h6></div>

~~~java
 WhiteBalance(@NonNull WhiteBalancePreset preset, @IntRange(from = 20, to = 100) int temperature) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Create a <code><a href="/Components/Camera/DJICamera_DJICameraWhiteBalanceInterface.html#djicamera_djicamerawhitebalanceinterface">WhiteBalance</a></code> instance with white balance preset and temperature.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerawhitebalance">WhiteBalancePreset</a> <font color="#000">preset</td><td><font color="#666"><i>White balance preset.</i></td></tr><tr valign="top"><td><font color="#70BF41">@IntRange(from = 20, to = 100) int <font color="#000">temperature</td><td><font color="#666"><i>Color temperature value to be set in the range of [20, 100]. Real color temperature value (K) = value * 100. For example, 50 -&gt; 5000K.</i></td></tr></table></html></div>


