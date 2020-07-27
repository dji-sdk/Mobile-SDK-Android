<div class="article"><h1 ><font color="#AAA">class </font>AirLinkKey</h1></div>

~~~java
 final class AirLinkKey extends DJIKey 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/KeyManager/DJIKey.html#djikey">DJIKey</a></code></td></tr></table></html>



##### Description:



<font color="#666"><code><a href="/Components/KeyManager/DJIAirLinkKey.html#djiairlinkkey">AirLinkKey</a></code> provides dedicated access to all communication  to the product attributes.



##### Class Members:

<div class="api-row" id="djiairlinkkey_create_airlink"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairlinkkey_create_airlink_inline">create</a></div></div><div class="inline-doc" id="djiairlinkkey_create_airlink_inline"

><div class="article"><h6 ><font color="#AAA">method </font>create</h6></div>

~~~java
 static AirLinkKey create(@AirLinkParamKey @NonNull String paramKey) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Creates an AirLink key.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@AirLinkParamKey @NonNull String <font color="#000">paramKey</td><td><font color="#666"><i>A valid paramKey.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/KeyManager/DJIAirLinkKey.html#djiairlinkkey">AirLinkKey</a></td><td><font color="#666"><i>AirLink Key</i></td></tr></table></html></div>

<div class="api-row" id="djiairlinkkey_create_wifilink"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairlinkkey_create_wifilink_inline">createWiFiLinkKey</a></div></div><div class="inline-doc" id="djiairlinkkey_create_wifilink_inline"

><div class="article"><h6 ><font color="#AAA">method </font>createWiFiLinkKey</h6></div>

~~~java
 static AirLinkKey createWiFiLinkKey(@WIFILinkParamKey @NonNull String paramKey) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Creates a WIFILink key. The <code>WIFILinkParamKey</code> values are listed below: <br> <br>REBOOT, <br>DOWNLINK_SIGNAL_QUALITY, <br>UPLINK_SIGNAL_QUALITY, <br>MAGNETIC_INTERFERENCE, <br>CHANNEL_INTERFERENCE, <br>CHANNEL_NUMBER, <br>AVAILABLE_CHANNEL_NUMBERS, <br>SSID, <br>PASSWORD, <br>WIFI_FREQUENCY_BAND, <br>DATA_RATE



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@WIFILinkParamKey @NonNull String <font color="#000">paramKey</td><td><font color="#666"><i>A valid paramKey.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/KeyManager/DJIAirLinkKey.html#djiairlinkkey">AirLinkKey</a></td><td><font color="#666"><i>WiFiLink Key</i></td></tr></table></html></div>

<div class="api-row" id="djiairlinkkey_create_lblink"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairlinkkey_create_lblink_inline">createLightbridgeLinkKey</a></div></div><div class="inline-doc" id="djiairlinkkey_create_lblink_inline"

><div class="article"><h6 ><font color="#AAA">method </font>createLightbridgeLinkKey</h6></div>

