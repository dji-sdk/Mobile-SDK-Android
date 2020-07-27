<div class="article"><h1 ><font color="#AAA">class </font>MovementSettings</h1></div>

~~~java
@EXClassNullAway
 class MovementSettings 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">The current movement settings of the gimbal. These include settings for SmoothTrack and the Controller.



##### Class Members:



#### General

<div class="api-row" id="djigimbal_movementsettingsstate_profile"><div class="api-col left">Profile</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_movementsettingsstate_profile_inline">getProfile</a></div></div><div class="inline-doc" id="djigimbal_movementsettingsstate_profile_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getProfile</h6></div>

~~~java
 MovementSettingsProfile getProfile() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_movement_settings_profile_key">GimbalKey.MOVEMENT_SETTINGS_PROFILE</a></td></tr></table></html>



##### Description:



<font color="#666">Advanced settings profile. 



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_movementsettingsprofile">MovementSettingsProfile</a></td><td><font color="#666"><i>A <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_movementsettingsprofile">MovementSettingsProfile</a></code> enum value.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### SmoothTrack

<div class="api-row" id="djigimbal_movementsettingsstate_issmoothtrackenabledyaw"><div class="api-col left">Enable</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_movementsettingsstate_issmoothtrackenabledyaw_inline">isYawSmoothTrackEnabled</a></div></div><div class="inline-doc" id="djigimbal_movementsettingsstate_issmoothtrackenabledyaw_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isYawSmoothTrackEnabled</h6></div>

~~~java
 boolean isYawSmoothTrackEnabled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_smooth_track_enabled_key">GimbalKey.YAW_SMOOTH_TRACK_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if gimbal SmoothTrack is enabled for the yaw axis.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_movementsettingsstate_issmoothtrackenabledpitch"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_movementsettingsstate_issmoothtrackenabledpitch_inline">isPitchSmoothTrackEnabled</a></div></div><div class="inline-doc" id="djigimbal_movementsettingsstate_issmoothtrackenabledpitch_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isPitchSmoothTrackEnabled</h6></div>

~~~java
 boolean isPitchSmoothTrackEnabled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_smooth_track_enabled_key">GimbalKey.PITCH_SMOOTH_TRACK_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if gimbal SmoothTrack is enabled for the pitch axis.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_movementsettingsstate_smoothtrackspeedyaw"><div class="api-col left">Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_movementsettingsstate_smoothtrackspeedyaw_inline">getYawSmoothTrackSpeed</a></div></div><div class="inline-doc" id="djigimbal_movementsettingsstate_smoothtrackspeedyaw_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getYawSmoothTrackSpeed</h6></div>

~~~java
 int getYawSmoothTrackSpeed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_smooth_track_speed_key">GimbalKey.YAW_SMOOTH_TRACK_SPEED</a></td></tr></table></html>



##### Description:



<font color="#666">SmoothTrack yaw axis speed determines how fast the gimbal will catch up with the translated yaw handle movement. Range is [0,100].



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_movementsettingsstate_smoothtrackspeedpitch"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_movementsettingsstate_smoothtrackspeedpitch_inline">getPitchSmoothTrackSpeed</a></div></div><div class="inline-doc" id="djigimbal_movementsettingsstate_smoothtrackspeedpitch_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPitchSmoothTrackSpeed</h6></div>

~~~java
 int getPitchSmoothTrackSpeed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_smooth_track_speed_key">GimbalKey.PITCH_SMOOTH_TRACK_SPEED</a></td></tr></table></html>



##### Description:



<font color="#666">SmoothTrack pitch axis speed determines how fast the gimbal will catch up with the translated pitch handle movement. Range is [0,100].



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_movementsettingsstate_smoothtrackdeadbandyaw"><div class="api-col left">Deadband</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_movementsettingsstate_smoothtrackdeadbandyaw_inline">getYawSmoothTrackDeadband</a></div></div><div class="inline-doc" id="djigimbal_movementsettingsstate_smoothtrackdeadbandyaw_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getYawSmoothTrackDeadband</h6></div>

~~~java
 int getYawSmoothTrackDeadband() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_smooth_track_deadband_key">GimbalKey.YAW_SMOOTH_TRACK_DEADBAND</a></td></tr></table></html>



##### Description:



<font color="#666">A larger SmoothTrack yaw axis deadband requires more yaw handle movement to translate into gimbal motion. Range is [0,90] degrees.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_movementsettingsstate_smoothtrackdeadbandpitch"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_movementsettingsstate_smoothtrackdeadbandpitch_inline">getPitchSmoothTrackDeadband</a></div></div><div class="inline-doc" id="djigimbal_movementsettingsstate_smoothtrackdeadbandpitch_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPitchSmoothTrackDeadband</h6></div>

