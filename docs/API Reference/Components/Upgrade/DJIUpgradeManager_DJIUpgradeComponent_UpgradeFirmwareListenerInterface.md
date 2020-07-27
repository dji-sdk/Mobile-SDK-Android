<div class="article"><h1 ><font color="#AAA">class </font>UpgradeFirmwareListener</h1></div>

~~~java
 interface UpgradeFirmwareListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade.component</td></tr></table></html>



##### Description:



<font color="#666">This listener provides methods to receive the upgrade information, the upgrade firmware state and the upgrade progress.



##### Class Members:



#### Callback Method

<div class="api-row" id="djiupgrademanager_djiupgradecomponent_didupdateupgradefirmwarestate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiupgrademanager_djiupgradecomponent_didupdateupgradefirmwarestate_inline">onUpgradeFirmwareStateUpdated</a></div></div><div class="inline-doc" id="djiupgrademanager_djiupgradecomponent_didupdateupgradefirmwarestate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpgradeFirmwareStateUpdated</h6></div>

~~~java
    void onUpgradeFirmwareStateUpdated(@NonNull UpgradeComponent component, @NonNull UpgradeFirmwareState state)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade.component</td></tr></table></html>



##### Description:



<font color="#666">Called when the upgrade firmware state has been changed.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent.html#djiupgrademanager_djiupgradecomponent">UpgradeComponent</a> <font color="#000">component</td><td><font color="#666"><i>The component of which the upgrade firmware state has been changed.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent.html#djiupgrademanager_djiupgradecomponent_djiupgradefirmwarestate">UpgradeFirmwareState</a> <font color="#000">state</td><td><font color="#666"><i>The upgrade firmware state.</i></td></tr></table></html></div>

<div class="api-row" id="djiupgrademanager_djiupgradecomponent_didupdatefirmwareupgradeprogress"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiupgrademanager_djiupgradecomponent_didupdatefirmwareupgradeprogress_inline">onFirmwareUpgradeProgressUpdated</a></div></div><div class="inline-doc" id="djiupgrademanager_djiupgradecomponent_didupdatefirmwareupgradeprogress_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onFirmwareUpgradeProgressUpdated</h6></div>

~~~java
    void onFirmwareUpgradeProgressUpdated(@NonNull UpgradeComponent component, @NonNull FirmwareUpgradeProgress progress)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade.component</td></tr></table></html>



##### Description:



<font color="#666">Called when the upgrade is in progress.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent.html#djiupgrademanager_djiupgradecomponent">UpgradeComponent</a> <font color="#000">component</td><td><font color="#666"><i>The component of which the upgrade progress is updating.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent_DJIFirmwareUpgradeProgress.html#djiupgrademanager_djiupgradecomponent_djifirmwareupgradeprogress">FirmwareUpgradeProgress</a> <font color="#000">progress</td><td><font color="#666"><i>The upgrade progress information.</i></td></tr></table></html></div>

<div class="api-row" id="djiupgrademanager_djiupgradecomponent_didreceiveconsistencyupgraderequest"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiupgrademanager_djiupgradecomponent_didreceiveconsistencyupgraderequest_inline">onConsistencyUpgradeRequestReceived</a></div></div><div class="inline-doc" id="djiupgrademanager_djiupgradecomponent_didreceiveconsistencyupgraderequest_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onConsistencyUpgradeRequestReceived</h6></div>

~~~java
    void onConsistencyUpgradeRequestReceived(@NonNull UpgradeComponent component)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade.component</td></tr></table></html>



##### Description:



<font color="#666">Raised when the firmware version is inconsistent among modules in component. <br>  See <code><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent.html#djiupgrademanager_djiupgradecomponent">UpgradeComponent</a></code>. Invoke <code><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent.html#djiupgrademanager_djiupgradecomponent_startfirmwareconsistencyupgrade">startFirmwareConsistencyUpgrade</a></code>  to start consistency upgrade. <br> The update frequency is 1Hz. <br> Stop to notify in  following situation: <br> - Firmware version among modules in component is  consistent. <br> - Firmware consistency upgrade stops. <br> - DJIUpgradeComponent_cancelConsistencyUpgrade  is invoked. Reboot the device to receive this notification again.

</div>

<div class="api-row" id="djiupgrademanager_djiupgradecomponent_didupdatelatestfirmareinformation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiupgrademanager_djiupgradecomponent_didupdatelatestfirmareinformation_inline">onLatestFirmwareInformationUpdated</a></div></div><div class="inline-doc" id="djiupgrademanager_djiupgradecomponent_didupdatelatestfirmareinformation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onLatestFirmwareInformationUpdated</h6></div>

~~~java
    void onLatestFirmwareInformationUpdated(@NonNull UpgradeComponent component, FirmwareInformation firmwareInformation)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade.component</td></tr></table></html>



##### Description:



<font color="#666">Updates the latest firmware version information when the user is logged in. Please use DJI GO/DJI Pilot to upgrade to the latest firmware.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent.html#djiupgrademanager_djiupgradecomponent">UpgradeComponent</a> <font color="#000">component</td><td><font color="#666"><i>The component of which the latest firmware version information have been updated.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent_DJIFirmwareInformation.html#djiupgrademanager_djiupgradecomponent_djifirmwareinformation">FirmwareInformation</a> <font color="#000">firmwareInformation</td><td><font color="#666"><i>The latest firmware information.</i></td></tr></table></html></div>


