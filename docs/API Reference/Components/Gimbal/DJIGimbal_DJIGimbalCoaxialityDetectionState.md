<div class="article"><h1 ><font color="#AAA">class </font>GimbalCoaxialityDetectionState</h1></div>

~~~java
 class GimbalCoaxialityDetectionState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">This class provides current coaxiality detection information of the gimbal.



##### Class Members:

<div class="api-row" id="djigimbal_djigimbalcoaxialitydetectionstate_coaxialitydetectionstatus"><div class="api-col left">Coaxiality Detection Status</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalcoaxialitydetectionstate_coaxialitydetectionstatus_inline">getStatus</a></div></div><div class="inline-doc" id="djigimbal_djigimbalcoaxialitydetectionstate_coaxialitydetectionstatus_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getStatus</h6></div>

~~~java
 CoaxialityDetectionProgressStatus getStatus() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">Get the coaxiality detection status.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_djigimbalcoaxialitydetectionprogressstatus">CoaxialityDetectionProgressStatus</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_djigimbalcoaxialitydetectionprogressstatus">CoaxialityDetectionProgressStatus</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalcoaxialitydetectionstate_resultonpitch"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalcoaxialitydetectionstate_resultonpitch_inline">getResultOnPitch</a></div></div><div class="inline-doc" id="djigimbal_djigimbalcoaxialitydetectionstate_resultonpitch_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getResultOnPitch</h6></div>

~~~java
 DetectionResultOnAxis getResultOnPitch() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">Get the Gimbal coaxiality detection result on pitch.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_djigimbaldetectionresultonaxis">DetectionResultOnAxis</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal_djigimbaldetectionresultonaxis">DetectionResultOnAxis</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalcoaxialitydetectionstate_progress"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalcoaxialitydetectionstate_progress_inline">getProcess</a></div></div><div class="inline-doc" id="djigimbal_djigimbalcoaxialitydetectionstate_progress_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getProcess</h6></div>

~~~java
 int getProcess() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">Get the Gimbal's coaxiality detection progress percentage.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the process..</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalcoaxialitydetectionstate_isaircraftstabilitysatisfied"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalcoaxialitydetectionstate_isaircraftstabilitysatisfied_inline">isAircraftStabilitySatisfied</a></div></div><div class="inline-doc" id="djigimbal_djigimbalcoaxialitydetectionstate_isaircraftstabilitysatisfied_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isAircraftStabilitySatisfied</h6></div>

~~~java
 boolean isAircraftStabilitySatisfied() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666"><code>false</code> if aircraft stability does not meet requirements.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check aircraft's stability.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalcoaxialitydetectionstate_isaircraftmotoron"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalcoaxialitydetectionstate_isaircraftmotoron_inline">isAircraftMotorOn</a></div></div><div class="inline-doc" id="djigimbal_djigimbalcoaxialitydetectionstate_isaircraftmotoron_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isAircraftMotorOn</h6></div>

~~~java
 boolean isAircraftMotorOn() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666">Turn off aircraft motor and run coaxiality detection again if this is <code>true</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check aircraft motor on status.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_djigimbalcoaxialitydetectionstate_isgimbalmotoroverloaded"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_djigimbalcoaxialitydetectionstate_isgimbalmotoroverloaded_inline">isGimbalMotorOverloaded</a></div></div><div class="inline-doc" id="djigimbal_djigimbalcoaxialitydetectionstate_isgimbalmotoroverloaded_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isGimbalMotorOverloaded</h6></div>

~~~java
 boolean isGimbalMotorOverloaded() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal.XPortState</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the gimbal motor is overloaded. Unable to test normally.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check gimbal motor overloaded.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djigimbal_djigimbalcoaxialitydetectionstate_callbackinterface"><div class="api-col left">Callbacks</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Gimbal/DJIGimbal_DJIGimbalCoaxialityDetectionState_CallbackInterface.html">Callback</a></div></div>
