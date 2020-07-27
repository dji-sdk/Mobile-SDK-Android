<div class="article"><h1 ><font color="#AAA">class </font>SDKManagerCallback</h1></div>

~~~java
 interface SDKManagerCallback 
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Callback interface for SDK manager.



##### Class Members:

<div class="api-row" id="djisdkmanager_didregisterappwitherror"><div class="api-col left">SDK Registration</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisdkmanager_didregisterappwitherror_inline">onRegister</a></div></div><div class="inline-doc" id="djisdkmanager_didregisterappwitherror_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onRegister</h6></div>

~~~java
        void onRegister(DJIError error)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Callback method after the application attempts to register.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKError/DJIError.html#djierror">DJIError</a> <font color="#000">error</td><td><font color="#666"><i><code><a href="/Components/SDKError/DJIError.html#djierror_djisdkerror_registration_success">REGISTRATION_SUCCESS</a></code> if registration is successful.</i></td></tr></table></html></div>

<div class="api-row" id="djisdkmanager_productconnectedupdate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisdkmanager_productconnectedupdate_inline">onProductConnect</a></div></div><div class="inline-doc" id="djisdkmanager_productconnectedupdate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onProductConnect</h6></div>

~~~java
        void onProductConnect(BaseProduct product)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIProductKey.html#productkey_connection_key">ProductKey.CONNECTION</a></td></tr></table></html>



##### Description:



<font color="#666">Called when the "product" is connected.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct">BaseProduct</a> <font color="#000">product</td><td><font color="#666"><i>Product object. nil if the USB link or WiFi link between the product and phone is  disconnected.</i></td></tr></table></html></div>

<div class="api-row" id="djisdkmanager_productdisconnectedupdate"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisdkmanager_productdisconnectedupdate_inline">onProductDisconnect</a></div></div><div class="inline-doc" id="djisdkmanager_productdisconnectedupdate_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onProductDisconnect</h6></div>

~~~java
        void onProductDisconnect()
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIProductKey.html#productkey_connection_key">ProductKey.CONNECTION</a></td></tr></table></html>



##### Description:



<font color="#666">Called when the "product" is disconnected.

</div>

<div class="api-row" id="djisdkmanager_productchanged"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisdkmanager_productchanged_inline">onProductChanged</a></div></div><div class="inline-doc" id="djisdkmanager_productchanged_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onProductChanged</h6></div>

~~~java
        void onProductChanged(BaseProduct product)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Called when the connected product is changed. The product will be updated when the aircraft connected changes from only remote controller connected.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct">BaseProduct</a> <font color="#000">product</td><td><font color="#666"><i>An instance of <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct">BaseProduct</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djisdkmanager_oncomponentchange"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisdkmanager_oncomponentchange_inline">onComponentChange</a></div></div><div class="inline-doc" id="djisdkmanager_oncomponentchange_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onComponentChange</h6></div>

~~~java
        void onComponentChange(BaseProduct.ComponentKey key, BaseComponent oldComponent, BaseComponent newComponent)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr><tr valign="top"><td width=15%><font color="#999"><i>SDK Key:</i></td><td width=85%><font color="#999"><a href="/Components/KeyManager/DJIProductKey.html#productkey_connection_key">ProductKey.CONNECTION</a></td></tr></table></html>



##### Description:



<font color="#666">Called when a component object changes. Note: if the component is disconnected,  this method will not be called, pls use ComponentListener to listen the disconnect  event of any component.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct">BaseProduct</a>.<a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct_componentkey">ComponentKey</a> <font color="#000">key</td><td><font color="#666"><i>An enum value of the <code><a href="/BaseClasses/DJIBaseProduct.html#djibaseproduct_componentkey">ComponentKey</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/BaseComponent/DJIBaseComponent.html#djibasecomponent">BaseComponent</a> <font color="#000">oldComponent</td><td><font color="#666"><i>An instance of <code><a href="/Components/BaseComponent/DJIBaseComponent.html#djibasecomponent">BaseComponent</a></code>.</i></td></tr><tr valign="top"><td><font color="#70BF41"><a href="/Components/BaseComponent/DJIBaseComponent.html#djibasecomponent">BaseComponent</a> <font color="#000">newComponent</td><td><font color="#666"><i>An instance of <code><a href="/Components/BaseComponent/DJIBaseComponent.html#djibasecomponent">BaseComponent</a></code>.</i></td></tr></table></html></div>

<div class="api-row" id="djisdkmanager_oninitprocess"><div class="api-col left">Init Process</div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisdkmanager_oninitprocess_inline">onInitProcess</a></div></div><div class="inline-doc" id="djisdkmanager_oninitprocess_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onInitProcess</h6></div>

~~~java
        void onInitProcess(DJISDKInitEvent event, int totalProcess)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Called when load sdk resource.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41"><a href="/Components/SDKManager/DJISDKManager_DJISDKInitEvent.html#djisdkmanager_djisdkinitevent">DJISDKInitEvent</a> <font color="#000">event</td><td><font color="#666"><i>An event that show what resource is loading.</i></td></tr><tr valign="top"><td><font color="#70BF41">int <font color="#000">totalProcess</td><td><font color="#666"><i>The totalProcess of load resource, from 0 to 100.</i></td></tr></table></html></div>

<div class="api-row" id="djisdkmanager_ondatabasedownloadprogress"><div class="api-col left"></div><div class="api-col middle" style="color:#AAA">method</div><div class="api-col right"><a class="trigger" href="#djisdkmanager_ondatabasedownloadprogress_inline">onDatabaseDownloadProgress</a></div></div><div class="inline-doc" id="djisdkmanager_ondatabasedownloadprogress_inline"

><div class="article"><h6 ><font color="#AAA">method </font>onDatabaseDownloadProgress</h6></div>

~~~java
        void onDatabaseDownloadProgress(long current, long total)
~~~

<html><table class="table-supportedby"><tr valign="top"><td width=15%><font color="#999"><i>Package:</i></td><td width=85%><font color="#999">dji.sdk.sdkmanager</td></tr></table></html>



##### Description:



<font color="#666">Called when Fly Safe database download progress is updated. Mobile SDK will download the  database when <code><a href="/Components/SDKManager/DJISDKManager.html#djisdkmanager_registerapp">registerApp</a></code>  is invoked, if "fly-safe-database" is excluded in build.gradle.  Please find <code><a href="/Components/SDKManager/DJISDKManager_DJISDKManagerCallbackInterface.html#djisdkmanager_didregisterappwitherror">onRegister</a></code> for updated error.



##### Input Parameters:

<html><table class="table-inline-parameters"><tr valign="top"><td><font color="#70BF41">long <font color="#000">current</td><td><font color="#666"><i>The current download data size.</i></td></tr><tr valign="top"><td><font color="#70BF41">long <font color="#000">total</td><td><font color="#666"><i>The total size of the file being downloaded.</i></td></tr></table></html></div>


