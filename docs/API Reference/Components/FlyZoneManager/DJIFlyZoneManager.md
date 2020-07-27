<div class="article"><h1 ><font color="#AAA">class </font>FlyZoneManager</h1></div>

~~~java
 class FlyZoneManager implements DJIParamAccessListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Fly Zone Manager gives information about nearby fly zones, and APIs to unlock zones that can be unlocked. Depending on location, there are three types of fly zones possible:<br> <li><code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation_zonetype_circle">CIRCLE</a></code>: Cylinder or truncated cone volume with four levels of restriction:</li>
    <ul>
    <li>Warning Zones : no restriction </li>
    <li>Enhanced warning zones : Flight restricted, can be unlocked for
        flight when the user logs into their DJI account</li>
    <li>Authorization zones : Flight restricted, can be unlocked for
        flight when the user logs into their DJI account and the account
        has been authorized to unlock authorization zones.</li>
    <li>Restricted zones : Flight restricted </li>
    </ul>
<li><code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation_zonetype_poly">POLY</a></code>: Fly zone that consists of one or more sub fly zones that are cylinders or complex volumes with different height limitations. A height limitation of 0 means flight is completely restricted. This is used by Spark, Mavic, Phantom 4 Series, Inspire 2 and Matrice 200 series.</li> <br>On the Phantom 3, Inspire 1, M100, M600, A3/N3 series of products, there can also be a buffer area with radius about 23 km around a restricted fly zone where flight height is limited to 120m.</br>



##### Class Members:

<div class="api-row" id="djiflyzonemanager_setflyforbidstatusupdatedcallback"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_setflyforbidstatusupdatedcallback_inline">setFlyZoneStateCallback</a></div></div><div class="inline-doc" id="djiflyzonemanager_setflyforbidstatusupdatedcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFlyZoneStateCallback</h6></div>

