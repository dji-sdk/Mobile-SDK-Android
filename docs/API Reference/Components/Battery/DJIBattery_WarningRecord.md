<div class="article"><h1 ><font color="#AAA">class </font>WarningRecord</h1></div>

~~~java
@EXClassNullAway
 class WarningRecord 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_latest_warning_record_key">BatteryKey.LATEST_WARNING_RECORD</a>, <a href="/Components/KeyManager/DJIBatteryKey.html#batterykey_historical_warning_records_key">BatteryKey.HISTORICAL_WARNING_RECORDS</a></td></tr></table></html>



##### Description:



<font color="#666">Used to keep a record of any unusual battery statues in the past 30 discharges. For all the properties below, monitor these values frequently to ensure the battery's state is normal. If any of the properties below indicate there is an issue with the battery, notifying the user is recommended. </br></br> NOTE: No automatic action will be taken if any of the properties below return <code>true</code>, which is why it is imperative that the user is notified of the issue.



##### Class Members:



#### Battery Properties

<div class="api-row" id="djibattery_warningrecord_iscurrentoverloaded"><div class="api-col left">Electrical</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_warningrecord_iscurrentoverloaded_inline">isCurrentOverloaded</a></div></div><div class="inline-doc" id="djibattery_warningrecord_iscurrentoverloaded_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isCurrentOverloaded</h6></div>

~~~java
 boolean isCurrentOverloaded() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the battery should be discharged due to a current overload.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_warningrecord_isshortcircuited"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_warningrecord_isshortcircuited_inline">isShortCircuited</a></div></div><div class="inline-doc" id="djibattery_warningrecord_isshortcircuited_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isShortCircuited</h6></div>

~~~java
 boolean isShortCircuited() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the battery has been or is short circuited.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_warningrecord_lowvoltagecellindex"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_warningrecord_lowvoltagecellindex_inline">getLowVoltageCellIndex</a></div></div><div class="inline-doc" id="djibattery_warningrecord_lowvoltagecellindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLowVoltageCellIndex</h6></div>

~~~java
 int getLowVoltageCellIndex() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr></table></html>



##### Description:



<font color="#666">Returns the index at which one of the cells in the battery is below the normal voltage. The first cell has an index of 0.  -1 represents no battery cells under voltage. Phantom Series Aircraft have four cell batteries. Inspire series aircraft and the M100 have 6 cell batteries.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_warningrecord_isoverheated"><div class="api-col left">Thermal</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_warningrecord_isoverheated_inline">isOverHeated</a></div></div><div class="inline-doc" id="djibattery_warningrecord_isoverheated_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isOverHeated</h6></div>

~~~java
 boolean isOverHeated() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the battery has overheated.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_warningrecord_islowtemperature"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_warningrecord_islowtemperature_inline">isLowTemperature</a></div></div><div class="inline-doc" id="djibattery_warningrecord_islowtemperature_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isLowTemperature</h6></div>

~~~java
 boolean isLowTemperature() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the battery has experienced a temperature that is too low.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_warningrecord_iscustomdischargeenabled"><div class="api-col left">Discharge</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_warningrecord_iscustomdischargeenabled_inline">isCustomDischargeEnabled</a></div></div><div class="inline-doc" id="djibattery_warningrecord_iscustomdischargeenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isCustomDischargeEnabled</h6></div>

~~~java
 boolean isCustomDischargeEnabled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the battery has been configured to be discharged over a specific number of days. Once the battery is fully recharged, the battery will again discharge over the number of days set here. This process is cyclical.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djibattery_warningrecord_damagedcellindex"><div class="api-col left">Damage</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibattery_warningrecord_damagedcellindex_inline">getDamagedCellIndex</a></div></div><div class="inline-doc" id="djibattery_warningrecord_damagedcellindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDamagedCellIndex</h6></div>

~~~java
 int getDamagedCellIndex() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.battery</td></tr></table></html>



##### Description:



<font color="#666">Returns the index at which one of the cells in the battery is damaged. The first cell has an index of 0. -1 represents no damaged battery cells. Phantom 3 aircraft have 4 cell batteries. Inspire series aircraft and the M100 have 6 cell batteries.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>


