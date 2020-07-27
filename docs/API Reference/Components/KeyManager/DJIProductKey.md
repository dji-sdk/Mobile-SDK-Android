<div class="article"><h1 ><font color="#AAA">class </font>ProductKey</h1></div>

~~~java
 class ProductKey extends DJIKey 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr><tr valign="top"><td width=15%><font color="#999"><i>Inherits From:</i></td><td width=85%><font color="#999"><code><a href="/Components/KeyManager/DJIKey.html#djikey">DJIKey</a></code></td></tr></table></html>



##### Description:



<font color="#666"><code><a href="/Components/KeyManager/DJIProductKey.html#djiproductkey">ProductKey</a></code> represent keys which are global to the whole product.



##### Class Members:

<div class="api-row" id="djiproductkey_create"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djiproductkey_create_inline">create</a></div></div><div class="inline-doc" id="djiproductkey_create_inline"

><div class="article"><h6 ><font color="#AAA">method </font>create</h6></div>

~~~java
 static ProductKey create(@ProductParamKey @NonNull String paramKey) 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.keysdk</td></tr></table></html>



##### Description:



<font color="#666">Creates a Product key.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">@ProductParamKey @NonNull String <font color="#000">paramKey</td><td><font color="#666"><i>A valid paramKey.</i></td></tr></table></html>

##### Return:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">static <a href="/Components/KeyManager/DJIProductKey.html#djiproductkey">ProductKey</a></td><td><font color="#666"><i>Product Key</i></td></tr></table></html></div>



##### Inherited Methods:



##### Class Keys:

<html><table class="key_table"><tr><td colspan=2><a href="#productkey_component_key_key"></a><p class="key_table_key_string key_table_key_first_row">COMPONENT_KEY</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>-</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#productkey_model_name_key"></a><p class="key_table_key_string key_table_key_row">MODEL_NAME</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code><a href="/BaseClasses/DJIBaseProduct.html#djimodelnamestring">Model</a></code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct_model">getModel</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/BaseClasses/DJIBaseProduct.html#djimodelnamestring">Model</a></code>

</p></td></tr><tr><td colspan=2><a href="#productkey_firmware_package_version_key"></a><p class="key_table_key_string key_table_key_row">FIRMWARE_PACKAGE_VERSION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>String</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct_getfirmwarepackageversion">getFirmwarePackageVersion</a></code>

</p></td></tr><tr><td colspan=2><a href="#productkey_has_remote_controller_key"></a><p class="key_table_key_string key_table_key_row">HAS_REMOTE_CONTROLLER</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr><tr><td colspan=2><a href="#productkey_connection_key"></a><p class="key_table_key_string key_table_key_row">CONNECTION</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/SDKManager/DJISDKManager_DJISDKManagerCallbackInterface.html#djisdkmanager_productconnectedupdate">onProductConnect</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/SDKManager/DJISDKManager_DJISDKManagerCallbackInterface.html#djisdkmanager_productdisconnectedupdate">onProductDisconnect</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/Components/SDKManager/DJISDKManager_DJISDKManagerCallbackInterface.html#djisdkmanager_oncomponentchange">onComponentChange</a></code>

</p></td></tr><tr><td></td><td><p class="key_table_type_string">

<font color="#666"><code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct_connected">isConnected</a></code>

</p></td></tr><tr><td colspan=2><a href="#productkey_is_osmo_key"></a><p class="key_table_key_string key_table_key_row">IS_OSMO</p></td></tr></tr><td><p class="key_table_title_string">Access:</p></td><td><p class="key_table_type_string">PUSH</p></td></tr><tr class="key_table_doc_row"><td><p class="key_table_title_string">Type:</p></td><td><p class="key_table_type_string"><code>Boolean</code></p></td></tr><td><p class="key_table_title_string">API:</p></td><td><p class="key_table_type_string">-</p></td></tr></table></html>