~~~java
 int getPitchSmoothTrackDeadband() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_smooth_track_deadband_key">GimbalKey.PITCH_SMOOTH_TRACK_DEADBAND</a></td></tr></table></html>



##### Description:



<font color="#666">A larger SmoothTrack pitch axis deadband requires more pitch handle movement to translate into gimbal motion. Range is [0,90] degrees.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_movementsettingsstate_smoothtrackaccelerationyaw"><div class="api-col left">Acceleration</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_movementsettingsstate_smoothtrackaccelerationyaw_inline">getYawSmoothTrackAcceleration</a></div></div><div class="inline-doc" id="djigimbal_movementsettingsstate_smoothtrackaccelerationyaw_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getYawSmoothTrackAcceleration</h6></div>

~~~java
 int getYawSmoothTrackAcceleration() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_smooth_track_acceleration_key">GimbalKey.YAW_SMOOTH_TRACK_ACCELERATION</a></td></tr></table></html>



##### Description:



<font color="#666">SmoothTrack yaw axis acceleration determines how closely the gimbal's yaw axis will follow the translated controller movement. Range is [0,30].



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_movementsettingsstate_smoothtrackaccelerationpitch"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_movementsettingsstate_smoothtrackaccelerationpitch_inline">getPitchSmoothTrackAcceleration</a></div></div><div class="inline-doc" id="djigimbal_movementsettingsstate_smoothtrackaccelerationpitch_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPitchSmoothTrackAcceleration</h6></div>

~~~java
 int getPitchSmoothTrackAcceleration() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_smooth_track_acceleration_key">GimbalKey.PITCH_SMOOTH_TRACK_ACCELERATION</a></td></tr></table></html>



##### Description:



<font color="#666">SmoothTrack pitch axis acceleration determines how closely the camera will follow the translated pitch handle movement. Range is [0,30].



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Controller

<div class="api-row" id="djigimbal_movementsettingsstate_controllersmoothingyaw"><div class="api-col left">Smoothing</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_movementsettingsstate_controllersmoothingyaw_inline">getYawControllerSmoothingFactor</a></div></div><div class="inline-doc" id="djigimbal_movementsettingsstate_controllersmoothingyaw_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getYawControllerSmoothingFactor</h6></div>

~~~java
 int getYawControllerSmoothingFactor() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_controller_smoothing_factor_key">GimbalKey.YAW_CONTROLLER_SMOOTHING_FACTOR</a></td></tr></table></html>



##### Description:



<font color="#666">Controller yaw axis smoothing controls the deceleration of the gimbal. A small value will cause the gimbal to stop abruptly. Range is [0,30].



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_movementsettingsstate_controllersmoothingpitch"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_movementsettingsstate_controllersmoothingpitch_inline">getPitchControllerSmoothingFactor</a></div></div><div class="inline-doc" id="djigimbal_movementsettingsstate_controllersmoothingpitch_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPitchControllerSmoothingFactor</h6></div>

~~~java
 int getPitchControllerSmoothingFactor() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_controller_smoothing_factor_key">GimbalKey.PITCH_CONTROLLER_SMOOTHING_FACTOR</a></td></tr></table></html>



##### Description:



<font color="#666">Controller pitch axis smoothing controls the deceleration of the gimbal. A small value will cause the gimbal to stop abruptly. Range is [0,30].



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_movementsettingsstate_controllerspeedyaw"><div class="api-col left">Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_movementsettingsstate_controllerspeedyaw_inline">getYawControllerSpeedCoefficient</a></div></div><div class="inline-doc" id="djigimbal_movementsettingsstate_controllerspeedyaw_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getYawControllerSpeedCoefficient</h6></div>

~~~java
 int getYawControllerSpeedCoefficient() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_yaw_controller_speed_coefficient_key">GimbalKey.YAW_CONTROLLER_SPEED_COEFFICIENT</a></td></tr></table></html>



##### Description:



<font color="#666">Controller yaw axis speed determines how sensitively the gimbal's yaw axis will follow the controller movement. Range is [0,100].



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_movementsettingsstate_controllerspeedpitch"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_movementsettingsstate_controllerspeedpitch_inline">getPitchControllerSpeedCoefficient</a></div></div><div class="inline-doc" id="djigimbal_movementsettingsstate_controllerspeedpitch_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPitchControllerSpeedCoefficient</h6></div>

~~~java
 int getPitchControllerSpeedCoefficient() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIGimbalKey.html#gimbalkey_pitch_controller_speed_coefficient_key">GimbalKey.PITCH_CONTROLLER_SPEED_COEFFICIENT</a></td></tr></table></html>



##### Description:



<font color="#666">Controller pitch axis speed determines how sensitively the gimbal's pitch axis will follow the controller movement. Range is [0,100].



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>


