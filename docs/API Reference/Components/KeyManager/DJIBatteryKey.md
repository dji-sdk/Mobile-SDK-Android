<div class="article"><h1 ><font color="#AAA">class </font>BatteryKey</h1></div>

~~~java
 class BatteryKey extends DJIKey
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/KeyManager/DJIKey.html#djikey">DJIKey</a></code></td></tr></table></html>



##### Description:



<font color="#666"><code><a href="/Components/KeyManager/DJIBatteryKey.html#djibatterykey">BatteryKey</a></code> is a key dedicated to accessing Battery related attributes.



##### Class Members:

<div class="api-row" id="djibatterykey_create"><div class="api-col left">Single Battery Products</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibatterykey_create_inline">create</a></div></div><div class="inline-doc" id="djibatterykey_create_inline"

><div class="article"><h6 ><font color="#AAA">method </font>create</h6></div>

~~~java
 static BatteryKey create(@BatteryParamKey @NonNull String paramKey) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Creates a Battery key.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@BatteryParamKey @NonNull String <font color="#000">paramKey</td><td><font color="#666"><i>A valid paramKey.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/KeyManager/DJIBatteryKey.html#djibatterykey">BatteryKey</a></td><td><font color="#666"><i>Battery Key</i></td></tr></table></html></div>

<div class="api-row" id="djibatterykey_create_with_index"><div class="api-col left">Multi Battery Products</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibatterykey_create_with_index_inline">create</a></div></div><div class="inline-doc" id="djibatterykey_create_with_index_inline"

><div class="article"><h6 ><font color="#AAA">method </font>create</h6></div>

~~~java
 static BatteryKey create(@BatteryParamKey @NonNull String paramKey,
                                    @IntRange(from = 0, to = MAX_COMPONENT_INDEX) int componentIndex) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Creates a battery key at selected index. Use this when the product supports multiple batteries.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@BatteryParamKey @NonNull String <font color="#000">paramKey</td><td><font color="#666"><i>A valid paramKey.</i></td></tr><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = MAX_COMPONENT_INDEX) int <font color="#000">componentIndex</td><td><font color="#666"><i>The index of the Battery component.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/KeyManager/DJIBatteryKey.html#djibatterykey">BatteryKey</a></td><td><font color="#666"><i>Battery Key</i></td></tr></table></html></div>

<div class="api-row" id="djibatterykey_create_batteryaggregationkey"><div class="api-col left">Battery AggregationKey</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibatterykey_create_batteryaggregationkey_inline">createBatteryAggregationKey</a></div></div><div class="inline-doc" id="djibatterykey_create_batteryaggregationkey_inline"

><div class="article"><h6 ><font color="#AAA">method </font>createBatteryAggregationKey</h6></div>

~~~java
 static  BatteryKey createBatteryAggregationKey(@BatteryAggregationParamKey @NonNull String paramKey) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Creates a Battery Aggregation key.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@BatteryAggregationParamKey @NonNull String <font color="#000">paramKey</td><td><font color="#666"><i>A valid paramKey.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static  <a href="/Components/KeyManager/DJIBatteryKey.html#djibatterykey">BatteryKey</a></td><td><font color="#666"><i>An object of <code><a href="/Components/KeyManager/DJIBatteryKey.html#djibatterykey">BatteryKey</a></code>.</i></td></tr></table></html></div>



##### Inherited Methods:



##### Class Keys:

