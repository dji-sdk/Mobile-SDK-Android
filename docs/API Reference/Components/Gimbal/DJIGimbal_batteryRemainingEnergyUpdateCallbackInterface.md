<div class="article"><h1 ><font color="#AAA">class </font>BatteryChargeRemainingCallback</h1></div>

~~~java
 interface BatteryChargeRemainingCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Gimbal energy remaining of Ronin MX in percent.



##### Class Members:



#### Protocol Method

<div class="api-row" id="djigimbal_updatebatteryremainingcharge"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_updatebatteryremainingcharge_inline">onUpdate</a></div></div><div class="inline-doc" id="djigimbal_updatebatteryremainingcharge_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
 void onUpdate(@IntRange(from = 0, to = 100) int remainingChargeInPercent)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Update the gimbal's remaining energy in percentage.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 100) int <font color="#000">remainingChargeInPercent</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_didupdatecontrolparametersautotuningstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_didupdatecontrolparametersautotuningstate_inline">setStiffnessSelfTuningCallback</a></div></div><div class="inline-doc" id="djigimbal_didupdatecontrolparametersautotuningstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setStiffnessSelfTuningCallback</h6></div>

~~~java
 void setStiffnessSelfTuningCallback(@Nullable GimbalControlParametersAutoTuningState.Callback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Set listener for updating the gimbal's control parameters auto tuning state.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Gimbal/DJIGimbal_DJIGimbalControlParametersAutoTuningState.html#djigimbal_djigimbalcontrolparametersautotuningstate">GimbalControlParametersAutoTuningState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>A <code><a href="/Components/Gimbal/DJIGimbal_DJIGimbalControlParametersAutoTuningState.html#djigimbal_djigimbalcontrolparametersautotuningstate">GimbalControlParametersAutoTuningState</a></code> callback.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_didupdatebalancedetectionstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_didupdatebalancedetectionstate_inline">setBalanceCheckCallback</a></div></div><div class="inline-doc" id="djigimbal_didupdatebalancedetectionstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setBalanceCheckCallback</h6></div>

~~~java
 void setBalanceCheckCallback(@Nullable GimbalBalanceDetectionState.Callback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Set listener for updating the gimbal's balance detection state.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Gimbal/DJIGimbal_DJIGimbalBalanceDetectionState.html#djigimbal_djigimbalbalancedetectionstate">GimbalBalanceDetectionState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>A <code><a href="/Components/Gimbal/DJIGimbal_DJIGimbalBalanceDetectionState.html#djigimbal_djigimbalbalancedetectionstate">GimbalBalanceDetectionState</a></code> callback.</i></td></tr></table></html></div>

<div class="api-row" id="djigimbal_didupdatecoaxialitydetectionstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_didupdatecoaxialitydetectionstate_inline">setConcentricityCheckCallback</a></div></div><div class="inline-doc" id="djigimbal_didupdatecoaxialitydetectionstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setConcentricityCheckCallback</h6></div>

~~~java
 void setConcentricityCheckCallback(@Nullable GimbalCoaxialityDetectionState.Callback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Set listener for updating the gimbal's coaxiality detection state.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Gimbal/DJIGimbal_DJIGimbalCoaxialityDetectionState.html#djigimbal_djigimbalcoaxialitydetectionstate">GimbalCoaxialityDetectionState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>A <code><a href="/Components/Gimbal/DJIGimbal_DJIGimbalCoaxialityDetectionState.html#djigimbal_djigimbalcoaxialitydetectionstate">GimbalCoaxialityDetectionState</a></code> callback.</i></td></tr></table></html></div>


