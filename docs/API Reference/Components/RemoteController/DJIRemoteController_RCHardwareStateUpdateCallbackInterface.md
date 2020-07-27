<div class="article"><h1 ><font color="#AAA">class </font>HardwareStateCallback</h1></div>

~~~java
 interface HardwareStateCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Callback function that updates the Remote Controller's  current hardware state.



##### Class Members:



#### Callback Method

<div class="api-row" id="djiremotecontroller_updatehardwarestate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_updatehardwarestate_inline">onUpdate</a></div></div><div class="inline-doc" id="djiremotecontroller_updatehardwarestate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
        void onUpdate(@NonNull HardwareState hardwareState)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Callback function that updates the Remote Controller's current hardware state (e.g. the state of the physical buttons and joysticks).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull HardwareState <font color="#000">hardwareState</td><td><font color="#666"><i>Current state of the Remote Controller's hardware state.</i></td></tr></table></html></div>


