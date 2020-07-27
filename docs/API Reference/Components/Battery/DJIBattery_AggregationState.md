<div class="article"><h1 ><font color="#AAA">class </font>AggregationState</h1></div>

~~~java
@EXClassNullAway
 class AggregationState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_aggregation_state_key">BatteryKey.AGGREGATION_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">Provides a real time summary of the aggregated battery system.



##### Class Members:

<div class="api-row" id="djibattery_aggregationstate_numberofconnectedbatteries"><div class="api-col left">Connection</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_aggregationstate_numberofconnectedbatteries_inline">getNumberOfConnectedBatteries</a></div></div><div class="inline-doc" id="djibattery_aggregationstate_numberofconnectedbatteries_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getNumberOfConnectedBatteries</h6></div>

~~~java
 int getNumberOfConnectedBatteries() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_number_of_connected_batteries_key">BatteryKey.NUMBER_OF_CONNECTED_BATTERIES</a></td></tr></table></html>



##### Description:



<font color="#666">The number of currently connected batteries.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_aggregationstate_batteryoverviews"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_aggregationstate_batteryoverviews_inline">getBatteryOverviews</a></div></div><div class="inline-doc" id="djibattery_aggregationstate_batteryoverviews_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBatteryOverviews</h6></div>

~~~java
 BatteryOverview[] getBatteryOverviews() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_overviews_key">BatteryKey.OVERVIEWS</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the overview of batteries in the battery group. When a battery is not connected, the <code><a href="/Components/Battery/DJIBattery_BatteryOverview.html#djibattery_batteryoverview_isconnected">isConnected</a></code> property is <code>false</code> and the <code><a href="/Components/Battery/DJIBattery_BatteryOverview.html#djibattery_batteryoverview_chargeremaininginpercent">getChargeRemainingInPercent</a></code> is zero. For Matrice 600, there are 6 elements in this array.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Battery/DJIBattery_BatteryOverview.html#djibattery_batteryoverview">BatteryOverview</a>[]</td><td><font color="#666"><i>The <code><a href="/Components/Battery/DJIBattery_BatteryOverview.html#djibattery_batteryoverview">BatteryOverview</a></code> instance.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_aggregationstate_isdisconnected"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_aggregationstate_isdisconnected_inline">isAnyBatteryDisconnected</a></div></div><div class="inline-doc" id="djibattery_aggregationstate_isdisconnected_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isAnyBatteryDisconnected</h6></div>

~~~java
 boolean isAnyBatteryDisconnected() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_is_any_battery_disconnected_key">BatteryKey.IS_ANY_BATTERY_DISCONNECTED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if one of the batteries in the group is disconnected. When <code>true</code>, the aircraft is not allowed to take off.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_aggregationstate_current"><div class="api-col left">Electrical</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_aggregationstate_current_inline">getCurrent</a></div></div><div class="inline-doc" id="djibattery_aggregationstate_current_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrent</h6></div>

~~~java
 int getCurrent() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_current_key">BatteryKey.CURRENT</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the real time current draw through the batteries. A negative value means the batteries are being discharged.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_aggregationstate_voltage"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_aggregationstate_voltage_inline">getVoltage</a></div></div><div class="inline-doc" id="djibattery_aggregationstate_voltage_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVoltage</h6></div>

~~~java
 int getVoltage() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_voltage_key">BatteryKey.VOLTAGE</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the current voltage (mV) provided by the battery group.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_aggregationstate_isvoltagedifferencedetected"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_aggregationstate_isvoltagedifferencedetected_inline">isVoltageDifferenceDetected</a></div></div><div class="inline-doc" id="djibattery_aggregationstate_isvoltagedifferencedetected_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isVoltageDifferenceDetected</h6></div>

~~~java
 boolean isVoltageDifferenceDetected() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_is_voltage_difference_detected_key">BatteryKey.IS_VOLTAGE_DIFFERENCE_DETECTED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if there is significant difference between the voltage (above 1.5V) of two batteries. When  <code>true</code>, the aircraft is not allowed to take off.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_aggregationstate_islowcellvoltagedetected"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_aggregationstate_islowcellvoltagedetected_inline">isLowCellVoltageDetected</a></div></div><div class="inline-doc" id="djibattery_aggregationstate_islowcellvoltagedetected_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isLowCellVoltageDetected</h6></div>

