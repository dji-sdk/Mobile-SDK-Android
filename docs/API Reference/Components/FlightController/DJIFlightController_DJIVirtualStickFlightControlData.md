<div class="article"><h1 ><font color="#AAA">class </font>FlightControlData</h1></div>

~~~java
@EXClassNullAway
 class FlightControlData 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.virtualstick</td></tr></table></html>



##### Description:



<font color="#666">Contains all the virtual stick control data needed to move the aircraft in all directions.



##### Class Members:

<div class="api-row" id="djiflightcontroller_djivirtualstickflightcontroldata_pitch"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djivirtualstickflightcontroldata_pitch_inline">getPitch</a></div></div><div class="inline-doc" id="djiflightcontroller_djivirtualstickflightcontroldata_pitch_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPitch</h6></div>

~~~java
 float getPitch() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.virtualstick</td></tr></table></html>



##### Description:



<font color="#666">Gets aircraft's velocity (m/s) along the y-axis or angle value (in degrees) for pitch. Use <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djivirtualstickrollpitchcontrolmode">RollPitchControlMode</a></code> to set the velocity or angle mode. Note that the argument has different meanings in different coordinate systems. See the <i>Flight Controller User Guide</i> for more information.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>The Velocity (m/s) or Angle (degrees) value for pitch.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djivirtualstickflightcontroldata_setpitch"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djivirtualstickflightcontroldata_setpitch_inline">setPitch</a></div></div><div class="inline-doc" id="djiflightcontroller_djivirtualstickflightcontroldata_setpitch_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPitch</h6></div>

~~~java
 void setPitch(float pitch) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.virtualstick</td></tr></table></html>



##### Description:



<font color="#666">Sets the aircraft's velocity (m/s) along the y-axis or angle value (in degrees) for pitch. Use <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djivirtualstickrollpitchcontrolmode">RollPitchControlMode</a></code> to set the velocity or angle mode. Note that the argument has different meanings in different coordinate systems. See the <i>Flight Controller User Guide</i> for more information.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">pitch</td><td><font color="#666"><i>The velocity (m/s) or angle (degrees) value for pitch</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djivirtualstickflightcontroldata_roll"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djivirtualstickflightcontroldata_roll_inline">getRoll</a></div></div><div class="inline-doc" id="djiflightcontroller_djivirtualstickflightcontroldata_roll_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRoll</h6></div>

~~~java
 float getRoll() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.virtualstick</td></tr></table></html>



##### Description:



<font color="#666">Gets aircraft's velocity (m/s) along the x-axis or angle value (in degrees) for roll. Use <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djivirtualstickrollpitchcontrolmode">RollPitchControlMode</a></code> to set the velocity or angle mode. Note that the argument has different meanings in different coordinate systems. See the <i>Flight Controller User Guide</i> for more information.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>The velocity (m/s) or angle (degrees) value for roll.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djivirtualstickflightcontroldata_setroll"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djivirtualstickflightcontroldata_setroll_inline">setRoll</a></div></div><div class="inline-doc" id="djiflightcontroller_djivirtualstickflightcontroldata_setroll_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setRoll</h6></div>

~~~java
 void setRoll(float roll) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.virtualstick</td></tr></table></html>



##### Description:



<font color="#666">Sets the aircraft's velocity (m/s) along the x-axis or angle value (in degrees) for roll. Use <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djivirtualstickrollpitchcontrolmode">RollPitchControlMode</a></code> to set the velocity or angle mode. Note that the argument has different meanings in different coordinate systems. See the <i>Flight Controller User Guide</i> for more information.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">roll</td><td><font color="#666"><i>The velocity (m/s) or angle (degrees) value for roll.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djivirtualstickflightcontroldata_yaw"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djivirtualstickflightcontroldata_yaw_inline">getYaw</a></div></div><div class="inline-doc" id="djiflightcontroller_djivirtualstickflightcontroldata_yaw_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getYaw</h6></div>

