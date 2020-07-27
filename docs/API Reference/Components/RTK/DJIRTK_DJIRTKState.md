<div class="article"><h1 ><font color="#AAA">class </font>RTKState</h1></div>

~~~java
@EXClassNullAway
 final class RTKState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_rtk_state_key">FlightControllerKey.RTK_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">This class holds the state of the RTK system, including position, positioning solution, and receiver information.  Receiver 1 is used for positioning. Receiver 2 is used for orienteering.



##### Class Members:



#### Use and Position

<div class="api-row" id="djirtk_djirtkstate_isrtkbeingused"><div class="api-col left">Use</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_isrtkbeingused_inline">isRTKBeingUsed</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_isrtkbeingused_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isRTKBeingUsed</h6></div>

~~~java
 boolean isRTKBeingUsed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Whether the RTK is being used.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_getmobilestation1satellitecount"><div class="api-col left">Mobile Station Satellite Count</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_getmobilestation1satellitecount_inline">getMobileStation1SatelliteCount</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_getmobilestation1satellitecount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMobileStation1SatelliteCount</h6></div>

~~~java
 int getMobileStation1SatelliteCount() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Get the total number of satellites from Mobile station (aircraft) receiver 1.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_getmobilestation2satellitecount"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_getmobilestation2satellitecount_inline">getMobileStation2SatelliteCount</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_getmobilestation2satellitecount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMobileStation2SatelliteCount</h6></div>

~~~java
 int getMobileStation2SatelliteCount() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Get the total number of satellites from Mobile station (aircraft) receiver 2.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_distancetohomepointdatasource"><div class="api-col left">Distance</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_distancetohomepointdatasource_inline">distanceToHomePointDataSource</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_distancetohomepointdatasource_inline"

><div class="article"><h6 ><font color="#AAA">property </font>distanceToHomePointDataSource</h6></div>

