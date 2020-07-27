<div class="article"><h1 ><font color="#AAA">class </font>Callback</h1></div>

~~~java
 interface Callback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Callback function that updates the flight controller's current state data. This method gets called 10 times per second after startUpdatingFlightControllerCurrentState is called.



##### Class Members:

<div class="api-row" id="djiflightcontroller_updatesystemstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_updatesystemstate_inline">onUpdate</a></div></div><div class="inline-doc" id="djiflightcontroller_updatesystemstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
 void onUpdate(@NonNull FlightControllerState state)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Called when the flight controller's current state data has been updated. This method is called 10 times per second.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/FlightController/DJIFlightController_DJIFlightControllerCurrentState.html#djiflightcontroller_djiflightcontrollercurrentstate">FlightControllerState</a> <font color="#000">state</td><td><font color="#666"><i>Current state of the flight controller.</i></td></tr></table></html></div>


