<div class="article"><h1 ><font color="#AAA">class </font>ResponseForGimbalControl</h1></div>

~~~java
@EXClassNullAway
 class ResponseForGimbalControl 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_response_to_request_for_gimbal_control_key">RemoteControllerKey.RESPONSE_TO_REQUEST_FOR_GIMBAL_CONTROL</a></td></tr></table></html>



##### Description:



<font color="#666">Data object that master Remote Controller to respond to the slave Remote Controller's request.



##### Class Members:

<div class="api-row" id="djiremotecontroller_responseforgimbalcontrol_constructor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_responseforgimbalcontrol_constructor_inline">ResponseForGimbalControl</a></div></div><div class="inline-doc" id="djiremotecontroller_responseforgimbalcontrol_constructor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>ResponseForGimbalControl</h6></div>

~~~java
 ResponseForGimbalControl(int requesterId, boolean isAgree) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Constructor of the class.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">requesterId</td><td><font color="#666"><i>Slave Remote Controller's identifier.</i></td></tr><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isAgree</td><td><font color="#666"><i>&lt;code&gt;true&lt;/code&gt; if the master Remote Controller agrees to give the slave Remote Controller the right to control the gimbal.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_responseforgimbalcontrol_getrequesterid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_responseforgimbalcontrol_getrequesterid_inline">getRequesterId</a></div></div><div class="inline-doc" id="djiremotecontroller_responseforgimbalcontrol_getrequesterid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRequesterId</h6></div>

~~~java
 int getRequesterId() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Get the slave Remote Controller's identifier.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>The int value of the slave Remote Controller ID.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_responseforgimbalcontrol_isagree"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_responseforgimbalcontrol_isagree_inline">isAgree</a></div></div><div class="inline-doc" id="djiremotecontroller_responseforgimbalcontrol_isagree_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isAgree</h6></div>

~~~java
 boolean isAgree() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the master Remote Controller agrees to give the slave Remote Controller the right to control the gimbal.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>Agree or disagree to control the gimbal.</i></td></tr></table></html></div>


