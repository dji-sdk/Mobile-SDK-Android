<div class="article"><h1 ><font color="#AAA">class </font>ControlRequestCallback</h1></div>

~~~java
 interface ControlRequestCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">The callback will handle the gimbal control request.



##### Class Members:



#### Callback Method

<div class="api-row" id="djiremotecontroller_receivegimbalcontrolrequestfromslave"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_receivegimbalcontrolrequestfromslave_inline">onReceive</a></div></div><div class="inline-doc" id="djiremotecontroller_receivegimbalcontrolrequestfromslave_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onReceive</h6></div>

~~~java
         void onReceive(@NonNull Information information)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Callback function that gets called when a slave Remote Controller makes a request to a master Remote Controller to control the gimbal using the method requestGimbalControlRightWithCallbackBlock.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/RemoteController/DJIRemoteController_DJIRCInfo.html#djiremotecontroller_djircinfo">Information</a> <font color="#000">information</td><td><font color="#666"><i>Information of the slave making the request to the master Remote Controller.</i></td></tr></table></html></div>


