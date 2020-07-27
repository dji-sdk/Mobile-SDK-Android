<div class="article"><h1 ><font color="#AAA">class </font>FirmwareUpgradeProgress</h1></div>

~~~java
 class FirmwareUpgradeProgress 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade.component.model</td></tr></table></html>



##### Description:



<font color="#666">Firmware upgrade progress.



##### Class Members:

<div class="api-row" id="djiupgrademanager_djiupgradecomponent_djifirmwareupgradeprogress_progress"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiupgrademanager_djiupgradecomponent_djifirmwareupgradeprogress_progress_inline">getProgress</a></div></div><div class="inline-doc" id="djiupgrademanager_djiupgradecomponent_djifirmwareupgradeprogress_progress_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getProgress</h6></div>

~~~java
@FloatRange(from = 0.0, to = 1.0)
 float getProgress() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade.component.model</td></tr></table></html>



##### Description:



<font color="#666">The progress of upgrading firmware.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djiupgrademanager_djiupgradecomponent_djifirmwareupgradeprogress_state"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiupgrademanager_djiupgradecomponent_djifirmwareupgradeprogress_state_inline">getState</a></div></div><div class="inline-doc" id="djiupgrademanager_djiupgradecomponent_djifirmwareupgradeprogress_state_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getState</h6></div>

~~~java
@Nullable
 UpgradingProgressState getState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade.component.model</td></tr></table></html>



##### Description:



<font color="#666">The state of upgrading firmware.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent.html#djiupgrademanager_djiupgradecomponent_djiupgradingprogressstate">UpgradingProgressState</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent.html#djiupgrademanager_djiupgradecomponent_djiupgradingprogressstate">UpgradingProgressState</a></code>.</i></td></tr></table></html></div>


