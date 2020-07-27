<div class="article"><h1 ><font color="#AAA">class </font>UserAccountManager</h1></div>

~~~java
 class UserAccountManager 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.useraccount</td></tr></table></html>



##### Description:



<font color="#666">Class used to manage the DJI account.



##### Class Members:

<div class="api-row" id="djiuseraccountmanager_loggedindjiuseraccountname"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiuseraccountmanager_loggedindjiuseraccountname_inline">getLoggedInDJIUserAccountName</a></div></div><div class="inline-doc" id="djiuseraccountmanager_loggedindjiuseraccountname_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLoggedInDJIUserAccountName</h6></div>

~~~java
 void getLoggedInDJIUserAccountName(@NonNull final CommonCallbacks.CompletionCallbackWith<String> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.useraccount</td></tr></table></html>



##### Description:



<font color="#666">The name of the currently logged in user account.  



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiuseraccountmanager_getuseraccountstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiuseraccountmanager_getuseraccountstate_inline">getUserAccountState</a></div></div><div class="inline-doc" id="djiuseraccountmanager_getuseraccountstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getUserAccountState</h6></div>

~~~java
@NonNull
 UserAccountState getUserAccountState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.useraccount</td></tr></table></html>



##### Description:



<font color="#666">Gets the DJI user account state.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/UserAccountManager/DJIUserAccountManager.html#djiuseraccountmanager_djiuseraccountstate">UserAccountState</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/UserAccountManager/DJIUserAccountManager.html#djiuseraccountmanager_djiuseraccountstate">UserAccountState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiuseraccountmanager_logintodjiuseraccountwithauthorizationrequired"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiuseraccountmanager_logintodjiuseraccountwithauthorizationrequired_inline">logIntoDJIUserAccount</a></div></div><div class="inline-doc" id="djiuseraccountmanager_logintodjiuseraccountwithauthorizationrequired_inline"

><div class="article"><h6 ><font color="#AAA">method </font>logIntoDJIUserAccount</h6></div>

~~~java
 void logIntoDJIUserAccount(@NonNull Context context,
                                      @Nullable
                                      final CommonCallbacks.CompletionCallbackWith<UserAccountState> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.useraccount</td></tr></table></html>



##### Description:



<font color="#666">After invoking this method, a dialog redirecting users to log into their DJI account  will be shown. For users outside of China, authorization is required to unlock  authorization zones. After the login process, if <code>authorizationRequired</code> is <code>true</code>,  and the user is currently out of China and the account has not been authorized to  unlock authorization zones, the dialog will then redirect users to authorize their account.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull Context <font color="#000">context</td><td><font color="#666"><i>The android activity's or view's context.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable                                       final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;<a href="/Components/UserAccountManager/DJIUserAccountManager.html#djiuseraccountmanager_djiuseraccountstate">UserAccountState</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiuseraccountmanager_logoutofdjiuseraccount"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiuseraccountmanager_logoutofdjiuseraccount_inline">logoutOfDJIUserAccount</a></div></div><div class="inline-doc" id="djiuseraccountmanager_logoutofdjiuseraccount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>logoutOfDJIUserAccount</h6></div>

~~~java
 void logoutOfDJIUserAccount(@Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.useraccount</td></tr></table></html>



##### Description:



<font color="#666">Logs out the DJI user that is logged in.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The <code>completion callback</code> with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiuseraccountmanager_adduseraccountstatechangelistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiuseraccountmanager_adduseraccountstatechangelistener_inline">addUserAccountStateChangeListener</a></div></div><div class="inline-doc" id="djiuseraccountmanager_adduseraccountstatechangelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>addUserAccountStateChangeListener</h6></div>

~~~java
 void addUserAccountStateChangeListener(UserAccountStateChangeListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.useraccount</td></tr></table></html>



##### Description:



<font color="#666">Start listen to the update of the user account state.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/UserAccountManager/DJIUserAccountManager_UserAccountStateChangeListenerInterface.html#djiuseraccountmanager_useraccountstatechangelistenerinterface">UserAccountStateChangeListener</a> <font color="#000">listener</td><td><font color="#666"><i>A <code><a href="/Components/UserAccountManager/DJIUserAccountManager_UserAccountStateChangeListenerInterface.html#djiuseraccountmanager_useraccountstatechangelistenerinterface">UserAccountStateChangeListener</a></code> interface.</i></td></tr></table></html></div>

<div class="api-row" id="djiuseraccountmanager_removeuseraccountstatechangelistener"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiuseraccountmanager_removeuseraccountstatechangelistener_inline">removeUserAccountStateChangeListener</a></div></div><div class="inline-doc" id="djiuseraccountmanager_removeuseraccountstatechangelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>removeUserAccountStateChangeListener</h6></div>

~~~java
 void removeUserAccountStateChangeListener(UserAccountStateChangeListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.useraccount</td></tr></table></html>



##### Description:



<font color="#666">Remove the listener.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/UserAccountManager/DJIUserAccountManager_UserAccountStateChangeListenerInterface.html#djiuseraccountmanager_useraccountstatechangelistenerinterface">UserAccountStateChangeListener</a> <font color="#000">listener</td><td><font color="#666"><i>A <code><a href="/Components/UserAccountManager/DJIUserAccountManager_UserAccountStateChangeListenerInterface.html#djiuseraccountmanager_useraccountstatechangelistenerinterface">UserAccountStateChangeListener</a></code> interface.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiuseraccountmanager_useraccountstatechangelistenerinterface"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/UserAccountManager/DJIUserAccountManager_UserAccountStateChangeListenerInterface.html">UserAccountStateChangeListener</a></div></div><div class="api-row" id="djiuseraccountmanager_useraccountinformation"><div class="api-col left">Account Information</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/UserAccountManager/DJIUserAccountManager_UserAccountInformation.html">UserAccountInformation</a></div></div><div class="api-row" id="djiuseraccountmanager_djiuseraccountstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiuseraccountmanager_djiuseraccountstate_inline">UserAccountState</a></div></div><div class="inline-doc" id="djiuseraccountmanager_djiuseraccountstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>UserAccountState</h6></div>

~~~java
@EXClassNullAway
 enum UserAccountState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.useraccount</td></tr></table></html>



##### Description:



<font color="#666">User account status. Users need to be logged in.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiuseraccountmanager_djiuseraccountstate_notloggedin_inline"></a>NOT_LOGGED_IN</td><td><font color="#666">User is not logged in. User needs to be logged in to retrieve currently unlocked,  and unlock authorization zones.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiuseraccountmanager_djiuseraccountstate_notauthorized_inline"></a>NOT_AUTHORIZED</td><td><font color="#666">User is logged in but has not been authorized to unlock authorization zones.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiuseraccountmanager_djiuseraccountstate_authorized_inline"></a>AUTHORIZED</td><td><font color="#666">User is logged in and has been authorized to unlock authorization zones.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiuseraccountmanager_djiuseraccountstate_tokenoutofdate_inline"></a>TOKEN_OUT_OF_DATE</td><td><font color="#666">The token of the user account is out of date.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiuseraccountmanager_djiuseraccountstate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>