~~~java
@Nullable public DataSource getDistanceToHomePointDataSource() {
        return distanceToHomePointDataSource
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Distance to home point data source. Only Supported by Phantom 4 RTK.

</div>

<div class="api-row" id="djirtk_djirtkstate_istakeoffaltituderecorded"><div class="api-col left">Recorded</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_istakeoffaltituderecorded_inline">isTakeoffAltitudeRecorded</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_istakeoffaltituderecorded_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isTakeoffAltitudeRecorded</h6></div>

~~~java
 boolean isTakeoffAltitudeRecorded() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the altitude is recorded by the flight controller when the aircraft takes off. Only Supported by Phantom 4 RTK.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value to check if take off altitude has been recorded.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_homepointdatasource"><div class="api-col left">Data Source</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_homepointdatasource_inline">homePointDataSource</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_homepointdatasource_inline"

><div class="article"><h6 ><font color="#AAA">property </font>homePointDataSource</h6></div>

~~~java
@Nullable public DataSource getHomePointDataSource() {
        return homePointDataSource
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Home point data source. Only Supported by Phantom 4 RTK.

</div>

<div class="api-row" id="djirtk_djirtkstate_satellitecount"><div class="api-col left">Satellite Count</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_satellitecount_inline">getSatelliteCount</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_satellitecount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSatelliteCount</h6></div>

~~~java
 int getSatelliteCount() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gps or RTK satellite count. Only Supported by Phantom 4 RTK.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Satellite count.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_homepointlocation"><div class="api-col left">Home Point Location</div><div class="api-col middle" style="color:#AAA">property</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_homepointlocation_inline">homePointLocation</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_homepointlocation_inline"

><div class="article"><h6 ><font color="#AAA">property </font>homePointLocation</h6></div>

~~~java
@Nullable public LocationCoordinate2D getHomePointLocation() {
        return homePointLocation
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Home point location. Only Supported by Phantom 4 RTK.

</div>

<div class="api-row" id="djirtk_djirtkstate_takeoffaltitude"><div class="api-col left">Take Off Altitude</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_takeoffaltitude_inline">getTakeOffAltitude</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_takeoffaltitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTakeOffAltitude</h6></div>

~~~java
 float getTakeOffAltitude() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Takeoff altitude. Only Supported by Phantom 4 RTK.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of the takeoff altitude.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_distancetohomepoint"><div class="api-col left">Distance to Home Point</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_distancetohomepoint_inline">getDistanceToHomePoint</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_distancetohomepoint_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDistanceToHomePoint</h6></div>

~~~java
 float getDistanceToHomePoint() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Distance to home point. Only Supported by Phantom 4 RTK.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of the distance to home point.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_ellipsoidheight"><div class="api-col left">Ellipsoid height</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_ellipsoidheight_inline">getEllipsoidHeight</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_ellipsoidheight_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getEllipsoidHeight</h6></div>

~~~java
 float getEllipsoidHeight() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Ellipsoid height. Only Supported by Matrice 300 RTK.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of the ellipsoid height.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_aircraftaltitude"><div class="api-col left">Aircraft altitude</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_aircraftaltitude_inline">getAircraftAltitude</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_aircraftaltitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAircraftAltitude</h6></div>

~~~java
 float getAircraftAltitude() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Aircraft altitude. Supported by Matrice 300 RTK, Phantom 4 RTK and P4 Multispectral.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of the aircraft altitude.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_positioningsolution"><div class="api-col left">Positioning Solution</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_positioningsolution_inline">getPositioningSolution</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_positioningsolution_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPositioningSolution</h6></div>

~~~java
 PositioningSolution getPositioningSolution() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">The positioning solution describes the method used to determine positioning. The solutions vary in accuracy, from <code><a href="/Components/RTK/DJIRTK_DJIRTKState.html#djirtk_djirtkpositioningsolution_none">NONE</a></code> (no positioning) to <code><a href="/Components/RTK/DJIRTK_DJIRTKState.html#djirtk_djirtkpositioningsolution_fixedpoint">FIXED_POINT</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RTK/DJIRTK_DJIRTKState.html#djirtk_djirtkpositioningsolution">PositioningSolution</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/RTK/DJIRTK_DJIRTKState.html#djirtk_djirtkpositioningsolution">PositioningSolution</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_error"><div class="api-col left">Error</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_error_inline">getError</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_error_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getError</h6></div>

~~~java
 DJIError getError() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets RTK errors, if any. Returns <code>null</code> when RTK is normal.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_isheadingvalid"><div class="api-col left">Heading</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_isheadingvalid_inline">isHeadingValid</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_isheadingvalid_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isHeadingValid</h6></div>

~~~java
 boolean isHeadingValid() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if heading value is valid. Heading is invalid when a satellite fix hasn't been obtained.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_heading"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_heading_inline">getHeading</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_heading_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHeading</h6></div>

~~~java
 float getHeading() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Heading relative to True North as defined by the vector formed from Antenna 2 to Antenna 1 on the mobile station. Unit is degrees.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_headingsolution"><div class="api-col left">Heading Solution</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_headingsolution_inline">getHeadingSolution</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_headingsolution_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHeadingSolution</h6></div>

~~~java
 HeadingSolution getHeadingSolution() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">The heading solution describes the method used to determine heading. The solutions vary in accuracy,  from <code><a href="/Components/RTK/DJIRTK.html#djirtk_djirtkheadingsolution_none">NONE</a></code> (no heading) to <code><a href="/Components/RTK/DJIRTK.html#djirtk_djirtkheadingsolution_fixedpoint">FIXED_POINT</a></code>. It's supported by Matrice  200 series V2 and Phantom 4 RTK.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RTK/DJIRTK.html#djirtk_djirtkheadingsolution">HeadingSolution</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/RTK/DJIRTK_DJIRTKState.html#djirtk_djirtkstate_headingsolution">getHeadingSolution</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_mobilestationantenna1location"><div class="api-col left">Mobile Station Position</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_mobilestationantenna1location_inline">getMobileStationLocation</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_mobilestationantenna1location_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMobileStationLocation</h6></div>

~~~java
 LocationCoordinate2D getMobileStationLocation() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Always indicate RTK location data. Location information of the mobile station's receiver 1 antenna. This location  information is relative to the base station's location and is in degrees when <code><a href="/Components/RTK/DJIRTK_DJIRTKState.html#djirtk_djirtkstate_positioningsolution">getPositioningSolution</a></code>  is <code><a href="/Components/RTK/DJIRTK_DJIRTKState.html#djirtk_djirtkpositioningsolution_fixedpoint">FIXED_POINT</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_mobilestationantenna1altitude"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_mobilestationantenna1altitude_inline">getMobileStationAltitude</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_mobilestationantenna1altitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMobileStationAltitude</h6></div>

~~~java
 float getMobileStationAltitude() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Altitude of the mobile station's receiver 1 antenna relative, to the ground system location. Units are meters.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_mobilestationstandarddeviation"><div class="api-col left">Mobile Station Deviation</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_mobilestationstandarddeviation_inline">getMobileStationStandardDeviation</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_mobilestationstandarddeviation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMobileStationStandardDeviation</h6></div>

~~~java
 LocationStandardDeviation getMobileStationStandardDeviation() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Standard deviation of location accuracy in meters. Returns <code>null</code> when the aircraft receives no signal.  Only Supported by Phantom 4 RTK.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RTK/DJIRTK_DJILocationStandardDeviation.html#djirtk_djilocationstandarddeviation">LocationStandardDeviation</a></td><td><font color="#666"><i>A <code><a href="/Components/RTK/DJIRTK_DJILocationStandardDeviation.html#djirtk_djilocationstandarddeviation">LocationStandardDeviation</a></code> object of the mobile station standard deviation.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_mobilestationfusionlocation"><div class="api-col left">Mobile Station Fusion Location</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_mobilestationfusionlocation_inline">getFusionMobileStationLocation</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_mobilestationfusionlocation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFusionMobileStationLocation</h6></div>

~~~java
 LocationCoordinate2D getFusionMobileStationLocation() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">The fusion location of the mobile station (in degrees). It is the combination of GPS and RTK. The flight controller uses this location for navigation (e.g. waypoint mission) when RTK is available.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_mobilestationfusionaltitude"><div class="api-col left">Mobile Station Fusion Altitude</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_mobilestationfusionaltitude_inline">getFusionMobileStationAltitude</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_mobilestationfusionaltitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFusionMobileStationAltitude</h6></div>

~~~java
 float getFusionMobileStationAltitude() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">The fusion altitude of the mobile station. The flight controller fuses the data from GPS, RTK and the barometer.  The flight controller uses this altitude for navigation (e.g. waypoint mission) when RTK is available.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_mobilestationfusionheading"><div class="api-col left">Mobile Station Fusion Heading</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_mobilestationfusionheading_inline">getFusionHeading</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_mobilestationfusionheading_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFusionHeading</h6></div>

~~~java
 float getFusionHeading() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">The fusion heading of the mobile station. It is the combination of RTK and the compass. The flight controller uses this heading for navigation (e.g. waypoint mission) when RTK is available.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_groundsystemlocation"><div class="api-col left">Base Station Position</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_groundsystemlocation_inline">getBaseStationLocation</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_groundsystemlocation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBaseStationLocation</h6></div>

~~~java
 LocationCoordinate2D getBaseStationLocation() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Base station's location coordinates, in degrees.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_groundsystemaltitude"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_groundsystemaltitude_inline">getBaseStationAltitude</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_groundsystemaltitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBaseStationAltitude</h6></div>

~~~java
 float getBaseStationAltitude() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Altitude of the base station above sea level, in meters.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Satellite Information

<div class="api-row" id="djirtk_djirtkstate_mobilestationreceiver1gpsinfo"><div class="api-col left">Mobile Station</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_mobilestationreceiver1gpsinfo_inline">getMobileStationReceiver1GPSInfo</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_mobilestationreceiver1gpsinfo_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMobileStationReceiver1GPSInfo</h6></div>

~~~java
 ReceiverInfo getMobileStationReceiver1GPSInfo() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Mobile station (aircraft) receiver 1 GPS info.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RTK/DJIRTK_DJIRTKReceiverInfo.html#djirtk_djirtkreceiverinfo">ReceiverInfo</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RTK/DJIRTK_DJIRTKReceiverInfo.html#djirtk_djirtkreceiverinfo">ReceiverInfo</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_mobilestationreceiver1beidouinfo"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_mobilestationreceiver1beidouinfo_inline">getMobileStationReceiver1BeiDouInfo</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_mobilestationreceiver1beidouinfo_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMobileStationReceiver1BeiDouInfo</h6></div>

~~~java
 ReceiverInfo getMobileStationReceiver1BeiDouInfo() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Mobile station (aircraft) receiver 1 BeiDou info.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RTK/DJIRTK_DJIRTKReceiverInfo.html#djirtk_djirtkreceiverinfo">ReceiverInfo</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RTK/DJIRTK_DJIRTKReceiverInfo.html#djirtk_djirtkreceiverinfo">ReceiverInfo</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_mobilestationreceiver1glonassinfo"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_mobilestationreceiver1glonassinfo_inline">getMobileStationReceiver1GLONASSInfo</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_mobilestationreceiver1glonassinfo_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMobileStationReceiver1GLONASSInfo</h6></div>

~~~java
 ReceiverInfo getMobileStationReceiver1GLONASSInfo() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Mobile station (aircraft) receiver 1 GLONASS info.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RTK/DJIRTK_DJIRTKReceiverInfo.html#djirtk_djirtkreceiverinfo">ReceiverInfo</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RTK/DJIRTK_DJIRTKReceiverInfo.html#djirtk_djirtkreceiverinfo">ReceiverInfo</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_mobilestationreceiver1galileoinfo"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_mobilestationreceiver1galileoinfo_inline">getMobileStationReceiver1GalileoInfo</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_mobilestationreceiver1galileoinfo_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMobileStationReceiver1GalileoInfo</h6></div>

~~~java
 ReceiverInfo getMobileStationReceiver1GalileoInfo() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Mobile station (aircraft) receiver 1 Galileo info. Only Supported by Phantom 4 RTK.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RTK/DJIRTK_DJIRTKReceiverInfo.html#djirtk_djirtkreceiverinfo">ReceiverInfo</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RTK/DJIRTK_DJIRTKReceiverInfo.html#djirtk_djirtkreceiverinfo">ReceiverInfo</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_mobilestationreceiver2gpsinfo"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_mobilestationreceiver2gpsinfo_inline">getMobileStationReceiver2GPSInfo</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_mobilestationreceiver2gpsinfo_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMobileStationReceiver2GPSInfo</h6></div>

~~~java
 ReceiverInfo getMobileStationReceiver2GPSInfo() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Mobile station (aircraft) receiver 2 GPS info.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RTK/DJIRTK_DJIRTKReceiverInfo.html#djirtk_djirtkreceiverinfo">ReceiverInfo</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RTK/DJIRTK_DJIRTKReceiverInfo.html#djirtk_djirtkreceiverinfo">ReceiverInfo</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_mobilestationreceiver2beidouinfo"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_mobilestationreceiver2beidouinfo_inline">getMobileStationReceiver2BeiDouInfo</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_mobilestationreceiver2beidouinfo_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMobileStationReceiver2BeiDouInfo</h6></div>

~~~java
 ReceiverInfo getMobileStationReceiver2BeiDouInfo() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Mobile station (aircraft) receiver 2 BeiDou info.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RTK/DJIRTK_DJIRTKReceiverInfo.html#djirtk_djirtkreceiverinfo">ReceiverInfo</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RTK/DJIRTK_DJIRTKReceiverInfo.html#djirtk_djirtkreceiverinfo">ReceiverInfo</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_mobilestationreceiver2glonassinfo"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_mobilestationreceiver2glonassinfo_inline">getMobileStationReceiver2GLONASSInfo</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_mobilestationreceiver2glonassinfo_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMobileStationReceiver2GLONASSInfo</h6></div>

~~~java
 ReceiverInfo getMobileStationReceiver2GLONASSInfo() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Mobile station (aircraft) receiver 2 GLONASS info.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RTK/DJIRTK_DJIRTKReceiverInfo.html#djirtk_djirtkreceiverinfo">ReceiverInfo</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RTK/DJIRTK_DJIRTKReceiverInfo.html#djirtk_djirtkreceiverinfo">ReceiverInfo</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_mobilestationreceiver2galileoinfo"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_mobilestationreceiver2galileoinfo_inline">getMobileStationReceiver2GalileoInfo</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_mobilestationreceiver2galileoinfo_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMobileStationReceiver2GalileoInfo</h6></div>

~~~java
 ReceiverInfo getMobileStationReceiver2GalileoInfo() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Mobile station (aircraft) receiver 2 Galileo info. Only Supported by Phantom 4 RTK.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RTK/DJIRTK_DJIRTKReceiverInfo.html#djirtk_djirtkreceiverinfo">ReceiverInfo</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RTK/DJIRTK_DJIRTKReceiverInfo.html#djirtk_djirtkreceiverinfo">ReceiverInfo</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_groundsystemreceivergpsinfo"><div class="api-col left">Base Station</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_groundsystemreceivergpsinfo_inline">getBaseStationReceiverGPSInfo</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_groundsystemreceivergpsinfo_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBaseStationReceiverGPSInfo</h6></div>

~~~java
 ReceiverInfo getBaseStationReceiverGPSInfo() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Base station receiver GPS info.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RTK/DJIRTK_DJIRTKReceiverInfo.html#djirtk_djirtkreceiverinfo">ReceiverInfo</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RTK/DJIRTK_DJIRTKReceiverInfo.html#djirtk_djirtkreceiverinfo">ReceiverInfo</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_groundsystemreceiverbeidouinfo"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_groundsystemreceiverbeidouinfo_inline">getBaseStationReceiverBeiDouInfo</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_groundsystemreceiverbeidouinfo_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBaseStationReceiverBeiDouInfo</h6></div>

~~~java
 ReceiverInfo getBaseStationReceiverBeiDouInfo() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Base station receiver BeiDou info.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RTK/DJIRTK_DJIRTKReceiverInfo.html#djirtk_djirtkreceiverinfo">ReceiverInfo</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RTK/DJIRTK_DJIRTKReceiverInfo.html#djirtk_djirtkreceiverinfo">ReceiverInfo</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_groundsystemreceiverglonassinfo"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_groundsystemreceiverglonassinfo_inline">getBaseStationReceiverGLONASSInfo</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_groundsystemreceiverglonassinfo_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBaseStationReceiverGLONASSInfo</h6></div>

~~~java
 ReceiverInfo getBaseStationReceiverGLONASSInfo() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Base station receiver GLONASS info.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RTK/DJIRTK_DJIRTKReceiverInfo.html#djirtk_djirtkreceiverinfo">ReceiverInfo</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RTK/DJIRTK_DJIRTKReceiverInfo.html#djirtk_djirtkreceiverinfo">ReceiverInfo</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djirtk_djirtkstate_basestationreceivergalileoinfo"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkstate_basestationreceivergalileoinfo_inline">getBaseStationReceiverGalileoInfo</a></div></div><div class="inline-doc" id="djirtk_djirtkstate_basestationreceivergalileoinfo_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBaseStationReceiverGalileoInfo</h6></div>

~~~java
 ReceiverInfo getBaseStationReceiverGalileoInfo() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Base station receiver Galileo info. Only Supported by Phantom 4 RTK.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/RTK/DJIRTK_DJIRTKReceiverInfo.html#djirtk_djirtkreceiverinfo">ReceiverInfo</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/RTK/DJIRTK_DJIRTKReceiverInfo.html#djirtk_djirtkreceiverinfo">ReceiverInfo</a></code>.</i></td></tr></table></html></div>

<html><p><br></p></html>

##### Related:

<div class="api-row" id="djirtk_updatertkstatecallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/RTK/DJIRTK_updateRtkStateCallbackInterface.html">Callback</a></div></div><div class="api-row" id="djirtk_djirtkpositioningsolution"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djirtk_djirtkpositioningsolution_inline">PositioningSolution</a></div></div><div class="inline-doc" id="djirtk_djirtkpositioningsolution_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>PositioningSolution</h6></div>

~~~java
@EXClassNullAway
 enum PositioningSolution 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">This enum defines the positioning solution currently being used.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtkpositioningsolution_none_inline"></a>NONE</td><td><font color="#666">No positioning solution. This can be caused by an insufficient number of  satellites in view, insufficient time to lock onto the satellites, or a  loss in communication link between the mobile station and base station.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtkpositioningsolution_singlepoint_inline"></a>SINGLE_POINT</td><td><font color="#666">RTK point positioning.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtkpositioningsolution_float_inline"></a>FLOAT</td><td><font color="#666">Float solution positioning.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtkpositioningsolution_fixedpoint_inline"></a>FIXED_POINT</td><td><font color="#666">Fixed-point solution positioning (most accurate).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djirtk_djirtkpositioningsolution_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>


