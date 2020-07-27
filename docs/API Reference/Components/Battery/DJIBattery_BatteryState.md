<div class="article"><h1 ><font color="#AAA">class </font>BatteryState</h1></div>

~~~java
@EXClassNullAway
 class BatteryState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr></table></html>



##### Description:



<font color="#666">Supported by both smart and non-smart batteries, this class keeps track of the real-time state of the battery. Non-smart batteries only support the following properties: <ul> <li>When the connected product is A3 and N3, only <code><a href="/Components/Battery/DJIBattery_BatteryState.html#djibattery_batterystate_voltage">getVoltage</a></code> and <code><a href="/Components/Battery/DJIBattery_BatteryState.html#djibattery_batterystate_cellvoltagelevel">getCellVoltageLevel</a></code> are valid.</li> <li>When the connected product is A2, only <code><a href="/Components/Battery/DJIBattery_BatteryState.html#djibattery_batterystate_voltage">getVoltage</a></code> is valid.</li> </ul>



##### Class Members:



#### Battery Properties

<div class="api-row" id="djibattery_batterystate_fullchargecapacity"><div class="api-col left">Charge</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_batterystate_fullchargecapacity_inline">getFullChargeCapacity</a></div></div><div class="inline-doc" id="djibattery_batterystate_fullchargecapacity_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFullChargeCapacity</h6></div>

~~~java
 int getFullChargeCapacity() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_full_charge_capacity_key">BatteryKey.FULL_CHARGE_CAPACITY</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the total amount of energy, in mAh (milliamp hours), stored in the battery when the battery is fully charged. The energy of the battery at full charge changes over time as the battery continues to get used. Over time, as the battery continues to be recharged, the value of <code><a href="/Components/Battery/DJIBattery_BatteryState.html#djibattery_batterystate_fullchargecapacity">getFullChargeCapacity</a></code> will decrease.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_batterystate_chargeremaining"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_batterystate_chargeremaining_inline">getChargeRemaining</a></div></div><div class="inline-doc" id="djibattery_batterystate_chargeremaining_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getChargeRemaining</h6></div>

~~~java
 int getChargeRemaining() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_charge_remaining_key">BatteryKey.CHARGE_REMAINING</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the remaining energy stored in the battery in mAh (milliamp hours).



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_batterystate_chargeremaininginpercent"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_batterystate_chargeremaininginpercent_inline">getChargeRemainingInPercent</a></div></div><div class="inline-doc" id="djibattery_batterystate_chargeremaininginpercent_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getChargeRemainingInPercent</h6></div>

~~~java
 int getChargeRemainingInPercent() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_charge_remaining_in_percent_key">BatteryKey.CHARGE_REMAINING_IN_PERCENT</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the percentage of battery energy left with range [0, 100].



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_batterystate_isbeingcharged"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_batterystate_isbeingcharged_inline">isBeingCharged</a></div></div><div class="inline-doc" id="djibattery_batterystate_isbeingcharged_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isBeingCharged</h6></div>

~~~java
 boolean isBeingCharged() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_is_being_charged_key">BatteryKey.IS_BEING_CHARGED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the battery is being charged.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>The boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_batterystate_isinsinglebatterymode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_batterystate_isinsinglebatterymode_inline">isInSingleBatteryMode</a></div></div><div class="inline-doc" id="djibattery_batterystate_isinsinglebatterymode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isInSingleBatteryMode</h6></div>

~~~java
 boolean isInSingleBatteryMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_is_in_single_battery_mode_key">BatteryKey.IS_IN_SINGLE_BATTERY_MODE</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if only one battery is inserted on the the right or starboard side of the aircraft. The aircraft can still take off but the flight time will be shorter. It is only supported by Inspire 2: Inspire 2 must always have a battery in the right/starboard slot.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_batterystate_selfheatingstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_batterystate_selfheatingstate_inline">getSelfHeatingState</a></div></div><div class="inline-doc" id="djibattery_batterystate_selfheatingstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSelfHeatingState</h6></div>

~~~java
 SelfHeatingState getSelfHeatingState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr></table></html>



##### Description:



<font color="#666">Get self-heating state of the battery. When the temperature of the battery is below 6 celsius degrees, it will warm  up automatically. It is only supported by Mavic 2 Enterprise.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Battery/DJIBattery.html#djibattery_djibatteryselfheatingstate">SelfHeatingState</a></td><td><font color="#666"><i>An enum value of the <code><a href="/Components/Battery/DJIBattery.html#djibattery_djibatteryselfheatingstate">SelfHeatingState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_batterystate_designcapacity"><div class="api-col left">Design Capacity</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_batterystate_designcapacity_inline">getDesignCapacity</a></div></div><div class="inline-doc" id="djibattery_batterystate_designcapacity_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDesignCapacity</h6></div>

~~~java
 int getDesignCapacity() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr></table></html>



##### Description:



<font color="#666">Returns the design capacity of the battery in mAh (milliamp hours). It is the  ideal capacity when the battery is new. This value will not change over time.  It is only supported by smart battery.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_batterystate_voltage"><div class="api-col left">Electrical</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_batterystate_voltage_inline">getVoltage</a></div></div><div class="inline-doc" id="djibattery_batterystate_voltage_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVoltage</h6></div>

~~~java
 int getVoltage() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_voltage_key">BatteryKey.VOLTAGE</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the current battery voltage (mV).



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_batterystate_current"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_batterystate_current_inline">getCurrent</a></div></div><div class="inline-doc" id="djibattery_batterystate_current_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrent</h6></div>

