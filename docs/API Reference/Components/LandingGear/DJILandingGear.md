<div class="article"><h1 ><font color="#AAA">class </font>LandingGear</h1></div>

~~~java
 class LandingGear 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">This class controls and gives state of the landing gear. Please check <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_islandinggearmovable">isLandingGearMovable</a></code> before calling the methods in this class.



##### Class Members:

<div class="api-row" id="djilandinggear_status"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilandinggear_status_inline">getState</a></div></div><div class="inline-doc" id="djilandinggear_status_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getState</h6></div>

~~~java
 LandingGearState getState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_landing_gear_status_key">FlightControllerKey.LANDING_GEAR_STATUS</a></td></tr></table></html>



##### Description:



<font color="#666">The current state/position of the landing gear.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/LandingGear/DJILandingGear.html#djilandinggear_djilandinggearstatus">LandingGearState</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/LandingGear/DJILandingGear.html#djilandinggear_djilandinggearstatus">LandingGearState</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djilandinggear_mode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilandinggear_mode_inline">getMode</a></div></div><div class="inline-doc" id="djilandinggear_mode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMode</h6></div>

~~~java
 LandingGearMode getMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_landing_gear_mode_key">FlightControllerKey.LANDING_GEAR_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">The current mode of the landing gear.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/LandingGear/DJILandingGear.html#djilandinggear_djilandinggearmode">LandingGearMode</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/LandingGear/DJILandingGear.html#djilandinggear_djilandinggearmode">LandingGearMode</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djilandinggear_setautomaticmovementenabled"><div class="api-col left">Automatic Movement Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilandinggear_setautomaticmovementenabled_inline">setAutomaticMovementEnabled</a></div></div><div class="inline-doc" id="djilandinggear_setautomaticmovementenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAutomaticMovementEnabled</h6></div>

