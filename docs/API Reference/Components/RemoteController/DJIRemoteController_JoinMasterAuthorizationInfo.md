<div class="article"><h1 ><font color="#AAA">class </font>AuthorizationInfo</h1></div>

~~~java
@EXClassNullAway
 class AuthorizationInfo 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_connect_to_master_with_id_key">RemoteControllerKey.CONNECT_TO_MASTER_WITH_ID</a></td></tr></table></html>



##### Description:



<font color="#666">Joins the master remote controller with the specific ID. If the remote controller has joined the same master before, the authentication code is not required until the master remote controller changes its authentication code. In this case, <code>code</code> can be <code>null</code>. It can only be called when the remote controller is in slave mode. It is only supported by Inspire 2.



##### Class Members:

<div class="api-row" id="djiremotecontroller_joinmasterauthorizationinfo_getmasterid"><div class="api-col left">Get Master Id</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_joinmasterauthorizationinfo_getmasterid_inline">getMasterId</a></div></div><div class="inline-doc" id="djiremotecontroller_joinmasterauthorizationinfo_getmasterid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMasterId</h6></div>

~~~java
 String getMasterId() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Get ID of the master remote controller to join.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>An instance of String.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_joinmasterauthorizationinfo_setmasterid"><div class="api-col left">Set Master Id</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_joinmasterauthorizationinfo_setmasterid_inline">setMasterId</a></div></div><div class="inline-doc" id="djiremotecontroller_joinmasterauthorizationinfo_setmasterid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMasterId</h6></div>

~~~java
 void setMasterId(String masterId) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Set the id of the master remote controller to join.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String <font color="#000">masterId</td><td><font color="#666"><i>ID of the master remote controller to join.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_joinmasterauthorizationinfo_getauthcode"><div class="api-col left">Get Auth Code</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_joinmasterauthorizationinfo_getauthcode_inline">getAuthCode</a></div></div><div class="inline-doc" id="djiremotecontroller_joinmasterauthorizationinfo_getauthcode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAuthCode</h6></div>

~~~java
 String getAuthCode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Authentication code to join the master remote controller.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>An instance of String.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_joinmasterauthorizationinfo_setauthcode"><div class="api-col left">Set Auth Code</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_joinmasterauthorizationinfo_setauthcode_inline">setAuthCode</a></div></div><div class="inline-doc" id="djiremotecontroller_joinmasterauthorizationinfo_setauthcode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAuthCode</h6></div>

~~~java
 void setAuthCode(String authCode) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The mobile device connected to the slave remote controller must know the authorization code of the master remote controller. The master remote controller code is set by using the <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_setmasterauthorizationcode">setMasterAuthorizationCode</a></code> method.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String <font color="#000">authCode</td><td><font color="#666"><i>Authentication code to join the master remote controller.</i></td></tr></table></html></div>


