<div class="article"><h1 ><font color="#AAA">class </font>Callback</h1></div>

~~~java
 interface Callback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.simulator</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_simulator_state_key">FlightControllerKey.SIMULATOR_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">Simulator's callback interface. When the SDK receives the <code><a href="/Components/Simulator/DJISimulator_DJISimulatorState.html#djisimulator_djisimulatorstate">SimulatorState</a></code>, the override  method will be called.



##### Class Members:

<div class="api-row" id="djisimulator_updatesimulatorstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisimulator_updatesimulatorstate_inline">onUpdate</a></div></div><div class="inline-doc" id="djisimulator_updatesimulatorstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
 void onUpdate(@NonNull SimulatorState state)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.simulator</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_simulator_state_key">FlightControllerKey.SIMULATOR_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">Updates the simulator's current state.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Simulator/DJISimulator_DJISimulatorState.html#djisimulator_djisimulatorstate">SimulatorState</a> <font color="#000">state</td><td><font color="#666"><i>An instance of <code><a href="/Components/Simulator/DJISimulator_DJISimulatorState.html#djisimulator_djisimulatorstate">SimulatorState</a></code>.</i></td></tr></table></html></div>


