<div class="article"><h1 ><font color="#AAA">class </font>AccessoryAggregationKey</h1></div>

~~~java
 class AccessoryAggregationKey extends DJIKey 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/KeyManager/DJIKey.html#djikey">DJIKey</a></code></td></tr></table></html>



##### Description:



<font color="#666"><code><a href="/Components/KeyManager/DJIAccessoryKey.html#djiaccessorykey">AccessoryAggregationKey</a></code> provides dedicated access to Accessories related attributes.



##### Class Members:

<div class="api-row" id="djiaccessorykey_createwithparamkey"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessorykey_createwithparamkey_inline">create</a></div></div><div class="inline-doc" id="djiaccessorykey_createwithparamkey_inline"

><div class="article"><h6 ><font color="#AAA">method </font>create</h6></div>

~~~java
 static AccessoryAggregationKey create(@AccessoryAggregationParamKey @NonNull String paramKey) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Creates an AccessoryAggregation key.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@AccessoryAggregationParamKey @NonNull String <font color="#000">paramKey</td><td><font color="#666"><i>A valid paramKey</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/KeyManager/DJIAccessoryKey.html#djiaccessorykey">AccessoryAggregationKey</a></td><td><font color="#666"><i>AccessoryAggregation Key</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessorykey_createwithparamkeyandcomponentindex"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessorykey_createwithparamkeyandcomponentindex_inline">create</a></div></div><div class="inline-doc" id="djiaccessorykey_createwithparamkeyandcomponentindex_inline"

><div class="article"><h6 ><font color="#AAA">method </font>create</h6></div>

~~~java
 static AccessoryAggregationKey create(@AccessoryAggregationParamKey @NonNull String paramKey,
                                                 @IntRange(from = 0, to = MAX_COMPONENT_INDEX) int componentIndex) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Creates an AccessoryAggregation key.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@AccessoryAggregationParamKey @NonNull String <font color="#000">paramKey</td><td><font color="#666"><i>A valid paramKey</i></td></tr><tr valign="top"><td><font color="#70BF41">@IntRange(from = 0, to = MAX_COMPONENT_INDEX) int <font color="#000">componentIndex</td><td><font color="#666"><i>The index of the AccessoryAggregation component.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/KeyManager/DJIAccessoryKey.html#djiaccessorykey">AccessoryAggregationKey</a></td><td><font color="#666"><i>AccessoryAggregation Key</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessorykey_createspeakerkeywithparamkey"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessorykey_createspeakerkeywithparamkey_inline">createSpeakerKey</a></div></div><div class="inline-doc" id="djiaccessorykey_createspeakerkeywithparamkey_inline"

><div class="article"><h6 ><font color="#AAA">method </font>createSpeakerKey</h6></div>

~~~java
 static AccessoryAggregationKey createSpeakerKey(@SpeakerParamKey @NonNull String paramKey) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Creates a Speaker key.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@SpeakerParamKey @NonNull String <font color="#000">paramKey</td><td><font color="#666"><i>A valid paramKey.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/KeyManager/DJIAccessoryKey.html#djiaccessorykey">AccessoryAggregationKey</a></td><td><font color="#666"><i>Speaker key.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessorykey_createspotlightkeywithparamkey"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessorykey_createspotlightkeywithparamkey_inline">createSpotlightKey</a></div></div><div class="inline-doc" id="djiaccessorykey_createspotlightkeywithparamkey_inline"

><div class="article"><h6 ><font color="#AAA">method </font>createSpotlightKey</h6></div>

~~~java
 static AccessoryAggregationKey createSpotlightKey(@SpotlightParamKey @NonNull String paramKey) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Creates a Spotlight key.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@SpotlightParamKey @NonNull String <font color="#000">paramKey</td><td><font color="#666"><i>A valid paramKey.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/KeyManager/DJIAccessoryKey.html#djiaccessorykey">AccessoryAggregationKey</a></td><td><font color="#666"><i>Speaker key.</i></td></tr></table></html></div>

<div class="api-row" id="djiaccessorykey_createbeaconkeywithparamkey"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiaccessorykey_createbeaconkeywithparamkey_inline">createBeaconKey</a></div></div><div class="inline-doc" id="djiaccessorykey_createbeaconkeywithparamkey_inline"

><div class="article"><h6 ><font color="#AAA">method </font>createBeaconKey</h6></div>

~~~java
 static AccessoryAggregationKey createBeaconKey(@BeaconParamKey @NonNull String paramKey) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Creates a Beacon key.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@BeaconParamKey @NonNull String <font color="#000">paramKey</td><td><font color="#666"><i>A valid paramKey.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/KeyManager/DJIAccessoryKey.html#djiaccessorykey">AccessoryAggregationKey</a></td><td><font color="#666"><i>Beacon key.</i></td></tr></table></html></div>



##### Inherited Methods:



##### Class Keys:

<html><table class="key_table"><tr><td colspan=2><a href="#accessoryaggregationkey_spotlight_enabled_key"></a><p class="key_table_key_string key_table_key_first_row">SPOTLIGHT_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#accessoryaggregationkey_spotlight_temperature_key"></a><p class="key_table_key_string key_table_key_row">SPOTLIGHT_TEMPERATURE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Float</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#accessoryaggregationkey_play_mode_key"></a><p class="key_table_key_string key_table_key_row">PLAY_MODE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker.html#djiaccessoryaggregation_djispeaker_djispeakerplaymode">PlayMode</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#accessoryaggregationkey_stop_key"></a><p class="key_table_key_string key_table_key_row">STOP</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#accessoryaggregationkey_remaining_space_key"></a><p class="key_table_key_string key_table_key_row">REMAINING_SPACE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#accessoryaggregationkey_speaker_volume_key"></a><p class="key_table_key_string key_table_key_row">SPEAKER_VOLUME</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#accessoryaggregationkey_total_space_key"></a><p class="key_table_key_string key_table_key_row">TOTAL_SPACE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#accessoryaggregationkey_speaker_state_key"></a><p class="key_table_key_string key_table_key_row">SPEAKER_STATE</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/Components/AccessoryAggregation/DJIAccessoryAggregation_DJISpeaker_DJISpeakerState.html#djiaccessoryaggregation_djispeaker_djispeakerstate">SpeakerState</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#accessoryaggregationkey_beacon_enabled_key"></a><p class="key_table_key_string key_table_key_row">BEACON_ENABLED</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#accessoryaggregationkey_spotlight_brightness_key"></a><p class="key_table_key_string key_table_key_row">SPOTLIGHT_BRIGHTNESS</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH, SET</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Integer</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#accessoryaggregationkey_play_key"></a><p class="key_table_key_string key_table_key_row">PLAY</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">ACTION</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr></table></html>
