<div class="article"><h1 ><font color="#AAA">class </font>AccessLocker</h1></div>

~~~java
 class AccessLocker 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">The Access Locker provides methods to control the permission to access the aircraft. For an aircraft with advanced security features, the aircraft is  locked after a user account is set up: the storage is not accessible; the live view is not available; the aircraft cannot take off. The user can unlock  the aircraft with the security code to access all features of the aircraft. The security code is encrypted in the aircraft. DJI will not be able to fetch  the security code. If the security code is forgotten, the user has to format the storage to reset the protection system. All the files in the internal  storage and the user account information will be deleted. The Access Locker is only supported by Mavic 2 Enterprise.



##### Class Members:



#### State Updates

<div class="api-row" id="djiaccesslocker_setaccesslockerstatecallback"><div class="api-col left">General</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccesslocker_setaccesslockerstatecallback_inline">setAccessLockerStateCallback</a></div></div><div class="inline-doc" id="djiaccesslocker_setaccesslockerstatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAccessLockerStateCallback</h6></div>

~~~java
 void setAccessLockerStateCallback(@Nullable AccessLockerState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Set Access Locker state update callback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Simulator/DJIAccessLocker.html#djiaccesslocker_djiaccesslockerstate">AccessLockerState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccesslocker_setformattingstatecallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccesslocker_setformattingstatecallback_inline">setFormattingStateCallback</a></div></div><div class="inline-doc" id="djiaccesslocker_setformattingstatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFormattingStateCallback</h6></div>

~~~java
 void setFormattingStateCallback(@Nullable FormattingState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Set Formatting state update callback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Simulator/DJIAccessLocker_DJIAccessLockerFormattingState.html#djiaccesslocker_djiaccesslockerformattingstate">FormattingState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccesslocker_state"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccesslocker_state_inline">getState</a></div></div><div class="inline-doc" id="djiaccesslocker_state_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getState</h6></div>

~~~java
 AccessLockerState getState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the latest state of the Access Locker.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Simulator/DJIAccessLocker.html#djiaccesslocker_djiaccesslockerstate">AccessLockerState</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Simulator/DJIAccessLocker.html#djiaccesslocker_djiaccesslockerstate">AccessLockerState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccesslocker_getversion"><div class="api-col left">Get Version</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccesslocker_getversion_inline">getVersion</a></div></div><div class="inline-doc" id="djiaccesslocker_getversion_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVersion</h6></div>

~~~java
 void getVersion(@NonNull CommonCallbacks.CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the version of the security feature.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccesslocker_getusername"><div class="api-col left">Get User Name</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccesslocker_getusername_inline">getUserAccount</a></div></div><div class="inline-doc" id="djiaccesslocker_getusername_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getUserAccount</h6></div>

~~~java
 void getUserAccount(@NonNull CommonCallbacks.CompletionCallbackWith<String> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Returns the username of the current Access Locker account.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccesslocker_setupuseraccount"><div class="api-col left">Set Up User Account</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccesslocker_setupuseraccount_inline">setUpUserAccount</a></div></div><div class="inline-doc" id="djiaccesslocker_setupuseraccount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setUpUserAccount</h6></div>

~~~java
 void setUpUserAccount(@NonNull UserAccountInfo userAccountInfo,
                                 @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets up a user account to enable the access protection of  the aircraft. After setting up a user account, the security  code of the user is required in each power-cycle of the  aircraft or the aircraft is just paired with the remote  controller. The security code is also required to access  data in the aircraft through DJI Assistant 2. This method  is only valid when the state is <code><a href="/Components/Simulator/DJIAccessLocker.html#djiaccesslocker_djiaccesslockerstate_notinitialized">NOT_INITIALIZED</a></code>. If  the method executes successfully, the state will change  to <code><a href="/Components/Simulator/DJIAccessLocker.html#djiaccesslocker_djiaccesslockerstate_unlocked">UNLOCKED</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Simulator/DJIAccessLocker_DJIAccessLockerUserAccountInfo.html#djiaccesslocker_djiaccesslockeruseraccountinfo">UserAccountInfo</a> <font color="#000">userAccountInfo</td><td><font color="#666"><i>The user account information used for setting up the access protection of the aircraft.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccesslocker_login"><div class="api-col left">Login</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccesslocker_login_inline">login</a></div></div><div class="inline-doc" id="djiaccesslocker_login_inline"

><div class="article"><h6 ><font color="#AAA">method </font>login</h6></div>

~~~java
 void login(@NonNull UserAccountInfo userAccountInfo,
                      @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Logs in to unlock the access protection of the aircraft.  This method is valid when the state is <code><a href="/Components/Simulator/DJIAccessLocker.html#djiaccesslocker_djiaccesslockerstate_locked">LOCKED</a></code>.  If the user is logged in successfully, the state will change to <code><a href="/Components/Simulator/DJIAccessLocker.html#djiaccesslocker_djiaccesslockerstate_unlocked">UNLOCKED</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Simulator/DJIAccessLocker_DJIAccessLockerUserAccountInfo.html#djiaccesslocker_djiaccesslockeruseraccountinfo">UserAccountInfo</a> <font color="#000">userAccountInfo</td><td><font color="#666"><i>The user account information used to unlock the protection.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccesslocker_modifyuseraccount"><div class="api-col left">Modify User Account</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccesslocker_modifyuseraccount_inline">modifyUserAccount</a></div></div><div class="inline-doc" id="djiaccesslocker_modifyuseraccount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>modifyUserAccount</h6></div>

~~~java
 void modifyUserAccount(@NonNull UserAccountInfo currentUserAccountInfo,
                                  @NonNull UserAccountInfo newUserAccountInfo,
                                  @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Modifies the user account. The old user account information will be overridden  by the new one. This method is valid when the state is  either <code><a href="/Components/Simulator/DJIAccessLocker.html#djiaccesslocker_djiaccesslockerstate_unlocked">UNLOCKED</a></code>  or <code><a href="/Components/Simulator/DJIAccessLocker.html#djiaccesslocker_djiaccesslockerstate_locked">LOCKED</a></code>. If the user account is  modified, the aircraft will be unlocked and the state will change  to <code><a href="/Components/Simulator/DJIAccessLocker.html#djiaccesslocker_djiaccesslockerstate_unlocked">UNLOCKED</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Simulator/DJIAccessLocker_DJIAccessLockerUserAccountInfo.html#djiaccesslocker_djiaccesslockeruseraccountinfo">UserAccountInfo</a> <font color="#000">currentUserAccountInfo</td><td><font color="#666"><i>Current user account info to be set to the Access Locker system.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Simulator/DJIAccessLocker_DJIAccessLockerUserAccountInfo.html#djiaccesslocker_djiaccesslockeruseraccountinfo">UserAccountInfo</a> <font color="#000">newUserAccountInfo</td><td><font color="#666"><i>New user account info to be set to the Access Locker system.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccesslocker_resetuseraccount"><div class="api-col left">Reset User Account</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccesslocker_resetuseraccount_inline">resetUserAccount</a></div></div><div class="inline-doc" id="djiaccesslocker_resetuseraccount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>resetUserAccount</h6></div>

~~~java
 void resetUserAccount(@NonNull UserAccountInfo userAccountInfo,
                                 @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Resets the user account to disable the protection. The user account information (e.g.  user name, security code) will be deleted and the aircraft is accessible without  validating the user. This method is valid when the state is either <code><a href="/Components/Simulator/DJIAccessLocker.html#djiaccesslocker_djiaccesslockerstate_unlocked">UNLOCKED</a></code>  or <code><a href="/Components/Simulator/DJIAccessLocker.html#djiaccesslocker_djiaccesslockerstate_locked">LOCKED</a></code>. If the user account is reset, the state will change  to <code><a href="/Components/Simulator/DJIAccessLocker.html#djiaccesslocker_djiaccesslockerstate_notinitialized">NOT_INITIALIZED</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Simulator/DJIAccessLocker_DJIAccessLockerUserAccountInfo.html#djiaccesslocker_djiaccesslockeruseraccountinfo">UserAccountInfo</a> <font color="#000">userAccountInfo</td><td><font color="#666"><i>User account info to be set to the Access Locker system.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccesslocker_format"><div class="api-col left">Format</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccesslocker_format_inline">format</a></div></div><div class="inline-doc" id="djiaccesslocker_format_inline"

><div class="article"><h6 ><font color="#AAA">method </font>format</h6></div>

~~~java
 void format(@Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Formats the protected data in the aircraft, including data in the internal storage and the user account information.  This method is only valid when the user account is set up. Use <code><a href="/Components/Simulator/DJIAccessLocker_DJIAccessLockerFormattingState.html#djiaccesslocker_djiaccesslockerformattingstate">FormattingState</a></code>  to check the progress of formatting.  When formatting is done, the state will change to <code><a href="/Components/Simulator/DJIAccessLocker.html#djiaccesslocker_djiaccesslockerstate_notinitialized">NOT_INITIALIZED</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<html><p><br></p></html>

##### Related:

<div class="api-row" id="djiaccesslocker_djiaccesslockerformattingstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Simulator/DJIAccessLocker_DJIAccessLockerFormattingState.html">FormattingState</a></div></div><div class="api-row" id="djiaccesslocker_djiaccesslockeruseraccountinfo"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Simulator/DJIAccessLocker_DJIAccessLockerUserAccountInfo.html">UserAccountInfo</a></div></div><div class="api-row" id="djiaccesslocker_djiaccesslockerstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiaccesslocker_djiaccesslockerstate_inline">AccessLockerState</a></div></div><div class="inline-doc" id="djiaccesslocker_djiaccesslockerstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>AccessLockerState</h6></div>

~~~java
 enum AccessLockerState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.accesslocker</td></tr></table></html>



##### Description:



<font color="#666">The aircraft's access locker state.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiaccesslocker_djiaccesslockerstate_notinitialized_inline"></a>NOT_INITIALIZED</td><td><font color="#666">The access locker is not initialized. Set up user account to initialize the system.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaccesslocker_djiaccesslockerstate_locked_inline"></a>LOCKED</td><td><font color="#666">The aircraft is locked and protected. In this state, the internal  storage cannot be accessed, the aircraft will stop streaming the  live view and the aircraft cannot take off. Use the Security Code  to unlock the aircraft.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaccesslocker_djiaccesslockerstate_unlocked_inline"></a>UNLOCKED</td><td><font color="#666">The aircraft is unlocked.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaccesslocker_djiaccesslockerstate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Either the aircraft is disconnected or the connected product does not  support the access locker.</td></tr></table></html>

##### Class Members:



##### Related:

<div class="api-row" id="djiaccesslocker_djiaccesslockerstate_callbackinterface"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Simulator/DJIAccessLocker_DJIAccessLockerState_CallbackInterface.html">Callback</a></div></div></div>

<div class="api-row" id="djiaccesslocker_djiaccesslockerformattingprogressstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiaccesslocker_djiaccesslockerformattingprogressstate_inline">FormattingProgressState</a></div></div><div class="inline-doc" id="djiaccesslocker_djiaccesslockerformattingprogressstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FormattingProgressState</h6></div>

~~~java
 enum FormattingProgressState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.accesslocker</td></tr></table></html>



##### Description:



<font color="#666">The aircraft's access locker formatting progress state.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiaccesslocker_djiaccesslockerformattingprogressstate_initial_inline"></a>NONE</td><td><font color="#666">No formatting operation is executing or executed in this aircraft's power cycle.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaccesslocker_djiaccesslockerformattingprogressstate_formatting_inline"></a>FORMATTING</td><td><font color="#666">The aircraft's data is being formatted.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaccesslocker_djiaccesslockerformattingprogressstate_successful_inline"></a>SUCCESSFUL</td><td><font color="#666">The aircraft has formatted data in the internal storage and the user account  set up for the security feature.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiaccesslocker_djiaccesslockerformattingprogressstate_failure_inline"></a>FAILURE</td><td><font color="#666">The formatting operation is failed. Check <code><a href="/Components/Simulator/DJIAccessLocker_DJIAccessLockerFormattingState.html#djiaccesslocker_djiaccesslockerformattingstate">FormattingState</a></code> for detail.</td></tr></table></html>

##### Class Members:

</div>


