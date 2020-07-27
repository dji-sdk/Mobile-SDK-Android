<div class="article"><h1 ><font color="#AAA">class </font>InitializationData</h1></div>

~~~java
@EXClassNullAway
 final class InitializationData 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.simulator</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_start_simulator_key">FlightControllerKey.START_SIMULATOR</a></td></tr></table></html>



##### Description:



<font color="#666">Data to initialize the simulator with.



##### Class Members:

<div class="api-row" id="djisimulator_djisimulatorinitializationdata_createinstance"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisimulator_djisimulatorinitializationdata_createinstance_inline">createInstance</a></div></div><div class="inline-doc" id="djisimulator_djisimulatorinitializationdata_createinstance_inline"

><div class="article"><h6 ><font color="#AAA">method </font>createInstance</h6></div>

~~~java
 static InitializationData createInstance(LocationCoordinate2D location,
                                                    @IntRange(from=2,to=150) int updateFrequency,
                                                    @IntRange(from=0,to=20) int satelliteCount) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.simulator</td></tr></table></html>



##### Description:



<font color="#666">Create the initialization data for the simulator.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a> <font color="#000">location</td><td><font color="#666"><i>Simulator coordinate latitude and longitude in degrees.</i></td></tr><tr valign="top"><td><font color="#70BF41">@IntRange(from=2,to=150) int <font color="#000">updateFrequency</td><td><font color="#666"><i>Aircraft simulator state push frequency in Hz with range [2, 150]. A setting of 10 Hz will result in delegate method being called, 10 times per second.</i></td></tr><tr valign="top"><td><font color="#70BF41">@IntRange(from=0,to=20) int <font color="#000">satelliteCount</td><td><font color="#666"><i>The initial number of GPS satellites with range [0, 20].</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/Simulator/DJISimulator_DJISimulatorInitializationData.html#djisimulator_djisimulatorinitializationdata">InitializationData</a></td><td><font color="#666"><i>Initialization data object.</i></td></tr></table></html></div>

<div class="api-row" id="djisimulator_djisimulatorinitializationdata_simulationstateupdatefrequency"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisimulator_djisimulatorinitializationdata_simulationstateupdatefrequency_inline">getUpdateFrequency</a></div></div><div class="inline-doc" id="djisimulator_djisimulatorinitializationdata_simulationstateupdatefrequency_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getUpdateFrequency</h6></div>

~~~java
 int getUpdateFrequency() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.simulator</td></tr></table></html>



##### Description:



<font color="#666">Aircraft simulator state push frequency in Hz with range [2, 150]. A setting of 10 Hz will result in  <code><a href="/Components/Simulator/DJISimulator_UpdatedSimulatorStateDataCallbackInterface.html#djisimulator_updatesimulatorstate">onUpdate</a></code> being called 10 times per second.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Frequency.</i></td></tr></table></html></div>

<div class="api-row" id="djisimulator_djisimulatorinitializationdata_numofsatellites"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisimulator_djisimulatorinitializationdata_numofsatellites_inline">getSatelliteCount</a></div></div><div class="inline-doc" id="djisimulator_djisimulatorinitializationdata_numofsatellites_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSatelliteCount</h6></div>

~~~java
 int getSatelliteCount() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.simulator</td></tr></table></html>



##### Description:



<font color="#666">The initial number of GNSS satellites with range [0, 20]



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>Number of satellites.</i></td></tr></table></html></div>

<div class="api-row" id="djisimulator_djisimulatorinitializationdata_location"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisimulator_djisimulatorinitializationdata_location_inline">getLocation</a></div></div><div class="inline-doc" id="djisimulator_djisimulatorinitializationdata_location_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLocation</h6></div>

~~~java
 LocationCoordinate2D getLocation() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.simulator</td></tr></table></html>



##### Description:



<font color="#666">Location to begin simulation.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></td><td><font color="#666"><i>Location object</i></td></tr></table></html></div>


