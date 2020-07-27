<div class="article"><h1 ><font color="#AAA">class </font>SimulatorState</h1></div>

~~~java
@EXClassNullAway
 class SimulatorState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.simulator</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_simulator_state_key">FlightControllerKey.SIMULATOR_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">Aircraft simulator state data.



##### Class Members:



##### Related:

<div class="api-row" id="djisimulator_updatedsimulatorstatedatacallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Simulator/DJISimulator_UpdatedSimulatorStateDataCallbackInterface.html">Callback</a></div></div><div class="api-row" id="djisimulator_djisimulatorstate_aremotorson"><div class="api-col left">Simulated Aircraft State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisimulator_djisimulatorstate_aremotorson_inline">areMotorsOn</a></div></div><div class="inline-doc" id="djisimulator_djisimulatorstate_aremotorson_inline"

><div class="article"><h6 ><font color="#AAA">method </font>areMotorsOn</h6></div>

~~~java
 boolean areMotorsOn() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.simulator</td></tr></table></html>



##### Description:



<font color="#666">TRUE if motors are on in the simulator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djisimulator_djisimulatorstate_isflying"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisimulator_djisimulatorstate_isflying_inline">isFlying</a></div></div><div class="inline-doc" id="djisimulator_djisimulatorstate_isflying_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isFlying</h6></div>

~~~java
 boolean isFlying() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.simulator</td></tr></table></html>



##### Description:



<font color="#666">TRUE if aircraft is flying in the simulator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djisimulator_djisimulatorstate_location"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisimulator_djisimulatorstate_location_inline">getLocation</a></div></div><div class="inline-doc" id="djisimulator_djisimulatorstate_location_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLocation</h6></div>

~~~java
 LocationCoordinate2D getLocation() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.simulator</td></tr></table></html>



##### Description:



<font color="#666">Simulated aircraft location.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></td><td><font color="#666"><i>Location object.</i></td></tr></table></html></div>

<div class="api-row" id="djisimulator_djisimulatorstate_positionx"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisimulator_djisimulatorstate_positionx_inline">getPositionX</a></div></div><div class="inline-doc" id="djisimulator_djisimulatorstate_positionx_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPositionX</h6></div>

~~~java
 float getPositionX() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.simulator</td></tr></table></html>



##### Description:



<font color="#666">Gets East-West distance from initial simulator location, where East is positive, and  North-East-Down coordinate system is used.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djisimulator_djisimulatorstate_positiony"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisimulator_djisimulatorstate_positiony_inline">getPositionY</a></div></div><div class="inline-doc" id="djisimulator_djisimulatorstate_positiony_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPositionY</h6></div>

~~~java
 float getPositionY() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.simulator</td></tr></table></html>



##### Description:



<font color="#666">Gets North-South distance from initial simulator location, where North is positive, and  North-East-Down coordinate system is used.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djisimulator_djisimulatorstate_positionz"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisimulator_djisimulatorstate_positionz_inline">getPositionZ</a></div></div><div class="inline-doc" id="djisimulator_djisimulatorstate_positionz_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPositionZ</h6></div>

~~~java
 float getPositionZ() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.simulator</td></tr></table></html>



##### Description:



<font color="#666">Gets vertical distance from initial simulator location. The value should be negative if the height of aircraft is higher  than initial home point's height.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djisimulator_djisimulatorstate_pitch"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisimulator_djisimulatorstate_pitch_inline">getPitch</a></div></div><div class="inline-doc" id="djisimulator_djisimulatorstate_pitch_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPitch</h6></div>

~~~java
 float getPitch() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.simulator</td></tr></table></html>



##### Description:



<font color="#666">Simulated aircraft pitch with range [-30, 30] degrees.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djisimulator_djisimulatorstate_roll"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisimulator_djisimulatorstate_roll_inline">getRoll</a></div></div><div class="inline-doc" id="djisimulator_djisimulatorstate_roll_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRoll</h6></div>

~~~java
 float getRoll() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.simulator</td></tr></table></html>



##### Description:



<font color="#666">Simulated aircraft roll with range [-30, 30] degrees.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djisimulator_djisimulatorstate_yaw"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisimulator_djisimulatorstate_yaw_inline">getYaw</a></div></div><div class="inline-doc" id="djisimulator_djisimulatorstate_yaw_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getYaw</h6></div>

~~~java
 float getYaw() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.simulator</td></tr></table></html>



##### Description:



<font color="#666">Simulated aircraft yaw with range [-180, 180] degrees.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>


