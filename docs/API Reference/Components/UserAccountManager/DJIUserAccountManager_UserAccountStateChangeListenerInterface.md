<div class="article"><h1 ><font color="#AAA">class </font>UserAccountStateChangeListener</h1></div>

~~~java
 interface UserAccountStateChangeListener 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.useraccount</td></tr></table></html>



##### Description:



<font color="#666">Receive user account state and user account information of the user account manager.



##### Class Members:



#### Callback Method

<div class="api-row" id="djiuseraccountmanager_useraccountstatechangelistenerinterface_onuseraccountstatechanged"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiuseraccountmanager_useraccountstatechangelistenerinterface_onuseraccountstatechanged_inline">onUserAccountStateChanged</a></div></div><div class="inline-doc" id="djiuseraccountmanager_useraccountstatechangelistenerinterface_onuseraccountstatechanged_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUserAccountStateChanged</h6></div>

~~~java
        void onUserAccountStateChanged(UserAccountState state, UserAccountInformation information)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.useraccount</td></tr></table></html>



##### Description:



<font color="#666">Called when the user account manager update the user account information.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/UserAccountManager/DJIUserAccountManager.html#djiuseraccountmanager_djiuseraccountstate">UserAccountState</a> <font color="#000">state</td><td><font color="#666"><i>Provides the user account states.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/UserAccountManager/DJIUserAccountManager_UserAccountInformation.html#djiuseraccountmanager_useraccountinformation">UserAccountInformation</a> <font color="#000">information</td><td><font color="#666"><i>Provides the account information of the user account.</i></td></tr></table></html></div>


