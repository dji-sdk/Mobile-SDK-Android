<div class="article"><h1 ><font color="#AAA">class </font>VisionDetectionState</h1></div>

~~~java
@EXClassNullAway
 final class VisionDetectionState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_vision_detection_state_key">FlightControllerKey.VISION_DETECTION_STATE</a></td></tr></table></html>



##### Description:



<font color="#666">This class gives state information about the product's vision sensors used for obstacle detection. The two types of sensors used are dual camera sensors operating in the visible spectrum (dual-camera sensor) and infrared time of flight (TOF) sensors. Note, Inspire 2's upwards-facing infrared TOF sensor is not returned in this state. It is accessed through <code><a href="/Components/IntelligentFlightAssistant/DJIVisionDetectionState_DJIVisionControlState.html#djivisiondetectionstate_djivisioncontrolstate">VisionControlState</a></code>.



##### Class Members:



##### Related:

<div class="api-row" id="djiintelligentflightassistant_visiondetectionstateupdatedcallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/VisionDetectionState/DJIIntelligentFlightAssistant_visionDetectionStateUpdatedCallbackInterface.html">Callback</a></div></div><div class="api-row" id="djivisiondetectionstate_djivisiondetectionsector"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/VisionDetectionState/DJIVisionDetectionState_DJIVisionDetectionSector.html">ObstacleDetectionSector</a></div></div><div class="api-row" id="djivisiondetectionstate_visionsensorposition"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djivisiondetectionstate_visionsensorposition_inline">VisionSensorPosition</a></div></div><div class="inline-doc" id="djivisiondetectionstate_visionsensorposition_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>VisionSensorPosition</h6></div>

~~~java
@EXClassNullAway
 enum VisionSensorPosition 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Position of the sensor on the aircraft.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_visionsensorposition_nose_inline"></a>NOSE</td><td><font color="#666">The sensor is on the front or nose of the aircraft.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_visionsensorposition_tail_inline"></a>TAIL</td><td><font color="#666">The sensor is on the back or tail of the aircraft.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_visionsensorposition_right_inline"></a>RIGHT</td><td><font color="#666">The sensor is on the right or starboard side of the aircraft.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_visionsensorposition_left_inline"></a>LEFT</td><td><font color="#666">The sensor is on the left or port side of the aircraft.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_visionsensorposition_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djivisiondetectionstate_visionsystemwarning"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djivisiondetectionstate_visionsystemwarning_inline">VisionSystemWarning</a></div></div><div class="inline-doc" id="djivisiondetectionstate_visionsystemwarning_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>VisionSystemWarning</h6></div>

~~~java
@EXClassNullAway
 enum VisionSystemWarning 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_vision_system_warning_key">FlightControllerKey.VISION_SYSTEM_WARNING</a></td></tr></table></html>



##### Description:



<font color="#666">Distance warning returned by the front vision system. Warning Level 4 is the most serious level.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_visionsystemwarning_invalid_inline"></a>INVALID</td><td><font color="#666">The warning is invalid. The front vision system cannot determine depth of the scene in front of it.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_visionsystemwarning_safe_inline"></a>SAFE</td><td><font color="#666">The distance between the obstacle detected by the vision system and the aircraft is safe (over 2 meters).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_visionsystemwarning_dangerous_inline"></a>DANGEROUS</td><td><font color="#666">The distance between the obstacle detected by the vision system and the aircraft is dangerous (less than 2 meters).</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_visionsystemwarning_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The distance warning is unknown. This warning is returned when an exception occurs.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djivisiondetectionstate_issensorworking"><div class="api-col left">Sensor</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivisiondetectionstate_issensorworking_inline">isSensorBeingUsed</a></div></div><div class="inline-doc" id="djivisiondetectionstate_issensorworking_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isSensorBeingUsed</h6></div>

~~~java
 boolean isSensorBeingUsed() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_is_vision_positioning_sensor_being_used_key">FlightControllerKey.IS_VISION_POSITIONING_SENSOR_BEING_USED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the vision sensor is working.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djivisiondetectionstate_systemwarning"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivisiondetectionstate_systemwarning_inline">getSystemWarning</a></div></div><div class="inline-doc" id="djivisiondetectionstate_systemwarning_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSystemWarning</h6></div>