~~~java
 float getYaw() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.virtualstick</td></tr></table></html>



##### Description:



<font color="#666">Angular velocity (degrees/s) or angle (degrees) value for yaw. Use <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djivirtualstickyawcontrolmode">YawControlMode</a></code> to set angular velocity or angle mode.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>The angular velocity (degrees/s) or angle (degrees) value for yaw.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djivirtualstickflightcontroldata_setyaw"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djivirtualstickflightcontroldata_setyaw_inline">setYaw</a></div></div><div class="inline-doc" id="djiflightcontroller_djivirtualstickflightcontroldata_setyaw_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setYaw</h6></div>

~~~java
 void setYaw(float yaw) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.virtualstick</td></tr></table></html>



##### Description:



<font color="#666">Sets the angular velocity (degrees/s) or angle (degrees) value for yaw. Use <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djivirtualstickyawcontrolmode">YawControlMode</a></code> to set angular velocity or angle mode.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">yaw</td><td><font color="#666"><i>The angular velocity (degrees/s) or angle (degrees) value for yaw.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djivirtualstickflightcontroldata_verticalthrottle"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djivirtualstickflightcontroldata_verticalthrottle_inline">getVerticalThrottle</a></div></div><div class="inline-doc" id="djiflightcontroller_djivirtualstickflightcontroldata_verticalthrottle_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVerticalThrottle</h6></div>

~~~java
 float getVerticalThrottle() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.virtualstick</td></tr></table></html>



##### Description:



<font color="#666">Gets aircraft's velocity (m/s) or altitude (m) value for verticalControl. Use <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djivirtualstickverticalcontrolmode">VerticalControlMode</a></code> to set velocity or altitude mode.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>The velocity (m/s) or altitude (m) value for verticalControl.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djivirtualstickflightcontroldata_setverticalthrottle"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djivirtualstickflightcontroldata_setverticalthrottle_inline">setVerticalThrottle</a></div></div><div class="inline-doc" id="djiflightcontroller_djivirtualstickflightcontroldata_setverticalthrottle_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setVerticalThrottle</h6></div>

~~~java
 void setVerticalThrottle(float verticalThrottle) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.virtualstick</td></tr></table></html>



##### Description:



<font color="#666">Sets the aircraft's velocity (m/s) or altitude (m) value for verticalControl. Use <code><a href="/Components/FlightController/DJIFlightController.html#djiflightcontroller_djivirtualstickverticalcontrolmode">VerticalControlMode</a></code> to set velocity or altitude mode.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">verticalThrottle</td><td><font color="#666"><i>The velocity (m/s) or altitude (m) value for verticalControl.</i></td></tr></table></html></div>

<div class="api-row" id="djiflightcontroller_djivirtualstickflightcontroldata_constructor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiflightcontroller_djivirtualstickflightcontroldata_constructor_inline">FlightControlData</a></div></div><div class="inline-doc" id="djiflightcontroller_djivirtualstickflightcontroldata_constructor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>FlightControlData</h6></div>

~~~java
 FlightControlData(float pitch, float roll, float yaw, float verticalThrottle)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.flightcontroller.virtualstick</td></tr></table></html>



##### Description:



<font color="#666">Constructor for the flight control data to send through virtual sticks.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">pitch</td><td><font color="#666"><i>The velocity (m/s) or angle (degrees) value for pitch</i></td></tr><tr valign="top"><td><font color="#70BF41">float <font color="#000">roll</td><td><font color="#666"><i>The velocity (m/s) or angle (degrees) value for roll.</i></td></tr><tr valign="top"><td><font color="#70BF41">float <font color="#000">yaw</td><td><font color="#666"><i>The angular velocity (degrees/s) or angle (degrees) value for yaw.</i></td></tr><tr valign="top"><td><font color="#70BF41">float <font color="#000">verticalThrottle</td><td><font color="#666"><i>The velocity (m/s) or altitude (m) value for verticalControl.</i></td></tr></table></html></div>


