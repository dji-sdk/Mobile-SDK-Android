<div class="article"><h1 ><font color="#AAA">class </font>Callback</h1></div>

~~~java
 interface Callback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">This interface provides the method to receive the updated state and user configuration.



##### Class Members:



#### Callback Method

<div class="api-row" id="djigimbal_updatemovementsettingsstate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djigimbal_updatemovementsettingsstate_inline">onUpdate</a></div></div><div class="inline-doc" id="djigimbal_updatemovementsettingsstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
        void onUpdate(@NonNull MovementSettings settings)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.gimbal</td></tr></table></html>



##### Description:



<font color="#666">Update the gimbal's user configuration data. This method is only supported by Osmo series.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Gimbal/DJIGimbal_movementSettingsState.html#djigimbal_movementsettingsstate">MovementSettings</a> <font color="#000">settings</td><td><font color="#666"><i>An instance of <code><a href="/Components/Gimbal/DJIGimbal_movementSettingsState.html#djigimbal_movementsettingsstate">MovementSettings</a></code>.</i></td></tr></table></html></div>


