<div class="article"><h1 ><font color="#AAA">class </font>GoHomeAction</h1></div>

~~~java
 class GoHomeAction extends LandOrGoHomeActionBase 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.actions</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code>LandOrGoHomeActionBase</code></td></tr></table></html>



##### Description:



<font color="#666">This class represents a go-home action used as an element in a Timeline mission. By creating an object of this class and adding it to Mission Control's Timeline,  the aircraft will go home when the Timeline reaches the action.



##### Class Members:

<div class="api-row" id="djigohomeaction_setautoconfirmlandingenabled"><div class="api-col left">Landing Confirmation</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigohomeaction_setautoconfirmlandingenabled_inline">setAutoConfirmLandingEnabled</a></div></div><div class="inline-doc" id="djigohomeaction_setautoconfirmlandingenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAutoConfirmLandingEnabled</h6></div>

~~~java
@Override
 void setAutoConfirmLandingEnabled(boolean enable) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.actions</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> to enable automatic confirmation during landing. For flight controller firmware  version 3.2.0.0 or above, when the clearance between the aircraft and the ground is less  than 0.3m, the aircraft will pause landing and wait for the user's confirmation to continue.  Enabling the auto confirmation, allows the aircraft to continue landing without the user's  confirmation during the timeline execution. For firmware that does not require landing  confirmation, the value is ignored. The default value is <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enable</td><td><font color="#666"><i>Enable automatic confirmation during landing.</i></td></tr></table></html></div>

<div class="api-row" id="djigohomeaction_getautoconfirmlandingenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigohomeaction_getautoconfirmlandingenabled_inline">getAutoConfirmLandingEnabled</a></div></div><div class="inline-doc" id="djigohomeaction_getautoconfirmlandingenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAutoConfirmLandingEnabled</h6></div>

~~~java
@Override
 boolean getAutoConfirmLandingEnabled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.mission.timeline.actions</td></tr></table></html>



##### Description:



<font color="#666">For flight controller firmware version 3.2.0.0 or above, when the clearance between the  aircraft and the ground is less than 0.3m, the aircraft will pause landing and wait for the  user's confirmation to continue. Enabling the auto confirmation, allows the aircraft to  continue landing without the user's confirmation during the timeline execution. For firmware that  does not require landing confirmation, the value is ignored. The default value  is <code>true</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>


