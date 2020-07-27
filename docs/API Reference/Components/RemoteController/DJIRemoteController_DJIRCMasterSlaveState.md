<div class="article"><h1 ><font color="#AAA">class </font>MasterSlaveState</h1></div>

~~~java
@EXClassNullAway
 class MasterSlaveState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_master_slave_state_key">RemoteControllerKey.MASTER_SLAVE_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">State of the remote controller related to the master and slave mode.



##### Class Members:

<div class="api-row" id="djiremotecontroller_djircmasterslavestate_mode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircmasterslavestate_mode_inline">getRcMode</a></div></div><div class="inline-doc" id="djiremotecontroller_djircmasterslavestate_mode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRcMode</h6></div>

~~~java
 RCMode getRcMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The master/slave mode of the remote controller.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djiremotecontrollermode">RCMode</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_djiremotecontrollermode">RCMode</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djircmasterslavestate_isconnected"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircmasterslavestate_isconnected_inline">isConnected</a></div></div><div class="inline-doc" id="djiremotecontroller_djircmasterslavestate_isconnected_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isConnected</h6></div>

~~~java
 boolean isConnected() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if a slave remote controller joins a master remote controller.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djircmasterslavestate_masterid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircmasterslavestate_masterid_inline">getMasterId</a></div></div><div class="inline-doc" id="djiremotecontroller_djircmasterslavestate_masterid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMasterId</h6></div>

~~~java
 String getMasterId() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">ID of the master remote controller.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>An instance of String.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djircmasterslavestate_slaveid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircmasterslavestate_slaveid_inline">getSlaveId</a></div></div><div class="inline-doc" id="djiremotecontroller_djircmasterslavestate_slaveid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSlaveId</h6></div>

~~~java
 String getSlaveId() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">ID of the slave remote controller.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>An instance of String.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djircmasterslavestate_authorizationcode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircmasterslavestate_authorizationcode_inline">getAuthorizationCode</a></div></div><div class="inline-doc" id="djiremotecontroller_djircmasterslavestate_authorizationcode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAuthorizationCode</h6></div>

~~~java
 String getAuthorizationCode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_master_slave_state_key">RemoteControllerKey.MASTER_SLAVE_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">Authorization code of the master remote controller that is a 6 element string of numbers.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>An instance of String.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djircmasterslavestate_hasgimbalcontrol"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircmasterslavestate_hasgimbalcontrol_inline">hasGimbalControl</a></div></div><div class="inline-doc" id="djiremotecontroller_djircmasterslavestate_hasgimbalcontrol_inline"

><div class="article"><h6 ><font color="#AAA">method </font>hasGimbalControl</h6></div>

~~~java
 boolean hasGimbalControl() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the remote controller has gimbal control.  Call <code><a href="/Components/RemoteController/DJIRemoteController.html#djiremotecontroller_requestgimbalcontrol">requestGimbalControl</a></code> to attain the gimbal control.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the remote controller has gimbal control.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiremotecontroller_didupdatemasterslavestatecallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RemoteController/DJIRemoteController_didUpdateMasterSlaveStateCallbackInterface.html">Callback</a></div></div>