~~~java
@Deprecated
 void setFlyZoneStateCallback(@Nullable FlyZoneState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets up the <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_setflyforbidstatusupdatedcallback">setFlyZoneStateCallback</a></code> for  obtaining <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_djiflyzoneinformation_flyzonestatus">FlyZoneState</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_djiflyzoneinformation_flyzonestatus">FlyZoneState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>FlyForbidStatusUpdatedCallback callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_setflysafenotificationcallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_setflysafenotificationcallback_inline">setFlySafeNotificationCallback</a></div></div><div class="inline-doc" id="djiflyzonemanager_setflysafenotificationcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFlySafeNotificationCallback</h6></div>

~~~java
 void setFlySafeNotificationCallback(@NonNull FlySafeNotification.Callback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets up the <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_setflyforbidstatusupdatedcallback">setFlyZoneStateCallback</a></code> for  obtaining <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlySafeNotification.html#djiflyzonemanager_djiflysafenotification">FlySafeNotification</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlySafeNotification.html#djiflyzonemanager_djiflysafenotification">FlySafeNotification</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>An object value of <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlySafeNotification.html#djiflyzonemanager_djiflysafenotification">FlySafeNotification</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_setbasicdatabaseupgradeprogressupdatedcallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_setbasicdatabaseupgradeprogressupdatedcallback_inline">setBasicDatabaseUpgradeProgressUpdatedCallback</a></div></div><div class="inline-doc" id="djiflyzonemanager_setbasicdatabaseupgradeprogressupdatedcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setBasicDatabaseUpgradeProgressUpdatedCallback</h6></div>

~~~java
 void setBasicDatabaseUpgradeProgressUpdatedCallback(BasicDatabaseUpgradeProgressUpdatedCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets up the <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_setbasicdatabaseupgradeprogressupdatedcallback">setBasicDatabaseUpgradeProgressUpdatedCallback</a></code> for  obtaining the basic database upgrade progress.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlyZoneManager/DJIFlyZoneManager_basicDatabaseUpgradeProgressUpdatedCallbackInterface.html#djiflyzonemanager_basicdatabaseupgradeprogressupdatedcallbackinterface">BasicDatabaseUpgradeProgressUpdatedCallback</a> <font color="#000">callback</td><td><font color="#666"><i><code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_basicDatabaseUpgradeProgressUpdatedCallbackInterface.html#djiflyzonemanager_basicdatabaseupgradeprogressupdatedcallbackinterface">BasicDatabaseUpgradeProgressUpdatedCallback</a></code> callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_getflyzonesinsurroundingarea"><div class="api-col left">Self Unlocking</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_getflyzonesinsurroundingarea_inline">getFlyZonesInSurroundingArea</a></div></div><div class="inline-doc" id="djiflyzonemanager_getflyzonesinsurroundingarea_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlyZonesInSurroundingArea</h6></div>

~~~java
 void getFlyZonesInSurroundingArea(
        @NonNull final CompletionCallbackWith<ArrayList<FlyZoneInformation>> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets all the fly zones within 20km of the aircraft. During simulation, this method is available only when the aircraft location is within 50km of (37.460484, -122.115312) or within 50km of (22.5726, 113.8124499). Use of the geographic information provided by DJIFlyZoneManager is restricted. Refer to the DJI Developer Policy.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;ArrayList&lt;<a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation">FlyZoneInformation</a>&gt;&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_getunlockedflyzones"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_getunlockedflyzones_inline">getUnlockedFlyZonesForAircraft</a></div></div><div class="inline-doc" id="djiflyzonemanager_getunlockedflyzones_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getUnlockedFlyZonesForAircraft</h6></div>

~~~java
 void getUnlockedFlyZonesForAircraft(@NonNull final CompletionCallbackWith<List<FlyZoneInformation>> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets a list of authorization fly zones unlocked by  the account for the connected aircraft. It includes fly zones unlocked by  the Flight Planner (http://www.dji.com/flysafe/geo-system#planner), and the  ones unlocked during flight using DJI Go or any DJI Mobile SDK based application.  This list does NOT include fly zones unlocked by custom unlocking. For Inspire 1  and Phantom 3 series, the list is fetched from the server.  If the internet is not  accessible, the cached local data will be used. For the other products, the list is  fetched from the aircraft.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;List&lt;<a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation">FlyZoneInformation</a>&gt;&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_unlockflyzones"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_unlockflyzones_inline">unlockFlyZones</a></div></div><div class="inline-doc" id="djiflyzonemanager_unlockflyzones_inline"

><div class="article"><h6 ><font color="#AAA">method </font>unlockFlyZones</h6></div>

~~~java
 void unlockFlyZones(@Size(min = 1) final ArrayList<Integer> ids,
                               @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Unlocks the selected fly zones. This method can be used to unlock  authorization zones. After unlocking the zones, flight will be  unrestricted in those zones until the unlock expires.  The unlocking record will be linked to the user's account and will  be accessible to DJI Go and other DJI Mobile SDK based applications.  <br> Data Protection Notes - Calling this method will send the following  protected data to DJI server: <br> - User account information <br> - The  serial number of the connected aircraft.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Size(min = 1) final ArrayList&lt;Integer&gt; <font color="#000">ids</td><td><font color="#666"><i>The IDs of <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation_flyzonecategory_authorization">AUTHORIZATION</a></code> zones.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_loadindividualunlockzonesfromserver"><div class="api-col left">Unlocked Zone Groups</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_loadindividualunlockzonesfromserver_inline">reloadUnlockedZoneGroupsFromServer</a></div></div><div class="inline-doc" id="djiflyzonemanager_loadindividualunlockzonesfromserver_inline"

><div class="article"><h6 ><font color="#AAA">method </font>reloadUnlockedZoneGroupsFromServer</h6></div>

~~~java
 void reloadUnlockedZoneGroupsFromServer(final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Reloads the unlocked zone groups unlocked by the current user's account from the server.  For all products besides Phantom 3 and Inspire 1 series this includes both self unlocked  and custom unlocked zones. Each unlocked zone group corresponds to one aircraft serial number.  After launch, SDK will call this method once. It will call this method again when either  the network connection or the current account state changes  (e.g. when a new user  successfully logs in). Call this method any other time to trigger the reloading manually.  Calling this method will NOT synchronize the loaded zone groups onto the aircraft.  To get a list of groups currently loaded from the server, call <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_getloadedunlockedzonegroups">getLoadedUnlockedZoneGroups</a></code>. User will need to manually call  <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_syncunlockedzonegrouptoaircraft">syncUnlockedZoneGroupToAircraft</a></code>  to synchronize the unlocked group to the connected aircraft after the unlocked zone groups are reloaded. This feature is not supported by Inspire 1 or Phantom 3 series. For the other  products, it can be used when <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_isindividualunlockzonesupported">isCustomUnlockZoneSupported</a></code>  returns <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i><code>completion callback</code> to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_getloadedunlockedzonegroups"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_getloadedunlockedzonegroups_inline">getLoadedUnlockedZoneGroups</a></div></div><div class="inline-doc" id="djiflyzonemanager_getloadedunlockedzonegroups_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLoadedUnlockedZoneGroups</h6></div>

~~~java
 void getLoadedUnlockedZoneGroups(final CommonCallbacks.CompletionCallbackWith<List<UnlockedZoneGroup>> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the unlocked zone groups loaded from the server. Each zone group corresponds to one aircraft.  The loaded zone groups will NOT be synchronized to the aircraft automatically. User need to manually  invoke <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_syncunlockedzonegrouptoaircraft">syncUnlockedZoneGroupToAircraft</a></code> to synchronize the unlocked zone group  to the connected aircraft. Invoke <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_loadindividualunlockzonesfromserver">reloadUnlockedZoneGroupsFromServer</a></code> to trigger  the reloading of unlocked zone groups manually. This feature is not supported by Inspire 1 or Phantom 3  series. For the other products, it can be used when <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_isindividualunlockzonesupported">isCustomUnlockZoneSupported</a></code>  returns <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;List&lt;<a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIUnlockedZoneGroup.html#djiflyzonemanager_djiunlockedzonegroup">UnlockedZoneGroup</a>&gt;&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_syncunlockedzonegrouptoaircraft"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_syncunlockedzonegrouptoaircraft_inline">syncUnlockedZoneGroupToAircraft</a></div></div><div class="inline-doc" id="djiflyzonemanager_syncunlockedzonegrouptoaircraft_inline"

><div class="article"><h6 ><font color="#AAA">method </font>syncUnlockedZoneGroupToAircraft</h6></div>

~~~java
 void syncUnlockedZoneGroupToAircraft(final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Synchronizes the unlocked zone group to the connected aircraft. SDK will select the unlocked zone group that  matches the serial number of the connected aircraft. After the unlocked zone group is synchronized to the  aircraft successfully, the latest unlocked fly zones and the custom unlock zones on the aircraft can be  checked by the follow methods: <br><br> - Unlocked fly zones: <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_getunlockedflyzones">getUnlockedFlyZonesForAircraft</a></code>  <br>- Custom unlock zones: <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_getindividualunlockzones">getCustomUnlockZonesFromAircraft</a></code> This feature is not supported  by Inspire 1 or Phantom 3 series. For the other products, it can be used when  <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_isindividualunlockzonesupported">isCustomUnlockZoneSupported</a></code> returns <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The <code>completion callback</code> with the returned result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_deleteallunlockinglicenses"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_deleteallunlockinglicenses_inline">deleteAllUnlockingLicenses</a></div></div><div class="inline-doc" id="djiflyzonemanager_deleteallunlockinglicenses_inline"

><div class="article"><h6 ><font color="#AAA">method </font>deleteAllUnlockingLicenses</h6></div>

~~~java
 void deleteAllUnlockingLicenses(@Nullable final CompletionCallback callback)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Deletes all unlocking licenses in the aircraft. Supported only by Mavic Mini and Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_getindividualunlockzones"><div class="api-col left">Custom Unlocking</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_getindividualunlockzones_inline">getCustomUnlockZonesFromAircraft</a></div></div><div class="inline-doc" id="djiflyzonemanager_getindividualunlockzones_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCustomUnlockZonesFromAircraft</h6></div>

~~~java
 void getCustomUnlockZonesFromAircraft(final CompletionCallbackWith<List<CustomUnlockZone>> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the Custom Unlock Zones currently on the aircraft. This method can only be used  when <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_isindividualunlockzonesupported">isCustomUnlockZoneSupported</a></code> is <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;List&lt;<a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIIndividualUnlockZone.html#djiflyzonemanager_djiindividualunlockzone">CustomUnlockZone</a>&gt;&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion callback that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_enableindividualunlockzone"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_enableindividualunlockzone_inline">enableCustomUnlockZone</a></div></div><div class="inline-doc" id="djiflyzonemanager_enableindividualunlockzone_inline"

><div class="article"><h6 ><font color="#AAA">method </font>enableCustomUnlockZone</h6></div>

~~~java
 void enableCustomUnlockZone(@Nullable CustomUnlockZone zone, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Enables an Custom Unlock Zones that is on the aircraft. All Custom Unlock Zones on the  aircraft can be retrieved with <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_getindividualunlockzones">getCustomUnlockZonesFromAircraft</a></code>.  At any time,  only one Custom Unlock Zone can be enabled. Enabling an Custom Unlock Zone will  disable the previously enabled zone. This method can only be used when  <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_isindividualunlockzonesupported">isCustomUnlockZoneSupported</a></code> is <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIIndividualUnlockZone.html#djiflyzonemanager_djiindividualunlockzone">CustomUnlockZone</a> <font color="#000">zone</td><td><font color="#666"><i>Custom Unlock Zone to enabled. If <code>zone</code> is <code>nil</code>, only the  previously enabled zone will be disabled.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i><code>completion callback</code> to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_getenabledindividualunlockzone"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_getenabledindividualunlockzone_inline">getEnabledCustomUnlockZone</a></div></div><div class="inline-doc" id="djiflyzonemanager_getenabledindividualunlockzone_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getEnabledCustomUnlockZone</h6></div>

~~~java
 void getEnabledCustomUnlockZone(@NonNull final CompletionCallbackWith<CustomUnlockZone> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the currently enabled Custom Unlock Zone. This method can only be used  when <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_isindividualunlockzonesupported">isCustomUnlockZoneSupported</a></code> is <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIIndividualUnlockZone.html#djiflyzonemanager_djiindividualunlockzone">CustomUnlockZone</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion callback that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_isindividualunlockzonesupported"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_isindividualunlockzonesupported_inline">isCustomUnlockZoneSupported</a></div></div><div class="inline-doc" id="djiflyzonemanager_isindividualunlockzonesupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isCustomUnlockZoneSupported</h6></div>

~~~java
 boolean isCustomUnlockZoneSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if an aircraft is connected with flight controller firmware that  supports Custom Unlock Zones. Aircraft that support Custom Unlock  zones are also able to disable unlocked fly zones temporarily.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check if Custom Unlock Zone supported.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_databaseversion"><div class="api-col left">FlySafe Database</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_databaseversion_inline">getPreciseDatabaseVersion</a></div></div><div class="inline-doc" id="djiflyzonemanager_databaseversion_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPreciseDatabaseVersion</h6></div>

~~~java
 void getPreciseDatabaseVersion(@NonNull final CompletionCallbackWith<String> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">The version of the precise fly zone database in the firmware of the aircraft.  It is <code>null</code> if <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_databasestate">getPreciseDatabaseState</a></code> is <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_djiflyzoneinformation_djiflyzonedatabasestate_initializing">INITIALIZING</a></code>.  The precise database is supported by Phantom 4 series, Inspire 2, M200 series, Mavic and Spark.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_databasestate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_databasestate_inline">getPreciseDatabaseState</a></div></div><div class="inline-doc" id="djiflyzonemanager_databasestate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPreciseDatabaseState</h6></div>

~~~java
 void getPreciseDatabaseState(@NonNull final CompletionCallbackWith<FlyZoneDatabaseState> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">The fly zone database state in the firmware of the aircraft. The SDK will compare the version of the database on the aircraft against  the latest one online. When the aircraft database is out-of-date, the user should use DJI Go or Assistant 2 to update the firmware. This  database is supported by Phantom 4 series, Inspire 2, M200 series, Mavic and Spark.  



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_djiflyzoneinformation_djiflyzonedatabasestate">FlyZoneDatabaseState</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_getbasicdatabasestate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_getbasicdatabasestate_inline">getBasicDatabaseState</a></div></div><div class="inline-doc" id="djiflyzonemanager_getbasicdatabasestate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBasicDatabaseState</h6></div>

~~~java
 void getBasicDatabaseState(@NonNull final CompletionCallbackWith<FlyZoneDatabaseState> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Get the state of the basic fly zone database on the mobile device. The SDK will compare the version  of the local database against the latest one online. When the local database is out-of-date,  call <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_startbasicdatabaseupgrade">startBasicDatabaseUpgrade</a></code> to start updating the database. If the update  is compulsory (for safety reasons), SDK will start the update automatically. The basic database is used  by DJI aircraft that do not support the precise database (e.g. Phantom 3 series, Inspire 1 series).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_djiflyzoneinformation_djiflyzonedatabasestate">FlyZoneDatabaseState</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_djiflyzoneinformation_djiflyzonedatabasestate">FlyZoneDatabaseState</a></code> enum value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_basicdatabaseversion"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_basicdatabaseversion_inline">getBasicDatabaseVersion</a></div></div><div class="inline-doc" id="djiflyzonemanager_basicdatabaseversion_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBasicDatabaseVersion</h6></div>

~~~java
 void getBasicDatabaseVersion(@NonNull final CompletionCallbackWith<String> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">The version of the basic fly zone database on the mobile device. It is <code>null</code> if the local file cannot  be parsed by SDK. The basic database is used by DJI aircraft that do not support the precise database (e.g.  Phantom 3 series, Inspire 1 series).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned String value.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_startbasicdatabaseupgrade"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_startbasicdatabaseupgrade_inline">startBasicDatabaseUpgrade</a></div></div><div class="inline-doc" id="djiflyzonemanager_startbasicdatabaseupgrade_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startBasicDatabaseUpgrade</h6></div>

~~~java
 void startBasicDatabaseUpgrade(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Starts the upgrde of the basic database. Internet access is required. When the upgrade is started successfully,  use <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_basicDatabaseUpgradeProgressUpdatedCallbackInterface.html#djiflyzonemanager_didupdatebasicdatabaseupgradeprogress">onUpdate</a></code> to monitor the progress.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i><code>completion callback</code> to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_stopbasicdatabaseupgrade"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_stopbasicdatabaseupgrade_inline">stopBasicDatabaseUpgrade</a></div></div><div class="inline-doc" id="djiflyzonemanager_stopbasicdatabaseupgrade_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopBasicDatabaseUpgrade</h6></div>

~~~java
 void stopBasicDatabaseUpgrade(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Stops the in-progress upgrade of the basic database.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i><code>completion callback</code> to receive the result.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiflyzonemanager_djiunlockedzonegroup"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIUnlockedZoneGroup.html">UnlockedZoneGroup</a></div></div><div class="api-row" id="djiflyzonemanager_djiflyzoneinformation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html">FlyZoneInformation</a></div></div><div class="api-row" id="djiflyzonemanager_djiflyzoneinformation_djiflyzonedatabasestate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyzoneinformation_djiflyzonedatabasestate_inline">FlyZoneDatabaseState</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyzoneinformation_djiflyzonedatabasestate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FlyZoneDatabaseState</h6></div>

~~~java
@EXClassNullAway
 enum FlyZoneDatabaseState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">The state of the fly zone database on the aircraft.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_djiflyzonedatabasestate_initializing_inline"></a>INITIALIZING</td><td><font color="#666">SDK is fetching the information of the database.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_djiflyzonedatabasestate_nointernetconnection_inline"></a>NO_INTERNET_CONNECTION</td><td><font color="#666">SDK cannot access the Internet, so it cannot compare the database version with the latest one on the Internet.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_djiflyzonedatabasestate_outofdate_inline"></a>OUT_OF_DATE</td><td><font color="#666">Aircraft's database version is older than the latest one.  User should use DJI Go or Assistant 2 to upgrade the firmware in order  to keep the database up to date.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_djiflyzonedatabasestate_uptodate_inline"></a>UP_TO_DATE</td><td><font color="#666">The database in the aircraft is up to date.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_djiflyzonedatabasestate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown state</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiflyzonemanager_djiflyzoneinformation_flyzonestatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyzoneinformation_flyzonestatus_inline">FlyZoneState</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyzoneinformation_flyzonestatus_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FlyZoneState</h6></div>

~~~java
@EXClassNullAway
 enum FlyZoneState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">This enum describes whether the aircraft is clear of, near, or actually in a fly zone.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonestatus_clear_inline"></a>CLEAR</td><td><font color="#666">The aircraft is not within 200 meters of any warning, enhanced warning, authorization or restricted zone.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonestatus_nearrestrictedzone_inline"></a>NEAR_RESTRICTED_ZONE</td><td><font color="#666">The aircraft is within 200 meters of an authorization or restricted zone.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonestatus_inwarningzonewithheightlimitation_inline"></a>IN_WARNING_ZONE_WITH_HEIGHT_LIMITATION</td><td><font color="#666">The aircraft is currently in a warning or enhanced warning zone and this place will  limit max flight height to 120m.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonestatus_warningzone_inline"></a>IN_WARNING_ZONE</td><td><font color="#666">The aircraft is currently in a warning or enhanced warning zone.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonestatus_restrictedzone_inline"></a>IN_RESTRICTED_ZONE</td><td><font color="#666">The aircraft is currently in an authorization or restricted zone.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonestatus_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiflyzonemanager_flyforbidstatusupdatedcallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlyZoneManager/DJIFlyZoneManager_flyForbidStatusUpdatedCallbackInterface.html">Callback</a></div></div><div class="api-row" id="djiflyzonemanager_basicdatabaseupgradeprogressupdatedcallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlyZoneManager/DJIFlyZoneManager_basicDatabaseUpgradeProgressUpdatedCallbackInterface.html">BasicDatabaseUpgradeProgressUpdatedCallback</a></div></div><div class="api-row" id="djiflyzonemanager_djiindividualunlockzone"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIIndividualUnlockZone.html">CustomUnlockZone</a></div></div><div class="api-row" id="djiflyzonemanager_djiflyingsafetywarninginformation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyingSafetyWarningInformation.html">FlySafeWarningInformation</a></div></div><div class="api-row" id="djiflyzonemanager_djiflyingsafetyseriouswarninginformation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyingSafetySeriousWarningInformation.html">FlySafeSeriousWarningInformation</a></div></div><div class="api-row" id="djiflyzonemanager_djiflyingsafetytip"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyingSafetyTip.html">FlySafeTipInformation</a></div></div><div class="api-row" id="djiflyzonemanager_djiflysafereturntohomeinformation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlySafeReturnToHomeInformation.html">FlySafeReturnToHomeInformation</a></div></div><div class="api-row" id="djiflyzonemanager_djiflysafenotification"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlySafeNotification.html">FlySafeNotification</a></div></div>
