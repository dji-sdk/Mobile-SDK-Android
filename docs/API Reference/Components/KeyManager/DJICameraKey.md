<div class="article"><h1 ><font color="#AAA">class </font>CameraKey</h1></div>

~~~java
 class CameraKey extends DJIKey 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/KeyManager/DJIKey.html#djikey">DJIKey</a></code></td></tr></table></html>



##### Description:



<font color="#666"><code><a href="/Components/KeyManager/DJICameraKey.html#djicamerakey">CameraKey</a></code> is an object dedicated to providing access to Camera  related attributes.



##### Class Members:

<div class="api-row" id="djicamerakey_create"><div class="api-col left">Single Camera Products</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamerakey_create_inline">create</a></div></div><div class="inline-doc" id="djicamerakey_create_inline"

><div class="article"><h6 ><font color="#AAA">method </font>create</h6></div>

~~~java
 static CameraKey create(@CameraParamKey @NonNull String paramKey) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Creates a Camera key.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@CameraParamKey @NonNull String <font color="#000">paramKey</td><td><font color="#666"><i>A valid paramKey.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/KeyManager/DJICameraKey.html#djicamerakey">CameraKey</a></td><td><font color="#666"><i>Camera Key</i></td></tr></table></html></div>

<div class="api-row" id="djicamerakey_create_with_index"><div class="api-col left">Multi Camera Products</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamerakey_create_with_index_inline">create</a></div></div><div class="inline-doc" id="djicamerakey_create_with_index_inline"

><div class="article"><h6 ><font color="#AAA">method </font>create</h6></div>

~~~java
 static CameraKey create(@CameraParamKey @NonNull String paramKey,
                                    @IntRange(from = 0, to = MAX_COMPONENT_INDEX) int componentIndex) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Creates a Camera key at selected index. Use this when the product supports multiple cameras.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@CameraParamKey @NonNull String <font color="#000">paramKey</td><td><font color="#666"><i>A valid paramKey.</i></td></tr><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = MAX_COMPONENT_INDEX) int <font color="#000">componentIndex</td><td><font color="#666"><i>The index of the Camera component.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/KeyManager/DJICameraKey.html#djicamerakey">CameraKey</a></td><td><font color="#666"><i>Camera Key</i></td></tr></table></html></div>

<div class="api-row" id="djicamerakey_createlenskey_with_index"><div class="api-col left">Multi Lens</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djicamerakey_createlenskey_with_index_inline">createLensKey</a></div></div><div class="inline-doc" id="djicamerakey_createlenskey_with_index_inline"

><div class="article"><h6 ><font color="#AAA">method </font>createLensKey</h6></div>

~~~java
 static CameraKey createLensKey(@LensParamKey @NonNull String paramKey,
                                          @IntRange(from = 0, to = MAX_COMPONENT_INDEX) int componentIndex,
                                          @IntRange(from = 0, to = MAX_COMPONENT_INDEX) int subComponentIndex) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Creates a Lens key at selected component index and subComponent Index. Use this when the product supports camera which has multi lens.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@LensParamKey @NonNull String <font color="#000">paramKey</td><td><font color="#666"><i>A valid paramKey.</i></td></tr><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = MAX_COMPONENT_INDEX) int <font color="#000">componentIndex</td><td><font color="#666"><i>The index of the Camera component.</i></td></tr><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = MAX_COMPONENT_INDEX) int <font color="#000">subComponentIndex</td><td><font color="#666"><i>The index of the Camera subcomponent.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/KeyManager/DJICameraKey.html#djicamerakey">CameraKey</a></td><td><font color="#666"><i>Camera Key</i></td></tr></table></html></div>



##### Inherited Methods:



##### Class Keys:

