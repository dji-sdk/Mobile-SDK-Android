<div class="article"><h1 ><font color="#AAA">class </font>Callback</h1></div>

~~~java
 interface Callback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">This interface provides a delegate method to update the RTK state.



##### Class Members:

<div class="api-row" id="djirtk_updatertkstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtk_updatertkstate_inline">onUpdate</a></div></div><div class="inline-doc" id="djirtk_updatertkstate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
        void onUpdate(@NonNull RTKState state)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller</td></tr></table></html>



##### Description:



<font color="#666">Callback function that updates the RTK state data.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/RTK/DJIRTK_DJIRTKState.html#djirtk_djirtkstate">RTKState</a> <font color="#000">state</td><td><font color="#666"><i>Current state of the RTK.</i></td></tr></table></html></div>


