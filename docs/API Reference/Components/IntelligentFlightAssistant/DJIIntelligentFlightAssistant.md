<div class="article"><h1 ><font color="#AAA">class </font>FlightAssistant</h1></div>

~~~java
 class FlightAssistant 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">This class contains components of the Intelligent Flight Assistant and provides methods to change its settings.



##### Class Members:

<div class="api-row" id="djiintelligentflightassistant_setvisiondetectionstateupdatedcallback"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_setvisiondetectionstateupdatedcallback_inline">setVisionDetectionStateUpdatedCallback</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_setvisiondetectionstateupdatedcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setVisionDetectionStateUpdatedCallback</h6></div>

~~~java
 void setVisionDetectionStateUpdatedCallback(VisionDetectionState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Set intelligent flight assistant state update callback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/VisionDetectionState/DJIVisionDetectionState.html#djivisiondetectionstate">VisionDetectionState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_updatevisioncontrolstatecallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_updatevisioncontrolstatecallback_inline">setVisionControlStateUpdatedcallback</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_updatevisioncontrolstatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setVisionControlStateUpdatedcallback</h6></div>

~~~java
 void setVisionControlStateUpdatedcallback(VisionControlState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Callback function that updates aircraft state. Controlled by the intelligent flight assistant.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/IntelligentFlightAssistant/DJIVisionDetectionState_DJIVisionControlState.html#djivisiondetectionstate_djivisioncontrolstate">VisionControlState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result returned.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_setfaceawarestatecallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_setfaceawarestatecallback_inline">setFaceAwareStateCallback</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_setfaceawarestatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFaceAwareStateCallback</h6></div>

~~~java
 void setFaceAwareStateCallback(FaceAwareState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Starts to receive the update of FaceAwareState.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/IntelligentFlightAssistant/DJIIntelligentFlightAssistant.html#djivisiondetectionstate_djivisionfaceawarestate">FaceAwareState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>FaceAwareState update callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_setpalmcontrolstatecallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_setpalmcontrolstatecallback_inline">setPalmControlStateCallback</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_setpalmcontrolstatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPalmControlStateCallback</h6></div>

~~~java
 void setPalmControlStateCallback(PalmControlState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Starts to receive the update of PalmControlState.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/IntelligentFlightAssistant/DJIIntelligentFlightAssistant.html#djivisiondetectionstate_djivisionpalmcontrolstate">PalmControlState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>PalmControlState update callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_setsmartcapturestatecallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_setsmartcapturestatecallback_inline">setSmartCaptureStateCallback</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_setsmartcapturestatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSmartCaptureStateCallback</h6></div>

~~~java
 void setSmartCaptureStateCallback(@Nullable SmartCaptureState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Starts to receive the update of SmartCaptureState.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/IntelligentFlightAssistant/DJISmartCaptureState.html#djismartcapturestate">SmartCaptureState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>SmartCaptureState update callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_setperceptionstatelistener"><div class="api-col left">Set Perception State Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_setperceptionstatelistener_inline">setVisualPerceptionInformationCallback</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_setperceptionstatelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setVisualPerceptionInformationCallback</h6></div>

~~~java
 void setVisualPerceptionInformationCallback(@NonNull CompletionCallbackWith<PerceptionInformation> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Updates the visual perception information. It is supported only by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/IntelligentFlightAssistant/DJIFlightAssistantPerceptionState.html#djiflightassistantperceptionstate">PerceptionInformation</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion block that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_setobstacleavoidancesensorstatelistener"><div class="api-col left">Set Obstacle Avoidance Sensor State Listener</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_setobstacleavoidancesensorstatelistener_inline">setObstacleAvoidanceSensorStateListener</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_setobstacleavoidancesensorstatelistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setObstacleAvoidanceSensorStateListener</h6></div>

~~~java
 void setObstacleAvoidanceSensorStateListener(@NonNull CompletionCallbackWith<ObstacleAvoidanceSensorState> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Updates the obstacle avoidance sensor's state.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/IntelligentFlightAssistant/DJIFlightAssistant_ObstacleAvoidanceSensorState.html#djiflightassistant_obstacleavoidancesensorstate">ObstacleAvoidanceSensorState</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion block that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_setcollisionavoidanceenabled"><div class="api-col left">Collision Avoidance</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_setcollisionavoidanceenabled_inline">setCollisionAvoidanceEnabled</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_setcollisionavoidanceenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCollisionAvoidanceEnabled</h6></div>

~~~java
 void setCollisionAvoidanceEnabled(boolean enable, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_collision_avoidance_enabled_key">FlightControllerKey.COLLISION_AVOIDANCE_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Enable collision avoidance. When enabled, the aircraft will stop and try to go around detected obstacles.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enable</td><td><font color="#666"><i>A boolean value.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_getcollisionavoidanceenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_getcollisionavoidanceenabled_inline">getCollisionAvoidanceEnabled</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_getcollisionavoidanceenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCollisionAvoidanceEnabled</h6></div>

~~~java
 void getCollisionAvoidanceEnabled(@NonNull CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_collision_avoidance_enabled_key">FlightControllerKey.COLLISION_AVOIDANCE_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Gets collision avoidance status (enabled/disabled).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_setactiveobstacleavoidanceenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_setactiveobstacleavoidanceenabled_inline">setActiveObstacleAvoidanceEnabled</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_setactiveobstacleavoidanceenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setActiveObstacleAvoidanceEnabled</h6></div>

~~~java
 void setActiveObstacleAvoidanceEnabled(boolean enabled, @Nullable CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_active_obstacle_avoidance_enabled_key">FlightControllerKey.ACTIVE_OBSTACLE_AVOIDANCE_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Enables/disables active obstacle avoidance. When enabled, and an obstacle is moving toward the aircraft, the aircraft will actively fly away from it. If while actively avoiding a moving obstacle, the aircraft detects another obstacle in its avoidance path, it will stop. <code><a href="/Components/IntelligentFlightAssistant/DJIIntelligentFlightAssistant.html#djiintelligentflightassistant_setcollisionavoidanceenabled">setCollisionAvoidanceEnabled</a></code> must also be enabled.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable the active avoidance.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback that receives the setter result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_getactiveobstacleavoidanceenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_getactiveobstacleavoidanceenabled_inline">getActiveObstacleAvoidanceEnabled</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_getactiveobstacleavoidanceenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getActiveObstacleAvoidanceEnabled</h6></div>

~~~java
 void getActiveObstacleAvoidanceEnabled(@NonNull CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_active_obstacle_avoidance_enabled_key">FlightControllerKey.ACTIVE_OBSTACLE_AVOIDANCE_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Gets active obstacle avoidance status (enabled/disabled).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_setupwardavoidanceenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_setupwardavoidanceenabled_inline">setUpwardVisionObstacleAvoidanceEnabled</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_setupwardavoidanceenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setUpwardVisionObstacleAvoidanceEnabled</h6></div>

~~~java
 void setUpwardVisionObstacleAvoidanceEnabled(Boolean enabled, @Nullable CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_upwards_avoidance_enabled_key">FlightControllerKey.UPWARDS_AVOIDANCE_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Enables/disables upward avoidance. When the Inspire 2's upwards-facing infrared sensor detects an obstacle,  the aircraft will slow its ascent and maintain a minimum distance of 1 meter from the obstacle. The sensor has  a 10-degree horizontal field of view (FOV) and 10-degree vertical FOV. The maximum detection distance is 5m.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">Boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable the upwards avoidance.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback that receives the setter result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_getupwardavoidanceenabled"><div class="api-col left">Upward Avoidance Enable</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_getupwardavoidanceenabled_inline">getUpwardVisionObstacleAvoidanceEnabled</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_getupwardavoidanceenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getUpwardVisionObstacleAvoidanceEnabled</h6></div>

~~~java
 void getUpwardVisionObstacleAvoidanceEnabled(@NonNull CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets upward avoidance status (enabled/disabled). It is only supported by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_setadvancedgesturecontrolenabled"><div class="api-col left">Advanced Gesture Control</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_setadvancedgesturecontrolenabled_inline">setAdvancedGestureControlEnabled</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_setadvancedgesturecontrolenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAdvancedGestureControlEnabled</h6></div>

~~~java
 void setAdvancedGestureControlEnabled(boolean enabled, @Nullable CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Enables/disables advanced gesture control. When enabled, users can use PalmLaunch, PalmLand, PalmControl and Beckon. When enabled, the various modes can be initiated by the user. In summary: <br> - Aircraft starts idle on users hand <br> - User double clicks the power button and FaceAware becomes active <br> - Once a face is recogized, PalmLaunch will happen <br> - When flying, the user can control the aircraft position by moving their palm <br> - If the user waves one hand, the aircraft will fly up and backwards and start following the user. <br> - If the user waves both hands, the aircraft will execute Beckon and return to the user. <br> It is only supported by Spark.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable advanced gesture control.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The <code>completion callback</code> with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_getadvancedgesturecontrolenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_getadvancedgesturecontrolenabled_inline">getAdvancedGestureControlEnabled</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_getadvancedgesturecontrolenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAdvancedGestureControlEnabled</h6></div>

~~~java
 void getAdvancedGestureControlEnabled(@NonNull CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Determines whether advanced gesture control is enabled. When enabled, users can use PalmLaunch, PalmLand, PalmControl and Beckon. It is only supported by Spark.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The <code>completion callback</code> with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_issmartcapturesupported"><div class="api-col left">Smart Capture</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_issmartcapturesupported_inline">isSmartCaptureSupported</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_issmartcapturesupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isSmartCaptureSupported</h6></div>

~~~java
 boolean isSmartCaptureSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Determines if SmartCapture is supported. This feature is only supported by Mavic Air.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if Smart Capture is supported.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_setsmartcaptureenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_setsmartcaptureenabled_inline">setSmartCaptureEnabled</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_setsmartcaptureenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSmartCaptureEnabled</h6></div>

~~~java
 void setSmartCaptureEnabled(boolean enabled, @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Enables/disables SmartCapture. When enabled, deep learning gesture recognition allows the user to take selfies,  record videos, and control the aircraft (GestureLaunch, Follow and GestureLand) using simple hand gestures.  It is only supported when <code><a href="/Components/IntelligentFlightAssistant/DJIIntelligentFlightAssistant.html#djiintelligentflightassistant_issmartcapturesupported">isSmartCaptureSupported</a></code> returns <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable SmartCapture.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion block with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_getsmartcaptureenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_getsmartcaptureenabled_inline">getSmartCaptureEnabled</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_getsmartcaptureenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSmartCaptureEnabled</h6></div>

~~~java
 void getSmartCaptureEnabled(@NonNull CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Determines whether SmartCapture is enabled. When enabled, users can When enabled, deep learning gesture  recognition allows the user to take selfies, record videos, and control the aircraft (GestureLaunch,  Follow and GestureLand) using simple hand gestures. It is only supported  when <code><a href="/Components/IntelligentFlightAssistant/DJIIntelligentFlightAssistant.html#djiintelligentflightassistant_issmartcapturesupported">isSmartCaptureSupported</a></code> returns <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion block with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_setsmartcapturefollowingmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_setsmartcapturefollowingmode_inline">setSmartCaptureFollowingMode</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_setsmartcapturefollowingmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSmartCaptureFollowingMode</h6></div>

~~~java
 void setSmartCaptureFollowingMode(@NonNull SmartCaptureFollowingMode mode,
                                             @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets the following mode for SmartCapture. It is only valid when SmartCapture is enabled.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/IntelligentFlightAssistant/DJISmartCaptureState.html#djismartcapturestate_djismartcapturefollowingmode">SmartCaptureFollowingMode</a> <font color="#000">mode</td><td><font color="#666"><i>The following mode to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion block with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_getsmartcapturefollowingmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_getsmartcapturefollowingmode_inline">getSmartCaptureFollowingMode</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_getsmartcapturefollowingmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSmartCaptureFollowingMode</h6></div>

~~~java
 void getSmartCaptureFollowingMode(
        @NonNull CommonCallbacks.CompletionCallbackWith<SmartCaptureFollowingMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the following mode for SmartCapture. It is only valid when SmartCapture is enabled.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;<a href="/Components/IntelligentFlightAssistant/DJISmartCaptureState.html#djismartcapturestate_djismartcapturefollowingmode">SmartCaptureFollowingMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion block with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_setadvancedpilotassistancesystemenabled"><div class="api-col left">APAS</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_setadvancedpilotassistancesystemenabled_inline">setAdvancedPilotAssistanceSystemEnabled</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_setadvancedpilotassistancesystemenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAdvancedPilotAssistanceSystemEnabled</h6></div>

~~~java
 void setAdvancedPilotAssistanceSystemEnabled(boolean enabled, @Nullable CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Enables the Advanced Pilot Assistance System (APAS). When APAS is enabled, the aircraft  continues to respond to user commands and plans its path according to both control stick  inputs and the flight environment. APAS makes it easier to avoid obstacles and obtain  smoother footage, and gives a better fly experiences. It is only valid when the aircraft  is in P-mode. It is supported by Mavic Air and Mavic 2 Series.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable APAS.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The completion callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_getadvancedpilotassistancesystemenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_getadvancedpilotassistancesystemenabled_inline">getAdvancedPilotAssistanceSystemEnabled</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_getadvancedpilotassistancesystemenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAdvancedPilotAssistanceSystemEnabled</h6></div>

~~~java
 void getAdvancedPilotAssistanceSystemEnabled(@NonNull CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Determines whether the Advanced Pilot Assistance System (APAS) is enabled or not. When  APAS is enabled, the aircraft continues to respond to user commands and plans its path  according to both control stick inputs and the flight environment. APAS makes it easier  to avoid obstacles and obtain smoother footage, and gives a better fly experiences. It  is only supported by Mavic Air.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The completion callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_setrthobstacleavoidanceenabled"><div class="api-col left">RTH Obstacle Avoidance</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_setrthobstacleavoidanceenabled_inline">setRTHObstacleAvoidanceEnabled</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_setrthobstacleavoidanceenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setRTHObstacleAvoidanceEnabled</h6></div>

~~~java
 void setRTHObstacleAvoidanceEnabled(boolean enabled, @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Enables Obstacle Avoidance during RTH. This is only active when the environment is bright  enough. It is not active when the aircraft is landing. CAUTION: If RTH Obstacle Avoidance is disabled, aircraft will not check obstacles during RTH or ascend to avoid obstacles, which  may cause great risks.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable Obstacle Avoidance during RTH.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback that receives the setter result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_getrthobstacleavoidanceenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_getrthobstacleavoidanceenabled_inline">getRTHObstacleAvoidanceEnabled</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_getrthobstacleavoidanceenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRTHObstacleAvoidanceEnabled</h6></div>

~~~java
 void getRTHObstacleAvoidanceEnabled(@NonNull CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Determines if Obstacle Avoidance is enabled during RTH. This is only active when the environment is bright enough. It is not active when the aircraft is landing. CAUTION: If RTH Obstacle Avoidance is disabled, aircraft will not check obstacles during RTH or ascend to avoid obstacles,  which may cause great risks.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_setrthremoteobstacleavoidanceenabled"><div class="api-col left">RTH Remote Obstacle Avoidance</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_setrthremoteobstacleavoidanceenabled_inline">setRTHRemoteObstacleAvoidanceEnabled</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_setrthremoteobstacleavoidanceenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setRTHRemoteObstacleAvoidanceEnabled</h6></div>

~~~java
 void setRTHRemoteObstacleAvoidanceEnabled(boolean enabled,
                                                     @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Enables Remote Obstacle Avoidance during RTH. Enabling this, the aircraft will adjust its RTH route  automatically to avoid obstacles in far distance. The gimbal will not respond to any commands from  the application or the remote controller.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable Remote Obstacle Avoidance during RTH.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback that receives the setter result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_getrthremoteobstacleavoidanceenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_getrthremoteobstacleavoidanceenabled_inline">getRTHRemoteObstacleAvoidanceEnabled</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_getrthremoteobstacleavoidanceenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRTHRemoteObstacleAvoidanceEnabled</h6></div>

~~~java
 void getRTHRemoteObstacleAvoidanceEnabled(@NonNull CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Determines if RTH Remote Obstacle Avoidance is enabled or not. When it is enabled, the aircraft will  adjust its RTH route automatically to avoid obstacles in far distance. The gimbal will not respond to  any commands from the application or the remote controller.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_setdownwardfilllightmode"><div class="api-col left">Downward Fill Light Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_setdownwardfilllightmode_inline">setDownwardFillLightMode</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_setdownwardfilllightmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setDownwardFillLightMode</h6></div>

~~~java
 void setDownwardFillLightMode(@NonNull FillLightMode mode, @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets the downward fill light mode. It is supported by Mavic 2 series and Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/IntelligentFlightAssistant/DJIIntelligentFlightAssistant.html#djifilllightmode">FillLightMode</a> <font color="#000">mode</td><td><font color="#666"><i>See enum <code><a href="/Components/IntelligentFlightAssistant/DJIIntelligentFlightAssistant.html#djifilllightmode">FillLightMode</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion block to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_getdownwardfilllightmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_getdownwardfilllightmode_inline">getDownwardFillLightMode</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_getdownwardfilllightmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDownwardFillLightMode</h6></div>

~~~java
 void getDownwardFillLightMode(
        @NonNull CommonCallbacks.CompletionCallbackWith<FillLightMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the downward fill light mode. It is supported by Mavic 2 series and Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;<a href="/Components/IntelligentFlightAssistant/DJIIntelligentFlightAssistant.html#djifilllightmode">FillLightMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion block to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_setupwardfilllightmode"><div class="api-col left">Upward Fill Light Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_setupwardfilllightmode_inline">setUpwardFillLightMode</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_setupwardfilllightmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setUpwardFillLightMode</h6></div>

~~~java
 void setUpwardFillLightMode(@NonNull FillLightMode mode, @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets the upward fill light mode. It is only supported by Matrice 300 RTK. The distance range  for <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightassistantobstaclesensingdirection_horizontal">Horizontal</a></code> is 1m~5m. The distance range  for <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightassistantobstaclesensingdirection_upward">Upward</a></code> is 1m~10m. The distance range  for <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightassistantobstaclesensingdirection_downward">Downward</a></code> is 1dm~30dm.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/IntelligentFlightAssistant/DJIIntelligentFlightAssistant.html#djifilllightmode">FillLightMode</a> <font color="#000">mode</td><td><font color="#666"><i>See enum <code><a href="/Components/IntelligentFlightAssistant/DJIIntelligentFlightAssistant.html#djifilllightmode">FillLightMode</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion block to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_getupwardfilllightmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_getupwardfilllightmode_inline">getUpwardFillLightMode</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_getupwardfilllightmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getUpwardFillLightMode</h6></div>

~~~java
 void getUpwardFillLightMode(
            @NonNull CommonCallbacks.CompletionCallbackWith<FillLightMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets upward fill light mode. It is only supported by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;<a href="/Components/IntelligentFlightAssistant/DJIIntelligentFlightAssistant.html#djifilllightmode">FillLightMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion block to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_setmaxperceptiondistance"><div class="api-col left">Max Perception Distance</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_setmaxperceptiondistance_inline">setMaxPerceptionDistance</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_setmaxperceptiondistance_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMaxPerceptionDistance</h6></div>

~~~java
 void setMaxPerceptionDistance(@FloatRange(from = 5, to = 45) float distance, @NonNull PerceptionInformation.DJIFlightAssistantObstacleSensingDirection direction, @Nullable CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets the maximum perception distance that could be measured. It is supported  only by Matrice 300 RTK. The distance range is 5m~45m for all direction.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@FloatRange(from = 5, to = 45) float <font color="#000">distance</td><td><font color="#666"><i>The maximum perception distance that could be measured.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/IntelligentFlightAssistant/DJIFlightAssistantPerceptionState.html#djiflightassistantperceptionstate">PerceptionInformation</a>.<a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightassistantobstaclesensingdirection">DJIFlightAssistantObstacleSensingDirection</a> <font color="#000">direction</td><td><font color="#666"><i>The perception direction.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_getmaxperceptiondistanceondirection"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_getmaxperceptiondistanceondirection_inline">getMaxPerceptionDistance</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_getmaxperceptiondistanceondirection_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMaxPerceptionDistance</h6></div>

~~~java
 void getMaxPerceptionDistance(@NonNull PerceptionInformation.DJIFlightAssistantObstacleSensingDirection direction, @Nullable CompletionCallbackWith<Float> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets the maximum perception distance that could be measured. It is supported only by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/IntelligentFlightAssistant/DJIFlightAssistantPerceptionState.html#djiflightassistantperceptionstate">PerceptionInformation</a>.<a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightassistantobstaclesensingdirection">DJIFlightAssistantObstacleSensingDirection</a> <font color="#000">direction</td><td><font color="#666"><i>The maximum perception distance that could be measured.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallbackWith&lt;Float&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion block that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_sethorizontalvisionobstacleavoidanceenabled"><div class="api-col left">Horizontal Vision Obstacle Avoidance</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_sethorizontalvisionobstacleavoidanceenabled_inline">setHorizontalVisionObstacleAvoidanceEnabled</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_sethorizontalvisionobstacleavoidanceenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setHorizontalVisionObstacleAvoidanceEnabled</h6></div>

~~~java
 void setHorizontalVisionObstacleAvoidanceEnabled(boolean enabled, CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Set to enable or disable horizontal vision obstacle avoidance. It is supported only by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable horizontal vision obstacle avoidance.</i></td></tr><tr valign="top"><td><font color="#70BF41">CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion block that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_gethorizontalvisionobstacleavoidanceenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_gethorizontalvisionobstacleavoidanceenabled_inline">getHorizontalVisionObstacleAvoidanceEnabled</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_gethorizontalvisionobstacleavoidanceenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHorizontalVisionObstacleAvoidanceEnabled</h6></div>

~~~java
 void getHorizontalVisionObstacleAvoidanceEnabled(CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets horizontal vision obstacle avoidance (enabled/disabled). It is supported only by Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion block that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_setobstaclesavoidancedistance"><div class="api-col left">Obstacles Avoidance Distance</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_setobstaclesavoidancedistance_inline">setVisualObstaclesAvoidanceDistance</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_setobstaclesavoidancedistance_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setVisualObstaclesAvoidanceDistance</h6></div>

~~~java
 void setVisualObstaclesAvoidanceDistance(float distance, @NonNull PerceptionInformation.DJIFlightAssistantObstacleSensingDirection direction, @Nullable CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Sets the distance to engage Active Brake for obstacles avoidance.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">distance</td><td><font color="#666"><i>The distance to engage Active Brake.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/IntelligentFlightAssistant/DJIFlightAssistantPerceptionState.html#djiflightassistantperceptionstate">PerceptionInformation</a>.<a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightassistantobstaclesensingdirection">DJIFlightAssistantObstacleSensingDirection</a> <font color="#000">direction</td><td><font color="#666"><i>The perception direction. If is <code>DJIFlightController_DJIFlightAssistantObstacleSensingDirection_Downward</code>, the distance  range is [0.1, 3]. If is <code>DJIFlightController_DJIFlightAssistantObstacleSensingDirection_Upward</code>, the distance range is [1.0, 10].  If is <code>DJIFlightController_DJIFlightAssistantObstacleSensingDirection_Horizontal</code>, the distance range is [1.0, 5].</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion block to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_getobstaclesavoidancedistance"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_getobstaclesavoidancedistance_inline">getVisualObstaclesAvoidanceDistance</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_getobstaclesavoidancedistance_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVisualObstaclesAvoidanceDistance</h6></div>

~~~java
 void getVisualObstaclesAvoidanceDistance(@NonNull PerceptionInformation.DJIFlightAssistantObstacleSensingDirection direction, @Nullable CompletionCallbackWith<Float> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Gets current distance to engage Active Brake for obstacles avoidance.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/IntelligentFlightAssistant/DJIFlightAssistantPerceptionState.html#djiflightassistantperceptionstate">PerceptionInformation</a>.<a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djiflightassistantobstaclesensingdirection">DJIFlightAssistantObstacleSensingDirection</a> <font color="#000">direction</td><td><font color="#666"><i>The perception direction.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallbackWith&lt;Float&gt; <font color="#000">callback</td><td><font color="#666"><i>Completion block that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_setvisionpositioningenabled"><div class="api-col left">Vision Positioning</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_setvisionpositioningenabled_inline">setVisionAssistedPositioningEnabled</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_setvisionpositioningenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setVisionAssistedPositioningEnabled</h6></div>

~~~java
 void setVisionAssistedPositioningEnabled(boolean enabled, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_vision_assisted_positioning_enabled_key">FlightControllerKey.VISION_ASSISTED_POSITIONING_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Enable vision positioning. Vision positioning is used to augment GPS to improve location accuracy when hovering and improve velocity calculation when flying.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable vision assisted positioning.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_getvisionpositioningenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_getvisionpositioningenabled_inline">getVisionAssistedPositioningEnabled</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_getvisionpositioningenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVisionAssistedPositioningEnabled</h6></div>

~~~java
 void getVisionAssistedPositioningEnabled(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_vision_assisted_positioning_enabled_key">FlightControllerKey.VISION_ASSISTED_POSITIONING_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Gets vision positioning status (enabled/disabled).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_setprecisionlandingenabled"><div class="api-col left">Precision Landing</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_setprecisionlandingenabled_inline">setPrecisionLandingEnabled</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_setprecisionlandingenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPrecisionLandingEnabled</h6></div>

~~~java
 void setPrecisionLandingEnabled(boolean enabled, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_precision_landing_enabled_key">FlightControllerKey.PRECISION_LANDING_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Enables/disables precision landing. When enabled, the aircraft will record its take-off location visually (as well as with GPS). On a Return-To-Home action the aircraft will attempt to perform a precision landing using the additional visual information. This method only works on a Return-To-Home action when the home location is successfully recorded during take-off, and not changed during flight.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable the precise landing.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>callback block that receives the setter result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_getprecisionlandingenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_getprecisionlandingenabled_inline">getPrecisionLandingEnabled</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_getprecisionlandingenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPrecisionLandingEnabled</h6></div>

~~~java
 void getPrecisionLandingEnabled(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_precision_landing_enabled_key">FlightControllerKey.PRECISION_LANDING_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Gets precision landing status (enabled/disabled).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_setlandingprotectionenabled"><div class="api-col left">Landing Protection</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_setlandingprotectionenabled_inline">setLandingProtectionEnabled</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_setlandingprotectionenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setLandingProtectionEnabled</h6></div>

~~~java
 void setLandingProtectionEnabled(boolean enabled, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_landing_protection_enabled_key">FlightControllerKey.LANDING_PROTECTION_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Enables/disables landing protection. During auto-landing, the downwards facing vision sensor will check if the ground surface is flat enough for a safe landing. If it is not and landing protection is enabled, then landing will abort and need to be manually performed by the user.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable the landing protection.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>&lt;&lt;&gt;android:Callback&gt; that receives the setter result.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligentflightassistant_getlandingprotectionenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_getlandingprotectionenabled_inline">getLandingProtectionEnabled</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_getlandingprotectionenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLandingProtectionEnabled</h6></div>

~~~java
 void getLandingProtectionEnabled(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.flightcontroller</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIFlightControllerKey.html#flightcontrollerkey_landing_protection_enabled_key">FlightControllerKey.LANDING_PROTECTION_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Gets landing protection status (enabled/disabled).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djiintelligentflightassistant_updatevisionfaceawarestatecallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/IntelligentFlightAssistant/DJIIntelligentFlightAssistant_updateVisionFaceAwareStateCallbackInterface.html">Callback</a></div></div><div class="api-row" id="djiintelligentflightassistant_updatevisionpalmcontrolstatecallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/IntelligentFlightAssistant/DJIIntelligentFlightAssistant_updateVisionPalmControlStateCallbackInterface.html">Callback</a></div></div><div class="api-row" id="djiintelligentflightassistant_updatevisionsmartcapturestatecallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/IntelligentFlightAssistant/DJIIntelligentFlightAssistant_updateVisionSmartCaptureStateCallbackInterface.html">Callback</a></div></div><div class="api-row" id="djivisiondetectionstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/VisionDetectionState/DJIVisionDetectionState.html">VisionDetectionState</a></div></div><div class="api-row" id="djivisiondetectionstate_djivisioncontrolstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/IntelligentFlightAssistant/DJIVisionDetectionState_DJIVisionControlState.html">VisionControlState</a></div></div><div class="api-row" id="djismartcapturestate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/IntelligentFlightAssistant/DJISmartCaptureState.html">SmartCaptureState</a></div></div><div class="api-row" id="djiflightassistantperceptionstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/IntelligentFlightAssistant/DJIFlightAssistantPerceptionState.html">PerceptionInformation</a></div></div><div class="api-row" id="djiflightassistant_obstacleavoidancesensorstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/IntelligentFlightAssistant/DJIFlightAssistant_ObstacleAvoidanceSensorState.html">ObstacleAvoidanceSensorState</a></div></div><div class="api-row" id="djivisiondetectionstate_djivisionfaceawarestate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djivisiondetectionstate_djivisionfaceawarestate_inline">FaceAwareState</a></div></div><div class="inline-doc" id="djivisiondetectionstate_djivisionfaceawarestate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FaceAwareState</h6></div>

~~~java
@EXClassNullAway
 enum FaceAwareState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flightassistant</td></tr></table></html>



##### Description:



<font color="#666">FaceAware states. FaceAware is a step of PalmLaunch. Tapping the battery battery power  button twice, FaceAware will start to work automatically. If FaceAware is activated successfully,  the aircraft will takeoff from the palm.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_djivisionfaceawarestate_idle_inline"></a>IDLE</td><td><font color="#666">The aircraft is not executing FaceAware.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_djivisionfaceawarestate_activating_inline"></a>ACTIVATING</td><td><font color="#666">The aircraft is in the process of detecting a human face in front of the camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_djivisionfaceawarestate_activated_inline"></a>ACTIVATED</td><td><font color="#666">FaceAware has been activated. The aircraft will beep twice and the motors will  start spinning.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_djivisionfaceawarestate_failednofacedetected_inline"></a>FAILED_NO_FACE_DETECTED</td><td><font color="#666">FaceAware has failed to activate because no face was detected.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_djivisionfaceawarestate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djivisiondetectionstate_djivisionpalmcontrolstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djivisiondetectionstate_djivisionpalmcontrolstate_inline">PalmControlState</a></div></div><div class="inline-doc" id="djivisiondetectionstate_djivisionpalmcontrolstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>PalmControlState</h6></div>

~~~java
@EXClassNullAway
 enum PalmControlState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flightassistant</td></tr></table></html>



##### Description:



<font color="#666">States of PalmControl.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_djivisionpalmcontrolstate_initializing_inline"></a>INITIALIZING</td><td><font color="#666">The aircraft is initializing for PalmControl.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_djivisionpalmcontrolstate_recognizingpalm_inline"></a>RECOGNIZING_PALM</td><td><font color="#666">The aircraft is recognizing the palm.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_djivisionpalmcontrolstate_startingfollow_inline"></a>STARTING_FOLLOW</td><td><font color="#666">The aircraft is moving into position for the PalmControl Follow command. In this state, the  aircraft is ascending and flying backward to a position that is 3m horizontally away from  the user and 2.3m above the ground. Once it has reached this position, the state will move  to <code><a href="/Components/IntelligentFlightAssistant/DJIIntelligentFlightAssistant.html#djivisiondetectionstate_djivisionpalmcontrolstate_following">FOLLOWING</a></code> and the aircraft will then follow the user. The  Follow command can be initiated by raising one arm and quickly waving your hand at the camera.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_djivisionpalmcontrolstate_following_inline"></a>FOLLOWING</td><td><font color="#666">The aircraft is currently following the user. To reach this state, the user first raises  one arm and quickly waves their hand at the aircraft's camera. The aircraft will then move  into position (3m from the user and 2.3m above the ground), and reach this state.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_djivisionpalmcontrolstate_adjustingposition_inline"></a>ADJUSTING_POSITION</td><td><font color="#666">The aircraft's position is being adjusted by the moving palm.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_djivisionpalmcontrolstate_palmcontrolstopped_inline"></a>PALM_CONTROL_STOPPED</td><td><font color="#666">PalmControl is stopped. PalmControl can be stopped by moving the sticks on the physical remote  controller or sending commands through <code><a href="/Components/MobileRemoteController/DJIMobileRemoteController.html#djimobileremotecontroller">MobileRemoteController</a></code> when the physical remote  controller is absent.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djivisiondetectionstate_djivisionpalmcontrolstate_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djifilllightmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djifilllightmode_inline">FillLightMode</a></div></div><div class="inline-doc" id="djifilllightmode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FillLightMode</h6></div>

~~~java
 enum FillLightMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flightassistant</td></tr></table></html>



##### Description:



<font color="#666">Modes for the fill light at the bottom or top of the aircraft.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djifilllightmode_auto_inline"></a>AUTO</td><td><font color="#666">The auto mode. In this mode, the auxiliary light will be turned on automatically  when the downward or top vision system is active but the environment is too dark.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djifilllightmode_on_inline"></a>ON</td><td><font color="#666">The auxiliary light is on.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djifilllightmode_off_inline"></a>OFF</td><td><font color="#666">The auxiliary light is off.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djifilllightmode_beacon_inline"></a>BEACON</td><td><font color="#666">Beacon mode. In this mode, the auxiliary light will have different behaviors in different conditions: <br>- When the aircraft just takes off, the auxiliary  light will have the same behavior  as ''DJIFillLightMode_Auto''. <br>- When the aircraft ascends above 5.5 meters, the auxiliary light starts to blink in  1Hz. <br>- When the aircraft descends below 4.5 meters, the auxiliary light will have the same behavior as ''DJIFillLightMode_Auto''. This mode is only  supported by Mavic 2 Enterprise.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djifilllightmode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>


