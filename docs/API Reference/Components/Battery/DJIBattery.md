<div class="article"><h1 ><font color="#AAA">class </font>Battery</h1></div>

~~~java
 class Battery extends BaseComponent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/BaseComponent/DJIBaseComponent.html#djibasecomponent">BaseComponent</a></code></td></tr></table></html>



##### Description:



<font color="#666">This class manages information and real-time status of the connected product's batteries. This object is available from the <code><a href="/Products/Aircraft/DJIAircraft.html#djiaircraft">Aircraft</a></code> or <code><a href="/Products/Handheld/DJIHandheld.html#djihandheld">HandHeld</a></code> object which is a subclass of <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct">BaseProduct</a></code>.



##### Class Members:



##### Related:

<div class="api-row" id="djibattery_batteryconnectionstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djibattery_batteryconnectionstate_inline">ConnectionState</a></div></div><div class="inline-doc" id="djibattery_batteryconnectionstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>ConnectionState</h6></div>

~~~java
@EXClassNullAway
 enum ConnectionState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_connection_state_key">BatteryKey.CONNECTION_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">Battery connection status. 0 means NORMAL, 1 means INVALID, and 2 means EXCEPTION in communication.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djibattery_batteryconnectionstate_normal_inline"></a>NORMAL</td><td><font color="#666">Normal.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibattery_batteryconnectionstate_invalid_inline"></a>INVALID</td><td><font color="#666">Invalid.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibattery_batteryconnectionstate_exception_inline"></a>EXCEPTION</td><td><font color="#666">Exception.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibattery_batteryconnectionstate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<html><p><br></p></html>

#### State Updates

<div class="api-row" id="djibattery_setstateupdatecallback"><div class="api-col left">General</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_setstateupdatecallback_inline">setStateCallback</a></div></div><div class="inline-doc" id="djibattery_setstateupdatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setStateCallback</h6></div>

