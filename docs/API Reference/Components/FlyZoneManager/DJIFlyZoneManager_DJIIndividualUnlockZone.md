<div class="article"><h1 ><font color="#AAA">class </font>CustomUnlockZone</h1></div>

~~~java
@EXClassNullAway
 class CustomUnlockZone 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">Users can unlock areas of a restricted fly zone through <http://www.dji.com/flysafe/custom-unlock>.  A user needs to show special authorization (usually from a third party such as a regulatory  or managing agency) as part of the process to unlock the area within the restricted fly zone.  Therefore each request is unique and customized to the individual. If the request is successful,  the unlocked area is tied to the user's account as an Custom Unlock Zone.  <br><br>This class contains the properties of an Custom Unlock Zone.



##### Class Members:

<div class="api-row" id="djiflyzonemanager_djiindividualunlockzone_id"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiindividualunlockzone_id_inline">getID</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiindividualunlockzone_id_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getID</h6></div>

~~~java
 int getID() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">The unique ID of the Custom Unlock Zone.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the ID.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiindividualunlockzone_type"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiindividualunlockzone_type_inline">getUnlockZoneType</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiindividualunlockzone_type_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getUnlockZoneType</h6></div>

~~~java
 UnlockZoneType getUnlockZoneType() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">The type of custom unlocking.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIIndividualUnlockZone.html#djiflyzonemanager_djicustomunlocktype">UnlockZoneType</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIIndividualUnlockZone.html#djiflyzonemanager_djicustomunlocktype">UnlockZoneType</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiindividualunlockzone_name"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiindividualunlockzone_name_inline">getName</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiindividualunlockzone_name_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getName</h6></div>

~~~java
 String getName() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">Name of the Custom Unlock Zone.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>A string value of the name.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiindividualunlockzone_center"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiindividualunlockzone_center_inline">getCenter</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiindividualunlockzone_center_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCenter</h6></div>

~~~java
 LocationCoordinate2D getCenter() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">The coordinate of the Custom Unlock Zone's center. Only used when <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIIndividualUnlockZone.html#djiflyzonemanager_djiindividualunlockzone_type">getUnlockZoneType</a></code>  is <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIIndividualUnlockZone.html#djiflyzonemanager_djicustomunlocktype_circle">CIRCLE_UNLOCK_AREA</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></td><td><font color="#666"><i>A <code><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></code> object.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiindividualunlockzone_radius"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiindividualunlockzone_radius_inline">getRadius</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiindividualunlockzone_radius_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRadius</h6></div>

~~~java
 double getRadius() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">The radius of the Custom Unlock Zone in meters. Valid when <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIIndividualUnlockZone.html#djiflyzonemanager_djiindividualunlockzone_type">getUnlockZoneType</a></code>  is <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIIndividualUnlockZone.html#djiflyzonemanager_djicustomunlocktype_circle">CIRCLE_UNLOCK_AREA</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">double</td><td><font color="#666"><i>A float value of the radius.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiindividualunlockzone_countrycode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiindividualunlockzone_countrycode_inline">getCountry</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiindividualunlockzone_countrycode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCountry</h6></div>

~~~java
 String getCountry() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">Check country code (https://www.iso.org/iso-3166-country-codes.html) for the custom unlock zone's shape.  Valid when <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIIndividualUnlockZone.html#djiflyzonemanager_djiindividualunlockzone_type">getUnlockZoneType</a></code> is <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIIndividualUnlockZone.html#djiflyzonemanager_djicustomunlocktype_country">COUNTRY_UNLOCK</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>The string of country code.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiindividualunlockzone_maxflightaltitude"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiindividualunlockzone_maxflightaltitude_inline">getHeight</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiindividualunlockzone_maxflightaltitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHeight</h6></div>

~~~java
 int getHeight() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">The unlocked max flight altitude limit in the custom unlock zone. Valid when <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIIndividualUnlockZone.html#djiflyzonemanager_djiindividualunlockzone_type">getUnlockZoneType</a></code>  is <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIIndividualUnlockZone.html#djiflyzonemanager_djicustomunlocktype_maxflightaltitudelimit">HEIGHT_UNLOCK</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of max flight altitude.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiindividualunlockzone_vertices"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiindividualunlockzone_vertices_inline">getPoints</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiindividualunlockzone_vertices_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPoints</h6></div>

~~~java
 List<LocationCoordinate2D> getPoints() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">The vertices (locations) that make up the custom unlock zone shape. Only used  when <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIIndividualUnlockZone.html#djiflyzonemanager_djiindividualunlockzone_type">getUnlockZoneType</a></code> is <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIIndividualUnlockZone.html#djiflyzonemanager_djicustomunlocktype_polygon">PENTAGON_UNLOCK</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;<a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a>&gt;</td><td><font color="#666"><i>A list of <code><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></code> objects.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiindividualunlockzone_starttime"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiindividualunlockzone_starttime_inline">getStartTime</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiindividualunlockzone_starttime_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getStartTime</h6></div>

~~~java
 String getStartTime() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">The timestamp of when the unlocking begins, formatted in UTC (YYYY-MM-DD hh:mm:ss).  



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>A string value of start time.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiindividualunlockzone_endtime"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiindividualunlockzone_endtime_inline">getEndTime</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiindividualunlockzone_endtime_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getEndTime</h6></div>

~~~java
 String getEndTime() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">The timestamp of when the unlocking ends, formatted in UTC (YYYY-MM-DD hh:mm:ss).  



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>A String value of the end time.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiindividualunlockzone_isexpired"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiindividualunlockzone_isexpired_inline">isExpired</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiindividualunlockzone_isexpired_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isExpired</h6></div>

~~~java
 boolean isExpired() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the Custom Unlock Zone has expired. After a zone is expired,  the location will be locked.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check if is expired.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiflyzonemanager_djicustomunlocktype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djicustomunlocktype_inline">UnlockZoneType</a></div></div><div class="inline-doc" id="djiflyzonemanager_djicustomunlocktype_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>UnlockZoneType</h6></div>

~~~java
 enum UnlockZoneType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flysafe</td></tr></table></html>



##### Description:



<font color="#666">An enum class represents the type of custom unlocking.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djicustomunlocktype_circle_inline"></a>CIRCLE_UNLOCK_AREA</td><td><font color="#666">The custom unlock zone is a circle.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djicustomunlocktype_country_inline"></a>COUNTRY_UNLOCK</td><td><font color="#666">The custom unlock zone is a country.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djicustomunlocktype_maxflightaltitudelimit_inline"></a>HEIGHT_UNLOCK</td><td><font color="#666">Unlock the max flight altitude limit in the custom unlock zone.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djicustomunlocktype_polygon_inline"></a>PENTAGON_UNLOCK</td><td><font color="#666">The custom unlock zone is a polygon.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djicustomunlocktype_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The custom unlock type is unknown.</td></tr></table></html>

##### Class Members:

</div>


