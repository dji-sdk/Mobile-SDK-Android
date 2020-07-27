<div class="article"><h1 ><font color="#AAA">class </font>GoHomeAssessment</h1></div>

~~~java
@EXClassNullAway
 final class GoHomeAssessment 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Class for smart go home status.



##### Class Members:

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus_remainingflighttime"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus_remainingflighttime_inline">getRemainingFlightTime</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus_remainingflighttime_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRemainingFlightTime</h6></div>

~~~java
 int getRemainingFlightTime() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_remaining_flight_time_key">FlightControllerKey.REMAINING_FLIGHT_TIME</a></td></tr></table></html>



##### Description:



<font color="#666">The estimated remaining time, in seconds, it will take the aircraft to go home with a 10% battery buffer remaining. This time includes landing the aircraft. If the aircraft is using the simulator, this value will be 0.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus_timeneededtogohome"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus_timeneededtogohome_inline">getTimeNeededToGoHome</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus_timeneededtogohome_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTimeNeededToGoHome</h6></div>

~~~java
 int getTimeNeededToGoHome() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_time_needed_to_go_home_key">FlightControllerKey.TIME_NEEDED_TO_GO_HOME</a></td></tr></table></html>



##### Description:



<font color="#666">The estimated time, in seconds, needed for the aircraft to go home from its current location.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus_timeneededtolandfromcurrentheight"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus_timeneededtolandfromcurrentheight_inline">getTimeNeededToLandFromCurrentHeight</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus_timeneededtolandfromcurrentheight_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTimeNeededToLandFromCurrentHeight</h6></div>

~~~java
 int getTimeNeededToLandFromCurrentHeight() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_time_needed_to_land_from_current_height_key">FlightControllerKey.TIME_NEEDED_TO_LAND_FROM_CURRENT_HEIGHT</a></td></tr></table></html>



##### Description:



<font color="#666">The estimated time, in seconds, needed for the aircraft to move downward from its current position and land.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus_batterypercentageneededtogohome"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus_batterypercentageneededtogohome_inline">getBatteryPercentageNeededToGoHome</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus_batterypercentageneededtogohome_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBatteryPercentageNeededToGoHome</h6></div>

~~~java
 int getBatteryPercentageNeededToGoHome() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_battery_percentage_needed_to_go_home_key">FlightControllerKey.BATTERY_PERCENTAGE_NEEDED_TO_GO_HOME</a></td></tr></table></html>



##### Description:



<font color="#666">The estimated battery percentage, in the range of [0,100], needed for the aircraft to go home and have 10% battery remaining. This includes landing of the aircraft.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus_batterypercentageneededtolandfromcurrentheight"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus_batterypercentageneededtolandfromcurrentheight_inline">getBatteryPercentageNeededToLandFromCurrentHeight</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus_batterypercentageneededtolandfromcurrentheight_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBatteryPercentageNeededToLandFromCurrentHeight</h6></div>

~~~java
 int getBatteryPercentageNeededToLandFromCurrentHeight() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_current_land_immediately_battery_key">FlightControllerKey.CURRENT_LAND_IMMEDIATELY_BATTERY</a></td></tr></table></html>



##### Description:



<font color="#666">The battery percentage, in the range of [0,100], needed for the aircraft to move downward from its current position and land.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Battery percentage.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus_maxradiusaircraftcanflyandgohome"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus_maxradiusaircraftcanflyandgohome_inline">getMaxRadiusAircraftCanFlyAndGoHome</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus_maxradiusaircraftcanflyandgohome_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMaxRadiusAircraftCanFlyAndGoHome</h6></div>

~~~java
 float getMaxRadiusAircraftCanFlyAndGoHome() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_max_radius_aircraft_can_fly_and_go_home_key">FlightControllerKey.MAX_RADIUS_AIRCRAFT_CAN_FLY_AND_GO_HOME</a></td></tr></table></html>



##### Description:



<font color="#666">The maximum radius, in meters, an aircraft can fly from its home location and still make it all the way back home, based on altitude, distance, battery, etc. If the  aircraft goes out farther than the max radius, it will fly as far back home as it can and land. If the aircraft is using the simulator, this value will be 0.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus_smartrthstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus_smartrthstate_inline">getSmartRTHState</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus_smartrthstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSmartRTHState</h6></div>

~~~java
 SmartRTHState getSmartRTHState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">The Smart Return-To-Home (RTH) state for the current flight.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightcontrollersmartrthstate">SmartRTHState</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightcontrollersmartrthstate">SmartRTHState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus_smartrthcountdown"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus_smartrthcountdown_inline">getSmartRTHCountdown</a></div></div><div class="inline-doc" id="djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus_smartrthcountdown_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSmartRTHCountdown</h6></div>

~~~java
 int getSmartRTHCountdown() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">The countdown (in seconds) for the Smart Return-To-Home (RTH). Once the countdown reaches 0, the aircraft will  execute an automatic go-home procedure. It is only valid when  <code><a href="/Components/FlightController/DJIFlightController_DJIFlightControllerCurrentState_DJIFlightControllerSmartGoHomeStatus.html#djiflightcontroller_djiflightcontrollercurrentstate_djiflightcontrollersmartgohomestatus_smartrthstate">getSmartRTHState</a></code>  is <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightcontrollersmartrthstate_countingdown">COUNTING_DOWN</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>The countdown for the Smart Return-To-Home (RTH).</i></td></tr></table></html></div>


