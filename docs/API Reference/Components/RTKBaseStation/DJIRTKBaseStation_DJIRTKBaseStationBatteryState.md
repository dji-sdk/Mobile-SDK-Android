<div class="article"><h1 ><font color="#AAA">class </font>BaseStationBatteryState</h1></div>

~~~java
 class BaseStationBatteryState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.basestation</td></tr></table></html>



##### Description:



<font color="#666">RTK Base Station Current Battery State.



##### Class Members:

<div class="api-row" id="djirtkbasestation_djirtkbasestationbatterystate_voltage"><div class="api-col left">voltage</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtkbasestation_djirtkbasestationbatterystate_voltage_inline">getVoltage</a></div></div><div class="inline-doc" id="djirtkbasestation_djirtkbasestationbatterystate_voltage_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVoltage</h6></div>

~~~java
 int getVoltage() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.basestation</td></tr></table></html>



##### Description:



<font color="#666">Returns the current RTK base station battery voltage (mV).



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the current RTK base station battery voltage.</i></td></tr></table></html></div>

<div class="api-row" id="djirtkbasestation_djirtkbasestationbatterystate_current"><div class="api-col left">current</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtkbasestation_djirtkbasestationbatterystate_current_inline">getCurrent</a></div></div><div class="inline-doc" id="djirtkbasestation_djirtkbasestationbatterystate_current_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrent</h6></div>

~~~java
 int getCurrent() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.basestation</td></tr></table></html>



##### Description:



<font color="#666">Returns the real time current draw of the RTK base station battery (mA).



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the current draw of the RTK base station battery.</i></td></tr></table></html></div>

<div class="api-row" id="djirtkbasestation_djirtkbasestationbatterystate_temperature"><div class="api-col left">temperature</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtkbasestation_djirtkbasestationbatterystate_temperature_inline">getTemperature</a></div></div><div class="inline-doc" id="djirtkbasestation_djirtkbasestationbatterystate_temperature_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTemperature</h6></div>

~~~java
 float getTemperature() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.basestation</td></tr></table></html>



##### Description:



<font color="#666">Returns the current RTK base station battery's temperature, in Celsius, with range [-128, 127] degrees.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of the current RTK base station battery's temperature.</i></td></tr></table></html></div>

<div class="api-row" id="djirtkbasestation_djirtkbasestationbatterystate_capacitypercent"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtkbasestation_djirtkbasestationbatterystate_capacitypercent_inline">getCapacityPercent</a></div></div><div class="inline-doc" id="djirtkbasestation_djirtkbasestationbatterystate_capacitypercent_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCapacityPercent</h6></div>

~~~java
 int getCapacityPercent() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.basestation</td></tr></table></html>



##### Description:



<font color="#666">Returns the battery's remaining lifetime as a percentage, with range [0, 100]. A new battery will be close  to 100%. As a battery experiences charge/discharge cycles, the value will go down.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the battery's remaining lifetime as a percentage.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djirtkbasestation_djirtkbasestationbatterystatecallbackinterface"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RTKBaseStation/DJIRTKBaseStation_DJIRTKBaseStationBatteryStateCallbackInterface.html">Callback</a></div></div>
