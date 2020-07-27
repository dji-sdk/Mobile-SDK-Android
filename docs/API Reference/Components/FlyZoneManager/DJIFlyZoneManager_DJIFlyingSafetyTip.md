<div class="article"><h1 ><font color="#AAA">class </font>FlySafeTipInformation</h1></div>

~~~java
 class FlySafeTipInformation 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flysafe.notification</td></tr></table></html>



##### Description:



<font color="#666">This class contains DJI flying safety tip related to fly zones. The <code>event</code> indicates the reason. Use <code>description</code>  method to get detail information.



##### Class Members:

<div class="api-row" id="djiflyzonemanager_djiflyingsafetytip_event"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyingsafetytip_event_inline">getEvent</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyingsafetytip_event_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getEvent</h6></div>

~~~java
 FlySafeTipEvent getEvent() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flysafe.notification</td></tr></table></html>



##### Description:



<font color="#666">Returns the event of DJI flying safety tip.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyingSafetyTip.html#djiflyzonemanager_djiflyingsafetytipevent">FlySafeTipEvent</a></td><td><font color="#666"><i>The enum value of <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyingSafetyTip.html#djiflyzonemanager_djiflyingsafetytipevent">FlySafeTipEvent</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiflyingsafetytip_heightlimit"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyingsafetytip_heightlimit_inline">getHeightLimit</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyingsafetytip_heightlimit_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHeightLimit</h6></div>

~~~java
 int getHeightLimit() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flysafe.notification</td></tr></table></html>



##### Description:



<font color="#666">Returns the height limit of current fly zone.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the height limit.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiflyingsafetytip_flyzoneinformations"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyingsafetytip_flyzoneinformations_inline">getFlyZoneInformation</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyingsafetytip_flyzoneinformations_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlyZoneInformation</h6></div>

~~~java
 List<FlyZoneInformation> getFlyZoneInformation() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flysafe.notification</td></tr></table></html>



##### Description:



<font color="#666">Returns information about the fly zones.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;<a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation">FlyZoneInformation</a>&gt;</td><td><font color="#666"><i>Return the list of <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation">FlyZoneInformation</a></code> objects.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiflyingsafetytip_getdescription"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyingsafetytip_getdescription_inline">getDescription</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyingsafetytip_getdescription_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDescription</h6></div>

~~~java
 String getDescription() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flysafe.notification</td></tr></table></html>



##### Description:



<font color="#666">Returns the description of fly zone tip information.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>The String of the description.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiflyzonemanager_djiflyingsafetytipevent"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyingsafetytipevent_inline">FlySafeTipEvent</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyingsafetytipevent_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FlySafeTipEvent</h6></div>

~~~java
 enum FlySafeTipEvent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flysafe.notification</td></tr></table></html>



##### Description:



<font color="#666">DJI Flying safety tip.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyingsafetytipevent_takeoffinheightlimitzonewithoutgps_inline"></a>TAKE_OFF_IN_HEIGHT_LIMIT_ZONE_WITHOUT_GPS</td><td><font color="#666">The aircraft is below the height limit zone and has no GPS signal, please pay attention to flight safety.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyingsafetytipevent_takeoffinheightlimitzone_inline"></a>TAKE_OFF_IN_HEIGHT_LIMIT_ZONE</td><td><font color="#666">The aircraft is below the height limit zone, please pay attention to flight safety.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyingsafetytipevent_takeoffinwarningarea_inline"></a>TAKE_OFF_IN_WARNING_AREA</td><td><font color="#666">The aircraft is in the warning zone, please pay attention to flight safety.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyingsafetytipevent_touchnoflyzone_inline"></a>TOUCH_NO_FLY_ZONE</td><td><font color="#666">The aircraft has touched the no-fly zone, please control the aircraft as far as possible.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyingsafetytipevent_touchauthorizationzone_inline"></a>TOUCH_AUTHORIZATION_ZONE</td><td><font color="#666">The aircraft has touched the authorized area, please control the aircraft as far as possible.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyingsafetytipevent_reachmaximumflightheight_inline"></a>REACH_MAXIMUM_FLIGHT_HEIGHT</td><td><font color="#666">The aircraft has reached the maximum flight height in the height limit zone.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyingsafetytipevent_rthaffectedatboundaryofgeozone_inline"></a>RTH_AFFECTED_AT_BOUNDARY_OF_GEO_ZONE</td><td><font color="#666">Your aircraft is at the boundary of a GEO Zone, Return To Home may be affected. Please fly away with caution.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyingsafetytipevent_atboundaryofcustomunlockzone_inline"></a>AT_BOUNDARY_OF_CUSTOM_UNLOCK_ZONE</td><td><font color="#666">Your aircraft is at the boundary of an Custom Unlocking Zone.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyingsafetytipevent_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>