~~~java
 static AirLinkKey createLightbridgeLinkKey(@LightbridgeLinkParamKey @NonNull String paramKey) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Creates a LBLink key. The <code>LightbridgeLinkParamKey</code> values are listed below: <br> <br>BANDWIDTH_ALLOCATION_FOR_HDMI_VIDEO_INPUT_PORT, <br>IS_EXT_VIDEO_INPUT_PORT_ENABLED, <br>BANDWIDTH_ALLOCATION_FOR_LB_VIDEO_INPUT_PORT, <br>CHANNEL_INTERFERENCE, <br>CHANNEL_NUMBER, <br>DATA_RATE, <br>SECONDARY_VIDEO_OUTPUT_ENABLED, <br>SECONDARY_VIDEO_OUTPUT_PORT, <br>SECONDARY_VIDEO_DISPLAY_MODE, <br>SECONDARY_VIDEO_OSD_ENABLED, <br>SECONDARY_VIDEO_OSD_TOP_MARGIN, <br>SECONDARY_VIDEO_OSD_LEFT_MARGIN, <br>SECONDARY_VIDEO_OSD_BOTTOM_MARGIN, <br>SECONDARY_VIDEO_OSD_RIGHT_MARGIN, <br>SECONDARY_VIDEO_OSD_UNIT, <br>HDMI_OUTPUT_FORMAT, <br>SDI_OUTPUT_FORMAT, <br>PIP_POSITION, <br>CHANNEL_SELECTION_MODE, <br>UPLINK_SIGNAL_QUALITY, <br>DOWNLINK_SIGNAL_QUALITY, <br>AIRCRAFT_ANTENNA_RSSI, <br>REMOTE_CONTROLLER_ANTENNA_RSSI, <br>CHANNEL_RANGE, <br>SUPPORTED_FREQUENCY_BANDS, <br>TRANSMISSION_MODE, <br>LB_FREQUENCY_BAND,  <br>BANDWIDTH_ALLOCATION_FOR_LEFT_CAMERA



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@LightbridgeLinkParamKey @NonNull String <font color="#000">paramKey</td><td><font color="#666"><i>A valid paramKey.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/KeyManager/DJIAirLinkKey.html#djiairlinkkey">AirLinkKey</a></td><td><font color="#666"><i>LBLink Key</i></td></tr></table></html></div>

<div class="api-row" id="djiairlinkkey_create_ocusynclink"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiairlinkkey_create_ocusynclink_inline">createOcuSyncLinkKey</a></div></div><div class="inline-doc" id="djiairlinkkey_create_ocusynclink_inline"

><div class="article"><h6 ><font color="#AAA">method </font>createOcuSyncLinkKey</h6></div>

~~~java
 static AirLinkKey createOcuSyncLinkKey(@OcuSyncLinkParamKey @NonNull String paramKey) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Creates an OcuSyncLink key. The <code>OcuSyncLinkParamKey</code> values are listed below: <br> <br>UPLINK_SIGNAL_QUALITY, <br>DOWNLINK_SIGNAL_QUALITY, <br>BANDWIDTH, <br>DYNAMIC_DATA_RATE, <br>FREQUENCY_POINT_INDEX, <br>FREQUENCY_POINT_INDEX_VALID_RANGE, <br>FREQUENCY_POINT_RSSIS, <br>WARNING_MESSAGES, <br>CHANNEL_SELECTION_MODE



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@OcuSyncLinkParamKey @NonNull String <font color="#000">paramKey</td><td><font color="#666"><i>A valid paramKey.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/KeyManager/DJIAirLinkKey.html#djiairlinkkey">AirLinkKey</a></td><td><font color="#666"><i>OcuSyncLink Key</i></td></tr></table></html></div>



##### Inherited Methods:



##### Class Keys:

