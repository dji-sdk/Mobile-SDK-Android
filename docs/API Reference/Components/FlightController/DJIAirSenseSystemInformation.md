<div class="article"><h1 ><font color="#AAA">class </font>AirSenseSystemInformation</h1></div>

~~~java
@EXClassNullAway
 class AirSenseSystemInformation 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.adsb</td></tr></table></html>



##### Description:



<font color="#666">The state of DJI AirSense system. It contains the overall warning level and the detailed state of each detected airplane.



##### Class Members:

<div class="api-row" id="djiairsensesysteminformation_systemwarninglevel"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairsensesysteminformation_systemwarninglevel_inline">getWarningLevel</a></div></div><div class="inline-doc" id="djiairsensesysteminformation_systemwarninglevel_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWarningLevel</h6></div>

~~~java
 AirSenseWarningLevel getWarningLevel() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.adsb</td></tr></table></html>



##### Description:



<font color="#666">The overall system warning level. This will be the worst case of all individual aircraft warning levels.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIAirSenseSystemInformation.html#djiairsensewarninglevel">AirSenseWarningLevel</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/FlightController/DJIAirSenseSystemInformation.html#djiairsensewarninglevel">AirSenseWarningLevel</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiairsensesysteminformation_airplanestates"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairsensesysteminformation_airplanestates_inline">getAirplaneStates</a></div></div><div class="inline-doc" id="djiairsensesysteminformation_airplanestates_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAirplaneStates</h6></div>

~~~java
 AirSenseAirplaneState[] getAirplaneStates() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.adsb</td></tr></table></html>



##### Description:



<font color="#666">The state of all airplanes detected by DJI AirSense system.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIAirSenseAirplaneState.html#djiairsenseairplanestate">AirSenseAirplaneState</a>[]</td><td><font color="#666"><i>An array of <code><a href="/Components/FlightController/DJIAirSenseAirplaneState.html#djiairsenseairplanestate">AirSenseAirplaneState</a></code> objects.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiairsensesysteminformation_callbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightController/DJIAirSenseSystemInformation_callbackInterface.html">Callback</a></div></div><div class="api-row" id="djiairsensewarninglevel"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djiairsensewarninglevel_inline">AirSenseWarningLevel</a></div></div><div class="inline-doc" id="djiairsensewarninglevel_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>AirSenseWarningLevel</h6></div>

~~~java
@EXClassNullAway
 enum AirSenseWarningLevel 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.adsb</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_air_sense_system_warning_level_key">FlightControllerKey.AIR_SENSE_SYSTEM_WARNING_LEVEL</a></td></tr></table></html>



##### Description:



<font color="#666">The warning level determined by the DJI AirSense system. The warning level is based on the distance between the airplane and the DJI aircraft, and the heading of the airplane.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djiairsensewarninglevel_0_inline"></a>LEVEL_0</td><td><font color="#666">The system detects the airplane but the DJI aircraft is either far away from the airplane or is in the opposite direction of the airplane's heading.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiairsensewarninglevel_1_inline"></a>LEVEL_1</td><td><font color="#666">The system detects the airplane. The probability that it will pass through the location of the DJI aircraft is considered low.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiairsensewarninglevel_2_inline"></a>LEVEL_2</td><td><font color="#666">The system detects the airplane. The probability that it will pass through the location of the DJI aircraft is considered medium.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiairsensewarninglevel_3_inline"></a>LEVEL_3</td><td><font color="#666">The system detects the airplane. The probability that it will pass through the location of the DJI aircraft is considered high.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiairsensewarninglevel_4_inline"></a>LEVEL_4</td><td><font color="#666">The system detects the airplane. The probability that it will pass through the location of the DJI aircraft is very high.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djiairsensewarninglevel_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djiairsenseairplanestate"><div class="api-col left">Air Sense Airplane State</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/FlightController/DJIAirSenseAirplaneState.html">AirSenseAirplaneState</a></div></div>
