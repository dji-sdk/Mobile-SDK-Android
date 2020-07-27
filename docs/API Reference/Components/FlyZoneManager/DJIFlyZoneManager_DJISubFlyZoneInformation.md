<div class="article"><h1 ><font color="#AAA">class </font>SubFlyZoneInformation</h1></div>

~~~java
@EXClassNullAway
 class SubFlyZoneInformation 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">This class contains information about a Sub fly zone.



##### Class Members:

<div class="api-row" id="djiflyzonemanager_djisubflyzoneinformation_subareaid"><div class="api-col left">Information</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djisubflyzoneinformation_subareaid_inline">getAreaID</a></div></div><div class="inline-doc" id="djiflyzonemanager_djisubflyzoneinformation_subareaid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAreaID</h6></div>

~~~java
 int getAreaID() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">The fly zone's identifier.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the sub area's ID.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djisubflyzoneinformation_shape"><div class="api-col left">Geometry and Location</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djisubflyzoneinformation_shape_inline">getShape</a></div></div><div class="inline-doc" id="djiflyzonemanager_djisubflyzoneinformation_shape_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getShape</h6></div>

~~~java
 SubFlyZoneShape getShape() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">The shape of the sub-fly-zone.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJISubFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation_djisubflyzoneshape">SubFlyZoneShape</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJISubFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation_djisubflyzoneshape">SubFlyZoneShape</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djisubflyzoneinformation_coordinate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djisubflyzoneinformation_coordinate_inline">getCenter</a></div></div><div class="inline-doc" id="djiflyzonemanager_djisubflyzoneinformation_coordinate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCenter</h6></div>

~~~java
 LocationCoordinate2D getCenter() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">The location of the fly zone's center. Only used when <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJISubFlyZoneInformation.html#djiflyzonemanager_djisubflyzoneinformation_shape">getShape</a></code> is <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJISubFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation_djisubflyzoneshape_circle">CYLINDER</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></td><td><font color="#666"><i>A LocationCoordinate2D object.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djisubflyzoneinformation_radius"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djisubflyzoneinformation_radius_inline">getRadius</a></div></div><div class="inline-doc" id="djiflyzonemanager_djisubflyzoneinformation_radius_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRadius</h6></div>

~~~java
 double getRadius() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">The radius of the fly zone in meters. Only used when <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJISubFlyZoneInformation.html#djiflyzonemanager_djisubflyzoneinformation_shape">getShape</a></code> is <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJISubFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation_djisubflyzoneshape_circle">CYLINDER</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">double</td><td><font color="#666"><i>A double value of fly zone radius.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djisubflyzoneinformation_vertices"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djisubflyzoneinformation_vertices_inline">getVertices</a></div></div><div class="inline-doc" id="djiflyzonemanager_djisubflyzoneinformation_vertices_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVertices</h6></div>

~~~java
 List<LocationCoordinate2D> getVertices() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">The vertices (locations) that make up the sub fly zone polygon shape. Only used when <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJISubFlyZoneInformation.html#djiflyzonemanager_djisubflyzoneinformation_shape">getShape</a></code> is <code><a href="/Components/FlyZoneManager/DJIFlyZoneManager_DJISubFlyZoneInformation.html#djiflyzonemanager_djiflyzoneinformation_djisubflyzoneshape_polygon">POLYGON</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;<a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a>&gt;</td><td><font color="#666"><i>A List of CLLocationCoordinate2D object.</i></td></tr></table></html></div>

<div class="api-row" id="djiflyzonemanager_djisubflyzoneinformation_maximumflightheight"><div class="api-col left">Maximum Flight Height</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djisubflyzoneinformation_maximumflightheight_inline">getMaxFlightHeight</a></div></div><div class="inline-doc" id="djiflyzonemanager_djisubflyzoneinformation_maximumflightheight_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMaxFlightHeight</h6></div>

~~~java
 int getMaxFlightHeight() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">Maximum flight height in meters allowed in the sub fly zone. A height of 0m will  restrict flight completely within the zone.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of maximum flight height.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiflyzonemanager_djiflyzoneinformation_djisubflyzoneshape"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiflyzonemanager_djiflyzoneinformation_djisubflyzoneshape_inline">SubFlyZoneShape</a></div></div><div class="inline-doc" id="djiflyzonemanager_djiflyzoneinformation_djisubflyzoneshape_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>SubFlyZoneShape</h6></div>

~~~java
@EXClassNullAway
 enum SubFlyZoneShape 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flyzone</td></tr></table></html>



##### Description:



<font color="#666">This type of the geospatial information for the fly zone.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_djisubflyzoneshape_circle_inline"></a>CYLINDER</td><td><font color="#666">Circle shape.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_djisubflyzoneshape_polygon_inline"></a>POLYGON</td><td><font color="#666">Polygon shape.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiflyzonemanager_djiflyzoneinformation_djisubflyzoneshape_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>


