<div class="article"><h1 ><font color="#AAA">class </font>FiveDButton</h1></div>

~~~java
 static class FiveDButton extends Button 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/RemoteController/DJIRemoteController_DJIRCHardwareState_Button.html#djiremotecontroller_djirchardwarestate_button">Button</a></code></td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIRemoteControllerKey.html#remotecontrollerkey_five_d_button_key">RemoteControllerKey.FIVE_D_BUTTON</a></td></tr></table></html>



##### Description:



<font color="#666">State of the 5D button on the remote controller. Vertical movement, horizontal movement and if it is pressed are  not exclusive.



##### Class Members:

<div class="api-row" id="djiremotecontroller_djircfivedbutton_verticalmovement"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircfivedbutton_verticalmovement_inline">getVerticalDirection</a></div></div><div class="inline-doc" id="djiremotecontroller_djircfivedbutton_verticalmovement_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVerticalDirection</h6></div>

~~~java
 FiveDButtonDirection getVerticalDirection() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Get the movement in the vertical direction of the 5D button. Up is the positive direction and down is the  negative direction.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController_DJIRCFiveDButton.html#djiremotecontroller_djircfivedbuttondirection">FiveDButtonDirection</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCFiveDButton.html#djiremotecontroller_djircfivedbuttondirection">FiveDButtonDirection</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djircfivedbutton_horizontalmovement"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircfivedbutton_horizontalmovement_inline">getHorizontalDirection</a></div></div><div class="inline-doc" id="djiremotecontroller_djircfivedbutton_horizontalmovement_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHorizontalDirection</h6></div>

~~~java
 FiveDButtonDirection getHorizontalDirection() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Get the movement in the horizontal direction of the 5D button. Right is the positive direction and left is the  negative direction.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RemoteController/DJIRemoteController_DJIRCFiveDButton.html#djiremotecontroller_djircfivedbuttondirection">FiveDButtonDirection</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/RemoteController/DJIRemoteController_DJIRCFiveDButton.html#djiremotecontroller_djircfivedbuttondirection">FiveDButtonDirection</a></code></i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiremotecontroller_djircfivedbuttondirection"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djircfivedbuttondirection_inline">FiveDButtonDirection</a></div></div><div class="inline-doc" id="djiremotecontroller_djircfivedbuttondirection_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FiveDButtonDirection</h6></div>

~~~java
 static enum FiveDButtonDirection 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666">Movement direction of the remote controller's 5D button.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircfivedbuttondirection_middle_inline"></a>MIDDLE</td><td><font color="#666">Button has no movement in either the vertical direction or the horizontal direction.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircfivedbuttondirection_positive_inline"></a>POSITIVE</td><td><font color="#666">Button is moved in the positive direction which is up or right.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiremotecontroller_djircfivedbuttondirection_negative_inline"></a>NEGATIVE</td><td><font color="#666">Button is moved in the negative direction which is down or left.</td></tr></table></html>

##### Class Members:

</div>



##### Inherited Methods:

<div class="api-row" id="djiremotecontroller_djirchardwarestate_button_ispresent"><div class="api-col left">dji.common.remotecontroller.Button</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djirchardwarestate_button_ispresent_inline">isPresent</a></div></div><div class="inline-doc" id="djiremotecontroller_djirchardwarestate_button_ispresent_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isPresent</h6></div>

~~~java
 boolean isPresent() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the hardware button is present.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djiremotecontroller_djirchardwarestate_button_buttondown"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiremotecontroller_djirchardwarestate_button_buttondown_inline">isClicked</a></div></div><div class="inline-doc" id="djiremotecontroller_djirchardwarestate_button_buttondown_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isClicked</h6></div>

~~~java
 boolean isClicked() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.remotecontroller</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if button is pressed down.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>


