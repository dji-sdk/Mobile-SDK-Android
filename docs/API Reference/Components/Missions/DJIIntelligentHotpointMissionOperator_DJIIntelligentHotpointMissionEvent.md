<div class="article"><h1 ><font color="#AAA">class </font>IntelligentHotpointMissionEvent</h1></div>

~~~java
@EXClassNullAway
 class IntelligentHotpointMissionEvent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">This class encapsulates all the state changes of the Intelligent Hotpoint mission operator.



##### Class Members:

<div class="api-row" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_previousstate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_previousstate_inline">getPreviousState</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_previousstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPreviousState</h6></div>

~~~java
@Nullable
 IntelligentHotpointMissionState getPreviousState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Get the previous state of the operator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate">IntelligentHotpointMissionState</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate">IntelligentHotpointMissionState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_currentstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_currentstate_inline">getCurrentState</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_currentstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCurrentState</h6></div>

~~~java
@NonNull
 IntelligentHotpointMissionState getCurrentState() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Get the current state of the operator.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate">IntelligentHotpointMissionState</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate">IntelligentHotpointMissionState</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_missionmode"><div class="api-col left">Mission Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_missionmode_inline">getMissionMode</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_missionmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMissionMode</h6></div>

~~~java
 IntelligentHotpointMissionMode getMissionMode() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Gets the current mission mode.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Missions/DJIIntelligentHotpointMission.html#djiintelligenthotpointmission_djiintelligenthotpointmissionmode">IntelligentHotpointMissionMode</a></td><td><font color="#666"><i>An enum value of <code><a href="/Components/Missions/DJIIntelligentHotpointMission.html#djiintelligenthotpointmission_djiintelligenthotpointmissionmode">IntelligentHotpointMissionMode</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_targetrect"><div class="api-col left">Target Rect</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_targetrect_inline">getTargetRectF</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_targetrect_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTargetRectF</h6></div>

~~~java
 RectF getTargetRectF() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Get a bounding box for the target. The rectangle is normalized to [0,1] where (0,0) is the top left of  the video preview and (1,1) is the bottom right. When send target rect to Vision system, it will  recognize the target and push modified target bounding box. Value is available if  the <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionEvent.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_currentstate">getCurrentState</a></code>  is <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_recognizingtarget">RECOGNIZING_TARGET</a></code>,  <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_waitingforconfirmation">WAITING_FOR_CONFIRMATION</a></code>,  <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionState.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionstate_measuringtarget">MEASURING_TARGET</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">RectF</td><td><font color="#666"><i>An object of "RectF"</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_currentradius"><div class="api-col left">Radius</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_currentradius_inline">getRadius</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_currentradius_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRadius</h6></div>

~~~java
 float getRadius() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Gets the intelligent hotpoint radius in meters of the mission. If there is no executing mission, it is 0.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of current radius.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_targetradius"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_targetradius_inline">getTargetRadius</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_targetradius_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTargetRadius</h6></div>

~~~java
 float getTargetRadius() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Gets the target intelligent hotpoint radius in meters of the mission. Set by user, and the <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionEvent.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_currentradius">getRadius</a></code>  will change to <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionEvent.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_targetradius">getTargetRadius</a></code>. If there is no executing mission, it is 0.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of target radius.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_currentaltitude"><div class="api-col left">Altitude</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_currentaltitude_inline">getAltitude</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_currentaltitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAltitude</h6></div>

~~~java
 float getAltitude() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Gets the current intelligent hotpoint altitude in meters of the mission.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of current altitude.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_targetaltitude"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_targetaltitude_inline">getTargetAltitude</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_targetaltitude_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTargetAltitude</h6></div>

~~~java
 float getTargetAltitude() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Gets the target intelligent hotpoint altitude in meters of the mission. Setted by user, and the <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionEvent.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_currentaltitude">getAltitude</a></code>  will change to <code><a href="/Components/Missions/DJIIntelligentHotpointMissionOperator_DJIIntelligentHotpointMissionEvent.html#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_targetaltitude">getTargetAltitude</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of target altitude.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_maxangularvelocity"><div class="api-col left">Angular Velocity</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_maxangularvelocity_inline">getMaxAngularVelocity</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_maxangularvelocity_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMaxAngularVelocity</h6></div>

~~~java
 float getMaxAngularVelocity() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Gets the intelligent hotpoint max angular velocity from current radius. This value depends on the current situation of the aircraft.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of max angularVelocity.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_angularvelocity"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_angularvelocity_inline">getAngularVelocity</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_angularvelocity_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAngularVelocity</h6></div>

~~~java
 float getAngularVelocity() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Gets the current intelligent hotpoint angular velocity from current radius.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of angularVelocity.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_hotpoint"><div class="api-col left">Hotpoint</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_hotpoint_inline">getHotpoint</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_hotpoint_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHotpoint</h6></div>

~~~java
 LocationCoordinate2D getHotpoint() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Gets the intelligent hotpoint's coordinate of the mission.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></td><td><font color="#666"><i>An object of <code><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate2D.html#djiflightcontroller_djilocationcoordinate2d">LocationCoordinate2D</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_error"><div class="api-col left">Error</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_error_inline">getError</a></div></div><div class="inline-doc" id="djiintelligenthotpointmissionoperator_djiintelligenthotpointmissionevent_error_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getError</h6></div>

~~~java
@Nullable
 DJIError getError() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.mission.intelligenthotpoint</td></tr></table></html>



##### Description:



<font color="#666">Gets the intelligent hotpoint's encountered error if there is any. Otherwise, it is <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></td><td><font color="#666"><i>An object of <code><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a></code>.</i></td></tr></table></html></div>


