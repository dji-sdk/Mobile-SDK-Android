<div class="article"><h1 ><font color="#AAA">class </font>GimbalControlParametersAutoTuningState</h1></div>

~~~java
 class GimbalControlParametersAutoTuningState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">This class provides gimbal's control parameters auto-tuning state.



##### Class Members:

<div class="api-row" id="djigimbal_djigimbalcontrolparametersautotuningstate_controlparametersautotuningstatus"><div class="api-col left">Control Parameters Auto Tuning Status</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalcontrolparametersautotuningstate_controlparametersautotuningstatus_inline">getStatus</a></div></div><div class="inline-doc" id="djigimbal_djigimbalcontrolparametersautotuningstate_controlparametersautotuningstatus_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getStatus</h6></div>

~~~java
 ControlParametersAutoTuningStatus getStatus() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">The control parameters auto tuning status.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_djigimbalcontrolparametersautotuningstatus">ControlParametersAutoTuningStatus</a></td><td><font color="#666"><i>Return an enum value of <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_djigimbalcontrolparametersautotuningstatus">ControlParametersAutoTuningStatus</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalcontrolparametersautotuningstate_progress"><div class="api-col left">Progress</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalcontrolparametersautotuningstate_progress_inline">getProcess</a></div></div><div class="inline-doc" id="djigimbal_djigimbalcontrolparametersautotuningstate_progress_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getProcess</h6></div>

~~~java
 int getProcess() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">Gimbal's control parameters auto-tuning progress in percentage.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value the auto-tuning progress.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalcontrolparametersautotuningstate_isloadinstalled"><div class="api-col left">Check Load Installed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalcontrolparametersautotuningstate_isloadinstalled_inline">isLoadInstalled</a></div></div><div class="inline-doc" id="djigimbal_djigimbalcontrolparametersautotuningstate_isloadinstalled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isLoadInstalled</h6></div>

~~~java
 boolean isLoadInstalled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">Checks if the load has been installed.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check if the load has been installed.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalcontrolparametersautotuningstate_isbaseattitudenormal"><div class="api-col left">Check Gimbal Attitude</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalcontrolparametersautotuningstate_isbaseattitudenormal_inline">isBaseAttitudeNormal</a></div></div><div class="inline-doc" id="djigimbal_djigimbalcontrolparametersautotuningstate_isbaseattitudenormal_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isBaseAttitudeNormal</h6></div>

~~~java
 boolean isBaseAttitudeNormal() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">Checks if the attitude of gimbal base is normal. Returns <code>false</code> if the base is not placed horizontally.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check if the attitude of gimbal base is normal.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalcontrolparametersautotuningstate_isgyrodriftnormal"><div class="api-col left">Check Gyro Drift</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalcontrolparametersautotuningstate_isgyrodriftnormal_inline">isGyroDriftNormal</a></div></div><div class="inline-doc" id="djigimbal_djigimbalcontrolparametersautotuningstate_isgyrodriftnormal_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isGyroDriftNormal</h6></div>

~~~java
 boolean isGyroDriftNormal() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">Checks if gyro drift is normal. Returns <code>false</code> if the gyro drift is too large.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check if the gyro drift is too large.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalcontrolparametersautotuningstate_isjointangledeviationnormal"><div class="api-col left">Check Joint Angle Deviation</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalcontrolparametersautotuningstate_isjointangledeviationnormal_inline">isJointAngleDeviationNormal</a></div></div><div class="inline-doc" id="djigimbal_djigimbalcontrolparametersautotuningstate_isjointangledeviationnormal_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isJointAngleDeviationNormal</h6></div>

~~~java
 boolean isJointAngleDeviationNormal() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">Checks if joint angle deviation is normal. Returns <code>false</code> if the joint angle deviation is high.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check if joint angle deviation is normal.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalcontrolparametersautotuningstate_rotationalinertiaonroll"><div class="api-col left">Rotational Inertia On Roll</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalcontrolparametersautotuningstate_rotationalinertiaonroll_inline">getRotationalInertiaOnRoll</a></div></div><div class="inline-doc" id="djigimbal_djigimbalcontrolparametersautotuningstate_rotationalinertiaonroll_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRotationalInertiaOnRoll</h6></div>

~~~java
 RotationalInertiaState getRotationalInertiaOnRoll() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">Rotational inertia on roll axis.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_djigimbalrotationalinertiastate">RotationalInertiaState</a></td><td><font color="#666"><i>Return an enum value of <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_djigimbalrotationalinertiastate">RotationalInertiaState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalcontrolparametersautotuningstate_rotationalinertiaonpitch"><div class="api-col left">Rotational Inertia On Pitch</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalcontrolparametersautotuningstate_rotationalinertiaonpitch_inline">getRotationalInertiaOnPitch</a></div></div><div class="inline-doc" id="djigimbal_djigimbalcontrolparametersautotuningstate_rotationalinertiaonpitch_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRotationalInertiaOnPitch</h6></div>

~~~java
 RotationalInertiaState getRotationalInertiaOnPitch() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">Rotational inertia on pitch axis.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_djigimbalrotationalinertiastate">RotationalInertiaState</a></td><td><font color="#666"><i>Return an enum value of <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_djigimbalrotationalinertiastate">RotationalInertiaState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalcontrolparametersautotuningstate_rotationalinertiaonyaw"><div class="api-col left">Rotational Inertia On Yaw</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalcontrolparametersautotuningstate_rotationalinertiaonyaw_inline">getRotationalInertiaOnYaw</a></div></div><div class="inline-doc" id="djigimbal_djigimbalcontrolparametersautotuningstate_rotationalinertiaonyaw_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRotationalInertiaOnYaw</h6></div>

