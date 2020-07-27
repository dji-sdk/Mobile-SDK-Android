<div class="article"><h1 ><font color="#AAA">class </font>FlyZoneInformation</h1></div>

~~~java
@EXClassNullAway
 final class FlyZoneInformation 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">This class contains information about a fly zone. <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation_type">getFlyZoneType</a></code>  should be used to understand the type of fly zone to know which information in this class is valid.



##### Class Members:

<div class="api-row" id="djiflyzonemanager_djiflyzoneinformation_type"><div class="api-col left">Information</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyzoneinformation_type_inline">getFlyZoneType</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyzoneinformation_type_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlyZoneType</h6></div>

~~~java
 FlyZoneType getFlyZoneType() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">Returns the type fly zone.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation_zonetype">FlyZoneType</a></td><td><font color="#666"><i>The type of fly zone.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiflyzoneinformation_flyzoneid"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyzoneinformation_flyzoneid_inline">getFlyZoneID</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyzoneinformation_flyzoneid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlyZoneID</h6></div>

~~~java
 int getFlyZoneID() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">Returns the fly zone's ID. This is required if unlocking a fly zone.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiflyzoneinformation_name"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyzoneinformation_name_inline">getName</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyzoneinformation_name_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getName</h6></div>

~~~java
 String getName() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">Returns the name of the fly zone.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>A string instance of the name of the fly zone.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiflyzoneinformation_reason"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyzoneinformation_reason_inline">getReason</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyzoneinformation_reason_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getReason</h6></div>

~~~java
 FlyZoneReason getReason() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">Returns the reason of the fly zone <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation_flyzonereason">FlyZoneReason</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation_flyzonereason">FlyZoneReason</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation_flyzonereason">FlyZoneReason</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiflyzoneinformation_coordinate"><div class="api-col left">Location</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyzoneinformation_coordinate_inline">getCoordinate</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyzoneinformation_coordinate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCoordinate</h6></div>

~~~java
 LocationCoordinate2D getCoordinate() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">The coordinate of the fly zone's center. Only used for GEO and NFZ fly zones.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></td><td><font color="#666"><i>Coordinate of fly zone center.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiflyzoneinformation_radius"><div class="api-col left">Geometry</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyzoneinformation_radius_inline">getRadius</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyzoneinformation_radius_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRadius</h6></div>

~~~java
 double getRadius() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">The radius of the fly zone in meters. If the fly zone is a truncated cone, then the radius is the bottom of the cone. Only used for GEO and NFZ fly zones.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">double</td><td><font color="#666"><i>A double value of the radius of the fly zone in meters.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiflyzoneinformation_shape"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyzoneinformation_shape_inline">getShape</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyzoneinformation_shape_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getShape</h6></div>

~~~java
 FlyZoneShape getShape() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">The shape of the fly zone. This shape is only used for GEO (always cylinder) and NFZ fly zones.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation_flyzoneshape">FlyZoneShape</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation_flyzoneshape">FlyZoneShape</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiflyzoneinformation_category"><div class="api-col left">GEO Fly Zone Category</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyzoneinformation_category_inline">getCategory</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyzoneinformation_category_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCategory</h6></div>

~~~java
 FlyZoneCategory getCategory() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">The category of the fly zone.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation_flyzonecategory">FlyZoneCategory</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation_flyzonecategory">FlyZoneCategory</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiflyzoneinformation_subflyzones"><div class="api-col left">Sub Fly Zones</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyzoneinformation_subflyzones_inline">getSubFlyZones</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyzoneinformation_subflyzones_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSubFlyZones</h6></div>

~~~java
 SubFlyZoneInformation[] getSubFlyZones() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">Information about the Sub fly zones. If empty, then the fly zone is a circle fly zone. If  populated, this fly zone is a Poly fly zone and the sub fly zone information will take  precedence over information in <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation">FlyZoneInformation</a></code>.  <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation">FlyZoneInformation</a></code> should only be used for fly zone identifying information.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJISubFlyZoneInformation.html#djiflyzonemanager_djisubflyzoneinformation">SubFlyZoneInformation</a>[]</td><td><font color="#666"><i>An array of <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJISubFlyZoneInformation.html#djiflyzonemanager_djisubflyzoneinformation">SubFlyZoneInformation</a></code> objects.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiflyzoneinformation_setunlockingenabled"><div class="api-col left">Unlocking Enabled</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyzoneinformation_setunlockingenabled_inline">setUnlockingEnabled</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyzoneinformation_setunlockingenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setUnlockingEnabled</h6></div>

