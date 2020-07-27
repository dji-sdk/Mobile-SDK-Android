<div class="article"><h1 ><font color="#AAA">class </font>AirSenseAirplaneState</h1></div>

~~~java
@EXClassNullAway
 class AirSenseAirplaneState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.adsb</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_air_sense_airplane_states_key">FlightControllerKey.AIR_SENSE_AIRPLANE_STATES</a></td></tr></table></html>



##### Description:



<font color="#666">The AirSense state of an airplane. <br><br>DJI AirSense only sends out warnings of nearby civil aircraft under certain circumstances; it will NOT control DJI aircraft to avoid other aircraft automatically. Make sure to fly with your aircraft within visual line of sight at all times, and always fly with caution. After receiving warnings, lower your aircraft to a safe height. In addition, DJI AirSense has the following limitations: <br><br>1. DJI AirSense can only receive messages sent from civil aircraft equipped with an ADS-B out device under 1090ES (RTCA DO-260) or UAT (RTCA Do-282) standards. For civil aircraft without ADS-B outs or with malfunctioning ADS-B outs, DJI AirSense cannot receive related broadcasted messages or send out warnings. <br><br>2. When there are obstacles in between a civil aircraft and DJI aircraft, DJI AirSense will fail to receive ADS-B messages sent from civil aircraft or to send out warnings. <br><br>3. DJI AirSense may fail to receive ADS-B messages sent from civil aircraft or send out warnings due to ever changing circumstances and interference. It is highly recommended to fly with caution and stay aware of your surroundings during flight. <br><br>4. DJI AirSense cannot send out warnings when the DJI aircraft cannot accurately determine its location. <br><br>5. DJI AirSense cannot receive ADS-B messages sent from civil aircraft or send out warnings when it is disabled or misconfigured.



##### Class Members:

<div class="api-row" id="djiairsenseairplanestate_code"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairsenseairplanestate_code_inline">getCode</a></div></div><div class="inline-doc" id="djiairsenseairplanestate_code_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCode</h6></div>

~~~java
 String getCode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.adsb</td></tr></table></html>



##### Description:



<font color="#666">The unique code (ICAO) of the airplane.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>String of the unique code (ICAO).</i></td></tr></table></html></div>

<div class="api-row" id="djiairsenseairplanestate_warninglevel"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairsenseairplanestate_warninglevel_inline">getWarningLevel</a></div></div><div class="inline-doc" id="djiairsenseairplanestate_warninglevel_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWarningLevel</h6></div>

~~~java
 AirSenseWarningLevel getWarningLevel() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.adsb</td></tr></table></html>



##### Description:



<font color="#666">The warning level determined by DJI AirSense system.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIAirSenseSystemInformation.html#djiairsensewarninglevel">AirSenseWarningLevel</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/FlightController/DJIAirSenseSystemInformation.html#djiairsensewarninglevel">AirSenseWarningLevel</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiairsenseairplanestate_relativedirection"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairsenseairplanestate_relativedirection_inline">getRelativeDirection</a></div></div><div class="inline-doc" id="djiairsenseairplanestate_relativedirection_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRelativeDirection</h6></div>

~~~java
 AirSenseDirection getRelativeDirection() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.adsb</td></tr></table></html>



##### Description:



<font color="#666">The direction of the airplane relative to the DJI aircraft.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIAirSenseAirplaneState.html#djiairsensedirection">AirSenseDirection</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/FlightController/DJIAirSenseAirplaneState.html#djiairsensedirection">AirSenseDirection</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiairsenseairplanestate_heading"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairsenseairplanestate_heading_inline">getHeading</a></div></div><div class="inline-doc" id="djiairsenseairplanestate_heading_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHeading</h6></div>

~~~java
 float getHeading() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.adsb</td></tr></table></html>



##### Description:



<font color="#666">The heading of the airplane.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of heading.</i></td></tr></table></html></div>

<div class="api-row" id="djiairsenseairplanestate_distance"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairsenseairplanestate_distance_inline">getDistance</a></div></div><div class="inline-doc" id="djiairsenseairplanestate_distance_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDistance</h6></div>

~~~java
 int getDistance() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.adsb</td></tr></table></html>



##### Description:



<font color="#666">The distance between the airplane and DJI aircraft in meters.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of distance.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiairsenseairplanestate_callbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightController/DJIAirSenseAirplaneState_callbackInterface.html">Callback</a></div></div><div class="api-row" id="djiairsensedirection"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiairsensedirection_inline">AirSenseDirection</a></div></div><div class="inline-doc" id="djiairsensedirection_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>AirSenseDirection</h6></div>

~~~java
@EXClassNullAway
 enum AirSenseDirection 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.adsb</td></tr></table></html>



##### Description:



<font color="#666">Directions.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiairsensedirection_north_inline"></a>NORTH</td><td><font color="#666">North.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiairsensedirection_northeast_inline"></a>NORTH_EAST</td><td><font color="#666">North east.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiairsensedirection_east_inline"></a>EAST</td><td><font color="#666">East.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiairsensedirection_southeast_inline"></a>SOUTH_EAST</td><td><font color="#666">South east.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiairsensedirection_south_inline"></a>SOUTH</td><td><font color="#666">South.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiairsensedirection_southwest_inline"></a>SOUTH_WEST</td><td><font color="#666">South west.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiairsensedirection_west_inline"></a>WEST</td><td><font color="#666">West.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiairsensedirection_northwest_inline"></a>NORTH_WEST</td><td><font color="#666">North west.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiairsensedirection_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>


