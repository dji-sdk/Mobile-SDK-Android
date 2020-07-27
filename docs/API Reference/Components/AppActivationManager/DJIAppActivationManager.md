<div class="article"><h1 ><font color="#AAA">class </font>AppActivationManager</h1></div>

~~~java
 class AppActivationManager 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.realname</td></tr></table></html>



##### Description:



<font color="#666">DJI aircraft firmware require mobile applications that control DJI aircraft to be activated with the user's DJI account, if that application is being used in China. This will ensure operators use the correct set of geospatial information and flight functions for their aircraft, as determined by their geographical location and user profile. <br><br> A summary of the activation system is: <br><br> - Users in China are required to activate their application by logging into their DJI account at least once every three months within the application <br> - Activation will be persistent in the application until the user logs out <br> - A data connection will be required to log into a DJI account <br> - Outside of China, the SDK will automatically activate the application without requiring the user to log in <br> - Additionally, users in china are required to bind their aircraft to their user account in DJI Go. This is required only once. <br><br> If an application is not activated, the aircraft not bound (if required), or a  legacy version of the SDK (<4.1) is being used, all camera live streams will be disabled, and flight will be limited to a cylinder of 100m diameter and 30m height to ensure the aircraft stays within line of sight. <br><br> This class is used to check the state of application activation and aircraft binding.



##### Class Members:

<div class="api-row" id="djiappactivationmanager_appactivationstate"><div class="api-col left">Information</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiappactivationmanager_appactivationstate_inline">getAppActivationState</a></div></div><div class="inline-doc" id="djiappactivationmanager_appactivationstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAppActivationState</h6></div>

~~~java
@NonNull
 AppActivationState getAppActivationState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.realname</td></tr></table></html>



##### Description:



<font color="#666">Current App Activation state.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/AppActivationManager/DJIAppActivationManager.html#djiappactivationmanager_djiappactivationstate">AppActivationState</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/AppActivationManager/DJIAppActivationManager.html#djiappactivationmanager_djiappactivationstate">AppActivationState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiappactivationmanager_aircraftbindingstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiappactivationmanager_aircraftbindingstate_inline">getAircraftBindingState</a></div></div><div class="inline-doc" id="djiappactivationmanager_aircraftbindingstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAircraftBindingState</h6></div>

~~~java
@NonNull
 AircraftBindingState getAircraftBindingState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.realname</td></tr></table></html>



##### Description:



<font color="#666">Current aircraft binding state. Users in China need to bind additional account details with  the aircraft one-time through DJI Go. These details need to be bound and the application  needs to be activated by logging into their DJI Go account to lift the flight restrictions.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/AppActivationManager/DJIAppActivationManager.html#djiappactivationmanager_djiappactivationaircraftbindingstate">AircraftBindingState</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/AppActivationManager/DJIAppActivationManager.html#djiappactivationmanager_djiappactivationaircraftbindingstate">AircraftBindingState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiappactivationmanager_addaircraftbindingstatelistener"><div class="api-col left">Add Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiappactivationmanager_addaircraftbindingstatelistener_inline">addAircraftBindingStateListener</a></div></div><div class="inline-doc" id="djiappactivationmanager_addaircraftbindingstatelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addAircraftBindingStateListener</h6></div>

