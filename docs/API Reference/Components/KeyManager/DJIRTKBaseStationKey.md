<div class="article"><h1 ><font color="#AAA">class </font>BaseStationKey</h1></div>

~~~java
 class BaseStationKey extends DJIKey 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/KeyManager/DJIKey.html#djikey">DJIKey</a></code></td></tr></table></html>



##### Description:



<font color="#666"><code><a href="/Components/KeyManager/DJIRTKBaseStationKey.html#djirtkbasestationkey">BaseStationKey</a></code> provides dedicated access to the base station attributes.



##### Class Members:

<div class="api-row" id="djirtkbasestationkey_create"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djirtkbasestationkey_create_inline">create</a></div></div><div class="inline-doc" id="djirtkbasestationkey_create_inline"

><div class="article"><h6 ><font color="#AAA">method </font>create</h6></div>

~~~java
 static BaseStationKey create(@BaseStationKey.BaseStationParamKey @NonNull String paramKey) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Creates an BaseStation key.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@BaseStationKey.BaseStationParamKey @NonNull String <font color="#000">paramKey</td><td><font color="#666"><i>A valid paramKey.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/KeyManager/DJIRTKBaseStationKey.html#djirtkbasestationkey">BaseStationKey</a></td><td><font color="#666"><i>BaseStation key.</i></td></tr></table></html></div>



##### Inherited Methods:



##### Class Keys:

<html><table class="key_table"><tr><td colspan=2><a href="#basestationkey_log_in_as_device_admin_key"></a><p class="key_table_key_string key_table_key_first_row">LOG_IN_AS_DEVICE_ADMIN</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>String</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#basestationkey_base_station_referencing_location_key"></a><p class="key_table_key_string key_table_key_row">BASE_STATION_REFERENCING_LOCATION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/FlightController/DJIFlightController_DJILocationCoordinate3D.html#djiflightcontroller_djilocationcoordinate3d">LocationCoordinate3D</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#basestationkey_has_device_admin_logged_in_key"></a><p class="key_table_key_string key_table_key_row">HAS_DEVICE_ADMIN_LOGGED_IN</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#basestationkey_log_out_key"></a><p class="key_table_key_string key_table_key_row">LOG_OUT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#basestationkey_base_station_state_key"></a><p class="key_table_key_string key_table_key_row">BASE_STATION_STATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/RTKBaseStation/DJIRTKBaseStation_DJIRTKBaseStationState.html#djirtkbasestation_djirtkbasestationstate">BaseStationState</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#basestationkey_name_key"></a><p class="key_table_key_string key_table_key_row">NAME</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>String</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#basestationkey_change_password_key"></a><p class="key_table_key_string key_table_key_row">CHANGE_PASSWORD</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#basestationkey_reset_base_station_referencing_location_key"></a><p class="key_table_key_string key_table_key_row">RESET_BASE_STATION_REFERENCING_LOCATION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#basestationkey_base_station_battery_state_key"></a><p class="key_table_key_string key_table_key_row">BASE_STATION_BATTERY_STATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/RTKBaseStation/DJIRTKBaseStation_DJIRTKBaseStationBatteryState.html#djirtkbasestation_djirtkbasestationbatterystate">BaseStationBatteryState</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr></table></html>
