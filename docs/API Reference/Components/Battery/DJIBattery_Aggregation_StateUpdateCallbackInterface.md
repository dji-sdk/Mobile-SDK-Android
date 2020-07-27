<div class="article"><h1 ><font color="#AAA">class </font>Callback</h1></div>

~~~java
 interface Callback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_aggregation_state_key">BatteryKey.AGGREGATION_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">This interface provides a callback to update the current aggregated battery state.



##### Class Members:



#### Callback Method

<div class="api-row" id="djibattery_updateaggregationstate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_updateaggregationstate_inline">onUpdate</a></div></div><div class="inline-doc" id="djibattery_updateaggregationstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
 void onUpdate(AggregationState aggregationState)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_aggregation_state_key">BatteryKey.AGGREGATION_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">Callback to update aggregated battery state.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Battery/DJIBattery_AggregationState.html#djibattery_aggregationstate">AggregationState</a> <font color="#000">aggregationState</td><td><font color="#666"><i>The aggregated battery state.</i></td></tr></table></html></div>


