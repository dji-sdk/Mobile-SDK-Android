<div class="article"><h1 ><font color="#AAA">class </font>Builder</h1></div>

~~~java
 static final class Builder 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Object builder.



##### Class Members:

<div class="api-row" id="djigimbal_djigimbalrotation_constructor_builder_void"><div class="api-col left">Constructor</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalrotation_constructor_builder_void_inline">Builder</a></div></div><div class="inline-doc" id="djigimbal_djigimbalrotation_constructor_builder_void_inline"

><div class="article"><h6 ><font color="#AAA">method </font>Builder</h6></div>

~~~java
 Builder() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Default rotation constructor method.

</div>

<div class="api-row" id="djigimbal_djigimbalrotation_constructor_builder_rotation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalrotation_constructor_builder_rotation_inline">Builder</a></div></div><div class="inline-doc" id="djigimbal_djigimbalrotation_constructor_builder_rotation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>Builder</h6></div>

~~~java
 Builder(Rotation rotation) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Constructor method that clones a rotation object.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Gimbal/DJIGimbal_DJIGimbalRotation.html#djigimbal_djigimbalrotation">Rotation</a> <font color="#000">rotation</td><td><font color="#666"><i>An instance of <code><a href="/Components/Gimbal/DJIGimbal_DJIGimbalRotation.html#djigimbal_djigimbalrotation">Rotation</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalrotation_constructor_mode"><div class="api-col left">Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalrotation_constructor_mode_inline">mode</a></div></div><div class="inline-doc" id="djigimbal_djigimbalrotation_constructor_mode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>mode</h6></div>

~~~java
 Builder mode(RotationMode mode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Constructor method.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Gimbal/DJIGimbal_DJIGimbalRotation.html#djigimbal_djigimbalrotation_djigimbalrotationmode">RotationMode</a> <font color="#000">mode</td><td><font color="#666"><i>An enum value of <code><a href="/Components/Gimbal/DJIGimbal_DJIGimbalRotation.html#djigimbal_djigimbalrotation_djigimbalrotationmode">RotationMode</a></code>.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>Builder object for mode</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalrotation_constructor_pitch"><div class="api-col left">Attitude</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalrotation_constructor_pitch_inline">pitch</a></div></div><div class="inline-doc" id="djigimbal_djigimbalrotation_constructor_pitch_inline"

><div class="article"><h6 ><font color="#AAA">method </font>pitch</h6></div>

~~~java
 Builder pitch(float pitch) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Constructor method.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">pitch</td><td><font color="#666"><i>A float value of pitch.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>Builder object for pitch</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalrotation_constructor_roll"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalrotation_constructor_roll_inline">roll</a></div></div><div class="inline-doc" id="djigimbal_djigimbalrotation_constructor_roll_inline"

><div class="article"><h6 ><font color="#AAA">method </font>roll</h6></div>

~~~java
 Builder roll(float roll) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Constructor method.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">roll</td><td><font color="#666"><i>A float value of roll.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>Builder object for roll</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalrotation_constructor_yaw"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalrotation_constructor_yaw_inline">yaw</a></div></div><div class="inline-doc" id="djigimbal_djigimbalrotation_constructor_yaw_inline"

><div class="article"><h6 ><font color="#AAA">method </font>yaw</h6></div>

~~~java
 Builder yaw(float yaw) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Constructor method.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">yaw</td><td><font color="#666"><i>A float value of yaw.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>Builder object for yaw</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalrotation_constructor_time"><div class="api-col left">time</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalrotation_constructor_time_inline">time</a></div></div><div class="inline-doc" id="djigimbal_djigimbalrotation_constructor_time_inline"

><div class="article"><h6 ><font color="#AAA">method </font>time</h6></div>

~~~java
 Builder time(double time) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Sets the completion time in seconds to complete an action to control the gimbal. If the the rotation mode is <code><a href="/Components/Gimbal/DJIGimbal_DJIGimbalRotation.html#djigimbal_djigimbalrotation_djigimbalrotationmode_absoluteangle">ABSOLUTE_ANGLE</a></code> then the time determines the duration of time the gimbal should rotate to its new position. For example, if a value of 2.0 is used, then the gimbal will rotate to its target position in 2.0 seconds. Range is [0.1,25.5] seconds.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">double <font color="#000">time</td><td><font color="#666"><i>A double value of time.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>Builder object for time</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalrotation_constructor_ignore"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalrotation_constructor_ignore_inline">ignore</a></div></div><div class="inline-doc" id="djigimbal_djigimbalrotation_constructor_ignore_inline"

><div class="article"><h6 ><font color="#AAA">method </font>ignore</h6></div>

~~~java
 Builder ignore(boolean ignore) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Set whether the app can control the gimbal.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">ignore</td><td><font color="#666"><i><code>true</code> if the app can control the gimbal.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Builder</td><td><font color="#666"><i>Builder object.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalrotation_constructor_build"><div class="api-col left">Build</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalrotation_constructor_build_inline">build</a></div></div><div class="inline-doc" id="djigimbal_djigimbalrotation_constructor_build_inline"

><div class="article"><h6 ><font color="#AAA">method </font>build</h6></div>

~~~java
 Rotation build() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Build the object.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Gimbal/DJIGimbal_DJIGimbalRotation.html#djigimbal_djigimbalrotation">Rotation</a></td><td><font color="#666"><i>Instance of <code><a href="/Components/Gimbal/DJIGimbal_DJIGimbalRotation.html#djigimbal_djigimbalrotation">Rotation</a></code>.</i></td></tr></table></html></div>


