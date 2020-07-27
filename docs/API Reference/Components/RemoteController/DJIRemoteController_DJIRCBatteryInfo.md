<div class="article"><h1 ><font color="#AAA">class </font>BatteryState</h1></div>

~~~java
@EXClassNullAway
 class BatteryState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_battery_state_key">RemoteControllerKey.BATTERY_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">Remote Controller's battery information. Only supported by DJI Smart Controller Enterprise with firmware version v01.00.01.01 and above.



##### Class Members:



##### Related:

<div class="api-row" id="djiremotecontroller_rcbatterystateupdatecallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_RCBatteryStateUpdateCallbackInterface.html">Callback</a></div></div><html><p><br></p></html>

#### Members

<div class="api-row" id="djiremotecontroller_djircbatteryinfo_remainingenergyinmah"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircbatteryinfo_remainingenergyinmah_inline">getRemainingChargeInmAh</a></div></div><div class="inline-doc" id="djiremotecontroller_djircbatteryinfo_remainingenergyinmah_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRemainingChargeInmAh</h6></div>

~~~java
 int getRemainingChargeInmAh() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The remaining power in the Remote Controller's battery in milliamp hours (mAh).



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djircbatteryinfo_remainingenergyinpercent"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircbatteryinfo_remainingenergyinpercent_inline">getRemainingChargeInPercent</a></div></div><div class="inline-doc" id="djiremotecontroller_djircbatteryinfo_remainingenergyinpercent_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRemainingChargeInPercent</h6></div>

~~~java
 int getRemainingChargeInPercent() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The remaining power in the Remote Controller's battery as a percentage in the range of [0, 100].



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djircbatteryinfo_ischarging"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircbatteryinfo_ischarging_inline">isCharging</a></div></div><div class="inline-doc" id="djiremotecontroller_djircbatteryinfo_ischarging_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isCharging</h6></div>

~~~java
 boolean isCharging() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Whether battery of remote controller is charging. The battery may be fully charged when it returns false.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>