<html><table class="key_table"><tr><td colspan=2><a href="#camerakey_thermal_measurement_mode_key"></a><p class="key_table_key_string key_table_key_first_row">THERMAL_MEASUREMENT_MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalmeasurementmode">ThermalMeasurementMode</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalmeasurementmode">setThermalMeasurementMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_getthermalmeasurementmode">getThermalMeasurementMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalmeasurementmode">ThermalMeasurementMode</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_start_record_video_key"></a><p class="key_table_key_string key_table_key_row">START_RECORD_VIDEO</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_startrecordvideo">startRecordVideo</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_current_thermal_gain_mode_temperature_range_key"></a><p class="key_table_key_string key_table_key_row">CURRENT_THERMAL_GAIN_MODE_TEMPERATURE_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_photo_quick_view_duration_key"></a><p class="key_table_key_string key_table_key_row">PHOTO_QUICK_VIEW_DURATION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setphotoquickviewduration">setPhotoQuickViewDuration</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getphotoquickviewduration">getPhotoQuickViewDuration</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_video_compression_standard_range_key"></a><p class="key_table_key_string key_table_key_row">VIDEO_COMPRESSION_STANDARD_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djivideofilecompressionstandard">VideoFileCompressionStandard</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_ssd_clip_file_name_key"></a><p class="key_table_key_string key_table_key_row">SSD_CLIP_FILE_NAME</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSSDClipFileNameInterface.html#djicamera_djicamerassdclipfilenameinterface">SSDClipFileName</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_raw_photo_burst_count_key"></a><p class="key_table_key_string key_table_key_row">RAW_PHOTO_BURST_COUNT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSSDState.html#djicamera_djicamerassdstate_rawphotoburstcount">getRAWPhotoBurstCount</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_adjustable_aperture_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_ADJUSTABLE_APERTURE_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_isadjustableaperturesupported">isAdjustableApertureSupported</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_camera_storage_location_key"></a><p class="key_table_key_string key_table_key_row">CAMERA_STORAGE_LOCATION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerastoragelocation">StorageLocation</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerastoragelocation">StorageLocation</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_ace_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_ACE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalace">setThermalACE</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_getthermalace">getThermalACE</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_video_file_compression_standard_key"></a><p class="key_table_key_string key_table_key_row">VIDEO_FILE_COMPRESSION_STANDARD</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djivideofilecompressionstandard">VideoFileCompressionStandard</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setvideofilecompressionstandard">setVideoFileCompressionStandard</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getvideofilecompressionstandard">getVideoFileCompressionStandard</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djivideofilecompressionstandard">VideoFileCompressionStandard</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_adjustable_focal_point_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_ADJUSTABLE_FOCAL_POINT_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_isadjustablefocalpointsupported">isAdjustableFocalPointSupported</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_exposure_state_key"></a><p class="key_table_key_string key_table_key_row">EXPOSURE_STATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_tap_zoom_enabled_key"></a><p class="key_table_key_string key_table_key_row">TAP_ZOOM_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_settapzoomenabled">setTapZoomEnabled</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_gettapzoomenabled">getTapZoomEnabled</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_shutter_speed_key"></a><p class="key_table_key_string key_table_key_row">SHUTTER_SPEED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashutterspeed">ShutterSpeed</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setshutterspeed">setShutterSpeed</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getshutterspeed">getShutterSpeed</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashutterspeed">ShutterSpeed</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_trigger_thermal_ffc_key"></a><p class="key_table_key_string key_table_key_row">TRIGGER_THERMAL_FFC</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_triggerthermalffcmode">triggerThermalFFC</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_histogram_light_values_key"></a><p class="key_table_key_string key_table_key_row">HISTOGRAM_LIGHT_VALUES</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Short[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_histogramUpdateCallbackInterface.html#djicamera_updatehistogramlightvalue">onUpdate</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_tap_zoom_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_TAP_ZOOM_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_istapzoomsupported">isTapZoomSupported</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_photo_file_format_key"></a><p class="key_table_key_string key_table_key_row">PHOTO_FILE_FORMAT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotofileformat">PhotoFileFormat</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setphotofileformat">setPhotoFileFormat</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getphotofileformat">getPhotoFileFormat</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotofileformat">PhotoFileFormat</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_exposure_settings_key"></a><p class="key_table_key_string key_table_key_row">EXPOSURE_SETTINGS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraExposureParameters.html#djicamera_djicameraexposureparameters">ExposureSettings</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraExposureParameters.html#djicamera_djicameraexposureparameters">ExposureSettings</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_CameraUpdatedCurrentExposureValuesCallbackInterface.html#djicamera_cameraupdatedcurrentexposurevaluescallbackinterface">Callback</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_CameraUpdatedCurrentExposureValuesCallbackInterface.html#djicamera_didupdatecurrentexposureparameters">onUpdate</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_metering_mode_key"></a><p class="key_table_key_string key_table_key_row">METERING_MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerameteringmode">MeteringMode</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setmeteringmode">setMeteringMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getmeteringmode">getMeteringMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerameteringmode">MeteringMode</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_shooting_single_photo_in_raw_format_key"></a><p class="key_table_key_string key_table_key_row">IS_SHOOTING_SINGLE_PHOTO_IN_RAW_FORMAT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSystemState.html#djicamera_djicamerasystemstate_isshootingsinglephotoinrawformat">isShootingSinglePhotoInRAWFormat</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_led_auto_turn_off_enabled_key"></a><p class="key_table_key_string key_table_key_row">LED_AUTO_TURN_OFF_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setautoturnoffledenabled">setLEDAutoTurnOffEnabled</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getautoturnoffledenabled">getLEDAutoTurnOffEnabled</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_isotherm_lower_value_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_ISOTHERM_LOWER_VALUE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalisothermlowervalue">setThermalIsothermLowerValue</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_getthermalisothermlowervalue">getThermalIsothermLowerValue</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_innerstorage_is_inserted_key"></a><p class="key_table_key_string key_table_key_row">INNERSTORAGE_IS_INSERTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_ssd_color_range_key"></a><p class="key_table_key_string key_table_key_row">SSD_COLOR_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdcolor">SSDColor</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdcolor">SSDColor</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_demarcate_value_key"></a><p class="key_table_key_string key_table_key_row">DEMARCATE_VALUE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_histogram_enabled_key"></a><p class="key_table_key_string key_table_key_row">HISTOGRAM_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_sethistogramenabled">setHistogramEnabled</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_gethistogramenabled">getHistogramEnabled</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_isotherm_middle_value_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_ISOTHERM_MIDDLE_VALUE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalisothermmiddlevalue">setThermalIsothermMiddleValue</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_getthermalisothermmiddlevalue">getThermalIsothermMiddleValue</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_brightness_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_BRIGHTNESS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalbrightness">setThermalBrightness</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_getthermalbrightness">getThermalBrightness</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_dewarping_enabled_key"></a><p class="key_table_key_string key_table_key_row">DEWARPING_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_is_mechanical_shutter_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_MECHANICAL_SHUTTER_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_ssd_operation_state_key"></a><p class="key_table_key_string key_table_key_row">SSD_OPERATION_STATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdoperationstate">SSDOperationState</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSSDState.html#djicamera_djicamerassdstate_operationstate">getSSDOperationState</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdoperationstate">SSDOperationState</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_pip_position_key"></a><p class="key_table_key_string key_table_key_row">PIP_POSITION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.PIPPosition</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerapipposition">PIPPosition</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_interval_shoot_countdown_key"></a><p class="key_table_key_string key_table_key_row">INTERVAL_SHOOT_COUNTDOWN</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_iso_key"></a><p class="key_table_key_string key_table_key_row">ISO</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>ISO</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setiso">setISO</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getiso">getISO</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraiso">ISO</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_contrast_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_CONTRAST</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalcontrast">setThermalContrast</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_getthermalcontrast">getThermalContrast</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_start_shoot_photo_key"></a><p class="key_table_key_string key_table_key_row">START_SHOOT_PHOTO</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_startshootphoto">startShootPhoto</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_infrared_thermal_camera_sensor_burning_protection_enabled_key"></a><p class="key_table_key_string key_table_key_row">INFRARED_THERMAL_CAMERA_SENSOR_BURNING_PROTECTION_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_laser_enabled_key"></a><p class="key_table_key_string key_table_key_row">LASER_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_is_shooting_shallow_focus_photo_key"></a><p class="key_table_key_string key_table_key_row">IS_SHOOTING_SHALLOW_FOCUS_PHOTO</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_laser_measure_information_key"></a><p class="key_table_key_string key_table_key_row">LASER_MEASURE_INFORMATION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraLaserMeasureInformation.html#djicamera_djicameralasermeasureinformation">LaserMeasureInformation</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_is_shooting_panorama_photo_key"></a><p class="key_table_key_string key_table_key_row">IS_SHOOTING_PANORAMA_PHOTO</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_innerstorage_is_initializing_key"></a><p class="key_table_key_string key_table_key_row">INNERSTORAGE_IS_INITIALIZING</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_area_temperature_aggregations_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_AREA_TEMPERATURE_AGGREGATIONS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraThermalAreaTemperatureAggregations.html#djicamera_djicamerathermalareatemperatureaggregations">ThermalAreaTemperatureAggregations</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraThermalAreaTemperatureAggregations.html#djicamera_djicamerathermalareatemperatureaggregations">ThermalAreaTemperatureAggregations</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_ThermalCameraAreaTemperatureAggregationsUpdatedCallbackInterface.html#djicamera_thermalcameraareatemperatureaggregationsupdatedcallbackinterface">Callback</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_ThermalCameraAreaTemperatureAggregationsUpdatedCallbackInterface.html#djicamera_didupdateareatemperatureaggregations">onUpdate</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_processing_panorama_photo_key"></a><p class="key_table_key_string key_table_key_row">IS_PROCESSING_PANORAMA_PHOTO</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_camera_type_key"></a><p class="key_table_key_string key_table_key_row">CAMERA_TYPE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.CameraType</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_is_thermal_lens_key"></a><p class="key_table_key_string key_table_key_row">IS_THERMAL_LENS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_mode_key"></a><p class="key_table_key_string key_table_key_row">MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode">CameraMode</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSystemState.html#djicamera_djicamerasystemstate_mode">getMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_setcameramode">setMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_getcameramode">getMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode">CameraMode</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_exposure_compensation_key"></a><p class="key_table_key_string key_table_key_row">EXPOSURE_COMPENSATION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposurecompensation">ExposureCompensation</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setexposurecompensation">setExposureCompensation</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getexposurecompensation">getExposureCompensation</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposurecompensation">ExposureCompensation</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_ssd_video_resolution_range_key"></a><p class="key_table_key_string key_table_key_row">SSD_VIDEO_RESOLUTION_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoresolution">VideoResolution</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoresolution">VideoResolution</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_sdcard_is_invalid_format_key"></a><p class="key_table_key_string key_table_key_row">SDCARD_IS_INVALID_FORMAT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSDCardState.html#djicamera_djicamerasdcardstate_isinvalidformat">isInvalidFormat</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_stop_shoot_photo_key"></a><p class="key_table_key_string key_table_key_row">STOP_SHOOT_PHOTO</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_stopshootphoto">stopShootPhoto</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_super_resolution_state_key"></a><p class="key_table_key_string key_table_key_row">SUPER_RESOLUTION_STATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>SuperResolutionState</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_mechanical_shutter_enabled_key"></a><p class="key_table_key_string key_table_key_row">MECHANICAL_SHUTTER_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_window_temperature_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_WINDOW_TEMPERATURE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraThermalExternalSceneSettings.html#djicamera_djicamerathermalexternalscenesettings_windowtemperature">getWindowTemperature</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalwindowtemperature">setThermalWindowTemperature</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_camera_video_stream_source_key"></a><p class="key_table_key_string key_table_key_row">CAMERA_VIDEO_STREAM_SOURCE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera.html#djicamera_djicameravideostreamsource">CameraVideoStreamSource</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_sdcard_is_verified_key"></a><p class="key_table_key_string key_table_key_row">SDCARD_IS_VERIFIED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSDCardState.html#djicamera_djicamerasdcardstate_isverified">isVerified</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_orientation_key"></a><p class="key_table_key_string key_table_key_row">ORIENTATION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraorientation">Orientation</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setorientation">setOrientation</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getorientation">getOrientation</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraorientation">Orientation</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_stop_continuous_optical_zoom_key"></a><p class="key_table_key_string key_table_key_row">STOP_CONTINUOUS_OPTICAL_ZOOM</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_stopcontinuousopticalzoom">stopContinuousOpticalZoom</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_audio_gain_key"></a><p class="key_table_key_string key_table_key_row">AUDIO_GAIN</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setaudiogain">setAudioGain</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getaudiogain">getAudioGain</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_multi_spectral_shutter_speed_range_key"></a><p class="key_table_key_string key_table_key_row">MULTI_SPECTRAL_SHUTTER_SPEED_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashutterspeed">ShutterSpeed</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_serial_number_key"></a><p class="key_table_key_string key_table_key_row">SERIAL_NUMBER</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>String</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_pano_original_images_format_range_key"></a><p class="key_table_key_string key_table_key_row">PANO_ORIGINAL_IMAGES_FORMAT_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotofileformat">PhotoFileFormat</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotofileformat">PhotoFileFormat</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_current_video_recording_time_in_seconds_key"></a><p class="key_table_key_string key_table_key_row">CURRENT_VIDEO_RECORDING_TIME_IN_SECONDS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSystemState.html#djicamera_djicamerasystemstate_currentvideorecordingtimeinseconds">getCurrentVideoRecordingTimeInSeconds</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_roi_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_ROI</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalroi">ThermalROI</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalroi">setThermalROI</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_getthermalroi">getThermalROI</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalroi">ThermalROI</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_hyperlapse_original_photo_settings_key"></a><p class="key_table_key_string key_table_key_row">HYPERLAPSE_ORIGINAL_PHOTO_SETTINGS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraOriginalPhotoSettings.html#djicamera_djicameraoriginalphotosettings">OriginalPhotoSettings</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_msx_level_key"></a><p class="key_table_key_string key_table_key_row">MSX_LEVEL</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_stop_record_video_in_cache_key"></a><p class="key_table_key_string key_table_key_row">STOP_RECORD_VIDEO_IN_CACHE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_camera_target_focal_length_key"></a><p class="key_table_key_string key_table_key_row">CAMERA_TARGET_FOCAL_LENGTH</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_sdcard_is_repairing_files_key"></a><p class="key_table_key_string key_table_key_row">SDCARD_IS_REPAIRING_FILES</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_sdcard_is_write_slow_key"></a><p class="key_table_key_string key_table_key_row">SDCARD_IS_WRITE_SLOW</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_stop_log_export_key"></a><p class="key_table_key_string key_table_key_row">STOP_LOG_EXPORT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_video_caption_enabled_key"></a><p class="key_table_key_string key_table_key_row">VIDEO_CAPTION_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setvideocaptionenabled">setVideoCaptionEnabled</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getvideocaptionenabled">getVideoCaptionEnabled</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_exposure_compensation_range_key"></a><p class="key_table_key_string key_table_key_row">EXPOSURE_COMPENSATION_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposurecompensation">ExposureCompensation</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposurecompensation">ExposureCompensation</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraParameters.html#djicamera_djicameraparameters_supportedcameraexposurecompensationrange">exposureCompensationRange</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_shooting_super_resolution_photo_key"></a><p class="key_table_key_string key_table_key_row">IS_SHOOTING_SUPER_RESOLUTION_PHOTO</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_camera_mf_demarcate_state_key"></a><p class="key_table_key_string key_table_key_row">CAMERA_MF_DEMARCATE_STATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>DataCameraGetPushShotInfo.MFDemarcateState</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_innerstorage_is_invalid_format_key"></a><p class="key_table_key_string key_table_key_row">INNERSTORAGE_IS_INVALID_FORMAT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_is_afc_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_AFC_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_dual_feed_horizontal_alignment_offset_range_key"></a><p class="key_table_key_string key_table_key_row">DUAL_FEED_HORIZONTAL_ALIGNMENT_OFFSET_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_display_mode_key"></a><p class="key_table_key_string key_table_key_row">DISPLAY_MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameradisplaymode">DisplayMode</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameradisplaymode">DisplayMode</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_resolution_frame_rate_key"></a><p class="key_table_key_string key_table_key_row">RESOLUTION_FRAME_RATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraVideoResolutionAndFrameRate.html#djicamera_djicameravideoresolutionandframerate">ResolutionAndFrameRate</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setvideoresolutionandframerate">setVideoResolutionAndFrameRate</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getvideoresolutionandframerate">getVideoResolutionAndFrameRate</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_window_transmission_coefficient_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_WINDOW_TRANSMISSION_COEFFICIENT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraThermalExternalSceneSettings.html#djicamera_djicamerathermalexternalscenesettings_windowtransmissioncoefficient">getWindowTransmissionCoefficient</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalwindowtransmissioncoefficient">setThermalWindowTransmissionCoefficient</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_custom_information_key"></a><p class="key_table_key_string key_table_key_row">CUSTOM_INFORMATION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>String</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setmediafilecustominformation">setMediaFileCustomInformation</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getmediafilecustominformation">getMediaFileCustomInformation</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_anti_flicker_range_key"></a><p class="key_table_key_string key_table_key_row">ANTI_FLICKER_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraantiflicker">AntiFlickerFrequency</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraantiflicker">AntiFlickerFrequency</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_storage_state_key"></a><p class="key_table_key_string key_table_key_row">STORAGE_STATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera.html#djicamera_djicamerasdcardoperationstate">SDCardOperationState</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_color_waveform_display_state_key"></a><p class="key_table_key_string key_table_key_row">COLOR_WAVEFORM_DISPLAY_STATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_ColorWaveformSettings.html#djicamera_colorwaveformsettings">ColorWaveformSettings</a>.<a href="/Components/Camera/DJICamera_ColorWaveformSettings.html#djicamera_colorwaveformsettings_colorwaveformdisplaystate">ColorWaveformDisplayState</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_ColorWaveformSettings.html#djicamera_colorwaveformsettings_colorwaveformdisplaystate">ColorWaveformDisplayState</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_optical_zoom_spec_key"></a><p class="key_table_key_string key_table_key_row">OPTICAL_ZOOM_SPEC</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraOpticalZoomSpec.html#djicamera_djicameraopticalzoomspec">OpticalZoomSpec</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getopticalzoomspec">getOpticalZoomSpec</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraOpticalZoomSpec.html#djicamera_djicameraopticalzoomspec">OpticalZoomSpec</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_has_error_key"></a><p class="key_table_key_string key_table_key_row">HAS_ERROR</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSystemState.html#djicamera_djicamerasystemstate_iscameraerror">hasError</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_turn_off_fan_when_possible_key"></a><p class="key_table_key_string key_table_key_row">TURN_OFF_FAN_WHEN_POSSIBLE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setturnofffanwhenpossible">setTurnOffFanWhenPossible</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getturnofffanwhenpossible">getTurnOffFanWhenPossible</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_innerstorage_total_space_in_mb_key"></a><p class="key_table_key_string key_table_key_row">INNERSTORAGE_TOTAL_SPACE_IN_MB</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_is_multi_video_stream_source_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_MULTI_VIDEO_STREAM_SOURCE_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_ssd_video_recording_enabled_key"></a><p class="key_table_key_string key_table_key_row">SSD_VIDEO_RECORDING_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_setssdvideorecordingenabled">setSSDVideoRecordingEnabled</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_getssdvideorecordingenabled">getSSDVideoRecordingEnabled</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_video_file_format_range_key"></a><p class="key_table_key_string key_table_key_row">VIDEO_FILE_FORMAT_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideofileformat">VideoFileFormat</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideofileformat">VideoFileFormat</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_hybrid_zoom_spec_key"></a><p class="key_table_key_string key_table_key_row">HYBRID_ZOOM_SPEC</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraHybridZoomSpec.html#djicamera_djicamerahybridzoomspec">HybridZoomSpec</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_lens_is_installed_key"></a><p class="key_table_key_string key_table_key_row">LENS_IS_INSTALLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraLensState.html#djicamera_djicameralensstate_islensinstalled">isLensMounted</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_sdcard_needs_formatting_key"></a><p class="key_table_key_string key_table_key_row">SDCARD_NEEDS_FORMATTING</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_white_balance_present_range_key"></a><p class="key_table_key_string key_table_key_row">WHITE_BALANCE_PRESENT_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerawhitebalance">WhiteBalancePreset</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerawhitebalance">WhiteBalancePreset</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_super_resolution_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_SUPER_RESOLUTION_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_camera_color_key"></a><p class="key_table_key_string key_table_key_row">CAMERA_COLOR</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameradigitalfilter">CameraColor</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setdigitalfilter">setColor</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getdigitalfilter">getColor</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameradigitalfilter">CameraColor</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_hyperlapse_original_images_format_range_key"></a><p class="key_table_key_string key_table_key_row">HYPERLAPSE_ORIGINAL_IMAGES_FORMAT_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotofileformat">PhotoFileFormat</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_is_shooting_raw_burst_photo_key"></a><p class="key_table_key_string key_table_key_row">IS_SHOOTING_RAW_BURST_PHOTO</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSystemState.html#djicamera_djicamerasystemstate_isshootingrawburstphoto">isShootingRAWBurstPhoto</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_audio_recording_enabled_key"></a><p class="key_table_key_string key_table_key_row">AUDIO_RECORDING_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setaudiorecordenabled">setAudioRecordingEnabled</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getaudiorecordenabled">getAudioRecordingEnabled</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_sdcard_is_initializing_key"></a><p class="key_table_key_string key_table_key_row">SDCARD_IS_INITIALIZING</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSDCardState.html#djicamera_djicamerasdcardstate_isinitializing">isInitializing</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_hd_live_view_enabled_key"></a><p class="key_table_key_string key_table_key_row">HD_LIVE_VIEW_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_sethighdefinitionliveviewenabled">setHDLiveViewEnabled</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_gethighdefinitionliveviewenabled">getHDLiveViewEnabled</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_ssd_is_connected_key"></a><p class="key_table_key_string key_table_key_row">SSD_IS_CONNECTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSSDState.html#djicamera_djicamerassdstate_isconnected">isConnected</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_lens_is_af_switch_on_key"></a><p class="key_table_key_string key_table_key_row">LENS_IS_AF_SWITCH_ON</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraLensState.html#djicamera_djicameralensstate_isafswitchon">isAFSwitchOn</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_rc_wheel_mode_key"></a><p class="key_table_key_string key_table_key_row">RC_WHEEL_MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>DataCameraGetPushShotParams.RcWheelMode</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_is_shooting_burst_photo_key"></a><p class="key_table_key_string key_table_key_row">IS_SHOOTING_BURST_PHOTO</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSystemState.html#djicamera_djicamerasystemstate_isshootingburstphoto">isShootingBurstPhoto</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_gain_mode_temperature_range_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_GAIN_MODE_TEMPERATURE_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.GainModeTemperatureRange</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_atmospheric_transmission_coefficient_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_ATMOSPHERIC_TRANSMISSION_COEFFICIENT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraThermalExternalSceneSettings.html#djicamera_djicamerathermalexternalscenesettings_atmospherictransmissioncoefficient">getAtmosphericTransmissionCoefficient</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_palette_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_PALETTE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalpalette">ThermalPalette</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalpalette">setThermalPalette</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_getthermalpalette">getThermalPalette</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalpalette">ThermalPalette</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_interchangeable_lens_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_INTERCHANGEABLE_LENS_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_ischangeablelenssupported">isInterchangeableLensSupported</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_sensor_cleaning_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_SENSOR_CLEANING_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_stop_record_video_key"></a><p class="key_table_key_string key_table_key_row">STOP_RECORD_VIDEO</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_stoprecordvideo">stopRecordVideo</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_temperature_unit_key"></a><p class="key_table_key_string key_table_key_row">TEMPERATURE_UNIT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameratemperatureunit">TemperatureUnit</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameratemperatureunit">TemperatureUnit</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_media_download_mode_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_MEDIA_DOWNLOAD_MODE_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_media_ismediadownloadmodesupported">isMediaDownloadModeSupported</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_photo_file_format_range_key"></a><p class="key_table_key_string key_table_key_row">PHOTO_FILE_FORMAT_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotofileformat">PhotoFileFormat</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotofileformat">PhotoFileFormat</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_white_balance_custom_color_temperature_range_key"></a><p class="key_table_key_string key_table_key_row">WHITE_BALANCE_CUSTOM_COLOR_TEMPERATURE_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>int[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_ssd_video_licenses_key"></a><p class="key_table_key_string key_table_key_row">SSD_VIDEO_LICENSES</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideolicense">CameraSSDVideoLicense</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_getssdvideolicenses">getSSDVideoLicenses</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideolicense">CameraSSDVideoLicense</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_irc_enable_key"></a><p class="key_table_key_string key_table_key_row">IRC_ENABLE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_photo_panorama_mode_key"></a><p class="key_table_key_string key_table_key_row">PHOTO_PANORAMA_MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera.html#djicamera_djicameraphotopanoramamode">PhotoPanoramaMode</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setphotopanoramamode">setPhotoPanoramaMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getphotopanoramamode">getPhotoPanoramaMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_djicameraphotopanoramamode">PhotoPanoramaMode</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_last_camera_video_stream_source_key"></a><p class="key_table_key_string key_table_key_row">LAST_CAMERA_VIDEO_STREAM_SOURCE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera.html#djicamera_djicameravideostreamsource">CameraVideoStreamSource</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_mode_range_key"></a><p class="key_table_key_string key_table_key_row">MODE_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode">CameraMode</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameramode">CameraMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraParameters.html#djicamera_djicameraparameters_supportedcameramoderange">modeRange</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_recording_key"></a><p class="key_table_key_string key_table_key_row">IS_RECORDING</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSystemState.html#djicamera_djicamerasystemstate_isrecording">isRecording</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_video_playback_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_VIDEO_PLAYBACK_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_sdcard_has_error_key"></a><p class="key_table_key_string key_table_key_row">SDCARD_HAS_ERROR</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSDCardState.html#djicamera_djicamerasdcardstate_haserror">hasError</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_is_ffc_mode_supported_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_IS_FFC_MODE_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_start_sensor_cleaning_key"></a><p class="key_table_key_string key_table_key_row">START_SENSOR_CLEANING</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_log_export_state_key"></a><p class="key_table_key_string key_table_key_row">LOG_EXPORT_STATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>LogExportState</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_digital_zoom_factor_key"></a><p class="key_table_key_string key_table_key_row">DIGITAL_ZOOM_FACTOR</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setdigitalzoomscale">setDigitalZoomFactor</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getdigitalzoomscale">getDigitalZoomFactor</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_exit_sensor_cleaning_mode_key"></a><p class="key_table_key_string key_table_key_row">EXIT_SENSOR_CLEANING_MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_is_shooting_interval_photo_key"></a><p class="key_table_key_string key_table_key_row">IS_SHOOTING_INTERVAL_PHOTO</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSystemState.html#djicamera_djicamerasystemstate_isshootingintervalphoto">isShootingIntervalPhoto</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_load_settings_from_profile_key"></a><p class="key_table_key_string key_table_key_row">LOAD_SETTINGS_FROM_PROFILE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameracustomsettings">CustomSettingsProfile</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_loadsettings">loadSettingsFromProfile</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameracustomsettings">CustomSettingsProfile</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_photo_aspect_ratio_range_key"></a><p class="key_table_key_string key_table_key_row">PHOTO_ASPECT_RATIO_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotoaspectratio">PhotoAspectRatio</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotoaspectratio">PhotoAspectRatio</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_ssd_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_SSD_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_isssdsupported">isSSDSupported</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_photo_raw_burst_count_key"></a><p class="key_table_key_string key_table_key_row">PHOTO_RAW_BURST_COUNT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotoburstcount">PhotoBurstCount</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setphotorawburstcount">setPhotoRAWBurstCount</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getphotorawburstcount">getPhotoRAWBurstCount</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotoburstcount">PhotoBurstCount</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_innerstorage_state_key"></a><p class="key_table_key_string key_table_key_row">INNERSTORAGE_STATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera.html#djicamera_djicamerasdcardoperationstate">SDCardOperationState</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_is_shooting_single_photo_key"></a><p class="key_table_key_string key_table_key_row">IS_SHOOTING_SINGLE_PHOTO</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSystemState.html#djicamera_djicamerasystemstate_isshootingsinglephoto">isShootingSinglePhoto</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_focus_target_key"></a><p class="key_table_key_string key_table_key_row">FOCUS_TARGET</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>PointF</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setlensfocustarget">setFocusTarget</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getlensfocustarget">getFocusTarget</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_sdcard_available_recording_time_in_seconds_key"></a><p class="key_table_key_string key_table_key_row">SDCARD_AVAILABLE_RECORDING_TIME_IN_SECONDS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSDCardState.html#djicamera_djicamerasdcardstate_availablerecordingtimeinseconds">getAvailableRecordingTimeInSeconds</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_digital_zoom_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_DIGITAL_ZOOM_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_isdigitalzoomscalesupported">isDigitalZoomSupported</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_focus_mode_key"></a><p class="key_table_key_string key_table_key_row">FOCUS_MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameralensfocusmode">FocusMode</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraLensState.html#djicamera_djicameralensstate_focusmode">getFocusMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setlensfocusmode">setFocusMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getlensfocusmode">getFocusMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameralensfocusmode">FocusMode</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_window_reflection_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_WINDOW_REFLECTION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraThermalExternalSceneSettings.html#djicamera_djicamerathermalexternalscenesettings_windowreflection">getWindowReflection</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalwindowreflection">setThermalWindowReflection</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_innerstorage_is_full_key"></a><p class="key_table_key_string key_table_key_row">INNERSTORAGE_IS_FULL</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_atmospheric_temperature_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_ATMOSPHERIC_TEMPERATURE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraThermalExternalSceneSettings.html#djicamera_djicamerathermalexternalscenesettings_atmospherictemperature">getAtmosphericTemperature</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalatmospherictemperature">setThermalAtmosphericTemperature</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalatmospherictransmissioncoefficient">setThermalAtmosphericTransmissionCoefficient</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_innerstorage_is_verified_key"></a><p class="key_table_key_string key_table_key_row">INNERSTORAGE_IS_VERIFIED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_ei_value_range_key"></a><p class="key_table_key_string key_table_key_row">EI_VALUE_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>int[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_dual_feed_vertical_alignment_offset_key"></a><p class="key_table_key_string key_table_key_row">DUAL_FEED_VERTICAL_ALIGNMENT_OFFSET</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_sdcard_total_space_in_mb_key"></a><p class="key_table_key_string key_table_key_row">SDCARD_TOTAL_SPACE_IN_MB</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSDCardState.html#djicamera_djicamerasdcardstate_totalspaceinmegabytes">getTotalSpaceInMB</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_clear_log_export_key"></a><p class="key_table_key_string key_table_key_row">CLEAR_LOG_EXPORT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_format_internal_storage_key"></a><p class="key_table_key_string key_table_key_row">FORMAT_INTERNAL_STORAGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_capture_camera_stream_settings_key"></a><p class="key_table_key_string key_table_key_row">CAPTURE_CAMERA_STREAM_SETTINGS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_sdcard_is_full_key"></a><p class="key_table_key_string key_table_key_row">SDCARD_IS_FULL</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSDCardState.html#djicamera_djicamerasdcardstate_isfull">isFull</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_camera_color_range_key"></a><p class="key_table_key_string key_table_key_row">CAMERA_COLOR_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameradigitalfilter">CameraColor</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameradigitalfilter">CameraColor</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_camera_video_stream_source_range_key"></a><p class="key_table_key_string key_table_key_row">CAMERA_VIDEO_STREAM_SOURCE_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera.html#djicamera_djicameravideostreamsource">CameraVideoStreamSource</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_photo_time_lapse_settings_key"></a><p class="key_table_key_string key_table_key_row">PHOTO_TIME_LAPSE_SETTINGS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraPhotoTimeLapseSettings.html#djicamera_djicameraphototimelapsesettings">PhotoTimeLapseSettings</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setphototimelapse">setPhotoTimeLapseSettings</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getphototimelapse">getPhotoTimeLapseSettings</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphototimelapsefileformat">PhotoTimeLapseFileFormat</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraPhotoTimeLapseSettings.html#djicamera_djicameraphototimelapsesettings">PhotoTimeLapseSettings</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_photo_aspect_ratio_key"></a><p class="key_table_key_string key_table_key_row">PHOTO_ASPECT_RATIO</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotoaspectratio">PhotoAspectRatio</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getphotoratio">getPhotoAspectRatio</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotoaspectratio">PhotoAspectRatio</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_innerstorage_remaining_space_in_mb_key"></a><p class="key_table_key_string key_table_key_row">INNERSTORAGE_REMAINING_SPACE_IN_MB</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_video_standard_key"></a><p class="key_table_key_string key_table_key_row">VIDEO_STANDARD</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideostandard">VideoStandard</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setvideostandard">setVideoStandard</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getvideostandard">getVideoStandard</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideostandard">VideoStandard</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_watermark_display_content_settings_key"></a><p class="key_table_key_string key_table_key_row">WATERMARK_DISPLAY_CONTENT_SETTINGS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>WatermarkDisplayContentSettings</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_display_mode_range_key"></a><p class="key_table_key_string key_table_key_row">DISPLAY_MODE_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameradisplaymode">DisplayMode</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_dual_feed_horizontal_alignment_offset_key"></a><p class="key_table_key_string key_table_key_row">DUAL_FEED_HORIZONTAL_ALIGNMENT_OFFSET</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_shoot_photo_mode_key"></a><p class="key_table_key_string key_table_key_row">SHOOT_PHOTO_MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashootphotomode">ShootPhotoMode</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_setshootphotomode">setShootPhotoMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_getshootphotomode">getShootPhotoMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashootphotomode">ShootPhotoMode</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_recording_state_key"></a><p class="key_table_key_string key_table_key_row">RECORDING_STATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>CameraRecordingState</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_color_waveform_enabled_key"></a><p class="key_table_key_string key_table_key_row">COLOR_WAVEFORM_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_start_record_video_in_cache_key"></a><p class="key_table_key_string key_table_key_row">START_RECORD_VIDEO_IN_CACHE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_digital_zoom_factor_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_DIGITAL_ZOOM_FACTOR</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermaldigitalzoomscale">ThermalDigitalZoomFactor</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermaldigitalzoomscale">setThermalDigitalZoomFactor</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_getthermaldigitalzoomscale">getThermalDigitalZoomFactor</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermaldigitalzoomscale">ThermalDigitalZoomFactor</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_palette_range_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_PALETTE_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalpalette">ThermalPalette</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_lens_information_key"></a><p class="key_table_key_string key_table_key_row">LENS_INFORMATION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>String</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getlensinformation">getLensInformation</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_infrared_thermal_camera_shutter_enabled_key"></a><p class="key_table_key_string key_table_key_row">INFRARED_THERMAL_CAMERA_SHUTTER_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION, PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_metering_area_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_METERING_AREA</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>RectF</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalmeteringarea">setThermalMeteringArea</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_getthermalmeteringarea">getThermalMeteringArea</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_sdcard_is_inserted_key"></a><p class="key_table_key_string key_table_key_row">SDCARD_IS_INSERTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSDCardState.html#djicamera_djicamerasdcardstate_isinserted">isInserted</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_init_sensor_cleaning_mode_key"></a><p class="key_table_key_string key_table_key_row">INIT_SENSOR_CLEANING_MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_isotherm_upper_value_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_ISOTHERM_UPPER_VALUE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalisothermuppervalue">setThermalIsothermUpperValue</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_getthermalisothermuppervalue">getThermalIsothermUpperValue</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_camera_start_mf_demarcate_key"></a><p class="key_table_key_string key_table_key_row">CAMERA_START_MF_DEMARCATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_start_log_export_key"></a><p class="key_table_key_string key_table_key_row">START_LOG_EXPORT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_is_playback_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_PLAYBACK_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_media_isplaybacksupported">isPlaybackSupported</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_photo_quick_view_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_PHOTO_QUICK_VIEW_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_isphotoquickviewsupported">isPhotoQuickViewSupported</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_save_settings_to_profile_key"></a><p class="key_table_key_string key_table_key_row">SAVE_SETTINGS_TO_PROFILE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameracustomsettings">CustomSettingsProfile</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_savesettings">saveSettingsToProfile</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameracustomsettings">CustomSettingsProfile</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_spot_metering_target_key"></a><p class="key_table_key_string key_table_key_row">SPOT_METERING_TARGET</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Point</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setspotmeteringareaindex">setSpotMeteringTarget</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getspotmeteringareaindex">getSpotMeteringTarget</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_innerstorage_has_error_key"></a><p class="key_table_key_string key_table_key_row">INNERSTORAGE_HAS_ERROR</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_ssd_available_recording_time_in_seconds_key"></a><p class="key_table_key_string key_table_key_row">SSD_AVAILABLE_RECORDING_TIME_IN_SECONDS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSSDState.html#djicamera_djicamerassdstate_availablerecordingtimeinseconds">getAvailableRecordingTimeInSeconds</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_firmware_version_key"></a><p class="key_table_key_string key_table_key_row">FIRMWARE_VERSION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>String</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_is_in_playback_mode_key"></a><p class="key_table_key_string key_table_key_row">IS_IN_PLAYBACK_MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_aperture_range_key"></a><p class="key_table_key_string key_table_key_row">APERTURE_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraaperture">Aperture</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraaperture">Aperture</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraParameters.html#djicamera_djicameraparameters_supportedcameraaperturerange">apertureRange</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_ssd_video_resolution_and_frame_rate_key"></a><p class="key_table_key_string key_table_key_row">SSD_VIDEO_RESOLUTION_AND_FRAME_RATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraVideoResolutionAndFrameRate.html#djicamera_djicameravideoresolutionandframerate">ResolutionAndFrameRate</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSSDState.html#djicamera_djicamerassdstate_videoresolution">getVideoResolution</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSSDState.html#djicamera_djicamerassdstate_videoframerate">getVideoFrameRate</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_setssdvideoresolutionandframerate">setSSDVideoResolutionAndFrameRate</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_getssdvideoresolutionandframerate">getSSDVideoResolutionAndFrameRate</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_format_sd_card_key"></a><p class="key_table_key_string key_table_key_row">FORMAT_SD_CARD</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_sdcardoperations_formatsdcard">formatSDCard</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_ssd_remaining_space_in_mb_key"></a><p class="key_table_key_string key_table_key_row">SSD_REMAINING_SPACE_IN_MB</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Long</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSSDState.html#djicamera_djicamerassdstate_remainingspaceinmegabytes">getRemainingSpaceInMB</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_sdcard_available_capture_count_key"></a><p class="key_table_key_string key_table_key_row">SDCARD_AVAILABLE_CAPTURE_COUNT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Long</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSDCardState.html#djicamera_djicamerasdcardstate_availablecapturecount">getAvailableCaptureCount</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_nd_filter_mode_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_ND_FILTER_MODE_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_scene_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_SCENE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalscene">ThermalScene</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalscene">setThermalScene</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_getthermalscene">getThermalScene</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalscene">ThermalScene</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_ei_color_key"></a><p class="key_table_key_string key_table_key_row">EI_COLOR</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraeicolor">EIColor</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraeicolor">EIColor</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_zoom_box_relative_fov_key"></a><p class="key_table_key_string key_table_key_row">ZOOM_BOX_RELATIVE_FOV</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>ZoomRelativeFov</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_is_internal_storage_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_INTERNAL_STORAGE_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_sdcard_state_key"></a><p class="key_table_key_string key_table_key_row">SDCARD_STATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera.html#djicamera_djicamerasdcardoperationstate">SDCardOperationState</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_is_shooting_photo_enabled_key"></a><p class="key_table_key_string key_table_key_row">IS_SHOOTING_PHOTO_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_iso_range_key"></a><p class="key_table_key_string key_table_key_row">ISO_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>ISO[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraiso">ISO</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraParameters.html#djicamera_djicameraparameters_supportedcameraisorange">ISORange</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_dde_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_DDE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermaldde">setThermalDDE</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_getthermaldde">getThermalDDE</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_scene_emissivity_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_SCENE_EMISSIVITY</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraThermalExternalSceneSettings.html#djicamera_djicamerathermalexternalscenesettings_sceneemissivity">getSceneEmissivity</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalsceneemissivity">setThermalSceneEmissivity</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_flat_camera_mode_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_FLAT_CAMERA_MODE_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_focus_ring_value_upper_bound_key"></a><p class="key_table_key_string key_table_key_row">FOCUS_RING_VALUE_UPPER_BOUND</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getlensfocusringvalueupperbound">getFocusRingValueUpperBound</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_fast_playback_settings_key"></a><p class="key_table_key_string key_table_key_row">FAST_PLAYBACK_SETTINGS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>QuickPreviewSettings</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_panorama_capture_result_key"></a><p class="key_table_key_string key_table_key_row">PANORAMA_CAPTURE_RESULT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>PanoramaCaptureResult</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_is_storing_photo_key"></a><p class="key_table_key_string key_table_key_row">IS_STORING_PHOTO</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSystemState.html#djicamera_djicamerasystemstate_isstoringphoto">isStoringPhoto</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_ssd_color_key"></a><p class="key_table_key_string key_table_key_row">SSD_COLOR</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdcolor">SSDColor</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdcolor">SSDColor</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_audio_recording_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_AUDIO_RECORDING_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_isaudiorecordsupported">isAudioRecordingSupported</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_focus_status_key"></a><p class="key_table_key_string key_table_key_row">FOCUS_STATUS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameralensfocusstatus">FocusStatus</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraLensState.html#djicamera_djicameralensstate_focusstatus">getFocusStatus</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameralensfocusstatus">FocusStatus</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_ndfilter_mode_key"></a><p class="key_table_key_string key_table_key_row">NDFILTER_MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerandfiltermode">NDFilterMode</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerandfiltermode">NDFilterMode</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_temperature_data_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_TEMPERATURE_DATA</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_TemperatureDataCallbackInterface.html#djicamera_temperaturedatacallbackinterface">TemperatureDataCallback</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_picture_style_preset_key"></a><p class="key_table_key_string key_table_key_row">PICTURE_STYLE_PRESET</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraPictureStylePreset.html#djicamera_djicamerapicturestylepreset">PictureStylePreset</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerapicturestylepresettype">PictureStylePresetType</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraPictureStylePreset.html#djicamera_djicamerapicturestylepreset">PictureStylePreset</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_color_waveform_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_COLOR_WAVEFORM_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_laser_service_mode_key"></a><p class="key_table_key_string key_table_key_row">LASER_SERVICE_MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>LaserServiceMode</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_focus_assistant_settings_key"></a><p class="key_table_key_string key_table_key_row">FOCUS_ASSISTANT_SETTINGS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraFocusAssistantSettings.html#djicamera_djicamerafocusassistantsettings">FocusAssistantSettings</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraLensState.html#djicamera_djicameralensstate_isfocusassistantenabledformf">isFocusAssistantEnabledForMF</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraLensState.html#djicamera_djicameralensstate_isfocusassistantenabledforaf">isFocusAssistantEnabledForAF</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setlensfocusassistantenabled">setFocusAssistantSettings</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getlensfocusassistantenabled">getFocusAssistantSettings</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraFocusAssistantSettings.html#djicamera_djicamerafocusassistantsettings">FocusAssistantSettings</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_log_exporting_key"></a><p class="key_table_key_string key_table_key_row">IS_LOG_EXPORTING</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_video_standard_range_key"></a><p class="key_table_key_string key_table_key_row">VIDEO_STANDARD_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideostandard">VideoStandard</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideostandard">VideoStandard</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_temp_alarm_key"></a><p class="key_table_key_string key_table_key_row">TEMP_ALARM</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>DataCameraGetPushStateInfo.TempStatus</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_display_name_key"></a><p class="key_table_key_string key_table_key_row">DISPLAY_NAME</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>String</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_displayname">getDisplayName</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_restore_factory_settings_key"></a><p class="key_table_key_string key_table_key_row">RESTORE_FACTORY_SETTINGS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_loadfactorysettings">restoreFactorySettings</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_start_continuous_optical_zoom_key"></a><p class="key_table_key_string key_table_key_row">START_CONTINUOUS_OPTICAL_ZOOM</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_startcontinuousopticalzoom">startContinuousOpticalZoom</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraopticalzoomdirection">ZoomDirection</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraopticalzoomspeed">ZoomSpeed</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_lens_is_focus_assistant_working_key"></a><p class="key_table_key_string key_table_key_row">LENS_IS_FOCUS_ASSISTANT_WORKING</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraLensState.html#djicamera_djicameralensstate_isfocusassistantworking">isFocusAssistantWorking</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_flat_camera_mode_range_key"></a><p class="key_table_key_string key_table_key_row">FLAT_CAMERA_MODE_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera.html#djicamera_djiflatcameramode">FlatCameraMode</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_video_resolution_frame_rate_range_key"></a><p class="key_table_key_string key_table_key_row">VIDEO_RESOLUTION_FRAME_RATE_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraVideoResolutionAndFrameRate.html#djicamera_djicameravideoresolutionandframerate">ResolutionAndFrameRate</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoresolution">VideoResolution</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideoframerate">VideoFrameRate</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraParameters.html#djicamera_djicameraparameters_supportedcameravideoresolutionandframeraterange">videoResolutionAndFrameRateRange</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_auto_lock_gimbal_enabled_key"></a><p class="key_table_key_string key_table_key_row">AUTO_LOCK_GIMBAL_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_custom_external_scene_settings_profile_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_CUSTOM_EXTERNAL_SCENE_SETTINGS_PROFILE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalcustomexternalscenesettings">ThermalCustomExternalSceneSettingsProfile</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalcustomexternalscenesettingsprofile">setThermalCustomExternalSceneSettingsProfile</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_getthermalcustomexternalscenesettingsprofile">getThermalCustomExternalSceneSettingsProfile</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalcustomexternalscenesettings">ThermalCustomExternalSceneSettingsProfile</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_thermal_camera_key"></a><p class="key_table_key_string key_table_key_row">IS_THERMAL_CAMERA</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_isthermalimagingcamera">isThermalCamera</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_flat_camera_mode_key"></a><p class="key_table_key_string key_table_key_row">FLAT_CAMERA_MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera.html#djicamera_djiflatcameramode">FlatCameraMode</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_spot_metering_target_point_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_SPOT_METERING_TARGET_POINT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>PointF</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalspotmeteringtargetpoint">setThermalSpotMeteringTargetPoint</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_getthermalspotmeteringtargetpoint">getThermalSpotMeteringTargetPoint</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_camera_peak_threshold_key"></a><p class="key_table_key_string key_table_key_row">CAMERA_PEAK_THRESHOLD</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_CameraPeakThreshold.html#djicamera_camerapeakthreshold">CameraPeakThreshold</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_sharpness_key"></a><p class="key_table_key_string key_table_key_row">SHARPNESS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setsharpness">setSharpness</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getsharpness">getSharpness</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_ssd_video_resolution_frame_rate_range_key"></a><p class="key_table_key_string key_table_key_row">SSD_VIDEO_RESOLUTION_FRAME_RATE_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraVideoResolutionAndFrameRate.html#djicamera_djicameravideoresolutionandframerate">ResolutionAndFrameRate</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_contrast_key"></a><p class="key_table_key_string key_table_key_row">CONTRAST</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setcontrast">setContrast</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getcontrast">getContrast</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_capture_in_video_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_CAPTURE_IN_VIDEO_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_innerstorage_is_busy_key"></a><p class="key_table_key_string key_table_key_row">INNERSTORAGE_IS_BUSY</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_is_multi_lens_camera_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_MULTI_LENS_CAMERA_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_recommended_ei_value_key"></a><p class="key_table_key_string key_table_key_row">RECOMMENDED_EI_VALUE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_dual_feed_vertical_alignment_offset_range_key"></a><p class="key_table_key_string key_table_key_row">DUAL_FEED_VERTICAL_ALIGNMENT_OFFSET_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/ParamCapability/DJIParamCapability_DJIParamCapabilityMinMax.html#djiparamcapability_djiparamcapabilityminmax">DJIParamMinMaxCapability</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_is_hybrid_zoom_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_HYBRID_ZOOM_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_innerstorage_is_formatted_key"></a><p class="key_table_key_string key_table_key_row">INNERSTORAGE_IS_FORMATTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_ffc_mode_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_FFC_MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalffcmode">ThermalFFCMode</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalffcmode">setThermalFFCMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_getthermalffcmode">getThermalFFCMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalffcmode">ThermalFFCMode</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_panorama_progress_in_percent_key"></a><p class="key_table_key_string key_table_key_row">PANORAMA_PROGRESS_IN_PERCENT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_sdcard_is_formatting_key"></a><p class="key_table_key_string key_table_key_row">SDCARD_IS_FORMATTING</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSDCardState.html#djicamera_djicamerasdcardstate_isformatting">isFormatting</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_sdcard_remaining_space_in_mb_key"></a><p class="key_table_key_string key_table_key_row">SDCARD_REMAINING_SPACE_IN_MB</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSDCardState.html#djicamera_djicamerasdcardstate_remainingspaceinmegabytes">getRemainingSpaceInMB</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_enter_playback_key"></a><p class="key_table_key_string key_table_key_row">ENTER_PLAYBACK</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_watermark_user_custom_info_key"></a><p class="key_table_key_string key_table_key_row">WATERMARK_USER_CUSTOM_INFO</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>String</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_ssd_total_space_key"></a><p class="key_table_key_string key_table_key_row">SSD_TOTAL_SPACE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdcapacity">SSDCapacity</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSSDState.html#djicamera_djicamerassdstate_totalspace">getCapacity</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdcapacity">SSDCapacity</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_sdcard_is_busy_key"></a><p class="key_table_key_string key_table_key_row">SDCARD_IS_BUSY</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_focus_ring_value_key"></a><p class="key_table_key_string key_table_key_row">FOCUS_RING_VALUE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setlensfocusringvalue">setFocusRingValue</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getlensfocusringvalue">getFocusRingValue</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_profile_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_PROFILE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraThermalProfile.html#djicamera_djicamerathermalprofile">ThermalProfile</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_getthermalprofile">getThermalProfile</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalresolution">ThermalResolution</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermallensmodel">ThermalLensFocalLength</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraThermalProfile.html#djicamera_djicamerathermalprofile">ThermalProfile</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_activate_ssd_video_license_key"></a><p class="key_table_key_string key_table_key_row">ACTIVATE_SSD_VIDEO_LICENSE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideolicense">CameraSSDVideoLicense</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_activatessdvideolicense">activateSSDVideoLicense</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_getssdvideolicense">getSSDVideoLicense</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideolicense">CameraSSDVideoLicense</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_record_camera_stream_settings_key"></a><p class="key_table_key_string key_table_key_row">RECORD_CAMERA_STREAM_SETTINGS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_anti_flicker_frequency_key"></a><p class="key_table_key_string key_table_key_row">ANTI_FLICKER_FREQUENCY</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraantiflicker">AntiFlickerFrequency</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setantiflicker">setAntiFlickerFrequency</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getantiflicker">getAntiFlickerFrequency</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraantiflicker">AntiFlickerFrequency</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_pano_original_photo_settings_key"></a><p class="key_table_key_string key_table_key_row">PANO_ORIGINAL_PHOTO_SETTINGS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraOriginalPhotoSettings.html#djicamera_djicameraoriginalphotosettings">OriginalPhotoSettings</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_photo_burst_count_key"></a><p class="key_table_key_string key_table_key_row">PHOTO_BURST_COUNT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotoburstcount">PhotoBurstCount</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setphotoburstcount">setPhotoBurstCount</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getphotoburstcount">getPhotoBurstCount</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraphotoburstcount">PhotoBurstCount</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_auto_ae_unlock_enabled_key"></a><p class="key_table_key_string key_table_key_row">AUTO_AE_UNLOCK_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setautoaeunlockenabled">setAutoAEUnlockEnabled</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getautoaeunlockenabled">getAutoAEUnlockEnabled</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_ei_value_key"></a><p class="key_table_key_string key_table_key_row">EI_VALUE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_global_max_temperature_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_GLOBAL_MAX_TEMPERATURE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_global_min_temperature_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_GLOBAL_MIN_TEMPERATURE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_watermark_settings_key"></a><p class="key_table_key_string key_table_key_row">WATERMARK_SETTINGS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraWatermarkSettings.html#djicamera_djicamerawatermarksettings">WatermarkSettings</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_isotherm_enabled_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_ISOTHERM_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalisothermenabled">setThermalIsothermEnabled</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_getthermalisothermenabled">getThermalIsothermEnabled</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_tap_zoom_multiplier_key"></a><p class="key_table_key_string key_table_key_row">TAP_ZOOM_MULTIPLIER</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_settapzoommultiplier">setTapZoomMultiplier</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_gettapzoommultiplier">getTapZoomMultiplier</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_dewarping_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_DEWARPING_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_optical_zoom_scale_key"></a><p class="key_table_key_string key_table_key_row">OPTICAL_ZOOM_SCALE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getopticalzoomscale">getOpticalZoomFactor</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_gain_mode_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_GAIN_MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalgainmode">ThermalGainMode</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalgainmode">setThermalGainMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_getthermalgainmode">getThermalGainMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalgainmode">ThermalGainMode</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_multi_spectral_exposure_compensation_range_key"></a><p class="key_table_key_string key_table_key_row">MULTI_SPECTRAL_EXPOSURE_COMPENSATION_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposurecompensation">ExposureCompensation</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_innerstorage_available_recording_time_in_seconds_key"></a><p class="key_table_key_string key_table_key_row">INNERSTORAGE_AVAILABLE_RECORDING_TIME_IN_SECONDS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_video_file_format_key"></a><p class="key_table_key_string key_table_key_row">VIDEO_FILE_FORMAT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideofileformat">VideoFileFormat</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setvideofileformat">setVideoFileFormat</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getvideofileformat">getVideoFileFormat</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameravideofileformat">VideoFileFormat</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_photo_time_interval_settings_key"></a><p class="key_table_key_string key_table_key_row">PHOTO_TIME_INTERVAL_SETTINGS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraPhotoIntervalParam.html#djicamera_djicameraphotointervalparam">PhotoTimeIntervalSettings</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setphotointervalparam">setPhotoTimeIntervalSettings</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getphotointervalparam">getPhotoTimeIntervalSettings</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraPhotoIntervalParam.html#djicamera_djicameraphotointervalparam">PhotoTimeIntervalSettings</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_ae_lock_key"></a><p class="key_table_key_string key_table_key_row">AE_LOCK</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setaelock">setAELock</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getaelock">getAELock</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_sdcard_is_read_only_key"></a><p class="key_table_key_string key_table_key_row">SDCARD_IS_READ_ONLY</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSDCardState.html#djicamera_djicamerasdcardstate_isreadonly">isReadOnly</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_exposure_sensitivity_mode_key"></a><p class="key_table_key_string key_table_key_row">EXPOSURE_SENSITIVITY_MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuresensitivitymode">ExposureSensitivityMode</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuresensitivitymode">ExposureSensitivityMode</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_optical_zoom_focal_length_key"></a><p class="key_table_key_string key_table_key_row">OPTICAL_ZOOM_FOCAL_LENGTH</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setopticalzoomfocallength">setOpticalZoomFocalLength</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getopticalzoomfocallength">getOpticalZoomFocalLength</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_vision_stabilization_enabled_key"></a><p class="key_table_key_string key_table_key_row">VISION_STABILIZATION_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setvisionstablizationenabled">setVisionStabilizationEnabled</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getvisionstablizationenabled">getVisionStabilizationEnabled</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_innerstorage_available_capture_count_key"></a><p class="key_table_key_string key_table_key_row">INNERSTORAGE_AVAILABLE_CAPTURE_COUNT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Long</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_sdcard_is_slow_key"></a><p class="key_table_key_string key_table_key_row">SDCARD_IS_SLOW</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_is_overheating_key"></a><p class="key_table_key_string key_table_key_row">IS_OVERHEATING</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSystemState.html#djicamera_djicamerasystemstate_iscameraoverheated">isOverheating</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_aperture_key"></a><p class="key_table_key_string key_table_key_row">APERTURE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraaperture">Aperture</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setaperture">setAperture</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getaperture">getAperture</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraaperture">Aperture</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_innerstorage_is_formatting_key"></a><p class="key_table_key_string key_table_key_row">INNERSTORAGE_IS_FORMATTING</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_ssd_legacy_color_key"></a><p class="key_table_key_string key_table_key_row">SSD_LEGACY_COLOR</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideodigitalfilter">SSDLegacyColor</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_setssdvideodigitalfilter">setSSDLegacyColor</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_getssdvideodigitalfilter">getSSDLegacyColor</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerassdvideodigitalfilter">SSDLegacyColor</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_camera_stop_mf_demarcate_key"></a><p class="key_table_key_string key_table_key_row">CAMERA_STOP_MF_DEMARCATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_innerstorage_is_slow_key"></a><p class="key_table_key_string key_table_key_row">INNERSTORAGE_IS_SLOW</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_white_balance_key"></a><p class="key_table_key_string key_table_key_row">WHITE_BALANCE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraWhiteBalanceInterface.html#djicamera_djicamerawhitebalanceinterface">WhiteBalance</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setwhitebalanceandcolortemperature">setWhiteBalance</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getwhitebalanceandcolortemperature">getWhiteBalance</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraWhiteBalanceInterface.html#djicamera_djicamerawhitebalanceinterface">WhiteBalance</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerawhitebalance">WhiteBalancePreset</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_defog_enabled_key"></a><p class="key_table_key_string key_table_key_row">DEFOG_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setdefogenabled">setDefogEnabled</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getdefogenabled">getDefogEnabled</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_ei_mode_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_EI_MODE_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_innerstorage_is_read_only_key"></a><p class="key_table_key_string key_table_key_row">INNERSTORAGE_IS_READ_ONLY</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_hybrid_zoom_focal_length_key"></a><p class="key_table_key_string key_table_key_row">HYBRID_ZOOM_FOCAL_LENGTH</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_current_panorama_photo_count_key"></a><p class="key_table_key_string key_table_key_row">CURRENT_PANORAMA_PHOTO_COUNT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_photo_aeb_count_key"></a><p class="key_table_key_string key_table_key_row">PHOTO_AEB_COUNT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera.html#djicamera_djicameraphotoaebcount">PhotoAEBCount</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setphotoaebparam">setPhotoAEBCount</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getphotoaebparam">getPhotoAEBCount</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_djicameraphotoaebcount">PhotoAEBCount</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_file_index_mode_key"></a><p class="key_table_key_string key_table_key_row">FILE_INDEX_MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerafileindexmode">FileIndexMode</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setfileindexmode">setFileIndexMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerafileindexmode">FileIndexMode</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_time_lapse_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_TIME_LAPSE_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_istimelapsesupported">isTimeLapseSupported</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_sensor_cleaning_state_key"></a><p class="key_table_key_string key_table_key_row">SENSOR_CLEANING_STATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasensorcleaningstate">SensorCleaningState</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasensorcleaningstate">SensorCleaningState</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_isotherm_unit_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_ISOTHERM_UNIT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalisothermunit">ThermalIsothermUnit</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalisothermunit">setThermalIsothermUnit</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_getthermalisothermunit">getThermalIsothermUnit</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerathermalisothermunit">ThermalIsothermUnit</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_super_resolution_capture_area_key"></a><p class="key_table_key_string key_table_key_row">SUPER_RESOLUTION_CAPTURE_AREA</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>RectF</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_exit_playback_key"></a><p class="key_table_key_string key_table_key_row">EXIT_PLAYBACK</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_shoot_photo_mode_child_range_key"></a><p class="key_table_key_string key_table_key_row">SHOOT_PHOTO_MODE_CHILD_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>int[][]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_measuring_status_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_MEASURING_STATUS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_flat_photo_mode_range_key"></a><p class="key_table_key_string key_table_key_row">FLAT_PHOTO_MODE_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerasettingsdef">SettingsDefinitions</a>.<a href="/Components/Camera/DJICamera.html#djicamera_djiflatcameramode">FlatCameraMode</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_sso_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_SSO</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalsso">setThermalSSO</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_getthermalsso">getThermalSSO</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_camera_mf_demarcate_result_key"></a><p class="key_table_key_string key_table_key_row">CAMERA_MF_DEMARCATE_RESULT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>DataCameraGetPushShotInfo.MFDemarcateResult</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_hardware_version_key"></a><p class="key_table_key_string key_table_key_row">HARDWARE_VERSION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>String</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_shoot_photo_mode_range_key"></a><p class="key_table_key_string key_table_key_row">SHOOT_PHOTO_MODE_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashootphotomode">ShootPhotoMode</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashootphotomode">ShootPhotoMode</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_shooting_photo_key"></a><p class="key_table_key_string key_table_key_row">IS_SHOOTING_PHOTO</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_background_temperature_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_BACKGROUND_TEMPERATURE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraThermalExternalSceneSettings.html#djicamera_djicamerathermalexternalscenesettings_backgroundtemperature">getBackgroundTemperature</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalbackgroundtemperature">setThermalBackgroundTemperature</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_saturation_key"></a><p class="key_table_key_string key_table_key_row">SATURATION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setsaturation">setSaturation</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getsaturation">getSaturation</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_leds_auto_turn_off_enabled_settings_key"></a><p class="key_table_key_string key_table_key_row">LEDS_AUTO_TURN_OFF_ENABLED_SETTINGS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/FlightController/DJIFlightController_DJIFlightControllerLEDsSettings.html#djiflightcontroller_djiflightcontrollerledssettings">LEDsSettings</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_exposure_mode_key"></a><p class="key_table_key_string key_table_key_row">EXPOSURE_MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode">ExposureMode</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_setexposuremode">setExposureMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_getexposuremode">getExposureMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode">ExposureMode</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_shutter_speed_range_key"></a><p class="key_table_key_string key_table_key_row">SHUTTER_SPEED_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashutterspeed">ShutterSpeed</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicamerashutterspeed">ShutterSpeed</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraParameters.html#djicamera_djicameraparameters_supportedcamerashutterspeedrange">shutterSpeedRange</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_format_ssd_key"></a><p class="key_table_key_string key_table_key_row">FORMAT_SSD</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_formatssd">formatSSD</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_vision_stabilization_state_key"></a><p class="key_table_key_string key_table_key_row">VISION_STABILIZATION_STATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_StabilizationState.html#djicamera_stabilizationstate">StabilizationState</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_is_optical_zoom_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_OPTICAL_ZOOM_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_isopticalzoomsupported">isOpticalZoomSupported</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_is_metering_mode_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_METERING_MODE_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_tap_zoom_state_key"></a><p class="key_table_key_string key_table_key_row">TAP_ZOOM_STATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_thermal_window_reflected_temperature_key"></a><p class="key_table_key_string key_table_key_row">THERMAL_WINDOW_REFLECTED_TEMPERATURE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraThermalExternalSceneSettings.html#djicamera_djicamerathermalexternalscenesettings_windowreflectedtemperature">getWindowReflectedTemperature</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_thermalcamera_setthermalwindowreflectedtemperature">setThermalWindowReflectedTemperature</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_sdcard_is_connected_to_pc_key"></a><p class="key_table_key_string key_table_key_row">SDCARD_IS_CONNECTED_TO_PC</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_flat_camera_mode_child_range_key"></a><p class="key_table_key_string key_table_key_row">FLAT_CAMERA_MODE_CHILD_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>int[][]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_tap_zoom_at_target_key"></a><p class="key_table_key_string key_table_key_row">TAP_ZOOM_AT_TARGET</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>PointF</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera.html#djicamera_camerasettings_tapzoomattarget">tapZoomAtTarget</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_exposure_mode_range_key"></a><p class="key_table_key_string key_table_key_row">EXPOSURE_MODE_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode">ExposureMode</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraexposuremode">ExposureMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraParameters.html#djicamera_djicameraparameters_supportedcameraexposuremoderange">exposureModeRange</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_total_panorama_photo_count_key"></a><p class="key_table_key_string key_table_key_row">TOTAL_PANORAMA_PHOTO_COUNT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#camerakey_sdcard_is_formatted_key"></a><p class="key_table_key_string key_table_key_row">SDCARD_IS_FORMATTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSDCardState.html#djicamera_djicamerasdcardstate_isformatted">isFormatted</a></code>

</p></td></tr><tr><td colspan=2><a href="#camerakey_orientation_range_key"></a><p class="key_table_key_string key_table_key_row">ORIENTATION_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraorientation">Orientation</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/Camera/DJICamera_DJICameraSettingsDef.html#djicamera_djicameraorientation">Orientation</a></code>

</p></td></tr></table></html>
