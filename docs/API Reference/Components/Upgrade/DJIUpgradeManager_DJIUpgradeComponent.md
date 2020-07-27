<div class="article"><h1 ><font color="#AAA">class </font>UpgradeComponent</h1></div>

~~~java
 class UpgradeComponent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade.component</td></tr></table></html>



##### Description:



<font color="#666">This class is used to control components' upgrade. It also provides methods to receive  firmware consistency upgrade state and the latest firmware version information. It is  only supported by Mavic Air, Mavic 2 series, Matrice 300 RTK.



##### Class Members:

<div class="api-row" id="djiupgrademanager_djiupgradecomponent_componenttype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiupgrademanager_djiupgradecomponent_componenttype_inline">getComponentType</a></div></div><div class="inline-doc" id="djiupgrademanager_djiupgradecomponent_componenttype_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getComponentType</h6></div>

~~~java
@Nullable
 UpgradeComponentType getComponentType() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade.component</td></tr></table></html>



##### Description:



<font color="#666">Component to upgrade.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent.html#djiupgrademanager_djiupgradecomponent_djiupgradecomponenttype">UpgradeComponentType</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent.html#djiupgrademanager_djiupgradecomponent_djiupgradecomponenttype">UpgradeComponentType</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiupgrademanager_djiupgradecomponent_componentindex"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiupgrademanager_djiupgradecomponent_componentindex_inline">getIndex</a></div></div><div class="inline-doc" id="djiupgrademanager_djiupgradecomponent_componentindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getIndex</h6></div>

~~~java
 int getIndex() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade.component</td></tr></table></html>



##### Description:



<font color="#666">Returns the upgrade component index. Index is zero based.  Please refer to <code><a href="/Components/BaseComponent/DJIBaseComponent.html#djibasecomponent_index">getIndex</a></code> to get the component index. For instance, if Matrice 300 RTK can have three gimbal mounted cameras, the three camera components are with indices 0, 1 and 4.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of index.</i></td></tr></table></html></div>

<div class="api-row" id="djiupgrademanager_djiupgradecomponent_upgradestate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiupgrademanager_djiupgradecomponent_upgradestate_inline">getUpgradeState</a></div></div><div class="inline-doc" id="djiupgrademanager_djiupgradecomponent_upgradestate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getUpgradeState</h6></div>

~~~java
 UpgradeFirmwareState getUpgradeState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade.component</td></tr></table></html>



##### Description:



<font color="#666">Current firmware upgrade state.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent.html#djiupgrademanager_djiupgradecomponent_djiupgradefirmwarestate">UpgradeFirmwareState</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent.html#djiupgrademanager_djiupgradecomponent_djiupgradefirmwarestate">UpgradeFirmwareState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiupgrademanager_djiupgradecomponent_latestfirmwareinformation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiupgrademanager_djiupgradecomponent_latestfirmwareinformation_inline">getLatestFirmwareInformation</a></div></div><div class="inline-doc" id="djiupgrademanager_djiupgradecomponent_latestfirmwareinformation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLatestFirmwareInformation</h6></div>

~~~java
@Nullable
 FirmwareInformation getLatestFirmwareInformation() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade.component</td></tr></table></html>



##### Description:



<font color="#666">The latest firmware information.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent_DJIFirmwareInformation.html#djiupgrademanager_djiupgradecomponent_djifirmwareinformation">FirmwareInformation</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent_DJIFirmwareInformation.html#djiupgrademanager_djiupgradecomponent_djifirmwareinformation">FirmwareInformation</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiupgrademanager_djiupgradecomponent_addupgradefirmwarelistenerwithqueue"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiupgrademanager_djiupgradecomponent_addupgradefirmwarelistenerwithqueue_inline">addUpgradeFirmwareListener</a></div></div><div class="inline-doc" id="djiupgrademanager_djiupgradecomponent_addupgradefirmwarelistenerwithqueue_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addUpgradeFirmwareListener</h6></div>

