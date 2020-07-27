<div class="article"><h1 ><font color="#AAA">class </font>Camera</h1></div>

~~~java
 class Camera extends BaseComponent 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/BaseComponent/DJIBaseComponent.html#djibasecomponent">BaseComponent</a></code></td></tr></table></html>



##### Description:



<font color="#666">This class contains the media manager and playback manager, which manage the camera's media content. It provides methods to change camera settings and perform camera actions. This object is available from the <code><a href="/Products/Aircraft/DJIAircraft.html#djiaircraft">Aircraft</a></code> or <code><a href="/Products/Handheld/DJIHandheld.html#djihandheld">HandHeld</a></code> object, which is a subclass of <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct">BaseProduct</a></code>.



##### Class Members:



#### State Updates

<div class="api-row" id="djicamera_setdjicameraupdatedsystemstatecallback"><div class="api-col left">General</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_setdjicameraupdatedsystemstatecallback_inline">setSystemStateCallback</a></div></div><div class="inline-doc" id="djicamera_setdjicameraupdatedsystemstatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSystemStateCallback</h6></div>

~~~java
 void setSystemStateCallback(@Nullable SystemState.Callback updatedSystemStateCallBack) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the camera's system state callback. The onUpdate function has a CameraSystemState object as its parameter. <br><br> Precondition: <br><br> A Callback object must be implemented and passed in as a parameter. <br><br> Postcondition: <br><br> The Callback object that was passed in as a parameter will call its onUpdate function at regular intervals.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Camera/DJICamera_DJICameraSystemState.html#djicamera_djicamerasystemstate">SystemState</a>.Callback <font color="#000">updatedSystemStateCallBack</td><td><font color="#666"><i>The Callback object to set as the callback. &lt;br&gt; Callback implements an <code><a href="/Components/Camera/DJICamera_CameraUpdatedSystemStateCallbackInterface.html#djicamera_didupdatesystemstate">onUpdate</a></code> method.&lt;/br&gt; The CameraSDCardState object contains information about the SD card inserted into the aircraft's camera.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_setcameraupdatedcurrentexposurevaluescallback"><div class="api-col left">Exposure</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_setcameraupdatedcurrentexposurevaluescallback_inline">setExposureSettingsCallback</a></div></div><div class="inline-doc" id="djicamera_setcameraupdatedcurrentexposurevaluescallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setExposureSettingsCallback</h6></div>

