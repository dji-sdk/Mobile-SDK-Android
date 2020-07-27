<div class="article"><h1 ><font color="#AAA">class </font>Callback</h1></div>

~~~java
 interface Callback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_master_slave_state_key">RemoteControllerKey.MASTER_SLAVE_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">Callback function that updates the Remote Controller's master and slave state.



##### Class Members:



#### Callback Method

<div class="api-row" id="djiremotecontroller_didupdatemasterslavestate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_didupdatemasterslavestate_inline">onUpdate</a></div></div><div class="inline-doc" id="djiremotecontroller_didupdatemasterslavestate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
        void onUpdate(@NonNull MasterSlaveState masterSlaveState)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_master_slave_state_key">RemoteControllerKey.MASTER_SLAVE_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">Callback function that updates the remote controller's state related to the master and slave mode. Only supported by Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/RemoteController/DJIRemoteController_DJIRCMasterSlaveState.html#djiremotecontroller_djircmasterslavestate">MasterSlaveState</a> <font color="#000">masterSlaveState</td><td><font color="#666"><i>The remote controller's state related to the master and slave mode.</i></td></tr></table></html></div>


