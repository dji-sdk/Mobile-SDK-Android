<div class="article"><h1 ><font color="#AAA">class </font>Attitude</h1></div>

~~~java
@EXClassNullAway
 class Attitude 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_attitude_in_degrees_key">GimbalKey.ATTITUDE_IN_DEGREES</a></td></tr></table></html>



##### Description:



<font color="#666">The gimbal's attitude in degrees relative to the aircraft. If you don't want a specific axis to get rotated, invoke the <code><a href="/Components/Missions/DJIGimbalAttitudeAction.html#djigimbalattitudeaction_initwithattitude">GimbalAttitudeAction</a></code> method and set the value of the axis to <code>NO_ROTATION</code> in the <code><a href="/Components/Gimbal/DJIGimbal_attitude.html#djigimbal_attitude">Attitude</a></code> object. By default, the values of pitch, roll, and yaw in the <code><a href="/Components/Gimbal/DJIGimbal_attitude.html#djigimbal_attitude">Attitude</a></code> are set to <code>NO_ROTATION</code>.



##### Class Members:

<div class="api-row" id="djigimbal_attitude_pitch"><div class="api-col left">Value</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_attitude_pitch_inline">getPitch</a></div></div><div class="inline-doc" id="djigimbal_attitude_pitch_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPitch</h6></div>

~~~java
 float getPitch() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Pitch value in degrees.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_attitude_roll"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_attitude_roll_inline">getRoll</a></div></div><div class="inline-doc" id="djigimbal_attitude_roll_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRoll</h6></div>

~~~java
 float getRoll() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Roll value in degrees.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>&lt;&lt;android:A float value.&gt;</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_attitude_yaw"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_attitude_yaw_inline">getYaw</a></div></div><div class="inline-doc" id="djigimbal_attitude_yaw_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getYaw</h6></div>

~~~java
 float getYaw() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Yaw value in degrees.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>&lt;&lt;android:A float value.&gt;</i></td></tr></table></html></div>