~~~java
 void setExposureSettingsCallback(@Nullable ExposureSettings.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the callback for updated exposure parameters. The callback's <code><a href="/Components/Camera/DJICamera_CameraUpdatedCurrentExposureValuesCallbackInterface.html#djicamera_didupdatecurrentexposureparameters">onUpdate</a></code> method will be called each time the exposure parameters (ISO, Exposure Compensation, Shutter Speed and Aperture) are updated.  For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Camera/DJICamera_DJICameraExposureParameters.html#djicamera_djicameraexposureparameters">ExposureSettings</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>The execution callback.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_setdjicamerageneratednewmediafilecallback"><div class="api-col left">Media</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_setdjicamerageneratednewmediafilecallback_inline">setMediaFileCallback</a></div></div><div class="inline-doc" id="djicamera_setdjicamerageneratednewmediafilecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMediaFileCallback</h6></div>

~~~java
 void setMediaFileCallback(@Nullable MediaFile.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the camera's new generated media file callback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia">MediaFile</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>The Callback object to set as the callback. The callback's method <code><a href="/Components/Camera/DJICamera_CameraGeneratedNewMediaFileCallbackInterface.html#djicamera_didgeneratenewmediafile">onNewFile</a></code> &lt;br&gt;has a <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia">MediaFile</a></code> object as it's parameter from which information about &lt;br&gt;the media type, index, file size and the created time can be obtained.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_setdjicamerageneratedtimelapsepreviewcallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_setdjicamerageneratedtimelapsepreviewcallback_inline">setTimeLapsePreviewCallback</a></div></div><div class="inline-doc" id="djicamera_setdjicamerageneratedtimelapsepreviewcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setTimeLapsePreviewCallback</h6></div>

~~~java
 void setTimeLapsePreviewCallback(@Nullable TimeLapsePreviewCallback generatedTimeLapseCallBack) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the generated preview image callback. The callback's <code><a href="/Components/Camera/DJICamera_CameraGeneratedTimeLapsePreviewCallbackInterface.html#djicamera_didgeneratetimelapsepreview">onGenerate</a></code> method will be called each time a photo has been taken.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Camera/DJICamera_CameraGeneratedTimeLapsePreviewCallbackInterface.html#djicamera_camerageneratedtimelapsepreviewcallbackinterface">TimeLapsePreviewCallback</a> <font color="#000">generatedTimeLapseCallBack</td><td><font color="#666"><i>The execution callback.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_setthermaltemperaturecallback"><div class="api-col left">Thermal Temperature</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_setthermaltemperaturecallback_inline">setThermalTemperatureCallback</a></div></div><div class="inline-doc" id="djicamera_setthermaltemperaturecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalTemperatureCallback</h6></div>

~~~java
 void setThermalTemperatureCallback(@Nullable TemperatureDataCallback updateCenterTemperatureCallback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the thermal camera's temperature update callback. Callback is used when there is a new temperature value available for the set spot metering  target point. Supported only by thermal imaging cameras with installed firmware version of 1.20.0.00 or higher. For Zenmuse H20 and Zenmuse H20T,  please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable TemperatureDataCallback <font color="#000">updateCenterTemperatureCallback</td><td><font color="#666"><i>The Callback object to set as the callback. &lt;br&gt; Callback implements an <code><a href="/Components/Camera/DJICamera_TemperatureDataCallbackInterface.html#djicamera_temperaturedatacallbackinterface_onupdate">onUpdate</a></code>  method.&lt;/br&gt; The Float object contains information about the updated temperature value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_setdjiupdatecameralensstatecallback"><div class="api-col left">Lens</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_setdjiupdatecameralensstatecallback_inline">setFocusStateCallback</a></div></div><div class="inline-doc" id="djicamera_setdjiupdatecameralensstatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFocusStateCallback</h6></div>

~~~java
 void setFocusStateCallback(@Nullable FocusState.Callback updatedLensStateCallback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Callback for updating the lens state. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Camera/DJICamera_DJICameraLensState.html#djicamera_djicameralensstate">FocusState</a>.Callback <font color="#000">updatedLensStateCallback</td><td><font color="#666"><i>The callback.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_setthermalareatemperatureaggregationscallback"><div class="api-col left">Thermal Area Temperature Aggregations</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_setthermalareatemperatureaggregationscallback_inline">setThermalAreaTemperatureAggregationsCallback</a></div></div><div class="inline-doc" id="djicamera_setthermalareatemperatureaggregationscallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalAreaTemperatureAggregationsCallback</h6></div>

~~~java
 void setThermalAreaTemperatureAggregationsCallback(
        @Nullable ThermalAreaTemperatureAggregations.Callback areaTemperatureAggregationsUpdatedCallback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the thermal camera's temperature aggregation update callback. Callback will be called when there are new min, max, and average values available for the set spot metering area.  Supported only by thermal imaging cameras with installed firmware version of 1.20.0.00 or higher. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Camera/DJICamera_DJICameraThermalAreaTemperatureAggregations.html#djicamera_djicamerathermalareatemperatureaggregations">ThermalAreaTemperatureAggregations</a>.Callback <font color="#000">areaTemperatureAggregationsUpdatedCallback</td><td><font color="#666"><i>The Callback object to set as the callback.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_setthermalexternalscenesettingscallback"><div class="api-col left">Thermal External Scene Settings</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_setthermalexternalscenesettingscallback_inline">setThermalExternalSceneSettingsCallback</a></div></div><div class="inline-doc" id="djicamera_setthermalexternalscenesettingscallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalExternalSceneSettingsCallback</h6></div>

~~~java
 void setThermalExternalSceneSettingsCallback(
        @Nullable ThermalExternalSceneSettings.Callback thermalExternalSceneSettingsUpdatedCallback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the thermal camera's external scene settings update callback. Callback will get called when updated external scene settings are available. Supported only by thermal imaging  cameras with installed firmware version of 1.20.0.00 or higher. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Camera/DJICamera_DJICameraThermalExternalSceneSettings.html#djicamera_djicamerathermalexternalscenesettings">ThermalExternalSceneSettings</a>.Callback <font color="#000">thermalExternalSceneSettingsUpdatedCallback</td><td><font color="#666"><i>The Callback object to set as the callback.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_setdjiupdatecamerasdcardstatecallback"><div class="api-col left">Storage</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_setdjiupdatecamerasdcardstatecallback_inline">setSDCardStateCallBack</a></div></div><div class="inline-doc" id="djicamera_setdjiupdatecamerasdcardstatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSDCardStateCallBack</h6></div>

~~~java
@Deprecated
 void setSDCardStateCallBack(@Nullable StorageState.Callback updatedSDCardStateCallback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the camera's SD card information callback. Deprecated, please use <code><a href="/Components/Camera/DJICamera_CameraUpdatedStorageStateCallbackInterface.html#djicamera_didupdatestoragestate">onUpdate</a></code> instead.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Camera/DJICamera_DJICameraSDCardState.html#djicamera_djicamerasdcardstate">StorageState</a>.Callback <font color="#000">updatedSDCardStateCallback</td><td><font color="#666"><i>The Callback object to set as the callback.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_setdjiupdatecamerastoragestatecallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_setdjiupdatecamerastoragestatecallback_inline">setStorageStateCallBack</a></div></div><div class="inline-doc" id="djicamera_setdjiupdatecamerastoragestatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setStorageStateCallBack</h6></div>

~~~java
 void setStorageStateCallBack(@Nullable StorageState.Callback storageStateCallBack) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Called when the camera's storage state has been updated. Use <code><a href="/Components/Camera/DJICamera_DJICameraSDCardState.html#djicamera_djicamerasdcardstate">StorageState</a></code>'s <code><a href="/Components/Camera/DJICamera_DJICameraSDCardState.html#djicamera_djicamerasdcardstate_location">getStorageLocation</a></code> to determine if the updated state is for SD card or the internal storage.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Camera/DJICamera_DJICameraSDCardState.html#djicamera_djicamerasdcardstate">StorageState</a>.Callback <font color="#000">storageStateCallBack</td><td><font color="#666"><i>The Callback object to set as the callback.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_setdjiupdatecamerassdstatecallback"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_setdjiupdatecamerassdstatecallback_inline">setSSDStateCallback</a></div></div><div class="inline-doc" id="djicamera_setdjiupdatecamerassdstatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSSDStateCallback</h6></div>

~~~java
 void setSSDStateCallback(@Nullable SSDState.Callback updatedSSDStateCallback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Callback for updating the SSD state.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Camera/DJICamera_DJICameraSSDState.html#djicamera_djicamerassdstate">SSDState</a>.Callback <font color="#000">updatedSSDStateCallback</td><td><font color="#666"><i>The Callback.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_sethistogramcallback"><div class="api-col left">Histogram</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_sethistogramcallback_inline">setHistogramCallback</a></div></div><div class="inline-doc" id="djicamera_sethistogramcallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setHistogramCallback</h6></div>

~~~java
 void setHistogramCallback(@Nullable HistogramCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the histogram callback.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Camera/DJICamera_histogramUpdateCallbackInterface.html#djicamera_histogramupdatecallbackinterface">HistogramCallback</a> <font color="#000">callback</td><td><font color="#666"><i>The execution callback.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_multilenses_setcameravideostreamsourcecallback"><div class="api-col left">Camera Video Stream Source</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_multilenses_setcameravideostreamsourcecallback_inline">setCameraVideoStreamSourceCallback</a></div></div><div class="inline-doc" id="djicamera_multilenses_setcameravideostreamsourcecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCameraVideoStreamSourceCallback</h6></div>

~~~java
 void setCameraVideoStreamSourceCallback(CameraVideoStreamSource.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the camera video stream source callback. When the camera video stream source been changed, the interface  of <code><a href="/Components/Camera/DJICamera_CameraVideoStreamSource_CallbackInterface.html#djicamera_cameravideostreamsource_callbackinterface">Callback</a></code> would be triggered. It is only supported by Zenmuse H20 series.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera.html#djicamera_djicameravideostreamsource">CameraVideoStreamSource</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_setmultispectralexposurestatecallback"><div class="api-col left">Multispectral Exposure State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_setmultispectralexposurestatecallback_inline">setMultispectralExposureStateCallback</a></div></div><div class="inline-doc" id="djicamera_setmultispectralexposurestatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMultispectralExposureStateCallback</h6></div>

~~~java
 void setMultispectralExposureStateCallback(@Nullable MultispectralExposureState.Callback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Called when the Multispectral camera's exposure status changes. Only supported by multispectral camera of P4 Multispectral.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Components/Camera/DJICamera_DJICameraMultispectralExposureState.html#djicamera_djicameramultispectralexposurestate">MultispectralExposureState</a>.Callback <font color="#000">callback</td><td><font color="#666"><i>Callback to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_iscaptureinvideosupported"><div class="api-col left">Check Capture In Video Supported</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_iscaptureinvideosupported_inline">isCaptureInVideoSupported</a></div></div><div class="inline-doc" id="djicamera_iscaptureinvideosupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isCaptureInVideoSupported</h6></div>

~~~java
 boolean isCaptureInVideoSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">This method is used to determine whether the video recording supports photographing.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Information

<div class="api-row" id="djicamera_displayname"><div class="api-col left">Display Name</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_displayname_inline">getDisplayName</a></div></div><div class="inline-doc" id="djicamera_displayname_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDisplayName</h6></div>

~~~java
 String getDisplayName() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_display_name_key">CameraKey.DISPLAY_NAME</a></td></tr></table></html>



##### Description:



<font color="#666">Return string that represents name of the camera.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">String</td><td><font color="#666"><i>An instance of display name String.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_capabilities"><div class="api-col left">Camera Capabilities</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_capabilities_inline">getCapabilities</a></div></div><div class="inline-doc" id="djicamera_capabilities_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCapabilities</h6></div>

~~~java
 Capabilities getCapabilities() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Camera capabilities. Return <code>nil</code> when the camera is multiple lenses camera.  Instead, user can access lens' capabilities through its lens object.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraParameters.html#djicamera_djicameraparameters">Capabilities</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Camera/DJICamera_DJICameraParameters.html#djicamera_djicameraparameters">Capabilities</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_getlens"><div class="api-col left">Get Camera Lens</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_getlens_inline">getLens</a></div></div><div class="inline-doc" id="djicamera_getlens_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLens</h6></div>

~~~java
 Lens getLens(int lensIndex) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets camera lens by lensIndex.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">lensIndex</td><td><font color="#666"><i>Lens index.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></td><td><font color="#666"><i>An object of <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_lens"><div class="api-col left">Camera Lens</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_lens_inline">getLenses</a></div></div><div class="inline-doc" id="djicamera_lens_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLenses</h6></div>

~~~java
@Nullable
 List<Lens> getLenses() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Camera's own lenses.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">List&lt;<a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a>&gt;</td><td><font color="#666"><i>A list of <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Flat Camera Mode

<div class="api-row" id="djicamera_isflatcameramodesupported"><div class="api-col left">Check Flat Camera Mode Supported</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_isflatcameramodesupported_inline">isFlatCameraModeSupported</a></div></div><div class="inline-doc" id="djicamera_isflatcameramodesupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isFlatCameraModeSupported</h6></div>

~~~java
 boolean isFlatCameraModeSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Determines if current camera supports Flat Camera Mode. Returns <code>true</code> if  the <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode">CameraMode</a></code> and <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashootphotomode">ShootPhotoMode</a></code> flatten  into <code><a href="/Components/Camera/DJICamera.html#djicamera_djiflatcameramode">FlatCameraMode</a></code>. The <code><a href="/Components/Camera/DJICamera.html#djicamera_djiflatcameramode">FlatCameraMode</a></code>  and <code><a href="/Components/Camera/DJICamera.html#djicamera_setflatmode">setFlatMode</a></code> can be used to set the camera mode directly. The user  does not need to use <code><a href="/Components/Camera/DJICamera.html#djicamera_setcameramode">setMode</a></code> and <code><a href="/Components/Camera/DJICamera.html#djicamera_setshootphotomode">setShootPhotoMode</a></code>  to set the camera mode by two steps. Besides, the <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode_djicameramodemediadownload">MEDIA_DOWNLOAD</a></code>  is decoupled from the <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode">CameraMode</a></code>. Determine what the last camera mode was by checking <code><a href="/Components/Camera/DJICamera_DJICameraSystemState.html#djicamera_djicamerasystemstate_mode">getMode</a></code>  before entering the playback.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_setflatmode"><div class="api-col left">Set Flat Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_setflatmode_inline">setFlatMode</a></div></div><div class="inline-doc" id="djicamera_setflatmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFlatMode</h6></div>

~~~java
 void setFlatMode(@NonNull FlatCameraMode mode, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the camera's flat mode to take photo, record video, or enter intelligent camera modes. Please note that you cannot change the mode when a  certain task is executing. This is available only when <code><a href="/Components/Camera/DJICamera.html#djicamera_isflatcameramodesupported">isFlatCameraModeSupported</a></code> returns <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera.html#djicamera_djiflatcameramode">FlatCameraMode</a> <font color="#000">mode</td><td><font color="#666"><i>Camera flat mode. See <code><a href="/Components/Camera/DJICamera.html#djicamera_djiflatcameramode">FlatCameraMode</a></code> to find details.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_getflatmode"><div class="api-col left">Get Flat Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_getflatmode_inline">getFlatMode</a></div></div><div class="inline-doc" id="djicamera_getflatmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFlatMode</h6></div>

~~~java
 void getFlatMode(@NonNull final CompletionCallbackWith<FlatCameraMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the camera's current flat mode. This is available only when <code><a href="/Components/Camera/DJICamera.html#djicamera_isflatcameramodesupported">isFlatCameraModeSupported</a></code> returns <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera.html#djicamera_djiflatcameramode">FlatCameraMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_enterplayback"><div class="api-col left">Enter Playback Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_enterplayback_inline">enterPlayback</a></div></div><div class="inline-doc" id="djicamera_enterplayback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>enterPlayback</h6></div>

~~~java
 void enterPlayback(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Enter playback mode, in which users can preview photos or videos, begin the video playback, and download media to the mobile device.  This is available only when <code><a href="/Components/Camera/DJICamera.html#djicamera_isflatcameramodesupported">isFlatCameraModeSupported</a></code> returns <code>true</code>. Please note that only after exiting playback mode, last flat camera mode will be recovered.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with result of the action.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_exitplayback"><div class="api-col left">Exit Playback Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_exitplayback_inline">exitPlayback</a></div></div><div class="inline-doc" id="djicamera_exitplayback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>exitPlayback</h6></div>

~~~java
 void exitPlayback(@NonNull final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Exit play back mode. This is available only when <code><a href="/Components/Camera/DJICamera.html#djicamera_isflatcameramodesupported">isFlatCameraModeSupported</a></code> returns <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with result of the action.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Shoot Photo/Video

<div class="api-row" id="djicamera_setcameramode"><div class="api-col left">Camera Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_setcameramode_inline">setMode</a></div></div><div class="inline-doc" id="djicamera_setcameramode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMode</h6></div>

~~~java
 void setMode(@NonNull CameraMode mode, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_mode_key">CameraKey.MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the camera's work mode to taking pictures, video, playback or download. Please note that you cannot change the mode when a certain task is executing, such as taking photo(s), recording video, or downloading and saving files. Also supported by thermal imaging camera.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode">CameraMode</a> <font color="#000">mode</td><td><font color="#666"><i>Camera work mode. See enum named CameraMode in SettingsDefinitions to find details on camera work modes.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_getcameramode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_getcameramode_inline">getMode</a></div></div><div class="inline-doc" id="djicamera_getcameramode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMode</h6></div>

~~~java
 void getMode(@NonNull final CompletionCallbackWith<CameraMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_mode_key">CameraKey.MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the camera's current work mode. Also supported by thermal imaging camera.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode">CameraMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_startrecordvideo"><div class="api-col left">Record Video</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_startrecordvideo_inline">startRecordVideo</a></div></div><div class="inline-doc" id="djicamera_startrecordvideo_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startRecordVideo</h6></div>

~~~java
 void startRecordVideo(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_start_record_video_key">CameraKey.START_RECORD_VIDEO</a></td></tr></table></html>



##### Description:



<font color="#666">Starts recording video. <br><br> Precondition:<br> Camera must be in <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode_djicameramoderecordvideo">RECORD_VIDEO</a></code> mode. <br>For thermal imaging camera, user can take Single photo when recording video.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_stoprecordvideo"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_stoprecordvideo_inline">stopRecordVideo</a></div></div><div class="inline-doc" id="djicamera_stoprecordvideo_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopRecordVideo</h6></div>

~~~java
 void stopRecordVideo(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_stop_record_video_key">CameraKey.STOP_RECORD_VIDEO</a></td></tr></table></html>



##### Description:



<font color="#666">Stops recording video. <br> <br> Precondition:<br> The camera is recording currently. <br>



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_startshootphoto"><div class="api-col left">Shoot Photo</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_startshootphoto_inline">startShootPhoto</a></div></div><div class="inline-doc" id="djicamera_startshootphoto_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startShootPhoto</h6></div>

~~~java
 void startShootPhoto(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_start_shoot_photo_key">CameraKey.START_SHOOT_PHOTO</a></td></tr></table></html>



##### Description:



<font color="#666">Camera starts to take photo with one of the camera capture modes (shoot photo modes).Also, <br><br> Precondition:<br> 1. Camera must be in ShootPhoto mode. Check the enum named CameraShootPhotoMode in DJICameraSettingsDef to find all possible camera capture modes. For thermal imaging camera, Single photo can be taken while recording video.<br>2. The SD card state should be checked before this method is used to ensure sufficient space exists. <br><br> Post condition:<br> If the capture mode is either Burst or Interval, calling stopShootPhoto will be required for the camera to stop taking photos.<br>



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_stopshootphoto"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_stopshootphoto_inline">stopShootPhoto</a></div></div><div class="inline-doc" id="djicamera_stopshootphoto_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopShootPhoto</h6></div>

~~~java
 void stopShootPhoto(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_stop_shoot_photo_key">CameraKey.STOP_SHOOT_PHOTO</a></td></tr></table></html>



##### Description:



<font color="#666">Camera stops taking photos. <br> <br> Precondition:<br> 1. <code><a href="/Components/Camera/DJICamera.html#djicamera_startshootphoto">startShootPhoto</a></code> has been invoked and the shoot mode is either Interval or Time-lapse. <br> 2. If the capture mode is set to Single, the camera will automatically stop taking the photo once the individual photo is taken. <br>



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_setshootphotomode"><div class="api-col left">Shoot Photo Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_setshootphotomode_inline">setShootPhotoMode</a></div></div><div class="inline-doc" id="djicamera_setshootphotomode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setShootPhotoMode</h6></div>

~~~java
 void setShootPhotoMode(@NonNull ShootPhotoMode mode, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_shoot_photo_mode_key">CameraKey.SHOOT_PHOTO_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the photo shooting mode for the camera.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashootphotomode">ShootPhotoMode</a> <font color="#000">mode</td><td><font color="#666"><i><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashootphotomode">ShootPhotoMode</a></code> enum value.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Asynchronous execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_getshootphotomode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_getshootphotomode_inline">getShootPhotoMode</a></div></div><div class="inline-doc" id="djicamera_getshootphotomode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getShootPhotoMode</h6></div>

~~~java
 void getShootPhotoMode(@NonNull final CompletionCallbackWith<ShootPhotoMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_shoot_photo_mode_key">CameraKey.SHOOT_PHOTO_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Returns the current photo shooting mode of the camera.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashootphotomode">ShootPhotoMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Asynchronous execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_istimelapsesupported"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_istimelapsesupported_inline">isTimeLapseSupported</a></div></div><div class="inline-doc" id="djicamera_istimelapsesupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isTimeLapseSupported</h6></div>

~~~java
 boolean isTimeLapseSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_is_time_lapse_supported_key">CameraKey.IS_TIME_LAPSE_SUPPORTED</a></td></tr></table></html>



##### Description:



<font color="#666">Check if the current device supports time-lapse shoot mode. Supported only on the Osmo camera.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if timelapse is supported.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Playback and Download

<div class="api-row" id="djicamera_media_ismediadownloadmodesupported"><div class="api-col left">Media</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_media_ismediadownloadmodesupported_inline">isMediaDownloadModeSupported</a></div></div><div class="inline-doc" id="djicamera_media_ismediadownloadmodesupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isMediaDownloadModeSupported</h6></div>

~~~java
 boolean isMediaDownloadModeSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_is_media_download_mode_supported_key">CameraKey.IS_MEDIA_DOWNLOAD_MODE_SUPPORTED</a></td></tr></table></html>



##### Description:



<font color="#666">Check if the current device supports Media Download Mode.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the current device supports Media Download Mode, <code>false</code> otherwise.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_mediamanager"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_mediamanager_inline">getMediaManager</a></div></div><div class="inline-doc" id="djicamera_mediamanager_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMediaManager</h6></div>

~~~java
@Nullable
 MediaManager getMediaManager() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Media Manager is used for interaction when camera is in <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode_djicameramodemediadownload">MEDIA_DOWNLOAD</a></code>. The user can only access the manager when <code><a href="/Components/Camera/DJICamera.html#djicamera_media_ismediadownloadmodesupported">isMediaDownloadModeSupported</a></code> returns <code>true</code>. @return The <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager">MediaManager</a></code> object if the aircraft supports media list feature. Otherwise, returns <code>null</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIMediaManager.html#djimediamanager">MediaManager</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/Camera/DJIMediaManager.html#djimediamanager">MediaManager</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_media_isplaybacksupported"><div class="api-col left">Playback</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_media_isplaybacksupported_inline">isPlaybackSupported</a></div></div><div class="inline-doc" id="djicamera_media_isplaybacksupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isPlaybackSupported</h6></div>

~~~java
 boolean isPlaybackSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_is_playback_supported_key">CameraKey.IS_PLAYBACK_SUPPORTED</a></td></tr></table></html>



##### Description:



<font color="#666">Check if the current device supports Playback Mode.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_playbackmanager"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_playbackmanager_inline">getPlaybackManager</a></div></div><div class="inline-doc" id="djicamera_playbackmanager_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPlaybackManager</h6></div>

~~~java
@Nullable
 PlaybackManager getPlaybackManager() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the playback manager object. Playback Manager is used for interaction when camera is in <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode_djicameramodeplayback">PLAYBACK</a></code>. User can only access to the manager when <code><a href="/Components/Camera/DJICamera.html#djicamera_media_isplaybacksupported">isPlaybackSupported</a></code> returns <code>true</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJIPlaybackManager.html#djiplaybackmanager">PlaybackManager</a></td><td><font color="#666"><i>An instance of <code><a href="/Components/Camera/DJIPlaybackManager.html#djiplaybackmanager">PlaybackManager</a></code>.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Exposure & White Balance

<div class="api-row" id="djicamera_camerasettings_setexposuremode"><div class="api-col left">Exposure Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setexposuremode_inline">setExposureMode</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setexposuremode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setExposureMode</h6></div>

~~~java
 void setExposureMode(@NonNull ExposureMode mode, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_exposure_mode_key">CameraKey.EXPOSURE_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the camera's exposure mode. Check <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode">ExposureMode</a></code> to view all possible camera exposure modes. Please note that in different exposure mode, it will have different values for the same setting. For Mavic 2 Enterprise Dual, the exposure mode is always <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode_program">PROGRAM</a></code>. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode">ExposureMode</a> <font color="#000">mode</td><td><font color="#666"><i>Camera exposure mode to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getexposuremode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getexposuremode_inline">getExposureMode</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getexposuremode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getExposureMode</h6></div>

~~~java
 void getExposureMode(@NonNull final CompletionCallbackWith<ExposureMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_exposure_mode_key">CameraKey.EXPOSURE_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the camera's exposure mode. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode">ExposureMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setiso"><div class="api-col left">ISO</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setiso_inline">setISO</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setiso_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setISO</h6></div>

~~~java
 void setISO(@NonNull ISO iso, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_iso_key">CameraKey.ISO</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the camera's ISO value. See <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraiso">ISO</a></code> to view all possible ISO settings for the camera. For the X5, X5R, Phantom 4 Pro camera, X4S and X5S, the ISO value can be set for all modes. For the other cameras, the ISO value can only be set when the camera exposure mode is in Manual mode. See the <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setexposuremode">setExposureMode</a></code> method for how to set exposure mode. For Mavic 2 Enterprise Dual, the ISO value is always <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraiso_auto">AUTO</a></code>. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull ISO <font color="#000">iso</td><td><font color="#666"><i>The ISO value to set the camera to use. Please check the enum CameraISOe in DJICameraSettingsDef to find all possible ISO values that the camera can be set to.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getiso"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getiso_inline">getISO</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getiso_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getISO</h6></div>

~~~java
 void getISO(@NonNull final CompletionCallbackWith<ISO> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_iso_key">CameraKey.ISO</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the camera's ISO value. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;ISO&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setshutterspeed"><div class="api-col left">Shutter Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setshutterspeed_inline">setShutterSpeed</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setshutterspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setShutterSpeed</h6></div>

~~~java
 void setShutterSpeed(@NonNull ShutterSpeed shutterSpeed, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_shutter_speed_key">CameraKey.SHUTTER_SPEED</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the camera shutter speed. To see all available <code>shutterSpeed</code> value settings, see <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashutterspeed">ShutterSpeed</a></code>. The shutter speed should not be set slower than the video frame rate when the camera's mode is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode_djicameramoderecordvideo">RECORD_VIDEO</a></code>. For example, if the video frame rate is 30fps, the <code>shutterSpeed</code> must be <= 1/30. Precondition: The shutter speed can be set only when the camera exposure mode is Shutter mode or Manual mode. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashutterspeed">ShutterSpeed</a> <font color="#000">shutterSpeed</td><td><font color="#666"><i>The ISO value to set the camera to use. Please check the enum CameraISOe in DJICameraSettingsDef to find all possible ISO values that the camera can be set to.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getshutterspeed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getshutterspeed_inline">getShutterSpeed</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getshutterspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getShutterSpeed</h6></div>

~~~java
 void getShutterSpeed(@NonNull final CompletionCallbackWith<ShutterSpeed> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_shutter_speed_key">CameraKey.SHUTTER_SPEED</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the camera's shutter speed. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashutterspeed">ShutterSpeed</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_isadjustableaperturesupported"><div class="api-col left">Aperture</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_isadjustableaperturesupported_inline">isAdjustableApertureSupported</a></div></div><div class="inline-doc" id="djicamera_camerasettings_isadjustableaperturesupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isAdjustableApertureSupported</h6></div>

~~~java
 boolean isAdjustableApertureSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_is_adjustable_aperture_supported_key">CameraKey.IS_ADJUSTABLE_APERTURE_SUPPORTED</a></td></tr></table></html>



##### Description:



<font color="#666">Gets whether the camera supports an adjustable aperture. Currently adjustable aperture is supported only by the X5, X5R, X4S, X5S cameras and Mavic 2 Pro. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setaperture"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setaperture_inline">setAperture</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setaperture_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAperture</h6></div>

~~~java
 void setAperture(@NonNull Aperture aperture, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_aperture_key">CameraKey.APERTURE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the aperture value. This feature is available only when <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_isadjustableaperturesupported">isAdjustableApertureSupported</a></code> returns <code>true</code>. <br> Precondition: <br> The exposure mode <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode">ExposureMode</a></code> must be in <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode_manual">MANUAL</a></code> or <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode_aperture">APERTURE_PRIORITY</a></code>. </br> Supported only by the X5, X5R, X4S, X5S camera and Mavic 2 Pro. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraaperture">Aperture</a> <font color="#000">aperture</td><td><font color="#666"><i>The aperture to set. Check enum CameraLensFocusMode in DJICameraSettingsDef.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getaperture"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getaperture_inline">getAperture</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getaperture_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAperture</h6></div>

~~~java
 void getAperture(@NonNull final CompletionCallbackWith<Aperture> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_aperture_key">CameraKey.APERTURE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the lens aperture. This feature is available only when <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_isadjustableaperturesupported">isAdjustableApertureSupported</a></code> returns <code>true</code>. For Zenmuse H20 and Zenmuse H20T,  please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraaperture">Aperture</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setmeteringmode"><div class="api-col left">Exposure Metering</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setmeteringmode_inline">setMeteringMode</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setmeteringmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMeteringMode</h6></div>

~~~java
 void setMeteringMode(@NonNull MeteringMode mode, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_metering_mode_key">CameraKey.METERING_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the camera's exposure metering. See <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerameteringmode">MeteringMode</a></code> to view all possible exposure metering settings for the camera. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerameteringmode">MeteringMode</a> <font color="#000">mode</td><td><font color="#666"><i>Exposure metering to be set. Check the enum <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerameteringmode">MeteringMode</a></code> to find all possible exposure metering the camera can be set to.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the execution result</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getmeteringmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getmeteringmode_inline">getMeteringMode</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getmeteringmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMeteringMode</h6></div>

~~~java
 void getMeteringMode(@NonNull final CompletionCallbackWith<MeteringMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_metering_mode_key">CameraKey.METERING_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the camera's exposure metering. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerameteringmode">MeteringMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setspotmeteringareaindex"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setspotmeteringareaindex_inline">setSpotMeteringTarget</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setspotmeteringareaindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSpotMeteringTarget</h6></div>

~~~java
 void setSpotMeteringTarget(@NonNull Point spotIndex, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_spot_metering_target_key">CameraKey.SPOT_METERING_TARGET</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the spot metering area index. The camera image is divided into 96 spots defined by 12 columns and 8 rows. The row index range is [0,7], where the values increase top to bottom across the image. The column index range is [0, 11], where the values increase left to right. In order to make the method work, The camera exposure mode should be <code>Program</code>, <code>Shutter</code> or <code>Aperture</code>, the exposure metering mode must be <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerameteringmode_spot">SPOT</a></code>, and <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setaelock">setAELock</a></code> must be <code>false</code>. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull Point <font color="#000">spotIndex</td><td><font color="#666"><i>Spot metering point coordinate (x, y).  x is column index to be set. The value should falls in [0, 11], where the values increase left to right. y is row index to be set. The value should falls in [0, 7], where the values increase top to bottom across the image.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getspotmeteringareaindex"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getspotmeteringareaindex_inline">getSpotMeteringTarget</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getspotmeteringareaindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSpotMeteringTarget</h6></div>

~~~java
 void getSpotMeteringTarget(@NonNull final CompletionCallbackWith<Point> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_spot_metering_target_key">CameraKey.SPOT_METERING_TARGET</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the spot metering area row index and column index. In order to make the method work, The camera exposure mode should be <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode_program">PROGRAM</a></code>, <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode_shutter">SHUTTER_PRIORITY</a></code> or <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode_aperture">APERTURE_PRIORITY</a></code>, the exposure metering mode must be <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerameteringmode_spot">SPOT</a></code>, and <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getaelock">getAELock</a></code> must be <code>false</code>. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Point&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setexposurecompensation"><div class="api-col left">Exposure Compensation</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setexposurecompensation_inline">setExposureCompensation</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setexposurecompensation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setExposureCompensation</h6></div>

~~~java
 void setExposureCompensation(@NonNull ExposureCompensation compensation,
                                        @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_exposure_compensation_key">CameraKey.EXPOSURE_COMPENSATION</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the camera's exposure compensation. See <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposurecompensation">ExposureCompensation</a></code> to view all possible exposure compensations to which the camera can be set. In order to use this function, set the camera exposure mode to <code>shutter</code>, <code>program</code> or <code>aperture</code>. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposurecompensation">ExposureCompensation</a> <font color="#000">compensation</td><td><font color="#666"><i>Exposure compensation value to be set for the camera.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getexposurecompensation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getexposurecompensation_inline">getExposureCompensation</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getexposurecompensation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getExposureCompensation</h6></div>

~~~java
 void getExposureCompensation(@NonNull final CompletionCallbackWith<ExposureCompensation> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_exposure_compensation_key">CameraKey.EXPOSURE_COMPENSATION</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the camera's exposure compensation. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposurecompensation">ExposureCompensation</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setaelock"><div class="api-col left">Auto Exposure (AE)</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setaelock_inline">setAELock</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setaelock_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAELock</h6></div>

~~~java
 void setAELock(boolean isLocked, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_ae_lock_key">CameraKey.AE_LOCK</a></td></tr></table></html>



##### Description:



<font color="#666">Locks or unlocks the camera's AE (auto exposure). <br> Post condition: <br> If the AE lock is enabled, the spot metering area cannot be set. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isLocked</td><td><font color="#666"><i><code>true</code> if the camera AE is locked, <code>false</code> if it is unlocked.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getaelock"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getaelock_inline">getAELock</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getaelock_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAELock</h6></div>

~~~java
 void getAELock(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_ae_lock_key">CameraKey.AE_LOCK</a></td></tr></table></html>



##### Description:



<font color="#666">Determines if the camera's AE (auto exposure) is locked. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setautoaeunlockenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setautoaeunlockenabled_inline">setAutoAEUnlockEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setautoaeunlockenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAutoAEUnlockEnabled</h6></div>

~~~java
 void setAutoAEUnlockEnabled(boolean enabled, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_auto_ae_unlock_enabled_key">CameraKey.AUTO_AE_UNLOCK_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Enables/disables auto-unlocking of AE lock after shooting a photo. If it is enabled, the Auto Exposure will unlock after each shot. If disabled, Auto Exposure will change when calling <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setaelock">setAELock</a></code>. It is only supported X4S, X5S and Phantom 4 Pro cameras. For the other products, auto-unlocking is always enabled. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> if the camera AE will automatically unlock.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getautoaeunlockenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getautoaeunlockenabled_inline">getAutoAEUnlockEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getautoaeunlockenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAutoAEUnlockEnabled</h6></div>

~~~java
 void getAutoAEUnlockEnabled(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_auto_ae_unlock_enabled_key">CameraKey.AUTO_AE_UNLOCK_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Determines whether auto-unlocking of AE lock is enabled. It is only supported by X4S, X5S and Phantom 4 Pro cameras. For Zenmuse H20 and Zenmuse H20T,  please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setphotoaebparam"><div class="api-col left">Auto Exposure Bracketing (AEB)</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setphotoaebparam_inline">setPhotoAEBCount</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setphotoaebparam_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPhotoAEBCount</h6></div>

~~~java
 void setPhotoAEBCount(@NonNull PhotoAEBCount count, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_aeb_count_key">CameraKey.PHOTO_AEB_COUNT</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the camera's auto exposure bracketing (AEB) capture parameters.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera.html#djicamera_djicameraphotoaebcount">PhotoAEBCount</a> <font color="#000">count</td><td><font color="#666"><i>AEB capture count to be set for the camera.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getphotoaebparam"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getphotoaebparam_inline">getPhotoAEBCount</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getphotoaebparam_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPhotoAEBCount</h6></div>

~~~java
 void getPhotoAEBCount(@NonNull final CompletionCallbackWith<PhotoAEBCount> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_aeb_count_key">CameraKey.PHOTO_AEB_COUNT</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the camera's AEB capture parameters.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera.html#djicamera_djicameraphotoaebcount">PhotoAEBCount</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setwhitebalanceandcolortemperature"><div class="api-col left">White Balance & Color Temperature</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setwhitebalanceandcolortemperature_inline">setWhiteBalance</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setwhitebalanceandcolortemperature_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setWhiteBalance</h6></div>

~~~java
 void setWhiteBalance(@NonNull WhiteBalance whiteBalance, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_white_balance_key">CameraKey.WHITE_BALANCE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the camera's white balance (color temperature). When white balance is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerawhitebalance_customcolortemperature">CUSTOM</a></code>, the colorTemperature argument is used. For all other values, the colorTemperature argument is ignored. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraWhiteBalanceInterface.html#djicamera_djicamerawhitebalanceinterface">WhiteBalance</a> <font color="#000">whiteBalance</td><td><font color="#666"><i>White balance value to be set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html>

##### See Also:



<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerawhitebalance">WhiteBalancePreset</a></code> to view all possible white balance setting options for the camera.
</br>

</div>

<div class="api-row" id="djicamera_camerasettings_getwhitebalanceandcolortemperature"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getwhitebalanceandcolortemperature_inline">getWhiteBalance</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getwhitebalanceandcolortemperature_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWhiteBalance</h6></div>

~~~java
 void getWhiteBalance(@NonNull final CompletionCallbackWith<WhiteBalance> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_white_balance_key">CameraKey.WHITE_BALANCE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the camera's white balance and color temperature. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraWhiteBalanceInterface.html#djicamera_djicamerawhitebalanceinterface">WhiteBalance</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Lens, Zoom & Focus

<div class="api-row" id="djicamera_camerasettings_ischangeablelenssupported"><div class="api-col left">Lens</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_ischangeablelenssupported_inline">isInterchangeableLensSupported</a></div></div><div class="inline-doc" id="djicamera_camerasettings_ischangeablelenssupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isInterchangeableLensSupported</h6></div>

~~~java
 boolean isInterchangeableLensSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_is_interchangeable_lens_supported_key">CameraKey.IS_INTERCHANGEABLE_LENS_SUPPORTED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the changeable lens is supported by the camera. Currently a changeable lens is supported only by the X5, X5R and X5S cameras. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getlensinformation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getlensinformation_inline">getLensInformation</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getlensinformation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLensInformation</h6></div>

~~~java
 void getLensInformation(@NonNull final CompletionCallbackWith<String> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_lens_information_key">CameraKey.LENS_INFORMATION</a></td></tr></table></html>



##### Description:



<font color="#666">Gets details of the installed lens. Supported only by the X5, X5R, X5S and X7 cameras. This is available only when <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_ischangeablelenssupported">isInterchangeableLensSupported</a></code> returns <code>true</code>.  For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_isdigitalzoomscalesupported"><div class="api-col left">Zoom</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_isdigitalzoomscalesupported_inline">isDigitalZoomSupported</a></div></div><div class="inline-doc" id="djicamera_camerasettings_isdigitalzoomscalesupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isDigitalZoomSupported</h6></div>

~~~java
 boolean isDigitalZoomSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_is_digital_zoom_supported_key">CameraKey.IS_DIGITAL_ZOOM_SUPPORTED</a></td></tr></table></html>



##### Description:



<font color="#666">Check if the current device supports digital zoom scale. It is supported by Osmo with X3 camera, Phantom 4 camera, Z3 camera, Mavic Pro camera and Z30 camera. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setdigitalzoomscale"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setdigitalzoomscale_inline">setDigitalZoomFactor</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setdigitalzoomscale_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setDigitalZoomFactor</h6></div>

~~~java
 void setDigitalZoomFactor(@FloatRange(from = 1.0, to = 2.0) float factor,
                                     @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_digital_zoom_factor_key">CameraKey.DIGITAL_ZOOM_FACTOR</a></td></tr></table></html>



##### Description:



<font color="#666">Adjusts the digital zoom. It is supported by Osmo with X3 camera, Phantom 4 camera, Z3 camera, Mavic Pro camera and XT 2 camera.  For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@FloatRange(from = 1.0, to = 2.0) float <font color="#000">factor</td><td><font color="#666"><i>The valid range is from 1.0 to 2.0.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getdigitalzoomscale"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getdigitalzoomscale_inline">getDigitalZoomFactor</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getdigitalzoomscale_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDigitalZoomFactor</h6></div>

~~~java
 void getDigitalZoomFactor(@NonNull final CompletionCallbackWith<Float> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_digital_zoom_factor_key">CameraKey.DIGITAL_ZOOM_FACTOR</a></td></tr></table></html>



##### Description:



<font color="#666">Gets current digital zoom. It is supported by Osmo with X3 camera, Phantom 4 camera, Z3 camera, Mavic Pro camera and Z30 camera. Note Z30 cannot set the digital zoom scale, but will use digital zoom when using <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_startcontinuousopticalzoom">startContinuousOpticalZoom</a></code> and the optical zoom has reached its limit.  For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Float&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_isopticalzoomsupported"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_isopticalzoomsupported_inline">isOpticalZoomSupported</a></div></div><div class="inline-doc" id="djicamera_camerasettings_isopticalzoomsupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isOpticalZoomSupported</h6></div>

~~~java
 boolean isOpticalZoomSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_is_optical_zoom_supported_key">CameraKey.IS_OPTICAL_ZOOM_SUPPORTED</a></td></tr></table></html>



##### Description:



<font color="#666">Check if camera supports optical zoom. It is only supported by X5, X5R and X5S camera with the Olympus M.Zuiko ED 14-42mm f/3.5-5.6 EZ  lens, Z3 camera, Z30 camera. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if camera supports optical zoom.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getopticalzoomspec"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getopticalzoomspec_inline">getOpticalZoomSpec</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getopticalzoomspec_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getOpticalZoomSpec</h6></div>

~~~java
 void getOpticalZoomSpec(@NonNull final CompletionCallbackWith<OpticalZoomSpec> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_optical_zoom_spec_key">CameraKey.OPTICAL_ZOOM_SPEC</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the specification of the zoom lens. It is only supported by X5, X5R and X5S camera with lens Olympus M.Zuiko ED 14-42mm f/3.5-5.6 EZ, Z3 camera, Z30 camera.  For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraOpticalZoomSpec.html#djicamera_djicameraopticalzoomspec">OpticalZoomSpec</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setopticalzoomfocallength"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setopticalzoomfocallength_inline">setOpticalZoomFocalLength</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setopticalzoomfocallength_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setOpticalZoomFocalLength</h6></div>

~~~java
 void setOpticalZoomFocalLength(int focalLength, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_optical_zoom_focal_length_key">CameraKey.OPTICAL_ZOOM_FOCAL_LENGTH</a></td></tr></table></html>



##### Description:



<font color="#666">Sets focal length of the zoom lens. It is only supported by X5, X5R and X5S camera with lens Olympus M.Zuiko ED 14-42mm f/3.5-5.6 EZ, X5S camera with  Panasonic Lumix 14-42mm/3.5-5.6 HD or Olympus M.Zuiko 9-18mm/4.0-5.6, Z3 camera, Z30 camera. For Zenmuse H20 and Zenmuse H20T,  please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">focalLength</td><td><font color="#666"><i>Focal length of zoom lens. Valid range is [<code><a href="/Components/Camera/DJICamera_DJICameraOpticalZoomSpec.html#djicamera_djicameraopticalzoomspec_minfocallength">getMinFocalLength</a></code>, <code><a href="/Components/Camera/DJICamera_DJICameraOpticalZoomSpec.html#djicamera_djicameraopticalzoomspec_maxfocallength">getMaxFocalLength</a></code>]  and must be a multiple of <code><a href="/Components/Camera/DJICamera_DJICameraOpticalZoomSpec.html#djicamera_djicameraopticalzoomspec_focallengthstep">getFocalLengthStep</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getopticalzoomfocallength"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getopticalzoomfocallength_inline">getOpticalZoomFocalLength</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getopticalzoomfocallength_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getOpticalZoomFocalLength</h6></div>

~~~java
 void getOpticalZoomFocalLength(@NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_optical_zoom_focal_length_key">CameraKey.OPTICAL_ZOOM_FOCAL_LENGTH</a></td></tr></table></html>



##### Description:



<font color="#666">Gets zoom lens focal length in units of 0.1mm. It is only supported by X5, X5R and X5S camera with lens Olympus M.Zuiko ED 14-42mm f/3.5-5.6 EZ, Z3 camera, Z30 camera. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getopticalzoomscale"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getopticalzoomscale_inline">getOpticalZoomFactor</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getopticalzoomscale_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getOpticalZoomFactor</h6></div>

~~~java
 void getOpticalZoomFactor(@NonNull final CompletionCallbackWith<Float> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_optical_zoom_scale_key">CameraKey.OPTICAL_ZOOM_SCALE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets current optical zoom factor with range [1, 30]. It is only supported Z30 camera. The Z30 zoom factor can be changed  with <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setopticalzoomfocallength">setOpticalZoomFocalLength</a></code> and <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_startcontinuousopticalzoom">startContinuousOpticalZoom</a></code>.  The zoom factor is then calculated and given through this method. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Float&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_startcontinuousopticalzoom"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_startcontinuousopticalzoom_inline">startContinuousOpticalZoom</a></div></div><div class="inline-doc" id="djicamera_camerasettings_startcontinuousopticalzoom_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startContinuousOpticalZoom</h6></div>

~~~java
 void startContinuousOpticalZoom(@NonNull ZoomDirection direction,
                                           @NonNull final ZoomSpeed speed,
                                           @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_start_continuous_optical_zoom_key">CameraKey.START_CONTINUOUS_OPTICAL_ZOOM</a></td></tr></table></html>



##### Description:



<font color="#666">Start changing the focal length of the lens in specified direction with specified speed. Focal length change (zooming) will halt when maximum or minimum focal lengths are reached, or <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_stopcontinuousopticalzoom">stopContinuousOpticalZoom</a></code> is called. It is only supported by X5, X5R and X5S  camera on Osmo with lens Olympus M.Zuiko ED 14-42mm f/3.5-5.6 EZ, Z3 camera, Z30 camera. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraopticalzoomdirection">ZoomDirection</a> <font color="#000">direction</td><td><font color="#666"><i>Direction to zoom.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraopticalzoomspeed">ZoomSpeed</a> <font color="#000">speed</td><td><font color="#666"><i>Zoom speed.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_stopcontinuousopticalzoom"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_stopcontinuousopticalzoom_inline">stopContinuousOpticalZoom</a></div></div><div class="inline-doc" id="djicamera_camerasettings_stopcontinuousopticalzoom_inline"

><div class="article"><h6 ><font color="#AAA">method </font>stopContinuousOpticalZoom</h6></div>

~~~java
 void stopContinuousOpticalZoom(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_stop_continuous_optical_zoom_key">CameraKey.STOP_CONTINUOUS_OPTICAL_ZOOM</a></td></tr></table></html>



##### Description:



<font color="#666">Called to stop focal length changing, when it currently is from calling <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens_startcontinuousopticalzoomindirection">startContinuousOpticalZoom</a></code>. It is only supported by X5, X5R and X5S camera on Osmo with lens Olympus M.Zuiko ED 14-42mm f/3.5-5.6 EZ, Z3 camera, Z30 camera. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_istapzoomsupported"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_istapzoomsupported_inline">isTapZoomSupported</a></div></div><div class="inline-doc" id="djicamera_camerasettings_istapzoomsupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isTapZoomSupported</h6></div>

~~~java
 boolean isTapZoomSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_is_tap_zoom_supported_key">CameraKey.IS_TAP_ZOOM_SUPPORTED</a></td></tr></table></html>



##### Description:



<font color="#666">Determines whether the current camera supports TapZoom feature. TapZoom is only supported by Z30 camera. @return <code>true</code> if the camera supports TapZoom. In multiple lenses camera, if one of its lenses supports  this feature, the camera and the lens that can supports both return <code>true</code>. User can only access the parameters through the lens object.  For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_settapzoomenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_settapzoomenabled_inline">setTapZoomEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_settapzoomenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setTapZoomEnabled</h6></div>

~~~java
 void setTapZoomEnabled(boolean enabled, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_tap_zoom_enabled_key">CameraKey.TAP_ZOOM_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Enable/disable TapZoom. <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_tapzoomattarget">tapZoomAtTarget</a></code> can only be called when TapZoom is enabled. It is only supported Z30 camera. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_gettapzoomenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_gettapzoomenabled_inline">getTapZoomEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_gettapzoomenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTapZoomEnabled</h6></div>

~~~java
 void getTapZoomEnabled(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_tap_zoom_enabled_key">CameraKey.TAP_ZOOM_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Determines whether TapZoom is enabled. It is only supported by Z30 camera.  For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_settapzoommultiplier"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_settapzoommultiplier_inline">setTapZoomMultiplier</a></div></div><div class="inline-doc" id="djicamera_camerasettings_settapzoommultiplier_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setTapZoomMultiplier</h6></div>

~~~java
 void setTapZoomMultiplier(@IntRange(from = 1, to = 5) int multiplier,
                                     @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_tap_zoom_multiplier_key">CameraKey.TAP_ZOOM_MULTIPLIER</a></td></tr></table></html>



##### Description:



<font color="#666">TapZoom uses a multiplier to change the zoom scale when called. The final zoom scale for a TapZoom will be: Current Zoom Scale x Multiplier. The multiplier range is [1,5]. A multiplier of 1 will not change the zoom. When the multiplier is 1, the zoom scale will not change during TapZoom. It is only supported by Z30 camera.  For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 1, to = 5) int <font color="#000">multiplier</td><td><font color="#666"><i>Multiplier of TapZoom.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_gettapzoommultiplier"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_gettapzoommultiplier_inline">getTapZoomMultiplier</a></div></div><div class="inline-doc" id="djicamera_camerasettings_gettapzoommultiplier_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTapZoomMultiplier</h6></div>

~~~java
 void getTapZoomMultiplier(@NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_tap_zoom_multiplier_key">CameraKey.TAP_ZOOM_MULTIPLIER</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the multiplier for TapZoom. It is only supported by Z30 camera.  For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_tapzoomattarget"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_tapzoomattarget_inline">tapZoomAtTarget</a></div></div><div class="inline-doc" id="djicamera_camerasettings_tapzoomattarget_inline"

><div class="article"><h6 ><font color="#AAA">method </font>tapZoomAtTarget</h6></div>

~~~java
 void tapZoomAtTarget(@NonNull PointF target, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_tap_zoom_at_target_key">CameraKey.TAP_ZOOM_AT_TARGET</a></td></tr></table></html>



##### Description:



<font color="#666">TapZoom at the target. It can be called only when TapZoom is enabled.  When a new target is set, the gimbal will rotate and locate the target in the center of the screen. At the same time, the camera will zoom by multiplying the TapZoom multiplier. It is only supported Z30 camera. For Zenmuse H20 and Zenmuse H20T,  please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull PointF <font color="#000">target</td><td><font color="#666"><i>The CameraTapZoomTargetPoint to zoom. The range for x and y is from 0.0 to 1.0. The point [0.0, 0.0] represents the top-left corner of the screen.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_ishybridzoomsupported"><div class="api-col left">HybridZoom</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_ishybridzoomsupported_inline">isHybridZoomSupported</a></div></div><div class="inline-doc" id="djicamera_camerasettings_ishybridzoomsupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isHybridZoomSupported</h6></div>

~~~java
 boolean isHybridZoomSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Hybrid zoom is combining optical and digital zoom. Camera will automatically switch over to digital zoom when optical  zoom range is exceeded. Check if camera supports hybrid zoom. It is only supported by Mavic 2 Zoom Camera and Mavic 2 Enterprise Camera.  For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if camera supports hybrid zoom.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_gethybridzoomspecwithcompletion"><div class="api-col left">Hybrid Zoom Spec</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_gethybridzoomspecwithcompletion_inline">getHybridZoomSpec</a></div></div><div class="inline-doc" id="djicamera_camerasettings_gethybridzoomspecwithcompletion_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHybridZoomSpec</h6></div>

~~~java
 void getHybridZoomSpec(@NonNull final CompletionCallbackWith<HybridZoomSpec> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Hybrid zoom is combining optical and digital zoom. Camera will automatically switch over to digital zoom when optical zoom range is exceeded.  Gets the specification of the zoom lens. It is only supported by Mavic 2 Zoom Camera and Mavic 2 Enterprise Camera.  For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraHybridZoomSpec.html#djicamera_djicamerahybridzoomspec">HybridZoomSpec</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_sethybridzoomfocallength"><div class="api-col left">Hybrid Zoom Focal Length</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_sethybridzoomfocallength_inline">setHybridZoomFocalLength</a></div></div><div class="inline-doc" id="djicamera_camerasettings_sethybridzoomfocallength_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setHybridZoomFocalLength</h6></div>

~~~java
 void setHybridZoomFocalLength(int focalLength, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Hybrid zoom is combining optical and digital zoom. Camera will automatically switch over to digital zoom when optical zoom range is exceeded.  Sets focal length of the zoom lens. It is only supported by Mavic 2 Zoom Camera and Mavic 2 Enterprise Camera. For Zenmuse H20 and Zenmuse H20T,  please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int <font color="#000">focalLength</td><td><font color="#666"><i>Focal length of zoom lens. Valid range is [<code><a href="/Components/Camera/DJICamera_DJICameraHybridZoomSpec.html#djicamera_djicamerahybridzoomspec_minhybridfocallength">getMinHybridFocalLength</a></code>, <code><a href="/Components/Camera/DJICamera_DJICameraHybridZoomSpec.html#djicamera_djicamerahybridzoomspec_maxhybridfocallength">getMaxHybridFocalLength</a></code>]  and must be a multiple of <code><a href="/Components/Camera/DJICamera_DJICameraHybridZoomSpec.html#djicamera_djicamerahybridzoomspec_focallengthstep">getFocalLengthStep</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_gethybridzoomfocallength"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_gethybridzoomfocallength_inline">getHybridZoomFocalLength</a></div></div><div class="inline-doc" id="djicamera_camerasettings_gethybridzoomfocallength_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHybridZoomFocalLength</h6></div>

~~~java
 void getHybridZoomFocalLength(@NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Hybrid zoom is combining optical and digital zoom. Camera will automatically switch over to digital zoom when optical zoom range is exceeded.  Gets zoom lens focal length in units of 0.1mm. It is only supported by Mavic 2 Zoom Camera and Mavic 2 Enterprise Camera. For Zenmuse H20 and Zenmuse H20T,  please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_settapzoomstatecallback"><div class="api-col left">Tap Zoom State</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_settapzoomstatecallback_inline">setTapZoomStateCallback</a></div></div><div class="inline-doc" id="djicamera_camerasettings_settapzoomstatecallback_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setTapZoomStateCallback</h6></div>

~~~java
 void setTapZoomStateCallback(@Nullable final TapZoomStateCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the tap zoom state callback. The callback's <code><a href="/Components/Camera/DJICamera_TapZoomStateCallbackInterface.html#djicamera_tapzoomstatecallbackinterface_onupdate">onUpdate</a></code> method will be called when the camera's zoom state is updated.  It is only supported by Z30 camera. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final TapZoomStateCallback <font color="#000">callback</td><td><font color="#666"><i>Completion callback that receives the execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_isadjustablefocalpointsupported"><div class="api-col left">Focus</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_isadjustablefocalpointsupported_inline">isAdjustableFocalPointSupported</a></div></div><div class="inline-doc" id="djicamera_camerasettings_isadjustablefocalpointsupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isAdjustableFocalPointSupported</h6></div>

~~~java
 boolean isAdjustableFocalPointSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_is_adjustable_focal_point_supported_key">CameraKey.IS_ADJUSTABLE_FOCAL_POINT_SUPPORTED</a></td></tr></table></html>



##### Description:



<font color="#666">Determines whether the camera supports an adjustable focal point. Currently, the adjustable focal point is supported by the X5, X5R, Z3, Mavic Pro camera, Z30, Phantom 4 Pro camera, X4S, X5S, Mavic 2 Pro, Mavic 2 Zoom Camera and and Mavic 2 Enterprise Camera. For Zenmuse H20 and Zenmuse H20T,  please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setlensfocusmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setlensfocusmode_inline">setFocusMode</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setlensfocusmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFocusMode</h6></div>

~~~java
 void setFocusMode(@NonNull SettingsDefinitions.FocusMode focusMode,
                             @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_focus_mode_key">CameraKey.FOCUS_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the lens focus mode. See <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameralensfocusmode">FocusMode</a></code>. It is available only when <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_isadjustablefocalpointsupported">isAdjustableFocalPointSupported</a></code> returns <code>true</code>. Supported by the X5, X5R, Z3 cameras (Z3 camera can only support <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameralensfocusmode_auto">AUTO</a></code>), the Mavic Pro camera, Z30, Phantom 4 Pro camera, X4S, X5S, Mavic 2 Pro, Mavic 2 Zoom Camera and Mavic 2 Enterprise Camera.  For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameralensfocusmode">FocusMode</a> <font color="#000">focusMode</td><td><font color="#666"><i>Focus mode to set. Check <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameralensfocusmode">FocusMode</a></code> for more detail.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getlensfocusmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getlensfocusmode_inline">getFocusMode</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getlensfocusmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFocusMode</h6></div>

~~~java
 void getFocusMode(@NonNull final CompletionCallbackWith<FocusMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_focus_mode_key">CameraKey.FOCUS_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the lens focus mode. Please check <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameralensfocusmode">FocusMode</a></code>. It is available only when <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_isadjustablefocalpointsupported">isAdjustableFocalPointSupported</a></code> returns <code>true</code>. Supported only by the X5, X5R, Z3 cameras, Mavic Pro camera, Z30, Phantom 4 Pro camera, X4S, X5S, Mavic 2 Pro, Mavic 2 Zoom Camera and Mavic 2 Enterprise Camera. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameralensfocusmode">FocusMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setlensfocustarget"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setlensfocustarget_inline">setFocusTarget</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setlensfocustarget_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFocusTarget</h6></div>

~~~java
 void setFocusTarget(@NonNull PointF focusTarget, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_focus_target_key">CameraKey.FOCUS_TARGET</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the lens focus target point. When the focus mode is auto, the target point is the focal point. When the focus mode is manual, the target point is the zoom out area if the focus assistant is enabled for the manual mode. It is available only when <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_isadjustablefocalpointsupported">isAdjustableFocalPointSupported</a></code> returns <code>true</code>. Supported only by the X5, X5R, Z3 cameras, Mavic Pro camera, Phantom 4 Pro camera, Mavic 2 Pro, Mavic 2 Zoom Camera, Mavic 2 Enterprise Camera, X4S and X5S. camera, X4S and X5S. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull PointF <font color="#000">focusTarget</td><td><font color="#666"><i>The focus target to set. The range for x and y is from 0.0 to 1.0. The point [0.0, 0.0] represents the top-left angle of the screen.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getlensfocustarget"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getlensfocustarget_inline">getFocusTarget</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getlensfocustarget_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFocusTarget</h6></div>

~~~java
 void getFocusTarget(@NonNull final CompletionCallbackWith<PointF> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_focus_target_key">CameraKey.FOCUS_TARGET</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the lens focus target point. It is available only when <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_isadjustablefocalpointsupported">isAdjustableFocalPointSupported</a></code> returns <code>true</code>. Supported only by the X5, X5R, Z3 cameras, Mavic Pro camera and Phantom 4 Pro camera, X4S, X5S, Mavic 2 Pro, Mavic 2 Zoom Camera and Mavic 2 Enterprise Camera. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;PointF&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setlensfocusassistantenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setlensfocusassistantenabled_inline">setFocusAssistantSettings</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setlensfocusassistantenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFocusAssistantSettings</h6></div>

~~~java
 void setFocusAssistantSettings(FocusAssistantSettings settings,
                                          @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_focus_assistant_settings_key">CameraKey.FOCUS_ASSISTANT_SETTINGS</a></td></tr></table></html>



##### Description:



<font color="#666">Used to enable/disable the lens focus assistant. When the focus assistant is enabled, the camera live view will digitally zoom into the focus target area so the user can see the quality of focus. Focus assistant can be used for both manual focus (MF) and auto focus (AF). It is available only when <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_isadjustablefocalpointsupported">isAdjustableFocalPointSupported</a></code> returns <code>true</code>. Supported only by the X5, X5R, Z3, Phantom 4 Pro camera, X4S and X5S. Because Z3 only supports AF mode, <code><a href="/Components/Camera/DJICamera_DJICameraFocusAssistantSettings.html#djicamera_djicamerafocusassistantsettings_enabledformf">isEnabledMF</a></code> will be ignored.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraFocusAssistantSettings.html#djicamera_djicamerafocusassistantsettings">FocusAssistantSettings</a> <font color="#000">settings</td><td><font color="#666"><i>Sets whether the lens focus assistant for AF and MF mode is enabled.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getlensfocusassistantenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getlensfocusassistantenabled_inline">getFocusAssistantSettings</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getlensfocusassistantenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFocusAssistantSettings</h6></div>

~~~java
 void getFocusAssistantSettings(@NonNull final CompletionCallbackWithTwoParam<Boolean, Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_focus_assistant_settings_key">CameraKey.FOCUS_ASSISTANT_SETTINGS</a></td></tr></table></html>



##### Description:



<font color="#666">Determines whether the lens focus assistant is enabled. When the focus assistant is enabled, the camera live view will digitally zoom into the focus target area so the user can see the quality of focus. Focus assistant can be used for both manual focus (MF) and auto focus (AF). It is available only when <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_isadjustablefocalpointsupported">isAdjustableFocalPointSupported</a></code> returns <code>true</code>. Supported only by the X5, X5R, Z3 cameras, Phantom 4 Pro, X4s and X5S. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWithTwoParam&lt;Boolean, Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getlensfocusringvalueupperbound"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getlensfocusringvalueupperbound_inline">getFocusRingValueUpperBound</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getlensfocusringvalueupperbound_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFocusRingValueUpperBound</h6></div>

~~~java
 void getFocusRingValueUpperBound(@NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_focus_ring_value_upper_bound_key">CameraKey.FOCUS_RING_VALUE_UPPER_BOUND</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the lens focusing ring value's max value. It is available only when <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_isadjustablefocalpointsupported">isAdjustableFocalPointSupported</a></code> returns <code>true</code>. Supported only by the X5, X5R, Z3 cameras, Phantom 4 Pro camera, X4S, X5S, Mavic 2 Pro, Mavic 2 Zoom Camera and Mavic 2 Enterprise Camera.  For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setlensfocusringvalue"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setlensfocusringvalue_inline">setFocusRingValue</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setlensfocusringvalue_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFocusRingValue</h6></div>

~~~java
 void setFocusRingValue(@IntRange(from = 0) int value, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_focus_ring_value_key">CameraKey.FOCUS_RING_VALUE</a></td></tr></table></html>



##### Description:



<font color="#666">Set the focal distance by simulating the focus ring adjustment. Value can have a range of 0, <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getlensfocusringvalueupperbound">getFocusRingValueUpperBound</a></code>], which represents infinity and the closest possible focal distance. It is available only when <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_isadjustablefocalpointsupported">isAdjustableFocalPointSupported</a></code> returns <code>true</code>. For some lenses, the minimum focus ring value is larger than 0. For example the minimum of DJI MFT 15mm f/1.7 ASPH is 270. To retrieve the minimum value, perform the following steps: - Call <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setlensfocusmode">setFocusMode</a></code> with <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameralensfocusmode_auto">AUTO</a></code>. - Call <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setlensfocustarget">setFocusTarget</a></code> with the furthest target (>30m). - Call <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getlensfocusringvalue">getFocusRingValue</a></code> to get the current focus ring value. This is the minimum value. The maximum value can be retrieved using <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getlensfocusringvalueupperbound">getFocusRingValueUpperBound</a></code>. Supported only by X5, X5R, Z3 cameras, Phantom 4 Pro, X4S, X5S, Mavic 2 Pro, Mavic 2 Zoom Camera and Mavic 2 Enterprise Camera. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0) int <font color="#000">value</td><td><font color="#666"><i>Value to adjust focus ring to. The minimum value is 0, the maximum value depends on the installed lens. Please use method <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getlensfocusringvalueupperbound">getFocusRingValueUpperBound</a></code> to ensure the input argument is valid.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getlensfocusringvalue"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getlensfocusringvalue_inline">getFocusRingValue</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getlensfocusringvalue_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFocusRingValue</h6></div>

~~~java
 void getFocusRingValue(@NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_focus_ring_value_key">CameraKey.FOCUS_RING_VALUE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the lens focus ring value. It is available only when <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_isadjustablefocalpointsupported">isAdjustableFocalPointSupported</a></code> returns <code>true</code>. Supported only by the X5, X5R, Z3 cameras, Phantom 4 Pro, X4S, X5S, Mavic 2 Pro, Mavic 2 Zoom Camera,  Mavic 2 Enterprise Camera. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Settings

<div class="api-row" id="djicamera_camerasettings_loadfactorysettings"><div class="api-col left">Factory Settings</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_loadfactorysettings_inline">restoreFactorySettings</a></div></div><div class="inline-doc" id="djicamera_camerasettings_loadfactorysettings_inline"

><div class="article"><h6 ><font color="#AAA">method </font>restoreFactorySettings</h6></div>

~~~java
 void restoreFactorySettings(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_restore_factory_settings_key">CameraKey.RESTORE_FACTORY_SETTINGS</a></td></tr></table></html>



##### Description:



<font color="#666">Load the camera's factory settings. <br> Post condition: The camera will reboot itself.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_savesettings"><div class="api-col left">Custom Settings</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_savesettings_inline">saveSettingsToProfile</a></div></div><div class="inline-doc" id="djicamera_camerasettings_savesettings_inline"

><div class="article"><h6 ><font color="#AAA">method </font>saveSettingsToProfile</h6></div>

~~~java
 void saveSettingsToProfile(@NonNull CustomSettingsProfile profile,
                                      @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_save_settings_to_profile_key">CameraKey.SAVE_SETTINGS_TO_PROFILE</a></td></tr></table></html>



##### Description:



<font color="#666">Saves the current camera settings permanently to the specified profile. See <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameracustomsettings">CustomSettingsProfile</a></code> to view all possible camera users.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameracustomsettings">CustomSettingsProfile</a> <font color="#000">profile</td><td><font color="#666"><i>Camera profile for which to store camera settings.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_loadsettings"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_loadsettings_inline">loadSettingsFromProfile</a></div></div><div class="inline-doc" id="djicamera_camerasettings_loadsettings_inline"

><div class="article"><h6 ><font color="#AAA">method </font>loadSettingsFromProfile</h6></div>

~~~java
 void loadSettingsFromProfile(@NonNull CustomSettingsProfile profile, final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_load_settings_from_profile_key">CameraKey.LOAD_SETTINGS_FROM_PROFILE</a></td></tr></table></html>



##### Description:



<font color="#666">Load camera settings from the specified user. <br> Post condition:<br> The camera will reboot itself.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameracustomsettings">CustomSettingsProfile</a> <font color="#000">profile</td><td><font color="#666"><i>Camera profile to load camera settings from.</i></td></tr><tr valign="top"><td><font color="#70BF41">final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Photo Settings

<div class="api-row" id="djicamera_camerasettings_setphotoratio"><div class="api-col left">Aspect Ratio</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setphotoratio_inline">setPhotoAspectRatio</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setphotoratio_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPhotoAspectRatio</h6></div>

~~~java
 void setPhotoAspectRatio(@NonNull PhotoAspectRatio aspectRatio,
                                    @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the camera's aspect ratio for photos. See <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotoaspectratio">PhotoAspectRatio</a></code> to view all possible ratios. Not supported by Z30 camera as the aspect ratio of Z30 is always <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotoaspectratio_16_9">RATIO_16_9</a></code>. Not supported by XTS camera as the  aspect ratio of XTS is always <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotoaspectratio_4_3">RATIO_4_3</a></code>. For Zenmuse H20  and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotoaspectratio">PhotoAspectRatio</a> <font color="#000">aspectRatio</td><td><font color="#666"><i>Aspect ratio for photos to be taken by camera.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getphotoratio"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getphotoratio_inline">getPhotoAspectRatio</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getphotoratio_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPhotoAspectRatio</h6></div>

~~~java
 void getPhotoAspectRatio(@NonNull final CompletionCallbackWith<PhotoAspectRatio> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_aspect_ratio_key">CameraKey.PHOTO_ASPECT_RATIO</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the camera's aspect ratio for photos. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotoaspectratio">PhotoAspectRatio</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setphotofileformat"><div class="api-col left">File Format</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setphotofileformat_inline">setPhotoFileFormat</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setphotofileformat_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPhotoFileFormat</h6></div>

~~~java
 void setPhotoFileFormat(@NonNull PhotoFileFormat format, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_file_format_key">CameraKey.PHOTO_FILE_FORMAT</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the camera's photo file format. See <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotofileformat">PhotoFileFormat</a></code> to view all possible photo formats to which the camera can be set. Also supported by thermal imaging camera. Not supported by Z30 camera and Mavic 2 Enterprise Dual as the photo file format for Z30 is always <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotofileformat_jpeg">JPEG</a></code>.  For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotofileformat">PhotoFileFormat</a> <font color="#000">format</td><td><font color="#666"><i>Photo file format used when the camera takes a photo. Check the enum <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotofileformat">PhotoFileFormat</a></code> to find all possible photo formats the camera can be set to.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getphotofileformat"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getphotofileformat_inline">getPhotoFileFormat</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getphotofileformat_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPhotoFileFormat</h6></div>

~~~java
 void getPhotoFileFormat(@NonNull final CompletionCallbackWith<PhotoFileFormat> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_file_format_key">CameraKey.PHOTO_FILE_FORMAT</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the camera's photo file format. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotofileformat">PhotoFileFormat</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setphotoburstcount"><div class="api-col left">Burst Count</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setphotoburstcount_inline">setPhotoBurstCount</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setphotoburstcount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPhotoBurstCount</h6></div>

~~~java
 void setPhotoBurstCount(@NonNull PhotoBurstCount count, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_burst_count_key">CameraKey.PHOTO_BURST_COUNT</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the burst shoot count for the camera when the user wants to use that feature. Check <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotoburstcount">PhotoBurstCount</a></code> to view all possible burst count values to which the camera can be set.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotoburstcount">PhotoBurstCount</a> <font color="#000">count</td><td><font color="#666"><i>The number of photos to take in one  Burst shot. Please check the enum <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotoburstcount">PhotoBurstCount</a></code> to find all possible burst count values the camera can be set to.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getphotoburstcount"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getphotoburstcount_inline">getPhotoBurstCount</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getphotoburstcount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPhotoBurstCount</h6></div>

~~~java
 void getPhotoBurstCount(@NonNull final CompletionCallbackWith<PhotoBurstCount> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_burst_count_key">CameraKey.PHOTO_BURST_COUNT</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the burst count type.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotoburstcount">PhotoBurstCount</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setphotorawburstcount"><div class="api-col left">RAW Burst Count</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setphotorawburstcount_inline">setPhotoRAWBurstCount</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setphotorawburstcount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPhotoRAWBurstCount</h6></div>

~~~java
 void setPhotoRAWBurstCount(@NonNull PhotoBurstCount count, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_raw_burst_count_key">CameraKey.PHOTO_RAW_BURST_COUNT</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the RAW image burst shoot count for the camera when the user wants to use that feature. See <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotoburstcount">PhotoBurstCount</a></code> to view all possible burst count values to which the camera can be set. It is only supported Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotoburstcount">PhotoBurstCount</a> <font color="#000">count</td><td><font color="#666"><i>The number of photos to take in one RAW burst shoot.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getphotorawburstcount"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getphotorawburstcount_inline">getPhotoRAWBurstCount</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getphotorawburstcount_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPhotoRAWBurstCount</h6></div>

~~~java
 void getPhotoRAWBurstCount(@NonNull final CompletionCallbackWith<PhotoBurstCount> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_raw_burst_count_key">CameraKey.PHOTO_RAW_BURST_COUNT</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the RAW image burst count. It is only supported Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotoburstcount">PhotoBurstCount</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setphotointervalparam"><div class="api-col left">Interval</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setphotointervalparam_inline">setPhotoTimeIntervalSettings</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setphotointervalparam_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPhotoTimeIntervalSettings</h6></div>

~~~java
 void setPhotoTimeIntervalSettings(@NonNull PhotoTimeIntervalSettings settings,
                                             @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_time_interval_settings_key">CameraKey.PHOTO_TIME_INTERVAL_SETTINGS</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the interval shoot parameters. The camera will capture a photo, wait a specified interval of time, take another photo, and continue in this manner until it has taken the required number of photos. Also supported by thermal imaging camera.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraPhotoIntervalParam.html#djicamera_djicameraphotointervalparam">PhotoTimeIntervalSettings</a> <font color="#000">settings</td><td><font color="#666"><i>An instance of <code><a href="/Components/Camera/DJICamera_DJICameraPhotoIntervalParam.html#djicamera_djicameraphotointervalparam">PhotoTimeIntervalSettings</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getphotointervalparam"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getphotointervalparam_inline">getPhotoTimeIntervalSettings</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getphotointervalparam_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPhotoTimeIntervalSettings</h6></div>

~~~java
 void getPhotoTimeIntervalSettings(
        @NonNull final CompletionCallbackWith<PhotoTimeIntervalSettings> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_time_interval_settings_key">CameraKey.PHOTO_TIME_INTERVAL_SETTINGS</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the camera's interval shoot parameters. </br></br>Also supported by thermal imaging camera.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraPhotoIntervalParam.html#djicamera_djicameraphotointervalparam">PhotoTimeIntervalSettings</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setphototimelapse"><div class="api-col left">Time Lapse</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setphototimelapse_inline">setPhotoTimeLapseSettings</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setphototimelapse_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPhotoTimeLapseSettings</h6></div>

~~~java
 void setPhotoTimeLapseSettings(@NonNull PhotoTimeLapseSettings settings,
                                          @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_time_lapse_settings_key">CameraKey.PHOTO_TIME_LAPSE_SETTINGS</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the TimeLapse parameters, including interval, duration and file format when saving. Precondition: Camera should be in <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashootphotomode_djicamerashootphotomodetimelapse">TIME_LAPSE</a></code> mode of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashootphotomode">ShootPhotoMode</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraPhotoTimeLapseSettings.html#djicamera_djicameraphototimelapsesettings">PhotoTimeLapseSettings</a> <font color="#000">settings</td><td><font color="#666"><i>The time between image captures. An integer falls in the range, [10, 1000]. &lt;br&gt;The unit is 100ms. Please note that when the format is JPEG+Video,&lt;br&gt; the minimum interval is 20(2 seconds).</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution block with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getphototimelapse"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getphototimelapse_inline">getPhotoTimeLapseSettings</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getphototimelapse_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPhotoTimeLapseSettings</h6></div>

~~~java
 void getPhotoTimeLapseSettings(@NonNull final CompletionCallbackWith<PhotoTimeLapseSettings> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_time_lapse_settings_key">CameraKey.PHOTO_TIME_LAPSE_SETTINGS</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the TimeLapse parameters including interval, duration and file format when saving. Precondition: The camera must be in <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashootphotomode_djicamerashootphotomodetimelapse">TIME_LAPSE</a></code> mode of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashootphotomode">ShootPhotoMode</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraPhotoTimeLapseSettings.html#djicamera_djicameraphototimelapsesettings">PhotoTimeLapseSettings</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setphotopanoramamode"><div class="api-col left">Panorama Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setphotopanoramamode_inline">setPhotoPanoramaMode</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setphotopanoramamode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPhotoPanoramaMode</h6></div>

~~~java
 void setPhotoPanoramaMode(@NonNull PhotoPanoramaMode mode, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_panorama_mode_key">CameraKey.PHOTO_PANORAMA_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the panorama mode. It is used when <code><a href="/Components/Camera/DJICamera.html#djicamera_setshootphotomode">setShootPhotoMode</a></code> is called with <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashootphotomode_djicamerashootphotomodepanorama">PANORAMA</a></code>.  It is supported by Spark, Mavic Air, Mavic 2,  Mavic 2 Pro, Mavic 2 Zoom, Mavic 2 Eneterprise, Mavic 2 Enterprise Dual.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera.html#djicamera_djicameraphotopanoramamode">PhotoPanoramaMode</a> <font color="#000">mode</td><td><font color="#666"><i>The panorama mode to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i><code>completion callback</code> to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getphotopanoramamode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getphotopanoramamode_inline">getPhotoPanoramaMode</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getphotopanoramamode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPhotoPanoramaMode</h6></div>

~~~java
 void getPhotoPanoramaMode(@NonNull final CompletionCallbackWith<PhotoPanoramaMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_panorama_mode_key">CameraKey.PHOTO_PANORAMA_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the panorama mode. It is only supported by Spark.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera.html#djicamera_djicameraphotopanoramamode">PhotoPanoramaMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i><code>completion callback</code> to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setpanooriginalphotosettings"><div class="api-col left">Panorama Photo Settings</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setpanooriginalphotosettings_inline">setPanoOriginalPhotoSettings</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setpanooriginalphotosettings_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPanoOriginalPhotoSettings</h6></div>

~~~java
 void setPanoOriginalPhotoSettings(@NonNull OriginalPhotoSettings settings,
                                             @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Change the original image configuration when shooting panorama photos. CAUTION: enabling this may consume 500 MB in the SD card or the internal storage for each panorama. It is supported by Spark, Mavic Air, Mavic 2,  Mavic 2 Pro, Mavic 2 Zoom, Mavic 2 Eneterprise, Mavic 2 Enterprise Dual. For Mavic Air, <code><a href="/Components/Camera/DJICamera_DJICameraOriginalPhotoSettings.html#djicamera_djicameraoriginalphotosettings_format">getFormat</a></code> is not used and it will ignore the value.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraOriginalPhotoSettings.html#djicamera_djicameraoriginalphotosettings">OriginalPhotoSettings</a> <font color="#000">settings</td><td><font color="#666"><i>An object of <code><a href="/Components/Camera/DJICamera_DJICameraOriginalPhotoSettings.html#djicamera_djicameraoriginalphotosettings">OriginalPhotoSettings</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getpanooriginalphotosettings"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getpanooriginalphotosettings_inline">getPanoOriginalPhotoSettings</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getpanooriginalphotosettings_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPanoOriginalPhotoSettings</h6></div>

~~~java
 void getPanoOriginalPhotoSettings(
        @NonNull final CompletionCallbackWith<OriginalPhotoSettings> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the configuration, which determines the behavior for the original images when shooting panorama photos. CAUTION: If this is enabled, it may consume 500 MB in the SD card or the internal storage for each panorama. It is supported by Mavic Air and Mavic 2. However, Mavic Air cannot change the format to save the original images. <code><a href="/Components/Camera/DJICamera_DJICameraOriginalPhotoSettings.html#djicamera_djicameraoriginalphotosettings_format">getFormat</a></code> will be ignored by Mavic Air.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraOriginalPhotoSettings.html#djicamera_djicameraoriginalphotosettings">OriginalPhotoSettings</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_sethighqualitypreviewenabled"><div class="api-col left">High Quality Preview</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_sethighqualitypreviewenabled_inline">setHighQualityPreviewEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_sethighqualitypreviewenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setHighQualityPreviewEnabled</h6></div>

~~~java
 void setHighQualityPreviewEnabled(boolean enabled, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Enables this before photo capture to download high quality preview image. Only supported by Phantom 4 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable the feature.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_gethighqualitypreviewenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_gethighqualitypreviewenabled_inline">getHighQualityPreviewEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_gethighqualitypreviewenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHighQualityPreviewEnabled</h6></div>

~~~java
 void getHighQualityPreviewEnabled(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets if high quality preview image downloading is enabled. Only supported by Phantom 4 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Video Settings

<div class="api-row" id="djicamera_camerasettings_setvideoresolutionandframerate"><div class="api-col left">Resolution & Frame Rate</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setvideoresolutionandframerate_inline">setVideoResolutionAndFrameRate</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setvideoresolutionandframerate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setVideoResolutionAndFrameRate</h6></div>

~~~java
 void setVideoResolutionAndFrameRate(@NonNull ResolutionAndFrameRate resolutionAndFrameRate,
                                               @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_resolution_frame_rate_key">CameraKey.RESOLUTION_FRAME_RATE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the camera's video resolution and frame rate. @warning The supported resolutions and frame rates for the two different analog television standards PAL and NTSC are below:<br> <br> <b>NTSC:</b><br> Resolution_4096x2160, FrameRate_24fps<br> Resolution_3840x2160, FrameRate_30fps<br> Resolution_3840x2160, FrameRate_24fps<br> Resolution_2704X1520, FrameRate_30fps<br> Resolution_2704X1520, FrameRate_24fps<br> Resolution_1920x1080, FrameRate_120fps (Slow Motion)<br> Resolution_1920x1080, FrameRate_60fps<br> Resolution_1920x1080, FrameRate_48fps<br> Resolution_1920x1080, FrameRate_30fps<br> Resolution_1920x1080, FrameRate_24fps<br> Resolution_1280x720,  FrameRate_60fps<br> Resolution_1280x720,  FrameRate_48fps<br> Resolution_1280x720,  FrameRate_30fps<br> Resolution_1280x720,  FrameRate_24fps<br> <br> <b>PAL:</b><br> Resolution_4096x2160, FrameRate_25fps<br> Resolution_4096x2160, FrameRate_24fps<br> Resolution_3840x2160, FrameRate_25fps<br> Resolution_3840x2160, FrameRate_24fps<br> Resolution_2704X1520, FrameRate_25fps<br> Resolution_2704X1520, FrameRate_24fps<br> Resolution_1920x1080, FrameRate_120fps (Slow Motion)<br> Resolution_1920x1080, FrameRate_50fps<br> Resolution_1920x1080, FrameRate_48fps<br> Resolution_1920x1080, FrameRate_25fps<br> Resolution_1920x1080, FrameRate_24fps<br> Resolution_1280x720, FrameRate_50fps<br> Resolution_1280x720, FrameRate_48fps<br> Resolution_1280x720, FrameRate_25fps<br> Resolution_1280x720, FrameRate_24fps For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraVideoResolutionAndFrameRate.html#djicamera_djicameravideoresolutionandframerate">ResolutionAndFrameRate</a> <font color="#000">resolutionAndFrameRate</td><td><font color="#666"><i>Resolution to be set for the video.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getvideoresolutionandframerate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getvideoresolutionandframerate_inline">getVideoResolutionAndFrameRate</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getvideoresolutionandframerate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVideoResolutionAndFrameRate</h6></div>

~~~java
 void getVideoResolutionAndFrameRate(
        @NonNull final CompletionCallbackWith<ResolutionAndFrameRate> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_resolution_frame_rate_key">CameraKey.RESOLUTION_FRAME_RATE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the camera's video resolution and frame rate values. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraVideoResolutionAndFrameRate.html#djicamera_djicameravideoresolutionandframerate">ResolutionAndFrameRate</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setvideofileformat"><div class="api-col left">File Format</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setvideofileformat_inline">setVideoFileFormat</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setvideofileformat_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setVideoFileFormat</h6></div>

~~~java
 void setVideoFileFormat(@NonNull VideoFileFormat format, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_video_file_format_key">CameraKey.VIDEO_FILE_FORMAT</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the camera's video file format. The default value is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideofileformat_mov">MOV</a></code>. For Zenmuse H20 and Zenmuse H20T,  please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideofileformat">VideoFileFormat</a> <font color="#000">format</td><td><font color="#666"><i>Video file format to be set for videos.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getvideofileformat"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getvideofileformat_inline">getVideoFileFormat</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getvideofileformat_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVideoFileFormat</h6></div>

~~~java
 void getVideoFileFormat(@NonNull final CompletionCallbackWith<VideoFileFormat> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_video_file_format_key">CameraKey.VIDEO_FILE_FORMAT</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the camera's video file format. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideofileformat">VideoFileFormat</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setvideostandard"><div class="api-col left">Analog Standard</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setvideostandard_inline">setVideoStandard</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setvideostandard_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setVideoStandard</h6></div>

~~~java
 void setVideoStandard(@NonNull VideoStandard videoStandard, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_video_standard_key">CameraKey.VIDEO_STANDARD</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the camera's analog video standard. Setting the video standard to PAL or NTSC will limit the available resolutions and frame rates to those compatible with the chosen video standard.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideostandard">VideoStandard</a> <font color="#000">videoStandard</td><td><font color="#666"><i>Video standard value to be set for the camera.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getvideostandard"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getvideostandard_inline">getVideoStandard</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getvideostandard_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVideoStandard</h6></div>

~~~java
 void getVideoStandard(@NonNull final CompletionCallbackWith<VideoStandard> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_video_standard_key">CameraKey.VIDEO_STANDARD</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the camera's video standard value.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideostandard">VideoStandard</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setvideocaptionenabled"><div class="api-col left">Caption</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setvideocaptionenabled_inline">setVideoCaptionEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setvideocaptionenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setVideoCaptionEnabled</h6></div>

~~~java
 void setVideoCaptionEnabled(boolean enabled, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_video_caption_enabled_key">CameraKey.VIDEO_CAPTION_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Enables recording position, time and camera information into a video caption file (.srt) saved on the SD card. The information is updated at 1Hz. Currently the .srt file can only be downloaded directly from the SD card.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable video caption.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getvideocaptionenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getvideocaptionenabled_inline">getVideoCaptionEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getvideocaptionenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVideoCaptionEnabled</h6></div>

~~~java
 void getVideoCaptionEnabled(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_video_caption_enabled_key">CameraKey.VIDEO_CAPTION_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Gets whether the video caption is enabled.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_sethistogramenabled"><div class="api-col left">Histogram</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_sethistogramenabled_inline">setHistogramEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_sethistogramenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setHistogramEnabled</h6></div>

~~~java
 void setHistogramEnabled(boolean enabled, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_histogram_enabled_key">CameraKey.HISTOGRAM_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Enables the histogram.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i>True to enable histogram.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_gethistogramenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_gethistogramenabled_inline">getHistogramEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_gethistogramenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHistogramEnabled</h6></div>

~~~java
 void getHistogramEnabled(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_histogram_enabled_key">CameraKey.HISTOGRAM_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Gets whether the histogram is enabled.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setvideofilecompressionstandard"><div class="api-col left">Compression</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setvideofilecompressionstandard_inline">setVideoFileCompressionStandard</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setvideofilecompressionstandard_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setVideoFileCompressionStandard</h6></div>

~~~java
 void setVideoFileCompressionStandard(@NonNull VideoFileCompressionStandard standard,
                                                @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_video_file_compression_standard_key">CameraKey.VIDEO_FILE_COMPRESSION_STANDARD</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the video file compression standard. It is only supported X4S camera, X5S camera and Phantom 4 Pro. For all other products, H.264 is used.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djivideofilecompressionstandard">VideoFileCompressionStandard</a> <font color="#000">standard</td><td><font color="#666"><i>The compression standard to use.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getvideofilecompressionstandard"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getvideofilecompressionstandard_inline">getVideoFileCompressionStandard</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getvideofilecompressionstandard_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVideoFileCompressionStandard</h6></div>

~~~java
 void getVideoFileCompressionStandard(
        @NonNull final CompletionCallbackWith<VideoFileCompressionStandard> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_video_file_compression_standard_key">CameraKey.VIDEO_FILE_COMPRESSION_STANDARD</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the video file compression standard. It is only supported X4S camera, X5S camera and Phantom 4 Pro.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djivideofilecompressionstandard">VideoFileCompressionStandard</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_setssdvideorecordingenabled"><div class="api-col left">SSD RAW</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_setssdvideorecordingenabled_inline">setSSDVideoRecordingEnabled</a></div></div><div class="inline-doc" id="djicamera_setssdvideorecordingenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSSDVideoRecordingEnabled</h6></div>

~~~java
 void setSSDVideoRecordingEnabled(boolean enabled, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_ssd_video_recording_enabled_key">CameraKey.SSD_VIDEO_RECORDING_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Enables/disables the recording of RAW video. It is supported by X5S. User can use the other SSD interfaces only when it is enabled. For X5R, RAW recording is always enabled if there is SSD inserted.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable the RAW video recording.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_getssdvideorecordingenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_getssdvideorecordingenabled_inline">getSSDVideoRecordingEnabled</a></div></div><div class="inline-doc" id="djicamera_getssdvideorecordingenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSSDVideoRecordingEnabled</h6></div>

~~~java
 void getSSDVideoRecordingEnabled(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_ssd_video_recording_enabled_key">CameraKey.SSD_VIDEO_RECORDING_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Determines whether the recording of RAW video is enabled. It is supported by X5S.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_setssdvideoresolutionandframerate"><div class="api-col left">SSD RAW Resolution and Frame Rate</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_setssdvideoresolutionandframerate_inline">setSSDVideoResolutionAndFrameRate</a></div></div><div class="inline-doc" id="djicamera_setssdvideoresolutionandframerate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSSDVideoResolutionAndFrameRate</h6></div>

~~~java
 void setSSDVideoResolutionAndFrameRate(@NonNull ResolutionAndFrameRate resolutionAndFrameRate,
                                                  @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_ssd_video_resolution_and_frame_rate_key">CameraKey.SSD_VIDEO_RESOLUTION_AND_FRAME_RATE</a></td></tr></table></html>



##### Description:



<font color="#666">Set Raw Video Resolution and Frame Rate of the SSD. Note, only raw video is saved to the SSD. Compressed video, compressed pictures and raw pictures are all saved to the SD Card. During video capture, Raw video and compressed video are saved simultaneously to the SSD and SD Card respectively. @warning The supported resolutions and frame rates for SSD Raw Videos are shown below: <br><br> <b>NTSC:</b><br> Resolution_4096x2160, FrameRate_24fps<br> Resolution_3840x2160, FrameRate_24fps<br> Resolution_3840x2160, FrameRate_30fps<br> Resolution_2704X1520, FrameRate_24fps<br> Resolution_2704X1520, FrameRate_30fps<br> Resolution_1920x1080, FrameRate_60fps<br> Resolution_1920x1080, FrameRate_48fps<br> Resolution_1920x1080, FrameRate_30fps<br> Resolution_1920x1080, FrameRate_24fps<br><br> <br><br> <b>PAL:</b><br> Resolution_4096x2160, FrameRate_25fps<br> Resolution_4096x2160, FrameRate_24fps<br> Resolution_3840x2160, FrameRate_25fps<br> Resolution_3840x2160, FrameRate_24fps<br> Resolution_2704X1520, FrameRate_25fps<br> Resolution_2704X1520, FrameRate_24fps<br> Resolution_1920x1080, FrameRate_50fps<br> Resolution_1920x1080, FrameRate_48fps<br> Resolution_1920x1080, FrameRate_25fps<br> Resolution_1920x1080, FrameRate_24fps<br><br> For X5S, the frame rate of SSD has to be the same as the video to be stored in SD card, so <code>frameRate</code> is ignored. The possible resolutions are determined by SD card video's frame rate and the SSD video license (<code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideolicense">CameraSSDVideoLicense</a></code>) being used. The supported resolutions in the current configuration can be queried by using <code><a href="/Components/Camera/DJICamera_DJICameraParameters.html#djicamera_djicameraparameters_supportedcamerassdvideoresolutionrange">SSDVideoResolutionRange</a></code> in <code><a href="/Components/Camera/DJICamera_DJICameraParameters.html#djicamera_djicameraparameters">Capabilities</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraVideoResolutionAndFrameRate.html#djicamera_djicameravideoresolutionandframerate">ResolutionAndFrameRate</a> <font color="#000">resolutionAndFrameRate</td><td><font color="#666"><i>Resolution and frame rate to be set for the video.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_getssdvideoresolutionandframerate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_getssdvideoresolutionandframerate_inline">getSSDVideoResolutionAndFrameRate</a></div></div><div class="inline-doc" id="djicamera_getssdvideoresolutionandframerate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSSDVideoResolutionAndFrameRate</h6></div>

~~~java
 void getSSDVideoResolutionAndFrameRate(
        @NonNull final CompletionCallbackWith<ResolutionAndFrameRate> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_ssd_video_resolution_and_frame_rate_key">CameraKey.SSD_VIDEO_RESOLUTION_AND_FRAME_RATE</a></td></tr></table></html>



##### Description:



<font color="#666">Get Raw Video Format and Frame Rate of the SSD.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraVideoResolutionAndFrameRate.html#djicamera_djicameravideoresolutionandframerate">ResolutionAndFrameRate</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_setssdvideodigitalfilter"><div class="api-col left">SSD RAW Filter</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_setssdvideodigitalfilter_inline">setSSDLegacyColor</a></div></div><div class="inline-doc" id="djicamera_setssdvideodigitalfilter_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSSDLegacyColor</h6></div>

~~~java
 void setSSDLegacyColor(@NonNull SettingsDefinitions.SSDLegacyColor color,
                                  @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_ssd_legacy_color_key">CameraKey.SSD_LEGACY_COLOR</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the camera color for video that will be stored in SSD. It is only applied when the selected license key is either <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideolicenseprores422hq">LicenseKeyTypeProRes422HQ</a></code> or <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideolicenseprores4444xq">LicenseKeyTypeProRes4444XQ</a></code>. This is the legacy version of SSD Color and it is only supported by Inspire 2 with firmware package versions (<code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct_getfirmwarepackageversion">getFirmwarePackageVersion</a></code>) lower than 01.0.0240. For newer firmware package versions, use <code><a href="/Components/Camera/DJICamera.html#djicamera_setssdcolor">setSSDColor</a></code> instead.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideodigitalfilter">SSDLegacyColor</a> <font color="#000">color</td><td><font color="#666"><i>SSD legacy color to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_getssdvideodigitalfilter"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_getssdvideodigitalfilter_inline">getSSDLegacyColor</a></div></div><div class="inline-doc" id="djicamera_getssdvideodigitalfilter_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSSDLegacyColor</h6></div>

~~~java
 void getSSDLegacyColor(@NonNull final CompletionCallbackWith<SSDLegacyColor> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_ssd_legacy_color_key">CameraKey.SSD_LEGACY_COLOR</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the camera color for video that will store in SSD. This is the legacy version of SSD Color and it is only supported by Inspire 2 with firmware package versions (<code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct_getfirmwarepackageversion">getFirmwarePackageVersion</a></code>) lower than 01.0.0240. For newer firmware package versions, use <code><a href="/Components/Camera/DJICamera.html#djicamera_getssdcolor">getSSDColor</a></code> instead.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideodigitalfilter">SSDLegacyColor</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_setssdcolor"><div class="api-col left">SSD Color</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_setssdcolor_inline">setSSDColor</a></div></div><div class="inline-doc" id="djicamera_setssdcolor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSSDColor</h6></div>

~~~java
 void setSSDColor(final SettingsDefinitions.SSDColor color, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the color for videos that will be stored in SSD. It is only applied when the selected license key is either <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideolicenseprores422hq">LicenseKeyTypeProRes422HQ</a></code> or <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideolicenseprores4444xq">LicenseKeyTypeProRes4444XQ</a></code>. For <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideolicensecinemadng">LicenseKeyTypeCinemaDNG</a></code>, the color is always <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdcolor_rawcolor">RAW_COLOR</a></code>. It is only supported Inspire 2 with the firmware package version (<code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct_getfirmwarepackageversion">getFirmwarePackageVersion</a></code>) 01.0.0240 or later. For older firmware package versions, use <code><a href="/Components/Camera/DJICamera.html#djicamera_setssdvideodigitalfilter">setSSDLegacyColor</a></code> instead.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdcolor">SSDColor</a> <font color="#000">color</td><td><font color="#666"><i>Video color to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_getssdcolor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_getssdcolor_inline">getSSDColor</a></div></div><div class="inline-doc" id="djicamera_getssdcolor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSSDColor</h6></div>

~~~java
 void getSSDColor(@NonNull final CompletionCallbackWith<SettingsDefinitions.SSDColor> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the color for videos that will be stored in SSD. It is only supported Inspire 2 with the firmware package version (<code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct_getfirmwarepackageversion">getFirmwarePackageVersion</a></code>) 01.0.0240 or later. For older firmware package versions, use <code><a href="/Components/Camera/DJICamera.html#djicamera_getssdvideodigitalfilter">getSSDLegacyColor</a></code> instead.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdcolor">SSDColor</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdcolor">SSDColor</a></code> enum value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_getssdvideolicenses"><div class="api-col left">SSD RAW License</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_getssdvideolicenses_inline">getSSDVideoLicenses</a></div></div><div class="inline-doc" id="djicamera_getssdvideolicenses_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSSDVideoLicenses</h6></div>

~~~java
 void getSSDVideoLicenses(@NonNull final CompletionCallbackWith<CameraSSDVideoLicense[]> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_ssd_video_licenses_key">CameraKey.SSD_VIDEO_LICENSES</a></td></tr></table></html>



##### Description:



<font color="#666">Gets purchased license key(s). An Inspire 2 License Key activates the usage permission of CinemaDNG or Apple ProRes inside CineCore 2.0. User can purchase a license key on DJI's website. It is supported by Inspire 2. the digital filter for video that will store in SSD. It is only supported Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideolicense">CameraSSDVideoLicense</a>[]&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_activatessdvideolicense"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_activatessdvideolicense_inline">activateSSDVideoLicense</a></div></div><div class="inline-doc" id="djicamera_activatessdvideolicense_inline"

><div class="article"><h6 ><font color="#AAA">method </font>activateSSDVideoLicense</h6></div>

~~~java
 void activateSSDVideoLicense(@NonNull CameraSSDVideoLicense license,
                                        @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_activate_ssd_video_license_key">CameraKey.ACTIVATE_SSD_VIDEO_LICENSE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the SSD video license to be used. If an unpurchased license is selected then only SD video will be recorded.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideolicense">CameraSSDVideoLicense</a> <font color="#000">license</td><td><font color="#666"><i>License to used.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_getssdvideolicense"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_getssdvideolicense_inline">getSSDVideoLicense</a></div></div><div class="inline-doc" id="djicamera_getssdvideolicense_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSSDVideoLicense</h6></div>

~~~java
 void getSSDVideoLicense(@NonNull final CompletionCallbackWith<CameraSSDVideoLicense> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_activate_ssd_video_license_key">CameraKey.ACTIVATE_SSD_VIDEO_LICENSE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the license key being used. It is supported by Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideolicense">CameraSSDVideoLicense</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Auto Lock Gimbal

<div class="api-row" id="djicamera_setautolockgimbalenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_setautolockgimbalenabled_inline">setAutoLockGimbalEnabled</a></div></div><div class="inline-doc" id="djicamera_setautolockgimbalenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAutoLockGimbalEnabled</h6></div>

~~~java
 void setAutoLockGimbalEnabled(final boolean enabled, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Enables this to lock the gimbal when the camera is shooting a photo. The gimbal will keep the attitude when starting to shoot the photo.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable the feature.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_getautolockgimbalenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_getautolockgimbalenabled_inline">getAutoLockGimbalEnabled</a></div></div><div class="inline-doc" id="djicamera_getautolockgimbalenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAutoLockGimbalEnabled</h6></div>

~~~java
 void getAutoLockGimbalEnabled(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Determines whether the gimbal will be locked automatically during shooting photos.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Watermark Settings

<div class="api-row" id="djicamera_setwatermarksettings"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_setwatermarksettings_inline">setWatermarkSettings</a></div></div><div class="inline-doc" id="djicamera_setwatermarksettings_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setWatermarkSettings</h6></div>

~~~java
 void setWatermarkSettings(WatermarkSettings config, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the watermark configuration. Enables this to add timestamp and location stamp to the newly generated photos or videos. It is only supported by Mavic 2 Enterprise series. For Mavic 2 Enterprise Dual, the watermark is only applied to photos and videos generated by the visual camera.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraWatermarkSettings.html#djicamera_djicamerawatermarksettings">WatermarkSettings</a> <font color="#000">config</td><td><font color="#666"><i>The watermark configuration to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_getwatermarksettings"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_getwatermarksettings_inline">getWatermarkSettings</a></div></div><div class="inline-doc" id="djicamera_getwatermarksettings_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getWatermarkSettings</h6></div>

~~~java
 void getWatermarkSettings(@NonNull final CompletionCallbackWith<WatermarkSettings> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the watermark settings. If it is enabled, timestamp and location stamp will be added to the newly generated photos or videos. It is only supported by Mavic 2 Enterprise series. For Mavic 2 Enterprise Dual, the watermark is only applied to photos and videos generated by the visual camera.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraWatermarkSettings.html#djicamera_djicamerawatermarksettings">WatermarkSettings</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Storage Settings

<div class="api-row" id="djicamera_camerasettings_setfileindexmode"><div class="api-col left">File Index Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setfileindexmode_inline">setFileIndexMode</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setfileindexmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setFileIndexMode</h6></div>

~~~java
 void setFileIndexMode(@NonNull FileIndexMode mode, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_file_index_mode_key">CameraKey.FILE_INDEX_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the camera's file index mode for the SD card. The default value of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerafileindexmode">FileIndexMode</a></code> is set to <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerafileindexmode_reset">RESET</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerafileindexmode">FileIndexMode</a> <font color="#000">mode</td><td><font color="#666"><i>File index mode to be set for the camera's SD card. The default value of CameraFileIndexMode is set to Reset.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getfileindexmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getfileindexmode_inline">getFileIndexMode</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getfileindexmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFileIndexMode</h6></div>

~~~java
 void getFileIndexMode(@NonNull final CompletionCallbackWith<FileIndexMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the camera's file index mode.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerafileindexmode">FileIndexMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_sdcardoperations_formatsdcard"><div class="api-col left">SD Card</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_sdcardoperations_formatsdcard_inline">formatSDCard</a></div></div><div class="inline-doc" id="djicamera_sdcardoperations_formatsdcard_inline"

><div class="article"><h6 ><font color="#AAA">method </font>formatSDCard</h6></div>

~~~java
 void formatSDCard(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_format_sd_card_key">CameraKey.FORMAT_SD_CARD</a></td></tr></table></html>



##### Description:



<font color="#666">Formats the SD card by deleting all the data on the SD card. This does not change any settings the user may have set on the SD card.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_sdcardoperations_formatstorage"><div class="api-col left">Storage</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_sdcardoperations_formatstorage_inline">formatStorage</a></div></div><div class="inline-doc" id="djicamera_sdcardoperations_formatstorage_inline"

><div class="article"><h6 ><font color="#AAA">method </font>formatStorage</h6></div>

~~~java
 void formatStorage(@NonNull SettingsDefinitions.StorageLocation storage, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Formats the storage by deleting all the data on it. It is supported by Mavic 2 series, Mavic 2 enterprise series, Mavic air and Matrice 200 V2 series.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerastoragelocation">StorageLocation</a> <font color="#000">storage</td><td><font color="#666"><i>The storage (either SD card or the internal storage) to format. When it is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerastoragelocation_sdcard">SDCARD</a></code>, this interface has the same effect as <code><a href="/Components/Camera/DJICamera.html#djicamera_sdcardoperations_formatsdcard">formatSDCard</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_isssdsupported"><div class="api-col left">SSD</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_isssdsupported_inline">isSSDSupported</a></div></div><div class="inline-doc" id="djicamera_isssdsupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isSSDSupported</h6></div>

~~~java
 boolean isSSDSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_is_ssd_supported_key">CameraKey.IS_SSD_SUPPORTED</a></td></tr></table></html>



##### Description:



<font color="#666">Determines whether the SSD is supported by the camera. Currently, the SSD is supported only by X5R, X4S and X5S camera. @return <code>true</code> if SSD is supported, otherwise <code>false</code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_formatssd"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_formatssd_inline">formatSSD</a></div></div><div class="inline-doc" id="djicamera_formatssd_inline"

><div class="article"><h6 ><font color="#AAA">method </font>formatSSD</h6></div>

~~~java
 void formatSSD(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_format_ssd_key">CameraKey.FORMAT_SSD</a></td></tr></table></html>



##### Description:



<font color="#666">Formats the SSD by deleting all the data on the SSD. This does not change any settings the user may have set on the SSD.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Laser Sensor

<div class="api-row" id="djicamera_camerasettings_setlaserenabled"><div class="api-col left">Enable Laser</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setlaserenabled_inline">setLaserEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setlaserenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setLaserEnabled</h6></div>

~~~java
 void setLaserEnabled(boolean enabled, @Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the laser enabled. Laser sensor turns on ranging function. Set <code>true</code> to enable the laser distance sensor with  measuring ranges to natural object. The laser sensor must be at least 3m from the target point. It is only supported  for Zenmuse H20 series.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable video caption.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getlaserenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getlaserenabled_inline">getLaserEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getlaserenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLaserEnabled</h6></div>

~~~java
 void getLaserEnabled(@NonNull final CommonCallbacks.CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets whether the laser is enabled. The laser sensor must be at least 3m from the target point. It is only supported for Zenmuse H20 series.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Misc Settings

<div class="api-row" id="djicamera_camerasettings_setantiflicker"><div class="api-col left">Anti-Flicker</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setantiflicker_inline">setAntiFlickerFrequency</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setantiflicker_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAntiFlickerFrequency</h6></div>

~~~java
 void setAntiFlickerFrequency(@NonNull AntiFlickerFrequency antiFlickerFrequency,
                                        @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_anti_flicker_frequency_key">CameraKey.ANTI_FLICKER_FREQUENCY</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the camera's anti-flicker frequency for video recording. Precondition: The exposure mode must be Program. Note: for the Z30 camera, changing anti-flicker will reboot the camera before the setting takes effect. It is not supported by Zenmuse H20 and Zenmuse H20T.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraantiflicker">AntiFlickerFrequency</a> <font color="#000">antiFlickerFrequency</td><td><font color="#666"><i>Anti-flicker value to set for the camera. See <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraantiflicker">AntiFlickerFrequency</a></code> to view all the possible anti-flicker type settings for the camera.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getantiflicker"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getantiflicker_inline">getAntiFlickerFrequency</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getantiflicker_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAntiFlickerFrequency</h6></div>

~~~java
 void getAntiFlickerFrequency(@NonNull final CompletionCallbackWith<AntiFlickerFrequency> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_anti_flicker_frequency_key">CameraKey.ANTI_FLICKER_FREQUENCY</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the camera's anti-flicker. It is not supported by Zenmuse H20 and Zenmuse H20T.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraantiflicker">AntiFlickerFrequency</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setsharpness"><div class="api-col left">Sharpness</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setsharpness_inline">setSharpness</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setsharpness_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSharpness</h6></div>

~~~java
 void setSharpness(@IntRange(from = -3, to = 3) int sharpness, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_sharpness_key">CameraKey.SHARPNESS</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the camera's sharpness. The default value is 0. For  Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = -3, to = 3) int <font color="#000">sharpness</td><td><font color="#666"><i>Sharpness value to be set in the range of [-3, 3].</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Asynchronous execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getsharpness"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getsharpness_inline">getSharpness</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getsharpness_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSharpness</h6></div>

~~~java
 void getSharpness(@NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_sharpness_key">CameraKey.SHARPNESS</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the camera's sharpness. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value of sharpness with range [-3, 3].</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setcontrast"><div class="api-col left">Contrast</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setcontrast_inline">setContrast</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setcontrast_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setContrast</h6></div>

~~~java
 void setContrast(@IntRange(from = -3, to = 3) int contrast, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_contrast_key">CameraKey.CONTRAST</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the camera's contrast. The default saturation value is 0. For Zenmuse H20 and Zenmuse H20T,  please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = -3, to = 3) int <font color="#000">contrast</td><td><font color="#666"><i>Contrast value to be set in the range of [-3, 3].</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getcontrast"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getcontrast_inline">getContrast</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getcontrast_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getContrast</h6></div>

~~~java
 void getContrast(@NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_contrast_key">CameraKey.CONTRAST</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the camera's contrast. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value of contrast with range [-3, 3].</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setdefogenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setdefogenabled_inline">setDefogEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setdefogenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setDefogEnabled</h6></div>

~~~java
 void setDefogEnabled(boolean enabled, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_defog_enabled_key">CameraKey.DEFOG_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Enable/disable defog feature. When defog feature is enabled, the contrast will be enhanced extraordinarily. It is only supported Z30.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable defog feature.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getdefogenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getdefogenabled_inline">getDefogEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getdefogenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDefogEnabled</h6></div>

~~~java
 void getDefogEnabled(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_defog_enabled_key">CameraKey.DEFOG_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Determines whether defog feature is enabled. It is only supported by Z30 camera.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setirfilterenabled"><div class="api-col left">IR Filter</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setirfilterenabled_inline">setIRFilterEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setirfilterenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setIRFilterEnabled</h6></div>

~~~java
 void setIRFilterEnabled(final boolean enabled, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Enables/disables the IR filter (infared filter). Disabling the IR filter can enhance the image in low light environments. Enabling the IR filter can reduce the color distortion caused by the infared light. It is only supported by Z30 camera. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable IR-Cut filter.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback that receives the setter result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getirfilterenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getirfilterenabled_inline">getIRFilterEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getirfilterenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getIRFilterEnabled</h6></div>

~~~java
 void getIRFilterEnabled(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Determines whether IR filter (infared filter) is enabled. Disabling the IR filter can enhance the image in low light environments. Enabling the IR filter can reduce the color distortion caused by the infared light. It is only supported by Z30 camera. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setsaturation"><div class="api-col left">Saturation</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setsaturation_inline">setSaturation</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setsaturation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSaturation</h6></div>

~~~java
 void setSaturation(@IntRange(from = -3, to = 3) int saturation,
                              @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_saturation_key">CameraKey.SATURATION</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the camera's saturation. The default saturation value is 0. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = -3, to = 3) int <font color="#000">saturation</td><td><font color="#666"><i>Saturation value to be set in the range of [-3, 3]. The default value of the saturation value is 0.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getsaturation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getsaturation_inline">getSaturation</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getsaturation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSaturation</h6></div>

~~~java
 void getSaturation(@NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_saturation_key">CameraKey.SATURATION</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the camera's saturation. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setdigitalfilter"><div class="api-col left">Digital Filter</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setdigitalfilter_inline">setColor</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setdigitalfilter_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setColor</h6></div>

~~~java
 void setColor(@NonNull CameraColor color, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_camera_color_key">CameraKey.CAMERA_COLOR</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the camera's color. The default value is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameradigitalfilter_none">NONE</a></code>. For a list of all possible camera colors, see <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameradigitalfilter">CameraColor</a></code>. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameradigitalfilter">CameraColor</a> <font color="#000">color</td><td><font color="#666"><i>Camera color to be applied to the camera.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getdigitalfilter"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getdigitalfilter_inline">getColor</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getdigitalfilter_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getColor</h6></div>

~~~java
 void getColor(@NonNull final CompletionCallbackWith<SettingsDefinitions.CameraColor> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_camera_color_key">CameraKey.CAMERA_COLOR</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the camera's color. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameradigitalfilter">CameraColor</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setorientation"><div class="api-col left">Camera Orientation</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setorientation_inline">setOrientation</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setorientation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setOrientation</h6></div>

~~~java
 void setOrientation(@NonNull Orientation orientation, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_orientation_key">CameraKey.ORIENTATION</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the camera's orientation. The gimbal will rotate the roll axis based on the orientation. Supported only by Mavic Pro.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraorientation">Orientation</a> <font color="#000">orientation</td><td><font color="#666"><i>Camera's orientation.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getorientation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getorientation_inline">getOrientation</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getorientation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getOrientation</h6></div>

~~~java
 void getOrientation(@NonNull final CompletionCallbackWith<Orientation> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_orientation_key">CameraKey.ORIENTATION</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the camera's orientation. Supported only by Mavic Pro.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraorientation">Orientation</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setvisionstablizationenabled"><div class="api-col left">Vision Stabilization</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setvisionstablizationenabled_inline">setVisionStabilizationEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setvisionstablizationenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setVisionStabilizationEnabled</h6></div>

~~~java
 void setVisionStabilizationEnabled(final boolean enable, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_vision_stabilization_enabled_key">CameraKey.VISION_STABILIZATION_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Enables vision stabilization for Z30 camera on M200 series. The vision system in the M200 series of aircraft can be used to compensate for any drift in the gimbal by analyzing the live view when there is no gimbal movement. Drift in the gimbal will be most noticeable at higher zoom factors. It is only supported Z30 on M200 series.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final boolean <font color="#000">enable</td><td><font color="#666"><i><code>true</code> to enable the vision stabilization.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i><code>completion callback</code> to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getvisionstablizationenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getvisionstablizationenabled_inline">getVisionStabilizationEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getvisionstablizationenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getVisionStabilizationEnabled</h6></div>

~~~java
 void getVisionStabilizationEnabled(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_vision_stabilization_enabled_key">CameraKey.VISION_STABILIZATION_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Determines whether vision stabilization is enabled. It is only supported Z30 on M200 series.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i><code>completion callback</code> to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setmediafilecustominformation"><div class="api-col left">Media File Custom Info</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setmediafilecustominformation_inline">setMediaFileCustomInformation</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setmediafilecustominformation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMediaFileCustomInformation</h6></div>

~~~java
 void setMediaFileCustomInformation(@NonNull String information, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_custom_information_key">CameraKey.CUSTOM_INFORMATION</a></td></tr></table></html>



##### Description:



<font color="#666">Custom information can be stored in media file's XMP meta data. The custom information is written to the media file automatically after the media file is created. This method defines the information to write. The same information will be written to all media files until the information is changed again by this method. Custom information written to each file can be retrieved through <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_fetchcustominformation">fetchCustomInformation</a></code> or from the image itself when processed on a separate system. It is only supported Phantom 4 Pro, Phantom 4 Advanced, Phantom 4 Pro V2.0, Zenmuse X4S, Zenmuse X5S, Zenmuse X7, Mavic 2 Enterprise camera and Mavic 2 Enterprise Dual camera.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull String <font color="#000">information</td><td><font color="#666"><i>Custom information to set. Use UTF-8 encoding with a length equal to or less than 31 characters.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getmediafilecustominformation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getmediafilecustominformation_inline">getMediaFileCustomInformation</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getmediafilecustominformation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMediaFileCustomInformation</h6></div>

~~~java
 void getMediaFileCustomInformation(@NonNull final CompletionCallbackWith<String> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_custom_information_key">CameraKey.CUSTOM_INFORMATION</a></td></tr></table></html>



##### Description:



<font color="#666">Custom information can be stored in media file's XMP meta data. This method retrieves the information that will be written to future media files. The information written to individual files can be retrieved through <code><a href="/Components/Camera/DJIMediaManager_DJIMedia.html#djimediamanager_djimedia_fetchcustominformation">fetchCustomInformation</a></code>. It is only supported Phantom 4 Pro, Phantom 4 Advanced, Phantom 4 Pro V2.0, Zenmuse X4S, Zenmuse X5S, Zenmuse X7, Mavic 2 Enterprise camera and Mavic 2 Enterprise Dual camera.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setvideodewarpingenabled"><div class="api-col left">Video Dewarping Enabled</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setvideodewarpingenabled_inline">setDewarpingEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setvideodewarpingenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setDewarpingEnabled</h6></div>

~~~java
 void setDewarpingEnabled(final boolean enabled, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Enables/disables dewarping (lens distortion correction) for video recorded to SD card. Supported by Phantom 4 Pro camera, X4S, X5S and X7.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable video dewarping.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getvideodewarpingenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getvideodewarpingenabled_inline">getDewarpingEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getvideodewarpingenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDewarpingEnabled</h6></div>

~~~java
 void getDewarpingEnabled(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Determines whether dewarping (lens distortion correction) is enabled. Supported by Phantom 4 Pro camera, X4S, X5S and X7.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned Boolean value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_initsensorcleaningmode"><div class="api-col left">Sensor Cleaning Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_initsensorcleaningmode_inline">initSensorCleaningMode</a></div></div><div class="inline-doc" id="djicamera_camerasettings_initsensorcleaningmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>initSensorCleaningMode</h6></div>

~~~java
 void initSensorCleaningMode(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Initiates the sensor cleaning mode. Calling this will change <code><a href="/Components/Camera/DJICamera_DJICameraLensState.html#djicamera_djicameralensstate_sensorcleaningstate">getSensorCleaningState</a></code> from <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasensorcleaningstate_idle">IDLE</a></code> to <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasensorcleaningstate_initiating">INITIATING</a></code>. To start the sensor dedusting operation, the workflow should be: <br> 1. Call <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_initsensorcleaningmode">initSensorCleaningMode</a></code>. <br> 2. Remove the lens from the camera. <br> 3. Call <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_startsensorcleaning">startSensorCleaning</a></code>. <br> 4. When <code><a href="/Components/Camera/DJICamera_DJICameraLensState.html#djicamera_djicameralensstate_sensorcleaningstate">getSensorCleaningState</a></code> becomes <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasensorcleaningstate_waitingforlensremount">WAITING_FOR_LENS_REMOUNT</a></code>, mount the lens back to the camera. <br><br> It is only supported Zenmuse X7.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_startsensorcleaning"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_startsensorcleaning_inline">startSensorCleaning</a></div></div><div class="inline-doc" id="djicamera_camerasettings_startsensorcleaning_inline"

><div class="article"><h6 ><font color="#AAA">method </font>startSensorCleaning</h6></div>

~~~java
 void startSensorCleaning(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Starts cleaning the sensor. The sensor cleaning should only be started when the lens is removed from the camera. It is only supported Zenmuse X7.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_exitsensorcleaningmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_exitsensorcleaningmode_inline">exitSensorCleaningMode</a></div></div><div class="inline-doc" id="djicamera_camerasettings_exitsensorcleaningmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>exitSensorCleaningMode</h6></div>

~~~java
 void exitSensorCleaningMode(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Exits sensor cleaning mode. Calling this will stop the current executing operation and change <code><a href="/Components/Camera/DJICamera_DJICameraLensState.html#djicamera_djicameralensstate_sensorcleaningstate">getSensorCleaningState</a></code> to <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasensorcleaningstate_idle">IDLE</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_iseimodesupported"><div class="api-col left">EI Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_iseimodesupported_inline">isEIModeSupported</a></div></div><div class="inline-doc" id="djicamera_camerasettings_iseimodesupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isEIModeSupported</h6></div>

~~~java
 boolean isEIModeSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Determines whether the EI (exposure index) mode is supported by the camera. In this mode, the camera mimics the way a film camera works to help cinematographers capture as much information as possible while balancing the dynamic range and noise with different log curves. This mode only takes effect when the camera mode is in <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode_djicameramoderecordvideo">RECORD_VIDEO</a></code>. The EI mode is supported by X4S, X5S and X7. In multiple lenses camera,  if one of its lenses supports this feature, the camera and the lens that can supports both return <code>true</code>.   User can only access the parameters through the lens object.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the EI mode is supported, otherwise <code>false</code>.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setexposuresensitivitymode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setexposuresensitivitymode_inline">setExposureSensitivityMode</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setexposuresensitivitymode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setExposureSensitivityMode</h6></div>

~~~java
 void setExposureSensitivityMode(final SettingsDefinitions.ExposureSensitivityMode mode, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the exposure sensitivity mode. It is only supported when <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_iseimodesupported">isEIModeSupported</a></code> returns <code>true</code>. It is supported by X4S, X5S and X7. For other cameras, only ISO mode is supported.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuresensitivitymode">ExposureSensitivityMode</a> <font color="#000">mode</td><td><font color="#666"><i>The exposure sensitivity mode to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getexposuresensitivitymode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getexposuresensitivitymode_inline">getExposureSensitivityMode</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getexposuresensitivitymode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getExposureSensitivityMode</h6></div>

~~~java
 void getExposureSensitivityMode(@NonNull final CompletionCallbackWith<SettingsDefinitions.ExposureSensitivityMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the exposure sensitivity mode. It is only supported when <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_iseimodesupported">isEIModeSupported</a></code> returns <code>true</code>. It is supported by X4S, X5S and X7. For other cameras, only ISO mode is supported.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuresensitivitymode">ExposureSensitivityMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuresensitivitymode">ExposureSensitivityMode</a></code> enum value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setei"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setei_inline">setEI</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setei_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setEI</h6></div>

~~~java
 void setEI(final int ei, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets EI value. The valid range can be fetched from <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_geteirange">getEIRange</a></code>. It is only valid when exposure sensitivity mode is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuresensitivitymode_ei">EI</a></code>. It is only supported by X4S, X5S and X7.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final int <font color="#000">ei</td><td><font color="#666"><i>The EI value to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getei"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getei_inline">getEI</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getei_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getEI</h6></div>

~~~java
 void getEI(@NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets EI value. It is only valid when exposure sensitivity mode is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuresensitivitymode_ei">EI</a></code>. It is only supported by X4S, X5S and X7.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned integer value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getrecommendedei"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getrecommendedei_inline">getRecommendedEI</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getrecommendedei_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getRecommendedEI</h6></div>

~~~java
 void getRecommendedEI(@NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the EI value recommended by the camera. It is only valid when exposure sensitivity mode is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuresensitivitymode_ei">EI</a></code>. It is only supported by X4S, X5S and X7.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned Integer value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_geteirange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_geteirange_inline">getEIRange</a></div></div><div class="inline-doc" id="djicamera_camerasettings_geteirange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getEIRange</h6></div>

~~~java
 void getEIRange(@NonNull final CompletionCallbackWith<int[]> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the valid range of EI values. It is only valid when exposure sensitivity mode is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuresensitivitymode_ei">EI</a></code>. It is only supported by X4S, X5S and X7.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;int[]&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned int value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_seteicolor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_seteicolor_inline">setEIColor</a></div></div><div class="inline-doc" id="djicamera_camerasettings_seteicolor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setEIColor</h6></div>

~~~java
 void setEIColor(final SettingsDefinitions.EIColor color, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the camera color for EI mode. It is only valid when exposure sensitivity mode is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuresensitivitymode_ei">EI</a></code>. It is only supported by X4S, X5S and X7.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraeicolor">EIColor</a> <font color="#000">color</td><td><font color="#666"><i>The camera color to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_geteicolor"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_geteicolor_inline">getEIColor</a></div></div><div class="inline-doc" id="djicamera_camerasettings_geteicolor_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getEIColor</h6></div>

~~~java
 void getEIColor(@NonNull final CompletionCallbackWith<SettingsDefinitions.EIColor> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the camera color for EI mode. It is only valid when exposure sensitivity mode is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuresensitivitymode_ei">EI</a></code>. It is only supported by X4S, X5S and X7.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraeicolor">EIColor</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraeicolor">EIColor</a></code> enum value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_ismechanicalshuttersupported"><div class="api-col left">Mechanical Shutter Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_ismechanicalshuttersupported_inline">isMechanicalShutterSupported</a></div></div><div class="inline-doc" id="djicamera_camerasettings_ismechanicalshuttersupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isMechanicalShutterSupported</h6></div>

~~~java
 boolean isMechanicalShutterSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Determines whether the mechanical shutter speed is supported by the camera or the lens (for X7). The mechanical shutter is supported by Phantom 4 Pro camera, X4S and X7 with DL lenses. In multiple  lenses camera, if one of its lenses supports this feature, the camera and the lens that can supports  both return <code>true</code>. User can only access the parameters through the lens object.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the mechanical shutter is supported, otherwise <code>false</code>.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setmechanicalshutterenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setmechanicalshutterenabled_inline">setMechanicalShutterEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setmechanicalshutterenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMechanicalShutterEnabled</h6></div>

~~~java
 void setMechanicalShutterEnabled(final boolean enabled, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Enables the mechanical shutter. It is only valid when <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_ismechanicalshuttersupported">isMechanicalShutterSupported</a></code> returns <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> to enable the mechanical shutter.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getmechanicalshutterenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getmechanicalshutterenabled_inline">getMechanicalShutterEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getmechanicalshutterenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMechanicalShutterEnabled</h6></div>

~~~java
 void getMechanicalShutterEnabled(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Determines whether the mechanical shutter is enabled. It is only valid when <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_ismechanicalshuttersupported">isMechanicalShutterSupported</a></code> returns <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_isndfiltermodesupported"><div class="api-col left">ND Filter Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_isndfiltermodesupported_inline">isNDFilterModeSupported</a></div></div><div class="inline-doc" id="djicamera_camerasettings_isndfiltermodesupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isNDFilterModeSupported</h6></div>

~~~java
 boolean isNDFilterModeSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Determines whether the ND filter mode is supported by the camera and the lens. Only the DL-S 16mm F2.8 ND ASPH lens for X7 has a built-in ND4 filter and supports changing the modes through an application. In multiple lenses camera, if one of its lenses supports this feature, the camera and  the lens that can supports both return <code>true</code>. User can only access the parameters through the lens object.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the ND filter mode is supported, otherwise <code>false</code>.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setndfiltermode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setndfiltermode_inline">setNDFilterMode</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setndfiltermode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setNDFilterMode</h6></div>

~~~java
 void setNDFilterMode(final SettingsDefinitions.NDFilterMode mode, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the mode of ND filter. It is only valid when <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_isndfiltermodesupported">isNDFilterModeSupported</a></code> returns <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerandfiltermode">NDFilterMode</a> <font color="#000">mode</td><td><font color="#666"><i>The ND filter mode to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getndfiltermode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getndfiltermode_inline">getNDFilterMode</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getndfiltermode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getNDFilterMode</h6></div>

~~~java
 void getNDFilterMode(@NonNull final CompletionCallbackWith<SettingsDefinitions.NDFilterMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the ND filter mode. It is only valid when <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_isndfiltermodesupported">isNDFilterModeSupported</a></code> returns <code>true</code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerandfiltermode">NDFilterMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerandfiltermode">NDFilterMode</a></code> enum value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setssdclipfilename"><div class="api-col left">Clip File Name</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setssdclipfilename_inline">setSSDClipFileName</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setssdclipfilename_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setSSDClipFileName</h6></div>

~~~java
 void setSSDClipFileName(final SettingsDefinitions.SSDClipFileName name, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the clip name for the video to be stored in SSD. The clip name will be applied to the next video file stored in SSD. After saving a video file, <code><a href="/Components/Camera/DJICamera_DJICameraSSDClipFileNameInterface.html#djicamera_djicamerassdclipfilenameinterface_clipid">getClipID</a></code> will increase by 1 automatically.  It is only supported by Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSSDClipFileNameInterface.html#djicamera_djicamerassdclipfilenameinterface">SSDClipFileName</a> <font color="#000">name</td><td><font color="#666"><i>The clip name to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getssdclipfilename"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getssdclipfilename_inline">getSSDClipFileName</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getssdclipfilename_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSSDClipFileName</h6></div>

~~~java
 void getSSDClipFileName(@NonNull final CompletionCallbackWith<SettingsDefinitions.SSDClipFileName> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the clip name for video to be stored in SSD. It is only supported by Inspire 2.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSSDClipFileNameInterface.html#djicamera_djicamerassdclipfilenameinterface">SSDClipFileName</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned <code><a href="/Components/Camera/DJICamera_DJICameraSSDClipFileNameInterface.html#djicamera_djicamerassdclipfilenameinterface">SSDClipFileName</a></code> class.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_isphotoquickviewsupported"><div class="api-col left">Quick View</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_isphotoquickviewsupported_inline">isPhotoQuickViewSupported</a></div></div><div class="inline-doc" id="djicamera_camerasettings_isphotoquickviewsupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isPhotoQuickViewSupported</h6></div>

~~~java
 boolean isPhotoQuickViewSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_is_photo_quick_view_supported_key">CameraKey.IS_PHOTO_QUICK_VIEW_SUPPORTED</a></td></tr></table></html>



##### Description:



<font color="#666">Determines whether the device supports the quick view. Quick view is the period of time a photo is shown as a preview after it is taken and before the camera returns to the live camera view. In multiple lenses camera, if one of its lenses supports this feature, the camera and the lens  that can supports both return <code>true</code>. User can only access the parameters through the lens object.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setphotoquickviewduration"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setphotoquickviewduration_inline">setPhotoQuickViewDuration</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setphotoquickviewduration_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPhotoQuickViewDuration</h6></div>

~~~java
 void setPhotoQuickViewDuration(@IntRange(from = 0, to = 10) int duration,
                                          @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_quick_view_duration_key">CameraKey.PHOTO_QUICK_VIEW_DURATION</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the camera's quick view duration. The valid range is [0, 10] seconds. When duration is 0, it means that the quick view is disabled. The default value is 0 second. Call <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_isphotoquickviewsupported">isPhotoQuickViewSupported</a></code> before using this method.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 10) int <font color="#000">duration</td><td><font color="#666"><i>Quick view duration to be set for the camera. This value defines the amount of time a photo is shown as a preview after it is taken before the camera returns back to the live camera view. This value must be set in the range of [0, 10] seconds. When the value is 0, quick view is disabled. The default value is 0 second.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getphotoquickviewduration"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getphotoquickviewduration_inline">getPhotoQuickViewDuration</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getphotoquickviewduration_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPhotoQuickViewDuration</h6></div>

~~~java
 void getPhotoQuickViewDuration(@NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_quick_view_duration_key">CameraKey.PHOTO_QUICK_VIEW_DURATION</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the camera's quick view duration.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_sethighdefinitionliveviewenabled"><div class="api-col left">HD Live View</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_sethighdefinitionliveviewenabled_inline">setHDLiveViewEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_sethighdefinitionliveviewenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setHDLiveViewEnabled</h6></div>

~~~java
 void setHDLiveViewEnabled(boolean enabled, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_hd_live_view_enabled_key">CameraKey.HD_LIVE_VIEW_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Enables HD (high-definition) live view. When it is enabled, the live view resolution is 1080p with frame rate 30 fps. The settings will only take effect when the camera is in record-video mode and the video resolution is either 1080p or 2.7k without slow-motion enabled. If recording video in 4k, then the live stream will be limited to 720p. Supported by Mavic Pro, Mavic 2 Pro, Mavic 2 Zoom and Phantom 4 Pro v2.0.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i>Enable or disable HD live view.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_gethighdefinitionliveviewenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_gethighdefinitionliveviewenabled_inline">getHDLiveViewEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_gethighdefinitionliveviewenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getHDLiveViewEnabled</h6></div>

~~~java
 void getHDLiveViewEnabled(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_hd_live_view_enabled_key">CameraKey.HD_LIVE_VIEW_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if 1080p live view is enabled. This will return the value of the setter, and not necessarily the actual live view resolution. For example, if recording in 4K and HD live view has previously been set, then this will return <code>true</code> but the actual live view resolution will be 720p. Supported only by Mavic Pro, Mavic 2 Pro, Mavic 2 Zoom and Phantom 4 Pro V2.0.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setautoturnoffledenabled"><div class="api-col left">LED</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setautoturnoffledenabled_inline">setLEDAutoTurnOffEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setautoturnoffledenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setLEDAutoTurnOffEnabled</h6></div>

~~~java
 void setLEDAutoTurnOffEnabled(boolean enabled, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_led_auto_turn_off_enabled_key">CameraKey.LED_AUTO_TURN_OFF_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Enables the automatic control of the front-arm LEDs. The camera can turn off the front-arm LEDs automatically when it shoots photos or records videos. The LEDs will be turned on after the shooting or recording is finished. Supported only by Mavic Pro, Mavic Air, and Mavic 2 series.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i>Enable the automatic control of the front-arm LEDs.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getautoturnoffledenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getautoturnoffledenabled_inline">getLEDAutoTurnOffEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getautoturnoffledenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getLEDAutoTurnOffEnabled</h6></div>

~~~java
 void getLEDAutoTurnOffEnabled(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_led_auto_turn_off_enabled_key">CameraKey.LED_AUTO_TURN_OFF_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Determines whether the automatic control of the front-arm LEDs is Enabled. Supported only by Mavic Pro, Mavic Air, and Mavic 2 series.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setbeaconautoturnoffenabled"><div class="api-col left">Beacon</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setbeaconautoturnoffenabled_inline">setBeaconAutoTurnOffEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setbeaconautoturnoffenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setBeaconAutoTurnOffEnabled</h6></div>

~~~java
 void setBeaconAutoTurnOffEnabled(boolean enabled, @NonNull final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Enables the automatic control of the beacon. The camera can turn off the beacon automatically when  it shoots photos or records videos. The LEDs will be turned on after the shooting or recording is  finished. Only Supported by Matrice 200 series V2 and Zenmuse H20/H20T mounted on Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i>Enable the automatic control of the beacon.</i></td></tr><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getbeaconautoturnoffenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getbeaconautoturnoffenabled_inline">getBeaconAutoTurnOffEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getbeaconautoturnoffenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getBeaconAutoTurnOffEnabled</h6></div>

~~~java
 void getBeaconAutoTurnOffEnabled(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Determines whether the automatic control of the beacon is Enabled. Only Supported by M200  series v2 and Zenmuse H20/H20T mounted on Matrice 300 RTK.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Storage Location

<div class="api-row" id="djicamera_camerasettings_isinternalstoragesupported"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_isinternalstoragesupported_inline">isInternalStorageSupported</a></div></div><div class="inline-doc" id="djicamera_camerasettings_isinternalstoragesupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isInternalStorageSupported</h6></div>

~~~java
 boolean isInternalStorageSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Determines if the camera supports the internal storage or not. When it is supported, the camera shoot photos or record videos without SD card. The newly generated photos or videos will be stored in the internal storage.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if internal storage is supported.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setstoragelocation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setstoragelocation_inline">setStorageLocation</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setstoragelocation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setStorageLocation</h6></div>

~~~java
 void setStorageLocation(@NonNull SettingsDefinitions.StorageLocation location,
                                   @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the storage location for the newly generated photos or videos. It is only supported when <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_isinternalstoragesupported">isInternalStorageSupported</a></code> returns <code>true</code>. Not supported by Mavic Mini.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerastoragelocation">StorageLocation</a> <font color="#000">location</td><td><font color="#666"><i>The storage location to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getstoragelocation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getstoragelocation_inline">getStorageLocation</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getstoragelocation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getStorageLocation</h6></div>

~~~java
 void getStorageLocation(@NonNull final CompletionCallbackWith<SettingsDefinitions.StorageLocation> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the storage location for the newly generated photos or videos. When <code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_isinternalstoragesupported">isInternalStorageSupported</a></code> returns <code>false</code>, this setting is always <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerastoragelocation_sdcard">SDCARD</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerastoragelocation">StorageLocation</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Audio Settings

<div class="api-row" id="djicamera_camerasettings_isaudiorecordsupported"><div class="api-col left">Recording</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_isaudiorecordsupported_inline">isAudioRecordingSupported</a></div></div><div class="inline-doc" id="djicamera_camerasettings_isaudiorecordsupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isAudioRecordingSupported</h6></div>

~~~java
 boolean isAudioRecordingSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_is_audio_recording_supported_key">CameraKey.IS_AUDIO_RECORDING_SUPPORTED</a></td></tr></table></html>



##### Description:



<font color="#666">Determines whether the current device supports audio recording. Currently audio recording is supported only by the Osmo camera.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>The boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setaudiorecordenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setaudiorecordenabled_inline">setAudioRecordingEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setaudiorecordenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAudioRecordingEnabled</h6></div>

~~~java
 void setAudioRecordingEnabled(boolean enabled, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_audio_recording_enabled_key">CameraKey.AUDIO_RECORDING_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Enables audio recording when capturing video. Supported only by Osmo camera.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i>Enable or disable audio recording.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getaudiorecordenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getaudiorecordenabled_inline">getAudioRecordingEnabled</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getaudiorecordenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAudioRecordingEnabled</h6></div>

~~~java
 void getAudioRecordingEnabled(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_audio_recording_enabled_key">CameraKey.AUDIO_RECORDING_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Determines whether the audio record is enabled.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setaudiogain"><div class="api-col left">Microphone Gain</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setaudiogain_inline">setAudioGain</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setaudiogain_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setAudioGain</h6></div>

~~~java
 void setAudioGain(@IntRange(from = 0, to = 100) int value, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_audio_gain_key">CameraKey.AUDIO_GAIN</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the microphone recording gain.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 100) int <font color="#000">value</td><td><font color="#666"><i>Recording gain with range [0, 100].</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getaudiogain"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getaudiogain_inline">getAudioGain</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getaudiogain_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getAudioGain</h6></div>

~~~java
 void getAudioGain(@NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_audio_gain_key">CameraKey.AUDIO_GAIN</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the microphone recording gain.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setturnofffanwhenpossible"><div class="api-col left">Fan</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setturnofffanwhenpossible_inline">setTurnOffFanWhenPossible</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setturnofffanwhenpossible_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setTurnOffFanWhenPossible</h6></div>

~~~java
 void setTurnOffFanWhenPossible(boolean turnOffWhenPossible, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_turn_off_fan_when_possible_key">CameraKey.TURN_OFF_FAN_WHEN_POSSIBLE</a></td></tr></table></html>



##### Description:



<font color="#666">This method will turn off the camera's cooling fan whenever the camera is cool enough to do so. This allows better audio recording from the internal microphone in the camera.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">turnOffWhenPossible</td><td><font color="#666"><i><code>true</code> to turn fan off whenever possible.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getturnofffanwhenpossible"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getturnofffanwhenpossible_inline">getTurnOffFanWhenPossible</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getturnofffanwhenpossible_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getTurnOffFanWhenPossible</h6></div>

~~~java
 void getTurnOffFanWhenPossible(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_turn_off_fan_when_possible_key">CameraKey.TURN_OFF_FAN_WHEN_POSSIBLE</a></td></tr></table></html>



##### Description:



<font color="#666">Determines whether the fan will turn off whenever it is cool enough to do so to enable better audio recordings from the camera's internal microphone.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Thermal

<div class="api-row" id="djicamera_thermalcamera_isthermalimagingcamera"><div class="api-col left">Check</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_isthermalimagingcamera_inline">isThermalCamera</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_isthermalimagingcamera_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isThermalCamera</h6></div>

~~~java
 boolean isThermalCamera() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_is_thermal_camera_key">CameraKey.IS_THERMAL_CAMERA</a></td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the current connected device is a thermal imaging camera. @return BOOL <code>true</code> if current connected device is thermal imaging camera. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalroi"><div class="api-col left">Region of Interest (ROI)</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalroi_inline">setThermalROI</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalroi_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalROI</h6></div>

~~~java
 void setThermalROI(@NonNull ThermalROI roi, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_roi_key">CameraKey.THERMAL_ROI</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the Region of Interest (ROI). Used to manage color range distribution across the screen to maximize contrast for regions of highest interest. Supported only by thermal imaging cameras. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalroi">ThermalROI</a> <font color="#000">roi</td><td><font color="#666"><i>An enum type of the Region of Interest to be used. Please refer to <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalroi">ThermalROI</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getthermalroi"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getthermalroi_inline">getThermalROI</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getthermalroi_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getThermalROI</h6></div>

~~~java
 void getThermalROI(@NonNull final CompletionCallbackWith<ThermalROI> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_roi_key">CameraKey.THERMAL_ROI</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the Region of Interest. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalroi">ThermalROI</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalpalette"><div class="api-col left">Color Palette</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalpalette_inline">setThermalPalette</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalpalette_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalPalette</h6></div>

~~~java
 void setThermalPalette(@NonNull ThermalPalette palette, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_palette_key">CameraKey.THERMAL_PALETTE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the Palette. Each palette is a unique look-up table that maps 8-bit temperature values to different colors. Different palettes can be used to help the user better visualize temperature contrast or specific temperature bands. The valid range can be fetched from <code><a href="/Components/Camera/DJICamera_DJICameraParameters.html#djicamera_djicameraparameters_thermalpaletterange">thermalPaletteRange</a></code>. Supported only by thermal imaging cameras. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalpalette">ThermalPalette</a> <font color="#000">palette</td><td><font color="#666"><i>An enum type of the <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalpalette">ThermalPalette</a></code> to be used.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getthermalpalette"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getthermalpalette_inline">getThermalPalette</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getthermalpalette_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getThermalPalette</h6></div>

~~~java
 void getThermalPalette(@NonNull final CompletionCallbackWith<ThermalPalette> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_palette_key">CameraKey.THERMAL_PALETTE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the Palette. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalpalette">ThermalPalette</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalscene"><div class="api-col left">Scene</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalscene_inline">setThermalScene</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalscene_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalScene</h6></div>

~~~java
 void setThermalScene(@NonNull ThermalScene scene, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_scene_key">CameraKey.THERMAL_SCENE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the scene to instantly enhance your image. In all modes except Manual and User modes, the DDE, ACE, SSO,  brightness and contrast are set automatically to obtain the best result. In User modes, the contrast and brightness are set automatically to obtain the best results. Any settings that are made in these modes are retained if the scene is changed. In Manual mode, DDE, contrast and brightness are set manually. Supported only by thermal imaging cameras, except Mavic 2 Enterprise Dual thermal camera.  For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalscene">ThermalScene</a> <font color="#000">scene</td><td><font color="#666"><i>An enum type for the <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalscene">ThermalScene</a></code> to be used.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getthermalscene"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getthermalscene_inline">getThermalScene</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getthermalscene_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getThermalScene</h6></div>

~~~java
 void getThermalScene(@NonNull final CompletionCallbackWith<ThermalScene> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_scene_key">CameraKey.THERMAL_SCENE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets current scene. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalscene">ThermalScene</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermaldde"><div class="api-col left">Digital Data Enhancement (DDE)</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermaldde_inline">setThermalDDE</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermaldde_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalDDE</h6></div>

~~~java
 void setThermalDDE(@IntRange(from = -20, to = 100) int value, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_dde_key">CameraKey.THERMAL_DDE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the Digital Data Enhancement index (for DDE dynamic mode). DDE can be used to enhance image details (sharpen, higher index) and/or suppress fixed pattern noise (soften, lower index). It can be set manually only when the Scene mode is Manual, User1, User2 or User3. Supported only by thermal imaging cameras, except Mavic 2 Enterprise Dual thermal camera.  For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = -20, to = 100) int <font color="#000">value</td><td><font color="#666"><i>Integer in range [-20, 100]. Values less than 0 soften the image and filter fixed pattern noise. Values greater than 0 sharpen the details in the image. Value of 0 results in no enhancement.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getthermaldde"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getthermaldde_inline">getThermalDDE</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getthermaldde_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getThermalDDE</h6></div>

~~~java
 void getThermalDDE(@NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_dde_key">CameraKey.THERMAL_DDE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the value of Digital Data Enhancement. The value is available only when the Scene mode is Manual, User1, User2 or User3. Supported only by thermal imaging cameras, except Mavic 2 Enterprise Dual thermal camera.  For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalace"><div class="api-col left">Active Contrast Enhancement (ACE)</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalace_inline">setThermalACE</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalace_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalACE</h6></div>

~~~java
 void setThermalACE(@IntRange(from = -8, to = 8) int value, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_ace_key">CameraKey.THERMAL_ACE</a></td></tr></table></html>



##### Description:



<font color="#666">Set the value of Active Contrast Enhancement. Active contrast enhancement allows for a contrast trade-off between hotter and colder scenes when using 8-bit pixel data. It can be set manually only when the Scene mode is User1, User2 or User3. Supported only by thermal imaging cameras, except Mavic 2 Enterprise Dual thermal camera.  For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = -8, to = 8) int <font color="#000">value</td><td><font color="#666"><i>Integer in range [-8, 8]. &lt;br&gt; value &gt; 0: more contrast in hotter scene content and less contrast in colder scene content (sky, ocean etc.). &lt;br&gt; value &lt; 0: more contrast in colder scene content and less contrast in hotter scene content. &lt;br&gt; value = 0: neutral &lt;br&gt; value = 3: recommended for generic use</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getthermalace"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getthermalace_inline">getThermalACE</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getthermalace_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getThermalACE</h6></div>

~~~java
 void getThermalACE(@NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_ace_key">CameraKey.THERMAL_ACE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the value of Active Contrast Enhancement. The value is available only when the Scene mode is Manual, User1, User2 or User3. Supported only by thermal imaging cameras, except Mavic 2 Enterprise Dual thermal camera.  For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalsso"><div class="api-col left">Smart Scene Optimization (SSO)</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalsso_inline">setThermalSSO</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalsso_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalSSO</h6></div>

~~~java
 void setThermalSSO(@IntRange(from = 0, to = 100) int value, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_sso_key">CameraKey.THERMAL_SSO</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the value of Smart Scene Optimization. When using non-linear histogram equalization to map the 14-bit sensor pixel values to 8-bit pixel values, it can become difficult to determine the difference in temperature of two objects from their different shades of gray. SSO allows a percentage of the 14-bit histogram to be mapped linearly to the 8-bit histogram, which will compromise local contrast, but allow for more accurate visual radiometric measurements. This is particularly useful for bi-modal scenes. It can be set manually only when the Scene mode is User1, User2 or User3. Supported only by thermal imaging cameras, except Mavic 2 Enterprise Dual thermal camera.  For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 100) int <font color="#000">value</td><td><font color="#666"><i>Percentage of histogram to map linearly [0, 100].</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getthermalsso"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getthermalsso_inline">getThermalSSO</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getthermalsso_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getThermalSSO</h6></div>

~~~java
 void getThermalSSO(@NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_sso_key">CameraKey.THERMAL_SSO</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the value of Smart Scene Optimization. The value is available only when the Scene mode is Manual, User1, User2 or User3. Supported only by thermal imaging cameras, except Mavic 2 Enterprise Dual thermal camera.  For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalbrightness"><div class="api-col left">Brightness</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalbrightness_inline">setThermalBrightness</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalbrightness_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalBrightness</h6></div>

~~~java
 void setThermalBrightness(@IntRange(from = 0, to = 16383) int brightness,
                                     @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_brightness_key">CameraKey.THERMAL_BRIGHTNESS</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the brightness of the image. It can be set manually only when the Scene mode is Manual. Supported only by thermal imaging cameras, except Mavic 2 Enterprise Dual thermal camera. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 16383) int <font color="#000">brightness</td><td><font color="#666"><i>The integer value falls in [0, 16383].</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getthermalbrightness"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getthermalbrightness_inline">getThermalBrightness</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getthermalbrightness_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getThermalBrightness</h6></div>

~~~java
 void getThermalBrightness(@NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_brightness_key">CameraKey.THERMAL_BRIGHTNESS</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the value of brightness. The value is available only when the Scene mode is Manual, User1, User2 or User3. Supported only by thermal imaging cameras, except Mavic 2 Enterprise Dual thermal camera.  For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalcontrast"><div class="api-col left">Contrast</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalcontrast_inline">setThermalContrast</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalcontrast_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalContrast</h6></div>

~~~java
 void setThermalContrast(@IntRange(from = 0, to = 255) int contrast,
                                   @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_contrast_key">CameraKey.THERMAL_CONTRAST</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the value of contrast, with larger values having higher contrast. It can be set manually only when the Scene mode is Manual. Supported only by thermal imaging cameras. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 255) int <font color="#000">contrast</td><td><font color="#666"><i>Contrast value as an integer with range [0, 255].</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getthermalcontrast"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getthermalcontrast_inline">getThermalContrast</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getthermalcontrast_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getThermalContrast</h6></div>

~~~java
 void getThermalContrast(@NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_contrast_key">CameraKey.THERMAL_CONTRAST</a></td></tr></table></html>



##### Description:



<font color="#666">Gets contrast value. The value is available only when the Scene mode is Manual, User1, User2 or User3. Supported only by thermal imaging cameras.  For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalisothermenabled"><div class="api-col left">Isotherms</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalisothermenabled_inline">setThermalIsothermEnabled</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalisothermenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalIsothermEnabled</h6></div>

~~~java
 void setThermalIsothermEnabled(boolean enabled, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_isotherm_enabled_key">CameraKey.THERMAL_ISOTHERM_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Enable or disable Isotherms. Isotherms can be used to highlight specific temperature ranges: When disabled, all 256 values (8-bits) are dedicated to the temperature histogram of the scene. When enabled, only 128 values (0-127) are mapped linearly to temperature. Then three bands 128-175, 176-223 and 224-255 can be mapped to the user defined temperatures to highlight them to the user. Using some of the false color palettes (like RainbowIso) results in a thermal image that is grey scale except for three specific bands highlighted by either reds, blues or greens. Supported only by thermal imaging cameras. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">enabled</td><td><font color="#666"><i><code>true</code> if isotherms are enabled.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getthermalisothermenabled"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getthermalisothermenabled_inline">getThermalIsothermEnabled</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getthermalisothermenabled_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getThermalIsothermEnabled</h6></div>

~~~java
 void getThermalIsothermEnabled(@NonNull final CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_isotherm_enabled_key">CameraKey.THERMAL_ISOTHERM_ENABLED</a></td></tr></table></html>



##### Description:



<font color="#666">Determines whether Isotherms are enabled. <code>true</code> if Isotherms are enabled. Supported only by thermal imaging cameras.  For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalisothermunit"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalisothermunit_inline">setThermalIsothermUnit</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalisothermunit_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalIsothermUnit</h6></div>

~~~java
 void setThermalIsothermUnit(@NonNull ThermalIsothermUnit unit, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_isotherm_unit_key">CameraKey.THERMAL_ISOTHERM_UNIT</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the unit of the Isotherm ranges to either Celsius or percent. Different units results in different value ranges for Isotherms. Supported only by thermal imaging cameras except Mavic 2 Enterprise Dual thermal camera. For Mavic 2 Enterprise Dual, the Isotherm unit is always <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalisothermunit_celsius">CELSIUS</a></code>. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalisothermunit">ThermalIsothermUnit</a> <font color="#000">unit</td><td><font color="#666"><i>An enum type of the CameraThermalIsothermUnit to be used. Please refer to DJICameraThermalIsothermUnit.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getthermalisothermunit"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getthermalisothermunit_inline">getThermalIsothermUnit</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getthermalisothermunit_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getThermalIsothermUnit</h6></div>

~~~java
 void getThermalIsothermUnit(@NonNull final CompletionCallbackWith<ThermalIsothermUnit> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_isotherm_unit_key">CameraKey.THERMAL_ISOTHERM_UNIT</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the units for Isotherm ranges. Supported only by thermal imaging cameras, except Mavic 2 Enterprise Dual thermal camera. For Mavic 2 Enterprise Dual, the Isotherm unit is always <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalisothermunit_celsius">CELSIUS</a></code>.  For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalisothermunit">ThermalIsothermUnit</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalisothermuppervalue"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalisothermuppervalue_inline">setThermalIsothermUpperValue</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalisothermuppervalue_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalIsothermUpperValue</h6></div>

~~~java
 void setThermalIsothermUpperValue(@IntRange(from = 0, to = 100) int value,
                                             @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_isotherm_upper_value_key">CameraKey.THERMAL_ISOTHERM_UPPER_VALUE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the upper threshold value for Isotherm. All temperature values above this will use colors 224-255 from the palette. Supported only by thermal imaging cameras. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 100) int <font color="#000">value</td><td><font color="#666"><i>If the unit is percentage, the allowed range is [0,100]. If the unit is Celsius, for Mavic 2 Enterprise Dual thermal camera, the value range is [-10, 400]. For other thermal imaging cameras, the value range is [-40, 500]. The value can only be equal or larger than middle Isotherm threshold.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getthermalisothermuppervalue"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getthermalisothermuppervalue_inline">getThermalIsothermUpperValue</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getthermalisothermuppervalue_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getThermalIsothermUpperValue</h6></div>

~~~java
 void getThermalIsothermUpperValue(@NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_isotherm_upper_value_key">CameraKey.THERMAL_ISOTHERM_UPPER_VALUE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the upper threshold value for Isotherm. Supported only by thermal imaging cameras.  For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalisothermmiddlevalue"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalisothermmiddlevalue_inline">setThermalIsothermMiddleValue</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalisothermmiddlevalue_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalIsothermMiddleValue</h6></div>

~~~java
 void setThermalIsothermMiddleValue(@IntRange(from = 0, to = 100) int value,
                                              @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_isotherm_middle_value_key">CameraKey.THERMAL_ISOTHERM_MIDDLE_VALUE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the middle threshold value for Isotherm. Temperature values between the middle and upper Isotherm threshold will be displayed with colors 176-223 from the palette. Supported only by thermal imaging cameras, except Mavic 2 Enterprise Dual thermal camera.  For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 100) int <font color="#000">value</td><td><font color="#666"><i>If the unit is percentage, the value falls in [0,100]. If the unit is Celsius, the value range is [-40, 550]. The value can only be equal or larger than lower threshold and equal or smaller than upper threshold.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getthermalisothermmiddlevalue"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getthermalisothermmiddlevalue_inline">getThermalIsothermMiddleValue</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getthermalisothermmiddlevalue_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getThermalIsothermMiddleValue</h6></div>

~~~java
 void getThermalIsothermMiddleValue(@NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_isotherm_middle_value_key">CameraKey.THERMAL_ISOTHERM_MIDDLE_VALUE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the middle threshold value for Isotherm. Supported only by thermal imaging cameras, except Mavic 2 Enterprise Dual thermal camera.  For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalisothermlowervalue"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalisothermlowervalue_inline">setThermalIsothermLowerValue</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalisothermlowervalue_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalIsothermLowerValue</h6></div>

~~~java
 void setThermalIsothermLowerValue(@IntRange(from = 0, to = 100) int value,
                                             @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_isotherm_lower_value_key">CameraKey.THERMAL_ISOTHERM_LOWER_VALUE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the lower threshold value for Isotherm. Temperature values between the lower and middle Isotherm threshold will be displayed with colors 128-175 from the palette. Supported only by thermal imaging cameras. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 100) int <font color="#000">value</td><td><font color="#666"><i>If the unit is percentage, the value falls in [0,100]. If the unit is Celsius, for Mavic 2 Enterprise Dual thermal camera, the value range is [-10, 400], for other thermal imaging cameras, the value range is [-40, 500]. The value can only be equal or smaller than upper threshold.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getthermalisothermlowervalue"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getthermalisothermlowervalue_inline">getThermalIsothermLowerValue</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getthermalisothermlowervalue_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getThermalIsothermLowerValue</h6></div>

~~~java
 void getThermalIsothermLowerValue(@NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_isotherm_lower_value_key">CameraKey.THERMAL_ISOTHERM_LOWER_VALUE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the lower threshold value for Isotherm. Supported only by thermal imaging cameras. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalgainmode"><div class="api-col left">Gain</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalgainmode_inline">setThermalGainMode</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalgainmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalGainMode</h6></div>

~~~java
 void setThermalGainMode(@NonNull ThermalGainMode mode, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_gain_mode_key">CameraKey.THERMAL_GAIN_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the gain mode. Low gain mode can be used for scenes with temperatures ranging from -40 to 550 degrees Celsius. For higher contrast, the high gain mode can be used by for temperatures between -25 to 135 degrees Celsius for the 640x512 camera and -25 to 100 degrees Celsius for 324 x 256 camera. Mavic 2 Enterprise Dual has different temperature range from other thermal imaging cameras. Therefore, for Mavic 2 Enterprise Dual, the low gain mode can be used from -10 to 140 degrees Celsius. The high gain mode can be used from -10 to 400 degree Celsius. Supported by thermal imaging cameras. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalgainmode">ThermalGainMode</a> <font color="#000">mode</td><td><font color="#666"><i>An enum type of the <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalgainmode">ThermalGainMode</a></code> to be used.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getthermalgainmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getthermalgainmode_inline">getThermalGainMode</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getthermalgainmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getThermalGainMode</h6></div>

~~~java
 void getThermalGainMode(@NonNull final CompletionCallbackWith<ThermalGainMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_gain_mode_key">CameraKey.THERMAL_GAIN_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the gain mode. Supported only by thermal imaging cameras. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalgainmode">ThermalGainMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalmeasurementmode"><div class="api-col left">Measurement Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalmeasurementmode_inline">setThermalMeasurementMode</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalmeasurementmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalMeasurementMode</h6></div>

~~~java
 void setThermalMeasurementMode(@NonNull ThermalMeasurementMode mode, @Nullable CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_measurement_mode_key">CameraKey.THERMAL_MEASUREMENT_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the mode for thermal measurement. Use callback method  <code><a href="/Components/Camera/DJICamera_ThermalCameraAreaTemperatureAggregationsUpdatedCallbackInterface.html#djicamera_didupdateareatemperatureaggregations">onUpdate</a></code> to receive the measurement result. Supported only by thermal imaging cameras. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalmeasurementmode">ThermalMeasurementMode</a> <font color="#000">mode</td><td><font color="#666"><i>The desired measurement mode.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Execution callback that receives the getter execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getthermalmeasurementmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getthermalmeasurementmode_inline">getThermalMeasurementMode</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getthermalmeasurementmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getThermalMeasurementMode</h6></div>

~~~java
 void getThermalMeasurementMode(@NonNull CompletionCallbackWith<ThermalMeasurementMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_measurement_mode_key">CameraKey.THERMAL_MEASUREMENT_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the mode for thermal measurement. Supported only by thermal imaging cameras.  For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalmeasurementmode">ThermalMeasurementMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermaldigitalzoomscale"><div class="api-col left">Digital Zoom</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermaldigitalzoomscale_inline">setThermalDigitalZoomFactor</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermaldigitalzoomscale_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalDigitalZoomFactor</h6></div>

~~~java
 void setThermalDigitalZoomFactor(@NonNull ThermalDigitalZoomFactor factor,
                                            @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_digital_zoom_factor_key">CameraKey.THERMAL_DIGITAL_ZOOM_FACTOR</a></td></tr></table></html>



##### Description:



<font color="#666">Adjusts the digital zoom. Supported only by thermal imaging cameras. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermaldigitalzoomscale">ThermalDigitalZoomFactor</a> <font color="#000">factor</td><td><font color="#666"><i>For resolution 640 x 512, x1,x2,x4,x8 can be set. For resolution 336 x 256, only x1,x2,x4 can be set. Please refer to CameraThermalDigitalZoomScale in DJICameraSettingsDef.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getthermaldigitalzoomscale"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getthermaldigitalzoomscale_inline">getThermalDigitalZoomFactor</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getthermaldigitalzoomscale_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getThermalDigitalZoomFactor</h6></div>

~~~java
 void getThermalDigitalZoomFactor(@NonNull final CompletionCallbackWith<ThermalDigitalZoomFactor> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_digital_zoom_factor_key">CameraKey.THERMAL_DIGITAL_ZOOM_FACTOR</a></td></tr></table></html>



##### Description:



<font color="#666">Gets current digital zoom. Supported only by thermal imaging cameras. For Zenmuse H20T,  please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermaldigitalzoomscale">ThermalDigitalZoomFactor</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getthermalprofile"><div class="api-col left">Profile</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getthermalprofile_inline">getThermalProfile</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getthermalprofile_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getThermalProfile</h6></div>

~~~java
 void getThermalProfile(@NonNull final CompletionCallbackWith<SettingsDefinitions.ThermalProfile> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_profile_key">CameraKey.THERMAL_PROFILE</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the thermal imaging camera profile. The profile includes information about resolution, frame rate and focal length. Supported only by thermal imaging cameras. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraThermalProfile.html#djicamera_djicamerathermalprofile">ThermalProfile</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalspotmeteringtargetpoint"><div class="api-col left">Metering</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalspotmeteringtargetpoint_inline">setThermalSpotMeteringTargetPoint</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalspotmeteringtargetpoint_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalSpotMeteringTargetPoint</h6></div>

~~~java
 void setThermalSpotMeteringTargetPoint(@NonNull PointF targetPoint,
                                                  @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_spot_metering_target_point_key">CameraKey.THERMAL_SPOT_METERING_TARGET_POINT</a></td></tr></table></html>



##### Description:



<font color="#666">Sets the spot metering target point which then invoke the callback from <code><a href="/Components/Camera/DJICamera.html#djicamera_setthermaltemperaturecallback">setThermalTemperatureCallback</a></code> with the temperature at a specific coordinate in the scene. This method requires a relative point that is proportional to the dimension of the camera video dimension, the x, and y values must all be between 0 and 1.0. Supported only by XT2, Mavic 2 Enterprise Dual and Zenmuse XT containing Advanced Radiometry capabilities. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull PointF <font color="#000">targetPoint</td><td><font color="#666"><i>The desired target point.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getthermalspotmeteringtargetpoint"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getthermalspotmeteringtargetpoint_inline">getThermalSpotMeteringTargetPoint</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getthermalspotmeteringtargetpoint_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getThermalSpotMeteringTargetPoint</h6></div>

~~~java
 void getThermalSpotMeteringTargetPoint(
        @NonNull final CompletionCallbackWith<PointF> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_spot_metering_target_point_key">CameraKey.THERMAL_SPOT_METERING_TARGET_POINT</a></td></tr></table></html>



##### Description:



<font color="#666">Gets the spot metering target point if one is set, if not then returns CGPointZero. Supported only by XT2, Mavic 2 Enterprise Dual and Zenmuse XT containing Advanced Radiometry capabilities. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;PointF&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalmeteringarea"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalmeteringarea_inline">setThermalMeteringArea</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalmeteringarea_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalMeteringArea</h6></div>

~~~java
 void setThermalMeteringArea(@NonNull RectF area, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_metering_area_key">CameraKey.THERMAL_METERING_AREA</a></td></tr></table></html>



##### Description:



<font color="#666">Set the metering area for a rectangle inside the thermal image scene, which allows the camera to transmit aggregate temperature computations via the <code><a href="/Components/Camera/DJICamera_ThermalCameraAreaTemperatureAggregationsUpdatedCallbackInterface.html#djicamera_didupdateareatemperatureaggregations">onUpdate</a></code> callback method. See <code><a href="/Components/Camera/DJICamera_DJICameraThermalAreaTemperatureAggregations.html#djicamera_djicamerathermalareatemperatureaggregations">ThermalAreaTemperatureAggregations</a></code> for the statistical values that are available. This method requires a relative rect that is proportional to the rect of the thermal scene, the x, y, width, and height values must all be between 0 and 1.0. Supported only by XT2, Mavic 2 Enterprise Dual and Zenmuse XT containing Advanced Radiometry capabilities. For Zenmuse H20T,  please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull RectF <font color="#000">area</td><td><font color="#666"><i>The desired thermal metering area.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getthermalmeteringarea"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getthermalmeteringarea_inline">getThermalMeteringArea</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getthermalmeteringarea_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getThermalMeteringArea</h6></div>

~~~java
 void getThermalMeteringArea(@NonNull final CompletionCallbackWith<RectF> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_metering_area_key">CameraKey.THERMAL_METERING_AREA</a></td></tr></table></html>



##### Description:



<font color="#666">Get a rect representing the currently set metering area for the thermal scene. Supported only by XT2, Mavic 2 Enterprise Dual and Zenmuse XT containing Advanced Radiometry capabilities. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;RectF&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalffcmode"><div class="api-col left">Flat-field Correction (FFC)</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalffcmode_inline">setThermalFFCMode</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalffcmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalFFCMode</h6></div>

~~~java
 void setThermalFFCMode(@NonNull ThermalFFCMode mode, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_ffc_mode_key">CameraKey.THERMAL_FFC_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Set the flat-field correction (FFC) mode. Supported only by thermal imaging cameras. For Mavic 2 Enterprise Dual thermal camera, the <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalffcmode">ThermalFFCMode</a></code> is always <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalffcmode_auto">AUTO</a></code>. For Zenmuse H20T,  please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalffcmode">ThermalFFCMode</a> <font color="#000">mode</td><td><font color="#666"><i>The desired FFC mode.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getthermalffcmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getthermalffcmode_inline">getThermalFFCMode</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getthermalffcmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getThermalFFCMode</h6></div>

~~~java
 void getThermalFFCMode(@NonNull final CompletionCallbackWith<ThermalFFCMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_ffc_mode_key">CameraKey.THERMAL_FFC_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Get the currently set flat-field correction (FFC) mode. Supported only by thermal imaging cameras with installed firmware version of 1.15.1.60 or higher. For Mavic 2 Enterprise Dual thermal camera, the <code>DJICamera_DJICameraThermalFFCMode</code> is always <code>DJICamera_DJICameraThermalFFCMode_Auto</code>.  For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalffcmode">ThermalFFCMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_triggerthermalffcmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_triggerthermalffcmode_inline">triggerThermalFFC</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_triggerthermalffcmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>triggerThermalFFC</h6></div>

~~~java
 void triggerThermalFFC(@Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_trigger_thermal_ffc_key">CameraKey.TRIGGER_THERMAL_FFC</a></td></tr></table></html>



##### Description:



<font color="#666">Trigger flat-field correction. Supported only by thermal imaging cameras. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with result of the trigger action.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalcustomexternalscenesettingsprofile"><div class="api-col left">Scene Profile</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalcustomexternalscenesettingsprofile_inline">setThermalCustomExternalSceneSettingsProfile</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalcustomexternalscenesettingsprofile_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalCustomExternalSceneSettingsProfile</h6></div>

~~~java
 void setThermalCustomExternalSceneSettingsProfile(@NonNull ThermalCustomExternalSceneSettingsProfile profile,
                                                             @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_custom_external_scene_settings_profile_key">CameraKey.THERMAL_CUSTOM_EXTERNAL_SCENE_SETTINGS_PROFILE</a></td></tr></table></html>



##### Description:



<font color="#666">Set the custom user profile. This profile represents user-set external scene parameters for the thermal scene. Supported only by thermal imaging cameras. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalcustomexternalscenesettings">ThermalCustomExternalSceneSettingsProfile</a> <font color="#000">profile</td><td><font color="#666"><i>The desired user profile setting.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getthermalcustomexternalscenesettingsprofile"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getthermalcustomexternalscenesettingsprofile_inline">getThermalCustomExternalSceneSettingsProfile</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getthermalcustomexternalscenesettingsprofile_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getThermalCustomExternalSceneSettingsProfile</h6></div>

~~~java
 void getThermalCustomExternalSceneSettingsProfile(
        @NonNull final CompletionCallbackWith<ThermalCustomExternalSceneSettingsProfile> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_custom_external_scene_settings_profile_key">CameraKey.THERMAL_CUSTOM_EXTERNAL_SCENE_SETTINGS_PROFILE</a></td></tr></table></html>



##### Description:



<font color="#666">Get the currently set custom user profile. This profile represents user-set external scene parameters for the thermal scene. Supported only by thermal imaging cameras. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalcustomexternalscenesettings">ThermalCustomExternalSceneSettingsProfile</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalatmospherictemperature"><div class="api-col left">Atmosphere</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalatmospherictemperature_inline">setThermalAtmosphericTemperature</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalatmospherictemperature_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalAtmosphericTemperature</h6></div>

~~~java
 void setThermalAtmosphericTemperature(float temperature, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_atmospheric_temperature_key">CameraKey.THERMAL_ATMOSPHERIC_TEMPERATURE</a></td></tr></table></html>



##### Description:



<font color="#666">Set the temperature of the atmosphere between the scene and the camera. Supported only by Zenmuse XT containing Advanced Radiometry capabilities.  For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">float <font color="#000">temperature</td><td><font color="#666"><i>The assumed temperature of the atmosphere between the camera and the scene, can be between -50 and 327.67 degrees Celsius.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalatmospherictransmissioncoefficient"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalatmospherictransmissioncoefficient_inline">setThermalAtmosphericTransmissionCoefficient</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalatmospherictransmissioncoefficient_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalAtmosphericTransmissionCoefficient</h6></div>

~~~java
 void setThermalAtmosphericTransmissionCoefficient(final float coefficient,
                                                             @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_atmospheric_temperature_key">CameraKey.THERMAL_ATMOSPHERIC_TEMPERATURE</a></td></tr></table></html>



##### Description:



<font color="#666">Set the transmission coefficient of the atmosphere between the scene and the camera. Supported only by Zenmuse XT containing Advanced Radiometry capabilities.  For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final float <font color="#000">coefficient</td><td><font color="#666"><i>The desired atmospheric temperature, can be between 50 and 100.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalbackgroundtemperature"><div class="api-col left">Background Temperature</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalbackgroundtemperature_inline">setThermalBackgroundTemperature</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalbackgroundtemperature_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalBackgroundTemperature</h6></div>

~~~java
 void setThermalBackgroundTemperature(final float temperature, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_background_temperature_key">CameraKey.THERMAL_BACKGROUND_TEMPERATURE</a></td></tr></table></html>



##### Description:



<font color="#666">Set the assumed temperature reflected by the background of the scene, can be between -50 and 327.67 degrees Celsius. Supported only by Zenmuse XT containing Advanced Radiometry capabilities. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final float <font color="#000">temperature</td><td><font color="#666"><i>The desired background reflected temperature.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalsceneemissivity"><div class="api-col left">Scene Emissivity</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalsceneemissivity_inline">setThermalSceneEmissivity</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalsceneemissivity_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalSceneEmissivity</h6></div>

~~~java
 void setThermalSceneEmissivity(final float emissivity, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_scene_emissivity_key">CameraKey.THERMAL_SCENE_EMISSIVITY</a></td></tr></table></html>



##### Description:



<font color="#666">Set the emissivity of the thermal scene, can be between 50 and 100. Supported only by Zenmuse XT containing Advanced Radiometry capabilities. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final float <font color="#000">emissivity</td><td><font color="#666"><i>The desired scene emissivity.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalwindowreflection"><div class="api-col left">Windows</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalwindowreflection_inline">setThermalWindowReflection</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalwindowreflection_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalWindowReflection</h6></div>

~~~java
 void setThermalWindowReflection(final float reflection, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_window_reflection_key">CameraKey.THERMAL_WINDOW_REFLECTION</a></td></tr></table></html>



##### Description:



<font color="#666">Set assumed window reflection coefficient, can be between 0 and X where X is the window transmission coefficient parameter. Supported only by Zenmuse XT containing Advanced Radiometry capabilities. For Zenmuse H20T,  please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final float <font color="#000">reflection</td><td><font color="#666"><i>The desired window reflection coefficient.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalwindowreflectedtemperature"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalwindowreflectedtemperature_inline">setThermalWindowReflectedTemperature</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalwindowreflectedtemperature_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalWindowReflectedTemperature</h6></div>

~~~java
 void setThermalWindowReflectedTemperature(final float temperature,
                                                     @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_window_reflected_temperature_key">CameraKey.THERMAL_WINDOW_REFLECTED_TEMPERATURE</a></td></tr></table></html>



##### Description:



<font color="#666">Set the temperature reflected in the window, can be between -50 and 327.67 degrees Celsius. Supported only by Zenmuse XT containing Advanced Radiometry capabilities. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final float <font color="#000">temperature</td><td><font color="#666"><i>The desired window reflected temperature.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalwindowtemperature"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalwindowtemperature_inline">setThermalWindowTemperature</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalwindowtemperature_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalWindowTemperature</h6></div>

~~~java
 void setThermalWindowTemperature(final float temperature, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_window_temperature_key">CameraKey.THERMAL_WINDOW_TEMPERATURE</a></td></tr></table></html>



##### Description:



<font color="#666">Set the window temperature, can be between -50 and 327.67 degrees Celsius. Supported only by Zenmuse XT containing Advanced Radiometry capabilities. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final float <font color="#000">temperature</td><td><font color="#666"><i>The desired window temperature.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermalwindowtransmissioncoefficient"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermalwindowtransmissioncoefficient_inline">setThermalWindowTransmissionCoefficient</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermalwindowtransmissioncoefficient_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalWindowTransmissionCoefficient</h6></div>

~~~java
 void setThermalWindowTransmissionCoefficient(final float coefficient,
                                                        @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_thermal_window_transmission_coefficient_key">CameraKey.THERMAL_WINDOW_TRANSMISSION_COEFFICIENT</a></td></tr></table></html>



##### Description:



<font color="#666">Set the window transmission coefficient, can be between 50 and 100-X where X is the window reflection. Supported only by Zenmuse XT containing Advanced Radiometry capabilities. For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final float <font color="#000">coefficient</td><td><font color="#666"><i>The desired window transmission coefficient.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setthermaltemperatureunit"><div class="api-col left">Temperature Unit</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setthermaltemperatureunit_inline">setThermalTemperatureUnit</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setthermaltemperatureunit_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setThermalTemperatureUnit</h6></div>

~~~java
 void setThermalTemperatureUnit(final SettingsDefinitions.TemperatureUnit temperatureUnit, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the temperature unit. Only supported by XT2 and Mavic 2 Enterprise Dual.  For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameratemperatureunit">TemperatureUnit</a> <font color="#000">temperatureUnit</td><td><font color="#666"><i>An enum value of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameratemperatureunit">TemperatureUnit</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getthermaltemperatureunit"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getthermaltemperatureunit_inline">getThermalTemperatureUnit</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getthermaltemperatureunit_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getThermalTemperatureUnit</h6></div>

~~~java
 void getThermalTemperatureUnit(final CompletionCallbackWith<SettingsDefinitions.TemperatureUnit> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the temperature unit. Only supported by XT2 and Mavic 2 Enterprise Dual Thermal camera.  For Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameratemperatureunit">TemperatureUnit</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setdisplaymode"><div class="api-col left">Display Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setdisplaymode_inline">setDisplayMode</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setdisplaymode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setDisplayMode</h6></div>

~~~java
 void setDisplayMode(final SettingsDefinitions.DisplayMode mode, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the display mode to coordinate the video feeds from both the visual camera and the thermal camera. Only supported by XT2 camera and Mavic 2 Enterprise Dual Thermal Camera.  For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameradisplaymode">DisplayMode</a> <font color="#000">mode</td><td><font color="#666"><i>The display mode to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getdisplaymode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getdisplaymode_inline">getDisplayMode</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getdisplaymode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDisplayMode</h6></div>

~~~java
 void getDisplayMode(@NonNull final CompletionCallbackWith<SettingsDefinitions.DisplayMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the display mode. The display mode determine the way to coordinate the video feeds from both the visual camera and the thermal camera. Only supported by XT2 camera and Mavic 2 Enterprise Dual Thermal Camera. For Zenmuse H20 and Zenmuse H20T,  please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameradisplaymode">DisplayMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setpipposition"><div class="api-col left">PIP Position</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setpipposition_inline">setPIPPosition</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setpipposition_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setPIPPosition</h6></div>

~~~java
 void setPIPPosition(final SettingsDefinitions.PIPPosition position, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Set the Picture in picture mode of XT2 camera.For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">final <a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.PIPPosition <font color="#000">position</td><td><font color="#666"><i>Could be one of the Enum "SettingsDefinitions.PIPPosition"</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getpipposition"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getpipposition_inline">getPIPPosition</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getpipposition_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getPIPPosition</h6></div>

~~~java
 void getPIPPosition(@NonNull final CompletionCallbackWith<SettingsDefinitions.PIPPosition> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Get picture in picture mode of XT2 camera. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.PIPPosition&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setmsxlevel"><div class="api-col left">MSX Level</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setmsxlevel_inline">setMSXLevel</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setmsxlevel_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMSXLevel</h6></div>

~~~java
 void setMSXLevel(@IntRange(from = 0, to = 100) int level, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the level for MSX display mode. The range for level is [0, 100]. When it is 0, the visible spectrum definition is invisible. When it is 100, the visual spectrum definition is the most obvious. Only supported by XT2 camera and Mavic 2 Enterprise Dual. Mavic 2 Enterprise Dual does not support with firmware version lower than 01.01.0520. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = 100) int <font color="#000">level</td><td><font color="#666"><i>The MSX level to set with range [0, 100].</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getmsxlevel"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getmsxlevel_inline">getMSXLevel</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getmsxlevel_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMSXLevel</h6></div>

~~~java
 void getMSXLevel(@NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the level for MSX display mode. The range for level is [0, 100]. When it is 0, the visible spectrum definition is invisible. When it is 100, the visual spectrum definition is the most obvious. Only supported by XT2 camera and Mavic 2 Enterprise Dual. Mavic 2 Enterprise  Dual does not support with firmware version lower than 01.01.0520. For Zenmuse H20 and Zenmuse H20T, please use class <code><a href="/Components/Camera/DJICamera_DJILens.html#djicamera_djilens">Lens</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setdualfeedverticalalignmentoffset"><div class="api-col left">Dual Feed Vertical Alignment</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setdualfeedverticalalignmentoffset_inline">setDualFeedVerticalAlignmentOffset</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setdualfeedverticalalignmentoffset_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setDualFeedVerticalAlignmentOffset</h6></div>

~~~java
 void setDualFeedVerticalAlignmentOffset(@IntRange(from = -40, to = 40) int offset, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the vertical alignment offset between the video feeds from both the visual camera and the thermal camera. The alignment is applied to the MSX display mode. Different camera results in different value ranges. For XT2 camera, the valid range is [-8, 8]. For Mavic 2 Enterprise Dual, the valid range is [-40, 40]. Positive value will move the thermal window up. Use this setting to fine-tune the performance of MSX display mode and the align PIP mode. Only supported by XT2 camera and Mavic 2 Enterprise Dual.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = -40, to = 40) int <font color="#000">offset</td><td><font color="#666"><i>Range from -8 to 8 for XT2, from -40 to 40 for Mavic 2 Enterprise Dual.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getdualfeedverticalalignmentoffset"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getdualfeedverticalalignmentoffset_inline">getDualFeedVerticalAlignmentOffset</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getdualfeedverticalalignmentoffset_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDualFeedVerticalAlignmentOffset</h6></div>

~~~java
 void getDualFeedVerticalAlignmentOffset(@NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the vertical alignment offset between the video feeds from both the visual camera and the thermal camera. The alignment is applied to the MSX display mode. Different camera results in different value ranges. For XT2 camera, the valid range is [-8, 8]. For Mavic 2 Enterprise Dual, the valid range is [-40, 40]. Positive value will move the thermal window up. Only supported by XT2 camera and Mavic 2 Enterprise Dual camera.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_setdualfeedhorizontalalignmentoffset"><div class="api-col left">Dual Feed Horizontal Alignment</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_setdualfeedhorizontalalignmentoffset_inline">setDualFeedHorizontalAlignmentOffset</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_setdualfeedhorizontalalignmentoffset_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setDualFeedHorizontalAlignmentOffset</h6></div>

~~~java
 void setDualFeedHorizontalAlignmentOffset(@IntRange(from = -100, to = 100) int offset, @Nullable final CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the horizontal alignment offset between the video feeds from both the visual camera and the thermal camera. The alignment is applied to the MSX display mode. Different camera results in different value ranges. For XT2 camera, the valid range is [-100, 100]. For Mavic 2 Enterprise Dual, the valid range is [-40, 40]. Positive value will move the thermal window to the right. Use this setting to fine-tune the performance of MSX display mode and the align PIP mode. Only supported by XT2 camera and Mavic 2 Enterprise Dual.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@IntRange(from = -100, to = 100) int <font color="#000">offset</td><td><font color="#666"><i>Range from -100 to 100 for XT2, from -40 to 40 for Mavic 2 Enterprise Dual.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_thermalcamera_getdualfeedhorizontalalignmentoffset"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_thermalcamera_getdualfeedhorizontalalignmentoffset_inline">getDualFeedHorizontalAlignmentOffset</a></div></div><div class="inline-doc" id="djicamera_thermalcamera_getdualfeedhorizontalalignmentoffset_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getDualFeedHorizontalAlignmentOffset</h6></div>

~~~java
 void getDualFeedHorizontalAlignmentOffset(@NonNull final CompletionCallbackWith<Integer> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the horizontal alignment offset between the video feeds from both the visual camera and the thermal camera. The alignment is applied to the MSX display mode. Different camera results in different value ranges. For XT2 camera, the valid range is [-100, 100]. For Mavic 2 Enterprise Dual, the valid range is [-40, 40]. Positive value will move the thermal window to the right. Only supported by XT2 camera and Mavic 2 Enterprise Dual.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final CompletionCallbackWith&lt;Integer&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Multi Lenses

<div class="api-row" id="djicamera_multilenses_ismultilenscamerasupported"><div class="api-col left">Check MultiLens Camera Supported</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_multilenses_ismultilenscamerasupported_inline">isMultiLensCameraSupported</a></div></div><div class="inline-doc" id="djicamera_multilenses_ismultilenscamerasupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isMultiLensCameraSupported</h6></div>

~~~java
 boolean isMultiLensCameraSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Determines if the camera supports the multiple lens.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the multiple lens is supported.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_multilenses_ismultivideostreamsourcesupported"><div class="api-col left">Check Support Multi Video Stream Source</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_multilenses_ismultivideostreamsourcesupported_inline">isMultiVideoStreamSourceSupported</a></div></div><div class="inline-doc" id="djicamera_multilenses_ismultivideostreamsourcesupported_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isMultiVideoStreamSourceSupported</h6></div>

~~~java
 boolean isMultiVideoStreamSourceSupported() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Determines whether the camera supports multi video stream source or not.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i>A boolean value.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_multilenses_setcameravideostreamsource"><div class="api-col left">Set Camera Video Stream Source</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_multilenses_setcameravideostreamsource_inline">setCameraVideoStreamSource</a></div></div><div class="inline-doc" id="djicamera_multilenses_setcameravideostreamsource_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setCameraVideoStreamSource</h6></div>

~~~java
 void setCameraVideoStreamSource(@NonNull CameraVideoStreamSource cameraVideoStreamSource, @Nullable final CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the camera video stream source. For multi-lens cameras, the camera stream has different sources. <code><a href="/Components/Camera/DJICamera.html#djicamera_djicameravideostreamsource">CameraVideoStreamSource</a></code>  is used to represents the camera video stream source. When the source of the camera video stream is set, the image transmission will also been  changed to corresponding source. It is only supported by Zenmuse H20/H20T.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Components/Camera/DJICamera.html#djicamera_djicameravideostreamsource">CameraVideoStreamSource</a> <font color="#000">cameraVideoStreamSource</td><td><font color="#666"><i>The camera video stream source.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_multilenses_getcameravideostreamsource"><div class="api-col left">Get Camera Video Stream Source</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_multilenses_getcameravideostreamsource_inline">getCameraVideoStreamSource</a></div></div><div class="inline-doc" id="djicamera_multilenses_getcameravideostreamsource_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getCameraVideoStreamSource</h6></div>

~~~java
 void getCameraVideoStreamSource(@NonNull final CommonCallbacks.CompletionCallbackWith<CameraVideoStreamSource> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the camera video stream source. For multi-lens cameras, the camera stream has different sources. <code><a href="/Components/Camera/DJICamera.html#djicamera_djicameravideostreamsource">CameraVideoStreamSource</a></code>  is used to represents the camera video stream source. When the source of the camera video stream is set, the image transmission will also been  changed to corresponding source. It is only supported by Zenmuse H20 series.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull final <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera.html#djicamera_djicameravideostreamsource">CameraVideoStreamSource</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned value(s).</i></td></tr></table></html></div>

<html><p><br></p></html>

#### Multispectral Camera

<div class="api-row" id="djicamera_camerasettings_setmultispectraldisplaymode"><div class="api-col left">Multispectral Display Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setmultispectraldisplaymode_inline">setMultispectralDisplayMode</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setmultispectraldisplaymode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMultispectralDisplayMode</h6></div>

~~~java
 void setMultispectralDisplayMode(SettingsDefinitions.MultispectralDisplayMode displayMode, @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the display mode to coordinate the video feeds from both the RGB sensor and single-band sensors. Only supported by multispectral camera of P4 Multispectral.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_multispectraldisplaymode">MultispectralDisplayMode</a> <font color="#000">displayMode</td><td><font color="#666"><i>The display mode to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Callback that receives the setter execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getmultispectraldisplaymode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getmultispectraldisplaymode_inline">getMultispectralDisplayMode</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getmultispectraldisplaymode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMultispectralDisplayMode</h6></div>

~~~java
 void getMultispectralDisplayMode(@NonNull CommonCallbacks.CompletionCallbackWith<SettingsDefinitions.MultispectralDisplayMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the display mode. The display mode determines the way to coordinate the video feeds from both the RGB sensor and single-band sensors.  Only supported by multispectral camera of P4 Multispectral.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_multispectraldisplaymode">MultispectralDisplayMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Callback to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setmultispectralstoragephotosettings"><div class="api-col left">Multispectral Storage Photo Settings</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setmultispectralstoragephotosettings_inline">setMultispectralStoragePhotoSettings</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setmultispectralstoragephotosettings_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMultispectralStoragePhotoSettings</h6></div>

~~~java
 void setMultispectralStoragePhotoSettings(MultispectralStoragePhotoSettings settings, @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the storage settings for the multispectral camera. The settings control if the photos created by different sensors will be saved or not.  Only supported by multispectral camera of P4 Multispectral.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraMultispectralStorageSettings.html#djicamera_djicameramultispectralstoragesettings">MultispectralStoragePhotoSettings</a> <font color="#000">settings</td><td><font color="#666"><i>An object of <code><a href="/Components/Camera/DJICamera_DJICameraMultispectralStorageSettings.html#djicamera_djicameramultispectralstoragesettings">MultispectralStoragePhotoSettings</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Callback to receive the setter result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getmultispectralstoragephotosettings"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getmultispectralstoragephotosettings_inline">getMultispectralStoragePhotoSettings</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getmultispectralstoragephotosettings_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMultispectralStoragePhotoSettings</h6></div>

~~~java
 void getMultispectralStoragePhotoSettings(@NonNull CommonCallbacks.CompletionCallbackWith<MultispectralStoragePhotoSettings> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the storage settings for the multispectral camera. Only supported by multispectral camera of P4 Multispectral.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraMultispectralStorageSettings.html#djicamera_djicameramultispectralstoragesettings">MultispectralStoragePhotoSettings</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Callback to receive the getter result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setmultispectralmeteringmode"><div class="api-col left">Multispectral Metering Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setmultispectralmeteringmode_inline">setMultispectralMeteringMode</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setmultispectralmeteringmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMultispectralMeteringMode</h6></div>

~~~java
 void setMultispectralMeteringMode(SettingsDefinitions.MeteringMode mode, @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the metering mode for the single-band sensors on the multispectral camera. The same metering mode will be applied to all single-band  sensors (sensors except the RGB one). Only <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerameteringmode_center">CENTER</a></code> and <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerameteringmode_average">AVERAGE</a></code> mode  to be set. Only supported by multispectral camera of P4 Multispectral.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerameteringmode">MeteringMode</a> <font color="#000">mode</td><td><font color="#666"><i>Exposure metering to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Callback to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getmultispectralmeteringmode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getmultispectralmeteringmode_inline">getMultispectralMeteringMode</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getmultispectralmeteringmode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMultispectralMeteringMode</h6></div>

~~~java
 void getMultispectralMeteringMode(@NonNull CommonCallbacks.CompletionCallbackWith<SettingsDefinitions.MeteringMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the metering mode for all single-band sensors (sensors except the RGB one). Only supported by multispectral camera of P4 Multispectral.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerameteringmode">MeteringMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Callback to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setmultispectralexposuremode"><div class="api-col left">Multispectral Exposure Mode</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setmultispectralexposuremode_inline">setMultispectralExposureMode</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setmultispectralexposuremode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMultispectralExposureMode</h6></div>

~~~java
 void setMultispectralExposureMode(SettingsDefinitions.ExposureMode mode, @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the exposure mode for the single-band sensors on the multispectral camera. The same exposure mode will be applied to all single-band  sensors (sensors except the RGB one). Exposure mode must be <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode_program">PROGRAM</a></code> or <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode_shutter">SHUTTER_PRIORITY</a></code>.  Only supported by multispectral camera of P4 Multispectral.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode">ExposureMode</a> <font color="#000">mode</td><td><font color="#666"><i>Camera exposure mode to set.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Remote execution result error block.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getmultispectralexposuremode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getmultispectralexposuremode_inline">getMultispectralExposureMode</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getmultispectralexposuremode_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMultispectralExposureMode</h6></div>

~~~java
 void getMultispectralExposureMode(@NonNull CommonCallbacks.CompletionCallbackWith<SettingsDefinitions.ExposureMode> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the exposure mode for all single-band sensors (sensors except the RGB one). Only supported by multispectral camera of P4 Multispectral.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode">ExposureMode</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Callback to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setmultispectralexposurecompensation"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setmultispectralexposurecompensation_inline">setMultispectralExposureCompensation</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setmultispectralexposurecompensation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMultispectralExposureCompensation</h6></div>

~~~java
 void setMultispectralExposureCompensation(SettingsDefinitions.ExposureCompensation compensation, @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the exposure compensation for the single-band sensors on the multispectral camera. The same exposure compensation will be applied to all  single-band sensors (sensors except the RGB one). See <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposurecompensation">ExposureCompensation</a></code> to view all possible exposure compensations  to which the single-band sensors can be set. In order to use this function, set the camera exposure mode to <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode_program">PROGRAM</a></code>  or <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode_shutter">SHUTTER_PRIORITY</a></code> Only supported by multispectral camera of P4 Multispectral.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposurecompensation">ExposureCompensation</a> <font color="#000">compensation</td><td><font color="#666"><i>Exposure compensation value to be set for the single-band sensors's.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Callback to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getmultispectralexposurecompensation"><div class="api-col left">Multispectral Exposure Compensation</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getmultispectralexposurecompensation_inline">getMultispectralExposureCompensation</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getmultispectralexposurecompensation_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMultispectralExposureCompensation</h6></div>

~~~java
 void getMultispectralExposureCompensation(@NonNull CommonCallbacks.CompletionCallbackWith<SettingsDefinitions.ExposureCompensation> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the exposure compensation for all single-band sensors (sensors except the RGB one). Only supported by multispectral camera of P4 Multispectral.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposurecompensation">ExposureCompensation</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Callback to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setmultispectralshutterspeed"><div class="api-col left">Multispectral Shutter Speed</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setmultispectralshutterspeed_inline">setMultispectralShutterSpeed</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setmultispectralshutterspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMultispectralShutterSpeed</h6></div>

~~~java
 void setMultispectralShutterSpeed(SettingsDefinitions.ShutterSpeed shutterSpeed, @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Sets the shutter speed for the single-band sensors on the multispectral camera. The same shutter speed will be applied to all single-band sensors (sensors  except the RGB one). To see all available shutter speed value settings, see <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashutterspeed">ShutterSpeed</a></code>. The shutter speed should not be set slower  than the video frame rate when the camera's mode is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode_djicameramoderecordvideo">RECORD_VIDEO</a></code>. For example, if the video frame rate is 30fps, the  shutter speed must be <= 1/30. Precondition: The shutter speed can be set only when the camera exposure mode is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode_shutter">SHUTTER_PRIORITY</a></code> mode.  Only supported by multispectral camera of P4 Multispectral.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashutterspeed">ShutterSpeed</a> <font color="#000">shutterSpeed</td><td><font color="#666"><i>Shutter speed value to be set for the single-band sensors. For all available values shutterSpeed can be set to, please check <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashutterspeed">ShutterSpeed</a></code>.  &lt;br&gt; The shutter speed should not be set slower than the video frame rate when the camera's mode is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode_djicameramoderecordvideo">RECORD_VIDEO</a></code>. For example,  if the video frame rate = 30fps, then the shutterSpeed must be &lt;= 1/30.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>Remote execution result error block.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getmultispectralshutterspeed"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getmultispectralshutterspeed_inline">getMultispectralShutterSpeed</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getmultispectralshutterspeed_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMultispectralShutterSpeed</h6></div>

~~~java
 void getMultispectralShutterSpeed(@NonNull CommonCallbacks.CompletionCallbackWith<SettingsDefinitions.ShutterSpeed> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Gets the shutter speed for all single-band sensors (sensors except the RGB one). The shutter speed is only available when the camera exposure mode is <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode_shutter">SHUTTER_PRIORITY</a></code> mode.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashutterspeed">ShutterSpeed</a>&gt; <font color="#000">callback</td><td><font color="#666"><i>Callback to receive the result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_setmultispectralaelock"><div class="api-col left">Multispectral AE Lock</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_setmultispectralaelock_inline">setMultispectralAELock</a></div></div><div class="inline-doc" id="djicamera_camerasettings_setmultispectralaelock_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setMultispectralAELock</h6></div>

~~~java
 void setMultispectralAELock(boolean isLocked, @Nullable CommonCallbacks.CompletionCallback callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Locks or unlocks the single-band sensors on the multispectral camera AELock AE (auto exposure). The same lock state will be applied to all single-band sensors (sensors except the RGB one).



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean <font color="#000">isLocked</td><td><font color="#666"><i><code>true</code> if the the single-band sensors AE is locked, <code>false</code> if it is unlocked.</i></td></tr><tr valign="top"><td><font color="#70BF41">@Nullable <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallback <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the returned execution result.</i></td></tr></table></html></div>

<div class="api-row" id="djicamera_camerasettings_getmultispectralaelock"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamera_camerasettings_getmultispectralaelock_inline">getMultispectralAELock</a></div></div><div class="inline-doc" id="djicamera_camerasettings_getmultispectralaelock_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getMultispectralAELock</h6></div>

~~~java
 void getMultispectralAELock(@NonNull CommonCallbacks.CompletionCallbackWith<Boolean> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Determines if all the single-band (sensors except the RGB one) sensors on the multispectral camera AE (auto exposure) is locked.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull <a href="/Utils/DJICommonCallbacks.html#djicommoncallbacks">CommonCallbacks</a>.CompletionCallbackWith&lt;Boolean&gt; <font color="#000">callback</td><td><font color="#666"><i>Callback to receive the result.</i></td></tr></table></html></div>

<html><p><br></p></html>

##### Related:

<div class="api-row" id="djicamera_camerageneratedtimelapsepreviewcallbackinterface"><div class="api-col left">State Updates</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_CameraGeneratedTimeLapsePreviewCallbackInterface.html">TimeLapsePreviewCallback</a></div></div><div class="api-row" id="djicamera_camerareceivedvideodatacallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_CameraReceivedVideoDataCallbackInterface.html">VideoDataCallback</a></div></div><div class="api-row" id="djicamera_djicamerasystemstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraSystemState.html">SystemState</a></div></div><div class="api-row" id="djicamera_djicameralensstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraLensState.html">FocusState</a></div></div><div class="api-row" id="djicamera_djicamerasdcardstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraSDCardState.html">StorageState</a></div></div><div class="api-row" id="djicamera_djicamerassdstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraSSDState.html">SSDState</a></div></div><div class="api-row" id="djicamera_stabilizationstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_StabilizationState.html">StabilizationState</a></div></div><div class="api-row" id="djicamera_histogramupdatecallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_histogramUpdateCallbackInterface.html">HistogramCallback</a></div></div><div class="api-row" id="djicamera_tapzoomstatecallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_TapZoomStateCallbackInterface.html">TapZoomStateCallback</a></div></div><div class="api-row" id="djicamera_temperaturedatacallbackinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_TemperatureDataCallbackInterface.html">TemperatureDataCallback</a></div></div><div class="api-row" id="djimediamanager"><div class="api-col left">Managers</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJIMediaManager.html">MediaManager</a></div></div><div class="api-row" id="djiplaybackmanager"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJIPlaybackManager.html">PlaybackManager</a></div></div><div class="api-row" id="djicamera_djicameraparameters"><div class="api-col left">Settings</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraParameters.html">Capabilities</a></div></div><div class="api-row" id="djicamera_djicamerasettingsdef"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html">SettingsDefinitions</a></div></div><div class="api-row" id="djicamera_djiflatcameramode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djiflatcameramode_inline">FlatCameraMode</a></div></div><div class="inline-doc" id="djicamera_djiflatcameramode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>FlatCameraMode</h6></div>

~~~java
 enum FlatCameraMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Flat camera mode can be used to set the mode to camera directly. The benefit is no need to set the camera mode to  shoot photo mode or the Record video first. Please use <code><a href="/Components/Camera/DJICamera.html#djicamera_setflatmode">setFlatMode</a></code> to set the flat mode. This is  available only when <code><a href="/Components/Camera/DJICamera.html#djicamera_isflatcameramodesupported">isFlatCameraModeSupported</a></code> returns <code>true</code>.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djiflatcameramode_videonormal_inline"></a>VIDEO_NORMAL</td><td><font color="#666">Sets the camera to record normal videos.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djiflatcameramode_phototimelapse_inline"></a>PHOTO_TIME_LAPSE</td><td><font color="#666">Sets the camera to take a picture (or multiple pictures) continuously at a set time interval.  The camera will merge the photo sequence and the output is a video. The minimum interval for  Video only format is 1 s. The minimum interval for Video+Photo format is 2 s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djiflatcameramode_photoaeb_inline"></a>PHOTO_AEB</td><td><font color="#666">Automatic Exposure Bracketing (AEB) capture. In this mode you can quickly take multiple  shots (the default is 3) at different exposures without having to manually change any settings between frames.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djiflatcameramode_photosingle_inline"></a>PHOTO_SINGLE</td><td><font color="#666">Sets the camera to take a single photo.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djiflatcameramode_photoburst_inline"></a>PHOTO_BURST</td><td><font color="#666">Set the camera to take multiple photos at once.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djiflatcameramode_photohdr_inline"></a>PHOTO_HDR</td><td><font color="#666">Sets the camera to take an HDR photo.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djiflatcameramode_photointerval_inline"></a>PHOTO_INTERVAL</td><td><font color="#666">Sets the camera to take a picture (or multiple pictures) continuously at a set time  interval. The minimum interval for JPEG format of any quality is 2s.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djiflatcameramode_photohyperlight_inline"></a>PHOTO_HYPER_LIGHT</td><td><font color="#666">Sets the camera to take photos in HyperLight mode. It is a setting for low-light  environment to enhance the photo quality while reducing noise significantly.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djiflatcameramode_photopanorama_inline"></a>PHOTO_PANORAMA</td><td><font color="#666">In panorama mode, the aircraft takes a series of photos with different gimbal and aircraft  heading positions. The photos can be stitched with a third-party library.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djiflatcameramode_photoehdr_inline"></a>PHOTO_EHDR</td><td><font color="#666">Sets the camera to take an enhanced-HDR photo. It blends a sequence of photos for  ghost-free high dynamic range photos.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djiflatcameramode_internal_ai_spot_checking_inline"></a>INTERNAL_AI_SPOT_CHECKING</td><td><font color="#666">Internal work mode during smart inspection and it cannot be set manually. This mode might last for less than 10 seconds, during when the user cannot take photo, record a video, enter media playback mode, set spot metering target of <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djilenstype_zoom">ZOOM</a></code> lens type, and set zoom focus length with any lens type. Only <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameralensfocusmode_auto">AUTO</a></code> can be set with <code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djilenstype_zoom">ZOOM</a></code> lens type.  In this mode, remote controller also cannot be used to take photo, record video and adjust focus. It's only supported by Matrice 300 RTK.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djiflatcameramode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The camera work mode is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicamerawhitebalanceinterface"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraWhiteBalanceInterface.html">WhiteBalance</a></div></div><div class="api-row" id="djicamera_djicamerafocusassistantsettings"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraFocusAssistantSettings.html">FocusAssistantSettings</a></div></div><div class="api-row" id="djicamera_djicamerasdcardoperationstate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicamerasdcardoperationstate_inline">SDCardOperationState</a></div></div><div class="inline-doc" id="djicamera_djicamerasdcardoperationstate_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>SDCardOperationState</h6></div>

~~~java
 enum SDCardOperationState 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">Operation states of the camera's SD card.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerasdcardoperationstate_normal_inline"></a>NORMAL</td><td><font color="#666">The SD card is in the normal state.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerasdcardoperationstate_notinserted_inline"></a>NOT_INSERTED</td><td><font color="#666">The SD card is not inserted.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerasdcardoperationstate_invalid_inline"></a>INVALID</td><td><font color="#666">The SD card is in invalid state.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerasdcardoperationstate_readonly_inline"></a>READ_ONLY</td><td><font color="#666">The SD card is in read-only state and write operation is not allowed.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerasdcardoperationstate_formatneeded_inline"></a>FORMAT_NEEDED</td><td><font color="#666">It is required to format the SD card before using it.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerasdcardoperationstate_formatting_inline"></a>FORMATTING</td><td><font color="#666">The SD card is being formatted.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerasdcardoperationstate_invalidfilesystem_inline"></a>INVALID_FILE_SYSTEM</td><td><font color="#666">The SD card is using an invalid file system. Format the SD card before using it.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerasdcardoperationstate_busy_inline"></a>BUSY</td><td><font color="#666">The SD card is busy.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerasdcardoperationstate_full_inline"></a>FULL</td><td><font color="#666">The SD card is full.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerasdcardoperationstate_slow_inline"></a>SLOW</td><td><font color="#666">The SD card is too slow.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerasdcardoperationstate_unknownerror_inline"></a>UNKNOWN_ERROR</td><td><font color="#666">The SD card encounters an unknown error.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerasdcardoperationstate_noremainfileindices_inline"></a>NO_REMAIN_FILE_INDICES</td><td><font color="#666">No remaining file indices for any new photos or videos.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerasdcardoperationstate_initializing_inline"></a>INITIALIZING</td><td><font color="#666">The SD card is in initializing state.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerasdcardoperationstate_formatrecommended_inline"></a>FORMAT_RECOMMENDED</td><td><font color="#666">It is recommended to format the SD card before using it.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerasdcardoperationstate_recoveringfiles_inline"></a>RECOVERING_FILES</td><td><font color="#666">The camera is recovering the damaged files on the SD card.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicamerasdcardoperationstate_writingslowly_inline"></a>WRITING_SLOWLY</td><td><font color="#666">The SD card is being written in a slow speed.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameraphotoaebcount"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraphotoaebcount_inline">PhotoAEBCount</a></div></div><div class="inline-doc" id="djicamera_djicameraphotoaebcount_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>PhotoAEBCount</h6></div>

~~~java
 enum PhotoAEBCount 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_aeb_count_key">CameraKey.PHOTO_AEB_COUNT</a></td></tr></table></html>



##### Description:



<font color="#666">The number of pictures to continuously take at one time in AEB mode. Use with <code>DJICameraPhotoAEBParam</code>.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotoaebcount_3_inline"></a>AEB_COUNT_3</td><td><font color="#666">The number of pictures to continuously take at one time in AEB mode is 3.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotoaebcount_5_inline"></a>AEB_COUNT_5</td><td><font color="#666">The number of pictures to continuously take at one time in AEB mode is 5.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotoaebcount_7_inline"></a>AEB_COUNT_7</td><td><font color="#666">The number of pictures to continuously take at one time in AEB mode is 7.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotoaebcount_unknown_inline"></a>UNKNOWN</td><td><font color="#666">The number of pictures to continuously take at one time in AEB mode is unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameraphototimelapsesettings"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraPhotoTimeLapseSettings.html">PhotoTimeLapseSettings</a></div></div><div class="api-row" id="djicamera_djicameraphotopanoramamode"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraphotopanoramamode_inline">PhotoPanoramaMode</a></div></div><div class="inline-doc" id="djicamera_djicameraphotopanoramamode_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>PhotoPanoramaMode</h6></div>

~~~java
 enum PhotoPanoramaMode 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJICameraKey.html#camerakey_photo_panorama_mode_key">CameraKey.PHOTO_PANORAMA_MODE</a></td></tr></table></html>



##### Description:



<font color="#666">Panorama photo modes.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotopanoramamode_3x3_inline"></a>PANORAMA_MODE_3X3</td><td><font color="#666">Camera will shoot 3 rows of 3 photos. Each photo in a row will be taken with a different aircraft heading. Each row of photos is taken with a different gimbal pitch.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotopanoramamode_3x1_inline"></a>PANORAMA_MODE_3X1</td><td><font color="#666">Camera will shoot 3 photos with the same aircraft heading and different gimbal pitch.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotopanoramamode_sphere_inline"></a>PANORAMA_MODE_SPHERE</td><td><font color="#666">Camera will shoot 8 rows of 3 photos and 1 extra photo (facing downward). Each photo in a row will be taken with a different aircraft heading. Each row of photos is taken with a different gimbal pitch.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotopanoramamode_180_inline"></a>PANORAMA_MODE_180</td><td><font color="#666">Camera will shoot 3 photos with the same gimbal pitch (facing forward) and different aircraft headings.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotopanoramamode_superresolution_inline"></a>PANORAMA_MODE_SUPER_RESOLUTION</td><td><font color="#666">The camera will capture and patch nine photos resulting in a 48-megapixel super resolution photo. It is supported by Spark, Mavic Air, Mavic 2, Mavic 2 Pro,  Mavic 2 Zoom, Mavic 2 Eneterprise, Mavic 2 Enterprise Dual.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameraphotopanoramamode_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

</div>

<div class="api-row" id="djicamera_djicameravideoresolutionandframerate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraVideoResolutionAndFrameRate.html">ResolutionAndFrameRate</a></div></div><div class="api-row" id="djicamera_djicameravideostreamsource"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">enum</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameravideostreamsource_inline">CameraVideoStreamSource</a></div></div><div class="inline-doc" id="djicamera_djicameravideostreamsource_inline"

><div class="article"><h6 ><font color="#AAA">enum </font>CameraVideoStreamSource</h6></div>

~~~java
 enum CameraVideoStreamSource 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.common.camera</td></tr></table></html>



##### Description:



<font color="#666">The enumeration represents which lens the camera stream comes from. The camera video stream will been used to  transfer to image transmission to display and determine which lens were taken photo or recording. It is only  supported by Zenmuse H20 and Zenmuse H20T Camera.



##### Enum Members:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideostreamsource_default_inline"></a>DEFAULT</td><td><font color="#666">The default video stream channel.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideostreamsource_wide_inline"></a>WIDE</td><td><font color="#666">Wide stream. Only supported by Zenmuse H20 and Zenmuse H20T.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideostreamsource_zoom_inline"></a>ZOOM</td><td><font color="#666">Zoom stream. Only supported by Zenmuse H20 and Zenmuse H20T.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideostreamsource_ir_inline"></a>INFRARED_THERMAL</td><td><font color="#666">Infrared thermal stream. Only supported by Zenmuse H20T.</td></tr><tr valign="top"><td><font color="#70BF41"><a href="#djicamera_djicameravideostreamsource_unknown_inline"></a>UNKNOWN</td><td><font color="#666">Unknown.</td></tr></table></html>

##### Class Members:

<div class="api-row" id="djicamera_cameravideostreamsource_callbackinterface"><div class="api-col left">Callback</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_CameraVideoStreamSource_CallbackInterface.html">Callback</a></div></div></div>

<div class="api-row" id="djicamera_colorwaveformsettings"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_ColorWaveformSettings.html">ColorWaveformSettings</a></div></div><div class="api-row" id="djicamera_djicamerassdclipfilenameinterface"><div class="api-col left">SSD Clip File Name</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraSSDClipFileNameInterface.html">SSDClipFileName</a></div></div><div class="api-row" id="djicamera_djicameraoriginalphotosettings"><div class="api-col left">Original Photo Settings</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraOriginalPhotoSettings.html">OriginalPhotoSettings</a></div></div><div class="api-row" id="djicamera_djicameramultispectralstoragesettings"><div class="api-col left">Multispectral Storage Settings</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraMultispectralStorageSettings.html">MultispectralStoragePhotoSettings</a></div></div><div class="api-row" id="djicamera_djicameramultispectralexposurestate"><div class="api-col left">Multispectral Exposure State</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraMultispectralExposureState.html">MultispectralExposureState</a></div></div><div class="api-row" id="djicamera_djicamerawatermarksettings"><div class="api-col left">Watermark Settings</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraWatermarkSettings.html">WatermarkSettings</a></div></div><div class="api-row" id="djicamera_djicameralasermeasureinformation"><div class="api-col left">Laser Measure Info</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJICameraLaserMeasureInformation.html">LaserMeasureInformation</a></div></div><div class="api-row" id="djicamera_djicameradisplaynamephantom3standardcamera"><div class="api-col left">Display Name</div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamephantom3standardcamera_inline">DisplayNamePhantom3StandardCamera</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamephantom3standardcamera_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNamePhantom3StandardCamera</h6></div>

~~~java
 static final String DisplayNamePhantom3StandardCamera =
        DJICameraAbstraction.DisplayNamePhantom3StandardCamera
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for Phantom 3 Standard camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamephantom3advancedcamera"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamephantom3advancedcamera_inline">DisplayNamePhantom3AdvancedCamera</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamephantom3advancedcamera_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNamePhantom3AdvancedCamera</h6></div>

~~~java
 static final String DisplayNamePhantom3AdvancedCamera =
        DJICameraAbstraction.DisplayNamePhantom3AdvancedCamera
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for Phantom 3 Advanced camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamephantom3professionalcamera"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamephantom3professionalcamera_inline">DisplayNamePhantom3ProfessionalCamera</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamephantom3professionalcamera_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNamePhantom3ProfessionalCamera</h6></div>

~~~java
 static final String DisplayNamePhantom3ProfessionalCamera =
        DJICameraAbstraction.DisplayNamePhantom3ProfessionalCamera
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for Phantom 3 Professional camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamephantom34kcamera"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamephantom34kcamera_inline">DisplayNamePhantom34KCamera</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamephantom34kcamera_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNamePhantom34KCamera</h6></div>

~~~java
 static final String DisplayNamePhantom34KCamera = DJICameraAbstraction.DisplayNamePhantom34KCamera
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for Phantom 3 4K camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamex3"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamex3_inline">DisplayNameX3</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamex3_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameX3</h6></div>

~~~java
 static final String DisplayNameX3 = DJICameraAbstraction.DisplayNameX3
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for X3 camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamex5"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamex5_inline">DisplayNameX5</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamex5_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameX5</h6></div>

~~~java
 static final String DisplayNameX5 = DJICameraAbstraction.DisplayNameX5
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for X5 camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamex5r"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamex5r_inline">DisplayNameX5R</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamex5r_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameX5R</h6></div>

~~~java
 static final String DisplayNameX5R = DJICameraAbstraction.DisplayNameX5R
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for X5R camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamephantom4camera"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamephantom4camera_inline">DisplayNamePhantom4Camera</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamephantom4camera_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNamePhantom4Camera</h6></div>

~~~java
 static final String DisplayNamePhantom4Camera = DJICameraAbstraction.DisplayNamePhantom4Camera
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for Phantom 4 camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamephantom4procamera"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamephantom4procamera_inline">DisplaynamePhantom4ProCamera</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamephantom4procamera_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplaynamePhantom4ProCamera</h6></div>

~~~java
 static final String DisplaynamePhantom4ProCamera = DJICameraAbstraction.DisplaynamePhantom4ProCamera
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for Phantom 4 Pro camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamext"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamext_inline">DisplayNameXT</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamext_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameXT</h6></div>

~~~java
 static final String DisplayNameXT = DJICameraAbstraction.DisplayNameXT336
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for Zenmuse XT camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamexts"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamexts_inline">DisplayNameXTS</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamexts_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameXTS</h6></div>

~~~java
 static final String DisplayNameXTS = DJICameraAbstraction.DisplayNameXTS
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for Zenmuse XT S camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamez3"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamez3_inline">DisplayNameZ3</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamez3_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameZ3</h6></div>

~~~java
 static final String DisplayNameZ3 = DJICameraAbstraction.DisplayNameZ3
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for Z3 camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamemavicprocamera"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamemavicprocamera_inline">DisplayNameMavicProCamera</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamemavicprocamera_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameMavicProCamera</h6></div>

~~~java
 static final String DisplayNameMavicProCamera = DJICameraAbstraction.DisplayNameMavicProCamera
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for Mavic Pro camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamesparkcamera"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamesparkcamera_inline">DisplayNameSparkCamera</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamesparkcamera_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameSparkCamera</h6></div>

~~~java
 static final String DisplayNameSparkCamera = DJICameraAbstraction.DisplayNameSparkCamera
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for Spark camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamephantom4prov2camera"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamephantom4prov2camera_inline">DisplaynamePhantom4PV2Camera</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamephantom4prov2camera_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplaynamePhantom4PV2Camera</h6></div>

~~~java
 static final String DisplaynamePhantom4PV2Camera = DJICameraAbstraction.DisplaynamePhantom4PSDRCamera
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for Phantom 4 Pro V2 camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamephantom4rtkcamera"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamephantom4rtkcamera_inline">DisplaynamePhantom4RTKCamera</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamephantom4rtkcamera_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplaynamePhantom4RTKCamera</h6></div>

~~~java
 static final String DisplaynamePhantom4RTKCamera = DJICameraAbstraction.DisplaynamePhantom4RTKCamera
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for Phantom 4 RTK camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamex7"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamex7_inline">DisplayNameX7</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamex7_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameX7</h6></div>

~~~java
 static final String DisplayNameX7 = DJICameraAbstraction.DisplayNameX7
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for X7 camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamext2thermal"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamext2thermal_inline">DisplayNameXT2_IR</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamext2thermal_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameXT2_IR</h6></div>

~~~java
 static final String DisplayNameXT2_IR = DJICameraAbstraction.DisplayNameXT2_IR
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for XT2 thermal camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamext2visual"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamext2visual_inline">DisplayNameXT2_VL</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamext2visual_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameXT2_VL</h6></div>

~~~java
 static final String DisplayNameXT2_VL = DJICameraAbstraction.DisplayNameXT2_VL
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for XT2 visual camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamemavicaircamera"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamemavicaircamera_inline">DisplayNameMavicAirCamera</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamemavicaircamera_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameMavicAirCamera</h6></div>

~~~java
 static final String DisplayNameMavicAirCamera = DJICameraAbstraction.DisplayNameMavicAirCamera
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for Mavic Air camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamemavic2zoomcamera"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamemavic2zoomcamera_inline">DisplayNameMavic2ZoomCamera</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamemavic2zoomcamera_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameMavic2ZoomCamera</h6></div>

~~~java
 static final String DisplayNameMavic2ZoomCamera = DJICameraAbstraction.DisplayNameMavic2ZoomCamera
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for Mavic 2 Zoom camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamemavic2procamera"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamemavic2procamera_inline">DisplayNameMavic2ProCamera</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamemavic2procamera_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameMavic2ProCamera</h6></div>

~~~java
 static final String DisplayNameMavic2ProCamera = DJICameraAbstraction.DisplayNameMavic2ProCamera
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for Mavic 2 Pro camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamemavic2enterprisecamera"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamemavic2enterprisecamera_inline">DisplayNameMavic2EnterpriseCamera</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamemavic2enterprisecamera_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameMavic2EnterpriseCamera</h6></div>

~~~java
 static final String DisplayNameMavic2EnterpriseCamera = DJICameraAbstraction.DisplayNameMavic2EnterpriseCamera
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for Mavic 2 Enterprise.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamemavic2enterprisedualthermal"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamemavic2enterprisedualthermal_inline">DisplayNameMavic2EnterpriseDual_IR</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamemavic2enterprisedualthermal_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameMavic2EnterpriseDual_IR</h6></div>

~~~java
 static final String DisplayNameMavic2EnterpriseDual_IR = DJICameraAbstraction.DisplayNameMavic2EnterpriseDual_IR
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for Mavic 2 Enterprise Dual thermal camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamemavic2enterprisedualvisual"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamemavic2enterprisedualvisual_inline">DisplayNameMavic2EnterpriseDual_VL</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamemavic2enterprisedualvisual_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameMavic2EnterpriseDual_VL</h6></div>

~~~java
 static final String DisplayNameMavic2EnterpriseDual_VL = DJICameraAbstraction.DisplayNameMavic2EnterpriseDual_VL
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for Mavic 2 Enterprise Dual visual camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamephantom4mcamera"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamephantom4mcamera_inline">DisplayNameP4MCamera</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamephantom4mcamera_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameP4MCamera</h6></div>

~~~java
 static final String DisplayNameP4MCamera = DJICameraAbstraction.DisplayNameP4MCamera
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for P4 Multispectral camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamemavicminicamera"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamemavicminicamera_inline">DisplayNameMavicMiniCamera</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamemavicminicamera_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameMavicMiniCamera</h6></div>

~~~java
 static final String DisplayNameMavicMiniCamera = DJICameraAbstraction.DisplayNameMavicMiniCamera
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for Mavic Mini camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamezenmuseh20"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamezenmuseh20_inline">DisplayNameZenmuseH20</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamezenmuseh20_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameZenmuseH20</h6></div>

~~~java
 static final String DisplayNameZenmuseH20 = DJIMultiLensCameraAbstraction.DisplayNameZenmuseH20
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for Zenmuse H20.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamezenmuseh20t"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamezenmuseh20t_inline">DisplayNameZenmuseH20T</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamezenmuseh20t_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameZenmuseH20T</h6></div>

~~~java
 static final String DisplayNameZenmuseH20T = DJIMultiLensCameraAbstraction.DisplayNameZenmuseH20T
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for Zenmuse H20T.

</div>

<div class="api-row" id="djicamera_djicameraxt2_ir_camera_index"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameraxt2_ir_camera_index_inline">XT2_IR_CAMERA_INDEX</a></div></div><div class="inline-doc" id="djicamera_djicameraxt2_ir_camera_index_inline"

><div class="article"><h6 ><font color="#AAA">final </font>XT2_IR_CAMERA_INDEX</h6></div>

~~~java
 static final int XT2_IR_CAMERA_INDEX = DJISDKCacheHWAbstractionLayer.XT2_IR_CAMERA_INDEX
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">Index for the XT2 camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamez30"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamez30_inline">DisplayNameZ30</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamez30_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameZ30</h6></div>

~~~java
 static final String DisplayNameZ30 = DJICameraAbstraction.DisplayNameZ30
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for Z30 camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamex4s"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamex4s_inline">DisplayNameX4S</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamex4s_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameX4S</h6></div>

~~~java
 static final String DisplayNameX4S = DJICameraAbstraction.DisplayNameX4S
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for X4S camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamex5s"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamex5s_inline">DisplayNameX5S</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamex5s_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplayNameX5S</h6></div>

~~~java
 static final String DisplayNameX5S = DJICameraAbstraction.DisplayNameX5S
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for X5S camera.

</div>

<div class="api-row" id="djicamera_djicameradisplaynamephantom4advancedcamera"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">final</div><div class="api-col right"><a class="trigger" href="#djicamera_djicameradisplaynamephantom4advancedcamera_inline">DisplaynamePhantom4AdvancedCamera</a></div></div><div class="inline-doc" id="djicamera_djicameradisplaynamephantom4advancedcamera_inline"

><div class="article"><h6 ><font color="#AAA">final </font>DisplaynamePhantom4AdvancedCamera</h6></div>

~~~java
 static final String DisplaynamePhantom4AdvancedCamera = DJICameraAbstraction.DisplaynamePhantom4AdvancedCamera
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.camera</td></tr></table></html>



##### Description:



<font color="#666">The display name for Phantom 4 Advanced camera.

</div>

<div class="api-row" id="djicamera_camerapeakthreshold"><div class="api-col left">Camera peak Threshold</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_CameraPeakThreshold.html">CameraPeakThreshold</a></div></div><div class="api-row" id="djicamera_djilens"><div class="api-col left">DJILens</div><div class="api-col middle" style="color:#AAA">class</div><div class="api-col right"><a href="/Components/Camera/DJICamera_DJILens.html">Lens</a></div></div>

##### Inherited Methods:

<div class="api-row" id="djibasecomponent_setdjicomponentlistener"><div class="api-col left">dji.sdk.base.BaseComponent</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_setdjicomponentlistener_inline">setComponentListener</a></div></div><div class="inline-doc" id="djibasecomponent_setdjicomponentlistener_inline"

><div class="article"><h6 ><font color="#AAA">method </font>setComponentListener</h6></div>

~~~java
 void setComponentListener(ComponentListener listener) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Sets the listener for the DJI component.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/BaseComponent/DJIBaseComponent_DJIComponentListenerInterface.html#djibasecomponent_djicomponentlistenerinterface">ComponentListener</a> <font color="#000">listener</td><td><font color="#666"><i>The callback of <code><a href="/Components/BaseComponent/DJIBaseComponent_DJIComponentListenerInterface.html#djibasecomponent_djicomponentlistenerinterface">ComponentListener</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djibasecomponent_index"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_index_inline">getIndex</a></div></div><div class="inline-doc" id="djibasecomponent_index_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getIndex</h6></div>

~~~java
 int getIndex() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Returns the component index. Index is zero based. A component will have an index greater than zero when there  are multiple components of the same type on the DJI product, and one of the components already has the index 0.  For instance, M210 can have two gimbal mounted cameras, and will therefore have two gimbal components with indices  0 and 1, and two camera components with indices 0 and 1. For Matrice 600, there are printed numbers on the battery  boxes. The <code><a href="/Components/Battery/DJIBattery.html#djibattery">Battery</a></code> component instance with index 0 corresponds to battery compartment number 1. For Inspire 2  and M200 series, <code><a href="/Components/Battery/DJIBattery.html#djibattery">Battery</a></code> with index 0 corresponds to the battery on the port (left hand) side of the aircraft.  For M210 and M210 RTK, <code><a href="/Components/Camera/DJICamera.html#djicamera">Camera</a></code> and <code><a href="/Components/Gimbal/DJIGimbal.html#djigimbal">Gimbal</a></code> with index 0 corresponds to the camera and gimbal on the port  (left hand) side of the aircraft.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">int</td><td><font color="#666"><i>An int value of index.</i></td></tr></table></html></div>

<div class="api-row" id="djibasecomponent_connected"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_connected_inline">isConnected</a></div></div><div class="inline-doc" id="djibasecomponent_connected_inline"

><div class="article"><h6 ><font color="#AAA">method </font>isConnected</h6></div>

~~~java
 boolean isConnected() 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666"><code>true</code> if the component is connected.



##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">boolean</td><td><font color="#666"><i><code>true</code> if the component is connected.</i></td></tr></table></html></div>

<div class="api-row" id="djibasecomponent_getserialnumber"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_getserialnumber_inline">getSerialNumber</a></div></div><div class="inline-doc" id="djibasecomponent_getserialnumber_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getSerialNumber</h6></div>

~~~java
 void getSerialNumber(@NonNull CompletionCallbackWith<String> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Gets the serial number of the component. Depending on the component, this serial number might not match the serial number found  on the physical component.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value returned.</i></td></tr></table></html></div>

<div class="api-row" id="djibasecomponent_getfirmwareversion"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djibasecomponent_getfirmwareversion_inline">getFirmwareVersion</a></div></div><div class="inline-doc" id="djibasecomponent_getfirmwareversion_inline"

><div class="article"><h6 ><font color="#AAA">method </font>getFirmwareVersion</h6></div>

~~~java
 void getFirmwareVersion(@NonNull CompletionCallbackWith<String> callback) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.base</td></tr></table></html>



##### Description:



<font color="#666">Returns the firmware version of the component. Each component will  have a different firmware version, the combination of which will  form the package firmware version <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct_getfirmwarepackageversion">getFirmwarePackageVersion</a></code> found in <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct">BaseProduct</a></code>.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@NonNull CompletionCallbackWith&lt;String&gt; <font color="#000">callback</td><td><font color="#666"><i>The execution callback with the value(s) returned.</i></td></tr></table></html></div>


