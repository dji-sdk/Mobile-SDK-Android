<div class="article"><h1 ><font color="#AAA">class </font>FlySafeSeriousWarningInformation</h1></div>

~~~java
 class FlySafeSeriousWarningInformation 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flysafe.notification</td></tr></table></html>



##### Description:



<font color="#666">This class contains DJI flying safety serious warning information related to fly zones. The aircraft will  land when there is a serious warning. The <code>event</code> indicates the reason. Use <code>description</code> method to get  detail information.



##### Class Members:

<div class="api-row" id="djiflyzonemanager_djiflyingsafetyseriouswarninginformation_event"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyingsafetyseriouswarninginformation_event_inline">getEvent</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyingsafetyseriouswarninginformation_event_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getEvent</h6></div>

~~~java
 FlySafeSeriousWarningEvent getEvent() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flysafe.notification</td></tr></table></html>



##### Description:



<font color="#666">Returns the event of DJI flying safety serious warning.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyingSafetySeriousWarningInformation.html#djiflyzonemanager_djiflysafeseriouswarningevent">FlySafeSeriousWarningEvent</a></td><td><font color="#666"><i>Return an enum value of <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyingSafetySeriousWarningInformation.html#djiflyzonemanager_djiflysafeseriouswarningevent">FlySafeSeriousWarningEvent</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiflyingsafetyseriouswarninginformation_heightlimit"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyingsafetyseriouswarninginformation_heightlimit_inline">getHeightLimit</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyingsafetyseriouswarninginformation_heightlimit_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHeightLimit</h6></div>

~~~java
 int getHeightLimit() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flysafe.notification</td></tr></table></html>



##### Description:



<font color="#666">Returns the height limit of current fly zone.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Return an int value of the height limit.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiflyingsafetyseriouswarninginformation_countdown"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyingsafetyseriouswarninginformation_countdown_inline">getCountdown</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyingsafetyseriouswarninginformation_countdown_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCountdown</h6></div>

~~~java
 int getCountdown() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flysafe.notification</td></tr></table></html>



##### Description:



<font color="#666">Returns the countdown to start automatically landing.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Return an int value of count down.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiflyingsafetyseriouswarninginformation_flyzoneinformation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyingsafetyseriouswarninginformation_flyzoneinformation_inline">getFlyZoneInformation</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyingsafetyseriouswarninginformation_flyzoneinformation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlyZoneInformation</h6></div>

~~~java
 List<FlyZoneInformation> getFlyZoneInformation() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flysafe.notification</td></tr></table></html>



##### Description:



<font color="#666">Returns information about the fly zones.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;<a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation">FlyZoneInformation</a>&gt;</td><td><font color="#666"><i>Return the list of <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation">FlyZoneInformation</a></code> objects.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiflyingsafetyseriouswarninginformation_description"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyingsafetyseriouswarninginformation_description_inline">getDescription</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyingsafetyseriouswarninginformation_description_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDescription</h6></div>

~~~java
 String getDescription() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flysafe.notification</td></tr></table></html>



##### Description:



<font color="#666">Returns the description of fly zone warning information.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>Return the String of the description.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiflyzonemanager_djiflysafeseriouswarningevent"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflysafeseriouswarningevent_inline">FlySafeSeriousWarningEvent</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflysafeseriouswarningevent_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FlySafeSeriousWarningEvent</h6></div>

~~~java
 enum FlySafeSeriousWarningEvent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flysafe.notification</td></tr></table></html>



##### Description:



<font color="#666">Fly zone serious warning events.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflysafeseriouswarningevent_innoflyzone_inline"></a>IN_NO_FLY_ZONE</td><td><font color="#666">The aircraft is in the no-fly zone. After the countdown is over, it will force an automatic drop.  You will not be able to control the throttle, but you can adjust the horizontal direction to avoid obstacles.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflysafeseriouswarningevent_inheightlimitzone_inline"></a>IN_LIMIT_HEIGHT_AREA</td><td><font color="#666">The aircraft is in the height limit zone. After the countdown is over, it will automatically drop to the limit height,  you will not be able to control the throttle, but you can adjust the horizontal direction to avoid obstacles.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflysafeseriouswarningevent_inauthorizationzonewithoutunlocking_inline"></a>IN_AUTHORIZATION_ZONE_WITHOUT_UNLOCKING</td><td><font color="#666">The aircraft is in the authorized zone. After the countdown is over, it will automatically drop and you will not be able to  control the throttle, but you can adjust the horizontal direction to avoid obstacles.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflysafeseriouswarningevent_inunlockedauthorizationzone_inline"></a>IN_UNLOCKED_AUTHORIZATION_ZONE</td><td><font color="#666">The aircraft is in the authorized area and you have obtained a flight certificate. After the countdown is over, it will  automatically drop and you will not be able to control the throttle, Please confirm the fly limit zone and than open it.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflysafeseriouswarningevent_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>