~~~java
 int getCurrent() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_current_key">BatteryKey.CURRENT</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the real time current draw of the battery (mA). A negative value means the battery is being discharged, and a positive value means it is being charged.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_batterystate_cellvoltagelevel"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_batterystate_cellvoltagelevel_inline">getCellVoltageLevel</a></div></div><div class="inline-doc" id="djibattery_batterystate_cellvoltagelevel_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCellVoltageLevel</h6></div>

~~~java
 BatteryCellVoltageLevel getCellVoltageLevel() { return cellVoltageLevel
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_cell_voltage_level_key">BatteryKey.CELL_VOLTAGE_LEVEL</a></td></tr></table></html>



##### Description:



<font color="#666">Current cell voltage level of the battery. It is only supported when the connected product is stand-alone A3 or N3.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Battery/DJIBattery_BatteryState.html#djibattery_djibatterycellvoltagelevel">BatteryCellVoltageLevel</a></td><td><font color="#666"><i>An enum value of the <code><a href="/Components/Battery/DJIBattery_BatteryState.html#djibattery_djibatterycellvoltagelevel">BatteryCellVoltageLevel</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_batterystate_lifetimeremaining"><div class="api-col left">Lifetime</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_batterystate_lifetimeremaining_inline">getLifetimeRemaining</a></div></div><div class="inline-doc" id="djibattery_batterystate_lifetimeremaining_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLifetimeRemaining</h6></div>

~~~java
 int getLifetimeRemaining() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_lifetime_remaining_key">BatteryKey.LIFETIME_REMAINING</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the battery's remaining lifetime as a percentage, with range [0, 100]. A new battery will be close to 100%. As a battery experiences charge/discharge cycles, the value will go down. In unsupported products, this value will always be 0.  These products are Phantom 4 Pro, Inspire 2, and Phantom 4 Advanced.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_batterystate_temperature"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_batterystate_temperature_inline">getTemperature</a></div></div><div class="inline-doc" id="djibattery_batterystate_temperature_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTemperature</h6></div>

~~~java
 float getTemperature() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_temperature_key">BatteryKey.TEMPERATURE</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the battery's temperature, in Celsius, with range [-128, 127] degrees.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_batterystate_numberofdischarges"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_batterystate_numberofdischarges_inline">getNumberOfDischarges</a></div></div><div class="inline-doc" id="djibattery_batterystate_numberofdischarges_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getNumberOfDischarges</h6></div>

~~~java
 int getNumberOfDischarges() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_number_of_discharges_key">BatteryKey.NUMBER_OF_DISCHARGES</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the total number of discharges the battery has gone through over its lifetime. The total number of discharges includes discharges that happen through normal use and discharges that are manually set.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_batterystate_getconnectionstate"><div class="api-col left">Connection State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_batterystate_getconnectionstate_inline">getConnectionState</a></div></div><div class="inline-doc" id="djibattery_batterystate_getconnectionstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getConnectionState</h6></div>

~~~java
 ConnectionState getConnectionState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr></table></html>



##### Description:



<font color="#666">Get battery connection status.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Battery/DJIBattery.html#djibattery_batteryconnectionstate">ConnectionState</a></td><td><font color="#666"><i>A ConnectionState value.</i></td></tr></table></html></div>

<html><p><br></p></html>

##### Related:

<div class="api-row" id="djibattery_stateupdatecallbackinterface"><div class="api-col left">Callbacks</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Battery/DJIBattery_StateUpdateCallbackInterface.html">Callback</a></div></div><div class="api-row" id="djibattery_djibatterycellvoltagelevel"><div class="api-col left">General</div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djibattery_djibatterycellvoltagelevel_inline">BatteryCellVoltageLevel</a></div></div><div class="inline-doc" id="djibattery_djibatterycellvoltagelevel_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>BatteryCellVoltageLevel</h6></div>

~~~java
@EXClassNullAway
 enum BatteryCellVoltageLevel 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_cell_voltage_level_key">BatteryKey.CELL_VOLTAGE_LEVEL</a></td></tr></table></html>



##### Description:



<font color="#666">Battery cell voltage level threshold. Different thresholds will initiate different aircraft behaviors or operations. Level 3 is the lowest level. It is only supported when the connected product is stand-alone A3 and N3.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djibattery_djibatterycellvoltagelevel_level0_inline"></a>LEVEL_0</td><td><font color="#666">The cell voltage is at a safe level; the aircraft can fly normally.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibattery_djibatterycellvoltagelevel_level1_inline"></a>LEVEL_1</td><td><font color="#666">The cell voltage is equal to or lower than threshold Level 1. At this level the Level 1 operation will be executed. The threshold value and operation for Level 1 can be configured by the user.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibattery_djibatterycellvoltagelevel_level2_inline"></a>LEVEL_2</td><td><font color="#666">The cell voltage is equal to or lower than threshold Level 2. At this level the Level 2 operation will be executed. The threshold value and operation for Level 2 can be configured by the user.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibattery_djibatterycellvoltagelevel_level3_inline"></a>LEVEL_3</td><td><font color="#666">The cell voltage is equal to or lower than Level 3. At this level, the aircraft will start landing. The threshold for Level 3 cannot be configured by the user and is fixed at 3400mV.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibattery_djibatterycellvoltagelevel_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The cell voltage level is unknown.</td></tr></table></html>

##### Class Members:

</div>