~~~java
 void setStateCallback(@Nullable BatteryState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.battery</td></tr></table></html>



##### Description:



<font color="#666">Sets the callback that updates battery state.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable BatteryState.Callback <font color="#000">callback</td><td><font color="#666"><i>Callback method.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_aggregation_setstateupdatecallback"><div class="api-col left">Aggregation</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_aggregation_setstateupdatecallback_inline">setAggregationStateCallback</a></div></div><div class="inline-doc" id="djibattery_aggregation_setstateupdatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAggregationStateCallback</h6></div>

~~~java
 static void setAggregationStateCallback(@Nullable AggregationState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_aggregation_state_key">BatteryKey.AGGREGATION_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the callback that updates aggregated battery state.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Battery/DJIBattery_AggregationState.html#djibattery_aggregationstate">AggregationState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>Callback method.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Battery Cell Properties

<div class="api-row" id="djibattery_getcellvoltages"><div class="api-col left">Voltage</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_getcellvoltages_inline">getCellVoltages</a></div></div><div class="inline-doc" id="djibattery_getcellvoltages_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCellVoltages</h6></div>

~~~java
 void getCellVoltages(@NonNull CompletionCallbackWith<Integer[]> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_cell_voltages_key">BatteryKey.CELL_VOLTAGES</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the battery's cell voltages. There will be a voltage for each cell in the battery.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Integer[]&gt; <font color="#000">callback</td><td><font color="#666"><i>Asynchronous execution result callback.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_numberofcells"><div class="api-col left">Number</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_numberofcells_inline">getNumberOfCells</a></div></div><div class="inline-doc" id="djibattery_numberofcells_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getNumberOfCells</h6></div>

~~~java
 int getNumberOfCells() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_number_of_cells_key">BatteryKey.NUMBER_OF_CELLS</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the number of battery cells.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_setnumberofcells"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_setnumberofcells_inline">setNumberOfCells</a></div></div><div class="inline-doc" id="djibattery_setnumberofcells_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setNumberOfCells</h6></div>

~~~java
 void setNumberOfCells(@IntRange(from = 3, to = 12) int numberOfCells,
                                          @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_number_of_cells_key">BatteryKey.NUMBER_OF_CELLS</a></td></tr></table></html>



##### Description:



<font color="#666">When the connected battery is not a smart battery, the number of cells needs to be set manually. The flight controller uses the number of cells and the cell voltage threshold to determine if the aircraft should go home or land. The valid range is [3, 12] cells.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 3, to = 12) int <font color="#000">numberOfCells</td><td><font color="#666"><i>Number of cells inside the battery.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Asynchronous execution result callback.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Information

<div class="api-row" id="djibattery_issmartbattery"><div class="api-col left">Smart Battery</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_issmartbattery_inline">isSmartBattery</a></div></div><div class="inline-doc" id="djibattery_issmartbattery_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isSmartBattery</h6></div>

~~~java
 boolean isSmartBattery() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_is_smart_battery_key">BatteryKey.IS_SMART_BATTERY</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the battery is a smart battery. When the connected battery is a DJI smart battery, more information can be obtained by communicating with the battery.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>&gt;&lt;code&gt;true&lt;/code&gt; if battery is smart battery.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_pairbatteries"><div class="api-col left">Pair Batteries</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_pairbatteries_inline">pairBatteries</a></div></div><div class="inline-doc" id="djibattery_pairbatteries_inline"

><div class="article"><h6 ><font color="#AAA">method </font>pairBatteries</h6></div>

~~~java
 void pairBatteries(@Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_pair_batteries_key">BatteryKey.PAIR_BATTERIES</a></td></tr></table></html>



##### Description:



<font color="#666">A battery's full charge capacity reduces a little every time it goes through a discharge and recharge cycle. Therefore, older batteries that have gone through many cycles will have lower full charge capacity than newer batteries. When multiple batteries are used simultaneously in a product, the aggregate full charge capacity will be limited by the battery with the lowest full charge capacity. <br><br> To optimize the amount of energy delivered by a battery over its lifetime to a product, batteries should be matched or paired with other batteries of similar full charge capacity. The operational challenges of always using paired batteries can be alleviated using the battery pairing interfaces. <br><br>This method will pair two batteries by recording the aggregate of their serial numbers in each of their firmwares. <code><a href="/Components/Battery/DJIBattery.html#djibattery_getbatterypairstatus">getPairingState</a></code> can then be used to determine if the installed battery combination is a previously assigned pair or not. Batteries can be repaired.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_getbatterypairstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_getbatterypairstatus_inline">getPairingState</a></div></div><div class="inline-doc" id="djibattery_getbatterypairstatus_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPairingState</h6></div>

~~~java
 void getPairingState(@NonNull CompletionCallbackWith<PairingState> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_pairing_state_key">BatteryKey.PAIRING_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">A battery's full charge capacity reduces a little every time it goes through a discharge and recharge cycle. Therefore, older batteries that have gone through many cycles will have lower full charge capacity than newer batteries. When multiple batteries are used simultaneously in a product, the aggregate full charge capacity will be limited by the battery with lowest full charge capacity. <br><br> To optimize the amount of energy delivered by a battery over its lifetime to a product, batteries should be matched or paired with other batteries of similar full charge capacity. The operational challenges of always using paired batteries can be alleviated using the battery pairing interfaces. This method can then be used to determine if the installed battery combination is a previously assigned pair or not.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;PairingState&gt; <font color="#000">callback</td><td><font color="#666"><i>Callback that receives the pairing state.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_getmanufacturedate"><div class="api-col left">Manufacture Date</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_getmanufacturedate_inline">getManufactureDate</a></div></div><div class="inline-doc" id="djibattery_getmanufacturedate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getManufactureDate</h6></div>

~~~java
 void getManufactureDate(@NonNull final CompletionCallbackWith<Date> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.battery</td></tr></table></html>



##### Description:



<font color="#666">Gets the manufacture date of current battery. It it only supported by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Date&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Behavior at Thresholds

<div class="api-row" id="djibattery_setlevel1cellvoltagethreshold"><div class="api-col left">Voltage Threshold</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_setlevel1cellvoltagethreshold_inline">setLevel1CellVoltageThreshold</a></div></div><div class="inline-doc" id="djibattery_setlevel1cellvoltagethreshold_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setLevel1CellVoltageThreshold</h6></div>

~~~java
 void setLevel1CellVoltageThreshold(@IntRange(from = 3600, to = 4000) int voltage,
                                                       @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_level_1_cell_voltage_threshold_key">BatteryKey.LEVEL_1_CELL_VOLTAGE_THRESHOLD</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the Level 1 cell voltage threshold in mV. When the cell voltage of the battery crosses below the threshold, Level 1 behavior will be executed. The valid range is [3600, 4000] mV. When the new value is not 100 mV higher than the Level 2 cell voltage threshold, the Level 2 threshold will be set to (new value - 100) mV.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 3600, to = 4000) int <font color="#000">voltage</td><td><font color="#666"><i>Level 1 cell voltage threshold to set in mV.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion block that receives the setter execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_getlevel1cellvoltagethreshold"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_getlevel1cellvoltagethreshold_inline">getLevel1CellVoltageThreshold</a></div></div><div class="inline-doc" id="djibattery_getlevel1cellvoltagethreshold_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLevel1CellVoltageThreshold</h6></div>

~~~java
 void getLevel1CellVoltageThreshold(@NonNull CompletionCallbackWith<Integer> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_level_1_cell_voltage_threshold_key">BatteryKey.LEVEL_1_CELL_VOLTAGE_THRESHOLD</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the Level 1 cell voltage threshold in mV. When the cell voltage of the battery crosses below the threshold, Level 1 behavior will be executed. The valid range is [3600, 4000] mV.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>Asynchronous execution result callback that contains the voltage threshold.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_setlevel2cellvoltagethreshold"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_setlevel2cellvoltagethreshold_inline">setLevel2CellVoltageThreshold</a></div></div><div class="inline-doc" id="djibattery_setlevel2cellvoltagethreshold_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setLevel2CellVoltageThreshold</h6></div>

~~~java
 void setLevel2CellVoltageThreshold(@IntRange(from = 3500, to = 3800) int voltage,
                                                       @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_level_2_cell_voltage_threshold_key">BatteryKey.LEVEL_2_CELL_VOLTAGE_THRESHOLD</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the Level 2 cell voltage threshold in mV. When the cell voltage of the battery crosses below the threshold, Level 2 behavior will be executed. The valid range is [3500, 3800] mV and must be at least 100 mV lower than the Level 1 voltage threshold.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 3500, to = 3800) int <font color="#000">voltage</td><td><font color="#666"><i>Level 2 cell voltage threshold to set in mV.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Asynchronous execution result callback.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_getlevel2cellvoltagethreshold"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_getlevel2cellvoltagethreshold_inline">getLevel2CellVoltageThreshold</a></div></div><div class="inline-doc" id="djibattery_getlevel2cellvoltagethreshold_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLevel2CellVoltageThreshold</h6></div>

~~~java
 void getLevel2CellVoltageThreshold(@NonNull CompletionCallbackWith<Integer> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_level_2_cell_voltage_threshold_key">BatteryKey.LEVEL_2_CELL_VOLTAGE_THRESHOLD</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the Level 2 cell voltage threshold in mV. When the cell voltage of the battery crosses below the threshold, Level 2 behavior will be executed.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>Asynchronous execution result callback that contains the voltage threshold.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_setlevel1cellvoltagebehavior"><div class="api-col left">Threshold Behavior</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_setlevel1cellvoltagebehavior_inline">setLevel1CellVoltageBehavior</a></div></div><div class="inline-doc" id="djibattery_setlevel1cellvoltagebehavior_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setLevel1CellVoltageBehavior</h6></div>

~~~java
 void setLevel1CellVoltageBehavior(@NonNull LowVoltageBehavior behavior,
                                                      @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_level_1_cell_voltage_behavior_key">BatteryKey.LEVEL_1_CELL_VOLTAGE_BEHAVIOR</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the behavior that will be executed when the cell voltage crosses under the Level 1 threshold. It can only be set when the motors are off.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Battery/DJIBattery.html#djibattery_djibatterycellvoltagethresholdbehavior">LowVoltageBehavior</a> <font color="#000">behavior</td><td><font color="#666"><i>Level 1 behavior.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion block that receives the setter execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_getlevel1cellvoltagebehavior"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_getlevel1cellvoltagebehavior_inline">getLevel1CellVoltageBehavior</a></div></div><div class="inline-doc" id="djibattery_getlevel1cellvoltagebehavior_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLevel1CellVoltageBehavior</h6></div>

~~~java
 void getLevel1CellVoltageBehavior(@NonNull CompletionCallbackWith<LowVoltageBehavior> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_level_1_cell_voltage_behavior_key">BatteryKey.LEVEL_1_CELL_VOLTAGE_BEHAVIOR</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the behavior that will be executed when the cell voltage crosses under the Level 1 threshold.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/Battery/DJIBattery.html#djibattery_djibatterycellvoltagethresholdbehavior">LowVoltageBehavior</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Asynchronous execution result callback that contains the voltage threshold behavior.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_setlevel2cellvoltagebehavior"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_setlevel2cellvoltagebehavior_inline">setLevel2CellVoltageBehavior</a></div></div><div class="inline-doc" id="djibattery_setlevel2cellvoltagebehavior_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setLevel2CellVoltageBehavior</h6></div>

~~~java
 void setLevel2CellVoltageBehavior(@NonNull LowVoltageBehavior behavior,
                                                      @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_level_2_cell_voltage_behavior_key">BatteryKey.LEVEL_2_CELL_VOLTAGE_BEHAVIOR</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the operation that will be executed when the cell voltage crosses under Level 2 threshold. It can only be set when motors are off.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Battery/DJIBattery.html#djibattery_djibatterycellvoltagethresholdbehavior">LowVoltageBehavior</a> <font color="#000">behavior</td><td><font color="#666"><i>Level 2 behavior.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Asynchronous execution result callback.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_getlevel2cellvoltagebehavior"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_getlevel2cellvoltagebehavior_inline">getLevel2CellVoltageBehavior</a></div></div><div class="inline-doc" id="djibattery_getlevel2cellvoltagebehavior_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLevel2CellVoltageBehavior</h6></div>

~~~java
 void getLevel2CellVoltageBehavior(@NonNull CompletionCallbackWith<LowVoltageBehavior> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_level_2_cell_voltage_behavior_key">BatteryKey.LEVEL_2_CELL_VOLTAGE_BEHAVIOR</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the behavior that will be executed when the cell voltage crosses under the Level 2 threshold. It is not supported by Mavic Air.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/Battery/DJIBattery.html#djibattery_djibatterycellvoltagethresholdbehavior">LowVoltageBehavior</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Asynchronous execution result callback that contains the voltage threshold behavior.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### LED

<div class="api-row" id="djibattery_setledsenabled"><div class="api-col left">Set LED Enabled</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_setledsenabled_inline">setLEDsEnabled</a></div></div><div class="inline-doc" id="djibattery_setledsenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setLEDsEnabled</h6></div>

~~~java
 void setLEDsEnabled(boolean enabled, @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.battery</td></tr></table></html>



##### Description:



<font color="#666">Enables/disables the LED lights on the batteries. If all batteries' LEDs on the aircraft are turned off, the aircraft's  power button LED indicator should be off. It's supported only by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable the LED lights on the batteries.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback that receives the setter execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_getledsenabled"><div class="api-col left">Get LED Enabled</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_getledsenabled_inline">getLEDsEnabled</a></div></div><div class="inline-doc" id="djibattery_getledsenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLEDsEnabled</h6></div>

~~~java
 void getLEDsEnabled(@NonNull CompletionCallbackWith<Boolean> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.battery</td></tr></table></html>



##### Description:



<font color="#666">Determines if the LEDs on the battery is on. If all batteries' LEDs on the aircraft  are turned off, the aircraft's power button LED indicator should be off. It's supported only by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_getbatterytype"><div class="api-col left">Get battery type</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_getbatterytype_inline">getBatteryType</a></div></div><div class="inline-doc" id="djibattery_getbatterytype_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBatteryType</h6></div>

~~~java
 void getBatteryType(@NonNull CompletionCallbackWith<SmartBatteryType> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.battery</td></tr></table></html>



##### Description:



<font color="#666">Determines if the battery is the correct type in current area.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/Battery/DJIBattery.html#djibattery_djismartbatterytype">SmartBatteryType</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Warning Records

<div class="api-row" id="djibattery_getlatestwarningrecord"><div class="api-col left">Current</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_getlatestwarningrecord_inline">getLatestWarningRecord</a></div></div><div class="inline-doc" id="djibattery_getlatestwarningrecord_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLatestWarningRecord</h6></div>

~~~java
 void getLatestWarningRecord(@NonNull CompletionCallbackWith<WarningRecord> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_latest_warning_record_key">BatteryKey.LATEST_WARNING_RECORD</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the battery's most recent warning record. Anytime the battery experiences a significant exception, it will get recorded as a warning record.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/Battery/DJIBattery_WarningRecord.html#djibattery_warningrecord">WarningRecord</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Asynchronous execution result callback that contains the latest warning record.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_gethistoricalwarningrecords"><div class="api-col left">Historical</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_gethistoricalwarningrecords_inline">getWarningRecords</a></div></div><div class="inline-doc" id="djibattery_gethistoricalwarningrecords_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWarningRecords</h6></div>

~~~java
 void getWarningRecords(@NonNull CompletionCallbackWith<WarningRecord[]> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_historical_warning_records_key">BatteryKey.HISTORICAL_WARNING_RECORDS</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the battery's warning records, which are kept for 30 days using objects of type <code>WarningRecord</code>. Call the <code>isSmartBattery()</code> method before using this method. Not supported by Osmo and non-smart batteries.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/Battery/DJIBattery_WarningRecord.html#djibattery_warningrecord">WarningRecord</a>[]&gt; <font color="#000">callback</td><td><font color="#666"><i>Asynchronous execution result callback that contains the batteries warning records.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Discharge

<div class="api-row" id="djibattery_setselfdischargeindays"><div class="api-col left">Self Discharge</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_setselfdischargeindays_inline">setSelfDischargeInDays</a></div></div><div class="inline-doc" id="djibattery_setselfdischargeindays_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSelfDischargeInDays</h6></div>

~~~java
 void setSelfDischargeInDays(@IntRange(from = 1, to = 20) int days,
                                                @Nullable CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_self_discharge_in_days_key">BatteryKey.SELF_DISCHARGE_IN_DAYS</a></td></tr></table></html>



##### Description:



<font color="#666">Smart batteries can be setup to automatically discharge over a custom period of time. This method sets the battery's self discharge period in days with range [1, 10]. For Inspire 2 and M200 series products, the max range value  can be 20. Not supported by non-smart batteries, Spark and the Osmo series.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 1, to = 20) int <font color="#000">days</td><td><font color="#666"><i>Day for self-discharge</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Asynchronous execution result callback.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_getselfdischargeindays"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_getselfdischargeindays_inline">getSelfDischargeInDays</a></div></div><div class="inline-doc" id="djibattery_getselfdischargeindays_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSelfDischargeInDays</h6></div>

~~~java
 void getSelfDischargeInDays(@NonNull CompletionCallbackWith<Integer> callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_self_discharge_in_days_key">BatteryKey.SELF_DISCHARGE_IN_DAYS</a></td></tr></table></html>



##### Description:



<font color="#666">Smart batteries can be setup to automatically discharge over a custom period of time. This method gets the battery's self discharge period in days with range [1, 10]. For Inspire 2 and M200 series products, the max range value  can be 20. Not supported by non-smart batteries and the Osmo series.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>Asynchronous execution result callback that contains the number of days to discharge over.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Related (Not in Class)

<div class="api-row" id="djibattery_batterystate"><div class="api-col left">General</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Battery/DJIBattery_BatteryState.html">BatteryState</a></div></div><div class="api-row" id="djibattery_aggregationstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Battery/DJIBattery_AggregationState.html">AggregationState</a></div></div><div class="api-row" id="djibattery_warningrecord"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Battery/DJIBattery_WarningRecord.html">WarningRecord</a></div></div><div class="api-row" id="djibattery_djibatterycellvoltagethresholdbehavior"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djibattery_djibatterycellvoltagethresholdbehavior_inline">LowVoltageBehavior</a></div></div><div class="inline-doc" id="djibattery_djibatterycellvoltagethresholdbehavior_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>LowVoltageBehavior</h6></div>

~~~java
@EXClassNullAway
 enum LowVoltageBehavior 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_level_1_cell_voltage_behavior_key">BatteryKey.LEVEL_1_CELL_VOLTAGE_BEHAVIOR</a>, <a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_level_2_cell_voltage_behavior_key">BatteryKey.LEVEL_2_CELL_VOLTAGE_BEHAVIOR</a></td></tr></table></html>



##### Description:



<font color="#666">Defines aircraft's behavior when the cell voltage is low.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djibattery_djibatterycellvoltagethresholdbehavior_flashledwarning_inline"></a>FLASH_LED</td><td><font color="#666">LED lights go into warning mode.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibattery_djibatterycellvoltagethresholdbehavior_gohome_inline"></a>GO_HOME</td><td><font color="#666">Return-to-Home.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibattery_djibatterycellvoltagethresholdbehavior_land_inline"></a>LAND</td><td><font color="#666">Land aircraft immediately.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibattery_djibatterycellvoltagethresholdbehavior_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djibattery_djibatterypairstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djibattery_djibatterypairstatus_inline">PairingState</a></div></div><div class="inline-doc" id="djibattery_djibatterypairstatus_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>PairingState</h6></div>

~~~java
@EXClassNullAway
 enum PairingState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_pairing_state_key">BatteryKey.PAIRING_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">Battery pairing state for batteries that can be paired.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djibattery_djibatterypairstatus_unpaired_inline"></a>UNPAIRED</td><td><font color="#666">The batteries didn't match; they're not paired.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibattery_djibatterypairstatus_paired_inline"></a>PAIRED</td><td><font color="#666">Batteries are paired.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibattery_djibatterypairstatus_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Can't get the pair state or the batteries.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djibattery_djibatteryselfheatingstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djibattery_djibatteryselfheatingstate_inline">SelfHeatingState</a></div></div><div class="inline-doc" id="djibattery_djibatteryselfheatingstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>SelfHeatingState</h6></div>

~~~java
 enum SelfHeatingState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr></table></html>



##### Description:



<font color="#666">Provides the self-heating state for the battery. When the temperature of the  battery is below a threshold, it will warm up automatically. For Mavic 2 Enterprise,  the self-heating is triggered when the temperature is lower than 6 Celsius degrees. When the  temperature reaches 8 Celsius degrees, the battery will start to preserve the temperature and  maintain it between 6 Celsius degrees and 8 Celsius degrees.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djibattery_djibatteryselfheatingstate_idle_inline"></a>IDLE</td><td><font color="#666">The auto heating feature is idle.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibattery_djibatteryselfheatingstate_warmingup_inline"></a>WARMING_UP</td><td><font color="#666">The battery is warming itself up automatically.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibattery_djibatteryselfheatingstate_preserving_inline"></a>PRESERVING</td><td><font color="#666">The battery is preserving its temperature. For Mavic 2 Enterprise,  the temperature will be maintained between 6 Celsius degrees and 8 Celsius degrees.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibattery_djibatteryselfheatingstate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djibattery_djismartbatterytype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djibattery_djismartbatterytype_inline">SmartBatteryType</a></div></div><div class="inline-doc" id="djibattery_djismartbatterytype_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>SmartBatteryType</h6></div>

~~~java
 enum SmartBatteryType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr></table></html>



##### Description:



<font color="#666">Defines smart battery type.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djibattery_djismartbatterytype_other_inline"></a>OTHER</td><td><font color="#666">The smart battery type is other.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibattery_djismartbatterytype_mavicminijapan_inline"></a>MAVIC_MINI_JAPAN</td><td><font color="#666">The smart battery type is Mavic Mini Japan, which is legal to use in Japan.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djibattery_djismartbatterytype_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The smart battery type is unknown.</td></tr></table></html>

##### Class Members:

</div>



##### Inherited Methods:

<div class="api-row" id="djibasecomponent_setdjicomponentlistener"><div class="api-col left">dji.sdk.base.BaseComponent</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_setdjicomponentlistener_inline">setComponentListener</a></div></div><div class="inline-doc" id="djibasecomponent_setdjicomponentlistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setComponentListener</h6></div>

~~~java
 void setComponentListener(ComponentListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Sets the listener for the DJI component.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/BaseComponent/DJIBaseComponent_DJIComponentListenerInterface.html#djibasecomponent_djicomponentlistenerinterface">ComponentListener</a> <font color="#000">listener</td><td><font color="#666"><i>The callback of <code><a href="/Components/BaseComponent/DJIBaseComponent_DJIComponentListenerInterface.html#djibasecomponent_djicomponentlistenerinterface">ComponentListener</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djibasecomponent_index"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_index_inline">getIndex</a></div></div><div class="inline-doc" id="djibasecomponent_index_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getIndex</h6></div>

~~~java
 int getIndex() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Returns the component index. Index is zero based. A component will have an index greater than zero when there  are multiple components of the same type on the DJI product, and one of the components already has the index 0.  For instance, M210 can have two gimbal mounted cameras, and will therefore have two gimbal components with indices  0 and 1, and two camera components with indices 0 and 1. For Matrice 600, there are printed numbers on the battery  boxes. The <code><a href="/Components/Battery/DJIBattery.html#djibattery">Battery</a></code> component instance with index 0 corresponds to battery compartment number 1. For Inspire 2  and M200 series, <code><a href="/Components/Battery/DJIBattery.html#djibattery">Battery</a></code> with index 0 corresponds to the battery on the port (left hand) side of the aircraft.  For M210 and M210 RTK, <code><a href="/Components/Camera/DJICamera.html#djicamera">Camera</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal">Gimbal</a></code> with index 0 corresponds to the camera and gimbal on the port  (left hand) side of the aircraft.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of index.</i></td></tr></table></html></div>

<div class="api-row" id="djibasecomponent_connected"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_connected_inline">isConnected</a></div></div><div class="inline-doc" id="djibasecomponent_connected_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isConnected</h6></div>

~~~java
 boolean isConnected() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the component is connected.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the component is connected.</i></td></tr></table></html></div>

<div class="api-row" id="djibasecomponent_getserialnumber"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_getserialnumber_inline">getSerialNumber</a></div></div><div class="inline-doc" id="djibasecomponent_getserialnumber_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSerialNumber</h6></div>

~~~java
 void getSerialNumber(@NonNull CompletionCallbackWith<String> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Gets the serial number of the component. Depending on the component, this serial number might not match the serial number found  on the physical component.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value returned.</i></td></tr></table></html></div>

<div class="api-row" id="djibasecomponent_getfirmwareversion"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_getfirmwareversion_inline">getFirmwareVersion</a></div></div><div class="inline-doc" id="djibasecomponent_getfirmwareversion_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFirmwareVersion</h6></div>

~~~java
 void getFirmwareVersion(@NonNull CompletionCallbackWith<String> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Returns the firmware version of the component. Each component will  have a different firmware version, the combination of which will  form the package firmware version <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct_getfirmwarepackageversion">getFirmwarePackageVersion</a></code> found in <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct">BaseProduct</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>


