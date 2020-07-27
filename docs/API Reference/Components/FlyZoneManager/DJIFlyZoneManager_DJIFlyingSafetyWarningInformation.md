<div class="article"><h1 ><font color="#AAA">class </font>FlySafeWarningInformation</h1></div>

~~~java
 class FlySafeWarningInformation 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flysafe.notification</td></tr></table></html>



##### Description:



<font color="#666">This class contains DJI flying safety warning information related to fly zones.  The <code>event</code> indicates the reason. Use <code>description</code> method to get detail information.



##### Class Members:

<div class="api-row" id="djiflyzonemanager_djiflyingsafetywarninginformation_event"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyingsafetywarninginformation_event_inline">getEvent</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyingsafetywarninginformation_event_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getEvent</h6></div>

~~~java
 FlySafeWarningEvent getEvent() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flysafe.notification</td></tr></table></html>



##### Description:



<font color="#666">Returns the event of DJI flying safety warning.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyingSafetyWarningInformation.html#djiflyzonemanager_djiflysafewarningevent">FlySafeWarningEvent</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyingSafetyWarningInformation.html#djiflyzonemanager_djiflysafewarningevent">FlySafeWarningEvent</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiflyingsafetywarninginformation_heightlimit"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyingsafetywarninginformation_heightlimit_inline">getHeightLimit</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyingsafetywarninginformation_heightlimit_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHeightLimit</h6></div>

~~~java
 int getHeightLimit() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flysafe.notification</td></tr></table></html>



##### Description:



<font color="#666">Returns the height limit of current fly zone.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the height limit.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiflyingsafetywarninginformation_flyzoneinformation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyingsafetywarninginformation_flyzoneinformation_inline">getFlyZoneInformation</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyingsafetywarninginformation_flyzoneinformation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlyZoneInformation</h6></div>

~~~java
 List<FlyZoneInformation> getFlyZoneInformation() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flysafe.notification</td></tr></table></html>



##### Description:



<font color="#666">Returns information about the fly zones.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;<a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation">FlyZoneInformation</a>&gt;</td><td><font color="#666"><i>A list of <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation">FlyZoneInformation</a></code> objects.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiflyingsafetywarninginformation_description"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyingsafetywarninginformation_description_inline">getDescription</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyingsafetywarninginformation_description_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDescription</h6></div>

~~~java
 String getDescription() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flysafe.notification</td></tr></table></html>



##### Description:



<font color="#666">Returns the description of fly zone warning information.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>A String value.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiflyzonemanager_djiflysafewarningevent"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflysafewarningevent_inline">FlySafeWarningEvent</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflysafewarningevent_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FlySafeWarningEvent</h6></div>

~~~java
 enum FlySafeWarningEvent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flysafe.notification</td></tr></table></html>



##### Description:



<font color="#666">DJI Fly Safe warning events of fly zones.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflysafewarningevent_takeofffailedinnoflyzone_inline"></a>TAKE_OFF_FAILED_IN_NO_FLY_ZONE</td><td><font color="#666">The aircraft was unable to take off in the no-fly zone.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflysafewarningevent_takeofffailedinnoflyzonewithoutgps_inline"></a>TAKE_OFF_FAILED_IN_NO_FLY_ZONE_WITHOUT_GPS</td><td><font color="#666">The mobile device is in the no-fly zone, and the GPS signal of the aircraft is  not good enough to take off.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflysafewarningevent_takeofffailedwithoutcustomunlocking_inline"></a>TAKE_OFF_FAILED_WITHOUT_CUSTOM_UNLOCKING</td><td><font color="#666">Cannot take off. You have not applied to fly in this zone.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflysafewarningevent_takeofffailedinauthorizedzonewithoutgpsandunlocking_inline"></a>TAKE_OFF_FAILED_IN_AUTHORIZED_AREA_WITHOUT_GPS_AND_UNLOCKING</td><td><font color="#666">The mobile device is in the authorized area, and the GPS signal of the aircraft  is not good, and it cannot take off before unlocking.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflysafewarningevent_takeofffailedinauthorizedzonewithoutunlocking_inline"></a>TAKE_OFF_FAILED_IN_AUTHORIZED_ZONE_WITHOUT_UNLOCKING</td><td><font color="#666">The aircraft is not allowed to take off before being unlocked in the authorized area.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflysafewarningevent_takeofffailedinauthorizedzone_inline"></a>TAKE_OFF_FAILED_IN_AUTHORIZED_ZONE</td><td><font color="#666">The aircraft is in the authorized area and you have obtained a flight certificate.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflysafewarningevent_takeoffinenhancedwarningzone_inline"></a>TAKE_OFF_IN_ENHANCED_WARNING_ZONE</td><td><font color="#666">The aircraft is in the enhanced warning zone, please pay attention to flight safety.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflysafewarningevent_takeoffnearnoflyzone_inline"></a>TAKE_OFF_NEAR_NO_FLY_ZONE</td><td><font color="#666">There is a no-fly zone nearby and there are flight restrictions.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflysafewarningevent_limitedrestrictionsnearby_inline"></a>LIMITED_RESTRICTIONS_NEARBY</td><td><font color="#666">There are limited restrictions in the nearby area.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflysafewarningevent_noflyzoneandrestrictionsnearby_inline"></a>NO_FLY_ZONE_AND_RESTRICTIONS_NEARBY</td><td><font color="#666">There is a no-fly zone nearby and there are flight restrictions.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflysafewarningevent_authorizedzoneandrestrictionsnearby_inline"></a>AUTHORIZED_ZONE_AND_RESTRICTIONS_NEARBY</td><td><font color="#666">There are authorized areas nearby and you have obtained a flight certificate.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflysafewarningevent_restrictionsinlimitedflyzonenearby_inline"></a>RESTRICTIONS_IN_LIMITED_FLY_ZONE_NEARBY</td><td><font color="#666">There are flight restrictions in the nearby limited flight area.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflysafewarningevent_inauthorizationzone_inline"></a>IN_AUTHORIZATION_ZONE</td><td><font color="#666">The aircraft is in the authorized area and you have obtained a flight certificate.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflysafewarningevent_takeofffailedinnoflyzonewithweakgps_inline"></a>TAKE_OFF_FAILED_UNDER_LIMIT_AREA_WITH_GPS_ONCE</td><td><font color="#666">The mobile device is in the no-fly zone, and the GPS signal of the aircraft is not good enough to take off.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflysafewarningevent_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>