~~~java
 void addUpgradeFirmwareListener(@NonNull UpgradeFirmwareListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade.component</td></tr></table></html>



##### Description:



<font color="#666">Adds a listener to receive the <code><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent_UpgradeFirmwareListenerInterface.html#djiupgrademanager_djiupgradecomponent_upgradefirmwarelistenerinterface">UpgradeFirmwareListener</a></code>..



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent_UpgradeFirmwareListenerInterface.html#djiupgrademanager_djiupgradecomponent_upgradefirmwarelistenerinterface">UpgradeFirmwareListener</a> <font color="#000">listener</td><td><font color="#666"><i>Listener to receive the <code><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent_UpgradeFirmwareListenerInterface.html#djiupgrademanager_djiupgradecomponent_upgradefirmwarelistenerinterface">UpgradeFirmwareListener</a></code>..  It is used to distinguish different listener and the listener will be retained.</i></td></tr></table></html></div>

<div class="api-row" id="djiupgrademanager_djiupgradecomponent_removeupgradefirmwarelistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiupgrademanager_djiupgradecomponent_removeupgradefirmwarelistener_inline">removeUpgradeFirmwareListener</a></div></div><div class="inline-doc" id="djiupgrademanager_djiupgradecomponent_removeupgradefirmwarelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeUpgradeFirmwareListener</h6></div>

~~~java
 void removeUpgradeFirmwareListener(@NonNull UpgradeFirmwareListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade.component</td></tr></table></html>



##### Description:



<font color="#666">Removes a listener that is added by passing to <code><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent.html#djiupgrademanager_djiupgradecomponent_addupgradefirmwarelistenerwithqueue">addUpgradeFirmwareListener</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent_UpgradeFirmwareListenerInterface.html#djiupgrademanager_djiupgradecomponent_upgradefirmwarelistenerinterface">UpgradeFirmwareListener</a> <font color="#000">listener</td><td><font color="#666"><i>The listener to remove.</i></td></tr></table></html></div>

<div class="api-row" id="djiupgrademanager_djiupgradecomponent_removeallupgradefirmwarelistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiupgrademanager_djiupgradecomponent_removeallupgradefirmwarelistener_inline">removeAllUpgradeFirmwareListener</a></div></div><div class="inline-doc" id="djiupgrademanager_djiupgradecomponent_removeallupgradefirmwarelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeAllUpgradeFirmwareListener</h6></div>

~~~java
 void removeAllUpgradeFirmwareListener() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade.component</td></tr></table></html>



##### Description:



<font color="#666">Remove all the listeners are added by passing to <code><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent.html#djiupgrademanager_djiupgradecomponent_addupgradefirmwarelistenerwithqueue">addUpgradeFirmwareListener</a></code>.

</div>

<div class="api-row" id="djiupgrademanager_djiupgradecomponent_cancancelconsistencyupgrade"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiupgrademanager_djiupgradecomponent_cancancelconsistencyupgrade_inline">canCancelConsistencyUpgrade</a></div></div><div class="inline-doc" id="djiupgrademanager_djiupgradecomponent_cancancelconsistencyupgrade_inline"

><div class="article"><h6 ><font color="#AAA">method </font>canCancelConsistencyUpgrade</h6></div>

~~~java
 boolean canCancelConsistencyUpgrade() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade.component</td></tr></table></html>



##### Description:



<font color="#666">Check if the consistency upgrade can be canceled. If false, please check the consistency of the firmware to ensure flight safety.  It is only supported by Mavic Air, Mavic 2 series.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiupgrademanager_djiupgradecomponent_startfirmwareconsistencyupgrade"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiupgrademanager_djiupgradecomponent_startfirmwareconsistencyupgrade_inline">startFirmwareConsistencyUpgrade</a></div></div><div class="inline-doc" id="djiupgrademanager_djiupgradecomponent_startfirmwareconsistencyupgrade_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startFirmwareConsistencyUpgrade</h6></div>

~~~java
 void startFirmwareConsistencyUpgrade(CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade.component</td></tr></table></html>



##### Description:



<font color="#666">Starts firmware consistency upgrade. Invoke <code><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent_UpgradeFirmwareListenerInterface.html#djiupgrademanager_djiupgradecomponent_didupdatefirmwareupgradeprogress">onFirmwareUpgradeProgressUpdated</a></code> to receive upgrade progress  information. Before invoking this method, please make sure that the motors are turned off and <code><a href="/Components/AirLink/DJIAirLink.html#djiairlink_wifilink">getWiFiLink</a></code> is not using. It  is only supported by Mavic Air, Mavic 2 series.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiupgrademanager_djiupgradecomponent_stopfirmwareconsistencyupgrade"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiupgrademanager_djiupgradecomponent_stopfirmwareconsistencyupgrade_inline">stopFirmwareConsistencyUpgrade</a></div></div><div class="inline-doc" id="djiupgrademanager_djiupgradecomponent_stopfirmwareconsistencyupgrade_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopFirmwareConsistencyUpgrade</h6></div>

~~~java
 void stopFirmwareConsistencyUpgrade(@Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade.component</td></tr></table></html>



##### Description:



<font color="#666">Cancels firmware consistency upgrade. <code><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent_UpgradeFirmwareListenerInterface.html#djiupgrademanager_djiupgradecomponent_didreceiveconsistencyupgraderequest">onConsistencyUpgradeRequestReceived</a></code> will stop to notify. Before  invoking this method, please make sure that the motors are turned off and <code><a href="/Components/AirLink/DJIAirLink.html#djiairlink_wifilink">getWiFiLink</a></code> is not using. It is only supported  by Mavic Air, Mavic 2 series.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiupgrademanager_djiupgradecomponent_upgradefirmwarelistenerinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent_UpgradeFirmwareListenerInterface.html">UpgradeFirmwareListener</a></div></div><div class="api-row" id="djiupgrademanager_djiupgradecomponent_djifirmwareupgradeprogress"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent_DJIFirmwareUpgradeProgress.html">FirmwareUpgradeProgress</a></div></div><div class="api-row" id="djiupgrademanager_djiupgradecomponent_djifirmwareinformation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent_DJIFirmwareInformation.html">FirmwareInformation</a></div></div><div class="api-row" id="djiupgrademanager_djiupgradecomponent_djiupgradecomponenttype"><div class="api-col left">General</div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiupgrademanager_djiupgradecomponent_djiupgradecomponenttype_inline">UpgradeComponentType</a></div></div><div class="inline-doc" id="djiupgrademanager_djiupgradecomponent_djiupgradecomponenttype_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>UpgradeComponentType</h6></div>

~~~java
 enum UpgradeComponentType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade.component.model</td></tr></table></html>



##### Description:



<font color="#666">Upgrade component.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiupgrademanager_djiupgradecomponent_djiupgradecomponenttype_remotecontroller_inline"></a>REMOTE_CONTROLLER</td><td><font color="#666">The upgrade component is remote controller.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiupgrademanager_djiupgradecomponent_djiupgradecomponenttype_aircraft_inline"></a>AIRCRAFT</td><td><font color="#666">The upgrade component is aircraft.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiupgrademanager_djiupgradecomponent_djiupgradecomponenttype_camera_inline"></a>CAMERA</td><td><font color="#666">The upgrade component is camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiupgrademanager_djiupgradecomponent_djiupgradecomponenttype_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The upgrade component is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiupgrademanager_djiupgradecomponent_djiupgradefirmwarestate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiupgrademanager_djiupgradecomponent_djiupgradefirmwarestate_inline">UpgradeFirmwareState</a></div></div><div class="inline-doc" id="djiupgrademanager_djiupgradecomponent_djiupgradefirmwarestate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>UpgradeFirmwareState</h6></div>

~~~java
 enum UpgradeFirmwareState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade.component.model</td></tr></table></html>



##### Description:



<font color="#666">Upgrade firmware state.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiupgrademanager_djiupgradecomponent_djiupgradefirmwarestate_initializating_inline"></a>INITIALIZING</td><td><font color="#666">Initializating.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiupgrademanager_djiupgradecomponent_djiupgradefirmwarestate_checking_inline"></a>CHECKING</td><td><font color="#666">Checking firmware information.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiupgrademanager_djiupgradecomponent_djiupgradefirmwarestate_uptodate_inline"></a>UP_TO_DATE</td><td><font color="#666">Firmware version is up to date.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiupgrademanager_djiupgradecomponent_djiupgradefirmwarestate_upgradestronglyrecommended_inline"></a>UPGRADE_STRONGLY_RECOMMENDED</td><td><font color="#666">To ensure flight safety, upgrade device is strongly recommended. Check DJI GO for  available firmware updates. Find more details in <code><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent_DJIFirmwareInformation.html#djiupgrademanager_djiupgradecomponent_djifirmwareinformation">FirmwareInformation</a></code>.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiupgrademanager_djiupgradecomponent_djiupgradefirmwarestate_optionalupgradeavailable_inline"></a>OPTIONAL_UPGRADE_AVAILABLE</td><td><font color="#666">Optional upgrade is available. Check DJI GO for any available firmware updates.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiupgrademanager_djiupgradecomponent_djiupgradefirmwarestate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiupgrademanager_djiupgradecomponent_djiupgradingprogressstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiupgrademanager_djiupgradecomponent_djiupgradingprogressstate_inline">UpgradingProgressState</a></div></div><div class="inline-doc" id="djiupgrademanager_djiupgradecomponent_djiupgradingprogressstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>UpgradingProgressState</h6></div>

~~~java
 enum UpgradingProgressState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade.component.model</td></tr></table></html>



##### Description:



<font color="#666">Device's firmware upgrading progress state.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiupgrademanager_djiupgradecomponent_djiupgradingprogressstate_upgrading_inline"></a>UPGRADING</td><td><font color="#666">Upgrading.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiupgrademanager_djiupgradecomponent_djiupgradingprogressstate_upgradefailed_inline"></a>UPGRADE_FAILED</td><td><font color="#666">Upgrade failed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiupgrademanager_djiupgradecomponent_djiupgradingprogressstate_upgradesuccessfully_inline"></a>UPGRADE_SUCCESSFULLY</td><td><font color="#666">Upgrade Successfully.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiupgrademanager_djiupgradecomponent_djiupgradingprogressstate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>