~~~java
 void setUnlockingEnabled(final boolean enabled, CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">Disables the unlocked fly zones. This is useful if the aircraft is shared between users. It is not  supported by Inspire 1 series or Phantom 3 series. For the other products, it is supported  when <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_isindividualunlockzonesupported">isCustomUnlockZoneSupported</a></code> is <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable the unlocked fly zone.</i></td></tr><tr valign="top"><td><font color="#70BF41">CompletionCallback <font color="#000">callback</td><td><font color="#666"><i><code>completion callback</code> to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiflyzoneinformation_getunlockingenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyzoneinformation_getunlockingenabled_inline">getUnlockingEnabled</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyzoneinformation_getunlockingenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getUnlockingEnabled</h6></div>

~~~java
 void getUnlockingEnabled(final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the unlocked fly zone is enabled. It is not supported by Inspire 1 series or Phantom 3  series. For the other products, it is supported when <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager.html#djiflyzonemanager_isindividualunlockzonesupported">isCustomUnlockZoneSupported</a></code> is <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion callback that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiflyzoneinformation_starttime"><div class="api-col left">Time</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyzoneinformation_starttime_inline">getStartTime</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyzoneinformation_starttime_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getStartTime</h6></div>

~~~java
 String getStartTime() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">The timestamp of when the flight warning or flight restriction begins, formatted in UTC (yyyy-MM-dd HH:mm:ss). This is used for temporary flight  restrictions. 



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>An instance of String.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiflyzoneinformation_endtime"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyzoneinformation_endtime_inline">getEndTime</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyzoneinformation_endtime_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getEndTime</h6></div>

~~~java
 String getEndTime() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">The timestamp of when the flight warning or flight restriction ends, formatted in UTC (YYYY-MM-DD hh:mm:ss). 



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>A string instance of the timestamp when the flight warning or flight restriction ends.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiflyzoneinformation_unlockstarttime"><div class="api-col left">Unlock Time</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyzoneinformation_unlockstarttime_inline">getUnlockStartTime</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyzoneinformation_unlockstarttime_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getUnlockStartTime</h6></div>

~~~java
 String getUnlockStartTime() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">The timestamp when the fly zone is unlocked, formatted in UTC (YYYY-MM-DD hh:mm:ss). 



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>A string instance of the timestamp when the fly zone is unlocked.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djiflyzoneinformation_unlockendtime"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyzoneinformation_unlockendtime_inline">getUnlockEndTime</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyzoneinformation_unlockendtime_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getUnlockEndTime</h6></div>

~~~java
 String getUnlockEndTime() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">The timestamp the unlocked zone expires, formatted in UTC (YYYY-MM-DD hh:mm:ss). 



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>A string instance of the timestamp when the unlocked zone expires.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiflyzonemanager_djiflyzoneinformation_zonetype"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyzoneinformation_zonetype_inline">FlyZoneType</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyzoneinformation_zonetype_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FlyZoneType</h6></div>

~~~java
@EXClassNullAway
 enum FlyZoneType 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">There are three types of fly zones, NFZ, GEO and Poly.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_zonetype_circle_inline"></a>CIRCLE</td><td><font color="#666">The circle fly zone is a cylinder or truncated cone volume (see <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation_shape">getShape</a></code>)  with one of the four restriction levels (see <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJIFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation_category">getCategory</a></code>). Some  restrictions can  be unlocked while others cannot. Some fly zones also have a 4km buffer around them where flight  height is restricted to 120m.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_zonetype_poly_inline"></a>POLY</td><td><font color="#666">The Poly fly zone consists of one or more sub fly zones that are cylinders or complex volumes with different height limitations. A height limitation of 0m means flight is completely restricted. This is used by Mavic, Phantom 4 Pro,  Inspire 2 and Phantom 4.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_zonetype_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The fly zone is of unknown type.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiflyzonemanager_djiflyzoneinformation_flyzonecategory"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyzoneinformation_flyzonecategory_inline">FlyZoneCategory</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyzoneinformation_flyzonecategory_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FlyZoneCategory</h6></div>

~~~java
@EXClassNullAway
 enum FlyZoneCategory 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">An enum class represents the category of fly zone.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonecategory_warning_inline"></a>WARNING</td><td><font color="#666">Warning zones do not restrict flight and are informational to alert the user. In a warning zone, users should be  prompted with a warning message describing the zone.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonecategory_authorization_inline"></a>AUTHORIZATION</td><td><font color="#666">Authorization zones restrict flight by default, but can be unlocked by a GEO authorized user.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonecategory_restricted_inline"></a>RESTRICTED</td><td><font color="#666">Restricted zones restrict flight by default and cannot be unlocked by a GEO authorized user.  Users should contact flysafe@dji.com if they have authorization to fly in a restricted zone.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonecategory_enhancedwarning_inline"></a>ENHANCED_WARNING</td><td><font color="#666">Enhanced warning zones do not restrict flight but are highly recommended to be informational  to alert the user. In an enhanced warning zone, users should be prompted with a warning message  describing the zone.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonecategory_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiflyzonemanager_djiflyzoneinformation_flyzonereason"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyzoneinformation_flyzonereason_inline">FlyZoneReason</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyzoneinformation_flyzonereason_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FlyZoneReason</h6></div>

~~~java
@EXClassNullAway
 enum FlyZoneReason 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">An enum class contains the reason for the fly zone.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereason_airport_inline"></a>AIRPORT</td><td><font color="#666">Airport that cannot be unlocked using GEO system.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereason_military_inline"></a>MILITARY</td><td><font color="#666">Military authorized zone. This cannot be unlocked using the GEO system.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereason_special_inline"></a>SPECIAL</td><td><font color="#666">Special Zone. This cannot be unlocked using the GEO system.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereason_commercialairport_inline"></a>COMMERCIAL_AIRPORTS</td><td><font color="#666">Commercial airport.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereason_privatecommercialairport_inline"></a>PRIVATE_COMMERCIAL_AIRPORTS</td><td><font color="#666">Private commercial airport.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereason_recreationalairport_inline"></a>RECREATIONAL_AIRPORTS</td><td><font color="#666">Recreational airport.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereason_nationalpark_inline"></a>NATIONAL_PARKS</td><td><font color="#666">National park.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereason_noaa_inline"></a>NOAA</td><td><font color="#666">The National Oceanic and Atmospheric Administration.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereason_parcel_inline"></a>PARCEL</td><td><font color="#666">Parcel.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereason_powerplant_inline"></a>POWER_PLANT</td><td><font color="#666">Power plant.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereason_prison_inline"></a>PRISON</td><td><font color="#666">Prison.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereason_school_inline"></a>SCHOOL</td><td><font color="#666">School.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereason_stadium_inline"></a>STADIUM</td><td><font color="#666">Stadium.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereason_prohibitedspecialuse_inline"></a>PROHIBITED_SPECIAL_USE</td><td><font color="#666">Prohibited special use.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereason_restrictedspecialuse_inline"></a>RESTRICTED_SPECIAL_USE</td><td><font color="#666">Restriction special use.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereason_temporaryflightrestriction_inline"></a>TEMPORARY_FLIGHT_RESTRICTIONS</td><td><font color="#666">Temporary flight restriction.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereason_classbairspace_inline"></a>CLASS_B_AIR_SPACE</td><td><font color="#666">Class B controlled airspace. See http://www.dji.com/flysafe/geo-system#notes for more information on the  controlled airspace (Class B, C, D, E) in the United States.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereason_classcairspace_inline"></a>CLASS_C_AIR_SPACE</td><td><font color="#666">Class C controlled airspace. See http://www.dji.com/flysafe/geo-system#notes for more information on the  controlled airspace (Class B, C, D, E) in the United States.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereason_classdairspace_inline"></a>CLASS_D_AIR_SPACE</td><td><font color="#666">Class D controlled airspace. See http://www.dji.com/flysafe/geo-system#notes for more information on the  controlled airspace (Class B, C, D, E) in the United States.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereason_classeairspace_inline"></a>CLASS_E_AIR_SPACE</td><td><font color="#666">Class E Controlled Airspace. See http://www.dji.com/flysafe/geo-system#notes for more information on the  controlled airspace (Class B, C, D, E) in the United States.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereason_unpavedairport_inline"></a>UNPAVED_AIRPORT</td><td><font color="#666">Airport with unpaved runway.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereason_heliport_inline"></a>HELIPORT</td><td><font color="#666">Heliport.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereason_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiflyzonemanager_djiflyzoneinformation_flyzoneshape"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyzoneinformation_flyzoneshape_inline">FlyZoneShape</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyzoneinformation_flyzoneshape_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FlyZoneShape</h6></div>

~~~java
@EXClassNullAway
 enum FlyZoneShape 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">An enum class containing the shape of the fly zone.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzoneshape_cylinder_inline"></a>CYLINDER</td><td><font color="#666">Cylinder.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzoneshape_cone_inline"></a>CONE</td><td><font color="#666">Truncated cone that has a smaller radius on the ground and larger radius in the air.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzoneshape_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiflyzonemanager_djisubflyzoneinformation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJISubFlyZoneInformation.html">SubFlyZoneInformation</a></div></div><div class="api-row" id="djiflyzonemanager_djiflyzoneinformation_flyzonereturntohomestate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyzoneinformation_flyzonereturntohomestate_inline">FlyZoneReturnToHomeState</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyzoneinformation_flyzonereturntohomestate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FlyZoneReturnToHomeState</h6></div>

~~~java
@EXClassNullAway
 enum FlyZoneReturnToHomeState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_return_to_home_state_key">FlightControllerKey.RETURN_TO_HOME_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">This enum describes whether the aircraft's route when returning to home is clear of, near, or passes through a fly zone.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereturntohomestate_clear_inline"></a>CLEAR</td><td><font color="#666">The aircraft's return to home route is clear of restricted areas.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereturntohomestate_nearnoflyzone_inline"></a>NEAR_NO_FLY_ZONE</td><td><font color="#666">The aircraft's return to home route is near an authorization or restricted zone.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereturntohomestate_crossnoflyzone_inline"></a>CROSS_NO_FLY_ZONE</td><td><font color="#666">The aircraft's return to home route passes through an authorization or restricted zone.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_flyzonereturntohomestate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>


