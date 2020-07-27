<div class="article"><h1 ><font color="#AAA">class </font>UpgradeManager</h1></div>

~~~java
 class UpgradeManager 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade</td></tr></table></html>



##### Description:



<font color="#666">This interface is used to manage the component that can be upgraded. It is only supported by Mavic Air, Mavic 2 series and Matrice 300 RTK.



##### Class Members:

<div class="api-row" id="djiupgrademanager_aircraft"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiupgrademanager_aircraft_inline">getAircraftUpgradeComponent</a></div></div><div class="inline-doc" id="djiupgrademanager_aircraft_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAircraftUpgradeComponent</h6></div>

~~~java
@Nullable
 UpgradeComponent getAircraftUpgradeComponent() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade</td></tr></table></html>



##### Description:



<font color="#666">The upgrade component is aircraft. Upgrade this component when gimbal, battery, flight  controller and other internal modules' firmware versions are inconsistent. It is only  supported by Mavic Air, Mavic 2 series.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent.html#djiupgrademanager_djiupgradecomponent">UpgradeComponent</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent.html#djiupgrademanager_djiupgradecomponent">UpgradeComponent</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiupgrademanager_remotecontroller"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiupgrademanager_remotecontroller_inline">getRemoteControllerUpgradeComponent</a></div></div><div class="inline-doc" id="djiupgrademanager_remotecontroller_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRemoteControllerUpgradeComponent</h6></div>

~~~java
@Nullable
 UpgradeComponent getRemoteControllerUpgradeComponent() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade</td></tr></table></html>



##### Description:



<font color="#666">The upgrade component is remote controller. Upgrade this component when its internal  modules' firmware versions are inconsistent. It is only supported by Mavic 2 series.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent.html#djiupgrademanager_djiupgradecomponent">UpgradeComponent</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent.html#djiupgrademanager_djiupgradecomponent">UpgradeComponent</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiupgrademanager_getdetectedcomponentstoupgrade"><div class="api-col left">Upgrade</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiupgrademanager_getdetectedcomponentstoupgrade_inline">getDetectedComponentsToUpgrade</a></div></div><div class="inline-doc" id="djiupgrademanager_getdetectedcomponentstoupgrade_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDetectedComponentsToUpgrade</h6></div>

~~~java
@NonNull
 List<UpgradeComponent> getDetectedComponentsToUpgrade() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade</td></tr></table></html>



##### Description:



<font color="#666">Get the list of detected components that can be upgraded. The list will change when a component is added or removed.  Upgrade a component in the list when its internal modules' firmware versions are inconsistent.  It is only supported by Matrice 300 RTK.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;<a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent.html#djiupgrademanager_djiupgradecomponent">UpgradeComponent</a>&gt;</td><td><font color="#666"><i>A list of <code><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent.html#djiupgrademanager_djiupgradecomponent">UpgradeComponent</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiupgrademanager_addupgradecomponentchangelistener"><div class="api-col left">Upgrade listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiupgrademanager_addupgradecomponentchangelistener_inline">addUpgradeComponentChangeListener</a></div></div><div class="inline-doc" id="djiupgrademanager_addupgradecomponentchangelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addUpgradeComponentChangeListener</h6></div>

~~~java
 void addUpgradeComponentChangeListener(@NonNull UpgradeComponentChangeListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade</td></tr></table></html>



##### Description:



<font color="#666">Adds a listener to receive the <code><a href="/Components/Upgrade/DJIUpgradeManager_UpgradeComponentChangeListener.html#djiupgrademanager_upgradecomponentchangelistener">UpgradeComponentChangeListener</a></code>.  It is only supported by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Upgrade/DJIUpgradeManager_UpgradeComponentChangeListener.html#djiupgrademanager_upgradecomponentchangelistener">UpgradeComponentChangeListener</a> <font color="#000">listener</td><td><font color="#666"><i>An object of <code><a href="/Components/Upgrade/DJIUpgradeManager_UpgradeComponentChangeListener.html#djiupgrademanager_upgradecomponentchangelistener">UpgradeComponentChangeListener</a></code> to be added in the internal listener map.</i></td></tr></table></html></div>

<div class="api-row" id="djiupgrademanager_removeupgradecomponentchangelistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiupgrademanager_removeupgradecomponentchangelistener_inline">removeUpgradeComponentChangeListener</a></div></div><div class="inline-doc" id="djiupgrademanager_removeupgradecomponentchangelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeUpgradeComponentChangeListener</h6></div>

~~~java
 void removeUpgradeComponentChangeListener(@NonNull UpgradeComponentChangeListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade</td></tr></table></html>



##### Description:



<font color="#666">Removes a listener that is added by passing to <code><a href="/Components/Upgrade/DJIUpgradeManager.html#djiupgrademanager_addupgradecomponentchangelistener">addUpgradeComponentChangeListener</a></code>. It is only supported by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Upgrade/DJIUpgradeManager_UpgradeComponentChangeListener.html#djiupgrademanager_upgradecomponentchangelistener">UpgradeComponentChangeListener</a> <font color="#000">listener</td><td><font color="#666"><i>The listener to be removed in the internal listener map.</i></td></tr></table></html></div>

<div class="api-row" id="djiupgrademanager_removeallupgradecomponentchangelistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiupgrademanager_removeallupgradecomponentchangelistener_inline">removeAllUpgradeComponentChangeListener</a></div></div><div class="inline-doc" id="djiupgrademanager_removeallupgradecomponentchangelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeAllUpgradeComponentChangeListener</h6></div>

~~~java
 void removeAllUpgradeComponentChangeListener() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.upgrade</td></tr></table></html>



##### Description:



<font color="#666">Remove all the listeners are added by passing to <code><a href="/Components/Upgrade/DJIUpgradeManager.html#djiupgrademanager_addupgradecomponentchangelistener">addUpgradeComponentChangeListener</a></code>. It is only supported by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">SOURCE_DIFFERENT <font color="#000">listener</td><td><font color="#666"><i>The listener to be removed in the internal listener map.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiupgrademanager_djiupgradecomponent"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Upgrade/DJIUpgradeManager_DJIUpgradeComponent.html">UpgradeComponent</a></div></div><div class="api-row" id="djiupgrademanager_upgradecomponentchangelistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Upgrade/DJIUpgradeManager_UpgradeComponentChangeListener.html">UpgradeComponentChangeListener</a></div></div>
