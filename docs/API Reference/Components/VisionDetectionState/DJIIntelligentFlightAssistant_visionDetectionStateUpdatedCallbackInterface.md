<div class="article"><h1 ><font color="#AAA">class </font>Callback</h1></div>

~~~java
  interface Callback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">This protocol provides an interface to update the Intelligent Flight Assistant current state.



##### Class Members:

<div class="api-row" id="djiintelligentflightassistant_updatevisiondetectionstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiintelligentflightassistant_updatevisiondetectionstate_inline">onUpdate</a></div></div><div class="inline-doc" id="djiintelligentflightassistant_updatevisiondetectionstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
        void onUpdate(@NonNull VisionDetectionState state)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Callback function that updates the vision detection state. The frequency of this method is 10Hz.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/VisionDetectionState/DJIVisionDetectionState.html#djivisiondetectionstate">VisionDetectionState</a> <font color="#000">state</td><td><font color="#666"><i>The state of vision sensor.</i></td></tr></table></html></div>