~~~java
 RotationalInertiaState getRotationalInertiaOnYaw() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">Rotational inertia on yaw axis.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_djigimbalrotationalinertiastate">RotationalInertiaState</a></td><td><font color="#666"><i>Return an enum value of <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_djigimbalrotationalinertiastate">RotationalInertiaState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalcontrolparametersautotuningstate_stiffnessonroll"><div class="api-col left">Stiffness On Roll</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalcontrolparametersautotuningstate_stiffnessonroll_inline">getStiffnessOnRoll</a></div></div><div class="inline-doc" id="djigimbal_djigimbalcontrolparametersautotuningstate_stiffnessonroll_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getStiffnessOnRoll</h6></div>

~~~java
 AxialStiffnessState getStiffnessOnRoll() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">Stiffness on roll axis.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_djigimbalaxialstiffnessstate">AxialStiffnessState</a></td><td><font color="#666"><i>Return an enum value of <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_djigimbalaxialstiffnessstate">AxialStiffnessState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalcontrolparametersautotuningstate_stiffnessonpitch"><div class="api-col left">Stiffness On Pitch</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalcontrolparametersautotuningstate_stiffnessonpitch_inline">getStiffnessOnPitch</a></div></div><div class="inline-doc" id="djigimbal_djigimbalcontrolparametersautotuningstate_stiffnessonpitch_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getStiffnessOnPitch</h6></div>

~~~java
 AxialStiffnessState getStiffnessOnPitch() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">Stiffness on pitch axis.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_djigimbalaxialstiffnessstate">AxialStiffnessState</a></td><td><font color="#666"><i>Return an enum value of <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_djigimbalaxialstiffnessstate">AxialStiffnessState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalcontrolparametersautotuningstate_stiffnessonyaw"><div class="api-col left">Stiffness On Yaw</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalcontrolparametersautotuningstate_stiffnessonyaw_inline">getStiffnessOnYaw</a></div></div><div class="inline-doc" id="djigimbal_djigimbalcontrolparametersautotuningstate_stiffnessonyaw_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getStiffnessOnYaw</h6></div>

~~~java
 AxialStiffnessState getStiffnessOnYaw() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">Stiffness on yaw axis.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_djigimbalaxialstiffnessstate">AxialStiffnessState</a></td><td><font color="#666"><i>Return an enum value of <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_djigimbalaxialstiffnessstate">AxialStiffnessState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalcontrolparametersautotuningstate_isrolllocked"><div class="api-col left">Check if Roll Locked</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalcontrolparametersautotuningstate_isrolllocked_inline">isRollLocked</a></div></div><div class="inline-doc" id="djigimbal_djigimbalcontrolparametersautotuningstate_isrolllocked_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isRollLocked</h6></div>

~~~java
 boolean isRollLocked() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if gimbal's roll axis is locked.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check roll locked.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalcontrolparametersautotuningstate_ispitchlocked"><div class="api-col left">Check if Pitch Locked</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalcontrolparametersautotuningstate_ispitchlocked_inline">isPitchLocked</a></div></div><div class="inline-doc" id="djigimbal_djigimbalcontrolparametersautotuningstate_ispitchlocked_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isPitchLocked</h6></div>

~~~java
 boolean isPitchLocked() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if gimbal's pitch axis is locked.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check pitch locked.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalcontrolparametersautotuningstate_isyawlocked"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalcontrolparametersautotuningstate_isyawlocked_inline">isYawLocked</a></div></div><div class="inline-doc" id="djigimbal_djigimbalcontrolparametersautotuningstate_isyawlocked_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isYawLocked</h6></div>

~~~java
 boolean isYawLocked() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if gimbal's yaw axis is locked.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check yaw locked.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalcontrolparametersautotuningstate_isprotectinggimbalmotorlockedrotor"><div class="api-col left">Protecting Gimbal Motor Locked Rotor</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalcontrolparametersautotuningstate_isprotectinggimbalmotorlockedrotor_inline">isProtectingGimbalMotorLockedRotor</a></div></div><div class="inline-doc" id="djigimbal_djigimbalcontrolparametersautotuningstate_isprotectinggimbalmotorlockedrotor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isProtectingGimbalMotorLockedRotor</h6></div>

~~~java
 boolean isProtectingGimbalMotorLockedRotor() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if gimbal motor is locked-rotor and is being protected.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check gimbal motor status.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalcontrolparametersautotuningstate_isaircraftmotoron"><div class="api-col left">Check if Aircraft Motor On</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalcontrolparametersautotuningstate_isaircraftmotoron_inline">isAircraftMotorOn</a></div></div><div class="inline-doc" id="djigimbal_djigimbalcontrolparametersautotuningstate_isaircraftmotoron_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isAircraftMotorOn</h6></div>

~~~java
 boolean isAircraftMotorOn() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the aircraft's motor is on.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check if aircraft motor is on.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djigimbal_djigimbalcontrolparametersautotuningstate_callbackinterface"><div class="api-col left">Callbacks</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Gimbal/DJIGimbal_DJIGimbalControlParametersAutoTuningState_CallbackInterface.html">Callback</a></div></div>