~~~java
 void setAutomaticMovementEnabled(boolean enabled, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_landing_gear_automatic_movement_enabled_key">FlightControllerKey.LANDING_GEAR_AUTOMATIC_MOVEMENT_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Turns on/off self-adaptive landing gear. When turned on, landing gear will automatically lower  when aircraft is 0.5m above the ground. After take-off, landing gear will automatically rise when  aircraft reaches 0.5m above the ground. If self-adaptive landing gear is turned off, aircraft  will not automatically raise or lower its landing gear.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i>YES if automatic movement is enabled.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Asynchronous execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djilandinggear_getautomaticmovementenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilandinggear_getautomaticmovementenabled_inline">getAutomaticMovementEnabled</a></div></div><div class="inline-doc" id="djilandinggear_getautomaticmovementenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAutomaticMovementEnabled</h6></div>

~~~java
 void getAutomaticMovementEnabled(@NonNull CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_landing_gear_automatic_movement_enabled_key">FlightControllerKey.LANDING_GEAR_AUTOMATIC_MOVEMENT_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Gets self-adaptive landing gear state (on/off). When turned on, landing gear will automatically lower  when aircraft is 0.5m above the ground. After take-off, landing gear will automatically rise when  aircraft reaches 0.5m above the ground. If self-adaptive landing gear is turned off, aircraft  will not automatically raise or lower its landing gear.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion callback that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djilandinggear_entertransportmode"><div class="api-col left">Transport Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilandinggear_entertransportmode_inline">enterTransportMode</a></div></div><div class="inline-doc" id="djilandinggear_entertransportmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>enterTransportMode</h6></div>

~~~java
 void enterTransportMode(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_enter_transport_mode_key">FlightControllerKey.ENTER_TRANSPORT_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Enters transport mode, moving the landing gear to its optimal position for transportation. Note that if the gimbal is not removed, or the ground is not  flat, entering transport mode will fail.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djilandinggear_exittransportmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilandinggear_exittransportmode_inline">exitTransportMode</a></div></div><div class="inline-doc" id="djilandinggear_exittransportmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>exitTransportMode</h6></div>

~~~java
 void exitTransportMode(@Nullable CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_exit_transport_mode_key">FlightControllerKey.EXIT_TRANSPORT_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Exits transport mode. Note that if the ground is not flat, exit transport mode will fail.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djilandinggear_retractlandinggear"><div class="api-col left">Retract/Deploy Landing Gear</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilandinggear_retractlandinggear_inline">retract</a></div></div><div class="inline-doc" id="djilandinggear_retractlandinggear_inline"

><div class="article"><h6 ><font color="#AAA">method </font>retract</h6></div>

~~~java
 void retract(@Nullable CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_retract_landing_gear_key">FlightControllerKey.RETRACT_LANDING_GEAR</a></td></tr></table></html>



##### Description:



<font color="#666">Retracts the landing gear. Should only be used when <code><a href="/Components/LandingGear/DJILandingGear.html#djilandinggear_mode">getMode</a></code>  is <code><a href="/Components/LandingGear/DJILandingGear.html#djilandinggear_djilandinggearmode_normal">MANUAL</a></code>. For Matrice 600 and Matrice 600 Pro, landing gear  cannot be controlled through the SDK, only automatically by the aircraft or manually by the remote controller.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djilandinggear_deploylandinggear"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djilandinggear_deploylandinggear_inline">deploy</a></div></div><div class="inline-doc" id="djilandinggear_deploylandinggear_inline"

><div class="article"><h6 ><font color="#AAA">method </font>deploy</h6></div>

~~~java
 void deploy(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_deploy_landing_gear_key">FlightControllerKey.DEPLOY_LANDING_GEAR</a></td></tr></table></html>



##### Description:



<font color="#666">Deploys landing gear. Should only be used when <code><a href="/Components/LandingGear/DJILandingGear.html#djilandinggear_mode">getMode</a></code>  is <code><a href="/Components/LandingGear/DJILandingGear.html#djilandinggear_djilandinggearmode_normal">MANUAL</a></code>. For Matrice 600 and Matrice 600 Pro, the landing gear cannot  be controlled through the SDK, only automatically by the aircraft or manually by the remote controller.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djilandinggear_djilandinggearstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djilandinggear_djilandinggearstatus_inline">LandingGearState</a></div></div><div class="inline-doc" id="djilandinggear_djilandinggearstatus_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>LandingGearState</h6></div>

~~~java
@EXClassNullAway
 enum LandingGearState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_landing_gear_status_key">FlightControllerKey.LANDING_GEAR_STATUS</a></td></tr></table></html>



##### Description:



<font color="#666">Current state of landing gear.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djilandinggear_djilandinggearstatus_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Landing gear is in unknown state. This will be returned if the aircraft can't get the landing gear status.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djilandinggear_djilandinggearstatus_deployed_inline"></a>DEPLOYED</td><td><font color="#666">Landing gear is fully deployed (ready for landing)</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djilandinggear_djilandinggearstatus_retracted_inline"></a>RETRACTED</td><td><font color="#666">Landing gear is fully retracted (ready for flying).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djilandinggear_djilandinggearstatus_deploying_inline"></a>DEPLOYING</td><td><font color="#666">Landing gear is deploying (getting ready for landing).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djilandinggear_djilandinggearstatus_retracting_inline"></a>RETRACTING</td><td><font color="#666">Landing gear is retracting (getting ready for flying).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djilandinggear_djilandinggearstatus_stopped_inline"></a>STOPPED</td><td><font color="#666">Landing gear is stopped.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djilandinggear_djilandinggearmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djilandinggear_djilandinggearmode_inline">LandingGearMode</a></div></div><div class="inline-doc" id="djilandinggear_djilandinggearmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>LandingGearMode</h6></div>

~~~java
@EXClassNullAway
 enum LandingGearMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_landing_gear_mode_key">FlightControllerKey.LANDING_GEAR_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Current Mode of the landing gear.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djilandinggear_djilandinggearmode_normal_inline"></a>MANUAL</td><td><font color="#666">Landing gear can be deployed and retracted through function calls.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djilandinggear_djilandinggearmode_transport_inline"></a>TRANSPORT</td><td><font color="#666">Landing gear is in transport mode (either it is moving into, moving out of, or stopped in transport position).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djilandinggear_djilandinggearmode_auto_inline"></a>AUTO</td><td><font color="#666">Landing gear automatically transitions between deployed and retracted depending on altitude. During take-off,  the transition point is 1.2m above ground. After take-off (during flight or when landing), the transition point  is 0.5m above ground.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djilandinggear_djilandinggearmode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Landing Gear is in an unknown mode.</td></tr></table></html>

##### Class Members:

</div>


