<div class="article"><h1 ><font color="#AAA">class </font>Simulator</h1></div>

~~~java
 class Simulator 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">DJI aircraft can be put into simulation mode using this class. Developers can start and stop the simulation, as well as monitor basic aircraft attitude and location information.



##### Class Members:

<div class="api-row" id="djisimulator_setupdatedsimulatorstatedatacallback"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisimulator_setupdatedsimulatorstatedatacallback_inline">setStateCallback</a></div></div><div class="inline-doc" id="djisimulator_setupdatedsimulatorstatedatacallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setStateCallback</h6></div>

~~~java
 void setStateCallback(@Nullable SimulatorState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_simulator_state_key">FlightControllerKey.SIMULATOR_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the callback function that updates the state data received from an aircraft in simulation mode.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Simulator/DJISimulator_DJISimulatorState.html#djisimulator_djisimulatorstate">SimulatorState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djisimulator_issimulatorstarted"><div class="api-col left">Simulator Control</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisimulator_issimulatorstarted_inline">isSimulatorActive</a></div></div><div class="inline-doc" id="djisimulator_issimulatorstarted_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isSimulatorActive</h6></div>

~~~java
 boolean isSimulatorActive() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_is_simulator_active_key">FlightControllerKey.IS_SIMULATOR_ACTIVE</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the simulator is started.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djisimulator_startsimulator"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisimulator_startsimulator_inline">start</a></div></div><div class="inline-doc" id="djisimulator_startsimulator_inline"

><div class="article"><h6 ><font color="#AAA">method </font>start</h6></div>

~~~java
 void start(@NonNull final InitializationData data, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_start_simulator_key">FlightControllerKey.START_SIMULATOR</a></td></tr></table></html>



##### Description:



<font color="#666">Start simulator. Will result in error if simulation is already started.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Components/Simulator/DJISimulator_DJISimulatorInitializationData.html#djisimulator_djisimulatorinitializationdata">InitializationData</a> <font color="#000">data</td><td><font color="#666"><i>The data with which to initialize the simulator.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djisimulator_stopsimulator"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisimulator_stopsimulator_inline">stop</a></div></div><div class="inline-doc" id="djisimulator_stopsimulator_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stop</h6></div>

~~~java
 void stop(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_stop_simulator_key">FlightControllerKey.STOP_SIMULATOR</a></td></tr></table></html>



##### Description:



<font color="#666">Stop the simulator.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djisimulator_setflyzoneenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisimulator_setflyzoneenabled_inline">setFlyZoneLimitationEnabled</a></div></div><div class="inline-doc" id="djisimulator_setflyzoneenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFlyZoneLimitationEnabled</h6></div>

~~~java
 void setFlyZoneLimitationEnabled(boolean enabled, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_fly_zone_limitation_enabled_key">FlightControllerKey.FLY_ZONE_LIMITATION_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Enable/disable the fly zone system in the simulator. By default, fly zone is disabled in the simulator.  Rebooting the aircraft is required for the settings to take effect.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable fly zone in the simulator.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djisimulator_getflyzoneenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisimulator_getflyzoneenabled_inline">getFlyZoneLimitationEnabled</a></div></div><div class="inline-doc" id="djisimulator_getflyzoneenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlyZoneLimitationEnabled</h6></div>

~~~java
 void getFlyZoneLimitationEnabled(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_fly_zone_limitation_enabled_key">FlightControllerKey.FLY_ZONE_LIMITATION_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Gets fly zone system simulator status (enabled/disabled). By default, fly zone is disabled in the simulator.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djisimulator_djisimulatorinitializationdata"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Simulator/DJISimulator_DJISimulatorInitializationData.html">InitializationData</a></div></div><div class="api-row" id="djisimulator_djisimulatorstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Simulator/DJISimulator_DJISimulatorState.html">SimulatorState</a></div></div>
