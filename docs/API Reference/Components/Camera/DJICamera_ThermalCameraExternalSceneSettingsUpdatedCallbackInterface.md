<div class="article"><h1 ><font color="#AAA">class </font>Callback</h1></div>

~~~java
 interface Callback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">This interface provides information about the external scene settings.



##### Class Members:



#### Callback Method

<div class="api-row" id="djicamera_didupdateexternalscenesettings"><div class="api-col left">State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_didupdateexternalscenesettings_inline">onUpdate</a></div></div><div class="inline-doc" id="djicamera_didupdateexternalscenesettings_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onUpdate</h6></div>

~~~java
        void onUpdate(@NonNull ThermalExternalSceneSettings settings)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Called when updated external scene settings are available. Supported only by Zenmuse XT containing Advanced Radiometry capabilities. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraThermalExternalSceneSettings.html#djicamera_djicamerathermalexternalscenesettings">ThermalExternalSceneSettings</a> <font color="#000">settings</td><td><font color="#666"><i>The ThermalExternalSceneSettings.</i></td></tr></table></html></div>


