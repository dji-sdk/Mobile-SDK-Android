<div class="article"><h1 ><font color="#AAA">class </font>BatteryOverview</h1></div>

~~~java
@EXClassNullAway
 class BatteryOverview 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_overviews_key">BatteryKey.OVERVIEWS</a></td></tr></table></html>



##### Description:



<font color="#666">Provides an overview of a battery when aircraft is using multiple batteries.



##### Class Members:



#### Battery Properties

<div class="api-row" id="djibattery_batteryoverview_index"><div class="api-col left">General</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_batteryoverview_index_inline">getIndex</a></div></div><div class="inline-doc" id="djibattery_batteryoverview_index_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getIndex</h6></div>

~~~java
 int getIndex() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr></table></html>



##### Description:



<font color="#666">Index of the battery. Index starts from 0. For Matrice 600, the number 1 battery compartment relates to index 0.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_batteryoverview_isconnected"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_batteryoverview_isconnected_inline">isConnected</a></div></div><div class="inline-doc" id="djibattery_batteryoverview_isconnected_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isConnected</h6></div>

~~~java
 boolean isConnected() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the battery is currently connected to the aircraft.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_batteryoverview_chargeremaininginpercent"><div class="api-col left">Charge</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_batteryoverview_chargeremaininginpercent_inline">getChargeRemainingInPercent</a></div></div><div class="inline-doc" id="djibattery_batteryoverview_chargeremaininginpercent_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getChargeRemainingInPercent</h6></div>

~~~java
 int getChargeRemainingInPercent() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr></table></html>



##### Description:



<font color="#666">The remaining percentage energy of the battery with range [0, 100].



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>