~~~java
 VisionSystemWarning getSystemWarning() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_vision_system_warning_key">FlightControllerKey.VISION_SYSTEM_WARNING</a></td></tr></table></html>



##### Description:



<font color="#666">Distance warning level between the obstacle and the aircraft. This is a combination of warning levels from each sector.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/VisionDetectionState/DJIVisionDetectionState.html#djivisiondetectionstate_visionsystemwarning">VisionSystemWarning</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/VisionDetectionState/DJIVisionDetectionState.html#djivisiondetectionstate_visionsystemwarning">VisionSystemWarning</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djivisiondetectionstate_position"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivisiondetectionstate_position_inline">getPosition</a></div></div><div class="inline-doc" id="djivisiondetectionstate_position_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPosition</h6></div>

~~~java
 VisionSensorPosition getPosition() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">The vision sensor's position on the aircraft. For Phantom 4 Pro, there are 4 vision sensors on the aircraft.  The sensors on the nose and tail are dual-camera sensors. The sensors on the left and right are infrared  time-of-flight (TOF) sensors.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/VisionDetectionState/DJIVisionDetectionState.html#djivisiondetectionstate_visionsensorposition">VisionSensorPosition</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/VisionDetectionState/DJIVisionDetectionState.html#djivisiondetectionstate_visionsensorposition">VisionSensorPosition</a></code></i></td></tr></table></html></div>

<div class="api-row" id="djivisiondetectionstate_obstacledistanceinmeters"><div class="api-col left">Obstacle Detection</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivisiondetectionstate_obstacledistanceinmeters_inline">getObstacleDistanceInMeters</a></div></div><div class="inline-doc" id="djivisiondetectionstate_obstacledistanceinmeters_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getObstacleDistanceInMeters</h6></div>

~~~java
 double getObstacleDistanceInMeters() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">The distance to the closest detected obstacle, in meters. It is only used when the sensor is an infrared TOF  sensor. The valid range is [0.3, 5.0]. Phantom 4 Pro has two infrared sensors on its left and right. Both sensors have a 70-degree horizontal field of view (FOV) and 20-degree vertical FOV. The value  is always 0.0 if the sensor is a dual-camera sensor or the sensor is not working properly.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">double</td><td><font color="#666"><i>A double value.</i></td></tr></table></html></div>

<div class="api-row" id="djivisiondetectionstate_detectionsectors"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivisiondetectionstate_detectionsectors_inline">getDetectionSectors</a></div></div><div class="inline-doc" id="djivisiondetectionstate_detectionsectors_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDetectionSectors</h6></div>

~~~java
@Nullable
 ObstacleDetectionSector[] getDetectionSectors() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_detection_sectors_key">FlightControllerKey.DETECTION_SECTORS</a></td></tr></table></html>



##### Description:



<font color="#666">The vision system can see in front of the aircraft with a 70 degree horizontal field of view (FOV) and 55-degree  vertical FOV for the Phantom 4. The horizontal FOV is split into four equal sectors and this array contains the  distance and warning information for each sector. For Phantom 4, the horizontal FOV is separated into 4 sectors.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/VisionDetectionState/DJIVisionDetectionState_DJIVisionDetectionSector.html#djivisiondetectionstate_djivisiondetectionsector">ObstacleDetectionSector</a>[]</td><td><font color="#666"><i>An instance of List&lt;DJIVisionDetectionSector&gt;. </i></td></tr></table></html></div>

<div class="api-row" id="djivisiondetectionstate_detectionsectors_isdisabled"><div class="api-col left">Check Disable</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djivisiondetectionstate_detectionsectors_isdisabled_inline">isDisabled</a></div></div><div class="inline-doc" id="djivisiondetectionstate_detectionsectors_isdisabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isDisabled</h6></div>

~~~java
 boolean isDisabled() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the vision sensor is disabled.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>


