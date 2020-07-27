<div class="article"><h1 ><font color="#AAA">class </font>Callback</h1></div>

~~~java
 interface Callback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_area_temperature_aggregations_key">CameraKey.THERMAL_AREA_TEMPERATURE_AGGREGATIONS</a></td></tr></table></html>



##### Description:



<font color="#666">This interface provides information about the aggregate temperature of metering area.



##### Class Members:



#### Callback Method

<div class="api-row" id="djicamera_didupdateareatemperatureaggregations"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_didupdateareatemperatureaggregations_inline">onUpdate</a></div></div><div class="inline-doc" id="djicamera_didupdateareatemperatureaggregations_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
        void onUpdate(@NonNull ThermalAreaTemperatureAggregations aggregations)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_area_temperature_aggregations_key">CameraKey.THERMAL_AREA_TEMPERATURE_AGGREGATIONS</a></td></tr></table></html>



##### Description:



<font color="#666">Called when there are new min, max, and average temperature values available for the set spot metering area.  Supported by Zenmuse XT containing Advanced Radiometry capabilities. For Zenmuse H20 and Zenmuse H20T,  please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraThermalAreaTemperatureAggregations.html#djicamera_djicamerathermalareatemperatureaggregations">ThermalAreaTemperatureAggregations</a> <font color="#000">aggregations</td><td><font color="#666"><i>The ThermalAreaTemperatureAggregations.</i></td></tr></table></html></div>


