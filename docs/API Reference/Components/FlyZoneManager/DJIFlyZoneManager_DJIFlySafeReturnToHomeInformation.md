<div class="article"><h1 ><font color="#AAA">class </font>FlySafeReturnToHomeInformation</h1></div>

~~~java
 class FlySafeReturnToHomeInformation 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flysafe.notification</td></tr></table></html>



##### Description:



<font color="#666">This class contains DJI flying safety notification related to returning to home.  The <code>event</code> indicates the reason. Use <code>description</code> method to get detail information.



##### Class Members:

<div class="api-row" id="djiflyzonemanager_djiflysafereturntohomeinformation_event"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflysafereturntohomeinformation_event_inline">getEvent</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflysafereturntohomeinformation_event_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getEvent</h6></div>

~~~java
 FlySafeReturnToHomeEvent getEvent() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flysafe.notification</td></tr></table></html>



##### Description:



<font color="#666">Returns the event of DJI flying safety notification related to returning to home.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlySafeReturnToHomeInformation.html#djiflyzonemanager_djiflysafereturntohomeevent">FlySafeReturnToHomeEvent</a></td><td><font color="#666"><i>Get the enum value of <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlySafeReturnToHomeInformation.html#djiflyzonemanager_djiflysafereturntohomeevent">FlySafeReturnToHomeEvent</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiflysafereturntohomeinformation_description"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflysafereturntohomeinformation_description_inline">getDescription</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflysafereturntohomeinformation_description_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDescription</h6></div>

~~~java
 String getDescription() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flysafe.notification</td></tr></table></html>



##### Description:



<font color="#666">Returns the description of fly zone return to home information.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>Get the String value of the description.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiflyzonemanager_djiflysafereturntohomeevent"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflysafereturntohomeevent_inline">FlySafeReturnToHomeEvent</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflysafereturntohomeevent_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FlySafeReturnToHomeEvent</h6></div>

~~~java
 enum FlySafeReturnToHomeEvent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flysafe.notification</td></tr></table></html>



##### Description:



<font color="#666">Fly zone ReturnToHome events. DJI Fly Safe notification when the aircraft returns to home.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflysafereturntohomeevent_nearnoflyzone_inline"></a>NEAR_NO_FLY_ZONE</td><td><font color="#666">Approaching a No-Fly Zone. Return to home may be affected. Fly with caution.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflysafereturntohomeevent_crossnoflyzone_inline"></a>CROSS_NO_FLY_ZONE</td><td><font color="#666">Current Return to home route will pass a No-Fly zone. Pay attention to the aircraft's position  to avoid Return to home failure.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflysafereturntohomeevent_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>


