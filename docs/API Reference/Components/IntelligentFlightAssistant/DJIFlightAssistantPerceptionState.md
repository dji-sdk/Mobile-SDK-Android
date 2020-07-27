<div class="article"><h1 ><font color="#AAA">class </font>PerceptionInformation</h1></div>

~~~java
 class PerceptionInformation 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flightassistant</td></tr></table></html>



##### Description:



<font color="#666">This class contains the aircraft's perception information. It is supported only by Matrice 300 RTK.



##### Class Members:

<div class="api-row" id="djiflightassistantperceptionstate_packcount"><div class="api-col left">Pack Count</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightassistantperceptionstate_packcount_inline">getDataPackageIndex</a></div></div><div class="inline-doc" id="djiflightassistantperceptionstate_packcount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDataPackageIndex</h6></div>

~~~java
 int getDataPackageIndex() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flightassistant</td></tr></table></html>



##### Description:



<font color="#666">The perception package count.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the perception package index.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightassistantperceptionstate_horizontalobjectcount"><div class="api-col left">Horizontal Object Count</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightassistantperceptionstate_horizontalobjectcount_inline">getAngleInterval</a></div></div><div class="inline-doc" id="djiflightassistantperceptionstate_horizontalobjectcount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAngleInterval</h6></div>

~~~java
 float getAngleInterval() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flightassistant</td></tr></table></html>



##### Description:



<font color="#666">Distance value detected away from the obstacles are at an interval of angle around the aircraft in 360 degrees horizontally.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value of angle interval.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightassistantperceptionstate_distancearray"><div class="api-col left">Distance Array</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightassistantperceptionstate_distancearray_inline">getDistances</a></div></div><div class="inline-doc" id="djiflightassistantperceptionstate_distancearray_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDistances</h6></div>

~~~java
 int[] getDistances() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flightassistant</td></tr></table></html>



##### Description:



<font color="#666">Each value represents the distance in millimeters away from the obstacles detected around in 360 degrees horizontally at an interval  of angle. Please refer to <code><a href="/Components/IntelligentFlightAssistant/DJIFlightAssistantPerceptionState.html#djiflightassistantperceptionstate_packcount">getDataPackageIndex</a></code> to get the interval of angle. 0 degree points to the aircraft's  heading. 90 degrees point to the right of the aircraft. 180 degrees point to the aircraft's tail.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int[]</td><td><font color="#666"><i>An array of int values.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightassistantperceptionstate_upwardobstacledistance"><div class="api-col left">Upward Obstacle Distance</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightassistantperceptionstate_upwardobstacledistance_inline">getUpwardObstacleDistance</a></div></div><div class="inline-doc" id="djiflightassistantperceptionstate_upwardobstacledistance_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getUpwardObstacleDistance</h6></div>

~~~java
 int getUpwardObstacleDistance() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flightassistant</td></tr></table></html>



##### Description:



<font color="#666">The upward obstacle distance.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of the upward obstacle distance.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightassistantperceptionstate_downwardobstacledistance"><div class="api-col left">Downward Obstacle Distance</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightassistantperceptionstate_downwardobstacledistance_inline">getDownwardObstacleDistance</a></div></div><div class="inline-doc" id="djiflightassistantperceptionstate_downwardobstacledistance_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDownwardObstacleDistance</h6></div>

~~~java
 int getDownwardObstacleDistance() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.flightassistant</td></tr></table></html>



##### Description:



<font color="#666">The downward obstacle distance.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of downward obstacle distance.</i></td></tr></table></html></div>