~~~java
 boolean isLowCellVoltageDetected() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_is_low_cell_voltage_detected_key">BatteryKey.IS_LOW_CELL_VOLTAGE_DETECTED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if one of the batteries in the group has cells with low voltage. When <code>true</code>, the aircraft is not allowed to take off.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_aggregationstate_iscelldamaged"><div class="api-col left">Damage</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_aggregationstate_iscelldamaged_inline">isCellDamaged</a></div></div><div class="inline-doc" id="djibattery_aggregationstate_iscelldamaged_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isCellDamaged</h6></div>

~~~java
 boolean isCellDamaged() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_is_cell_damaged_key">BatteryKey.IS_CELL_DAMAGED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if one of the batteries in the group has damaged cells. When <code>true</code>, the aircraft is not allowed to take off.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>



#### Battery Aggregation Properties

<div class="api-row" id="djibattery_aggregationstate_fullchargecapacity"><div class="api-col left">Charge</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_aggregationstate_fullchargecapacity_inline">getFullChargeCapacity</a></div></div><div class="inline-doc" id="djibattery_aggregationstate_fullchargecapacity_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFullChargeCapacity</h6></div>

~~~java
 int getFullChargeCapacity() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_full_charge_capacity_key">BatteryKey.FULL_CHARGE_CAPACITY</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the the total amount of energy, in mAh (milliamp hours), stored in the batteries when the batteries are fully charged.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_aggregationstate_chargeremaining"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_aggregationstate_chargeremaining_inline">getChargeRemaining</a></div></div><div class="inline-doc" id="djibattery_aggregationstate_chargeremaining_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getChargeRemaining</h6></div>

~~~java
 int getChargeRemaining() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_charge_remaining_key">BatteryKey.CHARGE_REMAINING</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the remaining energy stored in the batteries in mAh (milliamp hours).



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_aggregationstate_chargeremaininginpercent"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_aggregationstate_chargeremaininginpercent_inline">getChargeRemainingInPercent</a></div></div><div class="inline-doc" id="djibattery_aggregationstate_chargeremaininginpercent_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getChargeRemainingInPercent</h6></div>

~~~java
 int getChargeRemainingInPercent() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_charge_remaining_in_percent_key">BatteryKey.CHARGE_REMAINING_IN_PERCENT</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the percentage of energy left in the battery group with range [0,100].



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_aggregationstate_highesttemperature"><div class="api-col left">Thermal</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_aggregationstate_highesttemperature_inline">getHighestTemperature</a></div></div><div class="inline-doc" id="djibattery_aggregationstate_highesttemperature_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHighestTemperature</h6></div>

~~~java
 int getHighestTemperature() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_highest_temperature_key">BatteryKey.HIGHEST_TEMPERATURE</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the highest temperature (in Celsius) among the batteries in the group, with range [-128, 127] degrees.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_aggregationstate_isfirmwaredifferencedetected"><div class="api-col left">Firmware</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_aggregationstate_isfirmwaredifferencedetected_inline">isFirmwareDifferenceDetected</a></div></div><div class="inline-doc" id="djibattery_aggregationstate_isfirmwaredifferencedetected_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isFirmwareDifferenceDetected</h6></div>

~~~java
 boolean isFirmwareDifferenceDetected() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_is_firmware_difference_detected_key">BatteryKey.IS_FIRMWARE_DIFFERENCE_DETECTED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if one of the batteries in the group has a firmware version different from the others. When it is <code>true</code>, the aircraft is not allowed to take off.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<html><p><br></p></html>

##### Related:

<div class="api-row" id="djibattery_aggregation_stateupdatecallbackinterface"><div class="api-col left">Callbacks</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Battery/DJIBattery_Aggregation_StateUpdateCallbackInterface.html">Callback</a></div></div><div class="api-row" id="djibattery_batteryoverview"><div class="api-col left">General</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Battery/DJIBattery_BatteryOverview.html">BatteryOverview</a></div></div>
