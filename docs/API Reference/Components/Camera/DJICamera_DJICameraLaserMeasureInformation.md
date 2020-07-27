<div class="article"><h1 ><font color="#AAA">class </font>LaserMeasureInformation</h1></div>

~~~java
 class LaserMeasureInformation 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The class is used to save laser sensor information which includes the laser sensor switch status, the target object  information and laser state. The laser sensor must be at least 3m from the target point. Only supported by Zenmuse H20  and Zenmuse H20T.



##### Class Members:

<div class="api-row" id="djicamera_djicameralasermeasureinformation_targetlocation"><div class="api-col left">Target Location</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameralasermeasureinformation_targetlocation_inline">getTargetLocation</a></div></div><div class="inline-doc" id="djicamera_djicameralasermeasureinformation_targetlocation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTargetLocation</h6></div>

~~~java
 LocationCoordinate3D getTargetLocation() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the target object's location measured by the laser sensor.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate3D.html#djiflightcontroller_djilocationcoordinate3d">LocationCoordinate3D</a></td><td><font color="#666"><i>An object of <code><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate3D.html#djiflightcontroller_djilocationcoordinate3d">LocationCoordinate3D</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameralasermeasureinformation_targetdistance"><div class="api-col left">Target Distance</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameralasermeasureinformation_targetdistance_inline">getTargetDistance</a></div></div><div class="inline-doc" id="djicamera_djicameralasermeasureinformation_targetdistance_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTargetDistance</h6></div>

~~~java
 float getTargetDistance() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the range to the target object.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float</td><td><font color="#666"><i>A float value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameralasermeasureinformation_targetpoint"><div class="api-col left">Target Point</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameralasermeasureinformation_targetpoint_inline">getTargetPoint</a></div></div><div class="inline-doc" id="djicamera_djicameralasermeasureinformation_targetpoint_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTargetPoint</h6></div>

~~~java
 PointF getTargetPoint() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the relative target point base the lens origin point which measures by the laser sensor.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">PointF</td><td><font color="#666"><i>An object of <code>PointF</code>.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_djicameralasermeasureinformation_error"><div class="api-col left">Error</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameralasermeasureinformation_error_inline">getLaserError</a></div></div><div class="inline-doc" id="djicamera_djicameralasermeasureinformation_error_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLaserError</h6></div>

~~~java
 LaserError getLaserError() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the laser error from the laser sensor.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraLaserMeasureInformation.html#djilasererror">LaserError</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Camera/DJICamera_DJICameraLaserMeasureInformation.html#djilasererror">LaserError</a></code>.</i></td></tr></table></html></div>



##### Related:

<div class="api-row" id="djicamera_djicameralasermeasureinformation_callbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraLaserMeasureInformation_CallbackInterface.html">Callback</a></div></div><div class="api-row" id="djilasererror"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djilasererror_inline">LaserError</a></div></div><div class="inline-doc" id="djilasererror_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>LaserError</h6></div>

~~~java
@EXClassNullAway
 enum LaserError 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The enum class represents laser sensor's measuring state.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djilasererror_normal_inline"></a>NORMAL</td><td><font color="#666">The laser sensor's measuring state is normal.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djilasererror_tooclose_inline"></a>TOO_CLOSE</td><td><font color="#666">The laser sensor is too close to the target object.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djilasererror_toofar_inline"></a>TOO_FAR</td><td><font color="#666">The laser sensor is too far away from the target object.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djilasererror_nosignal_inline"></a>NO_SIGNAL</td><td><font color="#666">The laser sensor has no data signal.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djilasererror_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown State.</td></tr></table></html>

##### Class Members:

</div>


