<div class="article"><h1 ><font color="#AAA">class </font>Callback</h1></div>

~~~java
 interface Callback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">An interface for obtaining <code>FlyForbidStatus</code>.



##### Class Members:



#### Callback Method

<div class="api-row" id="djiflyzonemanager_updateflyzonestatus"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_updateflyzonestatus_inline">onUpdate</a></div></div><div class="inline-doc" id="djiflyzonemanager_updateflyzonestatus_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
 void onUpdate(@NonNull FlyZoneState state)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">Called when the latest fly zone status is received.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_djiflyzoneinformation_flyzonestatus">FlyZoneState</a> <font color="#000">state</td><td><font color="#666"><i>An enum value of <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_djiflyzoneinformation_flyzonestatus">FlyZoneState</a></code>.</i></td></tr></table></html></div>