~~~java
 void addAircraftBindingStateListener(@NonNull AircraftBindingStateListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.realname</td></tr></table></html>



##### Description:



<font color="#666">Add the Aircraft binding state listener.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/AppActivationManager/DJIAppActivationManager_AircraftBindingStateListenerInterface.html#djiappactivationmanager_aircraftbindingstatelistenerinterface">AircraftBindingStateListener</a> <font color="#000">listener</td><td><font color="#666"><i>A listener of <code><a href="/Components/AppActivationManager/DJIAppActivationManager_AircraftBindingStateListenerInterface.html#djiappactivationmanager_aircraftbindingstatelistenerinterface">AircraftBindingStateListener</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiappactivationmanager_addappactivationstatelistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiappactivationmanager_addappactivationstatelistener_inline">addAppActivationStateListener</a></div></div><div class="inline-doc" id="djiappactivationmanager_addappactivationstatelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addAppActivationStateListener</h6></div>

~~~java
 void addAppActivationStateListener(@NonNull AppActivationStateListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.realname</td></tr></table></html>



##### Description:



<font color="#666">Add listener for the app activation state update.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/AppActivationManager/DJIAppActivationManager_AppActivationStateListenerInterface.html#djiappactivationmanager_appactivationstatelistenerinterface">AppActivationStateListener</a> <font color="#000">listener</td><td><font color="#666"><i>A listener of <code><a href="/Components/AppActivationManager/DJIAppActivationManager_AppActivationStateListenerInterface.html#djiappactivationmanager_appactivationstatelistenerinterface">AppActivationStateListener</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiappactivationmanager_removeaircraftbindingstatelistener"><div class="api-col left">Remove Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiappactivationmanager_removeaircraftbindingstatelistener_inline">removeAircraftBindingStateListener</a></div></div><div class="inline-doc" id="djiappactivationmanager_removeaircraftbindingstatelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeAircraftBindingStateListener</h6></div>

~~~java
 void removeAircraftBindingStateListener(@NonNull AircraftBindingStateListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.realname</td></tr></table></html>



##### Description:



<font color="#666">Remove the aircraft binding state listener.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/AppActivationManager/DJIAppActivationManager_AircraftBindingStateListenerInterface.html#djiappactivationmanager_aircraftbindingstatelistenerinterface">AircraftBindingStateListener</a> <font color="#000">listener</td><td><font color="#666"><i>A listener of <code><a href="/Components/AppActivationManager/DJIAppActivationManager_AircraftBindingStateListenerInterface.html#djiappactivationmanager_aircraftbindingstatelistenerinterface">AircraftBindingStateListener</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiappactivationmanager_removeappactivationstatelistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiappactivationmanager_removeappactivationstatelistener_inline">removeAppActivationStateListener</a></div></div><div class="inline-doc" id="djiappactivationmanager_removeappactivationstatelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeAppActivationStateListener</h6></div>

~~~java
 void removeAppActivationStateListener(@NonNull AppActivationStateListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.realname</td></tr></table></html>



##### Description:



<font color="#666">Remove activation state listener.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/AppActivationManager/DJIAppActivationManager_AppActivationStateListenerInterface.html#djiappactivationmanager_appactivationstatelistenerinterface">AppActivationStateListener</a> <font color="#000">listener</td><td><font color="#666"><i>A listener of <code><a href="/Components/AppActivationManager/DJIAppActivationManager_AppActivationStateListenerInterface.html#djiappactivationmanager_appactivationstatelistenerinterface">AppActivationStateListener</a></code>.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiappactivationmanager_djiappactivationaircraftbindingstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiappactivationmanager_djiappactivationaircraftbindingstate_inline">AircraftBindingState</a></div></div><div class="inline-doc" id="djiappactivationmanager_djiappactivationaircraftbindingstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>AircraftBindingState</h6></div>

~~~java
@EXClassNullAway
 enum AircraftBindingState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.realname</td></tr></table></html>



##### Description:



<font color="#666">The aircraft's binding state.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiappactivationmanager_djiappactivationaircraftbindingstate_initial_inline"></a>INITIAL</td><td><font color="#666">The binding state of the aircraft is not yet determined. The aircraft will only be in this  state until DJI Go or a DJI Mobile SDK based application rights the binding information to  the aircraft. Binding is only required if the user is in China. If the user is not in China,  then this state will become <code><a href="/Components/AppActivationManager/DJIAppActivationManager.html#djiappactivationmanager_djiappactivationaircraftbindingstate_notrequired">NOT_REQUIRED</a></code> after the  country code check is complete. If country code check has been disabled, the user will need  to use DJI Go to move to the <code><a href="/Components/AppActivationManager/DJIAppActivationManager.html#djiappactivationmanager_djiappactivationaircraftbindingstate_notrequired">NOT_REQUIRED</a></code> state. In  this state, the aircraft will have the 30m height and 50m radius limitation.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiappactivationmanager_djiappactivationaircraftbindingstate_unbound_inline"></a>UNBOUND</td><td><font color="#666">The aircraft is not currently bound, and needs to be (as it is in China). In this state, the  aircraft will have 30m max flight height and 50m max flight distance limitation. User should  finish the one-off binding process with DJI Go to remove the flight limitation.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiappactivationmanager_djiappactivationaircraftbindingstate_unboundbutcannotsync_inline"></a>UNBOUND_BUT_CANNOT_SYNC</td><td><font color="#666">The aircraft is flying inside China and is unbound. The aircraft can be bound using DJI Go.  If DJI Go is connected to the aircraft, then the binding will be stored in the aircraft. If  DJI Go is not connected to the aircraft during the binding process, then the binding result  will be stored on a server. The SDK can query this server to see if the binding has already  happened, and if it has, download the binding to the aircraft. However, if the aircraft is  unbound, and the server is not reachable, then this state will be presented. The user should  connect the mobile device to the Internet to refresh this state.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiappactivationmanager_djiappactivationaircraftbindingstate_bound_inline"></a>BOUND</td><td><font color="#666">The aircraft is bound.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiappactivationmanager_djiappactivationaircraftbindingstate_notrequired_inline"></a>NOT_REQUIRED</td><td><font color="#666">The aircraft is not bound but it is not currently located in China. Therefore,  binding the aircraft is not required.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiappactivationmanager_djiappactivationaircraftbindingstate_notsupported_inline"></a>NOT_SUPPORTED</td><td><font color="#666">The aircraft's firmware does not support the App Activation system.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiappactivationmanager_djiappactivationaircraftbindingstate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Either the aircraft is disconnected or the connected product is not a DJI aircraft.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiappactivationmanager_djiappactivationstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiappactivationmanager_djiappactivationstate_inline">AppActivationState</a></div></div><div class="inline-doc" id="djiappactivationmanager_djiappactivationstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>AppActivationState</h6></div>

~~~java
@EXClassNullAway
 enum AppActivationState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.realname</td></tr></table></html>



##### Description:



<font color="#666">The App Activation state.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiappactivationmanager_djiappactivationstate_notsupported_inline"></a>NOT_SUPPORTED</td><td><font color="#666">The aircraft's firmware does not support the App Activation System.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiappactivationmanager_djiappactivationstate_loginrequired_inline"></a>LOGIN_REQUIRED</td><td><font color="#666">The application needs to be activated by the user through their DJI account.  Use <code><a href="/Components/UserAccountManager/DJIUserAccountManager.html#djiuseraccountmanager">UserAccountManager</a></code> to enable the user to log in. Log in is only required if the  aircraft is located in China.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiappactivationmanager_djiappactivationstate_activated_inline"></a>ACTIVATED</td><td><font color="#666">The application is activated and flight restrictions turned off.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiappactivationmanager_djiappactivationstate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Either the aircraft is disconnected or the connected product is not a DJI aircraft.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiappactivationmanager_aircraftbindingstatelistenerinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/AppActivationManager/DJIAppActivationManager_AircraftBindingStateListenerInterface.html">AircraftBindingStateListener</a></div></div><div class="api-row" id="djiappactivationmanager_appactivationstatelistenerinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/AppActivationManager/DJIAppActivationManager_AppActivationStateListenerInterface.html">AppActivationStateListener</a></div></div>
