<div class="article"><h1 ><font color="#AAA">class </font>Information</h1></div>

~~~java
@EXClassNullAway
 class Information 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_available_masters_key">RemoteControllerKey.AVAILABLE_MASTERS</a>, <a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_slave_list_key">RemoteControllerKey.SLAVE_LIST</a></td></tr></table></html>



##### Description:



<font color="#666">This class contains the information for a remote controller.



##### Class Members:

<div class="api-row" id="djiremotecontroller_djircinfo_identifier"><div class="api-col left">Identifier</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircinfo_identifier_inline">getId</a></div></div><div class="inline-doc" id="djiremotecontroller_djircinfo_identifier_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getId</h6></div>

~~~java
 int getId() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Remote Controller's unique identifier.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djircinfo_name"><div class="api-col left">Name</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircinfo_name_inline">getName</a></div></div><div class="inline-doc" id="djiremotecontroller_djircinfo_name_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getName</h6></div>

~~~java
 String getName() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Remote Controller's name.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>An instance of String.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djircinfo_password"><div class="api-col left">Password</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircinfo_password_inline">getPassword</a></div></div><div class="inline-doc" id="djiremotecontroller_djircinfo_password_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPassword</h6></div>

~~~java
 String getPassword() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Remote Controller's password.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>An instance of String.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djircinfo_signalquality"><div class="api-col left">Signal Quality</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircinfo_signalquality_inline">getSignalQuality</a></div></div><div class="inline-doc" id="djiremotecontroller_djircinfo_signalquality_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSignalQuality</h6></div>

~~~java
 short getSignalQuality() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Signal quality of a connected master or slave Remote Controller in percent [0, 100].



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">short</td><td><font color="#666"><i>A short value.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djircinfo_hasgimbalcontrolpermission"><div class="api-col left">Gimbal Control</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircinfo_hasgimbalcontrolpermission_inline">hasGimbalControlPermission</a></div></div><div class="inline-doc" id="djiremotecontroller_djircinfo_hasgimbalcontrolpermission_inline"

><div class="article"><h6 ><font color="#AAA">method </font>hasGimbalControlPermission</h6></div>

~~~java
 boolean hasGimbalControlPermission() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the slave remote controller can control the aircraft's gimbal.  Always <code>true</code> for a master remote controller.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check if the slave remote controller can control the aircraft's gimbal.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiremotecontroller_rcreceivegimbalcontrolrequestfromslavecallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_RCReceiveGimbalControlRequestFromSlaveCallbackInterface.html">ControlRequestCallback</a></div></div>