<html><table class="key_table"><tr><td colspan=2><a href="#batterykey_self_discharge_in_days_key"></a><p class="key_table_key_string key_table_key_first_row">SELF_DISCHARGE_IN_DAYS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery.html#djibattery_setselfdischargeindays">setSelfDischargeInDays</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery.html#djibattery_getselfdischargeindays">getSelfDischargeInDays</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_battery_type_key"></a><p class="key_table_key_string key_table_key_row">BATTERY_TYPE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>DataSmartBatteryGetStaticData.<a href="/Components/Battery/DJIBattery.html#djibattery_djismartbatterytype">SmartBatteryType</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#batterykey_overviews_key"></a><p class="key_table_key_string key_table_key_row">OVERVIEWS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Battery/DJIBattery_BatteryOverview.html#djibattery_batteryoverview">BatteryOverview</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_AggregationState.html#djibattery_aggregationstate_batteryoverviews">getBatteryOverviews</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_BatteryOverview.html#djibattery_batteryoverview">BatteryOverview</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_self_heating_state_key"></a><p class="key_table_key_string key_table_key_row">SELF_HEATING_STATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Battery/DJIBattery.html#djibattery_djibatteryselfheatingstate">SelfHeatingState</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#batterykey_aggregation_state_key"></a><p class="key_table_key_string key_table_key_row">AGGREGATION_STATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Battery/DJIBattery_AggregationState.html#djibattery_aggregationstate">AggregationState</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_Aggregation_StateUpdateCallbackInterface.html#djibattery_aggregation_stateupdatecallbackinterface">Callback</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery.html#djibattery_aggregation_setstateupdatecallback">setAggregationStateCallback</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_AggregationState.html#djibattery_aggregationstate">AggregationState</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_Aggregation_StateUpdateCallbackInterface.html#djibattery_updateaggregationstate">onUpdate</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_battery_leds_enabled_key"></a><p class="key_table_key_string key_table_key_row">BATTERY_LEDS_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#batterykey_level_2_cell_voltage_behavior_key"></a><p class="key_table_key_string key_table_key_row">LEVEL_2_CELL_VOLTAGE_BEHAVIOR</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Battery/DJIBattery.html#djibattery_djibatterycellvoltagethresholdbehavior">LowVoltageBehavior</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery.html#djibattery_setlevel2cellvoltagebehavior">setLevel2CellVoltageBehavior</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery.html#djibattery_getlevel2cellvoltagebehavior">getLevel2CellVoltageBehavior</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery.html#djibattery_djibatterycellvoltagethresholdbehavior">LowVoltageBehavior</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_level_2_cell_voltage_threshold_key"></a><p class="key_table_key_string key_table_key_row">LEVEL_2_CELL_VOLTAGE_THRESHOLD</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery.html#djibattery_setlevel2cellvoltagethreshold">setLevel2CellVoltageThreshold</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery.html#djibattery_getlevel2cellvoltagethreshold">getLevel2CellVoltageThreshold</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_firmware_version_key"></a><p class="key_table_key_string key_table_key_row">FIRMWARE_VERSION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>String</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#batterykey_is_battery_self_heating_key"></a><p class="key_table_key_string key_table_key_row">IS_BATTERY_SELF_HEATING</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Battery/DJIBattery.html#djibattery_batteryconnectionstate">ConnectionState</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#batterykey_current_key"></a><p class="key_table_key_string key_table_key_row">CURRENT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_AggregationState.html#djibattery_aggregationstate_current">getCurrent</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_BatteryState.html#djibattery_batterystate_current">getCurrent</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_design_capacity_key"></a><p class="key_table_key_string key_table_key_row">DESIGN_CAPACITY</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#batterykey_is_cell_damaged_key"></a><p class="key_table_key_string key_table_key_row">IS_CELL_DAMAGED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_AggregationState.html#djibattery_aggregationstate_iscelldamaged">isCellDamaged</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_is_firmware_difference_detected_key"></a><p class="key_table_key_string key_table_key_row">IS_FIRMWARE_DIFFERENCE_DETECTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_AggregationState.html#djibattery_aggregationstate_isfirmwaredifferencedetected">isFirmwareDifferenceDetected</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_is_low_cell_voltage_detected_key"></a><p class="key_table_key_string key_table_key_row">IS_LOW_CELL_VOLTAGE_DETECTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_AggregationState.html#djibattery_aggregationstate_islowcellvoltagedetected">isLowCellVoltageDetected</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_charge_remaining_key"></a><p class="key_table_key_string key_table_key_row">CHARGE_REMAINING</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_AggregationState.html#djibattery_aggregationstate_chargeremaining">getChargeRemaining</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_BatteryState.html#djibattery_batterystate_chargeremaining">getChargeRemaining</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_charge_remaining_in_percent_key"></a><p class="key_table_key_string key_table_key_row">CHARGE_REMAINING_IN_PERCENT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_AggregationState.html#djibattery_aggregationstate_chargeremaininginpercent">getChargeRemainingInPercent</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_BatteryState.html#djibattery_batterystate_chargeremaininginpercent">getChargeRemainingInPercent</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_historical_warning_records_key"></a><p class="key_table_key_string key_table_key_row">HISTORICAL_WARNING_RECORDS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Battery/DJIBattery_WarningRecord.html#djibattery_warningrecord">WarningRecord</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery.html#djibattery_gethistoricalwarningrecords">getWarningRecords</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_WarningRecord.html#djibattery_warningrecord">WarningRecord</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_latest_warning_record_key"></a><p class="key_table_key_string key_table_key_row">LATEST_WARNING_RECORD</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Battery/DJIBattery_WarningRecord.html#djibattery_warningrecord">WarningRecord</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery.html#djibattery_getlatestwarningrecord">getLatestWarningRecord</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_WarningRecord.html#djibattery_warningrecord">WarningRecord</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_manufacture_date_key"></a><p class="key_table_key_string key_table_key_row">MANUFACTURE_DATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Date</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#batterykey_pair_batteries_key"></a><p class="key_table_key_string key_table_key_row">PAIR_BATTERIES</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery.html#djibattery_pairbatteries">pairBatteries</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_is_in_single_battery_mode_key"></a><p class="key_table_key_string key_table_key_row">IS_IN_SINGLE_BATTERY_MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_BatteryState.html#djibattery_batterystate_isinsinglebatterymode">isInSingleBatteryMode</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_number_of_discharges_key"></a><p class="key_table_key_string key_table_key_row">NUMBER_OF_DISCHARGES</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_BatteryState.html#djibattery_batterystate_numberofdischarges">getNumberOfDischarges</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_cell_voltages_key"></a><p class="key_table_key_string key_table_key_row">CELL_VOLTAGES</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery.html#djibattery_getcellvoltages">getCellVoltages</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_temperature_key"></a><p class="key_table_key_string key_table_key_row">TEMPERATURE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_BatteryState.html#djibattery_batterystate_temperature">getTemperature</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_voltage_key"></a><p class="key_table_key_string key_table_key_row">VOLTAGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_AggregationState.html#djibattery_aggregationstate_voltage">getVoltage</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_BatteryState.html#djibattery_batterystate_voltage">getVoltage</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_pairing_state_key"></a><p class="key_table_key_string key_table_key_row">PAIRING_STATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>PairingState</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery.html#djibattery_getbatterypairstatus">getPairingState</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery.html#djibattery_djibatterypairstatus">PairingState</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_is_smart_battery_key"></a><p class="key_table_key_string key_table_key_row">IS_SMART_BATTERY</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery.html#djibattery_issmartbattery">isSmartBattery</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_cell_voltage_level_key"></a><p class="key_table_key_string key_table_key_row">CELL_VOLTAGE_LEVEL</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Battery/DJIBattery_BatteryState.html#djibattery_djibatterycellvoltagelevel">BatteryCellVoltageLevel</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_BatteryState.html#djibattery_batterystate_cellvoltagelevel">getCellVoltageLevel</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_BatteryState.html#djibattery_djibatterycellvoltagelevel">BatteryCellVoltageLevel</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_is_big_battery_key"></a><p class="key_table_key_string key_table_key_row">IS_BIG_BATTERY</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#batterykey_connection_state_key"></a><p class="key_table_key_string key_table_key_row">CONNECTION_STATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Battery/DJIBattery.html#djibattery_batteryconnectionstate">ConnectionState</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery.html#djibattery_batteryconnectionstate">ConnectionState</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_number_of_connected_batteries_key"></a><p class="key_table_key_string key_table_key_row">NUMBER_OF_CONNECTED_BATTERIES</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_AggregationState.html#djibattery_aggregationstate_numberofconnectedbatteries">getNumberOfConnectedBatteries</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_full_charge_capacity_key"></a><p class="key_table_key_string key_table_key_row">FULL_CHARGE_CAPACITY</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_AggregationState.html#djibattery_aggregationstate_fullchargecapacity">getFullChargeCapacity</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_BatteryState.html#djibattery_batterystate_fullchargecapacity">getFullChargeCapacity</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_battery_embed_ok_key"></a><p class="key_table_key_string key_table_key_row">BATTERY_EMBED_OK</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#batterykey_level_1_cell_voltage_behavior_key"></a><p class="key_table_key_string key_table_key_row">LEVEL_1_CELL_VOLTAGE_BEHAVIOR</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Battery/DJIBattery.html#djibattery_djibatterycellvoltagethresholdbehavior">LowVoltageBehavior</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery.html#djibattery_setlevel1cellvoltagebehavior">setLevel1CellVoltageBehavior</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery.html#djibattery_getlevel1cellvoltagebehavior">getLevel1CellVoltageBehavior</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery.html#djibattery_djibatterycellvoltagethresholdbehavior">LowVoltageBehavior</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_serial_number_key"></a><p class="key_table_key_string key_table_key_row">SERIAL_NUMBER</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>String</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#batterykey_number_of_cells_key"></a><p class="key_table_key_string key_table_key_row">NUMBER_OF_CELLS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery.html#djibattery_numberofcells">getNumberOfCells</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery.html#djibattery_setnumberofcells">setNumberOfCells</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_lifetime_remaining_key"></a><p class="key_table_key_string key_table_key_row">LIFETIME_REMAINING</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_BatteryState.html#djibattery_batterystate_lifetimeremaining">getLifetimeRemaining</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_highest_temperature_key"></a><p class="key_table_key_string key_table_key_row">HIGHEST_TEMPERATURE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_AggregationState.html#djibattery_aggregationstate_highesttemperature">getHighestTemperature</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_level_1_cell_voltage_threshold_key"></a><p class="key_table_key_string key_table_key_row">LEVEL_1_CELL_VOLTAGE_THRESHOLD</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery.html#djibattery_setlevel1cellvoltagethreshold">setLevel1CellVoltageThreshold</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery.html#djibattery_getlevel1cellvoltagethreshold">getLevel1CellVoltageThreshold</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_is_being_charged_key"></a><p class="key_table_key_string key_table_key_row">IS_BEING_CHARGED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_BatteryState.html#djibattery_batterystate_isbeingcharged">isBeingCharged</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_is_any_battery_disconnected_key"></a><p class="key_table_key_string key_table_key_row">IS_ANY_BATTERY_DISCONNECTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_AggregationState.html#djibattery_aggregationstate_isdisconnected">isAnyBatteryDisconnected</a></code>

</p></td></tr><tr><td colspan=2><a href="#batterykey_is_voltage_difference_detected_key"></a><p class="key_table_key_string key_table_key_row">IS_VOLTAGE_DIFFERENCE_DETECTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Battery/DJIBattery_AggregationState.html#djibattery_aggregationstate_isvoltagedifferencedetected">isVoltageDifferenceDetected</a></code>

</p></td></tr></table></html>