<html><table class="key_table"><tr><td colspan=2><a href="#airlinkkey_is_ext_video_input_port_enabled_key"></a><p class="key_table_key_string key_table_key_first_row">IS_EXT_VIDEO_INPUT_PORT_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_setencodemode">setEXTVideoInputPortEnabled</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_getencodemode">getEXTVideoInputPortEnabled</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_uplink_signal_quality_key"></a><p class="key_table_key_string key_table_key_row">UPLINK_SIGNAL_QUALITY</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_channel_range_key"></a><p class="key_table_key_string key_table_key_row">CHANNEL_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_getchannelrange">getChannelRange</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_bandwidth_allocation_for_primary_video_key"></a><p class="key_table_key_string key_table_key_row">BANDWIDTH_ALLOCATION_FOR_PRIMARY_VIDEO</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_left_camera_type_key"></a><p class="key_table_key_string key_table_key_row">LEFT_CAMERA_TYPE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>DataCameraGetPushStateInfo.CameraType</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_password_key"></a><p class="key_table_key_string key_table_key_row">PASSWORD</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>String</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_setwifipassword">setPassword</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_getwifipassword">getPassword</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_disabled_image_transmission_key"></a><p class="key_table_key_string key_table_key_row">DISABLED_IMAGE_TRANSMISSION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_primary_video_feed_physical_source_key"></a><p class="key_table_key_string key_table_key_row">PRIMARY_VIDEO_FEED_PHYSICAL_SOURCE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>DataCameraGetPushStateInfo.CameraType</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_channel_interference_key"></a><p class="key_table_key_string key_table_key_row">CHANNEL_INTERFERENCE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/WiFiLink/DJIWiFiLink_DJIWiFiChannelInterference.html#djiwifilink_djiwifichannelinterference">WifiChannelInterference</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_setrssicallback">setChannelInterferenceCallback</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/WiFiLink/DJIWiFiLink_DJIWiFiChannelInterference.html#djiwifilink_djiwifichannelinterference">WifiChannelInterference</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_ssid_key"></a><p class="key_table_key_string key_table_key_row">SSID</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>String</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_setwifissid">setSSID</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_getwifissid">getSSID</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_warning_messages_key"></a><p class="key_table_key_string key_table_key_row">WARNING_MESSAGES</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_djiocusyncwarningmessage">OcuSyncWarningMessage</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_djiocusyncwarningmessage">OcuSyncWarningMessage</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_other_role_video_cameras_key"></a><p class="key_table_key_string key_table_key_row">OTHER_ROLE_VIDEO_CAMERAS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>CameraVideoStream[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_ocusync_video_cameras_key"></a><p class="key_table_key_string key_table_key_row">OCUSYNC_VIDEO_CAMERAS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>CameraVideoStream[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_available_channel_numbers_key"></a><p class="key_table_key_string key_table_key_row">AVAILABLE_CHANNEL_NUMBERS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_getavailablechannels">getAvailableChannelNumbers</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_country_code_key"></a><p class="key_table_key_string key_table_key_row">COUNTRY_CODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>String</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_remote_controller_antenna_rssi_key"></a><p class="key_table_key_string key_table_key_row">REMOTE_CONTROLLER_ANTENNA_RSSI</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/LBAirLink/DJILBAirLink_DJILightbridgeAntennaRSSI.html#djilbairlink_djilightbridgeantennarssi">LightbridgeAntennaRSSI</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/LBAirLink/DJILBAirLink_DJILightbridgeAntennaRSSI.html#djilbairlink_djilightbridgeantennarssi">LightbridgeAntennaRSSI</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_setremotecontrollerantennarssicallback">setRemoteControllerAntennaRSSICallback</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_frequency_point_rssis_key"></a><p class="key_table_key_string key_table_key_row">FREQUENCY_POINT_RSSIS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/OcuSyncLink/DJIOcuSyncLink_DJIOcuSyncFrequencyInterference.html#djiocusynclink_djiocusyncfrequencyinterference">FrequencyInterference</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/OcuSyncLink/DJIOcuSyncLink_DJIOcuSyncFrequencyInterference.html#djiocusynclink_djiocusyncfrequencyinterference">FrequencyInterference</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_assign_source_to_primary_channel_key"></a><p class="key_table_key_string key_table_key_row">ASSIGN_SOURCE_TO_PRIMARY_CHANNEL</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_aircraft_antenna_rssi_key"></a><p class="key_table_key_string key_table_key_row">AIRCRAFT_ANTENNA_RSSI</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/LBAirLink/DJILBAirLink_DJILightbridgeAntennaRSSI.html#djilbairlink_djilightbridgeantennarssi">LightbridgeAntennaRSSI</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/LBAirLink/DJILBAirLink_DJILightbridgeAntennaRSSI.html#djilbairlink_djilightbridgeantennarssi">LightbridgeAntennaRSSI</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_setaircraftantennarssicallback">setAircraftAntennaRSSICallback</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_bandwidth_allocation_for_left_camera_key"></a><p class="key_table_key_string key_table_key_row">BANDWIDTH_ALLOCATION_FOR_LEFT_CAMERA</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_lb_channel_key"></a><p class="key_table_key_string key_table_key_row">LB_CHANNEL</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_wifi_frequency_band_key"></a><p class="key_table_key_string key_table_key_row">WIFI_FREQUENCY_BAND</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_djiwififrequencyband">WiFiFrequencyBand</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_setwififrequencyband">setFrequencyBand</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_getwififrequencyband">getFrequencyBand</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_djiwififrequencyband">WiFiFrequencyBand</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_magnetic_interference_key"></a><p class="key_table_key_string key_table_key_row">MAGNETIC_INTERFERENCE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_djiwifisignalquality">WiFiMagneticInterferenceLevel</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_djiwifisignalquality">WiFiMagneticInterferenceLevel</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_right_camera_type_key"></a><p class="key_table_key_string key_table_key_row">RIGHT_CAMERA_TYPE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>DataCameraGetPushStateInfo.CameraType</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_downlink_signal_quality_key"></a><p class="key_table_key_string key_table_key_row">DOWNLINK_SIGNAL_QUALITY</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_available_camera_video_streams_key"></a><p class="key_table_key_string key_table_key_row">AVAILABLE_CAMERA_VIDEO_STREAMS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>CameraVideoStream[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_secondary_video_feed_physical_source_key"></a><p class="key_table_key_string key_table_key_row">SECONDARY_VIDEO_FEED_PHYSICAL_SOURCE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>DataCameraGetPushStateInfo.CameraType</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_top_camera_type_key"></a><p class="key_table_key_string key_table_key_row">TOP_CAMERA_TYPE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>DataCameraGetPushStateInfo.CameraType</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_ocusync_supported_frequency_bands_key"></a><p class="key_table_key_string key_table_key_row">OCUSYNC_SUPPORTED_FREQUENCY_BANDS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_djiocusyncfrequencyband">OcuSyncFrequencyBand</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_getsupportedfrequencybandswithcompletion">getSupportedFrequencyBands</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_djiocusyncfrequencyband">OcuSyncFrequencyBand</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_primary_video_priority_key"></a><p class="key_table_key_string key_table_key_row">PRIMARY_VIDEO_PRIORITY</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/BaseClasses/DJIVideoFeeder_DJIVideoFeed.html#djivideofeeder_djivideofeed_djivideofeedpriority">VideoFeedPriority</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_hd_offset_param_values_key"></a><p class="key_table_key_string key_table_key_row">HD_OFFSET_PARAM_VALUES</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>SDRHdOffsetParams</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_ocusync_frequency_band_key"></a><p class="key_table_key_string key_table_key_row">OCUSYNC_FREQUENCY_BAND</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_djiocusyncfrequencyband">OcuSyncFrequencyBand</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_djiocusyncfrequencyband">OcuSyncFrequencyBand</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_fpv_camera_type_key"></a><p class="key_table_key_string key_table_key_row">FPV_CAMERA_TYPE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>DataCameraGetPushStateInfo.CameraType</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_is_1_dot_4_g_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_1_DOT_4_G_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_is_lightbridge_link_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_LIGHTBRIDGE_LINK_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/AirLink/DJIAirLink.html#djiairlink_islbairlinksupported">isLightbridgeLinkSupported</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_bandwidth_allocation_for_lb_video_input_port_key"></a><p class="key_table_key_string key_table_key_row">BANDWIDTH_ALLOCATION_FOR_LB_VIDEO_INPUT_PORT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_setfpvvideobandwidthpercent">setBandwidthAllocationForLBVideoInputPort</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_getfpvvideobandwidthpercent">getBandwidthAllocationForLBVideoInputPort</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_lb_frequency_band_key"></a><p class="key_table_key_string key_table_key_row">LB_FREQUENCY_BAND</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_djilbairlinkfrequencyband">LightbridgeFrequencyBand</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_setfrequencyband">setFrequencyBand</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_getfrequencyband">getFrequencyBand</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_djilbairlinkfrequencyband">LightbridgeFrequencyBand</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_frequency_point_index_key"></a><p class="key_table_key_string key_table_key_row">FREQUENCY_POINT_INDEX</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_setchannelnumber">setChannelNumber</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_getchannelnumber">getChannelNumber</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_frequency_point_index_valid_range_key"></a><p class="key_table_key_string key_table_key_row">FREQUENCY_POINT_INDEX_VALID_RANGE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_getchannelnumbervalidrange">getChannelNumberValidRange</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_channel_selection_mode_key"></a><p class="key_table_key_string key_table_key_row">CHANNEL_SELECTION_MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_djilbairlinkchannelselectionmode">ChannelSelectionMode</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_setchannelselectionmode">setChannelSelectionMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_getchannelselectionmode">getChannelSelectionMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_setchannelselectionmode">setChannelSelectionMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_getchannelselectionmode">getChannelSelectionMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_djilbairlinkchannelselectionmode">ChannelSelectionMode</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_master_live_video_camera_key"></a><p class="key_table_key_string key_table_key_row">MASTER_LIVE_VIDEO_CAMERA</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>CameraVideoStream</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_data_rate_key"></a><p class="key_table_key_string key_table_key_row">DATA_RATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_djiwifidatarate">WifiDataRate</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_setdatarate">setDataRate</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_getdatarate">getDataRate</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_djiwifisignalquality_unknown">UNKNOWN</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_djiwifidatarate">WifiDataRate</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_lb_supported_frequency_bands_key"></a><p class="key_table_key_string key_table_key_row">LB_SUPPORTED_FREQUENCY_BANDS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_djilbairlinkfrequencyband">LightbridgeFrequencyBand</a>[]</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_getsupportedfrequencyband">getSupportedFrequencyBands</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_djilbairlinkfrequencyband">LightbridgeFrequencyBand</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_transmission_mode_key"></a><p class="key_table_key_string key_table_key_row">TRANSMISSION_MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_djilbairlinkfpvvideoqualitylatency">LightbridgeTransmissionMode</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_setfpvqualitylatency">setTransmissionMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_getfpvqualitylatency">getTransmissionMode</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_djilbairlinkfpvvideoqualitylatency">LightbridgeTransmissionMode</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_is_dual_band_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_DUAL_BAND_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_hd_dist_offset_key"></a><p class="key_table_key_string key_table_key_row">HD_DIST_OFFSET</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_dynamic_data_rate_key"></a><p class="key_table_key_string key_table_key_row">DYNAMIC_DATA_RATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_lb_data_rate_key"></a><p class="key_table_key_string key_table_key_row">LB_DATA_RATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_djilbairlinkdatarate">LightbridgeDataRate</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_bandwidth_allocation_for_hdmi_video_input_port_key"></a><p class="key_table_key_string key_table_key_row">BANDWIDTH_ALLOCATION_FOR_HDMI_VIDEO_INPUT_PORT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_setdualencodemodepercent">setBandwidthAllocationForHDMIVideoInputPort</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_getdualencodemodepercent">getBandwidthAllocationForHDMIVideoInputPort</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_is_5_dot_7_g_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_5_DOT_7_G_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_selection_mode_key"></a><p class="key_table_key_string key_table_key_row">SELECTION_MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>WiFiSelectionMode</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#airlinkkey_channel_number_key"></a><p class="key_table_key_string key_table_key_row">CHANNEL_NUMBER</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_setwifichannel">setChannelNumber</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_getwifichannel">getChannelNumber</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_setchannel">setChannelNumber</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/LBAirLink/DJILBAirLink.html#djilbairlink_getchannel">getChannelNumber</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_is_wifi_link_supported_key"></a><p class="key_table_key_string key_table_key_row">IS_WIFI_LINK_SUPPORTED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/AirLink/DJIAirLink.html#djiairlink_iswifilinksupported">isWiFiLinkSupported</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_reboot_key"></a><p class="key_table_key_string key_table_key_row">REBOOT</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/WiFiLink/DJIWiFiLink.html#djiwifilink_rebootwifi">reboot</a></code>

</p></td></tr><tr><td colspan=2><a href="#airlinkkey_bandwidth_key"></a><p class="key_table_key_string key_table_key_row">BANDWIDTH</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">SET, GET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_djiocusyncbandwidth">OcuSyncBandwidth</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_setchannelbandwidth">setChannelBandwidth</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_getchannelbandwidth">getChannelBandwidth</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/OcuSyncLink/DJIOcuSyncLink.html#djiocusynclink_djiocusyncbandwidth">OcuSyncBandwidth</a></code>

</p></td></tr></table></html>
