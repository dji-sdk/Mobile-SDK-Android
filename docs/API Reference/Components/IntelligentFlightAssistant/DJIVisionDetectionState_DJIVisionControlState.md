<div class="article"><h1 ><font color="#AAA">class </font>VisionControlState</h1></div>

~~~java
@EXClassNullAway
 class VisionControlState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">This class gives the aircraft's state, which is controlled by the intelligent flight assistant.



##### Class Members:



#### State Updates

<div class="api-row" id="djiintelligentflightassistant_updatevisioncontrolstatecallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/IntelligentFlightAssistant/DJIIntelligentFlightAssistant_UpdateVisionControlStateCallbackInterface.html">Callback</a></div></div><div class="api-row" id="djivisiondetectionstate_djivisioncontrolstate_isbraking"><div class="api-col left">Collision Avoidance</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivisiondetectionstate_djivisioncontrolstate_isbraking_inline">isBraking</a></div></div><div class="inline-doc" id="djivisiondetectionstate_djivisioncontrolstate_isbraking_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isBraking</h6></div>

~~~java
 boolean isBraking() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_is_braking_key">FlightControllerKey.IS_BRAKING</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the aircraft is braking automatically to avoid collision.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djivisiondetectionstate_djivisioncontrolstate_isavoidingactiveobstaclecollision"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivisiondetectionstate_djivisioncontrolstate_isavoidingactiveobstaclecollision_inline">isAvoidingActiveObstacleCollision</a></div></div><div class="inline-doc" id="djivisiondetectionstate_djivisioncontrolstate_isavoidingactiveobstaclecollision_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isAvoidingActiveObstacleCollision</h6></div>

~~~java
 boolean isAvoidingActiveObstacleCollision() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_is_avoiding_active_obstacle_collision_key">FlightControllerKey.IS_AVOIDING_ACTIVE_OBSTACLE_COLLISION</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the aircraft is avoiding collision from an obstacle moving towards the aircraft.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djivisiondetectionstate_djivisioncontrolstate_isascentlimitedbyobstacle"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivisiondetectionstate_djivisioncontrolstate_isascentlimitedbyobstacle_inline">isAscentLimitedByObstacle</a></div></div><div class="inline-doc" id="djivisiondetectionstate_djivisioncontrolstate_isascentlimitedbyobstacle_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isAscentLimitedByObstacle</h6></div>

~~~java
 boolean isAscentLimitedByObstacle() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_is_ascent_limited_by_obstacle_key">FlightControllerKey.IS_ASCENT_LIMITED_BY_OBSTACLE</a></td></tr></table></html>



##### Description:



<font color="#666">YES if the aircraft will not ascend further because of an obstacle detected within 1m above it.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djivisiondetectionstate_djivisioncontrolstate_isperformingprecisionlanding"><div class="api-col left">Precision Landing</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivisiondetectionstate_djivisioncontrolstate_isperformingprecisionlanding_inline">isPerformingPrecisionLanding</a></div></div><div class="inline-doc" id="djivisiondetectionstate_djivisioncontrolstate_isperformingprecisionlanding_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isPerformingPrecisionLanding</h6></div>

~~~java
 boolean isPerformingPrecisionLanding() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_is_performing_precision_landing_key">FlightControllerKey.IS_PERFORMING_PRECISION_LANDING</a></td></tr></table></html>



##### Description:



<font color="#666">YES if the aircraft is landing precisely.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djivisiondetectionstate_djivisioncontrolstate_landingprotectionstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivisiondetectionstate_djivisioncontrolstate_landingprotectionstatus_inline">landingProtectionState</a></div></div><div class="inline-doc" id="djivisiondetectionstate_djivisioncontrolstate_landingprotectionstatus_inline"

><div class="article"><h6 ><font color="#AAA">method </font>landingProtectionState</h6></div>

~~~java
 VisionLandingProtectionState landingProtectionState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_landing_protection_state_key">FlightControllerKey.LANDING_PROTECTION_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the aircraft's landing protection state. This status is valid when landing protection is enabled.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/IntelligentFlightAssistant/DJIVisionDetectionState_DJIVisionControlState.html#djivisiondetectionstate_djivisioncontrolstate_djivisionlandingprotectionstatus">VisionLandingProtectionState</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/IntelligentFlightAssistant/DJIVisionDetectionState_DJIVisionControlState.html#djivisiondetectionstate_djivisioncontrolstate_djivisionlandingprotectionstatus">VisionLandingProtectionState</a></code>,  which will show the state of landing protection.</i></td></tr></table></html></div>

<div class="api-row" id="djivisiondetectionstate_djivisioncontrolstate_isadvancedpilotassistancesystemactive"><div class="api-col left">APAS</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivisiondetectionstate_djivisioncontrolstate_isadvancedpilotassistancesystemactive_inline">isAdvancedPilotAssistanceSystemActive</a></div></div><div class="inline-doc" id="djivisiondetectionstate_djivisioncontrolstate_isadvancedpilotassistancesystemactive_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isAdvancedPilotAssistanceSystemActive</h6></div>

~~~java
 boolean isAdvancedPilotAssistanceSystemActive() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if Advanced Pilot Assistance System (APAS) is active. When it is active, the aircraft will change  flight path automatically to avoid obstacles.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<html><p><br></p></html>

##### Related:

<div class="api-row" id="djivisiondetectionstate_djivisioncontrolstate_djivisionlandingprotectionstatus"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djivisiondetectionstate_djivisioncontrolstate_djivisionlandingprotectionstatus_inline">VisionLandingProtectionState</a></div></div><div class="inline-doc" id="djivisiondetectionstate_djivisioncontrolstate_djivisionlandingprotectionstatus_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>VisionLandingProtectionState</h6></div>

~~~java
@EXClassNullAway
 enum VisionLandingProtectionState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_landing_protection_state_key">FlightControllerKey.LANDING_PROTECTION_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">Landing protection status returned by the downward vision sensor.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_djivisioncontrolstate_djivisionlandingprotectionstatus_none_inline"></a>NONE</td><td><font color="#666">The aircraft is not executing auto-landing or the downward vision sensor has not started to analyze the ground yet.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_djivisioncontrolstate_djivisionlandingprotectionstatus_analyzing_inline"></a>ANALYZING</td><td><font color="#666">The downward vision sensor is analyzing the ground at the landing zone.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_djivisioncontrolstate_djivisionlandingprotectionstatus_analysisfailed_inline"></a>ANALYSIS_FAILED</td><td><font color="#666">The downward vision sensor's analysis failed. Either the auto-landing can be attempted again, or the user needs  to land the aircraft manually.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_djivisioncontrolstate_djivisionlandingprotectionstatus_safetoland_inline"></a>SAFE_TO_LAND</td><td><font color="#666">The ground is flat and the aircraft is safe to land automatically.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_djivisioncontrolstate_djivisionlandingprotectionstatus_notsafetoland_inline"></a>NOT_SAFE_TO_LAND</td><td><font color="#666">Landing area is not flat enough to be considered safe for landing. The aircraft should be moved to an area that  is more flat and an auto-land should be attempted again or the user should land the aircraft manually.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_djivisioncontrolstate_djivisionlandingprotectionstatus_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>


