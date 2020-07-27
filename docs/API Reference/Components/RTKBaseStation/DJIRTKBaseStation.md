<div class="article"><h1 ><font color="#AAA">class </font>BaseStation</h1></div>

~~~java
 class BaseStation extends BaseComponent implements DJIParamAccessListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.basestation</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>BaseComponent implements DJIParamAccessListener</code></td></tr></table></html>



##### Description:



<font color="#666">RTK Base Station.



##### Class Members:

<div class="api-row" id="djirtkbasestation_getbasestationreferencinglocation"><div class="api-col left">Referencing Location</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtkbasestation_getbasestationreferencinglocation_inline">getBaseStationReferencingLocation</a></div></div><div class="inline-doc" id="djirtkbasestation_getbasestationreferencinglocation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBaseStationReferencingLocation</h6></div>

~~~java
 void getBaseStationReferencingLocation(@Nullable CommonCallbacks.CompletionCallbackWith<LocationCoordinate3D> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.basestation</td></tr></table></html>



##### Description:



<font color="#666">Gets the referencing location manually configured to the  base station. When a user can get a more accurate  location (coordinate with less absolute error) of the base  station by using external tools, the accurate location can  be set to the base station to improve the accuracy of the  aircraft location. If the offset between the referencing  location and the location detected by the ground system is  larger than 5 meters, the base station will ignore the referencing  location. It is only supported by Phantom 4 RTK and M200 series v2 and Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;<a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate3D.html#djiflightcontroller_djilocationcoordinate3d">LocationCoordinate3D</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion block that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djirtkbasestation_setbasestationreferencinglocation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtkbasestation_setbasestationreferencinglocation_inline">setBaseStationReferencingLocation</a></div></div><div class="inline-doc" id="djirtkbasestation_setbasestationreferencinglocation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setBaseStationReferencingLocation</h6></div>

~~~java
 void setBaseStationReferencingLocation(@NonNull LocationCoordinate3D location, @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.basestation</td></tr></table></html>



##### Description:



<font color="#666">Sets the referencing location of the base station to improve the accuracy.  When a user  can get a more accurate location (coordinate with less absolute error)  of the base station  by using external tools, the accurate location can be set to the  base station to improve  the accuracy of the aircraft location. If the offset between  the referencing location and  the location detected by the base station is larger than  5 meters, the base station will ignore the referencing location. It is only supported  by Phantom 4 RTK and M200 series v2 and Matrice 300 RTK. For Matrice 300 RTK, device  administrator authentication is required before invoking this method.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate3D.html#djiflightcontroller_djilocationcoordinate3d">LocationCoordinate3D</a> <font color="#000">location</td><td><font color="#666"><i>The referencing location of the base station.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion block that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djirtkbasestation_resetrtkbasestationlocation"><div class="api-col left">Reset Location</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtkbasestation_resetrtkbasestationlocation_inline">resetBaseStationReferencingLocation</a></div></div><div class="inline-doc" id="djirtkbasestation_resetrtkbasestationlocation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>resetBaseStationReferencingLocation</h6></div>

~~~java
 void resetBaseStationReferencingLocation(@Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.basestation</td></tr></table></html>



##### Description:



<font color="#666">Reset RTK base station's location. This will make base station's location type  became <code><a href="/Components/RTKBaseStation/DJIRTKBaseStation.html#djirtkbasestation_djirtkbasestationlocationtype_auto">AUTO</a></code>. The previously set location  by <code><a href="/Components/RTKBaseStation/DJIRTKBaseStation.html#djirtkbasestation_setbasestationreferencinglocation">setBaseStationReferencingLocation</a></code> will be invalid. For Matrice 300 RTK,  device administrator authentication is required before invoking this method.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Callback that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djirtkbasestation_hasdeviceadminloggedin"><div class="api-col left">Login In</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtkbasestation_hasdeviceadminloggedin_inline">hasDeviceAdminLoggedIn</a></div></div><div class="inline-doc" id="djirtkbasestation_hasdeviceadminloggedin_inline"

><div class="article"><h6 ><font color="#AAA">method </font>hasDeviceAdminLoggedIn</h6></div>

~~~java
 boolean hasDeviceAdminLoggedIn() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.basestation</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if device administrator has logged in. For Matrice 300 RTK, device administrator authentication is required before  changing any settings, including base station's name, base station's password, and base station's referencing location.  Device administrator login is required every time when the application is relaunched. Please login with default password  123456, if the base station's password is reset. Supported only by Matrice 300 RTK.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>The result whether login or not.</i></td></tr></table></html></div>

<div class="api-row" id="djirtkbasestation_loginasdeviceadmin"><div class="api-col left">Login As Device Admin</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtkbasestation_loginasdeviceadmin_inline">logInAsDeviceAdmin</a></div></div><div class="inline-doc" id="djirtkbasestation_loginasdeviceadmin_inline"

><div class="article"><h6 ><font color="#AAA">method </font>logInAsDeviceAdmin</h6></div>

~~~java
 void logInAsDeviceAdmin(@NonNull String password, @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.basestation</td></tr></table></html>



##### Description:



<font color="#666">Log in as base station administrator account with password to change setting. User will need to login again in the following scenarios: <br> -  Enter the application for the first time. <br> - Re-enter after the application restarts. <br> - Reset password via the button on the base  station. <br> - Switch and connect other base stations. <br> The default password is <code>123456</code>. It is only supported by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull String <font color="#000">password</td><td><font color="#666"><i>The password of base station.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The completion callback block that receives the result.</i></td></tr></table></html></div>

<div class="api-row" id="djirtkbasestation_logout"><div class="api-col left">Login Out</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtkbasestation_logout_inline">logOut</a></div></div><div class="inline-doc" id="djirtkbasestation_logout_inline"

><div class="article"><h6 ><font color="#AAA">method </font>logOut</h6></div>

~~~java
 void logOut(@Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.basestation</td></tr></table></html>



##### Description:



<font color="#666">Log out of the base station. It is only supported by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion block that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djirtkbasestation_changepassword"><div class="api-col left">Change Password</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtkbasestation_changepassword_inline">changePassword</a></div></div><div class="inline-doc" id="djirtkbasestation_changepassword_inline"

><div class="article"><h6 ><font color="#AAA">method </font>changePassword</h6></div>

~~~java
 void changePassword(@NonNull String oldPassword, @NonNull String newPassword, @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.basestation</td></tr></table></html>



##### Description:



<font color="#666">Change the password for current base station. The password must be 6 digits. It is only supported by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull String <font color="#000">oldPassword</td><td><font color="#666"><i>The old password.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull String <font color="#000">newPassword</td><td><font color="#666"><i>The new password that you want to change.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The completion callback that receives the result.</i></td></tr></table></html></div>

<div class="api-row" id="djirtkbasestation_setname"><div class="api-col left">Set Name</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtkbasestation_setname_inline">setName</a></div></div><div class="inline-doc" id="djirtkbasestation_setname_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setName</h6></div>

~~~java
 void setName(@NonNull String name, @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.basestation</td></tr></table></html>



##### Description:



<font color="#666">Change the name of the base station. The name is composed of maximum 4 characters or numbers.  Please log in before invoking this method. It is only supported by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull String <font color="#000">name</td><td><font color="#666"><i>The name of the base station set by the user.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion block that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djirtkbasestation_getname"><div class="api-col left">Get Name</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtkbasestation_getname_inline">getName</a></div></div><div class="inline-doc" id="djirtkbasestation_getname_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getName</h6></div>

~~~java
 void getName(@Nullable CommonCallbacks.CompletionCallbackWith<String> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.basestation</td></tr></table></html>



##### Description:



<font color="#666">Gets the name of the base station. Please log in before invoking this method. It is only supported by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion block that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djirtkbasestation_addbasestationbatterystateupdatedcallback"><div class="api-col left">Add Callback</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtkbasestation_addbasestationbatterystateupdatedcallback_inline">addBaseStationBatteryStateUpdatedCallback</a></div></div><div class="inline-doc" id="djirtkbasestation_addbasestationbatterystateupdatedcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addBaseStationBatteryStateUpdatedCallback</h6></div>

~~~java
 void addBaseStationBatteryStateUpdatedCallback(@NonNull BaseStationBatteryState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.basestation</td></tr></table></html>



##### Description:



<font color="#666">Adds a callback to receive the latest base station battery state. Only Supported by Phantom  4 RTK and M200 series v2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/RTKBaseStation/DJIRTKBaseStation_DJIRTKBaseStationBatteryState.html#djirtkbasestation_djirtkbasestationbatterystate">BaseStationBatteryState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>Callback to receive base station battery state.</i></td></tr></table></html></div>

<div class="api-row" id="djirtkbasestation_addbasestationstateupdatedcallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtkbasestation_addbasestationstateupdatedcallback_inline">addBaseStationStateUpdatedCallback</a></div></div><div class="inline-doc" id="djirtkbasestation_addbasestationstateupdatedcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addBaseStationStateUpdatedCallback</h6></div>

~~~java
 void addBaseStationStateUpdatedCallback(@NonNull BaseStationState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.basestation</td></tr></table></html>



##### Description:



<font color="#666">Adds a callback to receive the latest base station state. Only Supported by Phantom 4 RTK and M200 series v2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/RTKBaseStation/DJIRTKBaseStation_DJIRTKBaseStationState.html#djirtkbasestation_djirtkbasestationstate">BaseStationState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>Callback to receive base station state.</i></td></tr></table></html></div>

<div class="api-row" id="djirtkbasestation_removebasestationbatterystateupdatedcallback"><div class="api-col left">Remove Callback</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtkbasestation_removebasestationbatterystateupdatedcallback_inline">removeBaseStationBatteryStateUpdatedCallback</a></div></div><div class="inline-doc" id="djirtkbasestation_removebasestationbatterystateupdatedcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeBaseStationBatteryStateUpdatedCallback</h6></div>

~~~java
 void removeBaseStationBatteryStateUpdatedCallback(@NonNull BaseStationBatteryState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.basestation</td></tr></table></html>



##### Description:



<font color="#666">Removes a callback that receives the latest base station battery state. Only Supported by  Phantom 4 RTK and M200 series v2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/RTKBaseStation/DJIRTKBaseStation_DJIRTKBaseStationBatteryState.html#djirtkbasestation_djirtkbasestationbatterystate">BaseStationBatteryState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>Callback to receive base station battery state.</i></td></tr></table></html></div>

<div class="api-row" id="djirtkbasestation_removebasestationstateupdatedcallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtkbasestation_removebasestationstateupdatedcallback_inline">removeBaseStationStateUpdatedCallback</a></div></div><div class="inline-doc" id="djirtkbasestation_removebasestationstateupdatedcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeBaseStationStateUpdatedCallback</h6></div>

~~~java
 void removeBaseStationStateUpdatedCallback(@NonNull BaseStationState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.basestation</td></tr></table></html>



##### Description:



<font color="#666">Removes a callback that receives the latest base station state.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/RTKBaseStation/DJIRTKBaseStation_DJIRTKBaseStationState.html#djirtkbasestation_djirtkbasestationstate">BaseStationState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>Callback to receive base station state.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djirtkbasestation_djirtkbasestationlocationtype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djirtkbasestation_djirtkbasestationlocationtype_inline">BaseStationLocationType</a></div></div><div class="inline-doc" id="djirtkbasestation_djirtkbasestationlocationtype_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>BaseStationLocationType</h6></div>

~~~java
 enum BaseStationLocationType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.basestation</td></tr></table></html>



##### Description:



<font color="#666">All the possible basestation location type of <code><a href="/Components/RTKBaseStation/DJIRTKBaseStation.html#djirtkbasestation_djirtkbasestationlocationtype">BaseStationLocationType</a></code>.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djirtkbasestation_djirtkbasestationlocationtype_auto_inline"></a>AUTO</td><td><font color="#666">BaseStation current location is auto calculateed by BaseStation itself.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtkbasestation_djirtkbasestationlocationtype_manual_inline"></a>MANUAL</td><td><font color="#666">BaseStation current location is manually set by user.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtkbasestation_djirtkbasestationlocationtype_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown BaseStation location type.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djirtkbasestation_djirtkbasestationbatterystate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RTKBaseStation/DJIRTKBaseStation_DJIRTKBaseStationBatteryState.html">BaseStationBatteryState</a></div></div><div class="api-row" id="djirtkbasestation_djirtkbasestationstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RTKBaseStation/DJIRTKBaseStation_DJIRTKBaseStationState.html">BaseStationState</a></div></div>
