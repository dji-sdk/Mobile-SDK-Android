<div class="article"><h1 ><font color="#AAA">class </font>Callback</h1></div>

~~~java
 interface Callback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flightassistant</td></tr></table></html>



##### Description:



<font color="#666">Callback to update the FaceAwareState.



##### Class Members:



#### Callback Method

<div class="api-row" id="djiintelligentflightassistant_updatevisionfaceawarestate"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_updatevisionfaceawarestate_inline">onUpdate</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_updatevisionfaceawarestate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
 void onUpdate(FaceAwareState state)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flightassistant</td></tr></table></html>



##### Description:



<font color="#666">Callback function that updates the FaceAware state. When starting a PalmLaunch, the aircraft will  start FaceAware. If FaceAware activates successfully, the motors will start spinning and the  aircraft will hover after releasing it.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/IntelligentFlightAssistant/DJIIntelligentFlightAssistant.html#djivisiondetectionstate_djivisionfaceawarestate">FaceAwareState</a> <font color="#000">state</td><td><font color="#666"><i>The face sware state.</i></td></tr></table></html></div>


