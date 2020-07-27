<div class="article"><h1 ><font color="#AAA">class </font>Rotation</h1></div>

~~~java
@EXClassNullAway
 class Rotation 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_rotate_key">GimbalKey.ROTATE</a></td></tr></table></html>



##### Description:



<font color="#666">Represents a gimbal speed or angular rotation operation. If you don't want a specific axis to get rotated, invoke the <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_rotategimbalwithrotation">rotate</a></code> method and set the value of the axis to <code>NO_ROTATION</code> in the <code><a href="/Components/Gimbal/DJIGimbal_DJIGimbalRotation.html#djigimbal_djigimbalrotation">Rotation</a></code> object. By default, the values of pitch, roll, and yaw in the <code><a href="/Components/Gimbal/DJIGimbal_DJIGimbalRotation.html#djigimbal_djigimbalrotation">Rotation</a></code> are set to <code>NO_ROTATION</code>.



##### Class Members:

<div class="api-row" id="djigimbal_djigimbalrotation_mode"><div class="api-col left">Rotation Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalrotation_mode_inline">getMode</a></div></div><div class="inline-doc" id="djigimbal_djigimbalrotation_mode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMode</h6></div>

~~~java
 RotationMode getMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Type of gimbal rotation operation mode.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Gimbal/DJIGimbal_DJIGimbalRotation.html#djigimbal_djigimbalrotation_djigimbalrotationmode">RotationMode</a></td><td><font color="#666"><i>A <code><a href="/Components/Gimbal/DJIGimbal_DJIGimbalRotation.html#djigimbal_djigimbalrotation_djigimbalrotationmode">RotationMode</a></code> enum value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalrotation_pitch"><div class="api-col left">Pitch Value</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalrotation_pitch_inline">getPitch</a></div></div><div class="inline-doc" id="djigimbal_djigimbalrotation_pitch_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPitch</h6></div>

~~~java
 float getPitch() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">The pitch property of a gimbal rotation operation, how much the gimbal rotates on the pitch axis. When it is <code>null</code>, no operation will be applied to the pitch axis.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalrotation_roll"><div class="api-col left">Roll Value</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalrotation_roll_inline">getRoll</a></div></div><div class="inline-doc" id="djigimbal_djigimbalrotation_roll_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRoll</h6></div>

~~~java
 float getRoll() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">The roll property of a gimbal rotation operation, how much the gimbal rotates on the roll axis. When it is <code>null</code>, no operation will be applied to the roll axis.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalrotation_yaw"><div class="api-col left">Yaw Value</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalrotation_yaw_inline">getYaw</a></div></div><div class="inline-doc" id="djigimbal_djigimbalrotation_yaw_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getYaw</h6></div>

~~~java
 float getYaw() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">The yaw property of a gimbal rotation operation, how much the gimbal rotates on the yaw axis. When the rotation mode is <code><a href="/Components/Gimbal/DJIGimbal_DJIGimbalRotation.html#djigimbal_djigimbalrotation_djigimbalrotationmode_absoluteangle">ABSOLUTE_ANGLE</a></code>, the yaw value is relative to the aircraft's heading. When it is <code>null</code>, no operation will be applied to the yaw axis.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalrotation_time"><div class="api-col left">Time</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalrotation_time_inline">getTime</a></div></div><div class="inline-doc" id="djigimbal_djigimbalrotation_time_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTime</h6></div>

~~~java
 double getTime() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">The time of the gimbal speed rotation operation.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">double</td><td><font color="#666"><i>A double value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalrotation_ignore"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalrotation_ignore_inline">getIgnore</a></div></div><div class="inline-doc" id="djigimbal_djigimbalrotation_ignore_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getIgnore</h6></div>

~~~java
 boolean getIgnore() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Sets true to ignore remote controller gimbal stick control.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalrotation_constructor"><div class="api-col left">Constructor</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Gimbal/DJIGimbal_DJIGimbalRotation_Constructor.html">Builder</a></div></div>

##### Related:

<div class="api-row" id="djigimbal_djigimbalrotation_djigimbalrotationmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalrotation_djigimbalrotationmode_inline">RotationMode</a></div></div><div class="inline-doc" id="djigimbal_djigimbalrotation_djigimbalrotationmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>RotationMode</h6></div>

~~~java
@EXClassNullAway
 enum RotationMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">The mode of the gimbal rotation operation.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalrotation_djigimbalrotationmode_relativeangle_inline"></a>RELATIVE_ANGLE</td><td><font color="#666">The angle value, when the gimbal is rotating, relative to the current angle.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalrotation_djigimbalrotationmode_absoluteangle_inline"></a>ABSOLUTE_ANGLE</td><td><font color="#666">The angle value, when the gimbal is rotating, relative to 0 degrees (aircraft heading).  <br>For Inspire 1, using X3, X3 Zoom and Z3 cameras will be relative to true north. Using X5, XT and X5R will be  relative to the aircraft heading. <br> For Inspire 2, using X4S and X5S cameras will be relative to true north.  Using X7 and Z30 will be relative to the aircraft heading.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djigimbal_djigimbalrotation_djigimbalrotationmode_speed_inline"></a>SPEED</td><td><font color="#666">Rotate the gimbal's pitch, roll, and yaw in SPEED Mode. The direction can either be set to clockwise or counter-clockwise. <br> For Phantom 3 Professional, Phantom 3 Advanced and Phantom 3 Standard, roll and yaw rotations are not available. <br> For Inspire 1, Inspire Pro and M100, pitch, roll and yaw rotations are available. <br> For Osmo, roll rotation is not available. The yaw angleVelocity of DJIGimbalSpeedRotation range is (-120, 120). <br></td></tr></table></html>

##### Class Members:

</div>


